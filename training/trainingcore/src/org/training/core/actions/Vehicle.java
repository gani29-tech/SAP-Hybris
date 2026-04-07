package org.training.core.actions;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.task.RetryLaterException;
import org.training.core.model.BikeModel;
import org.training.core.model.VehicleSavingProcessModel;

import java.util.logging.Logger;

public class Vehicle extends AbstractSimpleDecisionAction<VehicleSavingProcessModel> {
    private static final Logger LOGGER = Logger.getLogger(Vehicle.class.getName());
    @Override
    public Transition executeAction(VehicleSavingProcessModel vehicleSavingProcessModel) throws RetryLaterException, Exception {
        ItemModel item = vehicleSavingProcessModel.getVehicle();
        LOGGER.info("Inside Vehicle executeAction");
        LOGGER.info("Item Type:"+vehicleSavingProcessModel.getVehicle());

        if (item instanceof BikeModel) {
            LOGGER.info("Forwarding to Bike Action with OK");
            return Transition.OK;
        }
        else{
            LOGGER.info("Forwarding to Car Action with NOK");
            return Transition.NOK;
        }
    }

}
