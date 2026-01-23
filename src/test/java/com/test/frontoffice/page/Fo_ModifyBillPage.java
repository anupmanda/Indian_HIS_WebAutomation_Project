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
 * 22-Jan-2026
 */
public class Fo_ModifyBillPage extends GeneralBrowserSetting {

	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String Click_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	//--------------------------------- Modify bIll --------------------------

	protected static String modify_bill = "//span[normalize-space()='Modify Bill']";
	protected static String modify_bill_Uhid = "//input[@id='uHid']";
	protected static String modify_bill_Bill_no = "//input[@id='BillNo']";

	protected static String modify_bill_Service_Name = "//input[@id='servicename_0']";
	protected static String modify_bill_Item_Name = "//input[@id='itemname_0']";
	protected static String modify_bill_Billed_amount = "//input[@id='amount_0']";
	protected static String modify_bill_Credit = "//input[@id='credit_0']";
	protected static String modify_bill_cash = "//input[@id='cash_0']";


	protected static String modify_bill_Insurance_Company_icon = "//i[@class='fa fa-university insu_icon']";
	protected static String modify_bill_Insurance_Company_cash_radio_btn = "//input[@id='r_cash']";
	protected static String modify_bill_Insurance_Company_Company_radio_btn = "//input[@id='r_com_insurance']";
	protected static String modify_bill_company_type_drp = "//select[@id='company_type']";
	protected static String modify_bill_Company_drp = "//select[@id='company']";
	protected static String modify_bill_Rate_contract_drp = "//select[@id='rate_contract']";
	protected static String modify_bill_Corporate_company = "//select[@id='corporateCompany']";
	protected static String modify_bill_Company_details_plush_icon = "//a[@id='addinsurance']//i[@class='fa fa-plus']";

	protected static String modify_bill_Authorised_By_drp = "//select[@id='authBy']";
	protected static String modify_bill_reason_drp = "//select[@id='reason']";
	protected static String modify_bill_modify_Remaks = "//textarea[@id='txtModifyRemarks']";

	protected static String modify_bill_modify_Save_btn = "//a[@id='txtSave']//i[@class='fa fa-save']";
	protected static String modify_bill_modify_print_btn = "//a[@id='txtPrint']//i[@class='fa fa-print']";
	protected static String modify_bill_modify_Refresh = "//a[@id='Clear']//i[@class='fa fa-refresh']";







	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(Click_yes_popup, Yes_popup);	
	}

	public void ModifyBillPage(String Modify_bill_page) throws IOException , InterruptedException {

		CommanUtill.clickFunction(modify_bill, Modify_bill_page);
	}

	public void EnterUHIDBillModify(String UHId)	throws IOException , InterruptedException {

		CommanUtill.textEnter(modify_bill_Uhid, UHId);
		driver.findElement(By.xpath(modify_bill_Uhid)).sendKeys(Keys.ENTER);
	}

	public void EnterBillNumberModify(String bill_number) throws IOException , InterruptedException {

		CommanUtill.textEnter(modify_bill_Bill_no, bill_number);
	}

	public void ModifyBillServiceNameAndItemName(String Setrvice_name ,String Item_Name)
			throws IOException , InterruptedException {

		CommanUtill.textEnter(modify_bill_Service_Name, Setrvice_name);
		CommanUtill.textEnter(modify_bill_Item_Name, Item_Name);
	}

	public void EnterBilledAmount(String billed_Ammount) throws IOException , InterruptedException {

		CommanUtill.textEnter(modify_bill_Billed_amount, billed_Ammount);
	}

	public void ModifyBillInCredit(String credit) throws IOException , InterruptedException {

		CommanUtill.textEnter(modify_bill_Credit, credit);
	}

	public void modifyBillInCash(String Cash) throws IOException , InterruptedException {

		CommanUtill.textEnter(modify_bill_cash, Cash);
	}

	//============================Insurance Company ==========================

    public void clickOnInsuranceCompanyIcon(String Company_icon) throws IOException , InterruptedException {
    	
    	CommanUtill.clickFunction(modify_bill_Insurance_Company_icon, Company_icon);
    }
    
    public void RadioBtnCompanyDetails_Company(String Company_Radio_btn) throws IOException , InterruptedException {
    	
    	CommanUtill.clickFunction(modify_bill_Insurance_Company_Company_radio_btn, Company_Radio_btn);
    }
    public void Company_Type_Company_Rate_contract_Drp(String Company_Type_Drp , String Comapny_Drp , 
    		String Rate_Contract_Drp ) throws IOException , InterruptedException {
				
    	CommanUtill.dropdownSelectByVisibleText(modify_bill_company_type_drp, Company_Type_Drp);
    	CommanUtill.dropdownSelectByVisibleText(modify_bill_Company_drp, Comapny_Drp);
    	CommanUtill.dropdownSelectByVisibleText(modify_bill_Rate_contract_drp, Rate_Contract_Drp);
    }
    public void Corporatecompanydrp(String Corporatecompany_drp) throws IOException , InterruptedException { 
    	
    	CommanUtill.dropdownSelectByVisibleText(modify_bill_Corporate_company, Corporatecompany_drp);
    }
    
    public void PlushIconCompanyDetailsPop(String Plush_Icon)  throws IOException , InterruptedException { 
    	
    	CommanUtill.clickFunction(modify_bill_Company_details_plush_icon, Plush_Icon);
    }
    
    //==============================Authorised By Reason And Modify Remarks =================================
    
    public void AuthorisedByAndReasonDrp(String Authorised , String Reason_drp) throws IOException , InterruptedException {
    	
    	CommanUtill.dropdownSelectByVisibleText(modify_bill_Authorised_By_drp, Authorised);
    	CommanUtill.dropdownSelectByVisibleText(modify_bill_reason_drp, Reason_drp);
    }
    
    public void ModifyRemaksText(String Modify_remaks) throws IOException , InterruptedException {
    	
    	CommanUtill.textEnter(modify_bill_modify_Remaks, Modify_remaks);
    }
    
    public void SaveModifyBill(String save_Icon , String Print_icon) throws IOException , InterruptedException {
    	
    	CommanUtill.clickFunction(modify_bill_modify_Save_btn, Print_icon);
    	Thread.sleep(5000);
    	CommanUtill.clickFunction(modify_bill_modify_print_btn, Print_icon);
    }
    
   public void RefreshBtnModifyBill(String Refresh) throws IOException , InterruptedException {
    	
    	CommanUtill.clickFunction(modify_bill_modify_Refresh, Refresh);
    	
    }


}
