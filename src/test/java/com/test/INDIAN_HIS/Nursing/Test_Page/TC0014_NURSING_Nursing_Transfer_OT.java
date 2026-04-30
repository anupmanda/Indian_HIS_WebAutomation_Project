/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Transfer;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 29 Jan 2026
 */
public class TC0014_NURSING_Nursing_Transfer_OT extends NURSING_Nursing_Transfer{
	private NURSING_Nursing_Transfer nt = new NURSING_Nursing_Transfer();
	private String SheetName = "Nursing_Transfer_OT";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider="ExcelUniversalDataProvider", priority = 1)
	public void NursingTransfer(String Facility, String Station, String Ward, String Transport) throws IOException, InterruptedException {
		logger = extent.createTest("NURSING_Nursing_Transfer","NURSING_Nursing_Transfer");
		nt.NursingOTTransfer(Facility, Station, Ward, Transport);
		
	}
}
