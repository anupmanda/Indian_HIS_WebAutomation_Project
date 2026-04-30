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
 * 13 Feb 2026 ,
 */
public class NURSING_Nursing_Doctor_Notes extends GeneralBrowserSetting{
	
	    protected static String SelectFacility = "//*[@id='Facility']";
	    protected static String SelectStation = "//*[@id='Department']";
	    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
	    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
	    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
	    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
	    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
	    protected static String ClickDoctorNotes = "/html/body/div[4]/div[1]/div/div[2]/div/div[1]/div/a[8]";

	    
	    protected static String ClickOperativeNotes= "//*[@id=\"btnoperative\"]";
	    protected static String SelectOperativeNotes = "//*[@id=\"ddlopertemplate\"]"; 
	    protected static String ClickSearch  = "//*[@id=\"btnopertemplsrch\"]";
	    protected static String SelectAnesthesia = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[7]/td[2]/select";
	    protected static String SelectBiopsy = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[15]/td[2]/select";
	    protected static String SelectAnyDrain = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[16]/td[2]/select";
	    protected static String SelectSpongeCount = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[20]/td[2]/select";
	    protected static String SelectImplantUsed = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[22]/td[2]/select";
	    protected static String ClickSaveBtn = "//*[@id=\"save_temp\"]";
	    protected static String ClickSaveYesBtn = "//*[@id=\"btnYesSaveTemp\"]";
	    protected static String ClickVerifyBtn = "//*[@id=\"sign_temp\"]";
	    protected static String CLickVerifyYesBtn = "//*[@id=\"btnsignyes\"]";
	    
	    protected static String ClickPreOperative = "//*[@id=\"btnpreopreative\"]";
	    protected static String SelectPreOpeTemplate = "//*[@id=\"ddlpretemplate\"]"; 
	    protected static String ClickSearch1  = "//*[@id=\"btnpretemplsrch\"]"; 
	    protected static String Select1 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[7]/td[2]/select";
	    protected static String Select2 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[8]/td[2]/select";
	    protected static String Select3 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[9]/td[2]/select";
	    protected static String Select4 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[10]/td[2]/select";
	    protected static String Select5 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[11]/td[2]/select";
	    protected static String Select6 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[12]/td[2]/select";
	    protected static String Select7 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[13]/td[2]/select";
	    protected static String Select8 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[14]/td[2]/select";
	    protected static String Select9 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[15]/td[2]/select";
	    protected static String Select10 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[16]/td[2]/select";
	    protected static String Select11 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[17]/td[2]/select";
	    protected static String Select12 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[18]/td[2]/select";
	    protected static String Select13 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[19]/td[2]/select";
	    protected static String Select14 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[20]/td[2]/select";
	    protected static String Select15 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[21]/td[2]/select";
	    protected static String Select16 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[22]/td[2]/select";
	    protected static String Select17 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[23]/td[2]/select";
	    protected static String Select18 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[24]/td[2]/select";
	    
	   
	    
	    protected static String ClickVisitNote = "//*[@id=\"btnvisit\"]";
	    protected static String SelectVisitNote = "//*[@id=\"visit_doctor\"]";
	    protected static String ClickAddVisitNoteBtn = "//*[@id=\"btnvisiturl\"]";
	    protected static String ClickVisitNotesSave = "//*[@id=\"save_tempNursing\"]";
	    protected static String ClickVisitNoteSaveYesBtn = "//*[@id=\"_btnnotesyes\"]";
	    protected static String ClickDeleteBtn = "//*[@id=\"btn_Delete\"]";
	    protected static String ClickDeleteYesButton = "//*[@id=\"btnYesChrgblVNDelete\"]";
	    
	    
	    protected static String ClickDoctorRefferal = "//*[@id=\"btndoctorrefrral\"]";
	    protected static String ClickConsultRadioBtn = "//*[@id=\"rbtconsult\"]";
	    protected static String SelectFacilityDR = "//*[@id=\"facility\"]";
	    protected static String SelectDRSpeciality = "//*[@id=\"drpspeciality\"]";
	    protected static String SelectDRDoctor = "//*[@id=\"drpdoctor\"]";
	    protected static String SelectDRPriority  = "//*[@id=\"drpPriority\"]";
	    protected static String SelectDRLocation = "//*[@id=\"drplocation\"]";
	    protected static String ClickSaveDoctorRef = "//*[@id=\"btnSaveDocRef\"]";
	    protected static String ClickSaverefyesBtn = "//*[@id=\"docReffSaveYes\"]";
	    protected static String ClickTransferofCare = "//*[@id=\"rbttransferofcare\"]";
	    protected static String ClickDelete = "//*[@id= \"btnDeleteDocRef\"]";
	    
