/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Status;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 12 Jan 2026
 */
public class TC0030_ADT_Bed_Status_Admit_Patient extends ADT_Bed_Status{

	private final ADT_Bed_Status bsp = new ADT_Bed_Status();
	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	private final String SheetName = "Bed_Status_AdmitPatient";
	private final String SheetName1  = "Admit_Patient";
	
	@DataProvider(name = "Bed_Status_AdmitPatient")
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "Bed_Status_AdmitPatient", priority = 1)
	public void BedStatusAdmitPatient(String Facility, String Station, String Ward, String BedType, String BedStatus, String Reason,
			String Textreason, String BedStatusBlocked) throws IOException, InterruptedException {
		logger = extent.createTest("Bed_Status_AdmitPatient","Bed_Status_AdmitPatient.........................");
		bsp.ClickAdmit(Facility, Station, Ward, BedType, BedStatus);
	}

	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getdata() throws IOException{
		return  ExcelSheetDataProvider.getExcelData(SheetName1);
	}
		
	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 2, dependsOnMethods = {"BedStatusAdmitPatient"})
	
	public void AdmitPatient(String Facility, String Station, String Title, String Gender, String DOB, String FatherName, String M_Status,
			String Address, String City, String Nationality, String ABCPin, String Speciality, String Referred, String Stay, String Source, String BedType, String Ward,
			String Package_Speciality, String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) throws IOException, InterruptedException {
		logger = extent.createTest("Admit_Patient" , "Fill All The Mandatory Details at all Admit PatientScreen and Click on Ths Save Buton");
		 
		adt.BedStatusAdmitPatient(Title,Gender,DOB,FatherName,M_Status, Address, City,Nationality, ABCPin);
		Thread.sleep(1000);
        adt.Consultant(Speciality, Referred, Stay, Source);		
    	Thread.sleep(1000);
    	adt.BedandPaymentDetailsAdmitPatient();
    	Thread.sleep(1000);
    	adt.PackageDetails(Package_Speciality);
    	Thread.sleep(1000);
    	adt.NextofKinDetails(KinName, Relation, Name, ClinicalCo, BillingCo );
    	Thread.sleep(1000);
    	adt.ClickSave();
    	Thread.sleep(1000);
    	adt.captureUhidAndWlNumber(ADT_Admit_Patient.xpathOfToastMessage);
    	Thread.sleep(2000);
         CommanUtill.ClickHomePage();
	}
}
