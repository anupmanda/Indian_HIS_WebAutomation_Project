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
 * 17-Apr-2026
 */
public class Er_IssuedDrugAcknowledgementPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String IssuedDrugAcknowledgement_Btn = "//a[normalize-space()='Issued Drug Acknowledgement']";

	//========================== Issued Drug Acknowledgement =================================
	protected static String Station_Drp = "//select[@id='cmbStationId']";
	protected static String Show_Acknowledged_Order_Check_Box = "//input[@id='chkShowAckOrder']";
	protected static String Barcode_Issue_No = "//input[@id='txtBarcodeIssueNo']";
	protected static String Er_Number = "//input[@id='txtipno']";
	protected static String From_Date = "//input[@id='txtFromDate']";
	protected static String To_Date = "//input[@id='txtToDate']";
	protected static String Search_Icon = "//i[@id='btnSearchIDrgAck']";
	
	//========================= Table =========================
	protected static String Issued_Drug_Acknowledgement_Table = "(//table[@id='tblIssuedDrugAck']//tr[@ctypestatus='0'])[last()]";
	protected static String Issued_Drug_Acknowledgement_Check_Box_Table = "(//table[@id='tblIssuedDrugAck']//tr[@ctypestatus='0']//input[@type='checkbox'])[last()]";
	protected static String  Acknowledge_Orde_Yes_Pop = "//a[@id = 'issueDrgAckYes']";
	
	protected static String  Close_Quenty_Pop = "//a[@id ='issuedDrugAckPopupClose']";

	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void ErOrderRaiseIssuedDrugAcknowledgementBtn (String Er_Order, String IssuedDrugAcknowledgement) 
			throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, Er_Order);
		CommanUtill.clickFunction(IssuedDrugAcknowledgement_Btn, IssuedDrugAcknowledgement);
	}
	public void SelectSationDrp(String Sation)  throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Station_Drp, Sation);
	}
	public void CheckBoxShowAcknowledgedOrder(String Check_box) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Show_Acknowledged_Order_Check_Box)));
		CommanUtill.clickFunction(Show_Acknowledged_Order_Check_Box, Check_box);
	}
	public void EnterBarcodeIssueDNumber(String Barcode) throws IOException, InterruptedException { 

		WebElement Bar_Code = driver.findElement(By.xpath(Barcode_Issue_No));
		CommanUtill.textEnter(Barcode_Issue_No, Barcode);
		Bar_Code.sendKeys(Keys.ENTER);
	}
	public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(Er_Number));
		CommanUtill.textEnter(Er_Number, er_enter);
		er.sendKeys(Keys.ENTER);
	}
	public void FromDateSerach(String FromDate) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(From_Date, FromDate);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String toDate) throws IOException ,InterruptedException {

		WebElement ToDate = driver.findElement(By.xpath(To_Date));
		ToDate.sendKeys(Keys.CONTROL +"a");
		ToDate.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(To_Date, toDate);
		ToDate.sendKeys(Keys.TAB);
	}
	public void SearchIssuedDrugIcon(String Search) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Icon)));
		CommanUtill.dropdownSelectByVisibleText(Search_Icon, Search);
	}
	//========================= Table =========================
	public void IssuedDrugAcknowledgementTable(String table_Drug) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Issued_Drug_Acknowledgement_Table)));
		String Drug_Row = driver.findElement(By.xpath(Issued_Drug_Acknowledgement_Table)).getText();
		System.out.println("==========Check Box Issued Drug Acknowledgement Table ==========");
		logger.info("================== Check Box Issued Drug Acknowledgement Table ====================");
		logger.info(Drug_Row);
		System.out.println("Check Select Issued Drug Acknowledgement Table : " + Drug_Row);
		CommanUtill.clickFunction(Issued_Drug_Acknowledgement_Check_Box_Table, table_Drug);
	}
	public void ClickOnAcknowledgeOrdeYesPop(String YesPop) throws IOException , InterruptedException {
		
		if(CommanUtill.isElementPresent(Acknowledge_Orde_Yes_Pop)) {
			CommanUtill.clickFunction(Acknowledge_Orde_Yes_Pop, YesPop);
			System.out.println("Appared Acknowledge Orde Yes Pop");
		}
		else {
		System.out.println("Did Not Appared Acknowledge Orde Yes Pop");
		}
	}
	//========================= Check Issued Quantity ===========================

	public void CheckRentyIssuedDrugAcknowledgementTable(String table_Drug) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Issued_Drug_Acknowledgement_Table)));
		String Drug_Row = driver.findElement(By.xpath(Issued_Drug_Acknowledgement_Table)).getText();
		System.out.println("==========Check Drug Quenty  ==========");
		logger.info("================== Check Drug Quenty  ====================");
		logger.info(Drug_Row);
		System.out.println("Check Drug Quenty  : " + Drug_Row);
		CommanUtill.clickFunction(Issued_Drug_Acknowledgement_Table, table_Drug);
	}
	public void closeCheckDrugQunetyPop(String Close) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Close_Quenty_Pop)));
		CommanUtill.clickFunction(Close_Quenty_Pop, Close);
	}
	 
}
