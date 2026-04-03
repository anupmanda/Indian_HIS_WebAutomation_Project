/**
 * 
 */
package com.test.emergency.page;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.event.CommandEventMulticaster;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 23-Mar-2026
 */
public class ErBillingPage extends GeneralBrowserSetting {

	public static String storedUHID;
	public static String storedIPNo;

	protected static String facility = "//select[@id='Facility']";
	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Er_Billing_Tab = "//span[normalize-space()='ER Billing']";
	protected static String Billing_Page = "//a[contains(text(),'ER Billing')]";
	//=======================Search Patent Curnrt And Discharge Patient =====================

	protected static String search_icon = "//i[@class='fa fa-search fa-lg fa-icon']";
	//protected static  String search_icon_find_patient = "//img[@src='/sanitywebhistree/images/action_Newbtn/popupSearch.svg']";
	protected static  String current_in_patient_Radio_btn_pop = "//input[@id='rbCurrentPatents']";

	protected static  String In_patient_All_Ward_Check_Box_pop = "//input[@id='cbAllWards']";
	protected static  String In_patient_Discharge_Admision_chkk_box_pop = "//input[@id='cbAdmission']";
	protected static  String In_patient_From_Date_pop = "//input[@id='txtadmitDate']";
	protected static  String In_patient_To_Date_pop = "//input[@id='txtadmittodate']";
	protected static  String Vip_check_box = "//input[@id='cbVip']";

	protected static  String Find_Patient_Serach_Icon = "//a[@id='search_Emergency']//i[@class='fa fa-search']";
	protected static  String Clear_Find_Patient_pop = "//i[@title='Clear']";

	protected static  String Rdio_Btn_Discharged_Patients = "//input[@id='rbDisPatents']";
	protected static  String Discharged_Patients_Table = "//input[@id='rbDisPatents']";    // adding
	protected static  String find_patient_First_table = "//table[@id='searchBillingTable']//tbody//tr[position()=1]";

	//======================Enter UHID And Ip Number ======================
	protected static String Enter_UHID = "//input[@id='txtUHID']";
	protected static String Enter_Er_No = "//input[@id='ER_Number']";
	//===================== Financial Detail Modification ======================

	protected static String Edit_Financial_Details_Icon = "//a[@id='btnfinancialdetailsER']";
	protected static String Bill_Financial_Refesh = "//a[@id='btnIPBillingFinancialDetails_ModalRefresh']//i[@class='fa fa-refresh']";
	protected static String Bill_Financial_close = "//a[@id='btnIPBillingFinancialDetails_ModalClose']//i[@class='fa fa-times']";
	protected static String Bill_Financial_Update = "//a[@id='btnIPBillingFinancialDetails_ModalModify']//i[@class='fa fa-pencil-square-o']";
	protected static String Bill_Financial_Save = "//div[@id='IPBillingFinancialDetails_Modal_ER']//div[@class='popup-icon-top']//span[1]";

	protected static String Bill_Financial_Cash_Radio_btn = "//input[@id='rbCash']";
	protected static String Bill_Financial_Company_Radio_btn = "//input[@id='rbCredit']";
	protected static String Bill_Financial_Company_Type_Drp = "//select[@id='cmbcompanychannel']";
	protected static String Bill_Financial_Company_Drp = "//select[@id='cmbmaincompany']";
	protected static String Bill_Financial_Rate_contract_Drp = "//select[@id='ddCompany']";

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

	//=====================Deposit Refund Details ============================
	protected static String Deposit_Refund_Details_Icon = "//a[@id='opbillvisit']";
	protected static String Radio_Btn_Deposits = "//input[@id='rbDeposit']";
	protected static String Radio_Btn_Receipts = "//input[@id='rbReceipt']";
	protected static String Radio_Btn_Refund = "//input[@id='rbRefund']";
	protected static String Close_Deposit_Refund_Details = "//a[@id='DepositRefundModelClose']//i[@class='fa fa-times']";

	//=====================Bill Details ========================
	protected static String Bill_Details_icon = "//a[@id='BillDetails']";
	protected static String Close_Bill_Details = "//a[@id='BillDetailsModelClose']//i[@class='fa fa-times']";
	protected static String displayServiceRows = "//table[@id='tblDisplayService']//tbody//tr";
	protected static String serviceRows = "//table[@id='tblService']//tbody//tr";

	//=====================Company Thumb Details ================================
	protected static String Company_Details_icon = "//a[@id='CompanyDetails']";
	protected static String Insurance_Credit_limit_Radio = "//input[@id='rbCreditLimit']";
	protected static String Enter_Credit_limit_Box = "//input[@id='txt_CompanyDetailsCreditLimit']";

	protected static String save_Insurance_Approval_details = "//a[@id='btnpatient_insurance_approval_Save']//i[@class='fa fa-save']";
	protected static String Close_Insurance_Approval_details = "//a[@id='btnpatient_insurance_approval_Close']//i[@class='fa fa-times']";

	protected static String Patient_Insurance_Table = "//table[@id='tblpatient_insurance_approval']//tbody//tr[1]";  //Print
	protected static String Patient_Insurance_Table_Deductible =
			"//table[@id='tblpatient_insurance_approval']//tbody//tr[1]//input[@id='companyapprovaldeductible']";
	protected static String Patient_Insurance_Table_Priority_Drp = 
			"//table[@id='tblpatient_insurance_approval']//tbody//tr[1]//select[@id='companyapprovalpriority']";
	protected static String Patient_Insurance_Table_Approved_Chkk = 
			"//table[@id='tblpatient_insurance_approval']//tbody//tr[1]//input[@class='ipdep-checkbox']";

