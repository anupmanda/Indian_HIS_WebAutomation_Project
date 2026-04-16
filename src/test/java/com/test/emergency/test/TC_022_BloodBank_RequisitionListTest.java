/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.BloodBank_RequisitionListPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 16-Apr-2026
 */
public class TC_022_BloodBank_RequisitionListTest extends BloodBank_RequisitionListPage {
	
	BloodBank_RequisitionListPage Requisition_List = new BloodBank_RequisitionListPage();
	
	private final String sheetName = "Er_Requisition_List_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = true)	
	public void SeachInDateWiseRequisitionListTest(String facility_drp, String Station_drp , String Enter_Frome_Date , String Enter_To_Date , String Enter_UHID_Number ,
			String Enter_Er_Number , String Ward_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Requisition List ", "Search Date Wise Requisition List Test Funcility");

		Requisition_List.selectByFacilityDropdown(facility_drp);
		Requisition_List.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Requisition_List.ErOrderRaiseBloodBankMenuBtn("Er Order Tab","Blood Bank Menu");
		Requisition_List.RequisitionListNewWindow("Requisition List Page");
		
		Requisition_List.FromDateSerach(Enter_Frome_Date);
		Requisition_List.ToDateSerach(Enter_To_Date);
		Requisition_List.SelectByWardDrp(Ward_Drp);
		
		Requisition_List.SearchRequisitionListBtn("Click On Search Button");
		Thread.sleep(1500);
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = true)	
	public void SeachInUHIDRequisitionListTest(String facility_drp, String Station_drp , String Enter_Frome_Date , String Enter_To_Date , String Enter_UHID_Number ,
			String Enter_Er_Number , String Ward_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Requisition List ", "Search UHID Requisition List Test Funcility");
		
		Requisition_List.SearchUHIDNumber(Enter_UHID_Number);
		//Requisition_List.SearchErNumber(Enter_Er_Number);
		
		Requisition_List.SelectByWardDrp(Ward_Drp);
		Requisition_List.SearchRequisitionListBtn("Click On Search Button");
		
		Thread.sleep(1500);
		driver.navigate().refresh();	
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3 ,enabled = true)	
	public void SearchStatusRequisitionListTest(String facility_drp, String Station_drp , String Enter_Frome_Date , String Enter_To_Date , String Enter_UHID_Number ,
			String Enter_Er_Number , String Ward_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Requisition List ", "Search Status Requisition List Test Funcility");
		
		Requisition_List.SelectByStatusDrp(7);
		Requisition_List.SelectByWardDrp(Ward_Drp);
		Requisition_List.SearchRequisitionListBtn("Click On Search Button");	
	}
	
	
	
}
