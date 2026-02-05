/**
 * 
 */
package com.test.Nursing.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Nursing.page.NursingClearancePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class TC_001_NursingClearanceTest extends NursingClearancePage {
	
	NursingClearancePage Nursing_Clearance = new NursingClearancePage();
	private final String sheetName_Nursing_Clearance = "Nursing_Clearance_Page";
	
	@DataProvider(name = "NursingClearanceDataProvider")
	public Object[][] getClearanceData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Nursing_Clearance + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Nursing_Clearance);
	}

	@Test(dataProvider = "NursingClearanceDataProvider", priority = 1 , enabled = true)
	public void NursingClearanceTest(String Dashborad_Facility_Drp , String Nursing_Station_Drp ,String Status_Drp , String Enter_Date_Expected_Discharge ,
			String Type_Patient_Drp , String Enter_IP_Number , String Billing_Type_Drp , String Enter_Date_Discharge_Marked) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Acknowledge Discharge Notification Test", "Acknowledge Discharge");
		
		Nursing_Clearance.SelectByFacilityDrp("SANITY HOSPITAL");
		Nursing_Clearance.ClickOnNursingDashboard("Click On Nursing DashBorad" ,Nursing_Station_Drp , "Station Yes Popup");
		
		Nursing_Clearance.ClickOnNursingActivityTab_Clearance("Nursing Activity Tab","Nursing Clearance Page");
		Nursing_Clearance.RadioBtnDischargeNotification("Radio Btn Discharge Notification");
		Nursing_Clearance.SelectByStausDrp(Status_Drp);   
		
		Nursing_Clearance.RadioBtnExpectedDateDischarge_CheckBox_Date("Radio Btn Expected Date Of Discharge" , 
				"Check Box Expected Date Of Discharge" , Enter_Date_Expected_Discharge ,"Serch Date");
		
		Nursing_Clearance.SelectByPatientTypeAndEnterBox_Serach(Type_Patient_Drp , Enter_IP_Number , "Serch Patient");
		Nursing_Clearance.BillTypeDrp(Billing_Type_Drp);
		
		
		Nursing_Clearance.CheckBoxDaycare("Click Check Box Daycare");
		Nursing_Clearance.RadioBtnDischargeMarked_CheckBox_DateEnter("Click On Radio Btn Discharge Marked" , 
				"Check Box  Discharge Marked" , Enter_Date_Discharge_Marked , "Serch Icon Discharge Marked");
		
		
		
		
		
		
		

	}
}
