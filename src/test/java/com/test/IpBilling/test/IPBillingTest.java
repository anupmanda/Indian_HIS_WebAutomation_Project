/**
 * 
 */
package com.test.IpBilling.test;
import java.io.IOException;
import javax.management.InvalidApplicationException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.IpBilling.Page.IpBillingPage;
import com.test.IpBilling.Page.PackageModifictionPatientPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 09-Feb-2026
 */
public class IPBillingTest extends IpBillingPage {

	IpBillingPage Ip_Billing = new IpBillingPage();
	PackageModifictionPatientPage Package_Modifiction_Patien = new PackageModifictionPatientPage();

	private final String sheetName_IpBill = "Ip_Billing_Page";

	@DataProvider(name = "IpBilingDataProvider")
	public Object[][] getBillingData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_IpBill + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_IpBill);
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 1 , enabled = false)
	public void CurrentInPatintIpBillingTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Current in Patint Search By Date", "Ip Biling Find Current Patient");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.FindPatient_SeachIcon("Click On Serach Icon Find Patient");
		Ip_Billing.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");

		//Date Wise Other Serach Current Patients

		Ip_Billing.CheckBoxAdmission_Discharge("Admission Discharge Check Box");
		Ip_Billing.AdmissionDischarge_FromDateSerach(From_Date);
		Ip_Billing.AdmissionDischarge_ToDateSerach(To_Date);
		Ip_Billing.SerachDischargedPatient("Click On Search Icon Find Patient Date Wise");
		Ip_Billing.SerachAndselectPatientInTable("Last Row Clicked In Table Current In Patient ");
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 2 , enabled = false)
	public void DischargedPatientsIpBilling(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Search Discharged Patients Date Wise", "Ip Billing Patient Page Funcility Test");

		Ip_Billing.FindPatient_SeachIcon("Click On Serach Icon Find Patient");

		//Date Wise Other Serach Discharged Patients
		Ip_Billing.RadioBtnDischargedPatients("Radio Button Discharged Patients");
		Ip_Billing.CheckBoxAdmission_Discharge("Admission Discharge Check Box");
		Ip_Billing.AdmissionDischarge_FromDateSerach(From_Date);
		Ip_Billing.AdmissionDischarge_ToDateSerach(To_Date);

		Ip_Billing.SerachDischargedPatient("Click On Serch Icon");
		Ip_Billing.SerachAndselectPatientInTable("Last Row Clicked In Table Current In Patient ");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 3 , enabled = false)
	public void SearchByNameIpBillingTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Ip Billing Test", "Ip Biling Find Patient");

		Ip_Billing.FindPatient_SeachIcon("Click On Serach Icon Find Patient");
		Ip_Billing.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");

		//First Name Wise Serach Current Patients
		Ip_Billing.EnterFirstNameCurrentPatint(Search_First_Name);
		Ip_Billing.SerachDischargedPatient("Click On Serch Icon");
		Ip_Billing.SerachAndselectPatientInTable1("Last Row Clicked In Table Current In Patient ");
		Thread.sleep(2000);
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 4 , enabled = false)
	public void EditFinancialDetails(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Ip Billing Edit Financial Details", "Edit Financial Details Test Funcility Test");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");
		Ip_Billing.EnterIpNumberInAllClearancePatient("29463");

		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		// Update Financial Details 
		Ip_Billing.EditFinancialDetailModificationIcon("Click On Edite Financial Details");

		//Document Check List patent Scheme Pop
		Ip_Billing.CloseDocumentCheckListPop("Close Document Check List Pop");
		Ip_Billing.CloseSchemeForPatientPop("Close Scheme For Patient");

		Ip_Billing.UpdateFinancialDetailModificationIcon("Click On Update Financial Details Icon");
		Ip_Billing.CompanyInsuranceRadioBtn("Click On Company Insurance Radio Btn");

		Ip_Billing.CompanyType_Company_RatecontractDrp(Company_type_Drp , Company_Drp , Rate_contract_Drp);
		//Document Check List patent Scheme Pop
		Ip_Billing.CloseDocumentCheckListPop("Close Document Check List Pop");
		Ip_Billing.CloseSchemeForPatientPop("Close Scheme For Patient");

		Ip_Billing.EnterPolicyNo_AuthClaimText(Policy_Number , Auth_Claim_no);
		Ip_Billing.EnterStandardDeductible(Standard_Deductible);

		//Ip_Billing.StandardCo_PayDrpAndCo_Pay(Standard_Co_pay_Drp , Co_Pay_Text);
		//Ip_Billing.LetterNumberLetterDateEmployeenumbeCertificatenumber(Letter_no , Letter_Date ,Employee_Number , Certificate_number);
		//Ip_Billing.BedEntitlementAndPerDay(Bed_Entitlement , Per_Day);

		Ip_Billing.AccountInformationEnterAndSave(Account_Number , IFSC_Code , Bank_Branch , PAN_No + CommanUtill.randomDigits(3) , 
				"Save Patient Bank Information");

		Ip_Billing.AuthAmount_CreditLimit(Auth_Amount , Credit_Limit);
		//Ip_Billing.EmployeeCode_EmployeeRelation_IssuedBy(Employee_Code , Employee_Relation , Issued_By);
		Ip_Billing.SaveFinancialDetailModificationBtn("Save Financial Details Btn");
		Ip_Billing.ReasonDifferentBillableTypesPop("As per Managment request" ,"Dr. Himanshu Sharma" ,"Anup" ,"Yes Billable Type Pop");

		Thread.sleep(2000);

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 5 , enabled = false)
	public void SchemeEditFinancialDetails(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Ip Billing Edit Financial Details And Scheme", "Scheme Test Funcility Test");

		Ip_Billing.EditFinancialDetailModificationIcon("Click On Edite Financial Details");
		//Document Check List patent Scheme Pop
		Ip_Billing.CloseDocumentCheckListPop("Close Document Check List Pop");
		Ip_Billing.CloseSchemeForPatientPop("Close Scheme For Patient");

		Ip_Billing.UpdateFinancialDetailModificationIcon("Click On Update Financial Details Icon");
		Ip_Billing.CompanyInsuranceRadioBtn("Click On Company Insurance Radio Btn");

		Ip_Billing.CompanyType_Company_RatecontractDrp(Company_type_Drp , Company_Drp , Rate_contract_Drp);
		//Document Check List patent Scheme Pop
		Ip_Billing.CloseDocumentCheckListPop("Close Document Check List Pop");
		Ip_Billing.CloseSchemeForPatientPop("Close Scheme For Patient");


		Ip_Billing.SchemeCheckBoxAndDrp("Scheme Check Box" ,Scheme_Drp);

		Ip_Billing.SaveFinancialDetailModificationBtn("Save Financial Details Btn");
		Thread.sleep(1000);
		Ip_Billing.ReasonDifferentBillableTypesPop("As per Managment request" ,"Dr. Himanshu Sharma" ,"Anup" ,"Yes Billable Type Pop");
		Thread.sleep(2000);
	}
	@Test(priority = 6 , enabled = false)
	public void CompanyDetailsThumbIcons()throws IOException , InvalidApplicationException, InterruptedException{

		logger = extent.createTest("Company Details Thumb Icon", "Patient Insurance Approval details Test Funcility");

		Ip_Billing.SelectByFacilityDrp("SANITY HOSPITAL");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,"IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");
		Ip_Billing.EnterIpNumberInAllClearancePatient("29629");

		Ip_Billing.DischargeOkPop("Ok Deposit pop");
		Ip_Billing.ClickOnCompanyDetailsIcon("Click On Thumb Icon Company Details");
		Ip_Billing.TablePatientInsuranceApprovalDetails("Print Patient Insurance Table" ,"60" ,"Deduct-first" ,"Approved Check Box");

		Ip_Billing.RadioBtnInCreditLimitAndEnterCreaditLimit("Radio Btn Credit Limit" ,"7");
		Ip_Billing.SavePatientInsuranceApprovalPop("Save Patient Insurance Approval Btn");

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 7 , enabled = false)
	public void UpdatePaymentModeFinancialDetails(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Update Payment Mode In Case", "Compant To Cash Funcility Test");

		Ip_Billing.EditFinancialDetailModificationIcon("Click On Edite Financial Details");
		//Document Check List patent Scheme Pop
		Ip_Billing.CloseDocumentCheckListPop("Close Document Check List Pop");
		Ip_Billing.CloseSchemeForPatientPop("Close Scheme For Patient");

		Ip_Billing.UpdateFinancialDetailModificationIcon("Click On Update Financial Details Icon");
		Ip_Billing.PaymentCashRadioBtn("Radio Btn Cash In Payment Pop");

		Ip_Billing.SaveFinancialDetailModificationBtn("Save Financial Details Btn");
		Thread.sleep(1000);
		Ip_Billing.ReasonDifferentBillableTypesPop("As per Managment request" ,"Dr. Himanshu Sharma" ,"Anup" ,"Yes Billable Type Pop");
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 8 , enabled = false)
	public void IpBillingDepositRefundDetails(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Ip Billing Deposit Refund Details", " Deposit Refund Details");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");
		Ip_Billing.EnterIpNumberInAllClearancePatient("29630");

		Ip_Billing.DischargeOkPop("Ok Deposit pop");
		Ip_Billing.ClickOnDepositRefundDetails("Click On Deposit Refund Btn" ," Deposit Radio Btn" ,"Receipt Radio Btn" ,
				"Refund Radio Btn" ,"Close Refund Deposit Pop");
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 9 , enabled = false)
	public void ClickOnBillDetails(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Ip Bill Details", " Bill Details Popup");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");
		Ip_Billing.EnterIpNumberInAllClearancePatient("29630");

		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		// Bill Details	
		Ip_Billing.BillDetailsIcon("Click On Bill Details Icon");
		Thread.sleep(2000);
		Ip_Billing.clickAllDisplayAndServiceRows("Bill Details Service");
		Ip_Billing.BillDetailsClosePop("Close Bill Details Pop");

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 10 , enabled = false)
	public void PackageBillDetailsTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Package Bill Details", "Package Bill Details Popup");

		//Package Bill Details	
		Ip_Billing.ClickOnPackageBillDetails("Click On Package Bill Details Icon");
		Thread.sleep(2000);
		Ip_Billing.CloseOnPackageBillDetails("Close Package Bill Details Pop");

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 11 , enabled = false)
	public void SurgeryBreakUpDetailsTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Surgery BreakUp Details Icon", "Surgery BreakUp Details Popup");

		//SurgeryBreakUpDetails	

		Ip_Billing.ClickOnSurgeryBreakupDetails("Click On Surgery Breackup Icon");
		Ip_Billing.RadioSummaryBtn("Summary Radio Btn");
		Ip_Billing.CheckBoxDateSurgeryBreakAndFromDate("Select date CheckBox", Surgery_From_Date);
		Ip_Billing.ToDateSurgeryBreak(Surgery_To_Date);
		Ip_Billing.PrintSurgeryDetails("Print Surgery Breakup Details Pop");

	}
	@Test(dataProvider = "IpBilingDataProvider", priority = 12 , enabled = false)
	public void PendingInvestigationTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Surgery BreakUp Details Icon", "Surgery BreakUp Details Popup");

		//Pending Investigation	

		Ip_Billing.ClickOnPendingInvestigationIcon("Click On Pending Investigation");
		Thread.sleep(5000);

	}

	//=========New Excel Sheeet ================================ 
	@Test(priority = 13 , enabled = true)
	public void DiscountType_OnTotalBillDiscountTest () 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Discount Type On Bill Withot Scheme", "On Total Bill Discount");

		//1. On Total Bill Discount
		Ip_Billing.SelectByFacilityDrp("SANITY HOSPITAL");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,"IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");
		
		Ip_Billing.EnterIpNumberInAllClearancePatient("29648");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");
		
		Ip_Billing.ClickOnDiscountIcon("Click On Discount Btn");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='90%'");
		
		Ip_Billing.CheckBoxScheme("Scheme Check Box Un_Select");  // if Select Chane To unSelect CheckBox
		Ip_Billing.RadioBtnDiscountInTotalBill_Amout("Click Radio Btn Total Bill Discount" , "5000" );
		IpBillingPage.getScreenShot(driver, "Total_Bill_Amount_discount");
		Ip_Billing.EnterDiscountOnTotalBillPercentage("50");
		IpBillingPage.getScreenShot(driver, "Total_Bill_Amount_Percentage");

		Ip_Billing.SelectByDiscountHeadDrp("Staff Discount" ,"Staff Discount");
		Ip_Billing.EnterDiscountRemarks("Anup Discount On Total Bill Amount Remarks");
		Ip_Billing.ClickCalcuateDiscountBtn("Click On Calculate Discount Btn");
		Ip_Billing.AlertTotalAppliedDiscountView("View Discount Value");
		Ip_Billing.SelectByAuthorisedByDrp("MOU Discount");

		//Ip_Billing.DeleteTotalBillDiscountInformaion("Click On Bill Discount Delet Btn","Delete Reason Text" ,"Delete Yes Pop");
		Ip_Billing.SaveDiscountOnBill("Save Discount On Total Bill Amount");
		
	}
	@Test(priority = 14 , enabled = true)
	public void CancelDiscountTest() throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Delete Previous Discount After New Discount", "Delete Funcility Test");
		
		Ip_Billing.ClickOnDiscountIcon("Click On Discount Btn");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='90%'");
		
		Ip_Billing.DeleteDiscountBtn("Click On Delete Discount Btn");
		Ip_Billing.ReasonAndYesDeleteDiscountPop("Delete After Save " , "Delate Discount Yes Pop");
			
	}

	@Test(priority = 15 , enabled = true)
	public void DiscountType_ServiceWiseDiscountTest () 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Discount Type On Service Wise Withot Scheme", "Discount On Service Wise");

		//2. Service Wise Discount
		Ip_Billing.ClickOnDiscountIcon("Click On Discount Btn");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='90%'");
		
		Ip_Billing.CheckBoxUnSelectScheme_ServiceWiseDiscount_RadioBtn("Scheme Un Seleck Check Box" ,"Select Service Wise Radio Btn");

		//Ip_Billing.serviceWiseDiscountValidation_1("10"); 
		//Ip_Billing.serviceWiseDiscountValidation_ByAmount("1000");
		Ip_Billing.serviceWiseDiscountValidation("PERCENT", "50");
		//Ip_Billing.serviceWiseDiscountValidation("AMOUNT", "500");

		Ip_Billing.SelectByDiscountHeadDrp("Staff Discount" ,"Staff Discount"); //Same Web Element 
		Ip_Billing.EnterDiscountRemarks("Anup Discount On Service Remarks");               //Same Web Element 
		Ip_Billing.ClickCalcuateDiscountBtn("Click On Calculate Discount Btn");   //Same Web Element 
		Ip_Billing.AlertTotalAppliedDiscountView("View Discount Value");    //Same Web Element 
		Ip_Billing.SelectByAuthorisedByDrp("MOU Discount");            //Same Web Element 
		//Delete May Be same 
		Ip_Billing.SaveDiscountOnBill("Save Discount On Service Wise");  //Same Web Element 
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 16 , enabled = true)
	public void CancelDiscountTest2() throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Delete Previous Discount After New Discount", "Delete Funcility Test");
		
		Ip_Billing.EnterIpNumberInAllClearancePatient("29648");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");
		
		Ip_Billing.ClickOnDiscountIcon("Click On Discount Btn");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='90%'");
		
		Ip_Billing.DeleteDiscountBtn("Click On Delete Discount Btn");
		Ip_Billing.ReasonAndYesDeleteDiscountPop("Delete After Save " , "Delate Discount Yes Pop");
			
	}

	@Test(priority = 17 , enabled = true)
	public void DiscountType_ItemWiseDiscountTest () 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Discount Type On Item Wise Withot Scheme", "Discount On Item Wise");

		//3. Item Wise Discount

		Ip_Billing.ClickOnDiscountIcon("Click On Discount Btn");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='90%'");
		Ip_Billing.CheckBoxUnSelectScheme_ItemWiseDiscount_RadioBtn("Scheme Un Seleck Check Box" ,"Select Item Wise Radio Btn");

		Thread.sleep(2000);
		Ip_Billing.SelectItemWiseDiscountSevviceDrp(3);    //Indexing Becase Value Like Test Change In Onther Page
		Thread.sleep(1000);
		Ip_Billing.itemWiseDiscountValidation1("AMOUNT", "50");
		Ip_Billing.itemWiseDiscountValidation1("PERCENT", "25");

		Ip_Billing.SelectByDiscountHeadDrp("Staff Discount" ,"Staff Discount"); //Same Web Element 
		Ip_Billing.EnterDiscountRemarks("Anup Discount On Items Remarks");               //Same Web Element 
		Ip_Billing.ClickCalcuateDiscountBtn("Click On Calculate Discount Btn");   //Same Web Element 
		Ip_Billing.AlertTotalAppliedDiscountView("View Discount Value");    //Same Web Element 
		Ip_Billing.SelectByAuthorisedByDrp("MOU Discount");            //Same Web Element 

		Ip_Billing.SaveDiscountOnBill("Save Discount On Service Wise");  //Same Web Element 
	}

	@Test(priority = 18 , enabled = false)
	public void IpPackageDetailsTest () 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Package Details", "Add Ip Package Details");

		Ip_Billing.SelectByFacilityDrp("Sanity Hospital");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,"IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29551");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.scrollLeftPanelToBottom();  


	}
	private final String sheetName_Adt = "ADT_Package_Multiple";
	@DataProvider(name = "ADTPackageDataProvider")
	public Object[][] getPackageData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_02: " + sheetName_Adt + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Adt);
	}

	@Test(dataProvider = "ADTPackageDataProvider", priority = 19 , enabled = false)

	public void AdtMultiplePackage(String ADT_Station_Drp ,String ADT_Speciality_Drp , String ADT_Doctor_Drp , String Department_Drp , 
			String Search_Package_Name , String Enter_Package_Alias_Name) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Package Details ", "Add Multiple Package Test Funcility");

		Ip_Billing.ClickOnIpPackageDetailsIcon("Click On Ip Package Details Icon");
		Package_Modifiction_Patien.SelectSpecialityAndDoctorDrp(ADT_Speciality_Drp , ADT_Doctor_Drp);
		Package_Modifiction_Patien.AdtPackageIconBtn("Click On Package Icon Btn");
		Package_Modifiction_Patien.DepartmentPackageDetailsPopDrp(Department_Drp);
		Package_Modifiction_Patien.SearchPackageNameBox(Search_Package_Name);
		Package_Modifiction_Patien.clickOnTablePackage("Select Package cliked Table");

		Package_Modifiction_Patien.PackageDetailsPop_BedType_Prce("Table Clicked On Bed Type And Price");
		Package_Modifiction_Patien.PackageSaveIcon("Click On Save Package Details Icon");
		Ip_Billing.enterPackageStardDateTime("Ip Package Start Date And Time"); 

		//Date Enter current Date And Grater End Date   Discharge Icon	
		Package_Modifiction_Patien.enterPakageAliasName(Enter_Package_Alias_Name);
		Package_Modifiction_Patien.AddPlusIconPackage("Click On Add Package Icon" ,"Add Package Yes Pop");
		Ip_Billing.ClosePackageDetailsPop("Click Close Package Details Pop");

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 20 , enabled = false)
	public void IpBillReadyTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Bill Ready Icon ", "Ip Bill Ready Icons");

		Ip_Billing.SelectByFacilityDrp("Sanity Hospital");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		//All Clearance
		Ip_Billing.EnterIpNumberInAllClearancePatient("29626");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		//Bill Ready 
		Ip_Billing.BillReadyIconAndYesPop("Bill Ready Icon" , "Yes Pop Patient’s total stay is less than 24 Hrs");
		Thread.sleep(2000);

	}
	@Test(priority = 21 , enabled = false)
	public void CancelBillReadyTest () 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Bill Cancel Bill Ready Icon", "After Bill Ready Test");

		Ip_Billing.CancelBillReadyAndYesPop("Click On Cancel Bill Ready Btn" ,"Cancel BIll Ready Yes Pop");
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 20 , enabled = false)
	public void IpBillDischargeIcon(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Ip Bill Discharge Icon", "All Clearnace After Discharge Icon Click");

		Ip_Billing.SelectByFacilityDrp("SANITY HOSPITAL");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		//All Clearance
		Ip_Billing.EnterIpNumberInAllClearancePatient("29626");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");


		Ip_Billing.ClickOnDischargeIconBtn("Click On Discharge Icon");
		Ip_Billing.SelectByDischargeReason_DischargeSubTypeDrp(Discharge_Reason_Drp , Discharge_Sub_Type_Drp);

		Ip_Billing.enterCurrentDischargeDateTime();     //Current Date And Time 
		Ip_Billing.EnterDischargeRemarks(Discharge_Remarks);

		Ip_Billing.YesDischarageReasonPop_AndConformationYesPop("Yes Discharge Reason Pop" , "Yes Discharge the patient Pop");
		Ip_Billing.OkPatientDischargedSuccessfullyPop("Patient Discharged Successfully Ok Pop");
		Thread.sleep(800);	

	}

	@Test(priority = 22 , enabled = false)
	public void CancelDischargeTest () 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Bill Cancel Discharge Icon", "After Discharge Test");

		Ip_Billing.SelectByFacilityDrp("SANITY HOSPITAL");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,"IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		//All Clearance
		Ip_Billing.EnterIpNumberInAllClearancePatient("29606");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.CancelDischargeIcon("Click on Cancel Discharge Icon");
		Ip_Billing.CancelDischargeReasonAndYesPop("Anup Cancel Discharge Text" ,"Yes Cancel Discharge Yes Pop");

		//This code Discharge Yes Btn Again Nursing Page Discharge Again And Sow In Discharge Notication White colours
		//Ip_Billing.YesBtnCancelDischargedNotification("Yes Pop Cancel Discharged Notification"); //11-03-2026

		//This code Discharge Notification Page Leged Colour Green But Billing Page Again Active Discharge Btn
		Ip_Billing.NoBtnCancelOnlyDischargedAndCancelBillReady("No Btn Cancel Only Discharge And Cancel Bill Ready"); 

	}


	@Test(dataProvider = "IpBilingDataProvider", priority = 23 , enabled = false)
	public void IpBillSettlement(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Bill Settlement", "Ip Bill Settlement Page ");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29626");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Thread.sleep(2000);
		Ip_Billing.AfterDischargeOkPop("Discharge Patient Pop");   //Again Hit IP Number In Bill Genrate Patient

		Ip_Billing.ClickOnBillSettlementIcon("Click On Bill Settlement Btn");
		Ip_Billing.BillSettlementReasonAndSavePop(Bill_Settlement_Reason_Text , "Right Singn Reason Latesettle pop");   //Pop Same time 

		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='90%'");

		Ip_Billing.BillSettlementReamrks(Bill_Settlement_Remarks);
		Ip_Billing.EditAndReceivedFrom("Click On Edit Button" , Received_From_Bill_Settl);
		Ip_Billing.SaveBillSettlementBtn("Click on Bill Settlement Save Btn" , "Do you want to settle Yes Pop" ,"Ok Bill Settled Receipt");

		//Ip_Billing.MOPInChequeInformation("Click On Cheque Btn" ,Cheque_Number , Cheque_Issue_Date , Cheque_Bank_Name_Drp ,Cheque_Branch ,
		//	Cheque_Amount , Cheque_Authorised_By_Drp );	

	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 24 , enabled = false)
	public void CamcelBillSettlement(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Cancel Bill Settlement", "Cancel Bill Settlement Funcility ");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29558");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.AfterDischargeOkPop("Discharge Patient Pop");   //Again Hit IP Number In Bill Genrate Patient
		Ip_Billing.ClickOnBillSettlementIcon("Click On Bill Settlement Btn");

		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='90%'");

		Ip_Billing.CancelBillSettlementBtn("Click on Bill Settlement Btn");
		Ip_Billing.AuthorizationCancelBillSettlemrntPop("Balihar Singh" , "Cancel Bill Settlement Test" ,"Save Cancel Bill Settle Authorization Pop");
		Ip_Billing.CloseBillSettlementPop("Close Bill Settlement Pop");
	}

	@Test(dataProvider = "IpBilingDataProvider", priority = 25 , enabled = false)
	public void DueSettlementBillTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Due Bill Settlement ", "Due Settlement Test");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29561");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.AfterDischargeOkPop("Discharge Patient Pop");   //Again Hit IP Number In Bill Genrate Patient
		Ip_Billing.ClickOnBillSettlementIcon("Click On Bill Settlement Btn");
		Ip_Billing.BillSettlementReasonAndSavePop(Bill_Settlement_Reason_Text , "Right Singn Reason Latesettle pop");

		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='90%'");

		Ip_Billing.BillDueAmount(Bill_Amount);
		Ip_Billing.ClickOnDueIcon_AuthorisedBy_Ramarks("Click On Due Btn" ,Due_Authorised_By_Drp , Due_Remarks);

		Ip_Billing.SaveBillSettlementBtn("Click on Bill Settlement Save Btn" , "Do you want to settle Yes Pop" ,"Ok Bill Settled Receipt");		

	}


	@Test(dataProvider = "IpBilingDataProvider", priority = 26 , enabled = false)
	public void BillGenrateTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
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

		logger = extent.createTest("Bill Genrate Bill Icon ", "Bill Genrate Test Funcility");

		Ip_Billing.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , Ip_Billing_Station_Drp , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29626");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.BillGenrateIcon("Click On Bill Genrate Icon");
		Ip_Billing.BillGenrateReasonTxtAndYesBtn(Bill_Genrate_Reason_Text, "Bill genrate Reason Save Pop");
		Ip_Billing.YespopsureGeneratepatientAndDischargePop("Sure Patient Bill Genrate" , "Discharge Yes Pop");

	}

	@Test(priority = 27 , enabled = false)
	public void AddOnBilingTest() 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Add On Bill Miscellaneous Charges", "1. Generate Add-On Bill ,2. Settle Add-On Bill ,3. Print Add-On Bill");

		//Add On Bill Funcility Work In Discharge , Settlement 
		Ip_Billing.SelectByFacilityDrp("SANITY HOSPITAL");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , "IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29630");

		Ip_Billing.PleaseEnterReasonlateClaimAndYesPop("Reason late claim Anup" , "Reason late claim Yes Pop");
		Ip_Billing.AfterDischargeOkPop("Discharge Patient Ok Button");   //Again Hit IP Number In Bill Genrate Patient

		//1. Generate Add-On Bill Radio Btn

		Ip_Billing.ClickOnAddOnBillIcon("Click On Add On Bill Icon");
		Ip_Billing.RadioBtnGeneateAddonBillIfrormation("Click On Radio Btn Generate Add-On Bil" , "Generate Yes pop" ,
				"Yes Pop This transaction CantNot Reverted");
		Ip_Billing.PleaseEnterReasonlateClaimAndYesPop("Add On Bill" , "Reason Yes Pop");

		//2. Settle Add-On Bill Radio Btn
		Ip_Billing.ClickOnAddOnBillIcon("Click On Add On Bill Icon");
		Ip_Billing.SettleAddOnBillRadioBtnInformation("Click On Radio Btn Settle Add On Bill" ,"Yes Settle pop");
		Ip_Billing.SaveAddOnReceiptIPBillingBillSettlement("All Settle In Case Receipt Btn" ,"Receipt Yes Pop" );
		Ip_Billing.PleaseEnterReasonlateClaimAndYesPop("Add On Bill" , "Reason Yes Pop");
		Ip_Billing.OkReceiptNumberPop("Ok Receipt Number pop");

		Thread.sleep(500);

		//3.Print Add-On Bill Radio Btn
		Ip_Billing.ClickOnAddOnBillIcon("Click On Add On Bill Icon");
		Ip_Billing.PrintradioBtnAddOnBill("Print Add-On Bill Radio Btn" , "Print Yes Pop");

	}
	@Test(priority = 28 , enabled = false)

	public void IpBillingAddRemarksIcon()
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Billing Add Remarks", "Add Remarks Test Funcility Test");

		Ip_Billing.SelectByFacilityDrp("Sanity Hospital");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , "IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29561");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.AddOnRemarksPlushBtn("Click On Ip Bill Add On Remarks Plush Icon");
		Ip_Billing.EnterPrintableRemarkAndSaveBtn("Text Enter Printable Remaks" ,"Save Printable Add On Remals Pop");
		Ip_Billing.ClickOnAddOnRemarksPlushIconAndSavePop("Click On Ip Bill Add On Remarks Plush Icon" , "Enter Remaks Add On Plush O=Icon" ,
				"Save Add On Remaks Plush Icon");
	}
	@Test(priority = 29 , enabled = false)
	public void uplaodPatientDocuments()
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Billing Upload Patient Document", "Upload Patient Document Test Funcility Test");
		Ip_Billing.SelectByFacilityDrp("Sanity Hospital");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , "IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29561");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.ClickOnPatientDocumentIcon("Click On UpLoad Patient Document Icon");
		Ip_Billing.UploadPatientDocumentType("Radio Btn Upload Patient Document" , "OP Prescription" ,"Click On Dicom Document Icon");

		Ip_Billing.DiconDocumentNameAndDocumentTypeDrp("Document Name Anup" ,"SurgeryEstimation");
		Ip_Billing.UploadDicomFile("Upload File" ,"Save Dicom File");
		Ip_Billing.CloseUploadPatientDocumentPop("Close Patient Document Pop");

	}
	@Test(priority = 30 , enabled = false)
	public void SelectNonPayableServiceName() 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Non Payable Service Name", "Non Payable Service Test Funcility Test");

		Ip_Billing.SelectByFacilityDrp("Sanity Hospital");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , "IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29563");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.clickOnNonPayableIcon("Click on Non Payable Btn");
		Ip_Billing.SelectServiceDrpAndViewInServiceTable("MEDICAL RECORDS" ,"View Table Non Payable Service Name");
		Ip_Billing.SelectFirstCheckBoxServiceAndSave("Select First Check Box" ," Save Service Non Payable");

		Ip_Billing.ModifyServicesAndSave("Click on Modify Service Icon" , "Select Check Box" , "Modify And Save Services");
		Ip_Billing.CloseNonPayableServicesPop("Click On Close Non Payable Services Pop");

	}

	@Test(priority = 31 , enabled = false)
	public void PrintIpBilling() 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Print Ip Billing ", "Print Ip Billing Test Funcility Test");

		Ip_Billing.SelectByFacilityDrp("Sanity Hospital");
		Ip_Billing.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" , "IP BILLING" , "Station Yes Popup");

		Ip_Billing.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ip_Billing.IpBillingPage1("Click On Ip Billing Drp","Ip Billing Page");

		Ip_Billing.EnterIpNumberInAllClearancePatient("29563");
		Ip_Billing.DischargeOkPop("Ok Deposit pop");

		Ip_Billing.PrintInSummaryDetails("Click On Print Btn" , "Check Box Summary Icon" , "Yes To Print");

		//String dynamicIP_Number = AcknowledgeDischargeNotificationPage.Ip_No;
		//Ip_Billing.EnterIpNumberInAllClearancePatient(dynamicIP_Number);
	}


}
