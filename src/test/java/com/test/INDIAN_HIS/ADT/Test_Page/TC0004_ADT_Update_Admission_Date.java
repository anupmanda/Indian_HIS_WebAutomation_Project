/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Update_Admission_Date;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 15 Dec 2025
 */
public class TC0004_ADT_Update_Admission_Date extends ADT_Update_Admission_Date{
	private final ADT_Update_Admission_Date  uad = new  ADT_Update_Admission_Date();
	private final String SheetName1 = "updateADD";
	
	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	private final String SheetName  = "Admit_Patient";
	
	@DataProvider(name = "Admit_Patient_Details")
	public Object[][] getdata() throws IOException{
		return  ExcelSheetDataProvider.getExcelData(SheetName);
	}
		
	@Test(dataProvider = "Admit_Patient_Details" , priority = 1)
	
	public void AdmitPatient(String Facility, String Station, String Title, String Gender, String DOB, String FatherName, String M_Status,
			String Address, String City, String Nationality, String ABCPin, String Speciality, String Referred, String Stay, String Source, String BedType, String Ward,
			String Package_Speciality, String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) throws IOException, InterruptedException {
		logger = extent.createTest("Admit_Patient" , "Fill All The Mandatory Details at all Admit PatientScreen and Click on Ths Save Buton");
		 
		adt.AdmitPatient(Facility,Station,Title,Gender,DOB,FatherName,M_Status, Address, City,Nationality, ABCPin);
		
        adt.Consultant(Speciality, Referred, Stay, Source);		
    	
    	adt.BedandPaymentDetails(BedType, Ward);
    	
    	adt.PackageDetails(Package_Speciality);
    	
    	adt.NextofKinDetails(KinName, Relation, Name, ClinicalCo, BillingCo );
    	
    	adt.ClickSave();
    	
    	adt.captureUhidAndWlNumber(ADT_Admit_Patient.xpathOfToastMessage);
    	Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("location.reload(true);");
        
        adt.DetailsUpdate();
	}

	
	@DataProvider(name = "updateADD_Details")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName1);
	}
	
	@Test(dataProvider = "updateADD_Details", priority = 2)
	
	public void UpdateAdmissionDate(String Facility, String Station, String DischargeType) throws IOException, InterruptedException {
		logger = extent.createTest("Update Admission Date" , "Admission Date Will be Updated........." );
		uad.ADTUpdateAmission(Facility, Station, DischargeType);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}

}
