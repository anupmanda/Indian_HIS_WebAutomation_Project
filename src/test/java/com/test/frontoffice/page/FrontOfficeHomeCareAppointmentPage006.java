/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 22-Jul-2025
 */
public class FrontOfficeHomeCareAppointmentPage006 extends GeneralBrowserSetting{
	
	
	
	 protected static String home_care_appointment = "//a[normalize-space()='Home Care Appointment']";
	 protected static String genrate_home_care_app_icon = "//h4[@class='fa fa-home']";
	 protected static String phlebotomist_area_drp = "//select[@id='PhlebotomistArea']";
	 protected static String phlebotomist_name_drp = "//select[@id='PhlebotomistName']";
	 protected static String date = "//input[@id='Select_Date']";
	 protected static String serach = "//a[@onclick='GetPhlebotomistSchedules()']//i[@class='fa fa-search']";
	 
	 protected static String click_slect_day = "//tbody/tr[1]/td[5]";
	//tbody/tr[1]/td[5]
	 protected static String uhid = "//input[@id='UhId']";
	 protected static String serach_schedule = "//a[@onclick='searchpatientdata()']//i[@class='fa fa-search']";
	 protected static String first_name = "//input[@id='modalfirstName']";
	 protected static String middle_name = "//input[@id='modalmiddleName']";
	 protected static String last_name = "//input[@id='modallastName']";
	 protected static String mobile_no = "//input[@id='modalmobileNo']";
	 protected static String age = "//input[@id='age']";
	 protected static String age_type = "//select[@id='age_desc']";
	 protected static String gender = "//select[@id='gender']";
	 protected static String address = "//input[@id='Address']";
	 protected static String email = "//input[@id='Email']";
	 protected static String dob = "//input[@id='dob']";
	 protected static String service = "//input[@id='serviceButton']";
	 protected static String source_0f_appointment = "//select[@id='SourceOfAppointment']";
	 protected static String patient_type = "//select[@id='_patienttype']";
	 protected static String remaks = "//textarea[@id='Remarks']";					 
	 protected static String save_app = "//a[@id='Appointment_Save']//i[@class='fa fa-save']";
	 
	//______________________________Block Home Care Appointment________________________________________________
	 
	 protected static String block_home_care_ = "//a[@id='eqip_show']";
	 protected static String block_Phlebotomist_Area_ = "//select[@id='PhlebotomistArea1']";
	 protected static String block_Phlebotomist_Name = "//select[@id='PhlebotomistName1']";
	 protected static String block_from_date = "//input[@id='BlockFrom_Date']";
	 protected static String block_to_date = "//input[@id='BlockTo_Date']";
	 protected static String block_phlebotomist_unavailable_check = "//input[@id='Phlebotomist_Unavailable']";
	 protected static String block_remaks = "//input[@id='BlockRemark']";
	 protected static String block_plush_icon = "//i[@class='fa fa-plus']";
	 
	 protected static String block_day_monday_chek = "//input[@id='chkStatus1']";
	 protected static String block_day_tuesday_chek = "//input[@id='chkStatus2']";
	 protected static String block_day_wednesday_chek = "//input[@id='chkStatus3']";
	 protected static String block_day_whursday_chek = "//input[@id='chkStatus4']";
	 protected static String block_day_friday_chek = "//input[@id='chkStatus15']";
	 protected static String block_day_saturday_chek = "//input[@id='chkStatus6']";
	 protected static String block_day_sunday_chek = "//input[@id='chkStatus7']";
	 
	 protected static String block_save_btn = "//a[@id='btnSave']//i[@class='fa fa-save']";
	// protected static String block_day_monday = "//input[@id='chkStatus1']";
	// protected static String block_day_monday = "//input[@id='chkStatus1']";
	 
	 
	 
	 public void clickOnHomeCareAppointmentPage(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(home_care_appointment, filedName);
	 }

