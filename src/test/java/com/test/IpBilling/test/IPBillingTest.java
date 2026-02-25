/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.IpBillingPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 09-Feb-2026
 */
public class IPBillingTest extends IpBillingPage {

	IpBillingPage Ip_Billing = new IpBillingPage();

	private final String sheetName_IpBill = "Ip_Billing_Page";

	@DataProvider(name = "IpBilingDataProvider")
	public Object[][] getBillingData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_IpBill + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_IpBill);
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 1 , enabled = false)
	public void IpBillingTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient , String Enter_UHID , String Enter_UHID_All_Clearance ,
			String Enter_IP_Number_All_Clearance , String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Billing Test", "Ip Biling Find Patient");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.FindPatient_SeachIcon("Click On Serach Icon Find Patient");
		Ip_Billing.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");

		//Date Wise Other Serach Hidden

		Ip_Billing.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		Ip_Billing.AdmissionDischarge_FromDateSerach(From_Date);
		Ip_Billing.AdmissionDischarge_ToDateSerach(To_Date);

		//Ip_Billing.SerachMobileNumber(Mobile_no_Current_In_Patient , "Serach In Mobile NO Patient");
		//Ip_Billing.EnterNameAndSerchicon(Name_Current_In_Patient , "Serach In Name Patient");
		Ip_Billing.EnterUHIDAndSearchIcon(Enter_UHID , "Search UHID ");

		Ip_Billing.SerachAndselectPatientInTable("Pick Table In Current In Patient ");
		Thread.sleep(1000);
		driver.navigate().refresh();

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 2 , enabled = false)
	public void DischargedPatientsIpBilling(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient , String Enter_UHID , String Enter_UHID_All_Clearance ,
			String Enter_IP_Number_All_Clearance , String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Discharged Patients ", "Ip Billing Patient");

		Ip_Billing.FindPatient_SeachIcon("Click On Serach Icon Find Patient");

		Ip_Billing.RadioBtnDischargedPatients("Radio Button Discharged Patients");
		Ip_Billing.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		Ip_Billing.AdmissionDischarge_FromDateSerach(From_Date);
		Ip_Billing.AdmissionDischarge_ToDateSerach(To_Date);

		Ip_Billing.SerachDischargedPatient("Click On Serch Icon");
		Ip_Billing.PickDischargePatientTable("Pick on Table discharge patient");
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 3 , enabled = true)
	public void EnterUHIdAndIPumber(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Name_Current_In_Patient , String Enter_UHID , String Enter_UHID_All_Clearance ,
			String Enter_IP_Number_All_Clearance , String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks ,
			String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number , String Auth_Claim_no , 
			String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , String Letter_Date , 
			String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day , String Account_Number , 
			String IFSC_Code , String Bank_Branch , String PAN_No , String Scheme_Drp , String Corporate_Company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount , String Credit_Limit , String Employee_Code ,String Employee_Relation , String Issued_By , String Surgery_From_Date ,
			String Surgery_To_Date, String Bill_Genrate_Reason_Text , String Bill_Settlement_Reason_Text , String Bill_Settlement_Remarks , 
			String Received_From_Bill_Settl , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Branch ,
			String Cheque_Amount , String Cheque_Authorised_By_Drp , String Bill_Amount , String Due_Authorised_By_Drp , String Due_Remarks ,
			String Cancel_Bill_Settl_Authorised , String Cancel_Bill_Settl_Remaks) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Enter Uhid Current Patient ", "Ip Billing Patient");


		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		//Ip_Billing.EnterUHIDInAllClearancePatient(Enter_UHID_All_Clearance);
		//Ip_Billing.EnterIpNumberInAllClearancePatient(Enter_IP_Number_All_Clearance);
		Ip_Billing.EnterIpNumberInAllClearancePatient("29402");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");
		/*	
//1 Discharge Icon		
		Ip_Billing.ClickOnDischargeIconBtn("Click On Discharge Icon");
		Ip_Billing.SelectByDischargeReason_DischargeSubTypeDrp(Discharge_Reason_Drp , Discharge_Sub_Type_Drp);
		Ip_Billing.EnterDischargeRemarks(Discharge_Remarks);

		Ip_Billing.enterCurrentDischargeDateTime();     //Current Date And Time 
		Ip_Billing.saveDischargeAndYesPop("Click On Save Discharge Reason Pop" , "Yes Pop");
		Ip_Billing.OkPatientDischargedSuccessfullyPop("Patient Discharged Successfully Ok Pop");
		Thread.sleep(800);
	/*		
	//2. Update Financial Details 
		Ip_Billing.EditFinancialDetailModificationIcon("Click On Edite Financial Details");
		Ip_Billing.UpdateFinancialDetailModificationIcon("Click On Update Financial Details Icon");
		Ip_Billing.CompanyInsuranceRadioBtn("Click On Company Insurance Radio Btn");

		Ip_Billing.CompanyType_Company_RatecontractDrp(Company_type_Drp , Company_Drp , Rate_contract_Drp);
		Ip_Billing.EnterPolicyNo_AuthClaimText(Policy_Number , Auth_Claim_no);
		Ip_Billing.EnterStandardDeductible(Standard_Deductible);

		Ip_Billing.StandardCo_PayDrpAndCo_Pay(Standard_Co_pay_Drp , Co_Pay_Text);
		Ip_Billing.LetterNumberLetterDateEmployeenumbeCertificatenumber(Letter_no , Letter_Date ,Employee_Number , Certificate_number);
		Ip_Billing.BedEntitlementAndPerDay(Bed_Entitlement , Per_Day);

		Ip_Billing.AccountInformationEnterAndSave(Account_Number , IFSC_Code , Bank_Branch , PAN_No , "Save Patient Bank Information");
		Thread.sleep(800);
		//Ip_Billing.SchemeCheckBoxAndDrp("Scheme Check Box" ,Scheme_Drp);
		//Ip_Billing.CorporateCompany_InsuranceCompanyDrp(Corporate_Company_Drp , Insurance_Company_Drp);

		Ip_Billing.AuthAmount_CreditLimit(Auth_Amount , Credit_Limit);
		Ip_Billing.EmployeeCode_EmployeeRelation_IssuedBy(Employee_Code , Employee_Relation , Issued_By);

		Ip_Billing.SaveFinancialDetailModificationBtn("Save Financial Details Btn");
		Thread.sleep(10000);
	*/	
	//3. Bill Details	
		Ip_Billing.BillDetailsIconAndClosePop("Click On Bill Details Icon" , "Close Bill Details Pop");
		Thread.sleep(2000);
	
	//4. Surgery Breakup Details
		Ip_Billing.ClickOnSurgeryBreakupDetails("Click On Surgery Breackup Icon");
		Ip_Billing.RadioSummaryBtn("Summary Radio Btn");

		Ip_Billing.CheckBoxDateSurgeryBreakAndFromDate("Surgery Date Check Box" , Surgery_From_Date);
		Ip_Billing.ToDateSurgeryBreak(Surgery_To_Date);
		Ip_Billing.PrintSurgeryDetails("Print Surgery Btn");
		Thread.sleep(3000);
		
	//5.Bill Ready 
		Ip_Billing.BillReadyIconAndYesPop("Bill Ready Icon" , "Yes Pop Patient’s total stay is less than 24 Hrs");
		Thread.sleep(1000);

	//6. Bill Genrate 

		Ip_Billing.BillGenrateIcon("Click On Bill Genrate Icon");
		Ip_Billing.BillGenrateReasonTxtAndYesBtn(Bill_Genrate_Reason_Text, "Bill genrate Reason Save Pop");
		Ip_Billing.YespopsureGeneratepatientAndDischargePop("Sure Patient Bill Genrate" , "Discharge Yes Pop");
		 	
