/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_Report_EmergencyTotalPatientReportPage;
import com.test.emergency.page.Report_TriageDeptWiseTestAndRevenuePage;

/**
 * @author Anup
 *
 * 22-Apr-2026
 */
public class TC_028_Report_TriageDeptWiseTestAndRevenueTest extends Report_TriageDeptWiseTestAndRevenuePage {

	Report_TriageDeptWiseTestAndRevenuePage Triage_DeptWiseTest_Revenue = new Report_TriageDeptWiseTestAndRevenuePage();
	Er_Report_EmergencyTotalPatientReportPage Emergency_Total_Patient_Report = new Er_Report_EmergencyTotalPatientReportPage();

	@Test(priority = 1,enabled = true)	
	public void SummaryTriageDeptWiseTestRevenueTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Summary All Triage Dept Wise Test Revenue Report", "Summary All Triage Dept Wise Test Revenue Report Test Funcility");

		Triage_DeptWiseTest_Revenue.selectByFacilityDropdown("SANITY HOSPITAL");
		Triage_DeptWiseTest_Revenue.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , "EMERGENCY OPD(GROUND FLOOR)", "Station On Yes Popup");

		Triage_DeptWiseTest_Revenue.ErReport_CentralizedReport("Er Report Tab","Er Centralized Report Button");

		Triage_DeptWiseTest_Revenue.TriageDeptWiseTestAndRevenuePage("Click On Triage Dept Wise Test And Revenue Page");
		Triage_DeptWiseTest_Revenue.ClickOnSummaryRadioBtn("Click on Summary Radio Btn");

		Triage_DeptWiseTest_Revenue.FromDateSerach("15-04-2026");
		Triage_DeptWiseTest_Revenue.ToDateSerach("22-04-2026");

		Triage_DeptWiseTest_Revenue.ClickAllRadioBtn("Click On All Radio Btn");
		Triage_DeptWiseTest_Revenue.ClickOnPrintBtn("Click on Print Btn");

		Thread.sleep(1500);
		Triage_DeptWiseTest_Revenue.ClickOnCSVBtn("Click on CSV Excel Sheet Btn");
		Emergency_Total_Patient_Report.handleDynamicPopup();

		Thread.sleep(1500);
		Triage_DeptWiseTest_Revenue.ClickOnRefreshBtn("Click on Refresh Btn");
	}

	@Test(priority = 2 , enabled = true)	
	public void DetailTriageDeptWiseTestRevenueTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Details All Triage Dept Wise Test Revenue Report", "Details All Triage Dept Wise Test Revenue Report Test Funcility");

		Triage_DeptWiseTest_Revenue.ClickOnDetailyRadioBtn("Click On Details Radio Btn");

		Triage_DeptWiseTest_Revenue.FromDateSerach("15-04-2026");
		Triage_DeptWiseTest_Revenue.ToDateSerach("22-04-2026");

		Triage_DeptWiseTest_Revenue.ClickAllRadioBtn("Click On All Radio Btn");
		Triage_DeptWiseTest_Revenue.ClickOnPrintBtn("Click on Print Btn");

		Thread.sleep(1500);
		Triage_DeptWiseTest_Revenue.ClickOnCSVBtn("Click on CSV Excel Sheet Btn");
		Emergency_Total_Patient_Report.handleDynamicPopup();

		Thread.sleep(1500);
		Triage_DeptWiseTest_Revenue.ClickOnRefreshBtn("Click on Refresh Btn");
	}

	@Test(priority = 3 ,enabled = true)	
	public void DetailSpecificTriageDeptWiseTestRevenueTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Details Specific Triage Dept Wise Test Revenue Report", "Details Specific Department Triage Dept Wise Test Revenue Report Test Funcility");

		Triage_DeptWiseTest_Revenue.ClickOnDetailyRadioBtn("Click On Details Radio Btn");

		Triage_DeptWiseTest_Revenue.FromDateSerach("15-04-2026");
		Triage_DeptWiseTest_Revenue.ToDateSerach("22-04-2026");
		
		Triage_DeptWiseTest_Revenue.ClickSpecificRadioBtn("Click On  Department Specific Radio Btn" , "Click On Department Check Box");

		Triage_DeptWiseTest_Revenue.ClickAllRadioBtn("Click On All Radio Btn");
		Triage_DeptWiseTest_Revenue.ClickOnPrintBtn("Click on Print Btn");

		Thread.sleep(1500);
		Triage_DeptWiseTest_Revenue.ClickOnCSVBtn("Click on CSV Excel Sheet Btn");
		Emergency_Total_Patient_Report.handleDynamicPopup();

		Thread.sleep(1500);
		Triage_DeptWiseTest_Revenue.ClickOnRefreshBtn("Click on Refresh Btn");
	}
}
