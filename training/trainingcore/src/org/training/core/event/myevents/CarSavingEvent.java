package org.training.core.event.myevents;

import de.hybris.platform.core.PK;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CarSavingEvent extends AbstractEvent {
    private final PK pk;
    private static final Logger LOG = Logger.getLogger(CarSavingEvent.class.getName());
    public  CarSavingEvent(PK pk) {
        this.pk = pk;
    }
    public void display(){
        LOG.log(Level.INFO, "Car Saving Event: {0}", pk);
    }
}
