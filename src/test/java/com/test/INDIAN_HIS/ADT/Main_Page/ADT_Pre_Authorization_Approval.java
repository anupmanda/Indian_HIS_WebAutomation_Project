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

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 22 Dec 2025
**/

public class ADT_Pre_Authorization_Approval extends GeneralBrowserSetting {

    protected static String ClickIFPressent = "//*[@id='btnNoChangePass']";
    protected static String SelectFacility = "//*[@id='Facility']";
    protected static String ClickADTBTN = "//*[@id='btn_adt']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickAdmitPatientLink = "//*[@id='FOAddPatientMenu']";
    protected static String ClickPreAuthorization = "//*[@id='FOAddPatientMenu']/ul/li[9]/a";

    protected static String TextUHID = "//*[@id='text_uhid']";
    protected static String SelectSpeciality = "//*[@id='_Speciality']";
    protected static String SelectDoctor = "//*[@id='_Doctor']";
    protected static String SelectRequestType = "//*[@id='_RequestType']";
    protected static String SelectCompanyType = "//*[@id='_CompanyType']";
    protected static String SelectCompanyName = "//*[@id='_CompanyName']";
    protected static String SelectRateContract = "//*[@id='_RateContract']";
    protected static String SelectApprovalStatus = "//*[@id='_ApprovalStatus']";
    protected static String TextFromDate = "//*[@id='f_date']";
    protected static String TextToDate = "//*[@id='to_date']";
    protected static String ClickSearch = "//*[@id=\"date_search\"]";
    
    protected static String ClickUploadButton = "//*[@id=\"upload\"]";
    protected static String TextDocumentName = "//*[@id=\"docName\"]";
    protected static String SelectDocumentType = "//*[@id=\"drdpopupdocType\"]";
    protected static String ClickChooseFile = "//*[@id=\"filename\"]";
    protected static String ClickUploadSaveBTN = "//*[@id=\"btnSave\"]";
    protected static String CLickSaveYesBTN = "//*[@ID=\"_uploaddocumentYes\"]";
                     String filePath = System.getProperty("user.dir")
                                       + "\\InputData\\OPDP237850.pdf";

    
    
