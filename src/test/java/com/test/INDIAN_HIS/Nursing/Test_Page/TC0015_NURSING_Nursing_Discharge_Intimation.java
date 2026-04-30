/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Discharge;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 30 Jan 2026
 */
public class TC0015_NURSING_Nursing_Discharge_Intimation extends NURSING_Nursing_Discharge{
	private NURSING_Nursing_Discharge nd = new NURSING_Nursing_Discharge ();
	private String SheetName = "Nursing_Discharge";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider= "ExcelUniversalDataProvider")
	public void DischargeIntimation(String Facility, String Station, String DischargeType, String DischargeSubType, String Remarks, 
			String DeleteRemarks) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Discharge","Nursing_Discharge.......................");
		nd.DischargeIntimation(Facility, Station, DischargeType, DischargeSubType, Remarks, DeleteRemarks);
	}
}
