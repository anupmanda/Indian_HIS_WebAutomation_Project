/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.management.InvalidApplicationException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 02-April-2026
 */
public class AmbulanceMRDChargesPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Er_Billing_dashboard = "//li[@id='btn_Emergency']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";
	//===========================  Miscellaneous_Charges_page ================================
	protected static  String Er_Billing_Meanu = "//span[normalize-space()='ER Billing']";
	protected static  String Ambulance_MRD_Charges_Page = "//a[normalize-space()='Ambulance/MRD charges']";

	//=====================================Find Patient Pop ================================
	protected static  String search_icon_find_patient = "//a[@id='search_uhid']//i[@title='Search']";
	protected static  String current_in_patient_Radio_btn_pop = "//input[@id='rbCurrentPatents']";

	protected static  String All_Ward_Check_Box_pop = "//input[@id='cbAllWards']";
	protected static  String Discharge_Admision_chkk_box_pop = "//input[@id='cbAdmission']";
	protected static  String In_patient_From_Date_pop = "//input[@id='txtadmitDate']";
	protected static  String In_patient_To_Date_pop = "//input[@id='txtadmittodate']";

	protected static  String Find_Patient_Serach_Icon = "//a[@id='search_Emergency']//i[@class='fa fa-search']";
	protected static  String Clear_Find_Patient_pop = "//i[@title='Clear']";
	protected static  String refresh_Ambulance_Charges_page = "//a[@id='btnClean']//i[@class='fa fa-refresh']";

	//========================find Patient Table ==============================
	protected static  String find_patient_First_table = "//table[@id='searchBillingTable']//tbody//tr[position()=1]";
	//=====================UHID And Er Number ==============================
	protected static  String Enter_UHID = "//input[@id='txt_uHid']";
	protected static  String Enter_Er_No = "//input[@id='txt_ErNo']";
	protected static  String Medical_Record_Charges_Text = "//input[@id='txtSearch']";

	protected static  String Table_Medical_Record_Charges = "//table[@id='tblAdmission']//tbody//tr";
	protected static  String Table_Medical_Record_Charges_First = "//table[@id='tblAdmission']//tbody//tr[2]";
	protected static  String Item_Name_Quenty = "//input[contains(@ctype,'ctQty')]";
	protected static  String Remarks_Text = "//textarea[@id='txtRemarks']";

	protected static  String Save_Btn = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected static  String Save_Yes_Pop = "//a[@id='btnyes']";
	//==========================Delete Ambulance MRD charges =======================
	protected static  String Click_SubMenu_Table = "//table[@id='tbldgProcList']//tbody//tr[position()=1]";
	protected static  String Click_Delete_Icon = "//i[@class='fa fa-trash-o']";
	protected static  String Click_Delete_Yes_pop = "//a[@id='btnyes']";
	







	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}
	public void ClickOnErBillingDashboard(String Er_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Er_Billing_dashboard, Er_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void AmbulanceMRDCharges(String Er_Billing_Tab , String MiscellaneousCharges) 	
			throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Er_Billing_Meanu)));
		CommanUtill.clickFunction(Er_Billing_Meanu, Er_Billing_Tab);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Ambulance_MRD_Charges_Page)));
		CommanUtill.clickFunction(Ambulance_MRD_Charges_Page, MiscellaneousCharges);
	}

	//==============================Serach Patient Find Patient =============================

	public void FindPatient_SeachIcon(String Search) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(search_icon_find_patient, Search);
	}

	public void RadioBtnCurrentInPatients_AllWardsCheckBox(String Current_In_Patent , String All_Ward_Check_Box)
			throws IOException ,InterruptedException {

		CommanUtill.clickFunction(current_in_patient_Radio_btn_pop, Current_In_Patent);
		WebElement All_Ward_Chk_Box = driver.findElement(By.xpath(All_Ward_Check_Box_pop));
		if(! All_Ward_Chk_Box.isSelected())
			CommanUtill.clickFunction(All_Ward_Check_Box_pop, All_Ward_Check_Box);
	}

	public void Admission_DischargeCheckBox(String Admission_DisCharge) throws IOException ,InterruptedException {

		WebElement Admission_Discharge_Check_Box = driver.findElement(By.xpath(Discharge_Admision_chkk_box_pop));
		if(! Admission_Discharge_Check_Box.isSelected())
			CommanUtill.clickFunction(Discharge_Admision_chkk_box_pop, Admission_DisCharge);
	}
	public void AdmissionDischarge_FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(In_patient_From_Date_pop));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(In_patient_From_Date_pop, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void AdmissionDischarge_ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(In_patient_To_Date_pop));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(In_patient_To_Date_pop, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void ClickOnSeracPatientIcon(String Serch_Icon) throws IOException ,InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Find_Patient_Serach_Icon)));
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serch_Icon);
	}

	public void SerachAndselectPatientInTable(String Patient) throws IOException ,InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(find_patient_First_table)));
		String First_Row = driver.findElement(By.xpath(find_patient_First_table)).getText();
		logger.info("================= Search Patient In Table ====================");
		logger.info(First_Row);
		System.out.println("First Row Patient Add Miscellaneous Charges: " + First_Row);

		CommanUtill.clickFunction(find_patient_First_table, Patient);
	}
	//=======================Enter UHID And Er Number=================================

	public void EnterUHIDInAmbulanceMRDCharges(String uhid) throws IOException ,InterruptedException {

		WebElement uhid_enter = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, uhid);
		uhid_enter.sendKeys(Keys.ENTER);
	}
	public void EnterIpNumberInAmbulanceMRDCharges1(String Ip_Number) throws IOException ,InterruptedException {

		WebElement ip_no_enter = driver.findElement(By.xpath(Enter_Er_No));
		CommanUtill.textEnter(Enter_Er_No, Ip_Number);
		ip_no_enter.sendKeys(Keys.ENTER);
	}
	public void EnterIpNumberInAmbulanceMRDCharges(String Ip_Number) throws IOException, InterruptedException {

	    String xpath = "//input[@id='txt_ErNo']";
	    
	    Ip_Number = Ip_Number.replaceAll("[^0-9]", "");
	    WebElement ele = driver.findElement(By.xpath(xpath));
	    CommanUtill.clickFunction(xpath, "Click ER No Field");

	    // Force set value (bypass UI auto prefix)
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='" + Ip_Number + "';", ele);
	    ele.sendKeys(Keys.ENTER);
	    System.out.println("Final Value Sent (Ambulance Er NUmber): " + Ip_Number);
	}
	
	public void ShowInAllMedicalRecordChargesInTable(String Medical_Record_Charges) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> rows = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(Table_Medical_Record_Charges)));

		int rowCount = rows.size();
		logger.info("==================== All Medical Record Charges =====================");
		logger.info("Total Rows Count: " + rowCount);
		System.out.println("Total Rows Count: " + rowCount);

		// Print each row data
		for (int i = 0; i < rowCount; i++) {
			String rowText = rows.get(i).getText();
			logger.info("Row " + (i + 1) + " : " + rowText);
			System.out.println("Row " + (i + 1) + " : " + rowText);
		}
	}
	// This Coode Use In Value And Click So Update  
	public void FindMedicalRecordChargesName(String SearchName) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Medical_Record_Charges_Text, SearchName);
	}
	public void selectMedicalRecordCharges(String Click_First_Medical_Record) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Table_Medical_Record_Charges_First)));
        String First_Row = driver.findElement(By.xpath(Table_Medical_Record_Charges_First)).getText();
	    
	    logger.info("==================== Medical Record Charges =====================");
	    logger.info("Medical Record Charges : " + First_Row);
	    System.out.println("Medical Record Charges : " + First_Row);

	    CommanUtill.clickFunction(Table_Medical_Record_Charges_First, Click_First_Medical_Record);
	}
	public void EnterItemQuentyAndReamrks(String qty , String Remarks) throws IOException ,InterruptedException {
		
		CommanUtill.textEnter(Item_Name_Quenty, qty);
		CommanUtill.textEnter(Remarks_Text, Remarks);
	}
	public Void saveAmbulanceMRDchargesBtn(String Save_Icon , String Yes_Pop) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Save_Btn, Save_Icon);
		if(CommanUtill.isElementPresent(Save_Yes_Pop)) {
			CommanUtill.clickFunction(Save_Yes_Pop, Yes_Pop);
		System.out.println("Save Yes Pop Ambulance MRD Charges ");
		}
		else {
			System.out.println("Did Not Appear Save Yes Pop Ambulance MRD Charges ");
		}
		return null;
	}
	//==========================Delete Ambulance MRD charges =======================
	public void SelectSubMenuTable(String After_Save_Iten_Table) throws IOException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_SubMenu_Table)));
        String First_Row = driver.findElement(By.xpath(Click_SubMenu_Table)).getText();
	    
	    logger.info("==================== Delete Medical Recod Charge =====================");
	    logger.info("Save Medical Recod Charge In Delete : " + First_Row);
	    System.out.println("Save Medical Recod Charge In Delete : " + First_Row);

	    CommanUtill.clickFunction(Click_SubMenu_Table, After_Save_Iten_Table);
	}
	public void DeleteItem(String Delete_Btn , String Yes_pop)  throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Click_Delete_Icon, Delete_Btn);
		if(CommanUtill.isElementPresent(Click_Delete_Yes_pop)) {
			CommanUtill.clickFunction(Click_Delete_Yes_pop, Yes_pop);
		System.out.println("Click On  Delete ");
		}
		else {
			System.out.println("Not Clickable Detete Btn Bez Iten Not Save");
		}
	}


}
