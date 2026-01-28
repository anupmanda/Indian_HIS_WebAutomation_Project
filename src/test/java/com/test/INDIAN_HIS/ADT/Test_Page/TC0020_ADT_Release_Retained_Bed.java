/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Release_Retained_Bed;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 26 Dec 2025
 */
public class TC0020_ADT_Release_Retained_Bed extends ADT_Release_Retained_Bed{
	private final ADT_Release_Retained_Bed arb = new ADT_Release_Retained_Bed();
	private final String SheetName = "Release_Retained_Bed";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void ReleaseBedStatus(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("Release_Retained_Bed","Release_Retained_Bed.........................");
		arb.ClickReleasedRetainedBed(Facility, Station);
		Thread.sleep(1000);
		arb.clickFirstAvailablePreAuthIcon();
		Thread.sleep(1000);
		arb.ClickReleaseYesBTN();
		Thread.sleep(1000);
		arb.verifyFileUploadSuccess(driver);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
