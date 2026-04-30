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
 * 13 Feb 2026
 */
public class TC0025_NURSING_Nursing_Notes_Template_NurseCarePlan extends NURSING_Nursing_Nursing_Notes{

	private NURSING_Nursing_Nursing_Notes ncp = new NURSING_Nursing_Nursing_Notes();
	private String SheetName = "NurseCarePlan";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void NurseCarePlan(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("Nurse_Care_Plan","Nurse_Care_Plan");
		ncp.NurseCarePlan(Facility, Station);
	}
}
