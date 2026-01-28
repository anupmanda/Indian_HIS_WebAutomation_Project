/**
 * 
 */
package com.test.frontofficeBilling.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.ReportDispatchTrackingPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 13-Jan-2026
 */
public class TC_009_ReportDispatchTrackingTest extends ReportDispatchTrackingPage {
	
	ReportDispatchTrackingPage Report_Dispatch_Tracking = new ReportDispatchTrackingPage();
	private final String sheetName = "Fo_Report_Dispatch_Tracking";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)
	public void BillsReportDispatchTrackingTest(String Facility_Drp , String Station_Drp , String Enter_Report_Check_UHID , 
			String Enter_Check_Bills_No , String Bills_Facility_Drp , String From_Date, String To_Date , String Report_Status_Unreceived_Drp ,
			String Report_Status_All_Drp , String Report_Status_Received_Drp , String Report_Status_Dispatched_Drp , String Test_Staus_Drp ,
			String Test_investigation_Drp , String Dispach_place_Drp) 
					throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest("Bills Report Dispatch Trackingt Test", "Bills Report Dispatch Tracking Functionality Test");
		Report_Dispatch_Tracking.selectByFacilityDropdwon(Facility_Drp);
		Report_Dispatch_Tracking.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		Report_Dispatch_Tracking.clickOnReportDispatchButton("Billing", "Report Dispatch Tracking");
		
		//Report_Dispatch_Tracking.enterUHID(Enter_Report_Check_UHID);
		//Report_Dispatch_Tracking.enterBillsNumber(Enter_Check_Bills_No);
		
		Report_Dispatch_Tracking.selectBilledFacilityDrp(Bills_Facility_Drp);
		Report_Dispatch_Tracking.enterFromDate(From_Date);
		//Report_Dispatch_Tracking.enterToDate(To_Date);
		Report_Dispatch_Tracking.OPDRadioButton("Report Tracking In OPD");
		
	//Use 4 Test Cash	
		//Report_Dispatch_Tracking.selectByReportStatusDrp(Report_Status_Unreceived_Drp);
		Report_Dispatch_Tracking.selectByTestStatusDrp(Report_Status_All_Drp);
		//Report_Dispatch_Tracking.selectByTestStatusDrp(Report_Status_Received_Drp);
		//Report_Dispatch_Tracking.selectByTestStatusDrp(Report_Status_Dispatched_Drp);
		
		Report_Dispatch_Tracking.selectByTestStatusDrp(Test_Staus_Drp);
		Report_Dispatch_Tracking.selectByInvestigationDrp(Test_investigation_Drp);
		
		Report_Dispatch_Tracking.SerachReportDispatchTracking("Serach All Report Tracking Data");
		Report_Dispatch_Tracking.checkBoxTable("Click On Check Box From Table");
		
		Report_Dispatch_Tracking.SelectByDispactchPlaceDrp(Dispach_place_Drp);
		
		Report_Dispatch_Tracking.SaveDispatchTrackingReport("Click on Save Button");
		
		Report_Dispatch_Tracking.PrintReportWithHeader("Click On Print With Header Btn");
		Report_Dispatch_Tracking.PrintReportWithOutHeader("Click On Print Without Header Btn");
		
	}
}
