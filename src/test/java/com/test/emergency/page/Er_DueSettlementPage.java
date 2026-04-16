/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
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
 * 01-Apr-2026
 */
public class Er_DueSettlementPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Er_Billing_dashboard = "//li[@id='btn_Emergency']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	//=========================== Due Settlement ================================
	protected static  String Due_Settlement_Page = "//a[contains(normalize-space(),'Due Settlement')]";
	protected static  String Search_Find_Patient = "//i[@id='btnSearchErNo']";
	protected static  String Radio_Btn_Discharged_Patients = "//input[@id='rbDisPatents']";
	protected static  String Admission_Discharge_Check_Box = "//input[@id='cbAdmission']";
	protected static  String Frome_Date = "//input[@id='txtadmitDate']";
	protected static  String to_Date = "//input[@id='txtadmittodate']";
	protected static  String Find_Patient = "//a[@id='search_Emergency']//i[@class='fa fa-search']";
	protected static  String Click_Discharged_Patient_Table = "//table[@id='searchBillingTable']//tbody//tr[1]";
	protected static  String Not_Bill_Setted_Ok_Pop = "//a[@id='btnBillErrormessageOk']";
	//============================ Search By Patient =============================

	protected static  String Search_Patient_Btn = "//a[normalize-space()='Search By Patient']";
	protected static  String Enter_UHID = "//input[@id='txtUhid']";
	protected static  String Enter_ER_Number = "//input[@id='txtErNo']";
	protected static  String Enter_Bill_No = "//input[@id='txtBillNo']";
	protected static  String Search_patient_Icon = "//i[@id='btnSBPSearch']";
	protected static  String Due_Bill_Details_Table = "//div[@class='due-table']//tbody//tr[position()=1]";
	protected static  String Due_Amount = "//input[@id='txtDueAmtIndD']";   //Hidden
	//=============================Cash Due Settlemnt ======================
	protected static  String Click_Cash_Btn = "//a[@id='cashtab_']";
	protected static  String Rounding_Off_Settlement = "//input[@id='txtRoundOffAmt']";
	protected static  String Due_Remarks = "//textarea[@id='txtRemarks']";

	//======================= Save Btn =========================
	protected static  String Save_Icon = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected static  String Save_Yes_pop = "//a[@id='btnSaveYesEMDS']";

	//=========================== Cheque ============================
	protected static  String Cheque_Due_Btn = "//a[@id='chequetab_']";
	protected static  String Cheque_No = "//input[@id='txtChecqueNoCheque']";
	protected static  String Cheque_Issue_Date = "//input[@id='txtIssueDateCheque']";
	protected static  String Cheque_Bank_Name_Drp = "//select[@id='drdBankNameCheque']";
	protected static  String Cheque_Branch_Name = "//input[@id='txtBranchCheque']";
	protected static  String Cheque_Due_Settle_Amount = "//input[@id='txtAmtCheque']";

	//========================== Search By Company Date Wise==============================
	protected static  String Search_By_Company_Btn = "//a[normalize-space()='Search By Company']";
	protected static  String Company_Drp = "//select[@id='drdCompany']";
	protected static  String Company_Frome_Date = "//input[@id='txtFromDate']";
	protected static  String Company_To_Date = "//input[@id='txtToDate']";
	protected static  String Search_Company_Search_Btn = "//i[@id='btnSBCSearch']";
	
	 //======================== Print Btn ===============================
	protected static  String Print_Btn = "//i[@class='fa fa-print']";
	protected static  String Print_Receipt_no_Drp = "//select[@id='drdReceiptEMDS']";
	protected static  String Receipt_Yes = "//a[@id='btnPrintOKEMDS']";
	
	
	
	


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

	public void ErDueSettlementPage(String Due_Settled) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Due_Settlement_Page)));
		CommanUtill.clickFunction(Due_Settlement_Page, Due_Settled);
	}
	public void ClickOnSearchIcon(String Search_Btn) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Search_Find_Patient)));
		CommanUtill.clickFunction(Search_Find_Patient, Search_Btn);
	}
	public void SelectRadioBtnDischargedPatientsAndAdmissionDischargeCheckBox(String Discharged , String Admission_Discharge)
			throws IOException , InvalidApplicationException, InterruptedException {

		WebElement radio_btn = driver.findElement(By.xpath(Radio_Btn_Discharged_Patients));
		if(! radio_btn.isSelected()) {
			CommanUtill.clickFunction(Radio_Btn_Discharged_Patients, Discharged);
		}
		WebElement checkbox = driver.findElement(By.xpath(Admission_Discharge_Check_Box));
		if(! checkbox.isSelected()) {
			CommanUtill.clickFunction(Admission_Discharge_Check_Box, Admission_Discharge);
		}
	}
	public void EnterFromeDate(String FromDate) throws IOException, InterruptedException {

		WebElement fromDateField = driver.findElement(By.xpath(Frome_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Frome_Date, FromDate);
		fromDateField.sendKeys(Keys.TAB);
	}
	public void EnterToDate(String ToDate) throws IOException, InterruptedException {

		WebElement fromDateField = driver.findElement(By.xpath(to_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(to_Date, ToDate);
		fromDateField.sendKeys(Keys.TAB);
	}

	public void FindDischargedPatientInSearchIcon(String Search_Btn) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Find_Patient)));
		CommanUtill.clickFunction(Find_Patient, Search_Btn);
	}
	public void ClickOnDischaredSearchTable(String click_Patient) throws IOException , InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Discharged_Patient_Table)));
		String First_Row = driver.findElement(By.xpath(Click_Discharged_Patient_Table)).getText();
		logger.info("================= Search Patient In Table ====================");
		logger.info(First_Row);
		System.out.println("First Row Due Settlement Table : " + First_Row);

		CommanUtill.clickFunction(Click_Discharged_Patient_Table, click_Patient);
	}
	
	public void NotBillSettedOkPop(String ok_pop) throws IOException , InterruptedException { 
		
		if(CommanUtill.isElementPresent(Not_Bill_Setted_Ok_Pop)) {
			CommanUtill.clickFunction(Not_Bill_Setted_Ok_Pop, ok_pop);
			System.out.println("Ok Pop Appared In Bill Setted ");
		}
		else {
			System.out.println("Did Not Ok Pop Appared In Bill Setted ");
		}	
	}
	//====================== Search By Patient ===========================
	public void ClickOnSearchByPatientBtn(String Search_Patint_Btn) throws IOException , InterruptedException { 

		CommanUtill.clickFunction(Search_Patient_Btn, Search_Patint_Btn);
	}
	public void EnterUhid(String uhid) throws IOException , InterruptedException { 

		WebElement uhid_value = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, uhid);
		uhid_value.sendKeys(Keys.ENTER);
	}
	public void EnterERNumber(String ip) throws IOException , InterruptedException { 

		WebElement er_value = driver.findElement(By.xpath(Enter_ER_Number));
		CommanUtill.textEnter(Enter_ER_Number, ip);
		er_value.sendKeys(Keys.ENTER);
	}
	public void EnterBillNo(String Bill_no , String Search_icon) throws IOException , InterruptedException { 

		CommanUtill.textEnter(Enter_Bill_No, Bill_no);
		CommanUtill.clickFunction(Search_patient_Icon, Search_icon);
	}
	public void ClickDueDetailsTable(String After_Search_Er_No_Table_Patient_Click) throws IOException , InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Due_Bill_Details_Table)));
		String First_Row = driver.findElement(By.xpath(Due_Bill_Details_Table)).getText();
		logger.info("================= Search Patient In Table ====================");
		logger.info(First_Row);
		System.out.println("First Row Due Settlement Table : " + First_Row);

		CommanUtill.clickFunction(Due_Bill_Details_Table, After_Search_Er_No_Table_Patient_Click);
	}
	public void PrintDueAmount(String Due_Amount_Value) throws IOException , InterruptedException {

		String due_Amount = driver.findElement(By.xpath(Due_Amount)).getAttribute("value");

		logger.info("==================Due Amount===================");
		logger.info(due_Amount);
		System.out.println("ER Billing In Due Amount *** " + due_Amount);
	}
	//======================Cash Btn ===============================
	public void ClickOnCashButton(String Cash_btn) throws IOException , InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Cash_Btn)));
		CommanUtill.clickFunction(Click_Cash_Btn, Cash_btn);
	}
	public void EnterRoundingOffSettlemnt(String Rounding_Settlement) throws IOException , InterruptedException { 

		CommanUtill.textEnter(Rounding_Off_Settlement, Rounding_Settlement);
	}
	public void EnterDueRemarks(String Remarks) throws IOException , InterruptedException { 

		CommanUtill.textEnter(Due_Remarks, Remarks);
	}

	//======================== Save Btn ==========================
	public void ClickOnSaveBtnAndYespop(String Save , String Yes_pop) throws IOException , InterruptedException { 

		CommanUtill.clickFunction(Save_Icon, Save);
		if(CommanUtill.isElementPresent(Save_Yes_pop)) {
			CommanUtill.clickFunction(Save_Yes_pop, Yes_pop);
			System.out.println("Appeared Save Yes Pop");
		}
		else {
			System.out.println("Dod Not Appeared Save Yes Pop");
		}
	}
	//======================= Cheque Due Payment =============================

	public void ClickOnChequeButton(String Cheque_btn) throws IOException , InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Cheque_Due_Btn)));
		CommanUtill.clickFunction(Cheque_Due_Btn, Cheque_btn);
	}

	public void ChequeNumberIssueDateBankNameBramchName(String Cheque_no , String Issue_Date , String Bank_Name , 
			String Branch_Name) throws IOException , InterruptedException { 
		
		CommanUtill.textEnter(Cheque_No, Cheque_no);
		WebElement date = driver.findElement(By.xpath(Cheque_Issue_Date));
		date.sendKeys(Keys.CONTROL+"a");
		date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Cheque_Issue_Date, Issue_Date);
		date.sendKeys(Keys.TAB);
		CommanUtill.dropdownSelectByVisibleText(Cheque_Bank_Name_Drp, Bank_Name);
		CommanUtill.textEnter(Cheque_Branch_Name, Branch_Name);
	}
	public void LessThanCurrentDueAmount_1(String Due_Amount_Value) throws IOException , InterruptedException { 
		
		    logger.info("==================== Less Than Due Amount =====================");
		    String dueAmtText = driver.findElement(By.xpath(Due_Amount)).getAttribute("value");

		    // Convert String to Double
		    double dueAmount = Double.parseDouble(dueAmtText);

		    // Step 2: Print in Console + Logger
		    System.out.println("Current Due Amount (Individual): " + dueAmount);
		    logger.info("Current Due Amount (Individual): " + dueAmount);

		    // Step 3: Calculate Less Amount (Example: minus 1)
		    double lessAmount = dueAmount - 20;

		    // Convert back to String
		    String enterAmount = String.valueOf(lessAmount);

		    // Step 4: Enter in Cheque Amount field
		    CommanUtill.textEnter(Cheque_Due_Settle_Amount, enterAmount);

		    logger.info("Entered Less Amount: " + enterAmount);
		    System.out.println("Entered Less Amount: " + enterAmount);
		}
	
	public void LessThanCurrentDueAmount(String lessValue) throws IOException, InterruptedException {

	    logger.info("==================== Less Than Current Due Amount =====================");

	    // Step 1: Get Current Due Amount
	    String dueAmtText = driver.findElement(By.xpath(Due_Amount)).getAttribute("value");
	    double dueAmount = Double.parseDouble(dueAmtText);

	    // Step 2: Print Current Due Amount
	    System.out.println("Current Due Amount (Individual): " + dueAmount);
	    logger.info("Current Due Amount (Individual): " + dueAmount);

	    // Step 3: Convert Excel Value (String  int)
	    int lessVal = Integer.parseInt(lessValue);

	    // Step 4: Calculate Less Amount
	    double lessAmount = dueAmount - lessVal;
	    if (lessAmount < 0) {
	        lessAmount = 0;
	    }
	    String enterAmount = String.valueOf(lessAmount);
	    CommanUtill.textEnter(Cheque_Due_Settle_Amount, enterAmount);
	    System.out.println("Entered Amount After Less " + lessVal + " : " + enterAmount);
	    logger.info("Entered Amount After Less " + lessVal + " : " + enterAmount);
	}
	//========================== Search By Company ==============================
	
	public void ClickOnCompanyBySearchButton(String Company_By) throws IOException , InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Cheque_Due_Btn)));
		CommanUtill.clickFunction(Search_By_Company_Btn, Company_By);
	}
	public void SelectByCompanyDrp(String Company)  throws IOException , InterruptedException { 
		
		CommanUtill.dropdownSelectByVisibleText(Company_Drp, Company);
	}
	public void EnterFromeDateCompanyBy(String From_Date) throws IOException , InterruptedException { 
		
		WebElement date = driver.findElement(By.xpath(Company_Frome_Date));
		date.sendKeys(Keys.CONTROL+"a");
		date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Company_Frome_Date, From_Date);
		date.sendKeys(Keys.TAB);
	}
   public void EnterToDateCompanyBy(String To_Date) throws IOException , InterruptedException { 
		
		WebElement date = driver.findElement(By.xpath(Company_To_Date));
		date.sendKeys(Keys.CONTROL+"a");
		date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Company_To_Date, To_Date);
		date.sendKeys(Keys.TAB);
	}
   public void ClickSearchInDateWise(String search_Icon) throws IOException , InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Company_Search_Btn)));
		CommanUtill.clickFunction(Search_Company_Search_Btn, search_Icon);
	}
   //======================== Print Btn ===============================
	public void ClickOnDueSettledPrintBtn(String Print) throws IOException , InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Print_Btn)));
		CommanUtill.clickFunction(Print_Btn, Print);
	}
	public void SelectByReceiptNoDrpAndYesPop(int Receipt_drp , String Receipt_Yes_Pop) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Print_Btn)));
		CommanUtill.dropdownSelectByIndex(Print_Receipt_no_Drp, Receipt_drp);
		
		if(CommanUtill.isElementPresent(Receipt_Yes)) {
			CommanUtill.clickFunction(Receipt_Yes, Receipt_Yes_Pop);
			System.out.println("Print Receipt No Yes Pop");
		}
		else {
			System.out.println("Did Not Appeared Print Receipt No Yes Pop");
		}
		
	}
	
	
	}


