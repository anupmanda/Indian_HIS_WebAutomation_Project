/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_Report_EmergencyTotalPatientReportPage;
import com.test.emergency.page.Report_UnsettledBillReportPage;

/**
 * @author Anup
 *
 * 22-Apr-2026
 */
public class TC_030_Report_UnsettledBillReportTest extends Report_UnsettledBillReportPage{
	
	Report_UnsettledBillReportPage ER_Unsettled_Bill = new Report_UnsettledBillReportPage();
	Er_Report_EmergencyTotalPatientReportPage Emergency_Total_Patient_Report = new Er_Report_EmergencyTotalPatientReportPage();

	@Test(priority = 1, enabled = true)	
	public void AscendingUnsettledBillReportTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("ER Ascending Unsettled Bill Test", " ER Ascending Unsettled Bill Report Test Funcility");

		ER_Unsettled_Bill.selectByFacilityDropdown("SANITY HOSPITAL");
		ER_Unsettled_Bill.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , "EMERGENCY OPD(GROUND FLOOR)", "Station On Yes Popup");

		ER_Unsettled_Bill.ReportUnsettledBillReport("Er Report Tab","ER Unsettled Bill Page");
		ER_Unsettled_Bill.SelectBySlotByValue(2);
		ER_Unsettled_Bill.ClickOnRadioBtnAscending("Click On Ascending Order Radio Btn");
		
		ER_Unsettled_Bill.FromDateSerach("10-04-2026");
		ER_Unsettled_Bill.ToDateSerach("22-04-2026");
		ER_Unsettled_Bill.ClickOnPrintBtn("Click On Print Button");
		
		Emergency_Total_Patient_Report.handleDynamicPopup();
		ER_Unsettled_Bill.ClickOnCSVBtn("Click On CSV Excel Sheet Btn");
		
	}
	
	@Test(priority = 2, enabled = true)	
	public void DescendingUnsettledBillReportTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("ER Descending Current Date Unsettled Bill Test", " ER Descending Unsettled Bill Report Test Funcility");

		ER_Unsettled_Bill.SelectBySlotByValue(3);
		ER_Unsettled_Bill.ClickOnRadioBtnDescending("Click On Ascending Order Radio Btn");
		
		ER_Unsettled_Bill.CheckBoxAsOnDate("Click On Current As On Date Check Box");
		ER_Unsettled_Bill.ClickOnPrintBtn("Click On Print Button");
		
		Emergency_Total_Patient_Report.handleDynamicPopup();
		ER_Unsettled_Bill.ClickOnCSVBtn("Click On CSV Excel Sheet Btn");
		
   }
	
}
