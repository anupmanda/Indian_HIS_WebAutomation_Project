/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficeAppointmentSchedulingPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 19-Jan-2026
 */
public class AppointmentSchedulingDoctorCurrentStatusTest extends FrontOfficeAppointmentSchedulingPage{
	
	
	public FrontOfficeAppointmentSchedulingPage Doctor_Current_Status = new FrontOfficeAppointmentSchedulingPage();

	private final String sheetName_Doctor_Status = "Doctor_Schedule_Current_Status";
	
	@DataProvider(name = "DoctorCurrentStatusDataProvider")
	public Object[][] getDoctorStatusData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Doctor_Status +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Doctor_Status);
	}

	@Test(dataProvider = "DoctorCurrentStatusDataProvider" , priority = 1)	

	public void AppointmentDoctorCurrentStatus(String Facility_Drp ,String Station_Drp , String Speciality_Drp , String Doctor_Name_Drp ,
			String Current_Date , String Current_Status_Drp , String Purpose_Drp , String Empaty_Data ) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Appointment Current Doctor Current Staus", "Doctor Current Status");

		Doctor_Current_Status.selectByFacilityDropdwon(Facility_Drp);
		Doctor_Current_Status.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		Doctor_Current_Status.ApponintmentScheduling("Doctor Menu Btn", "Appointment Page");
		
		Doctor_Current_Status.DoctorScheduleCurrentStatusButton("Click On Doctor Schedule Current Status");
		Doctor_Current_Status.selectBySpcilityDrpCurrentStatus(Speciality_Drp);
		Doctor_Current_Status.selectByDoctorNameDrpCurrentStatus(Doctor_Name_Drp);
		
		//Doctor_Current_Status.enterCurrentStatusDate(Current_Date);
		Doctor_Current_Status.searchButtonCurrentStatus("Click On Serach Icon");
		Doctor_Current_Status.selectByCurrentStatusDrp(Current_Status_Drp);
		
		Doctor_Current_Status.selectByPurposeDrp(Purpose_Drp);
		//Doctor_Current_Status.enterBlankBoxHours(Empaty_Data);
		//Doctor_Current_Status.clickAllCheckBoxCurrentStatus("Click On Table Curent Doctor Status");
		Doctor_Current_Status.clickFirstCheckBoxCurrentStatus("Click On Table In First");
		
		Doctor_Current_Status.clickOnSendCurrentSatusDoctor("Click On Send Btn");
		
		
		
		
		
	}
}
