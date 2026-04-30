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
 * 21 Jan 2026
 */
public class NURSING_Nursing_Drug extends GeneralBrowserSetting {

	 WebDriverWait wait;
	 public static String selectedDrugName = "";

	    protected static String SelectFacility = "//*[@id='Facility']";
	    protected static String SelectStation = "//*[@id='Department']";
	    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
	    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
	    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
	    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
	    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
	    protected static String ClickNursingDrugOrder = "//*[@id=\"NursingDrugOrder\"]";
	    protected static String ClickNewOrderRadioBtn = "//*[@id=\"rdoDrugOrdNew\"]";
	    protected static String ClickDrug1 = "//*[@id=\"16544\"]/td";
	    protected static String SelectRoute = "//*[@id=\"routeofadmin13650\"]";
	    protected static String SelectRoute1  = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[4]/select";
	    protected static String SelectFrequency = "//*[@id=\"OrdFreq13650\"]";
	    protected static String TextQuantity = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[8]/input" ;
	    protected static String SelectFrequency1 = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[5]/button";
	    protected static String SelectFrequency2 = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[5]/select";
	    protected static String SelectFrequency3 = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[5]";
	    protected static String TextInput1 = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[8]/input";
	    protected static String SelectDuration  = "//*[@id=\"durationid13650\"]";
	    protected static String SelectDuration1  = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[6]/input";
	    protected static String TextRemarks = "//*[@id=\"remarks13650\"]";
	    protected static String TextRemarks1 = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[12]/input";
	    protected static String ClickSaveDrugOrder = "//*[@id=\"SaveDrugOrder\"]";
	    protected static String ClickPendingRadioButton = "//*[@id=\"rdoDrugOrdPending\"]";
        protected static String ClickDrugForDelete = "//*[@id=\"rowid0\"]/td[2]"; 
        protected static String ClickDeleteyesButton = "//*[@id=\"CancelDrugOrderbtnyes\"]";
        protected static String ClickIssuedRadionBtn = "//*[@id= \"rdoDrugOrdIssued\"]";
        protected static String ClickPrint = "//*[@id= \"PrintDrugOrder\"]";
        protected static String ClickFinalPrint = "//*[@id=\"printreportDrugOrder\"]";
        protected static String TextDate = "//*[@id=\"txtFromDateReport\"]";
        protected static String ClickPrintClose = "//*[@id=\"closePrint\"]";
        protected static String CLickBFOCheckBox = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr/td[24]/input";
	    protected static String TextMedicineName = "//*[@id=\"searchDrug\"]";
	    protected static String ClickMedicine = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[2]/div/table/tbody/tr[1]/td";
	    protected static String ClickifPresent = "//*[@id=\"DrugOrderbtnyes\"]";
	    protected static String ClickifPresent1 = "//*[@id=\"Allergybtnyes\"]";
	    protected static String ClickDrug = "//*[@id=\"drugorder\"]/div[2]/div";
	    
	    By addedDrugNames = By.xpath(
	    	    "//table[@id='tbldrugOnDetailList']//tbody//tr/td[1]"
	    	);

	    String drugNameXpath = ".//span | .//div"; 
	    By availableDrugRows = By.xpath("//div[contains(@class,'nursing-drugorder-table')]//div[normalize-space()!='']");
	    By drugTable = By.xpath("//div[contains(@class,'nursing-drugorder-table')]");
	    By drugRows  = By.xpath("//div[contains(@class,'nursing-drugorder-table')]//div[contains(@class,'row')]");
	    By drugSearchBox = By.xpath("//input[contains(@placeholder,'Drug')]");
	    By drugContainer = By.id("drugorder");
	    By drugItems = By.xpath("//*[@id='drugorder']//div[normalize-space()!='']");

	    
	    	


	    
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
	    
