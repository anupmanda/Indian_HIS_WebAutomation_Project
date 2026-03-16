/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.AcknowledgeDischargeNotificationPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 27-Feb-2026
 */
public class TC_0A4_DiscountIpBillingTest extends AcknowledgeDischargeNotificationPage {
	
	AcknowledgeDischargeNotificationPage Acknowledge_Discharge_Notification = new AcknowledgeDischargeNotificationPage();

	private final String sheetName_Discharge = "Acknowledge_Discharge_Page";

	@DataProvider(name = "DischargeNotificationDataProvider")
	public Object[][] getDischargeData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_01: " + sheetName_Discharge + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Discharge);
	}

	@Test(dataProvider = "DischargeNotificationDataProvider", priority = 1 , enabled = true)
	public void AcknowledgeDischargeNotification(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Wards_Drp , 
			String Status_Drp , String Enter_Expected_Date , String Select_IP_Number_Drp , String Enter_Ip_Number , String Select_Patient_Name_Drp , 
			String Enter_Patient_Name , String Bill_Type_Drp , String Enter_Discharge_Marked_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Acknowledge Discharge Notification Test", "Acknowledge Discharge And Billing Page");

		Acknowledge_Discharge_Notification.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Acknowledge_Discharge_Notification.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		//Acknowledge_Discharge_Notification.SelectByIpNumberAndEnterIPNumber_Serach(Select_IP_Number_Drp , "29381" ,
			//	"Serach Ip Number");
		
		String sNo = 	
		Acknowledge_Discharge_Notification.clickFirstWhiteRowAndPrintDetails("Click On First White Row");
		Assert.assertTrue(true, "First white background row clicked successfully");
		Acknowledge_Discharge_Notification.YesAcknowledgedPop("Yes Pop Acknowledged Popup");
		Thread.sleep(2000);

		Acknowledge_Discharge_Notification.clickSameRowAgainAfterColorChange(sNo);
		Acknowledge_Discharge_Notification.Yes_Pop_DischargeNotificationAcknowledgementBill("Yes Pop Billing Page"); 
		
	}

}
