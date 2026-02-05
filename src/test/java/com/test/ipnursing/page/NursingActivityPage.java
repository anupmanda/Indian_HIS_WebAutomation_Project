/**
 * 
 */
package com.test.ipnursing.page;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 05-Aug-2025  Old
 */
public class NursingActivityPage extends GeneralBrowserSetting {
	
	protected static String facility = "//select[@id='Facility']";
	protected static String click_nursing = "//li[@id='btn_Nursing']";
	protected static String department = "//select[@id='Department']";
	protected static String click_Yes_popup = "//a[@id='btn_yes_desh']";
	protected static String nursing_activitiy_button = "//span[normalize-space()='Nursing Activity']";
	protected static String nursing_page = "//a[@href='/sanitywebhistree/Nursing/NursingActivity']";
	protected static String unacknowledged_patients = "//button[@id='filterUnackPatient']//i[@class='fa fa-hotel']";
	
	protected static String search_patient = "//input[@placeholder='Search..']";
	protected static String select_top_one_yellow_click = "(//div[contains(@class,'patient-card') and contains(@class,'admittednotoccupied')])[1]";
	
	protected static String select_all_patient_click = "//div[contains(@class,'patient-card p5p')]";
	//protected static String select_top_one_green_click = "//div[contains(@class,'patient-card p5p')]";
	//protected static String select_top_one_green_click = "(//div[contains(@class,'patient-card') and contains(@class,'bedallottedbutnotOccupied')])[1]";
	//protected static String select_top_one_green_click = "(//div[contains(@class,'patient-card') and contains(@class,'occupied')])[1]";
	protected static String select_top_one_green_click = "(//div[contains(@class,'patient-card') and contains(@class,'occupied') and not(contains(@style,'display: none'))])";

	
	protected static String Change_Bed_Status_popup = "//a[@id='savechangebedstatus']";
	protected static String do_want_save_popup_yes = "//a[@id='btn_svbedch_ok']";
	protected static String do_want_save_popup_no = "//a[@id='btn_svbedch_cancel']";
	protected static String acknowledge_popup  = "//button[@id='acknowledgeBtn']";
	
	//new order Pathology 
 	protected static String investigations_click_btn = "//a[@id='investigations']";
 	
 	protected static String new_order_radioButton = "//input[@id='rbNewOrders']";
 	
 	protected static String pathology_radiobutton = "//input[@id='rbPathology']";
 	protected static String pathology_serach_checkbox = "//input[@id='Chksmart_search']";
 	protected static String pathology_serach_box = "//input[@id='searchOrders']";
 	protected static String pathology_test_click = "//td[normalize-space()='Absolute Eosinophil Count ( AEC )']";
 	
 	
 	//div[contains(@class,'table-smartsrch2')]//table[@id='tblAllTest']
 	
 	protected static String pathology_sample_collection_drp_popup = "//select[@id='ddlTestSampleOrds']";
 	
 	//new orde Other Tests
 	
 	protected static String other_test_radiobutton  = "//input[@id='rbTests']";
 	protected static String other_test_serch_box = "//input[@id='searchOrders']";
 	//protected static String other_test_click = "//div[@class='table-smartsrch2 mar-b10']//tr[1]";
 	protected static String other_test_click  =  "//td[normalize-space()='2 (Radiology Services)']";
 	protected static String  other_test_sample_collection_drp_popup   = "//select[@id='ddlTestSampleOrds']";    //
 	
 	//new orde Profiles
 	
 	protected static String profiles_radioButton  = "//input[@id='rbProfiles']";
 	protected static String profiles_serach_box  = "//input[@id='searchOrders']";
 	protected static String profiles_test_click  = "//td[normalize-space()='Full Blood Profile<BGRTY21262>']";
 	protected static String profiles_test_sample_collection_drp_popup  = "//select[@id='ddlTestSampleOrds']";
 	
 	//New Order Order set
 	
 	protected static String orderset_radiobutton  = "//input[@id='rbNurOrderSet']";
 	protected static String order_set_serach_box  = "//input[@id='searchOrders']";
 	protected static String order_set_test_click  = "//td[normalize-space()='Cardio Order Set']";
 	protected static String order_set_select_sample_collection_popup  = "//select[@id='ddlTestSampleOrds']";
 	
 	//Investigations new order doctor
 	
 	protected static String new_oder_doctor_drp  = "//select[@id='ddlDoctor']";
 	protected static String new_order_priority  = "//select[@id='ddlPriority']";
 	
 	//Investigations new order
 	
 	protected static String investigations_new_ordes_save_icon  = "//a[@id='SaveNewOrder']//i[@class='fa fa-save']";
 	
 	protected static String care_provider_remarks_popup  = "//input[@id='txtRemarksIns']";
 	protected static String care_provider_save_popup  = "//a[@id=\"ipOrderInvestAddResponse\"]//i[@class=\"fa fa-save\"]";
 	protected static String permissible_time_range_yes_popup  = "//a[@id=\"btn_ok_duplicatePopup\"]";
 	
