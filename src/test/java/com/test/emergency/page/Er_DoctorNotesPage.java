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
 * 06-May-2026
 */
public class Er_DoctorNotesPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Order_page = "//a[contains(text(),'ER Order')]";

	//=========================D Note=============================

	protected static String Doctor_Notes = "//a[@title=\"Doctor's Note\"]";

	//=========================Preoperative Note=============================
	protected static String Preoperative_Note = "//input[@id='btnpreopreative']";
	protected static String Preoperative_Note_From_Date = "//input[@id='txtprefrom']";
	protected static String Preoperative_Note_To_Date = "//input[@id='txtpreto']";
	protected static String Preoperative_Note_Seaech_Icon = "//a[@id='btnPreoperative']//i[@title='Search']";
	protected static String Preoperative_Note_Doctor_Drp = "//select[@id='visit_doctor']";
	protected static String Preoperative_Note_Observations = "//textarea[@id='obervation']";
	protected static String Preoperative_Note_Save_Btn = "//a[@id='btn_save']//i[@class='fa fa-save']";
	

	//=========================== Doctors Referral =====================================
	protected static String Doctor_Referral_Btn = "//input[@id='doctors_referral_btn']";
	protected static String Doctor_Referral_Frome_Date = "//input[@id='fromdtReff']";
	protected static String Doctor_Referral_To_Date = "//input[@id='todtReff']";
	protected static String Doctor_Referral_Date_Search = "//a[@id='btnsrch']//i[@class='fa fa-search']";
	protected static String Doctor_Referral_Consult_Radio_Btn = "//input[@id='rbtconsult']";
	protected static String Doctor_Referral_Till_Discharge_Check_Box = "//input[@id='chktilldis']";
	protected static String Doctor_Referral_Transfer_Care_Radio_Btn = "//input[@id='rbttransferofcare']";
	protected static String Doctor_Referral_Facility_Drp = "//select[@id='facility']";
	protected static String Doctor_Referral_Speciality_Drp = "//select[@id='drpspeciality']";
	protected static String Doctor_Referral_Doctor_Drp = "//select[@id='drpdoctor']";
	protected static String Doctor_Referral_Priority_Drp = "//select[@id='drpPriority']";
	protected static String Doctor_Referral_Location_Drp = "//select[@id='drplocation']";
	protected static String Doctor_Referral_Notes_Style_Drp = "//select[@id='drNotesStyle']";
	protected static String Doctor_Referral_Reason_Text = "//textarea[@id='txtreason']";
	protected static String Doctor_Referral_Save_Btn = "//a[@id='btnSaveDocRef']//i[@class='fa fa-save']";
	protected static String Doctor_Referral_Save_Yes_Pop = "//a[@id='saveYes']";

	//======================== Operative Notes ============================== 
	protected static String Operative_Notes_Btn = "//input[@id='btnoperative']";
	protected static String Operative_Notes_Frome_Date = "(//input[@id = 'txtopertaivefrom'])[1]";
	protected static String Operative_Notes_To_Date = "(//input[@id = 'txtopertaiveto'])[1]";
	protected static String Operative_Notes_Pre_Search = "//button[@id='btnopretempldate']//i[@class='fa fa-search']";
	protected static String Operative_Notes_Notes_Drp = "(//select[@id='ddlopertemplate'])[1]";
	protected static String Operative_Notes_Search_Icon = "//button[@id='btnopertemplsrch']";
	
	//=================================== Sub Table =====================================
	
	protected static String Operative_Notes_Sub_Table = "(//div[@id='tbloperative'])[1]//tbody//tr[position()=1]";
	
	//============================ Templete Save AND Delete ==============================
	protected static String Operative_Notes_Save_Templete = "(//i[@id='save_temp'])[2]";
	protected static String Operative_Notes_Templete_Yes_Pop = "//a[@id = 'btnYesSaveTemp']";
	protected static String Operative_Notes_Delete_Templete = "(//i[@id='btn_TemplateDelete'])[2]";
	protected static String Operative_Notes_Delete_Templete_Yes_Pop = "//a[@id='btnYesDeleteTemp']";
	
	//============================ 	Pre-OT  Anes Notes ====================================
	protected static String Pre_OT_Btn = "//input[@id='btnpreopreative1']";
	protected static String Pre_OT_Frome_Date = "//input[@id='txtprefro2']";
	protected static String Pre_OT_To_Date = "//input[@id='txtpreto2']";
	protected static String Pre_OT_Search_Icon = "//button[@id='btnpretempldate1']//i[@class='fa fa-search']";
	protected static String Pre_OT_Select_Templete_Drp = "//select[@id='ddlpretemplate']";
	protected static String Pre_OT_Select_Templete_Search = "//a[@id='btnpretemplsrch']//i[@class='fa fa-search']";
	
	//============================= Physican Template ===============================
	protected static String Physican_Template_Btn = "//input[@id='btnphysiciantemplate']";
	protected static String Physican_Template_Frome_Date = "//input[@id='txtprefrom1']";
	protected static String Physican_Template_To_Date = "//input[@id='txtpreto1']";
	protected static String Physican_Template_Search_Icon = "//button[@id='search_temp']//i[@class='fa fa-search']";
	protected static String Physican_Template_Templete_Drp = "//select[@id='ddlpretemplate1']";
	protected static String Physican_Template_Select_Templete_Search = "//a[@id='btnsrch1']//i[@class='fa fa-search']";
	
	

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
	public void ClickOnDoctorNotesBtn(String D_Notes)throws IOException, InterruptedException { 

		WebDriverWait notes = new WebDriverWait( driver, Duration.ofSeconds(5));
		notes.until(ExpectedConditions.elementToBeClickable(By.xpath(Doctor_Notes)));
		CommanUtill.clickFunction(Doctor_Notes, D_Notes);
	}
	//=============================== Preoperative Note =================================

	public void ClickOnPreoperativeNote(String Preoperative_N) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Preoperative_Note)));
		CommanUtill.clickFunction(Preoperative_Note, Preoperative_N);
	}
	public void PreoperativeFromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Preoperative_Note_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Preoperative_Note_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void PreoperativeToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Preoperative_Note_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Preoperative_Note_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void SeaechPreoperativeDateWise(String Search_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Preoperative_Note_Seaech_Icon)));
		CommanUtill.clickFunction(Preoperative_Note_Seaech_Icon, Search_Icon);
	}

	public void SelectByDoctorPreoperativeDrpAndObservations(String Doctor_Drp ,String Observations_Text) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Preoperative_Note_Doctor_Drp, Doctor_Drp);
		CommanUtill.textEnter(Preoperative_Note_Observations, Observations_Text);
	}
	public void SavePreoperativeNotes(String Save_Btn) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Preoperative_Note_Save_Btn)));
		CommanUtill.clickFunction(Preoperative_Note_Save_Btn, Save_Btn);
	}
	//=========================== Doctors Referral =====================================

	public void ClickOnDoctorsReferral(String Referral) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Doctor_Referral_Btn)));
		CommanUtill.clickFunction(Doctor_Referral_Btn, Referral);
	}
	public void ReferralFromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Doctor_Referral_Frome_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Doctor_Referral_Frome_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ReferralToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Doctor_Referral_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Doctor_Referral_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void SeaechReferralDateWise(String Search_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Doctor_Referral_Date_Search)));
		CommanUtill.clickFunction(Doctor_Referral_Date_Search, Search_Icon);
	}
	public void SelectRadioBtnInConsult(String Consult) throws IOException ,InterruptedException {

		WebElement Consult_Radio_Btn = driver.findElement(By.xpath(Doctor_Referral_Consult_Radio_Btn));
		if(! Consult_Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Doctor_Referral_Consult_Radio_Btn, Consult);
		}
	}
	public void SelectRadioBtnInTillDischarge(String Till_Discharge) throws IOException ,InterruptedException {

		WebElement Till_Discharge_chkk_box = driver.findElement(By.xpath(Doctor_Referral_Till_Discharge_Check_Box));
		if(! Till_Discharge_chkk_box.isSelected()) {
			CommanUtill.clickFunction(Doctor_Referral_Till_Discharge_Check_Box, Till_Discharge);
		}
	}
	public void SelectRadioBtnInTransferCare (String  Transfer_Care) throws IOException ,InterruptedException {

		WebElement Transfer_Care_Radio_Btn = driver.findElement(By.xpath(Doctor_Referral_Transfer_Care_Radio_Btn));
		if(! Transfer_Care_Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Doctor_Referral_Transfer_Care_Radio_Btn, Transfer_Care);
		}
	}
	public void SelectFacilityReferralDrp(String Facility_Drp) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Doctor_Referral_Facility_Drp, Facility_Drp);
	}
	public void DoctorReferral_SpecialityDrp_DoctorDrp_PriorityDrp_SelectNotesStyleDrp(int Speciality , int Doctor ,
			String Priority , String Notes_Style) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByIndex(Doctor_Referral_Speciality_Drp, Speciality);
		CommanUtill.dropdownSelectByIndex(Doctor_Referral_Doctor_Drp, Doctor);
		CommanUtill.dropdownSelectByVisibleText(Doctor_Referral_Priority_Drp, Priority);
		CommanUtill.dropdownSelectByVisibleText(Doctor_Referral_Notes_Style_Drp, Notes_Style); 
	}
	public void ReasonDoctotReferralText(String Reason) throws IOException ,InterruptedException {

		CommanUtill.textEnter(Doctor_Referral_Reason_Text, Reason);
	}
	public void SaveReferralDoctorAndYesPop(String Save_Icon , String Yes_pop) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Doctor_Referral_Save_Btn)));
		CommanUtill.clickFunction(Doctor_Referral_Save_Btn, Save_Icon);

		if(CommanUtill.isElementPresent(Doctor_Referral_Save_Yes_Pop)) {
			CommanUtill.clickFunction(Doctor_Referral_Save_Yes_Pop, Yes_pop);
			System.out.println("Apparead Yes Pop save Refferal Request");
		}
		else {
			System.out.println("Did Not Apparead Yes Pop save Refferal Request");
		}
	}
	//======================== Operative Notes ============================== 

	public void  DoctorOperativeNotesBtn(String  Operative_Btn) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Operative_Notes_Btn)));
		CommanUtill.clickFunction(Operative_Notes_Btn, Operative_Btn);
	}
	public void  OperativeNotesFromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Operative_Notes_Frome_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Operative_Notes_Frome_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void OperativeNotesToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Operative_Notes_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Operative_Notes_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}

	public void  SearchDateOperativeNotes(String  search_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Operative_Notes_Pre_Search)));
		CommanUtill.clickFunction(Operative_Notes_Pre_Search, search_Icon);
	}
	public void SelectByOperativeTemplateDrp(String template_Drp , String Search_Icon) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Operative_Notes_Notes_Drp, template_Drp);
		Thread.sleep(800);
		CommanUtill.clickTabSwitchToAnotherWindowNew(Operative_Notes_Search_Icon, Search_Icon);
	}
	public void SelectOperativeNotesInSubTable(String Save_Notes_Row) throws IOException ,InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Operative_Notes_Sub_Table)));
		String First_Row = driver.findElement(By.xpath(Operative_Notes_Sub_Table)).getText();
		logger.info("================= Search Patient In Table ====================");
		logger.info(First_Row);
		System.out.println("First Row Patient Add Miscellaneous Charges: " + First_Row);

		CommanUtill.clickTabSwitchToAnotherWindowNew(Operative_Notes_Sub_Table, Save_Notes_Row);
	}
	
	//============================ Templete Save AND Delete ==============================
	public void SaveTempleteYesPop(String Save ,String  Yes_pop)  throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Operative_Notes_Save_Templete)));
		CommanUtill.clickFunction(Operative_Notes_Save_Templete, Save);
		if(CommanUtill.isElementPresent(Operative_Notes_Templete_Yes_Pop)) {
			CommanUtill.clickFunction(Operative_Notes_Templete_Yes_Pop, Yes_pop);
			System.out.println("Apparead Yes Pop save templatet");
		}
		else {
			System.out.println("Did Not Apparead Yes Pop save template");
		}
	}
	public void DeleteTempleteYesPop(String Delete ,String  Yes_pop)  throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Operative_Notes_Delete_Templete)));
		CommanUtill.clickFunction(Operative_Notes_Delete_Templete, Delete);
		
		if(CommanUtill.isElementPresent(Operative_Notes_Delete_Templete_Yes_Pop)) {
			CommanUtill.clickFunction(Operative_Notes_Delete_Templete_Yes_Pop, Yes_pop);
			System.out.println("Apparead Yes Pop Delete templatet");
		}
		else {
			System.out.println("Did Not Apparead Yes Pop Delete template");
		}
	}
	
	public void ChildWindowToParentWindow(String Close_Window) throws IOException , InterruptedException {

		CommanUtill.closeChildAndSwitchToParent();
	}
   //============================ 	Pre-OT  Anes Notes ====================================
	public void PreOTNotesBtn(String  Pre_Ot) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Pre_OT_Btn)));
		CommanUtill.clickFunction(Pre_OT_Btn, Pre_Ot);
	}
	public void  PreOTNotesFromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Pre_OT_Frome_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Pre_OT_Frome_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void PreOTNotesToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Pre_OT_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Pre_OT_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}

	public void  SearchDatePreOtNotes(String  search_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Pre_OT_Search_Icon)));
		CommanUtill.clickFunction(Pre_OT_Search_Icon, search_Icon);
	}
	public void SelectByPreOtTemplateDrp(String template_Drp , String Search_Icon) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Pre_OT_Select_Templete_Drp, template_Drp);
		Thread.sleep(800);
		CommanUtill.clickTabSwitchToAnotherWindowNew(Pre_OT_Select_Templete_Search, Search_Icon);
	}
	//============================= Physican Template ===============================
	
	public void  PhysicanTemplateBtn(String  Physican_Template) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Physican_Template_Btn)));
		CommanUtill.clickFunction(Physican_Template_Btn, Physican_Template);
	}
	public void  PhysicanTemplateFromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Physican_Template_Frome_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Physican_Template_Frome_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void PhysicanTemplateToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Physican_Template_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Physican_Template_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}

	public void  SearchDatePhysicanTemplate(String  search_Icon) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Physican_Template_Search_Icon)));
		CommanUtill.clickFunction(Physican_Template_Search_Icon, search_Icon);
	}
	public void SelectByPhysicanTemplateDrp(String template_Drp , String Search_Icon) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Physican_Template_Templete_Drp, template_Drp);
		Thread.sleep(800);
		CommanUtill.clickTabSwitchToAnotherWindowNew(Physican_Template_Select_Templete_Search, Search_Icon);
	}
	

}
