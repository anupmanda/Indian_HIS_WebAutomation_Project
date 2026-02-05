/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.Nursing.page.NursingActivityPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class TC_00A1_IpBillingTest extends ADT_Admit_Patient{
	
	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	NursingActivityPage Nursing_Activity = new NursingActivityPage();
	
	private final String SheetName  = "Admit_Patient";
	private final String sheetName_Nursing_Activity = "Nursing_Activity_Page";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getdata() throws IOException{
		System.out.println("====Fetching data from Excel sheet_01 : " + SheetName + " ====");
		return  ExcelSheetDataProvider.getExcelData(SheetName);
	}
		
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 )
	
	public void AdmitPatient(String Facility, String Station, String Title, String Gender, String DOB, String FatherName, String M_Status,
			String Address, String City, String Nationality, String ABCPin, String Speciality, String Referred, String Stay, String Source, String BedType, String Ward,
			String Package_Speciality, String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) 
					throws IOException, InterruptedException {
		
		logger = extent.createTest("Admit_Patient" , "Fill All The Mandatory Details at all Admit PatientScreen and Click on The Save Buton");
		 
		adt.AdmitPatient(Facility, Station, Title, Gender, DOB, FatherName , M_Status , Address, City , Nationality , ABCPin);
		
        adt.Consultant(Speciality, Referred, Stay, Source);		
    	
    	adt.BedandPaymentDetails(BedType, Ward);
    	
    	//adt.PackageDetails(Package_Speciality);
    	
    	adt.NextofKinDetails(KinName, Relation, Name, ClinicalCo, BillingCo );
    	
    	adt.ClickSave();
    	adt.ClosekOnGCDScreen("Close GCD Screen Pop");
    	
    	String AdmitUHIDId = adt.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + AdmitUHIDId);
		CommanUtill.capturedUHID = AdmitUHIDId;

		String ipNo = adt.getIPNoOfPatient(); 
		System.out.println("Patient IP No is: " + ipNo);
		CommanUtill.capturedIP = ipNo; 
		Thread.sleep(800);
		adt.printFaceSheetRadioBtn_PrintBtn("Radio Button Face Sheet" , "Click On Print Icon");
		adt.ClickOnHISLog("Click On HIS Log Icon");
	}
	
//*********************** Nursing Page **********************************************
	
	@DataProvider(name = "NursingActivityDataProvider")
	public Object[][] getActivityData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet_02 : " + sheetName_Nursing_Activity + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Nursing_Activity);
	}

	@Test(dataProvider = "NursingActivityDataProvider", priority = 2 , enabled = true)
	public void NursingClearanceTest(String Dashborad_Facility_Drp , String Nursing_Station_Drp ) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Acknowledge Discharge Notification Test", "Acknowledge Discharge");
		
		Nursing_Activity.SelectByFacilityDrp("SANITY HOSPITAL");
		Nursing_Activity.ClickOnNursingDashboard("Click On Nursing DashBorad" ,Nursing_Station_Drp , "Station Yes Popup");
		
		Nursing_Activity.ClickOnNursingActivityTab_Clearance("Nursing Activity Tab","Nursing activity Page");
		
		//Nursing_Activity.EnterSerchBoxInIPNumber("29161");
		Nursing_Activity.EnterSerchBoxInIPNumber(CommanUtill.capturedIP);
		
		Nursing_Activity.clickFirstAfterSearch_AdmittedNotOccupied();
		Nursing_Activity.SaveChangeBedStatus_YesPop("Save Change Bed Status Pop ", "Yes Pop");
		Thread.sleep(5000);
	
	
	}

}
