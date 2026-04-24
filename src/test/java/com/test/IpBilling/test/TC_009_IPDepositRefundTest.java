/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.IPDepositRefundPage;
import com.test.frontoffice.page.FoDepositsPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 18-Feb-2026
 */
public class TC_009_IPDepositRefundTest extends IPDepositRefundPage{

	IPDepositRefundPage IP_Deposit_Refund = new IPDepositRefundPage();
	FoDepositsPage Fo_Deposits = new FoDepositsPage();

	private final String sheetName_IpDeposit = "Ip_DepositRefund_Page";
	private final String sheetName_IPRefund = "Ip_Refund_Page";
	private final String sheetName_Receipt = "Ip_ReceiptUtility_Page";
	private final String sheetName_OP_IpTransfer = "OP_Deposit_Transfer_Ip";

	@DataProvider(name = "IpDepositRefundDataProvider")
	public Object[][] getIpDepositData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_01: " + sheetName_IpDeposit + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_IpDeposit);
	}

	@Test(dataProvider = "IpDepositRefundDataProvider", priority = 2 , enabled = true)
	public void IpDepositCashTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Find_Patint_From_Date , String Find_Patient_To_Date ,
			String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet , String Enter_Deposit_Amount , String Enter_Deposit_Remarks , String Enter_Received_From ,
			String Select_Relationship_Drp , String Cheque_Number , String Cheque_Date , String Cheque_Bank_Name_Drp , String Cheque_Bank_Branch , String Cheque_Amount ,
			String Credit_Card_No , String Credit_Type_Drp , String Credit_Bank_Drp , String Credit_Transaction_Id , String Credit_Amount , String Debit_Card_No ,
			String Debit_Type_Drp , String Debit_Bank_Drp , String Debit_Transaction_Id , String Debit_Amount , String NEFT_Transaction_Id , String Enter_NEFT_Date ,
			String NEFT_Bank_Drp , String NEFT_Bank_Branch , String NEFT_Amount , String Other_Mode_Of_Payment_Drp , String Other_Transaction_Id , String Other_RRN_Number ,
			String Other_Remarks , String Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Enter IP No Excel Sheet Patient Deposit Test", "Deposit In Cash Functionality In Ip Billing");

		//IP_Deposit_Refund.EnterUhid(Enter_UHID_Excel_Sheet);
		IP_Deposit_Refund.EnterIpNumber(Enter_IP_Number_Excel_Sheet);

		IP_Deposit_Refund.EnterDepositAmountAndRemaks(Enter_Deposit_Amount , Enter_Deposit_Remarks);
		IP_Deposit_Refund.ClickOnDepositCashRadioBtn("Click On Deposit Cash Radio Btn");
		IP_Deposit_Refund.ClickOnEditBtnAndEnterReceivedFrom("Click On Edit Btn And Enter Received From", Enter_Received_From);
		IP_Deposit_Refund.SelectRelationshipDrp(Select_Relationship_Drp);

		IP_Deposit_Refund.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit " ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");
	
		//IP_Deposit_Refund.DepositPopupPrintBtn("Print Pop In Deposit Popup");
		
		Thread.sleep(2000);

	}
	// ****************** This test method is used to find the patient *****************************

	@Test(dataProvider = "IpDepositRefundDataProvider", priority = 1 , enabled = true)
	public void FindPatientForDeposit(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Find_Patint_From_Date , String Find_Patient_To_Date ,
			String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet , String Enter_Deposit_Amount , String Enter_Deposit_Remarks , String Enter_Received_From ,
			String Select_Relationship_Drp , String Cheque_Number , String Cheque_Date , String Cheque_Bank_Name_Drp , String Cheque_Bank_Branch , String Cheque_Amount ,
			String Credit_Card_No , String Credit_Type_Drp , String Credit_Bank_Drp , String Credit_Transaction_Id , String Credit_Amount , String Debit_Card_No ,
			String Debit_Type_Drp , String Debit_Bank_Drp , String Debit_Transaction_Id , String Debit_Amount , String NEFT_Transaction_Id , String Enter_NEFT_Date ,
			String NEFT_Bank_Drp , String NEFT_Bank_Branch , String NEFT_Amount , String Other_Mode_Of_Payment_Drp , String Other_Transaction_Id , String Other_RRN_Number ,
			String Other_Remarks , String Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Deposit Test In Table", "Find Patient For Deposit In Ip Billing");

		IP_Deposit_Refund.SelectByFacilityDrp(Dashborad_Facility_Drp);
		IP_Deposit_Refund.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		IP_Deposit_Refund.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		IP_Deposit_Refund.DepositAndRefundPage("Click On Ip Deposit Refund Tab","Ip Deposit Refund Page");
		IP_Deposit_Refund.ClickOnIpDepositIcon("Click On Ip Deposit Icon");

		IP_Deposit_Refund.ClickOnSearchIcon("Click On Search Icon At Find Patient ");
		IP_Deposit_Refund.RadioBtnCurrentInPatientAndAllWardCheckBox("Click On Current In Patient Radio Btn" ," All Ward Check Box");
		IP_Deposit_Refund.AdmissionDischargeCheckBox("Admission Discharge Check Box");
		IP_Deposit_Refund.EnterFromDateAndToDate(Find_Patint_From_Date , Find_Patient_To_Date);

		IP_Deposit_Refund.ClickOnSearchBtnInFindPatientPop("Click On Search Btn In Find Patient Popup");
		IP_Deposit_Refund.ClickOnLastRowInSearchPatientTable("Click On Last Row In Search Patient Table");

		IP_Deposit_Refund.EnterDepositAmountAndRemaks(Enter_Deposit_Amount , Enter_Deposit_Remarks);
		IP_Deposit_Refund.ClickOnDepositCashRadioBtn("Click On Deposit Cash Radio Btn");
		IP_Deposit_Refund.ClickOnEditBtnAndEnterReceivedFrom("Click On Edit Btn And Enter Received From", Enter_Received_From);
		IP_Deposit_Refund.SelectRelationshipDrp(Select_Relationship_Drp);

		IP_Deposit_Refund.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");
	
		Thread.sleep(2000);
		driver.navigate().refresh();

	}
	@Test(dataProvider = "IpDepositRefundDataProvider", priority = 3 , enabled = true)
	public void IpDepositChequeest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Find_Patint_From_Date , String Find_Patient_To_Date ,
			String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet , String Enter_Deposit_Amount , String Enter_Deposit_Remarks , String Enter_Received_From ,
			String Select_Relationship_Drp , String Cheque_Number , String Cheque_Date , String Cheque_Bank_Name_Drp , String Cheque_Bank_Branch , String Cheque_Amount ,
			String Credit_Card_No , String Credit_Type_Drp , String Credit_Bank_Drp , String Credit_Transaction_Id , String Credit_Amount , String Debit_Card_No ,
			String Debit_Type_Drp , String Debit_Bank_Drp , String Debit_Transaction_Id , String Debit_Amount , String NEFT_Transaction_Id , String Enter_NEFT_Date ,
			String NEFT_Bank_Drp , String NEFT_Bank_Branch , String NEFT_Amount , String Other_Mode_Of_Payment_Drp , String Other_Transaction_Id , String Other_RRN_Number ,
			String Other_Remarks , String Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Deposit In Cheque Test", "Deposit In Cheque Functionality In Ip Billing");

		IP_Deposit_Refund.ClickOnDepositChequeRadionInformation("Click On Deposit Cheque Radio Btn",Cheque_Number ,"Click On Cheque Box in Issue Date", Cheque_Date , 
				Cheque_Bank_Name_Drp , Cheque_Bank_Branch, Cheque_Amount);

		IP_Deposit_Refund.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");
		Thread.sleep(2000);

	}
	@Test(dataProvider = "IpDepositRefundDataProvider", priority = 4 , enabled = true)

	public void IpDepositCreditCardTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Find_Patint_From_Date , String Find_Patient_To_Date ,
			String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet , String Enter_Deposit_Amount , String Enter_Deposit_Remarks , String Enter_Received_From ,
			String Select_Relationship_Drp , String Cheque_Number , String Cheque_Date , String Cheque_Bank_Name_Drp , String Cheque_Bank_Branch , String Cheque_Amount ,
			String Credit_Card_No , String Credit_Type_Drp , String Credit_Bank_Drp , String Credit_Transaction_Id , String Credit_Amount , String Debit_Card_No ,
			String Debit_Type_Drp , String Debit_Bank_Drp , String Debit_Transaction_Id , String Debit_Amount , String NEFT_Transaction_Id , String Enter_NEFT_Date ,
			String NEFT_Bank_Drp , String NEFT_Bank_Branch , String NEFT_Amount , String Other_Mode_Of_Payment_Drp , String Other_Transaction_Id , String Other_RRN_Number ,
			String Other_Remarks , String Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Deposit By Credit Card Test", "Deposit IN Credit Card Functionality In Ip Billing");

		IP_Deposit_Refund.ClickOnDepositCreditCardRadionInformation("Click On Deposit Credit Card Radio Btn", Credit_Card_No , Credit_Type_Drp, Credit_Bank_Drp, 
				Credit_Transaction_Id , Credit_Amount);

		IP_Deposit_Refund.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");

		//IP_Deposit_Refund.ClickOnCreditCardTakePaymentBtn("Click On Take Payment Btn In Credit Card Btn");  //Not working btn
		Thread.sleep(2000);
	}

	@Test(dataProvider = "IpDepositRefundDataProvider", priority = 5 , enabled = true)
	public void IpDepositDeditCardTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Find_Patint_From_Date , String Find_Patient_To_Date ,
			String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet , String Enter_Deposit_Amount , String Enter_Deposit_Remarks , String Enter_Received_From ,
			String Select_Relationship_Drp , String Cheque_Number , String Cheque_Date , String Cheque_Bank_Name_Drp , String Cheque_Bank_Branch , String Cheque_Amount ,
			String Credit_Card_No , String Credit_Type_Drp , String Credit_Bank_Drp , String Credit_Transaction_Id , String Credit_Amount , String Debit_Card_No ,
			String Debit_Type_Drp , String Debit_Bank_Drp , String Debit_Transaction_Id , String Debit_Amount , String NEFT_Transaction_Id , String Enter_NEFT_Date ,
			String NEFT_Bank_Drp , String NEFT_Bank_Branch , String NEFT_Amount , String Other_Mode_Of_Payment_Drp , String Other_Transaction_Id , String Other_RRN_Number ,
			String Other_Remarks , String Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Deposit By Debit Card Test", "Deposit IN Debit Card Functionality In Ip Billing");

		IP_Deposit_Refund.ClickOnDepositDebitCardRadionInformation("Click On Deposit Debit Card Radio Btn", Debit_Card_No , Debit_Type_Drp, Debit_Bank_Drp, 
				Debit_Transaction_Id , Debit_Amount);

		IP_Deposit_Refund.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");

		//IP_Deposit_Refund.ClickOnDebitCardTakePaymentBtn("Click On Take Payment Btn In Debit Card Btn"); //Not working btn
		Thread.sleep(2000);
	}

	@Test(dataProvider = "IpDepositRefundDataProvider", priority = 6 , enabled = true)
	public void IpDeposiNEFTTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Find_Patint_From_Date , String Find_Patient_To_Date ,
			String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet , String Enter_Deposit_Amount , String Enter_Deposit_Remarks , String Enter_Received_From ,
			String Select_Relationship_Drp , String Cheque_Number , String Cheque_Date , String Cheque_Bank_Name_Drp , String Cheque_Bank_Branch , String Cheque_Amount ,
			String Credit_Card_No , String Credit_Type_Drp , String Credit_Bank_Drp , String Credit_Transaction_Id , String Credit_Amount , String Debit_Card_No ,
			String Debit_Type_Drp , String Debit_Bank_Drp , String Debit_Transaction_Id , String Debit_Amount , String NEFT_Transaction_Id , String Enter_NEFT_Date ,
			String NEFT_Bank_Drp , String NEFT_Bank_Branch , String NEFT_Amount , String Other_Mode_Of_Payment_Drp , String Other_Transaction_Id , String Other_RRN_Number ,
			String Other_Remarks , String Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Deposit By NEFT Test", "Deposit IN NEFT Functionality In Ip Billing");

		IP_Deposit_Refund.ClickOnDepositNEFTRadionInformation("Click On Deposit NEFT Radio Btn", NEFT_Transaction_Id , "Trans_Date_Chkk_Box" , Enter_NEFT_Date ,
				NEFT_Bank_Drp , NEFT_Bank_Branch , NEFT_Amount);
		IP_Deposit_Refund.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");
		Thread.sleep(2000);
	}
	@Test(dataProvider = "IpDepositRefundDataProvider", priority = 7 , enabled = true)

	public void IpDepositOtherTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Find_Patint_From_Date , String Find_Patient_To_Date ,
			String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet , String Enter_Deposit_Amount , String Enter_Deposit_Remarks , String Enter_Received_From ,
			String Select_Relationship_Drp , String Cheque_Number , String Cheque_Date , String Cheque_Bank_Name_Drp , String Cheque_Bank_Branch , String Cheque_Amount ,
			String Credit_Card_No , String Credit_Type_Drp , String Credit_Bank_Drp , String Credit_Transaction_Id , String Credit_Amount , String Debit_Card_No ,
			String Debit_Type_Drp , String Debit_Bank_Drp , String Debit_Transaction_Id , String Debit_Amount , String NEFT_Transaction_Id , String Enter_NEFT_Date ,
			String NEFT_Bank_Drp , String NEFT_Bank_Branch , String NEFT_Amount , String Other_Mode_Of_Payment_Drp , String Other_Transaction_Id , String Other_RRN_Number ,
			String Other_Remarks , String Other_Amount) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Deposit By Other Test", "Deposit IN Other Mode Of Payment Functionality In Ip Billing");

		IP_Deposit_Refund.ClickOnDepositOtherPaymentRadionInformation("Click On Deposit Other Mode Of Payment Radio Btn", 
				Other_Mode_Of_Payment_Drp , Other_Transaction_Id , Other_RRN_Number , Other_Remarks , Other_Amount);

		IP_Deposit_Refund.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");

		//IP_Deposit_Refund.ClickOnOtherPaymentTakePaymentBtn("Click On Take Payment Btn In Other Mode Of Payment Btn"); //Not working btn
		Thread.sleep(2000);
	}

	//============================Refund Excel Sheet 2===============================

	@DataProvider(name = "IpRefundDataProvider")
	public Object[][] getIPRefundData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_02 " + sheetName_IPRefund + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_IPRefund);
	}

	@Test(dataProvider = "IpRefundDataProvider", priority = 8 , enabled = true)

	public void IpRefundInCashTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet ,
			String Refund_Amount_Excel , String Payable_Name_Excel , String Refund_Remarks_Excel , String Received_From , String Refund_Cheque_Number ,
			String Refund_Cheque_Date , String Refund_Cheque_Bank_Name_Drp , String Refund_Cheque_Bank_Branch , String Refund_Cheque_Amount ,String Refund_Credit_Card_No ,
			String Refund_Credit_Type_Drp , String Refund_Credit_Bank_Drp , String Refund_Credit_Batch_No , String Refund_Credit_Amount , String Account_No ,
			String Account_Holder_Name , String Account_Type , String Bank_Name_Drp , String Branch_Name , String IFSC_Code , String Processing_Finance_NEFT_Amount ,
			String NEFT_Processed_Transaction_No , String Trans_Date_Enter , String NEFT_Processed_Bank_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_NEFT_Amount ,
			String Refund_Other_Mode_Of_Payment_Drp , String Refund_Other_Transaction_Id , String Refund_Other_RRN_Number , String Refund_Other_Amount)	
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Refund By Cash Test", "Refund In Cash Functionality In Ip Billing");
		/*
		IP_Deposit_Refund.SelectByFacilityDrp(Dashborad_Facility_Drp);
		IP_Deposit_Refund.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		IP_Deposit_Refund.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		IP_Deposit_Refund.DepositAndRefundPage("Click On Ip Deposit Refund Tab","Ip Deposit Refund Page");
		IP_Deposit_Refund.ClickOnIpDepositIcon("Click On Ip Deposit Icon");
		IP_Deposit_Refund.EnterIpNumber(Enter_IP_Number_Excel_Sheet);
		 */
		IP_Deposit_Refund.ClickOnIpRefundPage("Click On Refund Tab Page");
		IP_Deposit_Refund.GetDepositRefundTableData("Get The Data From Deposit Refund Table");

		IP_Deposit_Refund.ClickOnRefundCashRadioBtn("Click On Refund Cash Radio Btn");
		IP_Deposit_Refund.EnterRefundAmountAndDetails(Refund_Amount_Excel ,Payable_Name_Excel , Refund_Remarks_Excel);

		IP_Deposit_Refund.ClickOnRefundEditBtnAndEnterReceivedFrom("Click On Edit Btn", Received_From);
		IP_Deposit_Refund.ClickOnRefundSaveBtn("Click On Save Btn In Ip Refund " ,"Verify Ip Refund Save Successfully");

	}

	@Test(dataProvider = "IpRefundDataProvider", priority = 9 , enabled = true)	
	public void IpRefundInChequeTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet ,
			String Refund_Amount_Excel , String Payable_Name_Excel , String Refund_Remarks_Excel , String Received_From , String Refund_Cheque_Number ,
			String Refund_Cheque_Date , String Refund_Cheque_Bank_Name_Drp , String Refund_Cheque_Bank_Branch , String Refund_Cheque_Amount ,String Refund_Credit_Card_No ,
			String Refund_Credit_Type_Drp , String Refund_Credit_Bank_Drp , String Refund_Credit_Batch_No , String Refund_Credit_Amount , String Account_No ,
			String Account_Holder_Name , String Account_Type , String Bank_Name_Drp , String Branch_Name , String IFSC_Code , String Processing_Finance_NEFT_Amount ,
			String NEFT_Processed_Transaction_No , String Trans_Date_Enter , String NEFT_Processed_Bank_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_NEFT_Amount ,
			String Refund_Other_Mode_Of_Payment_Drp , String Refund_Other_Transaction_Id , String Refund_Other_RRN_Number , String Refund_Other_Amount)
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Refund By Cheque Test", "Refund In Cheque Functionality In Ip Billing");

		IP_Deposit_Refund.GetDepositRefundTableData("Get The Data From Deposit Refund Table");
		IP_Deposit_Refund.ClickOnRefundChequeRadionInformation("Click On Refund Cheque Radio Btn", Refund_Cheque_Number ,"Click On Cheque Box in Issue Date",
				Refund_Cheque_Date , Refund_Cheque_Bank_Name_Drp , Refund_Cheque_Bank_Branch, Refund_Cheque_Amount);

		IP_Deposit_Refund.ClickOnRefundSaveBtn("Click On Save Btn In Ip Refund " ,"Verify Ip Refund Save Successfully");

	}

	@Test(dataProvider = "IpRefundDataProvider", priority = 10 , enabled = true)
	public void IpRefundInCreditCardest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet ,
			String Refund_Amount_Excel , String Payable_Name_Excel , String Refund_Remarks_Excel , String Received_From , String Refund_Cheque_Number ,
			String Refund_Cheque_Date , String Refund_Cheque_Bank_Name_Drp , String Refund_Cheque_Bank_Branch , String Refund_Cheque_Amount ,String Refund_Credit_Card_No ,
			String Refund_Credit_Type_Drp , String Refund_Credit_Bank_Drp , String Refund_Credit_Batch_No , String Refund_Credit_Amount , String Account_No ,
			String Account_Holder_Name , String Account_Type , String Bank_Name_Drp , String Branch_Name , String IFSC_Code , String Processing_Finance_NEFT_Amount ,
			String NEFT_Processed_Transaction_No , String Trans_Date_Enter , String NEFT_Processed_Bank_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_NEFT_Amount ,
			String Refund_Other_Mode_Of_Payment_Drp , String Refund_Other_Transaction_Id , String Refund_Other_RRN_Number , String Refund_Other_Amount)
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Refund By Credit Card Test", "Refund IN Credit Card Functionality In Ip Billing");

		IP_Deposit_Refund.GetDepositRefundTableData("Get The Data From Deposit Refund Table");
		IP_Deposit_Refund.ClickOnRefundCreditCardRadionInformation("Click On Refund Credit Card Radio Btn", Refund_Credit_Card_No , Refund_Credit_Type_Drp,
				Refund_Credit_Bank_Drp , Refund_Credit_Batch_No , Refund_Credit_Amount);

		IP_Deposit_Refund.ClickOnRefundSaveBtn("Click On Save Btn In Ip Refund " ,"Verify Ip Refund Save Successfully");
	}

	@Test(dataProvider = "IpRefundDataProvider", priority = 11 , enabled = true)
	public void IpRefundInNEFTRTGSTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet ,
			String Refund_Amount_Excel , String Payable_Name_Excel , String Refund_Remarks_Excel , String Received_From , String Refund_Cheque_Number ,
			String Refund_Cheque_Date , String Refund_Cheque_Bank_Name_Drp , String Refund_Cheque_Bank_Branch , String Refund_Cheque_Amount ,String Refund_Credit_Card_No ,
			String Refund_Credit_Type_Drp , String Refund_Credit_Bank_Drp , String Refund_Credit_Batch_No , String Refund_Credit_Amount , String Account_No ,
			String Account_Holder_Name , String Account_Type , String Bank_Name_Drp , String Branch_Name , String IFSC_Code , String Processing_Finance_NEFT_Amount ,
			String NEFT_Processed_Transaction_No , String Trans_Date_Enter , String NEFT_Processed_Bank_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_NEFT_Amount ,
			String Refund_Other_Mode_Of_Payment_Drp , String Refund_Other_Transaction_Id , String Refund_Other_RRN_Number , String Refund_Other_Amount)
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Refund By NEFT Test", "Refund IN NEFT Functionality In Ip Billing");

		IP_Deposit_Refund.GetDepositRefundTableData("Get The Data From Deposit Refund Table");
		IP_Deposit_Refund.ClickOnRefundNEFTAndProcessing_FinanceRadionInformation("Click On Refund NEFT Radio Btn", "Click On Processing Finance Radio Btn" ,
				Account_No , Account_Holder_Name , Account_Type , Bank_Name_Drp , Branch_Name , IFSC_Code , Processing_Finance_NEFT_Amount );

		IP_Deposit_Refund.ClickOnRefundSaveBtn("Click On Save Btn In Ip Refund " ,"Verify Ip Refund Save Successfully");

	}
	@Test(dataProvider = "IpRefundDataProvider", priority = 12 , enabled = true)
	public void IpRefundInNEFTRTGSAlreadyProcessedTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet ,
			String Refund_Amount_Excel , String Payable_Name_Excel , String Refund_Remarks_Excel , String Received_From , String Refund_Cheque_Number ,
			String Refund_Cheque_Date , String Refund_Cheque_Bank_Name_Drp , String Refund_Cheque_Bank_Branch , String Refund_Cheque_Amount ,String Refund_Credit_Card_No ,
			String Refund_Credit_Type_Drp , String Refund_Credit_Bank_Drp , String Refund_Credit_Batch_No , String Refund_Credit_Amount , String Account_No ,
			String Account_Holder_Name , String Account_Type , String Bank_Name_Drp , String Branch_Name , String IFSC_Code , String Processing_Finance_NEFT_Amount ,
			String NEFT_Processed_Transaction_No , String Trans_Date_Enter , String NEFT_Processed_Bank_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_NEFT_Amount ,
			String Refund_Other_Mode_Of_Payment_Drp , String Refund_Other_Transaction_Id , String Refund_Other_RRN_Number , String Refund_Other_Amount)

					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Refund Test", "Refund IN NEFT Functionality In Ip Billing With Already Processed Finance");

		IP_Deposit_Refund.GetDepositRefundTableData("Get The Data From Deposit Refund Table");
		IP_Deposit_Refund.ClickOnRefundNEFTAlreadyProcessedRadionInformation("Click On Refund NEFT Radio Btn", "Click On Already Processed Radio Btn" ,
				NEFT_Processed_Transaction_No , "Trans_Date_Chkk_Box", Trans_Date_Enter , NEFT_Processed_Bank_Name_Drp , NEFT_Processed_Branch_Name , NEFT_Processed_NEFT_Amount );


		IP_Deposit_Refund.ClickOnRefundSaveBtn("Click On Save Btn In Ip Refund " ,"Verify Ip Refund Save Successfully");
	}

	@Test(dataProvider = "IpRefundDataProvider", priority = 13 , enabled = true)
	public void IpRefundInOtherModeOfPaymentTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number_Excel_Sheet ,
			String Refund_Amount_Excel , String Payable_Name_Excel , String Refund_Remarks_Excel , String Received_From , String Refund_Cheque_Number ,
			String Refund_Cheque_Date , String Refund_Cheque_Bank_Name_Drp , String Refund_Cheque_Bank_Branch , String Refund_Cheque_Amount ,String Refund_Credit_Card_No ,
			String Refund_Credit_Type_Drp , String Refund_Credit_Bank_Drp , String Refund_Credit_Batch_No , String Refund_Credit_Amount , String Account_No ,
			String Account_Holder_Name , String Account_Type , String Bank_Name_Drp , String Branch_Name , String IFSC_Code , String Processing_Finance_NEFT_Amount ,
			String NEFT_Processed_Transaction_No , String Trans_Date_Enter , String NEFT_Processed_Bank_Name_Drp , String NEFT_Processed_Branch_Name , String NEFT_Processed_NEFT_Amount ,
			String Refund_Other_Mode_Of_Payment_Drp , String Refund_Other_Transaction_Id , String Refund_Other_RRN_Number , String Refund_Other_Amount)
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Refund By OtherTest", "Refund IN Other Mode Of Payment Functionality In Ip Billing");

		IP_Deposit_Refund.GetDepositRefundTableData("Get The Data From Deposit Refund Table");
		IP_Deposit_Refund.ClickOnRefundOtherPaymentRadionInformation("Click On Refund Other Mode Of Payment Radio Btn", Refund_Other_Mode_Of_Payment_Drp , 
				Refund_Other_Transaction_Id , Refund_Other_RRN_Number , Refund_Other_Amount);

		IP_Deposit_Refund.ClickOnRefundSaveBtn("Click On Save Btn In Ip Refund " ,"Verify Ip Refund Save Successfully");

		Thread.sleep(2000);
		driver.navigate().refresh();
	}


	//============================Deposit Refund Recept Excel Sheet 3===============================

	@DataProvider(name = "IpReceiptUtilityDataProvider")
	
	public Object[][] getReceiptData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_03 " + sheetName_Receipt + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Receipt);
	}
	@Test(dataProvider = "IpReceiptUtilityDataProvider", priority = 14 , enabled = true)
	public void IpDepositRefundReceptTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Receipt_Ip_Number_Excel_Sheet , 
			String Receipt_Recept_Number_Excel_Sheet , String Receipt_Frome_Date , String Receipt_To_Date)
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Deposit Refund Recept Test", "Verify The Recept After Ip Deposit And Refund");
   /*
		IP_Deposit_Refund.SelectByFacilityDrp(Dashborad_Facility_Drp);
		IP_Deposit_Refund.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		IP_Deposit_Refund.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		IP_Deposit_Refund.DepositAndRefundPage("Click On Ip Deposit Refund Tab","Ip Deposit Refund Page");
	*/	
		IP_Deposit_Refund.ClickOnReceiptUtility("Click On Receipt Utility Tab");
		//IP_Deposit_Refund.EnterReceptIpNumber(Receipt_Ip_Number_Excel_Sheet);
		IP_Deposit_Refund.EnterReceptNumberAndPrint(Receipt_Recept_Number_Excel_Sheet ,"Click On Print Icon In Recept Number Table");
		Thread.sleep(800);
	}
	@Test(dataProvider = "IpReceiptUtilityDataProvider", priority = 15 , enabled = true)
	public void IpDepositRefundReceptDateWiseTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Receipt_Ip_Number_Excel_Sheet , 
			String Receipt_Recept_Number_Excel_Sheet , String Receipt_Frome_Date , String Receipt_To_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Ip Deposit Refund Recept Date Wise Test", "Verify The Recept After Ip Deposit And Refund Date Wise");
		
		IP_Deposit_Refund.ClickOnReceptPopRefreshIcon("Click On Refresh Icon In Recept Utility Popup");
		IP_Deposit_Refund.CheckBoxRangeDateReceptFromAndToDate("Check Box Range Date In Recept Utility Popup" ,Receipt_Frome_Date , Receipt_To_Date);
		IP_Deposit_Refund.ClickOnSearchBtnInReceiptUtility("Click On Search Btn In Recept Utility Popup");
		
		IP_Deposit_Refund.clickFirstPinkRowPrint("Pink Print Icon In First Row Of Recept Utility Table");
		driver.navigate().refresh();
		IP_Deposit_Refund.ClickOnHISLogo("Click On HIS Logo To Navigate On Dashboard");
		
	}
	
	//===============================OP Deposit In front Office ===========================
	
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_04: " + sheetName_OP_IpTransfer +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_OP_IpTransfer);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 16 , enabled = true)
	public void FrontOfficeOPDepositTest(String Facility_Drp , String Station_Drp , String Enter_Deposite_UHID , String Enter_Deposit_Amount , 
			String Deposit_Remarks_ext , String Relationship_drp , String deposit_Type_drp, String Ip_Billing_Station_Drp , String Op_Deposit_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Front Office OP Deposit Test", "Verify OP Deposit Functionality In Front Office");
		
		Fo_Deposits.selectByFacilityDropdwon(Facility_Drp);
		Fo_Deposits.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		Fo_Deposits.clickOnDepositeButton("Billing", "Deposits Page");

		Fo_Deposits.enterUhidInDepositePage(Enter_Deposite_UHID);
		Fo_Deposits.enterAmountInDepositeAndRemarks(Enter_Deposit_Amount, Deposit_Remarks_ext);
		
		Fo_Deposits.ClickPaymentModeCash("Click On Cash Deposit Radio Button");
		Fo_Deposits.clickOnSaveBtn("Click Save Deposit Button" , "Yes Confirm Popup for Deposit Save");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Fo_Deposits.clickOnHisLogo("Click On HIS Logo To Navigate On Dashboard");
		
	}
	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 17 , enabled = true)
	public void IpDepositRefundToOpDDepositsTest(String Facility_Drp , String Station_Drp , String Enter_Deposite_UHID , String Enter_Deposit_Amount , 
			String Deposit_Remarks_ext , String Relationship_drp , String deposit_Type_drp, String Ip_Billing_Station_Drp , String Op_Deposit_Amount ) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Ip Deposit Refund To Op Deposits Test", "Verify The Ip Deposit Refund To Op Deposit Functionality In Front Office");
		
		driver.navigate().refresh();
		IP_Deposit_Refund.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		IP_Deposit_Refund.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		IP_Deposit_Refund.DepositAndRefundPage("Click On Ip Deposit Refund Tab","Ip Deposit Refund Page");
		IP_Deposit_Refund.ClickOnOpDeposit("Click On Op Deposit Icon");
		
		IP_Deposit_Refund.EnterUhid(Enter_Deposite_UHID);
		
		IP_Deposit_Refund.SelectOnOpDepositTransferCheckBox("Select OP Deposit Transfer Check Box");	
		IP_Deposit_Refund.EnterOpDepositTransferringAmount( Op_Deposit_Amount);
		
		IP_Deposit_Refund.ClickOnSaveOpDepositYesyPop("Click On Save Button In Op Deposit Transfer" , "Yes Popup For Op Deposit Transfer");
		
	}	
	
	
	
	
	

	
	
		

}
