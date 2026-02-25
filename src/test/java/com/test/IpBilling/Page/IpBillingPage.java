/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;
import java.lang.foreign.ValueLayout.OfBoolean;
import java.text.SimpleDateFormat;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 09-Feb-2026
 */
public class IpBillingPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String ip_billing = "//span[normalize-space()='IP Billing']";

	//=======================IpBilling ========================
	protected static  String ip_billing_page = "//a[@href='/sanitywebhistree/Billing/Billing/IPBilling']";

	//======================Search Patient =========================

	protected static  String search_icon_find_patient = "//img[@src='/sanitywebhistree/images/action_Newbtn/popupSearch.svg']";
	protected static  String current_in_patient_Radio_btn_pop = "//input[@id='rbCurrentPatents']";

	protected static  String In_patient_All_Ward_Check_Box_pop = "//input[@id='cbAllWards']";
	protected static  String In_patient_Discharge_Admision_chkk_box_pop = "//input[@id='cbAdmission']";
	protected static  String In_patient_From_Date_pop = "//input[@id='txtadmitDate']";
	protected static  String In_patient_To_Date_pop = "//input[@id='txtadmittodate']";
	protected static  String Vip_check_box = "//input[@id='cbVip']";
	protected static  String remaks_check_Box = "//input[@id='cbRemark']";
	protected static  String Mobile_no_Serach = "//input[@id='modal_mobileNo']";
	protected static  String Name_Serach = "//input[@id='modal_Name']";
	protected static  String first_Name_Serach = "//input[@id='modal_firstName']";
	protected static  String Vip_Remark_text = "//input[@id='txtVIPRemark']";
	protected static  String National_ID  = "//input[@id='modal_nationalID']";
	protected static  String Gender_drp = "//select[@id='modal_gender']";
	protected static  String UHID = "//input[@id='txt_UHID_DC']";
	protected static  String Find_Patient_Serach_Icon = "//a[@id='search_billing']//i[@class='fa fa-search']";
	protected static  String Clear_Find_Patient_pop = "//i[@title='Clear']";

	//========================Discharge Patient =================================================

	protected static  String Rdio_Btn_Discharged_Patients = "//input[@id='rbDisPatents']";
	protected static  String Discharged_Patien_IP_no = "//input[@id='txt_IPNo_DC']";
	protected static  String Discharged_Patients_Bed_No = "//input[@id='txt_BedNo']";
	protected static  String Discharged_Patients_Bill_No = "//input[@id='txt_BillNo_DC']";
	protected static  String Discharged_Patients_Singn_Marks = "//a[@id='btn_search_DC']//i[@class='fa fa-check']";

	protected static  String Discharged_Patients_Table = "//input[@id='rbDisPatents']";    // adding
	protected static  String find_patient_last_table = "//table[@id='searchBillingTable']//tbody//tr[@onclick][last()]";

	//==========================Enter UHID And Ip Number =====================================

	protected static String Enter_Uhid = "//input[@id='txtuhid']";
	protected static String Enter_Ip_Number = "//input[@id='txtipno']";
	protected static String discharge_pop = "//a[@id='PopupOK_discharge']";

	//============================== Bill Discharge Icon ================================
	protected static String Click_Discharge_icon = "//a[@id='btnDischarge']//i[@class='fa fa-universal-access']";
	protected static String Discharge_Reason_Drp_pop = "//select[@id='selDischargeType']";
	protected static String Discharge_Sub_Type_Drp_pop = "//select[@id='selDischargeSubType']";
	protected static String Discharge_Remarks_pop = "//textarea[@id='txtDischargeRemarks']";
	protected static String Discharge_Singn_Icon_pop = "//a[@id='btnYesDischargeMSGModal']//i[@class='fa fa-check']";

	protected static String Discharge_Date_Time_pop = "//input[@id='txtDischargePatientDateTime']";
	protected static String Discharge_Singn_pop = "//a[@id='btnYesDischargeMSGModal']//i[@class='fa fa-check']";
	protected static String Discharge_Singn_Yes_pop = "//a[@id='btnYesClinicalDischargeFinalMSGModal']";

	protected static String  Discharged_Successfully_Ok_pop = "//a[@id=\"PopupOK\"]";

	//==============================Bill Ready Icon ================================

	protected static String Bill_Ready_Icon = "//i[@class='fa fa-check-square']";
	protected static String Bill_Ready_Yes_pop = "//a[@id='btnYesBillReadyMSGModal']";
	protected static String Cancel_Bill_Ready_Yes_pop = "//a[@id='btnYesBillReadyMSGModal']";

	//===================== Edit Financial Details =================================

	protected static String Edit_Financial_Details_Icon = "//a[@id='btnfinancialdetails']";
	protected static String Bill_Financial_Refesh = "//a[@id='btnIPBillingFinancialDetails_ModalRefresh']//i[@class='fa fa-refresh']";
	protected static String Bill_Financial_close = "//a[@id='btnIPBillingFinancialDetails_ModalClose']//i[@class='fa fa-times']";
	protected static String Bill_Financial_Update = "//a[@id='btnIPBillingFinancialDetails_ModalModify']//i[@class='fa fa-pencil-square-o']";
	protected static String Bill_Financial_Save = "//div[@id='IPBillingFinancialDetails_Modal']//div[@class='popup-icon-top']//span[1]";

	protected static String Bill_Financial_Cash_Radio_btn = "//input[@id='rbCash']";
	protected static String Bill_Financial_Company_Radio_btn = "//input[@id='rbCredit']";
	protected static String Bill_Financial_Company_Type_Drp = "//select[@id='cmbcompanychannel']";
	protected static String Bill_Financial_Company_Drp = "//select[@id='cmbmaincompany']";
	protected static String Bill_Financial_Rate_contract_Drp = "//select[@id='ddCompany']";

	protected static String Bill_Financial_Rate_Plush = "//a[@id='Add_Multiple_Rate_Contract']//i[@class='fa fa-plus']";
	protected static String Bill_Financial_2nd_Rate_Contract_Drp = "//select[@id='cmbRateContract2']";
	protected static String Bill_Financial_Insurance_Company_Drp  = "//select[@id='cmbInsuranceCompany2']";
	protected static String Bill_Financial_Policy_Number  = "//input[@id='policy2']";
	protected static String Bill_Financial_Auth_ClaimNo  = "//input[@id='Claimno2']";
	protected static String Bill_Financial_Creadit_limit  = "//input[@id='CreditLimit2']";

	protected static String Bill_Financial_Policy_no  = "//input[@id='txtTokenNo']";
	protected static String Bill_Financial_Auth_ClaimNo_   = "//input[@id='txtauthno']";
	protected static String Bill_Financial_Standard_Deductible  = "//input[@id='txtstdeduct']";
	protected static String Bill_Financial_Standard_Co_pay  = "//select[@id='Standard_co_pay']";
	protected static String Bill_Financial_Co_Pay  = "//input[@id='txtstco_pay']";
	protected static String Bill_Financial_Letter_no  = "//input[@id='txtLetterNo']";

	protected static String Bill_Financial_Letter_Date  = "//input[@id='DPletterdate']";
	protected static String Bill_Financial_Employee_number  = "//input[@id='txtempnumber']";
	protected static String Bill_Financial_Certificate_number  = "//input[@id='txtcertificatenumber']";
	protected static String Bill_Financial_Bed_Entitlement  = "//input[@id='txtbedentitlement']";
	protected static String Bill_Financial_per_Day  = "//input[@id='txtbedrate']";
	protected static String Bill_Financial_Account_no  = "//input[@id='txtAccountNo']";
	protected static String Bill_Financial_IFSC_Code  = "//input[@id='txtIFSCCode']";
	protected static String Bill_Financial_Bank_Name  = "//input[@id='txtBank_Branch']";
	protected static String Bill_Financial_Pan_No  = "//input[@id='TxtPan_No']";
	protected static String Bill_Financial_Account_Inf_Save  = "//a[@id='btnSavePANNo']//i[@class='fa fa-save']";
	protected static String Bill_Financial_Scheme_Check_Box  = "//input[@id='chkScheme']";
	protected static String Bill_Financial_Scheme_Drp  = "//select[@id='ddlScheme']";

	protected static String Bill_Financial_Show_All_Companies_Check_Box  = "//input[@id='chkshowall']";
	protected static String Chekk_Pharmacy_Non_Payable_Items  = "//input[@id='chkRestictNonPayable']";
	protected static String Bill_Financial_Corporate_Company  = "//select[@id='cmbcorporate']";
	protected static String Bill_Financial_Insurance_Company  = "//select[@id='cmbCompanyTPA']";
	protected static String Bill_Financial_Validity_Till  = "//input[@id='dtpletterdate']";
	protected static String Bill_Financial_Auth_Amount = "//input[@id='txtauthamt']";
	protected static String Bill_Financial_Credit_Limit = "//input[@id='txtcreditlimit1']";
	protected static String Bill_Financial_emp_code = "//input[@id='txtempcode']";
	protected static String Bill_Financial_Emp_Relation = "//input[@id='txtEmpName']";
	protected static String Bill_Financial_Issued_By = "//input[@id='txtIssuedBy']";
	protected static String Bill_Financial_Surgery = "//input[@id='txtMediEstimate']";

	//=====================Company Details================================
	protected static String Company_Details_icon = "//a[@id='btn_InsuranceApproved']";
	protected static String Insurance_Credit_limit_Radio = "//input[@id='radioCreditLimit']";
	protected static String Enter_Credit_limit_Box = "//input[@id='txtCompanyDetailsCreditLimit']";
	protected static String Cupy_Bill_Amount_chekk_box = "//input[@id='_Copylimit']";
	protected static String save_Insurance_Approval_details = "//a[@id='CompanyDetailModelSave']//i[@class='fa fa-save']";
	protected static String Close_Insurance_Approval_details = "//a[@id='CompanyDetailModelClose']//i[@class='fa fa-times']";
	
	//=====================Bill Details ========================
	protected static String Bill_Details_icon = "//a[@id='btnBillDetails']//i[@class='fa fa-file-text-o']";
	protected static String Close_Bill_Details = "//a[@id='BillDetailsModelClose']//i[@class='fa fa-times']";

	//============================= Surgery Breakup Details ============================

	protected static String Surgery_Breakup_Detail_Icon = "//i[@class='fa fa-sign-language']";
	protected static String Radio_Btn_Surgery_Break_Summary  = "//input[@id='_breakupbillSummary']";
	protected static String Radio_Btn_Surgery_Break_Details = "//input[@id='_breakupbillDetail']";
	protected static String Radio_Btn_Surgery_Break_Club_OT_Component = "//input[@id='_breakupbillClub']";
	protected static String Date_Chkk_Surgery_Break = "//input[@id='daterangesurgery']";
	protected static String Frome_Date_Surgery_Break = "//input[@id='_frmdatesurgery']";
	protected static String To_Date_Surgery_Break = "//input[@id='_todatesurgery']";
	protected static String Print_Surgery_Break = "//a[@id='_breakupBiillPrint']//i[@class='fa fa-print']";

	//=======================Bill Genrate ====================

	protected static String Bill_Genrate_Icon = "//a[@id='btnBillGenerate']";
	protected static String Bill_Genrate_Reason_txt = "//input[@class='otp-input']";
	protected static String Save_Reason_Bill_Genrate_pop = "//div[@id='SearchMasterModal']//i[@class='fa fa-check']";
	protected static String sure_generate_pop = "//a[@id='PopupYesBillGenerate']//i[@class='fa fa-check']";
	protected static String Ok_Discharge_pop = "//a[@id='PopupOKDischargeFinal']";

	//===========================Bill Settlement==============================

	protected static String Ok_Discharged_pop = "//a[@id='PopupOK_discharge']";  //again Enter UHID 

	protected static String Bill_Settlement_Icon = "//i[@class='fa fa-balance-scale']";
	protected static String Bill_Settlement_Reason_txt = "//input[@class='otp-input1']";
	protected static String Bill_Settlement_Reason_Yes = "//div[@id='SearchMasterModal1']//i[@class='fa fa-check']";

	protected static String Bill_Settl_Remarks = "//textarea[@id='txtReceiptRemarks']"; 
	protected static String Bill_Settl_Edit = "//button[@id='btnEdit']"; 
	protected static String Bill_Settl_Received_From = "//input[@id='txtReceivedby']"; 
	//Due Amount
	protected static String Bill_Settl_Amount_Cash = "//input[@id='txtCSAmount']";    // Amount is Less than in Current Amount
	protected static String Bill_Settl_Due_Icon = "//a[@name='Due']";
	protected static String Bill_Settl_Due_Authorised  = "//select[@id='cmbdue']";
	protected static String Bill_Settl_Due_Remaks  = "//textarea[@id='txtDueRemarks']";
	//MOP Cheque 

	protected static String Bill_Settl_Cheque_Btn = "//a[@id='tabcheque']";
	protected static String Cheeque_No = "//input[@id='TXTChequeNo']";
	protected static String Cheeque_Issue_date = "//input[@id='cqIssDt']";
	protected static String Cheeque_Bank_Name_Drp = "//select[@id='cmbchequeBank']";
	protected static String Cheeque_Branch = "//input[@id='txtCqBranchName']";
	protected static String Cheeque_Amount = "//input[@id='txtCQAmount']";
	protected static String Cheeque_Authorised_By_Dp = "//select[@id='cmbcheque']";

	//==================== Bill settlement cancel =========================
	protected static String Cancel_Bill_Settl_Btn = "//i[@class='fa fa-times-circle']";
	protected static String Cancel_Bill_Authorised_By_drp  = "//select[@id='_authby']";
	protected static String Cancel_Bill_Settl_Remarks = "//textarea[@id='_authbyremarks']";
	protected static String Cancel_Bill_Settl_Save = "//a[@id='Savecancelsettelment']//i[@class='fa fa-save']";

	//========================Bill Settlement Save ==========================

	protected static String Save_Bill_Settlement = "//a[@id='btnReceiptIPBillingBillSettlementMSG_Modal']//i[@class='fa fa-inr']";
	protected static String Save_Bill_Settlement_Yes_Pop = "//a[@id=\"IPBillingFinalSettlementPopupforMessageOK\"]";
	protected static String Save_Bill_Settlement_Receiptno = "//a[@id=\"PopupOK\"]";
 
	//====================Bill Print =============================
	protected static String Print_Btn = "//a[@id='btnintrimprintbill']//i[@class='fa fa-print']";
	protected static String Summary_Bill_Radio_Btn = "//input[@id='rbtsummary']";
	protected static String Yes_Print_Icon = "//a[@id='btnIPBillingFinalBillMSG_ModalOK']//i[@class='fa fa-check']";
	
	//===============================Bill Menu ==============================
	
	protected static String bill_Menu = "//img[@id='showmenuIcon']";
	//================================Add On Bill ===========================================
	protected static String Add_on_Bill_btn = "//a[@id='btnAddOnBill']//i[@class='fa fa-plus']";
	
	protected static String radio_btn_Generate = "//input[@id='rdGenAddOnBill']";
	protected static String Yes_Generate_Add_On_bill_pop = "//a[@id='IPBillingAddonBillMSG_ModalOK']";
	protected static String Yes_Generate_Cannot_Reverted_pop = "//a[@id='btnYesIPBillingSaveAddOnMSG_Modal']";
	protected static String Settle_Radio_Btn = "//input[@id='rdSettleAddOnBill']";
	protected static String Settle_IP_Add_On_Bill_Settlementpop_Enter_Amount = "//input[@id='txtCSAmountAddOn']";
	protected static String Click_Due_Icon = "//li[@class='active']//a[@data-toggle='tab'][normalize-space()='Due']";
	protected static String Redues_Actual_Amount_Authorised_drp = "//select[@id='cmbdueAddOn']";  
	protected static String Receipt_Icon_Save = "//a[@id='btnAddonReceiptIPBillingBillSettlementMSG_Modal']//i[@class='fa fa-inr']";  
    protected static String Receipt_Save_Yes_Pop = "//a[@id='IPBillingFinalSettlementPopupforMessageOKAddOn']";
    protected static String Receipt_Save_Yes_Receipt_no_Ok_Pop = "//a[@id='PopupOK']";
    
    protected static String radio_Btn_Print_Add_On_Bill = "//input[@id='rdPrintAddOnBill']";
    
	
	
	
	
	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}

	public void IpBillingPage1 (String Ip_Billing_Tab , String ip_billing_Page) 	throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ip_billing)));
		CommanUtill.clickFunction(ip_billing, Ip_Billing_Tab);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ip_billing_page)));
		CommanUtill.clickFunction(ip_billing_page, ip_billing_Page);
	}

	//========================Search Patient =====================================

	public void FindPatient_SeachIcon(String Search) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(search_icon_find_patient, Search);
	}

	public void RadioBtnCurrentInPatients_AllWardsCheckBox(String Current_In_Patent , String All_Ward_Check_Box)
			throws IOException ,InterruptedException {
		CommanUtill.clickFunction(current_in_patient_Radio_btn_pop, Current_In_Patent);
		CommanUtill.clickFunction(In_patient_All_Ward_Check_Box_pop, All_Ward_Check_Box);
	}

	public void Current_In_Patient_Admission_Discharge_ChkkBox(String Admission_DisCharge) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(In_patient_Discharge_Admision_chkk_box_pop, Admission_DisCharge);	
	}
	public void AdmissionDischarge_FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(In_patient_From_Date_pop));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(In_patient_From_Date_pop, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void AdmissionDischarge_ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(In_patient_To_Date_pop));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(In_patient_To_Date_pop, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}

	public void CheckBoxVIP_Remarks(String Vip , String Remarks) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Vip_check_box, Vip);
		CommanUtill.clickFunction(remaks_check_Box, Remarks);
	}

	public void SerachMobileNumber(String Mobile_no , String Find_In_Patient) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Mobile_no_Serach, Mobile_no);
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Find_In_Patient);	
	}

	public void EnterNameAndSerchicon(String Name , String Find_Patient_By_Name) throws IOException ,InterruptedException{

		CommanUtill.textEnter(Name_Serach, Name);
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Find_Patient_By_Name);
	}

	public void EnterUHIDAndSearchIcon(String text_uhid , String Search_icon) throws IOException ,InterruptedException{

		CommanUtill.textEnter(UHID, text_uhid);
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Search_icon);
	}

	public void SerachAndselectPatientInTable(String Patient) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(find_patient_last_table, Patient);
	}
	//========================Discharge Patient Search =============================

	public void RadioBtnDischargedPatients(String Discharged_Patients) throws IOException ,InterruptedException { 

		CommanUtill.clickFunction(Rdio_Btn_Discharged_Patients, Discharged_Patients);  
	}
	public void SerachIpNumber_DischargedPatients(String Ip_no , String Rignt_Singn_Marks) throws IOException ,InterruptedException { 

		CommanUtill.clickFunction(Discharged_Patien_IP_no, Ip_no);  
		CommanUtill.clickFunction(Discharged_Patients_Singn_Marks, Rignt_Singn_Marks);   
	}

	public void SerachBedNo_DischargedPatients(String Bed_no , String Rignt_Singn_Marks) throws IOException ,InterruptedException { 

		CommanUtill.clickFunction(Discharged_Patients_Bed_No, Bed_no);  
		CommanUtill.clickFunction(Discharged_Patients_Singn_Marks, Rignt_Singn_Marks);   
	}

	public void SerachBillNo_DischargedPatients(String Bill_No , String Rignt_Singn_Marks) throws IOException ,InterruptedException { 

		CommanUtill.clickFunction(Discharged_Patients_Bill_No, Bill_No);  
		CommanUtill.clickFunction(Discharged_Patients_Singn_Marks, Rignt_Singn_Marks);  

	}
	public void SerachDischargedPatient(String Serch_Icon) throws IOException ,InterruptedException { 

		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serch_Icon);

	}

	public void PickDischargePatientTable(String Dis_patient_table ) throws IOException ,InterruptedException { 

		CommanUtill.clickFunction(find_patient_last_table, Dis_patient_table);
	}

	//===============================Enter Uhid And Ip Number ==========================

	public void EnterUHIDInAllClearancePatient(String Enter_Uhid_1) throws IOException ,InterruptedException { 

		WebElement enter_uhid = driver.findElement(By.xpath(Enter_Uhid));
		CommanUtill.textEnter(Enter_Uhid, Enter_Uhid_1);
		enter_uhid.sendKeys(Keys.ENTER);
	}

	public void EnterIpNumberInAllClearancePatient(String ip_no) throws IOException ,InterruptedException { 

		WebElement enter_uhid = driver.findElement(By.xpath(Enter_Ip_Number));
		CommanUtill.textEnter(Enter_Ip_Number, ip_no);
		enter_uhid.sendKeys(Keys.ENTER);
	}

	public void DischargeOkPop(String Dis_pop) throws IOException ,InterruptedException { 

		if (CommanUtill.isElementPresent(discharge_pop)) {
			CommanUtill.clickFunction(discharge_pop, Dis_pop);
			System.out.println("Deposit Discharge Pop.");
		} else {
			System.out.println("Deposit Discharge Pop did not appear.");
		}
	}
	//==============================Discharge Icon ================================

	public void ClickOnDischargeIconBtn(String Discharge_Icon) throws IOException , InterruptedException{

		CommanUtill.clickFunction(Click_Discharge_icon, Discharge_Icon);
	}

	public void SelectByDischargeReason_DischargeSubTypeDrp(String Reason_Drp , String Discharge_Sub_Type) 
			throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(Discharge_Reason_Drp_pop, Reason_Drp);
		CommanUtill.dropdownSelectByVisibleText(Discharge_Sub_Type_Drp_pop, Discharge_Sub_Type);
	}
	public void EnterDischargeRemarks(String Remarks) throws IOException , InterruptedException{

		CommanUtill.textEnter(Discharge_Remarks_pop, Remarks);
	}

	public void enterCurrentDischargeDateTime() throws IOException, InterruptedException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm a");

		String currentDateTime = sdf.format(new java.util.Date());

		WebElement clear = driver.findElement(By.xpath(Discharge_Date_Time_pop));
		clear.sendKeys(Keys.CONTROL + "a");
		clear.sendKeys(Keys.DELETE);

		CommanUtill.textEnter(Discharge_Date_Time_pop, currentDateTime);
		clear.sendKeys(Keys.TAB);

		System.out.println("Discharge Date Time auto-set to: " + currentDateTime);

	}
	public void saveDischargeAndYesPop(String DDischarge_Reason_Singn_pop , String Yes_pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Discharge_Singn_pop, DDischarge_Reason_Singn_pop);
		CommanUtill.clickFunction(Discharge_Singn_Yes_pop, Yes_pop);
	}

	public void OkPatientDischargedSuccessfullyPop(String PatientDischargedSuccessfully) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(Discharged_Successfully_Ok_pop)) {
			CommanUtill.clickFunction(Discharged_Successfully_Ok_pop, PatientDischargedSuccessfully);
			System.out.println("Patient Discharged Successfully Pop.");
		} else {
			System.out.println("Patient Discharged Successfully Pop did not appear.");
		}	
	}
	//==============================Bill Ready Icon ================================

	public void BillReadyIconAndYesPop(String Bill_Ready , String Bill_Ready_Yes_pop_) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Bill_Ready_Icon)));
		CommanUtill.clickFunction(Bill_Ready_Icon, Bill_Ready);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Bill_Ready_Yes_pop)));
		CommanUtill.clickFunction(Bill_Ready_Yes_pop, Bill_Ready_Yes_pop_);
	}

	public void CancelBillReadyIconAndYesPopup(String Bill_Ready , String Cancel_Ready_Yes) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Bill_Ready_Icon, Bill_Ready);
		CommanUtill.clickFunction(Cancel_Bill_Ready_Yes_pop, Cancel_Ready_Yes);
	}

	//==========================Financial Detail Modification ==============================

	public void EditFinancialDetailModificationIcon(String Financial_Edit) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Edit_Financial_Details_Icon, Financial_Edit);
	}
	public void UpdateFinancialDetailModificationIcon(String Financial_Edit) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Bill_Financial_Update, Financial_Edit);
	}

	public void CompanyInsuranceRadioBtn(String Company_Insurance) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Bill_Financial_Company_Radio_btn, Company_Insurance);	
	}

	public void CompanyType_Company_RatecontractDrp(String Company_Type_Drp , String Company_Drp , 
			String Rate_Contract_Drp) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Company_Type_Drp, Company_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Company_Drp, Company_Drp);
		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Rate_contract_Drp, Rate_Contract_Drp);
	}

	public void EnterPolicyNo_AuthClaimText(String Policy , String Auth) throws IOException, InterruptedException {

		CommanUtill.textEnter(Bill_Financial_Policy_no, Policy);
		CommanUtill.textEnter(Bill_Financial_Auth_ClaimNo_, Auth);
	}

	public void EnterStandardDeductible(String Standard_Deductible) throws IOException, InterruptedException {

		CommanUtill.textEnter(Bill_Financial_Standard_Deductible, Standard_Deductible);
	}

	public void StandardCo_PayDrpAndCo_Pay(String Standard_Copay_Drp , String Co_pay ) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Standard_Co_pay, Standard_Copay_Drp);
		CommanUtill.textEnter(Bill_Financial_Co_Pay, Co_pay);
	}

	public void LetterNumberLetterDateEmployeenumbeCertificatenumber(String Letter_no , String Letter_Date , String Employeenumbe ,
			String Certificate_number) throws IOException, InterruptedException {

		CommanUtill.textEnter(Bill_Financial_Letter_no, Letter_no);
		WebElement Date = driver.findElement(By.xpath(Bill_Financial_Letter_Date));
		Date.sendKeys(Keys.CONTROL+"a");
		Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Bill_Financial_Letter_Date, Letter_Date);
		Date.sendKeys(Keys.TAB);
		CommanUtill.textEnter(Bill_Financial_Employee_number, Employeenumbe);
		CommanUtill.textEnter(Bill_Financial_Certificate_number, Certificate_number);
	}

	public void BedEntitlementAndPerDay(String Bed_Entitlement , String Per_Day) throws IOException, InterruptedException {

		//WebElement bed_enti = driver.findElement(By.xpath(Bill_Financial_Bed_Entitlement));
		//bed_enti.sendKeys(Keys.CONTROL+"a");
		//bed_enti.sendKeys(Keys.DELETE);
		//CommanUtill.textEnter(Bill_Financial_Bed_Entitlement, Bed_Entitlement);
		CommanUtill.textEnter(Bill_Financial_per_Day, Per_Day);
	}

	public void AccountInformationEnterAndSave(String Account_no , String IFSC_Code , String Bank_Branch ,
			String  PAN_No , String Save) throws IOException, InterruptedException {

		CommanUtill.textEnter(Bill_Financial_Account_no, Account_no);
		CommanUtill.textEnter(Bill_Financial_IFSC_Code, IFSC_Code);
		CommanUtill.textEnter(Bill_Financial_Bank_Name, Bank_Branch);
		CommanUtill.textEnter(Bill_Financial_Pan_No, PAN_No);
		CommanUtill.clickFunction(Bill_Financial_Account_Inf_Save, Save);
	}
	public void SchemeCheckBoxAndDrp(String Scheme_Chkk , String Scheme_Drp ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Bill_Financial_Scheme_Check_Box, Scheme_Chkk);
		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Scheme_Drp, Scheme_Drp);
	}

	public void CorporateCompany_InsuranceCompanyDrp (String CorporateCompany_Insurance_Drp , String InsuranceCompany_Drp )
			throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Corporate_Company, CorporateCompany_Insurance_Drp);
		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Insurance_Company, InsuranceCompany_Drp);
	}

	public void AuthAmount_CreditLimit(String AuthAmount , String CreditLimit) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Bill_Financial_Auth_Amount, AuthAmount);
		CommanUtill.textEnter(Bill_Financial_Credit_Limit, CreditLimit);
	}
	public void EmployeeCode_EmployeeRelation_IssuedBy(String Emp_code , String Emp_Relation , String Issued_By)
			throws IOException, InterruptedException { 

		CommanUtill.textEnter(Bill_Financial_emp_code, Emp_code);
		CommanUtill.textEnter(Bill_Financial_Emp_Relation, Emp_Relation);
		CommanUtill.textEnter(Bill_Financial_Issued_By, Issued_By);
	}
	public void SaveFinancialDetailModificationBtn(String Save_Financial_Details) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Bill_Financial_Save)));
		CommanUtill.clickFunction(Bill_Financial_Save, Save_Financial_Details);
	}
	
	
	//===========================Company Details ===============================
	public void ClickOnCompanyDetailsIcon(String Company_Details_Icon) throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Company_Details_icon)));
		CommanUtill.clickFunction(Company_Details_icon, Company_Details_Icon);
	}
	
	public void RadioBtnInCreditLimitAndEnterCreaditLimit(String CheckBox_CreditLimit , String Enter_Credit_Limit) 
			throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Insurance_Credit_limit_Radio)));
		CommanUtill.clickFunction(Insurance_Credit_limit_Radio, CheckBox_CreditLimit);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Enter_Credit_limit_Box)));
		CommanUtill.textEnter(Enter_Credit_limit_Box, Enter_Credit_Limit);
	}
	
    public void CheckBoxCopyBillAmount(String chkk_Coupy_Bill_Amount) throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Cupy_Bill_Amount_chekk_box)));
		CommanUtill.clickFunction(Cupy_Bill_Amount_chekk_box, chkk_Coupy_Bill_Amount);
	}
    public void SaveCompanyDetails_PatientInsuranceApprovalPop(String Save_Company_Details_pop) throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(save_Insurance_Approval_details)));
		CommanUtill.clickFunction(save_Insurance_Approval_details, Save_Company_Details_pop);
	}
    
    public void CloseCompanyDetails_PatientInsuranceApprovalPop(String closeCompanyLabel) throws IOException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            // Wait for popup close button (if it appears)
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Close_Insurance_Approval_details)));

            if (CommanUtill.isElementPresent(Close_Insurance_Approval_details)) {
                CommanUtill.clickFunction(Close_Insurance_Approval_details, closeCompanyLabel);
                System.out.println("Close Company Details Patient Insurance Approval details popup closed.");
            }

        } catch (Exception e) {
            System.out.println("Close Company Details popup did not appear.");
        }   
    }
	
   
	
	
	
	
	
	

	//=====================Bill Details ========================
	public void BillDetailsIconAndClosePop(String Bill_Detail_icon , String Close_Bill_Detail) throws IOException, InterruptedException { 

		WebDriverWait wait =new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Bill_Details_icon)));
		CommanUtill.clickFunction(Bill_Details_icon, Bill_Detail_icon);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Close_Bill_Details)));
		CommanUtill.clickFunction(Close_Bill_Details, Close_Bill_Detail);
	}
	//============================= Surgery Breakup Details ============================

	public void ClickOnSurgeryBreakupDetails(String SurgeryB_reakup_Details) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Surgery_Breakup_Detail_Icon)));
		CommanUtill.clickFunction(Surgery_Breakup_Detail_Icon, SurgeryB_reakup_Details);
	}
	public void RadioSummaryBtn(String Summary_Radio_Btn ) throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Surgery_Break_Summary)));
		CommanUtill.clickFunction(Radio_Btn_Surgery_Break_Summary, Summary_Radio_Btn);
	}
	public void RadioDetailsBtn(String Details_Radio_Btn ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Surgery_Break_Details)));
		CommanUtill.clickFunction(Radio_Btn_Surgery_Break_Details, Details_Radio_Btn);
	}
	public void RadioClubOTComponentBtn(String OT_Radio_Btn ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Surgery_Break_Club_OT_Component)));
		CommanUtill.clickFunction(Radio_Btn_Surgery_Break_Club_OT_Component, OT_Radio_Btn);
	}

	public void CheckBoxDateSurgeryBreakAndFromDate(String Date_Check_Box ,String  From_Date) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Date_Chkk_Surgery_Break, Date_Check_Box);
		WebElement from_Date = driver.findElement(By.xpath(Frome_Date_Surgery_Break));
		from_Date.sendKeys(Keys.CONTROL+"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Frome_Date_Surgery_Break, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}

	public void ToDateSurgeryBreak( String To_Date_) throws IOException, InterruptedException { 

		WebElement To_Date = driver.findElement(By.xpath(To_Date_Surgery_Break));
		To_Date.sendKeys(Keys.CONTROL+"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(To_Date_Surgery_Break, To_Date_);
		To_Date.sendKeys(Keys.TAB);
	}
	public void PrintSurgeryDetails(String print) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Print_Surgery_Break, print);
	}

	//=======================Bill Genrate ====================

	public void BillGenrateIcon(String Bill_Genreate) throws IOException, InterruptedException {

		WebElement element = driver.findElement(By.xpath(Bill_Genrate_Icon));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);

		Thread.sleep(500);
		try {
			CommanUtill.clickFunction(Bill_Genrate_Icon, Bill_Genreate);
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", element);
		}
	}

	public void BillGenrateReasonTxtAndYesBtn(String Reason_Text , String Yes_pop) throws IOException, InterruptedException { 

		new WebDriverWait(driver,Duration.ofSeconds(15));
		if (CommanUtill.isElementPresent(Bill_Genrate_Reason_txt)) {
			CommanUtill.textEnter(Bill_Genrate_Reason_txt, Reason_Text);
			System.out.println("Bill Generate Reason Remaks Text Enter Pop");
		} else {
			System.out.println("Bill Generate Reason Remaks Text Enter Pop did not appear.");
		}
		
		if (CommanUtill.isElementPresent(Save_Reason_Bill_Genrate_pop)) {
			CommanUtill.clickFunction(Save_Reason_Bill_Genrate_pop, Yes_pop);
			System.out.println("Bill Generate Reason Yes Pop");
		} else {
			System.out.println("Bill Generate Reason Yes Pop did not appear.");
		}	
	}
	public void YespopsureGeneratepatientAndDischargePop(String sure_Yes_pop, String Discharge_Ok_pop) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sure_generate_pop)));
		CommanUtill.clickFunction(sure_generate_pop, sure_Yes_pop);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Ok_Discharge_pop)));
		CommanUtill.clickFunction(Ok_Discharge_pop, Discharge_Ok_pop);
	}

	//===========================Bill Settlement==============================

	public void AfterDischargeOkPop(String Discharged_Patient_pop) throws IOException, InterruptedException { 

		if (CommanUtill.isElementPresent(Ok_Discharged_pop)) {
			CommanUtill.clickFunction(Ok_Discharged_pop, Discharged_Patient_pop);
			System.out.println("After Bill Genrate Patent Pop");
		} else {
			System.out.println("After Bill Genrate Pop did not appear.");
		}	
	}

	public void ClickOnBillSettlementIcon(String  Bill_Settlement) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Bill_Settlement_Icon)));
		CommanUtill.clickFunction(Bill_Settlement_Icon, Bill_Settlement);  
	}
	public void BillSettlementReasonAndSavePop (String Reason_txt , String save_Reason)throws IOException, InterruptedException { 

		new WebDriverWait(driver, Duration.ofSeconds(10));
		if (CommanUtill.isElementPresent(Bill_Settlement_Reason_txt)) {
			CommanUtill.textEnter(Bill_Settlement_Reason_txt, Reason_txt);
			System.out.println("Bill Settlement ReasonText Pop");
		} else {
			System.out.println("Bill Settlement ReasonText did not appear.");
		}	

		if (CommanUtill.isElementPresent(Bill_Settlement_Reason_Yes)) {
			CommanUtill.clickFunction(Bill_Settlement_Reason_Yes, save_Reason);
			System.out.println("Bill Settlement Reason Save Btn Pop");
		} else {
			System.out.println("Bill Settlement Reason Save Btn Pop did not appear.");
		}	
	}

	public void BillSettlementReamrks(String Remarks_text) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Bill_Settl_Remarks, Remarks_text);
	}

	public void EditAndReceivedFrom(String Edit_btn , String Received_From) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Bill_Settl_Edit, Edit_btn);
		CommanUtill.textEnter(Bill_Settl_Received_From, Received_From);

	}
	//================================Due ===========================

	public void BillDueAmount(String Amount) throws IOException, InterruptedException { 

		WebElement amount = driver.findElement(By.xpath(Bill_Settl_Amount_Cash)); 
		amount.sendKeys(Keys.CONTROL + "a");
		amount.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Bill_Settl_Amount_Cash, Amount);  
	}
	public void ClickOnDueIcon_AuthorisedBy_Ramarks(String Due_Icon ,String Authorised_by_Drp , String Remarks_Text) 
			throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Bill_Settl_Due_Icon, Due_Icon);
		CommanUtill.dropdownSelectByVisibleText(Bill_Settl_Due_Authorised, Authorised_by_Drp);
		CommanUtill.textEnter(Bill_Settl_Due_Remaks, Remarks_Text);
	}

	public void MOPInChequeInformation(String Cheque_Icon , String Cheque_No , String Issue_Date , String Bank_Name_Drp , 
			String Branch_Name , String Amount ,String Authorised_By_Drp) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Bill_Settl_Cheque_Btn, Cheque_Icon);
		CommanUtill.textEnter(Cheeque_No, Cheque_No);
		WebElement date = driver.findElement(By.xpath(Cheeque_Issue_date)); 
		date.sendKeys(Keys.CONTROL + "a");
		date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Cheeque_Issue_date, Issue_Date);  
		date.sendKeys(Keys.TAB);
		CommanUtill.dropdownSelectByVisibleText(Cheeque_Bank_Name_Drp, Bank_Name_Drp);
		CommanUtill.textEnter(Cheeque_Branch, Branch_Name);
		CommanUtill.textEnter(Cheeque_Amount, Amount);
		CommanUtill.dropdownSelectByVisibleText(Cheeque_Authorised_By_Dp, Authorised_By_Drp);
	}

	//==================== Bill settlement cancel =========================
	public void BillSettlementCancelInformation(String Billsettlementcancel_Btn ,String Authorised_By_Drp ,  String Cancel_Remaks_tet , 
			String Save_Authorization) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Cancel_Bill_Settl_Btn, Billsettlementcancel_Btn);
		CommanUtill.dropdownSelectByVisibleText(Cancel_Bill_Authorised_By_drp, Authorised_By_Drp);
		CommanUtill.textEnter(Cancel_Bill_Settl_Remarks, Cancel_Remaks_tet);
		CommanUtill.clickFunction(Cancel_Bill_Settl_Save, Save_Authorization);

	}
	//===========================Save Bill Settlement =======================
	public void SaveBillSettlementBtn(String Save , String Yes_Bill_sett , String Bill_Settled) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Save_Bill_Settlement, Save);
		CommanUtill.clickFunction(Save_Bill_Settlement_Yes_Pop, Yes_Bill_sett);
		CommanUtill.clickFunction(Save_Bill_Settlement_Receiptno, Bill_Settled);
	}
	
	//=====================Print ==================================
	
	public void PrintInSummaryDetails(String Print_Icon , String Check_Box_Summary , String Yes_Print_Icons) 
			throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Print_Btn)));
		CommanUtill.clickFunction(Print_Btn, Print_Icon);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Summary_Bill_Radio_Btn)));
		CommanUtill.clickFunction(Summary_Bill_Radio_Btn, Check_Box_Summary);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Yes_Print_Icons)));
		CommanUtill.clickFunction(Yes_Print_Icon, Yes_Print_Icons);
	}
	
	public void ClickOnBillMenuIcon(String menu_icon) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(bill_Menu)));
		CommanUtill.clickFunction(bill_Menu, menu_icon);
	}
	
