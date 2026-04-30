/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Notes_MAR;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 2 Mar 2026
 */
public class TC0044_NURSING_Nursing_MAR_Infusion extends NURSING_Nursing_Notes_MAR{
	private final NURSING_Nursing_Notes_MAR mri = new NURSING_Nursing_Notes_MAR();
	private final String SheetName = "MAR_Infusion";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object [][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void MARInfusion(String Facility, String Station, String IPNO) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_MAR_Infusion","Nursing_MAR_Infusion");
	    mri.MARInfusion(Facility, Station, IPNO);	
	}
}
