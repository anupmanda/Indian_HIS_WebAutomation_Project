/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Doctor_Notes;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 13 Feb 2026
 */
public class TC0026_NURSING_Nursing_Doctor_Notes_OperativeNotes extends NURSING_Nursing_Doctor_Notes{
	private final NURSING_Nursing_Doctor_Notes dn = new NURSING_Nursing_Doctor_Notes();
	private final String SheetName = "DoctorNotes";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider="ExcelUniversalDataProvider")
	public void DoctorNotes(String Facility, String Station, String Operative) throws IOException, InterruptedException {
		logger = extent.createTest("Doctor_Notes","Doctor_Notes");
		dn.DoctorNotes(Facility, Station, Operative);
		
		
	}
}
