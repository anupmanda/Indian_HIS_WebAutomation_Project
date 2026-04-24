/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.ER_IOChartPage;
import com.test.emergency.page.Er_PatientVitalPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 24-Apr-2026
 */
public class TC_032_ER_IOChartTest extends ER_IOChartPage {

	ER_IOChartPage IO_Chart = new ER_IOChartPage();
	Er_PatientVitalPage Patient_Vital = new Er_PatientVitalPage();
	
	private final String sheetName = "Er_IO_Chart_Page"; 

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = true)	
	public void SearchPatientIOChartTest(String facility_drp, String Station_drp , String Search_Frome_Date , String Search_To_Date , String Enter_Er_Number ,
			String Input_IV_Fluid_Drp , String Input_Flow_Rate_Text , String Input_Volume_Text , String Input_Orl_Drp , String Input_IV_TT_Drp ,
			String Input_Quantity_Text , String Input_Remarks , String Output_Drp , String Sub_Type_Drp , String OutPut_Quantity_Text , String Output_Remarks)
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("IO Chart In Search Patient", "Io Chart in Search Patient Test Funcility.");

		IO_Chart.selectByFacilityDropdown(facility_drp);
		IO_Chart.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		IO_Chart.clickOnEROrderTab("Er Order Tab");
		IO_Chart.ClickOnIoChartPage("Emergency Patient Vital Page");
		
		IO_Chart.ClickOnSearchBtn("Click On Search Button In IO Chart");
		IO_Chart.CurrentInPatientInRadioBtn("Current In Patient In Radio Button");
		IO_Chart.AllWardsInCheckBox("All Wards Chheck Box");
		IO_Chart.Admission_DischargeCheckBox("Admisssion Discharged Check Box");
		
		IO_Chart.FromDateSerach(Search_Frome_Date);
		IO_Chart.ToDateSerach(Search_To_Date);
		IO_Chart.FindPatientInSearcbButton("Click On Search Button");
		
		IO_Chart.SearchInIOChartInTable("Click On Search In Io chart Patient In Table");
		driver.navigate().refresh();
	}	
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = true)	
	public void ERNumberPatientIOChartTest(String facility_drp, String Station_drp , String Search_Frome_Date , String Search_To_Date , String Enter_Er_Number ,
			String Input_IV_Fluid_Drp , String Input_Flow_Rate_Text , String Input_Volume_Text , String Input_Orl_Drp , String Input_IV_TT_Drp ,
			String Input_Quantity_Text , String Input_Remarks , String Output_Drp , String Sub_Type_Drp , String OutPut_Quantity_Text , String Output_Remarks)
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("IO Chart In Search Patient", "Io Chart in Search Patient Test Funcility.");
		
		IO_Chart.EnterErNumber(Enter_Er_Number);
		Patient_Vital.handleDynamicPopup("Pop Message");
		IO_Chart.IoChartPlushButton("Click On Io Chart Plush Icon");
		
		IO_Chart.PlushIconInputOutPutChart("Click On Input OutPut Plush Icon");
		IO_Chart.InPutFluidChartDetails(Input_IV_Fluid_Drp ,Input_Flow_Rate_Text , Input_Volume_Text , Input_Orl_Drp ,
				Input_IV_TT_Drp , Input_Quantity_Text , Input_Remarks);
		
		IO_Chart.OutPutFluidChartDetails(Output_Drp , Sub_Type_Drp , OutPut_Quantity_Text , Output_Remarks);
		IO_Chart.SaveInputOutPutIcon("Click On Save Button");
		Patient_Vital.handleDynamicPopup("Pop Message");
		
	}
	@Test(priority = 3 ,enabled = false)	
	public void DeletePatientIOChartTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Delete InPut OutPut Chart Sub Table", "Delete InPut OutPut Chart Sub Table Test Funcility.");
		
		IO_Chart.PlushIconInputOutPutChart("Click On Input OutPut Plush Icon");
		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='80%'");
		
		Thread.sleep(1000);
		IO_Chart.DeleteInputOutChartInTable("Delete Io Chart In Input Output In Table");
   }
	
	@Test(priority = 4 ,enabled = true)	
	public void IOChartChildWindToParentWindowPrintTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Child Window To Parent Window Print Btn", "Child Window To Parent Window Print Btn Test Funcility.");
		
		IO_Chart.ClickOnBackArrowInInputOutputChartPage("Click on Left Arroe Button");
		Thread.sleep(500);
		IO_Chart.ClickOnPrintInIoChartBtn("Click on Print Btn");
		
		IO_Chart.SelectCheckBoxGroupByAndDrp("Click On Check Box Group" , 4);
		IO_Chart.ClickOnChartIcon("Click On Chart Icon" ,"Close Chart Graph Pop");
		IO_Chart.CheckBoxShowForLast24("Check Box Show for Last 24");
		
		Thread.sleep(1500);
	}
	
	@Test(priority = 5 ,enabled = true)	
	public void DeleteErrorMarkedErrorTest()
			throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest(" Delete Marked As Error In Io Chart Value", "Delete Marked As Error In Io Chart Value Test Funcility.");
		
		IO_Chart.UnSelectCheckBoxGroup("Group UnSelect Check Box");
		IO_Chart.DeleteMarkedAsErrorYesPop("Delete Marked Error In Table" ,"Yes Pop Mark it as entered in error");
	}
	
}