 	protected static String investigations_new_order_click_sample_collecton  = "//body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]";
 	protected static String investigations_new_ordes_click_sample_coll_pink_box  = "//div[@id='investigationdetailssn']//tr[1]//td[1]";
 	protected static String investigations_new_ordes_final_save_remaks  = "//div[@class='samplecollectionModal_block']//textarea[@id='Remarks']";
 	protected static String investigations_new_ordes_final_save_popup  = "//a[@id='save_sample_collection']";
 	
	
   public void SelectByFacilityDropDown(String filedName) throws IOException, InvalidFormatException, InterruptedException{
	   
	   CommanUtill.dropdownSelectByVisibleText(facility, filedName);
   }
   
	   public void clickOnNursingDashbord(String filedName) throws IOException, InvalidFormatException, InterruptedException{
		   
		   CommanUtill.clickFunction(click_nursing, filedName);
	   }
	   
     public void selectByDepartmentDropDwon(String filedName) throws IOException, InvalidFormatException, InterruptedException{
		   
	 CommanUtill.dropdownSelectByVisibleText(department, filedName);
	 
	   }
	   
     public void ClickOnDepartmentYesPopup(String filedName) throws IOException, InvalidFormatException, InterruptedException{
    	 
    	 CommanUtill.clickFunction(click_Yes_popup, filedName);
    	 
     }
	  
