/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.jspecify.annotations.Nullable;
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
 * 02-Apr-2026
 */
public class Er_DepositRefundPage extends GeneralBrowserSetting {

	
	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Er_Billing_dashboard = "//li[@id='btn_Emergency']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";
	protected static  String Deposit_Refund_Page = "//a[contains(normalize-space(),'Deposit/Refund')]";
	
	//=========================== Deposit Refound Current In Search ================================
	protected static  String Er_Deposit_Btn = "//a[@id='opbillvisit']";
	protected static  String Search_Find_Patient = "//a[@id='search_huiddata1']//i[@title='Search']";
	
	protected static  String Radio_Btn_Current_patient = "//input[@id='rbCurrentPatents']";
	protected static  String Check_Box_All_Ward = "//input[@id='cbAllWards']";
	protected static  String Admission_Discharge_Check_Box = "//input[@id='cbAdmission']";
	protected static  String Frome_Date = "//input[@id='txtadmitDate']";
	protected static  String to_Date = "//input[@id='txtadmittodate']";
	protected static  String Find_Patient = "//a[@id='search_Emergency']//i[@class='fa fa-search']";
	protected static  String Click_Current_Patient_Table = "//table[@id='searchBillingTable']//tbody//tr[1]";
	
	//============================ Deposit Refound ====================================
	protected static  String Refresh_Icon = "//a[@id='Refresh']//i[@class='fa fa-refresh']";
	protected static  String Enter_UHID = "//input[@id='uHid1']";
	protected static  String Enter_ER_No = "//input[@id='ErNo1']";
	protected static  String Radio_Btn_Cash = "//input[@id='Cash_']";
	protected static  String Enter_Desosit_Cash_Amount = "//input[@id='Amount']";
	protected static  String Remarks_Desosit = "//input[@id='Remarks']";
	protected static  String Deposit_Relation_Drp = "//select[@id='er_relationship']";
	
	 //======================= Deposit Save Btn ==========================
	protected static  String Save_Deposit_Btn = "//a[@id='Deposit']//i[@class='fa fa-rupee']";
	protected static  String Save_Deposit_Yes_Pop = "//a[@id='btnDepConfirmYes']";
	
	//============================= Cheque Details ===============================
	protected static  String Radio_Btn_Cheque = "//input[@id='Cheque_']";
	protected static  String Cheque_Number = "//input[@id='cheque_no']";
	protected static  String Cheque_Chkk_box_Issue_Date = "//input[@id='Isuecheckbox']";
	protected static  String Cheque_Date  = "//input[@id='Issue_name']";
	protected static  String Cheque_Bank_Name_Drp  = "//select[@id='Bank_Name_cheque']";
	protected static  String Cheque_Branch_Name  = "//input[@id='Brach_Number']";
	protected static  String Cheque_Amount  = "//input[@id='AmtCheuqDpt']";
	//======================= Deposit Receipt Utility ===========================
	protected static  String Receipt_Utility_Btn  = "//button[@id='btnReceiptUti']";
	protected static  String Receipt_Utility_Er_No  = "//input[@id='txtIpId']";
	protected static  String Receipt_Number  = "//input[@id='txtReceipt']";
	protected static  String Receipt_Date_Check_bpx  = "//input[@id='chkDateRange']";
	protected static  String Receipt_Frome_Date  = "//input[@id='dtpfromdate']";
	protected static  String Receipt_To_Date  = "//input[@id='dtptodate']";
	protected static  String Receipt_Date_Wise_Search_Icon  = "//a[@id='btnDateSearch']//i[@class='fa fa-search']";
	
