/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.DoctorBlockScheduleAndEquipmentSchedulePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 16-Jan-2026
 */
public class TC_024_DoctorBlockSchedule_EquipmentScheduleTest extends DoctorBlockScheduleAndEquipmentSchedulePage{
	
	DoctorBlockScheduleAndEquipmentSchedulePage Block_Schedule = new DoctorBlockScheduleAndEquipmentSchedulePage();
	DoctorBlockScheduleAndEquipmentSchedulePage equipment_Block = new DoctorBlockScheduleAndEquipmentSchedulePage();
	
	  private final String sheetName = "Doctor_Block_Schedule";
	  private final String sheetName_Equiment = "Equiment_Block_Schedule";
	  
		@DataProvider(name = "DoctorBlockSheduleDataProvider")
		public Object[][] getDoctorBlockData() throws IOException {
			
			System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
			return ExcelSheetDataProvider.getExcelData(sheetName);
		}

		@Test(dataProvider = "DoctorBlockSheduleDataProvider" , priority = 1, enabled = true)
	
	public void BlockSchedulingTest(String Facility_Drp ,String Station_Drp , String Specialization_Drp , String Remarks_Text , 
			String Doctor_Drp , String Current_Block_Frome_Date , String Block_To_Date , String Monday_From_Time , String Monday_To_Time , 
			String Monday_Remaks ,String Tuesday_From_Time , String Tuesday_To_Time , String Tuesday_Remaks , String Wednesday_From_Time , 
			String Wednesday_To_Time ,  String Wednesday_Remaks , String Thursday_From_Time , String Thursday_To_Time , String Thursday_Remaks ,
			String Friday_From_Time , String Friday_To_Time , String Friday_Remaks , String Saturday_From_Time , String Saturday_To_Time ,
			String Saturday_Remaks , String Sunday_From_Time , String Sunday_To_Time , String Sunday_Remaks)
			throws IOException , InterruptedException {
		
		logger= extent.createTest("Doctor Block Scheduling Page ", "Doctor Block Scheduling Test");
		
		Block_Schedule.selectByFacilityDropdwon(Facility_Drp);
		Block_Schedule.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup");
		Block_Schedule.clickOnBlockScheduleButton("Add Doctor Schedule", "BlockS Schedule Page");
		
		Block_Schedule.clickOnBlockScheduleIcon("Block Schedule Icon");
		Block_Schedule.selectBySpecializationDropdwon(Specialization_Drp);
		//Block_Schedule.CheckBoxkUncheckDoctorUnavailableAndRemaks("Doctor Unavailable Checkbox", Remarks_Text);
		
		Block_Schedule.selectByDoctorDropdwon(Doctor_Drp);
		Block_Schedule.PlushIconBtn("Click on Plus Icon Button to add Block Schedule");
		Block_Schedule.enterBlockFromDate(Current_Block_Frome_Date);
		Block_Schedule.enterBlockToDate(Block_To_Date);
		
		Block_Schedule.MondayDoctorBlockDay("Monday_Checkbox" , Monday_From_Time , Monday_To_Time , Monday_Remaks);
		Block_Schedule.TuesdayDoctorBlockDay("Tuesday_Checkbox" , Tuesday_From_Time , Tuesday_To_Time , Tuesday_Remaks);
		Block_Schedule.WednesdayDoctorBlockDay("Wednesday_Checkbox" , Wednesday_From_Time , Wednesday_To_Time , Wednesday_Remaks);
		Block_Schedule.ThursdayDoctorBlockDay("Thursday_Checkbox" , Thursday_From_Time , Thursday_To_Time , Thursday_Remaks);
		Block_Schedule.FridayDoctorBlockDay("Friday_Checkbox" , Friday_From_Time , Friday_To_Time , Friday_Remaks);
		Block_Schedule.SaturdayDoctorBlockDay("Saturday_Checkbox" , Saturday_From_Time , Saturday_To_Time , Saturday_Remaks);
		Block_Schedule.SundayDoctorBlockDay("Sunday_Checkbox" , Sunday_From_Time , Sunday_To_Time , Sunday_Remaks);
		
		Block_Schedule.saveBlockScheduleButton("Save Block Schedule Button" ,"Yes Popup Save Confirmation Doctor");
		
		}	
		

		
		@DataProvider(name = "EquimentBlockSheduleDataProvider")
		public Object[][] getBlockEquimentData() throws IOException {
			
			System.out.println("====Fetching data from Excel sheet: " + sheetName_Equiment +" ====");
			return ExcelSheetDataProvider.getExcelData(sheetName_Equiment);
		}

