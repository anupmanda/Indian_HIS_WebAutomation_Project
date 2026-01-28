/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Pre_Authorization_Approval;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 23 Dec 2025
 */
public class TC0016_ADT_Pre_Authorization_Approval_Admit_Patient extends ADT_Pre_Authorization_Approval{
	
	private final ADT_Pre_Authorization_Approval apap = new ADT_Pre_Authorization_Approval();
	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	private final String SheetName = "Pre_Auth";
	private final String SheetName1  = "Pre_Auth_Admit_Patient";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

@DataProvider(name = "ExcelUniversalDataProvider1")
	
	public Object[][]getData1() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName1);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void Pre_Authorization_Approval_Admit_Patient(String Facility, String Station, String Date, String DocumentName,
			String DocumentType) throws InterruptedException, IOException {
		logger = extent.createTest("Pre_Authorization_Approval_Screen","Pre_Authorization_Approval_Screen........................");
		apap.PreAuthorizationApproval(Facility, Station, Date);
		Thread.sleep(1000);
		apap.clickFirstAvailableCheckbox();
		Thread.sleep(1000);
		apap.clickFirstAvailablePreAuthIconTd15();;
		Thread.sleep(1000);
		CommanUtill.switchToNewWindow(driver);
		Thread.sleep(1000);
		
	}
	
@Test(dataProvider = "ExcelUniversalDataProvider1", priority = 2)
	
	public void AdmitPatient(String Facility, String Station, String Title, String Gender, String DOB, String FatherName, String M_Status,
			String Address, String City, String Nationality, String ABCPin, String Speciality, String Referred, String Stay, String Source, String BedType, String Ward,
			String Package_Speciality, String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) throws IOException, InterruptedException {
		logger = extent.createTest("Admit_Patient" , "Fill All The Mandatory Details at all Admit PatientScreen and Click on Ths Save Buton");
		 
		adt.Pre_Auth_AdmitPatient(Address, City, Nationality, ABCPin);
		Thread.sleep(1000);
        adt.Consultant(Speciality, Referred, Stay, Source);		
    	Thread.sleep(1000);
    	adt.BedandPaymentDetails(BedType, Ward);
    	Thread.sleep(1000);
    	adt.PackageDetails(Package_Speciality);
    	Thread.sleep(1000);
    	adt.NextofKinDetails(KinName, Relation, Name, ClinicalCo, BillingCo );
    	Thread.sleep(1000);
    	adt.ClickSave();
    	Thread.sleep(1000);
         CommanUtill.ClickHomePage();
	}
	}

