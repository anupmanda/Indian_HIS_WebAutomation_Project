/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.PendinginvestigationPage;
import com.test.readdata.ExcelSheetDataProvider;


/**
 * @author Anup
 *
 * 02-Feb-2026
 */
public class TC_005_PendinginvestigationTest extends PendinginvestigationPage{

	PendinginvestigationPage Pending_Investigation = new PendinginvestigationPage();

	private final String Sheet_Name = "IP_Pending_Investigation";

	@DataProvider(name = "PendinginvestIgationDataProvider")
	public Object[][] getPendinginvestIgationData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + Sheet_Name + " ====");
		return ExcelSheetDataProvider.getExcelData(Sheet_Name);
	}

	@Test(dataProvider = "PendinginvestIgationDataProvider", priority = 1 , enabled = true)
	public void SerachCurrentInPatientPendingInvestigation (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient , String Enter_UHID_Excel , String Enter_Ip_Number) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Serach Current In Patient Date Mobile Number And Name", "Pending Investigation Funcility Test");


		Pending_Investigation.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Pending_Investigation.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		Pending_Investigation.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Pending_Investigation.PendingInvestigation("Click On Ip Billing Drp","Ambulance MRD Charrges Page");

		Pending_Investigation.SerachPatient("Click On Serach Patient Icon");

		Pending_Investigation.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");

		//Date Wise Other Serach Hidden 3 Code
		Pending_Investigation.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		Pending_Investigation.AdmissionDischarge_FromDateSerach(From_Date);
		Pending_Investigation.AdmissionDischarge_ToDateSerach(To_Date);
		Pending_Investigation.SerachDateWisePatient("Serch Date Wise Patient");

		Pending_Investigation.SerachAndselectPatientInTable("Pick Table In Current In Patient ");
		Thread.sleep(1000);
		Pending_Investigation.RefreshPendingInvestigation("Refresh Page");
		

	}
	@Test(dataProvider = "PendinginvestIgationDataProvider", priority = 2 , enabled = true)
	public void SerachDischargedPatientsPendingInvestigation(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient , String Enter_UHID_Excel , String Enter_Ip_Number)
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Discharged Patients ", "Ip Pendingin vestigation Funcility Test");

		Pending_Investigation.SerachPatient("Click On Serach Patient Icon");

		Pending_Investigation.RadioBtnDischargedPatients("Radio Button Discharged Patients");
		Pending_Investigation.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		Pending_Investigation.AdmissionDischarge_FromDateSerach(From_Date);
		Pending_Investigation.AdmissionDischarge_ToDateSerach(To_Date);

		Pending_Investigation.SerachDischargedPatient("Click On Serch Icon");
		Thread.sleep(5000);
		Pending_Investigation.SelectDischargedPatientsInTable("Discharge Patient In Table");
		
		Pending_Investigation.RefreshPendingInvestigation("Refresh Page");
		
	}
	
	@Test(dataProvider = "PendinginvestIgationDataProvider", priority = 3 , enabled = true)
	public void SerachIPNumber_UHID_PatientsPendingInvestigation(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient , String Enter_UHID_Excel , String Enter_Ip_Number)
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Pendingin vestigation In Ip Number And Uhid", "Ip Pendingin vestigation Funcility Test");
		
		//Pending_Investigation.EnterUHID(Enter_UHID_Excel);
		Pending_Investigation.EnterIPNumber(Enter_Ip_Number);
		
		Pending_Investigation.DeletePendingInvestigationIconAndYesPop("Click On Delete Button" , "Delete Yes Pop");
		
		
	}
}
	
	
