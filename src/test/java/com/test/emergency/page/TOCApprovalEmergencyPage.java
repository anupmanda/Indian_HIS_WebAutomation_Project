/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.management.InvalidApplicationException;
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
 * 30-Mar-2026
 */
public class TOCApprovalEmergencyPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Er_Billing_dashboard = "//li[@id='btn_Emergency']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";
	//=========================== TOC Approvel Emergency_page ================================
	protected static  String Er_Billing_Meanu = "//span[normalize-space()='ER Billing']";
	protected static  String TOC_Approvel_Page = "//a[normalize-space()='TOC Approval Emergency']";
	//==============================Save TOC =============================
	protected static  String Enter_UHID = "//input[@id='_UHID']";
	protected static  String Enter_IP_No = "//input[@id='_IPNO']";
	protected static  String Check_Box_All = "//input[@id='selectallcheckbox']";
	protected static  String TOC_Pending_patient = "//table[@id='TblTocApproval']//tbody//tr";
	protected static  String First_Check_Box_TOC_Approvel = "//table[@id='TblTocApproval']//tbody//tr[1]//input[@class ='checkbox']";
	protected static  String Save_Btn = "//a[@id='BtnSave']//i[@class='fa fa-save']";
	protected static  String sufficient_Deposit_Yes_pop = "//a[@id='ApprovalYes']";

	//==============================Check TOC Approval Date Wise =============================
	protected static  String TOC_From_Date = "//input[@id='txtFromDate']";
	protected static  String TOC_To_Date = "//input[@id='txtToDate']";
	protected static  String Check_Box_Approved_Orders = "//input[@id='chkApprovedOrders']";
	



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

	public void TOCApprovelEmergencyPage(String Er_Billing_Tab , String TOC_Approvel) 	
			throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Er_Billing_Meanu)));
		CommanUtill.clickFunction(Er_Billing_Meanu, Er_Billing_Tab);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( TOC_Approvel_Page)));
		CommanUtill.clickFunction(TOC_Approvel_Page, TOC_Approvel);
	}
	//=========================== Toc Approval Save ====================================
	public void EnterUHID(String uhid) throws IOException ,InterruptedException {

		WebElement uhid_enter = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, uhid);
		uhid_enter.sendKeys(Keys.ENTER);
	}
	public void EnterIpNumber(String Ip_Number) throws IOException ,InterruptedException {

		WebElement ip_no_enter = driver.findElement(By.xpath(Enter_IP_No));
		CommanUtill.textEnter(Enter_IP_No, Ip_Number);
		ip_no_enter.sendKeys(Keys.ENTER);
	}
	public void CheckAllTocPendindOrderDurg(String Check_All_TOC)  throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> rows = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(TOC_Pending_patient)));

		int rowCount = rows.size();
		logger.info("==================== All Medical Record Charges =====================");
		logger.info("Total Rows Count: " + rowCount);
		System.out.println("Total Rows Count: " + rowCount);

		// Print each row data
		for (int i = 0; i < rowCount; i++) {
			String rowText = rows.get(i).getText();
			logger.info("Row " + (i + 1) + " : " + rowText);
			System.out.println("Row " + (i + 1) + " : " + rowText);
		}
	}
	public void SelectAllCheckBox(String Chkk_Box) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Check_Box_All)));
		WebElement check_Box = driver.findElement(By.xpath(Check_Box_All));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Check_Box_All, Chkk_Box);
	}
	public void SelectFirstCheckBox(String Chkk_Box) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Check_Box_All)));
		WebElement check_Box = driver.findElement(By.xpath(First_Check_Box_TOC_Approvel));
		if(! check_Box.isSelected())
		CommanUtill.clickFunction(First_Check_Box_TOC_Approvel, Chkk_Box);
	}
	public void SaveTOCMarksPatient(String Save_Icon , String Yes_Pop) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(Save_Btn, Save_Icon);
		if(CommanUtill.isElementPresent(sufficient_Deposit_Yes_pop)) {
			CommanUtill.clickFunction(sufficient_Deposit_Yes_pop, Yes_Pop);
			System.out.println("Save Yes Pop Sufficient Deposit Is Collected Pop");
		}
		else {
			System.out.println("Did Not Appeared Yes Pop Sufficient Deposit Is Collected Pop");
		}	
	}
	//==============================Check TOC Approval Date Wise =============================
	public void FromDateFromCSearchApproved(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(TOC_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(TOC_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void FromDateTOCSearchApproved(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(TOC_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(TOC_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void SelectCheckBoxShowApprovedOrders(String CheckBox)  throws IOException ,InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Check_Box_Approved_Orders)));
		WebElement check_Box = driver.findElement(By.xpath(Check_Box_Approved_Orders));
		if(! check_Box.isSelected())
		CommanUtill.clickFunction(Check_Box_Approved_Orders, CheckBox);
	}
}
