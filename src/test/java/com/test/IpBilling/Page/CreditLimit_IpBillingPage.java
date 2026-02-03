/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 02-Feb-2026
 */
public class CreditLimit_IpBillingPage extends GeneralBrowserSetting {
	
	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String ip_billing = "//span[normalize-space()='IP Billing']";

	//========================Modification Credit Limit ===============================

	protected static  String Credit_Limit = "//a[normalize-space()='Credit Limit']";
	protected static  String Uhid_Enter = "//input[@id='txtuhid']";
	protected static  String Ip_Numbetr_Enter = "//input[@id='txtipno']";
	
	protected static  String chkk_copy_bill_amount_1 = "//input[@id='_Copylimit']";
	protected static  String chkk_copy_bill_amount_2 = "//input[@id='_Copylimit2']";
	protected static  String new_credit_limit_1 = "//input[@id='txtnewcl']";
	protected static  String new_credit_limit_2 = "//input[@id='txtnewcl2']";
	protected static  String save_Icon = "//a[@id='SaveCreditLimit']//i[@class='fa fa-save']";
	protected static  String save_Yes_pop = "//a[@id='CreditLimitbtnYessaveModal']";
	
	
	
	
	
	
	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}
	public void ModificationCreditLimit(String Ip_Billing_Tab, String credit_limit_Modification) throws IOException , InterruptedException, InvalidApplicationException{

		CommanUtill.clickFunction(ip_billing, Ip_Billing_Tab);
		CommanUtill.clickFunction(Credit_Limit, credit_limit_Modification);

	}
	
   public void EnterUHID(String UHID_Excel) throws IOException , InterruptedException, InvalidApplicationException{
		
		WebElement Enter_Uhid = driver.findElement(By.xpath(Uhid_Enter));
		CommanUtill.textEnter(Uhid_Enter, UHID_Excel);
		Enter_Uhid.sendKeys(Keys.ENTER);	
	}
	
    public void EnterIPNumber(String IP_Number_Excel) throws IOException , InterruptedException, InvalidApplicationException{
		
		WebElement Enter_Ip_Number = driver.findElement(By.xpath(Ip_Numbetr_Enter));
		CommanUtill.textEnter(Ip_Numbetr_Enter, IP_Number_Excel);
		Enter_Ip_Number.sendKeys(Keys.ENTER);
		
	}
    
    public void CheckBoxCopyBillAmount_1And2(String Check_Box_Copy_Bill_Amount , String Check_Box2)
    		throws IOException , InterruptedException, InvalidApplicationException{
    	
    	CommanUtill.clickFunction(chkk_copy_bill_amount_1, Check_Box_Copy_Bill_Amount);
    	CommanUtill.clickFunction(chkk_copy_bill_amount_2, Check_Box2);	
    }
	
	public void EnterNewCreditLimit_1And2(String Credit_Limit_1 , String Credit_Limit_2) 
			throws IOException , InterruptedException, InvalidApplicationException{
		
		CommanUtill.textEnter(new_credit_limit_1, Credit_Limit_1);
		CommanUtill.textEnter(new_credit_limit_2, Credit_Limit_2);
	}
	
	public void SaveIcon_ModiCationCreditLimit(String Save_Btn , String Save_Yes_Popup) 
			throws IOException , InterruptedException, InvalidApplicationException{
		
		CommanUtill.clickFunction(save_Icon, Save_Btn);
		CommanUtill.clickFunction(save_Yes_pop, Save_Yes_Popup);
	}
		
	
	
		
	
}
