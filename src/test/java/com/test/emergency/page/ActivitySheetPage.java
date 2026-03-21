/**
 * 
 */
package com.test.emergency.page;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 19-Mar-2026
 */
public class ActivitySheetPage extends GeneralBrowserSetting {
	
	protected static String facility = "//select[@id='Facility']";
	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String emergency_side_button = "//span[normalize-space()='ER Registration']";
	protected static String Activity_Sheet = "//a[normalize-space()='Activity Sheet']";
	
	protected static String Enter_UHID = "//input[@id='txtuhid']";
	protected static String Enter_Er_No = "//input[@id='txterno']";
	protected static String From_Date = "//input[@id='txtfrmdateactivity']";
	protected static String To_Date = "//input[@id='txtodateact']";
	protected static String Service_Name  = "//select[@id='ddlServiceName']";
	protected static String Search_Patient = "//a[@id='btnPrintActivitySheet']//i[@class='fa fa-search']";
	
	
	
	
	
	
	
	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}

	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}

	public void clickOnActivitySheetPage(String emergency_btn, String Activity_page ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(emergency_side_button, emergency_btn);
		CommanUtill.clickFunction(Activity_Sheet, Activity_page);
	}
	
	public void EnterUHID(String uhid_enter) throws IOException, InterruptedException { 
		
		WebElement uhid = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, uhid_enter);
		uhid.sendKeys(Keys.ENTER);
	}
    public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 
		
		WebElement er = driver.findElement(By.xpath(Enter_Er_No));
		CommanUtill.textEnter(Enter_Er_No, er_enter);
		er.sendKeys(Keys.ENTER);
	}
    public void EnterFromeAndToDate(String From , String To) throws IOException, InterruptedException { 
    	
    	WebElement fromdate = driver.findElement(By.xpath(From_Date));
    	fromdate.sendKeys(Keys.CONTROL + "a");
    	fromdate.sendKeys(Keys.DELETE);
    	CommanUtill.textEnter(From_Date, From);
    	fromdate.sendKeys(Keys.TAB);
    	
    	WebElement todate = driver.findElement(By.xpath(To_Date));
    	todate.sendKeys(Keys.CONTROL + "a");
    	todate.sendKeys(Keys.DELETE);
    	CommanUtill.textEnter(To_Date, To);
    	todate.sendKeys(Keys.TAB);
    }
    public void selectByServiceNameDrp(String Service_Drp) throws IOException, InterruptedException { 
    	
    	WebDriverWait Service = new WebDriverWait(driver, Duration.ofSeconds(10));
    	Service.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Service_Name)));
    	CommanUtill.dropdownSelectByVisibleText(Service_Name, Service_Drp);
    }
    
   public void SearchActivitySheetBtn(String search_icon) throws IOException, InterruptedException { 
    	
    	WebDriverWait Service = new WebDriverWait(driver, Duration.ofSeconds(10));
    	Service.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Patient)));
    	CommanUtill.clickFunction(Search_Patient, search_icon);
    }
    
	
	
	

}
