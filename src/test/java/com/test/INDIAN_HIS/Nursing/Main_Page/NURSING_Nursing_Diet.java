/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

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
 * 20 Feb 2026
 */
public class NURSING_Nursing_Diet extends GeneralBrowserSetting{

	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String ClickNursingDiet = "//*[@id=\"NursingDiet\"]";
    
    protected static String ClickAlarCartRadioBtn = "//*[@id=\"raddietalacart\"]";
    protected static String ClickPending = "//*[@id=\"raddietalacartpend\"]";
    protected static String ClickNewOrder = "//*[@id=\"raddietalacartnewordr\"]";
    protected static String SelectAlacartBillType = "//*[@id=\"ddlalacartbilltype\"]";
    protected static String ClickSaveAlaCart = "//*[@id=\"saveAlacart\"]";  
    
    protected static String ClickDiet = "//*[@id=\"raddietdiet\"]";
    protected static String SelectDietType = "//*[@id=\"cmbdietcategory\"]";
    protected static String ClickLiquidDietCheckBox = "//*[@id=\"chkLiquidDiet\"]";
    protected static String SelectLiquidDiet = "//*[@id=\"cmbliquid\"]";
    protected static String TextLiquidQuantity = "//*[@id=\"txtvloum\"]";
    protected static String SelectTextHours = "//*[@id=\"txthour\"]";
    protected static String CLickSaveYesButton = "//*[@id=\"btnyesdiet\"]";
    
    protected static String ClickRtFeed = "//*[@id=\"chkrtfeed\"]";
    protected static String SelectRtFeed = "//*[@id=\"cmbRTFeed\"]";
    protected static String TextQuantity = "//*[@id=\"txtRTFeedVol\"]";
    protected static String SelectFeedHour = "//*[@id=\"txtRTFeedHour\"]";
    
    protected static String ClickSaveDietButton = "//*[@id=\"saveDiet\"]";
    
    protected static String ClickSupplementaryCheckBox = "//*[@id=\"chkSupplymentary\"]";
    protected static String TextSupplemetQuantity = "//*[@id=\"txtQTYSpplymntry\"]";
    protected static String SelectSupplementQuantity = "//*[@id=\"drpevrySpplymntry\"]"; 
    
