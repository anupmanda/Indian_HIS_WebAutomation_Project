/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_Report_EmergencyTotalPatientReportPage;


/**
 * @author Anup
 *
 * 21-Apr-2026
 */
public class TC_025_Er_Report_EmergencyTotalPatientReportTest extends Er_Report_EmergencyTotalPatientReportPage {

	Er_Report_EmergencyTotalPatientReportPage Emergency_Total_Patient_Report = new Er_Report_EmergencyTotalPatientReportPage();

	@Test(priority = 1,enabled = true)	
	public void DischargeReportAndCSVSheetTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Discharge Report", "Discharge Report Test Funcility");

		Emergency_Total_Patient_Report.selectByFacilityDropdown("SANITY HOSPITAL");
		Emergency_Total_Patient_Report.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , "EMERGENCY OPD(GROUND FLOOR)", "Station On Yes Popup");

		Emergency_Total_Patient_Report.ErReport_CentralizedReport("Er Report Tab","Er Centralized Report Button");

		Emergency_Total_Patient_Report.ClickOnEmergencyTotalPatientReport("Click On Emergency Total Patient Report Page");
		Emergency_Total_Patient_Report.selectRadioBtnInDischargeReport("Click On Discharge Report Radio Brn");

		Emergency_Total_Patient_Report.FromDateSerach("18-04-2026");
		Emergency_Total_Patient_Report.ToDateSerach("22-04-2026");
		Emergency_Total_Patient_Report.SearchReportBtn("Click On Search Report Icon");

		Emergency_Total_Patient_Report.ClickOnCSVExcelSheetBtn("Click On CSV Excel Sheet Icon");
		Thread.sleep(1500);
	}

	@Test(priority = 2 ,enabled = true)	
	public void EmergencyConvertedPatientReportTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Converted Patient Report", "Emergency Converted Patient Report Test Funcility");

		Emergency_Total_Patient_Report.EmergencyConvertedPatientReportRadioBtn("Click On Emergency Total Patient Report Radio Btn");

		Emergency_Total_Patient_Report.FromDateSerach("18-04-2026");
		Emergency_Total_Patient_Report.ToDateSerach("22-04-2026");
		Emergency_Total_Patient_Report.SearchReportBtn("Click On Search Report Icon");

		Emergency_Total_Patient_Report.handleDynamicPopup();
		Emergency_Total_Patient_Report.ClickOnCSVExcelSheetBtn("Click On CSV Excel Sheet Icon");
		Emergency_Total_Patient_Report.handleDynamicPopup();
	}

	@Test(priority = 3 ,enabled = true)	
	public void AllDischargeConvertedPatientReportTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("All Discharge Converted Patient Report", "All Discharge Converted Patient Report Test Funcility");

		Emergency_Total_Patient_Report.AllDischargeConvertedPatientReportRadioBtn("Click On All Emergency Total Patient Report Radio Btn");

		Emergency_Total_Patient_Report.FromDateSerach("18-04-2026");
		Emergency_Total_Patient_Report.ToDateSerach("22-04-2026");
		Emergency_Total_Patient_Report.SearchReportBtn("Click On Search Report Icon");

		Emergency_Total_Patient_Report.handleDynamicPopup();
		Emergency_Total_Patient_Report.ClickOnCSVExcelSheetBtn("Click On CSV Excel Sheet Icon");
		Emergency_Total_Patient_Report.handleDynamicPopup();
	} 
	@Test(priority = 4 ,enabled = true)	
	public void EmergencyCurrentPatientReportTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Current Patient Report", "Emergency Current Patient Report Test Funcility");

		Emergency_Total_Patient_Report.EmergencyCurrentPatientReportRadioBtn("Click On Emergency Current Patient Report Radio Btn");
		Emergency_Total_Patient_Report.SearchReportBtn("Click On Search Report Icon");

		Emergency_Total_Patient_Report.handleDynamicPopup();
		Emergency_Total_Patient_Report.ClickOnCSVExcelSheetBtn("Click On CSV Excel Sheet Icon");
		Emergency_Total_Patient_Report.handleDynamicPopup();

	}
	
	@Test(priority = 5 ,enabled = true)	
	public void ER_ReadmissionReportTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Readmission Report", "Emergency Readmission Report Test Funcility");

		Emergency_Total_Patient_Report.ERReadmissionReportRadioBtn("Click On Emergency Readmission Report Radio Btn");
		Emergency_Total_Patient_Report.FromDateSerach("18-04-2026");
		Emergency_Total_Patient_Report.ToDateSerach("22-04-2026");
		
		Emergency_Total_Patient_Report.SearchReportBtn("Click On Search Report Icon");

		Emergency_Total_Patient_Report.handleDynamicPopup();
		Emergency_Total_Patient_Report.ClickOnCSVExcelSheetBtn("Click On CSV Excel Sheet Icon");
		//Emergency_Total_Patient_Report.handleDynamicPopup();

	}
}
