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
 * 16-Jan-2026
 */
public class DoctorBlockScheduleAndEquipmentSchedulePage extends GeneralBrowserSetting{
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String doctor_Schedule_meanu = "//span[normalize-space()='Doctor Schedule']";
	protected static String Block_schedule = "//a[normalize-space()='Block Schedule']";
	
	//--------------------------------------Block Schedule Page ------------------------------
	protected static String block_schedule_Icon = "//h4[@class='fa fa-user-md']";
	protected static String select_Specialization_drp = "//select[@id='drpSpecilization']";
	protected static String Check_Box_Unavailableoctor = "//input[@id='chckDoctorUnavailable']";
	protected static String Remaks = "//textarea[@id='txtnewremark']";
	protected static String select_Doctor_drp = "//select[@id='drpdoctorname']";
	protected static String Plush_icon_Block_Schedule_btn = "//a[@id='btnNew']//i[@class='fa fa-plus']";
	protected static String facility_Drp = "//select[@id='FacilityId']";
	protected static String Block_From_Date = "//input[@id='txtfrmdate']";
	protected static String Block_To_Date = "//input[@id='txtTodate']";
	
	protected static String Block_Day_Monday_chkk = "//input[@id='chkStatus0']";
	protected static String Block_Day_Monday_From_Time = "//input[@id='fromtime0']";
	protected static String Block_Day_Monday_To_Time = "//input[@id='totime0']";
	protected static String Block_Day_Monday_Remaks = "//input[@id='Remarks0']";
	
	protected static String Block_Day_Tuesday_chkk = "//input[@id='chkStatus1']";
	protected static String Block_Day_Tuesday_From_Time = "//input[@id='fromtime1']";
	protected static String Block_Day_Tuesday_To_Time = "//input[@id='totime1']";
	protected static String Block_Day_Tuesday_Remaks = "//input[@id='Remarks1']";
	
	protected static String Block_Day_Wednesday_chkk = "//input[@id='chkStatus2']";
	protected static String Block_Day_Wednesday_From_Time = "//input[@id='fromtime2']";
	protected static String Block_Day_Wednesday_To_Time = "//input[@id='totime2']";
	protected static String Block_Day_Wednesday_Remaks = "//input[@id='Remarks2']";
	
	protected static String Block_Day_Thursday_chkk = "//input[@id='chkStatus3']";
	protected static String Block_Day_Thursday_From_Time = "//input[@id='fromtime3']";
	protected static String Block_Day_Thursday_To_Time = "//input[@id='totime3']";
	protected static String Block_Day_Thursday_Remaks = "//input[@id='Remarks3']";
	
	protected static String Block_Day_Friday_chkk = "//input[@id='chkStatus4']";
	protected static String Block_Day_Friday_From_Time = "//input[@id='fromtime4']";
	protected static String Block_Day_Friday_To_Time = "//input[@id='totime4']";
	protected static String Block_Day_Friday_Remaks = "//input[@id='Remarks4']";
	
	protected static String Block_Day_Saturday_chkk = "//input[@id='chkStatus5']";
	protected static String Block_Day_Saturday_From_Time = "//input[@id='fromtime5']";
	protected static String Block_Day_Saturday_To_Time = "//input[@id='totime5']";
	protected static String Block_Day_Saturday_Remaks = "//input[@id='Remarks5']";
	
	protected static String Block_Day_Sunday_chkk = "//input[@id='chkStatus6']";
	protected static String Block_Day_Sunday_From_Time = "//input[@id='fromtime6']";
	protected static String Block_Day_Sunday_To_Time = "//input[@id='totime6']";
	protected static String Block_Day_Sunday_Remaks = "//input[@id='Remarks6']";
	
	protected String save_Block_Schedule_Button = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected String Yes_pop_Save_Block_Schedule = "//a[@id='btnyes']";
	
	//----------------------------Equipment Schedule ---------------------------------
	
	protected static String equipment_Schedule_Icon = "//h4[@class='fa fa-edit']";
	protected static String select_Equipment_drp = "//select[@id='drpequipment']";
	protected static String equipment_plush_icon = "//a[@id='btnNew']//i[@class='fa fa-plus']";
	protected static String equipment_Facility_drp = "//select[@id='FacilityId']";
	protected static String equipment_From_Date = "//input[@id='txtfrmdate']";
	protected static String equipment_To_Date = "//input[@id='txtTodate']";
	
