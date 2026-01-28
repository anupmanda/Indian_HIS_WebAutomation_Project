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

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 26 Dec 2025
 */
public class ADT_Release_Retained_Bed extends GeneralBrowserSetting{

	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
    protected static String SelectFacility = "//*[@id=\"Facility\"]";
    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickBedStatusLink = "//*[@id=\"FOBedTranferMenu1\"]/a";
    protected static String ClickReleaseRetainedBed = "//*[@id=\"FOBedTranferMenu1\"]/ul/li[2]/a";
    protected static String ClickReleaseYesButton = "//*[@id=\"btnYes\"]";
    
    public void ClickReleasedRetainedBed(String Facility, String Station) throws IOException, InterruptedException {
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
        CommanUtill.clickByJSFunction(ClickReleaseRetainedBed, "Clicked on The Released Retained Bed.....");
        Thread.sleep(500);
    }
    
    public void clickFirstAvailablePreAuthIcon() throws InterruptedException {

        int row = 1;

        while (true) {
            String xpath = "//*[@id=\"tblRetainRelease\"]/tbody/tr[\" + row + \"]/td[1]";  

            List<WebElement> icons = driver.findElements(By.xpath(xpath));

            if (!icons.isEmpty()) {
                WebElement icon = icons.get(0);

                if (icon.isDisplayed() && icon.isEnabled()) {
                    try {
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

         public void ClickReleaseYesBTN() throws IOException, InterruptedException {
    	 CommanUtill.clickByJSFunction(ClickReleaseYesButton, "Clicked on The Relaese Bed Yes Button....");
    }
         
         public boolean verifyFileUploadSuccess(WebDriver driver) {
             try {
                 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                 By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p[contains(text(),'Relesed')]");
                 WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
                 String msgText = message.getText().trim();
                 System.out.println("Popup Message : " + msgText);

                 return msgText.contains("Relesed");

             } catch (TimeoutException e) {
                 System.out.println("❌ File upload success popup not displayed");
                 return false;
             }
         } 
}
