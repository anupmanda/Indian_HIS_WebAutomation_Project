/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
 * 18-Feb-2026
 */
public class IPDepositRefundPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String Ip_Deposit_Tab = "//span[normalize-space()='IP Deposit/Refund']";
	//===========================Ip Deposir And Refund Page ============================

	protected static  String Ip_Deposit_PAge = "//li[normalize-space()='IP Deposit/Refund']";
	protected static  String ip_Deposit_Icon = "//h4[@class='fa fa-money']";
	//==========================Search Patint By Date===========================
	protected static  String Click_Search_Icon = "//i[@id='btnSearch']";
	protected static  String Radio_Btn_Cureent_In_Patint = "//input[@id='rbCurrentPatents']";
	protected static  String All_Ward_Chkk_Box = "//input[@id='cbAllWards']";
	protected static  String Admisson_Discharge_Chkk_Box = "//input[@id='cbAdmission']";
	protected static  String From_Date = "//input[@id='txtadmitDate']";
	protected static  String To_Date = "//input[@id='txtadmittodate']";
	protected static  String Search_Btn = "//a[@id='search_billing']//i[@class='fa fa-search']";
	protected static  String Click_Table_last = "//table[@id='searchBillingTable']//tbody//tr[last()]";
	
	//==================================================================
	protected static  String Uhid = "//input[@id='uHid']";
	protected static  String ip_no = "//input[@id='ErNo']";
	protected static  String enter_Deposit_Amount = "//input[@id='Amount']";
	protected static  String Deposit_Remarks = "//input[@id='txtRemarks']";
	protected static  String Click_Edit_Icon = "//button[@id='btnEditReceivedBy']";
	protected static  String Enter_Edit_Box = "//input[@id='txtReceivedBy']";
	protected static  String Relationship_Drp = "//select[@id='ip_relationship']";
	protected static  String Save_Btn = "//a[@id='Deposit']//i[@class='fa fa-usd']";
	protected static  String Save_Yes_pop = "//a[@id='btnDepositeYes']";
	protected static  String Save_Duplicate_Deposit_Yes_pop = "//a[@id='btnDepositYes']";

	protected static  String Deposit_Cash_Radio_Btn = "//input[@id='Cash_']";

	protected static  String Radio_Btn_Cheque = "//input[@id='Cheque_']";
	protected static  String Cheque_No = "//input[@id='cheque_no']";
	protected static  String Cheque_Issue_Date_Check_Box = "//input[@id='Isuecheckbox']";
	protected static  String Cheque_Issue_Date = "//input[@id='Issue_name']";
	protected static  String Cheque_Bank_Name_Drp = "//select[@id='Bank_Name_cheque']";
	protected static  String Cheque_Branch_Name = "//input[@id='Brach_Number']";
	protected static  String Cheque_Amount = "//input[@id='chequeamt']";

	protected static  String Credit_Card_Radio_Btn = "//input[@id='Credit_']";
	protected static  String Credit_Card_Number = "//input[@id='Card_no']";
	protected static  String Credit_Card_Type_Drp = "//select[@id='Crd_name']";
	protected static  String Credit_Card_Bank_Name_Drp = "//select[@id='Bank_Name_Credit']";
	protected static  String Credit_Card_Transaction_Number = "//input[@id='B_Number']";
	protected static  String Credit_Card_Amount = "//input[@id='CreditAmt']";	
	protected static  String Credit_Card_Take_Payment = "//fieldset[@id='radio_change_div_credit']//a[@id='TakepaymentCreditDebit']";

	protected static  String Debit_Card_Radio_Btn = "//input[@id='Debit_']";
	protected static  String Debit_Card_Number = "//input[@id='Card_no']";
	protected static  String Debit_Card_Type_Drp = "//select[@id='Crd_name']";
	protected static  String Debit_Card_Bank_Name_Drp = "//select[@id='Bank_Name_Credit']";
	protected static  String Debit_Card_Transaction_Number = "//input[@id='B_Number']";
	protected static  String Debit_Card_Amount = "//input[@id='CreditAmt']";
	protected static  String Debit_Card_Take_Payment = "//fieldset[@id='radio_change_div_credit']//a[@id='TakepaymentCreditDebit']";

	protected static  String NEFT_Radio_Btn = "//input[@id='Neft_']";
	protected static  String NEFT_Transaction_Number = "//input[@id='neftTrans_no']";
	protected static  String NEFT_Transaction_Date_Check_Box = "//input[@id='CheckTrans']";
	protected static  String NEFT_Transaction_Date = "//input[@id='NeftTrans_date']";
	protected static  String NEFT_Bank_Drp = "//select[@id='Bank_Name_neft']";
	protected static  String NEFT_Branch_Name = "//input[@id='Brach_Number_neft']";
	protected static  String NEFT_Amount = "//input[@id='NeftAmt']";

	protected static  String Other_Payment_Radio_Btn = "//input[@id='Other_']";
	protected static  String Other_Payment_Mode_Drp = "//select[@id='paymentmode_other']";
	protected static  String Other_Payment_Transaction_Id = "//fieldset[@id='radio_change_div_Other']//input[@id='transactionid_other']";	
	protected static  String Other_Payment_RRN_Number = "//input[@id='txtRrnNo']";
	protected static  String Other_Payment_Remarks = "//fieldset[@id='radio_change_div_Other']//input[@id='remark_other']";
	protected static  String Other_Payment_Amount = "//span[@class='amount']//input[@id='OTAmt']";
	protected static  String Other_Payment_Take_Payment = "//fieldset[@id='radio_change_div_Other']//a[@id='TakepaymentCreditDebit']";

	//===========================Ip Refund Page ============================
	protected static  String Ip_Refund_Page = "//a[@id='opbilldiagnostic']";
	protected static  String Deposit_Refund_Table_Last = "//table[@id='tbldeposit']/tbody/tr[last()]";   
	protected static  String Deposit_Refund_Table = "(//table[@id='tbldeposit']/tbody/tr)[last()]";   //entire row
	protected static  String Refund_Cash_Radio_Btn = "//input[@id='Refund_cash']";
	protected static  String Refund_Amount = "//input[@id='RA_Refund']"; 
	protected static  String Payable_Name = "//input[@id='Payble_Refund']";
	protected static  String Refund_Remarks = "//input[@id='Remarks_Refund']";

	protected static  String Refund_Edit = "//button[@id='btnEditReceivedByRefound']";
	protected static  String Refund_Received_From = "//input[@id='txtReceivedByRefound']";

	protected static  String Refund_Save_Btn = "//i[@class='fa fa-rupee']";
	protected static  String Refund_Save_Yes_Pop = "//a[@id='btnRefundYes']";

	//===========================Ip Refund Cheque Information ============================
	protected static  String Refund_Cheque_Radio_Btn = "//input[@id='Cheque_refund']";
	protected static  String Refund_Cheque_No = "//input[@id='refund_cheque_no']";
	protected static  String Refund_Cheque_Issue_Date_Check_Box = "//input[@id='CheckRefound']";
	protected static  String Refund_Cheque_Issue_Date = "//input[@id='refund_Issue_name']";
	protected static  String Refund_Cheque_Bank_Name_Drp = "//select[@id='refund_Bank_Name_cheque']";
	protected static  String Refund_Cheque_Branch_Name = "//input[@id='refund_Brach_Number']";
	protected static  String Refund_Cheque_Amount = "//input[@id='Cheque_Amount_refund_Number']";
	
	//===========================Ip D Refund Credit Card ============================
	protected static  String Refund_Credit_Card_Radio_Btn = "//input[@id='Credit_refund']";
	protected static  String Refund_Credit_Card_Number = "//input[@id='refund_Card_no']";
	protected static  String Refund_Credit_Card_Type_Drp = "//select[@id='refund_Crd_name']";
	protected static  String Refund_Credit_Card_Bank_Name_Drp = "//select[@id='refund_Bank_Name']";
	protected static  String Refund_Credit_Batch_Number = "//input[@id='refund_B_Number']";
	protected static  String Refund_Credit_Card_Amount = "//input[@id='Credit_Amount_refund_Number']";
	
   protected static  String Refund_NEFT_Radio_Btn = "//input[@id='Neft_refund']";
   
   protected static  String Processing_Finance_NEFT_Radio_Btn = "//input[@id='_Pfince']";
   protected static  String Processing_Finance_Account_No = "//input[@id='neftPfince_acn']";
   protected static  String Processing_Finance_Account_Holder_Name = "//input[@id='neftPfince_achn']";
   protected static  String Processing_Finance_Account_Type = "//input[@id='neftPfince_act']";
   protected static  String Processing_Finance_Bank_Name_Drp = "//select[@id='neftPfince_bnk']";
   protected static  String Processing_Finance_Branch_Name = "//input[@id='neftPfince_bnch']";
   protected static  String Processing_Finance_IFSC_Code = "//input[@id='neftPfince_ifsc']";
   protected static  String Processing_Finance_Amount = "//input[@id='neftPfince_Amount']";
   
   protected static  String NEFT_Already_Processed_Radio_Btn = "//input[@id='_alpro']";
   protected static  String Already_Processed_Trans_No = "//input[@id='refund_neftTrans_no']";
   protected static  String Already_Processed_Tans_Date_Check_Box = "//input[@id='CheckDeposit2']";
   protected static  String Already_Processed_Trans_Date = "//input[@id='refund_NeftTrans_date']";
   protected static  String Already_Processed_Bank_Name_Drp = "//select[@id='refund_Bank_Name_neft']";
   protected static  String Already_Processed_Branch_Name = "//input[@id='refund_Brach_Number_neft']";
   protected static  String Already_Processed_Amount = "//input[@id='Neft_Amount_refund_Number']";
   
   protected static  String Refund_Other_Radio_Btn = "//input[@id='Other_refund']";
   protected static  String Refund_Other_Payment_Mode_Drp = "//select[@id='refund_paymentmode_other']";
   protected static  String Refund_Other_Payment_Transaction_Id = "//input[@id='refund_transactionid_other']";
   protected static  String Refund_Other_Payment_RRN_Number = "//input[@id='refund_remark_other']";
   protected static  String Refund_Other_Payment_Amount = "//input[@id='Other_Amount_refund_Number']";

 //==========================Receipt Utility ============================
   protected static  String Click_Recepit_Btn = "//button[@id='btnReceiptUti']";
   protected static  String Recepit_Ip_No = "//input[@id='txtIpId']";   //Enter Use
   protected static  String Recepit_No = "//input[@id='txtReceipt']";
   protected static  String Enter_Recepit_No_Table_Print = "//table[@id='dgbilldetails']//tbody//tr[position()=1]//i[@class='fa fa-print print']";
   protected static  String Recepit_Pop_Refresh_Icon = "//i[@class='fa fa-repeat']";
   
   protected static  String Recepit_Date_Check_Box = "//input[@id='chkDateRange']";
   protected static  String Recepit_From_Date = "//input[@id='dtpfromdate']";
   protected static  String Recepit_To_Date = "//input[@id='dtptodate']";
   protected static  String Recepit_Search_Btn = "//a[@id='btnDateSearch']//i[@class='fa fa-search']";
   protected static  String First_Pink_Row = "(//table[@id='dgbilldetails']//tbody/tr[contains(@class,'bg-pink')])[1]";
   protected static  String Print_Icon_Table = First_Pink_Row + "//a[@title='Print']";
   
   //========================HIS Logo ===========================
   protected static  String Click_HIS_Logo = "//div[@class='logoHis']";
	//======================Op Deposit============================
   protected static  String Op_Deposit_Btn = "//h4[@class='fa fa-indent']";
   protected static  String Op_Deposit_Transfer_Check_Box = "//input[@id='cbdeposite']";
   protected static String allCheckBoxes = "//table[@id='optbldeposit']//input[@type='checkbox']";
   protected static String lastCheckBox ="//table[@id='optbldeposit']//tr[last()]//input[@type='checkbox']";
   protected static  String Transferring_Amountr = "//table[@id='optbldeposit']//tbody/tr[last()]//td[@ctype='TAmt']//input";
 
   protected static  String Save_op_Deposit = "//a[@id='OpDeposit']//i[@class='fa fa-usd']";
   protected static  String Op_Deposit_Yes_Pop = "//a[@id='btnOPDepositeYes']";
   
   

	




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

		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}

	public void DepositAndRefundPage (String Ip_Deposit , String IpDeposit_Refund_Page) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Ip_Deposit_Tab)));
		CommanUtill.clickFunction(Ip_Deposit_Tab, Ip_Deposit);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Ip_Deposit_PAge)));
		CommanUtill.clickFunction(Ip_Deposit_PAge, IpDeposit_Refund_Page);
	}

	public void ClickOnIpDepositIcon (String Ip_Deposit) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( ip_Deposit_Icon)));
		CommanUtill.clickFunction(ip_Deposit_Icon, Ip_Deposit);

	}
	//==========================Search Patint By Date===========================
	public void ClickOnSearchIcon (String Search_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Click_Search_Icon)));
		CommanUtill.clickFunction(Click_Search_Icon, Search_Icon);
	}
	public void RadioBtnCurrentInPatientAndAllWardCheckBox (String Current_In_Patient_Radio_Btn , String All_Ward) 
			throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Radio_Btn_Cureent_In_Patint)));
		if(! driver.findElement(By.xpath(Radio_Btn_Cureent_In_Patint)).isSelected()) {
			CommanUtill.clickFunction(Radio_Btn_Cureent_In_Patint, Current_In_Patient_Radio_Btn);
		}
		if(! driver.findElement(By.xpath(All_Ward_Chkk_Box)).isSelected()) {
			CommanUtill.clickFunction(All_Ward_Chkk_Box, All_Ward);
		}
	}
	public void AdmissionDischargeCheckBox (String Admission_Discharge) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Admisson_Discharge_Chkk_Box)));
		if(! driver.findElement(By.xpath(Admisson_Discharge_Chkk_Box)).isSelected()) {
			CommanUtill.clickFunction(Admisson_Discharge_Chkk_Box, Admission_Discharge);
		}
	}
	public void EnterFromDateAndToDate (String From_Date_Text , String To_Date_Text) throws IOException ,InterruptedException {

		WebElement From_Date_Element = driver.findElement(By.xpath(From_Date));
		From_Date_Element.sendKeys(Keys.CONTROL + "a");
		From_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(From_Date, From_Date_Text);

		WebElement To_Date_Element = driver.findElement(By.xpath(To_Date));
		To_Date_Element.sendKeys(Keys.CONTROL + "a");
		To_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(To_Date, To_Date_Text);
	}
	public void ClickOnSearchBtnInFindPatientPop (String Search_Btn_Text) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Search_Btn)));
		CommanUtill.clickFunction(Search_Btn, Search_Btn_Text);
	}
	
	public void ClickOnLastRowInSearchPatientTable (String Table_Last) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Click_Table_last)));
		String Last_Row_Text = driver.findElement(By.xpath(Click_Table_last)).getText();
		logger.info("Last Row Text: " + Last_Row_Text);
		System.out.println("Last Row Text: " + Last_Row_Text);
		CommanUtill.clickFunction(Click_Table_last, Table_Last);
	}
	
	public void EnterUhid (String Uhid_Number) throws IOException ,InterruptedException {

		WebElement Enter_Uhid = driver.findElement(By.xpath(Uhid));
		CommanUtill.textEnter(Uhid, Uhid_Number);
		Enter_Uhid.sendKeys(Keys.ENTER);
	}
	public void EnterIpNumber (String Ip_Number) throws IOException ,InterruptedException {

		WebElement Enter_Ip_Number = driver.findElement(By.xpath(ip_no));
		CommanUtill.textEnter(ip_no, Ip_Number);
		Enter_Ip_Number.sendKeys(Keys.ENTER);
	}

	public void EnterDepositAmountAndRemaks (String Deposit_Amount , String Remarks) throws IOException ,InterruptedException {

		CommanUtill.textEnter(enter_Deposit_Amount, Deposit_Amount);
		CommanUtill.textEnter(Deposit_Remarks, Remarks);
	}

	public void ClickOnEditBtnAndEnterReceivedFrom (String Edit_Btn , String Received_From) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Click_Edit_Icon, Edit_Btn);
		WebElement Re_Text = driver.findElement(By.xpath(Enter_Edit_Box));
		Re_Text.sendKeys(Keys.CONTROL + "a");
		Re_Text.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Enter_Edit_Box, Received_From);
	}

	public void SelectRelationshipDrp (String Relationship) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Relationship_Drp, Relationship);
	}

	public void ClickOnDepositCashRadioBtn (String Cash_Radio_Btn) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Deposit_Cash_Radio_Btn)));
		CommanUtill.clickFunction(Deposit_Cash_Radio_Btn, Cash_Radio_Btn);
	}

	public void ClickOnSaveBtn (String Save_Icon , String Yes_pop) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Btn)));
		CommanUtill.clickFunction(Save_Btn, Save_Icon);

		if(CommanUtill.isElementPresent(Save_Yes_pop)) {
			CommanUtill.clickFunction(Save_Yes_pop, Yes_pop);
			System.out.println("Clicked on Save confirmation popup.");
		} else {
			System.out.println("Save confirmation popup did not appear.");
		}	
	}

	public void ClickOnSaveBtnForDuplicateDeposit (String Yes_pop) throws IOException ,InterruptedException {

		if(CommanUtill.isElementPresent(Save_Duplicate_Deposit_Yes_pop)) {
			CommanUtill.clickFunction(Save_Duplicate_Deposit_Yes_pop, Yes_pop);
			System.out.println("Duplicate Deposit Yes popup.");
		} else {
			System.out.println("Duplicate Deposit Yes popup did not appear.");
		}	
	}
	//=======================UpDated Method For Save Button To Handle Both Normal Save And Duplicate Deposit Pop Up========================
	public void ClickOnSaveBtnAndYesDuplicatePop(String Save_Icon, String Yes_pop, String Yes_Duplicate_pop) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Btn)));
	    CommanUtill.clickFunction(Save_Btn, Save_Icon);

	    Thread.sleep(2000); // short wait for popup load

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
	
	public void DepositPopupPrintBtn (String Print_Btn) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(15));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		logger.info("Alert Text: " + alert.getText());
		String alertText = alert.getText();
		//alert.accept(); // Accept the alert to close it

		if (alertText.contains("Do you want to print receipt?")) {
			alert.accept();
			logger.info("Clicked on 'OK' in the alert.");
		} else {
			logger.warning("Unexpected alert text: " + alertText);
			alert.dismiss();
			logger.info("Clicked on 'Cancel' in the alert.");
		}

	}

	public void ClickOnDepositChequeRadionInformation (String Cheque_Radio_Btn , String DD_No , String Chkk_Box_Issue_Date , String Enter_Date ,
			String Bank_Name_Drp , String Branch_Name , String Amount ) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Radio_Btn_Cheque, Cheque_Radio_Btn);
		CommanUtill.textEnter(Cheque_No, DD_No);
		WebElement Date_Check_Box = driver.findElement(By.xpath(Cheque_Issue_Date_Check_Box));
		if(! Date_Check_Box.isSelected()) {
			CommanUtill.clickFunction(Cheque_Issue_Date_Check_Box, Chkk_Box_Issue_Date);
		}
		WebElement Cheque_Date = driver.findElement(By.xpath(Cheque_Issue_Date));
		Cheque_Date.sendKeys(Keys.CONTROL + "a");
		Cheque_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Cheque_Issue_Date, Enter_Date);
		Cheque_Date.sendKeys(Keys.TAB);

		CommanUtill.dropdownSelectByVisibleText(Cheque_Bank_Name_Drp, Bank_Name_Drp);
		CommanUtill.textEnter(Cheque_Branch_Name, Branch_Name);
		CommanUtill.textEnter(Cheque_Amount, Amount);
	}
	public void ClickOnDepositCreditCardRadionInformation (String Credit_Card_Radio_Icon , String Card_Number , String Card_Type_Drp , String Bank_Name_Drp ,
			String Transaction_Number , String Amount ) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Credit_Card_Radio_Btn, Credit_Card_Radio_Icon);
		WebElement Card_No = driver.findElement(By.xpath(Credit_Card_Number));
		Card_No.sendKeys(Keys.CONTROL + "a");
		Card_No.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Credit_Card_Number, Card_Number);

		CommanUtill.dropdownSelectByVisibleText(Credit_Card_Type_Drp, Card_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Credit_Card_Bank_Name_Drp, Bank_Name_Drp);
		WebElement Transaction_No = driver.findElement(By.xpath(Credit_Card_Transaction_Number));
		Transaction_No.sendKeys(Keys.CONTROL + "a");
		Transaction_No.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Credit_Card_Transaction_Number, Transaction_Number);
		CommanUtill.textEnter(Credit_Card_Amount, Amount);
	}

	public void ClickOnCreditCardTakePaymentBtn (String Take_Payment) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Credit_Card_Take_Payment)));
		CommanUtill.clickFunction(Credit_Card_Take_Payment, Take_Payment);
	}

	public void ClickOnDepositDebitCardRadionInformation (String Debit_Card_Radio_Icon , String Card_Number , String Card_Type_Drp , 
			String Bank_Name_Drp , String Transaction_Number , String Amount ) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Debit_Card_Radio_Btn, Debit_Card_Radio_Icon);
		WebElement Card_No = driver.findElement(By.xpath(Debit_Card_Number));
		Card_No.sendKeys(Keys.CONTROL + "a");
		Card_No.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Debit_Card_Number, Card_Number);

		CommanUtill.dropdownSelectByVisibleText(Debit_Card_Type_Drp, Card_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Debit_Card_Bank_Name_Drp, Bank_Name_Drp);
		WebElement Transaction_No = driver.findElement(By.xpath(Debit_Card_Transaction_Number));
		Transaction_No.sendKeys(Keys.CONTROL + "a");
		Transaction_No.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Debit_Card_Transaction_Number, Transaction_Number);
		CommanUtill.textEnter(Debit_Card_Amount, Amount);
	}

	public void ClickOnDebitCardTakePaymentBtn (String Take_Payment) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Debit_Card_Take_Payment)));
		CommanUtill.clickFunction(Debit_Card_Take_Payment, Take_Payment);
	}

	public void ClickOnDepositNEFTRadionInformation (String NEFT_Radio_Icon , String Transaction_Number , String Transaction_Date_Check_Box , String Transaction_Date ,
			String Bank_Name_Drp , String Branch_Name , String Amount ) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(NEFT_Radio_Btn, NEFT_Radio_Icon);
		CommanUtill.textEnter(NEFT_Transaction_Number, Transaction_Number);
		WebElement Date_Check_Box = driver.findElement(By.xpath(NEFT_Transaction_Date_Check_Box));
		if(! Date_Check_Box.isSelected()) {
			CommanUtill.clickFunction(NEFT_Transaction_Date_Check_Box, Transaction_Date_Check_Box);
		}
		WebElement NEFT_Date = driver.findElement(By.xpath(NEFT_Transaction_Date));
		NEFT_Date.sendKeys(Keys.CONTROL + "a");
		NEFT_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(NEFT_Transaction_Date, Transaction_Date);
		NEFT_Date.sendKeys(Keys.TAB);
		CommanUtill.dropdownSelectByVisibleText(NEFT_Bank_Drp, Bank_Name_Drp);
		CommanUtill.textEnter(NEFT_Branch_Name, Branch_Name);
		CommanUtill.textEnter(NEFT_Amount, Amount);

	}	
	public void ClickOnDepositOtherPaymentRadionInformation (String Other_Payment_Radio_Icon , String Payment_Mode_Drp , String Transaction_Id ,
			String RRN_Number , String Remarks , String Amount ) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Other_Payment_Radio_Btn, Other_Payment_Radio_Icon);
		CommanUtill.dropdownSelectByVisibleText(Other_Payment_Mode_Drp, Payment_Mode_Drp);
		CommanUtill.textEnter(Other_Payment_Transaction_Id, Transaction_Id);
		//CommanUtill.textEnter(Other_Payment_RRN_Number, RRN_Number);
		CommanUtill.textEnter(Other_Payment_Remarks, Remarks);

		WebElement Amount_Text = driver.findElement(By.xpath(Other_Payment_Amount));
		Amount_Text.sendKeys(Keys.CONTROL + "a");
		Amount_Text.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Other_Payment_Amount, Amount);		

	}
	public void ClickOnOtherPaymentTakePaymentBtn (String Take_Payment) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Other_Payment_Take_Payment)));
		CommanUtill.clickFunction(Other_Payment_Take_Payment, Take_Payment);
	}

	//===========================Ip Refund Page ============================

	public void ClickOnIpRefundPage (String Ip_Refund) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Ip_Refund_Page)));
		CommanUtill.clickFunction(Ip_Refund_Page, Ip_Refund);
	}

	public void GetDepositRefundTableData (String Table_click) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Deposit_Refund_Table)));
		CommanUtill.clickFunction(Deposit_Refund_Table, Table_click);
		String Table_Data = driver.findElement(By.xpath(Deposit_Refund_Table)).getText();
		System.out.println("Last Row Data: " + Table_Data);
	}

	public void ClickOnRefundCashRadioBtn (String Refund_Cash_Radio_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refund_Cash_Radio_Btn)));
		CommanUtill.clickFunction(Refund_Cash_Radio_Btn, Refund_Cash_Radio_Icon);
	}

	public void EnterRefundAmountAndDetails (String Refund_Value , String Payable_Name_Text , String Refund_Remark) 
			throws IOException ,InterruptedException {

		CommanUtill.textEnter(Refund_Amount, Refund_Value);
		CommanUtill.textEnter(Payable_Name, Payable_Name_Text);
		CommanUtill.textEnter(Refund_Remarks, Refund_Remark);
	}

	public void ClickOnRefundEditBtnAndEnterReceivedFrom (String Refund_Edit_Icon , String Received_From) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refund_Edit)));
		CommanUtill.clickFunction(Refund_Edit, Refund_Edit_Icon);
		
		WebElement Re_Text = driver.findElement(By.xpath(Refund_Received_From));
		Re_Text.sendKeys(Keys.CONTROL + "a");
		Re_Text.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Refund_Received_From, Received_From);
	}
	public void ClickOnRefundSaveBtn (String Refund_Save_Icon , String Refund_Save_Yes_Popup) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refund_Save_Btn)));
		CommanUtill.clickFunction(Refund_Save_Btn, Refund_Save_Icon);

		if(CommanUtill.isElementPresent(Refund_Save_Yes_Pop)) {
			WebDriverWait wait1 = new WebDriverWait( driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(Refund_Save_Yes_Pop)));
			CommanUtill.clickFunction(Refund_Save_Yes_Pop, Refund_Save_Yes_Popup);
			System.out.println("Clicked on Refund Save confirmation popup.");
		} else {
			System.out.println("Refund Save confirmation popup did not appear.");
		}	
	}
	
	//===========================Ip Refund Cheque Information ============================
	public void ClickOnRefundChequeRadionInformation (String Refund_Cheque_Radio_Icon , String Cheque_No , String Cheque_Issue_Date_Check_Box , String Cheque_Issue_Date ,
			String Bank_Name_Drp , String Branch_Name , String Amount) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Refund_Cheque_Radio_Btn, Refund_Cheque_Radio_Icon);
		CommanUtill.textEnter(Refund_Cheque_No, Cheque_No);
		WebElement Date_Check_Box = driver.findElement(By.xpath(Refund_Cheque_Issue_Date_Check_Box));
		if(! Date_Check_Box.isSelected()) {
			CommanUtill.clickFunction(Refund_Cheque_Issue_Date_Check_Box, Cheque_Issue_Date_Check_Box);
		}
		WebElement Cheque_Date = driver.findElement(By.xpath(Refund_Cheque_Issue_Date));
		Cheque_Date.sendKeys(Keys.CONTROL + "a");
		Cheque_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Refund_Cheque_Issue_Date, Cheque_Issue_Date);
		Cheque_Date.sendKeys(Keys.TAB);

		CommanUtill.dropdownSelectByVisibleText(Refund_Cheque_Bank_Name_Drp, Bank_Name_Drp);
		CommanUtill.textEnter(Refund_Cheque_Branch_Name, Branch_Name);
		CommanUtill.textEnter(Refund_Cheque_Amount, Amount);	
		
	}
	
	public void ClickOnRefundCreditCardRadionInformation (String Refund_Credit_Card_Radio_Icon , String Card_Number , String Card_Type_Drp , String Bank_Name_Drp ,
			String Batch_Number , String Amount) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Refund_Credit_Card_Radio_Btn, Refund_Credit_Card_Radio_Icon);
		WebElement Card_No = driver.findElement(By.xpath(Refund_Credit_Card_Number));
		Card_No.sendKeys(Keys.CONTROL + "a");
		Card_No.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Refund_Credit_Card_Number, Card_Number);

		CommanUtill.dropdownSelectByVisibleText(Refund_Credit_Card_Type_Drp, Card_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Refund_Credit_Card_Bank_Name_Drp, Bank_Name_Drp);
		WebElement Batch_No = driver.findElement(By.xpath(Refund_Credit_Batch_Number));
		Batch_No.sendKeys(Keys.CONTROL + "a");
		Batch_No.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Refund_Credit_Batch_Number, Batch_Number);
		CommanUtill.textEnter(Refund_Credit_Card_Amount, Amount);
		
	}
	
	public void ClickOnRefundNEFTAndProcessing_FinanceRadionInformation (String Refund_NEFT_Radio_Icon , String  Processing_Finance_Radio_Btn , 
			String Account_No , String Account_Holder_Name , String Account_Type ,String Bank_Name_Drp ,
			String Branch_Name , String IFSC_Code , String Amount) throws IOException ,InterruptedException {
		
		CommanUtill.clickFunction(Refund_NEFT_Radio_Btn, Refund_NEFT_Radio_Icon);
		CommanUtill.clickFunction(Processing_Finance_NEFT_Radio_Btn, Processing_Finance_Radio_Btn);
		CommanUtill.textEnter(Processing_Finance_Account_No, Account_No);
        CommanUtill.textEnter(Processing_Finance_Account_Holder_Name, Account_Holder_Name);
        CommanUtill.textEnter(Processing_Finance_Account_Type, Account_Type);
        CommanUtill.dropdownSelectByVisibleText(Processing_Finance_Bank_Name_Drp, Bank_Name_Drp);
        CommanUtill.textEnter(Processing_Finance_Branch_Name, Branch_Name);
        CommanUtill.textEnter(Processing_Finance_IFSC_Code, IFSC_Code);
        CommanUtill.textEnter(Processing_Finance_Amount, Amount);
        		
   }
	
	public void ClickOnRefundNEFTAlreadyProcessedRadionInformation (String NEFT_Radio_Icon , String Already_Processe , String Trans_No , String Tans_Date_Check_Box ,
			String Trans_Date , String Bank_Name_Drp ,String Branch_Name , String Amount)
					throws IOException ,InterruptedException {	
		
		CommanUtill.clickFunction(Refund_NEFT_Radio_Btn, NEFT_Radio_Icon);
		CommanUtill.clickFunction(NEFT_Already_Processed_Radio_Btn, Already_Processe);
		CommanUtill.textEnter(Already_Processed_Trans_No, Trans_No);
		
		WebElement Date_Check_Box = driver.findElement(By.xpath(Already_Processed_Tans_Date_Check_Box));
		if(! Date_Check_Box.isSelected()) {
			CommanUtill.clickFunction(Already_Processed_Tans_Date_Check_Box, Tans_Date_Check_Box);
		}
		
		WebElement NEFT_Trans_Date = driver.findElement(By.xpath(Already_Processed_Trans_Date));
		NEFT_Trans_Date.sendKeys(Keys.CONTROL + "a");
		NEFT_Trans_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Already_Processed_Trans_Date, Trans_Date);
		NEFT_Trans_Date.sendKeys(Keys.TAB);
		
		CommanUtill.dropdownSelectByVisibleText(Already_Processed_Bank_Name_Drp, Bank_Name_Drp);
		CommanUtill.textEnter(Already_Processed_Branch_Name, Branch_Name);
		CommanUtill.textEnter(Already_Processed_Amount, Amount);		
	}
	
	public void ClickOnRefundOtherPaymentRadionInformation (String Refund_Other_Radio_Icon , String Payment_Mode_Drp , String Transaction_Id ,
			String RRN_Number , String Amount) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Refund_Other_Radio_Btn, Refund_Other_Radio_Icon);
		CommanUtill.dropdownSelectByVisibleText(Refund_Other_Payment_Mode_Drp, Payment_Mode_Drp);
		CommanUtill.textEnter(Refund_Other_Payment_Transaction_Id, Transaction_Id);
		//CommanUtill.textEnter(Refund_Other_Payment_RRN_Number, RRN_Number);
		CommanUtill.textEnter(Refund_Other_Payment_Amount, Amount);		

	}
	
	//==========================Receipt Utility ============================
	public void ClickOnReceiptUtility (String Receipt_Utility) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Recepit_Btn)));
		CommanUtill.clickFunction(Click_Recepit_Btn, Receipt_Utility);
	}
	public void EnterReceptIpNumber (String Recept_Ip_No) throws IOException ,InterruptedException {

		WebElement Ip_Number = driver.findElement(By.xpath(Recepit_Ip_No));
		CommanUtill.textEnter(Recepit_Ip_No, Recept_Ip_No);
		Ip_Number.sendKeys(Keys.ENTER);
	}
	
	public void EnterReceptNumberAndPrint (String Recept_No , String Print_Icon_Table) throws IOException ,InterruptedException {

		WebElement Recept_Number = driver.findElement(By.xpath(Recepit_No));
		CommanUtill.textEnter(Recepit_No, Recept_No);
		Recept_Number.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Enter_Recepit_No_Table_Print)));
		String Print_Icon_Element = driver.findElement(By.xpath("//table[@id='dgbilldetails']//tbody//tr[position()=1]")).getText();
		logger.info("First Row Print: " + Print_Icon_Element);
		System.out.println("First Row Print: " + Print_Icon_Element);
		Thread.sleep(800);
		CommanUtill.clickFunction(Enter_Recepit_No_Table_Print, Print_Icon_Table);
		
	}
	public void ClickOnReceptPopRefreshIcon (String Refresh_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Recepit_Pop_Refresh_Icon)));
		CommanUtill.clickFunction(Recepit_Pop_Refresh_Icon, Refresh_Icon);
	}
	
	public void CheckBoxRangeDateReceptFromAndToDate (String Chkk_Box_Range ,String Recept_From_Date , String Recept_To_Date) throws IOException ,InterruptedException {

		WebElement Range_Date_Check_Box = driver.findElement(By.xpath(Recepit_Date_Check_Box));
		if(! Range_Date_Check_Box.isSelected()) {
			CommanUtill.clickFunction(Recepit_Date_Check_Box, Chkk_Box_Range);
		}
		WebElement From_Date_Element = driver.findElement(By.xpath(Recepit_From_Date));
		From_Date_Element.sendKeys(Keys.CONTROL + "a");
		From_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Recepit_From_Date, Recept_From_Date);
		From_Date_Element.sendKeys(Keys.TAB);

		WebElement To_Date_Element = driver.findElement(By.xpath(Recepit_To_Date));
		To_Date_Element.sendKeys(Keys.CONTROL + "a");
		To_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Recepit_To_Date, Recept_To_Date);
		To_Date_Element.sendKeys(Keys.TAB);
	}
	public void ClickOnSearchBtnInReceiptUtility (String Search_Btn) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Recepit_Search_Btn)));
		CommanUtill.clickFunction(Recepit_Search_Btn, Search_Btn);
	}
	
	public void clickFirstPinkRowPrint(String Firs_Pink_Row_Print_Icon) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Print_Icon_Table)));

	    // Get Full Row Text
	    String rowData = driver.findElement(By.xpath(First_Pink_Row)).getText();

	    logger.info("========== First Pink Row Data ==========");
	    logger.info(rowData);
	    System.out.println("First Pink Row Data: " + rowData);

	    Thread.sleep(500);

	    // Direct Click On Print Icon
	    CommanUtill.clickFunction(Print_Icon_Table, Firs_Pink_Row_Print_Icon);

	    logger.info("Clicked Print Icon Of First Pink Row Successfully");
	}
	//========================HIS Logo ===========================
	public void ClickOnHISLogo (String HIS_Logo) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_HIS_Logo)));
		CommanUtill.clickFunction(Click_HIS_Logo, HIS_Logo);
		
	}
	
	//======================Op Deposit============================
	
	public void ClickOnOpDeposit (String Op_Deposit) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Op_Deposit_Btn)));
		CommanUtill.clickFunction(Op_Deposit_Btn, Op_Deposit);
	}
	public void ClickOnOpDepositTransferCheckBox (String Op_DepositTransfer_Check_Box) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Op_Deposit_Transfer_Check_Box)));
		
		if(! driver.findElement(By.xpath(Op_Deposit_Transfer_Check_Box)).isSelected()) {
			CommanUtill.clickFunction(Op_Deposit_Transfer_Check_Box, Op_DepositTransfer_Check_Box);
		}
	}
	

	public void SelectOnOpDepositTransferCheckBox(String Transfer_Check_Box) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(allCheckBoxes)));

	    List<WebElement> checkBoxes = driver.findElements(By.xpath(allCheckBoxes));

	    // Unselect all first
	    for (WebElement cb : checkBoxes) {
	        if (cb.isSelected()) {
	            cb.click();
	        }
	    }

	    //  Now select last row checkbox
	    WebElement last = driver.findElement(By.xpath(lastCheckBox));

	    if (!last.isSelected()) {
	        last.click();
	    }
	}
	
	
	
	
	
	
	public void EnterOpDepositTransferringAmount (String Transferring_Amount) throws IOException ,InterruptedException{
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Transferring_Amountr)));
		CommanUtill.textEnter(Transferring_Amountr, Transferring_Amount);
	}
	public void ClickOnSaveOpDepositYesyPop (String Save_Icon , String Yes_Pop) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_op_Deposit)));
		CommanUtill.clickFunction(Save_op_Deposit, Save_Icon);

		if(CommanUtill.isElementPresent(Op_Deposit_Yes_Pop)) {
			WebDriverWait wait1 = new WebDriverWait( driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(Op_Deposit_Yes_Pop)));
			CommanUtill.clickFunction(Op_Deposit_Yes_Pop, Yes_Pop);
			System.out.println("Clicked on OP Deposit confirmation popup.");
		} else {
			System.out.println("OP Deposit confirmation popup did not appear.");
		}
	}
	
	

}
