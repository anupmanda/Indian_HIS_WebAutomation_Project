/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 31-Mar-2026
 */
public class ERDischargeNotificationPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Er_Billing_dashboard = "//li[@id='btn_Emergency']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	//=========================== Discharge Notification Emergency================================
	protected static  String Er_Billing_Meanu = "//span[normalize-space()='ER Billing']";
	protected static  String Discharged_Page = "//a[normalize-space()='ER Discharge Notification']";
	protected static  String Menu_Icon = "//a[@id='showmenu']";

	//================================ White Row X Path =====================================
	protected String whiteRowXpath_Yes_pop = "//a[@id='btnok']";
	protected String Bill_Ready_Yes_pop = "//a[@id='btnok2']";
	//================================ Cancel Discharged  =====================================
	protected String Canel_Discharge_No_pop = "//a[contains(@id,'btnno2')]";
	protected String Canel_Discharge_Remarks_pop = "//textarea[@id='txtRemarks']";
	protected String Canel_Discharge_Remarks_Yes_pop = "//a[@id='YesClearance']";

	//================================ Funcility Check  =====================================
	protected String Discharge_Notification_Radio_Btn = "//input[@id='Discharge']";
	protected String Ward_Drp = "//select[@id='wards']";
	protected String Status_Drp = "//select[@id='stausacknowledge']";
	protected String Check_Box_Range_Date = "//input[@id='chkDateRange']";
	protected String From_Date = "//input[@id='DateTimebox1']";
	protected String To_Date = "//input[@id='DateTimebox2']";
	protected String Search_Icon = "//a[@id='searchdata1']//i[@class='fa fa-search']";
	protected String Patient_Type_Drp = "//select[@id='_ddlSearchType']";
	protected String Enter_Patient_Text = "//input[@id='_txtSearchType']";
	protected String Search_Patient = "//i[@id='_btnSearchType']";
	protected String Click_Excel_Print = "//a[@id='btnExcel']//i[@class='fa fa-file-excel-o']";







	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}
	public void ClickOnErBillingDashboard(String Er_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Er_Billing_dashboard, Er_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void ErDischargedNotificationPage(String Er_Billing_Tab , String TOC_Approvel) 	
			throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Er_Billing_Meanu)));
		CommanUtill.clickFunction(Er_Billing_Meanu, Er_Billing_Tab);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Discharged_Page)));
		CommanUtill.clickFunction(Discharged_Page, TOC_Approvel);
	}
	//============================Discharge Notification Page ====================================
	public String clickFirstWhiteRowAndPrintDetails(String White_Row) throws IOException, InterruptedException {

		String whiteRowXpath = "//table[@id='tbl1']/tbody/tr[contains(@style,'background:white')][last()]";
		//table[@id='tbl1']/tbody/tr[contains(@style,'background:white')]  All White Row
		//table[@id='tbl1']/tbody/tr[contains(@style,'background:white')][last()] 
		//table[@id='tbl1']/tbody/tr[contains(@style,'background:white')][1]

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement whiteRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(whiteRowXpath)));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", whiteRow);
		Thread.sleep(800);

		// YELLOW HIGHLIGHT (ONLY ADDITION)
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px solid red';" + "arguments[0].style.backgroundColor="
				+ "'yellow';",whiteRow);
		Thread.sleep(500);

		String sNo = whiteRow.findElement(By.xpath("./td[1]")).getText();
		String Patient_Name = whiteRow.findElement(By.xpath("./td[4]")).getText();
		String Ip_No = whiteRow.findElement(By.xpath("./td[3]")).getText();
		String bed = whiteRow.findElement(By.xpath("./td[7]")).getText();

		System.out.println("S.No : " + sNo);
		System.out.println("Patient Name : " + Patient_Name);
		System.out.println("Ip Number : " + Ip_No);
		System.out.println("Bed : " + bed);

		// click first time
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", whiteRow);

		return sNo;   // VERY IMPORTANT
	}
	public void YesAcknowledgedPop(String Discharge_notification_acknowledged_Yes )throws IOException , InterruptedException {

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(whiteRowXpath_Yes_pop)));
		CommanUtill.clickFunction(whiteRowXpath_Yes_pop, Discharge_notification_acknowledged_Yes);
	}
	public void clickSameRowAgainAfterColorChange(String sNo) throws IOException, InterruptedException {

		String sameRowXpath = "//table[@id='tbl1']//tr[td[normalize-space()='" + sNo + "']]";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.xpath(sameRowXpath),"style", "background:white")));

		CommanUtill.clickFunction(sameRowXpath,"Row " + sNo + " After Color Change");
	}
	public void Yes_Pop_DischargeNotificationAcknowledgementBill(String Yes_pop_Billing) throws IOException, InterruptedException {

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Bill_Ready_Yes_pop)));
		CommanUtill.clickFunction(Bill_Ready_Yes_pop, Yes_pop_Billing);
	}

	//============================= menu Icon================================

	public void clickOnMenuIcon(String Menu_Btn) throws IOException, InterruptedException {

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Menu_Icon)));
		CommanUtill.clickFunction(Menu_Icon, Menu_Btn);
	}
	//=============================Navy Blue Row======================================
	public void clickTopNavyBlueRowAndPrintDetails(String navyBlueRowName) throws IOException, InterruptedException {

		String navyBlueRowXpath = "(//table[@id='tbl1']/tbody/tr[contains(@style,'#c0f6ff')])[last()]";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement navyBlueRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(navyBlueRowXpath)));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll row to center
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", navyBlueRow);
		Thread.sleep(500);

		// YELLOW HIGHLIGHT (before click)
		js.executeScript("arguments[0].style.border='2px solid red';" + "arguments[0].style.backgroundColor='yellow';", navyBlueRow);
		Thread.sleep(500);

		// Fetch values
		String sNo = navyBlueRow.findElement(By.xpath("./td[1]")).getText().trim();
		String ipNo = navyBlueRow.findElement(By.xpath("./td[3]")).getText().trim();
		String patientName = navyBlueRow.findElement(By.xpath("./td[4]")).getText().trim();
		String bed = navyBlueRow.findElement(By.xpath("./td[7]")).getText().trim();

		System.out.println("S.No : " + sNo);
		System.out.println("IP No : " + ipNo);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Bed : " + bed);

		// JS CLICK (sticky header safe)
		js.executeScript("arguments[0].click();", navyBlueRow);

		System.out.println("Top navy blue row clicked successfully");
	}
	public void CancelDischargeDNotificationAcknowledgementPop(String No_pop , String Remarks , String Remarks_Yes_pop)
			throws IOException ,InvalidApplicationException, InterruptedException{

		CommanUtill.clickFunction(Canel_Discharge_No_pop, No_pop);
		CommanUtill.textEnter(Canel_Discharge_Remarks_pop, Remarks);
		CommanUtill.clickFunction(Canel_Discharge_Remarks_Yes_pop, Remarks_Yes_pop);
	}

	//============================== Check Funcility =================================
	
	public void RadioBtnDischargedNotification(String Radio_Btn) throws IOException, InterruptedException {
		
		WebElement Dis_Radio_Btn = driver.findElement(By.xpath(Discharge_Notification_Radio_Btn));
		if(! Dis_Radio_Btn.isSelected())
		CommanUtill.clickFunction(Discharge_Notification_Radio_Btn, Radio_Btn);
	}
	public void SelectByWardAndStatusDrp(String Ward , String Status) throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Ward_Drp, Ward);
		Thread.sleep(1500);
		CommanUtill.dropdownSelectByVisibleText(Status_Drp, Status);
	}
	public void RangeDateCheckBoxAndFromDate(String Check_Box, String FromDate)  throws IOException, InterruptedException {

	    WebElement dateRange = driver.findElement(By.xpath(Check_Box_Range_Date));
	    if (!dateRange.isSelected()) {
	        CommanUtill.clickFunction(Check_Box_Range_Date, Check_Box);
	    }
	    WebElement fromDateField = driver.findElement(By.xpath(From_Date));
	    fromDateField.sendKeys(Keys.CONTROL + "a");
	    fromDateField.sendKeys(Keys.DELETE);

	    CommanUtill.textEnter(From_Date, FromDate);
	    fromDateField.sendKeys(Keys.TAB);
	}
	public void EnterToDate( String ToDate) throws IOException, InterruptedException {

	    WebElement ToDateField = driver.findElement(By.xpath(To_Date));
	    ToDateField.sendKeys(Keys.CONTROL + "a");
	    ToDateField.sendKeys(Keys.DELETE);

	    CommanUtill.textEnter(To_Date, ToDate);
	    ToDateField.sendKeys(Keys.TAB);
	}
	public void SerachDateWisePatient(String Search_Btn) throws IOException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Search_Icon)));
		CommanUtill.clickFunction(Search_Icon, Search_Btn);
	}
	public void SelectPatientTypeDrpAndEnterValueSerach(String Patient_Drp , String Enter_Value , String Search )
			throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Patient_Type_Drp, Patient_Drp);
		CommanUtill.textEnter(Enter_Patient_Text, Enter_Value);
		CommanUtill.clickFunction(Search_Patient, Search);
	}
	public void clickOnExcelSheetIcon(String Excel_Icon) throws IOException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Click_Excel_Print)));
		CommanUtill.clickFunction(Click_Excel_Print, Excel_Icon);
	}

}
