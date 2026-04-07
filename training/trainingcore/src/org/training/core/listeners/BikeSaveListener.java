package org.training.core.listeners;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import org.training.core.event.myevents.BikeSavingEvent;

public class BikeSaveListener extends AbstractEventListener<BikeSavingEvent> {
    @Override
    public void onEvent(BikeSavingEvent event) {
        event.display();
    }
}