// New Excel Sheet ===================== Add On Bill ===========================
	// First Radio button  Generate Add-On Bill
	
	public void ClickOnAddOnBillIcon_RadioBtnGeneateAddonBillIfrormation(String Add_on_bill_Btn ,String Radio_Generate_Add_on_bill ,
			String Yes_Add_on_Bill , String Yes_Pop_This_transaction_CantNot_Reverted ) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_on_Bill_btn)));
		CommanUtill.clickFunction(Add_on_Bill_btn, Add_on_bill_Btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(radio_btn_Generate)));
		CommanUtill.clickFunction(radio_btn_Generate, Radio_Generate_Add_on_bill);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Yes_Generate_Add_On_bill_pop)));
		CommanUtill.clickFunction(Yes_Generate_Add_On_bill_pop, Yes_Add_on_Bill);
		
		if(CommanUtill.isElementPresent(Yes_Generate_Cannot_Reverted_pop)) {
			CommanUtill.clickFunction(Yes_Generate_Cannot_Reverted_pop, Yes_Pop_This_transaction_CantNot_Reverted);
			System.out.println("Yes Pop This transaction CantNot Reverted");
		}
		else {
			System.out.println("Yes Pop This transaction CantNot Reverted Did Not Apperas");
		}
	}
	// Second Radio button Settle Add-On Bill
	public void ClickOnAddOnBill_SettleAddOnBillRadioBtnInformation(String Add_On_Bill_Icon , String Settle_Add_On_Bill_Radio_Btn ,
			String Settle_Yes_pop) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_on_Bill_btn)));
		CommanUtill.clickFunction(Add_on_Bill_btn, Add_On_Bill_Icon);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Settle_Radio_Btn)));
		CommanUtill.clickFunction(Settle_Radio_Btn, Settle_Add_On_Bill_Radio_Btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Yes_Generate_Add_On_bill_pop)));   //Same Xpath in Yes Pop
		CommanUtill.clickFunction(Yes_Generate_Add_On_bill_pop, Settle_Yes_pop);
	}
	// Not Working in Due 
	public void DueInBillSettlement_EnterAmount_AuthorisedDrp(String Enter_Due_Amount , String Click_On_Due_Icon , String AuthorisedDrp) 
			throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Settle_IP_Add_On_Bill_Settlementpop_Enter_Amount)));
		CommanUtill.textEnter(Settle_IP_Add_On_Bill_Settlementpop_Enter_Amount, Enter_Due_Amount);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Due_Icon)));
		CommanUtill.clickFunction(Click_Due_Icon, Click_On_Due_Icon);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AuthorisedDrp)));
		CommanUtill.dropdownSelectByVisibleText(Redues_Actual_Amount_Authorised_drp, AuthorisedDrp);
	}
	
	public void SaveAddOnReceiptIPBillingBillSettlement(String Recepit_Save_Icon , String Receipt_Yes_Pop , String Receipt_no_Ok_pop) 
			throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Receipt_Icon_Save)));
		CommanUtill.clickFunction(Receipt_Icon_Save, Recepit_Save_Icon);
		
		if(CommanUtill.isElementPresent(Receipt_Save_Yes_Pop)) {
			CommanUtill.clickFunction(Receipt_Save_Yes_Pop, Receipt_Yes_Pop);
			System.out.println("Receipt Save Yes Pop");
		}
		else {
			System.out.println("Receipt Save Yes Pop Did Not Pop Appears");
		}	
		if(CommanUtill.isElementPresent(Receipt_Save_Yes_Receipt_no_Ok_Pop)) {
			CommanUtill.clickFunction(Receipt_Save_Yes_Receipt_no_Ok_Pop, Receipt_no_Ok_pop);
			System.out.println("Receipt Number Ok Pop");
		}
		else {
			System.out.println("Receipt Number Ok  Pop Did Not Pop Appears");
		}	
	}
	
	//Third Radio button Print Add-On Bill
	public void PrintradioBtnAddOnBill(String Add_on_bill_icon ,String Print_Radio_btn , String Print_Yes_pop) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_on_Bill_btn)));
		CommanUtill.clickFunction(Add_on_Bill_btn, Add_on_bill_icon);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(radio_Btn_Print_Add_On_Bill)));
		CommanUtill.clickFunction(radio_Btn_Print_Add_On_Bill, Print_Radio_btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Yes_Generate_Add_On_bill_pop)));
		CommanUtill.clickFunction(Yes_Generate_Add_On_bill_pop, Print_Yes_pop);
		
	}
	
	
	
	

}
