package org.training.core.actions;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.training.core.model.VehicleSavingProcessModel;

import java.util.logging.Logger;

public class Bike extends AbstractSimpleDecisionAction<VehicleSavingProcessModel> {
    private static final Logger LOGGER = Logger.getLogger(Bike.class.getName());
    @Override
    public Transition executeAction(VehicleSavingProcessModel process){
        LOGGER.info("Bike Action is Successfully Saved!!!!");
        return Transition.OK;
    }
}
