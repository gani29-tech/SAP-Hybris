package org.training.core.service;

import org.training.core.model.OrderTrackingEmailProcessModel;

import java.util.List;

public interface OrderTrackingService {
    List<OrderTrackingEmailProcessModel> getAllOrderTrackingDetails();
}
