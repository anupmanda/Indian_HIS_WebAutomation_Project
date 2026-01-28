/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 11 Dec 2025
 */
public class ADT_Update_Admission_Date extends GeneralBrowserSetting {

	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	protected static String SelectFacility = "//*[@id=\"Facility\"]";
	protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
	protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
	protected static String ClickAdmissionUpdateDetails = "//*[@id=\"FOAddPatientMenu\"]/ul/li[5]/a";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String TextIPNO = "//*[@id=\"txtIPNO\"]";
    protected static String SelectNewDischargeType = "//*[@id=\"ddlndischarg\"]";
    protected static String TextDateandTime = "//*[@id=\"dtpNewAdmitDateTime\"]";
    protected static String ClickUpdateBTN = "//*[@id=\"btnUpdate\"]";
    protected static String CLickHomePage  = "//*[@id=\"body_clickable\"]/div[1]/div[1]/a[1]/img";    
    
    
    public void ADTUpdateAmission(String Facility, String Station, String DischargeType) throws IOException, InterruptedException {
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmissionUpdateDetails, "Clicked on The Update Admission Date Link");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextIPNO, ADT_Admit_Patient.GLOBAL_IPNO);
    	Thread.sleep(500);
    	CommanUtill.pressEnter(TextIPNO);
    	Thread.sleep(500);
    	CommanUtill.clearTextField(TextDateandTime, "TextField Cleared");
    	Thread.sleep(10000);
    	CommanUtill.textEnter(TextDateandTime, CommanUtill.getDateTimeMinus15Min());
       	Thread.sleep(500);
    /*	CommanUtill.dropdownSelectByVisibleText(SelectNewDischargeType, DischargeType);
    	Thread.sleep(500);*/
    	CommanUtill.clickByJSFunction(ClickUpdateBTN, "Clicked on The Update Button");
    }
    
    public void ADTUpdateAmission1(String Facility, String Station, String DischargeType) throws IOException, InterruptedException {
    	Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("location.reload(true);");
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(CLickHomePage, "Clicked on The HomePage");
        Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmissionUpdateDetails, "Clicked on The Update Admission Date Link");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextIPNO, ADT_Admit_Patient.GLOBAL_IPNO);
    	Thread.sleep(500);
    	CommanUtill.pressEnter(TextIPNO);
    	Thread.sleep(500);
    	CommanUtill.clearTextField(TextDateandTime, "TextField Cleared");
    	Thread.sleep(500);
    	WebElement dateField = driver.findElement(By.xpath(TextDateandTime));
       	dateField.sendKeys(Keys.CONTROL + "a");
       	Thread.sleep(500);
       	dateField.sendKeys(Keys.DELETE);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextDateandTime, CommanUtill.setNewAdmissionDateMinus15Min()); 
       	Thread.sleep(500);   
    /*	CommanUtill.dropdownSelectByVisibleText(SelectNewDischargeType, DischargeType);
    	Thread.sleep(500);*/
    	CommanUtill.clickByJSFunction(ClickUpdateBTN, "Clicked on The Update Button");
    }
}
