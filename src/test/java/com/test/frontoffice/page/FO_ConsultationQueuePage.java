/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 23-Jan-2026
 */
public class FO_ConsultationQueuePage extends GeneralBrowserSetting {
	
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String Click_yes_popup = "//*[@id=\"btn_yes_desh\"]";
	
	//========================Patient Queue ============================
	protected static String patient_queue_meanu = "//span[normalize-space()='Patient Queue']";
	protected static String Consultation_queue_page = "//a[normalize-space()='Consultation Queue']";
	
	
	protected static String speciality_1_drp = "//select[@id='spec1']";
	protected static String doctor_1_drp = "//select[@id='doc1']";
	protected static String Serach_1_icon = "//i[@title='search']";
	protected static String Report_View_1_btn = "//a[@id='report_View1']//i[@class='fa fa-registered']";
	protected static String Report_view_1_Patient_Uhid = "//input[@id='uhid']";
	protected static String Report_view_1_ok = "//a[@id='priority_OPDNurseYes']";
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup)
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(Click_yes_popup, Yes_popup);	
	}
	
	public void ConsultationQueuePage(String patient_queue_tab , String Consultation_page) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(patient_queue_meanu, patient_queue_tab);
		CommanUtill.clickFunction(Consultation_queue_page, Consultation_page);
	}
	
	public void ConsultationQueueBox_1SpecialityAndDoctorDrp(String SpecialityDrp ,String Doctor_drp) 
			throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(speciality_1_drp, SpecialityDrp);
		CommanUtill.dropdownSelectByVisibleText(doctor_1_drp, Doctor_drp);
	}
	
	public void ConsultationQueueBox_1Serach(String serach)throws IOException, InterruptedException { 
		
		CommanUtill.clickFunction(Serach_1_icon, serach);
	}
	
	public void ConsultationQueueBox_1ReportView(String Report_view , String patient_uhid , String Report_view_ok) 
			throws IOException, InterruptedException { 
		
	   CommanUtill.clickFunction(Report_View_1_btn, Report_view);
	   CommanUtill.textEnter(Report_view_1_Patient_Uhid, patient_uhid);
	   CommanUtill.clickFunction(Report_view_1_ok, Report_view_ok);
	}
	
	
	
}
