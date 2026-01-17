/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOError;
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
 * 09-Jan-2026
 */
public class FoBillsUtilityPage extends GeneralBrowserSetting{

	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String click_billing_btn = "//span[normalize-space()='Billing']";
	protected static String billing_page = "//a[normalize-space()='Bills Utility']";

	//--------------------------------------Bills Utility page------------------------------
	protected static String search_patient_Uhid_txt = "//input[@id='uHid']";
	protected static String card_no = "//input[@id='cardNo']";
	protected static String bills_no = "//input[@id='BillNo']";
	protected static String encounter_no = "//input[@id='EncounterNo']";
	protected static String Patient_serach_iocn = "//a[@id='Encounter_search']";
	protected static String approval_request_against_popup = "//a[@id='btnyesupdateapproval']";   //approval request against popup

	//--------------------------------------Serach Popup-----------------------------
	protected static String serach_uhid_popup = "//input[@id='modal_UHID']";
	protected static String serach_prient_show_ip_bill_details_chkk = "//input[@id='modal_IP']";
	protected static String serach_prient_show_op_bill_details_chkk = "//input[@id='modal_OP']";
	protected static String serach_patient_from_date_chekk = "//input[@id='modal_chkfromdate']";
	protected static String serach_patient_from_date_text = "//input[@id='frmdate']";
	protected static String serach_patient_to_date = "//input[@id='Todate']";
	protected static String serach_patient_serach_icon = "#search_buttondata";
	protected static String serach_patient_select_one = "//div[@id='searchTable']//tr[2]";
	
	//---------------------------Refund Page------------------------------
    protected static String click_seevice = "//a[@id='opbillvisit']";
    protected static String click_refund_btn = "//a[@id='refund']";
    protected static String refund_Checked_all_Popup = "//input[@type=\"checkbox\" and @id=\"Checkbox1\"]";
    protected static String refund_Checked_1st_Popup = "//input[@id='1']";
    protected static String refund_Checked_2nd_Popup = "//input[@id='2']";
    protected static String refund_Checked_3rd_Popup = "//input[@id='1']";
    protected static String refund_Checked_4th_Popup = "//input[@id='1']";
   
    protected static String close_Approval_Request  = "//a[@id='ClosePending']//img[@class='fa-times']";
    protected static String refund_username_txt = "//input[@id='usrName']";
    protected static String refund_password_txt = "//input[@id='pswd']";
    protected static String refund_reason_drp = "//select[@id='ReasonForRefund']";
    protected static String refund_remaks_txt = "//input[@id='RemarksForRefund']";
    protected static String refund_approved_btn = "//button[@id='btnRefundApprove']";
    protected static String refund_send_approval_req_btn = "//button[@id='btnsendReqApproval']";   //limit  request
    
   protected static String refund_uncheck_popup = "//button[@id='btnYesRefundApproval']";
   
   //---------------------------Bills Utility page------------------------------
   protected static String select_bills_utility_Authorised_By_drp = "//input[@id='authName']";   // Send Approval Request 
   protected static String bills_utility_remaks_drp = "//select[@id='reason']";
   protected static String bills_utility_remaks = "//textarea[@id='remarks']";
   
   //-----------------------Mode Of Payment ---------------------------------------------
   protected static String mode_of_payment = "//select[@id='paymentMode']";
   
   //-----------------------Mode Of Payment In Cheque ------------------------------------
   
   protected static String payment_Cheque_no = "//input[@id='chequeNo']";
   protected static String payment_cheque_Issue_date = "//input[@id='chequeDate']";
   protected static String payment_bank_name = "//select[@id='BankName']";  
   protected static String payment_cheque_validity_date = "//input[@id='validityDate']";
   protected static String payment_branch_name = "//input[@id='branchName']";
   
   //-----------------payment Credit Card----------------------------------------
   
   protected static String payment_Credit_Card_no = "//input[@id='cardNumber']";
   protected static String payment_Credit_Card_card_type = "(//select[@id='creditCard'])[1]";
   protected static String payment_Credit_Card_validity_date = "//input[@id='cardValidity']";
   protected static String payment_Credit_Card_batch_no = "//input[@id='batchNumber']";
   
   protected static String refund_save_btn = "//a[@id='Save']";
   protected static String refund_yes_popup = "//a[@id='btnyespayment']";
    
