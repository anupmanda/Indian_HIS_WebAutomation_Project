/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Nursing_Notes;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 3 Feb 2026
 */
public class TC0021_NURSING_Nursing_Notes_Template_Consent extends NURSING_Nursing_Nursing_Notes{
	
	private final NURSING_Nursing_Nursing_Notes nc = new NURSING_Nursing_Nursing_Notes();	
	private final String SheetName = "Nursing_Consent";
	
	@DataProvider(name = "ExcelUniversaldataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversaldataProvider")
	public void NursingConsent(String Facility, String Station, String ConsentTemplate) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Notes_Template_Consent","Nursing_Notes_Template_Consent");
		nc.NursingNotesConsent(Facility, Station, ConsentTemplate);;
	}
}
