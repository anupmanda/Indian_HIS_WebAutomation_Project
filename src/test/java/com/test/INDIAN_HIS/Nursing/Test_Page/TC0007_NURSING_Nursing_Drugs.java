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
 * 21 Jan 2026
 */
public class TC0007_NURSING_Nursing_Drugs extends NURSING_Nursing_Drug{
	private final NURSING_Nursing_Drug nd = new NURSING_Nursing_Drug();
	private final String SheetName = "Nursing_Drugs";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
		@Test(dataProvider = "ExcelUniversalDataProvider")
		
		public void NursingDrugs(String Facility, String Station, String Drug) throws Exception {
			logger = extent.createTest("NURSING_Nursing_Drug","NURSING_Nursing_Drug...............................");
			nd.DrugNewOrder(Facility, Station);
			//nd.DrugPending(Facility, Station);
			//nd.DrugDelete(Facility, Station);
			//nd.NewOrderPending(Facility, Station);
			//nd.NewOrderDeleted(Facility, Station);
			//nd.Print(Facility, Station);
			 Thread.sleep(500);
		        CommanUtill.ClickHomePage();
		}
	}

