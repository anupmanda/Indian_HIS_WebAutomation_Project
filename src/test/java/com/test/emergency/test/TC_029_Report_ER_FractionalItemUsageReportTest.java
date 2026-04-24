/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_Report_EmergencyTotalPatientReportPage;
import com.test.emergency.page.Report_ER_FractionalItemUsageReportPage;

/**
 * @author Anup
 *
 * 22-Apr-2026
 */
public class TC_029_Report_ER_FractionalItemUsageReportTest extends Report_ER_FractionalItemUsageReportPage {
	
	Report_ER_FractionalItemUsageReportPage Fractional_Item_Usage = new Report_ER_FractionalItemUsageReportPage();

	Er_Report_EmergencyTotalPatientReportPage Emergency_Total_Patient_Report = new Er_Report_EmergencyTotalPatientReportPage();

	@Test(priority = 1,enabled = true)	
	public void FractionalItemUsageReportTest() 
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Fractional Item Usage Report", " Fractional Item Usage Report Test Funcility");

		Fractional_Item_Usage.selectByFacilityDropdown("SANITY HOSPITAL");
		Fractional_Item_Usage.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , "EMERGENCY OPD(GROUND FLOOR)", "Station On Yes Popup");

		Fractional_Item_Usage.ErReport_CentralizedReport("Er Report Tab","Er Centralized Report Button");

		Fractional_Item_Usage.FractionalItemUsageReportPage("Click On Fractional Item Usage Report Page");
		Fractional_Item_Usage.FromDateSerach("10-04-2026");
		Fractional_Item_Usage.ToDateSerach("22-04-2026");
		
		Fractional_Item_Usage.ClickOnPrintBtn("Click On Print Button");
		Emergency_Total_Patient_Report.handleDynamicPopup();
	}
}
