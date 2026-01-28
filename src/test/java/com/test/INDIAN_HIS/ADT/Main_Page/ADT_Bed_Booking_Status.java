/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
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
 * 9 Dec 2025
 */
public class ADT_Bed_Booking_Status extends GeneralBrowserSetting {

	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	protected static String SelectFacility = "//*[@id=\"Facility\"]";
	protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
    protected static String ClickBookingStatus = "//*[@id=\"FOAddPatientMenu\"]/ul/li[3]/a";
    protected static String TextWLNO = "//*[@id=\"txtWLNo\"]";
    protected static String TextIPNO = "//*[@id=\"txtIPNo\"]";
    protected static String SelectBookingType = "//*[@id=\"drpbookingType\"]"; 
    protected static String SelectBookingStatus = "//*[@id=\"drpStatus\"]";
    protected static String SelectBedType = "//*[@id=\"drpBedType\"]";
    protected static String SelectDoctor = "//*[@id=\"drpdoctorname\"]";
    protected static String ClickExpectedDOA = "//*[@id=\"chkExpectedDOA\"]";
    protected static String TextExpectedDOA = "//*[@id=\"txtexpctdate\"]";
    protected static String ClickBookingDate = "//*[@id=\"chkBookingDOA\"]";
    protected static String TextBookingDate = "//*[@id=\"txtexpctdate\"]";
    protected static String ClickSearch = "//*[@id=\"bTNLoad\"]";
    
    protected static String SelectRequestedBedType = "//*[@id=\"Req_bedtype\"]";
    protected static String SelectAllotedBedType = "//*[@id=\"All_type\"]";
    protected static String SelectWardType = "//*[@id=\"ward_type\"]";
    protected static String SelectBed = "//*[@id=\"bed_type\"]";
    protected static String ClickSave = "//*[@id=\"_btnsave\"]";
//*****************************************************************************************************************************//   
    public void clickAddButtonUsingStoredWLNo() {

        String expectedWLNo = ADT_Bed_Booking.STORED_WLNO;

        List<WebElement> rows = driver.findElements(
                By.xpath("//*[@id='tblBedBookingStatus']/tbody/tr"));

        for (int i = 1; i <= rows.size(); i++) {

            String wlXpath = "//*[@id='tblBedBookingStatus']/tbody/tr[" + i + "]/td[1]";
            String actualWLNo = driver.findElement(By.xpath(wlXpath))
                                      .getText().trim();

            if (actualWLNo.equals(expectedWLNo)) {

                String addBtnXpath =
                        "//*[@id='tblBedBookingStatus']/tbody/tr[" + i + "]/td[15]";

                WebElement addBtn = driver.findElement(By.xpath(addBtnXpath));
                addBtn.click();

                System.out.println("✔ + Button clicked for WL No: " + expectedWLNo);
                break;
            }
        }
    }

    public void clickAdmitPatientUsingStoredWLNo() {

        String expectedWLNo = ADT_Bed_Booking.STORED_WLNO;

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='tblBedBookingStatus']/tbody/tr"));
                
        for (int i = 1; i <= rows.size(); i++) {

            String wlXpath = "//*[@id='tblBedBookingStatus']/tbody/tr[" + i + "]/td[1]";
            String actualWLNo = driver.findElement(By.xpath(wlXpath)).getText().trim();
                                      
            if (actualWLNo.equals(expectedWLNo)) {

                String addBtnXpath = "//*[@id='tblBedBookingStatus']/tbody/tr[" + i + "]/td[19]";
                        
                WebElement addBtn = driver.findElement(By.xpath(addBtnXpath));
                addBtn.click();

                System.out.println("✔ + Button clicked for WL No: " + expectedWLNo);
                break;
            }
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
                    msgText.contains("Patient has been admitted sucessfully with");
                         
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

    
    public void BookingStatus(String Facility, String Station, String ReqBedType1, String AlloBedType, String Ward) throws IOException, InterruptedException {
    	//CommanUtill.clickFunction(ClickIFPressent, "Clicked on The POPUP If Present");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickBookingStatus, "Clicked on The Booking Status Link");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextWLNO, ADT_Bed_Booking.STORED_WLNO);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSearch, "Clicked on The Serach Button");
    	Thread.sleep(500);
    	clickAddButtonUsingStoredWLNo();
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectRequestedBedType, ReqBedType1);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectAllotedBedType, AlloBedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectWardType, Ward);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSave, "Clicked on The Save Button");
    	Thread.sleep(500);   
    	clickAdmitPatientUsingStoredWLNo();
    	Thread.sleep(500);
    	
    }
}
