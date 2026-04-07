package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.model.BikeModel;
import org.training.core.model.CarModel;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;


public class VehicleJobPerformable extends AbstractJobPerformable<CronJobModel> {

    @Resource
    private FlexibleSearchService flexibleSearchService;
    public static final Logger  LOG = Logger.getLogger(VehicleJobPerformable.class.getName());
    @Override
    public PerformResult perform(CronJobModel cronJob) {
        processCars();
        processBikes();
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
    public void processCars() {
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(
                "Select "+ CarModel.PK+" from {Car}");

        SearchResult<CarModel> result = flexibleSearchService.search(flexibleSearchQuery);
        List<CarModel> cars = result.getResult();
        for (CarModel car : cars) {
            LOG.info("Processing " + car.getName());
        }
    }
    public void processBikes() {
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(
                "Select "+ BikeModel.PK+" from {Bike}");
        SearchResult<BikeModel> result = flexibleSearchService.search(flexibleSearchQuery);
        List<BikeModel> bikes = result.getResult();
        for (BikeModel bike : bikes) {
            LOG.info("Processing " + bike.getName());
        }
    }
}
