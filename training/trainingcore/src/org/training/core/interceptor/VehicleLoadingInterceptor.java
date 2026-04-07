package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import org.training.core.model.VehicleModel;

import java.util.logging.Logger;

public class VehicleLoadingInterceptor implements LoadInterceptor<VehicleModel>
{
    public static final Logger LOG = Logger.getLogger(VehicleLoadingInterceptor.class.getName());
    @Override
    public void onLoad(final VehicleModel vehicleModel, final InterceptorContext ctx) throws InterceptorException
    {
        if(vehicleModel.getName() != null)
        {
            LOG.info("Vehicle Loaded: " + vehicleModel.getName());
        }
    }

}