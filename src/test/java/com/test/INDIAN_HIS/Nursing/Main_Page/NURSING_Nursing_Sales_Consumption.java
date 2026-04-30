/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 24 Feb 2026
 */
public class NURSING_Nursing_Sales_Consumption extends GeneralBrowserSetting{
	
	protected static String SelectFacility = "//*[@id='Facility']";
    protected static String SelectStation = "//*[@id='Department']";
    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
    protected static String ClickSalesandConsumption = "/html/body/nav/ul/li[6]/a";
    protected static String ClickSalesandConsumptionLink = "/html/body/nav/ul/li[6]/ul/li[1]/a";
    protected static String TextIPNO = "//*[@id=\"txtipno\"]";
    protected static String ClickHideZeroStock = "//*[@id=\"chkzerostock\"]";
    protected static String TextSearchItems = "//*[@id=\"onloaddruglist\"]/input";
    protected static String TextQuantity = "//*[@id=\"Amt_1\"]";
    protected static String ClickSaveButton = "//*[@id=\"save\"]";
    protected static String ClickOK = "/html/body/div[4]/div[9]/div/footer/span/a";
    protected static String ClickPrintYesButton = "/html/body/div[4]/div[10]/div/footer/span/a[1]";
    
    protected static String ClickOrderSet = "//*[@id=\"OrderSetTabLi\"]/a";
    
    public boolean firstClickWithHighlight1() throws InterruptedException {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        By glitterLocator = By.xpath("//*[contains(text(),'Item already exists!')]");

        List<WebElement> rows = driver.findElements(
                By.xpath("/html/body/div[4]/div[1]/div[1]/div/div[1]/div/div[1]/div/table/tbody/tr")
        );

        int maxRows = rows.size(); 

        for (int i = 1; i <= maxRows; i++) {

            try {

                String xpath = "/html/body/div[4]/div[1]/div[1]/div/div[1]/div/div[1]/div/table/tbody/tr[" + i + "]/td[1]";

                WebElement element = wait.until(
                        ExpectedConditions.elementToBeClickable(By.xpath(xpath))
                );

                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
                log.info("Row " + i + " is clickable, applying highlight");
                System.out.println("✨ Highlighting row: " + i);

                js.executeScript(
                        "arguments[0].setAttribute('style','background: yellow; border: 3px solid blue;');",
                        element
                );

                Thread.sleep(500);

                js.executeScript("arguments[0].setAttribute('style','');", element);

                element.click();
                System.out.println("✅ Clicked row: " + i);
                logger.log(Status.PASS, "Clicked successfully on row: " + i);
                log.info("Clicked successfully on row: " + i);

                List<WebElement> glitterMsg = driver.findElements(glitterLocator);
                if (!glitterMsg.isEmpty() && glitterMsg.get(0).isDisplayed()) {
                    System.out.println("💡 Glitter appeared. Waiting to disappear...");
                    wait.until(ExpectedConditions.invisibilityOfElementLocated(glitterLocator));
                    System.out.println("💡 Glitter disappeared. Waiting 2 seconds before next row...");
                    Thread.sleep(2000); // wait 2 seconds before next click
                } else {
                    System.out.println("No glitter message. Breaking loop.");
                    break; 
                }

            } catch (Exception e) {
                logger.log(Status.WARNING, "Row " + i + " not clickable, trying next row");
                log.warn("Row " + i + " not clickable, trying next row", e);
                System.out.println("❌ Row " + i + " not clickable → Trying next row");
            }
        }

        return true;
    }
    
    public void clickRowUntilNoGlitter(WebDriver driver) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        By cellLocatorBase = By.xpath("//tr[contains(@class,'context-menu-ForOrderSetSalesConsumption')]");
        By glitterLocator = By.xpath("//*[contains(text(),'Some of the items are not added in the grid')]");

        wait.until(ExpectedConditions.presenceOfElementLocated(cellLocatorBase));

        int rowCount = driver.findElements(cellLocatorBase).size();
        System.out.println("Total rows found: " + rowCount);

