/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 21-Jul-2025
 */
public class FrontOfficeBillingPage extends GeneralBrowserSetting{

	//--------------------------------------billing page locators------------------------------

	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String click_billing_btn = "//span[normalize-space()='Billing']";
	protected static String billing_page = "//li[@id='FOBillingMenu']//li[1]";
	//protected static String billing_page_ = "//li[contains(@class,'datahide')]//a[normalize-space()='Billing']";
	protected static String enter_uhid = "//input[@id='uHid']";
	protected static String enter_card_number = "//input[@id='cardNo']";

	// --------------------------------------billing company popup, scheme detatils , scheme patient------------------------------ 
	protected static String scheme_close_popup = "//a[@id='schemeRemarksPopupClose']//i[@class='fa fa-times']";
	protected static String company_details_close_popup = "//a[@id='cancelinsurance']//i[@class='fa fa-times']";
	protected static String company_details_Plush_Icon_Popup = "//a[@id='addinsurance']//i[@class='fa fa-plus']";
	protected static String scheme_details_close_popup = "//a[@id='schemeclose']//i[@class='fa fa-times']";
	protected static String scheme_detail_authorise_approve_icon =  "//a[@id='btnokscheme']//i[@class='fa fa-check']";
	protected static String scheme_detail_Select_authorised_by  = "//select[@id='ddlschemeauth']";
	protected static String schemes_for_Patient_close_popup = "//span[@id='remarks_close1']";

	protected static String previous_visits = "//a[@id='previous_visit']";
	//---------------------------------- billing visit charge -------------------------------------
	protected static String click_visite_charge_icon = "//a[@id='opbillvisit']";
	protected static String visite_speciality_drp  = "//select[@id='ddlspecialization']";
	protected static String serach_doctor  = "//input[@id='autocomplete']";
	protected static String select_doctor_name_template = "//ul[@class='doctor_list list_details']/li[not(contains(@style,'none')) and contains(translate(normalize-space(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'%s')]";
	// protected static String select_doctor_name = "//ul[@class='doctor_list list_details']/li[contains(normalize-space(),'%s')]";
	protected static String room_number_drp  = "//select[starts-with(@id,'idroomnumber0')]";

	//--------  Diagnostics  ---------------
	protected static String click_diagnostics_btn = "//a[@id='opbilldiagnostic']";
	protected static String search_diagnostic_test = "//input[@id='autocomplete_tests']";

	protected static String click_diagnostic_test_top = "//ul[@class='tests_list']//li[not(contains(@style,'display: none'))][1]";
	protected static String diagnostic_priority_drp = "//select[starts-with(@id,'ddlpriority')]";
	protected static String diagnostics_speciality_drp = "//select[starts-with(@id,'ddlspec0')]";
	protected static String diagnostic_doctor_name = "//select[starts-with(@id,'ddldoc')]";

	//------------------ Mannual Test-----------------------

	protected static String click_mannual_btn = "//a[@id='opbillmannual']";
	protected static String manual_Serive_name_dropDown  = "//select[@id='ddlService']";
	protected static String manual_description_Field = "//input[@id='txtdes']";
	protected static String manual_Quantity_Field = "//input[@id='txtqnt']";
	protected static String manual_price_field = "//input[@id='txtprise']";
	protected static String manual_verify  = "//a[@id='new_manual_order']";
	protected static String manual_refresh_btn  = "//a[@id='new_manual_refresh']";

	//------------------ other Service-----------------------
	protected static String other_service_btn = "//a[@id='opbillservices']";
	protected static String other_service_Checkbox  = "//input[@id='otherServiceChk']";
	protected static String other_service_Serive_name_dropDown  = "//select[@id='ddotherservice']";
	protected static String other_service_serach_Field = "//input[@id='autocomplete_other_service']";
	protected static String other_service_select_service  = "//ul[@id='otherservice_list']//li[1]";
	protected static String other_service_priority_service  = "//select[@class='PriorityClNu']";
	protected static String other_service_specility_drp  = "//select[starts-with(@id,'osspec0')]";
	protected static String other_service_performing_doctor_drp  = "//select[starts-with(@id,'osdoc0')]";

	//--------------------------- Opd Packing-----------------------
	protected static String opd_packing_btn = "//a[@id='opbillopdpackage']";
	protected static String opd_package_serach_Field = "//input[@id='autocomplete_opdpckg']";
	protected static String opd_package_select_service  = "//ul[@class='OPDpckg_list clsopdpkg_list']//li[not(contains(@style,'display: none'))][1]";

	protected static String opd_package_name_poup_ok  = "//a[@id='opdPackageDetailPopupOK']";
	protected static String opd_package_courier_address_yes  = "//a[@id='opdPackageCourieraAddressPopupOK']";
	protected static String opd_packing_doctor_drp = "//select[starts-with(@id,'ddlopddoc')]";
	protected static String opd_packing_doctor_token = "//select[@id='ddlopdtoken']";
	protected static String opd_packing_doctor_yes = "//a[@id='btnpkgyes']";


	// --------------------------- Referral-----------------------
	protected static String ref  = "//input[@id='autocomplete_refby']";

