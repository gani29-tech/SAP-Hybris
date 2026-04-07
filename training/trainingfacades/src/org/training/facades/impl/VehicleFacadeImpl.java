package org.training.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.OrderTrackingEmailProcessModel;
import org.training.core.model.VehicleModel;
import org.training.core.service.OrderTrackingService;
import org.training.core.service.VehicleService;
import org.training.facades.VehicleFacade;
import org.training.facades.data.VehicleData;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class VehicleFacadeImpl implements VehicleFacade {
    private VehicleService vehicleService;
    private OrderTrackingService orderTrackingService;
    private Converter<VehicleModel, VehicleData> vehicleConverter;
    private Converter<OrderTrackingEmailProcessModel, VehicleData> orderTrackingConverter;
    private static final Logger LOG = Logger.getLogger(VehicleFacadeImpl.class.getName());
    @Override
    public List<VehicleData> getVehicles() {
        LOG.info("*****Inside Facade******");
        List<VehicleModel> vehicles = vehicleService.getAllVehicles();
        List<VehicleData> vehicleDataList = vehicleConverter.convertAll(vehicles);
//        List<OrderTrackingEmailProcessModel> orderTrackings = orderTrackingService.getAllOrderTrackingDetails();
//        List<VehicleData> orderDataList = orderTrackingConverter.convertAll(orderTrackings);
        List<VehicleData> finalDataList = new ArrayList<>();
        finalDataList.addAll(vehicleDataList);
//        finalDataList.addAll(orderDataList);
        LOG.info("*******Final List*****"+finalDataList);
        return finalDataList;
    }
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
    public void setOrderTrackingService(OrderTrackingService orderTrackingService) {
        this.orderTrackingService = orderTrackingService;
    }
    public void setVehicleConverter(Converter<VehicleModel, VehicleData> vehicleConverter) {
        this.vehicleConverter = vehicleConverter;
    }
    public void setOrderTrackingConverter(Converter<OrderTrackingEmailProcessModel, VehicleData> orderTrackingConverter) {
        this.orderTrackingConverter = orderTrackingConverter;
    }
}
