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
public class TC0028_ADT_Referral_Hospital extends ADT_Referral_Doctor_Hospital{
	
	private final ADT_Referral_Doctor_Hospital rh = new ADT_Referral_Doctor_Hospital();
	private final String SheetName = "ReferralHospital";

	@DataProvider(name = "ExcelUniversalDataProvider")
	
	     
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void ReferralHospital(String Facility, String Station, String Address, String City, String State, String Country,
			String DoctorType) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_Referral_Doctor_Hospital","ADT_Referral_Doctor_Hospital..........................");		
		rh.ReferralDoctor_Hospital(Facility, Station, Address, City, State, Country, DoctorType);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
