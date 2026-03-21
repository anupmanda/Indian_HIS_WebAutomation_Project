/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.emergency.page.AdmissionUpdateDateTimePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 20-Mar-2026
 */
public class TC_005_AdmissionUpdateDateTimeTest extends AdmissionUpdateDateTimePage {
	
	AdmissionUpdateDateTimePage Admission_Update_DateTime = new AdmissionUpdateDateTimePage();
	private final String sheetName = "Er_Admission_Update_DateTime"; 

	@DataProvider(name = "AdmissionUpdateDateTimeDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====Sheet Name_01: " + sheetName + "======");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "AdmissionUpdateDateTimeDataProvider" , priority = 1 ,enabled = true)	
	public void CurrentPatentTest(String facility_drp , String Station_drp )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Change Date And Time Current In Patent ", "Change Date And Time Current In Patent Test Funcility");

		Admission_Update_DateTime.selectByFacilityDropdown(facility_drp);
		Admission_Update_DateTime.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Admission_Update_DateTime.clickOnAdmissionUpdateDateTimePage("Emercency Button in side Icon","Admission Update DateTimeData Page");

		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='90%'");
		
		Admission_Update_DateTime.EnterErNumber("1508823");
		Admission_Update_DateTime.RadioBtnAdmissionDate("Radio Btn In Admission Date");
		Admission_Update_DateTime.newAdmissionDateTime();  //New Admission Time
		Thread.sleep(1500);
		Admission_Update_DateTime.saveAdmissionDateAndTime("Change Current Patint Save Btn");
		//driver.navigate().refresh();
	}
	
	@Test(dataProvider = "AdmissionUpdateDateTimeDataProvider" , priority = 2 ,enabled = false)	
	public void DischargePatentTest(String facility_drp , String Station_drp )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Change Date And Time Current In Patent ", "Change Date And Time Current In Patent Test Funcility");

		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='90%'");
		
		Admission_Update_DateTime.EnterErNumber("1508823");
	}
}
