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
public class TC0031_ADT_BedBooking_BedBlocked extends ADT_Bed_Status{

	private final ADT_Bed_Status bsbb = new ADT_Bed_Status();
	private final String SheetName = "Bed_Status_BlockedBed";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object [][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" )
	public void BedStatusBedBlocked(String Facility, String Station, String Ward, String BedType, String BedStatus,String Reason,
    		String Textreason, String BedStatusBlocked) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_BedBooking_BedBlocked","ADT_BedBooking_BedBlocked.....................");
		bsbb.ClickBedBlocked(Facility, Station, Ward, BedType, BedStatus, Reason, Textreason);
		Thread.sleep(1000);
		bsbb.ClickUnBlocked(BedStatusBlocked);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
