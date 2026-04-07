package org.training.core.decorators;

import de.hybris.platform.impex.jalo.header.AbstractImpExCSVCellDecorator;

import java.util.Map;
import java.util.logging.Logger;

public class SuffixDecorator extends AbstractImpExCSVCellDecorator {
    private static final Logger LOG = Logger.getLogger(SuffixDecorator.class.getName());
    @Override
    public String decorate(int i, Map<Integer, String> map) {
        String value = map.get(i);
        if(value==null)
            value = "";
        LOG.info("****************************** Decorator Called ******************************");
        return value+"outs";
    }
}
