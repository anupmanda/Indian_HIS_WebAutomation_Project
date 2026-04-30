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
 * 27 Feb 2026
 */
public class TC0042_NURSING_Nursing_MAR_Missed extends NURSING_Nursing_Notes_MAR {
	private final NURSING_Nursing_Notes_MAR marmiss = new NURSING_Nursing_Notes_MAR();
	private final String SheetName = "MAR_Drug_Adminis";
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
		@Test(dataProvider = "ExcelUniversalDataProvider")
		
		public void NursingOrderMarMissed(String Facility, String Station,String MedicineName,String Frequency,String Frequency1,String Reason, String DelayedDate) throws Exception {
			logger = extent.createTest("NURSING_Nursing_Notes_MAR_Missed","NURSING_Nursing_Notes_MAR_Missed...............................");
			marmiss.MARMissed(Facility, Station);
		}
}