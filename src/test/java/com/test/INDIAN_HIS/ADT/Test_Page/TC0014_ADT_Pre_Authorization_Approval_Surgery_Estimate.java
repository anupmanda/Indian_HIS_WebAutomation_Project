/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Pre_Authorization_Approval;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Surgery_Medical_Estimate;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 23 Dec 2025
 */
public class TC0014_ADT_Pre_Authorization_Approval_Surgery_Estimate extends ADT_Pre_Authorization_Approval{
	
	private final ADT_Pre_Authorization_Approval apap = new ADT_Pre_Authorization_Approval();
	private final ADT_Surgery_Medical_Estimate sme = new ADT_Surgery_Medical_Estimate();
	private final String SheetName = "Pre_Auth";
	private final String SheetName1 = "Surgical_Sheet";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object [][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
     @DataProvider(name = "ExcelUniversalDataProvider1")
	
	public Object [][] getData1() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName1);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 1)
	
	public void PreAuth_SurgeryEstimate(String Facility, String Station, String Date, String DocumentName, String DocumentType) throws InterruptedException, IOException {
		
		logger = extent.createTest("Pre_Authorization_Approval_Screen","Pre_Authorization_Approval_Screen........................");
		apap.PreAuthorizationApproval(Facility, Station, Date);
		Thread.sleep(1000);
		apap.clickFirstAvailableCheckbox();
		Thread.sleep(1000);
		apap.clickFirstAvailablePreAuthIcon();
		Thread.sleep(1000);
		CommanUtill.switchToNewWindow(driver);
		Thread.sleep(1000);
		
		/*apap.clickFirstAvailablePreAuthIconTd14();
		Thread.sleep(1000);
		apap.clickFirstAvailablePreAuthIconTd15();*/
		
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider1", priority = 2)
	public void SurgicalEstimate(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String SurgicalSpeciality, String Surgery, String OTDuration, String SurgeonSpeciality, String Surgeon, String Anesthesia,
    		String RateContract, String DepositAmount, String Problem ) throws IOException, InterruptedException {
		logger = extent.createTest("Surgical Cash Estimate","Surgical Cash Estimate..................");
		sme.SurgicalEstimateCashPre_Auth(Facility, Station, DOB, Gender, EstimateType, BedType, WardDays, SurgicalSpeciality, Surgery, OTDuration, 
				SurgeonSpeciality, Surgeon, Anesthesia, DepositAmount, Problem);
		Thread.sleep(1000);
      //   sme.CalculateandSave();
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
}
}