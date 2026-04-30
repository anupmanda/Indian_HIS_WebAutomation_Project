/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Activity;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 16 Jan 2026
 */
public class TC0003_NURSING_Nursing_Activity_Collect_Sample extends NURSING_Nursing_Activity{
	private final NURSING_Nursing_Activity na = new NURSING_Nursing_Activity();
	private final String SheetName = "NursingActivity";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void NursingActivity(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("NURSING_Nursing_Activity","NURSING_Nursing_Activity.....................");
		na.SampleCollect(Facility, Station);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	
	}
}
