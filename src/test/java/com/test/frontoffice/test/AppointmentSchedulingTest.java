/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficeAppointmentSchedulingPage;
import com.test.frontoffice.page.FrontOfficeBillingPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 24-Nov-2025
 */
public class AppointmentSchedulingTest extends FrontOfficeAppointmentSchedulingPage{

	public FrontOfficeAppointmentSchedulingPage appointment = new FrontOfficeAppointmentSchedulingPage();
	public FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();

	private final String sheetName = "FO_Appointment_Scheduling";
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	

	public void frontOfficeAppointmentSchedulingAndRegistration(String Facility_Drp ,String Station_Drp , String Specility_Drp , 
			String Select_Doctor_name, String Appointment_Booking_Date , String Appoint_First_Name , String Appoint_Middle_Name , 
			String Appoint_Last_Name , String Appont_Mobile_number , String Appoint_Age,String Apoint_gender_drp , 
			String Appoint_Visit_Type_Drp , String Appoint_Source_drp , String Appoint_SubSource_drp , String Appoint_Patient_Type, 
			String Appoint_Lacolity_text , String Appoint_Remaks_Text , String Enter_UHID , String UHID_Appoint_Visit_Type_Drp ,
			String Existing_Link_UHID_Enter) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Fo Appointment Scheduling And Registration Page", "Appointment Scheduling And Registration Page");

		appointment.selectByFacilityDropdwon(Facility_Drp);
		appointment.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		appointment.ApponintmentScheduling("Doctor Menu", "Appointment Page");
		
        driver.navigate().refresh();
		appointment.selectBySpecilityDrp(Specility_Drp,"Spceility_Serach_Icon");
		appointment.selectByDoctorName(Select_Doctor_name);
		//appointment.enterAppointmentBookingDate(Appointment_Booking_Date);

		//appointment.selectFirstAvailableGreenSlot();   //Accouding to Aviable Slot Click in Current Date And Time   or
		appointment.selectFirstAvailableDateAndTimeGreenSlot(); //Select First Available Date And Time Slot
		
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
		
		//String popupMessage = appointment.printPopupMessagefield();
	    //Assert.assertEquals(popupMessage.trim(), "Appointment booked successfully!");
	   

		Thread.sleep(1500);
		appointment.rightClickOnBookedYellowSlot();    //Yellow Slot Right Click 
		appointment.clickAddPatientFromContextMenu("Click On Add Patient Registration");  
		
