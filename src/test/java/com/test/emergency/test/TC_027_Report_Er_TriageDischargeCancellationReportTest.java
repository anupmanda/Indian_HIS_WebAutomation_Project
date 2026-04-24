/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.emergency.page.Report_Er_TriageDischargeCancellationReportPage;

/**
 * @author Anup
 *
 * 22-Apr-2026
 */
public class TC_027_Report_Er_TriageDischargeCancellationReportTest extends Report_Er_TriageDischargeCancellationReportPage{
	
	Report_Er_TriageDischargeCancellationReportPage Triage_Discharge_Cancellation = new Report_Er_TriageDischargeCancellationReportPage();
	
	@Test(priority = 1,enabled = true)	
	public void TriageDischargeCancellationTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Triage Discharge Cancellation Report", "Triage Discharge Cancellation Report Test Funcility");

		Triage_Discharge_Cancellation.selectByFacilityDropdown("SANITY HOSPITAL");
		Triage_Discharge_Cancellation.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , "EMERGENCY OPD(GROUND FLOOR)", "Station On Yes Popup");

		Triage_Discharge_Cancellation.ErReport_CentralizedReport("Er Report Tab","Er Centralized Report Button");

		Triage_Discharge_Cancellation.TriageDischargeCancellationPage("Click On Triage Patient Bill Status Report Page");
		Triage_Discharge_Cancellation.FromDateSerach("15-04-2026");
		Triage_Discharge_Cancellation.ToDateSerach("22-04-2026");
		
		Triage_Discharge_Cancellation.ClickOnPrintBtn("Click On Print Btn");
		Thread.sleep(1500);
		Triage_Discharge_Cancellation.ClickOnCSVBtn("Click CSV Excel Sheet Icon");
		
	}
}
