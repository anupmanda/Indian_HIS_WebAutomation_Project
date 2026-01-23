/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FoReportCommonScrollPage;
import com.test.frontoffice.page.FrontOfficeAppointmentSchedulingPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 21-Jan-2026
 */
public class ReportCommonScrollTest extends FoReportCommonScrollPage {
	
	FoReportCommonScrollPage Common_Scroll = new FoReportCommonScrollPage();
	
	private final String sheetName_Report = "FO_Report_Common_Scroll";
	
	@DataProvider(name = "ReportCommonScrollDataProvider")
	public Object[][] getReportData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Report +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Report);
	}

	@Test(dataProvider = "ReportCommonScrollDataProvider" , priority = 1)	

	public void ReportInCommonScrollNumber(String Facility_Drp ,String Station_Drp , String Enter_Scroll_No) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Report In Common Scroll Number", "Common Scroll Report Test");

		Common_Scroll.selectByFacilityDropdwon(Facility_Drp);
		Common_Scroll.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		Common_Scroll.ClickOnReportCommonScroll("Report Menu Btn", "Common Scroll Page");
		
		Common_Scroll.EnterCommonScrollNumber(Enter_Scroll_No);
		Common_Scroll.CommonScrollPopPrintBtn("Click On Scroll No Pop Under Print" , "Click On Scroll No Pop Under Excel Sheet");
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	@Test(dataProvider = "ReportCommonScrollDataProvider" , priority = 2)
	public void CommonScrollReportInNewTraction(String Facility_Drp ,String Station_Drp , String Enter_Scroll_No)
			throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		
		logger = extent.createTest("Report In Common Scroll Date", "Common Scroll Report Test");
		
		Common_Scroll.ClickOnPlushIcon("Click On Plush Icon Btn");
		Thread.sleep(2000);
		Common_Scroll.rightClickAndSaveButton("Click On RightButton" , "Save Scroll Repot Button");
		Common_Scroll.CloseCommonScrollDetailsPop("Close Common Scroll details Pop");  // Alternet Pop
		Thread.sleep(2000);
		Common_Scroll.ClickOncommonCurrentSaveTable("Open Commaon Scroll Details Popup");
		Thread.sleep(5000);
		Common_Scroll.CommonScrollPopPrintBtn("Print In Common Scroll Details Btn" , "Excel Sheet Common Scroll Derails Btn");
		
	}
}
