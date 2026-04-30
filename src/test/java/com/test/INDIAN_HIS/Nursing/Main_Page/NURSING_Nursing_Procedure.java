/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 19 Jan 2026
 */
public class NURSING_Nursing_Procedure extends GeneralBrowserSetting{
	   WebDriverWait wait;
	    protected static String SelectFacility = "//*[@id='Facility']";
	    protected static String SelectStation = "//*[@id='Department']";
	    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
	    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
	    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
	    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
	    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
	    protected static String ClickProcedure = "//*[@id=\"GeneralOrderEntryView\"]";
	    protected static String sampleDropdownXpath = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[2]/div[1]/div[1]/div[2]/div/table/tbody/tr[1]/td[4]/select";
	    protected static String ClickProcedureSaveButton = "//*[@id=\"SaveGeneralOrder\"]";
	    protected static String ClickYesBtn = "//*[@id=\"btn_ok_savePopUp\"]";
	    protected static String ClickDeleteProcedureCheckBox = "//*[@id=\"subItem\"]/tbody/tr/td[6]/input";
	    protected static String ClickDeleteButton = "//*[@id=\"DeleteGeneralOrder\"]";
	    protected static String SelectReasonforDelete = "//*[@id=\"deletereason_select\"]";
	    protected static String TextRemarks = "//*[@id=\"txtReasonRemarks\"]";
	    protected static String ClickOKButton = "//*[@id=\"btn_ok_savePopUp_1\"]";
	    protected static String ClickPrintButton = "//*[@id=\"PrintGeneralOrder\"]";
	    protected static String ClickRefreshButton = "//*[@id=\"RefershGeneralOrderEntry\"]";
	    
	    
	    
	    public String getGritterMessageText() {
	        try {
	            return driver.findElement(
	                By.xpath("//div[contains(@class,'gritter-item')]//p")
	            ).getText().trim();
	        } catch (Exception e) {
	            return "";
	        }
	    }

	    public boolean isKnownGritterErrorDisplayed() {
	        String msg = getGritterMessageText();
	        return !msg.isEmpty() && (
	                msg.contains("Sample Type is not Mapped") ||
	                msg.contains("Price not defined for this service") ||
	                msg.contains("This investigation is not allowed for this gender") ||
	                msg.contains("Already exists")
	        );
	    }

	    public void waitForGritterToDisappear() {
	        new WebDriverWait(driver, Duration.ofSeconds(5))
	            .until(ExpectedConditions.invisibilityOfElementLocated(
	                By.cssSelector(".gritter-item-wrapper")));
	    }

	    /* ===================== VALIDATION ===================== */

	    public boolean isProcedureAddedInRightTable(String procedureName) {
	        try {
	            return driver.findElement(
	                By.xpath("//table[@id='subItem']//td[@ctype='itemname' and " +
	                         "contains(normalize-space(),'" + procedureName + "')]")
	            ).isDisplayed();
	        } catch (Exception e) {
	            return false;
	        }
	    }
	    
