/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficeBillingPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 21-Nov-2025
 */
public class FrontOfficeBillingTest extends FrontOfficeBillingPage {
	
	public FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();	
	
	private final String sheetName = "FO_Billing_Page";
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	
		
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
		
		logger = extent.createTest("Front Office Billing ", "Front Office Patient Billing");

		frontofficebilling.selectByFacilityDropdwon(Facility_Drp);
		frontofficebilling.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		frontofficebilling.clickOnBillingButton("BillingMenu", "BillingPage");
		
		frontofficebilling.enterOnUHIDBilling(enter_UHID_Billing_text);
		frontofficebilling.closeSchemePopup("Scheme Close Popup");
		frontofficebilling.closeCompanyDetailsPopup("Company Details Popup Close Btn");
		frontofficebilling.closeSchemeDetailsPopup("Scheme Details Popup Close Btn");		
		frontofficebilling.closeSchemesForPatientPopup("Close Schemes For Patient Popup Btn");
		frontofficebilling.SelectSchemesForPatientPopup("Click On Patient Scheme Popup");
		
		//------------------------Company Details Popup Home---------------------------
	/*	
		frontofficebilling.HomeIconInCompanyInsurranceIcon("Click On Insurance Company Icons");
		frontofficebilling.clickOnBillTypeRadioButton("Click On Company And Insurance Radio Btn");
	    frontofficebilling.selectByCompanyType_CompanyAndRateContract(Bill_Company_types_Drp , Bill_Company_Drp, Bill_Rate_Contract_Drp);
	    frontofficebilling.PopupDocumentCheckListInCompanyDetails(Company_Document_Id_Type_popup ,"Company_Document_Check List_Popup" ,"Company_Document_Check List_Save_btn");
	    frontofficebilling.plushIconCompanyDetailsPopup("Click On Plush Icon Button");
	    frontofficebilling.YesPopupleasere_validate("Click on Yes Popup Company Details Popup");
	  */  
		frontofficebilling.visitSpecialityAndDoctorName("Click On Visit Icon Button", Visit_Choose_Speciality_Drp, Visit_Doctor_Name);
		//frontofficebilling.YesPopupConsultationSameDoctorPopup("Again Consultation Same Doctor");
		frontofficebilling.selectByVisitRoomNumberDrp(Visit_Room_numver_drp);
		
		frontofficebilling.clickOnDiagnosticsTestAndName("Click On Diagnostics Button", Diagnostics_Test_Serach_Name);
		frontofficebilling.diagnosticsTestAndPrioritySpecialityDoctorName("Click One Test" , Diagnostics_Test_Priority_drp ,
				Diagnostics_Test_Speciality_drp, Diagnostics_Test_Doctor_Name_drp);
		
		frontofficebilling.enterManualTestPriceAndQulity("Click On Manual Btn", Manual_Service_Name_drp , Manual_Description 
				, Manual_Quantity , Manual_Price , "Verify Button");
		
		frontofficebilling.otherSevicesAndChooseServices("Click On Other Services Btn" ,"Other Services Check Box" ,Other_services_name_drp);
		frontofficebilling.serachOtherServicesAndCkick(Enter_other_Services_Name ,"Click On Services Name");
		frontofficebilling.enterOtherServicesPrioritySpecialityPerformingDoctor(other_servics_Priority_drp , Other_servics_Speciality_drp ,
				other_servics_Performing_Doctor_drp );
		
		frontofficebilling.HomeIconInCompanyInsurranceIcon("Click On Insurance Company Icons");
		frontofficebilling.clickOnBillTypeRadioButton("Click On Company And Insurance Radio Btn");
	    frontofficebilling.selectByCompanyType_CompanyAndRateContract(Bill_Company_types_Drp , Bill_Company_Drp, Bill_Rate_Contract_Drp);
	    frontofficebilling.PopupDocumentCheckListInCompanyDetails(Company_Document_Id_Type_popup ,"Company_Document_Check List_Popup" ,"Company_Document_Check List_Save_btn");
	    frontofficebilling.plushIconCompanyDetailsPopup("Click On Plush Icon Button");
	    frontofficebilling.YesPopupleasere_validate("Click on Yes Popup Company Details Popup");
	    
		frontofficebilling.enterOnReferredBy(Referred_By);
		frontofficebilling.enterFacilitatorNameText(Facilitator_Name_Drp);
		frontofficebilling.selectBySourceTypeDropDwon(Billing_Source_Drp);
		frontofficebilling.selectBySubSourceTypeDropDwon(Billing_SubSource_Drp);
		frontofficebilling.enterBillingRemaks(enter_remaks);
		
		frontofficebilling.clickOnAddToBillButton("Click On Add To Bill Button");
		
		//----------- Scheme Details Popup-------------
		frontofficebilling.schemeCheckBoxPopup("Click On Scheme Check Box Popup");   //Already Check Box In Scheme Details popup
		frontofficebilling.selectSchemekDropdwonPopup(Bill_Scheme_Drp);
		frontofficebilling.enterSchemekDatePopup(Bill_Scheme_Date);
		frontofficebilling.selectSchemeAuthorisedByPopup(Scheme_Authorised_By_drp);
		frontofficebilling.saveSchemeDetailsPopup("Save Scheme Details Popup");
	
		//---------------------------Discount bill----------------------------
		frontofficebilling.clickOnCheckBoxDiscountAndYespopup("Click On Discount Check Box" , "Yes ToProvide Discount Popup");
		frontofficebilling.selectByProcessDiscounts_DiscountOnDrp(Discount_On_bill_Drp);
		
		frontofficebilling.selectByDiscountHeadAndReasonDrp(Discount_Head_Drp , Discount_Reason_Drp);
		//frontofficebilling.selectByServiceNameDrp(Discount_Service_Name_Drp);
		
		//frontofficebilling.selectByItem_DoctorNameNameDrp(Discount_Item_Doctor_Name_Drp);
		//frontofficebilling.clickOnPlushNewDiscountItemBtn("Add New Discount Item");   //
		
		frontofficebilling.clickOnCalculateDiscountPercentageBtn("Click On Calculate Discount %");
		frontofficebilling.SelectByAuthorisedbyDrp(Discount_Authorised_by);
		
		frontofficebilling.enterProcessDiscountsRequestRemaks(Discount_Remaks_Text);
		frontofficebilling.enterApproveUserNamePasswordAndVerify(Approve_Discount_User_Name ,Approve_Discount_Password, "Click On Vrify Icon");
		
		frontofficebilling.clickOnBillingOnHeader("Click Bill Icon");
		frontofficebilling.clickOnBillingYesPopup("Yes Popup Bill Genrate");
		
		//---------------------Process To Payment---------------------
		frontofficebilling.processToPaymentByCreditCard(Payment_Mode_Credit_drp , Credit_Card_type_Drp , Credit_Card_no , Credit_Card_Bank_name_Drp,
				Credit_Card_Trans_no);
		
		//frontofficebilling.processToPaymentByCheque(Payment_Mode_Cheque_drp , Cheque_no_Text , Cheque_Bank_Name_Drp ,
			//	Cheque_Branch_Name_text);
		frontofficebilling.clickOnProcessPaymentSaveIcon("Save Process Payment Popup");
		
		frontofficebilling.clickOngeneratedsuccessfullyPrintBillPopup("Generate Bill Number");
		frontofficebilling.YesPopupOPDCArdPrint("Click ON OPD Card Print Button");
	}

}
