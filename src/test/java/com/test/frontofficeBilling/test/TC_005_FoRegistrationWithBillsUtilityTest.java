/**
 * 
 */
package com.test.frontofficeBilling.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FoBillsUtilityPage;
import com.test.frontoffice.page.FrontOfficeBillingPage;
import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 09-Jan-2026
 */
public class TC_005_FoRegistrationWithBillsUtilityTest extends FoBillsUtilityPage {
	
	FoBillsUtilityPage billsUtility = new FoBillsUtilityPage();
	FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();
	FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public String patientRegistrationId;
	
	private final String sheetName = "Fo_Bills_Utility";
	private final String Billing_sheet = "FO_Billing_Page";
	private final String Fo_Registration = "FO_Registration_Page";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3)
	public void billsUtilityInRefundCashTest(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet , String Serach_Patient_Fron_Date , 
			String  Serach_Patient_TO_Date , String Refund_User_Name , String Refund_Password , String Refund_Reason_Drp , 
			String Refund_Reason_text , String Authorised_by_After_Send_Approvel , String Bills_Utility_Reason_Drp , String Remaks_Text ,
			String Mode_Of_Paymet_In_Cash , String Mode_Of_Paymet_In_Cheque , String Mode_Of_Paymet_In_Credit_Card , String Cheque_Number_text ,
			String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Validity_Date ,String  Cheque_Branch_Name ,
			String Credit_card_Number , String Credit_Card_Type_Drp , String Credit_Card_Validity_Date , String Credit_Card_Batch_no ,
			String Credit_Note_Enter_UHID , String Credit_Note_Amount , String Credit_Note_Authorised_by_drp , String Credit_Note_Reason_Drp ,
			String Credit_Note_Remaks_tex) 
					throws Exception ,IOException, InterruptedException, ClassNotFoundException{
		
		logger= extent.createTest("TC_005_Bills Utility Test", "Refund In Cash Functionality Test");
		
		billsUtility.clickOnBillingButton("Billing", "Bills Utility");
		
		//billsUtility.enterUHID(Enter_UHID_Excel_Sheet);
		billsUtility.enterUHID(patientRegistrationId);
		billsUtility.handleApprovalRequestAgainstPopup("Approval Request Against Popup after UHID Search");
		
		billsUtility.clickOnRefundButton("Click on Refund Button in Bills Utility");
		//billsUtility.RefundAllCheckedPopup("Click on Checked All in Refund Popup");   //All Test Refound 
		billsUtility.RefundFirstAndSecondCheckedBoxPopup("Refund 1st Chkked Box" ,"Refund Second Chkked Box");
		
		//billsUtility.RefundThirdCheckedBoxPopup("Refund Third Check Box");
		//billsUtility.RefundFourthCheckedBoxPopup("Refund Fourth Check Box ");
		
		billsUtility.CloseApprovalRequest_RaiseNeRequest("Close Approved Request Popupo");
		
		billsUtility.enterRefundUserNameAndPassword(Refund_User_Name , Refund_Password);	
		billsUtility.selectRefundReasonFromDropdownAndRemaks(Refund_Reason_Drp , Refund_Reason_text);
		billsUtility.clickOnRefundApprovedButton("Click on Refund Approved Button");
		
		//billsUtility.clickOnSendApprovalRequestButton("Click on Send Approval Request Button for Limit Request");
		//billsUtility.SendApprovalRequestpopup_AuthorisedBy(Authorised_by_After_Send_Approvel);
		
		billsUtility.BillsUtillityReasonDrp(Bills_Utility_Reason_Drp);
		billsUtility.EnterRemaks(Remaks_Text);
		billsUtility.ModeOfPaymentDrp(Mode_Of_Paymet_In_Cash);
		
		billsUtility.clickOnSaveButtonAndYesPopup("Refund Save Button " ,"YesPopup after Refund Save Button");
		billsUtility.printRefundPopupMessage("Print Popup");
		Thread.sleep(5000);
		billsUtility.RePrintBillsYesPopup("Re_Print Header Button " , "Bills Print Yes Popup");
		driver.navigate().refresh();
		Thread.sleep(1000);
	} 
	
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 4)
	public void billsUtilityInRefundChequeTest(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet , String Serach_Patient_Fron_Date , 
			String  Serach_Patient_TO_Date , String Refund_User_Name , String Refund_Password , String Refund_Reason_Drp , 
			String Refund_Reason_text , String Authorised_by_After_Send_Approvel , String Bills_Utility_Reason_Drp , String Remaks_Text ,
			String Mode_Of_Paymet_In_Cash , String Mode_Of_Paymet_In_Cheque , String Mode_Of_Paymet_In_Credit_Card , String Cheque_Number_text ,
			String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Validity_Date ,String  Cheque_Branch_Name ,
			String Credit_card_Number , String Credit_Card_Type_Drp , String Credit_Card_Validity_Date , String Credit_Card_Batch_no ,
			String Credit_Note_Enter_UHID , String Credit_Note_Amount , String Credit_Note_Authorised_by_drp , String Credit_Note_Reason_Drp ,
			String Credit_Note_Remaks_tex) 
					throws IOException, InterruptedException, ClassNotFoundException {
		
		logger= extent.createTest("TC_005_Bills Utility Test", "Refund By Cheque Functionality Test");
			
		//billsUtility.enterUHID(Enter_UHID_Excel_Sheet);
		billsUtility.enterUHID(patientRegistrationId);
		
		billsUtility.handleApprovalRequestAgainstPopup("Approval Request Against Popup after UHID Search");
	
		billsUtility.clickOnRefundButton("Click on Refund Button in Bills Utility");
		//billsUtility.RefundAllCheckedPopup("Click on Checked All in Refund Popup");   //All Test Refound 
		billsUtility.RefundThirdCheckedBoxPopup("Refund Third Check Box");
		
		billsUtility.CloseApprovalRequest_RaiseNeRequest("Close Approved Request Popupo");
		
		billsUtility.enterRefundUserNameAndPassword(Refund_User_Name , Refund_Password);	
		billsUtility.selectRefundReasonFromDropdownAndRemaks(Refund_Reason_Drp , Refund_Reason_text);
		billsUtility.clickOnRefundApprovedButton("Click on Refund Approved Button");
		
		//billsUtility.clickOnSendApprovalRequestButton("Click on Send Approval Request Button for Limit Request");
		//billsUtility.SendApprovalRequestpopup_AuthorisedBy(Authorised_by_After_Send_Approvel);
		
		billsUtility.BillsUtillityReasonDrp(Bills_Utility_Reason_Drp);
		billsUtility.EnterRemaks(Remaks_Text);
		
		billsUtility.ModeOfPaymentDrp(Mode_Of_Paymet_In_Cheque);
		billsUtility.ChequeNumber(Cheque_Number_text);
		billsUtility.ChequeIssueDate(Cheque_Issue_Date);
		billsUtility.ChequeBankNameDrp(Cheque_Bank_Name_Drp);
		billsUtility.ChequeValidityDate(Cheque_Validity_Date);
		billsUtility.ChequeBranchName(Cheque_Branch_Name);
		
		billsUtility.clickOnSaveButtonAndYesPopup("Refund Save Button " ,"YesPopup after Refund Save Button");
		billsUtility.printRefundPopupMessage("Print Popup");
		Thread.sleep(5000);
		//billsUtility.RePrintBillsYesPopup("Re_Print Header Button " , "Bills Print Yes Popup");
		driver.navigate().refresh();
		Thread.sleep(1000);
	} 
	
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 5)
	public void billsUtilityInRefundCreditCardTest(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet , String Serach_Patient_Fron_Date , 
			String  Serach_Patient_TO_Date , String Refund_User_Name , String Refund_Password , String Refund_Reason_Drp , 
			String Refund_Reason_text , String Authorised_by_After_Send_Approvel , String Bills_Utility_Reason_Drp , String Remaks_Text ,
			String Mode_Of_Paymet_In_Cash , String Mode_Of_Paymet_In_Cheque , String Mode_Of_Paymet_In_Credit_Card , String Cheque_Number_text ,
			String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Validity_Date ,String  Cheque_Branch_Name ,
			String Credit_card_Number , String Credit_Card_Type_Drp , String Credit_Card_Validity_Date , String Credit_Card_Batch_no ,
			String Credit_Note_Enter_UHID , String Credit_Note_Amount , String Credit_Note_Authorised_by_drp , String Credit_Note_Reason_Drp ,
			String Credit_Note_Remaks_tex) 
					throws IOException, InterruptedException, ClassNotFoundException {
		
		logger= extent.createTest("TC_005_Bills Utility Test", "Refund By Credit Card Functionality Test");
		
		//billsUtility.enterUHID(Enter_UHID_Excel_Sheet);
		billsUtility.enterUHID(patientRegistrationId);
		
		billsUtility.handleApprovalRequestAgainstPopup("Approval Request Against Popup after UHID Search");
		billsUtility.clickOnRefundButton("Click on Refund Button in Bills Utility");
		//billsUtility.RefundAllCheckedPopup("Click on Checked All in Refund Popup");   //All Test Refound 
		billsUtility.RefundFourthCheckedBoxPopup("Refund Fourth Check Box ");
		
		billsUtility.CloseApprovalRequest_RaiseNeRequest("Close Approved Request Popupo");
		
		billsUtility.enterRefundUserNameAndPassword(Refund_User_Name , Refund_Password);	
		billsUtility.selectRefundReasonFromDropdownAndRemaks(Refund_Reason_Drp , Refund_Reason_text);
		billsUtility.clickOnRefundApprovedButton("Click on Refund Approved Button");
		
		//billsUtility.clickOnSendApprovalRequestButton("Click on Send Approval Request Button for Limit Request");
		//billsUtility.SendApprovalRequestpopup_AuthorisedBy(Authorised_by_After_Send_Approvel);
		
		billsUtility.BillsUtillityReasonDrp(Bills_Utility_Reason_Drp);
		billsUtility.EnterRemaks(Remaks_Text);

		billsUtility.ModeOfPaymentDrp(Mode_Of_Paymet_In_Credit_Card);
		billsUtility.paymentCreditCardNumberAndCardType(Credit_card_Number , Credit_Card_Type_Drp);
		billsUtility.paymentCreditValidityDate(Credit_Card_Validity_Date);
		billsUtility.PaymentChequeBatchNumber(Credit_Card_Batch_no);
		
		billsUtility.clickOnSaveButtonAndYesPopup("Refund Save Button " ,"YesPopup after Refund Save Button");
		billsUtility.printRefundPopupMessage("Print Popup");
		Thread.sleep(5000);
		//billsUtility.RePrintBillsYesPopup("Re_Print Header Button " , "Bills Print Yes Popup");
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	} 
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 6)
	public void CreditNote(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet , String Serach_Patient_Fron_Date , 
			String  Serach_Patient_TO_Date , String Refund_User_Name , String Refund_Password , String Refund_Reason_Drp , 
			String Refund_Reason_text , String Authorised_by_After_Send_Approvel , String Bills_Utility_Reason_Drp , String Remaks_Text ,
			String Mode_Of_Paymet_In_Cash , String Mode_Of_Paymet_In_Cheque , String Mode_Of_Paymet_In_Credit_Card , String Cheque_Number_text ,
			String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Validity_Date ,String  Cheque_Branch_Name ,
			String Credit_card_Number , String Credit_Card_Type_Drp , String Credit_Card_Validity_Date , String Credit_Card_Batch_no ,
			String Credit_Note_Enter_UHID , String Credit_Note_Amount , String Credit_Note_Authorised_by_drp , String Credit_Note_Reason_Drp ,
			String Credit_Note_Remaks_tex) 
					throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest("Bills Utility Test", "Credit Note Functionality Test");
	/*	
		frontofficeregistration.selectByFacilityDropdwon(Facility_Drp);

		try {
			frontofficeregistration.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
		}
		billsUtility.clickOnBillingButton("Billing", "Bills Utility");
	   */billsUtility.EntercreditNoteUHID(Credit_Note_Enter_UHID);
		Thread.sleep(500);
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
	
	
	@DataProvider(name = "RegistrationDataProvider")
	public Object[][] getRegistrationData() throws IOException {

		System.out.println("====TC_001 Fetching data from Excel sheet: " + Fo_Registration + " ====");
		return ExcelSheetDataProvider.getExcelData(Fo_Registration);
	}

	@Test(dataProvider = "RegistrationDataProvider", priority = 1)

	public void verifyPatientRegistration(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
			String Middle_Name_text, String LAst_Name_Text, String Gender_Drp, String DOB,String under_10_years , 
			String Age_Int, String Marital_Status_drp, String Mother_Middle_Name_text, String Father_Name_Text, 
			String Spouse_Text, String Nationality_drp, String Telephone_Int, String Country_Code, String Mobile_Number, 
			String Email_Text, String House_Flat_No, String city_drp, String locality_po_Drp, String Enter_Pin, String Auto_State, 
			String Auto_PIN_Zip, String Auto_Country_Drp, String enter_dig_pin , String Company_Type_Drp, String Auto_Company_Drp, 
			String Corporate_Company_Drp, String Auto_Rate_Contract, String Insurance_Company_drp, String Purpose_OF_Visite_Drp, 
			String Company_department_drp, String companyDetails_policy_no_text, String Certificate_No_text, String Reason_for_Moddification_text,
			String vip_text, String Remarks_text, String id_card_type_drp, String National_ID_text, String ABHA_text, String ABHA_Add_text,
			String refered_by_text, String preferred_language_drp, String Monthly_Income_Text, String Occupation_Drp, String Qualification_Drp,
			String Religion_Drp, String socio_Economic_Class_Drp, String Category_Drp, String Soruce_of_Information_Drp,
			String Sub_Source_of_Information_Drp, String Other_Source_of_Information_text, String Kin_Details_Name_text,
			String Kin_Details_Relation_drp, String Kin_Details_Contact_Number_text, String Scheme_Drp, String Care_GiverType_Drp,
			String CareGiver_Name_text, String CareGiver_Relation_drp, String CareGiver_Contact_Number_text, String Timing_Remaks_text , 
			String Vaccine_Drp , String Vaccine_Dose_Drp, String Vaccine_Brand_Drp , String Enter_Vaccine_Date , String Vaccine_Remaks 
			)
					throws IOException, InterruptedException, ClassNotFoundException {

		logger = extent.createTest("TC_005 Fo Registration Without Scheme", "Billing Type Visit Charge, Diagnostics , Manual Tests");

		frontofficeregistration.selectByFacilityDropdwon(Facility_Drp);

		try {
			frontofficeregistration.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
		}

		frontofficeregistration.clickOnAddPatientMenu("AddPatient", "PatientRegistration");

		frontofficeregistration.selectByTitleDropdown(title_drp);
		frontofficeregistration.enterOnFirstName(First_name_text);
		frontofficeregistration.selectByGenderDropdown(Gender_Drp);

		frontofficeregistration.enterOnDOB("Click On Radio Button ",DOB);

		frontofficeregistration.selectByMaritalStatus(Marital_Status_drp);
		frontofficeregistration.selectByNationality(Nationality_drp);
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");

		frontofficeregistration.enterOnHouseFlatNo(House_Flat_No);
		frontofficeregistration.selectByCityDropdown(city_drp);
		frontofficeregistration.enterLocalityPODropdown(locality_po_Drp + CommanUtill.randomAlphabets(3));
		frontofficeregistration.enterOnDigPinText(enter_dig_pin);

		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp, Sub_Source_of_Information_Drp);

		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		patientRegistrationId = frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + patientRegistrationId);

		Assert.assertNotNull(patientRegistrationId, "UHID is null");
		Assert.assertTrue(patientRegistrationId.length() > 5, "UHID is too short");

		frontofficeregistration.YesBillingPageInRegistrationPagePopup("Yes To Billing Page");
	}

	@DataProvider(name = "FoBillingDataProvider")
	public Object[][] getBillingData() throws IOException {

		System.out.println("====TC_005 Fetching data from Excel sheet: " + Billing_sheet +" ====");
		return ExcelSheetDataProvider.getExcelData(Billing_sheet);
	}

	@Test(dataProvider = "FoBillingDataProvider" , priority = 2)	
	public void frontOfficeBillingTest(String Facility_Drp ,String Station_Drp , String enter_UHID_Billing_text , String Bill_Company_types_Drp ,
			String Bill_Company_Drp , String Bill_Rate_Contract_Drp ,String Company_Document_Id_Type_popup ,String Visit_Choose_Speciality_Drp,
			String Visit_Doctor_Name ,String Visit_Room_numver_drp , String Diagnostics_Test_Serach_Name , String Diagnostics_Test_Priority_drp ,
			String Diagnostics_Test_Speciality_drp, String Diagnostics_Test_Doctor_Name_drp , String Manual_Service_Name_drp , 
			String Manual_Description , String Manual_Quantity , String Manual_Price ,String Other_services_name_drp,String Enter_other_Services_Name,
			String other_servics_Priority_drp , String Other_servics_Speciality_drp , String other_servics_Performing_Doctor_drp , String Referred_By ,
			String Facilitator_Name_Drp , String Billing_Source_Drp , String Billing_SubSource_Drp , String enter_remaks, String Bill_Scheme_Drp ,
			String Bill_Scheme_Date, String Scheme_Authorised_By_drp , String Discount_On_bill_Drp , String Discount_on_servics , String Discount_On_Items , 
			String Discount_Head_Drp , String Discount_Reason_Drp , String Discount_Service_Name_Drp , String Discount_Item_Doctor_Name_Drp, 
			String Discount_Authorised_by , String Discount_Remaks_Text , String Approve_Discount_User_Name, String Approve_Discount_Password,
			String Payment_Mode_Cheque_drp , String Cheque_no_Text , String Cheque_Bank_Name_Drp , String Cheque_Branch_Name_text , String Payment_Mode_Credit_drp ,
			String Credit_Card_type_Drp , String Credit_Card_no , String Credit_Card_Bank_name_Drp, String Credit_Card_Trans_no) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("TC_001 Billing Type Visit Charge Diagnostics  Manual Tests", "Front Office Patient Billing");

		//frontofficebilling.enterOnUHIDBillingPage(patientRegistrationId);

		frontofficebilling.closeCompanyDetailsPopup("Company Details Popup Close Btn");
		frontofficebilling.closeSchemePopup("Scheme Close Popup");
		frontofficebilling.closeSchemeDetailsPopup("Scheme Details Popup Close Btn");		
		frontofficebilling.closeSchemesForPatientPopup("Close Schemes For Patient Popup Btn");
		//frontofficebilling.SelectSchemesForPatientPopup("Click On Patient Scheme Popup");

		frontofficebilling.visitSpecialityAndDoctorName("Click On Visit Icon Button", Visit_Choose_Speciality_Drp, Visit_Doctor_Name);
		frontofficebilling.selectByVisitRoomNumberDrp(Visit_Room_numver_drp);

		frontofficebilling.clickOnDiagnosticsTestAndName("Click On Diagnostics Button", Diagnostics_Test_Serach_Name);
		frontofficebilling.diagnosticsTestAndPrioritySpecialityDoctorName("Click One Test" , Diagnostics_Test_Priority_drp ,
				Diagnostics_Test_Speciality_drp, Diagnostics_Test_Doctor_Name_drp);

		frontofficebilling.enterManualTestPriceAndQulity("Click On Manual Btn", Manual_Service_Name_drp , Manual_Description 
				, Manual_Quantity , Manual_Price , "Verify Button");
		
		frontofficebilling.enterOnReferredBy(Referred_By);
		frontofficebilling.enterFacilitatorNameText(Facilitator_Name_Drp);

		frontofficebilling.clickOnAddToBillButton("Click On Add To Bill Button");
		Thread.sleep(2000);

		frontofficebilling.clickOnBillingOnHeader("Click Bill Icon");
		Thread.sleep(1000);
		frontofficebilling.clickOnBillingYesPopup("Yes Popup Bill Genrate");

		frontofficebilling.clickOnProcessPaymentSaveIcon("Save Process Payment Popup");
		frontofficebilling.ClosGCDScreeingOPBill("Close GCD Screeing OP Bill Popup");     //09-01-2026
		
		frontofficebilling.clickOngeneratedsuccessfullyPrintBillPopup("Generate Bill Number");
		//frontofficebilling.YesPopupOPDCArdPrint("Click ON OPD Card Print Button");
		driver.navigate().refresh();
		Thread.sleep(1000);
		frontofficebilling.BillsMeanuIcon("Click On Bills Meanu Icons");
	}
	
	
}
