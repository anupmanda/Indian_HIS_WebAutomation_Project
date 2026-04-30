/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Diet;
import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Nursing_Equipment;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 24 Feb 2026
 */
public class TC0035_NURSING_Nursing_Equipment extends NURSING_Nursing_Nursing_Equipment{

	private final NURSING_Nursing_Nursing_Equipment ne = new NURSING_Nursing_Nursing_Equipment();
	private final String SheetName = "Nursing_Equipment";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object [][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void NursingEquipment(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Diet_RTFeed","Nursing_Diet_RTFeed");
		ne.NursingEquipment(Facility, Station);
		
	}
	
}