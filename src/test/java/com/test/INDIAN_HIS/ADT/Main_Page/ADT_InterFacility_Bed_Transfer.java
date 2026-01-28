/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 30 Dec 2025
 */
public class ADT_InterFacility_Bed_Transfer extends GeneralBrowserSetting{
	
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
    protected static String SelectFacility = "//*[@id=\"Facility\"]";
    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickBedTransferLink = "//*[@id=\"FOBedTranferMenu\"]/a";
    protected static String ClickInterfacilityBedTransfer = "//*[@id=\"FOBedTranferMenu\"]/ul/li[2]/a";
    
    protected static String SelectRequestedBedType = "//*[@id=\"Req_bedtype\"]";
    protected static String SelectBillableBedType = "//*[@id=\"billtype\"]";
    protected static String SelectWard = "//*[@id=\"ward_type\"]";
    protected static String SelectBed = "//*[@id=\"bed_type\"]";
    protected static String ClickSave = "//*[@id=\"PopSaveEmergencyPatient\"]";
    
    protected static String ClickConsultant = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[2]/a";
    protected static String TextLengthofStay = "//*[@id=\"Expected_stay\"]";
    protected static String ClickBedPaymentDetails = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[3]/a";
    protected static String SelectBedType = "//*[@id=\"Req_bedtype\"]";
    protected static String SelectAllotedBedType = "//*[@id=\"All_type\"]";
    protected static String SelectWardType = "//*[@id=\"ward_type\"]";

    protected static String ClickSaveBed = "//*[@id=\"PopSaveEmergencyPatient\"]";
    
    
    public boolean isBedTypeAvailabe() {
        try {
            return driver.findElement(By.xpath(SelectRequestedBedType)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    
    public void closeTransferPatientPopupIfVisible() {

        if (driver.findElements(By.xpath("//*[@id='closeTransfer']")).size() > 0) {

            driver.findElement(By.xpath("//*[@id='closeTransfer']")).click();
            System.out.println("✅ Transfer Patient popup closed");
        }
    }

    
    public void clickAddUntilAdmitPatientOpens() throws InterruptedException {

        int i = 1;

        while (true) {

            if (driver.findElements(By.xpath("//h3[text()='Admit Patient']")).size() > 0) {
                System.out.println("✅ Admit Patient screen opened, loop stopped");
                return;
            }

            if (driver.findElements(By.xpath("//*[@id='transfertbl']/tbody/tr[" + i + "]")).size() == 0) {
                System.out.println("❌ No more rows available, stopping loop");
                return;
            }

            driver.findElement( By.xpath("//*[@id='transfertbl']/tbody/tr[" + i + "]/td[12]")).click();
            Thread.sleep(1500);

            if (driver.findElements(By.xpath("//*[@id='closeTransfer']")).size() > 0) {
                driver.findElement(By.xpath("//*[@id='closeTransfer']")).click();
                Thread.sleep(500);
            }

            i++;
        }
    }

    public void clickFirstAvailableADdBTN() throws InterruptedException {

        int row = 1;

        while (true) {
            String xpath = "//*[@id=\"transfertbl\"]/tbody/tr[\" + row + \"]/td[12]/button";  

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
    
    public void clickFirstRow() throws InterruptedException, IOException {

        List<WebElement> rows =
                driver.findElements(By.xpath("//*[@id='transfertbl']/tbody/tr"));

        boolean clicked = false;

        for (int i = 1; i <= rows.size(); i++) {

            String RowXpath =
                    "//*[@id='transfertbl']/tbody/tr[" + i + "]/td[12]/button";

            try {
                WebElement button = driver.findElement(By.xpath(RowXpath));

                if (button.isDisplayed() && button.isEnabled()) {

                    CommanUtill.clickFunction(
                            RowXpath,
                            "Clicked button at row " + i
                    );

                    System.out.println("Clicked button at row: " + i);
                    clicked = true;
                    break; 
                }

            } catch (Exception e) {
                continue;
            }
        }

        if (!clicked) {
            System.out.println("No clickable button found in table");
        }
    }


    
    public void InterFacilityBedTransfer(String Facility, String Station,String RequestedBedType, String BillableBedType, String Stay, String BedType, String Ward, String Ward1) throws IOException, InterruptedException {
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         Thread.sleep(500);
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
         Thread.sleep(500);
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         Thread.sleep(500);
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button");
         Thread.sleep(500);
         CommanUtill.clickByJSFunction(ClickBedTransferLink, "Clicked on The Bed TransferLink");
         Thread.sleep(500);
         CommanUtill.clickByJSFunction(ClickInterfacilityBedTransfer, "Clicked on The InterFacility Bed Transfer");
         Thread.sleep(500);
         clickFirstRow();
         if (isBedTypeAvailabe()) {
             System.out.println("Deposit Refund Configuration ON (Payment Mode Present)");
             SelectBed(RequestedBedType, BillableBedType, Ward);
         } else {
             System.out.println("Deposit Refund Configuration OFF (Payment Mode Not Present)");
             InterFacilityBedTransferAdmitPatient(Stay, BedType, Ward1);
         }
     }

    public void SelectBed(String RequestedBedType, String BillableBedType, String Ward) throws IOException, InterruptedException {
    
    	CommanUtill.dropdownSelectByVisibleText(SelectRequestedBedType, RequestedBedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectBillableBedType, BillableBedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveBed, "Clicked on The Bed Save Button");
    	
    }
    
    public void InterFacilityBedTransferAdmitPatient(String Stay, String BedType, String Ward1) throws IOException, InterruptedException {
    	CommanUtill.clickFunction(ClickConsultant, "Click on The Consultant");
    	Thread.sleep(500);
    	CommanUtill.clearTextField(TextLengthofStay, "TextField Will Be Cleared");
      	Thread.sleep(500);
    	CommanUtill.textEnter(TextLengthofStay, Stay);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickBedPaymentDetails, "Clicked on The Bed and Payments Details");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward1);
    }
}