	protected static String equipment_Day_Monday_chkk = "//input[@id='chkStatus0']";
	protected static String equipment_Day_Monday_From_Time = "//input[@id='fromtime0']";
	protected static String equipment_Day_Monday_To_Time = "//input[@id='totime0']";
	protected static String equipment_Day_Monday_Remaks = "//input[@id='Remarks0']";
	
	protected static String equipment_Day_Tuesday_chkk = "//input[@id='chkStatus1']";
	protected static String equipment_Day_Tuesday_From_Time = "//input[@id='fromtime1']";
	protected static String equipment_Day_Tuesday_To_Time = "//input[@id='totime1']";
	protected static String equipment_Day_Tuesday_Remaks = "//input[@id='Remarks1']";
	
	protected static String equipment_Day_Wednesday_chkk = "//input[@id='chkStatus2']";
	protected static String equipment_Day_Wednesday_From_Time = "//input[@id='fromtime2']";
	protected static String equipment_Day_Wednesday_To_Time = "//input[@id='totime2']";
	protected static String equipment_Day_Wednesday_Remaks = "//input[@id='Remarks2']";
	
	protected static String equipment_Day_Thursday_chkk = "//input[@id='chkStatus3']";
	protected static String equipment_Day_Thursday_From_Time = "//input[@id='fromtime3']";
	protected static String equipment_Day_Thursday_To_Time = "//input[@id='totime3']";
	protected static String equipment_Day_Thursday_Remaks = "//input[@id='Remarks3']";
	
	protected static String equipment_Day_Friday_chkk = "//input[@id='chkStatus4']";
	protected static String equipment_Day_Friday_From_Time = "//input[@id='fromtime4']";
	protected static String equipment_Day_Friday_To_Time = "//input[@id='totime4']";
	protected static String equipment_Day_Friday_Remaks = "//input[@id='Remarks4']";
	
	protected static String equipment_Day_Saturday_chkk = "//input[@id='chkStatus5']";
	protected static String equipment_Day_Saturday_From_Time = "//input[@id='fromtime5']";
	protected static String equipment_Day_Saturday_To_Time = "//input[@id='totime5']";
	protected static String equipment_Day_Saturday_Remaks = "//input[@id='Remarks5']";
	
	protected static String equipment_Day_Sunday_chkk = "//input[@id='chkStatus6']";
	protected static String equipment_Day_Sunday_From_Time = "//input[@id='fromtime6']";
	protected static String equipment_Day_Sunday_To_Time = "//input[@id='totime6']";
	protected static String equipment_Day_Sunday_Remaks = "//input[@id='Remarks6']";
	
	protected String save_Equipment_Schedule_Button = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected String Yes_pop_Save_Equipment_Schedule = "//a[@id='btnyes']";
	
	
	
	
	
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
		//logger.pass(facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}
	//--------------------------------------Generate Schedule meanu ------------------------------
	
	public void clickOnBlockScheduleButton(String schedule_meanu , String Block_Schedule) throws IOException, InterruptedException {

		CommanUtill.clickFunction(doctor_Schedule_meanu, schedule_meanu);
		CommanUtill.clickFunction(Block_schedule, Block_Schedule);
	} 
	
	public void clickOnBlockScheduleIcon(String Block_Schedule_Icon) throws IOException, InterruptedException {

		CommanUtill.clickFunction(block_schedule_Icon, Block_Schedule_Icon);
	}
	
