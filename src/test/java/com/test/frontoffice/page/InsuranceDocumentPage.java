/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.mongodb.event.CommandEventMulticaster;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 06-Jan-2026
 */
public class InsuranceDocumentPage extends GeneralBrowserSetting{

	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String insurance_document_page = "//a[normalize-space()='Insurance Documents']";

	//-----------------------OP insurance Document ---------------------------
	protected static String op_radio_btn = "//input[@id='OPpatient']";
	protected static String op_uhid = "//input[@id='txt_UHID_insuredoc']";
	protected static String visit_wise_radio_btn = "//input[@id='OPVisitpatient']";
	protected static String encounter_wise_radio_btn = "//input[@id='OPEncounterpatient']";
	protected static String op_from_date= "//input[@id='txtstartdate']";
	protected static String op_to_date = "//input[@id='txtlastdate']";
	protected static String op_serach_icon = "//i[@title='Search']";

	//----------------------------------Genreate Pdf --------------------------------
	protected static String doctor_assign_patient_click = "//div[@id='visitDetailTable']/div[4]";
	protected static String op_bills_generate_pdf = "//td[@onclick='opbilldownload()']";
	protected static String op_precription_generate_pdf = "//td[@onclick='opPrecriptiondownload()']";
	protected static String op_pharmacy_generate_pdf = "//td[@onclick='opPharmacydownload()']";
	protected static String op_consents_generate_pdf = "//td[@onclick='consentoppdf()']";
	protected static String op_lab_generate_pdf = "//td[@onclick='opbilldownload()']";
	protected static String op_diagnostic_generate_pdf = "//table[@id='tblDiaogchkbox']";

	protected static String op_claim_report_generate_pdf = "//td[@onclick='View()']";
	protected static String op_claim_report_left_upload_doc_type_drp_popup = "//select[@id='doctypeid1']";
	protected static String op_claim_report_left_upload_document_drp = "//select[@id='uploaddocid1']";        
	protected static String op_claim_report_right_upload_doc_type_drp_popup = "//select[@id='doctypeid2']";
	protected static String op_claim_report_right_upload_document_drp = "//select[@id='uploaddocid2']";   

	protected static String op_claim_report_ok_popup = "//a[@id='openrpt']";   
	protected static String op_claim_report_close_popup = "//a[@id='btn_Close']//i[@class='fa fa-times']";   

	protected static String op_merge_make_single_doc = "//button[@id='BtnMerge']"; 

	//----------------------- -IP insurance Document -------------------------------

	protected static String Ip_Radio_Btn = "//input[@id='IPpatient']"; 
	protected static String enter_ip_uhid = "//input[@id='txt_IPNO_insuredoc']"; 
	protected static String Ip_assign_doctor = "//div[@id='visitDetailTable']//div[1]"; 

	protected static String Ip_bill_generate_pdf = "//td[@onclick='billdownload()']"; 
	protected static String Ip_discharge_summary_generate_pdf = "//td[@onclick='Dischargesummarydocdownload()']"; 
	protected static String Ip_cosents_generate_pdf  = "//div[@id='visitDetailTable']//div[1]"; 
	protected static String Ip_lab_reports_generate_pdf  = "//div[@id='visitDetailTable']//div[1]"; 
	protected static String Ip_diagnostic_reports_generate_pdf  = "//div[@id='visitDetailTable']//div[1]"; 
	protected static String Ip_external_documents_generate_pdf  = "//div[@id='visitDetailTable']//div[1]"; 

	protected static String Ip_merge_make_single_docket  = "//button[@id='BtnMerge']"; 





	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void FoAddpatientmeanu(String add_patient ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
	}

	public void clickOnInsuranceDocumentPage(String Insurance_Document) throws IOException, InterruptedException {

		CommanUtill.clickTabSwitchToAnotherWindow(insurance_document_page, Insurance_Document);
	}

