

package asianpaintscore;

import java.util.*;
import java.io.Serializable;
import de.hybris.platform.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.type.*;
import de.hybris.platform.persistence.enumeration.*;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.persistence.*;

/**
 * Generated by hybris Platform.
 */
@SuppressWarnings({"cast","unused","boxing","null", "PMD"})
public class GeneratedTypeInitializer extends AbstractTypeInitializer
{
	/**
	 * Generated by hybris Platform.
	 */
	public GeneratedTypeInitializer( ManagerEJB manager, Map params )
	{
		super( manager, params );
	}


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected void performRemoveObjects( ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// no-op by now
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateTypes
	
	
		createItemType(
			"ApparelProduct",
			"Product",
			com.asianpaints.core.jalo.ApparelProduct.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"ApparelStyleVariantProduct",
			"VariantProduct",
			com.asianpaints.core.jalo.ApparelStyleVariantProduct.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"ApparelSizeVariantProduct",
			"ApparelStyleVariantProduct",
			com.asianpaints.core.jalo.ApparelSizeVariantProduct.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"AsianpaintsProduct",
			"Product",
			com.asianpaints.core.jalo.AsianpaintsProduct.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"AsianpaintsStyleVariantProduct",
			"VariantProduct",
			com.asianpaints.core.jalo.AsianpaintsStyleVariantProduct.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"AsianpaintsSizeVariantProduct",
			"AsianpaintsStyleVariantProduct",
			com.asianpaints.core.jalo.AsianpaintsSizeVariantProduct.class,
			null,
			false,
			null,
			false
		);
	
		createItemType(
			"ComingSoonCustomer",
			"GenericItem",
			com.asianpaints.core.jalo.ComingSoonCustomer.class,
			"de.hybris.platform.persistence.asianpaintscore_ComingSoonCustomer",
			false,
			null,
			false
		);
	
		createItemType(
			"ElectronicsColorVariantProduct",
			"VariantProduct",
			com.asianpaints.core.jalo.ElectronicsColorVariantProduct.class,
			null,
			false,
			null,
			false
		);
	
		createEnumerationType(
			"SwatchColorEnum",
			null
		);
	
		createCollectionType(
			"GenderList",
			"Gender",
			CollectionType.LIST
		);
	
		createCollectionType(
			"SwatchColorSet",
			"SwatchColorEnum",
			CollectionType.SET
		);
	
		createCollectionType(
			"ProductAddonsCollectionList",
			"java.lang.String",
			CollectionType.LIST
		);
	
		createCollectionType(
			"AbstractOrderCollectionList",
			"java.lang.String",
			CollectionType.LIST
		);
	
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performModifyTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performModifyTypes
	

	
	
				single_createattr_ApparelProduct_genders();
			
				single_createattr_ApparelStyleVariantProduct_style();
			
				single_createattr_ApparelStyleVariantProduct_swatchColors();
			
				single_createattr_ApparelSizeVariantProduct_size();
			
				single_createattr_AsianpaintsProduct_genders();
			
				single_createattr_AsianpaintsProduct_isComingSoon();
			
				single_createattr_Customer_contactNumber();
			
				single_createattr_Customer_dateOfBirth();
			
				single_createattr_AsianpaintsStyleVariantProduct_style();
			
				single_createattr_AsianpaintsStyleVariantProduct_swatchColors();
			
				single_createattr_AsianpaintsSizeVariantProduct_size();
			
				single_createattr_AsianpaintsSizeVariantProduct_addons();
			
				single_createattr_AbstractOrderEntry_selectedAddons();
			
				single_createattr_ComingSoonCustomer_firstName();
			
				single_createattr_ComingSoonCustomer_lastName();
			
				single_createattr_ComingSoonCustomer_emailId();
			
				single_createattr_ComingSoonCustomer_productCode();
			
				single_createattr_ComingSoonCustomer_productName();
			
				single_createattr_ComingSoonCustomer_isExported();
			
				single_createattr_ElectronicsColorVariantProduct_color();
			

	}

	
	public void single_createattr_ApparelProduct_genders() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ApparelProduct", 
					"genders",  
					null,
					"GenderList",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ApparelStyleVariantProduct_style() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ApparelStyleVariantProduct", 
					"style",  
					null,
					"localized:java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					"VariantAttributeDescriptor",
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ApparelStyleVariantProduct_swatchColors() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ApparelStyleVariantProduct", 
					"swatchColors",  
					null,
					"SwatchColorSet",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ApparelSizeVariantProduct_size() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ApparelSizeVariantProduct", 
					"size",  
					null,
					"localized:java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					"VariantAttributeDescriptor",
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_AsianpaintsProduct_genders() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"AsianpaintsProduct", 
					"genders",  
					null,
					"GenderList",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_AsianpaintsProduct_isComingSoon() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"AsianpaintsProduct", 
					"isComingSoon",  
					null,
					"java.lang.Boolean",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Customer_contactNumber() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Customer", 
					"contactNumber",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Customer_dateOfBirth() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Customer", 
					"dateOfBirth",  
					null,
					"java.util.Date",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_AsianpaintsStyleVariantProduct_style() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"AsianpaintsStyleVariantProduct", 
					"style",  
					null,
					"localized:java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					"VariantAttributeDescriptor",
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_AsianpaintsStyleVariantProduct_swatchColors() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"AsianpaintsStyleVariantProduct", 
					"swatchColors",  
					null,
					"SwatchColorSet",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_AsianpaintsSizeVariantProduct_size() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"AsianpaintsSizeVariantProduct", 
					"size",  
					null,
					"localized:java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					"VariantAttributeDescriptor",
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_AsianpaintsSizeVariantProduct_addons() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"AsianpaintsSizeVariantProduct", 
					"addons",  
					null,
					"ProductAddonsCollectionList",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_AbstractOrderEntry_selectedAddons() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"AbstractOrderEntry", 
					"selectedAddons",  
					null,
					"AbstractOrderCollectionList",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ComingSoonCustomer_firstName() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ComingSoonCustomer", 
					"firstName",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ComingSoonCustomer_lastName() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ComingSoonCustomer", 
					"lastName",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ComingSoonCustomer_emailId() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ComingSoonCustomer", 
					"emailId",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ComingSoonCustomer_productCode() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ComingSoonCustomer", 
					"productCode",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ComingSoonCustomer_productName() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ComingSoonCustomer", 
					"productName",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ComingSoonCustomer_isExported() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ComingSoonCustomer", 
					"isExported",  
					null,
					"java.lang.Boolean",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_ElectronicsColorVariantProduct_color() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"ElectronicsColorVariantProduct", 
					"color",  
					null,
					"localized:java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					"VariantAttributeDescriptor",
					sqlColumnDefinitions
				);
			
	}
	


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateObjects( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateObjects
	
	
		createEnumerationValues(
			"SwatchColorEnum",
			true,
			Arrays.asList( new String[] {
			
				"BLACK",
				"BLUE",
				"BROWN",
				"GREEN",
				"GREY",
				"ORANGE",
				"PINK",
				"PURPLE",
				"RED",
				"SILVER",
				"WHITE",
				"YELLOW"
			} )
		);
	
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ApparelProduct",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_ApparelProduct_genders();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ApparelStyleVariantProduct",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_ApparelStyleVariantProduct_style();
		
			single_setAttributeProperties_ApparelStyleVariantProduct_swatchColors();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ApparelSizeVariantProduct",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_ApparelSizeVariantProduct_size();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"AsianpaintsProduct",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_AsianpaintsProduct_genders();
		
			single_setAttributeProperties_AsianpaintsProduct_isComingSoon();
		
				{
				Map customPropsMap = new HashMap();
				
				changeMetaType(
					"Customer",
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_Customer_contactNumber();
		
			single_setAttributeProperties_Customer_dateOfBirth();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"AsianpaintsStyleVariantProduct",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_AsianpaintsStyleVariantProduct_style();
		
			single_setAttributeProperties_AsianpaintsStyleVariantProduct_swatchColors();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"AsianpaintsSizeVariantProduct",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_AsianpaintsSizeVariantProduct_size();
		
			single_setAttributeProperties_AsianpaintsSizeVariantProduct_addons();
		
				{
				Map customPropsMap = new HashMap();
				
				changeMetaType(
					"AbstractOrderEntry",
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_AbstractOrderEntry_selectedAddons();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ComingSoonCustomer",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_ComingSoonCustomer_firstName();
		
			single_setAttributeProperties_ComingSoonCustomer_lastName();
		
			single_setAttributeProperties_ComingSoonCustomer_emailId();
		
			single_setAttributeProperties_ComingSoonCustomer_productCode();
		
			single_setAttributeProperties_ComingSoonCustomer_productName();
		
			single_setAttributeProperties_ComingSoonCustomer_isExported();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"ElectronicsColorVariantProduct",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_ElectronicsColorVariantProduct_color();
		
				setDefaultProperties(
					"GenderList",
					true,
					true,
					null
				);
			
				setDefaultProperties(
					"SwatchColorSet",
					true,
					true,
					null
				);
			
				setDefaultProperties(
					"ProductAddonsCollectionList",
					true,
					true,
					null
				);
			
				setDefaultProperties(
					"AbstractOrderCollectionList",
					true,
					true,
					null
				);
			
				setDefaultProperties(
					"SwatchColorEnum",
					true,
					true,
					null
				);
			
	}


		
						public void single_setAttributeProperties_ApparelProduct_genders() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ApparelProduct", 
								"genders",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ApparelStyleVariantProduct_style() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ApparelStyleVariantProduct", 
								"style",
								false, 
								null,
								null,
								null,
								true,
								true,
								"VariantAttributeDescriptor",
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ApparelStyleVariantProduct_swatchColors() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ApparelStyleVariantProduct", 
								"swatchColors",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ApparelSizeVariantProduct_size() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ApparelSizeVariantProduct", 
								"size",
								false, 
								null,
								null,
								null,
								true,
								true,
								"VariantAttributeDescriptor",
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_AsianpaintsProduct_genders() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"AsianpaintsProduct", 
								"genders",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_AsianpaintsProduct_isComingSoon() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"AsianpaintsProduct", 
								"isComingSoon",
								false, 
								Boolean.FALSE,
								"Boolean.FALSE",
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Customer_contactNumber() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Customer", 
								"contactNumber",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Customer_dateOfBirth() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Customer", 
								"dateOfBirth",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_AsianpaintsStyleVariantProduct_style() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"AsianpaintsStyleVariantProduct", 
								"style",
								false, 
								null,
								null,
								null,
								true,
								true,
								"VariantAttributeDescriptor",
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_AsianpaintsStyleVariantProduct_swatchColors() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"AsianpaintsStyleVariantProduct", 
								"swatchColors",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_AsianpaintsSizeVariantProduct_size() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"AsianpaintsSizeVariantProduct", 
								"size",
								false, 
								null,
								null,
								null,
								true,
								true,
								"VariantAttributeDescriptor",
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_AsianpaintsSizeVariantProduct_addons() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"AsianpaintsSizeVariantProduct", 
								"addons",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_AbstractOrderEntry_selectedAddons() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"AbstractOrderEntry", 
								"selectedAddons",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ComingSoonCustomer_firstName() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ComingSoonCustomer", 
								"firstName",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ComingSoonCustomer_lastName() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ComingSoonCustomer", 
								"lastName",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ComingSoonCustomer_emailId() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ComingSoonCustomer", 
								"emailId",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ComingSoonCustomer_productCode() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ComingSoonCustomer", 
								"productCode",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ComingSoonCustomer_productName() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ComingSoonCustomer", 
								"productName",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ComingSoonCustomer_isExported() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ComingSoonCustomer", 
								"isExported",
								false, 
								Boolean.FALSE,
								"Boolean.FALSE",
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_ElectronicsColorVariantProduct_color() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"ElectronicsColorVariantProduct", 
								"color",
								false, 
								null,
								null,
								null,
								true,
								true,
								"VariantAttributeDescriptor",
								customPropsMap,
								null
							);
						}
					
}

	