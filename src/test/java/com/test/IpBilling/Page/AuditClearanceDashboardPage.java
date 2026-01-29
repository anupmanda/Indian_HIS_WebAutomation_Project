/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;


/**
 * @author Anup
 *
 * 27-Jan-2026
 */
public class AuditClearanceDashboardPage extends GeneralBrowserSetting {

	/**
	 * 
	 */
	public AuditClearanceDashboardPage() {
		// TODO Auto-generated constructor stub
	}
	
	
	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";
	
	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String Ip_Billing_tab = "//a[@id='dataclass2']";
	
	//==========================Audit Clearance Dashboard =====================================
	
	protected static  String Audit_Clearance_Dashboard_Page = "//a[normalize-space()='Audit Clearance']";
	protected static  String Audit_Clearance_Facility_Drp = "//select[@id='_Facility']";
	protected static  String Audit_Clearance_UHID = "//input[@id='_Uhid']";
	protected static  String Audit_Clearance_IP_No = "//input[@id='_Ipidno']";
	protected static  String Audit_Clearance_search_icon = "//i[@class='fa fa-search ']";
	protected static  String Audit_Clearance_Status_Drp = "//select[@id='_ddlStatus']";
	
	//======================== Table Clearance ===============================
	
	protected static  String remaks_Queries_table = 
			"//div[@class='table-border pending-investigation-table']//table[@id=\"_tblAuditClearance\"]//tr[1]//td[8]";
	protected static  String Add_Remarks = "//textarea[@id='_Remarks']";
	protected static  String Add_Remarks_Status_drp = "//select[@id='_ddlStatus']";
	protected static  String Save_Add_Remarks = "//i[@class='fa fa-save']";
	protected static  String Close_Add_Remarks = "//i[@class='fa fa-close']";
	
	protected static  String After_Remarks_Save_Clearance = 
			"//div[@class='table-border pending-investigation-table']//tr[1]//td[10]";
	
	protected static  String Save_Clearance_Ok_Enter_Reason = "//a[@id='btnOK']";
	
	
	
	
	
	
	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}
	
	public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {
		
		//WebElement ip_billing_dasghboard = driver.findElement(By.xpath(Ip_Billing_dashboard));
		//ip_billing_dasghboard.click();
		
		CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
		}
	
	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
			throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}
	
	public void IpBilling_AuditClearanceDashBoard(String Ip_Billing_Tab , String Audit_clerarance) 	
			throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.clickFunction(Ip_Billing_tab, Ip_Billing_Tab);
		CommanUtill.clickFunction(Audit_Clearance_Dashboard_Page, Audit_clerarance);
	}
	
	public void IpBillingDashBoard_Facility_Drp(String Faclility_Drp) 
			throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Audit_Clearance_Facility_Drp, Faclility_Drp);
	}
	
	public void EnterUHID(String Uhid , String Serach_Icon) 
			throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.textEnter(Audit_Clearance_UHID, Uhid);
		CommanUtill.clickFunction(Audit_Clearance_search_icon, Serach_Icon);
	}
	
	public void EnterIPNumber(String Ip_Number, String searchIcon) {

	    try {
	        CommanUtill.textEnter(Audit_Clearance_IP_No, Ip_Number);
	        CommanUtill.clickFunction(Audit_Clearance_search_icon, searchIcon);
	    } catch (IOException | InterruptedException e) {
	        System.out.println("Error while entering IP Number: " + e.getMessage());
	    }
	}
	
	public boolean isNoRecordFoundPopupDisplayed() {

	    try {
	        WebElement popupElement = driver.findElement(
	                By.xpath("//div[contains(@class,'gritter-item')]//p")
	        );

	        String message = popupElement.getText();
	        System.out.println("Popup Message: " + message);

	        if (message.equalsIgnoreCase("No record found")) {
	            return true;   // popup aaya
	        }

	    } catch (NoSuchElementException e) {
	        // popup nahi aaya
	    }

	    return false; // popup nahi aaya
	}

	
	public void AuditClearanceDashboard_Status_Drp(String Status) 
			throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Audit_Clearance_Status_Drp, Status);
	}
	
//=========================Table Clearance ==================================
	String parentWindow;

	
	public void Table_AuditRemarkandQuery(String AuditRemarkandQuery)
	        throws IOException, InvalidApplicationException, InterruptedException {

	    parentWindow = driver.getWindowHandle();   //  store parent
	    CommanUtill.clickTabSwitchToAnotherWindow(remaks_Queries_table, AuditRemarkandQuery);
	}
	public void switchBackToParentWindow() {
	    driver.switchTo().window(parentWindow);
	}


	
	public void Audit_Remark_AndQuery(String Add_Remarks_Box) 
			throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.textEnter(Add_Remarks, Add_Remarks_Box);
	}
	
	public void StatusDrpPop(String Add_Remarks_Status_Drp) throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Add_Remarks_Status_drp, Add_Remarks_Status_Drp);	
	}
	
	public void SaveAuditRemarksAndQueriesPop(String Save , String Close_Add_Remarks_pop) throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.clickFunction(Save_Add_Remarks, Save);
		//CommanUtill.clickFunction(Close_Add_Remarks, Close_Add_Remarks_pop);
		
	}
	
	public void SaveClearanceicon(String Save_Clearance , String ok_Clearance_pop) throws IOException , InvalidApplicationException, InterruptedException {
		
		CommanUtill.clickFunction(After_Remarks_Save_Clearance, Save_Clearance);
		CommanUtill.clickFunction(Save_Clearance_Ok_Enter_Reason, ok_Clearance_pop);
	}
		
	
	
	
	
	
	
	

	
	
	
	
	
	

}