	protected static  String Deposit_Receipt_Last_Row_Table  = "//table[@id='dgbilldetails']//tbody//tr[last()]";
	protected static  String Click_Deposit_Receipt_Last_Row_Print_Table  = "//table[@id='dgbilldetails']//tbody//tr[last()]//a[@title='Print']";
	
	
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
	public void ErDepositRefundPage(String DepositRefund) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Deposit_Refund_Page)));
		CommanUtill.clickFunction(Deposit_Refund_Page, DepositRefund);
	}
	
	public void ClickOnErDepositBtn(String Deposit_Btn) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Er_Deposit_Btn)));
		CommanUtill.clickFunction(Er_Deposit_Btn, Deposit_Btn);
	}
	
	public void FindPatientInSearchIcon(String Search_Icon) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Search_Find_Patient)));
		CommanUtill.clickFunction(Search_Find_Patient, Search_Icon);
	}
	public void RadioBtnCurrentInPatientAndCheckBoxAllWard_AdmissionDischaredCheckBox(String Current_Patient , String All_Ward , 
			String Admission_Chkk_box) throws IOException , InvalidApplicationException, InterruptedException {

		WebElement radio_btn = driver.findElement(By.xpath(Radio_Btn_Current_patient));
		if(! radio_btn.isSelected()) {
			CommanUtill.clickFunction(Radio_Btn_Current_patient, Current_Patient);
		}
		WebElement checkbox = driver.findElement(By.xpath(Check_Box_All_Ward));
		if(! checkbox.isSelected()) {
			CommanUtill.clickFunction(Check_Box_All_Ward, All_Ward);
		}
		WebElement checkbox1 = driver.findElement(By.xpath(Admission_Discharge_Check_Box));
		if(! checkbox1.isSelected()) {
			CommanUtill.clickFunction(Admission_Discharge_Check_Box, Admission_Chkk_box);
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

	public void ClickOnSearchBtnPop(String Search_Btn) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Find_Patient)));
		CommanUtill.clickFunction(Find_Patient, Search_Btn);
	}
	public void ClickOnCurrentInPatientSearchTable(String click_Patient) throws IOException , InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Current_Patient_Table)));
		String First_Row = driver.findElement(By.xpath(Click_Current_Patient_Table)).getText();
		logger.info("================= Search Patient In Table ====================");
		logger.info(First_Row);
		System.out.println("First Row Due Settlement Table : " + First_Row);

		CommanUtill.clickFunction(Click_Current_Patient_Table, click_Patient);
	}
	
	public void ClickOnRefreshBtn(String Refresh) throws IOException , InterruptedException {
	
	WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refresh_Icon)));
	CommanUtill.clickFunction(Refresh_Icon, Refresh);
	}
	//============================ Deposit Refound ====================================
	public void EnterUHID(String uhid_enter) throws IOException, InterruptedException { 

		WebElement uhid = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, uhid_enter);
		uhid.sendKeys(Keys.ENTER);
	}
	public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(Enter_ER_No));
		CommanUtill.textEnter(Enter_ER_No, er_enter);
		er.sendKeys(Keys.ENTER);
	}
	//============================ Deposit Cash ====================================
	public void PaymentInCashRadioBtnAndAmount(String Cash , String Cash_Amount ) throws IOException , InterruptedException {

		WebElement radio_btn = driver.findElement(By.xpath(Radio_Btn_Cash));
		if(! radio_btn.isSelected()) {
			CommanUtill.clickFunction(Radio_Btn_Cash, Cash);
		}	
		CommanUtill.textEnter(Enter_Desosit_Cash_Amount, Cash_Amount);
	}
	public void RemarksAndRelationDrp(String Remarks , String Relation_Drp) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(Remarks_Desosit, Remarks);
		CommanUtill.dropdownSelectByVisibleText(Deposit_Relation_Drp, Relation_Drp);
	}
  //======================= Deposit Save Btn ==========================
	
	public void SaveDepositBtnAndYesPop(String save_Icon , String Yes_pop)  throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(Save_Deposit_Btn, Yes_pop);
		if(CommanUtill.isElementPresent(Save_Deposit_Yes_Pop)) {
			CommanUtill.clickFunction(Save_Deposit_Yes_Pop, Yes_pop);
			System.out.println("Save Pop Appeared Click Yes Btn");
		}
		else {
			System.out.println("Did Not Save Pop Appeared Click Yes Btn");
		}
	}
	//=========================Deposit In Cheque ==================================
	
	public void PaymentInChequeRadioBtnAndAmount(String cheque , String Cheque_Amount_Text ) throws IOException , InterruptedException {

		WebElement radio_btn = driver.findElement(By.xpath(Radio_Btn_Cheque));
		if(! radio_btn.isSelected()) {
			CommanUtill.clickFunction(Radio_Btn_Cheque, cheque);
		}	
		CommanUtill.textEnter(Cheque_Amount, Cheque_Amount_Text);
	}
	public void ChequeNo_ChkkBoxIssueDate_IssueDate_BanksNameDrp_BranchName(String Cheque , String Chkk_Issue_Date , 
			String Issue_Date , String Bank_Bame_Drp , String Branch_Name) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(Cheque_Number, Cheque);
		WebElement Chkk_Box = driver.findElement(By.xpath(Cheque_Chkk_box_Issue_Date));
		if(! Chkk_Box.isSelected()) {
			CommanUtill.clickFunction(Cheque_Chkk_box_Issue_Date, Chkk_Issue_Date);
		}	
		WebElement fromDateField = driver.findElement(By.xpath(Cheque_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Cheque_Date, Issue_Date);
		fromDateField.sendKeys(Keys.TAB);
		CommanUtill.dropdownSelectByVisibleText(Cheque_Bank_Name_Drp, Bank_Bame_Drp);
		CommanUtill.textEnter(Cheque_Branch_Name, Branch_Name);
	}
	//======================= Deposit Receipt Utility ===========================
	public void ClickOnReceiptUtilityBtn(String Receipt_Btn) throws IOException , InterruptedException {
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Receipt_Utility_Btn)));
		CommanUtill.clickFunction(Receipt_Utility_Btn, Receipt_Btn);
	}
	public void EnterReceiptUtilityErNumber(String Er_No) throws IOException , InterruptedException {
		
		WebElement er = driver.findElement(By.xpath(Receipt_Utility_Er_No));
		CommanUtill.textEnter(Receipt_Utility_Er_No, Er_No);
		er.sendKeys(Keys.ENTER);
	}
   public void EnterReceiptUtilityNumber(String Receipt_No) throws IOException , InterruptedException {
		
		WebElement Receipt = driver.findElement(By.xpath(Receipt_Number));
		CommanUtill.textEnter(Receipt_Number, Receipt_No);
		Receipt.sendKeys(Keys.ENTER);
	}
   public void SearchRceiptUtilityInDateWise(String Chkk_Box , String FromeDate , String ToDate ,String Search_Icon)
		   throws IOException , InterruptedException {
	   
	   WebElement Date_Chkk_Box = driver.findElement(By.xpath(Receipt_Date_Check_bpx));
		if(! Date_Chkk_Box.isSelected()) {
			CommanUtill.clickFunction(Receipt_Date_Check_bpx, Chkk_Box);
		}	
		WebElement fromDateField = driver.findElement(By.xpath(Receipt_Frome_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Receipt_Frome_Date, FromeDate);
		fromDateField.sendKeys(Keys.TAB);
		
		WebElement ToDateField = driver.findElement(By.xpath(Receipt_To_Date));
		ToDateField.sendKeys(Keys.CONTROL + "a");
		ToDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Receipt_To_Date, ToDate);
		ToDateField.sendKeys(Keys.TAB);
		
		CommanUtill.clickFunction(Receipt_Date_Wise_Search_Icon, Search_Icon);
   }
   public void PrintDepositReceiptNumber(String Deposit_Receipt_Print) throws IOException , InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Deposit_Receipt_Last_Row_Table)));
	  String  Last_Row = driver.findElement(By.xpath(Deposit_Receipt_Last_Row_Table)).getText();
	  
	  logger.info("==========================Er Deposit Receipt Number ============================");
	  logger.info(Last_Row);
	  System.out.println("Er Deposit Receipt Print : " + Last_Row);
	  CommanUtill.clickFunction(Click_Deposit_Receipt_Last_Row_Print_Table, Deposit_Receipt_Print);
	  
		
   }
	
	
	 
}
