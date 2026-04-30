/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 25 Feb 2026
 */
public class NURSING_Nursing_Cancel_Sales_Consumption extends GeneralBrowserSetting{

	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickSalesandConsumption = "/html/body/nav/ul/li[6]/a";
    protected static String ClickCncelSalesandConsumptionLink = "/html/body/nav/ul/li[6]/ul/li[2]/a";
    protected static String TextIPNO = "//*[@id=\"txtipno\"]";
    protected static String SelectAgainstOrderdIssued = "//*[@id=\"ddlorderissued\"]";
    protected static String ClickIfPresent = "//*[@id=\"btnstationdrug\"]";
    protected static String ClickCheckBox = "//*[@id=\"globalcheckbox\"]";
    protected static String TextReturnQuantity = "//*[@id=\"returnQty0\"]";
    protected static String ClickSaveButton = "//*[@id=\"save\"]";
    protected static String ClickCancelYesButton = "//*[@id=\"yes\"]";
    protected static String ClickOkButton = "/html/body/div[4]/div[4]/div/footer/span/a";
    
    public boolean verifySuccessPopup(WebDriver driver) {

        logger.log(Status.INFO, "Started verification of file upload success message");
        log.info("Started verification of file upload success message");
        System.out.println("▶ Started verification of file upload success message");

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p");
            WebElement message = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(successMsg)
            );

            String msgText = message.getText().trim();

            logger.log(Status.INFO, "Popup message displayed: " + msgText);
            log.info("Popup message displayed: " + msgText);
            System.out.println("ℹ Popup Message : " + msgText);

            boolean isSuccess =
                    msgText.contains("Saved successfully!")  
                           || msgText.contains("Updated successfully!")
                            || msgText.contains("Signed successfully!")
                            || msgText.contains("Record Saved Successfully!")
                            || msgText.contains("Verified successfully!")
                            || msgText.contains("Order is Completely Cancelled.")
                            || msgText.contains(" Records Updated."); 

            if (isSuccess) {
                logger.log(Status.PASS, " success message verified");
                log.info(" success message verified");
                System.out.println("✅ success message verified");
            } else {
                logger.log(Status.FAIL, "Unexpected success popup message: " + msgText);
                log.error("Unexpected success popup message: " + msgText);
                System.out.println("❌ Unexpected popup message");
            }

            return isSuccess;

        } catch (TimeoutException e) {
            logger.log(Status.FAIL, "Success popup not displayed within timeout");
            log.error("Success popup not displayed within timeout", e);
            System.out.println("❌ Success popup not displayed");       
            Assert.fail("Success popup not displayed within timeout");
            return false; 
        }
    }
    
    public void CancelSalesConsumption(String Facility, String Station, String IPNO, String Quantity) throws IOException, InterruptedException {
    	
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSalesandConsumption, "Clciked on The Sales and Comsumption Screen");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickCncelSalesandConsumptionLink, "Clcked on The Cancel Sales and Consumption Screen Link");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextIPNO, IPNO);
    	Thread.sleep(1000);
    	CommanUtill.pressEnter(TextIPNO);
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectAgainstOrderdIssued);
    	Thread.sleep(500);
    	CommanUtill.clickIfPresent(ClickIfPresent, "Clicked if Present Loactor is Comming");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickCheckBox, "Clicked on The CheckBox");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextReturnQuantity, Quantity);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveButton, "Clciked on The Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickCancelYesButton, "Clicked on The Cancel Yes Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickOkButton, "Clicked on The OK Button");
    	Thread.sleep(1000);
    	CommanUtill.ClickHomePage();
    	
    }
}

