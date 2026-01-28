/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 26 Dec 2025
 */
public class ADT_Bed_Status extends GeneralBrowserSetting{

	    protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	    protected static String SelectFacility = "//*[@id=\"Facility\"]";
	    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
	    protected static String SelectStation = "//*[@id=\"Department\"]";
	    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
	    protected static String ClickBedStatusLink = "//*[@id=\"FOBedTranferMenu1\"]/a";
	    protected static String ClickBedStatus = "//*[@id=\"FOBedTranferMenu1\"]/ul/li[1]/a";
	    protected static String SelectWard = "//*[@id=\"_ward\"]";
	    protected static String SelectBedType = "//*[@id=\"_bedtype\"]";
	    protected static String SelectBedStatus = "//*[@id=\"_bedsatatus\"]";
	    protected static String ClickShowDetails = "//*[@id=\"_HideShow_Detail\"]";
	    
	    protected static String ClickThreeDot = "//*[@id=\"_bedpatient\"]/div/a";
	    protected static String ClickAdmit = "//*[@id=\"_bedpatient\"]/div/ul/li[1]/a";
	    protected static String ClickBedBlocked_Unblocked = "//*[@id=\"_bedpatient\"]/div/ul/li[5]/a";
	    protected static String ClickPatientDetails = "//*[@id=\"_bedpatient\"]/div/ul/li[2]/a";
	    protected static String ClickPatientDetailsClose = "//*[@id=\"popup950\"]/div/span/a";
	    protected static String ClickCodeBlue = "//*[@id=\"_bedpatient\"]/div/ul/li[3]/a";
	    protected static String ClickSendSMSYes = "//*[@id=\"sendsmsYes\"]";
	    protected static String ClickReleaseBed = "//*[@id=\"_bedpatient\"]/div/ul/li[4]/a";
	    
	    protected static String ClickBlockedYes = "//*[@id=\"btnAcceptYes\"]";
	    protected static String SelectReason = "//*[@id=\"_reason\"]";
	    protected static String TextReason = "//*[@id=\"reasontxt\"]";
	    protected static String ClickBlockedBedReasonYes = "//*[@id=\"btnblockreasonYes\"]";
	    
	    protected static String ClickUnblockedYesBtn = "//*[@id=\"btnUNAcceptYes\"]";
	    
	    public boolean verifyPopUp(WebDriver driver) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p");             
	            WebElement message =wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
	            String msgText = message.getText().trim();
	            System.out.println("Popup Message : " + msgText);
	            return msgText.contains("Bed Unblocked Successfully")|| msgText.contains("SMS Sent successfully");
	        } catch (TimeoutException e) {
	            System.out.println("❌ Success popup not displayed");
	            return false;
	        }
	    }
	    
	    public void BedStatus(String Facility, String Station, String Ward, String BedType, String BedStatus) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatusLink, "Clicked The Bed Status Link.....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatus, "Clicked on The Bed Status.....");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedStatus, BedStatus);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickShowDetails, "Clicked on The Show Detailed....");
	    }
	    
	    public void ClickAdmit(String Facility, String Station, String Ward, String BedType, String BedStatus) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatusLink, "Clicked The Bed Status Link.....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatus, "Clicked on The Bed Status.....");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedStatus, BedStatus);
	         Thread.sleep(500);
	         for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickThreeDot)).click();
	        	    break; 
	        	}

	        	Thread.sleep(500);

	        	for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickAdmit)).click();
	        	    break; 
	        	}

	    }
	    
	    public void ClickBedBlocked(String Facility, String Station, String Ward, String BedType, String BedStatus,String Reason,
	    		String Textreason) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatusLink, "Clicked The Bed Status Link.....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatus, "Clicked on The Bed Status.....");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedStatus, BedStatus);
	         Thread.sleep(500);
	         for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickThreeDot)).click();
	        	    break; 
	        	}

	        	Thread.sleep(500);

	        	for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickBedBlocked_Unblocked)).click();
	        	    break; 
	        	}
	        	Thread.sleep(500);
	        	CommanUtill.clickByJSFunction(ClickBlockedYes, "Clicked on The Bed Blocked Yes Button");
	        	Thread.sleep(500);
	        	CommanUtill.dropdownSelectByVisibleText(SelectReason, Reason);
	        	Thread.sleep(500);
	        	CommanUtill.textEnter(TextReason, Textreason);
	        	Thread.sleep(500);
	        	CommanUtill.clickByJSFunction(ClickBlockedBedReasonYes, "Clicked on The Bed Blocked Reason Yes Button");
	    }
	    
	    public void ClickUnBlocked(String BedStatusBlocked) throws InterruptedException, IOException {
	    	  JavascriptExecutor js = (JavascriptExecutor) driver;
	    	     js.executeScript("location.reload(true);");
	    	     Thread.sleep(500);
		         CommanUtill.dropdownSelectByVisibleText(SelectBedStatus, BedStatusBlocked);
		         Thread.sleep(500);
		         for (int i = 0; i < 10; i++) {

		        	    driver.findElement(By.xpath(ClickThreeDot)).click();
		        	    break; 
		        	}

		        	Thread.sleep(500);

		        	for (int i = 0; i < 10; i++) {

		        	    driver.findElement(By.xpath(ClickBedBlocked_Unblocked)).click();
		        	    break; 
		        	}
		        	Thread.sleep(500);
		        	CommanUtill.clickByJSFunction(ClickUnblockedYesBtn, "Clicked on The UnBlocked Bed Yes Button");
		        	Thread.sleep(500);
		        	verifyFileUploadSuccess(driver);
	    }
	    
	    public void BedStatusPatientDetails(String Facility, String Station, String Ward, String BedType, String BedStatus) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatusLink, "Clicked The Bed Status Link.....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatus, "Clicked on The Bed Status.....");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedStatus, BedStatus);
	         Thread.sleep(500);
	         for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickThreeDot)).click();
	        	    break; 
	        	}

	        	Thread.sleep(500);

	        	for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickPatientDetails)).click();
	        	    break; 
	        	}
	        	Thread.sleep(3000);
	        	CommanUtill.clickByJSFunction(ClickPatientDetailsClose, "Clicked on The Patient Details Close Button");
	       
    }
	    public void BedStatusCodeBlue(String Facility, String Station, String Ward, String BedType, String BedStatus) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatusLink, "Clicked The Bed Status Link.....");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickBedStatus, "Clicked on The Bed Status.....");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectBedStatus, BedStatus);
	         Thread.sleep(500);
	         for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickThreeDot)).click();
	        	    break; 
	        	}

	        	Thread.sleep(500);

	        	for (int i = 0; i < 10; i++) {

	        	    driver.findElement(By.xpath(ClickCodeBlue)).click();
	        	    break; 
	        	}
	        	Thread.sleep(500);
	        	CommanUtill.clickByJSFunction(ClickSendSMSYes, "Clicked on The Send SMS Yes Button");
	        	Thread.sleep(500);
	        	verifyPopUp(driver);
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
	                    msgText.contains("Bed Unblocked Successfully");               
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
	            return false;
	        }
	    }
   
	  
}