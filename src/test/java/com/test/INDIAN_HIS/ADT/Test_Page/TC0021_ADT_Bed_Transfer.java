/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Transfer;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 29 Dec 2025
 */
public class TC0021_ADT_Bed_Transfer extends ADT_Bed_Transfer{
	
	private final ADT_Bed_Transfer bt = new ADT_Bed_Transfer();
	private final String SheetName = "Bed_Transfer";
	
	@DataProvider(name = "ADT_Bed_Transfer")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ADT_Bed_Transfer")
	
	public void BedTransfer(String Facility, String Station,String BedType, String Ward, String Bed, String BillableBedType) throws IOException, InterruptedException {
	logger = extent.createTest("Bed_Transfer", "Bed_Transfer...............");
	
	bt.BedTransfer(Facility, Station);
	Thread.sleep(1000);
	bt.ClickFirstBedRequestAvailable();
	Thread.sleep(1000);
	bt.BedSelect(BedType, Ward, Bed, BillableBedType);
	Thread.sleep(1000);
	bt.verifyPOPUPSuccess(driver);
	 Thread.sleep(500);
     CommanUtill.ClickHomePage();
	}
}
