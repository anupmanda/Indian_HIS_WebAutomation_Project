/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Status;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 12 Jan 2026
 */
public class TC0033_ADT_Bed_Status_Code_Blue extends ADT_Bed_Status{

	private final ADT_Bed_Status abs = new ADT_Bed_Status();
	private final String SheetName = "Bed_Status";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void BedStatus(String Facility, String Station, String Ward, String BedType, String BedStatus) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_Bed_Status_Patient_Details", "ADT_Bed_Status_Patient_Details.....................");
		abs.BedStatusCodeBlue(Facility, Station, Ward, BedType, BedStatus);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}