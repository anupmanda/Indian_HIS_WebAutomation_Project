/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
 * 29 Jan 2026
 */
public class NURSING_Nursing_Transfer extends GeneralBrowserSetting{
	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String ClickTransfer = "//*[@id=\"NursingTransferRequest\"]";
    protected static String SelectStationTo = "//*[@id=\"ddlstationto\"]";
    protected static String SelectBedTo = "//*[@id=\"ddlbedtype\"]";
    protected static String ClickSaveTransferBed = "//*[@id=\"SaveTransferRequest\"]";
    protected static String ClickOTTransfer = "//*[@id=\"OTTransfer\"]";
    protected static String SelectModeofTransport = "//*[@id=\"ddlmodoftrasnport\"]";
    protected static String ClickInterFacilityBedTransfer = "//*[@id=\"btnIntrFacilityTrnsfr\"]";
    protected static String ClickConfirmYesbutton = "//*[@id=\"yesconfirmRequest\"]";
    protected static String CLickDeleteYesButton = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[7]/div[3]/div/footer/center/span/a[1]";
    protected static String SelectWard = "//*[@id=\"ddlWard\"]";
    protected static String SelectModeOfTransport = "//*[@id=\"ddlmodoftrasnport1\"]";
    protected static String ClickOTSaveButton = "//*[@id=\"OTSave\"]";
    protected static String ClickOTTransferYesButton = "//*[@id=\"retainBedPopupYesSDN\"]";
    protected static String ClosePopupWindow = "//*[@id=\"closeSurgeryDetails\"]";
    protected static String ClickCancelTransferYes = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[7]/div[3]/div/footer/center/span/a[1]";
    
    
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
                    msgText.contains(" Saved Successfully..!")
                            || msgText.contains("Intimation Cancelled Successfully!")
                            || msgText.contains("Transfer request saved successfully!");

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


