/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 31, 2026, 5:56:39 PM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Brand;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Vehicle}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicle extends GenericItem
{
	/** Qualifier of the <code>Vehicle.hp</code> attribute **/
	public static final String HP = "hp";
	/** Qualifier of the <code>Vehicle.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Vehicle.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Vehicle.cc</code> attribute **/
	public static final String CC = "cc";
	/** Qualifier of the <code>Vehicle.topSpeed</code> attribute **/
	public static final String TOPSPEED = "topSpeed";
	/** Qualifier of the <code>Vehicle.brand</code> attribute **/
	public static final String BRAND = "brand";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BRAND's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVehicle> BRANDHANDLER = new BidirectionalOneToManyHandler<GeneratedVehicle>(
	TrainingCoreConstants.TC.VEHICLE,
	false,
	"brand",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(HP, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(CC, AttributeMode.INITIAL);
		tmp.put(TOPSPEED, AttributeMode.INITIAL);
		tmp.put(BRAND, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.brand</code> attribute.
	 * @return the brand
	 */
	public Brand getBrand(final SessionContext ctx)
	{
		return (Brand)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.brand</code> attribute.
	 * @return the brand
	 */
	public Brand getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final SessionContext ctx, final Brand value)
	{
		BRANDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final Brand value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.cc</code> attribute.
	 * @return the cc
	 */
	public Integer getCc(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.cc</code> attribute.
	 * @return the cc
	 */
	public Integer getCc()
	{
		return getCc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.cc</code> attribute. 
	 * @return the cc
	 */
	public int getCcAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCc( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.cc</code> attribute. 
	 * @return the cc
	 */
	public int getCcAsPrimitive()
	{
		return getCcAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.cc</code> attribute. 
	 * @param value the cc
	 */
	public void setCc(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.cc</code> attribute. 
	 * @param value the cc
	 */
	public void setCc(final Integer value)
	{
		setCc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.cc</code> attribute. 
	 * @param value the cc
	 */
	public void setCc(final SessionContext ctx, final int value)
	{
		setCc( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.cc</code> attribute. 
	 * @param value the cc
	 */
	public void setCc(final int value)
	{
		setCc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BRANDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute.
	 * @return the hp
	 */
	public Integer getHp(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute.
	 * @return the hp
	 */
	public Integer getHp()
	{
		return getHp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute. 
	 * @return the hp
	 */
	public int getHpAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHp( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute. 
	 * @return the hp
	 */
	public int getHpAsPrimitive()
	{
		return getHpAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final Integer value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final SessionContext ctx, final int value)
	{
		setHp( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final int value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.topSpeed</code> attribute.
	 * @return the topSpeed
	 */
	public Integer getTopSpeed(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOPSPEED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.topSpeed</code> attribute.
	 * @return the topSpeed
	 */
	public Integer getTopSpeed()
	{
		return getTopSpeed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.topSpeed</code> attribute. 
	 * @return the topSpeed
	 */
	public int getTopSpeedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTopSpeed( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.topSpeed</code> attribute. 
	 * @return the topSpeed
	 */
	public int getTopSpeedAsPrimitive()
	{
		return getTopSpeedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.topSpeed</code> attribute. 
	 * @param value the topSpeed
	 */
	public void setTopSpeed(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOPSPEED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.topSpeed</code> attribute. 
	 * @param value the topSpeed
	 */
	public void setTopSpeed(final Integer value)
	{
		setTopSpeed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.topSpeed</code> attribute. 
	 * @param value the topSpeed
	 */
	public void setTopSpeed(final SessionContext ctx, final int value)
	{
		setTopSpeed( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.topSpeed</code> attribute. 
	 * @param value the topSpeed
	 */
	public void setTopSpeed(final int value)
	{
		setTopSpeed( getSession().getSessionContext(), value );
	}
	
}
