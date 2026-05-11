/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.emergency.page.ER_Order_MARPage;
import com.test.emergency.page.Er_OrderPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 11-May-2026
 */
public class TC_039_ER_Order_MARMissedDoseTest extends ER_Order_MARPage {
	
	
	ER_Order_MARPage Medicine_Administration_Record = new ER_Order_MARPage();
	Er_OrderPage ER_Order = new Er_OrderPage();

	private final String sheet_Name = "Er_Missed Dose_Page"; 

	@DataProvider(name = "MARDataProvider")
	public Object[][]getData() throws IOException{
		System.out.println("=========Sheet Name_01: " + sheet_Name + "==========");
		return ExcelSheetDataProvider.getExcelData(sheet_Name);
	}

	@Test(dataProvider = "MARDataProvider" ,  priority = 1 ,enabled = true)
	public void SelectOccupiedPatientInRightTab(String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number,
			String Missed_Dose_Reason_Drp , String Missed_Dose_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Select Er Patient","Emergency Select Er Patient Test Funcility");

		Medicine_Administration_Record.selectByFacilityDropdown(Facility);
		Medicine_Administration_Record.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Medicine_Administration_Record.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.ErSearchPatient (Patient_Type_Drp , Enter_Er_Number);
		ER_Order.SearchAndClickTopGreenPatient();
		
	}
	
	@Test(dataProvider = "MARDataProvider" ,  priority = 2 ,enabled = true)
	public void ErMedicationAdministrationsMissedDoseTest(String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number,
			String Missed_Dose_Reason_Drp , String Missed_Dose_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Missed Dose", "Emergency MAR Missed Dose Test Funcility");
		Medicine_Administration_Record.ClickOnMARBtn("Click On MAR Button");
		Medicine_Administration_Record.RadioBtnActiveMedication("Radio Btn In Active Medication");

		Medicine_Administration_Record.ClickOnMissedDoseSubTable("Medication Sub Table Click");
		Medicine_Administration_Record.YesMultipleAdministrationPopup("Click Yes Pop Multiple administratio");
		
		Medicine_Administration_Record.MissedDoseRadioBtn("Click On Missed Dose Radio Btn");
		Medicine_Administration_Record.MissedDoseReasonDrp( Missed_Dose_Reason_Drp ,  Missed_Dose_Remarks);
		Medicine_Administration_Record.DosegivenCheckBox("Missed Dose  Dose given Check Box");
		
		Medicine_Administration_Record.ClickOnSaveMissedDoseBtn(" Save Missed Dose Btn");
		ER_Order.handleDynamicPopup("Meassage Popup");	
	}

}