	//--------------------------Facilitator Name----------------------
	protected static String facilitator_name_drp  = "//select[@id='_facilitatorName']";
	protected static String facilitator_clear  = "//img[@src='../../images/action_Newbtn/refreshD.svg']";

	//--------------------------Scheme _Details_Icon----------------------

	protected static String click_scheme_details_icon  = "//i[@class='fa fa-deviantart']";
	protected static String scheme_details_chekk_box  = "//input[@id='chkscheme']"; 
	protected static String scheme_details_drp  = "//select[@id='ddlscheme']";
	protected static String scheme_details_date  = "//input[@id='schemevalidity']";
	protected static String scheme_details_authorised_by  = "//select[@id='ddlschemeauth']";
	protected static String scheme_details_approve_icon  = "//a[@id='btnokscheme']//i[@class='fa fa-check']";

	//--------------------------Company Details Home Icon----------------------	
	protected static String click_company_details_home_icon  = "//a[@id='insurance_company']";
	protected static String company_details_cash_chekk_box  = "//input[@id='r_cash']";	
	protected static String company_details_Insurance_Company_chekk_box  = "//input[@id='r_com_insurance']";
	protected static String company_details_free_bill_chekk_box  = "//input[@id='chkfreebill']";

	protected static String company_details_company_type_drp  = "//select[@id='company_type']";	
	protected static String company_details_company_drp  = "//select[@id='company']";	
	protected static String company_details_rate_contract_drp  = "//select[@id='rate_contract']";

	protected static String company_details_document_check_list_No  = "//input[@class='textbox']";
	protected static String company_details_document_check_list_Chek_box_popup  = "//input[@id='_alldoccheck']";
	protected static String company_details_document_check_list_Save_popup= "//a[@id='_savelist']";
	protected static String company_details_document_check_list_close_popup= "//a[@id='_closelistpop']//i[@class='fa fa-times']";

	protected static String company_details_corporate_company_drp  = "//select[@id='corporate_company']";
	protected static String company_details_insurance_company_drp  = "//select[@id='tpa']";	
	protected static String company_details_company_department  = "//select[@id='CompanyDeptbilling']";	
	protected static String company_details_policy_number  = "//input[@id='policy_number']";	
	protected static String company_details_insurance_card_no  = "//input[@id='Insurance_Card_No']";
	protected static String company_details_AuthClaim_No_Guarantee_letter  = "//input[@id='ci_authorization']";
	protected static String company_details_auth_amount  = "//input[@id='ci_authamount']";
	protected static String company_details_employee_number  = "//input[@id='EmpNo']";
	protected static String company_details_certificate_number  = "//input[@id='CertNo']";
	protected static String company_details_standard_deductible  = "//input[@id='ci_deductible']";
	protected static String company_details_credit_limit  = "//input[@id='creditLimit']";
	protected static String company_details_otp  = "//input[@id='otp_creditLimit']";
	protected static String company_details_mvc_no  = "//input[@id='MVC_creditLimit']";
	protected static String company_details_standard_Copay  = "//select[@id='ddlIsCoPayAmtType']";
	protected static String company_details_copay  = "//input[@id='ci_copay']";	
	protected static String company_details_Show_all_companies_chkk  = "//input[@id='all_companies']";
	protected static String company_details_Yes_popup  = "//button[@id='btnyespolicy']";

	//--------------------------Employer Coverage----------------------
	protected static String company_employer_coverage_with_emp  = "//input[@id='employeeName']";
	protected static String company_employer_code  = "//input[@id='empCode']";
	protected static String company_employer_notes  = "//textarea[@id='ci_notes']";	
	protected static String company_details_plush_icon  = "//a[@id='addinsurance']//i[@class='fa fa-plus']";	

	//--------------------------Add To Bill----------------------
	protected static String click_add_to_bill  = "//a[@id='add_bill_visit']";

	//--------------------------Billing Header----------------------	

	protected static String save_draf_modal  = "//i[@class='fa fa-folder-open']";
	protected static String click_bill_header_btn  = "(//a[@id='process_payment'])[1]";
	protected static String billing_header_Yes_popup  = "//div[@id='modal_paymentprocess']";
	protected static String click_bill_Yes_popup  = "//a[@id='btnyesbal2']";
	protected static String billing_header_No_popup  = "//a[@id='btnnobal2']";	

	protected static String process_payment_save_btn  = "//a[@id='verify_modes']//i[@class='fa fa-save']";

	//--------------------------processPayment Popup----------------------
	protected static String process_payment_mode_cash_drp  = "//select[starts-with(@id,'paymentMode1')]";
	protected static String process_payment_mode_country_code  = "//select[@id='CountryCodes']";
	protected static String process_payment_mode_amount_drp  = "//input[@id='payment_mode_value1']";	
	protected static String process_payment_mode_cash_recieved  = "//span[@class='float_field']//input[@id='payable_amount']";	
	protected static String process_payment_direct_OP_Cash_Deposit  = "//input[@id='DirectOPCashDepositchk']";	