   //-----------------------Print Button --------------------------------
   protected static String re_print_btn = "//a[@id='Re-Print']";
   protected static String re_print_btn_hide_company_chkk_box = "//input[@id='ChkHideCompany']"; 
   protected static String re_print_btn_discount_header_chkk_box = "//input[@id='ChkHideDiscountHeader']";
   protected static String re_print_yes_popup = "//a[@id='Btn_print_the_Bill_Yes']";

//-----------------------Credit Limit ------------------------------
   protected static String enter_uhid_credit_note = "//input[@id='uHid']";
   protected static String credit_note_tab = "//a[@id='credit_note']";
   protected static String credit_note_amount = "//input[@id='CreditNote_Amt']";
   protected static String credit_authorised_By = "//select[@id='CN_Authorised_by']";
   protected static String credit_note_reason = "//select[@id='ReasonForCreditNote']";
   protected static String credit_note_remaks = "//textarea[@id='CN_remarks']";
   
   protected static String Save_credit_note = "//a[@id='CRNoteSave']//img";
   protected static String print_credit_note = "//a[@id='CRNotePrint']";
   protected static String delete_credit_note = "//i[@class='fa fa-trash']";
   protected static String meanu_Bill_Utility = "//img[@id='showmenuIcon']";
   
   
   



	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}
	//--------------------------------------billing page methods------------------------------
	public void clickOnBillingButton(String billing , String Billing_Page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_billing_btn, billing);
		CommanUtill.clickFunction(billing_page, billing);

	}
	public void serachPatientInUHID(String uhid ,String SerachIcon) throws IOException, InterruptedException {

		CommanUtill.textEnter(search_patient_Uhid_txt, uhid);
		CommanUtill.clickFunction(Patient_serach_iocn, SerachIcon);

	}
	public void enterUHID(String enter_uhid)  throws IOException, InterruptedException {
		
		CommanUtill.textEnter(search_patient_Uhid_txt, enter_uhid);
		driver.findElement(By.xpath(search_patient_Uhid_txt)).sendKeys(Keys.ENTER);
	}
	
	public void serachBillNumber(String billNo ) throws IOException, InterruptedException {

		CommanUtill.textEnter(bills_no, billNo);   
	}
	
	public void clickOnSerachIcon(String SerachIcon) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Patient_serach_iocn, SerachIcon);

	}
	
	public void handleApprovalRequestAgainstPopup(String yesBtn) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(approval_request_against_popup)) {
			CommanUtill.clickFunction(approval_request_against_popup, yesBtn);
			System.out.println("Approval Request Against Popup is displayed");
		} else {
			System.out.println("Approval Request Against Popup is not displayed");
		}
	}
	
	//--------------------------------------Serach Popup methods------------------------------
	
	public void enterSerachPatientInUHISPopup(String uhidPopup , String Search_Icon_In_Popup) throws IOException, InterruptedException {

		CommanUtill.textEnter(serach_uhid_popup, uhidPopup);
		CommanUtill.clickFunction(serach_patient_serach_icon, Search_Icon_In_Popup);

	}
	
	public void clickOnShowIPBillDetailsCheckbox(String checkbpx) throws IOException, InterruptedException {

        CommanUtill.clickFunction(serach_prient_show_ip_bill_details_chkk, checkbpx);
}
	
	public void clickOnDateCheckBox(String checkbpx) throws IOException, InterruptedException {

		CommanUtill.clickFunction(serach_patient_from_date_chekk, checkbpx);
	}
	
	public void enterFromDateAndToDateInPopup(String fromDate , String toDate , String Search_Icon_In_Popup) 
			throws IOException, InterruptedException {
		
		CommanUtill.textEnter(serach_patient_from_date_text, fromDate);
		CommanUtill.textEnter(serach_patient_to_date, toDate);
		//CommanUtill.clickFunction(serach_patient_serach_icon, Search_Icon_In_Popup);
		driver.findElement(By.cssSelector(serach_patient_serach_icon)).click();
	}
	
	public void selectFirstPatientFromPopup(String selectOne) throws IOException, InterruptedException {

        CommanUtill.clickFunction(serach_patient_select_one, selectOne);
        
	}
	
	//---------------------------Refund Page------------------------------
	
	public void clickOnServiceTab(String serviceTab) throws IOException, InterruptedException {

        CommanUtill.clickFunction(click_seevice, serviceTab);   
	}
	
	public void clickOnRefundButton(String refundBtn) throws IOException, InterruptedException {

        CommanUtill.clickFunction(click_refund_btn, refundBtn);
	}
	public void RefundAllCheckedPopup(String checkAll) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_Checked_all_Popup, checkAll);
	}
	
	public void RefundFirstAndSecondCheckedBoxPopup(String First_Chkk_box , String Second_Chkk) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_Checked_1st_Popup, First_Chkk_box);
        CommanUtill.clickFunction(refund_Checked_2nd_Popup, Second_Chkk);
	}
	
	public void RefundThirdCheckedBoxPopup(String Thrid_Chkk_box ) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_Checked_3rd_Popup, Thrid_Chkk_box);   
	}
	
	public void RefundFourthCheckedBoxPopup(String Fourth_Chkk_box ) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_Checked_4th_Popup, Fourth_Chkk_box);
        
	}
	
	public void CloseApprovalRequest_RaiseNeRequest(String Close_Popup_Allready_Approved) 
			throws IOException, InterruptedException {
		
		if (CommanUtill.isElementPresent(close_Approval_Request)) {
			CommanUtill.clickFunction(close_Approval_Request, Close_Popup_Allready_Approved);
			System.out.println(" Close Approval Request Against Popup is displayed");
		} else {
			System.out.println("Approval Request Against Popup is not displayed");
		}
	}
		
	public void enterRefundUserNameAndPassword(String userName , String password) throws IOException, InterruptedException {

        CommanUtill.textEnter(refund_username_txt, userName);
        CommanUtill.textEnter(refund_password_txt, password);  
	}
	
	public void selectRefundReasonFromDropdownAndRemaks(String reasonText , String Remaks) throws IOException, InterruptedException {

        CommanUtill.dropdownSelectByVisibleText(refund_reason_drp, reasonText);
        CommanUtill.textEnter(refund_remaks_txt, Remaks);
        
	}
	
	public void clickOnRefundApprovedButton(String approveBtn) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_approved_btn, approveBtn);
	}
	
	public void clickOnSendApprovalRequestButton(String sendReqBtn) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_send_approval_req_btn, sendReqBtn);
        
	}
	//After Send Approval Request Popup
	public void SendApprovalRequestpopup_AuthorisedBy(String reasonText ) throws IOException, InterruptedException {

        CommanUtill.textEnter(select_bills_utility_Authorised_By_drp, reasonText);  
	}
	
	public void BillsUtillityReasonDrp(String Reason_drp) throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(bills_utility_remaks_drp, Reason_drp);
	}
	
	public void EnterRemaks(String Remaks) throws IOException, InterruptedException {
		
		CommanUtill.textEnter(bills_utility_remaks, Remaks);
		
	}
	
	//---------------------------------Mode Of Payment ----------------------------------------
	
	public void ModeOfPaymentDrp(String Mode_Of_Payment) throws IOException , InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(mode_of_payment, Mode_Of_Payment);
		
	}
	
	public void ChequeNumber(String Cheque_no)  throws IOException , InterruptedException {
		
		CommanUtill.textEnter(payment_Cheque_no, Cheque_no);
	}
	
	public void ChequeIssueDate(String issue_Date) throws IOException , InterruptedException {
		
		WebElement issue_date = driver.findElement(By.xpath(payment_cheque_Issue_date));
		issue_date.sendKeys(Keys.CONTROL + "a");
		issue_date.sendKeys(Keys.DELETE );
		CommanUtill.textEnter(payment_cheque_Issue_date, issue_Date);
		issue_date.sendKeys(Keys.TAB);	
	}
	
	public void ChequeBankNameDrp(String Bank_name)  throws IOException , InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(payment_bank_name, Bank_name);
	}
	
    public void ChequeValidityDate(String Validity_date)  throws IOException , InterruptedException {
    	
    	WebElement validity_date = driver.findElement(By.xpath(payment_cheque_validity_date));
    	validity_date.sendKeys(Keys.CONTROL + "a");
    	validity_date.sendKeys(Keys.DELETE );
		CommanUtill.textEnter(payment_cheque_validity_date, Validity_date);
		validity_date.sendKeys(Keys.TAB);	
	}
    
    public void ChequeBranchName(String Branch_name) throws IOException , InterruptedException {
    	
    	CommanUtill.textEnter(payment_branch_name, Branch_name);
    }
	//-----------------------Payment In Credit Card ----------------------------
    
    public void paymentCreditCardNumberAndCardType(String Credit_Card_no , String Card_Type) throws IOException , InterruptedException {
    	
    	CommanUtill.textEnter(payment_Credit_Card_no, Credit_Card_no);
    	CommanUtill.dropdownSelectByVisibleText(payment_Credit_Card_card_type, Card_Type);
    	
    }
    
    public void paymentCreditValidityDate(String Credit_Card_Validity_date) throws IOException , InterruptedException {
    	
    	WebElement validity_date = driver.findElement(By.xpath(payment_Credit_Card_validity_date));
    	validity_date.sendKeys(Keys.CONTROL + "a");
    	validity_date.sendKeys(Keys.DELETE);
    	CommanUtill.textEnter(payment_Credit_Card_validity_date, Credit_Card_Validity_date);
    	validity_date.sendKeys(Keys.TAB);
    }
    
    public void PaymentChequeBatchNumber(String Batch_no) throws IOException , InterruptedException {
    	
    	CommanUtill.textEnter(payment_Credit_Card_batch_no, Batch_no);
    }
    
    
	public void clickOnSaveButtonAndYesPopup(String saveBtn , String Yes_popup) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_save_btn, saveBtn);
		if (CommanUtill.isElementPresent(refund_yes_popup)) {
			CommanUtill.clickFunction(refund_yes_popup, Yes_popup);
			System.out.println("Save Button Yes Popup Btn");
		} else {
			System.out.println("Save Button Yes Popup Btn Is not displayed");
		}
	}
	
	public void printRefundPopupMessage(String Popup_Print) throws IOException, InterruptedException {

	    String refundPopupXpath =
	        "//div[@id='gritter-notice-wrapper']//p[normalize-space()]";

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement popupMsg = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(By.xpath(refundPopupXpath))
	    );

	    String exactPopupText = popupMsg.getText().trim();

	    System.out.println("======================================");
	    System.out.println("REFUND POPUP MESSAGE:");
	    System.out.println(exactPopupText);
	    System.out.println("======================================");
	}
 
	public void RePrintBillsYesPopup(String Reprint_btn , String Yes_Popup)  throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(re_print_btn, Reprint_btn);
		CommanUtill.clickFunction(re_print_yes_popup, Yes_Popup);	
	}
	//----------------------------Credit Note -----------------------------------------
	
	public void EntercreditNoteUHID(String Credit_note_uhid) throws IOException, InterruptedException {
		
		CommanUtill.textEnter(enter_uhid_credit_note, Credit_note_uhid);
		driver.findElement(By.xpath(enter_uhid_credit_note)).sendKeys(Keys.ENTER);
	}
	
	public void creditNoteTab(String Credit_Note_tab) throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(credit_note_tab, Credit_Note_tab);
	}
	
	public void CreditNoteAmount(String credit_amount) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(credit_note_amount, credit_amount);
	}
	
	public void creditNoteAuthorisedByReasonDrp(String AAuthorisedBy_drp , String Reason_drp) throws IOException , InterruptedException { 
		
		CommanUtill.dropdownSelectByVisibleText(credit_authorised_By, AAuthorisedBy_drp);
		CommanUtill.dropdownSelectByVisibleText(credit_note_reason, Reason_drp);
	}
	
	public void enterCreditNoteRemaks(String Credit_Remaks) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(credit_note_remaks, Credit_Remaks);
	}
	
	public void CreditNoteSaveButton(String Credit_note_save) throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(Save_credit_note, Credit_note_save);
	}
	
	public void CreditNoteReprintButton(String Reprint) throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(print_credit_note, Reprint);
	}
	
public void CreditNoteDeleteButton(String delete) throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(delete_credit_note, delete);
	}
public void ClickOnMenuBillUtilityIcon(String menuBillUtility) throws IOException , InterruptedException {
	
	CommanUtill.clickFunction(meanu_Bill_Utility, menuBillUtility);
}
	
  }
