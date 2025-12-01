package com.test.frontoffice.test;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

public class TC_006_Fo_RegistrationAndModificationTest extends FrontOfficePatientRegistrationPage {

	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public String patientRegistrationId;   

	private final String sheetName = "FO_Registration_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====TC_006_Fetching data from Excel sheet: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 1)
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
			String CareGiver_Name_text, String CareGiver_Relation_drp, String CareGiver_Contact_Number_text, String Timing_Remaks_text) throws IOException, InterruptedException, ClassNotFoundException {

		logger = extent.createTest("Front Office Registration",
				"Front Office Patient Registration with All Required Fields");

		frontofficeregistration.selectByFacilityDropdwon(Facility_Drp);

		try {
			frontofficeregistration.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
		}

		frontofficeregistration.clickOnAddPatientMenu("AddPatient", "PatientRegistration");

		frontofficeregistration.selectByTitleDropdown(title_drp);
		frontofficeregistration.enterOnFirstName(First_name_text);
		frontofficeregistration.enterOnMiddleName(Middle_Name_text);
		frontofficeregistration.enterOnLastName(LAst_Name_Text);
		
		frontofficeregistration.selectByGenderDropdown(Gender_Drp);
		frontofficeregistration.enterOnDOB("Click On Radio Button ", DOB);
		
		frontofficeregistration.selectByMaritalStatus(Marital_Status_drp);
		frontofficeregistration.selectByNationality(Nationality_drp);
		frontofficeregistration.enterOnCountryCode(Country_Code);
		
		frontofficeregistration.enterOnMobileNumber(Mobile_Number);
		frontofficeregistration.enterOnEmail(Email_Text);
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");

		frontofficeregistration.enterOnHouseFlatNo(House_Flat_No);
		frontofficeregistration.selectByCityDropdown(city_drp);

		frontofficeregistration.enterLocalityPODropdown(locality_po_Drp + CommanUtill.randomAlphabets(3));
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.selectAutoSelatedCountry(Auto_Country_Drp);
		frontofficeregistration.enterOnDigPinText(enter_dig_pin);
		
		frontofficeregistration.selectByPurposeOfVisitDropdown(Purpose_OF_Visite_Drp);
		frontofficeregistration.clickOnVIPCheckbox("VIP Checkbox", vip_text);
		frontofficeregistration.clickOnRemarksCheckbox("Remarks Text Area", Remarks_text);
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp, 
				Sub_Source_of_Information_Drp);
		
		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.yespopupUnderAgeRegistration("Age Below 10 Years Yes Popup");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		// *********** IMPORTANT: store UHID ***********
		patientRegistrationId = frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + patientRegistrationId);

		frontofficeregistration.NoBillingPageInRegistrationPagePopup("NoBillingPage");
	}

	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 2)
	public void modificationOPRegistration(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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

		logger = extent.createTest("Front Office Modification",
				"Front Office Modification Test using previously stored UHID");

		System.out.println("Using stored UHID for modification: " + patientRegistrationId);

		frontofficeregistration.enterUHID(patientRegistrationId);
		frontofficeregistration.updatePatientUHIDIconButton("Click On Update And Modification Button");
		
		frontofficeregistration.selectByIDCardDropdwonAndIDNumber(id_card_type_drp , National_ID_text + CommanUtill.randomDigits(3));
		frontofficeregistration.enterOnReasonForModification(Reason_for_Moddification_text);
		
		frontofficeregistration.updatePatientUHIDIconButton("Click On Save Modification Button ");
		frontofficeregistration.yesPopupModificationOFUHID("Modification Of Uhid Yes Popup");
		frontofficeregistration.NOPopupModificationOFUHIDBillingPage("Modification Og UHID No Billing Page");
	}
}