//7.Bill Settlement
		Thread.sleep(2000);
		Ip_Billing.AfterDischargeOkPop("Discharge Patient Pop");   //Again Hit IP Number In Bill Genrate Patient

		Ip_Billing.ClickOnBillSettlementIcon("Click On Bill Settlement Btn");
		Ip_Billing.BillSettlementReasonAndSavePop(Bill_Settlement_Reason_Text , "Save Bill Settlemet pop");   //Pop Same time 
		
		Ip_Billing.BillSettlementReamrks(Bill_Settlement_Remarks);
		Ip_Billing.EditAndReceivedFrom("Click On Edit Button" , Received_From_Bill_Settl);

		//Ip_Billing.MOPInChequeInformation("Click On Cheque Btn" ,Cheque_Number , Cheque_Issue_Date , Cheque_Bank_Name_Drp ,Cheque_Branch ,
		//	Cheque_Amount , Cheque_Authorised_By_Drp );
		
		//New Test Case Due Amount
		Ip_Billing.BillDueAmount(Bill_Amount);
		Ip_Billing.ClickOnDueIcon_AuthorisedBy_Ramarks("Click On Due Btn" ,Due_Authorised_By_Drp , Due_Remarks);
		
		Ip_Billing.SaveBillSettlementBtn("Click on Bill Settlement Save Btn" , "Do you want to settle Yes Pop" ,"Ok Bill Settled Receipt");

		// 2. Cancel Bill Settlement
		//Ip_Billing.BillSettlementCancelInformation("Click On Cancel Bill Settle Btn", Cancel_Bill_Settl_Authorised , 
		//		Cancel_Bill_Settl_Remaks ,"Save Authorization Pop");


//8. Print Btn 
		Ip_Billing.PrintInSummaryDetails("Click On Print Btn" , "Check Box Summary Icon" , "Yes To Print");
	}
}
