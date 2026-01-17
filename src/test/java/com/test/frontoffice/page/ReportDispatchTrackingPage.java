/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 13-Jan-2026
 */
/**
 * @author Anup
 *
 * 13-Jan-2026
 */
public class ReportDispatchTrackingPage extends GeneralBrowserSetting {
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String click_billing_btn = "//span[normalize-space()='Billing']";
	protected static String Report_Dispatch_page = "//a[normalize-space()='Report Dispatch Tracking']";

	//----------------------Report Dispactch Tracking ---------------------------------
	
	protected static String enter_uhid = "//input[@id='uHid']";
	protected static String Bill_no = "//input[@id='BillNo']";
	protected static String serach_Report = "//a[@id='searchBtn']//i[@class='fa fa-search']";
	protected static String billed_facility_drp = "//select[@id='locationId']";
	protected static String from_date = "//input[@id='FromDate']";
	protected static String to_date = "//input[@id='ToDate']";
	protected static String opd_radio_btn = "//input[@id='OPD']";
	protected static String emergency_radio_btn = "//input[@id='Emergency']";
	protected static String pre_adt_radio_btn = "//input[@id='ADT']";
	protected static String Ip_Radio_btn = "//input[@id='IPD']";
	
	protected static String report_Status_drp = "//select[@id='report_status']";
	protected static String test_Status_drp = "//select[@id='TestStatus']";
	protected static String investigatio_drp_report= "//select[@id='invst']";
	
	//-------------------------------Table -------------------------------------
	protected static String verify_table_check_box = "//table[@id='rprtdisptch']//tr[2]//td[1]//input";
	protected static String verify_table_Dispatch_Facility_drp = "//select[@id='location1']";
	protected static String verify_table_print_withheader = "//tbody/tr[2]/td[19]/a[1]/i[1]";
	protected static String verify_table_print_withoutheader = "//tbody/tr[2]/td[20]/a[1]/i[1]";
	
	protected static String save_btn = "//a[@id='save_Report']//i[@class='fa fa-save']";
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}
	//--------------------------------------billing page methods------------------------------
	public void clickOnReportDispatchButton(String billing , String Report_Dispatch) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_billing_btn, billing);
		CommanUtill.clickFunction(Report_Dispatch_page, Report_Dispatch);

	}
	
  public void enterUHID(String uhid) throws IOException, InterruptedException {
	 
	 CommanUtill.textEnter(enter_uhid, uhid);
	 driver.findElement(By.xpath(enter_uhid)).sendKeys(Keys.ENTER);
   }
  
   public void enterBillsNumber(String Bills_no) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(Bill_no, Bills_no);
		 driver.findElement(By.xpath(Bill_no)).sendKeys(Keys.ENTER);
	   }
  
	public void selectBilledFacilityDrp(String bills_facility) throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(billed_facility_drp, bills_facility);
	}
	
	public void enterFromDate(String fromDate)
	        throws IOException, InterruptedException {

	    // Excel date: 02-11-2025
	    // Required: 02/11/2025 00:00:00
	    String finalDateTime = fromDate.replace("-", "/") + " 00:00:00";

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript(
	        "var input = document.getElementById('FromDate');" +
	        "input.removeAttribute('readonly');" +
	        "input.value = arguments[0];" +
	        "input.dispatchEvent(new Event('input', {bubbles:true}));" +
	        "input.dispatchEvent(new Event('change', {bubbles:true}));" +
	        "input.dispatchEvent(new Event('blur', {bubbles:true}));",
	        finalDateTime
	    );

	    Thread.sleep(500);
	}

	
   public void enterToDate(String To_Date_report) throws IOException, InterruptedException {
		
		WebElement From_date = driver.findElement(By.xpath(to_date));
		From_date.sendKeys(Keys.CONTROL + "a");
		From_date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(to_date, To_Date_report);
		From_date.sendKeys(Keys.TAB);
	}
   
     public void OPDRadioButton(String OPD_Radio) throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(opd_radio_btn, OPD_Radio); 
   }
   
    public void EmergencyRadioButton(String Emergency_Radio) throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(emergency_radio_btn, Emergency_Radio);
   }
   
    public void Pre_ADTRadioButton(String PreADT_Radio) throws IOException, InterruptedException {
 	   
 	   CommanUtill.clickFunction(pre_adt_radio_btn, PreADT_Radio);
    }
    
    public void IPDRadioButton(String IPD_Radio) throws IOException, InterruptedException {
  	   
  	   CommanUtill.clickFunction(Ip_Radio_btn, IPD_Radio);
     }
    
	public void selectByReportStatusDrp(String Report_Status) throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(report_Status_drp, Report_Status);
	}
	
   public void selectByTestStatusDrp(String Test_Status) throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(test_Status_drp, Test_Status);
	}
	 
   public void selectByInvestigationDrp(String investigation_drp) throws IOException, InterruptedException {
	   
	   CommanUtill.dropdownSelectByVisibleText(investigatio_drp_report, investigation_drp);
   }
	
	public void SerachReportDispatchTracking(String serach) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(serach_Report, serach);
	}
	
	public void checkBoxTable(String chkk_box) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(verify_table_check_box, chkk_box);
	}
	
	public void SelectByDispactchPlaceDrp(String Dispach_facility_Drp)  throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(verify_table_Dispatch_Facility_drp, Dispach_facility_Drp);
	}
	
	public void SaveDispatchTrackingReport(String save) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(save_btn, save);
		
	}
	
	public void PrintReportWithHeader(String Print_Inwith_header)throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(verify_table_print_withheader, Print_Inwith_header);
		
	}
	
public void PrintReportWithOutHeader(String Print_InwithOut_header)throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(verify_table_print_withoutheader, Print_InwithOut_header);
		
	}
}
