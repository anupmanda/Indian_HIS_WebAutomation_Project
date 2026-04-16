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
 * 16-Apr-2026
 */
public class Er_Blood_Bank_RaiseNewRequestPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	//=========================== Er Lab Report ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Blood_Bank_Tab = "//a[normalize-space()='Blood Bank']";
	protected static String Blood_Bank_Raise_New_Request = "//a[normalize-space()='Raise New Request']";

	protected static String Enter_UHID_No = "//input[@id='txtuhidrnr']";
	protected static String Enter_Er_No = "//input[@id='txtipnornr']";
	protected static String Clinical_Diagnosis_YEs_pop = "//a[@id='btnClinicaldiagnosisYes']";
	protected static String Clinical_Diagnosis_No_pop = "//a[@id='btnClinicaldiagnosisNo']";

	//========================= Find Patient ==================================
	protected static String Search_Btn = "//a[@id='btn_Sclr']//i[@class='fa fa-search']";
	protected static String Radio_Current_in_patients = "//input[@id='rbCurrentPatents']";
	protected static String Check_Box_All_Wards = "//input[@id='cbAllWards']";
	protected static String Check_Box_Admission_Discharge = "//input[@id='cbAdmission']";
	protected static String Frome_Date_Pop = "//input[@id='txtFromDate']";
	protected static String To_Date_Pop = "//input[@id='txtToDate']";
	protected static String Search_Find_Patient = "//a[@id='btnsearchipwithdate']//i[@class='fa fa-search']";

	protected static String Click_Last_Row_Table = "//table[@id='schpatientslist']//tbody//tr[last()]";

	//=========================== Transfusion Details ======================================
	protected static String Request_Outside_Agency_Check_Box = "//input[@id='chkraisenewrqstfoa']";
	protected static String Transfusion_Datetime  = "//input[@id='txttrnsdatetime']";
	protected static String Priority_Drp = "//select[@id='ddlprioritynewrnr']";

	protected static String Blood_Group_Drp = "//select[@id='ddlbloodgrprnl']";
	protected static String RH_Factor_Drp = "//select[@id='ddlrhfact']";
	protected static String PT_INR_Text = "//input[@id='txtptinr']";
	protected static String APTT_Text = "//input[@id='txtaptt']";
	protected static String Haemoglobin_Text = "//input[@id='txthemolgn']";
	protected static String Platelet_Count_Text = "//input[@id='txtplatcount']";
	protected static String Reason_Transfusion = "//textarea[@id='txtresonfrtrnsfusion']";
	protected static String Clinical_Diagnosis_History = "//textarea[@id='txtclincdwsh']";

	//============================== Transfusion History =====================================
	protected static String Previous_Transfusion_Check_Box_History = "//input[@id='chkhisprevtrns']";
	protected static String Previous_Transfusion_Blood_Group_Drp = "//select[@id='ddlbldgrptrnshis']";
	protected static String Previous_Transfusion_Rh_Factor_Drp = "//select[@id='ddlrhfacttrnshis']";
	protected static String Previous_Transfusion_Reaction = "//textarea[@id='txtreactifany']";

	//============================ Women Patient ==================================
	protected static String Women_pregnant_Check_Box  = "//input[@id='txthassep']";
	protected static String Women_History_Pregnancy  = "//textarea[@id='txthisofpreg']";

	//=========================== Request List =============================
	protected static String Request_Component_Drp  = "//select[@id='ddlcomlistreqlist']";
	protected static String Request_Quenty  = "//input[@id='txtqty']";

	protected static String Remarks  = "//textarea[@id='txtRemarks']";
	protected static String Add_To_Card  = "//button[@id='btnaddtotbl']";
	protected static String Save_Btn  = "//i[@class='fa fa-save']";
	protected static String SUCCESS_POPUP_MSG = "//div[contains(@class,'gritter-item')]//p";
	
	
	


	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void ErOrderRaiseBloodBankMenuBtn (String Er_Order, String BloodBank) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, Er_Order);
		CommanUtill.clickFunction(Blood_Bank_Tab, BloodBank);
	}
	public void RaiseNewRequestNewWindow (String RaiseNewRequest) throws IOException, InterruptedException { 

		CommanUtill.clickTabSwitchToAnotherWindowNew(Blood_Bank_Raise_New_Request, RaiseNewRequest);
	}
	public void EnterUHIDNumber(String UHID) throws IOException, InterruptedException { 

		WebElement Uhid_No = driver.findElement(By.xpath(Enter_UHID_No));
		CommanUtill.textEnter(Enter_UHID_No, UHID);
		Uhid_No.sendKeys(Keys.ENTER);
	}
	public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(Enter_Er_No));
		CommanUtill.textEnter(Enter_Er_No, er_enter);
		er.sendKeys(Keys.ENTER);
	}
	public void ResultsClinicalDiagnosisYesPop(String Clinical_diagnosis_result_will_fetch ) throws IOException, InterruptedException { 

		if(CommanUtill.isElementPresent(Clinical_Diagnosis_YEs_pop)) {
			CommanUtill.clickFunction(Clinical_Diagnosis_YEs_pop, Clinical_diagnosis_result_will_fetch);
			System.out.println("Pop Appared Clinical_diagnosis Yes Pop");
		}
		else {
			System.out.println("Did Not Pop Appared Clinical_diagnosis Yes Pop");
		}
	}
	public void ResultsClinicalDiagnosisNoPop(String Clinical_diagnosis_No_continue_on_the_raise_new_request ) 
			throws IOException, InterruptedException { 

		if(CommanUtill.isElementPresent(Clinical_Diagnosis_No_pop)) {
			CommanUtill.clickFunction(Clinical_Diagnosis_No_pop, Clinical_diagnosis_No_continue_on_the_raise_new_request);
			System.out.println("Pop Appared Clinical_diagnosis Yes Pop");
		}
		else {
			System.out.println("Did Not Pop Appared Clinical_diagnosis Yes Pop");
		}
	}
	//========================= Find Patient ==================================
	public void SearchBtn(String Search_Icon)  throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Btn)));
		CommanUtill.clickFunction(Search_Btn, Search_Icon);
	}

	public void RadioBtnCurrent_In_patients_AllWard_AdmissionDischarge(String Current_Patients , String AllWards , String AdmissionDischarge) 
			throws IOException, InterruptedException {

		WebElement currentPatients = driver.findElement(By.xpath(Radio_Current_in_patients));
		if (!currentPatients.isSelected()) {
			CommanUtill.clickFunction(Radio_Current_in_patients, Current_Patients);
		}
		WebElement allWards = driver.findElement(By.xpath(Check_Box_All_Wards));
		if (!allWards.isSelected()) {
			CommanUtill.clickFunction(Check_Box_All_Wards, AllWards);
		}
		WebElement admissionDischarge = driver.findElement(By.xpath(Check_Box_Admission_Discharge));
		if (!admissionDischarge.isSelected()) {
			CommanUtill.clickFunction(Check_Box_Admission_Discharge, AdmissionDischarge);
		}
	}
	public void AdmissionCurntInPatientFromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Frome_Date_Pop));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Frome_Date_Pop, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void AdmissionCurrentInPatientToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(To_Date_Pop));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(To_Date_Pop, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void FindCurrentPatientInSearchBtn(String Search) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Find_Patient)));
		CommanUtill.clickFunction(Search_Find_Patient, Search);
	}
	public void SerachAndselectPatientInTable(String Patient) throws IOException ,InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Last_Row_Table)));
		String Last_IP_No_Row = driver.findElement(By.xpath(Click_Last_Row_Table)).getText();
		logger.info("================= Search Patient In Table ====================");
		logger.info(Last_IP_No_Row);
		System.out.println("First Row Patient Add Miscellaneous Charges: " + Last_IP_No_Row);

		CommanUtill.clickFunction(Click_Last_Row_Table, Patient);
	}
	//=========================== Transfusion Details ======================================

	public void TransfusionDetails(String Chekk_Box_Outside_Agency , String Transfusion_Date , String Priority )
			throws IOException ,InterruptedException {

		WebElement Outside_Agency = driver.findElement(By.xpath(Request_Outside_Agency_Check_Box));
		if (!Outside_Agency.isSelected()) {
			CommanUtill.clickFunction(Request_Outside_Agency_Check_Box, Chekk_Box_Outside_Agency);
		}

		WebElement Transfusion = driver.findElement(By.xpath(Transfusion_Datetime));
		Transfusion.sendKeys(Keys.CONTROL +"a");
		Transfusion.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Transfusion_Datetime, Transfusion_Date);
		Transfusion.sendKeys(Keys.TAB);
		CommanUtill.dropdownSelectByVisibleText(Priority_Drp, Priority);
	}
	public void SelectBloodGroupAndRHFactorDrp(String Blood_Group , String Rh_Factor) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Blood_Group_Drp, Blood_Group);
		CommanUtill.dropdownSelectByVisibleText(RH_Factor_Drp, Rh_Factor); 
	}
	public void EnterPTINRAndAPttValueInSec(String pt , String Aptt) throws IOException ,InterruptedException {

		CommanUtill.textEnter(PT_INR_Text, pt);
		CommanUtill.textEnter(APTT_Text, Aptt);
	}
	public void EnterHaemoglobinAndAPlateletCount(String Haemoglobin , String PlateletCount) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Haemoglobin_Text, Haemoglobin);
		CommanUtill.textEnter(Platelet_Count_Text, PlateletCount);
	}
	public void ReasonTransfusionAndReasonClinicalDiagnosisHistory (String ReasonTransfusion , String ClinicalDiagnosis) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Reason_Transfusion, ReasonTransfusion);
		CommanUtill.textEnter(Clinical_Diagnosis_History, ClinicalDiagnosis);
	}
	//============================== Transfusion History =====================================
	public void TransfusionHistoryDetails(String Check_Box_History , String Blood_Group , String Rh_Factor , String Reaction)
			throws IOException ,InterruptedException {

		WebElement History = driver.findElement(By.xpath(Previous_Transfusion_Check_Box_History));
		if (!History.isSelected()) {
			CommanUtill.clickFunction(Previous_Transfusion_Check_Box_History, Check_Box_History);
		}
		CommanUtill.dropdownSelectByVisibleText(Previous_Transfusion_Blood_Group_Drp, Blood_Group);
		CommanUtill.dropdownSelectByVisibleText(Previous_Transfusion_Rh_Factor_Drp,  Rh_Factor);
		CommanUtill.textEnter(Previous_Transfusion_Reaction, Reaction);
	}
	//============================ Women Patient ==================================
	public void WomenPatientDetails(String pregnant , String Pregnancy) throws IOException ,InterruptedException {

		WebElement History = driver.findElement(By.xpath(Women_pregnant_Check_Box));
		if (!History.isSelected()) {
			CommanUtill.clickFunction(Women_pregnant_Check_Box, pregnant);
		}
		CommanUtill.textEnter(Women_History_Pregnancy, Pregnancy);
	}
	//=========================== Request List =============================
	public void RequestListDetails(String Component , String Qty) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Request_Component_Drp,  Component);
		CommanUtill.textEnter(Request_Quenty, Qty);
	}
	public void RaiseNewRequestRemarks(String Remarks_Text) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Remarks, Remarks_Text);
	}
	public void ClickOnAddToCard(String Add_To_Card_Btn) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_To_Card)));
		CommanUtill.clickFunction(Add_To_Card, Add_To_Card_Btn);
	}
	public void ClickOnSaveButton(String Save) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Btn)));
		CommanUtill.clickFunction(Save_Btn, Save);
	}
	public void printSuccessPopupMessage(String Success_Pop) throws IOException, InterruptedException {

	    logger.info("==================== Success Popup Message ====================");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'gritter-item')]//p")));

	    String message = popup.getText().trim();
	    System.out.println("Popup Message: " + message);
	    logger.info("Popup Message: " + message);
	}




}
