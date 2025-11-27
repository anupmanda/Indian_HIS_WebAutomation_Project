/**
 * 
 */
package com.test.physician.page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 01-Aug-2025
 */
   public class OPDPysicianOrderPage extends GeneralBrowserSetting{
	   
	    protected static String facility_drp = "//select[@id='Facility']";
	    protected static String dashbord_physician = "//*[@id=\"PhysicianSubmit\"]/span[1]/a/img";
	    protected static String department = "//select[@id='Department']";
	    protected static String department_yes_popup = "//a[@id='btn_yes_desh']";
	    protected static String out_patient_icon = "//li[@id='outpatients']//i[@class='fa']";
	    protected static String from_date = "//input[@id='FromDate']";
	    protected static String to_ddate = "//input[@id='ToDate']";
	    protected static String search_data = "//a[@id='search_data']";
	    protected static String search_uhid_icon = "//i[@title='Search']";
	    protected static String serach_uhid_name = "//input[@id='OutPatientSearch']";
	    protected static String select_patient_queue = "html/body/div[2]/form/div[19]/div[2]/div/div[2]/div[1]/div[2]/div[1]";
	    protected static String case_sheet_order_icon = "//i[@class='fa fa-comments orders_icon']";
	    protected static String orders_icon_lab = "//li[@id='orderLaboratory']";
	    
	    protected static String search_laboratory = "//input[@id='searchlaboratory']";
	    protected static String cbc_rajagiri = "//div[@class='resp-tab-content resp-tab-content-active']//div[@class='orders_fav1 new-height-area']//tbody//tr[1]//td[1]";
	    
	    protected static String select_sample = "//select[@id='ddlTestSampleOrds']";
	    protected static String sample_text = "//textarea[@id='txtOrderInvestigationResponse']";
	    protected static String save_sample = "//i[@id='OrderInvestAddResponse']";
	    
	    protected static String procedures_btn = "//li[@id='orderProcedures']";
	    protected static String procedures_department = "//select[@id='proDepartmet']";
	    protected static String procedures_department_serach = "//input[@id='searchproc']";
	    protected static String procedures_serach_click_one = "//table[@id=\"proc_All\"]//tr[1]//td[1]";
	    protected static String procedures_select_dcoctor_drp = "//select[@id='procedure_doctor']";
	    protected static String procedures_select_dcoctor_save_icon = "//a[@id='save_Proceduredoctormandatory']//i[@class='fa fa-save']";
	    protected static String procedures_order_comments_ = "//textarea[@class=\"referrals-tetextarea\"]";
	    
	    //radio  
	   protected static String Radio_Cardio_click_btn = "//li[@id='orderRadiology']";
	   protected static String Radio_Cardio_serach = "//input[@id='searchradio']";
	   protected static String Radio_Cardio_click_one = "//table[@id='rad_All']//tr[1]//td[1]";
	   protected static String Radio_Cardio_click_lab_results_yes_popup  = "//a[@id='btnLabAlertYes']";
	   protected static String Radio_Cardio_comments = "//textarea[@id='OrdComments2']";
	   
	   //Referrals and Advice
	   protected static String referrals_advice_click_btn = "//li[@id='consultid']";
	   protected static String referrals_advice_facility = "//select[@id='hospitalConsult']";
	   protected static String referrals_advice_speciality = "//select[@id='speciality']";
	   protected static String referrals_advice_doctor = "//select[@id='drdsplization']";
	   protected static String referrals_advice_priorityr = "//select[@id='priority']";
	   protected static String referrals_advice_select_note_type = "//select[@id='note_style_templet_op']";
	   protected static String referrals_advice_template_yes_no = "//select[@id='f1']";
	   protected static String referrals_advice_template_gender_checkbox = "//input[@id='f4']"; 
	   protected static String referrals_advice_template_save_icon = "//a[@title='Save']//i[@class='fa fa-save']";
	   protected static String referrals_advice_click_plush_icon  = "//i[@title='Add Row']";
	   
	   
	    
	    protected static String order_save = "//div[@id='edit_orders_main_body']//li[2]";
	    protected static String verify = "//a[@id='sign_link']";
	    protected static String enter_password = "//input[@id='passwardid']";
	    protected static String visit_Icon = "//a[@id='btn_yes_desh']";
	    
	    protected static String close_case_sheet = "//body/div[2]/div[1]/div[1]/div[1]/i[3]";
	    //protected static String close_case_sheet = "//i[@id='closebtn' and normalize-space(text())='Close CaseSheet']";
	 
	   //protected static String close_case_sheet = "(//i[@id='closebtn'])[2]"; 
	    //protected static String home_page = "//i[@class='fa fa-home']";
	    protected static String home_page = "//i[@class='fa fa-home']";
	    
	    //vitals
	    protected static String vitals_physician_icon_click =  "//i[@class='fa fa-heartbeat vital_signs_icon']";
	    protected static String vitals_Blood_Sugar_f     =           "//input[@id='txt11']";
	    protected static String vitals_Blood_Sugar_r     =            "//input[@id='txt10']";
	    protected static String vitals_Dystolic_BP =                  "//input[@id='txt3']";
	    protected static String vitals_Head_Circumference =        "//input[@id='txt16']";
	    protected static String vitals_Heart_Rate =               "//input[@id='txt8']";
	    protected static String vitals_Mean_BP =                  "//input[@id='txt14']";
	    protected static String vitals_Pain_Score =               "//input[@id='txt9']";
	    protected static String vitals_Height =                  "//input[@id='txt7']";
	   //protected static String vitals_physician_Save_btn =  "(//i[@id='save_vitals'])[1]";
	   //protected static String vitals_physician_Save_btn =  "//i[contains(@class,'fa-floppy-o') and @title='Save']";
	 
	    protected static String vitals_physician_Save_btn =  "//ul[@class='top-icon-list vitals-icon-top']//li[1]";
	    
	    //Allergy
	    protected static String allergy_assessment_button = "//label[@id='allergy_status']";
	    
	    protected static String allergies_drug_radiobutton = "//input[@id='radio_Drug']";
	   // protected static String allergies_drug_drp = "//span[@id='select2-allergy_desc-container']";
	    protected static String allergies_drug_drp = "//select[@id='allergy_desc']";
	  
	   // protected static String reaction_drug_drp = "//span[@id='select2-allergy_reaction-container']";
	    protected static String reaction_drug_drp = "//select[@id='allergy_reaction']";
	    protected static String since_drug_text = "//input[@id='allergy_since_no']";
	    protected static String since_drug_drp = "//select[@id='allergy_since_type']";
	    
	    protected static String severity_drug_high_radio_btn = "//input[@id='radio_High']";
	    protected static String severity_drug_moderate_radio_btn = "//input[@id='radio_Moderate']";
	    protected static String severity_drug_mild_radio_btn = "//input[@id='radio_Mild']";
	    protected static String severity_drug_notknown_radio_btn = "//input[@id='radio_NotKnown']";
	    
	    protected static String source_drug_observed_radiobutton = "//input[@id='radio_observed']";
	    protected static String source_drug_informed_radiobuttonn = "//input[@id='radio_informed']";
	    
	    protected static String click_plush_icon = "//i[@id='add_allergy_row']";
	    protected static String plush_icon_staus_drp = "//table[@id='allergy_table']//td[11]";
	    protected static String plush_icon_remaks = "//table[@id='allergy_table']//td[12]";
	    
	    protected static String allergy_save_button = "//i[@id='save_allergy']";
	    
	    
	    
	    
	    
	    public void selectByFacilityDropdown(String facilityName) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(facility_drp, facilityName);
	    }

	    public void selectByDepartmentDropdown(String departmentName) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(department, departmentName);
	    }

	    public void selectBySampleTypeDropdown(String sampleType) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(select_sample, sampleType);
	    }

	  
	    public void clickOnPhysicianDashboardIcon(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(dashbord_physician, fieldName);
	    }

	    public void clickOnDepartmentYesPopup(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(department_yes_popup, fieldName);
	    }

	    public void clickOnOutPatientIcon(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(out_patient_icon, fieldName);
	    }

	    public void clickOnSearchDataButton(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(search_data, fieldName);
	    }

	    public void clickOnUHIDSearchIcon(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(search_uhid_icon, fieldName);
	    }
	    
       public void enterOnUHIDSearchField(String uhidValue) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(serach_uhid_name, uhidValue);
	        
	    }

	    public void clickOnSelectPatientFromQueue(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(select_patient_queue, fieldName);
	    }

	    public void clickOnCaseSheetOrderIcon(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(case_sheet_order_icon, fieldName);
	    }

	    public void clickOnOrderLaboratoryIcon(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(orders_icon_lab, fieldName);
	    }

	    public void clickOnCBC_SHMS_Test(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(cbc_rajagiri, fieldName);
	    }

	    public void clickOnSaveSampleButton(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(save_sample, fieldName);
	    }

	    public void clickOnOrderSaveHeaderButton(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(order_save, fieldName);
	    }

	    public void clickOnVerifyOrderButton(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(verify, fieldName);
	    }

	    public void clickOnVisitIconPopup(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(visit_Icon, fieldName);
	    }

	    public void clickOnCloseCaseSheetIcon(String fieldName) throws IOException, InterruptedException {
	    	
	       CommanUtill.clickFunction(close_case_sheet, fieldName);
	       // WebElement close_case_sheet = driver.findElement(By.xpath("//i[@id='closebtn' and normalize-space(text())='Close CaseSheet']"));
	       // close_case_sheet.click();
	        
	    }
	    
	    public void clickOnHomePageIcon(String fieldName) throws IOException, InterruptedException {
	    	
	    	CommanUtill.clickFunction(home_page, fieldName);
	    	
	    }
	    
	    public void enterOnFromDate(String fromDate) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(from_date, fromDate);
	        WebElement fromdate = driver.findElement(By.xpath("//body"));
	        fromdate.click();
	    }

	    public void enterOnToDate(String toDate) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(to_ddate, toDate);
	        WebElement fromdate = driver.findElement(By.xpath(to_ddate));
	        fromdate.sendKeys(Keys.ENTER);
	    }

	    public void enterOnLabSearchField(String testName) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(search_laboratory, testName);
	    }

	    public void enterOnSampleNote(String note) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(sample_text, note);
	    }

	    public void enterOnVerificationPassword(String password) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(enter_password, password);
	    }
	    
	    
	    // Procedures
	    
	    public void clickOnProceduresTab(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(procedures_btn, fieldName);
	    }

	    public void selectProceduresDepartment(String department) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(procedures_department, department);
	    }

	    public void enterInProceduresSearchField(String searchValue) throws IOException, InterruptedException {
	    	
	    	
	        CommanUtill.textEnter(procedures_department_serach, searchValue);
	    }

	    public void clickOnProceduresSearchResult(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(procedures_serach_click_one, fieldName);
	    }

	    public void selectDoctorForProcedure(String doctorName) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(procedures_select_dcoctor_drp, doctorName);
	    }

	    public void clickOnSaveDoctorProcedure(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(procedures_select_dcoctor_save_icon, fieldName);
	    }

	    public void enterOrderCommentsForProcedure(String comments) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(procedures_order_comments_, comments);
	    }

	 // Radiology
	    
	    public void clickOnRadioCardioButton(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(Radio_Cardio_click_btn, fieldName);
	    }

	    public void enterRadioCardioSearch(String searchText) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(Radio_Cardio_serach, searchText);
	    }

	    public void clickOnRadioCardioFirstResult(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(Radio_Cardio_click_one, fieldName);
	    }

	    public void clickLabResultsYesPopup(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(Radio_Cardio_click_lab_results_yes_popup, fieldName);
	    }

	    public void enterRadioCardioComments(String comments) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(Radio_Cardio_comments, comments);
	    }
	    
	    //Referrals and Advice Section
	    
	    public void clickOnReferralsAdviceButton(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(referrals_advice_click_btn, fieldName);
	    }

	    public void selectReferralsAdviceFacility(String facility) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(referrals_advice_facility, facility);
	    }

	    public void selectReferralsAdviceSpeciality(String speciality) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(referrals_advice_speciality, speciality);
	    }

	    public void selectReferralsAdviceDoctor(String doctor) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(referrals_advice_doctor, doctor);
	    }

	    public void selectReferralsAdvicePriority(String priority) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(referrals_advice_priorityr, priority);
	    }

	    public void selectReferralsAdviceNoteType(String noteType) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(referrals_advice_select_note_type, noteType);
	    }

	    public void selectReferralsAdviceTemplateYesNo(String option) throws IOException, InterruptedException {
	    	
	        CommanUtill.dropdownSelectByVisibleText(referrals_advice_template_yes_no, option);
	    }

	    public void clickReferralsAdviceGenderCheckbox(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(referrals_advice_template_gender_checkbox, fieldName);
	    }

	    public void clickReferralsAdviceSaveIcon(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(referrals_advice_template_save_icon, fieldName);
	    }

	    public void clickReferralsAdviceAddRowPlushIcon(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(referrals_advice_click_plush_icon, fieldName);
	    }

	   //Vitals 
	    
	    public void clickOnVitalsPhysicianIcon(String filedName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(vitals_physician_icon_click, filedName);
	    }

	    public void enterBloodSugarFasting(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Blood_Sugar_f, value);
	    }

	    public void enterBloodSugarRandom(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Blood_Sugar_r, value);
	    }

	    public void enterDystolicBP(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Dystolic_BP, value);
	    }

	    public void enterHeadCircumference(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Head_Circumference, value);
	    }

	    public void enterHeartRate(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Heart_Rate, value);
	    }

	    public void enterMeanBP(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Mean_BP, value);
	    }

	    public void enterPainScore(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Pain_Score, value);
	    }

	    public void enterHeight(String value) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(vitals_Height, value);
	    }

	    public void clickOnSaveVitalsButton(String value) throws IOException, InterruptedException {
	    	
	    	CommanUtill.clickFunction(vitals_physician_Save_btn, value);
	    	
	    //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    //	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@id='save_vitals']")));
	    //	driver.findElement(By.xpath("//i[@id='save_vitals']")).click();

	    }
	    
