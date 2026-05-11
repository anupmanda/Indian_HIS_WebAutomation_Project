/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 07-May-2026
 */
public class ER_Order_MARPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Order_page = "//a[contains(text(),'ER Order')]";

	//========================= MAR Active Medication =============================
	protected static String MAR_Btn = "//a[@title='MAR']";

	protected static String Active_Medication_Radio_Btn = "//input[@id='Medication']";
	protected static String MAR_Medication_Sub_Table = "//table[@id='tblMarActiveMedication']//tbody//tr[last()]";
	protected static String Multiple_Administration_Yes_Pop = "//button[@id='btnYesMultipleAdministration']";

	protected static String Administer_Now_Radio_Btn = "//input[@id='rbMediAdmini0']";
	protected static String Administer_Now_Reason_Remarks_Drp = "//select[@id='ddlMediReasonRemarks']";
	protected static String Administer_Now_Remarks = "//textarea[@id='txtMediAdminiRemarks']";
	protected static String Administer_Now_Save_Btn = "//a[@id='btnSaveMedicationAdmini']//i[@class='fa fa-save']";

	//========================= Next Schedule 2. Change Schedulen =============================

	protected static String Change_Schedule_Radio_Btn = "//input[@id='rbMediAdmini1']";
	protected static String Change_Schedule_Reason_Drp = "//select[@id='ddlMediReasonchngschedule']";
	protected static String Change_Schedule_Delay_by_Hours = "//input[@id='txtDelayHours']";
	protected static String Change_Schedule_Remarks = "//textarea[@id='txtMediAdminiChnageschduleRemarks']";
	protected static String Change_Schedule_Save_Btn = "//a[@id='btnSaveMedicationAdmini']//i[@class='fa fa-save']";  //same

	//============================== Unable to Administer ===========================
	protected static String Unable_Administer_Radio_Btn = "//input[@id='rbMediAdmini2']";
	protected static String Unable_Administer_Reason_Drp = "//select[@id='ddlMediAdminiUnableAdminReason']";
	protected static String Unable_Administer_Reason_Remarks = "//textarea[@id='txtMediAdminiUnableAdminRemarks']";

	//=================================== Adverse Event Right Click =========================================

	protected static String Click_Adverse_event = "//ul[@class='context-menu-list context-menu-root']/li[1]";
	protected static String Adverse_event_Generic_Drp = "//select[@id='ddlactivemedObservedGeneric']";
	protected static String Adverse_event_Reaction_Drp = "//select[@id='ddlactivemedobservedReaction']";
	protected static String Adverse_event_Severity_Radio_Btn = "//input[@id='rbactivemedObservedSeverity0']";
	protected static String Adverse_event_High_Radio_Btn = "//input[@id='rbactivemedObservedSeverity1']";
	protected static String Adverse_event_Moderate_Radio_Btn = "//input[@id='rbactivemedObservedSeverity1']";
	protected static String Adverse_event_Mild_Radio_Btn = "//input[@id='rbactivemedObservedSeverity2']";

	protected static String Adverse_event_Informed_Radio_Btn = "//input[@id='rbactivemedObservedSource1']";
	protected static String Adverse_event_Text = "//input[@id='txtactivemedObservedEvent']";
	protected static String Adverse_event_Doctor_Informed  = "//input[@id='txtactivemedObservedDoctInformBy']";
	protected static String Adverse_event_Action_Taken = "//textarea[@id='txtactivemedObservedACtiontaken']";
	protected static String Adverse_event_Save_Btn = "//a[@id='btnsavAdverseEvent']//i[@class='fa fa-save']";

	//=========================== Check  Administration Record & Adverse Event =====================
	protected static String Administration_Record_Radio_Btn= "//input[@id='Administration_Record']";
	protected static String Adverse_Event_Radio_Btn = "//input[@id='AdverseEvent']";

	//================================ Missed Dose =================================
	protected static String MAR_Medication_Sub_Table_First_Row = "//table[@id='tblMarActiveMedication']//tbody//tr[position()=1]";
	protected static String Missed_Dose_Radio_btn = "//input[@id='rbMediAdmini3']";
	protected static String Missed_Dose_Reason_Drp = "//select[@id='ddlMediReasonMissedDose']";
	protected static String Dose_given_Check_Box = "//input[@id='chkMediAdminiDosegiven']";
	protected static String Missed_Dose_Remarks = "//textarea[@id='txtMediAdminiMissedDoseRemarks']";
	protected static String Missed_Dose_Save_Btn = "//a[@id='btnSaveMedicationAdmini']//i[@class='fa fa-save']";






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

	public void ClickOnMARBtn(String mar)throws IOException, InterruptedException { 

		WebDriverWait MAR_Button = new WebDriverWait( driver, Duration.ofSeconds(5));
		MAR_Button.until(ExpectedConditions.elementToBeClickable(By.xpath(MAR_Btn)));
		CommanUtill.clickFunction(MAR_Btn, mar);
	}
	//========================= Active Medication =============================

	public void RadioBtnActiveMedication(String Active_Medication) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Active_Medication_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Active_Medication_Radio_Btn, Active_Medication);
		}	
	}
	public void ClickOnMarMedicationSubTable(String Medication) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MAR_Medication_Sub_Table)));
		String Ip_Issue_After = driver.findElement(By.xpath(MAR_Medication_Sub_Table)).getText();
		System.out.println("========== MAR Medication Sub Table ==========");
		logger.info("================= MAR Medication Sub Table ====================");
		logger.info(Ip_Issue_After);
		System.out.println("After Pharmacy Ip Issue Table : " + Ip_Issue_After);
		CommanUtill.clickFunction(MAR_Medication_Sub_Table, Medication);
	}

	//============ some time requiment 
	public void PopWillAppearedClickOnMarMedicationSubTable(String medication) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		System.out.println("========== MAR Medication Sub Table ==========");
		logger.info("================= MAR Medication Sub Table ====================");

		// Check table present or not
		if (driver.findElements(By.xpath(MAR_Medication_Sub_Table)).size() > 0) {

			System.out.println(" Table Found");

			WebElement element = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath(MAR_Medication_Sub_Table)));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			wait.until(ExpectedConditions.elementToBeClickable(element));

			System.out.println("Table Data: " + element.getText());
			logger.info(element.getText());

			try {
				element.click();
			} catch (Exception e) {
				System.out.println("Normal click failed, using JS click");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			}

		} else {

			System.out.println(" Table NOT Found - waiting again");
			WebElement element = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath(MAR_Medication_Sub_Table)));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
	}
	public void YesMultipleAdministrationPopup(String Multiple_Administration) throws IOException, InterruptedException { 

		if(CommanUtill.isElementPresent(Multiple_Administration_Yes_Pop)) {
			CommanUtill.clickFunction(Multiple_Administration_Yes_Pop, Multiple_Administration);
			System.out.println("Pop Appraed Yes Multiple Administratio");
		}
		else {
			System.out.println("Did Not Pop Appraed Yes Multiple Administratio");
		}
	}

	//========================= Last Given 1. Administer Now =============================

	public void RadioBtnAdministerNow_ReasonRemarksDrp_Remarks (String AdministerNow , String Reason_Remarks , String Remarks)
			throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Administer_Now_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Administer_Now_Radio_Btn, AdministerNow);
		}
		CommanUtill.dropdownSelectByVisibleText(Administer_Now_Reason_Remarks_Drp, Reason_Remarks);
		CommanUtill.textEnter(Administer_Now_Remarks, Remarks);
	}
	public void ClickOnSaveAdministerNowBtn (String Save)throws IOException, InterruptedException { 

		WebDriverWait Save_Icon = new WebDriverWait( driver, Duration.ofSeconds(5));
		Save_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Administer_Now_Save_Btn)));
		CommanUtill.clickFunction(Administer_Now_Save_Btn, Save);
	}

	//========================= Next Schedule 2. Change Schedulen =============================

	public void RadioBtnChangeSchedule (String Change_Schedule) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Change_Schedule_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Change_Schedule_Radio_Btn, Change_Schedule);
		}	
	}
	public void ChangeScheduleReasonDrp_Remarks(String Reason_Drp , String Remarks) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Change_Schedule_Reason_Drp, Reason_Drp);
		CommanUtill.textEnter(Change_Schedule_Remarks, Remarks);
	}

	//******************************************************************************************
	protected static String TXT_DELAY_HOURS = "//input[@id='txtDelayHours']";
	protected static String LAST_ROW = "//table[@id='tblMarActiveMedication']//tbody//tr[last()]";
	protected static String LAST_GIVEN = LAST_ROW + "//td[8]";
	protected static String NEXT_SCHEDULE = LAST_ROW + "//td[9]";
	protected static String STATUS = LAST_ROW + "//td[10]";


	// ================= ENTER DELAY =================
	public void enterDelayByHours(String delayHours) throws IOException, InterruptedException {

		CommanUtill.clickFunction(TXT_DELAY_HOURS, "Delay Hours Field");
		CommanUtill.textEnter(TXT_DELAY_HOURS, delayHours);
		logger.info("Entered Delay Hours: " + delayHours);
	}

	// ================= GET VALUES =================
	public String getLastGiven() {
		return driver.findElement(By.xpath(LAST_GIVEN)).getText().trim();
	}

	public String getNextSchedule() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(NEXT_SCHEDULE))).getText().trim();
	}

	public String getStatus() {
		return driver.findElement(By.xpath(STATUS)).getText().trim();
	}

	// ================= FINAL CALCULATION =================
	public String calculateExpected(String nextSchedule, int delay) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");
		LocalDateTime nextTime = LocalDateTime.parse(nextSchedule, formatter);
		LocalDateTime expected = nextTime.plusHours(delay);
		return expected.format(formatter);
	}
	public String getSafeNegativeDelay(String nextSchedule) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");

		LocalDateTime nextTime = LocalDateTime.parse(nextSchedule, formatter);
		LocalDateTime now = LocalDateTime.now();

		long diff = Duration.between(now, nextTime).toHours();
		if (diff <= 0) {
			return "0";
		}
		long safeDelay = -(diff - 1);

		return String.valueOf(safeDelay);
	}
	//============================== Unable to Administer ===========================
	public void RadioBtnUnableAdminister (String Unable_Administer) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Unable_Administer_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Unable_Administer_Radio_Btn, Unable_Administer);
		}	
	}
	public void UnableAdministerDoseReasonDrp_Remarks(String Reason_Drp , String Remarks) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Unable_Administer_Reason_Drp, Reason_Drp);
		CommanUtill.textEnter(Unable_Administer_Reason_Remarks, Remarks);
	}
	//=================================== Adverse Event Right Click =========================================

	public void RightClickOnMarMedicationSubTable(String Medication) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MAR_Medication_Sub_Table)));
		String Ip_Issue_After = driver.findElement(By.xpath(MAR_Medication_Sub_Table)).getText();
		System.out.println("========== MAR Medication Sub Table ==========");
		logger.info("================= MAR Medication Sub Table ====================");
		logger.info(Ip_Issue_After);
		System.out.println("After Pharmacy Ip Issue Table : " + Ip_Issue_After);
		CommanUtill.rightClickOnElement(MAR_Medication_Sub_Table, Medication);
	}

	//============================= Adverse event =================================

	public void ClickOnAdverseEventBtn(String  Adverse_Event) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Click_Adverse_event, Adverse_Event);
	}
	public void SelectByAdverseEvent_GenericDrp_ReactionIndex(int Generic_Drp , int Reaction_Drp) 
			throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByIndex(Adverse_event_Generic_Drp, Generic_Drp);
		CommanUtill.dropdownSelectByIndex(Adverse_event_Reaction_Drp, Reaction_Drp);	
	}
	public void RadioBtnAdverseEventSeverityModerate (String Moderate) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Adverse_event_Moderate_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Adverse_event_Moderate_Radio_Btn, Moderate);
		}	
	}

	public void AdverseEventInformedRadioBtn(String Informed) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Adverse_event_Informed_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Adverse_event_Informed_Radio_Btn, Informed);
		}	
	}
	public void AdverseEventText_DoctorInformedActionTaken (String  Event , String Doctor_informed , String Action ) throws IOException, InterruptedException {

		CommanUtill.textEnter(Adverse_event_Text, Event);
		CommanUtill.textEnter(Adverse_event_Doctor_Informed, Doctor_informed);
		CommanUtill.textEnter(Adverse_event_Action_Taken, Action);
	}
	public void ClickOnSaveAdverseEventBtn (String Save)throws IOException, InterruptedException { 

		WebDriverWait Save_Icon = new WebDriverWait( driver, Duration.ofSeconds(5));
		Save_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Adverse_event_Save_Btn)));
		CommanUtill.clickFunction(Adverse_event_Save_Btn, Save);
	}
	//=========================== Check  Administration Record & Adverse Event =====================
	public void AdministrationRecordRadioBtn(String Administration_Record) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Administration_Record_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Administration_Record_Radio_Btn, Administration_Record);
		}	
	}
	public void AdverseEventRadioBtn (String AdverseEvent) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Adverse_Event_Radio_Btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Adverse_Event_Radio_Btn, AdverseEvent);
		}	
	}
	//================================ Missed Dose =================================

	public void ClickOnMissedDoseSubTable (String Table_First) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MAR_Medication_Sub_Table_First_Row)));
		String table = driver.findElement(By.xpath(MAR_Medication_Sub_Table_First_Row)).getText();
		System.out.println("========== MAR Missed Dose Sub Table ==========");
		logger.info("================= MAR Missed Dose Sub Table ====================");
		logger.info(table);
		System.out.println("Missed Dose Table : " + table);
		CommanUtill.clickFunction(MAR_Medication_Sub_Table_First_Row, Table_First);
	}
	public void MissedDoseRadioBtn (String MissedDose) throws IOException, InterruptedException { 

		WebElement Radio_Btn = driver.findElement(By.xpath(Missed_Dose_Radio_btn));
		if(! Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Missed_Dose_Radio_btn, MissedDose);
		}	
	}
	public void MissedDoseReasonDrp (String reason_Drp , String Remarks) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Missed_Dose_Reason_Drp, reason_Drp);	
		CommanUtill.textEnter(Missed_Dose_Remarks, Remarks);
	}
	public void DosegivenCheckBox (String Dosegiven) throws IOException, InterruptedException { 

		WebElement Chkk_box = driver.findElement(By.xpath(Dose_given_Check_Box));
		if(! Chkk_box.isSelected()) {
			CommanUtill.clickFunction(Dose_given_Check_Box, Dosegiven);
		}		
	}
	public void ClickOnSaveMissedDoseBtn (String Save)throws IOException, InterruptedException { 

		WebDriverWait Save_Icon = new WebDriverWait( driver, Duration.ofSeconds(5));
		Save_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Missed_Dose_Save_Btn)));
		CommanUtill.clickFunction(Missed_Dose_Save_Btn, Save);
	}
	
	








}
