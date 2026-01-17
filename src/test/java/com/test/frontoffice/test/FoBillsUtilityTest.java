/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FoBillsUtilityPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 09-Jan-2026
 */
public class FoBillsUtilityTest extends FoBillsUtilityPage{
	
	FoBillsUtilityPage billsUtility = new FoBillsUtilityPage();
	private final String sheetName = "Fo_Bills_Utility";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)
	public void billsUtilityTest(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet , String Serach_Patient_Fron_Date , 
			String  Serach_Patient_TO_Date , String Refund_User_Name , String Refund_Password , String Refund_Reason_Drp , 
			String Refund_Reason_text , String Authorised_by_After_Send_Approvel , String Bills_Utility_Reason_Drp , String Remaks_Text ,
			String Mode_Of_Paymet_In_Cash , String Mode_Of_Paymet_In_Cheque , String Mode_Of_Paymet_In_Credit_Card , String Cheque_Number_text ,
			String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Validity_Date ,String  Cheque_Branch_Name ,
			String Credit_card_Number , String Credit_Card_Type_Drp , String Credit_Card_Validity_Date , String Credit_Card_Batch_no ,
			String Credit_Note_Enter_UHID , String Credit_Note_Amount , String Credit_Note_Authorised_by_drp , String Credit_Note_Reason_Drp ,
			String Credit_Note_Remaks_tex) 
					throws Exception {

		logger= extent.createTest("Bills Utility Test", "Bills Utility Refund Functionality Test");
		billsUtility.selectByFacilityDropdwon(Facility_Drp);
		billsUtility.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		billsUtility.clickOnBillingButton("Billing", "Bills Utility");
		
		billsUtility.serachPatientInUHID("SPSL.885412" , "Search Patient in UHID");   //1st approach
		billsUtility.handleApprovalRequestAgainstPopup("Approval Request Against Popup after UHID Search");
	/*	
		billsUtility.clickOnSerachIcon("Search Icon in Bills Utility");   //2nd approach
		
		//-----patient select from popup--------------
		
		//billsUtility.enterSerachPatientInUHISPopup("SPSL.883437" , "Search Patient in UHID Popup");   //3rd approach
		
		billsUtility.clickOnShowIPBillDetailsCheckbox("Show IP Bill Details Checkbox");
		billsUtility.clickOnDateCheckBox("Click on Date Checkbox");
		billsUtility.enterFromDateAndToDateInPopup("01-Jun-2025" , "17/Dec/2025" , " Serach From Date and To Date in Popup");
		billsUtility.selectFirstPatientFromPopup("Select Searching Patient table First Row");    //4th approach
	*/	
		billsUtility.clickOnRefundButton("Click on Refund Button in Bills Utility");
		
		//billsUtility.RefundAllCheckedPopup("Click on Checked All in Refund Popup");
		billsUtility.RefundFirstAndSecondCheckedBoxPopup("Refund 1st Chkked Box" ,"Refund Second Chkked Box");
		billsUtility.RefundThirdCheckedBoxPopup("Refund Third Check Box");
		billsUtility.RefundFourthCheckedBoxPopup("Refund Fourth Check Box ");
		
		billsUtility.enterRefundUserNameAndPassword("SAKTI" , "Admin@123" );	
		billsUtility.selectRefundReasonFromDropdownAndRemaks("Doctor Not Available" , "Select Refund Reason Dropdown");
		billsUtility.clickOnRefundApprovedButton("Click on Refund Approved Button");
		
		//billsUtility.clickOnSendApprovalRequestButton("Click on Send Approval Request Button for Limit Request");
		
		billsUtility.SendApprovalRequestpopup_AuthorisedBy(Authorised_by_After_Send_Approvel);
		billsUtility.BillsUtillityReasonDrp(Bills_Utility_Reason_Drp);
		billsUtility.EnterRemaks(Remaks_Text);
		
//		billsUtility.ModeOfPaymentDrp(Mode_Of_Paymet_In_Cash);
		
			billsUtility.ModeOfPaymentDrp(Mode_Of_Paymet_In_Cheque);
			billsUtility.ChequeNumber(Cheque_Number_text);
			billsUtility.ChequeIssueDate(Cheque_Issue_Date);
			billsUtility.ChequeBankNameDrp(Cheque_Bank_Name_Drp);
			billsUtility.ChequeValidityDate(Cheque_Validity_Date);
			billsUtility.ChequeBranchName(Cheque_Branch_Name);
			
			billsUtility.ModeOfPaymentDrp(Mode_Of_Paymet_In_Credit_Card);
			billsUtility.paymentCreditCardNumberAndCardType(Credit_card_Number , Credit_Card_Type_Drp);
			billsUtility.paymentCreditValidityDate(Credit_Card_Validity_Date);
			billsUtility.PaymentChequeBatchNumber(Credit_Card_Batch_no);
			
		//billsUtility.clickOnSaveButtonAndYesPopup("Refund Save Button " ,"YesPopup after Refund Save Button");
		
	} 
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2)
	public void CreditNote(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet , String Serach_Patient_Fron_Date , 
			String  Serach_Patient_TO_Date , String Refund_User_Name , String Refund_Password , String Refund_Reason_Drp , 
			String Refund_Reason_text , String Authorised_by_After_Send_Approvel , String Bills_Utility_Reason_Drp , String Remaks_Text ,
			String Mode_Of_Paymet_In_Cash , String Mode_Of_Paymet_In_Cheque , String Mode_Of_Paymet_In_Credit_Card , String Cheque_Number_text ,
			String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Validity_Date ,String  Cheque_Branch_Name ,
			String Credit_card_Number , String Credit_Card_Type_Drp , String Credit_Card_Validity_Date , String Credit_Card_Batch_no ,
			String Credit_Note_Enter_UHID , String Credit_Note_Amount , String Credit_Note_Authorised_by_drp , String Credit_Note_Reason_Drp ,
			String Credit_Note_Remaks_tex) 
					throws Exception {

		logger= extent.createTest("Bills Utility Test", "Credit Note Functionality Test");
		
		billsUtility.EntercreditNoteUHID(Credit_Note_Enter_UHID);
		billsUtility.creditNoteTab("Click Credit_Note_Tab");
		billsUtility.CreditNoteAmount(Credit_Note_Amount);
		
		billsUtility.creditNoteAuthorisedByReasonDrp(Credit_Note_Authorised_by_drp , Credit_Note_Reason_Drp);
		billsUtility.enterCreditNoteRemaks(Credit_Note_Remaks_tex);
		billsUtility.CreditNoteSaveButton("Save Credit Note Button");
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		billsUtility.EntercreditNoteUHID(Credit_Note_Enter_UHID);
		billsUtility.creditNoteTab("Click Credit_Note_Tab");
		billsUtility.CreditNoteReprintButton("Click On RePrint Credit Note");
		Thread.sleep(3000);
		billsUtility.CreditNoteDeleteButton("Click On Delete Credit Note");
	}
}
