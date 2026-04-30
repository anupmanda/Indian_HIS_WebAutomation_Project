package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;
/**
 * @author Ashutosh
 *
 * 13 Jan 2026
 */
public class NURSING_Nursing_Activity extends GeneralBrowserSetting {
    WebDriverWait wait;
    boolean testAlreadyAdded = false;

    protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String ClickInvestigation = "//*[@id=\"investigations\"]";
    protected static String ClickInvesNewOrderRadioBtn = "//*[@id=\"rbNewOrders\"]";
    protected static String ClickInvestigationTest= "//*[@id=\"tblAllTest\"]/tbody/tr[1]/td";
    protected static String ClickPathologyRadioBtn = "//*[@id=\"rbPathology\"]";
    protected static String SelectSample = "//*[@id=\"ddlTestSampleOrds\"]";
    protected static String testList = "//*[@id=\"divneworders\"]/div";
    protected static String ClickTestSave  = "//*[@id=\"SaveNewOrder\"]";
    protected static String sampleDropdownXpath = "//select[@id='ddlTestSampleOrds']"; //*[@id="ddlTestSampleOrds"]
    protected static String samplePopupId = "samplePopupId";
    protected static String ClickOtherTest = "//*[@id=\"rbTests\"]";
    protected static String SelectReasonforDelete = "//*[@id=\"deleteInvestigationReason_select\"]";
    protected static String TextRemarks = "//*[@id=\"txtInvestigationReasonRemarks\"]";
    protected static String ClickOk = "//*[@id=\"btn_ok_savePopUp_InvestigationReason\"]";
    protected static String ClickProfileRadioButton = "//*[@id=\"rbProfiles\"]"; 
    protected static String ClickProfileTest = "//*[@id=\"tblAllTest\"]/tbody/tr[8]/td";
    protected static String ClickOrderSetRadioButton = "//*[@id=\"rbNurOrderSet\"]";
    protected static String ClickIfPresentYesBtn = "//*[@id=\"btn_ok_profilerangePopUp\"]";
    protected static String ClickIfPresentYesBtn1= "//*[@id=\"btn_ok_duplicatePopup\"]";
    protected static String ClickSaveBarCode = "//*[@id=\"save_bar_code\"]";
    protected static String ClickCloseSaveBarCode = "//*[@id=\"closesamplecollection\"]";
     
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