	    public boolean isItemPresentInNursingGeneralTable(String expectedName) {

	        List<WebElement> items = driver.findElements(
	                By.xpath("//div[contains(@class,'nursing-general-table')]//table//tbody//tr//td[1]")
	        );

	        for (WebElement item : items) {
	            String text = item.getText().replace("\n", "").trim();
	            if (text.equalsIgnoreCase(expectedName)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean isLatestItemAddedInNursingGrid(String expectedName) {
	        try {
	            WebElement latestItem = driver.findElement(
	                    By.xpath("//div[contains(@class,'nursing-general-table')]//table//tbody//tr[1]/td[1]")
	            );

	            return latestItem.getText().trim().equalsIgnoreCase(expectedName);

	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }


	    /* ===================== MAIN PROCEDURE SELECTION ===================== */
	    public void selectValidProcedureFromItems() throws InterruptedException {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        boolean procedureAdded = false;

	        try {
	            logger.log(Status.INFO, "Started selecting valid procedure from Items table");
	            log.info("Started selecting valid procedure from Items table");
	            System.out.println("▶ Started selecting valid procedure from Items table");

	            int rowCount = driver.findElements(
	                    By.xpath("//table[@id='tblItem']/tbody/tr")
	            ).size();

	            logger.log(Status.INFO, "Total procedures found: " + rowCount);
	            System.out.println("🔢 Total procedures found: " + rowCount);

	            for (int i = 1; i <= rowCount; i++) {

	                WebElement procedureCell = driver.findElement(
	                        By.xpath("//table[@id='tblItem']/tbody/tr[" + i + "]/td[1]")
	                );

	                String procedureName = procedureCell.getText().trim();
	                if (procedureName.isEmpty()) continue;

	                System.out.println("🧾 Trying procedure [" + i + "]: " + procedureName);
	                logger.log(Status.INFO, "Trying procedure: " + procedureName);
	                log.info("Trying procedure: {}");

	                js.executeScript(
	                        "arguments[0].setAttribute('style','background: yellow; border: 2px solid blue;');",
	                        procedureCell
	                );

	                new WebDriverWait(driver, Duration.ofSeconds(5))
	                        .until(ExpectedConditions.elementToBeClickable(procedureCell))
	                        .click();

	                Thread.sleep(500);

	                js.executeScript("arguments[0].setAttribute('style','');", procedureCell);

	                if (isKnownGritterErrorDisplayed()) {

	                    String errorMsg = getGritterMessageText();
	                    System.out.println("⚠ Gritter error for procedure: " + procedureName + " | Msg: " + errorMsg);

	                    logger.log(Status.WARNING,
	                            "Invalid procedure due to gritter: " + errorMsg);
	                    log.warn("Gritter error for procedure {} : {}");

	                    waitForGritterToDisappear();
	                    System.out.println("⏳ Gritter disappeared, trying next procedure...");
	                    continue;
	                }

	                if (isLatestItemAddedInNursingGrid(procedureName)
	                        || isItemPresentInNursingGeneralTable(procedureName)) {

	                    System.out.println("✅ Correct item added: " + procedureName);
	                    logger.log(Status.PASS, "Correct item added: " + procedureName);
	                    log.info("Correct item added: {}");

	                    procedureAdded = true;
	                    break;  
	                }


	                System.out.println("➡ Procedure not valid, moving to next...");
	            }

	            if (!procedureAdded) {
	                System.out.println("❌ No valid procedure could be added from Items table!");
	                logger.log(Status.FAIL, "No valid procedure could be added from Items table!");
	                log.error("No valid procedure could be added from Items table!");
	                Assert.fail("No valid procedure could be added from Items table!");
	            }

	        } catch (Exception e) {

	            System.out.println("❌ Exception while selecting procedure from Items table: " + e.getMessage());
	            logger.log(Status.FAIL, "Exception while selecting procedure from Items table: " + e.getMessage());
	            log.error("Exception while selecting procedure from Items table", e);
	            Assert.fail("Error while selecting procedure from Items table");
	        }
	    }


	 /*   public void clickOnGreenPatient() {

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
	   

	    public void handleProcedureDropdowns(WebDriver driver) throws InterruptedException {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        logger.log(Status.INFO, "Started handling Procedure dropdowns");
	        log.info("Started handling Procedure dropdowns");
	        System.out.println("Started handling Procedure dropdowns");

	        int row = 1;

	        while (true) {
	            try {
	                String xpath = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[2]/div[1]/div[1]/div[2]/div/table/tbody/tr["
	                               + row + "]/td[4]/select";

	                logger.log(Status.INFO, "Checking dropdown at row: " + row);
	                log.info("Checking dropdown at row: " + row);
	                System.out.println("Checking dropdown at row: " + row);

	                WebElement dropdown = driver.findElement(By.xpath(xpath));

	                logger.log(Status.INFO, "Dropdown found at row: " + row);
	                log.info("Dropdown found at row: " + row);
	                System.out.println("Dropdown found at row: " + row);

	                js.executeScript("arguments[0].scrollIntoView(true);", dropdown);

	                logger.log(Status.INFO, "Scrolled to dropdown at row: " + row);
	                log.info("Scrolled to dropdown at row: " + row);
	                System.out.println("Scrolled to dropdown at row: " + row);

	                Select select = new Select(dropdown);
	                List<WebElement> options = select.getOptions();

	                logger.log(Status.INFO, "Total options found at row " + row + ": " + options.size());
	                log.info("Total options found at row " + row + ": " + options.size());
	                System.out.println("Total options found at row " + row + ": " + options.size());

	                if (options.size() <= 1) {

	                    logger.log(Status.INFO, "Only default option present at row " + row + ", moving to next row");
	                    log.info("Only default option present at row " + row + ", moving to next row");
	                    System.out.println("Only default option present at row " + row + ", moving to next row");

	                    row++;
	                    continue;
	                }

	                WebElement optionToSelect = options.get(1);
	                select.selectByIndex(1);

	                logger.log(Status.PASS, "Selected option index 1 at row: " + row);
	                log.info("Selected option index 1 at row: " + row);
	                System.out.println("Selected option index 1 at row: " + row);

	                js.executeScript(
	                    "arguments[0].style.background='yellow'; arguments[0].style.border='2px solid blue';",
	                    optionToSelect
	                );

	                logger.log(Status.INFO, "Highlighted selected option at row: " + row);
	                log.info("Highlighted selected option at row: " + row);
	                System.out.println("Highlighted selected option at row: " + row);

	                Thread.sleep(500);

	                js.executeScript(
	                    "arguments[0].style.background=''; arguments[0].style.border='';",
	                    optionToSelect
	                );

	                logger.log(Status.INFO, "Highlight removed for row: " + row);
	                log.info("Highlight removed for row: " + row);
	                System.out.println("Highlight removed for row: " + row);

	                row++;

	            } catch (NoSuchElementException e) {

	                logger.log(Status.INFO, "No more dropdown found. Loop break.");
	                log.info("No more dropdown found. Loop break.");
	                System.out.println("No more dropdown found. Loop break.");

	                break;

	            } catch (Exception e) {

	                logger.log(Status.FAIL, "Error while handling dropdown at row " + row + " : " + e.getMessage());
	                log.error("Error while handling dropdown at row " + row, e);
	                System.out.println("Error while handling dropdown at row " + row + " : " + e.getMessage());

	                throw e;
	            }
	        }
	    }

	    public boolean verifyFileUploadSuccess(WebDriver driver) {

	        logger.log(Status.INFO, "Started verification of file upload success message");
	        log.info("Started verification of file upload success message");

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
	                    msgText.contains("Saved Successfully!")
	                    || msgText.contains("Deleted Successfully!")
	                    || msgText.contains("Order updated successfully!");

	            if (isSuccess) {
	                logger.log(Status.PASS, " success message verified");
	                log.info(" success message verified");
	                System.out.println("✅ success message verified");
	                return true;
	            } else {
	                logger.log(Status.FAIL, "Unexpected popup message: " + msgText);
	                Assert.fail("Unexpected popup message displayed: " + msgText);
	                System.out.println("❌ Unexpected popup message");
	                return false; 
	            }

	        } catch (TimeoutException e) {
	            logger.log(Status.FAIL, "Success popup not displayed within timeout");
	            log.error("Success popup not displayed within timeout", e);
	            System.out.println("❌ Success popup not displayed");       
	            Assert.fail("Success popup not displayed within timeout");
	            return false; 
	        }
	    }


	    public void clickFirstAvailableTd5WithHighlight(WebDriver driver) throws Exception {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        logger.log(Status.INFO, "Started clicking on first available td[5] in GeneralOrder table");
	        log.info("Started clicking on first available td[5] in GeneralOrder table");
	        System.out.println("Started clicking on first available td[5] in GeneralOrder table");

	        for (int i = 1; i <= 10; i++) {

	            try {
	                String xpath = "//*[@id='GeneralOrder']/tbody/tr[" + i + "]/td[5]";

	                logger.log(Status.INFO, "Checking row number: " + i);
	                log.info("Checking row number: " + i);
	                System.out.println("Checking row number: " + i);

	                WebElement element = driver.findElement(By.xpath(xpath));

	                logger.log(Status.INFO, "Element found at row: " + i);
	                log.info("Element found at row: " + i);
	                System.out.println("Element found at row: " + i);

	                String originalStyle = element.getAttribute("style");

	                js.executeScript(
	                    "arguments[0].setAttribute('style','background: yellow; border:3px solid blue;');",
	                    element
	                );

	                logger.log(Status.INFO, "Highlighted element at row: " + i);
	                log.info("Highlighted element at row: " + i);
	                System.out.println("Highlighted element at row: " + i);

	                Thread.sleep(700);

	                element.click();

	                logger.log(Status.PASS, "Clicked successfully on row: " + i);
	                log.info("Clicked successfully on row: " + i);
	                System.out.println("Clicked successfully on row: " + i);

	                Thread.sleep(300);

	                js.executeScript(
	                    "arguments[0].setAttribute('style', arguments[1]);",
	                    element, originalStyle
	                );

	                logger.log(Status.INFO, "Highlight removed for row: " + i);
	                log.info("Highlight removed for row: " + i);
	                System.out.println("Highlight removed for row: " + i);

	                break;

	            } catch (NoSuchElementException e) {

	                logger.log(Status.INFO, "Element not found at row: " + i + ", checking next row");
	                log.info("Element not found at row: " + i + ", checking next row");
	                System.out.println("Element not found at row: " + i + ", checking next row");

	            } catch (Exception e) {

	                logger.log(Status.FAIL, "Issue at row " + i + " : " + e.getMessage());
	                log.error("Issue at row " + i, e);
	                System.out.println("Issue at row " + i + " : " + e.getMessage());

	                throw e;
	            }
	        }
	    }

	    public void SelectProcedure(String Facility, String Station) throws IOException, InterruptedException, Exception {
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
	    	CommanUtill.clickByJSFunction(ClickProcedure, "Clicked on The Procedure Tab");
	    	selectValidProcedureFromItems();
	    	handleProcedureDropdowns(driver);
	    	CommanUtill.clickFunction(ClickProcedureSaveButton, "Clicked on The Procedure Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickYesBtn, "Clicked on The Save Procedure Yes Button");
	    	Thread.sleep(500);
	    	verifyFileUploadSuccess(driver);
	    }
	    
	    public void DeleteSelectedProcedure(String Facility, String Station) throws IOException, InterruptedException, Exception {
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
	    	CommanUtill.clickByJSFunction(ClickProcedure, "Clicked on The Procedure Tab");
	    	selectValidProcedureFromItems();
	    	handleProcedureDropdowns(driver);
	    	CommanUtill.clickFunction(ClickProcedureSaveButton, "Clicked on The Procedure Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickYesBtn, "Clicked on The Save Procedure Yes Button");
	    	Thread.sleep(500);
	    	verifyFileUploadSuccess(driver);
	         Thread.sleep(1000);
	         /*		JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("location.reload(true);");
	        Thread.sleep(500);*/
	        clickFirstAvailableTd5WithHighlight(driver);
	        Thread.sleep(500);
            CommanUtill.clickFunction(ClickDeleteProcedureCheckBox, "Clicked on The Delete Procedure CheckBox");
            Thread.sleep(500);
            CommanUtill.clickFunction(ClickDeleteButton, "Clicked on The Procedure Delete Button");
            Thread.sleep(500);
    		CommanUtill.selectSecondOptionFromDropdown(SelectReasonforDelete);
    		Thread.sleep(500);
    		CommanUtill.textEnter(TextRemarks, CommanUtill.generateRandomName(12));
    		Thread.sleep(500);
    		CommanUtill.clickFunction(ClickOKButton, "Clicked on The OK Delete Button");
    		Thread.sleep(500);
    		verifyFileUploadSuccess(driver);
	    }

	    public void PrintSelectedProcedure(String Facility, String Station) throws IOException, InterruptedException, Exception {
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
	    	CommanUtill.clickByJSFunction(ClickProcedure, "Clicked on The Procedure Tab");
	    	selectValidProcedureFromItems();
	    	handleProcedureDropdowns(driver);
	    	CommanUtill.clickFunction(ClickProcedureSaveButton, "Clicked on The Procedure Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickYesBtn, "Clicked on The Save Procedure Yes Button");
	    	Thread.sleep(500);
	    	verifyFileUploadSuccess(driver);
	         Thread.sleep(1000);
	         /*		JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("location.reload(true);");
	        Thread.sleep(500);*/
	        clickFirstAvailableTd5WithHighlight(driver);
	        Thread.sleep(500);
            CommanUtill.clickFunction(ClickDeleteProcedureCheckBox, "Clicked on The Delete Procedure CheckBox");
            Thread.sleep(500);
            CommanUtill.clickFunction(ClickPrintButton, "Clicked on The Procedure Print Button");
            Thread.sleep(500);
            CommanUtill.clickFunction(ClickRefreshButton, "Clicked on The Refresh Button");
	    }

}