	//=======================Pending Investigation ==================================

	protected static String Pending_Investigation = "//a[@id='PendingInvestigation']";

	//===============================Interim Bill ==============================

	protected static String Click_Interim_Bill = "//a[@id='InterimBill']";
	protected static String Radio_Btn_Summary_Bill = "//input[@id='rb_Summary_Bill']";
	protected static String Yes_Summary_Bill  = "//a[@id='btnInterimBill']";
	protected static String Radio_Detailed_Bill  = "//input[@id='rb_Detailed_Bill']";
	protected static String No_Interim_Bill_Pop = "//a[@id='btnInterimBill_close']";
	//===========================Discharge================================
	protected static String Click_Discharge_icon = "//a[@id='Discharge']";
	protected static String Discharge_Reason_Drp_pop = "//select[@id='DischargeReason']";
	protected static String Discharge_Sub_Type_Drp_pop = "//select[@id='DischargeSubType']";
	protected static String Discharge_Remarks_pop = "//textarea[@id='txt_Remarks']";
	protected static String Discharge_Singn_Yes_pop = "//a[@id='DischargeMSG_Modal']//i[@class='fa fa-check']";
	protected static String Patient_Discharge_Yes_pop = "//a[@id ='btnDischargeThePatient_Yes']";

	//=====================Cancel Discharge =============================
	protected static String  Cancel_Discharged_Icon = "//a[@id='CancelDischarge']";
	protected static String  Cancel_Discharged_Reason = "//textarea[@id='txt_Reasonofcancle']";
	protected static String  Cancel_Discharged_Reason_Yes = "//a[@id='Reasonofcancle_Modal']//i[@class='fa fa-check']";
	protected static String  Cancel_Discharged_Reason_Yes_pop = "//a[@id='btnCancelDischage_Yes']";
	protected static String  Cancel_Dicharge_Close_pop = "//a[@id='btnNoReasonofcancle']//i[@class='fa fa-times']";
	
   //====================================== Discouunt Type ==================================
	protected static String Click_Discount_Icon = "//a[@id='Discounts']";
	protected static String Discount_Total_Bill_Radio_Btn = "//input[@id='rbOnTotalBillDiscount']";
	protected static String Scheme_Check_Box_Btn = "//input[@id='checkScheme']";
	protected static String radio_Btn_Total_Bill_Discount = "//input[@id='rbOnTotalBillDiscount']";
	protected static String Discount_Amount_On_Bill = "//input[@id='txtTotalDiscountAmount']";
	protected static String Discount_Percentage = "//input[@id='txtTotalDiscountParcentages']";
	protected static String Discount_Head_Drp = "//select[@id='dd_DiscountHead']";
	protected static String Discount_Reason_Drp = "//select[@id='dd_DiscountReason']";
	protected static String Discount_Remarks = "//textarea[@id='txtdiscountremark']";
	
	protected static String Click_Discount_Perctange_Btn = "//a[@id='CalculateDiscount']";
	protected static String Alert_Applied_Discount = "//input[@id='CalculatedPer']";
	protected static String Discount_Authorised_By = "//select[@id='ddAuthorisedBy']";
	protected static String Save_total_Bill_Discount = "//a[@id='Discounts_save']//i[@class='fa fa-save']";
	//============================= Delete Discount ================================

	protected static String Discount_Delete_Icon = "//i[@class='fa fa-trash']";
	protected static String Delete_Discount_Remarks = "//textarea[@id='delreason1']";
	protected static String Save_Delete_Discount_Remarks = "//a[@id='btnDeleteOK']//i[@class='fa fa-save']";
	protected static String Save_Delete_Discount_Remarks_Yes_Pop = "//a[@id='btnDelete_Yes']";
	
	//=========================Service Wise Discount==============================
	protected static String service_Wise_Discount_Radio_Btn = "//input[@id='rbServiceWishDiscount']";
	protected static String ok_Save_Pop= "//a[@id ='btndiscount_Yes']";
	
	//======================== Item Wise Discount =====================
	protected static String Click_Item_Wise_Discount_Radio_Btn = "//input[@id='_itemWiseDiscount']";
	protected static String Item_Wise_Services_Drp = "//select[@id='CmbServicesDiscount']";
	protected static String Services_Percentage = "//input[@id='TxtDiscPerDiscount']";
	protected static String Services_Percentage_Add_Icon = "//a[@id='BtnDiscShowDiscount']//i[@class='fa fa-plus']";
	
	//========================= Bill Settlement ===============================
	protected static String Click_Bill_Settlement = "//a[@id='BillSettlement']";
	protected static String Click_Cash_Btn = "//a[@id='tabcash']";
	protected static String Bill_Settlement_Remarks = "//textarea[@id='txtReceiptRemarks']";
	protected static String Click_Recipt_Settlement_Btn = "//i[@class='fa fa-usd']";
	protected static String Click_Recipt_Settlement_Yes_Pop = "//a[@id ='ERBillingFinalSettlementPopupforMessageOK']";
/*	protected static String Settled_Recipt_No_Ok_Pop = "//a[@id='PopupOK']";
  
	protected static String Settled_Recipt_No_Ok_Pop = 
			"//div[contains(@class,'popup') and contains(@style,'display: block')]//a[@id='PopupOK']";
			
	protected static String Settled_Recipt_No_Ok_Pop =
"//div[contains(@class,'popup') and contains(@style,'display: block')]//a[@id='PopupOK']";		
			
*/
	protected static String Settled_Recipt_No_Ok_Pop =
			"(//a[@id='PopupOK' and not(contains(@style,'display: none'))])[last()]";
	
