/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_SalesConsumptionPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 14-Apr-2026
 */
public class TC_018_Er_SalesConsumptionTest extends Er_SalesConsumptionPage{
	
	Er_SalesConsumptionPage Sales_Consumption = new Er_SalesConsumptionPage();
	private final String sheetName = "Er_Sales_Consumption_Page";


	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = false)	
	public void SalesConsumptionTest(String facility_drp, String Station_drp , String Enter_Er_Number , String Select_Item_Code_Drp , String 
			Search_Drug_Sales_Consumables_Item , String Item_Description_Quenty , String Remarks_Sales , String Print_From_Date ,
			String Print_To_Date)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Sales Consumption", "Sales Consumption Patient Test Funcility.");

		Sales_Consumption.selectByFacilityDropdown(facility_drp);
		Sales_Consumption.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Sales_Consumption.clickOnEmercencyErOrder("Er Order Tab","Er Sale Consumption Page");
		Sales_Consumption.EnterErNumber(Enter_Er_Number);
		Sales_Consumption.SlectItemCodeDrp(Select_Item_Code_Drp);
		
		Sales_Consumption.HideZeroStockItemsCheckBox("Click On Check Box Hide Zero Stock Items ");
		Sales_Consumption.ClickDrugsAndConsumablesBtn("Click On Sales Consumables Btn");
		//Sales_Consumption.SearchDrug(Search_Drug_Sales_Consumables_Item);
		
		Sales_Consumption.selectDrugsInTable("Click On Table Sales Consumption Items");
		Sales_Consumption.IssueThisItemFractionsNoPop("Yes Pop Item Fraction Pop");
		
		//Sales_Consumption.BATCHDETAILDrugNameCheckBox("Click On Batch Details Check Box");
		Sales_Consumption.EnterItemDescriptionQuenty(Item_Description_Quenty);
		
		Sales_Consumption.EnterSalesConsumptionRemarks(Remarks_Sales);
		Sales_Consumption.ClickOnSaveButton("Click On Save Btn" ,"Yes Issue No Pop");
		
		Thread.sleep(15000);
		
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = true)	
	public void PrintWardStockIssuedTest(String facility_drp, String Station_drp , String Enter_Er_Number , String Select_Item_Code_Drp , String 
			Search_Drug_Sales_Consumables_Item , String Item_Description_Quenty , String Remarks_Sales , String Print_From_Date , 
			String Print_To_Date)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Print Ward Stock Issued ", "Print Ward Stock Issued Test Funcility.");
		
		Sales_Consumption.selectByFacilityDropdown(facility_drp);
		Sales_Consumption.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Sales_Consumption.clickOnEmercencyErOrder("Er Order Tab","Er Sale Consumption Page");
		Sales_Consumption.EnterErNumber(Enter_Er_Number);
		
		Sales_Consumption.ClickOnPrintButton("Click On Print Btn");
		Sales_Consumption.EnterFromeDate(Print_From_Date);
		
		Sales_Consumption.EnterToDate(Print_To_Date);
		Sales_Consumption.ClickOnPrintPop("Click on Print Pop" ,"Close Print Pop");
		Thread.sleep(800);
		
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3 ,enabled = true)	
	public void ViewOrderSetSubstituteDrugsTest(String facility_drp, String Station_drp , String Enter_Er_Number , String Select_Item_Code_Drp , String 
			Search_Drug_Sales_Consumables_Item , String Item_Description_Quenty , String Remarks_Sales , String Print_From_Date , 
			String Print_To_Date)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("View Order Set Substitute Drugs ", "View Order Set Substitute Drugs  Test Funcility.");
		
		Sales_Consumption.ClickOnOrderSetButton("Click On Order Set Vew Btn");
		Sales_Consumption.OderSetDrugsInTable(" view Order Set substitute drugs in Table");
		
	}
		
	
}
