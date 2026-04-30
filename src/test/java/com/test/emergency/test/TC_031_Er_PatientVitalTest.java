/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_PatientVitalPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 23-Apr-2026
 */
public class TC_031_Er_PatientVitalTest extends Er_PatientVitalPage {
	
	Er_PatientVitalPage Patient_Vital = new Er_PatientVitalPage();
	private final String sheetName = "Er_Patient_Vitals"; 
	
	@DataProvider(name = "PatientVitalsDataProvider")
	public Object[][] getVitalsData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "PatientVitalsDataProvider" , priority = 1 ,enabled = true)	
	public void FindInPatientPatientVitailsTest(String facility_drp, String Station_drp , String Search_In_Mobile_Number , String Search_In_Name ,
			String Add_Favorite_Vitals_Name , String Enter_ER_Number )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Find In Patient Patient Vital", "Find In Patient Patient Vital Test Funcility.");

		Patient_Vital.selectByFacilityDropdown(facility_drp);
		Patient_Vital.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Patient_Vital.clickOnEROrderTab("Er Order Tab");
		Patient_Vital.clickOnPatientVitals("Emergency Patient Vital Page");
		
		Patient_Vital.ClickOnSearchIcon("Click On Find In Patient In Search Btn");
		Patient_Vital.ClickOnCurrentInPatientInRadioBtn("Click On Current In Patient Radio Btn");
		Patient_Vital.ClickOnAllWardsCheckBox("Click On All Wards Check Box");
		
		//Patient_Vital.EnterMobileNumber(Search_In_Mobile_Number);  //Enter Keys Use
		Patient_Vital.SearchNameInFindPatient(Search_In_Name);
		Patient_Vital.FindPatientInSearchIcon("Search In Patient Icon");
		
		Patient_Vital.FindInPatientInTable("150");
		Patient_Vital.handleDynamicPopup("Pop Message");
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "PatientVitalsDataProvider" , priority = 2 ,enabled = true)	
	public void AddVitalMappingTest(String facility_drp, String Station_drp , String Search_In_Mobile_Number , String Search_In_Name ,
			String Add_Favorite_Vitals_Name , String Enter_ER_Number )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Patient Vital Mapping", " Patient Vital Mapping Test Funcility.");

		Patient_Vital.clickOnVitalsMappingButton("Click On Vital Mapping Button");
		Patient_Vital.EnterFavoriteVitalsMapping(Add_Favorite_Vitals_Name);
		Patient_Vital.ClickFavoriteVitalsNameInTable("Select Vitals Mapping In Table");
		
		Patient_Vital.SaveFavoriteVitalsMapping("Save On Vitals Mapping Btn");	
		Patient_Vital.handleDynamicPopup("Pop Message");
		Thread.sleep(1000);
		
	}
	
	@Test(dataProvider = "PatientVitalsDataProvider" , priority = 3 ,enabled = true)	
	public void DeleteVitalMappingTest(String facility_drp, String Station_drp , String Search_In_Mobile_Number , String Search_In_Name ,
			String Add_Favorite_Vitals_Name , String Enter_ER_Number )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Delete Patient Vital Mapping", "Delete Patient Vital Mapping Test Funcility.");
		
		Patient_Vital.DeleteFavoriteVitalsNameInTable("Click On Delete Vitals Name");
		Thread.sleep(1000);
		
		Patient_Vital.SaveFavoriteVitalsMapping("Save On Vitals Mapping Btn");	
		Patient_Vital.handleDynamicPopup("Pop Message");
		Patient_Vital.ChildWindowToParentWindow("Close Vitals Mapping Window");
	
	}
	
	@Test(dataProvider = "PatientVitalsDataProvider" , priority = 4 ,enabled = true)	
	public void EnterERNoVitalMappingTest(String facility_drp, String Station_drp , String Search_In_Mobile_Number , String Search_In_Name ,
			String Add_Favorite_Vitals_Name , String Enter_ER_Number )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Enter Vital Value ", "Enter Vitals Value In Er Number Test Funcility.");
		
		Patient_Vital.EnterErNumber(Enter_ER_Number);
		Patient_Vital.AddVitalsValueButton("Click On Add Plush Icon");
		
		Patient_Vital.enterVitalValue("Head Circumference", "40");
		Patient_Vital.enterVitalValue("Height", "100");
		Patient_Vital.enterVitalValue("Pain Score", "20");
		Patient_Vital.enterVitalValue("Blood Sugar(F)", "100");
		Patient_Vital.enterVitalValue("Blood Sugar(R)", "90");
		Patient_Vital.enterVitalValue("Remarks", "Enter Value Vitals");
		
		Patient_Vital.handleDynamicPopup("Pop Message");
		Thread.sleep(1000);
		Patient_Vital.SaveVitalsValueBtn("Click on save Button");
			
	}
}
