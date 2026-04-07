package org.training.core.actions;

import de.hybris.platform.acceleratorservices.process.email.actions.GenerateEmailAction;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.model.OrderTrackingEmailProcessModel;

import javax.annotation.Resource;
import java.util.logging.Logger;

public class MyGenerateEmail extends GenerateEmailAction {

    public static final Logger LOG = Logger.getLogger(MyGenerateEmail.class.getName());

    @Resource
    private ModelService modelService;

    @Override
    public Transition executeAction(final BusinessProcessModel process) {
        OrderTrackingEmailProcessModel orderTrackingEmailProcessModel =
                (OrderTrackingEmailProcessModel) process;

        LOG.info("*******************************************************");
        LOG.info("Generating Email !!!!!!!!!!!!");
        LOG.info(orderTrackingEmailProcessModel.getFullname());
        LOG.info(orderTrackingEmailProcessModel.getFrontendTemplateName());
        LOG.info("*******************************************************");

        orderTrackingEmailProcessModel.setEmail("ganeshgana939@gmail.com");
        orderTrackingEmailProcessModel.setFrontendTemplateName("orderTrackingEmailTemplate");
        modelService.save(orderTrackingEmailProcessModel);

        return super.executeAction(orderTrackingEmailProcessModel);
    }

}