	    public boolean isDrugAddedInTable(String expectedDrugName) {

	        List<WebElement> addedNames = driver.findElements(addedDrugNames);

	        for (WebElement nameCell : addedNames) {
	            String tableDrugName = nameCell.getText().trim();
	            if (tableDrugName.equalsIgnoreCase(expectedDrugName)) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public void selectFirstValidDrug() {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        boolean drugAdded = false;

	        try {
	            logger.log(Status.INFO, "Started selecting valid drug from Drug Orders table");
	            log.info("Started selecting valid drug from Drug Orders table");
	            System.out.println("▶ Started selecting valid drug from Drug Orders table");

	            By drugRows = By.xpath("//table[@id='tbldrugOrd']//tbody//tr[contains(@class,'context-menu-nurdrugorder')]");
	            wait.until(ExpectedConditions.visibilityOfElementLocated(drugRows));

	            List<WebElement> drugs = driver.findElements(drugRows);

	            logger.log(Status.INFO, "Total drugs found: " + drugs.size());
	            log.info("Total drugs found: " + drugs.size());
	            System.out.println("🔢 Total drugs found: " + drugs.size());

	            for (WebElement drug : drugs) {

	                String drugName = drug.getText().trim();
	                if (drugName.isEmpty()) {
	                    log.warn("Skipping empty drug row");
	                    System.out.println("⚠ Skipping empty drug row");
	                    continue;
	                }

	                logger.log(Status.INFO, "Trying drug: " + drugName);
	                log.info("Trying drug: " + drugName);
	                System.out.println("💊 Trying drug: " + drugName);

	                js.executeScript("arguments[0].scrollIntoView({block:'center'});", drug);
	                js.executeScript(
	                        "arguments[0].style.background='yellow'; arguments[0].style.border='2px solid blue';",
	                        drug
	                );

	                try {
	                    drug.click();
	                } catch (Exception e) {
	                    js.executeScript("arguments[0].click();", drug);
	                }

	                Thread.sleep(500);

	                js.executeScript(
	                        "arguments[0].style.background=''; arguments[0].style.border='';",
	                        drug
	                );

	                try {
	                    wait.until(d -> {

	                        if (isKnownGritterErrorDisplayed()) {

	                            logger.log(Status.WARNING, "Gritter error found, trying next drug");
	                            log.warn("Gritter error found, trying next drug");
	                            System.out.println("⚠ Gritter error found, trying next drug...");

	                            waitForGritterToDisappear();
	                            return false;
	                        }

	                        WebElement addedDrug = driver.findElement(
	                                By.xpath("//tr[@id='rowid13650']/td[2]")
	                        );

	                        String addedDrugName = addedDrug.getText().trim();

	                        logger.log(Status.INFO, "Verifying added drug: " + addedDrugName);
	                        log.info("Verifying added drug: " + addedDrugName);
	                        System.out.println("🔍 Verifying added drug: " + addedDrugName);

	                        return addedDrugName.contains(drugName);
	                    });

	                    selectedDrugName = drugName;

	                    logger.log(Status.PASS, "Correct drug added: " + drugName);
	                    log.info("Correct drug added: " + drugName);
	                    System.out.println("✅ Correct drug added: " + drugName);

	                    drugAdded = true;
	                    break;

	                } catch (Exception e) {

	                    logger.log(Status.WARNING,
	                            "Drug not added yet or mismatch, trying next one: " + drugName);
	                    log.warn("Drug not added yet or mismatch, trying next one: " + drugName);
	                    System.out.println("❌ Drug not added yet or mismatch: " + drugName + ", trying next one...");
	                }
	            }

	            if (!drugAdded) {
	                logger.log(Status.FAIL, "No valid drug could be added from table");
	                log.error("No valid drug could be added from table");
	                System.out.println("❌ No valid drug could be added from table");
	                Assert.fail("❌ No valid drug could be added from table");
	            }

	        } catch (Exception e) {

	            logger.log(Status.FAIL, "Error while selecting drug: " + e.getMessage());
	            log.error("Error while selecting drug", e);
	            System.out.println("❌ Error while selecting drug: " + e.getMessage());

	            e.printStackTrace();
	            Assert.fail("❌ Error while selecting drug");
	        }
	    }

	    public boolean verifyPopUpSuccess(WebDriver driver) {

	        logger.log(Status.INFO, "Started verification of  success message");
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
	                    msgText.contains("Drug Order Updated Successfully");
	                         
	            if (isSuccess) {
	                logger.log(Status.PASS, "Drug Order Updated Successfully message verified");
	                log.info("Drug Order Updated Successfully Message verified");
	                System.out.println("✅ Drug Order Updated Successfully");
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
	    public void clickDrugAndValidateFromDetailTable() throws Exception {

	        logger.log(Status.INFO, "Started clicking drug orders and validating drug name");
	        log.info("Started clicking drug orders and validating drug name");
	        System.out.println("▶ Started clicking drug orders and validating drug name");

	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        try {

	            wait.until(ExpectedConditions.presenceOfElementLocated(
	                    By.xpath("//table[@id='tbldrugOrd']/tbody/tr")));

	            List<WebElement> drugRows = driver.findElements(
	                    By.xpath("//table[@id='tbldrugOrd']/tbody/tr"));

	            logger.log(Status.INFO, "Total Drug Orders found: " + drugRows.size());
	            log.info("Total Drug Orders found: " + drugRows.size());

	            if (drugRows.isEmpty()) {
	                throw new RuntimeException("No drug orders found");
	            }

	            JavascriptExecutor js = (JavascriptExecutor) driver;

	            for (int i = 0; i < drugRows.size(); i++) {

	                drugRows = driver.findElements(
	                        By.xpath("//table[@id='tbldrugOrd']/tbody/tr"));

	                WebElement drugRow = drugRows.get(i);

	                js.executeScript(
	                        "arguments[0].scrollIntoView({block:'center'});", drugRow);

	                js.executeScript(
	                        "var el = arguments[0];" +
	                        "var originalStyle = el.getAttribute('style');" +
	                        "el.setAttribute('data-original-style', originalStyle);" +
	                        "el.style.background='yellow';" +
	                        "el.style.border='2px solid blue';" +
	                        "setTimeout(function() {" +
	                        "  el.setAttribute('style', el.getAttribute('data-original-style'));" +
	                        "}, 500);",
	                        drugRow
	                );

	                Thread.sleep(200);

	                js.executeScript("arguments[0].click();", drugRow);

	                logger.log(Status.INFO, "Clicked Drug Order row index: " + i);
	                log.info("Clicked Drug Order row index: " + i);

	                WebElement drugNameElement = wait.until(
	                        ExpectedConditions.visibilityOfElementLocated(
	                                By.xpath("//table[@id='tbldrugOrdDetailList']//tr[1]/td[@ctype='name']")
	                        )
	                );

	                String actualDrugName = drugNameElement.getText().trim();

	                logger.log(Status.INFO, "Captured Drug Name: " + actualDrugName);
	                log.info("Captured Drug Name: " + actualDrugName);
	                System.out.println("Captured Drug Name: " + actualDrugName);

	                if (!actualDrugName.isEmpty()) {
	                    logger.log(Status.PASS, "Drug name displayed successfully: " + actualDrugName);
	                    log.info("Drug name displayed successfully: " + actualDrugName);
	                    System.out.println("✅ Drug name displayed successfully");
	                    break;
	                }

	                logger.log(Status.WARNING, "Drug name empty, moving to next drug");
	                log.warn("Drug name empty, moving to next drug");
	            }

	        } catch (Exception e) {

	            logger.log(Status.FAIL, "Failed while clicking drug orders: " + e.getMessage());
	            log.error("Failed while clicking drug orders", e);
	            System.out.println("❌ Failed while clicking drug orders: " + e.getMessage());
	            throw e;
	        }
	    }

	    public boolean clickFirstClickableCell() {

	        logger.log(Status.INFO, "Started clicking first clickable cell from table");
	        log.info("Started clicking first clickable cell from table");
	        System.out.println("▶ Started clicking first clickable cell from table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        int maxRows = 10;

	        for (int i = 1; i <= maxRows; i++) {

	            try {
	                String xpath = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/table/tbody/tr["
	                        + i + "]/td[2]";

	                WebElement cell = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(xpath))
	                );

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid blue;');",
	                        cell
	                );

	                Thread.sleep(500);

	                js.executeScript(
	                        "arguments[0].setAttribute('style','');",
	                        cell
	                );

	                cell.click();

	                logger.log(Status.PASS, "Clicked successfully on table row: " + i);
	                log.info("Clicked successfully on table row: " + i);
	                System.out.println("✅ Click successful on row: " + i);

	                return true;

	            } catch (Exception e) {

	                logger.log(Status.WARNING, "Unable to click row: " + i + ", trying next row");
	                log.warn("Unable to click row: " + i, e);
	                System.out.println("❌ Unable to click row: " + i + " → Trying next row");
	            }
	        }

	        logger.log(Status.FAIL, "No clickable cell found in first " + maxRows + " rows");
	        log.error("No clickable cell found in first " + maxRows + " rows");
	        System.out.println("❌ No clickable cell found");

	        return false;
	    }

	    public boolean clickFirstClickableCellIssued() {

	        logger.log(Status.INFO, "Started clicking first clickable cell from table");
	        log.info("Started clicking first clickable cell from table");
	        System.out.println("▶ Started clicking first clickable cell from table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        int maxRows = 10;

	        for (int i = 1; i <= maxRows; i++) {

	            try {
	                String xpath = "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[3]/div[1]/div[2]/div/table/tbody/tr["
	                        + i + "]";

	                WebElement cell = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(xpath))
	                );

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid blue;');",
	                        cell
	                );

	                Thread.sleep(500);

	                js.executeScript(
	                        "arguments[0].setAttribute('style','');",
	                        cell
	                );

	                cell.click();

	                logger.log(Status.PASS, "Clicked successfully on table row: " + i);
	                log.info("Clicked successfully on table row: " + i);
	                System.out.println("✅ Click successful on row: " + i);

	                return true;

	            } catch (Exception e) {

	                logger.log(Status.WARNING, "Unable to click row: " + i + ", trying next row");
	                log.info("Unable to click row: " + i, e);
	                System.out.println("❌ Unable to click row: " + i + " → Trying next row");
	            }
	        }

	        logger.log(Status.FAIL, "No clickable cell found in first " + maxRows + " rows");
	        log.error("No clickable cell found in first " + maxRows + " rows");
	        System.out.println("❌ No clickable cell found");

	        return false;
	    }

	  
	    public void DrugNewOrder(String Facility, String Station) throws IOException, InterruptedException {
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
	    	CommanUtill.clickByJSFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNewOrderRadioBtn, "Clicked on The Drugs New Order Radio Button" );
	    	Thread.sleep(500);
	    //	selectFirstValidDrug();
	    	CommanUtill.clickByJSFunctionScroll(ClickDrug1, "Clicked on The Drug Medicine");
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectRoute1);
	    	Thread.sleep(500);
	    	CommanUtill.selectThirdOptionWithHighlight(SelectFrequency1);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextQuantity, CommanUtill.generateRandomMobileNumber1(2));
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextRemarks, CommanUtill.generateRandomName(10));
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDrugOrder, "Clicked on The Drug Order Save Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    	
	    }


	    public void DrugPending(String Facility, String Station) throws Exception {
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
	    	CommanUtill.clickFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPendingRadioButton, "Clicked on The Pending Radio Button" );
	    	Thread.sleep(500);	
	    	clickDrugAndValidateFromDetailTable();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDrugOrder, "Clicked on The Drug Order Save Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    }
	    
	    public void DrugDelete(String Facility, String Station) throws Exception {
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
	    	CommanUtill.clickFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPendingRadioButton, "Clicked on The Pending Radio Button" );
	    	Thread.sleep(500);	
	    	clickDrugAndValidateFromDetailTable();
	    	Thread.sleep(500);
	    	clickFirstClickableCell();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickDeleteyesButton, "Clicked on The Delete Yes Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    }
	    
	    public void NewOrderPending(String Facility, String Station, String Drug) throws Exception {
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
	    	CommanUtill.clickFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNewOrderRadioBtn, "Clicked on The Drugs New Order Radio Button" );
	    	Thread.sleep(500);
	    //	selectFirstValidDrug();
	    	CommanUtill.clickFunction(ClickDrug, Drug);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectRoute1);
	    	Thread.sleep(500);
	    	CommanUtill.selectFirstOptionFromDropdown(SelectFrequency1);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextRemarks1, CommanUtill.generateRandomName(10));
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDrugOrder, "Clicked on The Drug Order Save Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    	Thread.sleep(1000);
	    	CommanUtill.clickFunction(ClickPendingRadioButton, "Clicked on The Pending Radio Button" );
	    	Thread.sleep(1000);	
	    	clickDrugAndValidateFromDetailTable();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDrugOrder, "Clicked on The Drug Order Save Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    	
	    }
	    
	    public void NewOrderMAR(String Facility, String Station, String MedicineName, String Frequency) throws Exception {
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
	    	CommanUtill.clickByJSFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNewOrderRadioBtn, "Clicked on The Drugs New Order Radio Button" );
	    	Thread.sleep(500);
	    //	selectFirstValidDrug();
	    	CommanUtill.textEnter(TextMedicineName, MedicineName);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickMedicine, "Clicked on The Medicine");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickifPresent, "Clicked if Present");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickifPresent1, "Clicked if Present");
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectRoute1);
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectFrequency3, Frequency);
	    //	CommanUtill.selectSecondOptionFromAnyDropdown(SelectFrequency3);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextInput1, CommanUtill.generateRandomMobileNumber1(2));
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextRemarks1, CommanUtill.generateRandomName(10));
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(CLickBFOCheckBox, "Clicked on The BFO CheckBox");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDrugOrder, "Clicked on The Drug Order Save Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    
	    
	    	
	    }
	    
	    public void NewOrderMARSOS(String Facility, String Station, String MedicineName, String Frequency1) throws Exception {
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
	    	CommanUtill.clickByJSFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNewOrderRadioBtn, "Clicked on The Drugs New Order Radio Button" );
	    	Thread.sleep(500);
	    //	selectFirstValidDrug();
	    	CommanUtill.textEnter(TextMedicineName, MedicineName);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickMedicine, "Clicked on The Medicine");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickifPresent, "Clicked if Present");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickifPresent1, "Clicked if Present");
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectRoute1);
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectFrequency3 , Frequency1);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextRemarks1, CommanUtill.generateRandomName(10));
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(CLickBFOCheckBox, "Clicked on The BFO CheckBox");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDrugOrder, "Clicked on The Drug Order Save Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    
	    
	    	
	    }

	    public void NewOrderDeleted(String Facility, String Station, String Drug) throws Exception {
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
	    	CommanUtill.clickByJSFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNewOrderRadioBtn, "Clicked on The Drugs New Order Radio Button" );
	    	Thread.sleep(500);
	    	//selectFirstValidDrug();
	    	CommanUtill.clickFunction(ClickDrug, Drug);
	    	Thread.sleep(500);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectRoute1);
	    	Thread.sleep(500);
	    	CommanUtill.selectFirstOptionFromDropdown(SelectFrequency2);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextRemarks1, CommanUtill.generateRandomName(10));
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextQuantity, CommanUtill.generateRandomMobileNumber1(2));
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDrugOrder, "Clicked on The Drug Order Save Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    	Thread.sleep(1000);
	    	CommanUtill.clickFunction(ClickPendingRadioButton, "Clicked on The Pending Radio Button" );
	    	Thread.sleep(1000);	
	    	clickDrugAndValidateFromDetailTable();
	    	Thread.sleep(500);
	    	clickFirstClickableCell();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickDeleteyesButton, "Clicked on The Delete Yes Button");
	    	Thread.sleep(500);
	    	verifyPopUpSuccess(driver);
	    }
	    
	    public void Print(String Facility, String Station) throws IOException, InterruptedException {
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
	    	CommanUtill.clickFunction(ClickNursingDrugOrder, "Clicked on The Nursing Drug Order Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickIssuedRadionBtn, "Clicked on The Issued Radio Button");
	    	Thread.sleep(500);
	    	clickFirstClickableCellIssued();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPrint, "Clicked on The Print Button");
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextDate, "01-01-2026");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickFinalPrint, "Clicked on The Final Print Button");
	    	Thread.sleep(5000);
	    	CommanUtill.closeNewlyOpenedWindow();
	    	Thread.sleep(2000);
	    	CommanUtill.clickFunction(ClickPrintClose, "Clicked on The Print Close Button");
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    	
	    }
}
