/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_EmergencyClearancePage;
import com.test.emergency.page.Er_OrderPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 21-Apr-2026
 */
public class Er_EmergencyClearanceTest extends Er_EmergencyClearancePage {
	
	Er_EmergencyClearancePage Emergency_Clearance = new Er_EmergencyClearancePage();
	Er_OrderPage ER_Order = new Er_OrderPage();
	
	private final String sheetName_ER_Clearance = "Er_Emergency_Clearance_Page";
	private final String sheetName = "ER_Order_Page"; 

	@DataProvider(name = "ExcelERClearanceDataProvider")
	public Object[][] getClearanceData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName_ER_Clearance + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName_ER_Clearance);
	}

	@Test(dataProvider = "ExcelERClearanceDataProvider" , priority = 3 ,enabled = true)	
	public void UnacknowledgedEmergencyClearanceTest(String facility_drp, String Station_drp , String Status_Drp , String Patient_Type_Drp , String Enter_Er_No , 
			String Bill_Type_Drp ,String Check_Status_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Unacknowledged Emergency Clearance Patient", "Unacknowledged Emergency Clearance Test Funcility");

		Emergency_Clearance.selectByFacilityDropdown(facility_drp);
		Emergency_Clearance.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Emergency_Clearance.ErOrderEmergencyClearance("Er Order Tab","Emergency Clearance Page");
		
		Emergency_Clearance.SelectByStatusDrp(Status_Drp);
		Emergency_Clearance.SelectByPatientType(Patient_Type_Drp );
	//	Emergency_Clearance.ErNumber(Enter_Er_No);
		
		String erNo = ER_Order.ClickTopGreenPatient();
		System.out.println("Captured ER No: " + erNo);
		Emergency_Clearance.ErNumber(erNo);
		
		Emergency_Clearance.SelectByBillTypeDrp(Bill_Type_Drp);
		
		Emergency_Clearance.UnacknowledgedEmergenctPatientInTable(Enter_Er_No, "Click On Acknowledge Clearance In Table");
		Thread.sleep(1500);
		driver.navigate().refresh();
		
	}
	
	@Test(dataProvider = "ExcelERClearanceDataProvider" , priority = 4 ,enabled = true)	
	public void CheckaAcknowledgedEmergencyClearanceTest(String facility_drp, String Station_drp , String Status_Drp , String Patient_Type_Drp , String Enter_Er_No , 
			String Bill_Type_Drp ,String Check_Status_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest(" Check Acknowledged Emergency Clearance Patient", " Check Acknowledged Emergency Clearance Test Funcility");

		Emergency_Clearance.SelectByStatusDrp(Check_Status_Drp);
			
	}
	//==================================== Er Odrer EDI Test Funcility =====================================

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getErOrderData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = true)	
	public void SearchOccupiedPatientTest(String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
			String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
			String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
			String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
			String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
			String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
			String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Search Occupied Patient", "Search Occupied Patient Test Funcility.");

		ER_Order.selectByFacilityDropdown(facility_drp);
		ER_Order.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		ER_Order.clickOnEmercencyErOrder("Er Order Tab"," Er Order Page");

		//ER_Order.SearchAndClickTopGreenPatient();
		ER_Order.ClickTopGreenPatient();

	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = true)	
	public void EmergencyDischargeIntimationTest (String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
			String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
			String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
			String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
			String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
			String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
			String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Search Occupied Patient", "Search Occupied Patient Test Funcility.");
		
		ER_Order.ClickOnEDIBtn("Click On EDI Button");
		ER_Order.SelectDischaredTypeAndSubTrpe_Reason(Discharge_Type_Drp , Discharge_Sub_Type_Drp , Discharge_Remaks); 
		
		ER_Order.ClickOnSaveDiscchargedIBtn("Click On Discharged Save Btn" , "Discharged Yes Pop");
		Thread.sleep(5000);
		
	}	

}
