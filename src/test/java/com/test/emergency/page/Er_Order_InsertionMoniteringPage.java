/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 29-Apr-2026
 */
public class Er_Order_InsertionMoniteringPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Order_page = "//a[contains(text(),'ER Order')]";

	//=========================Nursing  Endorsement Tool =============================
	protected static String N_Notes = "//a[@title='Nurse Notes']";
	protected static String Insertion_Monitering_Page = "//input[@id='btnInsertionMoni']";

	//============================== Insertion Details ======================================

	protected static String Type_Insertion_Drp = "//select[@id='drdTypeOfInsertion']";
	protected static String Site_Drp = "//select[@id='ddlReason']";
	protected static String Click_Site = "//input[@id='txtReason']";

	protected static String Size_Text = "//input[@id='txtSize']";
	protected static String No_Attempts_Text = "//input[@id='txtNoOfAttempt']";
	protected static String Dressing_Drp = "//select[@id='drdDressing']";
	protected static String Doctor_Drp = "//select[@id='drdoctor']";
	protected static String Insertion_Notes_Text = "//textarea[@id='txtdocarea']";

	protected static String Save_Insertion_Btn = "//i[@id='btnSaveInsertion']";

	//======================== Insertion Detail Table==============================
	protected static String Insertion_Details_Sub_Table_Row = "//table[@id='tblInsertionDetail']//tbody//tr[last()]";
	protected static String Insertion_Details_Sub_Table_Row_Add_Plush = "//table[@id='tblInsertionDetail']//tbody//tr[last()]//td[@ctype='Add']//i";
	protected static String Insertion_Details_Sub_Table_Row_View_Search = "//table[@id='tblInsertionDetail']//tbody//tr[last()]//td[@ctype='View']//i";

	protected static String Insertion_Details_Sub_Table_Row_Mark_Error = "//table[@id='tblInsertionDetail']//tbody//tr[last()]//td[@ctype='MarkedAsError']//i";
	protected static String  Error_Marls_Yes_Pop = "//button[@id='btnMarkErrorYes']";
	//======================== Maintenance Detail ==============================
	protected static String  Maintenance_Shift_Drp = "//select[@id='drdShift']";
	protected static String  Maintenance_Saline_Flush_Drp = "//select[@id='drdSalineFlush']";
	protected static String  Maintenance_VIP_Score_Drp = "//select[@id='drdVipScore']";
	protected static String  Maintenance_Genital_Meatal_Care_Drp = "//input[@id='txtGenitalMeatalCare']";

	protected static String  Maintenance_Save_Btn = "//i[@id='btnSaveMaintenence']";



	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEmercencyErOrder(String emergency_btn, String Er_Order ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, emergency_btn);
		CommanUtill.clickFunction(Er_Order_page, Er_Order);
	}
	public void ClickOnNursNotesBtn(String Nurse_Notes)throws IOException, InterruptedException { 

		WebDriverWait notes = new WebDriverWait( driver, Duration.ofSeconds(5));
		notes.until(ExpectedConditions.elementToBeClickable(By.xpath(N_Notes)));
		CommanUtill.clickFunction(N_Notes, Nurse_Notes);
	}
	public void ClickOnInsertionMoniteringBtn(String Insertion_Monitering) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Insertion_Monitering_Page)));
		CommanUtill.clickTabSwitchToAnotherWindowNew(Insertion_Monitering_Page, Insertion_Monitering);
	}
	//============================== Insertion Details ======================================

	public void TypeOfInsertion_Dressing(String Insertion, String Dressing) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Type_Insertion_Drp, Insertion);
		CommanUtill.dropdownSelectByVisibleText(Dressing_Drp, Dressing);
	}
	public void InsertionSiteDrp(String Site) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait until Site dropdown is populated
		wait.until(driver -> {
			Select select = new Select(driver.findElement(By.xpath(Site_Drp)));
			return select.getOptions().size() > 1;
		});

		// Select Site value
		WebElement element = driver.findElement(By.xpath(Site_Drp));
		Select select = new Select(element);
		select.selectByVisibleText(Site);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].dispatchEvent(new Event('change'))", element);
		js.executeScript("arguments[0].blur();", element);
	}
	public void InsertionSiteDrp1(String Site) throws IOException, InterruptedException {

		CommanUtill.textEnter(Click_Site, Site);
		CommanUtill.dropdownSelectByVisibleText(Site_Drp, Site);
	}
	public void InsertionSize_NoOfAttempts_Doctor_InsertionNotes (String Size , String Attempts , String Doctor ,
			String Insertion_Notes )  throws IOException, InterruptedException {

		CommanUtill.textEnter(Size_Text, Size);
		CommanUtill.textEnter(No_Attempts_Text, Attempts);
		CommanUtill.dropdownSelectByVisibleText(Doctor_Drp, Doctor);
		CommanUtill.textEnter(Insertion_Notes_Text, Insertion_Notes);
	}

	public void SaveInsertionDetailsBtn(String Save_Icon)  throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Insertion_Btn)));
		CommanUtill.clickFunction(Save_Insertion_Btn, Save_Icon);
	}

	//======================== Insertion Detail Table ==============================

	public void InsertionDetailSubTableAddOnPlushIcon(String Plush_Btn) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Insertion_Details_Sub_Table_Row)));

		String rowData = driver.findElement(By.xpath(Insertion_Details_Sub_Table_Row)).getText().replace("\n", " | ");

		String finalData = "===== Insertion DetailS Sub Table Row Data ===== | " + rowData;
		System.out.println(finalData);
		logger.info(finalData);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Insertion_Details_Sub_Table_Row_Add_Plush)));
		CommanUtill.clickFunction(Insertion_Details_Sub_Table_Row_Add_Plush, Plush_Btn);

	}

	public void InsertionDetailSubTableAddOnViewIcon(String View_Btn) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Insertion_Details_Sub_Table_Row)));

		String rowData = driver.findElement(By.xpath(Insertion_Details_Sub_Table_Row)).getText().replace("\n", " | ");

		String finalData = "===== Insertion DetailS Sub Table Row Data ===== | " + rowData;
		System.out.println(finalData);
		logger.info(finalData);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Insertion_Details_Sub_Table_Row_View_Search)));
		CommanUtill.clickFunction(Insertion_Details_Sub_Table_Row_View_Search, View_Btn);
	}
	public void InsertionDetailSubTableMarkedAsError (String MarkedAsError) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Insertion_Details_Sub_Table_Row)));

		String rowData = driver.findElement(By.xpath(Insertion_Details_Sub_Table_Row)).getText().replace("\n", " | ");

		String finalData = "===== Insertion DetailS Sub Table Row Data ===== | " + rowData;
		System.out.println(finalData);
		logger.info(finalData);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Insertion_Details_Sub_Table_Row_Mark_Error)));
		CommanUtill.clickFunction(Insertion_Details_Sub_Table_Row_Mark_Error, MarkedAsError);
	}
	public void YesMarkItAsEnteredInErrorPop(String Yes_Pop) throws IOException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Maintenance_Save_Btn)));
		CommanUtill.clickFunction(Error_Marls_Yes_Pop, Yes_Pop);	
	}
	
	//======================== Maintenance Detail ==============================
	public void MaintenanceDetailsInformation(String Shift_Drp , String Saline_Flush_Drp ,String VIP_Score , 
			String GenitalMeatalCare) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Maintenance_Shift_Drp, Shift_Drp);
		CommanUtill.dropdownSelectByVisibleText(Maintenance_Saline_Flush_Drp, Saline_Flush_Drp);
		CommanUtill.dropdownSelectByVisibleText(Maintenance_VIP_Score_Drp, VIP_Score);
		CommanUtill.textEnter(Maintenance_Genital_Meatal_Care_Drp, GenitalMeatalCare);
	}

	public void SaveMaintenanceDetails(String Save_Btm ) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Maintenance_Save_Btn)));
		CommanUtill.clickFunction(Maintenance_Save_Btn, Save_Btm);	
	}
	
	//========================= Scroll ======================
	public void scrollRight() throws IOException, InterruptedException {

	    String scrollDiv = "(//div[contains(@class,'insertionremove-monitringtable')])[1]";

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement element = driver.findElement(By.xpath(scrollDiv));
	    js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth", element);
	    System.out.println("Scrolled to RIGHT");
	}
	public void scrollLeft() throws IOException, InterruptedException {

	    String scrollDiv = "(//div[contains(@class,'insertionremove-monitringtable')])[1]";
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement element = driver.findElement(By.xpath(scrollDiv));
	    js.executeScript("arguments[0].scrollLeft = 0", element);
	    System.out.println("Scrolled to LEFT");
	}




}
