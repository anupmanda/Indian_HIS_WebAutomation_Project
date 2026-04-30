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
 *20 Feb 2026
 */
public class NURSING_Nursing_Ventilator_Oxygen extends GeneralBrowserSetting{
	
	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String ClickVentilator_Oxygen = "/html/body/div[4]/div[1]/div/div[2]/div/div[1]/div/a[9]";
    
    protected static String CLickVentilator = "//*[@id=\"BtnNVentilator\"]";
    protected static String SelectMode = "//*[@id=\"ddnMode\"]";
    protected static String TextRemarks = "//*[@id=\"txtstartnremarks\"]"; 
    protected static String ClickVXSaveBtn = "//*[@id=\"save_VXOrder\"]";
    protected static String ClickPrint = "//*[@id=\"Print_VXOrder\"]";
    
    protected static String ClickOxygen = "//*[@id=\"BtnNOxygen\"]";
    protected static String SelectModeofOxygen = "//*[@id=\"ddOxyMode\"]";
    protected static String SelectOxygen = "//*[@id=\"ddOxyType\"]";
    protected static String TextRemarksOxygen = "//*[@id=\"txtoxystartremarks\"]";
    
    protected static String ClickDeleteRemarksCheckBox = "//*[@id=\"chk_nremarks\"]";
    protected static String ClickDeleteRemarksCheckBoxOxygen = "//*[@id=\"chk_oxyremarks\"]";
    protected static String TextDeleteRemarks = "//*[@id=\"deletednremarks\"]";
    protected static String TextDeleteRemarksOxygen = "//*[@id=\"deletedoxyremarks\"]";
    protected static String ClickDeleteTab = "//*[@id=\"btnnDelete\"]";
    protected static String ClickDeleteTabOxygen = "//*[@id=\"btnoxyDelete\"]";
    
    public void fillRandomValuesInTable(WebDriver driver) throws InterruptedException {

        List<WebElement> rows = driver.findElements(
                By.xpath("//*[@id='tblAddnModeParameterlist']/tbody/tr"));

        int rowCount = rows.size();
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

    public boolean lastClickWithHighlightVentilator() {

        logger.log(Status.INFO, "Started searching for LAST clickable cell in table");
        log.info("Started searching for LAST clickable cell in table");
        System.out.println("▶ Started searching for LAST clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        List<WebElement> rows = driver.findElements(
                By.xpath("//*[@id='tblModeParameterordernlist']/tbody/tr")
        );

        int maxRows = rows.size();
        System.out.println("📊 Total rows found: " + maxRows);

        for (int i = maxRows; i >= 1; i--) {

            try {

                String cellXpath =
                        "//*[@id='tblModeParameterordernlist']/tbody/tr[" + i + "]/td[12]/a";

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


    public boolean lastClickWithHighlightOxygen() {

        logger.log(Status.INFO, "Started searching for LAST clickable cell in table");
        log.info("Started searching for LAST clickable cell in table");
        System.out.println("▶ Started searching for LAST clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        List<WebElement> rows = driver.findElements(
                By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[11]/div/div[2]/div[1]/table/tbody/tr")
        );

        int maxRows = rows.size();
        System.out.println("📊 Total rows found: " + maxRows);

        for (int i = maxRows; i >= 1; i--) {

            try {

                String cellXpath =
                        "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[11]/div/div[2]/div[1]/table/tbody/tr[" 
                        + i + "]/td[14]/a";

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
    
	public void VentilatorOxygen(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickVentilator_Oxygen, "Clicked on The Ventilator Oxygen");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(CLickVentilator, "Clciked on The Ventilator");
    	Thread.sleep(500);
    	CommanUtill.selectSecondOptionFromDropdown(SelectMode);
    	Thread.sleep(500);
    	fillRandomValuesInTable(driver);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextRemarks, CommanUtill.generateRandomName(10));
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickVXSaveBtn, "Clciked on The Ventilator Save Button");
    	Thread.sleep(500);
    	verifySuccessPopup(driver);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPrint, "Clicked on The Print Icon");
    	Thread.sleep(1000);
    	Delete();
       	verifySuccessPopup(driver);
    	Thread.sleep(2000);
    	CommanUtill.clickFunction(ClickOxygen, "Clciked on The Oxygen");
		Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectModeofOxygen);
		Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectOxygen);
		Thread.sleep(500);
		CommanUtill.textEnter(TextRemarksOxygen, CommanUtill.generateRandomName(10));
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickVXSaveBtn, "Clciked on The Ventilator Save Button");
    	Thread.sleep(500);
       	verifySuccessPopup(driver);
       	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPrint, "Clicked on The Print Icon");
    	Thread.sleep(1000);
    	DeleteOxygen();
       	verifySuccessPopup(driver);
    	Thread.sleep(1000);
    	CommanUtill.ClickHomePage();
	}

	public void Oxygen(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickFunction(ClickVentilator_Oxygen, "Clicked on The Ventilator Oxygen");
    	Thread.sleep(500);
		CommanUtill.clickFunction(ClickOxygen, "Clciked on The Oxygen");
		Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectModeofOxygen);
		Thread.sleep(500);
		CommanUtill.selectSecondOptionFromDropdown(SelectOxygen);
		Thread.sleep(500);
		CommanUtill.textEnter(TextRemarksOxygen, CommanUtill.generateRandomName(10));
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickVXSaveBtn, "Clciked on The Ventilator Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPrint, "Clicked on The Print Icon");
	}
	
	     public void Ventilator(String Facility, String Station) throws IOException, InterruptedException {
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
	    	CommanUtill.clickFunction(ClickVentilator_Oxygen, "Clicked on The Ventilator Oxygen");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(CLickVentilator, "Clciked on The Ventilator");
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectMode);
	    	Thread.sleep(500);
	    	fillRandomValuesInTable(driver);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextRemarks, CommanUtill.generateRandomName(10));
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickVXSaveBtn, "Clciked on The Ventilator Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPrint, "Clicked on The Print Icon");
	}
	     
	     public void Delete() throws InterruptedException, IOException {
	    	 Thread.sleep(2000);
	    	 lastClickWithHighlightVentilator();
	    	 Thread.sleep(500);
	    	 CommanUtill.clickFunction(ClickDeleteRemarksCheckBox, "Clciked on The Delete Remarks CheckBox");
	    	 Thread.sleep(500);
	    	 CommanUtill.textEnter(TextDeleteRemarks, CommanUtill.generateRandomName(10));
	    	 Thread.sleep(500);
	    	 CommanUtill.clickFunction(ClickDeleteTab, "Clicked on The Delete Tab");
	    	 
	     }
	     
	     public void DeleteOxygen() throws InterruptedException, IOException {
	    	 Thread.sleep(2000);
	    	 lastClickWithHighlightOxygen();
	    	 Thread.sleep(500);
	    	 CommanUtill.clickFunction(ClickDeleteRemarksCheckBoxOxygen, "Clciked on The Delete Remarks CheckBox");
	    	 Thread.sleep(500);
	    	 CommanUtill.textEnter(TextDeleteRemarksOxygen, CommanUtill.generateRandomName(10));
	    	 Thread.sleep(500);
	    	 CommanUtill.clickFunction(ClickDeleteTabOxygen, "Clicked on The Delete Tab");
	    	 
	     }
}
