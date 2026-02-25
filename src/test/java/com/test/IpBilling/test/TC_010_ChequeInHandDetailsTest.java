/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.ChequeInHandDetailsPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 23-Feb-2026
 */
public class TC_010_ChequeInHandDetailsTest extends ChequeInHandDetailsPage {
	 
	ChequeInHandDetailsPage Cheque_In_HandDetails = new ChequeInHandDetailsPage();
	
	private final String sheetName = "IP_Cheque_In_HandDetails";

	@DataProvider(name = "ChequeInHandDetailsDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_01: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ChequeInHandDetailsDataProvider", priority = 1 , enabled = true)
	public void IpDepositCashTest(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Cheque_From_Date , String Cheque_To_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_010_ChequeInHandDetailsTest", "Verify Cheque In Hand Details Page");
		
		Cheque_In_HandDetails.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Cheque_In_HandDetails.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Cheque_In_HandDetails.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Cheque_In_HandDetails.ClickOnIpDepositTabAndChequeInHandDetails("Click On Ip Deposit Refund Tab");
		Cheque_In_HandDetails.ChequeInHandDetails("Cheque In Hand Details New Tab");
		
		Cheque_In_HandDetails.ChequeHandFromAndToDate(Cheque_From_Date , Cheque_To_Date);
		Cheque_In_HandDetails.ClickOnSearchIcon("Click On Search Icon");
		
		
	}
}