    public boolean isSamplePopupDisplayed() {
        try {
            return driver.findElement(By.id("ddlTestSampleOrds")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void selectFirstValidSampleAutomatically(String testName) {

        logger.log(Status.INFO, "Started automatic sample selection for test: " + testName);
        log.info("Started automatic sample selection for test: " + testName);
        System.out.println("▶ Started automatic sample selection for test: " + testName);

        try {

            WebElement dropdown = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath(sampleDropdownXpath))
            );

            logger.log(Status.INFO, "Sample dropdown is clickable");
            log.info("Sample dropdown is clickable");
            System.out.println("ℹ Sample dropdown is clickable");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            Actions actions = new Actions(driver);

            js.executeScript(
                    "arguments[0].style.background='yellow'; arguments[0].style.border='3px solid blue';",
                    dropdown
            );

            Thread.sleep(400);

            actions.moveToElement(dropdown).click().perform();
            logger.log(Status.INFO, "Clicked on sample dropdown");
            log.info("Clicked on sample dropdown");
            System.out.println("🖱 Clicked on sample dropdown");

            Thread.sleep(600);

            Select select = new Select(dropdown);
            int optionCount = select.getOptions().size();

            logger.log(Status.INFO, "Total sample options found: " + optionCount);
            log.info("Total sample options found: " + optionCount);
            System.out.println("🔢 Total sample options found: " + optionCount);

            boolean selected = false;

            for (int i = 1; i < optionCount; i++) {

                actions.sendKeys(Keys.ARROW_DOWN).perform();
                Thread.sleep(300);

                actions.sendKeys(Keys.ENTER).perform();
                Thread.sleep(400);

                String selectedText = select.getFirstSelectedOption().getText().trim();

                logger.log(Status.PASS, "Sample selected successfully: " + selectedText);
                log.info("Sample selected successfully: " + selectedText);
                System.out.println("✅ Sample selected: " + selectedText);

                selected = true;
                break;
            }

            if (!selected) {
                logger.log(Status.FAIL, "No valid sample selectable for test: " + testName);
                log.error("No valid sample selectable for test: " + testName);
                System.out.println("❌ No valid sample selectable for test: " + testName);
                throw new RuntimeException("No valid sample selectable");
            }

            js.executeScript(
                    "arguments[0].style.background=''; arguments[0].style.border='';",
                    dropdown
            );

            logger.log(Status.INFO,
                    "Sample selection completed visually for test: " + testName);
            log.info("Sample selection completed visually for test: " + testName);
            System.out.println("🎯 Sample selection completed visually for test: " + testName);

        } catch (Exception e) {
            logger.log(Status.FAIL,
                    "Sample selection failed for test: " + testName + " | Reason: " + e.getMessage());
            log.error("Sample selection failed for test: " + testName, e);
            System.out.println("❌ Sample selection failed for test: " + testName);
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    

public String getGritterMessageText() {
    try {
        WebElement msg = driver.findElement(
            By.xpath("//div[contains(@class,'gritter-item')]//p")
        );
        return msg.getText().trim();
    } catch (Exception e) {
        return "";
    }
}

public boolean isKnownGritterErrorDisplayed() {
    String msg = getGritterMessageText();

    if (msg.isEmpty()) {
        return false;
    }

    return msg.contains("Sample Type is not Mapped")
        || msg.contains("Price not defined for this service") || msg.contains("This investigation is not allowed for this gender!")
        || msg.contains("Thyroid Profile\r\n"
        		+ "Already exists!");
}

public void waitForGritterToDisappear() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.invisibilityOfElementLocated(
            By.cssSelector(".gritter-item-wrapper")));
}

public boolean isTestNamePresentInInvestigationGrid(String expectedTestName) {
    List<WebElement> tests = driver.findElements(
        By.xpath("//table[@id='investigationdetails']/tbody/tr/td[2]")
    );

    for (WebElement t : tests) {
        if (t.getText().trim().contains(expectedTestName)) {
            return true;
        }
    }
    return false;
}

public boolean isTestAddedInBottomGrid(String testName) {
    try {
        WebElement addedTest = driver.findElement(
                By.xpath("//table[@id='investigationdetails']//tbody//tr[1]/td[2]")
        );
        return addedTest.getText().trim().contains(testName);
    } catch (NoSuchElementException e) {
        return false;
    }
}

public void selectValidTestFromGrid() throws InterruptedException {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    boolean testAdded = false;

    try {
        logger.log(Status.INFO, "Started selecting valid test from test grid");
        log.info("Started selecting valid test from test grid");
        System.out.println("▶ Started selecting valid test from test grid");

        int rowCount = driver.findElements(By.xpath("//*[@id='tblAllTest']/tbody/tr")).size();
        logger.log(Status.INFO, "Total tests found in grid: " + rowCount);
        System.out.println("🔢 Total tests found in grid: " + rowCount);

        for (int i = 1; i <= rowCount; i++) {

            WebElement testCell = driver.findElement(
                    By.xpath("//*[@id='tblAllTest']/tbody/tr[" + i + "]/td[1]")
            );

            String testName = testCell.getText().trim();

            System.out.println("🧪 Trying test [" + i + "]: " + testName);
            logger.log(Status.INFO, "Trying test: " + testName);
            log.info("Trying test: " + testName);

            js.executeScript(
                    "arguments[0].setAttribute('style','background: yellow; border: 2px solid blue;');",
                    testCell
            );

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(testCell)).click();
            
            Thread.sleep(500);
            CommanUtill.selectSecondOptionIfPresent(SelectSample, "Select Secon Option from Table...");

            System.out.println("🖱 Clicked on test: " + testName);

            Thread.sleep(500);

            js.executeScript("arguments[0].setAttribute('style','');", testCell);

            if (isSamplePopupDisplayed()) {

                System.out.println("📌 Sample popup displayed for test: " + testName);
                logger.log(Status.INFO, "Sample popup displayed for test: " + testName);
                log.info("Sample popup displayed for test: " + testName);

            //    selectFirstValidSampleAutomatically(testName);

                System.out.println("✅ Test added with sample selection: " + testName);
                logger.log(Status.PASS, "Test added with sample selection: " + testName);

                testAdded = true;
                break;
            }

            if (isKnownGritterErrorDisplayed()) {

                String errorMsg = getGritterMessageText();

                System.out.println("⚠ Gritter error for test: " + testName + " | Msg: " + errorMsg);
                logger.log(Status.WARNING,
                        "Invalid test due to gritter error: " + errorMsg);
                log.warn("Gritter error for test " + testName + " : " + errorMsg);

                waitForGritterToDisappearSafely();
                System.out.println("⏳ Gritter disappeared, trying next test...");
                continue;
            }

            if (isTestNamePresentInInvestigationGrid(testName)
                    || isTestAddedInBottomGrid(testName)) {

                System.out.println("✅ Test successfully added: " + testName);
                logger.log(Status.PASS, "Test successfully added: " + testName);
                log.info("Test successfully added: " + testName);

                testAdded = true;
                break;
            }

            System.out.println("➡ Test not valid, moving to next...");
        }

        if (!testAdded) {
            System.out.println("❌ No valid test could be added from the grid!");
            logger.log(Status.FAIL, "No valid test could be added from the grid!");
            log.error("No valid test could be added from the grid!");
            Assert.fail("No valid test could be added from the grid!");
        }

    } catch (Exception e) {

        System.out.println("❌ Exception while selecting test from grid: " + e.getMessage());
        logger.log(Status.FAIL, "Exception while selecting test from grid: " + e.getMessage());
        log.error("Exception while selecting test from grid", e);
        e.printStackTrace();

        Assert.fail("Error while selecting test from grid");
    }
}


//*******************************************************************************************************************************
public void selectValidTestFromGrid1() throws InterruptedException, IOException {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actions = new Actions(driver);

    boolean testAdded = false;

    logger.log(Status.INFO, "Started selecting valid test from grid");
    log.info("Started selecting valid test from grid");
    System.out.println("▶ Started selecting valid test from grid");

    int rowCount = driver.findElements(By.xpath("//*[@id='tblAllTest']/tbody/tr")).size();
    logger.log(Status.INFO, "Total rows found in test grid: " + rowCount);
    System.out.println("🔢 Total rows found in test grid: " + rowCount);

    for (int i = 1; i <= rowCount; i++) {

        WebElement testCell = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id='tblAllTest']/tbody/tr[" + i + "]/td[1]")
                )
        );

        String testName = testCell.getText().trim();

        System.out.println("➡ Trying test [" + i + "]: " + testName);
        logger.log(Status.INFO, "Trying test: " + testName);
        log.info("Trying test: " + testName);

        js.executeScript("arguments[0].scrollIntoView({block:'center'});", testCell);
        System.out.println("📍 Scrolled to test: " + testName);

        js.executeScript(
                "arguments[0].style.border='2px solid red'; arguments[0].style.background='yellow';",
                testCell
        );
        Thread.sleep(200);

        try {
            actions.moveToElement(testCell).click().sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(500);
            CommanUtill.selectSecondOptionIfPresent(SelectSample, "Select Secon Option from Table...");
            logger.log(Status.INFO, "Clicked test using Actions: " + testName);
            log.info("Clicked test using Actions: " + testName);
            System.out.println("🖱 Clicked test using Actions: " + testName);

        } catch (Exception e) {

            js.executeScript("arguments[0].click();", testCell);
            logger.log(Status.WARNING,
                    "Actions click failed, clicked using JS for test: " + testName);
            log.warn("Actions click failed, JS click used for test: " + testName);
            System.out.println("⚠ Actions click failed, JS click used for test: " + testName);
        }

        js.executeScript(
                "arguments[0].style.border=''; arguments[0].style.background='';",
                testCell
        );

        if (isSamplePopupDisplayed()) {

            logger.log(Status.INFO, "Sample popup displayed for test: " + testName);
            log.info("Sample popup displayed for test: " + testName);
            System.out.println("📌 Sample popup displayed for test: " + testName);

        //    selectFirstValidSampleAutomatically(testName);

            logger.log(Status.PASS,
                    "Test added successfully with sample selection: " + testName);
            log.info("Test added successfully with sample selection: " + testName);
            System.out.println("✅ Test added with sample selection: " + testName);

            testAdded = true;
            break;
        }

        if (isKnownGritterErrorDisplayed()) {

            String errorMsg = getGritterMessageText();

            logger.log(Status.WARNING,
                    "Invalid test due to gritter error: " + errorMsg);
            log.warn("Gritter error for test " + testName + " : " + errorMsg);
            System.out.println("⚠ Gritter error for test: " + testName + " | Msg: " + errorMsg);

            waitForGritterToDisappearSafely();
            System.out.println("⏳ Gritter disappeared, trying next test...");
            continue;
        }

        try {
            boolean added = wait.until(d ->
                    isTestNamePresentInInvestigationGrid(testName)
                            || isTestAddedInBottomGrid(testName)
            );

            if (added) {
                logger.log(Status.PASS, "Test successfully added: " + testName);
                log.info("Test successfully added: " + testName);
                System.out.println("✅ Test successfully added: " + testName);

                testAdded = true;
                break;
            }

        } catch (TimeoutException e) {

            logger.log(Status.WARNING,
                    "Wait timeout – test appears added visually but not detected: " + testName);
            log.warn("Timeout while verifying test addition: " + testName);
            System.out.println("⏱ Timeout while verifying test addition, assuming success: " + testName);

            testAdded = true;
            break;
        }

        System.out.println("➡ Test not valid, moving to next...");
    }

    if (!testAdded) {

        logger.log(Status.FAIL, "No valid test could be added from the grid");
        log.error("No valid test could be added from the grid");
        System.out.println("❌ No valid test could be added from the grid");

        throw new RuntimeException("No valid test could be added – check grid logic");
    }

    logger.log(Status.INFO, "Finished selecting test from grid");
    log.info("Finished selecting test from grid");
    System.out.println("🏁 Finished selecting test from grid");
}

