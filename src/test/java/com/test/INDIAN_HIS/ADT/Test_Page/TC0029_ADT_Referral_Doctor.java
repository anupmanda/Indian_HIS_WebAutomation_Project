/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Referral_Doctor_Hospital;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 5 Jan 2026
 */
public class TC0029_ADT_Referral_Doctor extends ADT_Referral_Doctor_Hospital{
	
	private final ADT_Referral_Doctor_Hospital rd = new ADT_Referral_Doctor_Hospital();
	private final String SheetName = "Referral_Doctor";
	
	@DataProvider(name = "ExcelUniversalDataProvider"
			)
	
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void RefrerralDoctor(String Facility, String Station, String Title, String Speciality, String Address, String City,
			  String State, String Country, String StateRegn, String Hospital, String MedicalGen) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_Referral_Doctor_Hospital","ADT_Referral_Doctor_Hospital.......................");
		rd.Referral_Doctor(Facility, Station, Title, Speciality, Address, City, State, Country, StateRegn, Hospital, MedicalGen);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
