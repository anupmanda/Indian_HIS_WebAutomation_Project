/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.ActivitySheetPage;
import com.test.emergency.page.Er_RegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 19-Mar-2026
 */
public class TC_004_ActivitySheetTest extends ActivitySheetPage {

	ActivitySheetPage Activity_Sheet = new ActivitySheetPage();
	Er_RegistrationPage Registration = new Er_RegistrationPage();
	private final String sheetName = "Er_Activity_Sheet"; 

	@DataProvider(name = "ActivitySheetDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====Sheet Name_01: " + sheetName + "======");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ActivitySheetDataProvider" , priority = 1 ,enabled = true)	
	public void ActivitySheetTest(String facility_drp , String Station_drp , String Excel_Enter_UHID , String Enter_Er_Number, 
			String Patient_From_Date , String Patient_To_Date , String Service_Name_Drp, String Search_Patient_Frome_Date ,
			String Search_Patient_To_Date)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Activity Sheet", "Activity Sheet Test Case.");

		Activity_Sheet.selectByFacilityDropdown(facility_drp);
		Activity_Sheet.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" ,Station_drp, "Station On Yes Popup");

		Activity_Sheet.clickOnActivitySheetPage("Emercency Button in side Icon","Activity Sheet Page");
		//Activity_Sheet.EnterUHID(Excel_Enter_UHID);
		//Activity_Sheet.EnterErNumber(Enter_Er_Number);

		//Activity_Sheet.ServiceEnterFrome(Patient_From_Date);
		//Activity_Sheet.ServiceToDate(Patient_To_Date);
		//Activity_Sheet.selectByServiceNameDrp(Service_Name_Drp);
		//Activity_Sheet.SearchActivitySheetBtn("Click On Patient Search Icon");

		//Registration.handleDynamicPopup("After Save Pop Message");

	}

	@Test(dataProvider = "ActivitySheetDataProvider" , priority = 2 ,enabled = true)	
	public void FindCurrentPatientActivitySheetTest(String facility_drp , String Station_drp , String Excel_Enter_UHID , String Enter_Er_Number, 
			String Patient_From_Date , String Patient_To_Date , String Service_Name_Drp, String Search_Patient_Frome_Date ,
			String Search_Patient_To_Date)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Activity Sheet Find Current Patient", "Activity Sheet Find Current Patient Case.");

		Activity_Sheet.FindPatientInTablePopBtn("Find Patient In Search Icon");
		Activity_Sheet.FindPatient_AllRadioBtn("Click On Radio Btn In Find In Patient Pop");

		Activity_Sheet.FindPatient_CurrentPatientsRadioBtn("Click On Radio Btn In Current In Patient");
		Activity_Sheet.FindPatient_AllWardCheckBox("Click On All Ward Check Box");

		Activity_Sheet.FindPatient_AdmissionDischargeCheckBox("Check Box Adission Discharged Check Box");
		Activity_Sheet.SearchPatientEnterFrome(Search_Patient_Frome_Date);
		Activity_Sheet.SearchPatientEnterToDate(Search_Patient_To_Date);
		Activity_Sheet.FindCurrentPatientBtn("Click On Search Btn in Find Patient Pop");

		Activity_Sheet.FindPatientInSubTablePop("Select Find Current Patient Sub Table");

		Activity_Sheet.ServiceEnterFrome(Patient_From_Date);
		//	Activity_Sheet.ServiceToDate(Patient_To_Date);
		Activity_Sheet.selectByServiceNameDrp(Service_Name_Drp);
		Activity_Sheet.SearchActivitySheetBtn("Click On Patient Search Icon");



	}
}
