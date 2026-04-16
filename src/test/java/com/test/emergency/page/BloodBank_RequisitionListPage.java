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
 * 16-Apr-2026
 */
public class BloodBank_RequisitionListPage extends GeneralBrowserSetting {


	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Blood_Bank_Tab = "//a[normalize-space()='Blood Bank']";
	protected static String Blood_Bank_Requisition_List = "//a[normalize-space()='New Request List']";
	//=========================== Patient Search ============================
	protected static String Search_From_Date = "//input[@id='frmdatenewreqlist']";
	protected static String Search_To_Date = "//input[@id='todatenewreqlist']";
	protected static String Search_UHID = "//input[@id='txtuhidnewreqlist']";
	protected static String Search_Ip_No = "//input[@id='txtipnumnewreqlist']";
	protected static String Search_Status_Drp = "//select[@id='ddlstatusnewreqlist']";
	protected static String Search_Ward_Name_Drp = "//select[@id='ddlwrdnamenewreqlist']";
	protected static String All_Search_Btn = "//img[@src='/sanitywebhistree/images/action_Newbtn/search_broken.svg']";


	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void ErOrderRaiseBloodBankMenuBtn (String Er_Order, String BloodBank) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, Er_Order);
		CommanUtill.clickFunction(Blood_Bank_Tab, BloodBank);
	}
	public void RequisitionListNewWindow (String Requisition_List) throws IOException, InterruptedException { 

		CommanUtill.clickTabSwitchToAnotherWindowNew(Blood_Bank_Requisition_List, Requisition_List);
	}

	//=========================== Patient Search ============================
	public void FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Search_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Search_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Search_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Search_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void SearchUHIDNumber(String uhid) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Search_UHID, uhid);
	}
	public void SearchErNumber(String Er_No) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Search_Ip_No, Er_No);
	}
	public void SelectByStatusDrp(int Status) throws IOException ,InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Search_Status_Drp)));
		CommanUtill.dropdownSelectByIndex(Search_Status_Drp, Status);
	}
	public void SelectByWardDrp(String  Ward_Drp) throws IOException ,InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Search_Ward_Name_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Search_Ward_Name_Drp, Ward_Drp);
	}
	public void SearchRequisitionListBtn(String Search_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(All_Search_Btn)));
		CommanUtill.clickFunction(All_Search_Btn, Search_Icon);
	}




}
