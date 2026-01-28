/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficeAppointmentSchedulingPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 20-Jan-2026
 */
public class TC_021A_Appointment_Equipment_SchedulingTest extends FrontOfficeAppointmentSchedulingPage {
	
	FrontOfficeAppointmentSchedulingPage Equipment_Schedule = new FrontOfficeAppointmentSchedulingPage();

	private final String sheetName_Equipment = "FO_Appointment_Equipment_Schedu";
	@DataProvider(name = "EquipmentScheduleDataProvider")
	public Object[][] getEquipmentData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Equipment +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Equipment);
	}

	@Test(dataProvider = "EquipmentScheduleDataProvider" , priority = 1)	

	public void AppoimentEquipmentSchedule(String Facility_Drp ,String Station_Drp, String Equipment_Department_Drp, String Equipment_Drp ,
			String Equipment_Date , String Equipment_First_Name , String Equipment_Middle_Name , String Equipment_Last_Name , 
			String Equipment_Mobile_number , String Equipment_Age , String Equipment_gender_drp , String Equipment_Test_Type_Drp , 
			String Equipment_Source_drp , String Equipment_SubSource_drp , String Equipment_Patient_Type , String Equipment_Remaks_Text) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Appointment Equipment Schedule", "Appointmen Equipment Schedule Test");

		Equipment_Schedule.selectByFacilityDropdwon(Facility_Drp);
		Equipment_Schedule.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		Equipment_Schedule.ApponintmentScheduling("Doctor Menu Btn", "Appointment Page");
		
		Equipment_Schedule.AppointmentEquipmentScheduleBtn("Equipment Schedule Btn");
		//Equipment_Schedule.EquipmentScheduleDepartmentDrp(Equipment_Department_Drp ,"Serach Department");
		
		Equipment_Schedule.EquipmentScheduleEquipmentDrp(Equipment_Drp , "Serach Equipment Btn");
		//Equipment_Schedule.EquipmentDate(Equipment_Date);
		//Equipment_Schedule.EquipmentCountBtn("Ckick On Equipment Count Btn" , "Close Equipment Count Pop");
		Equipment_Schedule.selectFirstAvailableDateAndTimeGreenSlot();
		

		Equipment_Schedule.enterAppointmentPopupFirstMIddileAndLastName(Equipment_First_Name + CommanUtill.randomAlphabets(3),
				Equipment_Middle_Name + CommanUtill.randomAlphabets(3) , Equipment_Last_Name + CommanUtill.randomAlphabets(3));
		Equipment_Schedule.enterAppointmentPopupMobileNumber(Equipment_Mobile_number + CommanUtill.randomDigits(3));
		Equipment_Schedule.enterAppointmentPopupAge(Equipment_Age);
		Equipment_Schedule.selectByAppointmentPopupGenderDrp(Equipment_gender_drp);

		Equipment_Schedule.EquipmentScheduleTestDrp(Equipment_Test_Type_Drp);
		Equipment_Schedule.SelectByAppointmentSourceAndSubSourceTypeDrp(Equipment_Source_drp , Equipment_SubSource_drp);
		//Equipment_Schedule.SelectByAppointmentPatientTypeDrp(Equipment_Patient_Type);
		
		Equipment_Schedule.enterRemaksAppointmentPopup(Equipment_Remaks_Text);
		Equipment_Schedule.SaveIconAppointmentPopup("Click On Appointment Save Button");
		Thread.sleep(5000);
		
	}
}
