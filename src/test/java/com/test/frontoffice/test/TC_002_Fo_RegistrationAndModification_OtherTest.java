package com.test.frontoffice.test;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

public class TC_002_Fo_RegistrationAndModification_OtherTest extends FrontOfficePatientRegistrationPage {

	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public String patientRegistrationId;   

	//-----------------------Here Two Excel Sheet ------------------------------
	private final String sheetName = "FO_Registration_Page";
	private final String sheetName_passport = "FO_Registration_Passport_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====TC_002_Fetching data from Excel sheet: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}
 
	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 1)
	public void PatientRegistration(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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
			) throws IOException, InterruptedException, ClassNotFoundException {

		logger = extent.createTest("TC_002 Front Office Registration", "Front Office Patient Registration with All Required Fields");

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
		//frontofficeregistration.selectAutoSelatedCountry(Auto_Country_Drp);
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
			String CareGiver_Name_text, String CareGiver_Relation_drp, String CareGiver_Contact_Number_text, String Timing_Remaks_text , 
			String Vaccine_Drp , String Vaccine_Dose_Drp, String Vaccine_Brand_Drp , String Enter_Vaccine_Date , String Vaccine_Remaks 
			)
					throws IOException, InterruptedException, ClassNotFoundException {

		logger = extent.createTest("TC_002 Front Office Modification", "Front Office Modification Test using previously stored UHID");

		System.out.println("Using stored UHID for modification: " + patientRegistrationId);

		frontofficeregistration.enterUHID(patientRegistrationId);
		frontofficeregistration.selectByIDCardDropdwonAndIDNumber(id_card_type_drp , National_ID_text + CommanUtill.randomDigits(3));
		
		frontofficeregistration.enterOnReasonForModification(Reason_for_Moddification_text);   //2nd Time Change XPath 
		frontofficeregistration.enterKinDetails(Kin_Details_Name_text , Kin_Details_Relation_drp , Kin_Details_Contact_Number_text );
		Thread.sleep(1800);

		frontofficeregistration.updatePatientUHIDIconButton("Click On Save Modification Button ");
		frontofficeregistration.yesPopupModificationOFUHID("Modification Of Uhid Yes Popup");
		frontofficeregistration.NOPopupModificationOFUHIDBillingPage("Modification Og UHID No Billing Page");

		driver.navigate().refresh();
		Thread.sleep(1000);
	} 

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3)	

	public void FrontOfficeSaveVaccineDetails(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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

		logger = extent.createTest("TC_002 Register Patient Enter And Vaccine Details", "Save Vaccine Details Popup");

		System.out.println("Using stored UHID for Vaccine Details : " + patientRegistrationId);

		frontofficeregistration.enterUHID(patientRegistrationId);
		//frontofficeregistration.enterUHID_1("SPSL.885056");
		frontofficeregistration.clickOnVaccineDetailsIcon("Click On Vaccine Details Icons");
		frontofficeregistration.covidDetailsVaccineAndVaccineDoseAndBrand(Vaccine_Drp , Vaccine_Dose_Drp , Vaccine_Brand_Drp);
		
		frontofficeregistration.enterVaccineDate(Enter_Vaccine_Date);
		frontofficeregistration.enterVaccineRemaks(Vaccine_Remaks);
		frontofficeregistration.saveVaccineDetailsPopup("Save On Vaccine Details Button");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 4)	

	public void FrontOfficeVaccineDelete(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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

		logger = extent.createTest("TC_002 Register Patient Enter And Vaccine Delete", "Delete Vaccine Details Popup");

		System.out.println("Using stored UHID for Vaccine Delete : " + patientRegistrationId);

		frontofficeregistration.enterUHID(patientRegistrationId);
		//frontofficeregistration.enterUHID_1("SPSL.885056");
		frontofficeregistration.VaccineDeleteIcon("Click On Vaccine Icon" , "Delete Vaccine Icon" , "Vaccine Yes Popup");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 5)	

	public void FrontOfficeOPDCardPrint(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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

		logger = extent.createTest("TC_002 Register Patient Enter And OPD Card Print", "OPD Register Card");

		System.out.println("Using stored UHID for OPD Card Print Details : " + patientRegistrationId);
		
		frontofficeregistration.enterUHID(patientRegistrationId);
		frontofficeregistration.clickOnOPDCardPrint("Click On OPD Register Card");

		driver.navigate().refresh();
		Thread.sleep(500);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 6)

	public void PatientRegistrationUnder10Years(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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
 
		logger = extent.createTest("TC_002 Front Office Registration Under 10 Years", "Fo Registration Below 10 Years");

		frontofficeregistration.selectByTitleDropdown(title_drp);
		frontofficeregistration.enterOnFirstName(First_name_text);
		frontofficeregistration.selectByGenderDropdown(Gender_Drp);
		
		frontofficeregistration.enterOnDOB("Click On Radio Button ", under_10_years);
		
		//frontofficeregistration.clickOnAgeRadioButtonAndAgeText("Age Radio Button", Age_Int);
        
		frontofficeregistration.selectByMaritalStatus(Marital_Status_drp);
		frontofficeregistration.selectByNationality(Nationality_drp);
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");

		frontofficeregistration.enterOnHouseFlatNo(House_Flat_No);
		frontofficeregistration.selectByCityDropdown(city_drp);
		frontofficeregistration.enterLocalityPODropdown(locality_po_Drp + CommanUtill.randomAlphabets(3));

		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp, Sub_Source_of_Information_Drp);

		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.yespopupUnderAgeRegistration("Age Below 10 Years Yes Popup");
		
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		String patientRegistrationId = frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + patientRegistrationId);

		frontofficeregistration.NoBillingPageInRegistrationPagePopup("NoBillingPage");
		driver.navigate().refresh();
		Thread.sleep(1000);
	
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 7)	

	public void FrontOfficeFinancialDetails(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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

		logger = extent.createTest("TC_002 Register On Financial Details ", "Register On Financial Details Save");
		
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
		
		frontofficeregistration.clickOnFinancialCheckbox("Financial Checkbox");
		frontofficeregistration.selectByCompanyTypeDropdown(Company_Type_Drp);

		frontofficeregistration.selectByCompanyDropdown(Auto_Company_Drp);
		//frontofficeregistration.selectByCorporateCompanyDropdown(Corporate_Company_Drp);
		frontofficeregistration.selectByRateContractDropdown(Auto_Rate_Contract);

		//frontofficeregistration.clickOnShowAllCheckbox ("Show All Checkbox Insurance" ,Insurance_Company_drp);

		frontofficeregistration.selectByPurposeOfVisitDropdown(Purpose_OF_Visite_Drp);
		//	frontofficeregistration.selectByCompanyDepartmentDropdown(Company_department_drp);
		frontofficeregistration.clickOnHomeInsuranceCompanyDetails("Home Insurance Company Details",companyDetails_policy_no_text,Certificate_No_text );
		frontofficeregistration.PlushIconOnCompanyDetailsPopup("Save On Plush Icon Company Details Icon");
		
		//frontofficeregistration.enterOnReferredBy(refered_by_text);
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp ,Sub_Source_of_Information_Drp);
		frontofficeregistration.clickOnSchemeCheckboxAndSelectScheme("Scheme Dropdown",Scheme_Drp);

		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		String FinancialRegistrationId =	frontofficeregistration.getUHIDOfPatient();
		System.out.println("Financial Registration Id is: " +FinancialRegistrationId);

		frontofficeregistration.NoBillingPageInRegistrationPagePopup("No Billing Page");
		//frontofficeregistration.YesBillingPageInRegistrationPagePopup("YesBillingPage");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
	}
	
	@DataProvider(name = "RegPassportDetailsDataProvider")
	public Object[][] getPassportData() throws IOException {
		
		System.out.println("====TC_006_Fetching data from Excel sheet: " + sheetName_passport +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_passport);
	}

	@Test(dataProvider = "RegPassportDetailsDataProvider" , priority = 8)	
		
	public void PatientRegistrationWithPassportDetails(String Facility_Drp, String Station_Drp , String Passport_Number  , String Passport_Issue_date ,
			String Passport_Expiry_date , String Passport_Issued_At, String Visa_Number ,String Visa_Vaild_From , String Visa_valid_to ,
			String Passport_Remaks , String title_drp ,String First_name_text, String Middle_Name_text, String LAst_Name_Text, 
			String Gender_Drp, String DOB,String under_10_years , String Age_Int, String Marital_Status_drp , String Nationality_drp ,
			String House_Flat_No , String city_drp , String locality_po_Drp , String Purpose_OF_Visite_Drp , String refered_by_text , 
			String Soruce_of_Information_Drp ,String  Sub_Source_of_Information_Drp , String Scheme_Drp) 
	
           throws IOException, InterruptedException, ClassNotFoundException {  

		logger = extent.createTest("TC_002 Front Office Registration ", "Front Office Patient Registration with All Required Fields");
		
		frontofficeregistration.ClickOnPassportDetailsIcon("Click On Passport Details");
		frontofficeregistration.enterPassportNumber(Passport_Number);
		frontofficeregistration.enterIssueExpiryDate(Passport_Issue_date , Passport_Expiry_date);
		frontofficeregistration.enterOnIssuedAt(Passport_Issued_At);
		
		frontofficeregistration.enterVisaNumber(Visa_Number);
		frontofficeregistration.enterVisaValidFromAndTODate(Visa_Vaild_From , Visa_valid_to);
		frontofficeregistration.enterPassportRemaks(Passport_Remaks);
		frontofficeregistration.saveYesPassportDetails("Click On Save Passport Details");
		
       frontofficeregistration.selectByTitleDropdown(title_drp);
		
		frontofficeregistration.enterOnFirstName(First_name_text);
		frontofficeregistration.enterOnMiddleName(Middle_Name_text);
		frontofficeregistration.enterOnLastName(LAst_Name_Text);
		
		frontofficeregistration.selectByGenderDropdown(Gender_Drp);
		frontofficeregistration.clickOnAgeRadioButtonAndAgeText("Age Radio Button", Age_Int);
		
		frontofficeregistration.selectByMaritalStatus(Marital_Status_drp);
		frontofficeregistration.selectByNationality(Nationality_drp);
		
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		
		frontofficeregistration.enterOnHouseFlatNo(House_Flat_No);
		frontofficeregistration.selectByCityDropdown(city_drp);
		
		frontofficeregistration.enterLocalityPODropdown(locality_po_Drp + CommanUtill.randomAlphabets(3));
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		
		 frontofficeregistration.selectByPurposeOfVisitDropdown(Purpose_OF_Visite_Drp);	
		 //frontofficeregistration.enterOnReferredBy(refered_by_text);
		
		 frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp ,Sub_Source_of_Information_Drp);
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
}
    }
