/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.AuditClearanceDashboardPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 27-Jan-2026
 */
public class AuditClearanceDashboardTest extends AuditClearanceDashboardPage {
	
	AuditClearanceDashboardPage Audit_Clearance = new AuditClearanceDashboardPage();

	public AuditClearanceDashboardTest() {
		// TODO Auto-generated constructor stub
	}
	
	private final String sheetName_Audit = "IP_Billing_Audit_Clearance";

	@DataProvider(name = "AduditClearanceDataProvider")
	public Object[][] getAuditData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Audit + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Audit);
	}

	@Test(dataProvider = "AduditClearanceDataProvider", priority = 1)
	public void AuditClearanceDashboard(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Aduit_Clearance_Facility_Drp ,
			String Enter_UHID , String Enter_Ip_Number , String Clearance_Status_All_Drp , String Clearance_Status_New_Admission_Drp ,
			String Clearance_Status_Query_Audit_Drp , String Clearance_Status_Resolved_Billing_Drp , String Clearance_Status_Approved_Audit_Drp

) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("IP Billing Audit Clearance Dashboard Status", "IP Billing Audit Clearance Dashboard");
		
		Audit_Clearance.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Audit_Clearance.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		
		Audit_Clearance.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Audit_Clearance.IpBilling_AuditClearanceDashBoard("Click On Ip Billing Drp" , "Audit Clearance Dashboard Page");
		Audit_Clearance.IpBillingDashBoard_Facility_Drp(Aduit_Clearance_Facility_Drp);
		
		//Audit_Clearance.EnterUHID(Enter_UHID ,  "Serach Icon");
		Audit_Clearance.EnterIPNumber(Enter_Ip_Number , "Serach Icon");
		
		if (Audit_Clearance.isNoRecordFoundPopupDisplayed()) {

		    logger.fail("No record found popup displayed for IP: " + Enter_Ip_Number);
		    Assert.fail("Test Failed: No record found popup appeared");

		} else {

		    logger.pass("Valid IP entered. No popup displayed.");
		}

		  
		Audit_Clearance.AuditClearanceDashboard_Status_Drp(Clearance_Status_All_Drp);
		Thread.sleep(1000);
		Audit_Clearance.AuditClearanceDashboard_Status_Drp(Clearance_Status_New_Admission_Drp);
		Thread.sleep(1000);
		
		Audit_Clearance.AuditClearanceDashboard_Status_Drp(Clearance_Status_Query_Audit_Drp);
		Thread.sleep(1000);
		Audit_Clearance.AuditClearanceDashboard_Status_Drp(Clearance_Status_Resolved_Billing_Drp);
		Thread.sleep(1000);
		Audit_Clearance.AuditClearanceDashboard_Status_Drp(Clearance_Status_Approved_Audit_Drp);
		
		
	}

}
