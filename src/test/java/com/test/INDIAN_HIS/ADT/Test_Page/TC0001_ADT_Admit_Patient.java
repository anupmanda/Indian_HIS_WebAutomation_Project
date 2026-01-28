/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;

import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 27 Nov 2025
 */
public class TC0001_ADT_Admit_Patient extends ADT_Admit_Patient{
	
	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	private final String SheetName  = "Admit_Patient";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getdata() throws IOException{
		return  ExcelSheetDataProvider.getExcelData(SheetName);
	}
		
	@Test(dataProvider = "ExcelUniversalDataProvider")
	
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
    	
    	adt.captureUhidAndWlNumber(xpathOfToastMessage);
    	Thread.sleep(1000);
    	verifyPopUpSuccess(driver);
    	Thread.sleep(1000);
        CommanUtill.ClickHomePage();
	}

}
