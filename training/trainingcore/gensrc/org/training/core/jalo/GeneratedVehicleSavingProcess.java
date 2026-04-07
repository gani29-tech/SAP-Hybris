/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 31, 2026, 5:56:39 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess VehicleSavingProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleSavingProcess extends BusinessProcess
{
	/** Qualifier of the <code>VehicleSavingProcess.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VEHICLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSavingProcess.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public Item getVehicle(final SessionContext ctx)
	{
		return (Item)getProperty( ctx, VEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSavingProcess.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public Item getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSavingProcess.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final SessionContext ctx, final Item value)
	{
		setProperty(ctx, VEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSavingProcess.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final Item value)
	{
		setVehicle( getSession().getSessionContext(), value );
	}
	
}
