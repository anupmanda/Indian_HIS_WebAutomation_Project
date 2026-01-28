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
 * 17 Dec 2025
 */
public class TC0007_ADT_Medical_Cash_Estimate extends ADT_Surgery_Medical_Estimate {
	
	private final ADT_Surgery_Medical_Estimate sme = new ADT_Surgery_Medical_Estimate();
	private final String SheetName = "MedicalEstimate";

@DataProvider (name = "ExcelUniversalDataProvider")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
		
		public void MedicalEstimate(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
				String PrimaryAttending, String PrimaryConsultant, String VisitDays, String RateContract ,String DepositAmount, String Problem) throws IOException, InterruptedException {
			logger = extent.createTest("Medical Estimate" ,"To Calculate Medical Estimation.............");
			
			sme.MedicalEstimateCash(Facility, Station, DOB, Gender, EstimateType, BedType, WardDays, PrimaryAttending, PrimaryConsultant, 
				                VisitDays, DepositAmount, Problem);
			
			sme.drawSignatureAndSave(driver);
			 Thread.sleep(500);
		        CommanUtill.ClickHomePage();
		}
	}