	    protected static String ClickDoctorTemplate = "//*[@id=\"btnphysiciantemplate\"]";
	    protected static String SelectDoctorTemplate = "//*[@id=\"PhysicianTemplatedrp\"]";
	    protected static String ClickPhysicianTempSearch = "//*[@id=\"PhysicianTemplatedir\"]";
	    protected static String Selectselect1 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[8]/td[3]/select";
	    protected static String Selectselect2 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[10]/td[3]/select";
	    protected static String Selectselect3 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[13]/td[3]/select";
	    protected static String Selectselect4 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[15]/td[3]/select";
	    protected static String Selectselect5 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[17]/td[3]/select";
	    protected static String Selectselect6 = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[19]/td[3]/select";
	    protected static String ClickSaveBtn1 = "//*[@id=\"save_Nursingfromtemp\"]";  
	    protected static String ClickVerifyBtn1 = "//*[@id=\"sign_Nursingfromtemp\"]";  
	   
	    
	    
	    
	    
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
	                            || msgText.contains("Observations Saved Successfully!")
	                            || msgText.contains("Observations Saved Successfully!"); 

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
	
	    public boolean lastClickReferralWithHighlight() {

	        logger.log(Status.INFO, "Started searching for LAST clickable cell in referralRecord table");
	        log.info("Started searching for LAST clickable cell in referralRecord table");
	        System.out.println("▶ Started searching for LAST clickable cell in referralRecord table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("//*[@id='referralRecord']/table/tbody/tr")
	        );

	        int maxRows = rows.size();
	        System.out.println("📊 Total rows found: " + maxRows);

	        for (int i = maxRows; i >= 1; i--) {

	            try {

	                String cellXpath =
	                        "//*[@id='referralRecord']/table/tbody/tr[" 
	                        + i + "]/td[2]";

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

	        logger.log(Status.FAIL, "No clickable cell found in referralRecord table");
	        log.error("No clickable cell found in referralRecord table");
	        System.out.println("❌ No clickable cell found in table");

	        return false;
	    }
	    
	    public boolean lastClickWithHighlight() {

	        logger.log(Status.INFO, "Started searching for LAST clickable cell in referralRecord table");
	        log.info("Started searching for LAST clickable cell in referralRecord table");
	        System.out.println("▶ Started searching for LAST clickable cell in referralRecord table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("//*[@id='tblvisit']/table/tbody/tr")   
	        );

	        int maxRows = rows.size();
	        System.out.println("📊 Total rows found: " + maxRows);

	        for (int i = maxRows; i >= 1; i--) {

	            try {

	                String cellXpath =
	                        "//*[@id='tblvisit']/table/tbody/tr[" 
	                        + i + "]/td[3]";

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

	        logger.log(Status.FAIL, "No clickable cell found in referralRecord table");
	        log.error("No clickable cell found in referralRecord table");
	        System.out.println("❌ No clickable cell found in table");

	        return false;
	    }

	    public void enterTextInCkEditor(String text) {
	        try {

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            WebElement iframe = wait.until(ExpectedConditions
	                    .visibilityOfElementLocated(By.cssSelector("iframe.cke_wysiwyg_frame")));
	            driver.switchTo().frame(iframe);

	            String bodyXpath = "//body";

	            wait.until(ExpectedConditions
	                    .visibilityOfElementLocated(By.xpath(bodyXpath)));

	            driver.findElement(By.xpath(bodyXpath)).sendKeys(Keys.CONTROL + "a");
	            driver.findElement(By.xpath(bodyXpath)).sendKeys(Keys.DELETE);

	            CommanUtill.textEnter(bodyXpath, text);

	            driver.switchTo().defaultContent();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	    
	    public void DoctorNotes(String Facility, String Station, String Operative) throws IOException, InterruptedException {
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
	    	CommanUtill.clickByJSFunction(ClickDoctorNotes, "Clicked on The Doctor Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickOperativeNotes, "Clicked on The Operative Notes");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectOperativeNotes, Operative);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSearch, "Clicked on The Search Icon");
	    	Thread.sleep(500);
	    	CommanUtill.switchToLatestWindow(driver);
	    	Thread.sleep(500);
	    	driver.manage().window().maximize();
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectAnesthesia);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectBiopsy);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectAnyDrain);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectSpongeCount);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectImplantUsed);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickSaveBtn, "Clicked on The Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveYesBtn, "Clicked on The Save Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(2000);
	    	CommanUtill.clickByJSFunction(ClickVerifyBtn, "Clicked on The Verify Button");
	    	Thread.sleep(2000);
	    	CommanUtill.clickFunction(CLickVerifyYesBtn, "Clicked on The Verify Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(500);
	    	driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    	
	    }
	    
	    public void PreOTNotes(String Facility, String Station, String Operative1) throws IOException, InterruptedException {
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
	    	CommanUtill.clickByJSFunction(ClickDoctorNotes, "Clicked on The Doctor Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickPreOperative, "Clicked on The PreOperative Notes");
	    	Thread.sleep(500);
	    //	CommanUtill.dropdownSelectByVisibleText(SelectPreOpeTemplate, Operative1);
	    	CommanUtill.selectSecondOptionFromAnyDropdown(SelectPreOpeTemplate);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSearch1, "Clicked on The Search Icon");
	    	Thread.sleep(500);
	    	CommanUtill.switchToLatestWindow(driver);
	    	Thread.sleep(500);
	    	driver.manage().window().maximize();
	    /*	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select1);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select2);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select3);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select4);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select5);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select6);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select7);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select8);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select9);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select10);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select11);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select12);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select13);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select14);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select15);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select16);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select17);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Select18);
	    	Thread.sleep(500);*/
	    	CommanUtill.clickByJSFunction(ClickSaveBtn, "Clicked on The Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveYesBtn, "Clicked on The Save Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(2000);
	    	CommanUtill.clickByJSFunction(ClickVerifyBtn, "Clicked on The Verify Button");
	    	Thread.sleep(2000);
	    	CommanUtill.clickFunction(CLickVerifyYesBtn, "Clicked on The Verify Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(1000);
	    	driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    }
	    
	    public void VisitNotes(String Facility, String Station, String VisitNote, String text) throws IOException, InterruptedException {
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
	    	CommanUtill.clickByJSFunction(ClickDoctorNotes, "Clicked on The Doctor Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickVisitNote, "Clicked on The Visit Notes");
	    	Thread.sleep(500);
	    	//CommanUtill.dropdownSelectByVisibleText(SelectVisitNote, VisitNote);
	    	CommanUtill.selectSecondOptionFromAnyDropdown(SelectVisitNote);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickAddVisitNoteBtn, "Clicked on The Visit Note Add Button");
	    	Thread.sleep(500);
	    	CommanUtill.switchToLatestWindow(driver);
	    	Thread.sleep(500);
	    	enterTextInCkEditor(text);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickVisitNotesSave, "Clicked on The Visit Notes Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickVisitNoteSaveYesBtn, "Clicked on The Visit Notes Save Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(1000);
	    	CommanUtill.switchToFirstTab(driver);
	    	Thread.sleep(3000);
	    	CommanUtill.hardRefresh(driver);
	    	Thread.sleep(500);	
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickDoctorNotes, "Clicked on The Doctor Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickVisitNote, "Clicked on The Visit Notes");
	    	Thread.sleep(500);
	    	lastClickWithHighlight();
	    	Thread.sleep(500);
	    	CommanUtill.switchToLatestWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickDeleteBtn, "Clicked on The Visit Notes Delete Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunctionNoScreenShot(ClickDeleteYesButton, "Clicked on The Visit Notes Delete Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.switchToFirstTab(driver);
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    	
	    	
	    }
	    
	    public void DoctorReferral(String Facility, String Station) throws IOException, InterruptedException {
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
	    	CommanUtill.clickByJSFunction(ClickDoctorNotes, "Clicked on The DoctorNotes Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickDoctorRefferal, "Clicked on The Doctor Referral Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickConsultRadioBtn, "Clicked on The Consult Radio Btn");
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectFacilityDR);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDRSpeciality);
	    /*	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDRDoctor);*/
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDRPriority);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDoctorRef, "Clicked on The Doctor Referral Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaverefyesBtn, "Clicked on The Save Referral Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(2000);
	    	lastClickReferralWithHighlight();
	    	Thread.sleep(1500);
	    	CommanUtill.clickFunction(ClickDelete, "Clicked on The Delete Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickTransferofCare, "Clicked on The Tranfer of Care Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectFacilityDR);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDRSpeciality);
	    /*	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDRDoctor);*/
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDRPriority);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaveDoctorRef, "Clicked on The Doctor Referral Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSaverefyesBtn, "Clicked on The Save Referral Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(2000);
	    	lastClickReferralWithHighlight();
	    	Thread.sleep(2000);
	    	CommanUtill.clickFunction(ClickDelete, "Clicked on The Delete Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    	
	    }
	    
	    public void PhysicianTemplate(String Facility, String Station, String DoctorTemplate) throws IOException, InterruptedException{
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
	    	CommanUtill.clickByJSFunction(ClickDoctorNotes, "Clicked on The DoctorNotes Tab");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickDoctorTemplate, "Clicked on The Physician Template Tab ");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectDoctorTemplate, DoctorTemplate);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPhysicianTempSearch, "Clcked on The Search Icon Button");
	    	Thread.sleep(500);
	    	CommanUtill.switchToLatestWindow(driver);
	    	Thread.sleep(500);
	    	driver.manage().window().maximize();
	   /* 	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Selectselect1);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Selectselect2);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Selectselect3);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Selectselect4);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Selectselect5);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(Selectselect6);
	    	Thread.sleep(500);*/
	    	CommanUtill.clickByJSFunction(ClickSaveBtn1, "Clicked on The Physician Template Save Button");
	    	Thread.sleep(500);
	      	verifySuccessPopup(driver);
	      	Thread.sleep(2000);
	    	CommanUtill.clickByJSFunction(ClickVerifyBtn1, "Clicked on The Physician Template Verify Button");
	    	Thread.sleep(2000);
	    	CommanUtill.clickFunction(CLickVerifyYesBtn, "Clicked on The Verify Yes Button");
	    	Thread.sleep(500);
	      	verifySuccessPopup(driver);
	     	Thread.sleep(1000);
	     	driver.switchTo().defaultContent();
	     	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage(); 
	    }
	    }