	 public void clickOnGenrateHomeCareAppointmentIcon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(genrate_home_care_app_icon, filedName);
		 
	 }
	 
	 public void selectByPhlebotomistAreaDropdwon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.dropdownSelectByVisibleText(phlebotomist_area_drp, filedName);
		 
	 }
	 
	 public void selectByPhlebotomistNameDropdwon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.dropdownSelectByVisibleText(phlebotomist_name_drp, filedName);
		 
	 }
	 
	 public void enterOnPhlebotomistDate(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(date, filedName);
		 WebElement date = driver.findElement(By.xpath("//input[@id='Select_Date']"));
		 date.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public void clickOnPhlebotomistAppointmentSerachIcon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(serach, filedName);
		 
	 }
	
	 public void clickAndChooseApponitmetDay(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(click_slect_day, filedName);
		 
	 }
	 
	 public void enterOnUHID(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(uhid, filedName);
		 
	 }
	 
	 public void clickOnSerachUHIDIcon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(serach_schedule, filedName);
	 }
	 
	 public void enterOnFirstName(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.textEnter(first_name, filedName);
		 
	 }
	 
	 public void enterOnLastName(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.textEnter(last_name, filedName);
		 
	 }
	 
	 public void enterOnMiddleName(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.textEnter(middle_name, filedName);
		 
	 }
	 
	 public void enterOnMobileNumber(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(mobile_no, filedName);
		 
	 }
	 
	 public void enterOnAge(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.textEnter(age, filedName);
		 
	 }
	 
	 public void selectByAgeTypeDropdwon(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.dropdownSelectByVisibleText(age_type, filedName);
		 
	 }
	 
	 public void selectByGenderDropdwon(String filedName) throws IOException, InterruptedException {  
		 
		 CommanUtill.dropdownSelectByVisibleText(gender, filedName);
		 
	 }
	 
	 public void enterOnAddress(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.textEnter(address, filedName);
		 
	 }
	 
	 public void enterOnEmailId(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.textEnter(email, filedName);
		 
	 }
	 
	 public void enterOnDateOfBrith(String filedName) throws IOException, InterruptedException { 
		 
		CommanUtill.textEnter(dob, filedName);
		
	 }
	 
	 public void clickOnServiceButton(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.clickFunction(service, filedName);
		 WebElement checkbox = driver.findElement(By.xpath("//input[@id='31705']"));
		 checkbox.click();
		 Thread.sleep(300);
		 WebElement save = driver.findElement(By.xpath("//a[@title='Save']//i[@class='fa fa-save']"));
		 save.click();		 
		 
	 }
	 
	 
	 
	 public void selectBySorceOfAppointmentDropdwon(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.dropdownSelectByVisibleText(source_0f_appointment, filedName);
		 
	 }
	 
	 public void selectBypatientTypeDropdwon(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.dropdownSelectByVisibleText(patient_type, filedName);
		 
	 }
	 
	 public void enterOnRemaks(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.textEnter(remaks, filedName);
		 
	 }
	 
	 public void clickOnApponitmentSchudulingSaceButton(String filedName) throws IOException, InterruptedException { 
		 
		 CommanUtill.clickFunction(save_app, filedName);
		 
	 }
	 
	//_______________________________Block Home Care Appointment_____________________________________________
	 
	 public  void clickOnBlockHomeCareAppointmentButton(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(block_home_care_, filedName);
		 
	 }
	 
	 public  void selectByBlockAppointmentPhlebotomistAreaDropdwon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.dropdownSelectByVisibleText(block_Phlebotomist_Area_, filedName);
		 
	 }
	 
	 public  void selectByBlockAppointmentPhlebotomistNameDropdwon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.dropdownSelectByVisibleText(block_Phlebotomist_Name, filedName);
		 
	 }
	 
	 public  void enterOnBlockAppointmentFromDate(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(block_from_date, filedName);
		 
	 }
	 
	 public  void enterOnBlockAppointmentToDate(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(block_to_date, filedName);
		 
	 }
	 
	 public  void clickOnBlockPhlebotomistUnavailCheckbox(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(block_phlebotomist_unavailable_check, filedName);
		 
	 }
	 
	 public  void enterOnBlockAppointmentRemaks(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.textEnter(block_remaks, filedName);
		 
	 }
	 
	 public  void clickOnBlockPhlebotomitPlushIcon(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(block_plush_icon, filedName);
		 
	 }
	
	 public  void clickOnBlockPhlebotomitMondayCheckBox(String filedName) throws IOException, InterruptedException {
		 
		 CommanUtill.clickFunction(block_day_monday_chek, filedName);
		 
	 }
	 
	 public  void clickOnBlockPhlebotomitSaveIcon(String filedName) throws IOException, InterruptedException {
		 
		CommanUtill.clickFunction(block_save_btn, filedName);
		
	 }
}