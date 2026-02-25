/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.Alert;
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
 * 23-Feb-2026
 */
public class ChequeInHandDetailsPage extends GeneralBrowserSetting {
	
	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String Ip_Deposit_Tab = "//span[normalize-space()='IP Deposit/Refund']";
	protected static  String Cheque_In_Hand_Details_Tab = "//a[normalize-space()='Cheque In Hand Details']";
	
	protected static  String From_Date = "//input[@id='dtpfdate']";
	protected static  String To_Date = "//input[@id='dtptodate']";
	protected static  String Search_Icon = "//a[@id='btnsearch']//i[@class='fa fa-search']";
	
	
	
	
	
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
	
	public void ClickOnIpDepositTabAndChequeInHandDetails(String Ip_DepositTab ) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Ip_Deposit_Tab)));
		CommanUtill.clickFunction(Ip_Deposit_Tab, Ip_DepositTab);
		
	}
	
	public void ChequeInHandDetails(String ChequeInHan_Page) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Cheque_In_Hand_Details_Tab)));
		CommanUtill.clickTabSwitchToAnotherWindow(Cheque_In_Hand_Details_Tab, ChequeInHan_Page);
	}
	
	public void ChequeHandFromAndToDate(String FromDate , String ToDate) throws IOException , InvalidApplicationException, InterruptedException {

		WebElement From_Date_Element = driver.findElement(By.xpath(From_Date));
		From_Date_Element.sendKeys(Keys.CONTROL + "a");
		From_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(From_Date, FromDate);
		From_Date_Element.sendKeys(Keys.TAB);
		
		//WebElement To_Date_Element = driver.findElement(By.xpath(To_Date));
		//To_Date_Element.sendKeys(Keys.CONTROL + "a");
		//To_Date_Element.sendKeys(Keys.DELETE);
		//CommanUtill.textEnter(To_Date, ToDate);
		//To_Date_Element.sendKeys(Keys.TAB);
	}
	public void ClickOnSearchIcon(String SearchIcon) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Search_Icon)));
		CommanUtill.clickFunction(Search_Icon, SearchIcon);
	}
	
	public String getDischargeAlertText() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());

	    String message = alert.getText();
	    System.out.println("Alert Message: " + message);

	    return message;
	}

	public void acceptDischargeAlert() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.alertIsPresent());

	    driver.switchTo().alert().accept();
	}

	
	

}