	//--------------------------process Payment Cheque Popup----------------------
	protected static String process_payment_mode_cheque_drp  = "//select[starts-with(@id,'paymentMode1')]";
	protected static String process_payment_mode_cheque_number  = "//input[@id='chequeNo']";
	protected static String process_payment_mode_cheque_date  = "//input[@id='chequeDate']";	
	protected static String process_payment_mode_cheque_validaty_date  = "//input[@id='chequeValidaty']";	
	protected static String process_payment_mode_cheque_bank_name  = "//select[@id='ChequeBank']";	
	protected static String process_payment_mode_cheque_branch_name  = "//input[@id='ChequeBranch']";

	//--------------------------Process payment Credit Card Popup----------------------
	protected static String process_payment_mode_credit_card_drp  = "//select[starts-with(@id,'paymentMode1')]";
	protected static String process_payment_mode_credit_card_type_drp  = "//select[@id='ccType']";
	protected static String process_payment_mode_credit_card_number  = "//input[@id='ccNumber']";
	protected static String process_payment_mode_credit_card_validaty  = "//input[@id='ccValidaty']";
	protected static String process_payment_mode_credit_card_bank_name_drp  = "//select[@id='ccbank']";
	protected static String process_payment_mode_credit_card_trans_no  = "//input[@id='approvalno']";

	//--------------------------process Payment NEFT Popup----------------------
	protected static String process_payment_mode_neft_drp  = "//select[@id='paymentMode1']";
	protected static String process_payment_mode_neft_trans_no  = "//input[@id='neftTransNo']";
	protected static String process_payment_mode_neft_trans_date  = "//input[@id='neftDate']";
	protected static String process_payment_mode_neft_bank_name_drp  = "//select[@id='neftbank']";
	protected static String process_payment_mode_neft_branch_name  = "//input[@id='neftBranch']";	
	protected static String process_payment_mode_neft_save  = "//a[@id='verify_modes']//i[@class='fa fa-save']";

	//--------------------------process payment other Popup----------------------

	protected static String process_payment_mode_other_drp  = "//select[@id='paymentMode1']";
	protected static String process_payment_mode_other_payment_type_drp  = "//select[@id='otherpaytype']";
	protected static String process_payment_mode_other_transaction_Id  = "//input[@id='othertransId']";
	protected static String process_payment_mode_other_details_RRN  = "//input[@id='txtRRNno']";
	protected static String process_payment_mode_other_remaks  = "//textarea[@id='otherpayremark']";	
	protected static String process_payment_mode_other_save  = "//a[@id='verify_modes']//i[@class='fa fa-save']";

	//--------------------------Process Payment Debit Card Popup----------------------

	protected static String process_payment_mode_debit_card_drp  = "//select[@id='paymentMode1']";
	protected static String process_payment_mode_debit_card_type_drp  = "//select[@id='dcType']";
	protected static String process_payment_mode_debit_card_number  = "//input[@id='dcNumber']";
	protected static String process_payment_mode_debit_card_validaty  = "//input[@id='dcValidaty']";	
	protected static String process_payment_mode_debit_card_bank_name_drp  = "//select[@id='dcbank']";
	protected static String process_payment_mode_debit_card_trans_no  = "//input[@id='dcTransNo']";
	protected static String process_payment_mode_debit_card_other_details  = "//input[@id='dcOtherDetails']";
	protected static String process_payment_mode_debit_card_save  = "//a[@id='verify_modes']//i[@class='fa fa-save']";

	//--------------------------process payment close Popup----------------------
	protected static String process_payment_close_popup  = "//a[@id='cancel_payment']//i[@class='fa fa-times']";

	//--------------------------After Payment Process Popup----------------------
	protected static String yes_popup_bill_genrate  = "//a[@id='btnyesrep']";
	protected static String no_popup_bill_genrate  = "//a[@id='btnnorep']";

	//--------------------------OPD Card Print Popup----------------------	
	protected static String opd_card_print_Yes_popup  = "//a[@id='btnyesopd']";
	protected static String opd_card_print_No_popup  = "//a[@id='btnnoopd']";

	//----------------------Scheme Details Popup -------------------------

	protected static String scheme_Chkk_popup  = "//input[@id='chkscheme']";
	protected static String scheme_select_popup  = "//select[@id='ddlscheme']";
	protected static String scheme_date_popup   = "//input[@id='schemevalidity']";
	protected static String scheme_authorised_popup   = "//select[@id='ddlschemeauth']";
	protected static String scheme_save_popup   = "//a[@id='btnokscheme']";

	//----------------------------- Discount Billing--------------------------------

	protected static String discount_Chkk_box   = "//input[@id='discount_checkbox']";
	protected static String discount_yes_popup   = "//a[@id='btndscyes']";
	protected static String discount_no_popup   = "//a[@id='btndscno']";
	protected static String discount_process_Discount_on_drp   = "//select[starts-with(@id,'discount_on1')]";
	protected static String discount_process_service_name_drp   = "//select[starts-with(@id,'dropdownservice1')]";
	protected static String discount_process_item_doctor_name_drp   = "//select[starts-with(@id,'dropdownitmname1')]";
	protected static String discount_process_total_amount   = "//input[starts-with(@id,'total_amount1')]";
	protected static String discount_process_discount_head_drp   = "//select[starts-with(@id,'discounthead1')]";
	protected static String discount_process_discount_reason   = "//select[starts-with(@id,'discountreason1')]";
	protected static String discount_process_discount_per   = "//input[starts-with(@id,'discount_percent1')]";
	protected static String discount_process_net_amount   = "//input[starts-with(@id,'net_amount1')]";

