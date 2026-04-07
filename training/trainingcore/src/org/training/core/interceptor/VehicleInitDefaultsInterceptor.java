package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import org.training.core.model.BikeModel;
import org.training.core.model.CarModel;
import org.training.core.model.VehicleModel;

public class VehicleInitDefaultsInterceptor implements InitDefaultsInterceptor<VehicleModel> {
    public void onInitDefaults(VehicleModel vehicle, InterceptorContext context){
        if(vehicle instanceof BikeModel bike){
            bike.setCc(200);
            bike.setHp(24);
        }
        if(vehicle instanceof CarModel car){
            car.setCc(200);
            car.setHp(24);
        }
    }
}