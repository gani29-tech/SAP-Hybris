package org.training.core.listeners;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import org.training.core.event.myevents.CarSavingEvent;

public class CarSaveListener extends AbstractEventListener<CarSavingEvent> {
    @Override
    public void onEvent(CarSavingEvent event) {
        event.display();
    }
}
