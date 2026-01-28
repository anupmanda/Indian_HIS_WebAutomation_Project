/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 15 Dec 2025
 */
public class ADT_View_Admission_Surgery_Request extends GeneralBrowserSetting{
	
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	protected static String SelectFacility = "//*[@id=\"Facility\"]";
	protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
	protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
	protected static String ClickViewAdmissionSurgeryRequestDetails = "//*[@id=\"FOAddPatientMenu\"]/ul/li[6]/a";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String TextDate = "//*[@id=\"f_date\"]";
    protected static String ClickSearch = "//*[@id=\"date_search\"]";
    
    public void AdmissionSurgeryRequest(String Facility, String Station, String Date)
            throws IOException, InterruptedException {

        CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
        Thread.sleep(500);
        CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickViewAdmissionSurgeryRequestDetails,"Clicked on The View Admission Surgery Request Link");
        Thread.sleep(500);
        CommanUtill.textEnter(TextDate, Date);
        Thread.sleep(500);
        CommanUtill.pressEnter(TextDate);
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickSearch, "Clicked on The Search Button");
        Thread.sleep(2000);

        WebElement table = driver.findElement(By.id("tbl_dsPatientFullDetails"));
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        WebElement activeRow = null;
        String activeUHID = null;


        logger.log(Status.INFO, "Started Active UHID Action Flow");
        log.info("Started Active UHID Action Flow");
        System.out.println("▶ Started Active UHID Action Flow");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement table1 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.id("tbl_dsPatientFullDetails")));

        List<WebElement> rows1 = table1.findElements(By.xpath(".//tbody/tr"));

        WebElement activeRow1 = null;
        String activeUHID1 = null;

        for (WebElement row : rows1) {

            String status = row.findElement(By.xpath("./td[10]")).getText().trim();

            if (status.equalsIgnoreCase("Active")) {
                activeRow1 = row;
                activeUHID1 = row.findElement(By.xpath("./td[1]")).getText().trim();

                logger.log(Status.PASS, "Active UHID Found: " + activeUHID1);
                log.info("Active UHID Found: " + activeUHID1);
                System.out.println("✅ Active UHID Found: " + activeUHID1);
                break;
            }
        }

        if (activeRow1 == null) {
            logger.log(Status.FAIL, "No Active UHID found");
            log.error("No Active UHID found");
            System.out.println("❌ No Active UHID found");
            return;
        }

        List<WebElement> tds = activeRow1.findElements(By.xpath("./td"));
        int totalTd = tds.size();

        for (int i = 12; i <= totalTd; i++) {

            try {
                WebElement cell = activeRow1.findElement(By.xpath("./td[" + i + "]"));
                WebElement clickable = cell.findElement(By.xpath(".//a | .//button | .//i"));

                if (clickable.isDisplayed() && clickable.isEnabled()) {

                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    String originalStyle = clickable.getAttribute("style");

                    js.executeScript(
                            "arguments[0].setAttribute('style', arguments[1]);",
                            clickable,
                            "background: yellow; border: 2px solid blue;"
                    );

                    try { Thread.sleep(500); } catch (Exception e) {}

                    js.executeScript(
                            "arguments[0].setAttribute('style', arguments[1]);",
                            clickable,
                            originalStyle
                    );

                    wait.until(ExpectedConditions.elementToBeClickable(clickable)).click();

                    logger.log(Status.INFO, "Clicked on td[" + i + "] for UHID: " + activeUHID1);
                    log.info("Clicked on td[" + i + "] for UHID: " + activeUHID1);
                    System.out.println("🖱 Clicked on td[" + i + "] for UHID: " + activeUHID1);

          
                    try {
                        CommanUtill.closeAdmissionPopup(driver);

                        logger.log(Status.INFO, "Admission popup closed");
                        log.info("Admission popup closed");
                        System.out.println("ℹ Admission popup closed");
                    } catch (Exception e1) {
                        System.out.println("ℹ No Admission popup");
                    }

                    try {
                        WebElement closePopup = wait.until(
                                ExpectedConditions.presenceOfElementLocated(By.id("popupclosekeyEsti")));

                        String popStyle = closePopup.getAttribute("style");

                        js.executeScript(
                                "arguments[0].setAttribute('style', arguments[1]);",
                                closePopup,
                                "background: yellow; border: 2px solid blue;"
                        );

                        try { Thread.sleep(500); } catch (Exception e) {}

                        js.executeScript(
                                "arguments[0].setAttribute('style', arguments[1]);",
                                closePopup,
                                popStyle
                        );

                        closePopup.click();

                        logger.log(Status.INFO, "Estimation popup closed");
                        log.info("Estimation popup closed");
                        System.out.println("ℹ Estimation popup closed");

                    } catch (Exception e2) {
                        System.out.println("ℹ No Estimation popup");
                    }
                }

            } catch (Exception e) {
                logger.log(Status.WARNING, "td[" + i + "] clickable element not found");
                log.warn("td[" + i + "] clickable element not found");
                System.out.println("⚠ td[" + i + "] clickable element not found");
            }
        }

        logger.log(Status.PASS, "Active UHID Action Flow Completed Successfully");
        log.info("Active UHID Action Flow Completed Successfully");
        System.out.println("✅ Active UHID Action Flow Completed Successfully");
    }


public boolean verifyPopUpSuccess(WebDriver driver) throws TimeoutException {

    logger.log(Status.INFO, "Started verification of  success message");
    log.info("Started verification of success message");
    System.out.println("▶ Started verification of success message");

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
}}

/*  WebElement table = driver.findElement(By.id("tbl_dsPatientFullDetails"));
List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

WebElement activeRow = null;
String activeUHID = null;

for (WebElement row : rows) {

    String status = row.findElement(By.xpath("./td[10]")).getText().trim();

    if (status.equalsIgnoreCase("Active")) {
        activeRow = row;
        activeUHID = row.findElement(By.xpath("./td[1]")).getText().trim();
        System.out.println("Active UHID Found: " + activeUHID);
        break;
    }
}

if (activeRow == null) {
    System.out.println("No Active UHID found");
    return;
}

List<WebElement> tds = activeRow.findElements(By.xpath("./td"));
int totalTd = tds.size();

for (int i = 12; i <= totalTd; i++) {

    try {
        WebElement cell = activeRow.findElement(By.xpath("./td[" + i + "]"));
        WebElement clickable = cell.findElement(By.xpath(".//a | .//button | .//i"));

        if (clickable.isDisplayed() && clickable.isEnabled()) {

            clickable.click();
            System.out.println("Clicked on td[" + i + "] for UHID: " + activeUHID);

            Thread.sleep(5000); 

            CommanUtill.closeAdmissionPopup(driver);
            System.out.println("Popup closed for td[" + i + "]");

            Thread.sleep(5000); 
        }

    } catch (Exception e) {
        System.out.println("td[" + i + "] clickable element not found");
    }
}*/