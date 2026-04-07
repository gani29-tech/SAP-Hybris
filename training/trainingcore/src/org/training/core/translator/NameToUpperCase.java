package org.training.core.translator;

import de.hybris.platform.impex.jalo.translators.AbstractValueTranslator;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import org.training.core.jalo.OrderTrackingEmailProcess;

import java.util.logging.Logger;

public class NameToUpperCase extends AbstractValueTranslator {
    private static final Logger LOG = Logger.getLogger(NameToUpperCase.class.getName());
    @Override
    public Object importValue(String s, Item item) throws JaloInvalidParameterException {
        LOG.info("****************************** Translator import Called ******************************");
        return s.toUpperCase();
    }

    @Override
    public String exportValue(Object o) throws JaloInvalidParameterException {
        LOG.info("****************************** Translator Export Called ******************************");
        return o.toString().toLowerCase();
    }
}
