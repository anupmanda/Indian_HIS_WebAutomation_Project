/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
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
 *
 * 31 Dec 2025
 */
public class ADT_Deposit_Refund extends GeneralBrowserSetting {
	
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";   
    protected static String SelectFacility = "//*[@id=\"Facility\"]";
    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickDepositRefundLink = "/html/body/nav/ul/li[7]/a";
    protected static String ClickDepositRefund = "/html/body/nav/ul/li[7]/ul/li[1]/a";
    
    protected static String TextUHID = "//*[@id=\"uHid\"]";
    protected static String TextAmount = "//*[@id=\"Amount\"]";
    protected static String SelectPaymentMode = "//*[@id=\"multiPaymentDropDown\"]";
    protected static String ClickAddButton = "//*[@id=\"addMultiMode\"]";
    protected static String SelectRelationShip = "//*[@id=\"ip_relationship\"]";
    protected static String ClickDeposit = "//*[@id=\"Deposit\"]";
    protected static String TextAmount1 = "//*[@id=\"amount\"]";
    protected static String ClickDepositYes = "//*[@id=\"btnDepositeYes\"]"; 
    protected static String ClickDepositYes1 = "//*[@id=\"btnDepositYes\"]";
    
    protected static String ClickCashRadioButton = "//*[@id=\"Cash_\"]";
    protected static String ClickChequeRadioButton = "//*[@id=\"Cheque_\"]";
    protected static String ClickCreditRadioButton = "//*[@id=\"Credit_\"]";
    protected static String ClickDebitRadioButton = "//*[@id=\"Debit_\"]";
    protected static String ClickNEFTRadioButton = "//*[@id=\"Neft_\"]";
    protected static String ClickOtherRadioButton = "//*[@id=\"Other_\"]";
    
    protected static String ClickRefundIcon = "//*[@id=\"opbilldiagnostic\"]";
    protected static String TextRefundAmount = "//*[@id=\"RA_Refund\"]";
    protected static String ClickRefund = "//*[@id=\"Refund\"]";
    protected static String ClickRefundyesBTN = "//*[@id=\"btnRefundYes\"]";
    protected static String ClickClear = "/html/body/div[2]/div[4]/a[5]"; 
    protected static String CickRefundCashRadioButton = "//*[@id=\"Refund_cash\"]";
    
    protected static String TextUHIDOPIP = "//*[@id=\"uHid\"]";
    protected static String ClickOPDeposit = "//*[@id=\"opDeposit\"]";
    protected static String ClickOPDepositSave = "//*[@id=\"OpDeposit\"]";
    protected static String ClickOpDepositYes = "//*[@id=\"btnOPDepositeYes\"]";
    
    
    public boolean isPaymentModeDisplayed() {
        try {
            return driver.findElement(By.xpath(SelectPaymentMode)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    
    public void DepositRefundConfigHandler(String Facility,String Station, String UHID,String Amount,String PaymentMode,String Relation
    		) throws IOException, InterruptedException {	
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500); 
    	CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button"); 
    	Thread.sleep(500); 
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station); 
    	Thread.sleep(500); 
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button.........."); 
    	Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickDepositRefundLink, "Clicked Deposit Refund Link");
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickDepositRefund, "Clicked Deposit Refund");
        Thread.sleep(500);
        CommanUtill.switchToNewWindow(driver);
        Thread.sleep(500);

