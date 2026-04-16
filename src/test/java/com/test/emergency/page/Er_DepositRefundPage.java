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
	protected static  String Close_Receipt_Pop  = "//a[@id='btnCloseRefund']//i[@class='fa fa-times']";

	protected static  String Deposit_Receipt_Last_Row_Table  = "//table[@id='dgbilldetails']//tbody//tr[last()]";
	protected static  String Click_Deposit_Receipt_Last_Row_Print_Table  = "//table[@id='dgbilldetails']//tbody//tr[last()]//a[@title='Print']";

	//======================= Refound Receipt Utility ===========================
	protected static  String Refound_Receipt_Last_Row_Table  = "(//table[@id='dgbilldetails']//tbody//tr[contains(@class,'bg-pink')])[last()]";
	protected static  String Click_Refound_Receipt_Last_Row_Print_Table  = "(//table[@id='dgbilldetails']//tbody//tr[contains(@class,'bg-pink')])[last()]//a[@title='Print']";

	//=========================== Deposit In Credit Card ===========================
	protected static  String Deposit_Credit_Card_Radio_Btn  = "//input[@id='Credit_']";
	protected static  String Deposit_Credit_Card_No= "//input[@id='Card_no']";
	protected static  String Deposit_Credit_Card_Type_Drp  = "//select[@id='Crd_name']";
	protected static  String Deposit_Credit_Card_Bank_Name  = "//select[@id='Bank_Name']";
	protected static  String Deposit_Credit_Card_Trans_No  = "//input[@id='B_Number']";
	protected static  String Deposit_Credit_Card_Amount  = "//input[@id='C_Amt']";
	protected static  String Deposit_Credit_Card_Other_Details  = "//input[@id='ccOtherDetails']";
	protected static  String Deposit_Credit_Card_Take_Payment  = "//a[@id='TakepaymentCredit']";
	//===========================Deposit Deposit Debit Card ===========================

	protected static  String Debit_Credit_Card_Radio_Btn  = "//input[@id='Debit_']";
	protected static  String Debit_Credit_Card_No= "//input[@id='D_Card_no']";
	protected static  String Debit_Credit_Card_Type_Drp  = "//select[@id='D_Crd_name']";
	protected static  String Debit_Credit_Card_Bank_Name  = "//select[@id='D_Bank_Name']";
	protected static  String Debit_Credit_Card_Trans_No  = "//input[@id='D_B_Number']";
	protected static  String Debit_Credit_Card_Amount  = "//input[@id='D_Amt']";
	protected static  String Debit_Credit_Card_Other_Details  = "//input[@id='dcOtherDetails']";
	protected static  String Debit_Credit_Card_Take_Payment  = "//a[@id='TakepaymentDebit']";

	//==============================Deposit NEFT/RTGS================================
	protected static  String NEET_RTGS_Radio_Btn  = "//input[@id='Neft_']";
	protected static  String NEET_RTGS_Trans_No  = "//input[@id='neftTrans_no']";
	protected static  String NEET_RTGS_Trans_Date_Ckk_Box = "//input[@id='Neftcheckbox']";
	protected static  String NEET_RTGS_Trans_Date  = "//input[@id='NeftTrans_date']";
	protected static  String NEET_RTGS_Bank_Name_Drp  = "//select[@id='Bank_Name_neft']";
	protected static  String NEET_RTGS_Branch_Name  = "//input[@id='Brach_Number_neft']";
	protected static  String NEET_RTGS_Amount  = "//input[@id='Amt']";

	//========================= Deposit In Other ==============================
	protected static  String Deposit_Other_Radio_Btn  = "//input[@id='Other_']";
	protected static  String Deposit_Other_Payment_Mode_Drp  = "//select[@id='paymentmode_other']";
	protected static  String Deposit_Other_Transaction_Id  = "//input[@id='transactionid_other']";
	protected static  String Deposit_Other_Remarks  = "//input[@id='remark_other']";
	protected static  String Deposit_Other_Amount  = "//input[@id='OtherAmt']";
	protected static  String Deposit_Other_Take_Payment  = "//span[@class='mar-b10']//a[@id='OtherTakepayment']";





	//========================== Refund Cash =============================
	protected static  String Refund_Btn  = "//a[@id='opbilldiagnostic']";
	protected static  String All_Deposit_Receipt_In_Table  = "//table[@id='tbldeposit']//tbody//tr";
	//protected static  String Click_On_Last_Deposit_Receipt  = "//table[@id='tbldeposit']//tbody//tr[last()]";
	protected static  String Click_On_Last_Deposit_Receipt  = "//table[@id='tbldeposit']//tbody//tr[last()-1]";
	protected static  String Refund_Cash_Radio_Btn  = "//input[@id='Refund_cash']";
	protected static  String Deposit_Available_Amount  = "//input[@id='Available_refund']";  //Print 
	protected static  String Refund_Amount  = "//input[@id='RA_Refund']";
	protected static  String Refund_Payable_Name  = "//input[@id='Payble_Refund']";
	protected static  String Refund_Remarks  = "//input[@id='Remarks_Refund']";

	protected static  String Refund_Save_Btn  = "//a[@id='Refund']//i[@class='fa fa-rupee']";
	protected static  String Refund_Save_Yes_Pop  = "//a[@id='btnRefConfirmYes']";

	//====================== Refound In Cheque ============================
	protected static  String Refound_Cheque_Radio_Btn  = "//input[@id='Cheque_refund']";
	protected static  String Refound_Cheque_No  = "//input[@id='refund_cheque_no']";
	protected static  String Refound_Cheque_Chkk_box_Issue_Date = "//input[@id='refund_Issue_date']";
	protected static  String Refound_Cheque_Date  = "//input[@id='refund_Issue_name']";
	protected static  String Refound_Cheque_Bank_Name_Drp  = "//select[@id='refund_Bank_Name_cheque']";
	protected static  String Refound_Cheque_Branch_Name  = "//input[@id='refund_Brach_Number']";
	protected static  String Refound_Cheque_Amount  = "//input[@id='Cheque_Amount_refund_Number']";

	//========================= Refound In Credit Card ===============================
	protected static  String Refound_Credit_Card_Radio_Btn  = "//input[@id='Credit_refund']";
	protected static  String Refound_Credit_Card_No= "//input[@id='refund_Card_no']";
	protected static  String Refound_Credit_Card_Type_Drp  = "//select[@id='refund_Crd_name']";
	protected static  String Refound_Credit_Card_Bank_Name  = "//select[@id='refund_Bank_Name']";
	protected static  String Refound_Credit_Card_Trans_No  = "//input[@id='refund_B_Number']";
	protected static  String Refound_Credit_Card_Amount  = "//input[@id='Credit_Amount_refund_Number']";

	//============================== NEFT/RTGS For Processing by Finance ==================================
	protected static  String Refound_NEFT_Radio_Btn  = "//input[@id='Neft_refund']";
	protected static  String Refound_NEFT_Finance_Radio_Btn  = "//input[@id='_Pfince1']";
	protected static  String Refound_NEFT_Finance_Account_No  = "//input[@id='pfinNeft1_acn']";
	protected static  String Refound_NEFT_Account_Holder_Name  = "//input[@id='pfinNeft1_achn']";
	protected static  String Refound_NEFT_Account_Type  = "//input[@id='pfinNeft1_act']";
	protected static  String Refound_NEFT_Bank_Name_Drp  = "//select[@id='pfinNeft1_bn']";
	protected static  String Refound_NEFT_Branch_Name = "//input[@id='pfinNeft1_branch']";
	protected static  String Refound_NEFT_IFSC_Code  = "//input[@id='pfinNeft1_ifsc']";
	protected static  String Refound_NEFT_Finance_Amount  = "//input[@id='pfinNeft1_amt']";

	//============================== NEFT/RTGS For Already Processed ==================================
	protected static  String Refound_NEFT_Processed_Radio_Btn  = "//input[@id='_alpro1']";
	protected static  String Refound_NEFT_Processed_Trans_No  = "//input[@id='refund_neftTrans_no']";
	protected static  String Refound_NEFT_Processed_Trans_Date_Chkk_Box  = "//input[@id='refund_NeftTrans_check']";
	protected static  String Refound_NEFT_Processed_Trans_Date  = "//input[@id='refund_NeftTrans_date']";
	protected static  String Refound_NEFT_Processed_Bank_Name  = "//select[@id='refund_Bank_Name_neft']";
	protected static  String Refound_NEFT_Processed_Branch_Name  = "//input[@id='refund_Brach_Number_neft']";
	protected static  String Refound_NEFT_Processed_Amount  = "//input[@id='Neft_Amount_refund_Number']";

	//=============================== Refound In Other =============================
	protected static  String Refound_Other_Radio_Btn  = "//input[@id='Other_refund']";
	protected static  String Refound_Payment_Mode_Drp  = "//select[@id='refund_paymentmode_other']";
	protected static  String Refound_Other_Transaction_id  = "//input[@id='refund_transactionid_other']";
	protected static  String Refound_Other_Remarks = "//input[@id='refund_remark_other']";
	protected static  String Refound_Other_Amount  = "//input[@id='Other_Amount_refund_Number']";
	protected static  String Refound_Other_Take_Payment_Btn  = "//a[contains(@id,'OtherTakepayment')]";
	protected static  String Refound_Other_Cancel_Payment_Btn  = "//a[contains(.,'Cancel Payment')]";






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

		if(CommanUtill.isElementPresent(Refresh_Icon)) {
			WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refresh_Icon)));
			CommanUtill.clickFunction(Refresh_Icon, Refresh);
			System.out.println("Click On Er Deposit Refund Page Refresh Btn");
		}
		else {
			System.out.println("Not Clickable On Er Deposit Refund Page Refresh Btn");
		}

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
		/*
		WebElement ToDateField = driver.findElement(By.xpath(Receipt_To_Date));
		ToDateField.sendKeys(Keys.CONTROL + "a");
		ToDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Receipt_To_Date, ToDate);
		ToDateField.sendKeys(Keys.TAB);
		 */
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
	public void CloseReceiptPop(String Close) throws IOException , InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Close_Receipt_Pop)));
		CommanUtill.clickFunction(Close_Receipt_Pop, Close);  
	}
	

	//=========================== Deposit In Credit Card ===========================
	
	public void ErDepositInCreditCardNumber(String Credit_Card_RadioBtn , String Card_No , String Card_Type_Drp , 
			String Bank_Name_Drp , String Trans_No , String Amount , String Other_Details ) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Deposit_Credit_Card_Radio_Btn, Credit_Card_RadioBtn);
		CommanUtill.textEnter(Deposit_Credit_Card_No, Card_No);
		CommanUtill.dropdownSelectByVisibleText(Deposit_Credit_Card_Type_Drp, Card_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Deposit_Credit_Card_Bank_Name, Bank_Name_Drp);
		CommanUtill.textEnter(Deposit_Credit_Card_Trans_No, Trans_No);
		CommanUtill.textEnter(Deposit_Credit_Card_Amount, Amount);
		CommanUtill.textEnter(Deposit_Credit_Card_Other_Details, Other_Details);

	}
	public void ClickOnTakeOnPaymentInCreditCardDeposit(String Take_Payment_Credit_Card) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Deposit_Credit_Card_Take_Payment)));
		CommanUtill.clickFunction(Deposit_Credit_Card_Take_Payment, Take_Payment_Credit_Card);  
	}
	//=========================== Deposit Debit Card ===========================
	public void ErDepositIDebitCardNumber(String Debit_Card_RadioBtn , String Card_No , String Card_Type_Drp , 
			String Bank_Name_Drp , String Trans_No , String Amount , String Other_Details ) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Debit_Credit_Card_Radio_Btn, Debit_Card_RadioBtn);
		CommanUtill.textEnter(Debit_Credit_Card_No, Card_No);
		CommanUtill.dropdownSelectByVisibleText(Debit_Credit_Card_Type_Drp, Card_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Debit_Credit_Card_Bank_Name, Bank_Name_Drp);
		CommanUtill.textEnter(Debit_Credit_Card_Trans_No, Trans_No);
		CommanUtill.textEnter(Debit_Credit_Card_Amount, Amount);
		CommanUtill.textEnter(Debit_Credit_Card_Other_Details, Other_Details);    
	}
	public void ClickOnTakeOnPaymentInDebitCardDeposit(String Take_Payment_Debit_Card) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Debit_Credit_Card_Take_Payment)));
		CommanUtill.clickFunction(Debit_Credit_Card_Take_Payment, Take_Payment_Debit_Card);  
	}
	//==============================NEFT/RTGS================================

	public void ErDepositNEETAndRTGT(String NEET_RTGS_Radio , String Trans_No , String Check_Box_Date , 
			String Date_NEET , String Bank_Name_Drp , String Branch , String Amount ) throws IOException , InterruptedException {

		CommanUtill.clickFunction(NEET_RTGS_Radio_Btn, NEET_RTGS_Radio);
		CommanUtill.textEnter(NEET_RTGS_Trans_No, Trans_No);
		WebElement chkk_Box = driver.findElement(By.xpath(NEET_RTGS_Trans_Date_Ckk_Box));
		if(! chkk_Box.isSelected()) {
			CommanUtill.clickFunction(NEET_RTGS_Trans_Date_Ckk_Box, Check_Box_Date);
		}
		CommanUtill.textEnter(NEET_RTGS_Trans_Date, Date_NEET);
		CommanUtill.dropdownSelectByVisibleText(NEET_RTGS_Bank_Name_Drp, Bank_Name_Drp);
		CommanUtill.textEnter(NEET_RTGS_Branch_Name, Branch);
		CommanUtill.textEnter(NEET_RTGS_Amount, Amount);    
	}
	//========================= Deposit In Other ==============================
	public void RadioBtnDepositInOther(String Radio_Btn)  throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Deposit_Other_Radio_Btn)));
		CommanUtill.clickFunction(Deposit_Other_Radio_Btn, Radio_Btn);  
	}
	public void DepositInOtherDetails(String Payment_Mode , String Transaction , String Remark) throws IOException , InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Deposit_Other_Payment_Mode_Drp, Payment_Mode);
		CommanUtill.textEnter(Deposit_Other_Transaction_Id, Transaction);
		CommanUtill.textEnter(Deposit_Other_Remarks, Remark);
	}
	public void DepositInOtherAmount(String Amount)  throws IOException , InterruptedException {
		
		CommanUtill.textEnter(Deposit_Other_Amount, Amount);
	}
	public void ClickOnTakePamentDepositInOther(String TakePayment)  throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Deposit_Other_Take_Payment)));
		CommanUtill.clickFunction(Deposit_Other_Take_Payment, TakePayment);  
	}

	//====================== Refund Cash ==============================
	public void ClickOnErRefundBtn(String Refund) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Refund_Btn)));
		CommanUtill.clickFunction(Refund_Btn, Refund);
	}
	public void PrintAllDepositAmountInTable(String Deposit_Table) throws IOException, InterruptedException {

		List<WebElement> rows = driver.findElements(By.xpath(All_Deposit_Receipt_In_Table));

		logger.info("====================== Deposit All Amount =====================");

		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();

			logger.info("Row " + (i + 1) + " : " + rowText);
			System.out.println("Row " + (i + 1) + " : " + rowText);
		}
	}
	public void ClickOnLastRowDepositAmount(String Row) throws IOException, InterruptedException {

		String last = driver.findElement(By.xpath(Click_On_Last_Deposit_Receipt)).getText();
		logger.info("======================Refound Deposit Amount =====================");
		logger.info(last);
		System.out.println("Refound Amount Table Indetify: " + last);
		CommanUtill.clickFunction(Click_On_Last_Deposit_Receipt, Row);
	}
	public void ClickOnRadioBtnInCash(String Cash) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refund_Cash_Radio_Btn)));
		CommanUtill.clickFunction(Refund_Cash_Radio_Btn, Cash);  
	}

	public void LessThanCurrentRefoundAmount(String lessValue) throws IOException, InterruptedException {

		logger.info("==================== Less Than Current Refund Amount =====================");

		// Get Available Deposit Amount
		String amtText = driver.findElement(By.xpath(Deposit_Available_Amount)).getAttribute("value").trim();
		int availableAmount = (int) Double.parseDouble(amtText);

		System.out.println("Available Deposit Amount : " + availableAmount);
		logger.info("Available Deposit Amount : " + availableAmount);

		// Get Less Value from Excel
		int lessVal = Integer.parseInt(lessValue);
		int refundAmount;

		// LOGIC
		if (lessVal >= availableAmount) {
			// If equal or greater → force valid minimum less value
			refundAmount = availableAmount - 1;
		} else {
			refundAmount = availableAmount - lessVal;
		}
		if (refundAmount <= 0) {
			refundAmount = 1;
		}
		WebElement refundField = driver.findElement(By.xpath(Refund_Amount));
		refundField.sendKeys(Keys.CONTROL + "a");
		refundField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Refund_Amount, String.valueOf(refundAmount));
		System.out.println("Final Refund Amount Entered : " + refundAmount);
		logger.info("Final Refund Amount Entered : " + refundAmount);
	}
	public void RefoundPayableNameAndRemarks(String Payable_Name_Text , String Refound_Remarks) throws IOException, InterruptedException {

		CommanUtill.textEnter(Refund_Payable_Name, Payable_Name_Text);
		CommanUtill.textEnter(Refund_Remarks, Refound_Remarks);
	}
	public void RefoundSaveBtnAndYesPop(String Save_Btn , String Yes_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Refund_Save_Btn, Save_Btn);
		if(CommanUtill.isElementPresent(Refund_Save_Yes_Pop)) {
			CommanUtill.clickFunction(Refund_Save_Yes_Pop, Yes_Pop);
			System.out.println("Refound Save Yes Pop");
		}
		else {
			System.out.println("Did Not Apperaed Refound Save Yes Pop");
		}
	}
	//========================== Refound Cheque ==================================
	public void ChequeRadioBtn(String Radio_Btn) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_Cheque_Radio_Btn)));
		CommanUtill.clickFunction(Refound_Cheque_Radio_Btn, Radio_Btn);  
	}
	public void RefoundChequeNo_ChkkBoxIssueDate_IssueDate_BanksNameDrp_BranchName(String Cheque , String Chkk_Issue_Date , 
			String Issue_Date , String Bank_Bame_Drp , String Branch_Name) throws IOException , InterruptedException {

		CommanUtill.textEnter(Refound_Cheque_No, Cheque);
		WebElement Chkk_Box = driver.findElement(By.xpath(Refound_Cheque_Chkk_box_Issue_Date));
		if(! Chkk_Box.isSelected()) {
			CommanUtill.clickFunction(Refound_Cheque_Chkk_box_Issue_Date, Chkk_Issue_Date);
		}	
		WebElement fromDateField = driver.findElement(By.xpath(Refound_Cheque_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Refound_Cheque_Date, Issue_Date);
		fromDateField.sendKeys(Keys.TAB);
		CommanUtill.dropdownSelectByVisibleText(Refound_Cheque_Bank_Name_Drp, Bank_Bame_Drp);
		CommanUtill.textEnter(Refound_Cheque_Branch_Name, Branch_Name);
	}
	public void RefoundInChequeAmount(String Refound_Amount) throws IOException , InterruptedException {

		CommanUtill.textEnter(Refound_Cheque_Amount, Refound_Amount);
	}
	//========================= Refound In Credit Card ===============================

	public void RefoundInCreditCardNumber(String Credit_Card_RadioBtn , String Card_No , String Card_Type_Drp , 
			String Bank_Name_Drp , String Trans_No , String Amount ) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Refound_Credit_Card_Radio_Btn, Credit_Card_RadioBtn);
		CommanUtill.textEnter(Refound_Credit_Card_No, Card_No);
		CommanUtill.dropdownSelectByVisibleText(Refound_Credit_Card_Type_Drp, Card_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Refound_Credit_Card_Bank_Name, Bank_Name_Drp);
		CommanUtill.textEnter(Refound_Credit_Card_Trans_No, Trans_No);
		CommanUtill.textEnter(Refound_Credit_Card_Amount, Amount); 
	}
	//============================== NEFT/RTGS For Processing by Finance ==================================

	public void RadioBtnInNEFT(String Radio_Btn) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_NEFT_Radio_Btn)));
		CommanUtill.clickFunction(Refound_NEFT_Radio_Btn, Radio_Btn);  
	}
	public void NEFTRTGSProcessingFinanceDetails(String Radio_Btn, String Account_No , String Acc_Holder_Name , String Acc_Type , String Bank_Name ,
			String Branch_Name ,String IFSC_Code) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_NEFT_Finance_Radio_Btn)));
		CommanUtill.clickFunction(Refound_NEFT_Finance_Radio_Btn, Radio_Btn);  

		CommanUtill.textEnter(Refound_NEFT_Finance_Account_No, Account_No);
		CommanUtill.textEnter(Refound_NEFT_Account_Holder_Name, Acc_Holder_Name);
		CommanUtill.textEnter(Refound_NEFT_Account_Type, Acc_Type);
		CommanUtill.dropdownSelectByVisibleText(Refound_NEFT_Bank_Name_Drp, Bank_Name);
		CommanUtill.textEnter(Refound_NEFT_Branch_Name, Branch_Name);
		CommanUtill.textEnter(Refound_NEFT_IFSC_Code, IFSC_Code);
	}
	public void NEFTRGTSProcessingFinanceAmount(String Amount)  throws IOException , InterruptedException {

		CommanUtill.textEnter(Refound_NEFT_Finance_Amount, Amount);
	}
	//============================== NEFT/RTGS For Already Processed ==================================

	public void NEFTREGTAlreadyProcessedRadioBtn(String Radio_Btn) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_NEFT_Processed_Radio_Btn)));
		CommanUtill.clickFunction(Refound_NEFT_Processed_Radio_Btn, Radio_Btn);  
	}
	public void NEFTRTGSAlreadyProcessedDetails(String Trans_No , String Trans_Date_Chkk_Box ,String Date , String Bank_Name_Drp ,
			String Branch_Name , String Amount) throws IOException , InterruptedException {

		CommanUtill.textEnter(Refound_NEFT_Processed_Trans_No, Trans_No);
		WebElement Chkk_Box = driver.findElement(By.xpath(Refound_NEFT_Processed_Trans_Date_Chkk_Box));
		if(! Chkk_Box.isSelected()) {
			CommanUtill.clickFunction(Refound_NEFT_Processed_Trans_Date_Chkk_Box, Trans_Date_Chkk_Box);
		}
		CommanUtill.clearTextField(Refound_NEFT_Processed_Trans_Date, Date);
		CommanUtill.textEnter(Refound_NEFT_Processed_Trans_Date, Date);

		CommanUtill.dropdownSelectByVisibleText(Refound_NEFT_Processed_Bank_Name, Bank_Name_Drp);
		CommanUtill.textEnter(Refound_NEFT_Processed_Branch_Name, Branch_Name);
		CommanUtill.textEnter(Refound_NEFT_Processed_Amount, Amount);
	}
	//====================== Refound Other ==============================
	public void RefounfOtherRadioBtn(String Radio_Btn) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_Other_Radio_Btn)));
		CommanUtill.clickFunction(Refound_Other_Radio_Btn, Radio_Btn);  
	}

	public void RefoundOtherDetails(String Payment_Mode , String Transaction , String Remarks , String Amount) 
			throws IOException , InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Refound_Payment_Mode_Drp, Payment_Mode);
		CommanUtill.textEnter(Refound_Other_Transaction_id, Transaction);
		CommanUtill.textEnter(Refound_Other_Remarks, Remarks);
		CommanUtill.textEnter(Refound_Other_Amount, Amount);
	}
	public void RefoundTakePaymentInOther(String Take_Payment) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_Other_Take_Payment_Btn)));
		CommanUtill.clickFunction(Refound_Other_Take_Payment_Btn, Take_Payment);  
	}
	public void RefoundCancelPaymentInOther(String Cancek_Payment) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_Other_Cancel_Payment_Btn)));
		CommanUtill.clickFunction(Refound_Other_Cancel_Payment_Btn, Cancek_Payment);  
	}

	//======================= Refound Receipt Utility ===========================

	public void PrintRefoundReceiptNumber(String Refound_Receipt)  throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refound_Receipt_Last_Row_Table)));
		String  First_Row = driver.findElement(By.xpath(Refound_Receipt_Last_Row_Table)).getText();

		logger.info("==========================Er Refound Receipt Number ============================");
		logger.info(First_Row);
		System.out.println("Er Refound Receipt Print : " + First_Row);
		CommanUtill.clickFunction(Click_Refound_Receipt_Last_Row_Print_Table, First_Row);

	}


}
