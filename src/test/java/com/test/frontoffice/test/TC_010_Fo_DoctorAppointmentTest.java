/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficeAppointmentSchedulingPage;
import com.test.frontoffice.page.FrontOfficeBillingPage;
import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 01-Dec-2025
 */
public class TC_011_Fo_DoctorAppointmentTest extends FrontOfficePatientRegistrationPage {

	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public FrontOfficeAppointmentSchedulingPage appointment = new FrontOfficeAppointmentSchedulingPage();
	public FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();	
	
    public String patientRegistrationId;
	private final String sheetName_01 = "FO_Registration_Page";
	private final String sheetName_02 = "FO_Appointment_Scheduling";
	private final String SheetName_03 = "FO_Billing_Page";

	@DataProvider(name = "FoRegistrationDataProvider")
	public Object[][] getRegistrationData() throws IOException {

		System.out.println("====TC_001Fetching data from Excel sheet: " + sheetName_01 + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_01);
	}

	@Test(dataProvider = "FoRegistrationDataProvider", priority = 1)

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

		logger = extent.createTest("TC_011 Fo Registration Appointment And Fo Billing ", "Front Office Patient Registration");

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
		
		frontofficeregistration.enterOnMobileNumber(Mobile_Number);

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
		
		frontofficeregistration.NoBillingPageInRegistrationPagePopup("No Billing Page");
		frontofficeregistration.clickOnThreeLineRightSide(" Click On Side Icon Meanu Bar");
	}
	
	
	@DataProvider(name = "AppointmentDataProvider")
	public Object[][] getAppointmentData() throws IOException {

		System.out.println("====TC_011 Fetching data from Excel sheet: " + sheetName_02 +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_02);
	}

	@Test(dataProvider = "AppointmentDataProvider" , priority = 2)	
	public void FoAppointmentInLinkUHIDAndBilling(String Facility_Drp ,String Station_Drp , String Specility_Drp , 
			String Select_Doctor_name, String Appointment_Booking_Date , String Appoint_First_Name , String Appoint_Middle_Name , 
			String Appoint_Last_Name , String Appont_Mobile_number , String Appoint_Age,String Apoint_gender_drp , 
			String Appoint_Visit_Type_Drp , String Appoint_Source_drp , String Appoint_SubSource_drp , String Appoint_Patient_Type, 
			String Appoint_Lacolity_text , String Appoint_Remaks_Text , String Enter_UHID , String UHID_Appoint_Visit_Type_Drp ,
			String Existing_Link_UHID_Enter) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("TC_011 Front Office Appointment Link UHID Billing ", "Fo Appointment And Link UHID And Billing");

		appointment.ApponintmentScheduling("Doctor Menu", "Appointment Page");
		appointment.selectBySpecilityDrp(Specility_Drp,"Spceility_Serach_Icon");
		appointment.selectByDoctorName(Select_Doctor_name);

		appointment.selectFirstAvailableGreenSlot();   //Accouding to Aviable Slot Click in Current Date And Time  
		
		appointment.enterAppointmentPopupFirstMIddileAndLastName(Appoint_First_Name + CommanUtill.randomAlphabets(3),
				Appoint_Middle_Name + CommanUtill.randomAlphabets(3) , Appoint_Last_Name + CommanUtill.randomAlphabets(3));
		appointment.enterAppointmentPopupMobileNumber(Appont_Mobile_number + CommanUtill.randomDigits(3));
		appointment.enterAppointmentPopupAge(Appoint_Age);
		appointment.selectByAppointmentPopupGenderDrp(Apoint_gender_drp);

		appointment.selectByAppointmentPopupVisitTypeDrp(Appoint_Visit_Type_Drp);
		appointment.SelectByAppointmentSourceAndSubSourceTypeDrp(Appoint_Source_drp , Appoint_SubSource_drp);
		appointment.SaveIconAppointmentPopup("Click On Appointment Save Button");
		
		Thread.sleep(1500);
		appointment.rightClickOnBookedYellowSlot();    //Yellow Slot Right Click 
		appointment.clickLinkTOExistingUHID("Click On Existing UHID Patient Button"); 
		appointment.enterExistingUHIDAndSaveToBill(patientRegistrationId, "Existing Link UHID Save Icon", "Exsting Link UHID And Bill Icon");
		
	}
	
	@DataProvider(name = "FOBillingDataProvider")
	public Object[][] getBillingData() throws IOException {
		
		System.out.println("====TC_011 Fetching data from Excel sheet: " + SheetName_03 +" ====");
		return ExcelSheetDataProvider.getExcelData(SheetName_03);
	}
	@Test(dataProvider = "FOBillingDataProvider" , priority = 3)	
	
	public void frontOfficeBillingTest(String Facility_Drp ,String Station_Drp , String enter_UHID_Billing_text ,String Visit_Choose_Speciality_Drp,
			String Visit_Doctor_Name ,String Visit_Room_numver_drp , String Diagnostics_Test_Serach_Name , String Diagnostics_Test_Priority_drp ,
			String Diagnostics_Test_Speciality_drp, String Diagnostics_Test_Doctor_Name_drp , String Manual_Service_Name_drp , 
			String Manual_Description , String Manual_Quantity , String Manual_Price , String Referred_By , String Facilitator_Name_Drp ,
			String Billing_Source_Drp , String Billing_SubSource_Drp , String enter_remaks) 
			throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		
		logger = extent.createTest("TC_011 Doctor Appointment Registration And Billing", "Front Office Patient Billing");

		frontofficebilling.closeSchemePopup("Scheme Close Popup");
		frontofficebilling.closeCompanyDetailsPopup("Company Details Popup Close Btn");
		frontofficebilling.closeSchemeDetailsPopup("Scheme Details Popup Close Btn");		
		frontofficebilling.closeSchemesForPatientPopup("Close Schemes For Patient Popup Btn");
		
		frontofficebilling.enterOnReferredBy(Referred_By);
		frontofficebilling.enterFacilitatorNameText(Facilitator_Name_Drp);
		
		frontofficebilling.clickOnAddToBillButton("Click On Add To Bill Button");
		frontofficebilling.clickOnBillingOnHeader("Click Bill Icon");
		frontofficebilling.clickOnBillingYesPopup("Yes Popup Bill Genrate");
		
		frontofficebilling.clickOnProcessPaymentSaveIcon("Save Process Payment Popup");
		frontofficebilling.clickOngeneratedsuccessfullyPrintBillPopup("Generate Bill Number");
		frontofficebilling.YesPopupOPDCArdPrint("Click ON OPD Card Print Button");
		
	}
	
	
}
