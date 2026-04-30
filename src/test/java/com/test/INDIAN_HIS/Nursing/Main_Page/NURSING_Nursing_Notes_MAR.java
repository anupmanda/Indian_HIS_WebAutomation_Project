 /**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh  
 *
 * 26 Feb 2026
 */
public class NURSING_Nursing_Notes_MAR extends GeneralBrowserSetting{

	protected static String ClickMAR = "//*[@id=\"NursingMar\"]";
	protected static String ClickAddAvailabeQuantity = "/html/body/ul[10]/li[2]";
	protected static String TextAvailabeQuantity = "//*[@id=\"txtablquantity\"]";
	protected static String TextBatchNo = "//*[@id=\"txtbatchno\"]";
	protected static String ClickJSSaveQuantity = "//*[@id=\"btnSavequantity\"]";
	protected static String SelectReason = "//*[@id=\"ddlMediReasonchngschedule\"]";
	protected static String TextDelayedBy = "//*[@id=\"txtDelayHours\"]";
	protected static String TextRemarks = "//*[@id=\"txtMediAdminiChnageschduleRemarks\"]";
	protected static String ClickSaveByJs = "//*[@id=\"btnSaveMedicationAdmini\"]";
	protected static String ClickSaveAdminis = "//*[@id=\"btnSaveMedicationAdmini\"]";
	protected static String ClickAdverseEvent = "/html/body/ul[8]/li[1]/span";
	protected static String SelectReaction = "//*[@id=\"ddlactivemedobservedReaction\"]";
	protected static String TextEvent = "//*[@id=\"txtactivemedObservedEvent\"]";
	protected static String TextInformedto = "//*[@id=\"txtactivemedObservedDoctInformBy\"]";
	protected static String TextAction = "//*[@id=\"txtactivemedObservedACtiontaken\"]";
	protected static String CLickSaveAdverse = "//*[@id=\"btnsavAdverseEvent\"]";
	protected static String ClickSOSRadioButton = "//*[@id=\"SOS/Sliding\"]";
	
	protected static String SelectMissedReason = "//*[@id=\"ddlMediReasonMissedDose\"]";
	protected static String ClickDoseGivenCheckBox = "//*[@id=\"chkMediAdminiDosegiven\"]";
	protected static String TextMissedDoseTextRemarks = "//*[@id=\"txtMediAdminiMissedDoseRemarks\"]";
	
	protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    
    protected static String ClickUnabletoAdministerRadioBtn = "//*[@id=\"rbMediAdmini2\"]";
    protected static String SelectUnabletoAdminisReason = "//*[@id=\"ddlMediAdminiUnableAdminReason\"]";
	protected static String TextRemarksUnabletoAdminister = "//*[@id=\"txtMediAdminiUnableAdminRemarks\"]";
	
	
	protected static String TextIPNO = "/html/body/div[4]/div[1]/div/div[1]/fieldset/div/div[1]/form/input";
	protected static String ClickInfusionRadioButton = "//*[@id=\"ContinuousInfusion\"]";
	protected static String ClickStartInfusion = "//*[@id=\"tblContinuousInfusion\"]/tbody/tr/td[11]/input";
	protected static String ClickSaveStartInfusionButton = "//*[@id=\"saveInfusionPopUp\"]";
	protected static String ClickChangeInfusion = "//*[@id=\"tblContinuousInfusion\"]/tbody/tr/td[12]/input";
	protected static String ClickEndInfusion =    "//*[@id=\"tblContinuousInfusion\"]/tbody/tr/td[13]/input";
	
	
    
