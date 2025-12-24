/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import org.openqa.selenium.By;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;


/**
 * @author Anup
 * 
 * 17-Dec-2025
 */
public class MarkPatientDeceasedPage extends GeneralBrowserSetting {
	

	
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	private final By add_patient  = By.partialLinkText("Add Patient");
	
	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String mark_patient = "//a[normalize-space()='Mark Patient Deceased']";
	
	//--------------------------------------Mark Patient Passed Aways Page------------------------------
	
	protected static String mark_patient_deceased_uhid = "//input[@id='uHid']";
	protected static String mark_patient_deceased_search_icon = "//a[@id='search_huid']//i[@class='fa fa-search']";
	protected static String mark_patient_deceased_plush_icon = "//i[@class='fa fa-search-plus']";
	
	//--------------------------------------Mark Patient Deceased Serach Popup ------------------------------
	
	protected static String mark_patient_deceased_popup_mobile = "//input[@id='modal_mobileNo']";
	protected static String mark_patient_deceased_popup_name = "//input[@id='modal_Name']";
	protected static String mark_patient_deceased_popup_gender = "//select[@id='modal_gender']";
	protected static String mark_patient_deceased_popup_dob = "//input[@id='modal_DOB']";
	protected static String mark_patient_deceased_popup_locality = "//input[@id='modal_locality']";
	protected static String mark_patient_deceased_popup_serach = "//a[@id='search_button']//i[@class='fa fa-search']";
	protected static String mark_patient_deceased_popup_select_first_row = "//*[@id=\"searchTable_Container\"]//tr[2]";
	
    //--------------------------------------Mark Patient Deceased Page ------------------------------
	protected static String mark_patient_deceased_deceased_check_box = "//input[@id='Deceased']"; 
	protected static String mark_patient_deceased_date_of_death = "//input[@id='Informed_on']";
	protected static String mark_patient_deceased_iformed_by = "//input[@id='Informed_By']";
	
	protected static String mark_patient_deceased_save = "//a[@id='register']//i[@class='fa fa-save']";
	protected static String mark_patient_deceased_save_yes_popup = "//a[@id='btnyes']";
	protected static String mark_patient_deceased_active_appointments_Yes_popup = "//a[@id='appointmentReqPopupYes']";
	
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}
	//--------------------------------------billing page methods------------------------------
	
	public void clickOnBillingButton(String add_patient , String mark_patient_passed_aways) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
		CommanUtill.clickFunction(mark_patient, mark_patient_passed_aways);

	} 
	
	public void serachPatientInUHID(String enter_uhid, String serach_in_uhid) throws IOException, InterruptedException {

		CommanUtill.textEnter(mark_patient_deceased_uhid, enter_uhid);
		CommanUtill.clickFunction(mark_patient_deceased_search_icon, serach_in_uhid);
	}
	
	//--------------------------------------Mark Patient Deceased Serach Popup methods------------------------------
	
	public void clickOnPlushIcon(String plush_icon) throws IOException, InterruptedException {

		CommanUtill.clickFunction(mark_patient_deceased_plush_icon, plush_icon);
	}
	
    public void enterMobileInPopup(String mobile_no , String enter_mobile_no) throws IOException, InterruptedException {
    	
    	  CommanUtill.textEnter(mark_patient_deceased_popup_mobile, mobile_no);
    	  CommanUtill.clickFunction(mark_patient_deceased_popup_serach, enter_mobile_no);
    }
    
	public void enterNameInPopup(String patient_name , String enter_patient_name) throws IOException, InterruptedException {
    	
  	  CommanUtill.textEnter(mark_patient_deceased_popup_name, patient_name);
  	  CommanUtill.clickFunction(mark_patient_deceased_popup_serach, enter_patient_name);	
  	  
	}
	
	public void enterDOBInPopup(String dob_text, String serach_icon) throws IOException, InterruptedException {

		CommanUtill.textEnter(mark_patient_deceased_popup_dob, dob_text);
		CommanUtill.clickFunction(mark_patient_deceased_popup_serach, serach_icon);

	}
	
	public void enterLocalityInPopup(String locality_text, String serach_locality) throws IOException, InterruptedException {

		CommanUtill.textEnter(mark_patient_deceased_popup_locality, locality_text);
		CommanUtill.clickFunction(mark_patient_deceased_popup_serach, serach_locality);

	}
	
	public void selectGenderInPopup(String genderText , String gender_popup) throws IOException, InterruptedException {
    	
  	  CommanUtill.dropdownSelectByVisibleText(mark_patient_deceased_popup_gender, genderText);
      CommanUtill.clickFunction(mark_patient_deceased_popup_serach ,gender_popup);
      
	}
	
	public void selectFirstPatientFromPopup(String select_first_row) throws IOException, InterruptedException {

		CommanUtill.clickFunction(mark_patient_deceased_popup_select_first_row, select_first_row);

	}
	
	//--------------------------------------Mark Patient Deceased Page methods------------------------------
	public void clickOnDeceasedCheckBox(String deceased_check_box) throws IOException, InterruptedException {

		CommanUtill.clickFunction(mark_patient_deceased_deceased_check_box, deceased_check_box);
	}
	
	public void enterDateOfDeath(String date_of_death) throws IOException, InterruptedException {

		CommanUtill.textEnter(mark_patient_deceased_date_of_death, date_of_death);
	}
	
	public void enterInformedBy(String informed_by) throws IOException, InterruptedException {

		CommanUtill.textEnter(mark_patient_deceased_iformed_by, informed_by);
	}
	
	public void clickOnSaveButtonYespopup(String save_button, String Yes_popu) throws IOException, InterruptedException {

		CommanUtill.clickFunction(mark_patient_deceased_save, save_button);
		CommanUtill.clickFunction(mark_patient_deceased_save_yes_popup, Yes_popu);
		
	}
	
	public void clickOnActiveAppointmentsYespopup(String active_appointments_yes_popup) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(mark_patient_deceased_active_appointments_Yes_popup)) {
			CommanUtill.clickFunction(mark_patient_deceased_active_appointments_Yes_popup, active_appointments_yes_popup);
			System.out.println("Active Appointments Yes Popup is displayed");
		} else {
			System.out.println("Active Appointments Yes Popup is not displayed");
		}
	}
}
