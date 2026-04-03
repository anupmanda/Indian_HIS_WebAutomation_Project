/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_DepositRefundPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 02-Apr-2026
 */
public class TC_016_Er_DepositRefundTest extends Er_DepositRefundPage {

	Er_DepositRefundPage ErDepositRefund = new Er_DepositRefundPage();
	private final String sheetName = "Er_DepositRefund_Page";

	@DataProvider(name = "DepositRefundDataProvider")
	public Object[][] getErDepositData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "DepositRefundDataProvider", priority = 1 , enabled = true)
	public void SearchCurrentInPatientTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Emergency Deposit And Refound", "Search Patient In Er Deposit And Refound Test Funcility");

		ErDepositRefund.SelectByFacilityDrp(Dashborad_Facility_Drp);
		ErDepositRefund.ClickOnErBillingDashboard("Click On Er Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		ErDepositRefund.ErDepositRefundPage(" Er Deposit Refund Page");
		ErDepositRefund.FindPatientInSearchIcon("Click On Search Btn");

		ErDepositRefund.RadioBtnCurrentInPatientAndCheckBoxAllWard_AdmissionDischaredCheckBox("Click On Radio Btn Current In Patients" , 
				"All Ward Check Box" ,"Click On Check BoxAdmission Discharge");

		ErDepositRefund.EnterFromeDate(Find_Patient_Frome_Date);
		ErDepositRefund.EnterToDate(Find_Patient_To_Date);

		ErDepositRefund.ClickOnSearchBtnPop("Click On Search Btn");
		ErDepositRefund.ClickOnCurrentInPatientSearchTable("Click On First Current In Patient In Table");	
		Thread.sleep(1000);
		ErDepositRefund.ClickOnRefreshBtn("Click On Refresh Btn");

	}

	@Test(dataProvider = "DepositRefundDataProvider", priority = 2 , enabled = false)
	public void DepositInCashTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit In Cash ", " Er Deposit In Cash Test Funcility");

		ErDepositRefund.ClickOnErDepositBtn("Click on Deposit Btn");
		//ErDepositRefund.EnterUHID(Enter_UHID);
		ErDepositRefund.EnterErNumber(Enter_Er_Number);

		ErDepositRefund.PaymentInCashRadioBtnAndAmount("Deposit In Cash Radio Btn" , Deposit_Case_Amount);
		ErDepositRefund.RemarksAndRelationDrp(Deposit_Remarks ,Relationship_Drp);

		ErDepositRefund.SaveDepositBtnAndYesPop("Save Deposit Btn" ,"Save Yes Pop");
		Thread.sleep(1000);
		ErDepositRefund.ClickOnRefreshBtn("Click On Refresh Btn");

	}

	@Test(dataProvider = "DepositRefundDataProvider", priority = 3 , enabled = false)
	public void DepositInChequeTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit In Cheque ", " Er Deposit In Cheque Test Funcility");

		ErDepositRefund.ClickOnErDepositBtn("Click on Deposit Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);

		ErDepositRefund.PaymentInChequeRadioBtnAndAmount("Click On Radio Btn In Cheque" , Deposit_Cheque_Amount);
		ErDepositRefund.ChequeNo_ChkkBoxIssueDate_IssueDate_BanksNameDrp_BranchName(Cheque_Number , "Check Box In Issue Date" , 
				Cheque_Issue_Date , Cheque_Bank_Name_Drp , Cheque_Branch_Name);

		ErDepositRefund.RemarksAndRelationDrp(Deposit_Remarks ,Relationship_Drp);
		ErDepositRefund.SaveDepositBtnAndYesPop("Save Deposit Btn" ,"Save Yes Pop");
		Thread.sleep(1000);
		ErDepositRefund.ClickOnRefreshBtn("Click On Refresh Btn");
	}
	
	@Test(dataProvider = "DepositRefundDataProvider", priority = 4 , enabled = true)
	public void DepositReceiptUtilityTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit Receipt Utility Print ", "Receipt Utility Find Date Wise Print Test Funcility");
		
		ErDepositRefund.ClickOnReceiptUtilityBtn("Click On Receipt Utility Btn");
		//ErDepositRefund.EnterReceiptUtilityErNumber(Deposit_Er_Number);
		
		ErDepositRefund.SearchRceiptUtilityInDateWise("Check Box In Date Range" , Receipt_Frome_Date , Receipt_To_Date , 
				"Click On Search In Receipt No");
		ErDepositRefund.PrintDepositReceiptNumber("Print Deposit Receipt Number");
		
	}
}