		@Test(dataProvider = "EquimentBlockSheduleDataProvider" , priority = 2 , enabled = true)
	
	public void BlockEquimentTest(String Facility_Drp ,String Station_Drp, String Equipment_Drp , String Current_Equiment_Frome_Date ,
			String Equiment_To_Date , String Equiment_Monday_From_Time , String Equiment_Monday_To_Time , String Equiment_Monday_Remaks ,
			String Equiment_Tuesday_From_Time , String Equiment_Tuesday_To_Time , String Equiment_Tuesday_Remaks , String Equiment_Wednesday_From_Time ,
			String Equiment_Wednesday_To_Time , String Equiment_Wednesday_Remaks , String Equiment_Thursday_From_Time , String Equiment_Thursday_To_Time ,
			String Equiment_Thursday_Remaks , String Equiment_Friday_From_Time , String Equiment_Friday_To_Time , String Equiment_Friday_Remaks ,
			String Equiment_Saturday_From_Time , String Equiment_Saturday_To_Time , String Equiment_Saturday_Remaks , String Equiment_Sunday_From_Time ,
			String Equiment_Sunday_To_Time , String Equiment_Sunday_Remaks)
			throws IOException , InterruptedException {
		
		logger= extent.createTest("Doctor Block Scheduling Page ", "Doctor Block Scheduling Test");
		
		equipment_Block.selectByFacilityDropdwon(Facility_Drp);
		equipment_Block.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup");
		equipment_Block.clickOnBlockScheduleButton("Add Doctor Schedule", "Block Schedule Page");

		equipment_Block.clickOnEquipmentScheduleIcon("Equipment Block Schedule Icon");
		equipment_Block.selectByEquipmentDropdwon(Equipment_Drp);
		equipment_Block.PlushIconBtn("Click on Plus Icon Button to add Equipment Block Schedule");
		
		equipment_Block.enterEquipmentFromDate(Current_Equiment_Frome_Date);
		equipment_Block.enterEquipmentToDate(Equiment_To_Date);
		equipment_Block.MondayEquipmentBlockDay("Equiment_Momday Checkbox" , Equiment_Monday_From_Time , Equiment_Monday_To_Time , Equiment_Monday_Remaks);
		equipment_Block.TuesdayEquipmentBlockDay("Equiment_Tuesday Checkbox" , Equiment_Tuesday_From_Time , Equiment_Tuesday_To_Time , Equiment_Tuesday_Remaks);
		equipment_Block.WednesdayEquipmentBlockDay("Equiment_Wednesday Checkbox" ,Equiment_Wednesday_From_Time , Equiment_Wednesday_To_Time , Equiment_Wednesday_Remaks);
		equipment_Block.ThursdayEquipmentBlockDay("Equiment_Thursday Checkbox",Equiment_Thursday_From_Time , Equiment_Thursday_To_Time , Equiment_Thursday_Remaks);
		equipment_Block.FridayEquipmentBlockDay("Equiment_Friday Checkbox",Equiment_Friday_From_Time , Equiment_Friday_To_Time , Equiment_Friday_Remaks);
		equipment_Block.SaturdayEquipmentBlockDay("Equiment_Saturday Checkbox",Equiment_Saturday_From_Time , Equiment_Saturday_To_Time , Equiment_Saturday_Remaks);
		equipment_Block.SundayEquipmentBlockDay("Equiment_Sunday Checkbox",Equiment_Sunday_From_Time , Equiment_Sunday_To_Time , Equiment_Sunday_Remaks);
		
		equipment_Block.saveEquipmentScheduleButton("Save Equiment Schedule Button" ,"Yes Popup Save Confirmation Equiment");
		}
}
