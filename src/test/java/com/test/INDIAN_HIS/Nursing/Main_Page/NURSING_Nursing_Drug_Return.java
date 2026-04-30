/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
 * 27 Jan 2026
 */
public class NURSING_Nursing_Drug_Return extends GeneralBrowserSetting{
	
	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String ClickNursingReturnDrugOrder = "//*[@id=\"drugreturn123\"]";
    protected static String ClickNewOrderRadioBtn = "//*[@id=\"rdoDrugOrdReturn_1\"]";
    protected static String Rows1 = "//*[@id=\"tbldrugReturns\"]";
    protected static String TextReturnQuantity = "//*[@id=\"retqtytxt\"]";
    protected static String ClickSaveReturnButton = "//*[@id=\"btnsavedrugreturnNewrtn\"]";
    protected static String ClickPendingDrugReturnRadioBtn = "//*[@id=\"rdoDrugOrdReturn_0\"]";
    protected static String SelectReason = "//*[@id=\"cmbreasonreturn\"]";
    protected static String ClickSelectReasonOk = "//*[@id=\"closereasonreturnsave\"]";
    protected static String ClickPendingDeleteyesBtn = "//*[@id=\"closereasonreturnDelete\"]";
    protected static String ClickReturnedRadioButton = "//*[@id=\"rdoDrugOrdReturn_2\"]";
	private WebDriverWait wait;
  


    public boolean firstClickWithHighlight() {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        int maxRows = 10;

        for (int i = 1; i <= maxRows; i++) {

            try {

                String xpath = "//*[@id='tbldrugReturns']/tbody/tr[" + i + "]/td[2]";

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
    
    public boolean firstPendingClickWithHighlight() {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        int maxRows = 10;

        for (int i = 1; i <= maxRows; i++) {

            try {

                String xpath = "//*[@id=\"tbldrugReturns\"]/tbody/tr[" + i + "]/td[1]"; 

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
    
    public boolean firstPendingDeleteClickWithHighlight() {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        int maxRows = 10;

        for (int i = 1; i <= maxRows; i++) {

            try {

                String xpath = "//*[@id=\"tblDrugReturnDetaillist\"]/tbody/tr[" + i + "]/td[10]";  

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
   /* public void clickOnGreenPatient() {

        logger.log(Status.INFO, "Started clicking on GREEN patient");
        log.info("Started clicking on GREEN patient");

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//div[contains(@class,'patient-card')]")));

            logger.log(Status.INFO, "Patient cards are present on screen");
            log.info("Patient cards are present on screen");

            List<WebElement> greenPatients = driver.findElements(
                    By.xpath("//div[contains(@class,'patient-card') and contains(@class,'occupied')]"));

            logger.log(Status.INFO, "Total GREEN patients found: " + greenPatients.size());
            log.info("Total GREEN patients found: " + greenPatients.size());

            if (greenPatients.isEmpty()) {
                logger.log(Status.FAIL, "No GREEN patient found to click");
                log.error("No GREEN patient found to click");
                throw new RuntimeException("❌ No GREEN patient found");
            }

            WebElement greenPatient = greenPatients.get(0);

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", greenPatient);

            logger.log(Status.INFO, "Scrolled to GREEN patient");
            log.info("Scrolled to GREEN patient");

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", greenPatient);

            logger.log(Status.PASS, "GREEN patient clicked successfully");
            log.info("GREEN patient clicked successfully");

        } catch (Exception e) {
            logger.log(Status.FAIL, "Failed to click GREEN patient: " + e.getMessage());
            log.error("Failed to click GREEN patient", e);
            throw e;
        }
    }*/
    
    
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
                    msgText.contains("Saved Succesfully")
                          /*  || msgText.contains("")
                            || msgText.contains(")*/;

            if (isSuccess) {
                logger.log(Status.PASS, "success message verified");
                log.info("success message verified");
                System.out.println("✅ File upload success message verified");
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


    public void DrugReturn(String Facility, String Station, String Return_Qty) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickNursingReturnDrugOrder, "Clicked on The Nursing Return Drug Order Tab");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNewOrderRadioBtn, "Clicked on The Return Drugs New Order Radio Button" );
    	Thread.sleep(500);
    	firstClickWithHighlight();
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextReturnQuantity, Return_Qty);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSaveReturnButton, "Clicked on The Save Return Button");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectReason);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSelectReasonOk, "Clicked on The SelectReason Ok Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(1000);
    	CommanUtill.ClickHomePage();
    
    	
    }

    
    public void DrugReturnPending(String Facility, String Station, String Return_Qty) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickNursingReturnDrugOrder, "Clicked on The Nursing Return Drug Order Tab");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNewOrderRadioBtn, "Clicked on The Return Drugs New Order Radio Button" );
    	Thread.sleep(500);
    	firstClickWithHighlight();
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextReturnQuantity, Return_Qty);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSaveReturnButton, "Clicked on The Save Return Button");
    	Thread.sleep(500);  
    	CommanUtill.selectSecondOptionFromDropdown(SelectReason);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSelectReasonOk, "Clicked on The SelectReason Ok Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPendingDrugReturnRadioBtn, "Clicked on The Pending Drug Return Radio Button");
    	Thread.sleep(500);
    	firstPendingClickWithHighlight();
    	Thread.sleep(500);
    	firstPendingDeleteClickWithHighlight();
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPendingDeleteyesBtn, "Clicked on The Pending Delete Yes Button");
    	Thread.sleep(1000);
    	CommanUtill.ClickHomePage();
    }
 }