	protected static String discount_process_new_discount_item_btn   = "//a[@id='new_discount']";
	protected static String discount_process_calculate_dis_per   = "//a[@id='CalculateDiscount']";
	protected static String discount_process_authorised_by   = "//select[@id='ddlAuthorised_dis']";
	protected static String discount_process_on_patient_radio   = "//input[@id='rdbdispat']";
	protected static String discount_process_on_compant_radio   = "//input[@id='rdbdispat']";

	protected static String discount_process_user_namme   = "//input[@id='Approvedtext']";
	protected static String discount_process_password   = "//input[@id='passwordtext']";
	protected static String discount_process_approve_remaks   = "//textarea[@id='ApprovalRemarks']";
	protected static String discount_process_on_verify_approve_btn   = "//a[@id='ApprovedPassword']//i[@class='fa fa-check']";
	protected static String discount_process_click_send_approval_req   = "//a[@id='ApprovalRequest']";









	protected static String add_investigation_Instruction_popup  = "//button[@id='add_invInstruction']";
	protected static String cancel_investigation_Instruction_popup  = "//button[@id='cancel_invInstruction']";




	protected static String close_bill_popup  = "//div[@id='modal_opdcardrpt']//i[@class='fa fa-times']";

	protected static String same_doctor_visite_yes  = "//button[@class='btn btn-default'][normalize-space()='Yes']";
	protected static String same_doctor_visite_no  = "//button[@class='btn btn-default'][normalize-space()='No']";

	protected static String home_page  = "//img[@id='showmenuIcon1']";

	//____________________________Billing Physician___________________________________

	protected static String physician_bill_icon  = "//h4[@class='fa fa-medkit']";
	protected static String order_status   = "//select[@id='order_status']";
	protected static String che_all_facility  = "//input[@id='chkbx']";
	protected static String click_table_benefites  = "//i[@title='Table of Benefits']"; 
	protected static String check_for_approval  = "//input[@id='APchkboxid']";
	//   protected static String bill_type  = "//input[@id='chkboxid']";

	protected static String self_approve  = "//a[@id='Txt_PO_Approve']";
	protected static String self_approve_req_remaks_chek  = "//input[@id='ChkSelfApproval_Insurance']";
	protected static String remarks_approve  = "//textarea[@id='TxtCrPopup_Remarks']";
	protected static String rerify_self_approve_icon  = "//a[@title='Close']//i[@class='fa fa-check']";

	protected static String reject  = "//a[@id='Txt_PO_Reject']";
	protected static String send_to_insureance = "//a[@id='Txt_PO_SendInsuranceDesk']";
	protected static String click_plush_icon  = "//a[@id='addphyorder']//i[@class='fa fa-plus']";
	protected static String close_bill_physician_order  = "//a[@id='cancelphyorder']";
	//___________________________rebilling_______________________________________

	protected static String rebilling_phy_icon  = "//a[@id='opbillphysiciantab']";
	protected static String table_benifites  = "//body[1]/div[5]/div[19]/div[1]/section[1]/form[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[10]";
	protected static String checkbox_approval  = "//input[@id='APchkboxid']";
	protected static String check_select_all  = "//input[@id='chkboxid']";
	protected static String plush_icon  = "//a[@id='addphyorder']//i[@class='fa fa-plus']";
	protected static String close_company_details  = "//a[@id='cancelinsurance']//i[@class='fa fa-times']";
	protected static String add_to_bill  = "//a[@id='add_bill_visit']";

	protected static String rebilling_heardbeat_icon  = "//h4[@class='fa fa-heartbeat']";
	protected static String rebilling_specility_drp  = "//select[@id='ddlspec2']";
	protected static String rebilling_doctor_name_drp  = "//select[@id='ddldoc2']";

	//------------------------------Billing Source ----------------------------

