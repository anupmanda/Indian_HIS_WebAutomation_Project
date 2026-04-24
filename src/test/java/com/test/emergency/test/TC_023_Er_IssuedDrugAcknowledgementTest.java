/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Pharmacy.Page.Pharmacy_IpIssuePage;
import com.test.emergency.page.Er_IssuedDrugAcknowledgementPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 17-Apr-2026
 */
public class TC_023_Er_IssuedDrugAcknowledgementTest extends Er_IssuedDrugAcknowledgementPage {
	
	Er_IssuedDrugAcknowledgementPage Issue_Drug_Acknowledgement = new Er_IssuedDrugAcknowledgementPage();
	Pharmacy_IpIssuePage IpIssue = new Pharmacy_IpIssuePage();
	 
	private final String sheetName = "Er_Issue_Drug_Acknowledgement";
	private final String sheetName_Pharmacy = "Pharmacy_IpIssue_Page";

	@DataProvider(name = "ErDrugAcknowledgementDataProvider")
	public Object[][] getAcknowledgementData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ErDrugAcknowledgementDataProvider" , priority = 2 , enabled = true)	
	public void IssuedDrugAcknowledgementTest(String facility_drp, String Station_drp , String Acknowled_Station_Drp , String Enter_Bar_Code , 
			String Enter_Er_Number , String Frome_Date , String To_Date)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Issue Drug Acknowledgement ", "Issue Drug Acknowledgement Test Funcility");

		Issue_Drug_Acknowledgement.selectByFacilityDropdown(facility_drp);
		Issue_Drug_Acknowledgement.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Issue_Drug_Acknowledgement.ErOrderRaiseIssuedDrugAcknowledgementBtn("Er Order Tab","Issued Drug Acknowledgement Page");
		Issue_Drug_Acknowledgement.SelectSationDrp(Acknowled_Station_Drp);
		Issue_Drug_Acknowledgement.CheckBoxShowAcknowledgedOrder("Click On Check Issued Drug Acknowledgement");
		
		//Issue_Drug_Acknowledgement.EnterBarcodeIssueDNumber(Enter_Bar_Code);
		//Issue_Drug_Acknowledgement.EnterErNumber(Enter_Er_Number);
		
		Issue_Drug_Acknowledgement.FromDateSerach(Frome_Date);
		//Issue_Drug_Acknowledgement.ToDateSerach(To_Date);
		Issue_Drug_Acknowledgement.SearchIssuedDrugIcon("Search Issued Drug Acknowledgement");
		
		Issue_Drug_Acknowledgement.IssuedDrugAcknowledgementTable("Select Issued Drug Acknowledgement");
		Issue_Drug_Acknowledgement.ClickOnAcknowledgeOrdeYesPop("Click On Yes Pop Acknowledge Order");
	}
		
	
	@Test(dataProvider = "ErDrugAcknowledgementDataProvider" , priority = 3 , enabled = true)	
	public void CheckAcknowledgementDrugTest(String facility_drp, String Station_drp , String Acknowled_Station_Drp , String Enter_Bar_Code , 
			String Enter_Er_Number , String Frome_Date , String To_Date)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Check Acknowledgement Drug", "Check Acknowledgement Drug Test Funcility");
		
		driver.navigate().refresh();
		Issue_Drug_Acknowledgement.CheckBoxShowAcknowledgedOrder("Click On Check Issued Drug Acknowledgement");
		Issue_Drug_Acknowledgement.CheckRentyIssuedDrugAcknowledgementTable("Check Issue Drug Quenty");
		Issue_Drug_Acknowledgement.closeCheckDrugQunetyPop("Close Quenty Pop");
	}
	
	//========================== Pharmacy Drug Issed ================================
	
		@DataProvider(name = "PharmacyIPIssueDataProvider")
		public Object[][] getData() throws IOException {
	 
			System.out.println("====Fetching data from Excel sheet_02: " + sheetName_Pharmacy + " ====");
			return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy);
		}

		@Test(dataProvider = "PharmacyIPIssueDataProvider", priority = 1 , enabled = false)
		public void PharmacyIpIssueTest(String Dashborad_Facility_Drp , String Pharmacy_Station_Drp ) 
						throws IOException, InterruptedException, InvalidApplicationException {
			
			logger = extent.createTest("Pharmacy Ip Issue ", "Ip Issue Test Funcility");
			
			IpIssue.SelectByFacilityDrp("SANITY HOSPITAL");
			IpIssue.ClickOnPharmacyDashboard("Click On Pharmacy DashBorad" , Pharmacy_Station_Drp , " Station Yes Popup");
			
			IpIssue.ClickOnIpIsueMenuAndPage("Click On Ip Issue Menu Table" , "Ip Issue Page");
			//IpIssue.EnterErNumber("1508856");
			//IpIssue.ClickOnPendingOrderInTable("Click On Pending Drug In Pharmacy");
			
			IpIssue.ClickOnEmergencyOPDRow("EMERGENCY OPD(GROUND FLOOR)");  // Dynamic Drug issue
			IpIssue.ThisOrderIsCurrentlylockedYesPop("Click On Currently Locked Order Yes Pop");
			
			Thread.sleep(1500);
			driver.navigate().refresh();
		// Second Window 	
			IpIssue.ClickOnIpIssueDetailsFirstRowTable1("Table In Ip Issue Details Drug Name");
			//IpIssue.EnterRemarksIpIssueDetals("Ip Issue Remarks Anup" , "Click On Remarks Save Btn");
			Thread.sleep(5000);
			IpIssue.SaveIpIssueDetalsBtn("Click On Save Btn" , "Yes Pop");
			
			IpIssue.IpIssueDetailsPrintYesPop("Click On Print Yes Pop");
			IpIssue.CloseGenerateBarcodPop("Close Bar Code Pop");
			
			Thread.sleep(1500);
			IpIssue.HomePage("Click On HIS Log");
			
		}
}
