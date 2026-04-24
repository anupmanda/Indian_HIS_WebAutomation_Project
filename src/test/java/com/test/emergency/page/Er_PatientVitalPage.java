/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
 * 22-Apr-2026
 */
public class Er_PatientVitalPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Patient_Vitals_Page = "//a[normalize-space()='Patient Vitals']";

	//============================= Search Patient =============================

	protected static String Search_Btn = "//i[@id='btnSearchPV']";
	protected static String Current_In_Patient_Radio_Btn = "//input[@id='rbCurrentPatents']";
	protected static String All_Wards_Check_Box = "//input[@id='cbAllWards']";
	protected static String Search_Mobile_No = "//input[@id='txtMobileNo']";
	protected static String Search_Name = "//input[@id='txtName']";
	protected static String Search_Find_Patoent_Icon = "//a[@id='btnsearchipwithdate']//i[@class='fa fa-search']";

	protected static String UHID = "//input[@id='txtUhidPV']";
	protected static String ER_NO = "//input[@id='txtIPNoPV']";
	protected static String From_Date = "//input[@id='txtPVnewfromdate']";
	protected static String To_Date = "//input[@id='txtPVnewtodate']";
	protected static String Click_Add_Plush_Btn = "//i[@id='btnAddNewPV']";

	//============================= pop =========================================
	protected String popupMessage = "//div[@id='gritter-notice-wrapper']//p";
	protected String popupCloseBtn = "//div[@id='gritter-notice-wrapper']//div[@class='gritter-close']";

	//======================= Vital Mapping =====================================

	protected static String Vital_Mapping_Btn = "//button[@id='btnVitalMappingPV']";
	protected static String Vital_Mapping_Search_Favorite = "//input[@id='txtSearchAllVitalVM']";
	protected static String Click_Vital_Mapping_Search_Favorite = "//table[@id='tblAllVitalVM']//tbody//tr[position()=1]";
	protected static String Save_Vital_Mapping_Search_Favorite = "//a[@id='save']//i[@class='fa fa-save']";
	
	protected static String Delete_Vital_Mapping = "//table[@id='tblFavVitalVM']//tbody//tr[position()=1]//i[@class='fa fa-times']";
  //================================== Save Btn ===================================
	protected static String Save_Vitals_Value = "//a[@id='btnsavevital']//i[@class='fa fa-save']";









	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEROrderTab(String emergency_btn) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Er_Order_Tab)));
		CommanUtill.clickFunction(Er_Order_Tab, emergency_btn);

	}
	public void clickOnPatientVitals(String Vitals ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Er_Order_Tab)));
		CommanUtill.clickTabSwitchToAnotherWindow(Patient_Vitals_Page, Vitals);
	}
	//=============================== Search Patient ==============================
	public void ClickOnSearchIcon(String Search ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Btn)));
		CommanUtill.clickFunction(Search_Btn, Search);
	}

	public void ClickOnCurrentInPatientInRadioBtn(String CurrentInPatient) throws IOException, InterruptedException { 

		WebElement Radio_Btn_Current = driver.findElement(By.xpath(Current_In_Patient_Radio_Btn));
		if(! Radio_Btn_Current.isSelected()) {
			CommanUtill.clickFunction(Current_In_Patient_Radio_Btn, CurrentInPatient);
		}
	}
	public void ClickOnAllWardsCheckBox(String All_Ward_Check_Box) throws IOException, InterruptedException { 

		WebElement Chkk_Wards = driver.findElement(By.xpath(All_Wards_Check_Box));
		if(! Chkk_Wards.isSelected()) {
			CommanUtill.clickFunction(All_Wards_Check_Box, All_Ward_Check_Box);
		}
	}
	public void EnterMobileNumber(String Mobile_No) throws IOException, InterruptedException { 

		WebElement mobile = driver.findElement(By.xpath(Search_Mobile_No));
		CommanUtill.textEnter(Search_Mobile_No, Mobile_No);
		mobile.sendKeys(Keys.ENTER);
	}
	public void SearchNameInFindPatient(String Name) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Search_Name, Name);
	}
	public void FindPatientInSearchIcon(String Search ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Find_Patoent_Icon)));
		CommanUtill.clickFunction(Search_Find_Patoent_Icon, Search);
	}

	public void FindInPatientInTable(String prefix) throws IOException, InterruptedException {

		logger.info("===== Print & Click Last Row By IP Prefix =====");

		String Find_Patient_In_Table = "(//table[@id='schpatientslist']//tbody//tr[td[starts-with(normalize-space(.),'" + prefix + "')]])[last()]";
		WebElement row = driver.findElement(By.xpath(Find_Patient_In_Table));

		// All column
		List<WebElement> columns = row.findElements(By.tagName("td"));
		StringBuilder rowData = new StringBuilder();

		for (WebElement col : columns) {
			String text = col.getText().trim();
			rowData.append(text).append(" | ");
		}
		// Print in Console
		System.out.println("Selected Row Data: " + rowData.toString());

		// Print in Logger
		logger.info("Selected Row Data: " + rowData.toString());

		// Click the row
		row.click();
	}
	//=============================== Pop ====================================
	public void handleDynamicPopup(String Pop) throws IOException, InterruptedException {

		logger.info("===== Handle Dynamic Popup =====");

		try {
			Thread.sleep(500);
			if (CommanUtill.isElementPresent(popupMessage)) {
				String message = driver.findElement(By.xpath(popupMessage)).getText().trim();
				System.out.println("Popup Message: " + message);
				logger.info("Popup Message: " + message);

				// Close popup
				if (CommanUtill.isElementPresent(popupCloseBtn)) {
					CommanUtill.clickFunction(popupCloseBtn ,"");
					logger.info("Popup closed successfully");
				}

			} else {
				logger.info("Popup not displayed");
				System.out.println("Popup not displayed");
			}

		} catch (Exception e) {
			logger.info("Error while handling popup: " + e.getMessage());
		}
	}
	//========================Vital Mapping ============================
	public void clickOnVitalsMappingButton (String VitalsMappimg ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Vital_Mapping_Btn)));
		CommanUtill.clickTabSwitchToAnotherWindowNew(Vital_Mapping_Btn, VitalsMappimg);
	}
	public void EnterFavoriteVitalsMapping (String Favorite_Name ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Vital_Mapping_Search_Favorite)));
		CommanUtill.textEnter(Vital_Mapping_Search_Favorite, Favorite_Name);
	}
	public void ClickFavoriteVitalsNameInTable (String table_Vitals_Name) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Vital_Mapping_Search_Favorite)));
		String Vitals_Name = driver.findElement(By.xpath(Click_Vital_Mapping_Search_Favorite)).getText();
		System.out.println("========== Select Favorite Vitals Name Table ==========");
		logger.info("================== Select Favorite Vitals Name Table ====================");
		logger.info(Vitals_Name);
		System.out.println(" Favorite Vitals Name Table : " + Vitals_Name);
		CommanUtill.clickFunction(Click_Vital_Mapping_Search_Favorite, table_Vitals_Name);
	}
	public void SaveFavoriteVitalsMapping (String Save_Btn ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Vital_Mapping_Search_Favorite)));
		CommanUtill.clickFunction(Save_Vital_Mapping_Search_Favorite, Save_Btn);
	}
	
	//============================= Delete ===============================
	public void DeleteFavoriteVitalsNameInTable (String Delete_Vitals_Name) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Delete_Vital_Mapping)));
		String Delete_Vitals = driver.findElement(By.xpath(Delete_Vital_Mapping)).getText();
		System.out.println("========== Delete Favorite Vitals Name Table ==========");
		logger.info("================== Delete Favorite Vitals Name Table ====================");
		logger.info(Delete_Vitals);
		System.out.println("Delete Favorite Vitals Name Table : " + Delete_Vitals);
		CommanUtill.clickFunction(Delete_Vital_Mapping, Delete_Vitals_Name);																																											
		
	}
	public void ChildWindowToParentWindow(String Close_Window) throws IOException , InterruptedException {
		
		CommanUtill.closeChildAndSwitchToParent();
	}
	
	//====================== ************************* ====================================
	public void EnterUHIDNumber(String UHID_No) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(UHID));
		CommanUtill.textEnter(UHID, UHID_No);
		er.sendKeys(Keys.ENTER);
	}
	public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(ER_NO));
		CommanUtill.textEnter(ER_NO, er_enter);
		er.sendKeys(Keys.ENTER);
	}
	public void FromDateSerach(String FromDate) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(From_Date, FromDate);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String toDate) throws IOException ,InterruptedException {

		WebElement ToDate = driver.findElement(By.xpath(To_Date));
		ToDate.sendKeys(Keys.CONTROL +"a");
		ToDate.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(To_Date, toDate);
		ToDate.sendKeys(Keys.TAB);
	}
	public void AddVitalsValueButton (String Add_Btn) throws IOException ,InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Add_Plush_Btn)));
		CommanUtill.clickFunction(Click_Add_Plush_Btn, Add_Btn);
	}
	
	public void enterVitalValue(String vitalName, String value) throws IOException, InterruptedException {

	    logger.info("==== Enter Vital Value for: " + vitalName + " ====");
	    System.out.println("==== Enter Vital Value for: " + vitalName + " ====");

	    String xpath = "//tr[td[normalize-space()='" + vitalName + "']]//td[@contenteditable='true']";
	    WebElement element = driver.findElement(By.xpath(xpath));
	    element.click();

	    // Clear old value (IMPORTANT for contenteditable)
	    element.sendKeys(Keys.CONTROL + "a");
	    element.sendKeys(Keys.DELETE);

	    // Enter new value
	    element.sendKeys(value);

	    // Optional (trigger blur / save)
	    element.sendKeys(Keys.TAB);

	    logger.info("Entered [" + value + "] for [" + vitalName + "]");
	    System.out.println("Entered [" + value + "] for [" + vitalName + "]");
	}
	public void SaveVitalsValueBtn (String Save_Btn ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Vitals_Value)));
		CommanUtill.clickFunction(Save_Vitals_Value, Save_Btn);
	}
	
	

}
