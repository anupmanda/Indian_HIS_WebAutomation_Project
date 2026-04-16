/**
 * 
 */
package com.test.Pharmacy.Test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Pharmacy.Page.Pharmacy_IpIssuePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 10-Apr-2026
 */
public class Pharmacy_IpIssueTest extends Pharmacy_IpIssuePage{
	
	 Pharmacy_IpIssuePage IpIssue = new Pharmacy_IpIssuePage();
	 private final String sheetName_Pharmacy = "Pharmacy_IpIssue_Page";
	    
		@DataProvider(name = "PharmacyIPIssueDataProvider")
		public Object[][] getData() throws IOException {
	 
			System.out.println("====Fetching data from Excel sheet: " + sheetName_Pharmacy + " ====");
			return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy);
		}

		@Test(dataProvider = "PharmacyIPIssueDataProvider", priority = 1 , enabled = true)
		public void PharmacyIpIssueTest(String Dashborad_Facility_Drp , String Pharmacy_Station_Drp ) 
						throws IOException, InterruptedException, InvalidApplicationException {
			
			logger = extent.createTest("Pharmacy Ip Issue ", "Ip Issue Test Funcility");
			
			IpIssue.SelectByFacilityDrp("SANITY HOSPITAL");
			IpIssue.ClickOnPharmacyDashboard("Click On Pharmacy DashBorad" , Pharmacy_Station_Drp , " Station Yes Popup");
			
			IpIssue.ClickOnIpIsueMenuAndPage("Click On Ip Issue Menu Table" , "Ip Issue Page");
			IpIssue.EnterErNumber("1508856");
			
			IpIssue.ClickOnPendingOrderInTable("Click On Pending Drug In Pharmacy");
			IpIssue.ThisOrderIsCurrentlylockedYesPop("Click On Currently Locked Order Yes Pop");
			
		// Second Window 	
			IpIssue.ClickOnIpIssueDetailsFirstRowTable1("Table In Ip Issue Details Drug Name");
			IpIssue.EnterRemarksIpIssueDetals("Ip Issue Remarks Anup" , "Click On Remarks Save Btn");
			Thread.sleep(5000);
			IpIssue.SaveIpIssueDetalsBtn("Click On Save Btn" , "Yes Pop");
			
			IpIssue.IpIssueDetailsPrintYesPop("Click On Print Yes Pop");
			IpIssue.CloseGenerateBarcodPop("Close Bar Code Pop");
			
		}

} 