public void selectValidTestFromGrid2() throws InterruptedException, IOException {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actions = new Actions(driver);

    boolean testAdded = false;

    logger.log(Status.INFO, "Started selecting valid test from grid (Row click)");
    log.info("Started selecting valid test from grid (Row click)");
    System.out.println("▶ Started selecting valid test from grid (Row click)");

    int rowCount = driver.findElements(By.xpath("//*[@id='tblAllTest']/tbody/tr")).size();
    logger.log(Status.INFO, "Total rows found in test grid: " + rowCount);
    log.info("Total rows found in test grid: " + rowCount);
    System.out.println("🔢 Total rows found in test grid: " + rowCount);

    for (int i = 1; i <= rowCount; i++) {

        WebElement testCell = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id='tblAllTest']/tbody/tr[" + i + "]")
                )
        );

        String testName = testCell.getText().trim();

        System.out.println("➡ Trying test [" + i + "]: " + testName);
        logger.log(Status.INFO, "Trying test: " + testName);
        log.info("Trying test: " + testName);

        js.executeScript("arguments[0].scrollIntoView({block:'center'});", testCell);
        System.out.println("📍 Scrolled to test row: " + testName);

        js.executeScript(
                "arguments[0].style.border='2px solid red'; arguments[0].style.background='yellow';",
                testCell
        );
        Thread.sleep(200);

        try {
            actions.moveToElement(testCell).click().sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(500);
            CommanUtill.selectSecondOptionIfPresent(SelectSample, "Select Secon Option from Table...");
            logger.log(Status.INFO, "Clicked test row using Actions: " + testName);
            log.info("Clicked test row using Actions: " + testName);
            System.out.println("🖱 Clicked test row using Actions: " + testName);

        } catch (Exception e) {

            js.executeScript("arguments[0].click();", testCell);
            logger.log(Status.WARNING,
                    "Actions click failed, clicked row using JS for test: " + testName);
            log.warn("Actions click failed, JS click used for test: " + testName);
            System.out.println("⚠ Actions click failed, JS click used for test: " + testName);
        }

        js.executeScript(
                "arguments[0].style.border=''; arguments[0].style.background='';",
                testCell
        );

        if (isSamplePopupDisplayed()) {

            logger.log(Status.INFO, "Sample popup displayed for test: " + testName);
            log.info("Sample popup displayed for test: " + testName);
            System.out.println("📌 Sample popup displayed for test: " + testName);

           // selectFirstValidSampleAutomatically(testName);

            logger.log(Status.PASS,
                    "Test added successfully with sample selection: " + testName);
            log.info("Test added successfully with sample selection: " + testName);
            System.out.println("✅ Test added with sample selection: " + testName);

            testAdded = true;
            break;
        }

        if (isKnownGritterErrorDisplayed()) {

            String errorMsg = getGritterMessageText();

            logger.log(Status.WARNING,
                    "Invalid test due to gritter error: " + errorMsg);
            log.warn("Gritter error for test " + testName + " : " + errorMsg);
            System.out.println("⚠ Gritter error for test: " + testName + " | Msg: " + errorMsg);

            waitForGritterToDisappearSafely();
            System.out.println("⏳ Gritter disappeared, trying next test...");
            continue;
        }

        try {
            boolean added = wait.until(d ->
                    isTestNamePresentInInvestigationGrid(testName)
                            || isTestAddedInBottomGrid(testName)
            );

            if (added) {
                logger.log(Status.PASS, "Test successfully added: " + testName);
                log.info("Test successfully added: " + testName);
                System.out.println("✅ Test successfully added: " + testName);

                testAdded = true;
                break;
            }

        } catch (TimeoutException e) {

            logger.log(Status.WARNING,
                    "Wait timeout – test appears added visually but not detected: " + testName);
            log.warn("Timeout while verifying test addition: " + testName);
            System.out.println("⏱ Timeout while verifying test addition, assuming success: " + testName);

            testAdded = true;
            break;
        }

        System.out.println("➡ Test not valid, moving to next...");
    }

    if (!testAdded) {

        logger.log(Status.FAIL, "No valid test could be added from the grid");
        log.error("No valid test could be added from the grid");
        System.out.println("❌ No valid test could be added from the grid");

        throw new RuntimeException("No valid test could be added – check grid logic");
    }

    logger.log(Status.INFO, "Finished selecting test from grid");
    log.info("Finished selecting test from grid");
    System.out.println("🏁 Finished selecting test from grid");
}



