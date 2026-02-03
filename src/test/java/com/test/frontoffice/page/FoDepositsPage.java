/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.time.Duration;

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
 * 14-Jan-2026
 */
public class FoDepositsPage extends GeneralBrowserSetting{
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";
	
//--------------------------------------Deposite page locators------------------------------
	protected static String click_billing_btn = "//span[normalize-space()='Billing']";
	protected static String Report_Deposite_page = "//a[normalize-space()='Deposits']"; 
	
	protected static String enter_uhid = "//input[@id='uHid']";
	protected static String enter_card_no = "//input[@id='cardNo']";
	protected static String amount_enter = "//input[@id='Amount']";
	protected static String remarks_text = "//textarea[@id='Remarks']";
	protected static String edit_btn_click = "//button[@id='btnEditReceivedBy']";
	protected static String Received_From_after_edit_btn = "//input[@id='txtReceivedBy']";
	protected static String Relationship_drp = "//select[@id='relationship_id']";
	protected static String deposit_Type = "//select[@id='chksecdep']";
	protected static String chekk_home_care = "//input[@id='chkHomeCare']";
	protected static String WalleTree_Card_Recharge = "//input[@id='Rechrge']";
	
	//--------------------------------------payment Mode------------------------------
	protected static String payment_Mode_cash_radio_btn = "//input[@id='Cash_']";
	protected static String payment_Mode_Cheque_radio_btn = "//input[@id='Cheque_']";
	protected static String payment_Mode_Cheque_No = "//input[@id='cheque_no']";
	protected static String payment_Mode_Cheque_issue_date = "//input[@id='Issue_name']";
	protected static String payment_Mode_Cheque_bank_name_drp = "//select[@id='Bank_Name_cheque']";
	protected static String payment_Mode_Cheque_branch_name = "//input[@id='Brach_Number']";
	
	protected static String payment_Mode_Credit_radio_btn = "//input[@id='Credit_']";
	protected static String payment_Mode_Credit_card_no = "//input[@id='Card_no_Credit']";
	protected static String payment_Mode_Credit_card_type = "//select[@id='Crd_name']";
	protected static String payment_Mode_Credit_bank_name = "//select[@id='Bank_Name_cr']";
	protected static String payment_Mode_Credit_Transaction_id = "//input[@id='B_Number_credit']";
	protected static String payment_Mode_Credit_other_details = "//input[@id='ccOtherDetails']";
	protected static String payment_Mode_Credit_card_take_payment = "//a[@id='TakepaymentCredit']";
	protected static String payment_Mode_Debit_card_payment_cancel = "//a[@id='IciciPayCancelPaymentCredit']";
	
	protected static String save_btn = "//a[@id='Deposit_btn']";
	protected static String save_Yes_Popup = "//a[@id='btnDepConfirmYes']";
    protected static String print_btn = "//a[@id='DepositPrint_btn']";
    protected static String deposit_table_click = "//div[@id='schedules_Container']//div//table//tr[1]//td[1]";
    protected static String change_deposite_type = "//a[@id='SecurityDeposit_btn']";
    protected static String change_deposit_yes_popup = "//a[@id='btnsecDepConfirmYes']";
	
	//-------------------------------Refund Details Page---------------------------------
    
    protected static String refund_detalis_btn = "//a[@id='opbilldiagnostic']";
    protected static String refund_Enter_UHID = "//input[@id='uHid']";
	protected static String refund_deposit_table = "//div[@id='secdivsame']//div[@id='tablediv']//tr[1]//td[2]";
	protected static String refund_amount = "//input[@id='RA_Refund']";
	protected static String Payable_Name_text = "//input[@id='Payble_Refund']";
	protected static String refound_remarks = "//input[@id='Remarks_Refund']";
	protected static String refund_WalleTree_Card_Recharge_chkk = "//input[@id='Rechrge']";
	
