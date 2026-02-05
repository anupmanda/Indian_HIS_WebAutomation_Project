/**
 * 
 */
package com.test.Pharmacy.Test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Pharmacy.Page.DischargeNotification_PharmacyPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class TC_001_DischargeNotification_PharmacyTest extends DischargeNotification_PharmacyPage{
	
	DischargeNotification_PharmacyPage Discharge_Notification = new DischargeNotification_PharmacyPage();
	
    private final String sheetName_Pharmacy = "Pharmacy_Discharge_Notification";
    
	@DataProvider(name = "PharmacyDischargeNotificationDataProvider")
	public Object[][] getDischargeNotificationData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Pharmacy + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy);
	}

	@Test(dataProvider = "PharmacyDischargeNotificationDataProvider", priority = 1 , enabled = true)
	public void PharmacyDischargeNotificationTest(String Dashborad_Facility_Drp , String Pharmacy_Station_Drp , String Wards_Drp ,String Pharmacy_Status_Drp ,
			String Enter_Date_Expected_Discharge , String Type_Patient_Drp , String Enter_IP_Number , String Billing_Type_Drp ,
			String Enter_Date_Discharge_Marked) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Pharmacy Discharge Notification", "Pharmacy Discharge Notification Test");
		
		Discharge_Notification.SelectByFacilityDrp("SANITY HOSPITAL");
		Discharge_Notification.ClickOnPharmacyDashboard("Click On Nursing DashBorad" ,Pharmacy_Station_Drp , "Station Yes Popup");
		
		Discharge_Notification.ClickPharmacyDischarge_Notification("Click On Pharmacy Discharge Notification Page");
		Discharge_Notification.RadioBtnDischargeNotification("Radio Btn Discharge Notification");
		Thread.sleep(500);
		Discharge_Notification.SelectByWardsDrp(Wards_Drp); 
		
		Discharge_Notification.SelectByPharmacyStatusDrp(Pharmacy_Status_Drp);
		
		Discharge_Notification.RadioBtnExpectedDateDischarge_CheckBox_Date("Radio Btn Expected Date Of Discharge" , 
				"Check Box Expected Date Of Discharge" , Enter_Date_Expected_Discharge ,"Serch Date");
		
		Discharge_Notification.SelectByPatientTypeAndEnterBox_Serach(Type_Patient_Drp , Enter_IP_Number , "Serch Patient");
		Discharge_Notification.BillTypeDrp(Billing_Type_Drp);
		
		Discharge_Notification.CheckBoxDaycare("Click Check Box Daycare");
		Discharge_Notification.RadioBtnDischargeMarked_CheckBox_DateEnter("Click On Radio Btn Discharge Marked" , 
				"Check Box  Discharge Marked" , Enter_Date_Discharge_Marked , "Serch Icon Discharge Marked");
		
		
	}

}
