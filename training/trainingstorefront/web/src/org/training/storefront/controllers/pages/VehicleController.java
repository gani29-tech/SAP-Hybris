package org.training.storefront.controllers.pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.facades.VehicleFacade;

import javax.annotation.Resource;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/vehicle")
public class VehicleController
{
    private  static final Logger LOG = Logger.getLogger(VehicleController.class.getName());
    @Resource
    private VehicleFacade vehicleFacade;
    @GetMapping
    public String getVehicles(Model model)
    {
        LOG.info("*****Inside Controller*******");
        model.addAttribute("vehicles", vehicleFacade.getVehicles());
        LOG.info("*******"+vehicleFacade.getVehicles().toString());
        return "pages/vehicle/vehiclePage";
    }
}
