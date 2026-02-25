/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.ChequeInHandPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 23-Feb-2026
 */
public class TC_011_ChequeInHandTest extends ChequeInHandPage {
	
	ChequeInHandPage Cheque_In_Hand = new ChequeInHandPage();
	
	private final String sheetName = "IP_Cheque_In_Hand";

	@DataProvider(name = "ChequeInHanDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_01: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ChequeInHanDataProvider", priority = 1 , enabled = true)
	public void ChequeInHandInDischargePatient(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Patient_Search_From_Date , 
			String Patient_Search_To_Date , String Cheque_Amount_Text , String Cheque_Number_Text , String Cheque_Date_Text , 
			String Bank_Name_DropDwon , String Bank_Branch_Text , String Cheque_Remarks_Text , String Enter_UHID , String Enter_IP_Number) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_011_Cheque In Hand Test", "Verify Cheque In Hand  Page");
		
		Cheque_In_Hand.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Cheque_In_Hand.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Cheque_In_Hand.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Cheque_In_Hand.ClickOnChequeInHand("Click On Cheque In Hand New Tab");
		Cheque_In_Hand.FindPatientInSearchIcon("Click On Find Patient In Search Icon");
		
		Cheque_In_Hand.DischargedPatientRadioBtn("Click On Discharged Patient Radio Button");
		Cheque_In_Hand.AdmissionDischargeCheckBox("Click On Admission Discharge Check Box");
		Cheque_In_Hand.PatientSearchFromAndToDate(Patient_Search_From_Date , Patient_Search_To_Date);
		
		Cheque_In_Hand.ClickOnSearchIconPop("Click On Search Icon Pop Up");
		Cheque_In_Hand.ClickOnDischargePatientTable("Click On Discharge Patient Table");
		
