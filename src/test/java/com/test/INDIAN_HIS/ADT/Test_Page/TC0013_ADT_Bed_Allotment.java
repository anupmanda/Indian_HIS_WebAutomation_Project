/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Allotment;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 22 Dec 2025
 */
public class TC0013_ADT_Bed_Allotment extends ADT_Bed_Allotment{
	
	private final ADT_Bed_Allotment aba = new ADT_Bed_Allotment();
	private final String SheetName = "Bed_Allotment";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void BedAllotment(String Facility,String Station, String IPNO, String RequestedBedType, String BillableBedType, 
    		String AllotedBedType, String Ward) throws IOException, InterruptedException {
		logger = extent.createTest("Bed_Allotment","Bed_Allotment...................");
		aba.BedAllotment(Facility, Station, IPNO, RequestedBedType, BillableBedType, AllotedBedType, Ward);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
