/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Procedure;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *  
 * 19 Jan 2026
 */
public class TC0004_NURSING_Nursing_Procedure extends NURSING_Nursing_Procedure{

	private final NURSING_Nursing_Procedure np = new NURSING_Nursing_Procedure();
	private final String SheetName = "Nursing_Procedure";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void SelectProcedure(String Facility, String Station) throws Exception {
		logger = extent.createTest("NURSING_Nursing_Procedure","NURSING_Nursing_Procedure.....................");
		np.SelectProcedure(Facility, Station);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
		
	}
}