    public void PreAuthorizationApproval(String Facility, String Station, String Date) throws InterruptedException, IOException {

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
        CommanUtill.clickByJSFunction(ClickPreAuthorization, "Clicked Pre Authorization");
        Thread.sleep(500);
        CommanUtill.textEnter(TextFromDate, Date);
        Thread.sleep(500);
        CommanUtill.pressEnter(TextFromDate);
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickSearch, "Clicked on The Serach Icon Button");
    }

    public void clickFirstAvailableCheckbox() throws IOException, InterruptedException {

        for (int i = 0; i < 10; i++) {

            String xpath = "//*[@id='chk_" + i + "']";
            List<WebElement> elements = driver.findElements(By.xpath(xpath));

            if (!elements.isEmpty()) {

                WebElement checkbox = elements.get(0);

                if (checkbox.isDisplayed() && checkbox.isEnabled()) {
                   // checkbox.click();
                    CommanUtill.clickFunction(xpath, "Checkbox Clicked");
                    break;
                }
            }
        }
    }
    
    public void clickFirstAvailablePreAuthIcon() throws InterruptedException {

        int row = 1;

        while (true) {
            String xpath = "//*[@id='tbl_preAuthApp']/tbody/tr[" + row + "]/td[11]/i";

            List<WebElement> icons = driver.findElements(By.xpath(xpath));

            if (!icons.isEmpty()) {
                WebElement icon = icons.get(0);

                if (icon.isDisplayed() && icon.isEnabled()) {
                    try {
                       // icon.click();
                        CommanUtill.clickFunction(xpath, "Checkbox Clicked");
                        System.out.println("Clicked on row: " + row);
                        break; 
                    } catch (Exception e) {
                        System.out.println("Found but could not click at row: " + row);
                    }
                }
            }

            row++;
            Thread.sleep(500);

            if (row > 50) {
                System.out.println("No clickable icon found till row 50");
                break;
            }
        }
    }
    public void clickFirstAvailablePreAuthIconTd14() throws InterruptedException {

        int row = 1;

        while (true) {
            String xpath = "//*[@id='tbl_preAuthApp']/tbody/tr[" + row + "]/td[14]/i";

            List<WebElement> icons = driver.findElements(By.xpath(xpath));

            if (!icons.isEmpty()) {
                WebElement icon = icons.get(0);

                if (icon.isDisplayed() && icon.isEnabled()) {
                    try {
                      //  icon.click();
                        CommanUtill.clickFunction(xpath, "Checkbox Clicked");
                        System.out.println("Clicked td[14] icon at row: " + row);
                        break; 
                    } catch (Exception e) {
                        System.out.println("Found but could not click td[14] at row: " + row);
                    }
                }
            }

            row++;
            Thread.sleep(500);

            if (row > 50) {
                System.out.println("No clickable td[14] icon found till row 50");
                break;
            }
        }
    }

    public void clickFirstAvailablePreAuthIconTd15() throws InterruptedException {

        int row = 1;

        while (true) {
            String xpath = "//*[@id='tbl_preAuthApp']/tbody/tr[" + row + "]/td[15]/i";

            List<WebElement> icons = driver.findElements(By.xpath(xpath));

            if (!icons.isEmpty()) {
                WebElement icon = icons.get(0);

                if (icon.isDisplayed() && icon.isEnabled()) {
                    try {
                       // icon.click();
                        CommanUtill.clickFunction(xpath, "Checkbox Clicked");
                        System.out.println("Clicked td[15] icon at row: " + row);
                        break;
                    } catch (Exception e) {
                        System.out.println("Found but could not click td[15] at row: " + row);
                    }
                }
            }

            row++;
            Thread.sleep(500);

            if (row > 50) {
                System.out.println("No clickable td[15] icon found till row 50");
                break;
            }
        }
    }

    
    public void clickLastTdIfPresent(WebDriver driver) {
        try {
            List<WebElement> elements = driver.findElements(
                By.xpath("//*[@id='apid1']/tbody/tr/td[6]")
            );

            if (!elements.isEmpty()) {
                WebElement lastElement = elements.get(elements.size() - 1);
                lastElement.click();
                System.out.println("✅ Last td[6] clicked successfully");
            } else {
                System.out.println("⚠️ td[6] element not found, skipping click");
            }

        } catch (Exception e) {
            System.out.println("❌ Exception occurred but script will continue");
        }
    }



    
    public void UploadandSaveDocument(String DocumentName, String DocumentType)
            throws IOException, InterruptedException {

    	CommanUtill.clickFunction(ClickUploadButton, "Clicked on The Upload Button");
        Thread.sleep(500);
        CommanUtill.textEnter(TextDocumentName, DocumentName);
        Thread.sleep(500);
        CommanUtill.dropdownSelectByVisibleText(SelectDocumentType, DocumentType);
        Thread.sleep(500);
        WebElement uploadInput = driver.findElement(By.id("filename"));
        uploadInput.sendKeys(filePath);
        Thread.sleep(3000);
        CommanUtill.clickFunction(ClickUploadSaveBTN, "Clicked on The Upload Save Button");
        Thread.sleep(500);
        CommanUtill.clickFunction(CLickSaveYesBTN, "Clicked on The Upload Save Button");
    }


    public boolean verifyFileUploadSuccess(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p[contains(text(),'File uploaded successfully')]");
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
            String msgText = message.getText().trim();
            System.out.println("Popup Message : " + msgText);

            return msgText.contains("File uploaded successfully");

        } catch (TimeoutException e) {
            System.out.println("❌ File upload success popup not displayed");
            return false;
        }
    }

    }



