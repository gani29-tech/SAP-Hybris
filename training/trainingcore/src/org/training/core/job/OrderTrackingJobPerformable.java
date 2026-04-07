package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.services.BaseStoreService;
import org.training.core.model.OrderTrackingEmailProcessModel;

import javax.annotation.Resource;
import java.util.logging.Logger;

public class OrderTrackingJobPerformable extends AbstractJobPerformable<CronJobModel>
{
    private static final Logger LOG =
            Logger.getLogger(OrderTrackingJobPerformable.class.getName());
    @Resource
    private BaseSiteService baseSiteService;
    @Resource
    private BaseStoreService baseStoreService;
    @Resource
    private CommonI18NService commonI18NService;
    @Resource
    private ModelService modelService;
    @Resource
    private BusinessProcessService businessProcessService;
    @Override
    public PerformResult perform(CronJobModel cronJobModel)
    {
        LOG.info("Performing order tracking job");
        OrderTrackingEmailProcessModel process =
                businessProcessService.createProcess(
                        "trackingEmailProcess-" + System.currentTimeMillis(),
                        "orderTrackingProcess");
        process.setEmail("ganeshgana939@gmail.com");
        process.setName("Order Tracking");
        process.setSite(baseSiteService.getBaseSiteForUID("apparel-uk"));
        process.setStore(baseStoreService.getBaseStoreForUid("apparel-uk"));
        process.setLanguage(commonI18NService.getLanguage("en"));
        process.setCurrency(commonI18NService.getCurrency("GBP"));
        LOG.info("*******************************************************");
        LOG.info(process.getFullname());
        LOG.info("*******************************************************");

        process.setFrontendTemplateName("orderTrackingEmailTemplate");
        modelService.save(process);
        businessProcessService.startProcess(process);

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
    public BusinessProcessService getBusinessProcessService()
    {
        return businessProcessService;
    }
    public void setBusinessProcessService(final BusinessProcessService businessProcessService)
    {
        this.businessProcessService = businessProcessService;
    }
}