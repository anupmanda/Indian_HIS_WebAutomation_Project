/**
 * 
 */
package com.test.Pharmacy.Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
 * 10-Apr-2026
 */
public class Pharmacy_IpIssuePage extends GeneralBrowserSetting {

	protected static  String  Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static  String  Pharmacy_dashboard = "//li[@id='btn_Pharmacy']";
	protected static  String Pharmacy_Station_Drp = "//select[@id='Department']";
	protected static  String Pharmacy_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Pharmacy_Station_No_pop = "//a[@id='btn_no_desh']";

	//========================== Ip Issue ============================
	protected static  String Ip_Issue_Tab = "//a[@id='Iptype']";
	protected static  String Ip_Issue_Page = "//a[contains(text(),'IP Issue')][normalize-space()='IP Issue']";
	protected static  String Enter_Ip_Number = "//input[@id='txtIPIDER']";

	//========================Pending Order Table ===================================
	protected static  String Pending_Order_In_Table = "//table[@id='tblIpIssueDetail']//tbody//tr[contains(@style,'background-color:pink;')]";
	protected static  String Currently_locked_Yes_Pop  = "//a[@id='IsLockedbtnyes']";

	//========================== IP Issue Details =========================

	//protected static String Click_Ip_Issue_Details_Table = "//table[@id='tblOrderDeatails']//tbody//tr[not(contains(@style,'display: none'))][1]";
	protected static String Click_Ip_Issue_Details_Table =
			"(//table[@id='tblOrderDeatails']//tbody//tr[not(contains(@style,'display: none'))])[1]//td[@onclick]";
	protected static  String Remarks_Ip_Issue_Details  = "//textarea[@id='RemarksIPIssue']";
	protected static  String Save_Remarks_Ip_Issue_Details  = "//i[@id='saveRemarks']";
	protected static  String Save_Ip_Issue_Details  = "//a[@id='SaveDrugIssue']//i[@class='fa fa-save']";
	protected static  String Save_Ip_Issue_Details_Yes_Pop  = "//a[@id ='btn_ok_saveDrugOrderPopUp']";

