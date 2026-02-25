/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.Alert;
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
 * 23-Feb-2026
 */
public class ChequeInHandPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String Cheque_Hand_Tab = "//span[normalize-space()='Cheque In Hand']";
	//=====================Cheque In Hand Search Icon=========================

	protected static  String Find_Patient_In_Search_Icon = "//a[@id='ippatientsearch']//i[@class='fa fa-search']";
	protected static  String Discharged_Patient_Radio_Btn = "//input[@id='dischagepatient']";
	protected static  String Chkk_Box_Admission_Discharge = "//input[@id='admissiondischage']";
	protected static  String patient_Search_From_Date= "//input[@id='to_dischage']";
	protected static  String patient_Search_To_Date= "//input[@id='fromdischage']";
	protected static  String Search_Icon_Pop = "//a[@id='search_button']//i[@class='fa fa-check']";
	protected static  String Click_Discharge_Patient_Table = "//table[@id='searchResultsTable']//tbody//tr[1]";

	protected static  String Current_In_Patient_Radio_Btn = "//input[@id='inpatient']";
	protected static  String Click_Current_In_Patient_Table = "//table[@id='searchResultsTable']//tbody//tr[3]";

	//=====================Gritter Popup Message =========================
	protected static String gritterPopupMessage = "//div[@id='gritter-notice-wrapper']//p";
	//===========================Cheque In Hand Details Page =========================

	protected static  String Refresh_Icon = "//a[@id='btnRefresh']";
	protected static  String Cheque_Uhid = "//input[@id='uhid_admimitPatient']";
	protected static  String Cheque_IP_Number = "//input[@id='ptnipno']";
	protected static  String Cheque_Amount = "//input[@id='txtamt']";
	protected static  String Cheque_Number = "//input[@id='txtChequeNo']";
	protected static  String Cheque_Date_Chkk = "//input[@id='ckboxissuedate']";
	protected static  String Cheque_Date = "//input[@id='dtpissuedate']";
	protected static  String Bank_Name_Drp = "//select[@id='ddlbankname']";
	protected static  String Branch_Name = "//input[@id='txtBranchName']";
	protected static  String Cheque_Remarks = "//textarea[@id='txtremark']";
	protected static  String Cheque_Save_Btn = "//a[@id='btnsave']";
	protected static  String Cheque_Save_Yes_Pop = "//a[@id='btnsaveYes']";
	//===========================Save Cheque In Hand Table=========================
	protected static  String Curent_Save_Cheque_In_Hand_Table = "//table[@id='tblchequedtl']//tbody//tr[last()]";
	protected static  String Print_Save_Details = Curent_Save_Cheque_In_Hand_Table + "//i[@id='PlusBtn']";
	protected static  String Cheque_Delete_Details = Curent_Save_Cheque_In_Hand_Table + "//i[@id=\"DeltBtn\"]";
	protected static  String Cheque_Delete_Yes_Pop = "//a[@id='btnDeleteYes']";
	
	//=========================Cheque In Hand New Tab Save Deposit ================
	protected static  String Save_Btn = "//a[@id='Deposit']//i[@class='fa fa-usd']";
	protected static  String Save_Yes_pop = "//a[@id='btnDepositeYes']";
	protected static  String Save_Duplicate_Deposit_Yes_pop = "//a[@id='btnDepositYes']";







	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
			throws IOException , InvalidApplicationException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Billing_Meanu)));
		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}
	public void ClickOnChequeInHand(String Cheque_Hand) 
			throws IOException , InvalidApplicationException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Cheque_Hand_Tab)));
		CommanUtill.clickTabSwitchToAnotherWindow(Cheque_Hand_Tab, Cheque_Hand);
	}

	public void FindPatientInSearchIcon(String Find_Patient_Search_Icon) throws IOException , InvalidApplicationException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Find_Patient_In_Search_Icon)));
		CommanUtill.clickFunction(Find_Patient_In_Search_Icon, Find_Patient_Search_Icon);
	}

	public void DischargedPatientRadioBtn(String Discharged_Patient_Radio) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Discharged_Patient_Radio_Btn)));
		if (! driver.findElement(By.xpath(Discharged_Patient_Radio_Btn)).isSelected()) {
			CommanUtill.clickFunction(Discharged_Patient_Radio_Btn, Discharged_Patient_Radio);
		}
	}

	public void AdmissionDischargeCheckBox(String Admission_Discharge_Check_Box) throws IOException , InterruptedException {

		WebElement Check_Box_Element = driver.findElement(By.xpath(Chkk_Box_Admission_Discharge));
		if (! Check_Box_Element.isSelected()) {
			CommanUtill.clickFunction(Chkk_Box_Admission_Discharge, Admission_Discharge_Check_Box);
		}
	}

	public void PatientSearchFromAndToDate(String From_Date , String To_Date) throws IOException , InvalidApplicationException, InterruptedException {

		WebElement From_Date_Element = driver.findElement(By.xpath(patient_Search_From_Date));
		From_Date_Element.sendKeys(Keys.CONTROL + "a");
		From_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(patient_Search_From_Date, From_Date);
		From_Date_Element.sendKeys(Keys.TAB);

		WebElement To_Date_Element = driver.findElement(By.xpath(patient_Search_To_Date));
		To_Date_Element.sendKeys(Keys.CONTROL + "a");
		To_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(patient_Search_To_Date, To_Date);
		To_Date_Element.sendKeys(Keys.TAB);
	}

	public void ClickOnSearchIconPop(String Search_Icon_Btn) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Icon_Pop)));
		CommanUtill.clickFunction(Search_Icon_Pop, Search_Icon_Btn);
	}
	public void ClickOnDischargePatientTable(String Discharge_Patient_Table) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Discharge_Patient_Table)));
		CommanUtill.clickFunction(Click_Discharge_Patient_Table, Discharge_Patient_Table);

	}

	public String getDischargeAlertText() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		String message = alert.getText();
		System.out.println("Alert Message: " + message);

		return message;
	}

	public void acceptDischargeAlert() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
	}
	public String getGritterMessage() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gritterPopupMessage)));
		String actualMessage = messageElement.getText().trim();
		System.out.println("After Discharge Patient Click Message: " + actualMessage);

		return actualMessage; 
	}
	public void ClickOnRefreshIcon(String Refresh_Icon_Btn) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refresh_Icon)));
		CommanUtill.clickFunction(Refresh_Icon, Refresh_Icon_Btn);
	}

	public void ClickOnCurrentPatientRadioBtn(String Current_Patient_Radio) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Current_In_Patient_Radio_Btn)));
		if (! driver.findElement(By.xpath(Current_In_Patient_Radio_Btn)).isSelected()) {
			CommanUtill.clickFunction(Current_In_Patient_Radio_Btn, Current_Patient_Radio);
		}
	}

	public void ClickOnCurrentInPatientTable(String Current_In_Patient_Table) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Current_In_Patient_Table)));
		CommanUtill.clickFunction(Click_Current_In_Patient_Table, Current_In_Patient_Table);	
	}

	public void ChequeInHandAmount(String ChequeInHand_Details_Amount , String Cheque_No ) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Cheque_Amount)));
		CommanUtill.textEnter(Cheque_Amount, ChequeInHand_Details_Amount);
		CommanUtill.textEnter(Cheque_Number, Cheque_No);

	}

	public void DateCheckBoxAndDateEnter(String Chkk_BoxDate , String Enter_Date) throws IOException , InvalidApplicationException, InterruptedException {

		WebElement Check_Box_Element = driver.findElement(By.xpath(Cheque_Date_Chkk));
		if (! Check_Box_Element.isSelected()) {
			CommanUtill.clickFunction(Cheque_Date_Chkk, Chkk_BoxDate);
		}
		WebElement Date_Element = driver.findElement(By.xpath(Cheque_Date));
		Date_Element.sendKeys(Keys.CONTROL + "a");
		Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Cheque_Date, Enter_Date);
		Date_Element.sendKeys(Keys.TAB);
	}

	public void BankNameAndBranch(String Bank_Name , String BranchName) throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Bank_Name_Drp, Bank_Name);
		CommanUtill.textEnter(Branch_Name, BranchName);
	}
	public void ChequeInHandRemarks(String Cheque_Remarks_Enter) throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.textEnter(Cheque_Remarks, Cheque_Remarks_Enter);
	}

	public void ClickOnChequeInHandSaveBtn(String Cheque_Save , String Yes_Pop) throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Cheque_Save_Btn, Cheque_Save);
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Cheque_Save_Yes_Pop)));
		CommanUtill.clickFunction(Cheque_Save_Yes_Pop, Yes_Pop);
	}
	//======================Plush Table Pop====================
	public void ClickOnVerifyAndClickOnPlushIconInTable(String Print_Details_InTable) throws IOException , InvalidApplicationException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Print_Save_Details)));

		String SaveData = driver.findElement(By.xpath(Curent_Save_Cheque_In_Hand_Table)).getText();

		logger.info("========== Current Pink Row Data ==========");
		logger.info(SaveData);
		System.out.println("Current Pink Row Data: " + SaveData);

		Thread.sleep(4000);

		// Direct Click On Print Icon
		CommanUtill.clickTabSwitchToAnotherWindowNew(Print_Save_Details, Print_Details_InTable);
		logger.info("Clicked Plush Icon Of Current Pink Row Successfully");
	}
	
	public void PreviousWindow(String Previous_Window) throws IOException , InvalidApplicationException, InterruptedException { 
		
		CommanUtill.closeChildAndSwitchToParent();
	}
	
	//======================Delete Table Pop====================
	public void ClickOnVerifyAndClickOnDeleteIconInTable(String Delete_Save_ChequeInHand )throws IOException , InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Cheque_Delete_Details)));

		String SaveData = driver.findElement(By.xpath(Curent_Save_Cheque_In_Hand_Table)).getText();

		logger.info("========== Current Pink Row Data ==========");
		logger.info(SaveData);
		System.out.println("Current Pink Row Data: " + SaveData);

		Thread.sleep(4000);

		// Direct Click On Print Icon
		CommanUtill.clickFunction(Cheque_Delete_Details, Delete_Save_ChequeInHand);
		
		logger.info("Clicked Delete Icon Of Current Pink Row Successfully");
	}
	public void DeleteChequeInHandYesPop(String CancelYes_pop) throws IOException, InterruptedException {
		
		WebDriverWait  Cancel_Pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		Cancel_Pop.until(ExpectedConditions.elementToBeClickable(By.xpath(Cheque_Delete_Yes_Pop)));
		CommanUtill.clickFunction(Cheque_Delete_Yes_Pop, CancelYes_pop);
	}

	public void ClickOnSaveBtnAndYesDuplicatePop(String Save_Icon, String Yes_pop, String Yes_Duplicate_pop) 
			throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Btn)));
	    CommanUtill.clickFunction(Save_Btn, Save_Icon);
	    Thread.sleep(2000); 

	    // First Normal Save Popup
	    if (CommanUtill.isElementPresent(Save_Yes_pop)) {
	        CommanUtill.clickFunction(Save_Yes_pop, Yes_pop);
	        System.out.println("Clicked on Save confirmation popup.");
	    } 
	    // Duplicate Popup
	    else if (CommanUtill.isElementPresent(Save_Duplicate_Deposit_Yes_pop)) {

	        CommanUtill.clickFunction(Save_Duplicate_Deposit_Yes_pop, Yes_Duplicate_pop);
	        System.out.println("Clicked on Duplicate Deposit popup.");

	    } 
	    else {
	        System.out.println("No popup appeared after Save.");
	    }
	}
	
	//========================= UHID And IP Number ======================
	
	public void EnterUHIDInChequeInHand(String UHID) throws IOException, InterruptedException {
		
		WebElement Enter_UHID = driver.findElement(By.xpath(Cheque_Uhid));
		CommanUtill.textEnter(Cheque_Uhid, UHID);
		Enter_UHID.sendKeys(Keys.ENTER);
	}
	
    public void EnterIPNumberChequeInHand(String IP_No) throws IOException, InterruptedException {
		
		WebElement Enter_UHID = driver.findElement(By.xpath(Cheque_IP_Number));
		CommanUtill.textEnter(Cheque_IP_Number, IP_No);
		Enter_UHID.sendKeys(Keys.ENTER);
	}
	
	
	
	


}
