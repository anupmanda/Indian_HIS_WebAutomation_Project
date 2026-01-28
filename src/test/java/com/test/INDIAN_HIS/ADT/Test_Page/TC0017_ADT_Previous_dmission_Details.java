/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Previous_Admission_Details;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 24 Dec 2025
 */
public class TC0017_ADT_Previous_dmission_Details extends ADT_Previous_Admission_Details {
	
	private final ADT_Previous_Admission_Details pad = new ADT_Previous_Admission_Details();
	private final String SheetName = "Pre_Add_Det";

	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void AdmissionPreviousDetails(String Facility, String Station, String UHID) throws IOException, InterruptedException {
		logger = extent.createTest("Admission Previous Details", "Admission Previous Details..............");
		pad.PreviousAdmissionDetails(Facility, Station, UHID);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
		
	}
}
