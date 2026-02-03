/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.GeneralOrderEntry_IpbillingPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 03-Feb-2026
 */
public class TC_007_GeneralOrderEntry_IpbillinTest extends GeneralOrderEntry_IpbillingPage{

	GeneralOrderEntry_IpbillingPage General_OrderEntry = new GeneralOrderEntry_IpbillingPage();

	private final String Sheet_Name_GeneralOrder = "IP_General_OrderEntry";

	@DataProvider(name = "GeneralOrderEntryDataProvider")
	public Object[][] getGeneralOrderEntryData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + Sheet_Name_GeneralOrder + " ====");
		return ExcelSheetDataProvider.getExcelData(Sheet_Name_GeneralOrder);
	}

	@Test(dataProvider = "GeneralOrderEntryDataProvider", priority = 1 , enabled = true) 
	public void GeneralOrderEntryIpBilling (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_IP_Number_Excel , 
			String Category_Drp , String Ordered_By_Drp , String Smart_Search_Procedure_Name , String PerformedBy_Drp , String Procedure_Qty ,
			String Remarks_Text , String Previous_Order_From_Date , String Previous_Order_To_Date , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("General Order Entry", "General Order Entry Funcility Test");


		General_OrderEntry.SelectByFacilityDrp(Dashborad_Facility_Drp);
		General_OrderEntry.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		General_OrderEntry.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		General_OrderEntry.GeneralOrderEntry("Click On Ip Billing Drp","General Order Entry Page");

		General_OrderEntry.EnterIPNumber(Enter_IP_Number_Excel);
		General_OrderEntry.CheckBoxProcedure("Check Box Procedure");

		General_OrderEntry.ProcedureCategoryAndOrderedByDrp(Category_Drp , Ordered_By_Drp);
		General_OrderEntry.SmartSearchBox(Smart_Search_Procedure_Name);
		General_OrderEntry.ClickOnProcedureNameInTable("Click On Procedur Name In Table");   //Change

		General_OrderEntry.PerformedByAndQuentyDrp(PerformedBy_Drp , Procedure_Qty);   //change performed
		General_OrderEntry.RemarksText(Remarks_Text);
		General_OrderEntry.SaveGeneralOrderEntryAndYesPop("Save Btton" , "Save Yes Popup");
		Thread.sleep(5000);
		General_OrderEntry.RefreshGeneralOrderEntry("Refresh Icon");
	}

	@Test(dataProvider = "GeneralOrderEntryDataProvider", priority = 2 , enabled = true)
	public void PreviousOrderGeneralOrderEntryCheck (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_IP_Number_Excel , 
			String Category_Drp , String Ordered_By_Drp , String Smart_Search_Procedure_Name , String PerformedBy_Drp , String Procedure_Qty ,
			String Remarks_Text , String Previous_Order_From_Date , String Previous_Order_To_Date , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Previous Order General Order Entry Check", "Date Enter Check Order");

		General_OrderEntry.EnterIPNumber(Enter_IP_Number_Excel);
		Thread.sleep(1000);
		General_OrderEntry.FromDateOrderNoCheck(Previous_Order_From_Date);

		//General_OrderEntry.ToDateOrderNoCheck(Previous_Order_To_Date);
		General_OrderEntry.SearchPreviusOrder("Click On Serach Date In Order Number");
		Thread.sleep(5000);
	}	
	@Test(dataProvider = "GeneralOrderEntryDataProvider", priority = 3 , enabled = true)
	public void DeleteProceduresTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_IP_Number_Excel , 
			String Category_Drp , String Ordered_By_Drp , String Smart_Search_Procedure_Name , String PerformedBy_Drp , String Procedure_Qty ,
			String Remarks_Text , String Previous_Order_From_Date , String Previous_Order_To_Date , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Delete Procedures And Print Test ", "Date Enter Check Order");	

		General_OrderEntry.ClicOnTable_kNoOfProcedures("Click On No of Procedures In Table");
		General_OrderEntry.ClickOnPrintBtn("Print Icon Test");
        Thread.sleep(3000);
        
		General_OrderEntry.ClickOnCheckBox("Click Check Box");
		General_OrderEntry.DeleteProceduresIcon("Delete Funcility Test");  
		Thread.sleep(8000);
	}	

	@Test(dataProvider = "GeneralOrderEntryDataProvider", priority = 4 , enabled = true)
	public void SearchCurrint_In_Paient(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_IP_Number_Excel , 
			String Category_Drp , String Ordered_By_Drp , String Smart_Search_Procedure_Name , String PerformedBy_Drp , String Procedure_Qty ,
			String Remarks_Text , String Previous_Order_From_Date , String Previous_Order_To_Date , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Find Curent In Patient", "Find And Search Patient General Order Entry Test");	

		
		General_OrderEntry.SearchPatientIcon("Find Patient In Search Icon");
		General_OrderEntry.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");

		//Date Wise Other Serach Hidden
		General_OrderEntry.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		General_OrderEntry.AdmissionDischarge_FromDateSerach(From_Date);
		General_OrderEntry.AdmissionDischarge_ToDateSerach(To_Date);
		General_OrderEntry.SearchIcon_GeneralorderEntry("Click On Serch Icon");

		//General_OrderEntry.SerachMobileNumber(Mobile_no_Current_In_Patient , "Serach In Mobile NO Patient");
		//General_OrderEntry.EnterNameAndSerchicon(Name_Current_In_Patient , "Serach In Name Patient");

		General_OrderEntry.SerachAndselectPatientInTable("Click On Search Patient Table");
		Thread.sleep(2000);
		General_OrderEntry.RefreshGeneralOrderEntry("Click On Refresh Page");

	}
	
	@Test(dataProvider = "GeneralOrderEntryDataProvider", priority = 5 , enabled = true)
	public void DischargedPatientsGeneralOrderEntry(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_IP_Number_Excel , 
			String Category_Drp , String Ordered_By_Drp , String Smart_Search_Procedure_Name , String PerformedBy_Drp , String Procedure_Qty ,
			String Remarks_Text , String Previous_Order_From_Date , String Previous_Order_To_Date , String From_Date , String To_Date , 
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Discharged Patients ", "IP Billing General Order Entry");
		
		General_OrderEntry.SearchPatientIcon("Find Patient In Search Icon");
		
		General_OrderEntry.RadioBtnDischargedPatients("Radio Button Discharged Patients");
		General_OrderEntry.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		General_OrderEntry.AdmissionDischarge_FromDateSerach(From_Date);
		General_OrderEntry.AdmissionDischarge_ToDateSerach(To_Date);
	    
		General_OrderEntry.SearchIcon_GeneralorderEntry("Click On Serch Icon");
		General_OrderEntry.PickDischargePatientTable("Pick on Table discharge patient");
	    
	    
	}	    

}