     public void ClickOnNurisingBurtton(String filedName) throws IOException, InvalidFormatException, InterruptedException{
    	  
    	 CommanUtill.clickFunction(nursing_activitiy_button, filedName);
	   
     }
     public void ClickOnNurisingPage(String filedName) throws IOException, InvalidFormatException, InterruptedException{
	  
	   CommanUtill.clickFunction(nursing_page, filedName);
	     
   }
     public void clickOnUnacknowledgedPatientsIcon(String fieldName) throws IOException, InterruptedException {
    	 
    	 CommanUtill.clickFunction(unacknowledged_patients, fieldName);
     }
     
     
     public void enterOnSearchBoxNursingActivitiy(String fieldName) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(search_patient, fieldName);
		 
	 }
	 
	 public void clickOnTopOneYellowPatient(String fieldName) throws IOException, InterruptedException {
		 
		// CommanUtill.clickFunction(select_top_one_click, fieldName);
	     
		 if (CommanUtill.isElementPresent(select_top_one_yellow_click)) {
	  	        CommanUtill.clickFunction(select_top_one_yellow_click, fieldName);
	  	        System.out.println("Admitted not occupied save.");
	  	    } else {
	  	        System.out.println("Admitted not occupied  Save not appear.");
	  	    }
	 }
	 
	 
	 public void clickOnTopOneGreenPatient(String fieldName) throws IOException, InterruptedException {
		 
		// CommanUtill.clickFunction(select_top_one_green_click, fieldName);
		 	
			 if (CommanUtill.isElementPresent(select_top_one_green_click)) {
		  	        CommanUtill.clickFunction(select_top_one_green_click, fieldName);
		  	        System.out.println("Admitted occupied save.");
		  	    } else {
		  	        System.out.println("Admitted occupied  Save not appear.");
		  	    }
		 }
		

	 public void saveChangeBedStatuPopup(String fieldName) throws IOException, InterruptedException{
		 
		 if (CommanUtill.isElementPresent(Change_Bed_Status_popup)) {
	  	        CommanUtill.clickFunction(Change_Bed_Status_popup, fieldName);
	  	        System.out.println("Change Bed Status popup appeared and Save.");
	  	    } else {
	  	        System.out.println("Change Bed Status popup appeared and Save not appear.");
	  	    }
	  	}
	      
    public void doWantSaveYesPopup(String fieldName) throws IOException, InterruptedException{
		 
		 if (CommanUtill.isElementPresent(do_want_save_popup_yes)) {
	  	        CommanUtill.clickFunction(do_want_save_popup_yes, fieldName);
	  	        System.out.println("Do Want Save  appeared .");
	  	    } else {
	  	        System.out.println("Do Want save not appear.");
	  	    }
	  	}
	
    
    public void acknowledgePopup(String fieldName) throws IOException, InterruptedException{
		 
		 if (CommanUtill.isElementPresent(acknowledge_popup)) {
	  	        CommanUtill.clickFunction(acknowledge_popup, fieldName);
	  	        System.out.println("Acknowlede appeared Save Button.");
	  	    } else {
	  	        System.out.println("Acknowlede appeared Save Button not appear.");
	  	    }
	  	}
    
    public void clickOnInvestigationsButton(String filedName) throws IOException, InterruptedException{
    	
    	CommanUtill.clickFunction(investigations_click_btn, filedName);
    	
    }
    
    public void clickOnNewOrdersRadioButton(String filedName) throws IOException, InterruptedException{
    	
    	CommanUtill.clickFunction(new_order_radioButton, filedName);
    }
    
    public void selectOnPathologyOrdersTest(String radio_button, String sersch_box, String pathology_serach, String pathology_select,
    		String sample_collection_drp) throws IOException, InterruptedException{
    	
    	CommanUtill.clickFunction(pathology_radiobutton, radio_button);
    	CommanUtill.clickFunction(pathology_serach_checkbox, sersch_box);
    	CommanUtill.textEnter(pathology_serach_box, pathology_serach);
    	CommanUtill.clickFunction(pathology_test_click, pathology_select);
    
		 if (CommanUtill.isElementPresent(pathology_sample_collection_drp_popup)) {
	  	        CommanUtill.dropdownSelectByVisibleText(pathology_sample_collection_drp_popup, sample_collection_drp);
	  	        System.out.println("collect Sample connection");
	  	    } else {
	  	        System.out.println("collect Sample connection not appear.");
	  	    }
	  	}

	/**
	 * 
	 */
	public void nursingActivityTypesPatient() {
		// TODO Auto-generated method stub
		 List<WebElement> patients = driver.findElements(By.xpath("//div[contains(@class,'patient-card')]"));
		 System.out.println("Total patient cards found: " + patients.size());
		 for (WebElement patient : patients) {
		     System.out.println("Patient card classes: " + patient.getAttribute("class"));
		 }
	}
	
	 public void selectOnOtherTestsNewOrders(String other_test_Radiobutton,String serach_other_test, String click_one_other_test, String sample_collection_drp)
			 throws IOException, InterruptedException{
		 
		 CommanUtill.clickFunction(other_test_radiobutton, other_test_Radiobutton);
		 CommanUtill.textEnter(other_test_serch_box, serach_other_test);
		 CommanUtill.clickFunction(other_test_click,  click_one_other_test);
		 
		 if(CommanUtill.isElementPresent(other_test_sample_collection_drp_popup)) {
			 CommanUtill.dropdownSelectByVisibleText(other_test_sample_collection_drp_popup, sample_collection_drp);
			 System.out.println("collect Sample connection");
		 }
		 else {
			 System.out.println("collect Sample connection Not Apper");
		 }
	 }
	 public void selectOnProfilesNewOrders(String profiles_radio,String profiles_text, String profile_test_name, String profile_sample_collection_drp)
			 throws IOException, InterruptedException{
		
		CommanUtill.clickFunction(profiles_radioButton, profiles_radio);
		CommanUtill.textEnter(profiles_serach_box, profiles_text);
		CommanUtill.clickFunction(profiles_test_click, profile_test_name);
		
		if(CommanUtill.isElementPresent(profiles_test_sample_collection_drp_popup)) {
			CommanUtill.dropdownSelectByVisibleText(profiles_test_sample_collection_drp_popup, profile_sample_collection_drp);
			System.out.println("Collect Profile sample collection save");
		}
		
		else {
			System.out.println("Collect Profile Sample Collection Not Apper ");
		}
		 
	 }
	 public void selectOnOrderSetNewOrders(String orderset_radio,String orderset_text, String order_set_test_name, String order_set_sample_collection_drp)
			 throws IOException, InterruptedException{
		
		CommanUtill.clickFunction(orderset_radiobutton, orderset_radio);
		CommanUtill.textEnter(order_set_serach_box, orderset_text);
		CommanUtill.clickFunction(order_set_test_click, order_set_test_name);
		
		if(CommanUtill.isElementPresent(order_set_select_sample_collection_popup)) {
			CommanUtill.dropdownSelectByVisibleText(order_set_select_sample_collection_popup, order_set_sample_collection_drp);
			System.out.println("Collect order_set sample collection save");
		}
		
		else {
			System.out.println("Collect order_set Sample Collection Not Apper ");
		}
		 
	 }
	 
	 public void SelectnewOrderDoctorPriorityDropdwon(String new_oder_doctor_name, String priority_drp )throws IOException, InterruptedException{
		 
		 CommanUtill.dropdownSelectByVisibleText(new_oder_doctor_drp, new_oder_doctor_name);
		 CommanUtill.dropdownSelectByVisibleText(new_order_priority, priority_drp);
		 
	 }
	 
	 public void saveOnInvestigationsNewOders(String save)throws IOException, InterruptedException{
		 
		 CommanUtill.clickFunction(investigations_new_ordes_save_icon, save);
	 }
	 
	 public void InvestigationInstructionCareProviderPopup (String remaks_care_porovider, String Save_care_provider_popup)throws IOException, InterruptedException{
		 
		 CommanUtill.textEnter(care_provider_remarks_popup, remaks_care_porovider);
		 CommanUtill.clickFunction(care_provider_save_popup, Save_care_provider_popup);
	 }
	 
	 public void yespermissibleTimeRangePopup(String permissible_Range_Popup)throws IOException, InterruptedException{
		 
		 if(CommanUtill.isElementPresent(permissible_time_range_yes_popup)) {
				CommanUtill.clickFunction(permissible_time_range_yes_popup, permissible_Range_Popup);
				System.out.println("permissible_Range_Popup save");
			}
			
			else {
				System.out.println("permissible_Range_Popup Not Apper ");
			}
	 }
	 
    }
    

