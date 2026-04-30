/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Doctor_Notes;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 17 Feb 2026
 */
public class TC0028_NURSING_Nursing_DoctorNotes_Visit_Notes extends NURSING_Nursing_Doctor_Notes {
	private final NURSING_Nursing_Doctor_Notes vn = new NURSING_Nursing_Doctor_Notes();
	private final String SheetName = "Visit_Note";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void VisitNotes(String Facility, String Station, String VisitNote, String text) throws IOException, InterruptedException {
		logger = extent.createTest("Doctor Notes Visit Notes","Doctor Notes Visit Notes......................");
		vn.VisitNotes(Facility, Station, VisitNote, text);
		
	}
}
