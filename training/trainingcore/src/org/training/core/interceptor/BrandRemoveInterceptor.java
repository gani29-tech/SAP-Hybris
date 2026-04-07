package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import org.training.core.model.BrandModel;

public class BrandRemoveInterceptor implements RemoveInterceptor<BrandModel>
{

    @Override
    public void onRemove(final BrandModel brand, final InterceptorContext context)
            throws InterceptorException
    {
        if (brand.getVehicles() != null && !brand.getVehicles().isEmpty())
        {
            throw new InterceptorException("Cannot delete brand because vehicles exist.");
        }
    }
}