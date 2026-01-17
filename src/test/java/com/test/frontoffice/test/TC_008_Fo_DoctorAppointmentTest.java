/**
 * 
 */
package com.test.frontoffice.test;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

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
public class TC_008_Fo_DoctorAppointmentTest extends FrontOfficeAppointmentSchedulingPage{

	public FrontOfficeAppointmentSchedulingPage appointment = new FrontOfficeAppointmentSchedulingPage();
	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	public FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();	

	private final String SheetName_1 = "FO_Appointment_Scheduling";
	private final String SheetName_2 = "FO_Registration_Page";
	private final String SheetName_3 = "FO_Billing_Page"; 

	@DataProvider(name = "AppointmentDataProvider")
	public Object[][] getAppointmentData() throws IOException {

		System.out.println("====Tc_008_Fetching data from Excel sheet: " + SheetName_1 +" ====");
		return ExcelSheetDataProvider.getExcelData(SheetName_1);
	}

	@Test(dataProvider = "AppointmentDataProvider" , priority = 1)	

	public void frontOfficeAppointmentSchedulingAndRegistration(String Facility_Drp ,String Station_Drp , String Specility_Drp , 
			String Select_Doctor_name, String Appointment_Booking_Date , String Appoint_First_Name , String Appoint_Middle_Name , 
			String Appoint_Last_Name , String Appont_Mobile_number , String Appoint_Age,String Apoint_gender_drp , 
			String Appoint_Visit_Type_Drp , String Appoint_Source_drp , String Appoint_SubSource_drp , String Appoint_Patient_Type, 
			String Appoint_Lacolity_text , String Appoint_Remaks_Text , String Enter_UHID , String UHID_Appoint_Visit_Type_Drp ,
			String Existing_Link_UHID_Enter) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("_TC_008 Fo Appointment Scheduling And Registration Billing ", "Appointment Scheduling And Registration Page");

		appointment.selectByFacilityDropdwon(Facility_Drp);
		appointment.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
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
		appointment.SelectByAppointmentPatientTypeDrp(Appoint_Patient_Type);

		appointment.enterLocolityAppointmentpopup(Appoint_Lacolity_text);
		appointment.enterRemaksAppointmentPopup(Appoint_Remaks_Text);
		appointment.SaveIconAppointmentPopup("Click On Appointment Save Button");

		appointment.printPopupMessagefield();    //print Popup Appointment Message 
		Thread.sleep(1500);
		appointment.rightClickOnBookedYellowSlot();    //Yellow Slot Right Click 
		appointment.clickAddPatientFromContextMenu("Click On Add Patient Registration");  

	}

	@DataProvider(name = "AppointmentRegistrationDataProvider")
	public Object[][] getRegistrationData() throws IOException {

		System.out.println("====TC_008_Fetching data from Excel sheet: " + SheetName_2 + " ====");
		return ExcelSheetDataProvider.getExcelData(SheetName_2);
	}

	@Test(dataProvider = "AppointmentRegistrationDataProvider", priority = 2)

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

		logger = extent.createTest("TC_008 Front Office Registration Only Mondotry Filed ", "Front Office Patient Registration");


		frontofficeregistration.selectByTitleDropdown(title_drp);

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

		String patientRegistrationId = frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + patientRegistrationId);

		Assert.assertNotNull(patientRegistrationId, "UHID is null");
		Assert.assertTrue(patientRegistrationId.length() > 5, "UHID is too short");

		frontofficeregistration.YesBillingPageInRegistrationPagePopup("Yes To Billing Page");

	}

	@DataProvider(name = "FOBillingDataProvider")
	public Object[][] getBillingData() throws IOException {

		System.out.println("====TC_008 Fetching data from Excel sheet: " + SheetName_3 +" ====");
		return ExcelSheetDataProvider.getExcelData(SheetName_3);
	}

	//	@Test(dataProvider = "FOBillingDataProvider" , priority = 3)	

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

		logger = extent.createTest("TC_008 Doctor Appointment Registration And Billing", "Front Office Patient Billing");

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
