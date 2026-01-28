/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 29 Dec 2025
 */
public class ADT_Multiple_Episode_Credit_Limit  extends GeneralBrowserSetting{
	    protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	    protected static String SelectFacility = "//*[@id=\"Facility\"]";
	    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
	    protected static String SelectStation = "//*[@id=\"Department\"]";
	    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
	    protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
	    protected static String ClickMultipleEpisCreditLimit = "//*[@id=\"lstMultipleEpisodeCreditLimitADT\"]/a";
	    
	    protected static String TextUHID = "//*[@id=\"txtUhid\"]";
	    protected static String TextNewCreditLimit = "//*[@id=\"txtNewCreditLimit\"]";
	    protected static String SelectCompanyType = "//*[@id=\"drdCompanyType\"]";
	    protected static String SelectCompany = "//*[@id=\"drdCompany\"]";
	    protected static String SelectRateContract = "//*[@id=\"drdRateContract\"]";
	    protected static String TextClaimNumber = "//*[@id=\"txtPreApprovalNo\"]";
	    protected static String ClickSaveBTN = "//*[@id=\"btnSave\"]";
	    
	    public void MultipleEpisodeCreditLimit(String Facility, String Station, String UHID, String CreditLim, String CompanyType,
	    		String Company, String RateContract, String ClaimNumber) throws IOException, InterruptedException {
	    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked Admit Patient");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickMultipleEpisCreditLimit, "Clicked on The Multiple Episode Credit Limit");
	         Thread.sleep(500);
	         CommanUtill.switchToNewWindow(driver);
	         Thread.sleep(500);
	         CommanUtill.textEnter(TextUHID, UHID);
	         Thread.sleep(500);
	         CommanUtill.textEnter(TextNewCreditLimit, CreditLim);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectCompanyType, CompanyType);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectCompany, Company);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectRateContract, RateContract);
	         Thread.sleep(500);
	         CommanUtill.textEnter(TextClaimNumber, ClaimNumber);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickSaveBTN, "Clicked on The Save Button");
	    }
	    
	    public boolean verifyPOPUPSuccess(WebDriver driver) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p[contains(text(),'Save Successfully!')]");
	            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
	            String msgText = message.getText().trim();
	            System.out.println("Popup Message : " + msgText);

	            return msgText.contains("Save Successfully!");

	        } catch (TimeoutException e) {
	            System.out.println("❌ Save Successfully! popup not displayed");
	            return false;
	        }
	    } 

}