	protected static String source_select  = "//select[@id='Source_id']";
	protected static String Subsource_select  = "//select[@id='Subsource_id']";
	protected static String billing_remaks  = "//textarea[@id='billremark']";







	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}
	//--------------------------------------billing page methods------------------------------
	public void clickOnBillingButton(String billing , String Billing_Page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_billing_btn, billing);
		CommanUtill.clickFunction(billing_page, billing);

	}

	public void enterOnUHIDBilling(String filedname) throws IOException, InterruptedException { 

		CommanUtill.textEnter(enter_uhid, filedname);
		driver.findElement(By.xpath(enter_uhid)).sendKeys(Keys.ENTER);;
	}
	public void enterOnUHIDBillingPage(String filedname) throws IOException, InterruptedException { 

		CommanUtill.textEnter(enter_uhid, filedname);

	}
	public void enterOnCardNumberBilling(String filedname) throws IOException, InterruptedException {

		CommanUtill.textEnter(enter_card_number, filedname);
		WebElement cardno = driver.findElement(By.xpath(enter_card_number));
		cardno.sendKeys(Keys.ENTER);

	}
	//----------------------billing company popup, scheme detatils , scheme patient---------------------


	public void closeSchemePopup(String Scheme_popup) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(scheme_close_popup)) {
			CommanUtill.clickFunction(scheme_close_popup, Scheme_popup);
			System.out.println("scheme details popup appeared and was closed.");
		} else {
			System.out.println("Scheme details did not appear.");
		}
	}

	public void closeCompanyDetailsPopup(String company_popup) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(company_details_close_popup)) {
			CommanUtill.clickFunction(company_details_close_popup, company_popup);
			System.out.println("Company details popup appeared and was closed.");
		} else {
			System.out.println("Company details did not appear.");
		}
	}

	public void plushIconCompanyDetailsPopup(String company_plush_Icon) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(company_details_Plush_Icon_Popup)) {
			CommanUtill.clickFunction(company_details_Plush_Icon_Popup, company_plush_Icon);
			System.out.println("Company details popup appeared and was closed.");
		} else {
			System.out.println("Company details did not appear.");
		}
	}

	public void closeSchemeDetailsPopup(String scheme_popup) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(scheme_details_close_popup)) {
			CommanUtill.clickFunction(scheme_details_close_popup, scheme_popup);
			System.out.println("Scheme details popup appeared and was closed.");
		} else {
			System.out.println("Scheme details did not appear.");
		}
	}

	public void selectByAuthorisedByDropdwonSchemeDetailsPopup(String authorised_by) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(scheme_detail_authorise_approve_icon)) {

			CommanUtill.dropdownSelectByVisibleText(scheme_detail_Select_authorised_by, authorised_by);
			CommanUtill.clickFunction(scheme_detail_authorise_approve_icon, authorised_by);
			System.out.println("Scheme Authorised By popup appeared and verify Button.");
		} else {
			System.out.println("Scheme Authorised By did not appear.");
		}
	}
	public void closeSchemesForPatientPopup(String scheme_patient_popup) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(schemes_for_Patient_close_popup)) {
			CommanUtill.clickFunction(schemes_for_Patient_close_popup, scheme_patient_popup);
			System.out.println("Scheme for Patient details popup appeared and was closed.");
		} else {
			System.out.println("Scheme for Patient details did not appear.");
		}
	}

	protected static String selectschemepatient = "//table[@id='schamesageabiablity']//tr[1]//td";

	public void SelectSchemesForPatientPopup(String scheme_patient_popup) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(selectschemepatient)) {
			CommanUtill.clickFunction(selectschemepatient, scheme_patient_popup);
			System.out.println("Scheme for Patient details popup appeared and was select.");
		} else {
			System.out.println("Scheme for Patient details did not appear.");
		}
	}
	public void visitSpecialityAndDoctorName(String visit_icon , String specility_drp , String doctorName)
			throws IOException , InterruptedException{

		//CommanUtill.clickFunction(click_visite_charge_icon, visit_icon);
		CommanUtill.dropdownSelectByVisibleText(visite_speciality_drp, specility_drp);
		CommanUtill.textEnter(serach_doctor, doctorName);

		String doctorXpath = String.format(select_doctor_name_template, doctorName.trim().toLowerCase());
		System.out.println(">>> FINAL DOCTOR XPATH = " + doctorXpath);

		WebDriverWait wait = new WebDriverWait(CommanUtill.driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(doctorXpath)));

		CommanUtill.clickFunction(doctorXpath, doctorName);
	}

	public void selectByVisitRoomNumberDrp(String Room_no_drp) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(room_number_drp, Room_no_drp);
	}

	//Diagnostics
	public void clickOnDiagnosticsTestAndName(String diagnostics_btn , String serach_diagnostics_box) throws IOException, InterruptedException{

		CommanUtill.clickFunction(click_diagnostics_btn, diagnostics_btn);
		CommanUtill.textEnter(search_diagnostic_test, serach_diagnostics_box);

	}
	public void diagnosticsTestAndPrioritySpecialityDoctorName(String select_diagnostics ,String Priorty_drp , String diagnostics_speciality , String Doctor_Name) 
			throws IOException, InterruptedException{

		CommanUtill.clickFunction(click_diagnostic_test_top, select_diagnostics);
		CommanUtill.dropdownSelectByVisibleText(diagnostic_priority_drp, Priorty_drp);
		CommanUtill.dropdownSelectByVisibleText(diagnostics_speciality_drp, diagnostics_speciality);
		CommanUtill.dropdownSelectByVisibleText(diagnostic_doctor_name, Doctor_Name);

	}
	public void enterManualTestPriceAndQulity(String manual_btn , String Service_Name_drp, String Description_text , String Quantity_text, 
			String Price_text , String verify_btn) throws IOException , InterruptedException{

		CommanUtill.clickFunction(click_mannual_btn, manual_btn);
		CommanUtill.dropdownSelectByVisibleText(manual_Serive_name_dropDown, Service_Name_drp);
		CommanUtill.textEnter(manual_description_Field, Description_text);
		CommanUtill.textEnter(manual_Quantity_Field, Quantity_text);
		CommanUtill.textEnter(manual_price_field, Price_text);
		CommanUtill.clickFunction(manual_verify, verify_btn);
	}

	public void enterOnReferredBy(String refered_doctor) throws IOException, InterruptedException{

		CommanUtill.textEnter(ref, refered_doctor);
		WebElement ref = driver.findElement(By.xpath("//input[@id='autocomplete_refby']"));
		ref.sendKeys(Keys.ENTER);
		ref.sendKeys(Keys.ENTER); 
	}

	public void enterFacilitatorNameText(String facilitator_Name)  throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(facilitator_name_drp, facilitator_Name);

	}

	public void clickOnAddToBillButton(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(click_add_to_bill, filedName);
	}

	//--------------------- Scheme Details Popup -------------------------------

	public void schemeCheckBoxPopup(String checkbox) throws IOException, InterruptedException{

		CommanUtill.clickFunction(scheme_Chkk_popup, checkbox);
	}
	public void selectSchemekDropdwonPopup(String scheme) throws IOException, InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(scheme_select_popup, scheme);
	}

	public void enterSchemekDatePopup(String date) throws IOException, InterruptedException{

		CommanUtill.textEnter(scheme_date_popup, date);
	}
	public void selectSchemeAuthorisedByPopup(String authorised_by) throws IOException, InterruptedException{

		if(CommanUtill.isElementPresent(scheme_authorised_popup)) {
			CommanUtill.dropdownSelectByVisibleText(scheme_authorised_popup, authorised_by);
			CommanUtill.clickFunction(scheme_save_popup, authorised_by);
			System.out.println("Scheme Details Popup appear");
		}
		else {
			System.out.println("Did't not Appear Scheme Details Popup");
		}

	}

	public void saveSchemeDetailsPopup(String SaveIcon) throws IOException, InterruptedException{

		CommanUtill.clickFunction(scheme_save_popup, SaveIcon);
	}

	public void clickOnBillingOnHeader(String filedName) throws IOException, InterruptedException{ 

		CommanUtill.clickFunction(click_bill_header_btn, filedName);

	} 
	public void clickOnBillingYesPopup(String filedName) throws IOException, InterruptedException{ 

		CommanUtill.clickFunction(click_bill_Yes_popup, filedName);

	}

	public void clickOnProcessPaymentSaveIcon(String save_icon) throws IOException, InterruptedException{  

		if(CommanUtill.isElementPresent(process_payment_save_btn)){
			CommanUtill.clickFunction(process_payment_save_btn, save_icon);
			System.out.println("Process TO Payment Save Icon Popup");
		}
		else {
			System.out.println("Process to Payment Save Icon Did Not Appears");
		}
	}
	public void YesPopupConsultationSameDoctorPopup(String Same_doctor) throws IOException, InterruptedException{

		if (CommanUtill.isElementPresent(same_doctor_visite_yes)) {
			CommanUtill.clickFunction(same_doctor_visite_yes, Same_doctor);
			System.out.println("Same doctor popup appeared and Yes Button");
		} else {
			System.out.println("same doctor visit did not appear.");
		}
	}

	public void clickOngeneratedsuccessfullyPrintBillPopup(String filedName) throws IOException, InterruptedException{ 

		CommanUtill.clickFunction(yes_popup_bill_genrate, filedName);
		WebElement click_bod = driver.findElement(By.xpath("(//body)[1]"));
		click_bod.click();
	}

	public void YesPopupOPDCArdPrint(String OPD_Card) throws IOException ,InterruptedException{

		CommanUtill.clickFunction(opd_card_print_Yes_popup, OPD_Card);
	}

	public void selectBySourceTypeDropDwon(String source) throws IOException ,InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(source_select, source);
	}

	public void selectBySubSourceTypeDropDwon(String Subsource) throws IOException ,InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(Subsource_select, Subsource);
	}

	public void enterBillingRemaks(String Remaks) throws IOException , InterruptedException{

		CommanUtill.textEnter(billing_remaks, Remaks);

	}
	//------------------------- Billing Other Service ---------------------------------

	public void otherSevicesAndChooseServices(String Other_Services , String choose_otherServices, String select_otherservices_drp)
			throws IOException , InterruptedException{

		CommanUtill.clickFunction(other_service_btn, Other_Services);
		CommanUtill.clickFunction(other_service_Checkbox, choose_otherServices);
		CommanUtill.dropdownSelectByVisibleText(other_service_Serive_name_dropDown, select_otherservices_drp);
	}

	public void serachOtherServicesAndCkick(String Other_services_name , String services_click) throws IOException , InterruptedException{

		CommanUtill.textEnter(other_service_serach_Field, Other_services_name);
		CommanUtill.clickFunction(other_service_select_service, services_click);
	}

	public void enterOtherServicesPrioritySpecialityPerformingDoctor(String Priority_drp , String Speciality_drp , String PerformingDoctor_drp) 
			throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(other_service_priority_service, Priority_drp);
		CommanUtill.dropdownSelectByVisibleText(other_service_specility_drp, Speciality_drp);
		CommanUtill.dropdownSelectByVisibleText(other_service_performing_doctor_drp, PerformingDoctor_drp);

	}

	//--------------------------OPD Pakage Billing -------------------------------	
	public void clickOnOPDPakagesSerachAndSelect(String opd_btn , String opdpakages_Serach, String Select_opd_Pakages , String opd_pakage_name_ok_popup) 
			throws IOException , InterruptedException{

		CommanUtill.clickFunction(opd_packing_btn, opd_btn);
		CommanUtill.textEnter(opd_package_serach_Field, opdpakages_Serach);
		CommanUtill.clickFunction(opd_package_select_service, Select_opd_Pakages);
		CommanUtill.clickFunction(opd_package_name_poup_ok, opd_pakage_name_ok_popup);
	}

	public void clickOnCourierAddressOPDPakage(String Courier_address_yes) throws IOException , InterruptedException{ 

		CommanUtill.clickFunction(opd_package_courier_address_yes, Courier_address_yes);
	}

	public void enterOPDPakagesDoctorNameAndToken(String OPD_Doctor_name , String Tolken_no , String Yes_Popup) throws IOException , InterruptedException{ 

		CommanUtill.dropdownSelectByVisibleText(opd_packing_doctor_drp, OPD_Doctor_name);
		//CommanUtill.dropdownSelectByVisibleText(opd_packing_doctor_token, Tolken_no);
		CommanUtill.clickFunction(opd_packing_doctor_yes, Yes_Popup);
	}

	public void HomeIconInCompanyInsurranceIcon(String Home_Icon) throws IOException , InterruptedException{

		CommanUtill.clickFunction(click_company_details_home_icon, Home_Icon);
	}

	public void clickOnBillTypeRadioButton(String Insurance_radio_Button) throws IOException , InterruptedException{ 

		CommanUtill.clickFunction(company_details_Insurance_Company_chekk_box, Insurance_radio_Button);
	}

	public void selectByCompanyType_CompanyAndRateContract(String company_type_drp , String Company_drp , String Rate_con_drp ) 
			throws IOException , InterruptedException{ 

		CommanUtill.dropdownSelectByVisibleText(company_details_company_type_drp, company_type_drp);
		CommanUtill.dropdownSelectByVisibleText(company_details_company_drp, Company_drp);
		CommanUtill.dropdownSelectByVisibleText(company_details_rate_contract_drp, Rate_con_drp);
	}

	public void  PopupDocumentCheckListInCompanyDetails(String Insurance_Card , String CheckBox , String SavePopup)  
			throws IOException , InterruptedException{ 

		CommanUtill.textEnter(company_details_document_check_list_No, Insurance_Card);
		CommanUtill.clickFunction(company_details_document_check_list_Chek_box_popup, CheckBox);
		CommanUtill.clickFunction(company_details_document_check_list_Save_popup, SavePopup);
	}

	public void YesPopupleasere_validate(String Yes_Popup)  throws IOException , InterruptedException{ 

		if(CommanUtill.isElementPresent(company_details_Yes_popup)) {
			CommanUtill.clickFunction(company_details_Yes_popup, Yes_Popup);
			System.out.println("Yes Popup Apperared Policy information");
		}
		else {
			System.out.println("Did Not Appear Popup Policy information");

		}
	}
	
	//----------------------------- Discount bill--------------------------------
	
	public void clickOnCheckBoxDiscountAndYespopup(String chkk_box ,String  Yes_popup) throws IOException , InterruptedException{ 

		CommanUtill.clickFunction(discount_Chkk_box, chkk_box);
		CommanUtill.clickFunction(discount_yes_popup, Yes_popup);
	}

	public void selectByProcessDiscounts_DiscountOnDrp(String Discount_on) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(discount_process_Discount_on_drp, Discount_on);

	}
	public void selectByDiscountHeadAndReasonDrp(String discount_head , String Reason_drp) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(discount_process_discount_head_drp, discount_head);
		CommanUtill.dropdownSelectByVisibleText(discount_process_discount_reason, Reason_drp);
	}

	public void selectByServiceNameDrp(String service_name) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(discount_process_service_name_drp, service_name);
	}

	public void selectByItem_DoctorNameNameDrp(String doctor_name) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(discount_process_item_doctor_name_drp, doctor_name);
	}
	
	public void clickOnPlushNewDiscountItemBtn(String new_discount_iteam) throws IOException , InterruptedException{

		CommanUtill.clickFunction(discount_process_new_discount_item_btn, new_discount_iteam);
	}

	public void clickOnCalculateDiscountPercentageBtn(String Calculate_Discount) throws IOException , InterruptedException{

		CommanUtill.clickFunction(discount_process_calculate_dis_per, Calculate_Discount);
	}

	public void SelectByAuthorisedbyDrp(String Authorised_by) throws IOException , InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(discount_process_authorised_by, Authorised_by);	
	}
	
	public void enterProcessDiscountsRequestRemaks(String remkas) throws IOException , InterruptedException{
		
		CommanUtill.textEnter(discount_process_approve_remaks, remkas);
	}
	
	public void enterApproveUserNamePasswordAndVerify(String user_name ,String password ,String verify_btn) 
			throws IOException , InterruptedException{
		CommanUtill.textEnter(discount_process_user_namme, user_name);
		CommanUtill.textEnter(discount_process_password, password);
		CommanUtill.clickFunction(discount_process_on_verify_approve_btn, verify_btn);
	}
