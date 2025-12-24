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
 * 05-Dec-2025
 */
public class TC_004_FoRegistrationWithSchemeCompanyBillingTest extends FrontOfficeBillingPage {

	public FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();
	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public String patientRegistrationId;

	private final String Billing_sheet = "FO_Billing_Page";
	private final String Fo_Registration = "FO_Registration_Page";

	@DataProvider(name = "RegistrationDataProvider")
	public Object[][] getRegistrationData() throws IOException {

		System.out.println("====TC_004 Fetching data from Excel sheet: " + Fo_Registration + " ====");
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

		logger = extent.createTest("TC_004 FO Registration With Financial Details ", "Front Office Patient Registration with All Required Fields And Non Required");

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
		frontofficeregistration.enterOnMiddleName(Middle_Name_text);
		frontofficeregistration.enterOnLastName(LAst_Name_Text);

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

		//frontofficeregistration.selectByINsuranceCompanyTypeDrp (Insurance_Company_drp);	
		frontofficeregistration.selectByPurposeOfVisitDropdown(Purpose_OF_Visite_Drp);
		frontofficeregistration.selectByCompanyDepartmentDropdown(Company_department_drp);

	   frontofficeregistration.clickOnHomeInsuranceCompanyDetails("Home Insurance Company Details",companyDetails_policy_no_text,Certificate_No_text );
	   frontofficeregistration.PlushIconOnCompanyDetailsPopup("Company Details plush Icon");
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

		//frontofficeregistration.NoBillingPageInRegistrationPagePopup("No Billing Page");
		frontofficeregistration.YesBillingPageInRegistrationPagePopup("Yes Billing Page");
		
	}

	@DataProvider(name = "FoBillingDataProvider")
	public Object[][] getBillingData() throws IOException {

		System.out.println("====TC_004 Fetching data from Excel sheet: " + Billing_sheet +" ====");
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

		logger = extent.createTest("TC_004 Company Billing Types", "Front Office Patient Billing");
		
		frontofficebilling.closeSchemePopup("Scheme Close Popup");
		frontofficebilling.closeCompanyDetailsPopup("Company Details Popup Close Btn");
		
		frontofficebilling.selectSchemeAuthorisedByPopup(Scheme_Authorised_By_drp);    // Scheme Authorised BY
		frontofficebilling.closeSchemeDetailsPopup("Scheme Details Popup Close Btn");	
		
		frontofficebilling.closeSchemesForPatientPopup("Close Schemes For Patient Popup Btn");
		frontofficebilling.SelectSchemesForPatientPopup("Click On Patient Scheme Popup");
		
		//------------------------Company Details Popup Home---------------------------
	
		frontofficebilling.visitSpecialityAndDoctorName("Click On Visit Icon Button", Visit_Choose_Speciality_Drp, Visit_Doctor_Name);
		frontofficebilling.selectByVisitRoomNumberDrp(Visit_Room_numver_drp);
		
		frontofficebilling.enterOnReferredBy(Referred_By);
		frontofficebilling.HomeIconInCompanyInsurranceIcon("Click On Insurance Company Icons");
		frontofficebilling.clickOnBillTypeRadioButton("Click On Company And Insurance Radio Btn");
		
	    frontofficebilling.selectByCompanyType_CompanyAndRateContract(Bill_Company_types_Drp , Bill_Company_Drp, Bill_Rate_Contract_Drp);
	    frontofficebilling.PopupDocumentCheckListInCompanyDetails(Company_Document_Id_Type_popup ,"Company_Document_Check List_Popup" ,"Company_Document_Check List_Save_btn");
	    frontofficebilling.plushIconCompanyDetailsPopup("Click On Plush Icon Button");
	    frontofficebilling.YesPopupleasere_validate("Click on Yes Popup Company Details Popup");
	    
	    Thread.sleep(1800);
	    frontofficebilling.selectSchemeAuthorisedByPopup(Scheme_Authorised_By_drp);    // Scheme Authorised BY
		frontofficebilling.enterFacilitatorNameText(Facilitator_Name_Drp);
		frontofficebilling.enterBillingRemaks(enter_remaks);
		
		frontofficebilling.clickOnAddToBillButton("Click On Add To Bill Button");
		frontofficebilling.YesPopupleasere_validate("Click on Yes Popup Company Details Popup");		
		
		frontofficebilling.clickOnBillingOnHeader("Click Bill Icon");
		frontofficebilling.clickOnBillingYesPopup("Yes Popup Bill Genrate");
		
		frontofficebilling.clickOnProcessPaymentSaveIcon("Save Process Payment Popup");
		frontofficebilling.clickOngeneratedsuccessfullyPrintBillPopup("Generate Bill Number");
		frontofficebilling.YesPopupOPDCArdPrint("Click ON OPD Card Print Button");
	

	}
}
