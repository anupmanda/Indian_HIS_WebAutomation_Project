/**
 * 
 */
package com.test.Nursing.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Nursing.page.NursingActivityPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class TC_002_NursingActivityTest extends NursingActivityPage {
	
	NursingActivityPage Nursing_Activity = new NursingActivityPage();
	
	private final String sheetName_Nursing_Activity = "Nursing_Activity_Page";
	
	@DataProvider(name = "NursingActivityDataProvider")
	public Object[][] getActivityData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Nursing_Activity + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Nursing_Activity);
	}

	@Test(dataProvider = "NursingActivityDataProvider", priority = 1 , enabled = true)
	public void NursingClearanceTest(String Dashborad_Facility_Drp , String Nursing_Station_Drp ) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Acknowledge Discharge Notification Test", "Acknowledge Discharge");
		
		Nursing_Activity.SelectByFacilityDrp("SANITY HOSPITAL");
		Nursing_Activity.ClickOnNursingDashboard("Click On Nursing DashBorad" ,Nursing_Station_Drp , "Station Yes Popup");
		
		Nursing_Activity.ClickOnNursingActivityTab_Clearance("Nursing Activity Tab","Nursing activity Page");
		
		//Nursing_Activity.EnterSerchBoxInIPNumber("29161");
		
		Nursing_Activity.clickFirstAfterSearch_AdmittedNotOccupied();
		Nursing_Activity.SaveChangeBedStatus_YesPop("Save Change Bed Status Pop ", "Yes Pop");
		Thread.sleep(5000);
		
	}

}
