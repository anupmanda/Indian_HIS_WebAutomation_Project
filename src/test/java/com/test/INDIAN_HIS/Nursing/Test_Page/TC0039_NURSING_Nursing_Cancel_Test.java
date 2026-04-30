/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Cancel_Test;
import com.test.readdata.ExcelSheetDataProvider;  

/**
 * @author Ashutosh
 *
 * 26 Feb 2026
 */
public class TC0039_NURSING_Nursing_Cancel_Test extends NURSING_Nursing_Cancel_Test{
	private final NURSING_Nursing_Cancel_Test ct = new NURSING_Nursing_Cancel_Test();
	private final String SheetName = "Cancel_Test";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object [][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void CancelTest(String Facility, String Station, String IPNO) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Cancel_Test","Nursing_Cancel_Test...........................");
		ct.CancelTest(Facility, Station, IPNO);
		
	}
}
