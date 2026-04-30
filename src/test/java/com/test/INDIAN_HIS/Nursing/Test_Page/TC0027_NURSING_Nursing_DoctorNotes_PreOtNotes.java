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
 * 16 Feb 2026
 */
public class TC0027_NURSING_Nursing_DoctorNotes_PreOtNotes extends NURSING_Nursing_Doctor_Notes{
	
	private final NURSING_Nursing_Doctor_Notes pon = new NURSING_Nursing_Doctor_Notes();
	private final String SheetName = "DN_PreOTNotes";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
		@Test(dataProvider = "ExcelUniversalDataProvider")
		public void DoctorNotesVisitNotes(String Facility, String Station, String Operative1) throws IOException, InterruptedException {
			logger = extent.createTest("Doctor_Notes_Visit_Notes","Doctor_Notes_Visit_Notes...................");
			pon.PreOTNotes(Facility, Station, Operative1);
		}
		
 }


