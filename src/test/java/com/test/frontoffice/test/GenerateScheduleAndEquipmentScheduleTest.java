/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.GenerateScheduleAndEquipmentSchedulePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 18-Dec-2025
 */
public class GenerateScheduleAndEquipmentScheduleTest extends GenerateScheduleAndEquipmentSchedulePage{
	
	GenerateScheduleAndEquipmentSchedulePage generateSchedule = new GenerateScheduleAndEquipmentSchedulePage();
	GenerateScheduleAndEquipmentSchedulePage equipment_Schedule = new GenerateScheduleAndEquipmentSchedulePage();
	
	  private final String sheetName = "Doctor_Generate_Schedule";
		
		@DataProvider(name = "ExcelUniversalDataProvider")
		public Object[][] getData() throws IOException {
			
			System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
			return ExcelSheetDataProvider.getExcelData(sheetName);
		}

		@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)
	
	public void GenenrateSchedulingTest(String Facility_Drp ,String Station_Drp ,String Specialization_Drp ,String Doctor_Name_Drp ,
			String Another_Facility_Drp , String Appointment_Frome_Date , String Appointment_To_Date , String Seting_1_From_Time , String Siting_1_To_Date ,
			String Sitting_1_Mon_Appointment_Type_Drp ,String Sitting_1_Mon_Clinic_Type_Drp,String Sitting_1_Mon_Remaks , String Sitting_1_Tues_Appointment_Type_Drp, 
			String Sitting_1_Tues_Clinic_Type_Drp,String Sitting_1_Tues_Remaks,String Sitting_1_Wed_Appointment_Type_Drp , String Sitting_1_Wed_Clinic_Type_Drp,
			String Sitting_1_Wed_Remaks,String Sitting_1_Thurs_Appointment_Type_Drp , String Sitting_1_Thurs_Clinic_Type_Drp , String Sitting_1_Thurs_Remaks ,
			String Sitting_1_Fri_Appointment_Type_Drp , String Sitting_1_Fri_Clinic_Type_Drp , String Sitting_1_Fri_Remaks ,
			String Sitting_1_Sat_Appointment_Type_Drp , String Sitting_1_Sat_Clinic_Type_Drp , String Sitting_1_Sat_Remaks ,
			String Sitting_1_Sun_Appointment_Type_Drp , String Sitting_1_Sun_Clinic_Type_Drp , String Sitting_1_Sun_Remaks , String Sittng_2_From_Time ,
			String Sitting_2_To_Time , String Sitting_2_Mon_Appointment_Type_Drp , String Sitting_2_Mon_Clinic_Type_Drp , String Sitting_2_Mon_Remaks ,
			String Sitting_2_Tue_Appointment_Type_Drp , String Sitting_2_Tue_Clinic_Type_Drp , String Sitting_2_Tue_Remaks , 
			String Sitting_2_Wed_Appointment_Type_Drp , String Sitting_2_Wed_Clinic_Type_Drp , String Sitting_2_Wed_Remaks ,
			String Sitting_2_Thu_Appointment_Type_Drp , String Sitting_2_Thu_Clinic_Type_Drp , String Sitting_2_Thu_Remaks , 
			String Sitting_2_Fri_Appointment_Type_Drp , String Sitting_2_Fri_Clinic_Type_Drp , String Sitting_2_Fri_Remaks , 
			String Sitting_2_Sat_Appointment_Type_Drp , String Sitting_2_Sat_Clinic_Type_Drp , String Sitting_2_Sat_Remaks , 
			String Sitting_2_Sun_Appointment_Type_Drp , String Sitting_2_Sun_Clinic_Type_Drp , String Sitting_2_Sun_Remaks , 
			String Sittng_3_From_Time , String Sitting_3_To_Time , String Sitting_3_Mon_Appointment_Type_Drp , String Sitting_3_Mon_Clinic_Type_Drp ,
			String Sitting_3_Mon_Remaks ,String Sitting_3_Tue_Appointment_Type_Drp ,String Sitting_3_Tue_Clinic_Type_Drp, 
			String Sitting_3_Tue_Remaks , String Sitting_3_Wed_Appointment_Type_Drp , String Sitting_3_Wed_Clinic_Type_Drp , 
			String Sitting_3_Wed_Remaks ,String Sitting_3_Thu_Appointment_Type_Drp , String Sitting_3_Thu_Clinic_Type_Drp ,
			String Sitting_3_Thu_Remaks , String Sitting_3_Fri_Appointment_Type_Drp , String Sitting_3_Fri_Clinic_Type_Drp , 
			String Sitting_3_Fri_Remaks , String Sitting_3_Sat_Appointment_Type_Drp , String Sitting_3_Sat_Clinic_Type_Drp ,
			String Sitting_3_Sat_Remaks , String Sitting_3_Sun_Appointment_Type_Drp , String Sitting_3_Sun_Clinic_Type_Drp , 
			String Sitting_3_Sun_Remaks)
			throws IOException , InterruptedException {
		
		logger= extent.createTest("Generate Scheduling Page ", "Generate Doctor Scheduling Test");
		generateSchedule.selectByFacilityDropdwon(Facility_Drp);
		generateSchedule.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp,
				"Yes Popup Mark Patient Deceased");
		generateSchedule.clickOnGenerateScheduleButton("Add Doctor Schedule", "Generate Schedule Page");
	/*	
		generateSchedule.selectBySpecializationAndDoctorName(Specialization_Drp , Doctor_Name_Drp);
	//	generateSchedule.serachAppointmentDoctorButton("Check Appointment Schedule On Serach Icon");
		
	//	generateSchedule.updateSlotIcon("Update Icon" , "Save Update Icon");
		
		Thread.sleep(5000);
		//------------2nd cash  ------
		generateSchedule.clickOnPlushIcon("Click On Plush Icon");
		generateSchedule.selectByFacilityDrp(Another_Facility_Drp);
		//generateSchedule.AppointmentScheduleingFromDateAndToDate(Appointment_Frome_Date , Appointment_To_Date);
		generateSchedule.enterDateOfGenerateSchedule(Appointment_Frome_Date , Appointment_To_Date);
		
		generateSchedule.setting_1FromeTimeAndToTime(Seting_1_From_Time , Siting_1_To_Date);
		generateSchedule.clickOnDaysCheckBox("Check Box In Days");
		generateSchedule.clickOnTickSingnMarksButton("Click On Sitting 1 Tick Marks");
		generateSchedule.MondayAppointmentType_ClinicType_Remaks(Sitting_1_Mon_Appointment_Type_Drp , Sitting_1_Mon_Clinic_Type_Drp , Sitting_1_Mon_Remaks);
		generateSchedule.TuesdayAppointmentType_ClinicType_Remaks(Sitting_1_Tues_Appointment_Type_Drp , Sitting_1_Tues_Clinic_Type_Drp , Sitting_1_Tues_Remaks)	;
		generateSchedule.WednesdayAppointmentType_ClinicType_Remaks(Sitting_1_Wed_Appointment_Type_Drp , Sitting_1_Wed_Clinic_Type_Drp , Sitting_1_Wed_Remaks);
		generateSchedule.ThursdayAppointmentType_ClinicType_Remaks(Sitting_1_Thurs_Appointment_Type_Drp , Sitting_1_Thurs_Clinic_Type_Drp , Sitting_1_Thurs_Remaks);
		generateSchedule.FridayAppointmentType_ClinicType_Remaks(Sitting_1_Fri_Appointment_Type_Drp , Sitting_1_Fri_Clinic_Type_Drp , Sitting_1_Fri_Remaks);
		generateSchedule.SaturdayAppointmentType_ClinicType_Remaks(Sitting_1_Sat_Appointment_Type_Drp , Sitting_1_Sat_Clinic_Type_Drp , Sitting_1_Sat_Remaks);
		generateSchedule.SundayAppointmentType_ClinicType_Remaks(Sitting_1_Sun_Appointment_Type_Drp , Sitting_1_Sun_Clinic_Type_Drp , Sitting_1_Sun_Remaks);
		
		generateSchedule.Sitting_2FromTimeAndToTime_VerifyOkButton(Sittng_2_From_Time , Sitting_2_To_Time , "Click On Verify Ok Button");
		
		generateSchedule.Setting2_MondayAppointmentType_ClinicType_Remarks( Sitting_2_Mon_Appointment_Type_Drp, Sitting_2_Mon_Clinic_Type_Drp, Sitting_2_Mon_Remaks);
	    generateSchedule.Setting2_TuesdayAppointmentType_ClinicType_Remarks( Sitting_2_Tue_Appointment_Type_Drp, Sitting_2_Tue_Clinic_Type_Drp, Sitting_2_Tue_Remaks);
	    generateSchedule.Setting2_WednesdayAppointmentType_ClinicType_Remarks( Sitting_2_Wed_Appointment_Type_Drp, Sitting_2_Wed_Clinic_Type_Drp, Sitting_2_Wed_Remaks);
	    generateSchedule.Setting2_ThursdayAppointmentType_ClinicType_Remarks( Sitting_2_Thu_Appointment_Type_Drp, Sitting_2_Thu_Clinic_Type_Drp, Sitting_2_Thu_Remaks);
	    generateSchedule.Setting2_FridayAppointmentType_ClinicType_Remarks( Sitting_2_Fri_Appointment_Type_Drp, Sitting_2_Fri_Clinic_Type_Drp, Sitting_2_Fri_Remaks);
	    generateSchedule.Setting2_SaturdayAppointmentType_ClinicType_Remarks(Sitting_2_Sat_Appointment_Type_Drp, Sitting_2_Sat_Clinic_Type_Drp, Sitting_2_Sat_Remaks);
	    generateSchedule.Setting2_SundayAppointmentType_ClinicType_Remarks( Sitting_2_Sun_Appointment_Type_Drp, Sitting_2_Sun_Clinic_Type_Drp, Sitting_2_Sun_Remaks);
	
	    generateSchedule.Sitting_3FromTimeAndToTime_VerifyOkButton(Sittng_3_From_Time , Sitting_3_To_Time , "Click On Verify Ok Button");
	    
	    generateSchedule.Setting3_MondayAppointmentType_ClinicType_Remarks(Sitting_3_Mon_Appointment_Type_Drp, Sitting_3_Mon_Clinic_Type_Drp, Sitting_3_Mon_Remaks);
	    generateSchedule.Setting3_TuesdayAppointmentType_ClinicType_Remarks(Sitting_3_Tue_Appointment_Type_Drp, Sitting_3_Tue_Clinic_Type_Drp, Sitting_3_Tue_Remaks);
	    generateSchedule.Setting3_WednesdayAppointmentType_ClinicType_Remarks(Sitting_3_Wed_Appointment_Type_Drp, Sitting_3_Wed_Clinic_Type_Drp, Sitting_3_Wed_Remaks);
	    generateSchedule.Setting3_ThursdayAppointmentType_ClinicType_Remarks(Sitting_3_Thu_Appointment_Type_Drp, Sitting_3_Thu_Clinic_Type_Drp, Sitting_3_Thu_Remaks);
	    generateSchedule.Setting3_FridayAppointmentType_ClinicType_Remarks(Sitting_3_Fri_Appointment_Type_Drp, Sitting_3_Fri_Clinic_Type_Drp, Sitting_3_Fri_Remaks);
	    generateSchedule.Setting3_SaturdayAppointmentType_ClinicType_Remarks( Sitting_3_Sat_Appointment_Type_Drp, Sitting_3_Sat_Clinic_Type_Drp, Sitting_3_Sat_Remaks);
	    generateSchedule.Setting3_SundayAppointmentType_ClinicType_Remarks(Sitting_3_Sun_Appointment_Type_Drp,Sitting_3_Sun_Clinic_Type_Drp, Sitting_3_Sun_Remaks);
	    
	    generateSchedule.clickOnSaveButton("Click On Save Icon" ,"Save Yes Popup");
	    
	    thread.sleep(1000);
	*/
	}
     private final String Equiment_sheetName = "Doctor_Equiment_Schedule";
		
		@DataProvider(name = "EquimentMappingDataProvider")
		public Object[][] getEquimentMappingData() throws IOException {
			
			System.out.println("====Fetching data from Excel sheet: " + Equiment_sheetName +" ====");
			return ExcelSheetDataProvider.getExcelData(Equiment_sheetName);
		}
		
		@Test(dataProvider = "EquimentMappingDataProvider" , priority = 2)
		
		public void Generate_Equipment_Schedule(String Facility_Drp ,String Station_Drp ,String Equipment_drp , String serach_eqiument_edite_Monday_remaks , 
				String Equiment_Mapping_Facility_drp ,String Equiment_mapping_From_Date ,String Equiment_Mapping_To_Date ,String Equiment_mapping_Sitting_From_Time,
				String Equiment_Mapping_Sitting_To_Time , String Equiment_sitting_1_Mon_Appo , String Equiment_sitting_1_Mon_Clinic_Type , String Equiment_sitting_1_Mon_Remaks,
				String Equiment_sitting_1_Tues_Appo ,String Equiment_sitting_1_Tues_Clinic_Type ,String Equiment_sitting_1_Turs_Remaks,String Equiment_sitting_1_Wed_Appo ,
				String Equiment_sitting_1_Wed_Clinic_Type , String Equiment_sitting_1_Wed_Remaks , String Equiment_sitting_1_Thur_Appo, 
				String Equiment_sitting_1_Thur_Clinic_Type , String Equiment_sitting_1_Thur_Remaks , String Equiment_sitting_1_Fri_Appo ,
				String Equiment_sitting_1_Fri_Clinic_Type , String Equiment_sitting_1_Fri_Remaks , String Equiment_sitting_1_Sat_Appo , 
				String Equiment_sitting_1_Sat_Clinic_Type , String Equiment_sitting_1_Satr_Remaks , String Equiment_sitting_1_Sun_Appo ,
				String Equiment_sitting_1_Sun_Clinic_Type , String Equiment_sitting_1_Sun_Remaks) 
				throws IOException , InterruptedException {
			
			logger= extent.createTest("Generate Equipment Schedule", "Generate Equipment Schedule Test");
			
			equipment_Schedule.clickOnGenerateEquipmentSchedule("Generate Equipment Schedule");
			equipment_Schedule.selectByEquipmentDrp(Equipment_drp);
			//equipment_Schedule.SerachEquimentMappingButton("Click On Serach Icon Btn");
			//equipment_Schedule.enterEquimentMappingEditeMondayRemaks(serach_eqiument_edite_Monday_remaks , "Save edite Remaks Text" , "Yes Popup");
			
			Thread.sleep(5000);
			equipment_Schedule.clickOnPlushIconButton("Click On Plush Icon");
			equipment_Schedule.selectByFacilityEquiment(Equiment_Mapping_Facility_drp);
			equipment_Schedule.enterEqiumentMappingFromAndToDate(Equiment_mapping_From_Date , Equiment_Mapping_To_Date);
			equipment_Schedule.enterSitting_1_EqiumentMappingFromAndToTime(Equiment_mapping_Sitting_From_Time , Equiment_Mapping_Sitting_To_Time);
			
			equipment_Schedule.CheckBoxOnAllDays("All Days Check Box Click");
			equipment_Schedule.sitting_1_OkButton("Click On Sitting 1 Ok Button");
			
			equipment_Schedule.Equiment_Sitting_1_MondayAppointmentType_ClinicType_Remaks(Equiment_sitting_1_Mon_Appo , Equiment_sitting_1_Mon_Clinic_Type , 
					Equiment_sitting_1_Mon_Remaks);
			equipment_Schedule.Equiment_Sitting_1_Tuesday_AppointmentType_ClinicType_Remaks(Equiment_sitting_1_Tues_Appo , Equiment_sitting_1_Tues_Clinic_Type , 
					Equiment_sitting_1_Turs_Remaks);
			equipment_Schedule.Equiment_Sitting_1_Wednesday_AppointmentType_ClinicType_Remaks(Equiment_sitting_1_Wed_Appo , Equiment_sitting_1_Wed_Clinic_Type , 
					Equiment_sitting_1_Wed_Remaks);
			equipment_Schedule.Equiment_Sitting_1_Thursday_AppointmentType_ClinicType_Remaks(Equiment_sitting_1_Thur_Appo , Equiment_sitting_1_Thur_Clinic_Type , 
					Equiment_sitting_1_Thur_Remaks);
			equipment_Schedule.Equiment_Sitting_1_Friday_AppointmentType_ClinicType_Remaks(Equiment_sitting_1_Fri_Appo , Equiment_sitting_1_Fri_Clinic_Type , 
					Equiment_sitting_1_Fri_Remaks);
			
			equipment_Schedule.Equiment_Sitting_1_Saturday_AppointmentType_ClinicType_Remaks(Equiment_sitting_1_Sat_Appo , Equiment_sitting_1_Sat_Clinic_Type , 
					Equiment_sitting_1_Satr_Remaks);
			equipment_Schedule.Equiment_Sitting_1_Sunday_AppointmentType_ClinicType_Remaks(Equiment_sitting_1_Sun_Appo , Equiment_sitting_1_Sun_Clinic_Type , 
					Equiment_sitting_1_Sun_Remaks);
			
			equipment_Schedule.saveEqiumentMappingBtnAndYesPopup("Click On Equiment Mapping Save Icon " , "Yes Popup");
		}
}
