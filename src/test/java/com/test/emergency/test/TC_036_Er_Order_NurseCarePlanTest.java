/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_OrderPage;
import com.test.emergency.page.Er_Order_NurseCarePlanPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 30-Apr-2026
 */
public class TC_036_Er_Order_NurseCarePlanTest extends Er_Order_NurseCarePlanPage{
	
	Er_Order_NurseCarePlanPage Nurse_Care_Plan = new Er_Order_NurseCarePlanPage();
	Er_OrderPage ER_Order = new Er_OrderPage();

	private final String sheet_Name = "Er_Nurse_Care_Plan_Page"; 

	@DataProvider(name = "NurseCarePlanDataProvider")
	public Object[][]getData() throws IOException{
		System.out.println("=========Sheet Name_01: " + sheet_Name + "==========");
		return ExcelSheetDataProvider.getExcelData(sheet_Name);
	}

	@Test(dataProvider = "NurseCarePlanDataProvider" ,  priority = 1 ,enabled = true)
	public void SelectOccupiedPatientInRightTab(String Facility, String Station , String Nursing_Assessment_Drp , String Problem_Identified_Drp ,
			String Goal_Drp , String Intervention_Drp , String Implementation_Drp , String Outcome_Drp , String Special_Notes_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Select Er Patient","Emergency Select Er Patient Test Funcility");

		Nurse_Care_Plan.selectByFacilityDropdown(Facility);
		Nurse_Care_Plan.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Nurse_Care_Plan.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.SearchAndClickTopGreenPatient();
	}

	@Test(dataProvider = "NurseCarePlanDataProvider" , priority = 2 , enabled = true)
	public void ErMarkedAsErrorTest(String Facility, String Station , String Nursing_Assessment_Drp , String Problem_Identified_Drp ,
			String Goal_Drp , String Intervention_Drp , String Implementation_Drp , String Outcome_Drp , String Special_Notes_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Add All Types Of Nurse Care Plan Values", "Emergency Marked as Error Test Funcility");

		Nurse_Care_Plan.ClickOnNursNotesBtn("Click On Nurse Notes Button");
		Nurse_Care_Plan.ClickOnNurseCarePlanPage("Click On Nurse Care Plan Btn");
		
		//Nurse_Care_Plan.AllTypesOfNurseCarePlanDrp(Nursing_Assessment_Drp , Problem_Identified_Drp , Goal_Drp , 
			//	Intervention_Drp , Implementation_Drp , Outcome_Drp , Special_Notes_Drp);
		
		Nurse_Care_Plan.AllTypesOfNurseCarePlanDrp(3 , 2 , 3 ,	2 , 4 , 5 , 3);
		Nurse_Care_Plan.AddOnNursCarePlane("Click On Add In Plush Icon Btn");
	
		Nurse_Care_Plan.AddNurseCarePlneSubTableErrorMarksIcon("Click On Sub Table Error Marks Nurse Care Plane");
		Nurse_Care_Plan.MarkErrorYesPop("Click On Yes Pop In Marked Error");
	}	
	
	@Test(dataProvider = "NurseCarePlanDataProvider" , priority = 3 , enabled = true)
	public void ErSaveNurseCarePlanTest(String Facility, String Station , String Nursing_Assessment_Drp , String Problem_Identified_Drp ,
			String Goal_Drp , String Intervention_Drp , String Implementation_Drp , String Outcome_Drp , String Special_Notes_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Add All Types Of Nurse Care Plan Values", "Emergency Save Nurse Care Plan Test Funcility");

		Nurse_Care_Plan.AllTypesOfNurseCarePlanDrp(1 , 2 , 3 ,	4 , 2 , 5 , 3);
		Nurse_Care_Plan.AddOnNursCarePlane("Click On Add In Plush Icon Btn");
		Nurse_Care_Plan.ClickOnSaveBtn("Click On Save Nurse Care Plan Btn");
		
		ER_Order.handleDynamicPopup("Add In Row In After Save Btn");
		Nurse_Care_Plan.CurrentillySaveSubTablCarePlane("Check And Verify After Save Row");
		Nurse_Care_Plan.ClickOnVerifyBtn("Click On Verify Button");
		ER_Order.handleDynamicPopup("Add In Row In After Save Btn");
	}	
	
	

}
