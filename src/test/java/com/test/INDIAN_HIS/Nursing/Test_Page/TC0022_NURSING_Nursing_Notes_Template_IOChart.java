/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Nursing_Notes;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 3 Feb 2026
 */
public class TC0022_NURSING_Nursing_Notes_Template_IOChart extends NURSING_Nursing_Nursing_Notes{
	
	private final NURSING_Nursing_Nursing_Notes nic = new NURSING_Nursing_Nursing_Notes();	
	private final String SheetName = "Nursing_IOChart";
	
	@DataProvider(name = "ExcelUniversaldataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversaldataProvider")
	public void NursingConsent(String Facility, String Station, String IVFluid, String InputVolume, String Taking, 
    		String Meal, String Quantity, String InputRemarks, String Output, String SubOutput, String TextQuantity1, String OutputRemarks) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Notes_Template_IOChart","Nursing_Notes_Template_IOChart");
		nic.NursingIOChart(Facility, Station, IVFluid, InputVolume, Taking, Meal, Quantity, InputRemarks, Output, SubOutput, TextQuantity1, OutputRemarks);
		
	}
}
