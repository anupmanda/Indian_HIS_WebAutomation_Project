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
 * 20-Mar-2026
 */
public class ErCreditLimitPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";
	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String emergency_side_button = "//span[normalize-space()='ER Registration']";
	protected static String Er_Credit_Limit = "//a[normalize-space()='Credit Limit']";
	protected static String Enter_UHID = "//input[@id='uHid']";
	protected static String Enter_Er_No = "//input[@id='ErNo']";
	protected static String Search_Patint = "//a[@id='search_huiddata1']//i[@class='fa fa-search']";
	protected static String Existing_Credit_Limit = "//input[@id='txtexcreditlimit']";
	protected static String New_Credit_Limit = "//input[@id='txtexNewcreditlimit']";
	protected static String Save_Btn = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected static String Save_Yes_Pop = "//a[@id ='btn_ok_savePopUp']";
	
	
	

	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}

	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void ErCreditLimit(String emergency_btn, String Credit_Limit ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(emergency_side_button, emergency_btn);
		CommanUtill.clickFunction(Er_Credit_Limit, Credit_Limit);
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
	public void searchCompanyPatent(String Search_Icon) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Patint)));
		CommanUtill.clickFunction(Search_Patint, Search_Icon);
	}
	public void ExistingCreditLimit(String Current_Credit_Limit) throws IOException, InterruptedException { 
		
		WebElement print = driver.findElement(By.xpath(Current_Credit_Limit));
		logger.info("==========Existing Credit Limit===================");
		logger.info(print.getText());
		System.out.println(print.getText());
	}

	public void enterNewCreditLimit(String credit_Limit) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(New_Credit_Limit)));
		CommanUtill.textEnter(New_Credit_Limit, credit_Limit);
	}

	public void SaveNewCreditLimitBtn(String save , String yes_pop) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Patint)));
		CommanUtill.clickFunction(Save_Btn, save);
		
		if(CommanUtill.isElementPresent(Save_Yes_Pop)) {
		CommanUtill.clickFunction(Save_Yes_Pop, yes_pop);
		System.out.println("Click On Yes Pop After Save Btn");
		}
		else {
			System.out.println("Did Not Apperas Yes Pop After Save Btn");
		}
	}




}
