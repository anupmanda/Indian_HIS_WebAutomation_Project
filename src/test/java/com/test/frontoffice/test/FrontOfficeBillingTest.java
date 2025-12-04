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
		

	public void frontOfficeBillingTest(String Facility_Drp ,String Station_Drp , String enter_UHID_Billing_text ,String Visit_Choose_Speciality_Drp,
			String Visit_Doctor_Name ,String Visit_Room_numver_drp , String Diagnostics_Test_Serach_Name , String Diagnostics_Test_Priority_drp ,
			String Diagnostics_Test_Speciality_drp, String Diagnostics_Test_Doctor_Name_drp , String Manual_Service_Name_drp , 
			String Manual_Description , String Manual_Quantity , String Manual_Price , String Referred_By , String Facilitator_Name_Drp ,
			String Billing_Source_Drp , String Billing_SubSource_Drp , String enter_remaks, String Bill_Scheme_Drp , String Bill_Scheme_Date,
			String Scheme_Authorised_By_drp) 
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
		
		frontofficebilling.visitSpecialityAndDoctorName("Click On Visit Icon Button", Visit_Choose_Speciality_Drp, Visit_Doctor_Name);
		frontofficebilling.YesPopupConsultationSameDoctorPopup("Again Consultation Same Doctor");
		frontofficebilling.selectByVisitRoomNumberDrp(Visit_Room_numver_drp);
		
		frontofficebilling.clickOnDiagnosticsTestAndName("Click On Diagnostics Button", Diagnostics_Test_Serach_Name);
		frontofficebilling.diagnosticsTestAndPrioritySpecialityDoctorName("Click One Test" , Diagnostics_Test_Priority_drp ,
				Diagnostics_Test_Speciality_drp, Diagnostics_Test_Doctor_Name_drp);
		
		frontofficebilling.enterManualTestPriceAndQulity("Click On Manual Btn", Manual_Service_Name_drp , Manual_Description 
				, Manual_Quantity , Manual_Price , "Verify Button");
		
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
		
		
		frontofficebilling.clickOnBillingOnHeader("Click Bill Icon");
		frontofficebilling.clickOnBillingYesPopup("Yes Popup Bill Genrate");
		
		frontofficebilling.clickOnProcessPaymentSaveIcon("Save Process Payment Popup");
		frontofficebilling.clickOngeneratedsuccessfullyPrintBillPopup("Generate Bill Number");
		frontofficebilling.YesPopupOPDCArdPrint("Click ON OPD Card Print Button");
	}

}
