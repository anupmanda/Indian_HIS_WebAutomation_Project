/**
 * 
 */
package com.test.frontofficeBilling.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.frontoffice.page.FoDepositsPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 14-Jan-2026
 * 02 Excel Sheet Used Fo_Deposits
 */
public class TC_007_FoDepositsTest extends FoDepositsPage {


	FoDepositsPage DepositePage = new FoDepositsPage();
	private final String sheetName = "Fo_Deposits";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)
	public void BillsDepositeTest(String Facility_Drp , String Station_Drp , String Enter_Deposite_UHID , String Enter_Deposite_CardNo ,
			String Enter_Deposit_Amount , String Deposit_Remarks_ext , String Received_From_After_Edit , String Relationship_drp , 
			String deposit_Type_drp , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , 
			String Cheque_Branch_Name , String Credit_card_no , String Credit_card_type_drp , String Credit_bank_name_Drp , 
			String Credit_Transaction_id , String Credit_other_details , String Change_deposit_Type_drp
			) 
					throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest("Bills Deposite Test", "Deposite Functionality Test");
		DepositePage.selectByFacilityDropdwon(Facility_Drp);
		DepositePage.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		DepositePage.clickOnDepositeButton("Billing", "Deposits Page");

		DepositePage.enterUhidInDepositePage(Enter_Deposite_UHID);
		//DepositePage.enterCardNoInDepositePage(Enter_Deposite_CardNo);

		DepositePage.enterAmountInDepositeAndRemarks(Enter_Deposit_Amount, Deposit_Remarks_ext);
		DepositePage.clickOnEditBtnAndSaveReceivedFrom("Click Edit Button", Received_From_After_Edit);

		DepositePage.selectRelationshipAndDepositeType(Relationship_drp, deposit_Type_drp);
		//DepositePage.CheckBoxOnHomeCare("Home Care CheckBox");
		DepositePage.WalletTreeCardRecharge("Wallet Tree Card Recharge");
		DepositePage.ClickPaymentModeCash("Click On Cash Deposit Radio Button");

		/*
		DepositePage.selectPaymentModeCheque("Cheque Deposit Radio Btn", Cheque_Number, Cheque_Issue_Date, 
				Cheque_Bank_Name_Drp, Cheque_Branch_Name);

		DepositePage.selectPaymentModeCredit("Credit Deposit Radio Btn" , Credit_card_no, Credit_card_type_drp, Credit_bank_name_Drp, 
				Credit_Transaction_id, Credit_other_details ,"Take Payment Credit Card Btn" );
		 */
		DepositePage.clickOnSaveBtn("Click Save Deposit Button" , "Yes Confirm Popup for Deposit Save");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(500, 0);");

	}
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2)

	public void DepositPrintTest(String Facility_Drp , String Station_Drp , String Enter_Deposite_UHID , String Enter_Deposite_CardNo ,
			String Enter_Deposit_Amount , String Deposit_Remarks_ext , String Received_From_After_Edit , String Relationship_drp , 
			String deposit_Type_drp , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , 
			String Cheque_Branch_Name , String Credit_card_no , String Credit_card_type_drp , String Credit_bank_name_Drp , 
			String Credit_Transaction_id , String Credit_other_details,  String Change_deposit_Type_drp
			) throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest("Deposit Print ", "Print  Functionality Test");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		try {

			DepositePage.clickOnPrintBtn("Click On Deposit And Table Click" , "Click Print Button");
		} catch (Exception e) {
			System.out.println("======================================");
			System.out.println("Print Popup Blocked Because Popup Blocker is Enabled in the Browser");
			System.out.println("======================================");
		}

	}   

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3)

	public void ChangeDepositTypeTest(String Facility_Drp , String Station_Drp , String Enter_Deposite_UHID , String Enter_Deposite_CardNo ,
			String Enter_Deposit_Amount , String Deposit_Remarks_ext , String Received_From_After_Edit , String Relationship_drp , 
			String deposit_Type_drp , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , 
			String Cheque_Branch_Name , String Credit_card_no , String Credit_card_type_drp , String Credit_bank_name_Drp , 
			String Credit_Transaction_id , String Credit_other_details,  String Change_deposit_Type_drp
			) throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest(" Change To Deposit Type", "Deposite Functionality Test");

		DepositePage.clickOnChangeDepositeTypeBtn("Click On Deposit Table" , Change_deposit_Type_drp ,
				"Save Change Deposit Type Btn" ,"Change To Deposit Yes Confirm Popup");
		driver.navigate().refresh();

	}

	//************************************Refund Amount Data Provider **************************
	
	private final String sheetName_Refund = "Fo_Bills_Refund";
	@DataProvider(name = "RefunfAmountDataProvider")
	public Object[][] getRefundData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Refund +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Refund);
	}

	@Test(dataProvider = "RefunfAmountDataProvider" , priority = 4)
	public void refundDepositeTest(String Facility_Drp , String Station_Drp ,String Enter_Refund_UHID , String Enter_Refund_Amount , 
			String Payable_Name , String Remarks_Refund , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , 
			String Cheque_Branch_Name , String Available_Refund_Amount , String Credit_Card_Number , String Credit_Card_Type_Drp ,
			String Credit_Card_Bank_Name_Drp , String Credit_Card_Branch_Name , String Credit_Card_Available_Refund_Amount , 
			String Enter_Receipt_Utility_UHID , String Enter_Receipt_Number , String Receipt_From_Date , String Receipt_To_Date , 
			String Refund_Reason_Drp_Pop , String Refund_Remarks_Pop) 
					throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest("Bills Refund Amount", "Cash Refund Functionality Test");

		//DepositePage.selectByFacilityDropdwon(Facility_Drp);
		//DepositePage.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		//DepositePage.clickOnDepositeButton("Billing", "Deposits Page");
	
		DepositePage.clickOnRefundDetailsBtn("Click On Refund Button");
		DepositePage.enterUhidInRefundDetailsPage(Enter_Refund_UHID);
		
		DepositePage.ClickOnTableRefundDetails("Click On Refund Details Table" );

		DepositePage.selectRefundPaymentModeCash("Cash Refund Radio Btn" );   //Wrong Place bez *************
		DepositePage.enterRefundAmountPayableNameRemarks(Enter_Refund_Amount, Payable_Name , Remarks_Refund );

		//	DepositePage.clickOnWalletTreeCardRechargeRefund("Wallet Tree Card Recharge Refund");
		//	DepositePage.selectRefundPaymentModeCash("Cash Refund Radio Btn" );
		/*	
			DepositePage.selectRefundPaymentModeCheque("Cheque Refund Radio Btn" , Cheque_Number, Cheque_Issue_Date, 
					Cheque_Bank_Name_Drp, Cheque_Branch_Name , Available_Refund_Amount);

			DepositePage.selectRefundPaymentModeCredit("Credit Refund Radio Btn" , Credit_Card_Number, Credit_Card_Type_Drp, 
					Credit_Card_Bank_Name_Drp, Credit_Card_Branch_Name , Credit_Card_Available_Refund_Amount);
		 */
		DepositePage.clickOnRefundSaveBtn("Click Save Refund Button" , "Yes Confirm Popup for Refund Save");
		DepositePage.enterDepositRefundReasonRemarksAndSendApprovalReq(Refund_Reason_Drp_Pop,  Refund_Remarks_Pop ,
				"Send Approval Request Button Popup" );
		
	}

	@Test(dataProvider = "RefunfAmountDataProvider" , priority = 5)
	public void ReceiptUtilityPrint(String Facility_Drp , String Station_Drp ,String Enter_Refund_UHID , String Enter_Refund_Amount , 
			String Payable_Name , String Remarks_Refund , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , 
			String Cheque_Branch_Name , String Available_Refund_Amount , String Credit_Card_Number , String Credit_Card_Type_Drp ,
			String Credit_Card_Bank_Name_Drp , String Credit_Card_Branch_Name , String Credit_Card_Available_Refund_Amount , 
			String Enter_Receipt_Utility_UHID , String Enter_Receipt_Number , String Receipt_From_Date , String Receipt_To_Date , 
			String Refund_Reason_Drp_Pop , String Refund_Remarks_Pop) 
					throws IOException, InterruptedException, ClassNotFoundException {

		logger= extent.createTest("Receipt Utility Funcility Test", "Print Deposit And Refund Functionality Test");

		DepositePage.clickOnReceiptUtilityBtn("Click On Receipt Utility Button");
		//DepositePage.enterUHIDDetails(Enter_Receipt_Utility_UHID);
		//DepositePage.enterReceiptUtility(Enter_Receipt_Number);

		DepositePage.selectReceiptUtilityDateRange("Click on Date Range Picker Check Box" , Receipt_From_Date , Receipt_To_Date ,"Apply Date Range Button");
		
		System.out.println("======================================");
		DepositePage.clickOnDepositPrintIcon();
		System.out.println("======================================");
		Thread.sleep(3000);
		DepositePage.clickOnRefundPrintIcon();
	}
}