	protected static String refund_cash_radio_btn = "//input[@id='Refund_cash']";
	protected static String refund_cheque_radio_btn = "//input[@id='Cheque_refund']";
	protected static String refund_cheque_no = "//input[@id='refund_cheque_no']";
	protected static String refund_cheque_issue_date = "//input[@id='refund_Issue_name']";
	protected static String refund_cheque_bank_name_drp = "//select[@id='refund_Bank_Name_cheque']";
	protected static String refund_cheque_branch_name = "//input[@id='refund_Brach_Number']";
	protected static String refund_cheque_amount = "//input[@id='Cheque_Amount_refund_Number']";
	 
	protected static String refund_credit_radio_btn = "//input[@id='Credit_refund']";
	protected static String refund_credit_card_no = "//input[@id='refund_Card_no']";
	protected static String refund_credit_card_type_drp = "//select[@id='refund_Crd_name']";
	protected static String refund_credit_bank_name_drp = "//select[@id='refund_Bank_Name']";
	protected static String refund_credit_Branch_name = "//input[@id='refund_B_Number']";
	protected static String refund_credit_amount = "//input[@id='Credit_Amount_refund_Number']";
	
	protected static String refund_save_btn = "//a[@id='Refund_btn']"; //chage 2nd time
	protected static String refund_save_yes_popup = "//a[@id='btnRefConfirmYes']";
	//
	protected static String deposit_refund_Reason_popup = "//select[@id='reasonForApprovalremark']";
	protected static String deposit_refund_Remaks_popup = "//textarea[@id='rfnRemarks']";
	protected static String deposit_refund_send_approval_Req_popup = "//button[@id='sendRequest']";
			
	
	
	//------------------------------Receipt Utility ---------------------------------
	
	protected static String receipt_utility_btn = "//button[@id='btnReceiptUti']";
	protected static String receipt_utility_uhid = "//input[@id='txt_uhid']";
	protected static String receipt_utility_serach = "//a[@id='btn_uhid']//i[@class='fa fa-search']";
	protected static String receipt_utility_serach_mobile_no = "//input[@id='modal_mobileNo']";
	protected static String receipt_utility_Receipt_no = "//input[@id='txtReceipt']";
	protected static String receipt_utility_From_date_chkk_box = "//input[@id='chkDateRange']";
	protected static String receipt_utility_From_date_enter = "//input[@id='dtpfromdate']";
	protected static String receipt_utility_To_date_enter = "//input[@id='dtptodate']";
	protected static String receipt_utility_search_date = "//a[@id='btnDateSearch']//i[@class='fa fa-search']";
	
	protected static String receipt_utility_deposit_print =
			"(//table[@id='dgbilldetails']//tbody//tr[not(contains(@class,'bg-pink'))][1]//td[last()]//*[contains(@class,'fa-print')])";



	protected static String receipt_utility_refund_print =
			"//table[@id='dgbilldetails']//tbody//tr[contains(@class,'bg-pink')]//td[last()]//i[contains(@class,'fa-print')]";




