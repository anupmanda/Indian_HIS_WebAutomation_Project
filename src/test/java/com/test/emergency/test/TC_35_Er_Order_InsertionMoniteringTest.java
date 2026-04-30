/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_OrderPage;
import com.test.emergency.page.Er_Order_InsertionMoniteringPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 29-Apr-2026
 */
public class TC_35_Er_Order_InsertionMoniteringTest extends Er_Order_InsertionMoniteringPage {
	
	Er_Order_InsertionMoniteringPage Insertion_Monitering = new Er_Order_InsertionMoniteringPage();
	Er_OrderPage ER_Order = new Er_OrderPage();

	private final String sheet_Name = "Er_Insertion_Monitering_Page"; 

	@DataProvider(name = "InsertionMoniteringDataProvider")
	public Object[][]getData() throws IOException{
		System.out.println("=========Sheet Name_01: " + sheet_Name + "==========");
		return ExcelSheetDataProvider.getExcelData(sheet_Name);
	}

	@Test(dataProvider = "InsertionMoniteringDataProvider" ,  priority = 1 ,enabled = true)
	public void SelectOccupiedPatientInRightTab(String Facility, String Station, String Type_Of_Insertion_Drp , String Dressing_Drp ,String Site_Drp ,
			String Size_Text , String No_Of_Attempts_Text , String Doctor_Drp , String Insertion_Notes , String Maintenance_Shift ,
			String Maintenance_Saline_Flush , String Maintenance_VIP_Score , String Maintenance_Genital_Meatal_Care) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Select Er Patient","Emergency Select Er Patient Test Funcility");

		Insertion_Monitering.selectByFacilityDropdown(Facility);
		Insertion_Monitering.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Insertion_Monitering.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.SearchAndClickTopGreenPatient();
	}

	@Test(dataProvider = "InsertionMoniteringDataProvider" , priority = 2 , enabled = true)
	public void ErInsertionDetailsTest(String Facility, String Station, String Type_Of_Insertion_Drp , String Dressing_Drp ,String Site_Drp ,
			String Size_Text , String No_Of_Attempts_Text , String Doctor_Drp , String Insertion_Notes , String Maintenance_Shift ,
			String Maintenance_Saline_Flush , String Maintenance_VIP_Score , String Maintenance_Genital_Meatal_Care) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Insertion Details ", "Emergency Insertion Details Test Funcility");

		Insertion_Monitering.ClickOnNursNotesBtn("Click On Nurse Notes Button");
		Insertion_Monitering.ClickOnInsertionMoniteringBtn("Click On Pain Assessment Tool Btn");
		
		Insertion_Monitering.TypeOfInsertion_Dressing(Type_Of_Insertion_Drp , Dressing_Drp);
		Insertion_Monitering.InsertionSiteDrp1(Site_Drp);
		
		Insertion_Monitering.InsertionSize_NoOfAttempts_Doctor_InsertionNotes(Size_Text , No_Of_Attempts_Text +CommanUtill.randomDigits(1) , Doctor_Drp ,
				Insertion_Notes);
		
		Insertion_Monitering.SaveInsertionDetailsBtn("Click On Save Btn");
		Insertion_Monitering.scrollRight();
		Thread.sleep(1000);
		Insertion_Monitering.InsertionDetailSubTableAddOnPlushIcon("Click On Insertion Details Sub Table In Plush Btn"); // Add Table
	}
	
	@Test(dataProvider = "InsertionMoniteringDataProvider" , priority = 3 , enabled = true)
	public void ErMaintenanceDetaitsTest(String Facility, String Station, String Type_Of_Insertion_Drp , String Dressing_Drp ,String Site_Drp ,
			String Size_Text , String No_Of_Attempts_Text , String Doctor_Drp , String Insertion_Notes , String Maintenance_Shift ,
			String Maintenance_Saline_Flush , String Maintenance_VIP_Score , String Maintenance_Genital_Meatal_Care) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Insertion Monitering ", "Emergency Insertion Monitering Test Funcility");
		
		Insertion_Monitering.MaintenanceDetailsInformation(Maintenance_Shift , Maintenance_Saline_Flush , Maintenance_VIP_Score , 
				Maintenance_Genital_Meatal_Care);
		Insertion_Monitering.SaveMaintenanceDetails("Save Maintenance Details");
		Insertion_Monitering.InsertionDetailSubTableAddOnViewIcon("Click On Insertion Details Sub Table In View Search Btn"); //View Table
	}
	
	@Test(dataProvider = "InsertionMoniteringDataProvider" , priority = 4 , enabled = true)
	public void ErDeleteInsertionDetailsTest(String Facility, String Station, String Type_Of_Insertion_Drp , String Dressing_Drp ,String Site_Drp ,
			String Size_Text , String No_Of_Attempts_Text , String Doctor_Drp , String Insertion_Notes , String Maintenance_Shift ,
			String Maintenance_Saline_Flush , String Maintenance_VIP_Score , String Maintenance_Genital_Meatal_Care) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Marked as Error Insertion Details Sub Table", "Emergency Marked as Error Insertion Details Sub Table Test Funcility");
		
		Insertion_Monitering.TypeOfInsertion_Dressing(Type_Of_Insertion_Drp , Dressing_Drp);
		Insertion_Monitering.InsertionSiteDrp1(Site_Drp);
		Insertion_Monitering.SaveInsertionDetailsBtn("Click On Save Btn");
		Insertion_Monitering.scrollRight();
		
		Insertion_Monitering.InsertionDetailSubTableMarkedAsError("Click On Insertion Details Sub Table In Marked as Error Btn");
		Insertion_Monitering.YesMarkItAsEnteredInErrorPop("Click On Yes Mark It As Entered in Error Popup");
		
	}
}
