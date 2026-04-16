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
 * 15-Apr-2026
 */
public class Er_CancelEmergencyIssuePage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	//=========================== Er Lab Report ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_CancelEmergencyIssue_page = "//a[normalize-space()='Cancel Emergency Issue']";
	protected static String Enter_Er_No = "//input[@id='txtcanemerno']";
	protected static String Issue_Station = "//input[@id='txtcanissuedsta']";  // Auto Read
	protected static String Against_Order_Drp = "//select[@id='ddlagainstorder']";
	protected static String Consumption_Issue_Station_Yes_Pop = "//a[@id='btnstationdrug']";
	protected static String Bar_Code_Text = "//input[@id='txtbarcode']";
	
	//===================== Sub Table ===========================
	protected static String Retun_Drug_Name = "//table[@id='tblcancelemr']//tbody//tr[position()=1]";
	protected static String Return_Qty_Text = "//table[@id='tblcancelemr']//tbody//tr[position()=1]/td[9]/input";
	protected static String Return_Slect_Check_Box = "//table[@id='tblcancelemr']//tbody//tr[position()=1]/td[1]/input";
	protected static String Save_Btn = "//a[@id='btnSaveCancelER']";
	protected static String Save_Btn_Yes_Pop = "//a[@id='btn_ok_savePopUpp']";
	protected static String Cancel_Popup_Text = "//label[@id='popup_txt_station']";



	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEmercencyCancelEmergencyIssuePage(String emergency_btn, String CancelEmergencyIssue ) 
			throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, emergency_btn);
		CommanUtill.clickFunction(Er_CancelEmergencyIssue_page, CancelEmergencyIssue);
	}
	public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(Enter_Er_No));
		CommanUtill.textEnter(Enter_Er_No, er_enter);
		er.sendKeys(Keys.ENTER);
	}
	public void SelectByAgainstOrderDrp(int AgainstOrder) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByIndex(Against_Order_Drp, AgainstOrder);
	}
	public void BarCodeText(String BarCode) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Bar_Code_Text, BarCode);
	}

	public void ConsumptionIssueStationOkPop(String Ok_Pop) throws IOException, InterruptedException { 

		if(CommanUtill.isElementPresent(Consumption_Issue_Station_Yes_Pop)) {
			CommanUtill.clickFunction(Consumption_Issue_Station_Yes_Pop, Ok_Pop);
			System.out.println("Pop Appread Ok Consumption Issue station");
		}
		else {
			System.out.println("Did Not Appread Ok Consumption Issue station Pop");
		}
	}
	public void RetunDrugsInTableAndQuenty( String Check_Box , String table_Drug ) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Retun_Drug_Name)));
		String Retun_Row = driver.findElement(By.xpath(Retun_Drug_Name)).getText();
		
		System.out.println("========== Select Drug Retun In Table ==========");
		logger.info("==================  Select Drug Retun In Table ====================");
		logger.info(Retun_Row);
		System.out.println("Retun Drug Quenty Table : " + Retun_Row);
		CommanUtill.clickFunction(Return_Slect_Check_Box, Check_Box);
		CommanUtill.textEnter(Return_Qty_Text, table_Drug);
		
	}
	public void ClickOnSaveButton(String Save , String Yes_Pop) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Save_Btn, Save);
		if(CommanUtill.isElementPresent(Save_Btn_Yes_Pop)) {
			CommanUtill.clickFunction(Save_Btn_Yes_Pop, Yes_Pop);
			System.out.println("Save Cancel Drug Yes Pop");
		}
		else {
			System.out.println("Did Not Apprared Save Cancel Yes Pop");
		}
	}
	
	public void printCancelPopupMessage() throws IOException, InterruptedException {

	    logger.info("==================== Cancel Popup Message ====================");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement popupTextElement = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(By.xpath(Cancel_Popup_Text)));
	    
	    String popupText = popupTextElement.getText().trim();
	    System.out.println("Popup Message: " + popupText);
	    logger.info(" Cancel Popup Message: " + popupText);
	}
	



}