	//--------------------------------------Receipt Utility------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}
	//--------------------------------------billing page methods------------------------------
	public void clickOnDepositeButton(String billing , String deposite) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_billing_btn, billing);
		CommanUtill.clickFunction(Report_Deposite_page, deposite);

	}
	
	public void enterUhidInDepositePage(String uhidText) throws IOException, InterruptedException {

		CommanUtill.textEnter(enter_uhid, uhidText);
		driver.findElement(By.xpath(enter_uhid)).sendKeys(Keys.ENTER);
	}
	
	public void enterCardNoInDepositePage(String cardNoText) throws IOException, InterruptedException {

		CommanUtill.textEnter(enter_card_no, cardNoText);
		driver.findElement(By.xpath(enter_card_no)).sendKeys(Keys.ENTER);
	}
	
	public void enterAmountInDepositeAndRemarks(String amountText , String remaks) throws IOException, InterruptedException {

		CommanUtill.textEnter(amount_enter, amountText);
		CommanUtill.textEnter(remarks_text, remaks);
	}
	
	public void clickOnEditBtnAndSaveReceivedFrom(String Edit, String receivedFromText) throws IOException, InterruptedException {

		CommanUtill.clickFunction(edit_btn_click, Edit);
		CommanUtill.textEnter(Received_From_after_edit_btn, receivedFromText);
	}
	
	public void selectRelationshipAndDepositeType(String relationshipText , String depositeTypeText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Relationship_drp, relationshipText);
		CommanUtill.dropdownSelectByVisibleText(deposit_Type, depositeTypeText);
	}
	 public void CheckBoxOnHomeCare(String homeCareCheck ) throws IOException, InterruptedException {
		 
		 if (CommanUtill.isElementPresent(chekk_home_care)) {
				CommanUtill.clickFunction(chekk_home_care, homeCareCheck);
				System.out.println("Home Care Check Box is Present");
			} else {
				System.out.println("Home Care Check Box is Not Present");	
			}
	 }
	 
	 public void WalletTreeCardRecharge(String walletTreeCheck) throws IOException, InterruptedException {
		 
		 if (CommanUtill.isElementPresent(WalleTree_Card_Recharge)) {
				CommanUtill.clickFunction(WalleTree_Card_Recharge, walletTreeCheck);
				System.out.println("wallet TreeChec Check Box is Present");
			} else {
				System.out.println("wallet TreeChec Check Box is Not Present");	
			}
	 }
	 
	 public void ClickPaymentModeCash(String Cash_Deposit ) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(payment_Mode_cash_radio_btn, Cash_Deposit);
	 }
	 
	 public void selectPaymentModeCheque(String Cheque_Deposit , String chequeNoText , String issueDateText , String bankNameText , String branchNameText) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(payment_Mode_Cheque_radio_btn, Cheque_Deposit);
		 CommanUtill.textEnter(payment_Mode_Cheque_No, chequeNoText);
		 WebElement issueDateElem = driver.findElement(By.xpath(payment_Mode_Cheque_issue_date));
		 issueDateElem.clear();
		 CommanUtill.textEnter(payment_Mode_Cheque_issue_date, issueDateText);
		 issueDateElem.sendKeys(Keys.TAB);
		 CommanUtill.dropdownSelectByVisibleText(payment_Mode_Cheque_bank_name_drp, bankNameText);
		 CommanUtill.textEnter(payment_Mode_Cheque_branch_name, branchNameText);
	 }
	 
	 public void selectPaymentModeCredit(String Credit_Deposit , String cardNoText , String cardTypeText , String bankNameText , 
			 String transactionIdText , String otherDetailsText , String Take_Payment_Credit_Card) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(payment_Mode_Credit_radio_btn, Credit_Deposit);
		 CommanUtill.textEnter(payment_Mode_Credit_card_no, cardNoText);
		 CommanUtill.dropdownSelectByVisibleText(payment_Mode_Credit_card_type, cardTypeText);
		 CommanUtill.dropdownSelectByVisibleText(payment_Mode_Credit_bank_name, bankNameText);
		 CommanUtill.textEnter(payment_Mode_Credit_Transaction_id, transactionIdText);
		 CommanUtill.textEnter(payment_Mode_Credit_other_details, otherDetailsText);
		 CommanUtill.clickFunction(payment_Mode_Credit_card_take_payment, Take_Payment_Credit_Card);
	 }
	 
	 public void clickOnSaveBtn(String saveBtnText , String Yes_Popup) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(save_btn, saveBtnText);
		 CommanUtill.clickFunction(save_Yes_Popup, Yes_Popup);
	 }
	 public void clickOnPrintBtn(String Deposit_table, String printBtn_on) throws IOException, InterruptedException {
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(printBtn_on)));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(print_btn)));
		 CommanUtill.clickFunction(deposit_table_click, Deposit_table);
		 CommanUtill.clickFunction(print_btn, printBtn_on);
	 }
	 
	 public void clickOnChangeDepositeTypeBtn(String Deposite_table_click , String depositeType_Drp , String Save_Change_Type ,
			 String change_deposit_yes_pop) 
			 throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(deposit_table_click, Deposite_table_click);
		 CommanUtill.dropdownSelectByVisibleText(deposit_Type, depositeType_Drp);
		 CommanUtill.clickFunction(change_deposite_type, Save_Change_Type);
		 CommanUtill.clickFunction(change_deposit_yes_popup, change_deposit_yes_pop);
	 }
	 
	 
	 //-------------------------------Refund Details Page Methods---------------------------------
	 
	 
	 public void clickOnRefundDetailsBtn(String refund_Details_btn) throws IOException, InterruptedException {
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(refund_detalis_btn)));
		 CommanUtill.clickFunction(refund_detalis_btn, refund_Details_btn);
	 }
	 
	 public void enterUhidInRefundDetailsPage(String uhidText) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(refund_Enter_UHID, uhidText);
		 driver.findElement(By.xpath(refund_Enter_UHID)).sendKeys(Keys.ENTER);
	 }
	 
	 
	 public void ClickOnTableRefundDetails(String refund_table_click) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(refund_deposit_table, refund_table_click); 
	 }
	 
	 public void enterRefundAmountPayableNameRemarks(String refundAmountText , String payableNameText , String remarksText) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(refund_amount, refundAmountText);
		 CommanUtill.textEnter(Payable_Name_text, payableNameText);
		 CommanUtill.textEnter(refound_remarks, remarksText);
	 }
	 
	 public void clickOnWalletTreeCardRechargeRefund(String walletTreeCheck) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(refund_WalleTree_Card_Recharge_chkk, walletTreeCheck);
	 }
	 public void selectRefundPaymentModeCash(String Cash_Refund ) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(refund_cash_radio_btn, Cash_Refund);
	 }
	 public void selectRefundPaymentModeCheque(String Cheque_Refund , String chequeNoText , String issueDateText , String bankNameText , String branchNameText , String chequeAmountText) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(refund_cheque_radio_btn, Cheque_Refund);
		 CommanUtill.textEnter(refund_cheque_no, chequeNoText);
		 WebElement issueDateElem = driver.findElement(By.xpath(refund_cheque_issue_date));
		 issueDateElem.clear();
		 CommanUtill.textEnter(refund_cheque_issue_date, issueDateText);
		 issueDateElem.sendKeys(Keys.TAB);
		 CommanUtill.dropdownSelectByVisibleText(refund_cheque_bank_name_drp, bankNameText);
		 CommanUtill.textEnter(refund_cheque_branch_name, branchNameText);
		 CommanUtill.textEnter(refund_cheque_amount, chequeAmountText);
	 }
	 
	 public void selectRefundPaymentModeCredit(String Credit_Refund , String cardNoText , String cardTypeText , String bankNameText , 
			 String branchNameText , String creditAmountText) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(refund_credit_radio_btn, Credit_Refund);
		 CommanUtill.textEnter(refund_credit_card_no, cardNoText);
		 CommanUtill.dropdownSelectByVisibleText(refund_credit_card_type_drp, cardTypeText);
		 CommanUtill.dropdownSelectByVisibleText(refund_credit_bank_name_drp, bankNameText);
		 CommanUtill.textEnter(refund_credit_Branch_name, branchNameText);
		 CommanUtill.textEnter(refund_credit_amount, creditAmountText);
	 }
	 
	 public void clickOnRefundSaveBtn(String refund_Save_btn , String refund_Save_Yes_Popup) throws IOException, InterruptedException {
		 
		// CommanUtill.clickFunction(refund_save_btn, refund_Save_btn);
		 CommanUtill.clickByJSFunction(refund_save_btn, refund_Save_Yes_Popup);
		 if(CommanUtill.isElementPresent(refund_save_yes_popup)) {
			 CommanUtill.clickFunction(refund_save_yes_popup, refund_Save_Yes_Popup);
			 System. out. println("Refund Save Yes Popup is Present");
		 } else {
			 System. out. println("Refund Save Yes Popup is Not Present");	
		 }
	 }
	//-------------------------------Deposit Refund Approval Popup Methods---------------------------------
	 
	 public void enterDepositRefundReasonRemarksAndSendApprovalReq(String reasonText , String remarksText , String sendApprovalReqBtn) throws IOException, InterruptedException {
		 
		 CommanUtill.dropdownSelectByVisibleText(deposit_refund_Reason_popup, reasonText);
		 CommanUtill.textEnter(deposit_refund_Remaks_popup, remarksText);
		 CommanUtill.clickFunction(deposit_refund_send_approval_Req_popup, sendApprovalReqBtn);
	 } 
	 
	 
	 
	 
	 
	//------------------------------Receipt Utility ---------------------------------
	 
	 public void clickOnReceiptUtilityBtn(String receipt_Utility_btn) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(receipt_utility_btn, receipt_Utility_btn);
	 }
	 
	 public void enterUHIDDetails(String uhidText ) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(receipt_utility_uhid, uhidText);
		 driver.findElement(By.xpath(receipt_utility_uhid)).sendKeys(Keys.ENTER);
	 }
	 
	 public void enterReceiptUtility(String Receipt_no) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(receipt_utility_Receipt_no, Receipt_no);
		 driver.findElement(By.xpath(receipt_utility_Receipt_no)).sendKeys(Keys.ENTER);
		 
	 }
	public void selectReceiptUtilityDateRange(String fromDateCheck , String fromDateText , String toDateText , String searchDateBtn) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(receipt_utility_From_date_chkk_box, fromDateCheck);
		 WebElement fromDateElem = driver.findElement(By.xpath(receipt_utility_From_date_enter));
		 fromDateElem.clear();
		 CommanUtill.textEnter(receipt_utility_From_date_enter, fromDateText);
		 fromDateElem.sendKeys(Keys.TAB);
		 
		 WebElement toDateElem = driver.findElement(By.xpath(receipt_utility_To_date_enter));
		 toDateElem.clear();
		 CommanUtill.textEnter(receipt_utility_To_date_enter, toDateText);
		 toDateElem.sendKeys(Keys.TAB);
		 
		 CommanUtill.clickFunction(receipt_utility_search_date, searchDateBtn);
	 }
	public void clickOnDepositPrintIcon() {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript(
	        "var table = document.getElementById('dgbilldetails');" +
	        "if (!table) { throw 'Table not found'; }" +

	        "var rows = table.querySelectorAll('tbody tr');" +
	        "for (var i = 0; i < rows.length; i++) {" +
	        "  if (!rows[i].classList.contains('bg-pink')) {" + // Deposit
	        "    var icon = rows[i].querySelector('i.fa-print, a .fa-print, span.fa-print');" +
	        "    if (icon) {" +
	        "      icon.scrollIntoView({block: 'center'});" +
	        "      icon.click();" +
	        "      return;" +
	        "    }" +
	        "  }" +
	        "}" +
	        "throw 'Deposit print icon not found';"
	    );
        System.out.println("======================================");
	    System.out.println("Duplicate Deposit Receipt");
	    System.out.println("======================================");
	}
	
	public void clickOnRefundPrintIcon() {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript(
	        "var table = document.getElementById('dgbilldetails');" +
	        "if (!table) { throw 'Table not found'; }" +

	        "var rows = table.querySelectorAll('tbody tr');" +
	        "for (var i = 0; i < rows.length; i++) {" +
	        "  if (rows[i].classList.contains('bg-pink')) {" + // Refund
	        "    var icon = rows[i].querySelector('i.fa-print, a .fa-print, span.fa-print');" +
	        "    if (icon) {" +
	        "      icon.scrollIntoView({block: 'center'});" +
	        "      icon.click();" +
	        "      return;" +
	        "    }" +
	        "  }" +
	        "}" +
	        "throw 'Refund print icon not found';"
	    );
     System.out.println("======================================");
	 System.out.println("Refund Receipt");
	 System.out.println("======================================");
	}

	}


	

	
	
	
	