	public void selectBySpecializationDropdwon(String specializationText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_Specialization_drp, specializationText);
		//logger.pass(specializationText);
	}
	
	public void CheckBoxkUncheckDoctorUnavailableAndRemaks( String doctorUnavailableCheckBox , String Remaks_text) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Check_Box_Unavailableoctor, doctorUnavailableCheckBox);
		CommanUtill.textEnter(Remaks, Remaks_text);
		
	}
	public void selectByDoctorDropdwon(String doctorText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_Doctor_drp, doctorText);
		//logger.pass(doctorText);
	}
	
	public void PlushIconBtn(String save_Block_Schedule_Button) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Plush_icon_Block_Schedule_btn, save_Block_Schedule_Button);
	}
	
	public void selectByFacilityBlockDropdwon(String facilityBlockText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility_Drp, facilityBlockText);
		
	}
	public void enterBlockFromDate(String Current_fromDateText) throws IOException, InterruptedException {

		WebElement From_Date = driver.findElement(By.xpath(Block_From_Date));
		From_Date.sendKeys(Keys.CONTROL + "a");
		From_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Block_From_Date, Current_fromDateText);
		From_Date.sendKeys(Keys.TAB);
	}
	public void enterBlockToDate(String Current_toDateText) throws IOException, InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Block_To_Date));
		To_Date.sendKeys(Keys.CONTROL + "a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Block_To_Date, Current_toDateText);
		To_Date.sendKeys(Keys.TAB);
	}
	
	public void MondayDoctorBlockDay(String chkk_Mon , String Mon_From_Time , String Mon_To_Time , String Mon_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Block_Day_Monday_chkk, chkk_Mon);
		CommanUtill.clickFunction(Block_Day_Monday_From_Time, Mon_From_Time);
		CommanUtill.clickFunction(Block_Day_Monday_To_Time, Mon_To_Time);
		CommanUtill.textEnter(Block_Day_Monday_Remaks, Mon_Remaks);
	}
	
	public void TuesdayDoctorBlockDay(String chkk_Tue , String Tue_From_Time , String Tue_To_Time , String Tue_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Block_Day_Tuesday_chkk, chkk_Tue);
		CommanUtill.clickFunction(Block_Day_Tuesday_From_Time, Tue_From_Time);
		CommanUtill.clickFunction(Block_Day_Tuesday_To_Time, Tue_To_Time);
		CommanUtill.textEnter(Block_Day_Tuesday_Remaks, Tue_Remaks);
	}
	
	public void WednesdayDoctorBlockDay(String chkk_Wed , String Wed_From_Time , String Wed_To_Time , String Wed_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Block_Day_Wednesday_chkk, chkk_Wed);
		CommanUtill.clickFunction(Block_Day_Wednesday_From_Time, Wed_From_Time);
		CommanUtill.clickFunction(Block_Day_Wednesday_To_Time, Wed_To_Time);
		CommanUtill.textEnter(Block_Day_Wednesday_Remaks, Wed_Remaks);
	}
	
	public void ThursdayDoctorBlockDay(String chkk_Thu , String Thu_From_Time , String Thu_To_Time , String Thu_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Block_Day_Thursday_chkk, chkk_Thu);
		CommanUtill.clickFunction(Block_Day_Thursday_From_Time, Thu_From_Time);
		CommanUtill.clickFunction(Block_Day_Thursday_To_Time, Thu_To_Time);
		CommanUtill.textEnter(Block_Day_Thursday_Remaks, Thu_Remaks);
	}
	
	public void FridayDoctorBlockDay(String chkk_Fri , String Fri_From_Time , String Fri_To_Time , String Fri_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Block_Day_Friday_chkk, chkk_Fri);
		CommanUtill.clickFunction(Block_Day_Friday_From_Time, Fri_From_Time);
		CommanUtill.clickFunction(Block_Day_Friday_To_Time, Fri_To_Time);
		CommanUtill.textEnter(Block_Day_Friday_Remaks, Fri_Remaks);
	}
	
	public void SaturdayDoctorBlockDay(String chkk_Sat , String Sat_From_Time , String Sat_To_Time , String Sat_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Block_Day_Saturday_chkk, chkk_Sat);
		CommanUtill.clickFunction(Block_Day_Saturday_From_Time, Sat_From_Time);
		CommanUtill.clickFunction(Block_Day_Saturday_To_Time, Sat_To_Time);
		CommanUtill.textEnter(Block_Day_Saturday_Remaks, Sat_Remaks);
	}
	
	public void SundayDoctorBlockDay(String chkk_Sun , String Sun_From_Time , String Sun_To_Time , String Sun_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Block_Day_Sunday_chkk, chkk_Sun);
		CommanUtill.clickFunction(Block_Day_Sunday_From_Time, Sun_From_Time);
		CommanUtill.clickFunction(Block_Day_Sunday_To_Time, Sun_To_Time);
		CommanUtill.textEnter(Block_Day_Sunday_Remaks, Sun_Remaks);
	}
	
	public void saveBlockScheduleButton(String save_Block_Schedule_Icon , String Yes_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(save_Block_Schedule_Button, save_Block_Schedule_Icon);
		CommanUtill.clickFunction(Yes_pop_Save_Block_Schedule, Yes_Pop);
	}
	
	//----------------------------Equipment Block ---------------------------------
	
	public void clickOnEquipmentScheduleIcon(String Equipment_Schedule_Icon) throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Schedule_Icon, Equipment_Schedule_Icon);
	}
	
	public void selectByEquipmentDropdwon(String equipmentText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_Equipment_drp, equipmentText);
		//logger.pass(equipmentText);
	}
	public void equipmentPlushIconBtn(String equipment_Plush_Icon) throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_plush_icon, equipment_Plush_Icon);
	}
	public void selectByFacilityEquipmentDropdwon(String facilityEquipmentText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(equipment_Facility_drp, facilityEquipmentText);
		
	}
	public void enterEquipmentFromDate(String Equipment_fromDateText) throws IOException, InterruptedException {

		WebElement From_Date = driver.findElement(By.xpath(equipment_From_Date));
		From_Date.sendKeys(Keys.CONTROL + "a");
		From_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(equipment_From_Date, Equipment_fromDateText);
		From_Date.sendKeys(Keys.TAB);
	}
	public void enterEquipmentToDate(String Equipment_toDateText) throws IOException, InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(equipment_To_Date));
		To_Date.sendKeys(Keys.CONTROL + "a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(equipment_To_Date, Equipment_toDateText);
		To_Date.sendKeys(Keys.TAB);
	}
	public void MondayEquipmentBlockDay(String chkk_Mon , String Mon_From_Time , String Mon_To_Time , String Mon_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Day_Monday_chkk, chkk_Mon);
		CommanUtill.clickFunction(equipment_Day_Monday_From_Time, Mon_From_Time);
		CommanUtill.clickFunction(equipment_Day_Monday_To_Time, Mon_To_Time);
		CommanUtill.textEnter(equipment_Day_Monday_Remaks, Mon_Remaks);
	}
	public void TuesdayEquipmentBlockDay(String chkk_Tue , String Tue_From_Time , String Tue_To_Time , String Tue_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Day_Tuesday_chkk, chkk_Tue);
		CommanUtill.clickFunction(equipment_Day_Tuesday_From_Time, Tue_From_Time);
		CommanUtill.clickFunction(equipment_Day_Tuesday_To_Time, Tue_To_Time);
		CommanUtill.textEnter(equipment_Day_Tuesday_Remaks, Tue_Remaks);
	}
	public void WednesdayEquipmentBlockDay(String chkk_Wed , String Wed_From_Time , String Wed_To_Time , String Wed_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Day_Wednesday_chkk, chkk_Wed);
		CommanUtill.clickFunction(equipment_Day_Wednesday_From_Time, Wed_From_Time);
		CommanUtill.clickFunction(equipment_Day_Wednesday_To_Time, Wed_To_Time);
		CommanUtill.textEnter(equipment_Day_Wednesday_Remaks, Wed_Remaks);
	}
	public void ThursdayEquipmentBlockDay(String chkk_Thu , String Thu_From_Time , String Thu_To_Time , String Thu_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Day_Thursday_chkk, chkk_Thu);
		CommanUtill.clickFunction(equipment_Day_Thursday_From_Time, Thu_From_Time);
		CommanUtill.clickFunction(equipment_Day_Thursday_To_Time, Thu_To_Time);
		CommanUtill.textEnter(equipment_Day_Thursday_Remaks, Thu_Remaks);
		
	}
	public void FridayEquipmentBlockDay(String chkk_Fri , String Fri_From_Time , String Fri_To_Time , String Fri_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Day_Friday_chkk, chkk_Fri);
		CommanUtill.clickFunction(equipment_Day_Friday_From_Time, Fri_From_Time);
		CommanUtill.clickFunction(equipment_Day_Friday_To_Time, Fri_To_Time);
		CommanUtill.textEnter(equipment_Day_Friday_Remaks, Fri_Remaks);
	}
	public void SaturdayEquipmentBlockDay(String chkk_Sat , String Sat_From_Time , String Sat_To_Time , String Sat_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Day_Saturday_chkk, chkk_Sat);
		CommanUtill.clickFunction(equipment_Day_Saturday_From_Time, Sat_From_Time);
		CommanUtill.clickFunction(equipment_Day_Saturday_To_Time, Sat_To_Time);
		CommanUtill.textEnter(equipment_Day_Saturday_Remaks, Sat_Remaks);
	}
	public void SundayEquipmentBlockDay(String chkk_Sun , String Sun_From_Time , String Sun_To_Time , String Sun_Remaks) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(equipment_Day_Sunday_chkk, chkk_Sun);
		CommanUtill.clickFunction(equipment_Day_Sunday_From_Time, Sun_From_Time);
		CommanUtill.clickFunction(equipment_Day_Sunday_To_Time, Sun_To_Time);
		CommanUtill.textEnter(equipment_Day_Sunday_Remaks, Sun_Remaks);
	}
	
	public void saveEquipmentScheduleButton(String save_Equipment_Schedule_Icon , String Yes_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(save_Equipment_Schedule_Button, save_Equipment_Schedule_Icon);
		CommanUtill.clickFunction(Yes_pop_Save_Equipment_Schedule, Yes_Pop);
	
	}
}
