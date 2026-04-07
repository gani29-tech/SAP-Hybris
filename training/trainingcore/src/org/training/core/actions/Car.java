package org.training.core.actions;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.training.core.model.VehicleSavingProcessModel;

import java.util.logging.Logger;

public class Car extends AbstractSimpleDecisionAction<VehicleSavingProcessModel> {
    private static final Logger LOGGER = Logger.getLogger(Car.class.getName());
    @Override
    public Transition executeAction(VehicleSavingProcessModel process) {
        LOGGER.info("Car Action is Successfully Saved!!!!");
        return Transition.OK;
    }
}