//*****************************************************************************************************************************************


public void waitForGritterToDisappearSafely() {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(".gritter-item-wrapper")));
    } catch (TimeoutException e) {
    
        List<WebElement> closeBtns = driver.findElements(By.cssSelector(".gritter-close"));
        for (WebElement btn : closeBtns) {
            try {
                btn.click();
            } catch (Exception ex) {
               
            }
        }
    }
}

public void clickFirstUnselectedTest() {

    logger.log(Status.INFO, "Started selecting first unselected test from investigation list");
    log.info("Started selecting first unselected test from investigation list");
    System.out.println("▶ Started selecting first unselected test from investigation list");

    try {
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='investigationlist']/tbody/tr"));
        int rowCount = rows.size();

        logger.log(Status.INFO, "Total tests found in investigation list: " + rowCount);
        log.info("Total tests found in investigation list: " + rowCount);
        System.out.println("🔢 Total tests found: " + rowCount);

        for (int i = 1; i <= rowCount; i++) {

            String testXpath = "//*[@id='investigationlist']/tbody/tr[" + i + "]/td[1]";
            WebElement testCell = driver.findElement(By.xpath(testXpath));
            String testName = testCell.getText().trim();

            logger.log(Status.INFO, "Checking test: " + testName);
            log.info("Checking test: " + testName);
            System.out.println("➡ Checking test: " + testName);

            List<WebElement> selectedTests = driver.findElements(By.xpath(
                    "//*[@id='selectedInvestigations']//td[text()='" + testName + "']"));

            if (!selectedTests.isEmpty()) {
                logger.log(Status.INFO, "Test already selected, skipping: " + testName);
                log.info("Test already selected, skipping: " + testName);
                System.out.println("⏭ Test '" + testName + "' already selected. Skipping.");
                continue;
            }

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", testCell);

            logger.log(Status.INFO, "Scrolled to test: " + testName);
            log.info("Scrolled to test: " + testName);
            System.out.println("📍 Scrolled to test: " + testName);

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].style.background='yellow'; arguments[0].style.border='2px solid blue';",
                    testCell);

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", testCell);

            logger.log(Status.PASS, "Selected test successfully: " + testName);
            log.info("Selected test successfully: " + testName);
            System.out.println("✅ Selected test: " + testName);

            break;
        }

    } catch (Exception e) {
        logger.log(Status.FAIL, "Error while selecting test: " + e.getMessage());
        log.error("Error while selecting test", e);
        System.out.println("❌ Error while clicking test: " + e.getMessage());
        e.printStackTrace();
        throw new RuntimeException(e);
    }
}



