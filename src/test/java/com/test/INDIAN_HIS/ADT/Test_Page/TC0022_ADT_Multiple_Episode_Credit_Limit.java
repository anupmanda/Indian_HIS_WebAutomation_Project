/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Multiple_Episode_Credit_Limit;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 29 Dec 2025
 */
public class TC0022_ADT_Multiple_Episode_Credit_Limit extends ADT_Multiple_Episode_Credit_Limit{
	
	private final ADT_Multiple_Episode_Credit_Limit mecl = new ADT_Multiple_Episode_Credit_Limit();
	private final String SheetName = "MECreditLimit";
	
	@DataProvider (name = "ExcelUniversalDataProvider")
	
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void MultipleEpisodeCreditLimit(String Facility, String Station, String UHID, String CreditLim, String CompanyType,
    		String Company, String RateContract, String ClaimNumber) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_Multiple_Episode_Credit_Limit","ADT_Multiple_Episode_Credit_Limit........................");
		mecl.MultipleEpisodeCreditLimit(Facility, Station, UHID, CreditLim, CompanyType, Company, RateContract, ClaimNumber);
		Thread.sleep(1000);
		mecl.verifyPOPUPSuccess(driver);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
		
		
	}
}
