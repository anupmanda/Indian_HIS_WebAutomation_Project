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
 * 11 Feb 2026
 */
public class TC0024_NURSING_Nursing_Notes_Template_PainAssesment extends NURSING_Nursing_Nursing_Notes{

	private final NURSING_Nursing_Nursing_Notes pas = new NURSING_Nursing_Nursing_Notes();
	private final String SheetName = "Pain_Assesment";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider")

	public void NrsingPainAssesment(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Notes_PainAssesment","Nursing_Notes_PainAssesment");
		pas.PainAssesment(Facility, Station);
	}
}
