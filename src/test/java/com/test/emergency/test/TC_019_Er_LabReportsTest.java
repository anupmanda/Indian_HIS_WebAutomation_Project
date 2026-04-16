/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_LabReportsPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 15-Apr-2026
 */
public class TC_019_Er_LabReportsTest extends Er_LabReportsPage {
	
	// Importance Oder Drug In page Sales Consumption
	
	Er_LabReportsPage Lab_Reports = new Er_LabReportsPage();
	private final String sheetName = "Er_Lab_Report_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = true)	
	public void ErLabReportInDateWiseTest(String facility_drp, String Station_drp , String Report_Faclility_Drp , String Fron_Date_Report , String To_Date_Report,
			String Ward_Drp , String Enter_UHID)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Lab Report In Date Wise", "Previous Lab Report Test Funcility");

		Lab_Reports.selectByFacilityDropdown(facility_drp);
		Lab_Reports.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Lab_Reports.clickOnEmercencyErLabReport("Er Order Tab","Er Lab Report Page");
		Lab_Reports.SelectPatientFaclilityReportDrp(Report_Faclility_Drp ,"Click On Search Btn");
		
		Lab_Reports.SearchDateFromeAndToDate("Select Radio Btn In Date" , Fron_Date_Report , To_Date_Report);
		Lab_Reports.SelectWardDrp(Ward_Drp);
		Lab_Reports.ClickOnSearchAndFindReport("Click On Search And Find Patient");
		
		Lab_Reports.CloseFindPatientReportPop("Close Search Pop");
		Thread.sleep(800);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = true)	
	public void ErLabReportInUHIDTest(String facility_drp, String Station_drp , String Report_Faclility_Drp , String Fron_Date_Report , String To_Date_Report,
			String Ward_Drp , String Enter_UHID)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Lab Report In UHID", "UHID Lab Report Test Funcility");
		
		Lab_Reports.SelectPatientFaclilityReportDrp(Report_Faclility_Drp ,"Click On Search Btn");
		Lab_Reports.ClickOnRadioBtnInUHID("Select Radio Btn In UHID" , Enter_UHID);
		Lab_Reports.ClickOnSearchAndFindReport("Click On Search And Find Patient");
	}
	
}

//InComplete Because Report Print Btn Work in Lab Medicine Module Ackowlge Add Save 
