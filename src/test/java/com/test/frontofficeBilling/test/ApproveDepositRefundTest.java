/**
 * 
 */
package com.test.frontofficeBilling.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.BillsApproveRefundsPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 16-Jan-2026
 */
public class ApproveDepositRefundTest extends BillsApproveRefundsPage{
	
	BillsApproveRefundsPage Approve_Refund = new BillsApproveRefundsPage();
  
	private final String sheetName_Approve = "Fo_Approve_Refunds";
	
	@DataProvider(name = "ApproveRefundDataProvider")
	public Object[][] getApproveData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Approve +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Approve);
	}

	@Test(dataProvider = "ApproveRefundDataProvider" , priority = 1, enabled = true)
	public void DepositApproveRefundsTest(String Facility_Drp , String Station_Drp, String Bills_RefundFrom_Date , String Bills_Refund_To_Date ,
			String Deposit_Refund_From_Date , String Deposit_Refund_To_Date ) 
					throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest("Deposit Approve Refunds  Test", " Deposit Approve Refunds Functionality Test");
		
		Approve_Refund.selectByFacilityDropdwon(Facility_Drp);
		Approve_Refund.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		Approve_Refund.clickOnApproveRefundsPage("Billing ", "Approve Refunds Page");

		Approve_Refund.enterFromAndToDateInSerach(Deposit_Refund_From_Date, Deposit_Refund_To_Date , "Search Refunds Button");	
		
		Approve_Refund.DepositRefundApprove("Deposit Refund Radio Btn", "New Radio Btn" ,"Approve Btn Table Last Row");
		Approve_Refund.YesDepositRefundApprovePopup("Yes Deposit Refund Approve Popup");
		Approve_Refund.CheckDepositApproveRadioBtn("Deposit Refund Radio Btn" , "Check Check Approve Radio Btn");
		
		Thread.sleep(5000);
		Approve_Refund.DepositRefundReject("Deposit Refund Radio Btn", "New Radio Btn" , "Reject Deposit Table Last Row");
		Approve_Refund.YesDepositRefundRejectPopup("Yes Deposit Reject Popup");
		Approve_Refund.CheckDepositRejectRadioBtn("Bills Refund Radio Btn" , "Check Reject Deposit Radio Btn");
		
		
		}
}
