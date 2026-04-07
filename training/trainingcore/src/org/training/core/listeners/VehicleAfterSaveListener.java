package org.training.core.listeners;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.tx.AfterSaveEvent;
import de.hybris.platform.tx.AfterSaveListener;
import org.apache.log4j.Logger;
import org.training.core.event.myevents.BikeSavingEvent;
import org.training.core.event.myevents.CarSavingEvent;
import org.training.core.model.BikeModel;
import org.training.core.model.CarModel;
import org.training.core.model.VehicleSavingProcessModel;

import javax.annotation.Resource;
import java.util.Collection;

public class VehicleAfterSaveListener implements AfterSaveListener {

    private static final Logger LOG = Logger.getLogger(VehicleAfterSaveListener.class);
    private BusinessProcessService businessProcessService;
    @Resource
    private ModelService modelService;

    @Resource
    private EventService eventService;

    @Override
    public void afterSave(Collection<AfterSaveEvent> events) {
        LOG.info("After save event received");

        for (AfterSaveEvent event : events) {

            if (event.getType() != AfterSaveEvent.CREATE && event.getType() != AfterSaveEvent.UPDATE) {
                continue;
            }

            ItemModel item = null;

            try {
                item = modelService.get(event.getPk());
            } catch (Exception e) {
                LOG.warn("Item not found for PK: " + event.getPk());
                continue;
            }

            LOG.info("Saved Item Type: " + item.getItemtype());

            if (item instanceof BikeModel || item instanceof CarModel) {
                if (item instanceof BikeModel) {
                    eventService.publishEvent(new BikeSavingEvent(item.getPk()));
                } else {
                    eventService.publishEvent(new CarSavingEvent(item.getPk()));
                }

                VehicleSavingProcessModel process = getBusinessProcessService()
                        .createProcess("VehicleProcess" + System.currentTimeMillis(), "myVehicleSaving");

                process.setVehicle(item);
                modelService.save(process);
                getBusinessProcessService().startProcess(process);
            }
        }
    }
    private  BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }
    @Resource
    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}