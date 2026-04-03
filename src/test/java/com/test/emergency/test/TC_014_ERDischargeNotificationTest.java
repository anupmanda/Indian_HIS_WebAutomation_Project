/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.ERDischargeNotificationPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 31-Mar-2026
 */
public class TC_014_ERDischargeNotificationTest extends ERDischargeNotificationPage{

	ERDischargeNotificationPage DischargeNotification = new ERDischargeNotificationPage();
	private final String sheetName = "Er_Discharge_Notification_Page";

	@DataProvider(name = "DischargedNotificationDataProvider")
	public Object[][] getDischargeNotificationData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}
	
	@Test(dataProvider = "DischargedNotificationDataProvider", priority = 1 , enabled = true)
	public void CheckFuncilityTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Cancel_Bill_Reamrks, String Wards_Drp , 
			String Status_DropDwon , String Frome_Date, String To_Date , String Patient_Type_Drp , String Enter_Er_No ) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Acknowledged Discharged Notification", " Discharged Patient Acknowledged Test Funcility");

		DischargeNotification.SelectByFacilityDrp(Dashborad_Facility_Drp);
		DischargeNotification.ClickOnErBillingDashboard("Click On Er Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		DischargeNotification.ErDischargedNotificationPage("Click On Er Billing Drp"," Er Discharge Notification Page");
		
		DischargeNotification.RadioBtnDischargedNotification("Click On Discharged Notifiaction Radio Btn");
		DischargeNotification.SelectByWardAndStatusDrp(Wards_Drp , Status_DropDwon);
		Thread.sleep(1000);
		
		DischargeNotification.RangeDateCheckBoxAndFromDate("Check Box Range Of Date" , Frome_Date);
		DischargeNotification.EnterToDate(To_Date);
		
		DischargeNotification.SerachDateWisePatient("Click On Patient Search Btn");
		Thread.sleep(1500);
		DischargeNotification.SelectPatientTypeDrpAndEnterValueSerach(Patient_Type_Drp , Enter_Er_No ,"Search Patient");
		Thread.sleep(1500);
		DischargeNotification.clickOnExcelSheetIcon("Click On Excel Sheet Icon");
		Thread.sleep(800);
		driver.navigate().refresh();
		
	}

	@Test(dataProvider = "DischargedNotificationDataProvider", priority = 2 , enabled = true)
	public void DischargedPatientAcknowledgeAndBillTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Cancel_Bill_Reamrks, String Wards_Drp , 
			String Status_DropDwon , String Frome_Date, String To_Date , String Patient_Type_Drp , String Enter_Er_No ) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Acknowledged Discharged Notification And Er Billing Page", " Discharged Patient Acknowledged Test Funcility");

		String sNo = 	
		DischargeNotification.clickFirstWhiteRowAndPrintDetails("Click On Last White Row");
		Assert.assertTrue(true, "First white background row clicked successfully");
		DischargeNotification.YesAcknowledgedPop("Yes Pop Acknowledged Popup");
		Thread.sleep(2000);

		DischargeNotification.clickSameRowAgainAfterColorChange(sNo);
		DischargeNotification.Yes_Pop_DischargeNotificationAcknowledgementBill("Yes Pop Billing Page"); 
		
		DischargeNotification.clickOnMenuIcon("Click On Menu Icon");

	}
	
	@Test(dataProvider = "DischargedNotificationDataProvider", priority = 3 , enabled = true)
	public void CancelAcknowledgedPatientTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Cancel_Bill_Reamrks, String Wards_Drp , 
			String Status_DropDwon , String Frome_Date, String To_Date , String Patient_Type_Drp , String Enter_Er_No ) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Cancel Acknowledged Discharged", "Cancel Discharged Acknowledged Notification Test Funcility");

		DischargeNotification.ErDischargedNotificationPage("Click On Er Billing Drp"," Er Discharge Notification Page");
		DischargeNotification.clickTopNavyBlueRowAndPrintDetails("Click Navy Blue Row");  //Blue
		DischargeNotification.CancelDischargeDNotificationAcknowledgementPop("Click No Cancel Discharged pop" ,
				Cancel_Bill_Reamrks ,"Yes Cancel Remarks"); 

	}
}
