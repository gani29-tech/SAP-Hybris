package org.training.core.attributes;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import org.training.core.model.OrderTrackingEmailProcessModel;

public class FullNameHandler implements DynamicAttributeHandler<String, OrderTrackingEmailProcessModel> {

    @Override
    public String get(OrderTrackingEmailProcessModel model) {
        return model.getName()+" Tech";
    }

    @Override
    public void set(OrderTrackingEmailProcessModel model, String s) {
        // TODO document why this method is empty
    }
}
