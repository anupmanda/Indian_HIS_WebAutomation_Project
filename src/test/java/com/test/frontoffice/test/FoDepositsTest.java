/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FoDepositsPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 23-Feb-2026
 */
public class FoDepositsTest extends FoDepositsPage {
	
	FoDepositsPage Fo_Deposits = new FoDepositsPage();
	
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
		Fo_Deposits.selectByFacilityDropdwon(Facility_Drp);
		Fo_Deposits.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		Fo_Deposits.clickOnDepositeButton("Billing", "Deposits Page");

		Fo_Deposits.enterUhidInDepositePage(Enter_Deposite_UHID);
		//Fo_Deposits.enterCardNoInDepositePage(Enter_Deposite_CardNo);

		Fo_Deposits.enterAmountInDepositeAndRemarks(Enter_Deposit_Amount, Deposit_Remarks_ext);
		Fo_Deposits.clickOnEditBtnAndSaveReceivedFrom("Click Edit Button", Received_From_After_Edit);

		Fo_Deposits.selectRelationshipAndDepositeType(Relationship_drp, deposit_Type_drp);
		//Fo_Deposits.CheckBoxOnHomeCare("Home Care CheckBox");
		Fo_Deposits.WalletTreeCardRecharge("Wallet Tree Card Recharge");
		Fo_Deposits.ClickPaymentModeCash("Click On Cash Deposit Radio Button");

		/*
		Fo_Deposits.selectPaymentModeCheque("Cheque Deposit Radio Btn", Cheque_Number, Cheque_Issue_Date, 
				Cheque_Bank_Name_Drp, Cheque_Branch_Name);

		Fo_Deposits.selectPaymentModeCredit("Credit Deposit Radio Btn" , Credit_card_no, Credit_card_type_drp, Credit_bank_name_Drp, 
				Credit_Transaction_id, Credit_other_details ,"Take Payment Credit Card Btn" );
		 */
		Fo_Deposits.clickOnSaveBtn("Click Save Deposit Button" , "Yes Confirm Popup for Deposit Save");
		Thread.sleep(2000);
		
	}

}
