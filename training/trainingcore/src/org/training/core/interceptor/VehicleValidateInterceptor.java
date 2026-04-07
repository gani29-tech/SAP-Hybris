package org.training.core.interceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.training.core.model.BikeModel;
import org.training.core.model.CarModel;
import org.training.core.model.VehicleModel;
public class VehicleValidateInterceptor implements ValidateInterceptor<VehicleModel> {
    public void onValidate(VehicleModel vehicle,InterceptorContext context) throws InterceptorException{
        if(vehicle instanceof BikeModel bike){
            if(bike.getBrand()==null){
                throw new InterceptorException("Brand must be Exist!!");
            }
            if(bike.getName()==null){
                throw new InterceptorException("Name must be Exist!!");
            }
            if(bike.getCode()==null){
                throw new InterceptorException("Code must be Exist!!");
            }
        }
        if(vehicle instanceof CarModel car){
            if(car.getBrand()==null){
                throw new InterceptorException("Brand must be Exist!!");
            }
            if(car.getName()==null){
                throw new InterceptorException("Name must be Exist!!");
            }
            if(car.getCode()==null){
                throw new InterceptorException("Code must be Exist!!");
            }
        }
    }
}
