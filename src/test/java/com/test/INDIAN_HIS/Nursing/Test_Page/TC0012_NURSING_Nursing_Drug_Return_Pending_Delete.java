/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Drug_Return;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 28 Jan 2026
 */
public class TC0012_NURSING_Nursing_Drug_Return_Pending_Delete  extends NURSING_Nursing_Drug_Return{
	private NURSING_Nursing_Drug_Return dr = new NURSING_Nursing_Drug_Return();
	private String SheetName = "Drug_Return";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
@Test(dataProvider = "ExcelUniversalDataProvider")
	public void DrugReturn(String Facility, String Station, String Return_Qty) throws IOException, InterruptedException {
	logger = extent.createTest("NURSING_Nursing_Drug_Return_Pending_Delete","NURSING_Nursing_Drug_Return_Pending_Delete");
		dr.DrugReturnPending(Facility, Station, Return_Qty);
	}
}
