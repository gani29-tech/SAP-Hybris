/*
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved
 */
package org.training.jalo;

import org.training.constants.CustombackofficeConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;

public class CustombackofficeManager extends GeneratedCustombackofficeManager
{
	public static final CustombackofficeManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CustombackofficeManager) em.getExtension(CustombackofficeConstants.EXTENSIONNAME);
	}
	
}