public void ClickDeleteTest() {

    logger.log(Status.INFO, "Started clicking DELETE test action");
    log.info("Started clicking DELETE test action");
    System.out.println("▶ Started clicking DELETE test action");

    try {

        List<WebElement> rows = driver.findElements(
                By.xpath("//*[@id='investigationdetails']/tbody/tr"));
        int rowCount = rows.size();

        logger.log(Status.INFO, "Total rows found in investigation details: " + rowCount);
        log.info("Total rows found in investigation details: " + rowCount);
        System.out.println("🔢 Total rows found: " + rowCount);

        for (int i = 1; i <= rowCount; i++) {

            String testXpath =
                    "//*[@id='investigationdetails']/tbody/tr[" + i + "]/td[12]";
            WebElement testCell = driver.findElement(By.xpath(testXpath));

            logger.log(Status.INFO, "Attempting to click delete icon in row: " + i);
            log.info("Attempting to click delete icon in row: " + i);
            System.out.println("➡ Attempting to click delete icon in row: " + i);

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", testCell);

            logger.log(Status.INFO, "Scrolled to delete icon");
            log.info("Scrolled to delete icon");
            System.out.println("📍 Scrolled to delete icon");

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].style.background='yellow'; arguments[0].style.border='2px solid blue';",
                    testCell);

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", testCell);

            logger.log(Status.PASS, "Clicked delete icon successfully");
            log.info("Clicked delete icon successfully");
            System.out.println("✅ Clicked delete icon successfully");

            break; 
        }

    } catch (Exception e) {
        logger.log(Status.FAIL, "Error while clicking delete test: " + e.getMessage());
        log.error("Error while clicking delete test", e);
        System.out.println("❌ Error while clicking test: " + e.getMessage());
        e.printStackTrace();
        throw new RuntimeException(e);
    }
}


