package org.training.core.service.impl;

import org.training.core.dao.OrderTrackingDao;
import org.training.core.model.OrderTrackingEmailProcessModel;
import org.training.core.service.OrderTrackingService;

import java.util.List;

public class OrderTrackingServiceImpl implements OrderTrackingService
{
    private OrderTrackingDao orderTrackingDao;
    @Override
    public List<OrderTrackingEmailProcessModel> getAllOrderTrackingDetails()
    {
        return orderTrackingDao.getAllOrderTrackingDetails();
    }
    public void setOrderTrackingDao(OrderTrackingDao orderTrackingDao) {
        this.orderTrackingDao = orderTrackingDao;
    }
}