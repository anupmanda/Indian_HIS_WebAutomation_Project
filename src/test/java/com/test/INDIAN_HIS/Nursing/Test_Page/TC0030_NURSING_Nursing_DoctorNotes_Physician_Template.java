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
 * 19 Feb 2026
 */
public class TC0030_NURSING_Nursing_DoctorNotes_Physician_Template extends NURSING_Nursing_Doctor_Notes {
	private final NURSING_Nursing_Doctor_Notes pt = new NURSING_Nursing_Doctor_Notes();
	private final String SheetName = "DN_PhysicianTemplate";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void PhysicianTemplate(String Facility, String Station, String DoctorTemplate) throws IOException, InterruptedException {
		logger = extent.createTest("Doctor Notes Physician Template","Doctor Notes Physician Template......................");
		pt.PhysicianTemplate(Facility, Station, DoctorTemplate);
}
}