        for (int i = 1; i <= rowCount; i++) {

            By cellLocator = By.xpath("(//tr[contains(@class,'context-menu-ForOrderSetSalesConsumption')])[" + i + "]/td[3]");
            WebElement cell = wait.until(ExpectedConditions.visibilityOfElementLocated(cellLocator));

            js.executeScript("arguments[0].scrollIntoView({block:'center'});", cell);

            wait.until(ExpectedConditions.elementToBeClickable(cell));

            js.executeScript("arguments[0].style.backgroundColor='yellow'; arguments[0].style.border='2px solid blue';", cell);

            cell.click();
            System.out.println("Clicked row: " + i);

            List<WebElement> glitterMsg = driver.findElements(glitterLocator);
            if (!glitterMsg.isEmpty() && glitterMsg.get(0).isDisplayed()) {
                System.out.println("Glitter appeared. Waiting for it to disappear...");
                wait.until(ExpectedConditions.invisibilityOfElementLocated(glitterLocator));
                System.out.println("Glitter disappeared.");
            }

            Thread.sleep(2000);
        }
    }
    public boolean firstClickWithHighlight() {

        logger.log(Status.INFO, "Started searching for first clickable cell in table");
        log.info("Started searching for first clickable cell in table");
        System.out.println("▶ Started searching for first clickable cell in table");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        List<WebElement> rows = driver.findElements(
                By.xpath("/html/body/div[4]/div[1]/div[1]/div/div[1]/div/div[1]/div/table/tbody/tr")
        );

        int maxRows = rows.size(); 

        for (int i = 2; i <= maxRows; i++) {

            try {

                String xpath = "/html/body/div[4]/div[1]/div[1]/div/div[1]/div/div[1]/div/table/tbody/tr[" + i + "]/td[1]";

                WebElement element = wait.until(
                        ExpectedConditions.elementToBeClickable(By.xpath(xpath))
                );

                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
                log.info("Row " + i + " is clickable, applying highlight");
                System.out.println("✨ Highlighting row: " + i);

                js.executeScript(
                        "arguments[0].setAttribute('style'," +
                        "'background: yellow; border: 3px solid blue;');",
                        element
                );

                Thread.sleep(500);

                js.executeScript(
                        "arguments[0].setAttribute('style','');",
                        element
                );

                element.click();

                logger.log(Status.PASS, "Clicked successfully on first clickable row: " + i);
                log.info("Clicked successfully on first clickable row: " + i);
                System.out.println("✅ Clicked successfully on row: " + i);

                return true;

            } catch (Exception e) {

                logger.log(Status.WARNING, "Row " + i + " not clickable, trying next row");
                log.warn("Row " + i + " not clickable, trying next row", e);
                System.out.println("❌ Row " + i + " not clickable → Trying next row");
            }
        }

        logger.log(Status.FAIL, "No clickable cell found in first " + maxRows + " rows");
        log.error("No clickable cell found in first " + maxRows + " rows");
        System.out.println("❌ No clickable cell found in first " + maxRows + " rows");

        return false;
    }
  
    public void SalesAndConsumption(String Facility, String Station,String IPNO, String Quantity) throws IOException, InterruptedException {
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSalesandConsumption, "Clciked on The Sales and Comsumption Screen");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSalesandConsumptionLink, "Clcked on The Sales and Consumption Screen Link");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextIPNO, IPNO);
    	Thread.sleep(1000);
    	CommanUtill.pressEnter(TextIPNO);
    	Thread.sleep(500);
    	WebElement checkbox = driver.findElement(By.xpath(ClickHideZeroStock));

    	if (!checkbox.isSelected()) {
    	    checkbox.click();
    	}
     /* 	Thread.sleep(500);
     	CommanUtill.textEnter(TextSearchItems, DrugName);*/
    	Thread.sleep(500);
    	firstClickWithHighlight1();
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextQuantity, Quantity);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveButton, "Clciked on The Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickOK, "Clicked on The OK Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPrintYesButton, "Clicked on The Print Yes Button");
    	Thread.sleep(500);
    	CommanUtill.ClickHomePage();
    	}
    
    public void SalesAndConsumptionOrderSet(String Facility, String Station,String IPNO) throws IOException, InterruptedException {
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSalesandConsumption, "Clciked on The Sales and Comsumption Screen");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSalesandConsumptionLink, "Clcked on The Sales and Consumption Screen Link");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextIPNO, IPNO);
    	Thread.sleep(1000);
    	CommanUtill.pressEnter(TextIPNO);
    	Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickOrderSet, "Clicked on The Order Set");
        Thread.sleep(500);
        clickRowUntilNoGlitter(driver);
        Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveButton, "Clciked on The Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickOK, "Clicked on The OK Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPrintYesButton, "Clicked on The Print Yes Button");
    	Thread.sleep(500);
    	CommanUtill.ClickHomePage();
    	}
}
