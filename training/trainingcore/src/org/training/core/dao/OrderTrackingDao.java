package org.training.core.dao;

import org.training.core.model.OrderTrackingEmailProcessModel;

import java.util.List;

public interface OrderTrackingDao {
    List<OrderTrackingEmailProcessModel> getAllOrderTrackingDetails();
}
