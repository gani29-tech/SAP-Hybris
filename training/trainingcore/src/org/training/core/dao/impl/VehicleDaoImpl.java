package org.training.core.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.training.core.dao.VehicleDao;
import org.training.core.model.VehicleModel;

import javax.annotation.Resource;
import java.util.List;
public class VehicleDaoImpl implements VehicleDao {
    private FlexibleSearchService flexibleSearchService;
    public List<VehicleModel> getAllVehicles() {
        String query = "SELECT {v:" + VehicleModel.PK + "} " +
                "FROM {" + VehicleModel._TYPECODE + " AS v}";

        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        return flexibleSearchService.<VehicleModel>search(flexibleSearchQuery).getResult();
    }
    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
