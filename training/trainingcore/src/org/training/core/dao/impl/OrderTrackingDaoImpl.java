package org.training.core.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.training.core.dao.OrderTrackingDao;
import org.training.core.dao.VehicleDao;
import org.training.core.model.OrderTrackingEmailProcessModel;
import org.training.core.model.VehicleModel;

import javax.annotation.Resource;
import java.util.List;

public class OrderTrackingDaoImpl implements OrderTrackingDao {
    private FlexibleSearchService flexibleSearchService;
    public List<OrderTrackingEmailProcessModel> getAllOrderTrackingDetails() {
        String query = "SELECT {v:" + OrderTrackingEmailProcessModel.PK + "} " +
                "FROM {" + OrderTrackingEmailProcessModel._TYPECODE + " AS v}";

        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        return flexibleSearchService.<OrderTrackingEmailProcessModel>search(flexibleSearchQuery).getResult();
    }
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

}
