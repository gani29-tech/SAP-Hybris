//package org.training.core.actions;
//
//import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
//import org.training.core.model.OrderTrackingEmailProcessModel;
//
//import java.util.logging.Logger;
//
//public class SentEmail extends AbstractSimpleDecisionAction<OrderTrackingEmailProcessModel> {
//    public static final Logger LOG = Logger.getLogger(SentEmail.class.getName());
//    @Override
//    public Transition executeAction(OrderTrackingEmailProcessModel orderTrackingEmailProcessModel) throws Exception {
//        LOG.info("*********************************************************");
//        LOG.info("Email is Sent to "+orderTrackingEmailProcessModel.getEmail());
//        LOG.info("*********************************************************");
//        return  Transition.OK;
//    }
//}
