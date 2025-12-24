/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 16-Dec-2025
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
    protected static String refund_username_txt = "//input[@id='usrName']";
    protected static String refund_password_txt = "//input[@id='pswd']";
    protected static String refund_reason_drp = "//select[@id='ReasonForRefund']";
    protected static String refund_remaks_txt = "//input[@id='RemarksForRefund']";
    protected static String refund_approved_btn = "//button[@id='btnRefundApprove']";
    protected static String refund_send_approval_req_btn = "//button[@id='btnsendReqApproval']";   //limit  request
    
   protected static String refund_uncheck_popup = "//button[@id='btnYesRefundApproval']";
   
   //---------------------------Bills Utility page------------------------------
   protected static String select_bills_utility_reason_drp = "//select[@id='reason']";
   protected static String bills_utility_remaks_txt = "//textarea[@id='remarks']";
   protected static String refund_save_btn = "//a[@id='Save']";
   protected static String refund_yes_popup = "//a[@id='btnyespayment']";
    
    
  





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
	public void clickOnCheckedAllInPopup(String checkAll) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_Checked_all_Popup, checkAll);
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
	
	public void selectBillsUtilityReasonFromDropdownAndRemaks(String reasonText , String Remaks) throws IOException, InterruptedException {

        CommanUtill.dropdownSelectByVisibleText(select_bills_utility_reason_drp, reasonText);
        CommanUtill.textEnter(bills_utility_remaks_txt, Remaks);   
	}
	
	public void clickOnSaveButtonAndYesPopup(String saveBtn , String Yes_popup) throws IOException, InterruptedException {

        CommanUtill.clickFunction(refund_save_btn, saveBtn);
        CommanUtill.clickFunction(refund_yes_popup, Yes_popup);
	}
	
  }