	protected static String Enet_Amount = "//input[@id='txtCSAmount']";  //Less Than Total Bill Amount
	protected static String Cash_Received = "//input[@id='payable_amount']";
	protected static String Cash_Returned_Print = "//input[@id='payable_amountret']";
	//============================== Due ==================================
	protected static String Click_Due_Btn = "//a[@id='tabDue']";
	protected static String Due_Authorised_By_Drp = "//select[@id='cmbdue']";
	protected static String Due_Remaks_Text = "//textarea[@id='txtDueRemarks']";
	
  //==================Settlement In Cheque =======================
	
	protected static String Click_Cheque_Btn = "//a[@id='tabCheque']";
	protected static String Cheque_No = "//input[@id='TXTChequeNo']";
	protected static String Cheque_Issue_Date_Check_Box = "//input[@id='Isuecheckbox']";
	protected static String ChequeIssue_Date = "//input[@id='cqIssDt']";
	protected static String Cheque_Bank_Name_Drp = "//select[@id='cmbchequeBank']";
	protected static String Cheque_Branch_Name = "//input[@id='txtCqBranchName']";
	protected static String Cheque_Settle_Amount_Print = "//input[@id='txtSettled']";
	protected static String Cheque_Authorised_Drp = "//select[@id='cmbcheque']";
	
  //=======================Bill Settle Print =============================
	protected static String settle_Print_Btn = "//a[@id='btnPrintERBillingBillSettlementMSG_Modal']//i[@class='fa fa-print']";
	protected static String settle_Print_Receipt_No_Drp = "//select[@id='selSettlementReceiptNo']";
	protected static String settle_Print_Receipt_Ok_Pop = "//a[@id='ERBillingSettlementReceiptPopupforMessageOK']//i[@title='popup-title']";
	protected static String Close_HIS_Trre_Settled_Pop = "//a[@id='ERBillingSettlementReceiptPopupforMessageClose']//i[@title='popup-title']";
	//============================ Print ====================================
	
	protected static String Click_Print_Btn = "//a[@id='btnPrint']//i[@class='fa fa-print']";
	protected static String Summary_Bill_Radio_Btn = "//input[@id='rb_SummaryBill']";
	protected static String Detailed_Bill_Radio_Btn = "//input[@id='rb_DetailedBill']";
	protected static String Discharge_Bill_Radio_Btn = "//input[@id='rb_DischargeSlip']";
	protected static String Discharge_Authorization_Slip_Bill_Radio_Btn = "//input[@id='rb_DischargeAuthoriZationSlip']";
	protected static String View_Discount_Breakup_Bill_Radio_Btn = "//input[@id='_chkDiscountBackup']";
	protected static String Yes_Print_Bill_Pop = "//a[@id='btnPrintBill_Ok']";
	
