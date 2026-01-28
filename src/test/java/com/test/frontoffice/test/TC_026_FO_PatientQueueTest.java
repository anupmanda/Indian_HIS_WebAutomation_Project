/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FO_PatientQueuePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 22-Jan-2026
 */
public class TC_026_FO_PatientQueueTest extends FO_PatientQueuePage{
	
	public FO_PatientQueuePage Patient_Queue = new FO_PatientQueuePage();
	
    private final String sheetName_PatientQueue = "FO_Patient_Queue";
	
	@DataProvider(name = "PatientQueueDataProvider")
	public Object[][] getPatientQueueData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_PatientQueue +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_PatientQueue);
	}

	@Test(dataProvider = "PatientQueueDataProvider" , priority = 1)	

	public void CheckDoctorpatientQueue(String Facility_Drp ,String Station_Drp , String Enter_Date, String Specility_Drp) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Patient Queue Test", "Check Patient Queue Test Funcility");

		Patient_Queue.selectByFacilityDropdwon(Facility_Drp);
		Patient_Queue.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		
		Patient_Queue.PatientQueuePage("Click On Patient Queue Tab" , "Patient Queue Page");
		Patient_Queue.SerachDatePatientQueue(Enter_Date);
		
		Patient_Queue.clickAllSpecialityCheckBoxes("All Specility Check Box");
		Thread.sleep(1000);
		Patient_Queue.SelectBySpecilityDrp(Specility_Drp);
		
		Patient_Queue.ClickAllDoctorCheckBox("All Doctor Check Box");
		Patient_Queue.SerachPatientQueueAndCheckLegendsKeys("Serach Specility And Doctor" ,"Check Legend Clours Icon");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}	
	
	@Test(dataProvider = "PatientQueueDataProvider" , priority = 2)	

	public void AllkDoctorpatientQueue(String Facility_Drp ,String Station_Drp , String Enter_Date, String Specility_Drp) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Patient Queue Test", "All Doctor Patient Queue Test Funcility");

		Patient_Queue.SerachDatePatientQueue(Enter_Date);
		
		Patient_Queue.clickAllSpecialityCheckBoxes("All Specility Check Box");
		Thread.sleep(1000);		
		Patient_Queue.ClickAllDoctorCheckBox("All Doctor Check Box");
		Patient_Queue.SerachPatientQueueAndCheckLegendsKeys("Serach Specility And Doctor" ,"Check Legend Clours Icon");
		
	}	

}
