/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 31, 2026, 5:56:39 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess OrderTrackingEmailProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedOrderTrackingEmailProcess extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>OrderTrackingEmailProcess.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>OrderTrackingEmailProcess.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>OrderTrackingEmailProcess.frontendTemplateName</code> attribute **/
	public static final String FRONTENDTEMPLATENAME = "frontendTemplateName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(FRONTENDTEMPLATENAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTrackingEmailProcess.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTrackingEmailProcess.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTrackingEmailProcess.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTrackingEmailProcess.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTrackingEmailProcess.frontendTemplateName</code> attribute.
	 * @return the frontendTemplateName
	 */
	public String getFrontendTemplateName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FRONTENDTEMPLATENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTrackingEmailProcess.frontendTemplateName</code> attribute.
	 * @return the frontendTemplateName
	 */
	public String getFrontendTemplateName()
	{
		return getFrontendTemplateName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTrackingEmailProcess.frontendTemplateName</code> attribute. 
	 * @param value the frontendTemplateName
	 */
	public void setFrontendTemplateName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FRONTENDTEMPLATENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTrackingEmailProcess.frontendTemplateName</code> attribute. 
	 * @param value the frontendTemplateName
	 */
	public void setFrontendTemplateName(final String value)
	{
		setFrontendTemplateName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTrackingEmailProcess.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTrackingEmailProcess.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTrackingEmailProcess.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTrackingEmailProcess.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
