package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import org.training.core.model.VehicleModel;

public class VehicleRemoveInterceptor implements RemoveInterceptor<VehicleModel>
{

    @Override
    public void onRemove(final VehicleModel vehicle, final InterceptorContext context)
            throws InterceptorException
    {
        System.out.println("Deleting vehicle: " + vehicle.getName());
    }
}