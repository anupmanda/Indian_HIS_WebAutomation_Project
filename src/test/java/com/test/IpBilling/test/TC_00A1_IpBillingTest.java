/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class TC_00A1_IpBillingTest extends ADT_Admit_Patient{
	
	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	private final String SheetName  = "Admit_Patient";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getdata() throws IOException{
		return  ExcelSheetDataProvider.getExcelData(SheetName);
	}
		
	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void AdmitPatient(String Facility, String Station, String Title, String Gender, String DOB, String FatherName, String M_Status,
			String Address, String City, String Nationality, String ABCPin, String Speciality, String Referred, String Stay, String Source, String BedType, String Ward,
			String Package_Speciality, String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) 
					throws IOException, InterruptedException {
		logger = extent.createTest("Admit_Patient" , "Fill All The Mandatory Details at all Admit PatientScreen and Click on Ths Save Buton");
		 
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

}
