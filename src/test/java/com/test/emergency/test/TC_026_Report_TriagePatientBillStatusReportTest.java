/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.emergency.page.Report_TriagePatientBillStatusReportPage;

/**
 * @author Anup
 *
 * 22-Apr-2026
 */
public class TC_026_Report_TriagePatientBillStatusReportTest extends Report_TriagePatientBillStatusReportPage{
	
	Report_TriagePatientBillStatusReportPage Triage_Patient_Bill_Status = new Report_TriagePatientBillStatusReportPage();
	
	@Test(priority = 1,enabled = true)	
	public void AscendingTriagePatientBillStatusTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Ascending Triage Patient Bill Status", "Ascending Triage Patient Bill Status Test Funcility");

		Triage_Patient_Bill_Status.selectByFacilityDropdown("SANITY HOSPITAL");
		Triage_Patient_Bill_Status.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , "EMERGENCY OPD(GROUND FLOOR)", "Station On Yes Popup");

		Triage_Patient_Bill_Status.ErReport_CentralizedReport("Er Report Tab","Er Centralized Report Button");

		Triage_Patient_Bill_Status.TriagePatientBillStatusReportPage("Click On Triage Patient Bill Status Report Page");
		Triage_Patient_Bill_Status.FromDateSerach("17-04-2026");
		Triage_Patient_Bill_Status.ToDateSerach("22-04-2026");
		
		Triage_Patient_Bill_Status.SelectBtSortByDrpValue(2);   //Index
		Triage_Patient_Bill_Status.AscendingRadioBtn("Click On Ascending Order Report");
		
		Triage_Patient_Bill_Status.ClickOnPrintBtn("Click On Print Triage Patient Bill Status Report");
		Thread.sleep(1500);
		Triage_Patient_Bill_Status.ClickOnCSVBtn("Click On CSV Triage Patient Bill Status Report");
		Thread.sleep(1500);
		Triage_Patient_Bill_Status.ClickOnRefreshBtn("Click on Refresh Btn");
	}
	
	@Test(priority = 2 , enabled = true)	
	public void DescendingTriagePatientBillStatusTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Descending Triage Patient Bill Status", "Descending Triage Patient Bill Status Test Funcility");
		
		Triage_Patient_Bill_Status.FromDateSerach("15-04-2026");
		Triage_Patient_Bill_Status.ToDateSerach("22-04-2026");
		
		Triage_Patient_Bill_Status.SelectBtSortByDrp("Admission Date");
		Triage_Patient_Bill_Status.DescendingRadioBtn("Radio Btn Descending Order Report");
		
		Triage_Patient_Bill_Status.ClickOnPrintBtn("Click On Print Triage Patient Bill Status Report");
		Thread.sleep(1500);
		Triage_Patient_Bill_Status.ClickOnCSVBtn("Click On CSV Triage Patient Bill Status Report");
		Thread.sleep(1500);
  }
}