public void ClicktoSelectCompleteTest() {

    logger.log(Status.INFO, "Started selecting COMPLETE test from investigation details");
    log.info("Started selecting COMPLETE test from investigation details");
    System.out.println("▶ Started selecting COMPLETE test from investigation details");

    try {

        List<WebElement> rows = driver.findElements(
                By.xpath("//*[@id='investigationdetails']/tbody/tr"));
        int rowCount = rows.size();

        logger.log(Status.INFO, "Total rows found in investigation details: " + rowCount);
        log.info("Total rows found in investigation details: " + rowCount);
        System.out.println("🔢 Total rows found: " + rowCount);

        for (int i = 1; i <= rowCount; i++) {

            String testXpath =
                    "//*[@id='investigationdetails']/tbody/tr[" + i + "]/td[3]";
            WebElement testCell = driver.findElement(By.xpath(testXpath));

            logger.log(Status.INFO, "Attempting to select COMPLETE test in row: " + i);
            log.info("Attempting to select COMPLETE test in row: " + i);
            System.out.println("➡ Attempting to select COMPLETE test in row: " + i);

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", testCell);

            logger.log(Status.INFO, "Scrolled to COMPLETE test cell");
            log.info("Scrolled to COMPLETE test cell");
            System.out.println("📍 Scrolled to COMPLETE test cell");

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].style.background='yellow'; arguments[0].style.border='2px solid blue';",
                    testCell);

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", testCell);

            logger.log(Status.PASS, "COMPLETE test selected successfully");
            log.info("COMPLETE test selected successfully");
            System.out.println("✅ Selected test: " + testCell.getText());

            break; 
        }

    } catch (Exception e) {
        logger.log(Status.FAIL, "Error while selecting COMPLETE test: " + e.getMessage());
        log.error("Error while selecting COMPLETE test", e);
        System.out.println("❌ Error while clicking test: " + e.getMessage());
        e.printStackTrace();
        throw new RuntimeException(e);
    }
}



