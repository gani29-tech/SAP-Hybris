package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.VehicleModel;
import org.training.facades.data.VehicleData;

import java.util.logging.Logger;

public class VehiclePopulator implements Populator<VehicleModel, VehicleData> {
    private static final Logger LOG = Logger.getLogger(VehiclePopulator.class.getName());
    @Override
    public void populate(VehicleModel source, VehicleData target) throws ConversionException {
        LOG.info("************Vehicle Populator**************");
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setCc(source.getCc());
        LOG.info("************"+source.getCc()+"**************");
        target.setHp(source.getHp());
        LOG.info("************"+source.getHp()+"**************");
        target.setTopSpeed(source.getTopSpeed());
        LOG.info("************"+source.getTopSpeed()+"**************");
    }
}
