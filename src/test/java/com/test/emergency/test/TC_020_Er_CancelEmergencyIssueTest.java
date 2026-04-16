/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_CancelEmergencyIssuePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 15-Apr-2026
 */
public class TC_020_Er_CancelEmergencyIssueTest extends Er_CancelEmergencyIssuePage {
	
	Er_CancelEmergencyIssuePage CancelEmergencyIssue = new Er_CancelEmergencyIssuePage();
	
	private final String sheetName = "Er_CancelEmergencyIssue_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = true)	
	public void ErCancelEmergencyIssuTest(String facility_drp, String Station_drp, String Enter_Er_No , String Enter_Retun_Durg_Quenty )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emercency Cancel Emergency Issue", "Cancel Emergency Issue Test Funcility");

		CancelEmergencyIssue.selectByFacilityDropdown(facility_drp);
		CancelEmergencyIssue.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		CancelEmergencyIssue.clickOnEmercencyCancelEmergencyIssuePage("Er Order Tab","Cancel Emergency Issue Page");
		CancelEmergencyIssue.EnterErNumber(Enter_Er_No);
		
		CancelEmergencyIssue.SelectByAgainstOrderDrp(5);
		CancelEmergencyIssue.ConsumptionIssueStationOkPop(" Consumption Issue Station Ok Pop");
		CancelEmergencyIssue.RetunDrugsInTableAndQuenty( "Select Check Box", Enter_Retun_Durg_Quenty );
		Thread.sleep(5000);
		CancelEmergencyIssue.ClickOnSaveButton("Click On Save Button" ,"Save Yes Pop");
		CancelEmergencyIssue.printCancelPopupMessage();
		
	}
}