//------------------------Mode Of Payment------------------------	
	
public void processToPaymentByCheque(String payment_mode , String ChequeNo , String bank_name , String branch) 
		throws IOException , InterruptedException{
	
	CommanUtill.dropdownSelectByVisibleText(process_payment_mode_cheque_drp, payment_mode);
	CommanUtill.textEnter(process_payment_mode_cheque_number, ChequeNo);
	CommanUtill.dropdownSelectByVisibleText(process_payment_mode_cheque_bank_name, bank_name);
	CommanUtill.textEnter(process_payment_mode_cheque_branch_name, branch);
}
	
	public void processToPaymentByCreditCard(String payment_mode , String Card_type_drp , String Card_no , String Bank_Name , String Trans_no) 
			throws IOException , InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(process_payment_mode_credit_card_drp, payment_mode);
		CommanUtill.dropdownSelectByVisibleText(process_payment_mode_credit_card_type_drp, Card_type_drp);
		CommanUtill.textEnter(process_payment_mode_credit_card_number, Card_no);
		CommanUtill.dropdownSelectByVisibleText(process_payment_mode_credit_card_bank_name_drp, Bank_Name);
		CommanUtill.textEnter(process_payment_mode_credit_card_trans_no, Trans_no);
	}

	

	
	
	
	
	
	
	
	

	public void clickOnAddInvestigationInstructionPopup(String filedName) throws IOException, InterruptedException{  

		//CommanUtill.clickFunction(add_investigation_Instruction_popup, filedName);
		if (CommanUtill.isElementPresent(add_investigation_Instruction_popup)) {
			CommanUtill.clickFunction(add_investigation_Instruction_popup, filedName);
			System.out.println("add new investigation Instruction popup appeared and was closed.");
		} else {
			System.out.println("add New new investigation Instruction did not appear.");
		}


	}

	public void clickOnCanncelInvestigationInstructionPopup(String filedName) throws IOException, InterruptedException{ 

		//  CommanUtill.clickFunction(cancel_investigation_Instruction_popup, filedName);

		if (CommanUtill.isElementPresent(cancel_investigation_Instruction_popup)) {
			CommanUtill.clickFunction(cancel_investigation_Instruction_popup, filedName);
			System.out.println("cancelinvestigation Instruction popup appeared and was closed.");
		} else {
			System.out.println("Cancel investigation Instruction did not appear.");
		}


	}

	public void closePrintBillPopup(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(close_bill_popup, filedName);

	}


	public void clickOnNoConsultationSameDoctorPopup(String filedName) throws IOException, InterruptedException{ 

		if (CommanUtill.isElementPresent(same_doctor_visite_no)) {
			CommanUtill.clickFunction(same_doctor_visite_no, filedName);
			System.out.println("Same Doctor no visite popup appeared and was closed.");
		} else {
			System.out.println("same doctor visie did not appear.");
		}
		// CommanUtill.clickFunction(same_doctor_visite_no, filedName);

	}
	public void clickOnHomePage(String filedName) throws IOException, InterruptedException{ 

		CommanUtill.clickFunction(home_page, filedName);
	}

	//___________________________Rebilling______________________________ 


	public void clickOnRebillingPhysicianOrderIcon(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(rebilling_phy_icon, filedName);

	}

	public void clickOnTableBenefitsButton(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(table_benifites, filedName);

	}

	public void clickOnCheckforApprovalCheckBox(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(checkbox_approval, filedName);

	}

	public void clickOnSelectAllCheckBox(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(check_select_all, filedName);

	}

	public void clickOnPlushIcon(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(plush_icon, filedName);

	}




	public void clickOnCompanyDetailsClosePopup(String filedName) throws IOException, InterruptedException{

		if (CommanUtill.isElementPresent(close_company_details)) {
			CommanUtill.clickFunction(close_company_details, filedName);
			System.out.println("Company details popup appeared and was closed.");
		} else {
			System.out.println("Company details did not appear.");
		}

		//  CommanUtill.clickFunction(close_company_details, filedName);

	}

	public void clickOnRebillingHeartBeatButton(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(rebilling_heardbeat_icon, filedName);

	}

	public void selectByRebillingSpecilityDropdwon(String filedName) throws IOException, InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(rebilling_specility_drp, filedName);

	}

	public void selectByRebillingDoctorNameDropdwon(String filedName) throws IOException, InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(rebilling_doctor_name_drp, filedName);

	}

	//_______________Self Approve reBilling _______________________

	public void clickOnRebillingSelfApproveHeaderButton(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(self_approve, filedName);

	}

	public void clickOnRebillingSelfApproveCheckBox(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(self_approve_req_remaks_chek, filedName);

	}

	public void enterOnRebillingSelfApproveRemaks(String filedName) throws IOException, InterruptedException{

		CommanUtill.textEnter(remarks_approve, filedName);

	}

	public void clickOnRebillingSelfApprovesverifysingn(String filedName) throws IOException, InterruptedException{

		CommanUtill.clickFunction(rerify_self_approve_icon, filedName);
	}


}
