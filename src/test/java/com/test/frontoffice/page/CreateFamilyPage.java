/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 22-Dec-2025
 */
public class CreateFamilyPage extends GeneralBrowserSetting{
	
	public static String globalEmployeeCode;

	  
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String patient_create_family_page = "//a[normalize-space()='Create Family']";
	
	protected static String enter_uhid = "//input[@id='txtuhid']";
	//------------------- serach icon ----------------------
	protected static String serach_icon = "//i[@class='fa fa-search fa-icon ser-ico']";
	protected static String serach_mobile = "//input[@id='modal_mobileNo']";
	protected static String serach_name = "//input[@id='modal_mobileNo']";
	protected static String serach_first_name = "//input[@id='modal_firstName']";
	protected static String serach_locality = "//input[@id='modal_locality']";
	protected static String serach_gender = "//select[@id='modal_gender']";
	protected static String serach_popup_icon = "//a[@id='search_button']//i[@class='fa fa-search']";
	
	protected static String serach_table_select = "//div[@id=\"searchTable_Container\"]//tr[2]";
	protected static String select_rate_contract  = "//select[@id='ddlRateContract']";
	protected static String mapped_scheme_popup = "//div[@class='popuptable150']//tbody//tr[1]";
	//--------------------Scheme Check Box -------------------------
	protected static String scheme_check_box  = "//input[@id='chkscheme']";
	protected static String scheme_drp = "//select[@id='ddlscheme']";
	protected static String scheme_validity = "//input[@id='txtValidity']";
	protected static String chek_box_save_rate_contract = "//input[@id='chkallscheme']";
	protected static String chek_box_save_rate_contract_yes_popup = "//a[@id='btnchkYes']";
	
	//
	protected static String Relation_drp = "//select[@id='ddlrelation']";
	protected static String add_plush_icon = "//a[@id='addnewrow']//i[@class='fa fa-plus']";
	protected static String family_id_no = "//input[@id='txtFamily']";
	protected static String employee_code  = "//input[@id='txtempcode']";
	
	//-------------------save-------------------
	protected static String save_icon = "//i[@id='btnsave']";
	protected static String yes_popup_save = "//a[@id='btnyes']";
	protected static String clear = "//i[@id='Clear']";
	protected static String csv_icon = "//i[@id='btnemployeecodecsv']";
	
	
	
	
	
	
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void clickONCreateFamilyPatient(String add_patient , String merge_page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
		CommanUtill.clickFunction(patient_create_family_page, merge_page);
	}

	public void enterUHID(String UHID)  throws IOException, InterruptedException {
		
		CommanUtill.textEnter(enter_uhid, UHID);
	    driver.findElement(By.xpath(enter_uhid)).sendKeys(Keys.ENTER);
	}
	//---------------------------Serach Popup ------------------------------------
	public void serachCreateFamilyMember(String Serach_icon) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(serach_icon, Serach_icon);
	}
	
	public void enterSerachMobileNumberEnter(String Mobile_no , String serach_icon_popup) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(serach_mobile, Mobile_no);
		CommanUtill.clickFunction(serach_popup_icon, serach_icon_popup);	
	}
	
   public void enterSerachNameEnter(String name , String serach_icon_popup) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(serach_name, name);
		CommanUtill.clickFunction(serach_popup_icon, serach_icon_popup);	
	}
   
   public void clickOnTablePatient(String click_one) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(serach_table_select, click_one);
   }
   //------------------------------Create Family Rate Contract ----------------------------
   
   public void selectByRateContract(String rate_contrate) throws IOException , InterruptedException {
	
	CommanUtill.dropdownSelectByVisibleText(select_rate_contract, rate_contrate);
}
   
   public void clickOnMappedScheme(String Mapped_scheme) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(mapped_scheme_popup, Mapped_scheme);  
   }
   
   public void serachSchemeDrpAndCheckBox(String Check_box_scheme ,String serachScheme) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(scheme_check_box, Check_box_scheme);
	   CommanUtill.dropdownSelectByVisibleText(scheme_drp, serachScheme);
   }
   
   public void enterSchemeValidity(String validity_date) throws IOException , InterruptedException {
	   
	   CommanUtill.textEnter(scheme_validity, validity_date);
	   
   }
   
   public void CheckBoxSaveRateContractAndSchemeAllMembers(String check_box_save ,String  Yes_Popup) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(chek_box_save_rate_contract, check_box_save);
	   CommanUtill.clickFunction(chek_box_save_rate_contract_yes_popup, Yes_Popup);
   }

   public void enterFamilyID_number(String family_no ) throws IOException , InterruptedException {
	   
	   CommanUtill.textEnter(family_id_no, family_no);
	   
   }
   
  public void enterEmployeeCode(String Employee_code ) throws IOException , InterruptedException {
	   
	   CommanUtill.textEnter(employee_code, Employee_code);  
	   driver.findElement(By.xpath(employee_code)).sendKeys(Keys.ENTER);
   }
  
  
  public void generateEnterAndStoreEmployeeCode(String employeeCodePrefix)
	        throws IOException, InterruptedException {

	    globalEmployeeCode = employeeCodePrefix + CommanUtill.randomDigits(3);
	    CommanUtill.textEnter(employee_code, globalEmployeeCode);
	   // System.out.println("Employee Code Generated : " + globalEmployeeCode);
	}

  public String getEmployeeCode() {
	    return globalEmployeeCode;
	}

  
   public void SelectByRelationDrpandPlushIcon(String relation_drp, String plush) throws IOException , InterruptedException {
	   
	   CommanUtill.dropdownSelectByVisibleText(Relation_drp, relation_drp);
	   CommanUtill.clickFunction(add_plush_icon, plush);
	   
   }
   
   public void saveCreateFamilyMember(String Save , String Save_popup) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(save_icon, Save);
	   CommanUtill.clickFunction(yes_popup_save, Save_popup);
   }
   
   public void clickOnCSVFileIcon(String Csv) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(csv_icon, Csv);
	   
   }
   
   
   
}
