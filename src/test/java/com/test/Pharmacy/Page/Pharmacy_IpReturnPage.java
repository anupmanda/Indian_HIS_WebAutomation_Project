/**
 * 
 */
package com.test.Pharmacy.Page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

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
 * 13-Apr-2026
 */
public class Pharmacy_IpReturnPage extends GeneralBrowserSetting {
	
	protected static  String  Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static  String  Pharmacy_dashboard = "//li[@id='btn_Pharmacy']";
	protected static  String Pharmacy_Station_Drp = "//select[@id='Department']";
	protected static  String Pharmacy_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Pharmacy_Station_No_pop = "//a[@id='btn_no_desh']";

	//========================== Ip Retun ============================
		protected static  String Ip_Issue_Tab = "//a[@id='Iptype']";
		protected static  String Ip_Retun_Page = "//a[normalize-space()='IP Return']";
		protected static  String Check_Box_Ip_Number = "//input[@id='chkdraft']";
		protected static  String Enter_Ip_Number = "//input[@id='txtIpid']";

		//======================== Table ===================================
		protected static  String Ip_Retun_Order_In_Table = "//table[@id='tblIpReturn']//tbody//tr[@style='background-color:#fff']";
		protected static  String Check_Box_Select_Ip_Retun_Pop = "//input[@id='ckbCheckAll']";
		protected static  String Save_Ip_Retun_Pop = "//i[@class='fa fa-save']";
		protected static  String Save_Yes_Pop = "//a[@id='YesPopupIPRet']";
		protected static  String Print_Yes_Pop = "//button[@id='btn_ok_printDrugReturnPopUp']";
	
	
	
	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnPharmacyDashboard(String Pharmacy_dashbord , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Pharmacy_dashboard, Pharmacy_dashbord);
		CommanUtill.dropdownSelectByVisibleText(Pharmacy_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Pharmacy_Station_Yes_pop, Station_Yes_Pop);
	}
	public void ClickOnIpIsueMenuAndRetunPage(String Ip_Issue , String Ip_Retun) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Ip_Issue_Tab, Ip_Issue);
		CommanUtill.clickFunction(Ip_Retun_Page, Ip_Retun);
	}
	public void EnterErNumber(String ErNumber) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Ip_Number)));
		WebElement Er_No = driver.findElement(By.xpath(Enter_Ip_Number));
		WebElement Er_Check_Box = driver.findElement(By.xpath(Check_Box_Ip_Number));
		if(! Er_Check_Box.isSelected()) {
			CommanUtill.clickFunction(Check_Box_Ip_Number, ErNumber);
		}
		CommanUtill.textEnter(Enter_Ip_Number, ErNumber);
		Er_No.sendKeys(Keys.ENTER);
	}
	
	public void ClickOnReturnInTable(String Table) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Ip_Retun_Order_In_Table)));
		String Drug_Retun_Row = driver.findElement(By.xpath(Ip_Retun_Order_In_Table)).getText();
		System.out.println("========== Select Ip Retun Drug Order In Table ==========");
		logger.info("================== Select Ip Retun Drug Order In Table====================");
		logger.info(Drug_Retun_Row);
		System.out.println("Show Retun Drug Order In Pharmacy : " + Drug_Retun_Row);
		CommanUtill.clickFunction(Ip_Retun_Order_In_Table, Table);
	}
	public void SelectCheckBoxIpRetunPop(String Chkk_Box) throws IOException , InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Check_Box_Select_Ip_Retun_Pop)));
		
		WebElement Select_Ckk_Box = driver.findElement(By.xpath(Check_Box_Select_Ip_Retun_Pop));
		if(! Select_Ckk_Box.isSelected()) {
			CommanUtill.clickFunction(Check_Box_Select_Ip_Retun_Pop, Chkk_Box);
		}
	}
	public void SaveBtnAndYesPop(String Save_Icon , String Yes_Pop) throws IOException , InterruptedException { 
		
		CommanUtill.clickFunction(Save_Ip_Retun_Pop, Yes_Pop);
		if(CommanUtill.isElementPresent(Save_Yes_Pop)) {
			CommanUtill.clickFunction(Save_Yes_Pop, Yes_Pop);
			System.out.println("Pop Appred Successfully Save Yes Pop");
		}
		else {
			System.out.println("Did Not Pop Appred Successfully Save Yes Pop");
		}
	}
	public void PrintYesPop(String print) throws IOException , InterruptedException { 
		
		if(CommanUtill.isElementPresent(Print_Yes_Pop)) {
			CommanUtill.clickFunction(Print_Yes_Pop, print);
			System.out.println("Pop Appred Successfully Save Yes Pop");
		}
		else {
			System.out.println("Did Not Pop Appred Successfully Save Yes Pop");
		}
	
	}
}
