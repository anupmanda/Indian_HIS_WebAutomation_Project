/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Drug;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 22 Jan 2026
 */
public class TC0008_NURSING_Nursing_NewOrder_Pending extends NURSING_Nursing_Drug{
	private final NURSING_Nursing_Drug nd = new NURSING_Nursing_Drug();
	private final String SheetName = "Nursing_Drugs";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
		@Test(dataProvider = "ExcelUniversalDataProvider")
		
		public void NursingDrugsNewOrderPending(String Facility, String Station, String Drug) throws Exception {
			logger = extent.createTest("NURSING_Nursing_Drug_NewOrder_Pending","NURSING_Nursing_Drug_NewOrder_Pending...............................");
			nd.NewOrderPending(Facility, Station, Drug);
		    CommanUtill.ClickHomePage();
		}
	}