        if (isPaymentModeDisplayed()) {
            System.out.println("Deposit Refund Configuration ON (Payment Mode Present)");
            DepositRefundConfigON(UHID, Amount, PaymentMode, Relation);
        } else {
            System.out.println("Deposit Refund Configuration OFF (Payment Mode Not Present)");
            DepositRefundConfigOFF(UHID, Amount, Relation);
        }
    }

    
    public void DepositRefundConfigON(String UHID, String Amount, String PaymentMode, String Relation) throws IOException, InterruptedException {
        CommanUtill.textEnter(TextUHID, UHID);
        Thread.sleep(500);
        CommanUtill.pressEnter(TextUHID);
        Thread.sleep(500);
        CommanUtill.textEnter(TextAmount, Amount);
        Thread.sleep(500);
        CommanUtill.dropdownSelectByVisibleText(SelectPaymentMode, PaymentMode);
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickAddButton, "Clicked on The Add Button........");
        Thread.sleep(500);
        CommanUtill.textEnter(TextAmount1, Amount);
        CommanUtill.dropdownSelectByVisibleText(SelectRelationShip, Relation);
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickDeposit, "Clicked on The Deposit Icon Button.......");
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickDepositYes, "Clicked on The Deposit Yes Button");
    }

    public void DepositRefundConfigOFF(String UHID, String Amount, String Relation) throws IOException, InterruptedException {
        CommanUtill.textEnter(TextUHID, UHID);
        Thread.sleep(500);
        CommanUtill.pressEnter(TextUHID);
        Thread.sleep(500);
        CommanUtill.textEnter(TextAmount, Amount);
        Thread.sleep(500);
        CommanUtill.dropdownSelectByVisibleText(SelectRelationShip, Relation);
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickDeposit, "Clicked on The Deposit Icon Button.......");
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickDepositYes1, "Clicked on The Deposit Yes Button");
    }
  
    public boolean verifyFileUploadSuccess(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p");             
            WebElement message =wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
            String msgText = message.getText().trim();
            System.out.println("Popup Message : " + msgText);
            return msgText.contains("Deposit taken successfully!")|| msgText.contains("Refund given successfully!");
        } catch (TimeoutException e) {
            System.out.println("❌ Success popup not displayed");
            return false;
        }
    }

    public void clickLastRefundZeroRow() throws InterruptedException, IOException {

        List<WebElement> rows = driver.findElements( By.xpath("//*[@id='tbldeposit']/tbody/tr"));
               
        boolean clicked = false;
        for (int i = rows.size(); i >= 1; i--) {

            String refundXpath = "//*[@id='tbldeposit']/tbody/tr[" + i + "]/td[6]";
            WebElement refundCell = driver.findElement(By.xpath(refundXpath));

            String refundValue = refundCell.getText().trim();

            if (refundValue.equals("0") || refundValue.equals("0.0")) {
                CommanUtill.clickFunction(refundXpath, 
                        "Clicked Refund 0 at row " + i);
                System.out.println("Clicked Refund=0 at row: " + i);
                clicked = true;
                break;
            }
        }

        if (!clicked) {
            System.out.println("No Refund = 0 row found");
        }
    }


    public void Refund(String UHID, String Amount) throws IOException, InterruptedException {
    	CommanUtill.clickByJSFunction(ClickClear, "Clicked on The Clear Button........");
    	Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickRefundIcon, "Clicked on The Refund Icon");
        Thread.sleep(500);
    	CommanUtill.textEnter(TextUHID, UHID);
        Thread.sleep(500);
        CommanUtill.pressEnter(TextUHID);     
        Thread.sleep(500);
        clickLastRefundZeroRow();
        Thread.sleep(500);
        CommanUtill.clickFunction(CickRefundCashRadioButton, "Clicked on The Refund Cash Radio Button");
        Thread.sleep(500);
        CommanUtill.textEnter(TextRefundAmount, Amount);  
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickRefund, "Clicked on The Refund");
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickRefundyesBTN, "Clicked on The Refund Yes Button");
        
    }
    
    public void Refund1(String Facility, String Station,String UHID, String Amount) throws IOException, InterruptedException {
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500); 
    	CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button"); 
    	Thread.sleep(500); 
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station); 
    	Thread.sleep(500); 
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button.........."); 
    	Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickDepositRefundLink, "Clicked Deposit Refund Link");
        Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickDepositRefund, "Clicked Deposit Refund");
        Thread.sleep(500);
        CommanUtill.switchToNewWindow(driver);
        Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickClear, "Clicked on The Clear Button........");
    	Thread.sleep(500);
        CommanUtill.clickByJSFunction(ClickRefundIcon, "Clicked on The Refund Icon");
        Thread.sleep(500);
    	CommanUtill.textEnter(TextUHID, UHID);
        Thread.sleep(500);
        CommanUtill.pressEnter(TextUHID);     
        Thread.sleep(500);
        clickLastRefundZeroRow();
        Thread.sleep(500);
        CommanUtill.clickFunction(CickRefundCashRadioButton, "Clicked on The Refund Cash Radio Button");
        Thread.sleep(500);
        CommanUtill.textEnter(TextRefundAmount, Amount);  
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickRefund, "Clicked on The Refund");
        Thread.sleep(500);
        CommanUtill.clickFunction(ClickRefundyesBTN, "Clicked on The Refund Yes Button");
        
    }
    
  
    
   /* public void ClickFirstAvailable_StoreBalance_EnterTransferAmount() throws InterruptedException {

        int row = 1;
        String balanceValue = "";

        while (true) {

            String checkboxXpath = "//*[@id='optbldeposit']/tbody/tr[" + row + "]/td[10]//input";

            String balanceXpath = "//*[@id='optbldeposit']/tbody/tr[" + row + "]/td[@ctype='balance']";

            String transferAmtXpath = "//*[@id='optbldeposit']/tbody/tr[" + row + "]//input[@id='TAmt']";

            List<WebElement> checkboxes = driver.findElements(By.xpath(checkboxXpath));

            if (!checkboxes.isEmpty()) {

                WebElement checkbox = checkboxes.get(0);

                if (checkbox.isDisplayed() && checkbox.isEnabled()) {

                    try {
                  
                        WebElement balanceElement = driver.findElement(By.xpath(balanceXpath));
                        balanceValue = balanceElement.getText().trim();

                        System.out.println("Balance at row " + row + " = " + balanceValue);

                        WebElement transferAmtInput = driver.findElement(By.xpath(transferAmtXpath));
                        transferAmtInput.clear();
                        transferAmtInput.sendKeys(balanceValue);

                        System.out.println("Entered Transfer Amount: " + balanceValue);

                        checkbox.click();
                        System.out.println("Checkbox clicked at row: " + row);

                        break;

                    } catch (Exception e) {
                        System.out.println("Error occurred at row: " + row);
                    }
                }
            }

            row++;
            Thread.sleep(500);

            if (row > 50) {
                System.out.println("No valid row found till row 50");
                break;
            }
        }
    }*/
    
    public void ClickFirstAvailable_StoreBalance_EnterTransferAmount() throws InterruptedException {

        int row = 1;

        while (true) {

            String checkboxXpath = "//*[@id='optbldeposit']/tbody/tr[" + row + "]/td[10]//input";
            String balanceXpath  = "//*[@id='optbldeposit']/tbody/tr[" + row + "]/td[@ctype='balance']";
            String transferAmtXpath = "//*[@id='optbldeposit']/tbody/tr[" + row + "]//input[@id='TAmt']";

            List<WebElement> checkboxes = driver.findElements(By.xpath(checkboxXpath));

            if (!checkboxes.isEmpty()) {

                WebElement checkbox = checkboxes.get(0);

                if (checkbox.isDisplayed() && checkbox.isEnabled()) {

                    try {

                        WebElement balanceElement = driver.findElement(By.xpath(balanceXpath));
                        String balanceText = balanceElement.getText().trim();
                        double balanceValue = Double.parseDouble(balanceText.replace(",", ""));

                        System.out.println("Balance at row " + row + " = " + balanceValue);
                        if (balanceValue <= 0) {
                            System.out.println("Balance is zero or negative, moving to next row");
                            row++;
                            continue;
                        }

                        WebElement transferAmtInput = driver.findElement(By.xpath(transferAmtXpath));
                        transferAmtInput.clear();
                        transferAmtInput.sendKeys(String.valueOf(balanceValue));

                        System.out.println("Entered Transfer Amount: " + balanceValue);

                        checkbox.click();
                        System.out.println("Checkbox clicked at row: " + row);

                        break;

                    } catch (Exception e) {
                        System.out.println("Error occurred at row: " + row + " - " + e.getMessage());
                    }
                }
            }

            row++;
            Thread.sleep(500);

            if (row > 50) {
                System.out.println("No valid row found till row 50");
                break;
            }
        }
    }


 public void OPToIPDeposit(String Facility, String Station,String UHIDOPIP) throws IOException, InterruptedException {
	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
 	 Thread.sleep(500); 
 	 CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button"); 
 	 Thread.sleep(500); 
 	 CommanUtill.dropdownSelectByVisibleText(SelectStation, Station); 
 	 Thread.sleep(500); 
 	 CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button.........."); 
 	 Thread.sleep(500);
     CommanUtill.clickByJSFunction(ClickDepositRefundLink, "Clicked Deposit Refund Link");
     Thread.sleep(500);
     CommanUtill.clickByJSFunction(ClickDepositRefund, "Clicked Deposit Refund");
     Thread.sleep(500);
     CommanUtill.switchToNewWindow(driver);
     Thread.sleep(500);
     CommanUtill.clickFunction(ClickOPDeposit, "Clicked on The OPToIPDeposit"); 
     Thread.sleep(500);
	 CommanUtill.textEnter(TextUHIDOPIP, UHIDOPIP);
	 Thread.sleep(500);
	 CommanUtill.pressEnter(TextUHIDOPIP);
	 Thread.sleep(500);
	 ClickFirstAvailable_StoreBalance_EnterTransferAmount();
	 Thread.sleep(500);
	 CommanUtill.clickByJSFunction(ClickOPDepositSave, "Clicked on The OPIP Deposit Save");
	 Thread.sleep(500);
	 CommanUtill.clickFunction(ClickOpDepositYes, "Clicked on The OP Deposit Yes Button");
}
 
 
 public void clickDepositYesIfPresent(WebDriver driver) {
	    List<By> depositYesButtons = Arrays.asList(
	            By.xpath("//*[@id='btnDepositeYes']"),
	            By.xpath("//*[@id='btnDepositYes']")
	    );

	    for (By locator : depositYesButtons) {
	        List<WebElement> elements = driver.findElements(locator);
	        if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
	            elements.get(0).click();
	            System.out.println("Clicked Deposit Yes button using: " + locator);
	            return;
	        }
	    }

	    throw new NoSuchElementException("Neither Deposit Yes button was found on the page");
	}

    
 public void ChequeInHandDeposit() throws IOException, InterruptedException {
	 CommanUtill.clickByJSFunction(ClickDeposit, "Clicked on The Deposit Icon Button.......");
     Thread.sleep(500);
     clickDepositYesIfPresent(driver);
     Thread.sleep(500);
     CommanUtill.switchToNewWindow(driver);
     Thread.sleep(500);    
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("location.reload(true);");

 }
}
