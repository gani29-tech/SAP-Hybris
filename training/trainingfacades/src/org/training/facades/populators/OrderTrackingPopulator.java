package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.OrderTrackingEmailProcessModel;
import org.training.core.model.VehicleModel;
import org.training.facades.data.VehicleData;

import java.util.logging.Logger;

public class OrderTrackingPopulator implements Populator<OrderTrackingEmailProcessModel, VehicleData> {

    private static final Logger LOG = Logger.getLogger(OrderTrackingPopulator.class.getName());

    @Override
    public void populate(OrderTrackingEmailProcessModel source,
                         VehicleData target) throws ConversionException {

        LOG.info("************* OrderTracking Populator***************");

    //        target.setEmail(source.getEmail());
    //        target.setProcessDefinitionName(source.getProcessDefinitionName());
    }
}