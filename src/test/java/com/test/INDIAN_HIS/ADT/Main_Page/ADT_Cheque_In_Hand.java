/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
 * 02 Jan 2026
 */
public class ADT_Cheque_In_Hand extends GeneralBrowserSetting{
	
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";   
    protected static String SelectFacility = "//*[@id=\"Facility\"]";
    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickChequeInHandLink = "//*[@id=\"menu\"]/ul/li[6]/a";
   
    protected static String TextUHID = "//*[@id=\"uhid_admimitPatient\"]";
    protected static String TextAmount = "//*[@id=\"txtamt\"]";
    protected static String TextCheueNo = "//*[@id=\"txtChequeNo\"]";
    protected static String SelectBankName = "//*[@id=\"ddlbankname\"]";
    protected static String TextBranchName = "//*[@id=\"txtBranchName\"]";
    protected static String TextRemarks = "//*[@id=\"txtremark\"]";
    protected static String ClickCheqSaveBtn = "//*[@id=\"btnsave\"]";
    protected static String ClickChequeSaveYesBTN= "//*[@id=\"btnsaveYes\"]";

	
    public void ClickLastPinkRow_AddToDeposit() throws InterruptedException {

        int lastPinkRow = -1;

        for (int row = 1; row <= 20; row++) {

            String rowXpath = "//*[@id='tblchequedtl']/tbody/tr[" + row + "]";
            List<WebElement> rows = driver.findElements(By.xpath(rowXpath));

            if (rows.isEmpty()) {
                break;
            }

            WebElement currentRow = rows.get(0);
            String bgColor = currentRow.getCssValue("background-color");
            System.out.println("Row " + row + " color : " + bgColor);

            if (bgColor.contains("248") || bgColor.contains("255, 192") || bgColor.contains("pink")) {
                lastPinkRow = row;
            }
        }

        if (lastPinkRow == -1) {
            System.out.println("❌ No pink row found");
            return;
        }

        System.out.println("✅ Last Pink Row Number : " + lastPinkRow);

        String finalClickXpath =
                "/html/body/div[6]/div[1]/div/div/table/tbody/tr[" + lastPinkRow + "]/td[7]";

        WebElement clickElement = driver.findElement(By.xpath(finalClickXpath));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", clickElement);

        Thread.sleep(500);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", clickElement);

        System.out.println("✅ JS Clicked on : " + finalClickXpath);
    }


    public boolean verifyPOPUPs(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p[contains(text(),'Save Successfully')]");
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
            String msgText = message.getText().trim();
            System.out.println("Popup Message : " + msgText);

            return msgText.contains("Save Successfully");

        } catch (TimeoutException e) {
            System.out.println("❌ Save Successfully popup not displayed");
            return false;
        }
    } 

	public void ChequeInHand(String Facility, String Station, String UHID, String Amount, String BankName ,
			String BranchName, String Remarks) throws IOException, InterruptedException {
		CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickChequeInHandLink, "Click on The Cheque in Hand Link");
		Thread.sleep(500);
		CommanUtill.textEnter(TextUHID, UHID);
		Thread.sleep(500);
		CommanUtill.pressEnter(TextUHID);
		Thread.sleep(500);
		CommanUtill.textEnter(TextAmount, Amount);
		Thread.sleep(500);
		CommanUtill.textEnter(TextCheueNo, CommanUtill.generateRandomMobileNumber6());
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectBankName, BankName);
		Thread.sleep(500);
		CommanUtill.textEnter(TextBranchName, BranchName);
		Thread.sleep(500);
		CommanUtill.textEnter(TextRemarks, Remarks);
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickCheqSaveBtn, "Clicked on The Save Cheque Button");
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickChequeSaveYesBTN, "Clicked on The Save Cheque Yes Button");
		Thread.sleep(500);
		verifyPOPUPs(driver);
		Thread.sleep(500);
		ClickLastPinkRow_AddToDeposit();
		Thread.sleep(500);
		CommanUtill.switchToNewWindow(driver);
	}
	
	public void AfterRefreshCheck(String UHID) throws IOException, InterruptedException {
		CommanUtill.textEnter(TextUHID, UHID);
		Thread.sleep(500);
		CommanUtill.pressEnter(TextUHID);
		Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='chequein_hand-table']//tr"));
		WebElement lastRow = rows.get(rows.size() - 1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", lastRow);


	}
	
}
