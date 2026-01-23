/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 22-Jan-2026
 */
public class FO_PatientQueuePage extends GeneralBrowserSetting {
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String Click_yes_popup = "//*[@id=\"btn_yes_desh\"]";
	
	//========================Patient Queue ============================
	protected static String patient_queue_meanu = "//span[normalize-space()='Patient Queue']";
	protected static String patient_queue_page = "//a[contains(text(),'Patient Queue')]";
	
	protected static String patient_queue_Date = "//input[@id='todate']";
	protected static String patient_queue_Specility_Check_box = "//ul[@class='test_list']//input[@type='checkbox']";

	protected static String patient_queue_Specility = "//select[@id='DocSpeciality']";
	protected static String patient_queue_Doctor_check_box = "//ul[@class='tests_list1']//input[@type='checkbox']";
	
	protected static String patient_queue_Serach = "//a[@id='search_data']//i[@class='fa fa-search']";
	protected static String patient_queue_leged_key = "//a[@id='legend']//i[@class='fa fa-key']";
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup)
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(Click_yes_popup, Yes_popup);	
	}
	
	public void PatientQueuePage(String patient_queue_tab , String patient_queue) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(patient_queue_meanu, patient_queue_tab);
		CommanUtill.clickFunction(patient_queue_page, patient_queue);
	}
	
	public void SerachDatePatientQueue(String date) throws IOException, InterruptedException {
		
		WebElement Date = driver.findElement(By.xpath(patient_queue_Date));
		Date.sendKeys(Keys.COMMAND +"a");
		Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(patient_queue_Date, date);
		Date.sendKeys(Keys.TAB);
	}
	
	public void clickAllSpecialityCheckBoxes(String All_checkBox) throws IOException, InterruptedException {

	    List<WebElement> specialityCheckboxes =  driver.findElements(By.xpath(patient_queue_Specility_Check_box));

	    for (WebElement checkbox : specialityCheckboxes) {

	        if (!checkbox.isSelected()) {
	            checkbox.click();
	            Thread.sleep(300); // UI stability
	        }
	    }

	    System.out.println("All Speciality checkboxes clicked successfully");
	}

    public void SelectBySpecilityDrp(String Specility_Drp) throws IOException, InterruptedException {
    	
    	CommanUtill.dropdownSelectByVisibleText(patient_queue_Specility, Specility_Drp);
    }
    
    public void ClickAllDoctorCheckBox(String Doctor_chk) throws IOException , InterruptedException {
    	
    	List<WebElement> Doctor_chkk = driver.findElements(By.xpath(patient_queue_Doctor_check_box));
    	
    	for(WebElement CheckBox : Doctor_chkk) {
    		
    		if(!CheckBox.isSelected()) {
    			CheckBox.click();
    			Thread.sleep(300);
    		}
    	}
    	System.out.println("All Doctor checkboxes clicked successfully");	
    }

    public void SerachPatientQueueAndCheckLegendsKeys(String serach_icon , String Legends_keys) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(patient_queue_Serach, serach_icon);
		Thread.sleep(2000);
		CommanUtill.clickFunction(patient_queue_leged_key, Legends_keys);
	}
}
