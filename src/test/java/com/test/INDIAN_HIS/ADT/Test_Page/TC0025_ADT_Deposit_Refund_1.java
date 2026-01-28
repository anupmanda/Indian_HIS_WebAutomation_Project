/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Deposit_Refund;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 02 Dec 2026
 */
public class TC0025_ADT_Deposit_Refund_1 extends ADT_Deposit_Refund{
	
	private final ADT_Deposit_Refund df = new ADT_Deposit_Refund();
	private final String SheetName = "Deposit_Refund";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void DepositRefund(String Facility, String Station,String UHID, String Amount, String PaymentMode, String Relation,
			String UHIDOPIP) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_Deposit_Refund","ADT_Deposit_Refund..........................");
		df.Refund1(Facility, Station, UHID, Amount);
		Thread.sleep(1000);
		df.verifyFileUploadSuccess(driver);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}