	protected static  String Print_Yes_pop  = "//a[@id = 'btn_ok_printDrugOrderPopUp']";
	protected static  String Close_Generate_Barcode  = "//i[@id ='generateBarcodePopupClose']";
	
	
	
	

	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnPharmacyDashboard(String Pharmacy_dashbord , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Pharmacy_dashboard, Pharmacy_dashbord);
		CommanUtill.dropdownSelectByVisibleText(Pharmacy_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Pharmacy_Station_Yes_pop, Station_Yes_Pop);
	}
	public void ClickOnIpIsueMenuAndPage(String Ip_Issue , String Ip_Issue_P) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Ip_Issue_Tab, Ip_Issue);
		CommanUtill.clickFunction(Ip_Issue_Page, Ip_Issue_P);
	}
	public void EnterErNumber(String ErNumber) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Ip_Number)));
		WebElement Er = driver.findElement(By.xpath(Enter_Ip_Number));

		CommanUtill.textEnter(Enter_Ip_Number, ErNumber);
		Er.sendKeys(Keys.ENTER);
	}
	public void ClickOnPendingOrderInTable(String Table) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Pending_Order_In_Table)));
		String Drug_Row = driver.findElement(By.xpath(Pending_Order_In_Table)).getText();
		System.out.println("========== Select Ip Pending Drug Order In Table ==========");
		logger.info("================= Select Ip Pending Drug Order In Table ====================");
		logger.info(Drug_Row);
		System.out.println("Show Pending Drug Order In Pharmacy : " + Drug_Row);
		CommanUtill.clickFunction(Pending_Order_In_Table, Table);
	}
	
	public void ThisOrderIsCurrentlylockedYesPop(String Yes_Pop) throws IOException, InterruptedException {

	    logger.info("================= Handle Currently Locked Popup ====================");

	    List<WebElement> elements = driver.findElements(By.xpath(Currently_locked_Yes_Pop));
	    if (elements.size() > 0) {
	        WebElement yesBtn = elements.get(0);
	        if (yesBtn.isDisplayed()) {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", yesBtn);
	            System.out.println("Pop Appeared - Clicked YES");
	            logger.info("Pop Appeared - Clicked YES");
	        }

	    } else {
	        System.out.println("Popup NOT Appeared - Continue Execution");
	        logger.info("Popup NOT Appeared - Continue Execution");
	    }
	}
	public void ClickOnIpIssueDetailsFirstRowTable1(String Table) throws IOException, InterruptedException {

	    logger.info("================= Select First Row Ip Issue Details Drug Table ====================");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    By rowLocator = By.xpath(Click_Ip_Issue_Details_Table);

	    // Wait for fresh element (VERY IMPORTANT for dynamic table)
	    WebElement row = wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(rowLocator)));

	    wait.until(ExpectedConditions.visibilityOf(row));
	    // Scroll (IMPORTANT)
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", row);
	    Thread.sleep(500);
	    // Get Text
	    String drugRow = row.getText();
	    System.out.println("========== Select First Row Ip Issue Details Drug Table ==========");
	    System.out.println("Drugs Name In Ip Issue Details Table : " + drugRow);
	    logger.info(drugRow);

	    // Click using your framework
	    try {
	        CommanUtill.clickFunction(Click_Ip_Issue_Details_Table, Table);
	    } catch (Exception e) {
	        // Fallback JS click (IMPORTANT for your UI)
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", row);
	    }
	}
	
	public void ClickOnIpIssueDetailsFirstRowTable(String Table) throws IOException, InterruptedException {

	    logger.info("================= Select First Row Ip Issue Details Drug Table ====================");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    By cellLocator = By.xpath(Click_Ip_Issue_Details_Table);
	    WebElement cell = wait.until(ExpectedConditions.presenceOfElementLocated(cellLocator));
	    wait.until(ExpectedConditions.visibilityOf(cell));

	    // Scroll center
	    ((JavascriptExecutor) driver).executeScript(
	        "arguments[0].scrollIntoView({block:'center'});", cell);

	    Thread.sleep(500);

	    // DIRECT JS CLICK (BEST for this UI)
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cell);
	    System.out.println("Clicked on TD (actual event trigger)");
	}
	
	public void EnterRemarksIpIssueDetals(String Remarks , String Save_Btn) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Remarks_Ip_Issue_Details)));
		CommanUtill.textEnter(Remarks_Ip_Issue_Details, Remarks);
		Thread.sleep(800);
		CommanUtill.clickFunction(Save_Remarks_Ip_Issue_Details, Save_Btn);
	}
	public void SaveIpIssueDetalsBtn(String Save_Btn , String Yes_pop) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Save_Ip_Issue_Details)));
		CommanUtill.clickFunction(Save_Ip_Issue_Details, Save_Btn);
		Thread.sleep(500);
		CommanUtill.clickFunction(Save_Ip_Issue_Details_Yes_Pop, Yes_pop);
	}
	
	public void IpIssueDetailsPrintYesPop(String Print_Yes_Pop) throws IOException , InterruptedException {

		if(CommanUtill.isElementPresent(Print_Yes_pop)) {
			CommanUtill.clickFunction(Print_Yes_pop, Print_Yes_Pop);
			System.out.println("Pop Appered currently locked Yes Pop");
		}
		else {
			System.out.println("Did Not Appered currently locked Yes Pop");
		}
	}
	public void CloseGenerateBarcodPop(String Close_Pop) throws IOException , InterruptedException {

		if(CommanUtill.isElementPresent(Close_Generate_Barcode)) {
			CommanUtill.clickFunction(Close_Generate_Barcode, Close_Pop);
			System.out.println("Pop Appered Close Bar Code Yes Pop");
		}
		else {
			System.out.println("Did Not Appered Bar Code Pop");
		}
	}


}
