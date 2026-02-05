/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.DoctorVisit_BillingPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 05-Feb-2026
 */
public class TC_008_DoctorVisit_BillingTest extends DoctorVisit_BillingPage {
	
	DoctorVisit_BillingPage Doctor_Visit = new DoctorVisit_BillingPage();
	
	private final String sheetName_Doctor_Visit = "Ip_Doctor_Vist_Page";

	@DataProvider(name = "DoctorVisitDataProvider")
	public Object[][] getDoctorVisitData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Doctor_Visit + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Doctor_Visit);
	}

	@Test(dataProvider = "DoctorVisitDataProvider", priority = 1 , enabled = true)
	public void SearchInCurrentPatintDoctorVisit (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date , 
			String Find_Patint_By_Mobile_Number , String Find_Patint_By_Name , String Enter_IP_Number , String Enter_Visit_Date , 
			String Visit_Timeing , String Speciality_Drp_Visiting , String Visiting_Doctor_Drp , String Enter_Remarks_Text ,
			String Enter_Search_From_Date , String Eter_Search_To_Date) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Search Current In Patient Doctor Visit Ip Billing ", "Doctor Visit Ip Billing Funcility Test");
		
		Doctor_Visit.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Doctor_Visit.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		Doctor_Visit.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Doctor_Visit.DoctorVisitpage("Click On Ip Billing Drp","Doctor Visit Ip Billing");
		
		Doctor_Visit.FindPatient_SearchIcon("Search patient Icon");
		Doctor_Visit.RadioBtnCurrentInPatients_AllWardsCheckBox("Radio Btn Current In Patient " , "All Wards Check Box Click");
		//Doctor_Visit.Current_In_Patient_Admission_Discharge_ChkkBox("Click Admission Discharge Check box");
		
		//Doctor_Visit.AdmissionDischarge_enterFromDate(From_Date);
		//Doctor_Visit.AdmissionDischarge_EnterToDate(To_Date);
		Doctor_Visit.SearchCurrentInPatientIcon("Click On Search Icon in Find Patient");
		
		//Doctor_Visit.SerachMobileNumber(Find_Patint_By_Mobile_Number , "Serch Icon");
		//Doctor_Visit.EnterNameAndSerchicon(Find_Patint_By_Name ,"Search Icon" );
		
		Doctor_Visit.SerachAndselectPatientInTable("Click On Table In Serchig Patint");  //Last Row
		Thread.sleep(6000);
		Doctor_Visit.RefreshPage("Click On Refresh Page");
		
	}
	
	@Test(dataProvider = "DoctorVisitDataProvider", priority = 2 , enabled = true)
	public void SerachDischargedPatientsDoctorVisit (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date , 
			String Find_Patint_By_Mobile_Number , String Find_Patint_By_Name , String Enter_IP_Number , String Enter_Visit_Date , 
			String Visit_Timeing , String Speciality_Drp_Visiting , String Visiting_Doctor_Drp , String Enter_Remarks_Text ,
			String Enter_Search_From_Date , String Eter_Search_To_Date) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Search Discharged PatientPatient Doctor Visit Ip Billing ", "Doctor Visit Ip Billing Funcility Test");
			
		Doctor_Visit.FindPatient_SearchIcon("Search patient Icon");
		Doctor_Visit.RadioBtnDischargedPatients("Click On Discharged Patient Radio Button");
		Doctor_Visit.Current_In_Patient_Admission_Discharge_ChkkBox("Click Admission Discharge Check box");
		
		Doctor_Visit.AdmissionDischarge_enterFromDate(From_Date);
		Doctor_Visit.AdmissionDischarge_EnterToDate(To_Date);
		Doctor_Visit.SearchCurrentInPatientIcon("Click On Search Icon in Find Patient");
		
		Doctor_Visit.ClickOndischargedPatintTable("Click On Discharged Patint In First Table"); //First Row
		
		Thread.sleep(6000);
		Doctor_Visit.RefreshPage("Click On Refresh Page");
			
	}
	
	@Test(dataProvider = "DoctorVisitDataProvider", priority = 3 , enabled = true)
	public void PatientsDoctorVisitTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date , 
			String Find_Patint_By_Mobile_Number , String Find_Patint_By_Name , String Enter_IP_Number , String Enter_Visit_Date , 
			String Visit_Timeing , String Speciality_Drp_Visiting , String Visiting_Doctor_Drp , String Enter_Remarks_Text ,
			String Enter_Search_From_Date , String Eter_Search_To_Date) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Enter Ip Number Doctor Visit Test", "Doctor Visit Ip Billing Funcility Test");
			
		Doctor_Visit.EnterIpNumber(Enter_IP_Number);
		Thread.sleep(5000);
		Doctor_Visit.VisitTypeChargable_NormalRadioBtn("Radio Btn Click On Chargable Visit" , "Normal Visit Radio Button");
		
		//Doctor_Visit.VisitTypeChargable_EmergencyRadioBtn("Radio Btn Click On Chargable Visit" , "Emergency Visit Radio Btn"); //New  funcility
		
		Doctor_Visit.EnterVisitDate(Enter_Visit_Date);
		Doctor_Visit.EnterVisitTime(Visit_Timeing);
		
		Doctor_Visit.SelectBySpeciality_VisitingDoctorDrp(Speciality_Drp_Visiting , Visiting_Doctor_Drp);
		Doctor_Visit.EnterRemarksText(Enter_Remarks_Text);
		Doctor_Visit.SaveDoctorVisitIcon(" Click Save Icon");
		
		Thread.sleep(9000);
		Doctor_Visit.RefreshPage("Click On Refresh Page");
	}
	
	@Test(dataProvider = "DoctorVisitDataProvider", priority = 4 , enabled = true)
	public void SearchDateWisePatientsDoctorVisitTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date , 
			String Find_Patint_By_Mobile_Number , String Find_Patint_By_Name , String Enter_IP_Number , String Enter_Visit_Date , 
			String Visit_Timeing , String Speciality_Drp_Visiting , String Visiting_Doctor_Drp , String Enter_Remarks_Text ,
			String Enter_Search_From_Date , String Eter_Search_To_Date) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Search Date Wise Patients Doctor Visit Test", "search and Delete Funcility Test");
			
		Doctor_Visit.EnterIpNumber(Enter_IP_Number);
		Thread.sleep(5000);
		Doctor_Visit.SearchFromedate(Enter_Search_From_Date);
		Doctor_Visit.SearchTODate(Eter_Search_To_Date);
		Doctor_Visit.SearchVisitDoctorIcon("Click On Search Vist Doctor Icon");
		Thread.sleep(1000);
		Doctor_Visit.SelectCheckFirst("Click Select Check Box");
		Doctor_Visit.DeleteVisitDoctorIcon_YesPop("Click On Delete Btn" ,"Yes Pop");
		
		
	}
}