	 //========================== FRRO Details ============================	
	protected static String FRRO_Dettails_Btn = "//a[@id='FRRODetails']";
	protected static String FRRO_Application_No = "//input[@id='txtFRRO_Application_No']";
	protected static String FRRO_Details_Save_Btn = "//a[@id='btnsave_FRROApplicationNo']//i[@class='fa fa-save']";
	protected static String FRRO_Details_Close_Pop = "//a[@id='FRRODetails_Close']//i[@class='fa fa-times']";
	
	
	

	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}

	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}

	public void clickErBillingPage(String Billing_Tab, String Er_Billing_Page ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Billing_Tab, Billing_Tab);
		CommanUtill.clickFunction(Billing_Page, Er_Billing_Page);
	}

	//========================Search Patient =====================================

	public void FindPatient_SeachIcon(String Search) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(search_icon, Search);
	}

	public void RadioBtnCurrentInPatients_AllWardsCheckBox(String Current_In_Patent , String All_Ward_Check_Box)
			throws IOException ,InterruptedException {
		CommanUtill.clickFunction(current_in_patient_Radio_btn_pop, Current_In_Patent);

		WebElement wards = driver.findElement(By.xpath(In_patient_All_Ward_Check_Box_pop));
		if(! wards.isSelected())	
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
	public void clickOnSerachIcon(String Serch_Icon) throws IOException ,InterruptedException { 

		WebDriverWait Search_Icon = new WebDriverWait(driver,Duration.ofSeconds(10));
		Search_Icon.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Find_Patient_Serach_Icon)));
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serch_Icon);

	}
	public void SerachAndselectPatientInTable(String Last_Row) throws IOException ,InterruptedException {

		WebDriverWait TableLast_Patient = new WebDriverWait(driver, Duration.ofSeconds(10));
		TableLast_Patient.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(find_patient_First_table)));
		String Last_Row_Print = driver.findElement(By.xpath(find_patient_First_table)).getText();
		logger.info("================Last Row Print Patient==================");
		logger.info(Last_Row_Print);
		System.out.println("Click On Last Row : " + Last_Row_Print);
		CommanUtill.clickFunction(find_patient_First_table, Last_Row);

	}

	public void SerachAndselectPatientInTable1(String Last_Row) throws IOException ,InterruptedException {

		WebDriverWait TableLast_Patient = new WebDriverWait(driver, Duration.ofSeconds(10));
		TableLast_Patient.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(find_patient_First_table)));
		String First_Row_Print = driver.findElement(By.xpath(find_patient_First_table)).getText();

		storedUHID = driver.findElement(By.xpath(find_patient_First_table + "//td[2]")).getText();
		storedIPNo = driver.findElement(By.xpath(find_patient_First_table + "/td[3]")).getText();

		System.out.println("Click On First Row : " + First_Row_Print);
		System.out.println("Stored UHID : " + storedUHID);
		System.out.println("Stored IP No : " + storedIPNo);
		logger.info("================Last Row Print Patient==================");
		logger.info(First_Row_Print);
		logger.info("Stored UHID : " + storedUHID);
		logger.info("Stored IP No : " + storedIPNo);
		CommanUtill.clickFunction(find_patient_First_table, Last_Row);
		logger.info("Clicked Last Row Successfully");
	}

	//========================Discharge Patient Search =============================

	public void RadioBtnDischargedPatients(String Discharged_Patients) throws IOException ,InterruptedException { 

		WebDriverWait DischargedPatients = new WebDriverWait(driver, Duration.ofSeconds(10));
		DischargedPatients.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Rdio_Btn_Discharged_Patients)));
		CommanUtill.clickFunction(Rdio_Btn_Discharged_Patients, Discharged_Patients);  
	}
	//===================== Enter UHID And Ip Nunber =======================

	public void EnterUHID(String uhid_enter) throws IOException, InterruptedException { 

		WebElement uhid = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, uhid_enter);
		uhid.sendKeys(Keys.ENTER);
	}
	public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(Enter_Er_No));
		CommanUtill.textEnter(Enter_Er_No, er_enter);
		er.sendKeys(Keys.ENTER);
	}

	//===================== Edit Financial Details =================================

	public void EditFinancialDetailModificationIcon(String Financial_Edit) throws IOException, InterruptedException {

		WebDriverWait Edit_Financial_Icon = new WebDriverWait(driver , Duration.ofSeconds(10));
		Edit_Financial_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Edit_Financial_Details_Icon)));
		CommanUtill.clickFunction(Edit_Financial_Details_Icon, Financial_Edit);
	}
	public void UpdateFinancialDetailModificationIcon(String Financial_Edit) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Bill_Financial_Update, Financial_Edit);
	}

	public void CompanyInsuranceRadioBtn(String Company_Insurance) throws IOException, InterruptedException {

		WebDriverWait RadioBtn_Insurance = new WebDriverWait(driver, Duration.ofSeconds(5));
		RadioBtn_Insurance.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Bill_Financial_Company_Radio_btn)));
		WebElement Company = driver.findElement(By.xpath(Bill_Financial_Company_Radio_btn));
		if(! Company.isSelected())
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
			WebDriverWait Document_CheckList = new WebDriverWait(driver, Duration.ofSeconds(3));

			Document_CheckList.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Close_Document_Check_List_pop)));
			CommanUtill.clickFunction(Close_Document_Check_List_pop, Scheme_Pop);
			System.out.println("Closed Document Check List Pop");

		} catch (TimeoutException e) {
			System.out.println("Document Check List Pop did not appear");
		}
	}
	public void CloseSchemeForPatientPop(String Scheme_Pop) throws IOException, InterruptedException {

		try {
			WebDriverWait SchemePatient = new WebDriverWait(driver, Duration.ofSeconds(3));
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

	public void AccountInformationEnterAndSave(String Account_no , String IFSC_Code , String Bank_Branch ) throws IOException, InterruptedException {

		CommanUtill.textEnter(Bill_Financial_Account_no, Account_no);
		CommanUtill.textEnter(Bill_Financial_IFSC_Code, IFSC_Code);
		CommanUtill.textEnter(Bill_Financial_Bank_Name, Bank_Branch);
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
	//============================== Scheme Details ==============================
	public void checkBoxSchemeAndSchemeDrp(String check_Box , String Scheme_Drp)throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Bill_Financial_Scheme_Check_Box, check_Box);
		CommanUtill.dropdownSelectByVisibleText(Bill_Financial_Scheme_Drp, Scheme_Drp);	
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

	public void SavePatientInsuranceApprovalPop(String Save_Company_Details_pop) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(save_Insurance_Approval_details)));
		CommanUtill.clickFunction(save_Insurance_Approval_details, Save_Company_Details_pop);
	}

	public void CloseCompanyDetails_PatientInsuranceApprovalPop(String closeCompanyLabel) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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
	//=======================Pending Investigation ==================================
	public void ClickOnPendingInvestigation(String  Investigation) throws IOException, InterruptedException {

		WebDriverWait pending_inv = new WebDriverWait(driver, Duration.ofSeconds(5));
		pending_inv.until(ExpectedConditions.elementToBeClickable(By.xpath(Pending_Investigation)));
		CommanUtill.clickFunction(Pending_Investigation, Investigation);

	}
	//============================Interim Bill================================
	public void ClickOnInterimBillIcon(String Interim_Bill)  throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Interim_Bill)));
		CommanUtill.clickFunction(Click_Interim_Bill, Interim_Bill);
	}
	public void RadioBtnInSummaryBillInterimBillPop(String Summary , String Yes_Pop) throws IOException, InterruptedException {

		WebDriverWait Summary_Radio = new WebDriverWait(driver, Duration.ofSeconds(5));
		Summary_Radio.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Summary_Bill)));
		CommanUtill.clickFunction(Radio_Btn_Summary_Bill, Summary);
		CommanUtill.clickFunction(Yes_Summary_Bill, Yes_Pop);
	}
	public void RadioBtnInDetailedBillInterimBillPop(String Detailed  , String Yes_Pop) throws IOException, InterruptedException {

		WebDriverWait Details_Radio = new WebDriverWait(driver, Duration.ofSeconds(5));
		Details_Radio.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Detailed_Bill)));
		CommanUtill.clickFunction(Radio_Detailed_Bill, Detailed);
		CommanUtill.clickFunction(Yes_Summary_Bill, Yes_Pop);
	}
	public void NoInterimBillPop(String No_pop) throws IOException, InterruptedException {

		if(CommanUtill.isElementPresent(No_Interim_Bill_Pop)) {
			CommanUtill.clickFunction(No_Interim_Bill_Pop, No_pop);
			System.out.println("Apperas Interim Bill Pop");
		}
		else {
			System.out.println("Did Not Apperas Interim Bill Pop");
		}
	}
	//============================== Discharge ==============================
	public void ClickOnDischargeIconBtn(String Discharge_Icon) 
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

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

	public void DischargeOkBtn(String ok_btn , String Discharge_Yes_pop) throws IOException, InterruptedException {

		WebDriverWait Discharge_Pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		Discharge_Pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Discharge_Singn_Yes_pop)));
		CommanUtill.clickFunction(Discharge_Singn_Yes_pop, ok_btn);
		CommanUtill.clickFunction(Patient_Discharge_Yes_pop, Discharge_Yes_pop);
	}

	//=====================Cancel Discharge =============================
	
	public void CancelDischargeBtn(String Cancel_Discharge) throws IOException, InterruptedException {

		WebDriverWait Discharge_Pop = new WebDriverWait(driver, Duration.ofSeconds(5));
		Discharge_Pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Cancel_Discharged_Icon)));
		CommanUtill.clickFunction(Cancel_Discharged_Icon, Cancel_Discharge);
	}
	public void CancelDischarge_ReasonYesPop(String reason_Test , String Ok_Singn) throws IOException, InterruptedException {
		
		CommanUtill.textEnter(Cancel_Discharged_Reason, reason_Test);
		CommanUtill.clickFunction(Cancel_Discharged_Reason_Yes, Ok_Singn);	
	}
	public void PatientCancelDischargeYesPop(String Yes_Pop) throws IOException, InterruptedException {
		
		if(CommanUtill.isElementPresent(Cancel_Discharged_Reason_Yes_pop)) {
			CommanUtill.clickFunction(Cancel_Discharged_Reason_Yes_pop, Yes_Pop);
			System.out.println("Apperas Cancel Discharge Yes Pop");
		}
		else {
			System.out.println("Did Not Apperas Cancel Discharge Yes Pop");
		}
	}
	
	//========================= Discount Total Bill ======================================
	public void clickOnDiscountTypeIcon(String Discount_Btn) throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Discount_Icon)));
		CommanUtill.clickFunction(Click_Discount_Icon, Discount_Btn);
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
	public void SaveDiscountOnBill(String Save_Btn) throws IOException, InterruptedException {

		WebDriverWait Save = new WebDriverWait(driver, Duration.ofSeconds(10));
		Save.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Save_total_Bill_Discount)));
		CommanUtill.clickFunction(Save_total_Bill_Discount, Save_Btn);
	}
	//==========================Delete Discount ====================================
	
