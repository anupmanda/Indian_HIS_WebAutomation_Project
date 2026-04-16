/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 14-Apr-2026
 */
public class Er_SalesConsumptionPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	//=========================== Er Sales Consumption ============================
	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Sales_Consumption_page = "//a[normalize-space()='Sales/Consumption']";

	protected static String Enter_Uhid = "//input[@id='txtuhid']";
	protected static String Enter_Er_No = "//input[@id='txtipno']";
	protected static String Enter_Barcode = "//input[@id='txtbarcode']";	
	protected static String Item_Code_Drp = "//select[@id='drdItemCodeSCEM']";	
	protected static String Chkk_Box_Hide_Zero_Stock_Items = "//input[@id='chkzerostock']";	
	protected static String Drugs_Consumables_Btn = "//a[normalize-space()='Drugs & Consumables']";	
	protected static String Seaech_List_Drug = "//input[@class='searchDrugs']";

	//========================== Drug Item Table ==============================
	protected static String Click_Drug_In_Table = "//table[@id='tbldruglist']//tbody//tr[position()=1]";
	protected static String Issue_Item_Fractions_No_Pop = "//a[@id='btnFno']";
	protected static String Close_Item_Pop = "//a[@id='btn_fractionClose']";

	protected static String BATCH_DETAIL_Drug_Name_Check_Box = "//input[@name='cbdrugdetaillist']";
	protected static String Item_Description_Quenty = "//input[@id='txtquantity']";
	protected static String Remarks = "//input[@id='txtremarks']";

	protected static String save_Btn = "//a[@id='save']";
	protected static String save_Btn_Yes_Pop = "//a[normalize-space()='OK']";
   //============================== Print ==============================================

	protected static String Print_Btn = "//a[@id='print']";
	protected static String Print_From_Date = "//input[@id='txtFromDateReport']";
	protected static String Print_To_Date = "//input[@id='txtToDateReport']";
	protected static String Print_Pop = "//button[@id='btnprintpop']";
	protected static String Close_Print_Pop = "//i[@id='openPrintModalclose1']";
	
	//============================ Order Set ===========================
	protected static String Order_Set_Btn = "//a[normalize-space()='Order Set']";
	protected static String Click_Order_Set_Drug_In_Table = "//table[@id='tbl_orderset']//tr[1]/td";
	


	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEmercencyErOrder(String emergency_btn, String Er_Sales_Consumption ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, emergency_btn);
		CommanUtill.clickFunction(Er_Sales_Consumption_page, Er_Sales_Consumption);
	}
	public void EnterUHID(String UHID) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Uhid)));
		WebElement UHID_No = driver.findElement(By.xpath(Enter_Uhid));
		CommanUtill.textEnter(Enter_Uhid, UHID);
		UHID_No.sendKeys(Keys.ENTER);
	}

	public void EnterErNumber(String Er_No) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Er_No)));
		WebElement Er = driver.findElement(By.xpath(Enter_Er_No));
		CommanUtill.textEnter(Enter_Er_No, Er_No);
		Er.sendKeys(Keys.ENTER);
	}
	public void EnterBarCodeNo(String Barcode) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Barcode)));
		WebElement barcode_no = driver.findElement(By.xpath(Enter_Barcode));
		CommanUtill.textEnter(Enter_Barcode, Barcode);
		barcode_no.sendKeys(Keys.ENTER);
	}
	public void SlectItemCodeDrp(String Item_Code) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Item_Code_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Item_Code_Drp, Item_Code);
	}
	public void HideZeroStockItemsCheckBox(String HideZeroStockItems) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Chkk_Box_Hide_Zero_Stock_Items)));
		WebElement hide_Stok = driver.findElement(By.xpath(Chkk_Box_Hide_Zero_Stock_Items));
		if(! hide_Stok.isSelected()) {
			CommanUtill.clickFunction(Chkk_Box_Hide_Zero_Stock_Items, HideZeroStockItems);
		}
	}
	public void ClickDrugsAndConsumablesBtn(String Drugs_Consumables) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Drugs_Consumables_Btn)));
		CommanUtill.clickFunction(Drugs_Consumables_Btn, Drugs_Consumables);
	}
	public void SearchDrug(String Search_Box) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Seaech_List_Drug)));
		CommanUtill.textEnter(Seaech_List_Drug, Search_Box);
	}
	public void selectDrugsInTable(String table_Drug) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Drug_In_Table)));
		String Drug_Row = driver.findElement(By.xpath(Click_Drug_In_Table)).getText();
		System.out.println("========== Select  Drug Sales Consumption In Table ==========");
		logger.info("==================  Select  Drug Sales Consumption In Table ====================");
		logger.info(Drug_Row);
		System.out.println("Sales Consumption Table : " + Drug_Row);
		CommanUtill.clickFunction(Click_Drug_In_Table, table_Drug);
	}
	public void IssueThisItemFractionsNoPop(String Yes_Pop) throws IOException , InterruptedException {

		if(CommanUtill.isElementPresent(Issue_Item_Fractions_No_Pop)) {
			CommanUtill.clickFunction(Issue_Item_Fractions_No_Pop, Yes_Pop);
			System.out.println("Appred Issue This Item Fractions Yes Pop");
		}
		else {
			System.out.println("Did Not Appred Issue This Item Fractions Yes Pop");
		}
	}
	public void BATCHDETAILDrugNameCheckBox (String Batch_DETAIL_Check ) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BATCH_DETAIL_Drug_Name_Check_Box)));
		WebElement Drug_Name = driver.findElement(By.xpath(BATCH_DETAIL_Drug_Name_Check_Box));
		if(! Drug_Name.isSelected()) {
			CommanUtill.clickFunction(BATCH_DETAIL_Drug_Name_Check_Box, Batch_DETAIL_Check);
		}
	}
	public void EnterItemDescriptionQuenty(String Qnty) throws IOException , InterruptedException {

		CommanUtill.textEnter(Item_Description_Quenty, Qnty);
	}
	public void EnterSalesConsumptionRemarks(String Remarks_Text) throws IOException , InterruptedException {

		CommanUtill.textEnter(Remarks, Remarks_Text);
	}
	public void ClickOnSaveButton(String Save , String Yes_Pop) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(save_Btn)));
		CommanUtill.clickFunction(save_Btn, Save);
		if(CommanUtill.isElementPresent(save_Btn_Yes_Pop)) {
			CommanUtill.clickFunction(save_Btn_Yes_Pop, Yes_Pop);
			System.out.println("Save Issued Yes Pop");
		}
		else {
			System.out.println("Did Not Apprared Save Issued Yes Pop");
		}
	}
	//============================== Print ==============================================
	public void ClickOnPrintButton(String print_Icon) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Print_Btn)));
		CommanUtill.clickFunction(Print_Btn, print_Icon);
	}
	public void EnterFromeDate(String FromDate) throws IOException, InterruptedException {

		WebElement fromDateField = driver.findElement(By.xpath(Print_From_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Print_From_Date, FromDate);
		fromDateField.sendKeys(Keys.TAB);
	}
	public void EnterToDate(String ToDate) throws IOException, InterruptedException {

		WebElement fromDateField = driver.findElement(By.xpath(Print_To_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Print_To_Date, ToDate);
		fromDateField.sendKeys(Keys.TAB);
	}
	public void ClickOnPrintPop(String print_popup ,String  Close_Print) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Print_Pop)));
		CommanUtill.clickFunction(Print_Pop, print_popup);
		
		if(CommanUtill.isElementPresent(Close_Print_Pop)) {
			CommanUtill.clickFunction(Close_Print_Pop, Close_Print);
			System.out.println("Print Close Pop");
		}
		else {
			System.out.println("Did Not Apprared Print Close Pop");
		}
	}
	//============================ Order Set ===========================
	public void ClickOnOrderSetButton(String Order_Set) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Order_Set_Btn)));
		CommanUtill.clickFunction(Order_Set_Btn, Order_Set);
	}
	public void OderSetDrugsInTable(String table_Drug) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Order_Set_Drug_In_Table)));
		String Order_Set_Row = driver.findElement(By.xpath(Click_Order_Set_Drug_In_Table)).getText();
		System.out.println("========== Order Set Drug Table ==========");
		logger.info("==================  Order Set Drug Table ====================");
		logger.info(Order_Set_Row);
		System.out.println("Order Set Table : " + Order_Set_Row);
		CommanUtill.clickFunction(Click_Order_Set_Drug_In_Table, table_Drug);
	}

}
