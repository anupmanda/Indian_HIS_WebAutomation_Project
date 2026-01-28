/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Consent;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 24 Dec 2025
 */
public class TC0018_ADT_Consent extends ADT_Consent{
	
	private final ADT_Consent con = new ADT_Consent();
	private final String SheetName = "ADT_Consent";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test (dataProvider = "ExcelUniversalDataProvider")
	
	public void ADTConsent(String Facility, String Station,String UHID, String Template) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_Consent", "ADT_Consent..........");
		con.ADTConsent(Facility, Station, UHID, Template);
		Thread.sleep(1000);
		con.drawSignatureAndSave(driver);
		Thread.sleep(1000);
		Assert.assertTrue(verifyFileUploadSuccess(driver));
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
