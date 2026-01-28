/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Surgery_Medical_Estimate;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 18 Dec 2025
 */
public class TC0010_ADT_Surgical_Credit_Estimate extends ADT_Surgery_Medical_Estimate{
	
	private final ADT_Surgery_Medical_Estimate sme = new ADT_Surgery_Medical_Estimate();
	private final String SheetName = "Surgical_Sheet";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object [][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
		
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void SurgicalCreditEstimate(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String SurgicalSpeciality, String Surgery, String OTDuration, String SurgeonSpeciality, String Surgeon, String Anesthesia,
    		String RateContract,String DepositAmount, String Problem) throws IOException, InterruptedException {
		
		logger = extent.createTest("Surgical Credit Estimate", "Surgical Cedit Estimate.........");
		sme.SurgicalEstimateCredit(Facility, Station, DOB, Gender, EstimateType, BedType, WardDays, SurgicalSpeciality, Surgery, OTDuration,
				SurgeonSpeciality, Surgeon, Anesthesia, RateContract, DepositAmount, Problem);
		Thread.sleep(1000);
		sme.drawSignatureAndSave(driver);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
