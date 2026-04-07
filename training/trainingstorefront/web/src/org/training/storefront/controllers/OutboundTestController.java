//package org.training.storefront.controllers;
//
//import de.hybris.platform.core.model.ItemModel;
//import de.hybris.platform.outboundservices.service.;
//import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
//import de.hybris.platform.servicelayer.search.FlexibleSearchService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@RestController
//public class OutboundTestController {
//
//    private static final Logger LOG = LoggerFactory.getLogger(OutboundTestController.class);
//
//    @Resource(name = "outboundService")
//    private OutboundService outboundService;
//
//    @Resource
//    private FlexibleSearchService flexibleSearchService;
//
//    @GetMapping("/test-outbound")
//    public String triggerOutbound(@RequestParam String code) {
//
//        String queryText = "SELECT {PK} FROM {OrderTrackingEmailProcess} WHERE {code} = ?code";
//        FlexibleSearchQuery query = new FlexibleSearchQuery(queryText);
//        query.addQueryParameter("code", code);
//
//        List<ItemModel> results = flexibleSearchService.<ItemModel>search(query).getResult();
//
//        if (results.isEmpty()) {
//            return "Error: Item with code " + code + " not found in database.";
//        }
//
//        ItemModel itemToSend = results.get(0);
//        String integrationObjectCode = "OrderTrackingOutboundIO";
//        String destinationId = "OutboundTestDestination";
//
//        LOG.info("Triggering outbound sync for item: {}", code);
//
//        outboundService.send(itemToSend, integrationObjectCode, destinationId)
//                .subscribe(
//                        response -> {
//                            LOG.info("Outbound Sync SUCCESS for {}. Status: {}", code, response.getStatusCode());
//                        },
//                        error -> {
//                            LOG.error("Outbound Sync FAILED for {}. Reason: {}", code, error.getMessage());
//                        }
//                );
//
//        return "Outbound request for " + code + " has been triggered. Check console.log and Backoffice Outbound Monitoring.";
//    }
//}