    public boolean firstClickWithHighlight() {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        int maxRows = 10;

        for (int i = 1; i <= maxRows; i++) {

            try {

                String xpath = "//*[@id='tbltransferrequest']/tbody/tr[" + i + "]/td[2]";    //*[@id="tblSurgeryDetails"]/tbody/tr[1]/td[10]

                WebElement element = wait.until( ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                       
             

                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
                log.info("Row " + i + " is clickable, applying highlight");
                System.out.println("✨ Highlighting row: " + i);

                js.executeScript(
                        "arguments[0].setAttribute('style'," +
                        "'background: yellow; border: 3px solid blue;');",
                        element
                );

                Thread.sleep(500);

                js.executeScript(
                        "arguments[0].setAttribute('style','');",
                        element
                );

                element.click();

                logger.log(Status.PASS, "Clicked successfully on first clickable row: " + i);
                log.info("Clicked successfully on first clickable row: " + i);
                System.out.println("✅ Clicked successfully on row: " + i);

                return true;

            } catch (Exception e) {

                logger.log(Status.WARNING, "Row " + i + " not clickable, trying next row");
                log.warn("Row " + i + " not clickable, trying next row", e);
                System.out.println("❌ Row " + i + " not clickable → Trying next row");
            }
        }

        logger.log(Status.FAIL, "No clickable cell found in first " + maxRows + " rows");
        log.error("No clickable cell found in first " + maxRows + " rows");
        System.out.println("❌ No clickable cell found in first " + maxRows + " rows");

        return false;
    }
    
    public boolean firstClickWithHighlightOT() {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        int maxRows = 10;

        for (int i = 1; i <= maxRows; i++) {

            try {

                String xpath = "//*[@id='tblSurgeryDetails']/tbody/tr[" + i + "]/td[10]";    //*[@id="tbltransferrequest"]/tbody/tr/td[2] 

                WebElement element = wait.until( ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                       
             

                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
                log.info("Row " + i + " is clickable, applying highlight");
                System.out.println("✨ Highlighting row: " + i);

                js.executeScript(
                        "arguments[0].setAttribute('style'," +
                        "'background: yellow; border: 3px solid blue;');",
                        element
                );

                Thread.sleep(500);

                js.executeScript(
                        "arguments[0].setAttribute('style','');",
                        element
                );

                element.click();

                logger.log(Status.PASS, "Clicked successfully on first clickable row: " + i);
                log.info("Clicked successfully on first clickable row: " + i);
                System.out.println("✅ Clicked successfully on row: " + i);

                return true;

            } catch (Exception e) {

                logger.log(Status.WARNING, "Row " + i + " not clickable, trying next row");
                log.warn("Row " + i + " not clickable, trying next row", e);
                System.out.println("❌ Row " + i + " not clickable → Trying next row");
            }
        }

        logger.log(Status.FAIL, "No clickable cell found in first " + maxRows + " rows");
        log.error("No clickable cell found in first " + maxRows + " rows");
        System.out.println("❌ No clickable cell found in first " + maxRows + " rows");

        return false;
    }
    
    public boolean firstClickWithHighlightOTDelete() {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        int maxRows = 10;

        for (int i = 1; i <= maxRows; i++) {

            try {

                String xpath = "//*[@id='tbltransferrequest']/tbody/tr[" + i + "]/td[2]";    

                WebElement element = wait.until( ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                       
             

                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
                log.info("Row " + i + " is clickable, applying highlight");
                System.out.println("✨ Highlighting row: " + i);

                js.executeScript(
                        "arguments[0].setAttribute('style'," +
                        "'background: yellow; border: 3px solid blue;');",
                        element
                );

                Thread.sleep(500);

                js.executeScript(
                        "arguments[0].setAttribute('style','');",
                        element
                );

                element.click();

                logger.log(Status.PASS, "Clicked successfully on first clickable row: " + i);
                log.info("Clicked successfully on first clickable row: " + i);
                System.out.println("✅ Clicked successfully on row: " + i);

                return true;

            } catch (Exception e) {

                logger.log(Status.WARNING, "Row " + i + " not clickable, trying next row");
                log.warn("Row " + i + " not clickable, trying next row", e);
                System.out.println("❌ Row " + i + " not clickable → Trying next row");
            }
        }

        logger.log(Status.FAIL, "No clickable cell found in first " + maxRows + " rows");
        log.error("No clickable cell found in first " + maxRows + " rows");
        System.out.println("❌ No clickable cell found in first " + maxRows + " rows");

        return false;
    }
    
    public void NursingTransfer(String Facility, String Station, String StationTo, String BedType) throws IOException, InterruptedException {
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
    	Thread.sleep(500);
    	CommanUtill commanUtill = new CommanUtill();
		commanUtill.clickOnGreenPatient();
    	Thread.sleep(500);
    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickTransfer, "Clicked on The Transfer Tab Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStationTo, StationTo);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectBedTo, BedType);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSaveTransferBed, "Clicked on The Transfered Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickConfirmYesbutton, "Clicked on The Confirm Yes Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(2000);
    	firstClickWithHighlight();
    	Thread.sleep(2000);
    	CommanUtill.clickFunction(CLickDeleteYesButton,"Clicked on The Delete Yes Button");
    	Thread.sleep(1000);
    	verifySuccessPopup(driver);
    	Thread.sleep(1000);
    	CommanUtill.ClickHomePage();
    	
    }
    
    public void NursingOTTransfer(String Facility, String Station, String Ward, String Transport) throws IOException, InterruptedException {
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
    	Thread.sleep(500);
    	CommanUtill commanUtill = new CommanUtill();
		commanUtill.clickOnGreenPatient();
    	Thread.sleep(500);
    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickTransfer, "Clicked on The Transfer Tab Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickOTTransfer, "Clicked on The OT Transfer Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickConfirmYesbutton, "Clicked on The Confirm Yes Button");
    	Thread.sleep(500);
    	firstClickWithHighlightOT();
    	Thread.sleep(500);
    //	CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);
    	CommanUtill.selectSecondOptionFromDropdown(SelectWard);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectModeOfTransport, Transport);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickOTSaveButton, "Clicked on The OT Save Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickOTTransferYesButton, "Clicked on The OT Transfer Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClosePopupWindow, "Clicked on The Closed Window");
    	Thread.sleep(500);
    	firstClickWithHighlightOTDelete();
    	Thread.sleep(1000);
    	CommanUtill.clickFunction(ClickCancelTransferYes, "Clicked on The Cancel Transfer Yes Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(1000);
    	CommanUtill.ClickHomePage();
    	
    	
    	
    }
}
