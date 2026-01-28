/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Cheque_In_Hand;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Deposit_Refund;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 5 Jan 2026
 */
public class TC0027_ADT_Cheque_In_Hand extends ADT_Cheque_In_Hand{
	
	private final ADT_Cheque_In_Hand cih = new ADT_Cheque_In_Hand();
	private final ADT_Deposit_Refund df = new ADT_Deposit_Refund();
	private final String SheetName = "Cheque_In_Hand";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void ChequeInHand(String Facility, String Station, String UHID, String Amount, String BankName ,
			String BranchName, String Remarks) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_Cheque_In_Hand","ADT_Cheque_In_Hand............................");
		cih.ChequeInHand(Facility, Station, UHID, Amount, BankName, BranchName, Remarks);
		Thread.sleep(1000);
		df.ChequeInHandDeposit();
		Thread.sleep(1000);
		cih.AfterRefreshCheck(UHID);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
}
