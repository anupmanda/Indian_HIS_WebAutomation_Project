/**
 * 
 */
package com.test.frontofficeBilling.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficeBillingPage;
import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 04-Dec-2025
 */
public class TC_003_FoRegistrationWithSchemeOPDPackageBillingTest extends FrontOfficeBillingPage {
	
	public FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();
	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public String patientRegistrationId;
	
	private final String Billing_sheet = "Fo_Billing_OPD_Pakage";
    private final String Fo_Registration = "FO_Registration_Page";
	
	@DataProvider(name = "RegistrationDataProvider")
	public Object[][] getRegistrationData() throws IOException {

		System.out.println("====TC_003 Fetching data from Excel sheet: " + Fo_Registration + " ====");
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
			String CareGiver_Name_text, String CareGiver_Relation_drp, String CareGiver_Contact_Number_text, String Timing_Remaks_text)
			throws IOException, InterruptedException, ClassNotFoundException {

		logger = extent.createTest("TC_003 Fo Registration With Scheme Billing", "Billing Type OPD Pakage");

		frontofficeregistration.selectByFacilityDropdwon(Facility_Drp);

		try {
			frontofficeregistration.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
		}

		frontofficeregistration.clickOnAddPatientMenu("AddPatient", "PatientRegistration");

		frontofficeregistration.selectByTitleDropdown(title_drp);
		frontofficeregistration.enterOnFirstName(First_name_text);
		frontofficeregistration.selectByGenderDropdown(Gender_Drp);
		
		//frontofficeregistration.enterOnDOB("Click On Radio Button ",DOB);
		frontofficeregistration.clickOnAgeRadioButtonAndAgeText("Age Radio Button", Age_Int);
        
		frontofficeregistration.selectByMaritalStatus(Marital_Status_drp);
		frontofficeregistration.selectByNationality(Nationality_drp);
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");

		frontofficeregistration.enterOnHouseFlatNo(House_Flat_No);
		frontofficeregistration.selectByCityDropdown(city_drp);
		frontofficeregistration.enterLocalityPODropdown(locality_po_Drp + CommanUtill.randomAlphabets(3));
		frontofficeregistration.enterOnDigPinText(enter_dig_pin);
		
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp, Sub_Source_of_Information_Drp);
		frontofficeregistration.clickOnSchemeCheckboxAndSelectScheme("Scheme Dropdown",Scheme_Drp);
		
		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

	    patientRegistrationId = frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + patientRegistrationId);
		
		Assert.assertNotNull(patientRegistrationId, "UHID is null");
		Assert.assertTrue(patientRegistrationId.length() > 5, "UHID is too short");
		
		frontofficeregistration.YesBillingPageInRegistrationPagePopup("Yes Billing Page");
	}
	
	@DataProvider(name = "FoBillingDataProvider")
	public Object[][] getBillingData() throws IOException {
		
		System.out.println("====TC_003 Fetching data from Excel sheet: " + Billing_sheet +" ====");
		return ExcelSheetDataProvider.getExcelData(Billing_sheet);
	}

	@Test(dataProvider = "FoBillingDataProvider" , priority = 2)	
	public void frontOfficeBillingTest(String Facility_Drp ,String Station_Drp , String enter_UHID_Billing_text , String Serach_OPD_Pakage_Name ,
			String OPD_Pakage_Doctor_Name , String OPD_Pakage_Doctor_Token_no , String Referred_By , String Facilitator_Name_Drp , 
			String Billing_Source_Drp , String Billing_SubSource_Drp , String enter_remaks, String Bill_Scheme_Drp , String Bill_Scheme_Date,
			String Scheme_Authorised_By_drp) 
			throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		
		logger = extent.createTest("TC_003 Billing Type OPD Pakage", "Front Office Patient Billing");
		

		frontofficebilling.enterOnUHIDBillingPage(patientRegistrationId);
		
		frontofficebilling.closeSchemePopup("Scheme Close Popup");
		frontofficebilling.closeCompanyDetailsPopup("Company Details Popup Close Btn");
		frontofficebilling.selectSchemeAuthorisedByPopup(Scheme_Authorised_By_drp);    // Scheme Authorised BY
		
		frontofficebilling.closeSchemeDetailsPopup("Scheme Details Popup Close Btn");	
		frontofficebilling.closeSchemesForPatientPopup("Close Schemes For Patient Popup Btn");
		
		frontofficebilling.clickOnOPDPakagesSerachAndSelect("Click On OPD Pakage Btn" ,Serach_OPD_Pakage_Name ,"Click On Opd Package Name", 
				"Click OK OPD Pakage POpup");
		frontofficebilling.clickOnCourierAddressOPDPakage("Courier Address Yes Popup");
		frontofficebilling.enterOPDPakagesDoctorNameAndToken(OPD_Pakage_Doctor_Name , OPD_Pakage_Doctor_Token_no , "OK OPD Pakage popup");
		
		frontofficebilling.enterOnReferredBy(Referred_By);
		frontofficebilling.enterFacilitatorNameText(Facilitator_Name_Drp);
		
		frontofficebilling.clickOnAddToBillButton("Click On Add To Bill Button");
		Thread.sleep(2000);
		frontofficebilling.clickOnBillingOnHeader("Click Bill Icon");
		Thread.sleep(1000);
		frontofficebilling.clickOnBillingYesPopup("Yes Popup Bill Genrate");
		
		frontofficebilling.clickOnProcessPaymentSaveIcon("Save Process Payment Popup");
		frontofficebilling.clickOngeneratedsuccessfullyPrintBillPopup("Generate Bill Number");
		//frontofficebilling.YesPopupOPDCArdPrint("Click ON OPD Card Print Button");
		
		

}
	
   }
