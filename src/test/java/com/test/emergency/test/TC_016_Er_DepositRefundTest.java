/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.JavascriptExecutor;
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
	private final String sheetName_Deposit = "Er_Deposit_Page";
	private final String sheetName_Refund = "Er_Refund_Page";
	
	@DataProvider(name = "DepositDataProvider")
	public Object[][] getErDepositData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_01: " + sheetName_Deposit + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Deposit);
	}

	@Test(dataProvider = "DepositDataProvider", priority = 1 , enabled = true)
	public void SearchCurrentInPatientTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
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

	@Test(dataProvider = "DepositDataProvider", priority = 2 , enabled = false)
	public void DepositInCashTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
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

	@Test(dataProvider = "DepositDataProvider", priority = 3 , enabled = false)
	public void DepositInChequeTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
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
	@Test(dataProvider = "DepositDataProvider", priority = 4 , enabled = false)
	public void DepositInCreditCardTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit In Credit Card ", " Er Deposit In Credit Card Test Funcility");

		ErDepositRefund.ClickOnErDepositBtn("Click on Deposit Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);

		ErDepositRefund.ErDepositInCreditCardNumber("Click On Credit Card Radio Btn" , Deposit_Credit_Card_Number , Deposit_Credit_Card_Drp ,
				Deposit_Bank_Name , Deposit_Credit_Card_Trans_No , Deposit_Credit_Card_Amount , Deposit_Credit_Card_Other_Details);
	//	ErDepositRefund.ClickOnTakeOnPaymentInCreditCardDeposit("Click On Take On Payment In Credit Card");

		ErDepositRefund.RemarksAndRelationDrp(Deposit_Remarks ,Relationship_Drp);
		ErDepositRefund.SaveDepositBtnAndYesPop("Save Deposit Btn" ,"Save Yes Pop");
		Thread.sleep(1000);
		ErDepositRefund.ClickOnRefreshBtn("Click On Refresh Btn");
	}
	
	@Test(dataProvider = "DepositDataProvider", priority = 5 , enabled = false)
	public void DepositInDebitCardTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit In Debit Card ", " Er Deposit In Debit Card Test Funcility");

		ErDepositRefund.ClickOnErDepositBtn("Click on Deposit Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);

		ErDepositRefund.ErDepositIDebitCardNumber("Click On Debit Card Radio Btn" , Deposit_Credit_Card_Number , Deposit_Credit_Card_Drp ,
				Deposit_Bank_Name , Deposit_Credit_Card_Trans_No , Deposit_Credit_Card_Amount , Deposit_Credit_Card_Other_Details);
	//	ErDepositRefund.ClickOnTakeOnPaymentInDebitCardDeposit("Click On Take On Payment In Credit Card");

		ErDepositRefund.RemarksAndRelationDrp(Deposit_Remarks ,Relationship_Drp);
		ErDepositRefund.SaveDepositBtnAndYesPop("Save Deposit Btn" ,"Save Yes Pop");
		Thread.sleep(1000);
		ErDepositRefund.ClickOnRefreshBtn("Click On Refresh Btn");
	}
	
	@Test(dataProvider = "DepositDataProvider", priority = 6 , enabled = false)
	public void DepositInNEETRTGSTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit In NEET And RTGST ", " Er Deposit In NEET And RTGST Test Funcility");

		ErDepositRefund.ClickOnErDepositBtn("Click on Deposit Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);

		ErDepositRefund.ErDepositNEETAndRTGT("Click On NEET REGT Radio Btn" , NEFT_RTGS_Trans_No ," NEFT RTGS Date Check Box",
				NEFT_RTGS_Date , NEFT_RTGS_Bank_Name_Drp , NEFT_RTGS_Branch_Name , NEFT_RTGS_Amount);
	
		ErDepositRefund.RemarksAndRelationDrp(Deposit_Remarks ,Relationship_Drp);
		ErDepositRefund.SaveDepositBtnAndYesPop("Save Deposit Btn" ,"Save Yes Pop");
		Thread.sleep(2000);
		driver.navigate().refresh();
		//ErDepositRefund.ClickOnRefreshBtn("Click On Refresh Btn");
	}
	
	@Test(dataProvider = "DepositDataProvider", priority = 7 , enabled = true)
	public void DepositOtherTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit In Other ", " Er Deposit In Other Test Funcility");

		ErDepositRefund.ClickOnErDepositBtn("Click on Deposit Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);
		
		ErDepositRefund.RadioBtnDepositInOther("Click On Radio Btn Other Deposit");
		ErDepositRefund.DepositInOtherDetails(Deposit_Other_Payment_Mode_Drp , Deposit_Other_Transaction_Id , Deposit_Other_Remarks );
		ErDepositRefund.DepositInOtherAmount(Deposit_Other_Amount);
		
		ErDepositRefund.RemarksAndRelationDrp(Deposit_Remarks ,Relationship_Drp);
		ErDepositRefund.SaveDepositBtnAndYesPop("Save Deposit Btn" ,"Save Yes Pop");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "DepositDataProvider", priority = 8 , enabled = true)
	public void DepositReceiptUtilityTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit Receipt Utility Print ", "Receipt Utility Find Date Wise Print Test Funcility");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -500);"); // 500 px upar
		
		ErDepositRefund.ClickOnReceiptUtilityBtn("Click On Receipt Utility Btn");
		//ErDepositRefund.EnterReceiptUtilityErNumber(Deposit_Er_Number);
		
		ErDepositRefund.SearchRceiptUtilityInDateWise("Check Box In Date Range" , Receipt_Frome_Date , Receipt_To_Date , 
				"Click On Search In Receipt No");
		ErDepositRefund.PrintDepositReceiptNumber("Print Deposit Receipt Number");	
		ErDepositRefund.CloseReceiptPop("Click On Close Receipt Pop");
		
	}
	
	//============================Er Refund New Excel Sheet===========================
	
	@DataProvider(name = "ERRefundDataProvider")
	public Object[][] getRefundData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_02: " + sheetName_Refund + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Refund);
	}
	
	@Test(dataProvider = "ERRefundDataProvider", priority = 9 , enabled = false)
	public void RefundCashTest(String Enter_Er_Number , String Ernter_Refound_Amount , String Refound_Payable_Name , String Refound_Remarks ,
			String Refound_Cheque_Number , String Refound_Cheque_Date , String Refound_Bank_Name_Drp , String Refound_Cheque_Branch_Name , 
			String Refound_Cheque_Amount , String Refound_Credit_Number , String Refound_Card_Name_Drp , String Refound_Credit_Bank_Name_Drp ,
			String Refound_Trans_No , String Refound_Amount_Credit_Card , String NEFT_Account_No , String NEFT_Accound_Holder_Name , String NEFT_Account_Type ,
			String NEFT_Bank_Name_Drp , String NEFT_Branch_Name , String NEFT_IFSC_Code , String NEFT_RGTS_Finance_Amount , String NEFT_Processed_Trans_No ,
			String NEFT_Processed_Trans_Date , String NEFT_Processed_Banks_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_Amount ,
			String Refound_Other_Payment_Mode_Drp , String Refound_Other_Transation_No , String Refound_Other_Remarks , String Refound_Other_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Refund In Cash ", "Refund In Cash Test Funcility");
		
		ErDepositRefund.ClickOnErRefundBtn("Click On Refund Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);
		ErDepositRefund.PrintAllDepositAmountInTable("Deposit Value In Table");
		
		ErDepositRefund.ClickOnLastRowDepositAmount("Click On Deposit Amount In Table");
		ErDepositRefund.ClickOnRadioBtnInCash("Refund Cash Redio Btn");
		ErDepositRefund.LessThanCurrentRefoundAmount(Ernter_Refound_Amount);  // Lessthen current Balance Auto Calculation
		
		ErDepositRefund.RefoundPayableNameAndRemarks(Refound_Payable_Name , Refound_Remarks);
		ErDepositRefund.RefoundSaveBtnAndYesPop("Refound Save Btn" ,"Refound Save Yes Pop");
			
  }
	
	@Test(dataProvider = "ERRefundDataProvider", priority = 10 , enabled = false)
	public void RefundChequeTest(String Enter_Er_Number , String Ernter_Refound_Amount , String Refound_Payable_Name , String Refound_Remarks ,
			String Refound_Cheque_Number , String Refound_Cheque_Date , String Refound_Bank_Name_Drp , String Refound_Cheque_Branch_Name , 
			String Refound_Cheque_Amount , String Refound_Credit_Number , String Refound_Card_Name_Drp , String Refound_Credit_Bank_Name_Drp ,
			String Refound_Trans_No , String Refound_Amount_Credit_Card , String NEFT_Account_No , String NEFT_Accound_Holder_Name , String NEFT_Account_Type ,
			String NEFT_Bank_Name_Drp , String NEFT_Branch_Name , String NEFT_IFSC_Code , String NEFT_RGTS_Finance_Amount , String NEFT_Processed_Trans_No ,
			String NEFT_Processed_Trans_Date , String NEFT_Processed_Banks_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_Amount ,
			String Refound_Other_Payment_Mode_Drp , String Refound_Other_Transation_No , String Refound_Other_Remarks , String Refound_Other_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Refund In Cheque ", "Refund In Cheque Test Funcility");
		
		ErDepositRefund.ClickOnErRefundBtn("Click On Refund Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);
		ErDepositRefund.PrintAllDepositAmountInTable("Deposit Value In Table");
		
		ErDepositRefund.ClickOnLastRowDepositAmount("Click On Deposit Amount In Table");
		
		ErDepositRefund.ChequeRadioBtn("Refund Cheque Redio Btn");
		ErDepositRefund.RefoundChequeNo_ChkkBoxIssueDate_IssueDate_BanksNameDrp_BranchName( Refound_Cheque_Number ,"Refound Issue Date Check box",
				Refound_Cheque_Date , Refound_Bank_Name_Drp , Refound_Cheque_Branch_Name );
		ErDepositRefund.RefoundInChequeAmount(Refound_Cheque_Amount);
		
		ErDepositRefund.RefoundPayableNameAndRemarks(Refound_Payable_Name , Refound_Remarks);
		ErDepositRefund.RefoundSaveBtnAndYesPop("Refound Save Btn" ,"Refound Save Yes Pop");	
   }
	
	@Test(dataProvider = "ERRefundDataProvider", priority = 11 , enabled = false)
	public void RefundCreditCardTest(String Enter_Er_Number , String Ernter_Refound_Amount , String Refound_Payable_Name , String Refound_Remarks ,
			String Refound_Cheque_Number , String Refound_Cheque_Date , String Refound_Bank_Name_Drp , String Refound_Cheque_Branch_Name , 
			String Refound_Cheque_Amount , String Refound_Credit_Number , String Refound_Card_Name_Drp , String Refound_Credit_Bank_Name_Drp ,
			String Refound_Trans_No , String Refound_Amount_Credit_Card , String NEFT_Account_No , String NEFT_Accound_Holder_Name , String NEFT_Account_Type ,
			String NEFT_Bank_Name_Drp , String NEFT_Branch_Name , String NEFT_IFSC_Code , String NEFT_RGTS_Finance_Amount , String NEFT_Processed_Trans_No ,
			String NEFT_Processed_Trans_Date , String NEFT_Processed_Banks_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_Amount ,
			String Refound_Other_Payment_Mode_Drp , String Refound_Other_Transation_No , String Refound_Other_Remarks , String Refound_Other_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Refund In Credit Card ", "Refund In Credit Card Test Funcility");
		
		ErDepositRefund.ClickOnErRefundBtn("Click On Refund Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);
		ErDepositRefund.PrintAllDepositAmountInTable("Deposit Value In Table");
		
		ErDepositRefund.ClickOnLastRowDepositAmount("Click On Deposit Amount In Table");
		
		ErDepositRefund.RefoundInCreditCardNumber("Radio Btn Credit Card" , Refound_Credit_Number , Refound_Card_Name_Drp , Refound_Credit_Bank_Name_Drp ,
				Refound_Trans_No , Refound_Amount_Credit_Card);
		
		ErDepositRefund.RefoundPayableNameAndRemarks(Refound_Payable_Name , Refound_Remarks);
		ErDepositRefund.RefoundSaveBtnAndYesPop("Refound Save Btn" ,"Refound Save Yes Pop");		
	}
	
	@Test(dataProvider = "ERRefundDataProvider", priority = 12 , enabled = false)
	public void RefundNEFTRGTSProcessingFinanceTest(String Enter_Er_Number , String Ernter_Refound_Amount , String Refound_Payable_Name , String Refound_Remarks ,
			String Refound_Cheque_Number , String Refound_Cheque_Date , String Refound_Bank_Name_Drp , String Refound_Cheque_Branch_Name , 
			String Refound_Cheque_Amount , String Refound_Credit_Number , String Refound_Card_Name_Drp , String Refound_Credit_Bank_Name_Drp ,
			String Refound_Trans_No , String Refound_Amount_Credit_Card , String NEFT_Account_No , String NEFT_Accound_Holder_Name , String NEFT_Account_Type ,
			String NEFT_Bank_Name_Drp , String NEFT_Branch_Name , String NEFT_IFSC_Code , String NEFT_RGTS_Finance_Amount , String NEFT_Processed_Trans_No ,
			String NEFT_Processed_Trans_Date , String NEFT_Processed_Banks_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_Amount ,
			String Refound_Other_Payment_Mode_Drp , String Refound_Other_Transation_No , String Refound_Other_Remarks , String Refound_Other_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Refund In NEFT RGTS Processing Finance ", "Refund In NEFT RGTS Processing Finance Test Funcility");
		
		ErDepositRefund.ClickOnErRefundBtn("Click On Refund Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);
		ErDepositRefund.PrintAllDepositAmountInTable("Deposit Value In Table");
		
		ErDepositRefund.ClickOnLastRowDepositAmount("Click On Deposit Amount In Table");
		
		ErDepositRefund.RadioBtnInNEFT("Click On NEFT RGTS Radio Btn");
		ErDepositRefund.NEFTRTGSProcessingFinanceDetails("Radio Btn NEFT RGTS Processing Finance ",NEFT_Account_No , NEFT_Accound_Holder_Name , NEFT_Account_Type ,
                NEFT_Bank_Name_Drp , NEFT_Branch_Name , NEFT_IFSC_Code );
		ErDepositRefund.NEFTRGTSProcessingFinanceAmount(NEFT_RGTS_Finance_Amount);
		
		ErDepositRefund.RefoundPayableNameAndRemarks(Refound_Payable_Name , Refound_Remarks);
		//ErDepositRefund.RefoundSaveBtnAndYesPop("Refound Save Btn" ,"Refound Save Yes Pop");		
		
}
	
	@Test(dataProvider = "ERRefundDataProvider", priority = 13 , enabled = false)
	public void RefundNEFTRGTSAlreadyProcessedTest(String Enter_Er_Number , String Ernter_Refound_Amount , String Refound_Payable_Name , String Refound_Remarks ,
			String Refound_Cheque_Number , String Refound_Cheque_Date , String Refound_Bank_Name_Drp , String Refound_Cheque_Branch_Name , 
			String Refound_Cheque_Amount , String Refound_Credit_Number , String Refound_Card_Name_Drp , String Refound_Credit_Bank_Name_Drp ,
			String Refound_Trans_No , String Refound_Amount_Credit_Card , String NEFT_Account_No , String NEFT_Accound_Holder_Name , String NEFT_Account_Type ,
			String NEFT_Bank_Name_Drp , String NEFT_Branch_Name , String NEFT_IFSC_Code , String NEFT_RGTS_Finance_Amount , String NEFT_Processed_Trans_No ,
			String NEFT_Processed_Trans_Date , String NEFT_Processed_Banks_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_Amount ,
			String Refound_Other_Payment_Mode_Drp , String Refound_Other_Transation_No , String Refound_Other_Remarks , String Refound_Other_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Refund In NEFT RGTS Already Processed", "Refund In NEFT RGTS Already Processed Test Funcility");
		
		ErDepositRefund.ClickOnErRefundBtn("Click On Refund Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);
		ErDepositRefund.PrintAllDepositAmountInTable("Deposit Value In Table");
		
		ErDepositRefund.ClickOnLastRowDepositAmount("Click On Deposit Amount In Table");
		ErDepositRefund.RadioBtnInNEFT("Click On NEFT RGTS Radio Btn");
		
		ErDepositRefund.NEFTREGTAlreadyProcessedRadioBtn("Click On NEFT RGTS Already Processed Radio Btn");
		ErDepositRefund.NEFTRTGSAlreadyProcessedDetails(NEFT_Processed_Trans_No , "NEFT Processed Trans Date Check Box" , NEFT_Processed_Trans_Date ,
				NEFT_Processed_Banks_Name_Drp , NEFT_Processed_Branch_Name , NEFT_Processed_Amount);
		
		ErDepositRefund.RefoundPayableNameAndRemarks(Refound_Payable_Name , Refound_Remarks);
		ErDepositRefund.RefoundSaveBtnAndYesPop("Refound Save Btn" ,"Refound Save Yes Pop");			
   }
	
	@Test(dataProvider = "ERRefundDataProvider", priority = 14 , enabled = true)
	public void RefundOtherTest(String Enter_Er_Number , String Ernter_Refound_Amount , String Refound_Payable_Name , String Refound_Remarks ,
			String Refound_Cheque_Number , String Refound_Cheque_Date , String Refound_Bank_Name_Drp , String Refound_Cheque_Branch_Name , 
			String Refound_Cheque_Amount , String Refound_Credit_Number , String Refound_Card_Name_Drp , String Refound_Credit_Bank_Name_Drp ,
			String Refound_Trans_No , String Refound_Amount_Credit_Card , String NEFT_Account_No , String NEFT_Accound_Holder_Name , String NEFT_Account_Type ,
			String NEFT_Bank_Name_Drp , String NEFT_Branch_Name , String NEFT_IFSC_Code , String NEFT_RGTS_Finance_Amount , String NEFT_Processed_Trans_No ,
			String NEFT_Processed_Trans_Date , String NEFT_Processed_Banks_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_Amount ,
			String Refound_Other_Payment_Mode_Drp , String Refound_Other_Transation_No , String Refound_Other_Remarks , String Refound_Other_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Refund In Other", "Refund In Other Test Funcility");
		
		ErDepositRefund.ClickOnErRefundBtn("Click On Refund Btn");
		ErDepositRefund.EnterErNumber(Enter_Er_Number);
		ErDepositRefund.PrintAllDepositAmountInTable("Deposit Value In Table");
		
		ErDepositRefund.ClickOnLastRowDepositAmount("Click On Deposit Amount In Table");
		ErDepositRefund.RefounfOtherRadioBtn("Refounf In Other Radio Btn");
		ErDepositRefund.RefoundOtherDetails(Refound_Other_Payment_Mode_Drp , Refound_Other_Transation_No , Refound_Other_Remarks , 
				Refound_Other_Amount);
		//ErDepositRefund.RefoundTakePaymentInOther("Click On Take Payment In Other");
		
		ErDepositRefund.RefoundPayableNameAndRemarks(Refound_Payable_Name , Refound_Remarks);
		ErDepositRefund.RefoundSaveBtnAndYesPop("Refound Save Btn" ,"Refound Save Yes Pop");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
	
	}
	// Pick in Data In Deposit Excel Sheet
	
	@Test(dataProvider = "DepositDataProvider", priority = 15 , enabled = true)
	public void RefoundReceiptUtilityTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date , String Enter_UHID , String Enter_Er_Number , String Deposit_Case_Amount , String Deposit_Remarks , 
			String Relationship_Drp , String Deposit_Cheque_Amount , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp,
			String Cheque_Branch_Name , String Deposit_Er_Number , String Receipt_Frome_Date , String Receipt_To_Date , String Deposit_Credit_Card_Number , 
			String Deposit_Credit_Card_Drp ,String Deposit_Bank_Name , String Deposit_Credit_Card_Trans_No , String Deposit_Credit_Card_Amount ,
			String Deposit_Credit_Card_Other_Details , String NEFT_RTGS_Trans_No , String NEFT_RTGS_Date , String NEFT_RTGS_Bank_Name_Drp ,
			String NEFT_RTGS_Branch_Name , String NEFT_RTGS_Amount , String Deposit_Other_Payment_Mode_Drp , String Deposit_Other_Transaction_Id ,
			String Deposit_Other_Remarks , String Deposit_Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("ER Deposit Receipt Utility Print ", "Receipt Utility Find Date Wise Print Test Funcility");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -500);"); // 500 px upar
		
		ErDepositRefund.ClickOnReceiptUtilityBtn("Click On Receipt Utility Btn");
		//ErDepositRefund.EnterReceiptUtilityErNumber(Deposit_Er_Number);
		
		ErDepositRefund.SearchRceiptUtilityInDateWise("Check Box In Date Range" , Receipt_Frome_Date , Receipt_To_Date , 
				"Click On Search In Receipt No");
		ErDepositRefund.PrintRefoundReceiptNumber("Print Refound Receipt Number");	
		ErDepositRefund.CloseReceiptPop("Click On Close Receipt Pop");
	}
	
	
	
}
