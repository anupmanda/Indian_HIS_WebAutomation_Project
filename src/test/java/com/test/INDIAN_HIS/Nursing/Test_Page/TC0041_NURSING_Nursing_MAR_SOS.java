/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Drug;
import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Notes_MAR;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 27 Feb 2026
 */
public class TC0041_NURSING_Nursing_MAR_SOS extends NURSING_Nursing_Drug{
	private final NURSING_Nursing_Drug nd = new NURSING_Nursing_Drug();
	private final NURSING_Nursing_Notes_MAR mar = new NURSING_Nursing_Notes_MAR();
	private final String SheetName = "MAR_Drug_Adminis";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
		@Test(dataProvider = "ExcelUniversalDataProvider")
		
		public void NursingDrugsNewOrderPending(String Facility, String Station,String MedicineName,String Frequency,String Frequency1,String Reason, String DelayedDate) throws Exception {
			logger = extent.createTest("NURSING_Nursing_Notes_MAR_SOS","NURSING_Nursing_Notes_MAR_SOS...............................");
			nd.NewOrderMARSOS(Facility, Station, MedicineName, Frequency1);
			Thread.sleep(500);
			mar.MARSOS();
		 
		}
}