/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
 * 30 Jan 2026
 */
public class NURSING_Nursing_Discharge extends GeneralBrowserSetting {
	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String ClickDischarge = "//*[@id=\"NursingDischargeRequest\"]";
    protected static String SelectDischargeType = "//*[@id=\"dishchargetype\"]";
    protected static String SelectDischargeSubType = "//*[@id=\"dishchargesubtype\"]";
    protected static String TextRemarks = "//*[@id=\"dis_Remarks\"]";
    protected static String ClickSaveDischargeIntimation = "//*[@id=\"SaveDischargeIntimation\"]";
    protected static String ClickYesConfirmButton = "//*[@id=\"Dbtnyes\"]";
    protected static String ClickDeleteYesButton = "//*[@id=\"Intimationbtnyes\"]";
    protected static String TextReasonForDelete = "//*[@id=\"txtAreaReason\"]";
    protected static String ClickPopupCancelYesBtn  =  "//*[@id=\"popCancelReason_yes\"]";
    
    protected static String ClickExpectedDateofDischargeCheckBox = "//*[@id=\"ExpectedDatechk\"]";
    protected static String TextDischargeDate = "//*[@id=\"DateDischarge\"]";
    protected static String CickSaveDateDischarge = "//*[@id=\"DateDischargeSave\"]";
    
    protected static String ClickMarkforDischargeCheckBox = "//*[@id=\"ChkMarkforDischarge\"]";
    protected static String TextMarkForDischargeDate = "//*[@id=\"DateMarkforDischarge\"]";
    protected static String ClickSaveMarkforDischarge = "//*[@id=\"Save_MarkforDischarge\"]";
    
    


    public static String getDateTimeAfterFiveDays() {
        LocalDateTime now = LocalDateTime.now();             
        LocalDateTime future = now.plusDays(5);              

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return future.format(formatter);                      
    }

        public static String getDateAfterFiveDays() {
            LocalDate today = LocalDate.now();          
            LocalDate futureDate = today.plusDays(5);   

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return futureDate.format(formatter);       
        }


        public static void main(String[] args) {
            System.out.println(getDateAfterFiveDays());
        }
    
        public static String getFutureDate(int days) {
            LocalDate today = LocalDate.now();
            LocalDate futureDate = today.plusDays(days);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return futureDate.format(formatter);
        }

