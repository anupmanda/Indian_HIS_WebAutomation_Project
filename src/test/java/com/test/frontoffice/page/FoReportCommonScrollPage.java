/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 21-Jan-2026
 */
public class FoReportCommonScrollPage extends GeneralBrowserSetting {
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String Click_yes_popup = "//*[@id=\"btn_yes_desh\"]";
	
	protected static String Report_btn = "//span[normalize-space()='Report']";
	protected static String common_Scroll = "//a[normalize-space()='Common Scroll']";
	
	protected static String common_Scroll_no = "//input[@id='scroll']";
	protected static String Scroll_no_pop_Print_btn = "//div[@id='popup1300']//i[@class='fa fa-print']";
	protected static String Scroll_no_pop_Excel_btn = "//div[@id='popup1300']//i[@class='fa fa-file-pdf-o']";
	
	protected static String plush_btn = "//i[@class='fa fa-plus-square']";
	protected static String close_Common_Scroll_Details_pop = "//div[@id='popup1300']//a[@id='close_details']";
	
	protected static String To_Date = "//input[@id='todt']";
	protected static String Sigin_icon = "//div[@id='popup1300']//i[@class='fa fa-check']";
	protected static String save_icon = "//div[@id='popup1300']//a[@id='common_save']";
	protected static String first_table_click = "//div[@class='ApproveData']//tr[1]//td[1]";
	protected static String close_common_scroll_details_pop = "//div[@id='popup1300']//a[@id='close_details']";
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(Click_yes_popup, Yes_popup);
	}
	
	public void ClickOnReportCommonScroll(String Report_Btn , String comman_Scroll_Page) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Report_btn, Report_Btn);
		
		CommanUtill.clickTabSwitchToAnotherWindow(common_Scroll, comman_Scroll_Page);
		//CommanUtill.switchToAnotherWindow(common_Scroll, comman_Scroll_Page);
		//CommanUtill.clickFunction(common_Scroll, comman_Scroll_Page);
	}
	
	public void EnterCommonScrollNumber(String Scroll_No) throws IOException, InterruptedException {
		
		CommanUtill.textEnter(common_Scroll_no, Scroll_No);
		driver.findElement(By.xpath(common_Scroll_no)).sendKeys(Keys.ENTER);	
	}
	
	public void CommonScrollPopPrintBtn(String Print_Btn , String Excel_Sheet_Btn)  throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Scroll_no_pop_Print_btn, Print_Btn);
		Thread.sleep(5000);
		CommanUtill.clickFunction(Scroll_no_pop_Excel_btn, Excel_Sheet_Btn);
	   }
	
	//--------------------------------------New Scroll No ----------------------------
	
	public void ClickOnPlushIcon(String Plush_icon) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(plush_btn, Plush_icon);
	}
    
	public void rightClickAndSaveButton(String Singin_Icon , String Save_Icon) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Sigin_icon, Save_Icon);
		Thread.sleep(5000);
		CommanUtill.clickFunction(save_icon, Save_Icon);
	}
	
	public void CloseCommonScrollDetailsPop(String Close_Common_Sctroll_popup) throws IOException, InterruptedException {
		
		if(CommanUtill.isElementPresent(close_Common_Scroll_Details_pop)) {
			CommanUtill.clickFunction(close_Common_Scroll_Details_pop, Close_Common_Sctroll_popup);
			System.out.println("Close Common Sctroll popup");
		}
		else {
			System.out.println("Common Sctroll popup did not appear");
		}
	}
	
	public void ClickOncommonCurrentSaveTable(String First_Cloumn) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(first_table_click, First_Cloumn);
	}
	
	
	


}