	public boolean lastRightClickWithHighlight() {

	    logger.log(Status.INFO, "Started searching for LAST right-clickable cell in table");
	    log.info("Started searching for LAST right-clickable cell in table");
	    System.out.println("▶ Started searching for LAST right-clickable cell in table");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    Actions actions = new Actions(driver);

	    List<WebElement> rows = driver.findElements(
	            By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[12]/div/div[1]/div[1]/table/tbody/tr")
	    );

	    int maxRows = rows.size();
	    System.out.println("📊 Total rows found: " + maxRows);

	    for (int i = maxRows; i >= 1; i--) {

	        try {

	            String cellXpath =
	                    "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[12]/div/div[1]/div[1]/table/tbody/tr[" 
	                    + i + "]/td[2]";

	            WebElement elementToScroll = driver.findElement(By.xpath(cellXpath));
	            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", elementToScroll);

	            WebElement element = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath(cellXpath))
	            );

	            logger.log(Status.INFO, "Row " + i + " is right-clickable, applying highlight");
	            log.info("Row " + i + " is right-clickable, applying highlight");

	            js.executeScript(
	                    "arguments[0].setAttribute('style'," +
	                    "'background: yellow; border: 3px solid red;');",
	                    element
	            );

	            Thread.sleep(500);

	            js.executeScript("arguments[0].setAttribute('style','');", element);

	            actions.contextClick(element).perform();

	            logger.log(Status.PASS, "Right clicked successfully on LAST clickable row: " + i);
	            log.info("Right clicked successfully on LAST clickable row: " + i);
	            System.out.println("✅ Right clicked successfully on LAST row: " + i);

	            return true;

	        } catch (Exception e) {
	            System.out.println("❌ Row " + i + " not right-clickable → Trying previous row");
	            log.warn("Row " + i + " not right-clickable, trying previous row", e);
	        }
	    }

	    logger.log(Status.FAIL, "No right-clickable cell found in table");
	    log.error("No right-clickable cell found in table");
	    System.out.println("❌ No right-clickable cell found in table");

	    return false;
	}
	
	public boolean lastLeftClickWithHighlight() {

	    logger.log(Status.INFO, "Started searching for LAST right-clickable cell in table");
	    log.info("Started searching for LAST right-clickable cell in table");
	    System.out.println("▶ Started searching for LAST right-clickable cell in table");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    Actions actions = new Actions(driver);

	    List<WebElement> rows = driver.findElements(
	            By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[12]/div/div[1]/div[1]/table/tbody/tr")
	    );

	    int maxRows = rows.size();
	    System.out.println("📊 Total rows found: " + maxRows);

	    for (int i = maxRows; i >= 1; i--) {

	        try {

	            String cellXpath =
	                    "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[12]/div/div[1]/div[1]/table/tbody/tr[" 
	                    + i + "]/td[2]";

	            WebElement elementToScroll = driver.findElement(By.xpath(cellXpath));
	            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", elementToScroll);

	            WebElement element = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath(cellXpath))
	            );

	            logger.log(Status.INFO, "Row " + i + " is right-clickable, applying highlight");
	            log.info("Row " + i + " is right-clickable, applying highlight");

	            js.executeScript(
	                    "arguments[0].setAttribute('style'," +
	                    "'background: yellow; border: 3px solid red;');",
	                    element
	            );

	            Thread.sleep(500);

	            js.executeScript("arguments[0].setAttribute('style','');", element);

	            actions.click(element).perform();

	            logger.log(Status.PASS, "Right clicked successfully on LAST clickable row: " + i);
	            log.info("Right clicked successfully on LAST clickable row: " + i);
	            System.out.println("✅ Right clicked successfully on LAST row: " + i);

	            return true;

	        } catch (Exception e) {
	            System.out.println("❌ Row " + i + " not right-clickable → Trying previous row");
	            log.warn("Row " + i + " not right-clickable, trying previous row", e);
	        }
	    }

	    logger.log(Status.FAIL, "No right-clickable cell found in table");
	    log.error("No right-clickable cell found in table");
	    System.out.println("❌ No right-clickable cell found in table");

	    return false;
	}
	
	public boolean lastLeftClickWithHighlightInfusionStart() {

	    logger.log(Status.INFO, "Started searching for LAST right-clickable cell in table");
	    log.info("Started searching for LAST right-clickable cell in table");
	    System.out.println("▶ Started searching for LAST right-clickable cell in table");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    Actions actions = new Actions(driver);

	    List<WebElement> rows = driver.findElements(
	            By.xpath("//*[@id='tblContinuousInfusion']/tbody/tr")
	    );

	    int maxRows = rows.size();
	    System.out.println("📊 Total rows found: " + maxRows);

	    for (int i = maxRows; i >= 1; i--) {

	        try {

	            String cellXpath = "//*[@id='tblContinuousInfusion']/tbody/tr[" 
	                                + i + 
	                                "]/td[11]/input";

	            WebElement elementToScroll = driver.findElement(By.xpath(cellXpath));
	            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", elementToScroll);

	            WebElement element = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath(cellXpath))
	            );

	            logger.log(Status.INFO, "Row " + i + " is right-clickable, applying highlight");
	            log.info("Row " + i + " is right-clickable, applying highlight");

	            js.executeScript(
	                    "arguments[0].setAttribute('style'," +
	                    "'background: yellow; border: 3px solid red;');",
	                    element
	            );

	            Thread.sleep(500);

	            js.executeScript("arguments[0].setAttribute('style','');", element);

	            actions.click(element).perform();

	            logger.log(Status.PASS, "Right clicked successfully on LAST clickable row: " + i);
	            log.info("Right clicked successfully on LAST clickable row: " + i);
	            System.out.println("✅ Clicked successfully on LAST row: " + i);

	            return true;

	        } catch (Exception e) {
	            System.out.println("❌ Row " + i + " not clickable → Trying previous row");
	            log.warn("Row " + i + " not clickable, trying previous row", e);
	        }
	    }

	    logger.log(Status.FAIL, "No right-clickable cell found in table");
	    log.error("No right-clickable cell found in table");
	    System.out.println("❌ No right-clickable cell found in table");

	    return false;
	}
	
	public boolean lastLeftClickWithHighlightInfusionEnd() {

	    logger.log(Status.INFO, "Started searching for LAST right-clickable cell in table");
	    log.info("Started searching for LAST right-clickable cell in table");
	    System.out.println("▶ Started searching for LAST right-clickable cell in table");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    Actions actions = new Actions(driver);

	    List<WebElement> rows = driver.findElements(
	            By.xpath("//*[@id='tblContinuousInfusion']/tbody/tr")
	    );

	    int maxRows = rows.size();
	    System.out.println("📊 Total rows found: " + maxRows);

	    for (int i = maxRows; i >= 1; i--) {

	        try {

	            String cellXpath = "//*[@id='tblContinuousInfusion']/tbody/tr[" 
	                                + i + 
	                                "]/td[13]/input";

	            WebElement elementToScroll = driver.findElement(By.xpath(cellXpath));
	            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", elementToScroll);

	            WebElement element = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath(cellXpath))
	            );

	            logger.log(Status.INFO, "Row " + i + " is right-clickable, applying highlight");
	            log.info("Row " + i + " is right-clickable, applying highlight");

	            js.executeScript(
	                    "arguments[0].setAttribute('style'," +
	                    "'background: yellow; border: 3px solid red;');",
	                    element
	            );

	            Thread.sleep(500);

	            js.executeScript("arguments[0].setAttribute('style','');", element);

	            actions.click(element).perform();

	            logger.log(Status.PASS, "Right clicked successfully on LAST clickable row: " + i);
	            log.info("Right clicked successfully on LAST clickable row: " + i);
	            System.out.println("✅ Clicked successfully on LAST row: " + i);

	            return true;

	        } catch (Exception e) {
	            System.out.println("❌ Row " + i + " not clickable → Trying previous row");
	            log.warn("Row " + i + " not clickable, trying previous row", e);
	        }
	    }

	    logger.log(Status.FAIL, "No right-clickable cell found in table");
	    log.error("No right-clickable cell found in table");
	    System.out.println("❌ No right-clickable cell found in table");

	    return false;
	}
	
	public boolean lastLeftClickWithHighlightRedColour() {

	    logger.log(Status.INFO, "Started searching for LAST red highlighted cell in table");
	    log.info("Started searching for LAST red highlighted cell in table");
	    System.out.println("▶ Started searching for LAST red highlighted cell in table");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    Actions actions = new Actions(driver);

	    List<WebElement> rows = driver.findElements(
	        By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[12]/div/div[1]/div[1]/table/tbody/tr")
	    );

	    int maxRows = rows.size();
	    System.out.println("📊 Total rows found: " + maxRows);

	    for (int i = maxRows; i >= 1; i--) {

	        try {

	            String cellXpath =
	                "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[12]/div/div[1]/div[1]/table/tbody/tr["
	                + i + "]/td[2]";

	            WebElement element = driver.findElement(By.xpath(cellXpath));

	            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	            wait.until(ExpectedConditions.visibilityOf(element));

	            String bgColor = element.getCssValue("background-color");

	            if (bgColor.equals("rgba(0, 0, 0, 0)") || 
	                bgColor.equals("transparent") || 
	                bgColor.equals("rgba(66, 255, 233, 0)")) {

	                WebElement parentRow = element.findElement(By.xpath("./parent::tr"));
	                bgColor = parentRow.getCssValue("background-color");
	            }

	            System.out.println("Row " + i + " final background color: " + bgColor);

	            if (bgColor.equals("rgba(255, 0, 0, 1)") || 
	                bgColor.equals("rgb(255, 0, 0)")) {

	                logger.log(Status.INFO, "Row " + i + " has RED background, highlighting and clicking");
	                log.info("Row " + i + " has RED background");

	                js.executeScript(
	                    "arguments[0].setAttribute('style','border: 3px solid yellow;');",
	                    element
	                );

	                Thread.sleep(500);

	                js.executeScript("arguments[0].setAttribute('style','');", element);

	                actions.moveToElement(element).click().perform();

	                logger.log(Status.PASS, "Left clicked successfully on LAST RED row: " + i);
	                log.info("Left clicked successfully on LAST RED row: " + i);
	                System.out.println("✅ Left clicked successfully on LAST RED row: " + i);

	                return true;
	            }

	        } catch (Exception e) {
	            System.out.println("❌ Row " + i + " skipped (Not red or not clickable)");
	            log.warn("Row " + i + " skipped", e);
	        }
	    }

	    logger.log(Status.FAIL, "No RED background row found in table");
	    log.error("No RED background row found in table");
	    System.out.println("❌ No RED background row found in table");

	    return false;
	}
	
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
                            || msgText.contains("Administration Completed successfully !!") 
                            || msgText.contains("Record Saved Successfully!")
                            || msgText.contains("Verified successfully!")
                            || msgText.contains("Saved successfully")
                            || msgText.contains("Verified successfully")
                            || msgText.contains("Deleted Successfully!")
                            || msgText.contains("Record saved successfully !!")
                            || msgText.contains("Record updated successfully !!"); 

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
	public void MARDrugAdministration(String Reason,String DelayedDate) throws IOException, InterruptedException {
		CommanUtill.clickFunction(ClickMAR, "Clicked on The MAR Tab");
		Thread.sleep(500);
		lastRightClickWithHighlight();
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickAddAvailabeQuantity, "Clicked on The Availabe Quantity");
		Thread.sleep(500);
		CommanUtill.textEnter(TextAvailabeQuantity, "1");
		Thread.sleep(500);
		CommanUtill.textEnter(TextBatchNo, CommanUtill.generateRandomMobileNumber1(5));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickJSSaveQuantity, "Clicked on The Save Quantity");
		Thread.sleep(500);
		verifySuccessPopup(driver);
		Thread.sleep(500);
		lastLeftClickWithHighlight();
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectReason, Reason);
		Thread.sleep(500);
		CommanUtill.textEnter(TextDelayedBy, DelayedDate);
		Thread.sleep(500);
		CommanUtill.textEnter(TextRemarks, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickSaveByJs, "Clickd on The Save Button Administration");
		Thread.sleep(500);
		verifySuccessPopup(driver);
		Thread.sleep(2000);
		lastLeftClickWithHighlight();
		Thread.sleep(2000);
		CommanUtill.clickByJSFunction(ClickSaveAdminis, "Clicked on The Save Medicine Administration");
		Thread.sleep(2000);
		lastRightClickWithHighlight();
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickAdverseEvent, "Clicked on The Adverse Event Link");
		Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectReaction);
		Thread.sleep(500);
		CommanUtill.textEnter(TextEvent, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.textEnter(TextInformedto, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.textEnter(TextAction, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(CLickSaveAdverse, "Clicked on The Save Adverse Button");
		
	}
	
	public void MARSOS() throws IOException, InterruptedException {
		CommanUtill.clickFunction(ClickMAR, "Clicked on The MAR Tab");
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickSOSRadioButton, "Clicked on The SOS Tab")
		;
	}
	
	public void MARMissed(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickMAR, "Clicked on The MAR Tab");
		Thread.sleep(500);
		lastLeftClickWithHighlightRedColour();
		Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectMissedReason);
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickDoseGivenCheckBox, "Clicked on The Dose Given CheckBox");
		Thread.sleep(500);
		CommanUtill.textEnter(TextMissedDoseTextRemarks, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickSaveAdminis, "Clicked on The Save Medicine Administration");
		Thread.sleep(500);
		verifySuccessPopup(driver);	
		
	}
	
	public void MARUnableToAdminister(String Reason,String DelayedDate) throws IOException, InterruptedException {
		CommanUtill.clickByJSFunction(ClickMAR, "Clicked on The MAR Tab");
		Thread.sleep(500);
		lastRightClickWithHighlight();
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickAddAvailabeQuantity, "Clicked on The Availabe Quantity");
		Thread.sleep(500);
		CommanUtill.textEnter(TextAvailabeQuantity, "1");
		Thread.sleep(500);
		CommanUtill.textEnter(TextBatchNo, CommanUtill.generateRandomMobileNumber1(5));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickJSSaveQuantity, "Clicked on The Save Quantity");
		Thread.sleep(500);
		verifySuccessPopup(driver);
		Thread.sleep(500);
		lastLeftClickWithHighlight();
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectReason, Reason);
		Thread.sleep(500);
		CommanUtill.textEnter(TextDelayedBy, DelayedDate);
		Thread.sleep(500);
		CommanUtill.textEnter(TextRemarks, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickSaveByJs, "Clicked on The Save Button Administration");
		Thread.sleep(500);
		verifySuccessPopup(driver);
		Thread.sleep(2000);
		lastLeftClickWithHighlight();
		Thread.sleep(2000);
		CommanUtill.clickByJSFunction(ClickSaveAdminis, "Clicked on The Save Medicine Administration");
		lastLeftClickWithHighlight();
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickUnabletoAdministerRadioBtn, "Clicked on The Unable to Administer Radio Button");
		Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectUnabletoAdminisReason);
		Thread.sleep(500);
		CommanUtill.textEnter(TextRemarksUnabletoAdminister, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickSaveAdminis, "Clicked on The Save Medicine Administration");		
		
	}
	
	public void clickOnPatient(String ipNo) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement patient = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//div[contains(@id,'cardipid-" + ipNo + "')]")
	    ));

	    patient.click();
	}
	
	public void setCurrentDateTime(WebDriver driver) {

	    LocalDateTime now = LocalDateTime.now();

	    DateTimeFormatter formatter = 
	            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

	    String currentDateTime = now.format(formatter);

	    WebElement dateTimeField = driver.findElement(By.id("infStartDateChage"));

	    dateTimeField.clear();
	    dateTimeField.sendKeys(currentDateTime);
	}

	public void MARInfusion(String Facility, String Station, String IPNO) throws IOException, InterruptedException {
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
    	CommanUtill.textEnter(TextIPNO, IPNO);
    	Thread.sleep(1000);
    	clickOnPatient(IPNO);
    	Thread.sleep(500);
    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickMAR, "Clicked on The MAR Tab");
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickInfusionRadioButton, "Clicked on The Infusion Radio Button");
	/*	Thread.sleep(500);
		lastLeftClickWithHighlightInfusionStart();
		Thread.sleep(500);
		setCurrentDateTime(driver);
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickSaveStartInfusionButton, "Clicked on The Start Infusion Save Button");*/
		Thread.sleep(500);
		lastLeftClickWithHighlightInfusionEnd();
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickSaveStartInfusionButton, "Clicked on The End Infusion Save Button");
		Thread.sleep(500);
		verifySuccessPopup(driver);
	
		
	}
}