public void DeleteDiscountBtn(String Delete_icon) throws IOException, InterruptedException {
		
		WebDriverWait delete = new WebDriverWait(driver, Duration.ofSeconds(10));
		delete.until(ExpectedConditions.elementToBeClickable(By.xpath(Discount_Delete_Icon)));
		CommanUtill.clickFunction(Discount_Delete_Icon, Delete_icon);
	}
	
	public void ReasonAndYesDeleteDiscountPop(String Reason_Text , String Yes_click) throws IOException, InterruptedException {
		
		WebDriverWait reason_pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		reason_pop.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Delete_Discount_Remarks)));
		CommanUtill.textEnter(Delete_Discount_Remarks, Reason_Text);
		reason_pop.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Delete_Discount_Remarks)));
		CommanUtill.clickFunction(Save_Delete_Discount_Remarks, Yes_click);
	}
	public void DiscountDeleteYesPop(String Yes_pop) throws IOException, InterruptedException {
		
		if(CommanUtill.isElementPresent(Save_Delete_Discount_Remarks_Yes_Pop)) {
			CommanUtill.clickFunction(Save_Delete_Discount_Remarks_Yes_Pop, Yes_pop);
			System.out.println("Appear Delete Discount Yes Pop");
		}
		else {
			System.out.println("Did Not Appear Delete Discount Yes Pop");
		}
	}
	//==============================Service Wise Discount ==================================

	public void CheckBoxUnSelectScheme_ServiceWiseDiscount_RadioBtn(String Service_Wise_Radio_btn) throws IOException, InterruptedException { 

		WebDriverWait Service_Wise_Radio = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Service_Wise = driver.findElement(By.xpath(service_Wise_Discount_Radio_Btn));
		Service_Wise_Radio.until(ExpectedConditions.elementToBeClickable(By.xpath(service_Wise_Discount_Radio_Btn)));
		if(! Service_Wise.isSelected())
		CommanUtill.clickFunction(service_Wise_Discount_Radio_Btn, Service_Wise_Radio_btn);

	}
	public void SaveServiceWiseDiscountOkPop(String Service_Ok_Pop)  throws IOException, InterruptedException { 
		
		if(CommanUtill.isElementPresent(ok_Save_Pop)) {
			CommanUtill.clickFunction(ok_Save_Pop, Service_Ok_Pop);
			System.out.println("Save Service Wise Discount Ok Pop");
		}
		else {
			System.out.println("Did Not Appear Save Service Wise Discount Ok Pop");
		}
	}
	//========Service Perctage Value =============
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
	//========Service Perctage Value And Assertion Use ====================
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
	//====================== Service Amount Discount ===================
	public void serviceWiseDiscountValidation_ByAmount(String discountAmountValue)
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(
				By.xpath("//table[@id='tblServiceWishDiscount']//tbody//tr"));

		if (rows.size() == 0) {
			logger.info("No services available for discount");
			return;
		}

		logger.info("--------- Service Wise Discount (By Amount) Validation ---------");

		for (int i = 1; i <= rows.size(); i++) {

			String amountXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[3]";
			String discountPercentXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[4]/input";
			String discountAmtXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[5]/input";
			String netAmtXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[6]";

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

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tblServiceWishDiscount']//tbody//tr"));
		if (rows.size() == 0) {
			logger.info("No services available for discount");
			return;
		}

		logger.info("--------------------------------------------------------------------------");
		logger.info(String.format("%-5s %-12s %-10s %-12s %-12s %-8s",
				"Row", "Amount", "Mode", "Discount", "NetAmt", "Status"));
		logger.info("--------------------------------------------------------------------------");

		for (int i = 1; i <= rows.size(); i++) {

			String amountXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[3]";
			String discountPercentXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[4]/input";
			String discountAmtXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[5]/input";
			String netAmtXpath = "//table[@id='tblServiceWishDiscount']/tbody/tr[" + i + "]/td[6]";

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
			wait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(By.xpath(discountAmtXpath)), "value"));

			double discountAmt = Double.parseDouble(driver.findElement(By.xpath(discountAmtXpath)).getAttribute("value").trim());
			double discountPercent = Double.parseDouble(driver.findElement(By.xpath(discountPercentXpath)).getAttribute("value").trim());
			double netAmt = Double.parseDouble(driver.findElement(By.xpath(netAmtXpath)).getText().trim());

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

				softAssert.assertEquals(discountAmt, expectedDiscount, 0.5,"Discount mismatch row " + i);
				softAssert.assertEquals(netAmt, expectedNet, 0.5,"Net mismatch row " + i);

			} catch (Exception e) {
				rowStatus = false;
			}

			String status = rowStatus ? "PASS" : "FAIL";
			logger.info(String.format("%-5s %-12s %-10s %-12s %-12s %-8s",i, amount, mode, discountAmt, netAmt, status));
		}

		logger.info("--------------------------------------------------------------------------");
		logger.info("Service Wise Discount Validation Completed");

		softAssert.assertAll();
	}
	//======================== Item Wise Discount =====================
	public void ClickOnRadioBtnItemWiseDiscount(String Item_Wise_Discount) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Item_Wise_Discount_Radio_Btn)));
		CommanUtill.clickFunction(Click_Item_Wise_Discount_Radio_Btn, Item_Wise_Discount);
	}
	public void SelectServicesDrp(String Services_Drp ) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Item_Wise_Services_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Item_Wise_Services_Drp, Services_Drp);
	}
	public void DiscountPerctageServicesItem(String Add_Icon)throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Services_Percentage_Add_Icon)));
		CommanUtill.clickFunction(Services_Percentage_Add_Icon, Add_Icon);
	}
	public void itemWiseDiscountValidation1(String mode, String value) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    SoftAssert softAssert = new SoftAssert();

	    // Wait for table rows
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblitemdiscount']//tbody//tr")));
	    List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tblitemdiscount']//tbody//tr"));
	    int totalRows = rows.size();

	    System.out.println("Total Rows Found: " + totalRows);
	    logger.info("Total Rows Found: " + totalRows);

	    Assert.assertTrue(totalRows > 0, "No rows found in Item Wise Discount table");
	    int rowIndex = 1;
	    for (WebElement row : rows) {

	        // Dynamic locators
	        WebElement itemAmountField = row.findElement(By.xpath(".//input[contains(@id,'itemamt')]"));
	        WebElement percentField = row.findElement(By.xpath(".//input[contains(@id,'itemdamt')]"));
	        WebElement discountField = row.findElement(By.xpath(".//input[contains(@id,'itemdispar')]"));

	        //FIX: Correct Net Amount column (NOT last column)
	        WebElement netField = row.findElement(By.xpath("./td[9]/input"));
	        
	        // Amount
	        String amountStr = itemAmountField.getAttribute("value").trim();
	        double amount = amountStr.isEmpty() ? 0.0 : Double.parseDouble(amountStr.replace(",", ""));
	        double enteredValue;
	        if (mode.equalsIgnoreCase("PERCENT")) {

	            percentField.clear();
	            percentField.sendKeys(value);
	            percentField.sendKeys(Keys.TAB);

	            wait.until(d -> !discountField.getAttribute("value").trim().isEmpty());
	            String percentStr = percentField.getAttribute("value").trim();
	            enteredValue = percentStr.isEmpty() ? 0.0 : Double.parseDouble(percentStr);

	        } else {

	            discountField.clear();
	            discountField.sendKeys(value);
	            discountField.sendKeys(Keys.TAB);

	            wait.until(d -> !percentField.getAttribute("value").trim().isEmpty());
	            String discountStrTemp = discountField.getAttribute("value").trim();
	            enteredValue = discountStrTemp.isEmpty() ? 0.0 : Double.parseDouble(discountStrTemp);
	        }

	        // Discount Amount
	        String discountStr = discountField.getAttribute("value").trim();
	        double discountAmt = discountStr.isEmpty() ? 0.0 :
	                Double.parseDouble(discountStr.replace(",", ""));

	        // Net Amount
	        String netStr = netField.getAttribute("value").trim();
	        double netAmt = netStr.isEmpty() ? 0.0 :
	                Double.parseDouble(netStr.replace(",", ""));

	        // Calculation
	        double expectedNet = amount - discountAmt;
	        boolean status = Math.abs(netAmt - expectedNet) <= 1.0;
	        String result = status ? "PASS" : "FAIL";

	        // Console
	        System.out.println("Row: " + rowIndex +
	                " | Amount: " + amount +
	                " | Mode: " + mode +
	                " | Entered: " + enteredValue +
	                " | Discount: " + discountAmt +
	                " | Net: " + netAmt +
	                " | Expected: " + expectedNet +
	                " | Status: " + result);

	        // Logger
	        logger.info("Row: " + rowIndex +
	                " | Amount: " + amount +
	                " | Mode: " + mode +
	                " | Entered: " + enteredValue +
	                " | Discount: " + discountAmt +
	                " | Net: " + netAmt +
	                " | Expected: " + expectedNet +
	                " | Status: " + result);

	        softAssert.assertTrue(status, "Net mismatch at row " + rowIndex);
	        rowIndex++;
	    }

	    logger.info("Item Wise Discount Validation Completed");
	    softAssert.assertAll();
	}
	//========================= Bill Settlement ===============================
	public void ClickOnSettlementBtn(String Settlement_Icon) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Bill_Settlement)));
		CommanUtill.clickFunction(Click_Bill_Settlement, Settlement_Icon);
	}
	public void ClickOnCashFullBillSettlement(String cash_Btn) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Cash_Btn)));
		CommanUtill.clickFunction(Click_Cash_Btn, cash_Btn);
	}
	public void EnterRemarksBillSettlement(String Remarks_Btn) throws IOException , InterruptedException{
		
		CommanUtill.textEnter(Bill_Settlement_Remarks, Remarks_Btn);
	}
	public void ClickOnReceiptBtn(String Receipt_Btn) throws IOException , InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Recipt_Settlement_Btn)));
		CommanUtill.clickFunction(Click_Recipt_Settlement_Btn, Receipt_Btn);
	}
	
	public void YesBillSettlePop(String Yes_Pop) throws IOException, InterruptedException {

	    if (CommanUtill.isElementPresent(Click_Recipt_Settlement_Yes_Pop)) {
	        CommanUtill.clickFunction(Click_Recipt_Settlement_Yes_Pop, Yes_Pop);
	        System.out.println("After Receipt Save Yes Pop");
	    }
	    else {
	    	 System.out.println("Did Not  Appered After Receipt Save Yes Pop");
	    }
	} 
	    public void OkBillSettledReceiptNo(String Settled_Receipt_Pop)throws IOException, InterruptedException {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Settled_Recipt_No_Ok_Pop)));
	    	
	    	if (CommanUtill.isElementPresent(Settled_Recipt_No_Ok_Pop)) {
		        CommanUtill.clickFunction(Settled_Recipt_No_Ok_Pop, Settled_Receipt_Pop);
		        System.out.println("Settled Receipt OK Pop Appered");
		    } else {
		        System.out.println("Settled Receipt OK Pop popup not appeared");
		    }
	    }
	    
	public void EnterLessThansettledAmount(String Amount) throws IOException, InterruptedException { 
		
		WebDriverWait amount = new WebDriverWait(driver, Duration.ofSeconds(5));
		amount.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enet_Amount)));
		CommanUtill.textEnter(Enet_Amount, Amount);
	}
	public void CounterFacilityCashReceived_Returned(String Received , String Returned_Cash) 
	        throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Cash_Received)));
		CommanUtill.textEnter(Cash_Received, Received);
		System.out.println("Entered Cash Received: " + Received);
		logger.info("Entered Cash Received: " + Received);

		String Returned = driver.findElement(By.xpath(Cash_Returned_Print)).getAttribute("value");

		logger.info("=============== Returned Cash =================");
		logger.info("Returned Cash : " + Returned);
		System.out.println("Returned Cash : " + Returned);
	}
   public void ClickOnDueBtn(String Due_Icon ,String  Authorised_Drp , String Remarks) throws IOException , InterruptedException{
		
		WebDriverWait Due = new WebDriverWait(driver, Duration.ofSeconds(5));
		Due.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Due_Btn)));
		CommanUtill.clickFunction(Click_Due_Btn, Due_Icon);
		
		CommanUtill.dropdownSelectByVisibleText(Due_Authorised_By_Drp, Authorised_Drp);
		CommanUtill.textEnter(Due_Remaks_Text, Remarks);
	}
   //==================Settlement In Cheque =======================
	
   public void ClickOnChequeAndChequeNo_IssueDateBankName_BranchName(String Cheque_Btn , String Cheque_Number ,String Issue_Date , String Banks_Name_Drp ,
		   String Branch_Name ) throws IOException , InterruptedException{
	   
	   CommanUtill.clickFunction(Click_Cheque_Btn, Cheque_Btn);
	   CommanUtill.textEnter(Cheque_No, Cheque_Number);
	   
	   WebElement issue_Date_ckk_Box = driver.findElement(By.xpath(Cheque_Issue_Date_Check_Box));
	   if(! issue_Date_ckk_Box.isSelected());
		 
	   WebElement Date = driver.findElement(By.xpath(ChequeIssue_Date));
	   Date.sendKeys(Keys.CONTROL + "a");
	   Date.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(ChequeIssue_Date, Issue_Date);
	   Date.sendKeys(Keys.TAB);
	   
	   CommanUtill.dropdownSelectByVisibleText(Cheque_Bank_Name_Drp, Banks_Name_Drp);
	   CommanUtill.textEnter(Cheque_Branch_Name, Branch_Name); 
   }
   public void PrintBillSettledAmountInCheque(String Settled_Amount) throws IOException , InterruptedException{
	   
	  String  Amount = driver.findElement(By.xpath(Cheque_Settle_Amount_Print)).getAttribute("value");
	   logger.info("============= Cheque Amount Settled Value ===================");
	   logger.info("Settled Amount :" + Amount);
	   System.out.println("Settled Amount In Cheque :" + Amount);
   }
   
   
   public String PrintBillSettledAmountInCheque() throws IOException, InterruptedException {

	    String amount = "";
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        WebElement settledAmountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Cheque_Settle_Amount_Print)));
	        amount = settledAmountElement.getAttribute("value");

	        // If still null or empty, use DOM property
	        if (amount == null || amount.isEmpty()) {
	            amount = settledAmountElement.getDomProperty("value");
	        }

	        logger.info("============= Cheque Amount Settled Value ===================");
	        logger.info("Settled Amount : " + amount);
	        System.out.println("Settled Amount In Cheque : " + amount);

	    } catch (Exception e) {
	        logger.info("Unable to fetch Settled Amount");
	        System.out.println("Error while fetching Settled Amount: " + e.getMessage());
	    }

	    return amount;
	}
   public void SelectByAuthorisedInCheque(String Authorised_Drp) throws IOException , InterruptedException{
	   
	   CommanUtill.dropdownSelectByVisibleText(Cheque_Authorised_Drp, Authorised_Drp);
   }
   
   //=======================Bill Settle Print =============================
   
	public void ClickOnSettleBillPrintBtn(String Print_Icon) throws IOException , InterruptedException{
		
		WebDriverWait print = new WebDriverWait(driver, Duration.ofSeconds(10));
		print.until(ExpectedConditions.elementToBeClickable(By.xpath(settle_Print_Btn)));
		CommanUtill.clickFunction(settle_Print_Btn, Print_Icon);
	}
	public void SettledReceiptNumberprintAndOkBtn(int value , String ok_Btn) throws IOException , InterruptedException{
		
		WebDriverWait print = new WebDriverWait(driver, Duration.ofSeconds(10));
		print.until(ExpectedConditions.presenceOfElementLocated(By.xpath(settle_Print_Receipt_No_Drp)));
		CommanUtill.dropdownSelectByIndex(settle_Print_Receipt_No_Drp, value);
		
		WebDriverWait ok = new WebDriverWait(driver, Duration.ofSeconds(10));
		ok.until(ExpectedConditions.elementToBeClickable(By.xpath(settle_Print_Receipt_Ok_Pop)));
		CommanUtill.clickFunction(settle_Print_Receipt_Ok_Pop, ok_Btn);	
	}
	public void CloseHISTreeBillSettledPrintPop(String Close_Pop) throws IOException, InterruptedException{
		
		if(CommanUtill.isElementPresent(Close_HIS_Trre_Settled_Pop)) {
			CommanUtill.clickFunction(Close_HIS_Trre_Settled_Pop, Close_Pop);
			System.out.println("Close Bill Settled Bill Receipt Pop");
		}
		else {
			System.out.println("Did not Appered Bill Settled Recipt Pop");
		}
	}
	//============================Print Btn ==============================
	public void ClickOnHeaderPrintBtn(String Print_Icon) throws IOException , InterruptedException{
		
		WebDriverWait print = new WebDriverWait(driver, Duration.ofSeconds(10));
		print.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Print_Btn)));
		CommanUtill.clickFunction(Click_Print_Btn, Print_Icon);
	}
	public void SummaryBillYesPop(String Summary , String Yes_pop) throws IOException , InterruptedException{
		
		WebDriverWait Radio_Btn = new WebDriverWait(driver, Duration.ofSeconds(10));
		Radio_Btn.until(ExpectedConditions.elementToBeClickable(By.xpath(Summary_Bill_Radio_Btn)));
		CommanUtill.clickFunction(Summary_Bill_Radio_Btn, Summary);
		CommanUtill.clickFunction(Yes_Print_Bill_Pop, Yes_pop);
	}
 //========================== FRRO Details ============================	
	
	public void ClickOnFRRODetailsBtn(String Frro) throws IOException , InterruptedException{
		
		WebDriverWait print = new WebDriverWait(driver, Duration.ofSeconds(5));
		print.until(ExpectedConditions.presenceOfElementLocated(By.xpath(FRRO_Dettails_Btn)));
		CommanUtill.clickFunction(FRRO_Dettails_Btn, Frro);	
	}
   public void EnterFRROApplicationNoAndSave(String Application_No , String Save_Btn) throws IOException , InterruptedException{
		
		CommanUtill.textEnter(FRRO_Application_No, Application_No);
		CommanUtill.clickFunction(FRRO_Details_Save_Btn, Save_Btn);
	}
  public void CloseFRRODetailsPop(String Close_FRRO)  throws IOException , InterruptedException{
	  
		CommanUtill.clickFunction(FRRO_Details_Close_Pop, Close_FRRO);
  }
	
	
}
