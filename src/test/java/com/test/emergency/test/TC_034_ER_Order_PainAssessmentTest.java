/**
 * 
 */
package com.test.emergency.test;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.emergency.page.ER_Order_PainAssessmentPage;
import com.test.emergency.page.Er_OrderPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 29-Apr-2026
 */
public class TC_034_ER_Order_PainAssessmentTest extends ER_Order_PainAssessmentPage {

	ER_Order_PainAssessmentPage Pain_Assessment = new ER_Order_PainAssessmentPage();
	Er_OrderPage ER_Order = new Er_OrderPage();

	private final String sheet_Name = "Er_Pain_Assessment_Page"; 

	@DataProvider(name = "PainAssessmentDataProvider")
	public Object[][]getData() throws IOException{
		System.out.println("=========Sheet Name_01: " + sheet_Name + "==========");
		return ExcelSheetDataProvider.getExcelData(sheet_Name);
	}

	@Test(dataProvider = "PainAssessmentDataProvider" ,  priority = 1 ,enabled = true)
	public void SelectOccupiedPatientInRightTab(String Facility, String Station , String Precipitating_Factor_Drp , String Type_Of_Pain_Drp , String Location_Drp ,
			String Pain_Score_Drp , String Frequency_Drp , String Muscle_Power_Grading_Drp , String Sedation_Score_Drp , String Nausea_Vomiting_Score_Drp ,
			String Remarks_Text , String Duration_Text , String Location_Remarks , String Aggravating_Factors , String Relieving_Factors ,
			String Post_Intervention_Score_Drp , String Intervention_Text , String Outcome_Text) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Pain Assessment Tool","Emergency Pain Assessment Test Funcility");

		Pain_Assessment.selectByFacilityDropdown(Facility);
		Pain_Assessment.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Pain_Assessment.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.SearchAndClickTopGreenPatient();
	}

	@Test(dataProvider = "PainAssessmentDataProvider" , priority = 2 , enabled = true)
	public void ErPainAssessmentTest(String Facility, String Station , String Precipitating_Factor_Drp , String Type_Of_Pain_Drp , String Location_Drp ,
			String Pain_Score_Drp , String Frequency_Drp , String Muscle_Power_Grading_Drp , String Sedation_Score_Drp , String Nausea_Vomiting_Score_Drp ,
			String Remarks_Text , String Duration_Text , String Location_Remarks , String Aggravating_Factors , String Relieving_Factors ,
			String Post_Intervention_Score_Drp , String Intervention_Text , String Outcome_Text) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Pain Assessment", "Emergency Pain Assessment Test Funcility");

		Pain_Assessment.ClickOnNursNotesBtn("Click On Nurse Notes Button");
		Pain_Assessment.ClickOnpainAssessmentlBtn("Click On Pain Assessment Tool Btn");

		driver.navigate().refresh();
		Pain_Assessment.painAssessment_PrecipitatingFactor_TypeOfPain_Laction_PainScoreFrequencyDrp(Precipitating_Factor_Drp , Type_Of_Pain_Drp ,
				Location_Drp , Pain_Score_Drp , Frequency_Drp);

		//	Pain_Assessment.painAssessmentOtherInformationDetails(Muscle_Power_Grading_Drp , Sedation_Score_Drp , Nausea_Vomiting_Score_Drp , Remarks_Text , 
		//		Duration_Text , Location_Remarks , Aggravating_Factors , Relieving_Factors);

		Pain_Assessment.ClickOnSavePainAssessmentBtnYesPop("Click On Save Btn In Pain Assessment" , "Send To Notification to Doctor Yes Pop");
		Thread.sleep(1000);

		//Scroll to Bottom of Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Pain_Assessment.PainAssesmentSubTable("Click On Pain Assesment Sub Table View Icon");
	}

	@Test(dataProvider = "PainAssessmentDataProvider" , priority = 3 , enabled = true)
	public void ErInterventionDetailsTest(String Facility, String Station , String Precipitating_Factor_Drp , String Type_Of_Pain_Drp , String Location_Drp ,
			String Pain_Score_Drp , String Frequency_Drp , String Muscle_Power_Grading_Drp , String Sedation_Score_Drp , String Nausea_Vomiting_Score_Drp ,
			String Remarks_Text , String Duration_Text , String Location_Remarks , String Aggravating_Factors , String Relieving_Factors ,
			String Post_Intervention_Score_Drp , String Intervention_Text , String Outcome_Text) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Intervention Details ", " Emergency Intervention Details Test Funcility");


		//Scroll to Top of Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");

		Pain_Assessment.InterventionDetailsInformation(Post_Intervention_Score_Drp , Intervention_Text , Outcome_Text );
		Pain_Assessment.InterventionSaveBtn("Click On Save Btn In Intervention");

		ER_Order.handleDynamicPopup("After Save Meassage Popup");
		JavascriptExecutor bottom = (JavascriptExecutor) driver;
		bottom.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		Pain_Assessment.PainAssesmentSubTableView("Click On View Pain Assesment Sub Table Pink Colurs");
		Pain_Assessment.InterventionSubTableVew("Click On Pain Intervention  Sub Table View Icon");
		Pain_Assessment.InterventionVerifyIcon("Click On Vrify Intervention Icon");

	}

}