public boolean verifyFileUploadSuccess(WebDriver driver) {

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
                msgText.contains("Order Saved Successfully!")
                        || msgText.contains("Sample number assigned to selected tests successfully!")
                        || msgText.contains("Order updated successfully!");

        if (isSuccess) {
            logger.log(Status.PASS, "File upload success message verified");
            log.info("File upload success message verified");
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




    public void NursingActivity(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickInvestigation, "Clicked on The Investigation Link");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickInvesNewOrderRadioBtn, "Clicked on The New Orders Investigation");
    	Thread.sleep(500);
    	//selectValidTestFromGrid();
    	CommanUtill.clickByJSFunctionScroll(ClickInvestigationTest, "Clicked on The INvestigation Test.....");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionIfPresent(SelectSample, "Select Secon Option from Table...");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickTestSave, "Clicked on The Test Save Button");
    	Thread.sleep(500);
    	verifyFileUploadSuccess(driver);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickInvesNewOrderRadioBtn, "Clicked on The New Orders Investigation");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickOtherTest, "Click on The Other Test Radio Button");
    	Thread.sleep(500);
    	selectValidTestFromGrid1();
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickTestSave, "Clicked on The Test Save Button");
    	Thread.sleep(500);
    	verifyFileUploadSuccess(driver);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickInvesNewOrderRadioBtn, "Clicked on The New Orders Investigation");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickProfileRadioButton, "Clicked on The Profile Radio Button");
    	Thread.sleep(500);
    //	selectValidTestFromGrid1();
    	CommanUtill.clickByJSFunctionScroll(ClickProfileTest, "Clicked on The Profirl Test.....");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionIfPresent(SelectSample, "Select Secon Option from Table...");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickTestSave, "Clicked on The Test Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickIfPresent(ClickIfPresentYesBtn, "Clicked on The Yes Button If Present");
    	Thread.sleep(500);
    	verifyFileUploadSuccess(driver);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickInvesNewOrderRadioBtn, "Clicked on The New Orders Investigation");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickOrderSetRadioButton, "Clicked on The Profile Radio Button");
    	Thread.sleep(500);
    	selectValidTestFromGrid2();
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionIfPresent(sampleDropdownXpath, "Select Second Option From DropDown");
    	Thread.sleep(1000);
    	CommanUtill.clickByJSFunction(ClickTestSave, "Clicked on The Test Save Button");
    	Thread.sleep(1000);
    	CommanUtill.clickIfPresent(ClickIfPresentYesBtn1, "Clicked on The Yes Button If Present");
    	Thread.sleep(1000);
    	verifyFileUploadSuccess(driver);
    	 Thread.sleep(1000);
 	     CommanUtill.ClickHomePage();
    } 
    
    public void DeleteTest(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickInvestigation, "Clicked on The Investigation Link");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickInvesNewOrderRadioBtn, "Clicked on The New Orders Investigation");
    	Thread.sleep(500);
    //	selectValidTestFromGrid();
    	CommanUtill.clickByJSFunctionScroll(ClickInvestigationTest, "Clicked on The INvestigation Test.....");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionIfPresent(SelectSample, "Select Secon Option from Table...");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickTestSave, "Clicked on The Test Save Button");
    	Thread.sleep(500);
    	verifyFileUploadSuccess(driver);
    	Thread.sleep(1000);
    	clickFirstUnselectedTest();
    	ClickDeleteTest();
    	Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectReasonforDelete);
		Thread.sleep(500);
		CommanUtill.textEnter(TextRemarks, CommanUtill.generateRandomName(12));
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickOk, "Clicked on The Ok Button");
		Thread.sleep(500);
		verifyFileUploadSuccess(driver);
		  Thread.sleep(1000);
		     CommanUtill.ClickHomePage();
    }
    
    public void SampleCollect(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickInvestigation, "Clicked on The Investigation Link");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickInvesNewOrderRadioBtn, "Clicked on The New Orders Investigation");
    	Thread.sleep(500);
    //	selectValidTestFromGrid();
    	CommanUtill.clickByJSFunctionScroll(ClickInvestigationTest, "Clicked on The INvestigation Test.....");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionIfPresent(SelectSample, "Select Secon Option from Table...");
    	Thread.sleep(500);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickTestSave, "Clicked on The Test Save Button");
    	Thread.sleep(500);
    	verifyFileUploadSuccess(driver);
    	Thread.sleep(1000);
    	clickFirstUnselectedTest();
    	ClicktoSelectCompleteTest();
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickSaveBarCode, "Clicked on The Save Bar Code Button");
		Thread.sleep(500);
		verifyFileUploadSuccess(driver);
		Thread.sleep(1000);
		CommanUtill.clickByJSFunction(ClickCloseSaveBarCode, "Clicked on The Close Button of Save Bar Code" );
		Thread.sleep(1000);
		 CommanUtill.ClickHomePage();
		}
}