//Allergy 	    
	  
	    public void clickOnAllergyAssessmentOnTopButton(String filedName) throws IOException, InterruptedException { 
	    	
	    	CommanUtill.clickFunction(allergy_assessment_button, filedName);
	    	
	    }
	    
	    public void clickAndSelectOnAllergiesDrugButton(String radiobutton, String allergies_Drug) throws IOException, InterruptedException { 
	    	
	    	CommanUtill.clickFunction(allergies_drug_radiobutton, radiobutton);
	    	CommanUtill.dropdownSelectByVisibleText(allergies_drug_drp, allergies_Drug);
	    	
	    }
	    
	    public void selectOnReactionDrugDropDwon(String reaction) throws IOException, InterruptedException { 
	    	
	    	CommanUtill.dropdownSelectByVisibleText(reaction_drug_drp, reaction);	
	    }
      
	    public void sinceDrugText(String text , String since_drp) throws IOException, InterruptedException { 
	    	
	     CommanUtill.textEnter(since_drug_text, text);
	     CommanUtill.dropdownSelectByVisibleText(since_drug_drp, since_drp);
	     
	    }
	    
	    public void ClickOnSeverityRadioButton(String high, String moderate, String mild , String not_known) throws IOException, InterruptedException { 
	    	
	    	CommanUtill.clickFunction(severity_drug_high_radio_btn, high);
	    	CommanUtill.clickFunction(severity_drug_moderate_radio_btn, moderate);
	    	CommanUtill.clickFunction(severity_drug_mild_radio_btn, mild);
	    	CommanUtill.clickFunction(severity_drug_notknown_radio_btn, not_known);
	    }
	    
	    public void ClickOnSourceRadioButton(String informed, String observed) throws IOException, InterruptedException {  
	    	
	    	CommanUtill.clickFunction(source_drug_informed_radiobuttonn, informed);
	        CommanUtill.clickFunction(source_drug_observed_radiobutton, observed);  
	    	
	    }
	   
	    public void ClickOnPlushIcon(String plush_button) throws IOException, InterruptedException { 
	    	
	    	CommanUtill.clickFunction(click_plush_icon, plush_button);
	    }
	    
	    public void enterOnPlushIconPopup(String staus, String Remaks) throws IOException, InterruptedException { 
	    	
	    	CommanUtill.dropdownSelectByVisibleText(plush_icon_staus_drp, staus);
	        CommanUtill.textEnter(plush_icon_remaks, Remaks);
	    }
	    
	    public void clickOnAllergySaveButton(String save) throws IOException, InterruptedException {
	    	
	    	CommanUtill.clickFunction(allergy_save_button, save);
	    }
}
   
   
