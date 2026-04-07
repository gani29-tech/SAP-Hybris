package org.training.controllers;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.training.dto.VehicleTrackingWsDto;
import org.training.dto.VehicleWsDto;
import org.training.facades.VehicleFacade;
import org.training.facades.data.VehicleData;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/{baseSiteId}/ordertrack")
@Tag(name = "Vehicle Tracking")
public class OrderTrackingController {

    @Resource(name = "vehicleFacade")
    private VehicleFacade vehicleFacade;

    @Resource(name = "dataMapper")
    private DataMapper dataMapper;
    @Secured({"ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERGROUP"})
    @GetMapping(value = "/vehicles")
    @ResponseBody
    @Operation(summary = "Get all tracked vehicles")
    public VehicleTrackingWsDto getVehicles(
            @Parameter(description = "Base site identifier", required = true)
            @PathVariable final String baseSiteId,
            @Parameter(description = "Fields: BASIC, DEFAULT, FULL, CUSTOM")
            @RequestParam(required = false, defaultValue = "DEFAULT") final String fields) {
        List<VehicleData> vehicleDataList = vehicleFacade.getVehicles();
        List<VehicleWsDto>  vehicleWsDtoList = dataMapper.mapAsList(vehicleDataList,VehicleWsDto.class,fields);

        VehicleTrackingWsDto wrapper = new VehicleTrackingWsDto();
        wrapper.setVehicles(vehicleWsDtoList);
        return wrapper;
    }
}