        public void markForDischargeIfNotSelected() {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

                WebElement chkMarkForDischarge = wait.until(
                        ExpectedConditions.presenceOfElementLocated(By.id("ChkMarkforDischarge"))
                );

                JavascriptExecutor js = (JavascriptExecutor) driver;

                js.executeScript(
                    "arguments[0].style.border='3px solid red'; arguments[0].style.background='yellow';",
                    chkMarkForDischarge
                );
                Thread.sleep(300);

                if (!chkMarkForDischarge.isSelected()) {

                    js.executeScript(
                        "arguments[0].style.border='3px solid blue'; arguments[0].style.background='lightgreen';",
                        chkMarkForDischarge
                    );
                    Thread.sleep(300);

                    chkMarkForDischarge.click();

                    logger.info("Mark For Discharge checkbox was NOT selected → Clicked once");
                    log.info("Mark For Discharge checkbox clicked once");
                    System.out.println("Mark For Discharge checkbox was NOT selected → Clicked once");

                } else {

                    js.executeScript(
                        "arguments[0].style.border='3px solid green'; arguments[0].style.background='lightyellow';",
                        chkMarkForDischarge
                    );
                    Thread.sleep(300);

                    chkMarkForDischarge.click();
                    Thread.sleep(200);
                    chkMarkForDischarge.click();

                    logger.info("Mark For Discharge checkbox already selected → Clicked twice");
                    log.info("Mark For Discharge checkbox clicked twice");
                    System.out.println("Mark For Discharge checkbox already selected → Clicked twice");

                }

                js.executeScript(
                    "arguments[0].style.border=''; arguments[0].style.background='';",
                    chkMarkForDischarge
                );

            } catch (Exception e) {
                logger.error("Error while handling Mark For Discharge checkbox");
                log.error("Exception in markForDischargeIfNotSelected()");
                System.out.println("Exception while clicking Mark For Discharge checkbox: " + e.getMessage());
            }
        }



    public boolean verifySuccessPopup(WebDriver driver) {

        logger.log(Status.INFO, "Started verification of success message");
        log.info("Started verification of success message");
        System.out.println("▶ Started verification of success message");

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
                    msgText.contains("Discharge Intimation Saved successfully!")
                            || msgText.contains("Discharge Intimation Cancelled Successfully!")
                            || msgText.contains("Expected discharge date Saved successfully.")
                            || msgText.contains("Expected discharge date updated successfully.")
                            || msgText.contains("Discharge Marked Saved successfully! !!")
                            || msgText.contains("Discharge Marked Updated successfully! !!");

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

                String xpath = "//*[@id='existing_progressNotes']/tbody/tr[" + i + "]/td[1]";    

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

public void DischargeIntimation(String Facility, String Station, String DischargeType, String DischargeSubType, String Remarks, 
		String DeleteRemarks ) throws IOException, InterruptedException {
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
	CommanUtill.clickByJSFunction(ClickDischarge, "Clicked on The Discharge Tab Button");
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectDischargeType, DischargeType);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectDischargeSubType, DischargeSubType);
	Thread.sleep(500);
	CommanUtill.textEnter(TextRemarks, Remarks);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickSaveDischargeIntimation, "Clicked on The Discharge Intimation Save Button");
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickYesConfirmButton, "Clicked on The Confirm Yes Button");
	Thread.sleep(500);
	verifySuccessPopup(driver);
	Thread.sleep(500);
	firstClickWithHighlight();
	Thread.sleep(1000);
	CommanUtill.clickFunction(ClickDeleteYesButton, "Clicked on The Confirm Delete Yes Button");
	Thread.sleep(1000);
	CommanUtill.textEnter(TextReasonForDelete, DeleteRemarks);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickPopupCancelYesBtn, "Clicked on The CancelPopup Yes Buton");
	Thread.sleep(500);
	verifySuccessPopup(driver);
	Thread.sleep(1000);
	CommanUtill.ClickHomePage();
}

public void ExpectedDateofDischarge(String Facility, String Station) throws IOException, InterruptedException {
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
	CommanUtill.clickByJSFunction(ClickDischarge, "Clicked on The Discharge Tab Button");
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickExpectedDateofDischargeCheckBox, "Clicked on The Expected Date of Discharge CheckBox");
	Thread.sleep(500);
	CommanUtill.textEnter(TextDischargeDate, getDateAfterFiveDays());
	Thread.sleep(500);
	CommanUtill.clickFunction(CickSaveDateDischarge, "Clicked on The Expected Date of Discharge Save Button");
	Thread.sleep(500);
	verifySuccessPopup(driver);
	Thread.sleep(1000);
	CommanUtill.ClickHomePage();
}

public void MarkForDischarge(String Facility, String Station) throws IOException, InterruptedException {
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
	CommanUtill.clickByJSFunction(ClickDischarge, "Clicked on The Discharge Tab Button");
	Thread.sleep(500);
	//CommanUtill.clickFunction(ClickMarkforDischargeCheckBox, "Clicked on The Mark for The Discharge CheckBox");
	markForDischargeIfNotSelected();
	Thread.sleep(500);
	CommanUtill.textEnter(TextMarkForDischargeDate, getDateTimeAfterFiveDays());
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickSaveMarkforDischarge, "Clicked on The Mark for Discharge Save Button");
	Thread.sleep(500);
	verifySuccessPopup(driver);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickMarkforDischargeCheckBox, "Clicked on The Mark for The Discharge CheckBox");
	Thread.sleep(1000);
	CommanUtill.ClickHomePage();
}
}