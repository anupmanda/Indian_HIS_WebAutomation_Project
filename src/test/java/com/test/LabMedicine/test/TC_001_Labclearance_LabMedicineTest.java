/**
 * 
 */
package com.test.LabMedicine.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.LabMedicine.Page.Labclearance_LabMedicinePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class TC_001_Labclearance_LabMedicineTest extends Labclearance_LabMedicinePage {

	Labclearance_LabMedicinePage Lab_Clearance = new Labclearance_LabMedicinePage();

	private final String sheetName_Lab = "Lab_Clearance_Page";

	@DataProvider(name = "LabclearanceDataProvider")
	public Object[][] getLabData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Lab + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Lab);
	}

	@Test(dataProvider = "LabclearanceDataProvider", priority = 1 , enabled = true)
	public void LabclearanceDataProviderTest(String Dashborad_Facility_Drp , String Lab_Medicince_Station_Drp , String Status_Drp ,
			String Enter_Date_Expected_Discharge , String Type_Patient_Drp , String Enter_IP_Number , String Billing_Type_Drp , 
			String Enter_Date_Discharge_Marked) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Lab Clearance ", "Lab Medicine Clearance Funcility Test");

		Lab_Clearance.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Lab_Clearance.ClickOnLabMedicineDashboard("Click On Lab Medicine DashBorad" ,Lab_Medicince_Station_Drp , "Station Yes Popup");

		Lab_Clearance.ClickLabMedicineMenuBar("Click On Menu Bar Lab Medicine icon");
		Lab_Clearance.LabClearancePage("Click On Lab Clearance Page");
		Thread.sleep(500);
		/*
		Lab_Clearance.RadioBtnDischargeNotification("Radio Btn Discharge Notification");
		Thread.sleep(500);
		Lab_Clearance.SelectByLAbStatusDrp(Status_Drp); 
		
		Lab_Clearance.RadioBtnExpectedDateDischarge_CheckBox_Date("Radio Btn Expected Date Of Discharge" , 
				"Check Box Expected Date Of Discharge" , Enter_Date_Expected_Discharge ,"Serch Date");
		*/
		Lab_Clearance.SelectByPatientTypeAndEnterBox_Serach(Type_Patient_Drp , "25176" , "Serch Patient");
	/*	Lab_Clearance.BillTypeDrp(Billing_Type_Drp);
		
		Lab_Clearance.CheckBoxDaycare("Click Check Box Daycare");
		Lab_Clearance.RadioBtnDischargeMarked_CheckBox_DateEnter("Click On Radio Btn Discharge Marked" , 
				"Check Box  Discharge Marked" , Enter_Date_Discharge_Marked , "Serch Icon Discharge Marked");
		*/
		
		Lab_Clearance.SelectPatientRow("25176");
		Lab_Clearance.ClickOnLabClearanceOkBtn("25176");
		//Lab_Clearance.LabClearanceOkPopup("Click On Lab Ok Btn");
		Lab_Clearance.HisLogoIcon("Click On HIS Log Icon");

	}

}
