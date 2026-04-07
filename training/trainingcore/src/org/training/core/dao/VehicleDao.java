package org.training.core.dao;

import org.training.core.model.VehicleModel;

import java.util.List;

public interface VehicleDao {
    List<VehicleModel> getAllVehicles();
}
