/**
 * 
 */
package com.test.IpBilling.Page;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import javax.management.InvalidApplicationException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 09-Feb-2026
 */
public class IpBillingPage extends GeneralBrowserSetting {

	public static String storedUHID;
	public static String storedIPNo;

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

	protected static String  Discharged_Successfully_Ok_pop = "//a[@id='PopupOK']";
	//=====================Cancel Discharge =============================
	protected static String  Cancel_Discharged_Icon = "//a[@id='btnCancelDischarge']";
	protected static String  Cancel_Discharged_Reason = "//input[@id='_resonofCancel']";
	protected static String  Cancel_Discharged_Reason_Yes = "//a[@id='btnYesCancelDischargeMSGModal']";
	protected static String  Yes_Btn_Cancel_Discharged_notification = "//a[@id='PopupYesCancelClinicalDischarge']//i[@class='fa fa-check']";
	protected static String  No_Btn_Cancel_Only_Discharged = "//a[@id='PopupNoCancelClinicalDischarge']//i[@class='fa fa-ban']";

	//==============================Bill Ready Icon ================================

	protected static String Bill_Ready_Icon = "//i[@class='fa fa-check-square']";
	protected static String Bill_Ready_Yes_pop = "//a[@id='btnYesBillReadyMSGModal']";
	protected static String Cancel_Bill_Ready_Yes_pop = "//a[@id='btnYesBillReadyMSGModal']";
	//=================Cancel Bill Ready Btn ==============================

	protected static String Cancel_Bill_Ready_Btn = "//a[@id='btnBillReady' and @title='Cancel Bill Ready']";
	protected static String Cancel_Bill_Ready_Yes_Pop = "//a[@id='btnYesBillReadyMSGModal']";

	//===================== Edit Financial Details =================================

	protected static String Edit_Financial_Details_Icon = "//a[@id='btnfinancialdetails']";
	protected static String Bill_Financial_Refesh = "//a[@id='btnIPBillingFinancialDetails_ModalRefresh']//i[@class='fa fa-refresh']";
	protected static String Bill_Financial_close = "//a[@id='btnIPBillingFinancialDetails_ModalClose']//i[@class='fa fa-times']";
	protected static String Bill_Financial_Update = "//a[@id='btnIPBillingFinancialDetails_ModalModify']//i[@class='fa fa-pencil-square-o']";
	protected static String Bill_Financial_Save = "//div[@id='IPBillingFinancialDetails_Modal']//div[@class='popup-icon-top']//span[1]";

	protected static String Different_Billable_Reason_Drp_Pop = "//select[@id='cmbReason']";
	protected static String Different_Billable_Authorised_Drp_Pop = "//select[@id='cmbAuthorisedBy']";
	protected static String Different_Billable_Remarks_Pop = "//textarea[@id='TxtRemarks']";
	protected static String Different_Billable_Yes_Pop = "//a[@id='btnYesReason']";

	protected static String Bill_Financial_Cash_Radio_btn = "//input[@id='rbCash']";
	protected static String Bill_Financial_Company_Radio_btn = "//input[@id='rbCredit']";
	protected static String Bill_Financial_Company_Type_Drp = "//select[@id='cmbcompanychannel']";
	protected static String Bill_Financial_Company_Drp = "//select[@id='cmbmaincompany']";
	protected static String Bill_Financial_Rate_contract_Drp = "//select[@id='ddCompany']";
	//===================== Document Check List Pop ========================
	protected static String Close_Document_Check_List_pop  = "//a[@id='btnCloseTwoAreaPopup']//i[@class='fa fa-times']";
	protected static String Close_Scheme_For_Patint_pop  = "//a[@id='btnCloseScheme']//i[@class='fa fa-times']";

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

	protected static String Patient_Insurance_Table = "//table[@id='tblCompanyDetails']//tbody//tr[1]";  //Print
	protected static String Patient_Insurance_Table_Deductible = "//table[@id='tblCompanyDetails']//tbody//tr[2]//td[5]//input[@id='companyapprovaldeductible']";
	protected static String Patient_Insurance_Table_Priority_Drp = "//table[@id='tblCompanyDetails']//tbody//tr[2]//td[6]//select[@id='companyapprovalpriority']";
	protected static String Patient_Insurance_Table_Approved_Chkk = "//table[@id='tblCompanyDetails']//tbody//tr[2]//td[7]//input[@id='companyapprovalapproved']";

	//=====================Deposit Refund Details ============================
	protected static String Deposit_Refund_Details_Icon = "//a[@id='btndepref']";
	protected static String Radio_Btn_Deposits = "//input[@id='radioDeposit']";
	protected static String Radio_Btn_Receipts = "//input[@id='radioReceipts']";
	protected static String Radio_Btn_Refund = "//input[@id='radioRefunds']";
	protected static String Close_Deposit_Refund_Details = "//a[@id='DepositRefundModelClose']//i[@class='fa fa-times']";


	//=====================Bill Details ========================
	protected static String Bill_Details_icon = "//a[@id='btnBillDetails']//i[@class='fa fa-file-text-o']";
	protected static String Close_Bill_Details = "//a[@id='BillDetailsModelClose']//i[@class='fa fa-times']";
	protected static String displayServiceRows = "//table[@id='tblserviceDetails']//tbody/tr";
	protected static String serviceRows = "//table[@id='tblservicewiseDetails']//tbody/tr[@data-serviceid]";

	//=======================Package Bill Details================================
	protected static String Package_Bill_Details = "//a[@id='btnPkgBilldet']";
	protected static String Close_Package_Bill_Details = "//a[@id='BillDetailsModelClose']//i[@class='fa fa-times']";



	//============================= Surgery Breakup Details ============================

	protected static String Surgery_Breakup_Detail_Icon = "//i[@class='fa fa-sign-language']";
	protected static String Radio_Btn_Surgery_Break_Summary  = "//input[@id='_breakupbillSummary']";
	protected static String Radio_Btn_Surgery_Break_Details = "//input[@id='_breakupbillDetail']";
	protected static String Radio_Btn_Surgery_Break_Club_OT_Component = "//input[@id='_breakupbillClub']";
	protected static String Date_Chkk_Surgery_Break = "//input[@id='daterangesurgery']";
	protected static String Frome_Date_Surgery_Break = "//input[@id='_frmdatesurgery']";
	protected static String To_Date_Surgery_Break = "//input[@id='_todatesurgery']";
	protected static String Print_Surgery_Break = "//a[@id='_breakupBiillPrint']//i[@class='fa fa-print']";

	//=======================Pending Investigation ==================================
	protected static String Pending_Investigation = "//a[@id='btnpending']";
	//===================== Discount Type OnTotalBillDiscount ==========================

	protected static String Discount_btn = "//a[@id='btnDiscount']";
	protected static String Scheme_Check_Box_Btn = "//input[@id='ChkSchemeDiscount']";
	protected static String radio_Btn_Total_Bill_Discount = "//input[@id='rbtTotalBillDiscount']";
	protected static String Discount_Amount_On_Bill = "//input[@id='txtTotalDiscount']";
	protected static String Discount_Percentage = "//input[@id='txtDiscountPer']";
	protected static String Discount_Head_Drp = "//select[@id='CmbDiscountHeadDiscount']";
	protected static String Discount_Reason_Drp = "//select[@id='cmbDiscountReasonDiscount']";
	protected static String Discount_Remarks = "//textarea[@id='txtDiscountRemarks']";
	protected static String Click_Discount_Perctange_Btn = "//a[@id='CalculateDiscount']";
	protected static String Alert_Applied_Discount = "//input[@id='CalculatedPer']";
	protected static String Discount_Authorised_By = "//select[@id='cmbApproveByDiscount']";
	protected static String Delete_total_Bill_Discount = "//a[@id='btnDeleteIPBillingBillDiscountMSG_Modal']//i[contains(@class,'fa-times')]";
	protected static String Delete_total_Bill_Discount_Remarks = "//textarea[@id='txtDiscountDeleteReason']";
	protected static String Delete_total_Bill_Discount_Remarks_Yes = "//a[@id='IPBillingDeleteDiscountPopupforMessageOK']//i[@class='fa fa-check']";
	protected static String Save_total_Bill_Discount = "//a[@id='btnSaveIPBillingBillDiscountMSG_Modal']//i[contains(@class,'fa fa-save')]";
   //======================================Delete Scheme =============================================
	protected static String Delete_Discount_btn = "//a[@id='btnDeleteIPBillingBillDiscountMSG_Modal' and @title='Delete']";
	protected static String Delete_Discount_Reason_pop = "//textarea[@id='txtDiscountDeleteReason']";
	protected static String Delete_Discount_Reason_Yes_pop = "//a[@id='IPBillingDeleteDiscountPopupforMessageOK']//i[@class='fa fa-check']";
	
