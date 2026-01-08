/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 27-Nov-2025
 */
public class TC_003_Fo_RegistrationAllFiledsTest extends FrontOfficePatientRegistrationPage {

	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	private final String sheetName = "FO_Registration_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====TC_002_Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	

	public void PatientRegistrationDetails(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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

		logger = extent.createTest("TC_003 Front Office Registration All Mandotry And Non_Mandotry Fileds ", "Fo Registration with All Required Fields");

		frontofficeregistration.selectByFacilityDropdwon(Facility_Drp);
		// open front office dashboard and navigate to registration
		try {
			frontofficeregistration.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
			// ignore if already on page or dashboard click not necessary
		}

		frontofficeregistration.clickOnAddPatientMenu("AddPatient", "PatientRegistration");
		frontofficeregistration.selectByTitleDropdown(title_drp);

		frontofficeregistration.selectByTitleDropdown(title_drp);

		frontofficeregistration.enterOnFirstName(First_name_text);
		frontofficeregistration.enterOnMiddleName(Middle_Name_text);
		frontofficeregistration.enterOnLastName(LAst_Name_Text);

		frontofficeregistration.selectByGenderDropdown(Gender_Drp);
		frontofficeregistration.enterOnDOB("Click On Radio Button ",DOB);
		frontofficeregistration.clickOnAgeRadioButtonAndAgeText("Age Radio Button", Age_Int);

		frontofficeregistration.selectByMaritalStatus(Marital_Status_drp);
		frontofficeregistration.enterOnMotherMaidenName(Mother_Middle_Name_text);
		frontofficeregistration.enterOnFatherName("Father Radio Button",Father_Name_Text);
		//frontofficeregistration.enterOnSpouseName("Spouse Radio Button",Spouse_Text);

		frontofficeregistration.selectByNationality(Nationality_drp);
		frontofficeregistration.enterOnTelephone(Telephone_Int);
		frontofficeregistration.enterOnCountryCode(Country_Code);
		frontofficeregistration.enterOnMobileNumber(Mobile_Number);
		frontofficeregistration.enterOnEmail(Email_Text);	

		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");

		frontofficeregistration.enterOnHouseFlatNo(House_Flat_No);
		frontofficeregistration.selectByCityDropdown(city_drp);

		frontofficeregistration.enterLocalityPODropdown(locality_po_Drp + CommanUtill.randomAlphabets(3));
		//frontofficeregistration.clickOnAddNewLocality("Add New Locality Popup", "Delhi ( DELHI )" ,"Place0013" ,
		//"111213","Save Locality button");
		frontofficeregistration.enterOnPinCode(Enter_Pin);
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");

		//frontofficeregistration.selectAutoPopulatedState(Auto_State);
		frontofficeregistration.enterAutoSelectZip_PinCodeState(Auto_PIN_Zip);
		frontofficeregistration.selectAutoSelatedCountry(Auto_Country_Drp);
		frontofficeregistration.enterOnDigPinText(enter_dig_pin);

		//financial details
		frontofficeregistration.clickOnFinancialCheckbox("Financial Checkbox");
		frontofficeregistration.selectByCompanyTypeDropdown(Company_Type_Drp);

		frontofficeregistration.selectByCompanyDropdown(Auto_Company_Drp);
		//frontofficeregistration.selectByCorporateCompanyDropdown(Corporate_Company_Drp);
		//frontofficeregistration.selectByRateContractDropdown(Auto_Rate_Contract);

		//frontofficeregistration.clickOnShowAllCheckbox ("Show All Checkbox Insurance" ,Insurance_Company_drp);

		//	frontofficeregistration.selectByCompanyDepartmentDropdown(Company_department_drp);
	    frontofficeregistration.clickOnHomeInsuranceCompanyDetails("Home Insurance Company Details",companyDetails_policy_no_text,Certificate_No_text );
		frontofficeregistration.PlushIconOnCompanyDetailsPopup("Click On Company Details Plush Icon");
		
		frontofficeregistration.selectByPurposeOfVisitDropdown(Purpose_OF_Visite_Drp);
		frontofficeregistration.clickOnVIPCheckbox("VIP Checkbox",vip_text);
		frontofficeregistration.clickOnRemarksCheckbox("Remarks Text Area",Remarks_text);

		frontofficeregistration.clickOnNRICheckbox("NRI Checkbox");
		frontofficeregistration.selectByIDCardDropdwonAndIDNumber(id_card_type_drp , National_ID_text + CommanUtill.randomDigits(3));

		frontofficeregistration.enterOnReferredBy(refered_by_text);
		frontofficeregistration.selectByPreferredLanguageDropdown(preferred_language_drp);
		frontofficeregistration.enterOnMonthlyIncome(Monthly_Income_Text);
		frontofficeregistration.selectByOccupationDropdown(Occupation_Drp);

		frontofficeregistration.selectByQualificationDropdown(Qualification_Drp);
		frontofficeregistration.selectByReligionDropdown(Religion_Drp);

		frontofficeregistration.selectByCategoryDropdown(Category_Drp);
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp ,Sub_Source_of_Information_Drp);

		frontofficeregistration.enterKinDetails(Kin_Details_Name_text , Kin_Details_Relation_drp , Kin_Details_Contact_Number_text );
		frontofficeregistration.clickOnSchemeCheckboxAndSelectScheme("Scheme Dropdown",Scheme_Drp);

		// Save registration and handle potential popups

		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.yespopupUnderAgeRegistration("Age Below 10 Years Yes Popup");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		String patientRegistrationId =	frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " +patientRegistrationId);

		frontofficeregistration.NoBillingPageInRegistrationPagePopup("NoBillingPage");
		//frontofficeregistration.YesBillingPageInRegistrationPagePopup("YesBillingPage");

		// Done	
	} 
}
