/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_EmergencyClearancePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 20-Apr-2026
 */
public class TC_024_Er_EmergencyClearanceTest extends Er_EmergencyClearancePage {
	
	Er_EmergencyClearancePage Emergency_Clearance = new Er_EmergencyClearancePage();
	private final String sheetName_ER_Clearance = "Er_Emergency_Clearance_Page";

	@DataProvider(name = "ExcelERClearanceDataProvider")
	public Object[][] getClearanceData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName_ER_Clearance + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName_ER_Clearance);
	}

	@Test(dataProvider = "ExcelERClearanceDataProvider" , priority = 1,enabled = true)	
	public void UnacknowledgedEmergencyClearanceTest(String facility_drp, String Station_drp , String Status_Drp , String Patient_Type_Drp , String Enter_Er_No , 
			String Bill_Type_Drp ,String Check_Status_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Unacknowledged Emergency Clearance Patient", "Unacknowledged Emergency Clearance Test Funcility");

		Emergency_Clearance.selectByFacilityDropdown(facility_drp);
		Emergency_Clearance.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Emergency_Clearance.ErOrderEmergencyClearance("Er Order Tab","Emergency Clearance Page");
		
		Emergency_Clearance.SelectByStatusDrp(Status_Drp);
		Emergency_Clearance.SelectByPatientType(Patient_Type_Drp );
		Emergency_Clearance.ErNumber(Enter_Er_No);
				
		Emergency_Clearance.SelectByBillTypeDrp(Bill_Type_Drp);
		Thread.sleep(2000);
		Emergency_Clearance.UnacknowledgedEmergenctPatientInTable(Enter_Er_No, "Click On Unacknowledge Clearance In Table");
		Thread.sleep(1500);
		driver.navigate().refresh();
	
	}
	
	@Test(dataProvider = "ExcelERClearanceDataProvider" , priority = 2 ,enabled = true)	
	public void CheckaAcknowledgedEmergencyClearanceTest(String facility_drp, String Station_drp , String Status_Drp , String Patient_Type_Drp , String Enter_Er_No , 
			String Bill_Type_Drp ,String Check_Status_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest(" Check Acknowledged Emergency Clearance Patient", " Check Acknowledged Emergency Clearance Test Funcility");

		Emergency_Clearance.SelectByStatusDrp(Check_Status_Drp);
		Emergency_Clearance.ErNumber(Enter_Er_No);
		
		Thread.sleep(1500);
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "ExcelERClearanceDataProvider" , priority = 3 ,enabled = true)	
	public void DeletedUnackEmergencyClearanceTest(String facility_drp, String Station_drp , String Status_Drp , String Patient_Type_Drp , String Enter_Er_No , 
			String Bill_Type_Drp ,String Check_Status_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest(" Emergency Clearance Deleted Patient", " Emergency Clearance Deleted Test Funcility");

		Emergency_Clearance.SelectByStatusDrp(Check_Status_Drp);
		Emergency_Clearance.ErNumber(Enter_Er_No);
		
		Emergency_Clearance.AcknowledgedEmergenctPatientInTable(Enter_Er_No, "Delete On Acknowledge Clearance In Table");
	}
	

}