	public void RadioButtonOPPatient(String op_patient) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_radio_btn, op_patient);
	}

	public void enterOPPatientUHID(String Uhid) throws IOException, InterruptedException {

		CommanUtill.textEnter(op_uhid, Uhid);
		driver.findElement(By.xpath(op_uhid)).sendKeys(Keys.ENTER);
	}

	public void VisitWiseRadioButton(String visit_wise) throws IOException, InterruptedException {

		CommanUtill.clickFunction(visit_wise_radio_btn, visit_wise);

	}

	public void EncounterWiseRadioButton(String encounter_wise) throws IOException, InterruptedException {

		CommanUtill.clickFunction(encounter_wise_radio_btn, encounter_wise);	
	}

	public void enterFromDateAndToDateSerach(String From_Date , String to_date , String Serach_icon) throws IOException, InterruptedException {

		CommanUtill.textEnter(op_from_date, From_Date);
		CommanUtill.textEnter(op_to_date, to_date);
		CommanUtill.clickFunction(op_serach_icon, Serach_icon);
	}

	//----------------------Assign Doctor Tab ------------------------------

	public void clickOnAssignToDoctotTab(String assign_Doctor) throws IOException, InterruptedException {

		CommanUtill.clickFunction(doctor_assign_patient_click, assign_Doctor);

	}

	public void OPDocumentsOpBillsGeneratePdfBtn(String op_bill_generate_pdf) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_bills_generate_pdf, op_bill_generate_pdf);
	}

	public void OpPrecriptionGeneratePdfBtn(String pre_generate_pdf) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_precription_generate_pdf, pre_generate_pdf);
	} 

	public void OpPharmacyGeneratePdfBtn(String pharmacy_generate_pdf) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_pharmacy_generate_pdf, pharmacy_generate_pdf);
	} 

	public void OpConsentGeneratePdfBtn(String consent_generate_pdf) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_consents_generate_pdf, consent_generate_pdf);
	} 

	public void OpLabGeneratePdfBtn(String Lab_generate_pdf) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_lab_generate_pdf, Lab_generate_pdf);

	} 

	public void OpDiagnosticGeneratePdfBtn(String Diagnostic_generate_pdf) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_diagnostic_generate_pdf, Diagnostic_generate_pdf);

	}
	public void OpClaimReportGeneratePdfBtnPopup(String ClaimReport_generate_pdf) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_claim_report_generate_pdf, ClaimReport_generate_pdf);

	}

	public void ClosePopupClaimReportGeneratePdf(String claim_report) throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_claim_report_close_popup, claim_report);

	}

	public void UploadClaimReportDocumentLeft_RightOk(String left_upload_doc_type_drp , String left_upload_document_drp ,
			String Right_upload_doc_type_drp, String Right_upload_document ,String click_Ok_Btn) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(op_claim_report_left_upload_doc_type_drp_popup, left_upload_doc_type_drp);
		CommanUtill.dropdownSelectByVisibleText(op_claim_report_left_upload_document_drp, left_upload_document_drp);
		CommanUtill.dropdownSelectByVisibleText(op_claim_report_right_upload_doc_type_drp_popup, Right_upload_doc_type_drp);
		CommanUtill.dropdownSelectByVisibleText(op_claim_report_right_upload_document_drp, Right_upload_document);
		CommanUtill.clickFunction(op_claim_report_ok_popup, click_Ok_Btn);
	}

	public void clickOnMergeAndMakeSingleDocketBtn(String Make_single_doc)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(op_merge_make_single_doc, Make_single_doc);

	}
	//----------------------- -IP insurance Document -------------------------------

	public void IpRadioButton(String ip_Radio)throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_Radio_Btn, ip_Radio);

	}

	public void enterIPNumber(String Enter_ip_number) throws IOException, InterruptedException {

		CommanUtill.textEnter(enter_ip_uhid, Enter_ip_number);
		driver.findElement(By.xpath(enter_ip_uhid)).sendKeys(Keys.ENTER);

	}
	public void clickOnAssignDoctorSlotTable(String Click_Assign_Doctor) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_assign_doctor, Click_Assign_Doctor);
	}

	public void GeneratePdfIPBills(String IP_Bills_Generate)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_bill_generate_pdf, IP_Bills_Generate);
	}

	public void GeneratePdfIPDischargeSummary(String IP_Discharge_Summary_Generate)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_discharge_summary_generate_pdf, IP_Discharge_Summary_Generate);
	}

	public void GeneratePdfIPConsents(String IP_Consents_Generate_pdf)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_cosents_generate_pdf, IP_Consents_Generate_pdf);
	} 

	public void GeneratePdfIPLabReports(String IP_Lab_Reports_Generate_pdf)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_lab_reports_generate_pdf, IP_Lab_Reports_Generate_pdf);
	} 

	public void GeneratePdfIPDiagnosticReports(String IP_Diagnostic_Reports_Generate_pdf)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_diagnostic_reports_generate_pdf, IP_Diagnostic_Reports_Generate_pdf);
	} 

	public void GeneratePdfIPExternalDocuments(String IP_External_Documents_Generate_pdf)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_external_documents_generate_pdf, IP_External_Documents_Generate_pdf);
	} 

	public void clickOnMergeAndMakeSingleDocket(String singepdf_file) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ip_merge_make_single_docket, singepdf_file);
		
	} 



}