		appointment.clickOnThreeLineSideMeanuBar("Click ON Side Meanu Icon");

	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2)	
	public void FoAppointmentInLinkUHIDAndBilling(String Facility_Drp ,String Station_Drp , String Specility_Drp , 
			String Select_Doctor_name, String Appointment_Booking_Date , String Appoint_First_Name , String Appoint_Middle_Name , 
			String Appoint_Last_Name , String Appont_Mobile_number , String Appoint_Age,String Apoint_gender_drp , 
			String Appoint_Visit_Type_Drp , String Appoint_Source_drp , String Appoint_SubSource_drp , String Appoint_Patient_Type, 
			String Appoint_Lacolity_text , String Appoint_Remaks_Text , String Enter_UHID , String UHID_Appoint_Visit_Type_Drp ,
			String Existing_Link_UHID_Enter) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Front Office Appointment Link UHID Billing ", "Fo Appointment And Link UHID And Billing");

		appointment.ApponintmentScheduling("Doctor Menu", "Appointment Page");
		driver.navigate().refresh();
		appointment.selectBySpecilityDrp(Specility_Drp,"Spceility_Serach_Icon");
		appointment.selectByDoctorName(Select_Doctor_name);
		

		appointment.selectFirstAvailableDateAndTimeGreenSlot();   //Accouding to Aviable Slot Click in Current Date And Time  
		
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
		appointment.enterExistingUHIDAndSaveToBill(Existing_Link_UHID_Enter, "Existing Link UHID Save Icon", "Exsting Link UHID And Bill Icon");
		
		//-------------------Billing Section All Popup Close ------------------
		frontofficebilling.closeSchemePopup("Scheme Close Popup");
		frontofficebilling.closeCompanyDetailsPopup("Company Details Popup Close Btn");
		frontofficebilling.closeSchemeDetailsPopup("Scheme Details Popup Close Btn");		
		frontofficebilling.closeSchemesForPatientPopup("Close Schemes For Patient Popup Btn");
		
		Thread.sleep(1000);
		appointment.clickOnThreeLineSideMeanuBar("Click ON Side Meanu Icon");
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3)	
	public void FoAppointmentINUHID(String Facility_Drp ,String Station_Drp , String Specility_Drp , 
			String Select_Doctor_name, String Appointment_Booking_Date , String Appoint_First_Name , String Appoint_Middle_Name , 
			String Appoint_Last_Name , String Appont_Mobile_number , String Appoint_Age,String Apoint_gender_drp , 
			String Appoint_Visit_Type_Drp , String Appoint_Source_drp , String Appoint_SubSource_drp , String Appoint_Patient_Type, 
			String Appoint_Lacolity_text , String Appoint_Remaks_Text , String Enter_UHID , String UHID_Appoint_Visit_Type_Drp ,
			String Existing_Link_UHID_Enter) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Front Office Appointment Scheduling And Billing ", "Fo Appointment And UHID Billing");

		appointment.ApponintmentScheduling("Doctor Menu", "Appointment Page");
		driver.navigate().refresh();
		appointment.selectBySpecilityDrp(Specility_Drp,"Spceility_Serach_Icon");
		appointment.selectByDoctorName(Select_Doctor_name);
		

		appointment.selectFirstAvailableDateAndTimeGreenSlot();   //Accouding to Aviable Slot Click in Current Date And Time  

		appointment.enterUHIDNumber(Enter_UHID);
		appointment.selectByAppointmentPopupVisitTypeDrp(UHID_Appoint_Visit_Type_Drp);
		appointment.SaveIconAppointmentPopup("Click On Appointment Save Button");
		appointment.yesPopupAgainSameDoctorAppointment("Appointment is already schedule Yes Popup");

		Thread.sleep(1500);
		appointment.rightClickOnBookedYellowSlot();    //Yellow Slot Right Click 
		appointment.clickAddTOBillPatient("Click On Add Bill Patient Button");  
		
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 4)
	public void FOAppointmentAndAppointmentCancel(String Facility_Drp ,String Station_Drp , String Specility_Drp , 
			String Select_Doctor_name, String Appointment_Booking_Date , String Appoint_First_Name , String Appoint_Middle_Name , 
			String Appoint_Last_Name , String Appont_Mobile_number , String Appoint_Age,String Apoint_gender_drp , 
			String Appoint_Visit_Type_Drp , String Appoint_Source_drp , String Appoint_SubSource_drp , String Appoint_Patient_Type, 
			String Appoint_Lacolity_text , String Appoint_Remaks_Text , String Enter_UHID , String UHID_Appoint_Visit_Type_Drp ,
			String Existing_Link_UHID_Enter) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		logger = extent.createTest("Front Office Appointment Scheduling And Cancel ", "Appointment Cancel");
		
		//-----------------Close All Billing Popup-----------------------
	    frontofficebilling.closeSchemePopup("Scheme Close Popup");
		frontofficebilling.closeCompanyDetailsPopup("Company Details Popup Close Btn");
		frontofficebilling.closeSchemeDetailsPopup("Scheme Details Popup Close Btn");		
		frontofficebilling.closeSchemesForPatientPopup("Close Schemes For Patient Popup Btn");
		
		Thread.sleep(1000);
		appointment.clickOnThreeLineSideMeanuBar("Click ON Side Meanu Icons");
		
		/*	  Checking Only This Funcility
		appointment.selectByFacilityDropdwon(Facility_Drp);
		appointment.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		appointment.ApponintmentScheduling("Doctor Menu", "Appointment Page");
		*/
		appointment.ApponintmentScheduling("Doctor Menu", "Appointment Page");
		driver.navigate().refresh();
		appointment.selectBySpecilityDrp(Specility_Drp,"Spceility_Serach_Icon");
		appointment.selectByDoctorName(Select_Doctor_name);
		
		appointment.selectFirstAvailableDateAndTimeGreenSlot();   //Accouding to Aviable Slot Click in Current Date And Time  

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
		
		Thread.sleep(1000);
		appointment.waitForScheduleToBeActive();
		appointment.reClickAppointmentSlot();   //Same Slot Booking 
		appointment.cancelAppointmentButton("Cancel Appointment Button","Cancel the Schedule Yes Popup");
		driver.navigate().refresh();
				
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 5)
	public void FOAppointmentAndSlotUpdateModification(String Facility_Drp ,String Station_Drp , String Specility_Drp , 
			String Select_Doctor_name, String Appointment_Booking_Date , String Appoint_First_Name , String Appoint_Middle_Name , 
			String Appoint_Last_Name , String Appont_Mobile_number , String Appoint_Age,String Apoint_gender_drp , 
			String Appoint_Visit_Type_Drp , String Appoint_Source_drp , String Appoint_SubSource_drp , String Appoint_Patient_Type, 
			String Appoint_Lacolity_text , String Appoint_Remaks_Text , String Enter_UHID , String UHID_Appoint_Visit_Type_Drp ,
			String Existing_Link_UHID_Enter) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		
		logger = extent.createTest("FO Appointment Scheduling And Date Slot Update Modification ","Appointment Slot Update Modification");
		
		driver.navigate().refresh();
		appointment.selectBySpecilityDrp(Specility_Drp,"Spceility_Serach_Icon");
		appointment.selectByDoctorName(Select_Doctor_name);
		
		appointment.selectFirstAvailableDateAndTimeGreenSlot();   //Accouding to Aviable Slot Click in Current Date And Time  
	
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
		
		Thread.sleep(1000);
		appointment.waitForScheduleToBeActive();
		appointment.reClickAppointmentSlot();   //Same Slot Booking 
		//appointment.updateModificationDate("19-Jan-2026");
		//appointment.updateModificationSlotBooking("07:00 PM" , "07:05 PM");
		appointment.updateModificationSlotBookingAuto("Update Slot Time");   //Auto Select Next Available Slot
		appointment.updateModificationSaveButton("Click On Update Slot Save Button");
		
				
	}
	
	
}
