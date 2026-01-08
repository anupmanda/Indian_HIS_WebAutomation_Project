/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.frontoffice.page.PatientPortalUnregisteredPatientListPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 25-Dec-2025
 */
public class TC_015_PatientPortalUnregisteredPatientListTest extends PatientPortalUnregisteredPatientListPage{

	PatientPortalUnregisteredPatientListPage Unregister_Patint_List = new PatientPortalUnregisteredPatientListPage();
	FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public static String patientRegistrationId;

	private final String sheetName_unregister_patient = "UnRegister_Patient_List";
	private final String sheetName = "FO_Registration_Page";

	@DataProvider(name = "UnRegisterPatientDataProvider")
	public Object[][] getUnregisterPatientListData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_unregister_patient +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_unregister_patient);
	}

	@Test(dataProvider = "UnRegisterPatientDataProvider" , priority = 1)	

	public void UnregisterPatientList(String Facility_Drp , String Station_Drp , String Frome_Date , String To_Date
			) throws IOException , InterruptedException{

		logger = extent.createTest("Patient Portal Unregistered Patient List", "Patient Portal Unregistered Patient List Funcility Test");

		Unregister_Patint_List.selectByFacilityDropdwon(Facility_Drp);
		Unregister_Patint_List.clickOnDashboardFrontOfficeBtn("Click On Front Office Dashbord", Station_Drp, "Click On Yes Popup");
		Unregister_Patint_List.clickOnPortalUnregisterPatientListPage("Click On Add Patient Menu" ,"Patient Portal Unregistered Patient List");

		Unregister_Patint_List.fromAndToDate(Frome_Date , To_Date);
		Unregister_Patint_List.serachUnregisterPatientList("Click On Serach Icon");
		Unregister_Patint_List.clickOnTableUnregisterPatentList("UnRegister Patient Save Icon");

	}

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====TC_Fetching data from Excel sheet: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 2)


	public void PatientPortalRegisterPatient(String Facility_Drp, String Station_Drp, String title_drp, String First_name_text, 
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
			) throws IOException , InterruptedException{

		logger = extent.createTest("TC_001 Front Office Registration Only Mondotry Filed ", "Front Office Patient Registration");

		//frontofficeregistration.selectByTitleDropdown(title_drp);
		frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp, Sub_Source_of_Information_Drp);
		
		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		patientRegistrationId = frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + patientRegistrationId);

		Assert.assertNotNull(patientRegistrationId, "UHID is null");
		Assert.assertTrue(patientRegistrationId.length() > 5, "UHID is too short");

		frontofficeregistration.NoBillingPageInRegistrationPagePopup("No Billing Page");

//Patient portal url http://206.19.38.15:8002/PP_WEB_newUI_Sanity/#
		//Pin Code 201301
	}
 
} 


