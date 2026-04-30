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
 * 23 Feb 2026
 */
public class NURSING_Nursing_Nursing_Equipment extends GeneralBrowserSetting {
	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
    protected static String ClickNursingEquipment = "/html/body/div[4]/div[1]/div/div[2]/div/div[1]/div/a[12]";
    protected static String ClickSaveEquipment = "//*[@id=\"saveEquipment\"]";
    protected static String ClickEquipmentSaveYesButton = "//*[@id=\"yesSaveEquipment\"]";
    protected static String ClickOnTheSelectedEquipment = "//*[@id=\"tblequiporders\"]/tbody/tr/td[1]";
    protected static String ClickCheckBoxofSelectedEquipment = "//*[@id=\"equip-25924\"]/td[1]/input";
    protected static String ClickOnCancelEquipmentButton = "//*[@id=\"cancelEquipment\"]";
    protected static String ClickonCancelEquipmentYesButton = "//*[@id=\"yesCancelEquipment\"]";
    
  
    
    
    public void clickCheckboxUntilNoGlitter(WebDriver driver) throws InterruptedException, IOException {

        List<WebElement> rows = driver.findElements(
                By.xpath("//*[@id='tblequipmentlist']/tbody/tr"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < rows.size(); i++) {

            WebElement currentRow = rows.get(i);
            WebElement checkbox = currentRow.findElement(By.xpath("td/input"));

            js.executeScript("arguments[0].scrollIntoView(true);", checkbox);

            if (!checkbox.isSelected()) {
                checkbox.click();
            }

            Thread.sleep(2000);

            CommanUtill.clickByJSFunction(ClickSaveEquipment, "Clicked on The Save Button");
            Thread.sleep(2000);

            CommanUtill.clickFunction(ClickEquipmentSaveYesButton, 
                    "Clicked on The Equipment Save Yes Button");

            Thread.sleep(1000);

            List<WebElement> glitterMsg = driver.findElements(
                    By.xpath("//*[contains(text(),'Price is zero')]"));

            if (glitterMsg.size() > 0 && glitterMsg.get(0).isDisplayed()) {

                System.out.println("Price not defined message appeared. Trying next checkbox...");

                if (checkbox.isSelected()) {
                    checkbox.click();
                }

            } else {

                System.out.println("No glitter message. Breaking loop.");
                break;   
            }
        }
    }
    
    
    public void clickCheckboxUntilOrderPlaced(WebDriver driver) throws IOException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        List<WebElement> rows = driver.findElements(
                By.xpath("//*[@id='tblequipmentlist']/tbody/tr"));

        for (WebElement row : rows) {

            WebElement checkbox = row.findElement(By.xpath(".//td/input"));

            js.executeScript("arguments[0].scrollIntoView(true);", checkbox);

            if (!checkbox.isSelected()) {
                checkbox.click();
            }

            CommanUtill.clickByJSFunction(ClickSaveEquipment, "Clicked Save Button");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ClickEquipmentSaveYesButton)));
            CommanUtill.clickFunction(ClickEquipmentSaveYesButton, 
                    "Clicked Equipment Save Yes Button");

            wait.until(ExpectedConditions.or(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//*[contains(text(),'Order placed successfully!')]")),
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//*[contains(text(),'Price is zero')]"))
            ));

            List<WebElement> successMsg = driver.findElements(
                    By.xpath("//*[contains(text(),'Order placed successfully!')]"));

            if (!successMsg.isEmpty() && successMsg.get(0).isDisplayed()) {

                System.out.println("✅ Order placed successfully! Breaking loop.");
                break;
            }

            List<WebElement> priceZeroMsg = driver.findElements(
                    By.xpath("//*[contains(text(),'Price is zero')]"));

            if (!priceZeroMsg.isEmpty() && priceZeroMsg.get(0).isDisplayed()) {

                System.out.println("⚠ Price is zero. Trying next checkbox...");

                if (checkbox.isSelected()) {
                    checkbox.click();
                }

            } else {

                System.out.println("No relevant message found. Breaking loop.");
                break;
            }
        }
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
                            || msgText.contains("Save successfully.")
                            || msgText.contains("Order placed successfully!")
                            || msgText.contains("Deleted successfully."); 

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
    
    
    public void  NursingEquipment(String Facility, String Station) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickNursingEquipment, "Clicked on The Nursing Equipment");
    	Thread.sleep(500);
    	clickCheckboxUntilNoGlitter(driver);
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickOnTheSelectedEquipment, "Click On The Selected Equipment");
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickCheckBoxofSelectedEquipment, "Click On The CheckBox of  Selected Equipment");
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickOnCancelEquipmentButton, "Click On The Cancelled Equipment Button");
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickonCancelEquipmentYesButton, "Click on The Cancel Equipment Yes Button");
		Thread.sleep(500);
		verifySuccessPopup(driver);
		Thread.sleep(500);
		CommanUtill.ClickHomePage();
    }
}