    protected static String ClickToSelecAlacart = "//*[@id=\"tblAlacartpendinglist\"]/tbody/tr[1]/td[1]";
    protected static String ClickToCancelAlacart = "//*[@id=\"cancelAlacartpending\"]";
    protected static String ClickCancelYesButton = "//*[@id=\"btnyesAlacartpencandiet\"]";
    
    
public void fillRandomValuesInTableItemQuantity(WebDriver driver) throws InterruptedException {

    List<WebElement> rows = driver.findElements(
            By.xpath("//*[@id='tblAlacartNewOrderslist']/tbody/tr"));  

   // int rowCount = rows.size();
    int rowCount = 5;
    System.out.println("Total Rows: " + rowCount);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Random random = new Random();

    for (int i = 0; i < rowCount; i++) {

        WebElement currentRow = rows.get(i);

        WebElement inputBox = currentRow.findElement(By.xpath("td[3]/input"));

        int randomValue = 10 + random.nextInt(90);

        inputBox.clear();
        inputBox.sendKeys(String.valueOf(randomValue));

        js.executeScript(
                "arguments[0].style.border='3px solid blue';" +
                "arguments[0].style.backgroundColor='yellow';",
                inputBox);

        Thread.sleep(1000);

        js.executeScript(
                "arguments[0].style.border='';" +
                "arguments[0].style.backgroundColor='';",
                inputBox);
        
        
    }
  }

public void fillRandomValuesInTableRemarks(WebDriver driver) throws InterruptedException {

    List<WebElement> rows = driver.findElements(
            By.xpath("//*[@id='tblAlacartNewOrderslist']/tbody/tr"));  

   // int rowCount = rows.size();
    int rowCount = 5;
    System.out.println("Total Rows: " + rowCount);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Random random = new Random();

    for (int i = 0; i < rowCount; i++) {

        WebElement currentRow = rows.get(i);

        WebElement inputBox = currentRow.findElement(By.xpath("td[4]/input"));

        inputBox.clear();
        inputBox.sendKeys(CommanUtill.generateRandomName(10));

        js.executeScript(
                "arguments[0].style.border='3px solid blue';" +
                "arguments[0].style.backgroundColor='yellow';",
                inputBox);

        Thread.sleep(1000);

        js.executeScript(
                "arguments[0].style.border='';" +
                "arguments[0].style.backgroundColor='';",
                inputBox);      
        
    }
  }

public void fillRandomValuesInTableClickSelect (WebDriver driver) throws InterruptedException {

    List<WebElement> rows = driver.findElements(
            By.xpath("//*[@id='tblAlacartNewOrderslist']/tbody/tr"));  

   // int rowCount = rows.size();
    int rowCount = 5;
    System.out.println("Total Rows: " + rowCount);

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Random random = new Random();

    for (int i = 0; i < rowCount; i++) {

        WebElement currentRow = rows.get(i);

        WebElement inputBox = currentRow.findElement(By.xpath("td[5]/input"));
        inputBox.click();

        js.executeScript(
                "arguments[0].style.border='3px solid blue';" +
                "arguments[0].style.backgroundColor='yellow';",
                inputBox);

        Thread.sleep(1000);

        js.executeScript(
                "arguments[0].style.border='';" +
                "arguments[0].style.backgroundColor='';",
                inputBox);
        
        
    }
  }

public boolean lastClickWithHighlightAlacartDiet() {

    logger.log(Status.INFO, "Started searching for LAST clickable cell in table");
    log.info("Started searching for LAST clickable cell in table");
    System.out.println("▶ Started searching for LAST clickable cell in table");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    List<WebElement> rows = driver.findElements(
            By.xpath("//*[@id='tblAlacartpendinglist']/tbody/tr")  
    );

    int maxRows = rows.size();
    System.out.println("📊 Total rows found: " + maxRows);

    for (int i = maxRows; i >= 1; i--) {

        try {

            String cellXpath =
                    "//*[@id='tblModeParameterordernlist']/tbody/tr[" + i + "]/td[1]";

            WebElement elementToScroll = driver.findElement(By.xpath(cellXpath));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", elementToScroll);

            WebElement element = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath(cellXpath))
            );

            logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
            log.info("Row " + i + " is clickable, applying highlight");

            js.executeScript(
                    "arguments[0].setAttribute('style'," +
                    "'background: yellow; border: 3px solid blue;');",
                    element
            );

            Thread.sleep(500);
            js.executeScript("arguments[0].setAttribute('style','');", element);

            element.click();

            logger.log(Status.PASS, "Clicked successfully on LAST clickable row: " + i);
            log.info("Clicked successfully on LAST clickable row: " + i);
            System.out.println("✅ Clicked successfully on LAST row: " + i);

            return true;

        } catch (Exception e) {
            System.out.println("❌ Row " + i + " not clickable → Trying previous row");
            log.warn("Row " + i + " not clickable, trying previous row", e);
        }
    }

    logger.log(Status.FAIL, "No clickable cell found in table");
    log.error("No clickable cell found in table");
    System.out.println("❌ No clickable cell found in table");

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
                        || msgText.contains("Signed successfully!") 
                        || msgText.contains("Record Saved Successfully!")
                        || msgText.contains("Verified successfully!")
                        || msgText.contains("Saved successfully")
                        || msgText.contains("Verified successfully")
                        || msgText.contains("Deleted Successfully!")
                        || msgText.contains("Record saved successfully !!")
                        || msgText.contains("Record updated successfully !!")
                        || msgText.contains("Cancelled successfully!")
                        || msgText.contains("Save successfully."); 

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

    public void NursingDietAlaCart(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickNursingDiet, "Clicked on The Nursing Diet");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAlarCartRadioBtn, "Clicked on The AlaCart Radio Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNewOrder, "Clicked on The New order Radio Button");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectAlacartBillType);
    	Thread.sleep(500);
    	fillRandomValuesInTableItemQuantity(driver);
    	Thread.sleep(500);
    	fillRandomValuesInTableRemarks(driver);
    	Thread.sleep(500);
    	fillRandomValuesInTableClickSelect(driver);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveAlaCart, "Cicked on The Save Alacart Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(2000);
    	CommanUtill.clickFunction(ClickToSelecAlacart, "Clicked To Select The Alacart");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickToCancelAlacart, "Clcked to Cancel The Selected Alacart");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickCancelYesButton, "Clcked to Cancel Yes Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(500);
    	CommanUtill.ClickHomePage();
 }
    
    public void DietLiquid(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickNursingDiet, "Clicked on The Nursing Diet");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickDiet, "Clicked on The Nursing Diet");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectDietType);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickLiquidDietCheckBox, "Clciked on The Liquid Diet CheckBox");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectLiquidDiet);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextLiquidQuantity, CommanUtill.generateRandomMobileNumber1(2));
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectTextHours);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSupplementaryCheckBox, "Clicked on The Supplement CheckBox");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextSupplemetQuantity, CommanUtill.generateRandomMobileNumber1(2));
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectSupplementQuantity);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveDietButton, "Clicked on The Diet Sve Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(CLickSaveYesButton, "Clciked on The Save Yes Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(500);
    	CommanUtill.ClickHomePage();
    }
    
    public void DietRTFeed(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickNursingDiet, "Clicked on The Nursing Diet");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickDiet, "Clicked on The Nursing Diet");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectDietType);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickRtFeed, "Clciked on The RT Feed CheckBox");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectRtFeed);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextQuantity, CommanUtill.generateRandomMobileNumber1(2));
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectFeedHour);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSupplementaryCheckBox, "Clicked on The Supplement CheckBox");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextSupplemetQuantity, CommanUtill.generateRandomMobileNumber1(2));
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectSupplementQuantity);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveDietButton, "Clicked on The Diet Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(CLickSaveYesButton, "Clciked on The Save Yes Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(500);
    	CommanUtill.ClickHomePage();

    }

}