	//====================Service Wise Discount ================================

	protected static String service_Wise_Discount_Radio_Btn = "//input[@id='rbtServiceDiscount']";
	//========================Item Wise Discount ============================

	protected static String Item_Wise_Discount_Radio_Btn = "//input[@id='rbtItemWiseDiscount']";
	protected static String Item_Service_Drp = "//select[@id='CmbServicesDiscount']";
	//======================Ip Packag Details=============================
	protected static String IPPackage_Details = "//a[@id='btnIPPackagedetails']";
	protected static String Scrolling = "//div[@id='itemlist']";
	protected static String Ip_Package_Speciality_Drp  = "//select[@id='_packagedetails_speciality']";
	protected static String PackageStart_Date_Time_pop  = "//input[@id='packagedetails_startdate']";
	protected static String Close_Pop_PackageStart = "//a[@id='btnClosePackageDetail']//i[@class='fa fa-times']";
	//Ip Package Details WebElement In Package Modification Page Found Test Case 12



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
	protected static String Cancel_Bill_Selement_Btn = "//i[@class='fa fa-times-circle']"; 
	protected static String Cancel_Bill_Selement_Authorised_Drp = "//select[@id='_authby']"; 
	protected static String Cancel_Bill_Selement_Authorised_Remarks = "//textarea[@id='_authbyremarks']"; 
	protected static String Cancel_Bill_Selement_Authorization_Save_Pop = "//a[@id='Savecancelsettelment']//i[@class='fa fa-save']"; 
	protected static String Close_Bill_Settlement_Pop = "//a[@id='btnCloseIPBillingBillSettlementMSG_Modal']//i[@class='fa fa-times']"; 
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
	protected static String Summary_Bill_Radio_Btn = "//input[@id='rbtinterimsummarybill']";
	protected static String Yes_Print_Icon = "//a[@id='btnIPBillingInterimBillMSG_ModalOK']";

	//===============================Bill Menu ==============================

	protected static String bill_Menu = "//img[@id='showmenuIcon']";

	//================================Add On Bill ===========================================
	protected static String Add_Discharged_Reason_pop = "(//input[@class='otp-input2'])[1]";
	protected static String Add_Discharged_Reason_Yes_pop = "//div[@id='SearchMasterModal2']//i[@class='fa fa-check']";
	protected static String discharged_ok_pop = "//a[@id='PopupOK_discharge']";

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
	//====================================Add On Remarks ================================

	protected static String Add_Remarks_Plush_Icon = "//img[@title='Add Remarks']";
	protected static String Printable_Remarks_Text = "//textarea[@id='_remark']";
	protected static String Printable_Remarks_Save = "//label[@id='_printRemarkSave']//i[@class='fa fa-save']";
	protected static String Add_RemarksText = "//textarea[@id='txtAddIPBillRemarks']";
	protected static String Click_Add_Remarks_Save_pop = "//a[@id='IPBillingRemarksAddOK']//i[@class='fa fa-check']";
	//===============================Patient Document ==================================

	protected static String Patient_Document_Icon = "//i[@title='Patient Document']//img";
	protected static String Radio_Btn_MOU = "//input[@id='rbtmou']";
	protected static String Radio_Btn_Patient_Document = "//input[@id='rbtdoc']";

	protected static String Document_Type = "//select[@id='drddocType1']";
	protected static String Click_Document_Dicon_Icon = "//i[@title='Dicom document ']";

	protected static String Dicom_Document_pop_Document_name = "//input[@id='docName1']";
	protected static String Dicom_Document_pop_Document_Type = "//select[@id='drdpopupdocType1']";
	protected static String Dicom_Document_pop_Choose_File = "//input[@id='fileNameDicom']";
	protected static String Dicom_Document_pop_Save = "//a[@id='Upload_Image']//i[@class='fa fa-save']";
	protected static String Close_Documents_pop = "//a[@id='btnNoIPBillingMOUMSG_Modal']//i[@class='fa fa-times']";

	//==============================Non Payable ==========================
	protected static String Click_Non_Payable_Btn = "//i[@class='fa fa-money']";
	protected static String Non_Payable_Service_Drp = "//select[@id='ddlNonPayableServices']";
	protected static String Save_Non_Payable_Services_Pop = "//a[@id='btnSaveNonPayableServices']//i[@class='fa fa-save']";
	protected static String Modify_Non_Payable_Services_Pop = "//a[@id='btnUpdateNonPayableServices']//i[@class='fa fa-edit']";
	protected static String Close_Non_Payable_Services_Pop = "//a[@class='closediv']//i[@class='fa fa-times']";
	protected static String Service_Table = "//table[@id='tblNonPayableServices']";
	protected static String Service_Table_Top = "//table[@id='tblNonPayableServices']//tr[1]//td[2]//input";
	protected static String Service_Table_Second = "//table[@id='tblNonPayableServices']//tr[2]//td[2]//input";





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

