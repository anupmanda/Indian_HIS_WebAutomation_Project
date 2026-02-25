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
	public void NursingClearanceTest(String Dashborad_Facility_Drp , String Nursing_Station_Drp , String Discharge_Type_Drp , String Discharge_Sub_Type_Drp ,
			String Discharge_Remarks_Text) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Acknowledge Discharge Notification Test", "Acknowledge Discharge");
		
		Nursing_Activity.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Nursing_Activity.ClickOnNursingDashboard("Click On Nursing DashBorad" ,Nursing_Station_Drp , "Station Yes Popup");
		
		Nursing_Activity.ClickOnNursingActivityTab_Clearance("Nursing Activity Tab","Nursing activity Page");
		
		Nursing_Activity.EnterSerchBoxInIPNumber("29370");
		
		Nursing_Activity.clickFirstAfterSearch_AdmittedNotOccupied();
		Nursing_Activity.SaveChangeBedStatus_YesPop("Save Change Bed Status Pop ", "Yes Pop");
		Thread.sleep(5000);
		
		Nursing_Activity.ClickOnAcknowledgeSimilarWard("Click On Acknowleded Btn");
		Nursing_Activity.ClickOnDischargeBtn("Click On Discharge Icon");
		
		Nursing_Activity.SelectDischargeType_DischargeSubType_Remarks_SaveIcon(Discharge_Type_Drp , Discharge_Sub_Type_Drp ,
				Discharge_Remarks_Text , "Save Discharge Btn");
		Nursing_Activity.DischargeYesPop("Discharge Yes Pop");
	}

}
