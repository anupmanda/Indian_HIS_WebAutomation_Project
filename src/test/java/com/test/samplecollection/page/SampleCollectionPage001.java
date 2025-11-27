/**
 * 
 */
package com.test.samplecollection.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 25-Jul-2025
 */
public class SampleCollectionPage001 extends GeneralBrowserSetting{
	
	protected static String facility_drp =   "//select[@id='Facility']";
	protected static String click_dashBord_sample_collection_btn =   "//li[@id='SampleCollectionShow']";
	protected static String  department_drp   =  "//select[@id='Department']";
	protected static String yes_department_popup =   "//a[@id='btn_yes_desh']";
	protected static String no_department_popup =   "//a[@id='btn_no_desh']";
	protected static String click_sample_collection_page =   "//span[normalize-space()='Sample Collection']";
	protected static String enter_uhid_1 =   "//input[@id='uhid']";
	protected static String serach_uhid =   "//a[@id='homevisit_searchUHID']//i[@class='fa fa-search']";
	protected static String patient_type_drp =   "//select[@id='pattype']";
	protected static String enter_uhid_2 =   "//input[@id='txtUHid']";
	protected static String from_date =   "//input[@id='FromDate']";
	protected static String to_date =   "//input[@id='ToDate']";
	protected static String serach_all =   "//a[@id='search_diagnostics']//i[@class='fa fa-search']";
	protected static String mark_sample_collection_barcoded_test_check =   "//input[@id='_marksample']";
	protected static String collected_samples_chk =   "//input[@id='collectsample']";
	protected static String show_start_first =   "//input[@id='cbstatfrst']";
	
	//print_on Header
	
	protected static String print_header_btn =   "//a[@id='PrintModifiedBarcode']//i[@class='fa fa-print']";
	protected static String re_print_barcode_no =   "//select[@id='ddlsample']";
	protected static String number_of_copies  =   "//input[@id='txtnofcopy']";
	protected static String sample_type  =   "//select[@id='ddlsample']";
	protected static String print_bar_code_popup  =   "//a[@id='printbarcode']//i[@class='fa fa-print']";
	
	//edite
	
	//protected static String edie_barcode  =   "//table[@id='tblsamplecollection']//tr[1]//td[1]";
	protected static String edie_barcode  =   "//i[@id='0']";
	
	protected static String home_sample_collection_chk  =   "//input[@id='check_all_homesample']";
	protected static String phlebotomist_area  =   "//select[@id='PhlebotomistArea']";
	protected static String phlebotomist_name  =   "//select[@id='phlebotomist12']";
	protected static String date_phlebotomist =   "//input[@id='DatePhleb']";
	protected static String visite_time  =   "//select[@id='visitTimePhleb']";
	protected static String save_phlebotomist  =   "//a[@id='btn_home_sample_ok']";
	protected static String cancel_right_arro_button   =   "//i[@class='fa fa-arrow-circle-right']";
	protected static String remaks_phlebotomist   =   "//textarea[@id='Remarks']";
	protected static String save_sample_collection_barcode_header   =   "//div[@id='user_access']";
	
	
	
	
	
	
	 public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(facility_drp, fieldName);
		 
	 }
	 
	 public void selectByFacility(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.dropdownSelectByVisibleText(facility_drp, fieldName);
		}

		public void selectByDepartment(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.dropdownSelectByVisibleText(department_drp, fieldName);
		}

		public void selectByPatientType(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.dropdownSelectByVisibleText(patient_type_drp, fieldName);
		}

		public void selectReprintBarcodeNo(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.dropdownSelectByVisibleText(re_print_barcode_no, fieldName);
		}

		public void selectSampleType(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.dropdownSelectByVisibleText(sample_type, fieldName);
		}
		
		


		
		
		
		public void clickOnDashboardSampleCollectionBtn(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(click_dashBord_sample_collection_btn, fieldName);
		}

		public void clickOnYesDepartmentPopup(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(yes_department_popup, fieldName);
		}

		public void clickOnNoDepartmentPopup(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(no_department_popup, fieldName);
		}

		public void clickOnSampleCollectionPage(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(click_sample_collection_page, fieldName);
		}

		public void clickOnUHIDSearch(String fieldName) throws IOException, InterruptedException {
			
		    CommanUtill.clickFunction(serach_uhid, fieldName);
		}

		public void clickOnSearchAll(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(serach_all, fieldName);
		}

		public void clickOnMarkSampleCollectionCheckbox(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(mark_sample_collection_barcoded_test_check, fieldName);
		}

		public void clickOnCollectedSamplesCheckbox(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(collected_samples_chk, fieldName);
		}

		public void clickOnShowStartFirst(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(show_start_first, fieldName);
		}

		public void clickOnPrintHeaderButton(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(print_header_btn, fieldName);
		}

		public void clickOnPrintBarcodePopup(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.clickFunction(print_bar_code_popup, fieldName);
		}

		

		
		public void enterUHID1(String fieldName) throws IOException, InterruptedException {
			
		    CommanUtill.textEnter(enter_uhid_1, fieldName);
		}

		public void enterUHID2(String fieldName) throws IOException, InterruptedException {
			
		    CommanUtill.textEnter(enter_uhid_2, fieldName);
		}

		public void enterFromDate(String fieldName) throws IOException, InterruptedException {
			
		  CommanUtill.textEnter(from_date, fieldName);
		  WebElement from_date = driver.findElement(By.xpath("//input[@id='FromDate']"));
		  from_date.sendKeys(Keys.ENTER);
		  
		  
		}

		public void enterToDate(String fieldName) throws IOException, InterruptedException {
			
		    CommanUtill.textEnter(to_date, fieldName);
		    WebElement to_date = driver.findElement(By.xpath("//input[@id='ToDate']"));
		    to_date.sendKeys(Keys.ENTER);
		    
		}

		public void enterNumberOfCopies(String fieldName) throws IOException, InterruptedException {
		    CommanUtill.textEnter(number_of_copies, fieldName);
		}
//------------------------------------------------------------------------------------------------------------------------------
	
		public void clickOnEditeSampleCollectionBarcodeButton(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.clickFunction(edie_barcode, fieldName);
			
		}
		
		public void clickOnHomeSampleCollectionCheckBox(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.clickFunction(home_sample_collection_chk, fieldName);
			
		}

		public void selectByPhlebotomistAreaDropdwon(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.dropdownSelectByVisibleText(phlebotomist_area, fieldName);
			
		}
       
		public void selectByPhlebotomistNameDropdwon(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.dropdownSelectByVisibleText(phlebotomist_name, fieldName);
			
		}
		
		public void enterOnDatePhlebotmist(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.enter(date_phlebotomist, fieldName);
			
		}
		
		public void SelectByVisiteTimeDropDwon(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.dropdownSelectByVisibleText(visite_time, fieldName);
		}
		
		public void clickOnphlebotmistSaveButtonPopup(String fieldName) throws IOException, InterruptedException {	
			
			CommanUtill.clickFunction(save_phlebotomist, fieldName);
			
		}
		
		public void enterOnphlebotmistRemaks(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.textEnter(remaks_phlebotomist, fieldName);
			
		}
		
		public void clickOnphlebotmistSaveHeaderButton(String fieldName) throws IOException, InterruptedException {	
			
			CommanUtill.clickFunction(save_sample_collection_barcode_header, fieldName);
		}
		
		
		public void clickOnphlebotmistCancelRightArrowButton(String fieldName) throws IOException, InterruptedException {	
			
			CommanUtill.clickFunction(cancel_right_arro_button, fieldName);
			
		}
		
}