		String actualMessage = Cheque_In_Hand.getGritterMessage();
		Assert.assertEquals(actualMessage, "Patient has been discharged.", "Gritter popup message mismatch");
		Thread.sleep(8000);
		Cheque_In_Hand.ClickOnRefreshIcon("Click On Refresh Icon");
		
	}
	@Test(dataProvider = "ChequeInHanDataProvider", priority = 2 , enabled = true)
	public void ChequeInHandInCurrentPatient(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Patient_Search_From_Date , 
			String Patient_Search_To_Date , String Cheque_Amount_Text , String Cheque_Number_Text , String Cheque_Date_Text , 
			String Bank_Name_DropDwon , String Bank_Branch_Text , String Cheque_Remarks_Text , String Enter_UHID , String Enter_IP_Number) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_011_Cheque In Hand Current Patient", "Current Patent Test Funcility");
		
		Cheque_In_Hand.FindPatientInSearchIcon("Click On Find Patient In Search Icon");
		Cheque_In_Hand.ClickOnCurrentPatientRadioBtn("Click On Current Patient Radio Button");
		Cheque_In_Hand.AdmissionDischargeCheckBox("Click On Admission Discharge Check Box");
		Cheque_In_Hand.PatientSearchFromAndToDate(Patient_Search_From_Date , Patient_Search_To_Date);
		
		Cheque_In_Hand.ClickOnCurrentPatientRadioBtn("Click On Current Patient Radio Button");
		Cheque_In_Hand.ClickOnSearchIconPop("Click On Search Icon Pop Up");
		Cheque_In_Hand.ClickOnCurrentInPatientTable("Click On Current In Patient Table");
		
		Cheque_In_Hand.ChequeInHandAmount(Cheque_Amount_Text , Cheque_Number_Text + CommanUtill.randomAlphabets(3));
		Cheque_In_Hand.DateCheckBoxAndDateEnter("Click On Date Check Box" , Cheque_Date_Text);
		Cheque_In_Hand.BankNameAndBranch(Bank_Name_DropDwon , Bank_Branch_Text);
		Cheque_In_Hand.ChequeInHandRemarks(Cheque_Remarks_Text );
		 
		Cheque_In_Hand.ClickOnChequeInHandSaveBtn("Click On Cheque In Hand Save Button" ,"Save Yes Popup");
		Thread.sleep(2000);
		Cheque_In_Hand.ClickOnVerifyAndClickOnPlushIconInTable("Click on Table Add On Deposit plush Icon");
		Thread.sleep(2000);	
	}
	@Test(priority = 3 , enabled = true)
	public void IPDepositRefundChequeSaveTest() throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_011_Cheque In Hand Save Btn", "Cheque Save Test Funcility");
		
		Cheque_In_Hand.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");
		Thread.sleep(800);
		Cheque_In_Hand.PreviousWindow("Origan Window Tab");
		driver.navigate().refresh();

	}
	@Test(dataProvider = "ChequeInHanDataProvider", priority = 4 , enabled = true)
	public void ChequeInHandSaveAndDeleteIcon(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Patient_Search_From_Date , 
			String Patient_Search_To_Date , String Cheque_Amount_Text , String Cheque_Number_Text , String Cheque_Date_Text , 
			String Bank_Name_DropDwon , String Bank_Branch_Text , String Cheque_Remarks_Text , String Enter_UHID , String Enter_IP_Number) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_011_Cheque In Hand Delete", "Cheque In Hand Delete Test Funcility");
		
		Cheque_In_Hand.FindPatientInSearchIcon("Click On Find Patient In Search Icon");
		Cheque_In_Hand.ClickOnCurrentPatientRadioBtn("Click On Current Patient Radio Button");
		Cheque_In_Hand.AdmissionDischargeCheckBox("Click On Admission Discharge Check Box");
		Cheque_In_Hand.PatientSearchFromAndToDate(Patient_Search_From_Date , Patient_Search_To_Date);
		
		Cheque_In_Hand.ClickOnCurrentPatientRadioBtn("Click On Current Patient Radio Button");
		Cheque_In_Hand.ClickOnSearchIconPop("Click On Search Icon Pop Up");
		Cheque_In_Hand.ClickOnCurrentInPatientTable("Click On Current In Patient Table");
		
		Cheque_In_Hand.ChequeInHandAmount(Cheque_Amount_Text , Cheque_Number_Text + CommanUtill.randomAlphabets(3));
		Cheque_In_Hand.DateCheckBoxAndDateEnter("Click On Date Check Box" , Cheque_Date_Text);
		Cheque_In_Hand.BankNameAndBranch(Bank_Name_DropDwon , Bank_Branch_Text);
		Cheque_In_Hand.ChequeInHandRemarks(Cheque_Remarks_Text );
		 
		Cheque_In_Hand.ClickOnChequeInHandSaveBtn("Click On Cheque In Hand Save Button" ,"Save Yes Popup");
		Thread.sleep(2000);
		Cheque_In_Hand.ClickOnVerifyAndClickOnDeleteIconInTable("Click on Table Delete Icon");
		Cheque_In_Hand.DeleteChequeInHandYesPop("Cancel cheque In Hand");
		Thread.sleep(1000);
		driver.navigate().refresh();

	}
	
	@Test(dataProvider = "ChequeInHanDataProvider", priority = 4 , enabled = true)
	public void EnterUHID_IPNumber_ChequeInHand_Deposit(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Patient_Search_From_Date , 
			String Patient_Search_To_Date , String Cheque_Amount_Text , String Cheque_Number_Text , String Cheque_Date_Text , 
			String Bank_Name_DropDwon , String Bank_Branch_Text , String Cheque_Remarks_Text , String Enter_UHID , String Enter_IP_Number) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_011 Enter IP And UHID Cheque In Hand Save And Deposit ", "Verify Cheque In Hand  Page");
		
		//Cheque_In_Hand.SelectByFacilityDrp(Dashborad_Facility_Drp);
		//Cheque_In_Hand.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		//Cheque_In_Hand.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		//Cheque_In_Hand.ClickOnChequeInHand("Click On Cheque In Hand New Tab");
		
		//Cheque_In_Hand.EnterUHIDInChequeInHand(Enter_UHID);
		Cheque_In_Hand.EnterIPNumberChequeInHand(Enter_IP_Number);
		
		Cheque_In_Hand.ChequeInHandAmount(Cheque_Amount_Text , Cheque_Number_Text + CommanUtill.randomAlphabets(3));
		Cheque_In_Hand.DateCheckBoxAndDateEnter("Click On Date Check Box" , Cheque_Date_Text);
		Cheque_In_Hand.BankNameAndBranch(Bank_Name_DropDwon , Bank_Branch_Text);
		Cheque_In_Hand.ChequeInHandRemarks(Cheque_Remarks_Text );
		 
		Cheque_In_Hand.ClickOnChequeInHandSaveBtn("Click On Cheque In Hand Save Button" ,"Save Yes Popup");
		Thread.sleep(2000);
		Cheque_In_Hand.ClickOnVerifyAndClickOnPlushIconInTable("Click on Table Add On Deposit plush Icon");
		Thread.sleep(2000);	
		Cheque_In_Hand.ClickOnSaveBtnAndYesDuplicatePop("Click On Save Btn In Ip Deposit" ,"Deposit Yes POP" ,"Duplicate Yes Popup In Ip Deposit");
		Thread.sleep(800);
		
		
		
	}
	
}
