/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.AcknowledgeDischargeNotificationPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 29-Jan-2026
 */
public class AcknowledgeDischargeNotificationTest extends AcknowledgeDischargeNotificationPage{

	AcknowledgeDischargeNotificationPage Acknowledge_Discharge_Notification = new AcknowledgeDischargeNotificationPage();
	
	private final String sheetName_Discharge = "Acknowledge_Discharge_Page";

	@DataProvider(name = "DischargeNotificationDataProvider")
	public Object[][] getDischargeData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Discharge + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Discharge);
	}

	@Test(dataProvider = "DischargeNotificationDataProvider", priority = 1 , enabled = true)
	public void AcknowledgeDischargeNotification(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Wards_Drp , 
			String Status_Drp , String Enter_Expected_Date , String Select_IP_Number_Drp , String Enter_Ip_Number , String Select_Patient_Name_Drp , 
			String Enter_Patient_Name , String Bill_Type_Drp , String Enter_Discharge_Marked_Date) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Acknowledge Discharge Notification Test", "Acknowledge Discharge");
		
		Acknowledge_Discharge_Notification.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Acknowledge_Discharge_Notification.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		
		Acknowledge_Discharge_Notification.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Acknowledge_Discharge_Notification.IpBilling_AcknowledgeDischargeNotificationPage("Click On Ip Billing Drp","Acknowledge Discharge Notification");
		
		Acknowledge_Discharge_Notification.SelectByWardsDrp(Wards_Drp);
		Acknowledge_Discharge_Notification.SelectByStatusDrp(Status_Drp);
		Acknowledge_Discharge_Notification.RadioButtonExpectedDateDischarge_Checkbox_Date("Radio Btn Expected Date Of Discharge" ,
				"Click On Check Box Expected Date" , Enter_Expected_Date , "Serach Date");
		
		Acknowledge_Discharge_Notification.SelectByIpNumberAndEnterIPNumber_Serach(Select_IP_Number_Drp , Enter_Ip_Number ,
				"Serach Ip Number");
		
		//Acknowledge_Discharge_Notification.SelectByPatientNameAndEnterIPNumber_Serach(Select_Patient_Name_Drp , Enter_Patient_Name ,
			//	"Serach Patient Name");
		
		Acknowledge_Discharge_Notification.SelectbyBillTypeDrp(Bill_Type_Drp);
		Acknowledge_Discharge_Notification.CheckBoxIsDayCare("Click On Check Box On Is DayCare");
		
		Acknowledge_Discharge_Notification.DischargeMarkedRadioBtn_DateChkkBox_EnterDate("Radio Button Discharge Marked" ," Check Box Date On Discharge Marked" ,
				Enter_Discharge_Marked_Date ,"Serach Discharge Marked");
		
		Acknowledge_Discharge_Notification.RadioButton_CurrentDayPendingforsettlement("Radio Button Current Day Pending for settlement");
		
		
	
    
	}
}
