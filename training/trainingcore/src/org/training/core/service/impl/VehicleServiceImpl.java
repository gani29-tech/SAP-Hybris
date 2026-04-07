package org.training.core.service.impl;

import org.training.core.dao.VehicleDao;
import org.training.core.model.VehicleModel;
import org.training.core.service.VehicleService;

import java.util.List;

public class VehicleServiceImpl implements VehicleService
{
    private VehicleDao vehicleDao;
    @Override
    public List<VehicleModel> getAllVehicles()
    {
        return vehicleDao.getAllVehicles();
    }
    public void setVehicleDao(final VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }
}