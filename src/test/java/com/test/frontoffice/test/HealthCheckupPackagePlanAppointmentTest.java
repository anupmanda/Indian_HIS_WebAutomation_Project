/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.frontoffice.page.HealthCheckupPackagePlanAppointmentPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 20-Jan-2026
 */
public class HealthCheckupPackagePlanAppointmentTest extends HealthCheckupPackagePlanAppointmentPage{
	
	HealthCheckupPackagePlanAppointmentPage HealthCheckupPackagePlan = new HealthCheckupPackagePlanAppointmentPage();
	FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public String patientRegistrationId;
	
	
	private final String sheetName_HealthCheckUpPlan = "FO_HealthCheckupPackagePlan";
	private final String sheetName_Registration = "FO_Registration_Page";
	
	@DataProvider(name = "HealthCheckPlaneDataProvider")
	public Object[][] getHealthCheckUpData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_HealthCheckUpPlan +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_HealthCheckUpPlan);
	}

	@Test(dataProvider = "HealthCheckPlaneDataProvider" , priority = 2, enabled = true)

	public void HealthCheckupAndPackagePlan(String Facility_Drp ,String Station_Drp , String OPd_Package_Enter_UHID , String OPD_Package_Test_Find ,
			String OPD_Package_Doctor_Equiment_Drp , String Enter_OPD_Package_Date , String OPD_Package_Schedule_Slot_drp) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Health Checkup And Package Plan", "OPD Packages Test");
       /*
		HealthCheckupPackagePlan.selectByFacilityDropdwon(Facility_Drp);
		HealthCheckupPackagePlan.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		*/
		HealthCheckupPackagePlan.HealthcheckuppackageplaneAppointment("Doctor Menu Btn", "Appointment Page");
		//HealthCheckupPackagePlan.enterUHID(OPd_Package_Enter_UHID);
		
		HealthCheckupPackagePlan.enterUHID(patientRegistrationId);
		HealthCheckupPackagePlan.TestInOPDPackage(OPD_Package_Test_Find , "Click On OPD Package Test");
		HealthCheckupPackagePlan.DoctorAndEquipmentDrp(OPD_Package_Doctor_Equiment_Drp);
		
		HealthCheckupPackagePlan.EnterAppointmentDate(Enter_OPD_Package_Date);
	    Thread.sleep(1000);
	    HealthCheckupPackagePlan.selectNextAvailableSlot("Appointment date should be greater than current date");
	    Thread.sleep(5000);
		HealthCheckupPackagePlan.CheckBoxOPDHealthCheckUpPackage("Check Box Select");
		
		HealthCheckupPackagePlan.SaveHealthCheckUpPackagePlane("Click On Save Helath Check Up Package" , "Save Yes Pop");
		Thread.sleep(5000);
		HealthCheckupPackagePlan.RefreshHeathCheckUpPackagePlane("Refresh Button");
	}
	
	@DataProvider(name = "FoRegistrationDataProvider")
	public Object[][] getRegistationData() throws IOException {
 
		System.out.println("====TC_001Fetching data from Excel sheet: " + sheetName_Registration + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Registration);
	}

	@Test(dataProvider = "FoRegistrationDataProvider", priority = 1 , enabled = true) 

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

		logger = extent.createTest("TC_001 Front Office Registration Only Mondotry Filed ", "Front Office Patient Registration");

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
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");

		patientRegistrationId = frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + patientRegistrationId);

		Assert.assertNotNull(patientRegistrationId, "UHID is null");
		Assert.assertTrue(patientRegistrationId.length() > 5, "UHID is too short");

		frontofficeregistration.NoBillingPageInRegistrationPagePopup("No BillingPage");
		
		frontofficeregistration.clickOnThreeLineRightSide("Click On Side Meanu Bar");

	   
	}
}
