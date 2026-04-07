package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import org.training.core.model.BikeModel;
import org.training.core.model.CarModel;
import org.training.core.model.VehicleModel;

import java.util.logging.Logger;

public class VehiclePrepareInterceptor implements PrepareInterceptor<VehicleModel> {
    public static final Logger LOG = Logger.getLogger(VehiclePrepareInterceptor.class.getName());
    public void onPrepare(VehicleModel vehicle, InterceptorContext context){
        if(vehicle instanceof BikeModel bike){
            bike.setCode(bike.getCode().toUpperCase());
            LOG.info("Preparing Bike:" + bike.getName());
        }
        if(vehicle instanceof CarModel car){
            car.setCode(car.getCode().toUpperCase());
            LOG.info("Preparing Car:" + car.getName());
        }
    }
}