	public void CheckBoxAdmission_Discharge(String Admission_DisCharge) throws IOException ,InterruptedException {

		WebDriverWait Admission_Date_Chkk = new WebDriverWait(driver, Duration.ofSeconds(15));
		Admission_Date_Chkk.until(ExpectedConditions.elementToBeClickable(By.xpath(In_patient_Discharge_Admision_chkk_box_pop)));
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

	public void EnterFirstNameCurrentPatint(String FirstName ) throws IOException ,InterruptedException{

		WebDriverWait name =new WebDriverWait(driver, Duration.ofSeconds(10));
		name.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_Name_Serach)));
		CommanUtill.textEnter(first_Name_Serach, FirstName);	
	}

	public void SerachAndselectPatientInTable(String Last_Row) throws IOException ,InterruptedException {

		WebDriverWait TableLast_Patient = new WebDriverWait(driver, Duration.ofSeconds(10));
		TableLast_Patient.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(find_patient_last_table)));
		String Last_Row_Print = driver.findElement(By.xpath(find_patient_last_table)).getText();
		logger.info("================Last Row Print Patient==================");
		logger.info(Last_Row_Print);
		System.out.println("Click On Last Row : " + Last_Row_Print);
		CommanUtill.clickFunction(find_patient_last_table, Last_Row);

	}
	public void SerachAndselectPatientInTable1(String Last_Row) throws IOException ,InterruptedException {

		WebDriverWait TableLast_Patient = new WebDriverWait(driver, Duration.ofSeconds(10));
		TableLast_Patient.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(find_patient_last_table)));
		String Last_Row_Print = driver.findElement(By.xpath(find_patient_last_table)).getText();

		storedUHID = driver.findElement(By.xpath(find_patient_last_table + "//td[2]")).getText();
		storedIPNo = driver.findElement(By.xpath(find_patient_last_table + "/td[3]")).getText();

		System.out.println("Click On Last Row : " + Last_Row_Print);
		System.out.println("Stored UHID : " + storedUHID);
		System.out.println("Stored IP No : " + storedIPNo);
		logger.info("================Last Row Print Patient==================");
		logger.info(Last_Row_Print);
		logger.info("Stored UHID : " + storedUHID);
		logger.info("Stored IP No : " + storedIPNo);
		CommanUtill.clickFunction(find_patient_last_table, Last_Row);
		logger.info("Clicked Last Row Successfully");
	}

	//========================Discharge Patient Search =============================

	public void RadioBtnDischargedPatients(String Discharged_Patients) throws IOException ,InterruptedException { 

		WebDriverWait DischargedPatients = new WebDriverWait(driver, Duration.ofSeconds(10));
		DischargedPatients.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Rdio_Btn_Discharged_Patients)));
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

		WebDriverWait Search_Icon = new WebDriverWait(driver,Duration.ofSeconds(10));
		Search_Icon.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Find_Patient_Serach_Icon)));
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serch_Icon);

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
	public void EnterIpNumberInBillingPage(String ip_no) throws IOException ,InterruptedException { 
		
		WebDriverWait ip = new WebDriverWait(driver, Duration.ofSeconds(10));
		ip.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Ip_Number)));
		CommanUtill.textEnter(Enter_Ip_Number, ip_no);
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

	public void ClickOnDischargeIconBtn(String Discharge_Icon) 
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		try {

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Discharge_icon)));

			System.out.println("Discharge Button is CLICKABLE");

			CommanUtill.clickFunction(Click_Discharge_icon, Discharge_Icon);

		} catch (TimeoutException e) {

			System.out.println(" Discharge Button is STILL NOT CLICKABLE");

		}
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
	public void YesDischarageReasonPop_AndConformationYesPop(String Discharge_Reason_Singn_pop , String Yes_pop) 
			throws IOException, InterruptedException {

		WebDriverWait Discharge_Pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		Discharge_Pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Discharge_Singn_pop)));
		CommanUtill.clickFunction(Discharge_Singn_pop, Discharge_Reason_Singn_pop);

		Discharge_Pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Discharge_Singn_Yes_pop)));
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

	//===================== Cancel Discharge =============================

	public void CancelDischargeIcon(String Cancel_Discharge) throws IOException, InterruptedException {

		WebDriverWait cancelDischarge = new WebDriverWait(driver, Duration.ofSeconds(10));
		cancelDischarge.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Cancel_Discharged_Icon)));
		CommanUtill.clickFunction(Cancel_Discharged_Icon, Cancel_Discharge);
	}
	public void CancelDischargeReasonAndYesPop(String Reason_Text , String CancelDischarge_Yes_pop) 
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement Reason = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Cancel_Discharged_Reason)));

		if (Reason.isDisplayed()) {
			System.out.println("Reason Cancel Discharge Text");
			CommanUtill.textEnter(Cancel_Discharged_Reason, Reason_Text);
		}

		WebElement yesBtn = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@id='btnYesCancelClinicalDischargeMSGModal']")));

		yesBtn.click();
	}

	public void YesBtnCancelDischargedNotification(String Yes_Btn) throws IOException , InterruptedException{

		WebDriverWait Yes_pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		Yes_pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Yes_Btn_Cancel_Discharged_notification)));
		CommanUtill.clickFunction(Yes_Btn_Cancel_Discharged_notification, Yes_Btn);

	}
	public void NoBtnCancelOnlyDischargedAndCancelBillReady(String No_Btn) throws IOException , InterruptedException{

		WebDriverWait Yes_pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		Yes_pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(No_Btn_Cancel_Only_Discharged)));
		CommanUtill.clickFunction(No_Btn_Cancel_Only_Discharged, No_Btn);

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

	//===================Cancel Bill Ready ========================

	public void CancelBillReadyAndYesPop(String CancelBillReady , String Cancel_billReady_Yes_pop)
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Cancel_Bill_Ready_Btn)));
		CommanUtill.clickFunction(Cancel_Bill_Ready_Btn, CancelBillReady);
		CommanUtill.clickFunction(Cancel_Bill_Ready_Yes_Pop, Cancel_billReady_Yes_pop);
	}

	//==========================Financial Detail Modification ==============================

	public void EditFinancialDetailModificationIcon(String Financial_Edit) throws IOException, InterruptedException {

		WebDriverWait Edit_Financial_Icon = new WebDriverWait(driver , Duration.ofSeconds(10));
		Edit_Financial_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Edit_Financial_Details_Icon)));
		CommanUtill.clickFunction(Edit_Financial_Details_Icon, Financial_Edit);
	}
	public void UpdateFinancialDetailModificationIcon(String Financial_Edit) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Bill_Financial_Update, Financial_Edit);
	}

	public void CompanyInsuranceRadioBtn(String Company_Insurance) throws IOException, InterruptedException {

		WebDriverWait RadioBtn_Insurance = new WebDriverWait(driver, Duration.ofSeconds(10));
		RadioBtn_Insurance.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Bill_Financial_Company_Radio_btn)));
		CommanUtill.clickFunction(Bill_Financial_Company_Radio_btn, Company_Insurance);	
	}
	public void PaymentCashRadioBtn(String CompanyPop_Cash_Radio_Btn) throws IOException, InterruptedException {

		WebDriverWait RadioBtn_Insurance = new WebDriverWait(driver, Duration.ofSeconds(10));
		RadioBtn_Insurance.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Bill_Financial_Cash_Radio_btn)));
		CommanUtill.clickFunction(Bill_Financial_Cash_Radio_btn, CompanyPop_Cash_Radio_Btn);	
	}

	public void CompanyType_Company_RatecontractDrp(String Company_Type_Drp , String Company_Drp , 
			String Rate_Contract_Drp) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Company_Type_Drp, Company_Type_Drp);
		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Company_Drp, Company_Drp);
		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Rate_contract_Drp, Rate_Contract_Drp);
	}
	public void CloseDocumentCheckListPop(String Scheme_Pop) throws IOException, InterruptedException {

		try {
			WebDriverWait Document_CheckList = new WebDriverWait(driver, Duration.ofSeconds(5));

			Document_CheckList.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Close_Document_Check_List_pop)));
			CommanUtill.clickFunction(Close_Document_Check_List_pop, Scheme_Pop);
			System.out.println("Closed Document Check List Pop");

		} catch (TimeoutException e) {
			System.out.println("Document Check List Pop did not appear");
		}
	}
	public void CloseSchemeForPatientPop(String Scheme_Pop) throws IOException, InterruptedException {

		try {
			WebDriverWait SchemePatient = new WebDriverWait(driver, Duration.ofSeconds(10));
			SchemePatient.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Close_Scheme_For_Patint_pop)));
			CommanUtill.clickFunction(Close_Scheme_For_Patint_pop, Scheme_Pop);
			System.out.println("Close Scheme For Patient Pop");
		}
		catch (TimeoutException e) {
			System.out.println("Did Not Scheme For Patient Pop");
		}

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

		WebElement PanNumber = driver.findElement(By.xpath(Bill_Financial_Pan_No));
		PanNumber.sendKeys(Keys.CONTROL + "a");
		PanNumber.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Bill_Financial_Pan_No, PAN_No);
		CommanUtill.clickFunction(Bill_Financial_Account_Inf_Save, Save);
		Thread.sleep(3000);
	}
	public void SchemeCheckBoxAndDrp(String Scheme_Chkk , String Scheme_Drp ) throws IOException, InterruptedException {

		WebElement Scheme_Check_Box = driver.findElement(By.xpath(Bill_Financial_Scheme_Check_Box));
		if (! Scheme_Check_Box.isSelected()) {
			CommanUtill.clickFunction(Bill_Financial_Scheme_Check_Box, Scheme_Chkk);
		}
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

		WebDriverWait save_Icon = new WebDriverWait(driver, Duration.ofSeconds(15));
		save_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Bill_Financial_Save)));
		CommanUtill.clickFunction(Bill_Financial_Save, Save_Financial_Details);
	}
	public void ReasonDifferentBillableTypesPop(String reasonValue, String authorisedByValue, String remarksValue, String yesButtonName)
			throws IOException, InterruptedException {

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Different_Billable_Reason_Drp_Pop)));
			System.out.println("Different Billable Type Popup Appeared");
			CommanUtill.dropdownSelectByVisibleText(Different_Billable_Reason_Drp_Pop, reasonValue);
			CommanUtill.dropdownSelectByVisibleText(Different_Billable_Authorised_Drp_Pop, authorisedByValue);
			CommanUtill.textEnter(Different_Billable_Remarks_Pop,remarksValue);
			CommanUtill.clickFunction(Different_Billable_Yes_Pop,yesButtonName);

		} catch (TimeoutException e) {
			System.out.println("Different Billable Type Popup NOT Appeared  Continuing");
		}
	}
	//====================Deposit Refund Details ============================
	public void ClickOnDepositRefundDetails(String DepositRefund_Icon , String Radio_Deposit ,String Radio_Receipt ,
			String Radio_Refund , String Close_Deposit_Refund_Pop)throws IOException, InterruptedException {

		try {
			WebDriverWait Deposit_Icon = new WebDriverWait(driver,Duration.ofSeconds(10));
			Deposit_Icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Deposit_Refund_Details_Icon)));
			System.out.println("Clicked Deposit Refund Details Icons");
			CommanUtill.clickFunction(Deposit_Refund_Details_Icon, DepositRefund_Icon);
			CommanUtill.clickFunction(Radio_Btn_Deposits, Radio_Deposit);
			CommanUtill.clickFunction(Radio_Btn_Receipts, Radio_Receipt);
			CommanUtill.clickFunction(Radio_Btn_Refund, Radio_Refund);
			CommanUtill.clickFunction(Close_Deposit_Refund_Details, Close_Deposit_Refund_Pop);

		} catch (TimeoutException e) {
			System.out.println("Not Click Deposit Refund Details Icons");
		}

	}
	//===========================Company Details Thumb Icon===============================
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
	public void SavePatientInsuranceApprovalPop(String Save_Company_Details_pop) throws IOException, InterruptedException { 

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

	public void TablePatientInsuranceApprovalDetails(String Print_Insurance_Header , String Enter_Deductible ,String Priority_Drp , 
			String Approved_Check_Box )throws IOException, InterruptedException {

		WebDriverWait Patent_Insurance_Table = new WebDriverWait(driver, Duration.ofSeconds(10));
		Patent_Insurance_Table.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Patient_Insurance_Table)));

		String Insurance = driver.findElement(By.xpath(Patient_Insurance_Table)).getText();
		logger.info("==============Ptint Patient Insurance Table Header===================");
		logger.info(Insurance);
		System.out.println("Print Patient Insurnace Table Header : " + Insurance);

		CommanUtill.textEnter(Patient_Insurance_Table_Deductible, Enter_Deductible);
		CommanUtill.dropdownSelectByVisibleText(Patient_Insurance_Table_Priority_Drp, Priority_Drp);
		CommanUtill.clickFunction(Patient_Insurance_Table_Approved_Chkk, Approved_Check_Box);
	}


	//=====================Bill Details ========================
	public void BillDetailsIcon(String Bill_Detail_icon ) throws IOException, InterruptedException { 

		WebDriverWait wait =new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Bill_Details_icon)));
		CommanUtill.clickFunction(Bill_Details_icon, Bill_Detail_icon);
	}

	public void clickAllDisplayAndServiceRows(String fieldName) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Wait for 1st table
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath(displayServiceRows)));

		List<WebElement> displayList = driver.findElements(By.xpath(displayServiceRows));

		int displayCount = displayList.size();
		int maxLoop = Math.min(displayCount, 10);

		System.out.println("Total Display Service Rows : " + displayCount);
		logger.info("Total Display Service Rows : " + displayCount);

		for (int i = 1; i <= maxLoop; i++) {

			String dynamicDisplayXpath = "(" + displayServiceRows + ")[" + i + "]";

			String displayText = driver.findElement(By.xpath(dynamicDisplayXpath)).getText();

			System.out.println("Clicking Display Row " + i + " : " + displayText);
			logger.info("Clicking Display Row " + i + " : " + displayText);

			CommanUtill.clickFunction(dynamicDisplayXpath, "Display Row " + i);

			Thread.sleep(800); // allow ajax load

			// Wait for 2nd table rows
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath(serviceRows)));

			List<WebElement> serviceList = driver.findElements(By.xpath(serviceRows));

			int serviceCount = serviceList.size();

			System.out.println("Total Service Rows : " + serviceCount);
			logger.info("Total Service Rows : " + serviceCount);

			for (int j = 1; j <= serviceCount; j++) {

				String dynamicServiceXpath = "(" + serviceRows + ")[" + j + "]";

				String serviceText = driver.findElement(By.xpath(dynamicServiceXpath)).getText();

				System.out.println("   Clicking Service Row " + j + " : " + serviceText);
				logger.info("   Clicking Service Row " + j + " : " + serviceText);

				CommanUtill.clickFunction(dynamicServiceXpath, "Service Row " + j);

				Thread.sleep(500);
			}
		}

		logger.info("All Display & Service Rows Clicked Successfully");
	}

	public void BillDetailsClosePop(String Close_Bill_Detai ) throws IOException, InterruptedException { 

		WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Close_Bill_Details)));
		CommanUtill.clickFunction(Close_Bill_Details, Close_Bill_Detai);
	}

	//=======================Package Bill Details================================

	public void ClickOnPackageBillDetails(String Bill_Package_Icon) throws IOException, InterruptedException { 

		WebDriverWait package_icon= new  WebDriverWait(driver,Duration.ofSeconds(10));
		package_icon.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Package_Bill_Details)));
		CommanUtill.clickFunction(Package_Bill_Details, Bill_Package_Icon);
	}
	public void CloseOnPackageBillDetails(String Close_Package_Icon) throws IOException, InterruptedException { 

		WebDriverWait package_icon= new  WebDriverWait(driver,Duration.ofSeconds(10));
		package_icon.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Close_Package_Bill_Details)));
		CommanUtill.clickFunction(Close_Package_Bill_Details, Close_Package_Icon);
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
	public void CheckBoxDateSurgeryBreakAndFromDate(String Date_Check_Box ,String  From_Date) throws IOException, InterruptedException { 

		WebElement Date_CheckBox = driver.findElement(By.xpath(Date_Chkk_Surgery_Break));
		if(! Date_CheckBox.isSelected())
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

	public void PrintSurgeryDetails(String print) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Print_Surgery_Break, print);
	}
	//=======================Pending Investigation ==================================
	public void ClickOnPendingInvestigationIcon(String PendingInvestigation_Btn) throws IOException, InterruptedException { 

		WebDriverWait PendingInvestigation = new WebDriverWait(driver ,Duration.ofSeconds(10));
		PendingInvestigation.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Pending_Investigation)));
		CommanUtill.clickFunction(Pending_Investigation, PendingInvestigation_Btn);
	}

	//===================== Discount Type OnTotalBillDiscount ==========================
	public void ClickOnDiscountIcon(String Discount_Icon)  throws IOException, InterruptedException { 

		WebDriverWait Discount = new WebDriverWait(driver, Duration.ofSeconds(10));
		Discount.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Discount_btn)));
		CommanUtill.clickFunction(Discount_btn, Discount_Icon);
	}
	public void CheckBoxScheme(String Schme) throws IOException, InterruptedException { 

		WebDriverWait schme = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Schme_Check_Box = driver.findElement(By.xpath(Scheme_Check_Box_Btn));
		schme.until(ExpectedConditions.elementToBeClickable(By.xpath(Scheme_Check_Box_Btn)));
		if(! Schme_Check_Box.isEnabled());
		CommanUtill.clickFunction(Scheme_Check_Box_Btn, Schme);
	}
	public void RadioBtnDiscountInTotalBill_Amout(String Radio_Btn_Total_Bill , String Discount_Amount ) 
			throws IOException, InterruptedException { 

		WebDriverWait radio_btn = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Total_Bill_Radio_btn = driver.findElement(By.xpath(radio_Btn_Total_Bill_Discount));
		radio_btn.until(ExpectedConditions.elementToBeClickable(By.xpath(radio_Btn_Total_Bill_Discount)));
		if( ! Total_Bill_Radio_btn.isSelected());
		CommanUtill.clickFunction(radio_Btn_Total_Bill_Discount, Radio_Btn_Total_Bill);

		logger.info("========Discount In Amount Out Of Total Bill =================");
		CommanUtill.textEnter(Discount_Amount_On_Bill, Discount_Amount);
		driver.findElement(By.tagName("body")).click();

	}

	public void EnterDiscountOnTotalBillPercentage(String Discount_Per) throws IOException, InterruptedException { 

		WebElement amount_Remove = driver.findElement(By.xpath(Discount_Amount_On_Bill));
		amount_Remove.sendKeys(Keys.CONTROL + "a");
		amount_Remove.sendKeys(Keys.DELETE);
		logger.info("========Discount In Perctage Out Of Total Bill =================");
		CommanUtill.textEnter(Discount_Percentage, Discount_Per);
		driver.findElement(By.tagName("body")).click();
	}
	public void SelectByDiscountHeadDrp(String Discount_Head , String Discount_Reason) throws IOException, InterruptedException { 

		WebDriverWait discount = new WebDriverWait(driver, Duration.ofSeconds(10));
		discount.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Discount_Head_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Discount_Head_Drp, Discount_Head);
		discount.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Discount_Reason_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Discount_Reason_Drp, Discount_Reason);
	}
	
	public void SelectByDiscountHeadAndReasonValue(int Discount_Head , int Discount_Reason) throws IOException, InterruptedException { 

		WebDriverWait discount = new WebDriverWait(driver, Duration.ofSeconds(10));
		discount.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Discount_Head_Drp)));
		CommanUtill.dropdownSelectByIndex(Discount_Head_Drp, Discount_Head);
		discount.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Discount_Reason_Drp)));
		CommanUtill.dropdownSelectByIndex(Discount_Reason_Drp, Discount_Reason);
	}
	public void EnterDiscountRemarks(String Remaks) throws IOException, InterruptedException {

		CommanUtill.textEnter(Discount_Remarks, Remaks);
	}
	public void ClickCalcuateDiscountBtn(String Click_Discount_Btn) throws IOException, InterruptedException {

		WebDriverWait calculate_btn = new WebDriverWait(driver , Duration.ofSeconds(10));
		calculate_btn.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Discount_Perctange_Btn)));
		CommanUtill.clickFunction(Click_Discount_Perctange_Btn, Click_Discount_Btn);	
	}

	public void AlertTotalAppliedDiscountView(String Get_Value) throws IOException, InterruptedException {

		WebDriverWait value = new WebDriverWait(driver, Duration.ofSeconds(10));
		value.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(By.xpath(Alert_Applied_Discount)), "value"));

		// Get autofilled value
		String totalAppliedDiscount = driver.findElement(By.xpath(Alert_Applied_Discount)).getAttribute("value");

		System.out.println("Total Applied Discount % is: " + totalAppliedDiscount);
		logger.info("Total Applied Discount % is: " + totalAppliedDiscount);
	}
	public void SelectByAuthorisedByDrp(String Authorised_Drp) throws IOException, InterruptedException {

		WebDriverWait Authorised = new WebDriverWait(driver, Duration.ofSeconds(10));
		Authorised.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Discount_Authorised_By)));
		CommanUtill.dropdownSelectByVisibleText(Discount_Authorised_By, Authorised_Drp);
	}
	public void DeleteTotalBillDiscountInformaion(String Delete_Icon , String reason_Text , String Reason_Yes_pop) 
			throws IOException, InterruptedException {

		WebDriverWait delete = new WebDriverWait(driver, Duration.ofSeconds(10));
		delete.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Delete_total_Bill_Discount)));
		CommanUtill.clickFunction(Delete_total_Bill_Discount, Delete_Icon);

		CommanUtill.textEnter(Delete_total_Bill_Discount_Remarks, reason_Text);
		WebDriverWait Reason_yes = new WebDriverWait(driver, Duration.ofSeconds(10));
		Reason_yes.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Reason_Yes_pop)));
		CommanUtill.clickFunction(Delete_total_Bill_Discount_Remarks_Yes, Reason_Yes_pop);
	}
	public void SaveDiscountOnBill(String Save_Btn) throws IOException, InterruptedException {

		WebDriverWait Save = new WebDriverWait(driver, Duration.ofSeconds(10));
		Save.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Save_total_Bill_Discount)));
		CommanUtill.clickFunction(Save_total_Bill_Discount, Save_Btn);
	}
   //============================Delete Discount ============================
	
	public void DeleteDiscountBtn(String Delete_icon) throws IOException, InterruptedException {
		
		WebDriverWait delete = new WebDriverWait(driver, Duration.ofSeconds(10));
		delete.until(ExpectedConditions.elementToBeClickable(By.xpath(Delete_Discount_btn)));
		CommanUtill.clickFunction(Delete_Discount_btn, Delete_icon);
	}
	
	public void ReasonAndYesDeleteDiscountPop(String Reason_Text , String Yes_click) throws IOException, InterruptedException {
		
		WebDriverWait reason_pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		reason_pop.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Delete_Discount_Reason_pop)));
		CommanUtill.textEnter(Delete_Discount_Reason_pop, Reason_Text);
		reason_pop.until(ExpectedConditions.elementToBeClickable(By.xpath(Delete_Discount_Reason_Yes_pop)));
		CommanUtill.clickFunction(Delete_Discount_Reason_Yes_pop, Yes_click);
	}

	//====================Service Wise Discount ================================

	public void CheckBoxUnSelectScheme_ServiceWiseDiscount_RadioBtn(String Un_selet_Schme , String Service_Wise_Radio_btn) throws IOException, InterruptedException { 

		WebDriverWait schme = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Schme_Check_Box = driver.findElement(By.xpath(Scheme_Check_Box_Btn));
		schme.until(ExpectedConditions.elementToBeClickable(By.xpath(Scheme_Check_Box_Btn)));
		if(! Schme_Check_Box.isEnabled());
		CommanUtill.clickFunction(Scheme_Check_Box_Btn, Un_selet_Schme);

		WebDriverWait Service_Wise_Radio = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Service_Wise = driver.findElement(By.xpath(service_Wise_Discount_Radio_Btn));
		Service_Wise_Radio.until(ExpectedConditions.elementToBeClickable(By.xpath(service_Wise_Discount_Radio_Btn)));
		if(! Service_Wise.isSelected());
		CommanUtill.clickFunction(service_Wise_Discount_Radio_Btn, Service_Wise_Radio_btn);

	}
	//========Service Perctage Value
	public void serviceWiseDiscountValidation(String percentage) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tblservicediscount']/tbody/tr"));

		if (rows.size() == 0) {
			System.out.println("No services available for discount");
			return;
		}

		for (int i = 1; i <= rows.size(); i++) {

			// ===== Get Amount =====
			String amountText = driver.findElement(By.xpath("//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[3]")).getText().trim();

			if (amountText.isEmpty())
				continue;
			double amount = Double.parseDouble(amountText);

			// ===== Enter Discount % =====
			WebElement discountPercent = driver.findElement(By.xpath("//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[4]/input"));

			discountPercent.clear();
			discountPercent.sendKeys(percentage);
			discountPercent.sendKeys(Keys.TAB);

			// ===== Wait for Discount Amount Auto Calculation =====
			WebElement discountAmtElement = driver.findElement(By.xpath("//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[5]/input"));
			wait.until(ExpectedConditions.attributeToBeNotEmpty(discountAmtElement, "value"));

			String discountAmtText = discountAmtElement.getAttribute("value").trim();
			double discountAmt = Double.parseDouble(discountAmtText);

			// ===== Get Net Amount =====
			String netAmtText = driver.findElement(By.xpath("//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[6]")).getText().trim();
			double netAmt = Double.parseDouble(netAmtText);

			// ===== Expected Calculation =====
			double percent = Double.parseDouble(percentage);
			double expectedDiscount = (amount * percent) / 100;
			double expectedNet = amount - expectedDiscount;

			// ===== Assertion =====
			Assert.assertEquals(discountAmt, expectedDiscount, 0.5,"Discount Amount mismatch at row " + i);

			Assert.assertEquals(netAmt, expectedNet, 0.5, "Net Amount mismatch at row " + i);

			// ===== Background Color Validation =====
			String bgColor = discountPercent.getCssValue("background-color");
			Assert.assertTrue(bgColor.contains("135") || bgColor.contains("rgb"),"Background color not changed at row " + i);

			System.out.println("Row " + i + " validated successfully.");
		}
	}
	//========Service Perctage Value And Assertion Use
	public void serviceWiseDiscountValidation_1(String percentage) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert softAssert = new SoftAssert();

		List<WebElement> rows = driver.findElements(
				By.xpath("//table[@id='tblservicediscount']/tbody/tr"));

		if (rows.size() == 0) {
			logger.info("No services available for discount");
			return;
		}

		logger.info("------------------------------------------------------------");
		logger.info(String.format("%-5s %-12s %-8s %-15s %-15s %-8s",
				"Row", "Amount", "%", "DiscountAmt", "NetAmt", "Status"));
		logger.info("------------------------------------------------------------");

		for (int i = 1; i <= rows.size(); i++) {

			String amountXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[3]";
			String discountPercentXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[4]/input";
			String discountAmtXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[5]/input";
			String netAmtXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[6]";

			String amountText = driver.findElement(By.xpath(amountXpath)).getText().trim();
			if (amountText.isEmpty())
				continue;

			double amount = Double.parseDouble(amountText);

			// Enter Discount %
			CommanUtill.textEnter(discountPercentXpath, percentage);
			driver.findElement(By.xpath(discountPercentXpath)).sendKeys(Keys.TAB);

			WebElement discountAmtElement = driver.findElement(By.xpath(discountAmtXpath));
			wait.until(ExpectedConditions.attributeToBeNotEmpty(discountAmtElement, "value"));

			double discountAmt = Double.parseDouble(
					discountAmtElement.getAttribute("value").trim());

			double netAmt = Double.parseDouble(
					driver.findElement(By.xpath(netAmtXpath)).getText().trim());

			double percent = Double.parseDouble(percentage);
			double expectedDiscount = (amount * percent) / 100;
			double expectedNet = amount - expectedDiscount;

			boolean rowStatus = true;

			try {
				softAssert.assertEquals(discountAmt, expectedDiscount, 0.5,
						"Discount mismatch at row " + i);

				softAssert.assertEquals(netAmt, expectedNet, 0.5,
						"Net amount mismatch at row " + i);

				String bgColor = driver.findElement(By.xpath(discountPercentXpath))
						.getCssValue("background-color");

				softAssert.assertTrue(bgColor.contains("rgb"),
						"Background color not changed at row " + i);

			} catch (Exception e) {
				rowStatus = false;
			}

			String status = rowStatus ? "PASS" : "FAIL";

			logger.info(String.format("%-5s %-12s %-8s %-15s %-15s %-8s",
					i, amount, percent, discountAmt, netAmt, status));
		}

		logger.info("------------------------------------------------------------");
		logger.info("Service Wise Discount Validation Completed");

		softAssert.assertAll();   
	}
	//----------------Service Amount Discount
	public void serviceWiseDiscountValidation_ByAmount(String discountAmountValue)
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(
				By.xpath("//table[@id='tblservicediscount']/tbody/tr"));

		if (rows.size() == 0) {
			logger.info("No services available for discount");
			return;
		}

		logger.info("--------- Service Wise Discount (By Amount) Validation ---------");

		for (int i = 1; i <= rows.size(); i++) {

			String amountXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[3]";
			String discountPercentXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[4]/input";
			String discountAmtXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[5]/input";
			String netAmtXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[6]";

			String amountText = driver.findElement(By.xpath(amountXpath)).getText().trim();
			if (amountText.isEmpty())
				continue;

			double amount = Double.parseDouble(amountText);

			// 🔥 Enter Discount Amount
			WebElement discountAmtInput = driver.findElement(By.xpath(discountAmtXpath));
			discountAmtInput.clear();
			discountAmtInput.sendKeys(discountAmountValue);
			discountAmtInput.sendKeys(Keys.TAB);

			wait.until(ExpectedConditions.attributeToBeNotEmpty(
					driver.findElement(By.xpath(discountPercentXpath)), "value"));

			double discountAmt = Double.parseDouble(
					driver.findElement(By.xpath(discountAmtXpath))
					.getAttribute("value").trim());

			double netAmt = Double.parseDouble(
					driver.findElement(By.xpath(netAmtXpath))
					.getText().trim());

			double discountPercent = Double.parseDouble(
					driver.findElement(By.xpath(discountPercentXpath))
					.getAttribute("value").trim());

			// ===== Expected Calculation =====
			double enteredDiscount = Double.parseDouble(discountAmountValue);
			double expectedNet = amount - enteredDiscount;
			double expectedPercent = (enteredDiscount * 100) / amount;

			// ===== Assertion =====
			Assert.assertEquals(netAmt, expectedNet, 0.5,
					"Net Amount mismatch at row " + i);

			Assert.assertEquals(discountPercent, expectedPercent, 0.5,
					"Discount % mismatch at row " + i);

			logger.info("Row " + i + " PASS → Amount: " + amount +
					" | DiscountAmt: " + discountAmt +
					" | %: " + discountPercent +
					" | Net: " + netAmt);
		}

		logger.info("--------- Validation Completed ---------");
	}

	//===============Service Amount And Perctage Both =============================
	public void serviceWiseDiscountValidation(String mode, String value)
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert softAssert = new SoftAssert();
		Random random = new Random();

		List<WebElement> rows = driver.findElements(
				By.xpath("//table[@id='tblservicediscount']/tbody/tr"));

		if (rows.size() == 0) {
			logger.info("No services available for discount");
			return;
		}

		logger.info("--------------------------------------------------------------------------");
		logger.info(String.format("%-5s %-12s %-10s %-12s %-12s %-8s",
				"Row", "Amount", "Mode", "Discount", "NetAmt", "Status"));
		logger.info("--------------------------------------------------------------------------");

		for (int i = 1; i <= rows.size(); i++) {

			String amountXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[3]";
			String discountPercentXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[4]/input";
			String discountAmtXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[5]/input";
			String netAmtXpath = "//table[@id='tblservicediscount']/tbody/tr[" + i + "]/td[6]";

			double amount = Double.parseDouble(
					driver.findElement(By.xpath(amountXpath)).getText().trim());

			double enteredValue;

			// ===== RANDOM SUPPORT =====
			if (value.equalsIgnoreCase("RANDOM")) {
				enteredValue = random.nextInt(20) + 1;   // 1 to 20 random
			} else {
				enteredValue = Double.parseDouble(value);
			}

			if (mode.equalsIgnoreCase("PERCENT")) {

				CommanUtill.textEnter(discountPercentXpath, String.valueOf(enteredValue));
				driver.findElement(By.xpath(discountPercentXpath)).sendKeys(Keys.TAB);

			} else if (mode.equalsIgnoreCase("AMOUNT")) {

				CommanUtill.textEnter(discountAmtXpath, String.valueOf(enteredValue));
				driver.findElement(By.xpath(discountAmtXpath)).sendKeys(Keys.TAB);
			}

			wait.until(ExpectedConditions.attributeToBeNotEmpty(
					driver.findElement(By.xpath(discountAmtXpath)), "value"));

			double discountAmt = Double.parseDouble(
					driver.findElement(By.xpath(discountAmtXpath))
					.getAttribute("value").trim());

			double discountPercent = Double.parseDouble(
					driver.findElement(By.xpath(discountPercentXpath))
					.getAttribute("value").trim());

			double netAmt = Double.parseDouble(
					driver.findElement(By.xpath(netAmtXpath))
					.getText().trim());

			double expectedDiscount;
			double expectedNet;

			if (mode.equalsIgnoreCase("PERCENT")) {

				expectedDiscount = (amount * enteredValue) / 100;
				expectedNet = amount - expectedDiscount;

			} else {

				expectedDiscount = enteredValue;
				expectedNet = amount - enteredValue;
			}

			boolean rowStatus = true;

			try {

				softAssert.assertEquals(discountAmt, expectedDiscount, 0.5,
						"Discount mismatch row " + i);

				softAssert.assertEquals(netAmt, expectedNet, 0.5,
						"Net mismatch row " + i);

			} catch (Exception e) {
				rowStatus = false;
			}

			String status = rowStatus ? "PASS" : "FAIL";

			logger.info(String.format("%-5s %-12s %-10s %-12s %-12s %-8s",
					i, amount, mode, discountAmt, netAmt, status));
		}

		logger.info("--------------------------------------------------------------------------");
		logger.info("Service Wise Discount Validation Completed");

		softAssert.assertAll();
	}
	//========================Item Wise Discount ============================

	public void CheckBoxUnSelectScheme_ItemWiseDiscount_RadioBtn(String Un_selet_Schme , String Iteme_Wise_Radio_btn) throws IOException, InterruptedException { 

		WebDriverWait schme = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Schme_Check_Box = driver.findElement(By.xpath(Scheme_Check_Box_Btn));
		schme.until(ExpectedConditions.elementToBeClickable(By.xpath(Scheme_Check_Box_Btn)));
		if(! Schme_Check_Box.isEnabled());
		CommanUtill.clickFunction(Scheme_Check_Box_Btn, Un_selet_Schme);

		WebDriverWait Service_Wise_Radio = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Service_Wise = driver.findElement(By.xpath(Item_Wise_Discount_Radio_Btn));
		Service_Wise_Radio.until(ExpectedConditions.elementToBeClickable(By.xpath(Item_Wise_Discount_Radio_Btn)));
		if(! Service_Wise.isSelected());
		CommanUtill.clickFunction(Item_Wise_Discount_Radio_Btn, Iteme_Wise_Radio_btn);	
	}

	public void SelectItemWiseDiscountSevviceDrp(int Service_Drp) throws IOException, InterruptedException { 

		WebDriverWait Servpice = new WebDriverWait( driver, Duration.ofSeconds(10));
		Servpice.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Item_Service_Drp)));
		CommanUtill.dropdownSelectByIndex(Item_Service_Drp, Service_Drp);
	}

	public void itemWiseDiscountValidation(String mode, String value)
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		SoftAssert softAssert = new SoftAssert();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tblitemdiscount")));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tblitemdiscount']/tbody/tr[@data-ctserviceid]"));

		System.out.println("Total Rows Found: " + rows.size());

		for (WebElement row : rows) {

			double amount = Double.parseDouble(row.findElement(By.xpath("./td[5]")).getText().trim().replace(",", ""));
			WebElement percentField = row.findElement(By.xpath("./td[6]/input"));
			WebElement amountField = row.findElement(By.xpath("./td[7]/input"));
			WebElement netField = row.findElement(By.xpath("./td[8]"));

			if (mode.equalsIgnoreCase("PERCENT")) {

				percentField.clear();
				percentField.sendKeys(value);
				percentField.sendKeys(Keys.TAB);

				wait.until(ExpectedConditions.attributeToBeNotEmpty(
						amountField, "value"));

			} else {

				amountField.clear();
				amountField.sendKeys(value);
				amountField.sendKeys(Keys.TAB);

				wait.until(ExpectedConditions.attributeToBeNotEmpty(
						percentField, "value"));
			}

			double discountAmt = Double.parseDouble(
					amountField.getAttribute("value").replace(",", ""));

			double netAmt = Double.parseDouble(
					netField.getText().replace(",", ""));

			double expectedNet = amount - discountAmt;

			softAssert.assertEquals(netAmt, expectedNet, 1.0);
		}

		softAssert.assertAll();
	}

	public void itemWiseDiscountValidation1(String mode, String value) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		SoftAssert softAssert = new SoftAssert();

		// Wait until rows load
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//table[@id='tblitemdiscount']/tbody/tr[@data-ctserviceid]")));

		List<WebElement> rows = driver.findElements(
				By.xpath("//table[@id='tblitemdiscount']/tbody/tr[@data-ctserviceid]"));

		int totalRows = rows.size();

		System.out.println("Total Rows Found: " + totalRows);
		logger.info("Total Rows Found: " + totalRows);

		Assert.assertTrue(totalRows > 0,
				"No rows found in Item Wise Discount table");

		logger.info("--------------------------------------------------------------------------");
		logger.info(String.format("%-5s %-12s %-10s %-12s %-12s %-8s",
				"Row", "Amount", "Mode", "Entered", "NetAmt", "Status"));
		logger.info("--------------------------------------------------------------------------");

		int rowIndex = 1;

		for (WebElement row : rows) {

			double amount = Double.parseDouble(
					row.findElement(By.xpath("./td[5]"))
					.getText().trim().replace(",", ""));

			WebElement percentField = row.findElement(By.xpath("./td[6]/input"));
			WebElement amountField = row.findElement(By.xpath("./td[7]/input"));
			WebElement netField = row.findElement(By.xpath("./td[8]"));

			double enteredDisplayValue;

			if (mode.equalsIgnoreCase("PERCENT")) {

				percentField.clear();
				percentField.sendKeys(value);
				percentField.sendKeys(Keys.TAB);

				wait.until(d -> !amountField.getAttribute("value").trim().equals("0"));

				enteredDisplayValue = Double.parseDouble(
						percentField.getAttribute("value").trim());

			} else {

				amountField.clear();
				amountField.sendKeys(value);
				amountField.sendKeys(Keys.TAB);

				wait.until(d -> !percentField.getAttribute("value").trim().equals("0"));

				enteredDisplayValue = Double.parseDouble(
						amountField.getAttribute("value").replace(",", ""));
			}

			double discountAmt = Double.parseDouble(
					amountField.getAttribute("value").replace(",", ""));

			double netAmt = Double.parseDouble(
					netField.getText().replace(",", ""));

			double expectedNet = amount - discountAmt;

			boolean status = Math.abs(netAmt - expectedNet) <= 1.0;

			String result = status ? "PASS" : "FAIL";

			// Console Print
			System.out.println(String.format("%-5s %-12s %-10s %-12s %-12s %-8s",
					rowIndex, amount, mode, enteredDisplayValue, netAmt, result));

			// Logger Print
			logger.info(String.format("%-5s %-12s %-10s %-12s %-12s %-8s",
					rowIndex, amount, mode, enteredDisplayValue, netAmt, result));

			softAssert.assertTrue(status,
					"Net mismatch at row " + rowIndex);

			rowIndex++;
		}

		logger.info("--------------------------------------------------------------------------");
		logger.info("Item Wise Discount Validation Completed");

		softAssert.assertAll();
	}

	public void DeleteIconIsPresence_ItemWiseDiscount(String Delete_Icon, String reason_Text, String Reason_Yes_pop)
			throws IOException, InterruptedException {

		try {

			List<WebElement> deleteIconList = driver.findElements(By.xpath(Delete_total_Bill_Discount));

			if (deleteIconList.size() > 0) {

				try {
					CommanUtill.clickFunction(Delete_total_Bill_Discount, Delete_Icon);
				} catch (Exception e) {

					System.out.println("Normal click failed. Trying JS click...");
					WebElement element = driver.findElement(By.xpath(Delete_total_Bill_Discount));
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();", element);
				}

				CommanUtill.textEnter(Delete_total_Bill_Discount_Remarks, reason_Text);
				List<WebElement> reasonYesList =
						driver.findElements(By.xpath(Delete_total_Bill_Discount_Remarks_Yes));
				if (reasonYesList.size() > 0) {
					CommanUtill.clickFunction(Delete_total_Bill_Discount_Remarks_Yes, Reason_Yes_pop);
				}
				System.out.println("Delete icon was present and action performed.");
			} else {
				System.out.println("Delete icon not present. Skipping action.");
			}
		} catch (Exception e) {

			System.out.println("Delete icon not present or click failed. Skipping...");
		}
	}

	//==========================Ip Package =========================
	public void ClickOnIpPackageDetailsIcon(String ip_Package) throws IOException , InterruptedException{

		WebDriverWait IpPackage = new WebDriverWait(driver, Duration.ofSeconds(10));
		IpPackage.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(IPPackage_Details), false));
		CommanUtill.clickFunction(IPPackage_Details, ip_Package);

	}

	public void scrollLeftPanelToBottom() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement leftPanel = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("itemlist")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", leftPanel);
	}
	public void enterPackageStardDateTime(String Pakage_Start_DateTime) throws IOException, InterruptedException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm a");

		String currentDateTime = sdf.format(new java.util.Date());

		WebElement clear = driver.findElement(By.xpath(PackageStart_Date_Time_pop));
		clear.sendKeys(Keys.CONTROL + "a");
		clear.sendKeys(Keys.DELETE);

		CommanUtill.textEnter(PackageStart_Date_Time_pop, currentDateTime);
		clear.sendKeys(Keys.TAB);

		System.out.println("Discharge Date Time auto-set to: " + currentDateTime);

	}
	public void ClosePackageDetailsPop(String Close_PackaeDetalsPop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Close_Pop_PackageStart, Close_PackaeDetalsPop);
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

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			if(driver.findElements(By.xpath(Ok_Discharged_pop)).size() > 0) {

				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Ok_Discharged_pop)));
				CommanUtill.clickFunction(Ok_Discharged_pop, Discharged_Patient_pop);
				System.out.println("After Bill Generate Patient Pop Clicked");

			} else {

				System.out.println("After Bill Generate Pop did not appear.");
			}

		} catch (TimeoutException e) {

			System.out.println("Error while handling Discharged OK popup: " + e.getMessage());
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
	public void CancelBillSettlementBtn(String Cance_BillSettle_Icon) throws IOException, InterruptedException { 

		WebDriverWait Cancel_Btn = new WebDriverWait(driver, Duration.ofSeconds(10));
		Cancel_Btn.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Cancel_Bill_Selement_Btn)));
		CommanUtill.clickFunction(Cancel_Bill_Selement_Btn, Cance_BillSettle_Icon);
	}
	public void AuthorizationCancelBillSettlemrntPop(String Authorization_Drp ,String Authorization_Remarks , String Authorization_Save_Icon)
			throws IOException, InterruptedException { 

		WebDriverWait Save = new WebDriverWait(driver, Duration.ofSeconds(10));
		Save.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Cancel_Bill_Selement_Authorization_Save_Pop)));
		CommanUtill.dropdownSelectByVisibleText(Cancel_Bill_Selement_Authorised_Drp, Authorization_Drp);
		CommanUtill.textEnter(Cancel_Bill_Selement_Authorised_Remarks, Authorization_Remarks);
		CommanUtill.clickFunction(Cancel_Bill_Selement_Authorization_Save_Pop, Authorization_Save_Icon);
	}
	public void CloseBillSettlementPop(String Close_Bill_Settlement_pop) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Close_Bill_Settlement_Pop, Close_Bill_Settlement_pop);
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
	public void BillSettlementCancelInformation(String Billsettlementcancel_Btn, String Authorised_By_Drp, String Cancel_Remaks_tet,
			String Save_Authorization) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Cancel_Bill_Settl_Btn, Billsettlementcancel_Btn);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {

			WebElement authorisedDrp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Cancel_Bill_Authorised_By_drp)));

			if (authorisedDrp.isDisplayed()) {
				System.out.println("Authorised dropdown is visible");
				CommanUtill.dropdownSelectByVisibleText( Cancel_Bill_Authorised_By_drp, Authorised_By_Drp);
			}

		} catch (TimeoutException e) {
			System.out.println("Authorised dropdown not visible after 10 seconds - Skipping dropdown");
		}
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

	public void PrintInSummaryDetails(String Print_Icon , String Check_Box_Summary , String Yes_Print_Ok) 
			throws IOException , InterruptedException{

		WebDriverWait print_btn = new WebDriverWait(driver, Duration.ofSeconds(15));
		print_btn.until(ExpectedConditions.elementToBeClickable(By.xpath(Print_Btn)));
		CommanUtill.clickFunction(Print_Btn, Print_Icon);

		WebDriverWait SummaryBill = new WebDriverWait(driver, Duration.ofSeconds(15));
		SummaryBill.until(ExpectedConditions.elementToBeClickable(By.xpath(Summary_Bill_Radio_Btn)));
		CommanUtill.clickFunction(Summary_Bill_Radio_Btn, Check_Box_Summary);

		WebDriverWait ok_Print_Icon = new WebDriverWait(driver, Duration.ofSeconds(15));
		ok_Print_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Yes_Print_Icon)));
		CommanUtill.clickFunction(Yes_Print_Icon, Yes_Print_Ok);
	}

	public void ClickOnBillMenuIcon(String menu_icon) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(bill_Menu)));
		CommanUtill.clickFunction(bill_Menu, menu_icon);
	}

	// New Excel Sheet ===================== Add On Bill ===========================

	public void PleaseEnterReasonlateClaimAndYesPop(String Reason_late_claim , String Yes_Pop) 
	        throws IOException , InterruptedException {

	    try {

	        if(driver.findElements(By.xpath(Add_Discharged_Reason_pop)).size() > 0) {

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Add_Discharged_Reason_pop)));

	            CommanUtill.textEnter(Add_Discharged_Reason_pop, Reason_late_claim);
	            CommanUtill.clickFunction(Add_Discharged_Reason_Yes_pop, Yes_Pop);
	            System.out.println("Late claim popup handled");

	        } else {
	            System.out.println("Late claim popup not appeared, skipping...");
	        }
	    } catch (TimeoutException e) {
	        System.out.println("Error handling late claim popup: " + e.getMessage());
	    }
	}
	
	public void ClickOnAddOnBillIcon(String Add_on_bill_Btn ) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_on_Bill_btn)));
		CommanUtill.clickFunction(Add_on_Bill_btn, Add_on_bill_Btn);
	}
	
	
	// First Radio button  Generate Add-On Bill

	public void RadioBtnGeneateAddonBillIfrormation(String Radio_Generate_Add_on_bill ,String Yes_Add_on_Bill , 
			String Yes_Pop_This_transaction_CantNot_Reverted ) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

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
	public void SettleAddOnBillRadioBtnInformation(String Settle_Add_On_Bill_Radio_Btn ,String Settle_Yes_pop)
			throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

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

	public void SaveAddOnReceiptIPBillingBillSettlement(String Recepit_Save_Icon , String Receipt_Yes_Pop) 
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
	}
	public void OkReceiptNumberPop(String Ok_Receipt_no) throws IOException, InterruptedException {

		try {
			if (CommanUtill.isElementPresent(Receipt_Save_Yes_Receipt_no_Ok_Pop)) {
				CommanUtill.clickFunction(Receipt_Save_Yes_Receipt_no_Ok_Pop, Ok_Receipt_no);
				System.out.println("Receipt Number Ok Pop Clicked");
			} else {
				System.out.println("Receipt Number Ok Pop Did Not Appear");
			}
		} catch (Exception e) {

			System.out.println("Error while handling Receipt Number Pop: " + e.getMessage());
		}
	}

	//Third Radio button Print Add-On Bill
	public void PrintradioBtnAddOnBill(String Print_Radio_btn , String Print_Yes_pop) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(radio_Btn_Print_Add_On_Bill)));
		CommanUtill.clickFunction(radio_Btn_Print_Add_On_Bill, Print_Radio_btn);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Yes_Generate_Add_On_bill_pop)));
		CommanUtill.clickFunction(Yes_Generate_Add_On_bill_pop, Print_Yes_pop);

	}

	//====================================Add On Remarks ================================

	public void AddOnRemarksPlushBtn(String Add_Remarks_Plush) throws IOException , InterruptedException{

		WebDriverWait plush = new WebDriverWait(driver, Duration.ofSeconds(15));
		plush.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_Remarks_Plush_Icon)));
		CommanUtill.clickFunction(Add_Remarks_Plush_Icon, Add_Remarks_Plush);
	}
	public void EnterPrintableRemarkAndSaveBtn(String PrintableRemark , String Save_Printable_Remarks) throws IOException , InterruptedException{

		CommanUtill.textEnter(Printable_Remarks_Text, PrintableRemark);
		CommanUtill.clickFunction(Printable_Remarks_Save, Save_Printable_Remarks);
	}
	public void ClickOnAddOnRemarksPlushIconAndSavePop(String Add_Remarks_Plush ,String Add_Remarks , String Save_Add_Remaks_Pop)
			throws IOException , InterruptedException{

		WebDriverWait plush = new WebDriverWait(driver, Duration.ofSeconds(15));
		plush.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_Remarks_Plush_Icon)));
		CommanUtill.clickFunction(Add_Remarks_Plush_Icon, Add_Remarks_Plush);
		CommanUtill.textEnter(Add_RemarksText, Add_Remarks);
		CommanUtill.clickFunction(Click_Add_Remarks_Save_pop, Save_Add_Remaks_Pop);

	}

	//===============================Patient Document ==================================

	public void ClickOnPatientDocumentIcon(String Click_Patient_Document_Icon)  throws IOException , InterruptedException{

		WebDriverWait document = new WebDriverWait(driver, Duration.ofSeconds(15));
		document.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Patient_Document_Icon)));
		CommanUtill.clickFunction(Patient_Document_Icon, Click_Patient_Document_Icon);
	}

	public void UploadPatientDocumentType(String Radio_patient_Document , String Document_Type_Drp , String Dicon_Icon) 
			throws IOException , InterruptedException{

		CommanUtill.clickFunction(Radio_Btn_Patient_Document, Radio_patient_Document);
		CommanUtill.dropdownSelectByVisibleText(Document_Type, Document_Type_Drp);
		CommanUtill.clickFunction(Click_Document_Dicon_Icon, Dicon_Icon);	
	}
	public void DiconDocumentNameAndDocumentTypeDrp(String Document_Name , String Document_Type  ) throws IOException , InterruptedException{

		CommanUtill.textEnter(Dicom_Document_pop_Document_name, Document_Name);
		CommanUtill.dropdownSelectByVisibleText(Dicom_Document_pop_Document_Type, Document_Type);	
	}

	public void UploadDicomFile(String Driver_Location, String Save_Dicom_File) throws IOException , InterruptedException{

		String filePath = "C:\\Users\\Anup.DESKTOP-V88DC5U\\Desktop\\Trio_Tree_Project_performance_testing\\AutomationFile_Upload\\Docom.dcm";

		WebElement uploadElement = driver.findElement(By.xpath(Dicom_Document_pop_Choose_File));

		logger.info("============== File Upload ======================");
		logger.info("Uploading File Path : " + filePath);

		uploadElement.sendKeys(filePath);

		System.out.println("File Upload Location In Dashboard : " + filePath);

		WebDriverWait Save = new WebDriverWait(driver, Duration.ofSeconds(10));
		Save.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Dicom_Document_pop_Save)));

		CommanUtill.clickFunction(Dicom_Document_pop_Save, Save_Dicom_File);
	}
	public void CloseUploadPatientDocumentPop(String Close_Patient_Doc_Pop) throws IOException , InterruptedException{

		CommanUtill.clickFunction(Close_Documents_pop, Close_Patient_Doc_Pop);
	}
	//=====================Non-Payable Services ==============================
	public void clickOnNonPayableIcon(String NonPayable) throws IOException , InterruptedException{

		WebDriverWait Non_Chargeable = new WebDriverWait(driver, Duration.ofSeconds(10));
		Non_Chargeable.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Click_Non_Payable_Btn)));
		CommanUtill.clickFunction(Click_Non_Payable_Btn, NonPayable);
	}
	public void SelectServiceDrpAndViewInServiceTable(String Service_Drp , String View_Table) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(Non_Payable_Service_Drp, Service_Drp);
		WebDriverWait table_load = new WebDriverWait(driver, Duration.ofSeconds(10));
		table_load.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Service_Table)));
		String Service_Table_Name = driver.findElement(By.xpath(Service_Table)).getText();

		logger.info("=============Service Table ================");
		logger.info("Service Name :- " + Service_Table_Name);
		System.out.println("Service Name :- " + Service_Table_Name);

	}
	public void SelectFirstCheckBoxServiceAndSave(String First_Check_Box ,String Save_Service) 
			throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Service_Table_Top)));

		WebElement checkBoxFirst = driver.findElement(By.xpath(Service_Table_Top));
		WebElement checkBoxSecond = driver.findElement(By.xpath(Service_Table_Second));

		if (!checkBoxFirst.isSelected()) {
			CommanUtill.clickFunction(Service_Table_Top, First_Check_Box);
		}

		if (checkBoxSecond.isSelected()) {
			checkBoxSecond.click();
		}

		// Save button click
		CommanUtill.clickFunction(Save_Non_Payable_Services_Pop, Save_Service);
	}
	public void ModifyServicesAndSave(String Click_Modify_Icon , String Select_Check_Box , String Save_Icon) 
			throws IOException , InterruptedException {

		CommanUtill.clickFunction(Modify_Non_Payable_Services_Pop, Click_Modify_Icon);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Service_Table_Second)));

		WebElement checkBoxFirst = driver.findElement(By.xpath(Service_Table_Top));
		WebElement checkBoxSecond = driver.findElement(By.xpath(Service_Table_Second));

		if (checkBoxFirst.isSelected()) {
			checkBoxFirst.click();
		}

		if (checkBoxSecond.isSelected()) {
			CommanUtill.clickFunction(Service_Table_Second, Select_Check_Box);
		}

		CommanUtill.clickFunction(Service_Table_Second, Select_Check_Box);
		CommanUtill.clickFunction(Save_Non_Payable_Services_Pop, Save_Icon);
	}

	public void CloseNonPayableServicesPop(String Close_Sevices_Pop)  throws IOException , InterruptedException {

		WebDriverWait Close_Service_pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		Close_Service_pop.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Close_Non_Payable_Services_Pop)));
		CommanUtill.clickFunction(Close_Non_Payable_Services_Pop, Close_Sevices_Pop);

	}




}
