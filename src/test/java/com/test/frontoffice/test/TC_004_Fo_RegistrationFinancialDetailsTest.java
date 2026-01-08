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
public class TC_004_Fo_RegistrationFinancialDetailsTest extends FrontOfficePatientRegistrationPage{

	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();

	private final String sheetName = "FO_Registration_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====TC_004 Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	

	public void FinancialDetailsPatientRegistration(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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

		logger = extent.createTest("Tc_004 FO Registration With Financial Details ", "Front Office Patient Registration with All Required Fields And Non Required");

		frontofficeregistration.selectByFacilityDropdwon(Facility_Drp);
		// open front office dashboard and navigate to registration
		try {
			frontofficeregistration.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
			// ignore if already on page or dashboard click not necessary
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
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.enterOnDigPinText(enter_dig_pin);

		//financial details
		frontofficeregistration.clickOnFinancialCheckbox("Financial Checkbox");
		frontofficeregistration.selectByCompanyTypeDropdown(Company_Type_Drp);

		frontofficeregistration.selectByCompanyDropdown(Auto_Company_Drp);
		frontofficeregistration.selectByCorporateCompanyDropdown(Corporate_Company_Drp);
		frontofficeregistration.selectByRateContractDropdown(Auto_Rate_Contract);

		//frontofficeregistration.clickOnShowAllCheckbox ("Show All Checkbox Insurance" ,Insurance_Company_drp);

		frontofficeregistration.selectByPurposeOfVisitDropdown(Purpose_OF_Visite_Drp);
		//	frontofficeregistration.selectByCompanyDepartmentDropdown(Company_department_drp);
		//	frontofficeregistration.clickOnHomeInsuranceCompanyDetails("Home Insurance Company Details",companyDetails_policy_no_text,Certificate_No_text );

		//frontofficeregistration.enterOnReferredBy(refered_by_text);
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp ,Sub_Source_of_Information_Drp);
		frontofficeregistration.clickOnSchemeCheckboxAndSelectScheme("Scheme Dropdown",Scheme_Drp);
 
		// Save registration and handle potential popups

		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		String patientRegistrationId =	frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " +patientRegistrationId);

		frontofficeregistration.NoBillingPageInRegistrationPagePopup("NoBillingPage");
		//frontofficeregistration.YesBillingPageInRegistrationPagePopup("YesBillingPage");

		//Done
	}

}






