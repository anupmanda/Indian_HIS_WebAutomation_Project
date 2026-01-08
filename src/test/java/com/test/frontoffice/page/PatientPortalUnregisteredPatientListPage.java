/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 25-Dec-2025
 */
public class PatientPortalUnregisteredPatientListPage extends GeneralBrowserSetting {
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String unregister_list_page = "//a[normalize-space()='Patient Portal Unregistered Patient List']";
	
	protected static String from_date = "//input[@id='dtpfrom']";
	protected static String to_date = "//input[@id='dtpto']";
	protected static String serach_patient = "//a[@id='btnaddrow']//i[@class='fa fa-search']";
	protected static String chkk_box_show_completed = "//input[@id='chkshow']";
	protected static String reresh_page = "//a[@id='btnclearwork']//i[@class='fa fa-refresh']";
	
	protected static String click_unregister_list_patient = "//div[@class='patient_portal_unregistered_patient_list_table ApproveData mt10']//table//tr[1]//i";
	
	
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void clickOnPortalUnregisterPatientListPage(String add_patient , String UnRegister_List ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
		CommanUtill.clickFunction(unregister_list_page, UnRegister_List);
	
	}
	
	 public void fromAndToDate(String From_Date, String To_Date) throws IOException, InterruptedException {

 	    // FROM DATE
 	    WebElement fromDate = driver.findElement(By.xpath(from_date));
 	    ((JavascriptExecutor) driver).executeScript("arguments[0].value='';", fromDate);
 	    fromDate.sendKeys(From_Date);
 	    fromDate.sendKeys(Keys.TAB);
         Thread.sleep(1000);
 	    
 	    // TO DATE
 	    WebElement toDate = driver.findElement(By.xpath(to_date));
 	    ((JavascriptExecutor) driver).executeScript("arguments[0].value='';", toDate);
 	    toDate.sendKeys(To_Date);
 	    toDate.sendKeys(Keys.TAB);
 	} 
	 
	 public void serachUnregisterPatientList(String Serach_Icon) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(serach_patient, Serach_Icon);
		 
	 }
	 
	 public void CheckBoxShowCompleted(String Show_Completed) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(chkk_box_show_completed, Show_Completed);
	 }
   public void RefreshPageIcon(String refresh_Page) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(reresh_page, refresh_Page);
	 }
   
   public void clickOnTableUnregisterPatentList(String click_unregister_patient) throws IOException, InterruptedException {
		 
		 CommanUtill.clickTabSwitchToAnotherWindow(click_unregister_list_patient, click_unregister_patient);	 
  
   }
}
