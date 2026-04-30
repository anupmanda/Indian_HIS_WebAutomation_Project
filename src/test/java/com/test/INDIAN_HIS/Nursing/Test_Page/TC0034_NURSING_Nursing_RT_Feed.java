/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Diet;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 23 Feb 2026
 */
public class TC0034_NURSING_Nursing_RT_Feed extends NURSING_Nursing_Diet{
	
	private final NURSING_Nursing_Diet da = new NURSING_Nursing_Diet();
	private final String SheetName = "Diet_RTFeed";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object [][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void DietLiquid(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Diet_RTFeed","Nursing_Diet_RTFeed");
		da.DietRTFeed(Facility, Station);
	}
	
}