package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 * 24 Dec 2025
 */
public class ADT_Consent extends GeneralBrowserSetting {

    protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
    protected static String SelectFacility = "//*[@id=\"Facility\"]";
    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
    protected static String ClickConsent = "//*[@id=\"FOAddPatientMenu\"]/ul/li[12]/a";
    protected static String TextUHID = "//*[@id=\"txtUhid\"]";
    protected static String ClickSaveWithoutVisit = "//*[@id=\"saveWithoutVisit\"]";
    protected static String SelectTemplate = "//*[@id=\"templateId\"]";
    protected static String ClickAddTemplate = "//*[@id=\"add_template\"]";
    protected static String ClickSignature = "//*[@id=\"signature_open\"]";
    protected static String ClickSaveConsent = "//*[@id=\"SaveConsent\"]";

    public void ADTConsent(String Facility, String Station,String UHID, String Template) throws IOException, InterruptedException {
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         Thread.sleep(500);
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
         Thread.sleep(500);
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         Thread.sleep(500);
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button");
         Thread.sleep(500);
         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked Admit Patient");
         Thread.sleep(500);
         CommanUtill.clickByJSFunction(ClickConsent, "Clicked on The ADT Consent");
         Thread.sleep(500);
         CommanUtill.switchToNewWindow(driver);
         Thread.sleep(500);
         CommanUtill.clearTextField(TextUHID, "TextField Cleared");
         Thread.sleep(500);
         CommanUtill.textEnter(TextUHID, UHID);
         Thread.sleep(500);
         CommanUtill.pressEnter(TextUHID);
         Thread.sleep(500);
         CommanUtill.clickFunction(ClickSaveWithoutVisit, "Clicked on The Save Without Visit CheckBox");
         Thread.sleep(500);
         CommanUtill.dropdownSelectByVisibleText(SelectTemplate, Template);
         Thread.sleep(500);
         CommanUtill.clickFunction(ClickAddTemplate, "Clicked on The Add Template Button");
         Thread.sleep(500);
         CommanUtill.clickFunction(ClickSignature, "Clicked on The Signature Button");
    }

    public void drawSignatureAndSave(WebDriver driver) throws InterruptedException, IOException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[contains(@id,'SignatureIframe')]")));
        WebElement canvas = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//div[@id='signature-pad']//canvas")));
        Actions actions = new Actions(driver);
        actions.moveToElement(canvas, 50, 50)
                .clickAndHold()
                .moveByOffset(40, -30)
                .moveByOffset(40, 30)
                .moveByOffset(-20, -15)
             
                .moveByOffset(40, 0)
                .moveByOffset(20, -20)
                .moveByOffset(-20, -20)
                .moveByOffset(20, -20)
           
                .moveByOffset(40, 40)
                .moveByOffset(0, -40)
                .moveByOffset(0, 20)
                .moveByOffset(25, 0)
                .moveByOffset(0, -20)
             
                .moveByOffset(40, 20)
                .moveByOffset(0, 20)
                .moveByOffset(30, 0)
                .moveByOffset(0, -20)
                .release()
                .perform();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement saveBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("SaveSignature")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
        Thread.sleep(3000);
        CommanUtill.clickFunction(ClickSaveConsent, "Clicked on The Save Consent Button");
    }
    
    public boolean verifyFileUploadSuccess(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p[contains(text(),'Record Saved Successfully!')]");
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
            String msgText = message.getText().trim();
            System.out.println("Popup Message : " + msgText);

            return msgText.contains("Record Saved Successfully!");

        } catch (TimeoutException e) {
            System.out.println("❌ Record Saved Successfully! popup not displayed");
            return false;
        }
    }
}
