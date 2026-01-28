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
 * 19-Jan-2026
 */
public class TC_006_BillsUtility_DuesSettlementTest extends FoBillsUtilityPage {
	
	FoBillsUtilityPage DuesSettlement = new FoBillsUtilityPage();
	private final String Billing_sheet = "FO_Billing_Page";
	private final String Fo_Registration = "FO_Registration_Page";
	private final String Due_settle_sheetName = "Fo_Bills_Utility_Dues_Settlemen";
	
	FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();
	FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public String patientRegistrationId;
	
	
	@DataProvider(name = "DuesSettlementDataProvider")
	public Object[][] getDuesSettleData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + Due_settle_sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(Due_settle_sheetName);
	}

	@Test(dataProvider = "DuesSettlementDataProvider" , priority = 3)
	public void billsUtilityDueSettlementTest(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet ,String Enter_Dues_Settlement_Amount ,
			String Enter_Dues_Settlement_Discount_Amount , String Dues_Settlement_Discount_Head_Drp , String Dues_Settlement_Discount_Reason_Drp ,
			String Authorized_By_Drp , String Discount_Remark_Text) 
					throws Exception ,IOException, InterruptedException, ClassNotFoundException{
		
		logger= extent.createTest("TC_Bills Utility  Due Settlement Test", "Discount Due Settlement Functionality Test");
		/*
		DuesSettlement.selectByFacilityDropdwon(Facility_Drp);

		try {
			DuesSettlement.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
		}
		DuesSettlement.clickOnBillingButton("Billing", "Bills Utility");
		DuesSettlement.enterUHID(Enter_UHID_Excel_Sheet);
		*/
		DuesSettlement.clickOnBillingButton("Billing", "Bills Utility");
		DuesSettlement.enterUHID(patientRegistrationId);
		
		DuesSettlement.DuesSettlementButton("Cliclk on Dues Settlement Button");
		DuesSettlement.enterDuesSettlementAmount(Enter_Dues_Settlement_Amount);
		DuesSettlement.DuesSettlementDiscountCheckbox("Click on Discount Checkbox");
		DuesSettlement.enterDuesSettlementDiscountAmount(Enter_Dues_Settlement_Discount_Amount);
		DuesSettlement.DuesSettlementDiscountHeadAndReason(Dues_Settlement_Discount_Head_Drp, Dues_Settlement_Discount_Reason_Drp ,
				Authorized_By_Drp , Discount_Remark_Text);
		DuesSettlement.DuesSettlementCashMopPayment("Cash MOP and plush Settlement");
		Thread.sleep(1000);
		DuesSettlement.DuesSettlementSaveButtonAndYesPopup("Click on Save Button In Due Settled" , "Yes Popup Due Settlement");
		Thread.sleep(5000);
	}
	
	@Test(dataProvider = "DuesSettlementDataProvider" , priority = 4 , dependsOnMethods = {"billsUtilityDueSettlementTest"})
	public void FullDuesBillsSettlementTest(String Facility_Drp , String Station_Drp , String Enter_UHID_Excel_Sheet ,String Enter_Dues_Settlement_Amount ,
			String Enter_Dues_Settlement_Discount_Amount , String Dues_Settlement_Discount_Head_Drp , String Dues_Settlement_Discount_Reason_Drp ,
			String Authorized_By_Drp , String Discount_Remark_Text) 
					throws Exception ,IOException, InterruptedException, ClassNotFoundException{
		
		logger= extent.createTest("TC_Bills Utility  Due Settlement Test", " Full Dues Settlement Functionality Test");
		
	
		DuesSettlement.DuesSettlementCashMopPayment("Cash MOP and plush Settlement");
		DuesSettlement.DuesSettlementSaveButtonAndYesPopup("Click on Save Button In Due Settled" , "Yes Popup Due Settlement");
		
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
		frontofficebilling.processToPaymentInDueAmmontPopup("1000" ,"Click On MOP Payment ","vibhor" ,"Due Amount Anup Remarks" ,
				"Click On Verify Button In Due Amount Popup");    //19-01-2026
		
		frontofficebilling.clickOnProcessPaymentSaveIcon("Save Process Payment Popup");
		
		
		frontofficebilling.ClosGCDScreeingOPBill("Close GCD Screeing OP Bill Popup");     //09-01-2026
		
		frontofficebilling.clickOngeneratedsuccessfullyPrintBillPopup("Generate Bill Number");
		//frontofficebilling.YesPopupOPDCArdPrint("Click ON OPD Card Print Button");
		driver.navigate().refresh();
		Thread.sleep(1000);
		frontofficebilling.BillsMeanuIcon("Click On Bills Meanu Icons");
	}
	
	

}
