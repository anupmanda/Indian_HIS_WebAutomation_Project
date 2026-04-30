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
 * 18 Feb 2026
 */
public class TC0029_NURSING_Nursing_DoctorNotes_Doctor_Referral extends NURSING_Nursing_Doctor_Notes {
	private final NURSING_Nursing_Doctor_Notes dr = new NURSING_Nursing_Doctor_Notes();
	private final String SheetName = "Doctor_Referral";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void DoctorReferral(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("Doctor Notes Doctor Referral","Doctor Notes Doctor Referral......................");
		dr.DoctorReferral(Facility, Station);
		
}
}
