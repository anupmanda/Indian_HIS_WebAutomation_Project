/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 18-Dec-2025
 */
public class GenerateScheduleAndEquipmentSchedulePage extends GeneralBrowserSetting{
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String doctor_Schedule_meanu = "//span[normalize-space()='Doctor Schedule']";
	protected static String generate_schedule = "//a[normalize-space()='Generate Schedule']";
	
	//----------------------Generate Schedule Page ----------------------------
	protected static String generate_schudule_page = "//a[@id='opbillvisit']";
	protected static String specialization_drp = "//select[@id='drpSpecilization']";
	protected static String doctor_drp = "//select[@id='drpdoctorname']";
	
	protected static String serach_icon = "//a[@id='btndisplayschedules']//i[@class='fa fa-search']";
	protected static String left_arrow = "//i[@class='fa fa-arrow-left']";
	protected static String update_save_btn = "//i[@class='fa fa-edit']";
	protected static String update_yes_popup = "//a[@id='btnupdtyes']";
	protected static String plush_icon = "//a[@id='btnNew']//i[@class='fa fa-plus']";
	protected static String facility_doctor_drp = "//select[@id='FacilityId']";
	protected static String frome_date = "//input[@id='txtfrmdate']";
	protected static String to_date = "//input[@id='txtTodate']";
	protected static String save_icon = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected static String save_yes_popup = "//a[@id='btnyes']";
	
	
	//--------------------Setting 1 From And To Date -----------------------------------
	
	protected static String setting_1_frome_time = "//select[@id='sitting1fromtime']";
	protected static String setting_1_to_time = "//select[@id='sitting1totime']";
	protected static String setting_day_ckk = "//input[@class='checkAll']";
	protected static String setting_1_tick_maks_btn = "//a[@id='sittin1click']//i[@title='Ok']";
	
	protected static String setting_1_appo_type_monday = "//select[@id='AppointmentType10']";
	protected static String setting_1_appo_type_tuesday = "//select[@id='AppointmentType11']";
	protected static String setting_1_appo_type_wednesday = "//select[@id='AppointmentType12']";
	protected static String setting_1_appo_type_thursday = "//select[@id='AppointmentType13']";
	protected static String setting_1_appo_type_friday = "//select[@id='AppointmentType14']";
	protected static String setting_1_appo_type_saturday = "//select[@id='AppointmentType15']";
	protected static String setting_1_appo_type_sunday = "//select[@id='AppointmentType16']";
	
	protected static String setting_1_clinic_type_maoday = "//select[@id='ClinicType10']";
	protected static String setting_1_clinic_type_tuesday = "//select[@id='ClinicType11']";
	protected static String setting_1_clinic_type_wednesday = "//select[@id='ClinicType12']";
	protected static String setting_1_clinic_type_thursday = "//select[@id='ClinicType13']";
	protected static String setting_1_clinic_type_friday = "//select[@id='ClinicType14']";
	protected static String setting_1_clinic_type_saturday = "//select[@id='ClinicType15']";
	protected static String setting_1_clinic_type_sunday = "//select[@id='ClinicType16']";
	
	protected static String setting_1_remaks_maoday = "//input[@id='Remarks0']";
	protected static String setting_1_remaks_tuesday = "//input[@id='Remarks1']";
	protected static String setting_1_remaks_wednesday = "//input[@id='Remarks2']";
	protected static String setting_1_remaks_thursday = "//input[@id='Remarks3']";
	protected static String setting_1_remaks_friday = "//input[@id='Remarks4']";
	protected static String setting_1_remaks_saturday = "//input[@id='Remarks5']";
	protected static String setting_1_remaks_sunday = "//input[@id='Remarks6']";
	
	//--------------------Setting 2 From And To Date -----------------------------------
	
	protected static String setting_2_frome_time = "//select[@id='sitting2fromtime']";
	protected static String setting_2_to_time = "//select[@id='sitting2totime']";
	protected static String setting_2_tick_maks_btn = "//a[@id='sitting2click']//i[@title='Ok']";
	
	protected static String setting_2_appo_type_monday = "//select[@id='AppointmentType20']";
	protected static String setting_2_appo_type_tuesday = "//select[@id='AppointmentType21']";
	protected static String setting_2_appo_type_wednesday = "//select[@id='AppointmentType22']";
	protected static String setting_2_appo_type_thursday = "//select[@id='AppointmentType23']";
	protected static String setting_2_appo_type_friday = "//select[@id='AppointmentType24']";
	protected static String setting_2_appo_type_saturday = "//select[@id='AppointmentType25']";
	protected static String setting_2_appo_type_sunday = "//select[@id='AppointmentType26']";
	
	protected static String setting_2_clinic_type_maoday = "//select[@id='ClinicType20']";
	protected static String setting_2_clinic_type_tuesday = "//select[@id='ClinicType21']";
	protected static String setting_2_clinic_type_wednesday = "//select[@id='ClinicType22']";
	protected static String setting_2_clinic_type_thursday = "//select[@id='ClinicType23']";
	protected static String setting_2_clinic_type_friday = "//select[@id='ClinicType24']";
	protected static String setting_2_clinic_type_saturday = "//select[@id='ClinicType25']";
	protected static String setting_2_clinic_type_sunday = "//select[@id='ClinicType26']";
	
	protected static String setting_2_remaks_maoday = "//input[@id='Setting2Remarks0']";
	protected static String setting_2_remaks_tuesday = "//input[@id='Setting2Remarks1']";
	protected static String setting_2_remaks_wednesday = "//input[@id='Setting2Remarks2']";
	protected static String setting_2_remaks_thursday = "//input[@id='Setting2Remarks3']";
	protected static String setting_2_remaks_friday = "//input[@id='Setting2Remarks4']";
	protected static String setting_2_remaks_saturday = "//input[@id='Setting2Remarks5']";
	protected static String setting_2_remaks_sunday = "//input[@id='Setting2Remarks6']";
	
	//--------------------Setting 3 From And To Date -----------------------------------
	
	protected static String setting_3_frome_time = "//select[@id='sitting3fromtime']";
	protected static String setting_3_to_time = "//select[@id='sitting3totime']";
	protected static String setting_3_tick_maks_btn = "//a[@id='sitting3click']//i[@title='Ok']";
	
	protected static String setting_3_appo_type_monday = "//select[@id='AppointmentType30']";
	protected static String setting_3_appo_type_tuesday = "//select[@id='AppointmentType31']";
	protected static String setting_3_appo_type_wednesday = "//select[@id='AppointmentType32']";
	protected static String setting_3_appo_type_thursday = "//select[@id='AppointmentType33']";
	protected static String setting_3_appo_type_friday = "//select[@id='AppointmentType34']";
	protected static String setting_3_appo_type_saturday = "//select[@id='AppointmentType35']";
	protected static String setting_3_appo_type_sunday = "//select[@id='AppointmentType36']";
	
	protected static String setting_3_clinic_type_maoday = "//select[@id='ClinicType30']";
	protected static String setting_3_clinic_type_tuesday = "//select[@id='ClinicType31']";
	protected static String setting_3_clinic_type_wednesday = "//select[@id='ClinicType32']";
	protected static String setting_3_clinic_type_thursday = "//select[@id='ClinicType33']";
	protected static String setting_3_clinic_type_friday = "//select[@id='ClinicType34']";
	protected static String setting_3_clinic_type_saturday = "//select[@id='ClinicType35']";
	protected static String setting_3_clinic_type_sunday = "//select[@id='ClinicType36']";
	
	protected static String setting_3_remaks_maoday = "//input[@id='Setting3Remarks0']";
	protected static String setting_3_remaks_tuesday = "//input[@id='Setting3Remarks1']";
	protected static String setting_3_remaks_wednesday = "//input[@id='Setting3Remarks2']";
	protected static String setting_3_remaks_thursday = "//input[@id='Setting3Remarks3']";
	protected static String setting_3_remaks_friday = "//input[@id='Setting3Remarks4']";
	protected static String setting_3_remaks_saturday = "//input[@id='Setting3Remarks5']";
	protected static String setting_3_remaks_sunday = "//input[@id='Setting3Remarks6']";
	
	//----------------------Generate Equipment Schedule-------------------------------
	
	protected static String generate_equiment_schedule_btn = "//a[@id='opbilldiagnostic']";
	
	protected static String generate_equiment_drp = "//select[@id='drpequipment']";
	protected static String generate_equiment_serach = "//a[@id='btndisplayschedules']//i[@class='fa fa-search']";
	protected static String generate_equiment_mon_edite_remaks = "//input[@id='Remark1']";
	protected static String generate_equiment_edite_save = "//i[@class='fa fa-edit']";
	protected static String generate_equiment_edite_save_yes_popup = "//a[@id='btnupdtyes']";
	//Assertion //div[@class='gritter-item']
	protected static String generate_equiment_plush_icon = "//a[@id='btnNew']//i[@class='fa fa-plus']";
	protected static String generate_equiment_facility_drp = "//select[@id='FacilityId']";
	protected static String generate_equiment_frome_date = "//input[@id='txtfrmdate']";
	protected static String generate_equiment_to_date = "//input[@id='txtTodate']";
	
	//-------------------------------Sitting 1 Generate Equiment ----------------------------
	protected static String generate_equiment_sitting_1_From_time = "//select[@id='sitting1fromtime']";
	protected static String generate_equiment_sitting_1_to_time = "//select[@id='sitting1totime']";
	protected static String generate_equiment_all_days_chkk = "//input[@class='checkAll']";
	protected static String generate_equiment_sitting_1_ok = "//a[@id='sittin1click']//i[@title='Ok']";
	
	protected static String generate_equiment_appoint_type_monday = "//select[@id='AppointmentType10']";
	protected static String generate_equiment_appoint_type_tuesday = "//select[@id='AppointmentType11']";
	protected static String generate_equiment_appoint_type_wednesday = "//select[@id='AppointmentType12']";
	protected static String generate_equiment_appoint_type_thursday = "//select[@id='AppointmentType13']";
	protected static String generate_equiment_appoint_type_friday = "//select[@id='AppointmentType14']";
	protected static String generate_equiment_appoint_type_saturday = "//select[@id='AppointmentType15']";
	protected static String generate_equiment_appoint_type_sunday = "//select[@id='AppointmentType16']";
	
	protected static String generate_equiment_setting_1_clinic_type_maoday = "//select[@id='ClinicType10']";
	protected static String generate_equiment_setting_1_clinic_type_tuesday = "//select[@id='ClinicType11']";
	protected static String generate_equiment_setting_1_clinic_type_wednesday = "//select[@id='ClinicType12']";
	protected static String generate_equiment_setting_1_clinic_type_thursday = "//select[@id='ClinicType13']";
	protected static String generate_equiment_setting_1_clinic_type_friday = "//select[@id='ClinicType14']";
	protected static String generate_equiment_setting_1_clinic_type_saturday = "//select[@id='ClinicType15']";
	protected static String generate_equiment_setting_1_clinic_type_sunday = "//select[@id='ClinicType16']";
	
	protected static String generate_equiment_setting_1_remaks_maoday = "//input[@id='Remarks0']";
	protected static String generate_equiment_setting_1_remaks_tuesday = "//input[@id='Remarks1']";
	protected static String generate_equiment_setting_1_remaks_wednesday = "//input[@id='Remarks2']";
	protected static String generate_equiment_setting_1_remaks_thursday = "//input[@id='Remarks3']";
	protected static String generate_equiment_setting_1_remaks_friday = "//input[@id='Remarks4']";
	protected static String generate_equiment_setting_1_remaks_saturday = "//input[@id='Remarks5']";
	protected static String generate_equiment_setting_1_remaks_sunday = "//input[@id='Remarks6']";
	
	//-------------------------------Setting 2 Generate Equiment ----------------------------
	protected static String Mon_generate_equiment_sitting_2_Appo_type = "//select[@id='AppointmentType20']";
	protected static String Mon_generate_equiment_sitting_2_clinic_type = "//select[@id='ClinicType20']";
	protected static String Mon_generate_equiment_sitting_2_remaks = "//input[@id='Setting2Remarks0']";
	
	protected static String Tue_generate_equiment_sitting_2_Appo_type = "//select[@id='AppointmentType21']";
	protected static String Tue_generate_equiment_sitting_2_clinic_type = "//select[@id='ClinicType21']";
	protected static String Tue_generate_equiment_sitting_2_remaks = "//input[@id='Setting2Remarks1']";
	
	protected static String Wed_generate_equiment_sitting_2_Appo_type = "//select[@id='AppointmentType22']";
	protected static String Wed_generate_equiment_sitting_2_clinic_type = "//select[@id='ClinicType22']";
	protected static String Wed_generate_equiment_sitting_2_remaks = "//input[@id='Setting2Remarks2']";
	
	protected static String Thu_generate_equiment_sitting_2_Appo_type = "//select[@id='AppointmentType23']";
	protected static String Thu_generate_equiment_sitting_2_clinic_type = "//select[@id='ClinicType23']";
	protected static String Thu_generate_equiment_sitting_2_remaks = "//input[@id='Setting2Remarks3']";
	
	protected static String Fri_generate_equiment_sitting_2_Appo_type = "//select[@id='AppointmentType24']";
	protected static String Fri_generate_equiment_sitting_2_clinic_type = "//select[@id='ClinicType24']";
	protected static String Fri_generate_equiment_sitting_2_remaks = "//input[@id='Setting2Remarks4']";
	
	protected static String Sat_generate_equiment_sitting_2_Appo_type = "//select[@id='AppointmentType25']";
	protected static String Sat_generate_equiment_sitting_2_clinic_type = "//select[@id='ClinicType25']";
	protected static String Sat_generate_equiment_sitting_2_remaks = "//input[@id='Setting2Remarks5']";
	
	protected static String Sun_generate_equiment_sitting_2_Appo_type = "//select[@id='AppointmentType26']";
	protected static String Sun_generate_equiment_sitting_2_clinic_type = "//select[@id='ClinicType26']";
	protected static String Sun_generate_equiment_sitting_2_remaks = "//input[@id='Setting2Remarks6']";
	
	//--------------------------------Siting 3 Generate Equiment -----------------------------
	
	protected static String mon_generate_equiment_sitting_3_Appo_type = "//select[@id='AppointmentType30']";
	protected static String mon_generate_equiment_sitting_3_Clinic_Type = "//select[@id='ClinicType30']";
	protected static String mon_generate_equiment_sitting_3_Remaks = "//input[@id='Setting3Remarks0']";
	
	protected static String tue_generate_equiment_sitting_3_Appo_type = "//select[@id='AppointmentType31']";
	protected static String tue_generate_equiment_sitting_3_Clinic_Type = "//select[@id='ClinicType31']";
	protected static String tue_generate_equiment_sitting_3_Remaks = "//input[@id='Setting3Remarks1']";
	
	protected static String wed_generate_equiment_sitting_3_Appo_type = "//select[@id='AppointmentType32']";
	protected static String wed_generate_equiment_sitting_3_Clinic_Type = "//select[@id='ClinicType32']";
	protected static String wed_generate_equiment_sitting_3_Remaks = "//input[@id='Setting3Remarks2']";
	
	protected static String thu_generate_equiment_sitting_3_Appo_type = "//select[@id='AppointmentType33']";
    protected static String thu_generate_equiment_sitting_3_Clinic_Type = "//select[@id='ClinicType33']";
    protected static String thu_generate_equiment_sitting_3_Remaks = "//input[@id='Setting3Remarks3']";
    
    protected static String fri_generate_equiment_sitting_3_Appo_type = "//select[@id='AppointmentType34']";
    protected static String fri_generate_equiment_sitting_3_Clinic_Type = "//select[@id='ClinicType34']";
    protected static String fri_generate_equiment_sitting_3_Remaks = "//input[@id='Setting3Remarks4']";
    
    protected static String sat_generate_equiment_sitting_3_Appo_type = "//select[@id='AppointmentType35']";
    protected static String sat_generate_equiment_sitting_3_Clinic_Type = "//select[@id='ClinicType35']";
    protected static String sat_generate_equiment_sitting_3_Remaks = "//input[@id='Setting3Remarks5']";
    
    protected static String sun_generate_equiment_sitting_3_Appo_type = "//select[@id='AppointmentType36']";
    protected static String sun_generate_equiment_sitting_3_Clinic_Type = "//select[@id='ClinicType36']";
    protected static String sun_generate_equiment_sitting_3_Remaks = "//input[@id='Setting3Remarks6']";
    
    
	
	
	
	
	
	
	
	protected static String generate_equiment_save_icon = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected static String generate_equiment_save_yes_popup = "//a[@id='btnyes']";
	
	
	
		
	
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
	
	public void clickOnGenerateScheduleButton(String schedule_meanu , String Genrate_Schedule) throws IOException, InterruptedException {

		CommanUtill.clickFunction(doctor_Schedule_meanu, schedule_meanu);
		CommanUtill.clickFunction(generate_schedule, Genrate_Schedule);
	} 
	
	//----------------------Generate Schedule Page ----------------------------
	
	public void selectBySpecializationAndDoctorName(String specialization , String doctor_name_drp) throws IOException , InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(specialization_drp, specialization);
		//Select doctor_DropDwon= new Select (driver.findElement(By.cssSelector("#select2-drpdoctorname-container")));
		//doctor_DropDwon.selectByVisibleText(doctor_name_drp);
		CommanUtill.dropdownSelectByVisibleText(doctor_drp, doctor_name_drp);
	}
	//-------------------------Update Slot And other Filed----------------------------
	
    public void serachAppointmentDoctorButton(String serach ) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(serach_icon, serach);
	}
	public void updateSlotIcon(String edit_update_icon , String Yes_popup) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(update_save_btn, edit_update_icon);
		CommanUtill.clickFunction(update_yes_popup, Yes_popup);
	}
    //--------------------- Generate Schedule ---------------------
	
    public void clickOnPlushIcon(String plush_btn)  throws IOException , InterruptedException{
    	
    	CommanUtill.clickFunction(plush_icon, plush_btn);
    }
    
	public void selectByFacilityDrp(String facility ) throws IOException , InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(facility_doctor_drp, facility);
	}
	
	private String convertDateForUI(String inputDate) {

	    DateTimeFormatter uiFormat =
	            DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    DateTimeFormatter[] supportedFormats = {
	            DateTimeFormatter.ofPattern("dd-MMM-yy"),
	            DateTimeFormatter.ofPattern("dd-MMM-yyyy"),
	            DateTimeFormatter.ofPattern("dd/MM/yyyy")
	    };

	    for (DateTimeFormatter format : supportedFormats) {
	        try {
	            String formattedDate = LocalDate.parse(inputDate, format)
	                    .format(uiFormat);

	            System.out.println("Converted Date :: " + inputDate + " -> " + formattedDate);
	            logger.info("Converted Date :: " + inputDate + " -> " + formattedDate);

	            return formattedDate;

	        } catch (Exception ignored) {}
	    }

	    throw new RuntimeException("Unsupported date format: " + inputDate);
	}

	public void AppointmentScheduleingFromDateAndToDate(
	        String fromDate, String toDate)
	        throws IOException, InterruptedException {

	    String from = convertDateForUI(fromDate);
	    String to   = convertDateForUI(toDate);

	    logger.info("Appointment From Date (UI Format) : " + from);
	    logger.info("Appointment To Date (UI Format)   : " + to);

	    System.out.println("Appointment From Date : " + from);
	    System.out.println("Appointment To Date   : " + to);

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    WebElement fromEl = driver.findElement(By.xpath(frome_date));
	    WebElement toEl   = driver.findElement(By.xpath(to_date));

	    // -------- FROM DATE --------
	    js.executeScript(
	        "arguments[0].removeAttribute('readonly');" +
	        "arguments[0].value = arguments[1];" +
	        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
	        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
	        fromEl, from
	    );

	    Thread.sleep(500);

	    // -------- TO DATE --------
	    js.executeScript(
	        "arguments[0].removeAttribute('readonly');" +
	        "arguments[0].value = arguments[1];" +
	        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
	        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
	        toEl, to
	    );
	}
	
	
	public void enterDateOfGenerateSchedule(String fromDate_1, String toDate_1) throws IOException, InterruptedException {
		
		//Frome Date
		WebElement fromdate = driver.findElement(By.xpath(frome_date));
		fromdate.sendKeys(Keys.CONTROL + "a");
		fromdate.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(frome_date, fromDate_1);
		fromdate.sendKeys(Keys.TAB);
	
		//ToDate
		WebElement todate = driver.findElement(By.xpath(to_date));
		todate.sendKeys(Keys.CONTROL + "a");
		todate.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(to_date, toDate_1);
		todate.sendKeys(Keys.TAB);
	}
	
	public void setting_1FromeTimeAndToTime(String from_time , String to_time ) throws IOException , InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(setting_1_frome_time, from_time);
		CommanUtill.dropdownSelectByVisibleText(setting_1_to_time, to_time);
		
	}
	
   public void clickOnDaysCheckBox(String days_check_box) throws IOException , InterruptedException{
	   
	   CommanUtill.clickFunction(setting_day_ckk, days_check_box);  
   }
   
   public void clickOnTickSingnMarksButton(String singn) throws IOException , InterruptedException{
	   
	   CommanUtill.clickFunction(setting_1_tick_maks_btn, singn);
   }
   
   public void MondayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
		   throws IOException , InterruptedException{
	   
	  CommanUtill.dropdownSelectByVisibleText(setting_1_appo_type_monday, appointment_type_drp); 
	  CommanUtill.dropdownSelectByVisibleText(setting_1_clinic_type_maoday, clinic_type); 
	  CommanUtill.textEnter(setting_1_remaks_maoday, remaks); 
	  
   }
   public void TuesdayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
		   throws IOException , InterruptedException{
	   
	  CommanUtill.dropdownSelectByVisibleText(setting_1_appo_type_tuesday, appointment_type_drp); 
	  CommanUtill.dropdownSelectByVisibleText(setting_1_clinic_type_tuesday, clinic_type); 
	  CommanUtill.textEnter(setting_1_remaks_tuesday, remaks); 
   }  
   public void WednesdayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
		   throws IOException , InterruptedException{
	   
	  CommanUtill.dropdownSelectByVisibleText(setting_1_appo_type_wednesday, appointment_type_drp); 
	  CommanUtill.dropdownSelectByVisibleText(setting_1_clinic_type_wednesday, clinic_type); 
	  CommanUtill.textEnter(setting_1_remaks_wednesday, remaks); 
   }  
   
   public void ThursdayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
		   throws IOException , InterruptedException{
	   
	  CommanUtill.dropdownSelectByVisibleText(setting_1_appo_type_thursday, appointment_type_drp); 
	  CommanUtill.dropdownSelectByVisibleText(setting_1_clinic_type_thursday, clinic_type); 
	  CommanUtill.textEnter(setting_1_remaks_thursday, remaks); 
   }  
   
   public void FridayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
		   throws IOException , InterruptedException{
	   
	  CommanUtill.dropdownSelectByVisibleText(setting_1_appo_type_friday, appointment_type_drp); 
	  CommanUtill.dropdownSelectByVisibleText(setting_1_clinic_type_friday, clinic_type); 
	  CommanUtill.textEnter(setting_1_remaks_friday, remaks); 
   }  
    
   public void SaturdayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
		   throws IOException , InterruptedException{
	   
	  CommanUtill.dropdownSelectByVisibleText(setting_1_appo_type_saturday, appointment_type_drp); 
	  CommanUtill.dropdownSelectByVisibleText(setting_1_clinic_type_saturday, clinic_type); 
	  CommanUtill.textEnter(setting_1_remaks_saturday, remaks); 
   } 
   
   public void SundayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
		   throws IOException , InterruptedException{
	   
	  CommanUtill.dropdownSelectByVisibleText(setting_1_appo_type_sunday, appointment_type_drp); 
	  CommanUtill.dropdownSelectByVisibleText(setting_1_clinic_type_sunday, clinic_type); 
	  CommanUtill.textEnter(setting_1_remaks_sunday, remaks); 
   } 
   
   //---------------------Sitting 2 -----------------------
   
   public void Sitting_2FromTimeAndToTime_VerifyOkButton(String Sitting_2_From_Time , String String_2_To_Time , String Vrify_ok)  
		   throws IOException , InterruptedException{
	   
	   CommanUtill.dropdownSelectByVisibleText(setting_2_frome_time, Sitting_2_From_Time);
	   CommanUtill.dropdownSelectByVisibleText(setting_2_to_time, String_2_To_Time);
	   CommanUtill.clickFunction(setting_2_tick_maks_btn, Vrify_ok);
   }
   public void Setting2_MondayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_2_appo_type_monday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_2_clinic_type_maoday, clinic_type);
	    CommanUtill.textEnter(setting_2_remaks_maoday, remarks);
	}

   public void Setting2_TuesdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_2_appo_type_tuesday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_2_clinic_type_tuesday, clinic_type);
	    CommanUtill.textEnter(setting_2_remaks_tuesday, remarks);
	}

   public void Setting2_WednesdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_2_appo_type_wednesday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_2_clinic_type_wednesday, clinic_type);
	    CommanUtill.textEnter(setting_2_remaks_wednesday, remarks);
	}

   public void Setting2_ThursdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_2_appo_type_thursday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_2_clinic_type_thursday, clinic_type);
	    CommanUtill.textEnter(setting_2_remaks_thursday, remarks);
	}

   public void Setting2_FridayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_2_appo_type_friday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_2_clinic_type_friday, clinic_type);
	    CommanUtill.textEnter(setting_2_remaks_friday, remarks);
	}

   public void Setting2_SaturdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_2_appo_type_saturday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_2_clinic_type_saturday, clinic_type);
	    CommanUtill.textEnter(setting_2_remaks_saturday, remarks);
	}

   public void Setting2_SundayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_2_appo_type_sunday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_2_clinic_type_sunday, clinic_type);
	    CommanUtill.textEnter(setting_2_remaks_sunday, remarks);
	    
	}
   //--------------------Sitting 3 ------------------------------------
   
   public void Sitting_3FromTimeAndToTime_VerifyOkButton(String Sitting_2_From_Time , String String_2_To_Time , String Vrify_ok)  
		   throws IOException , InterruptedException{
	   
	   CommanUtill.dropdownSelectByVisibleText(setting_3_frome_time, Sitting_2_From_Time);
	   CommanUtill.dropdownSelectByVisibleText(setting_3_to_time, String_2_To_Time);
	   CommanUtill.clickFunction(setting_3_tick_maks_btn, Vrify_ok);
   }
   public void Setting3_MondayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_3_appo_type_monday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_3_clinic_type_maoday, clinic_type);
	    CommanUtill.textEnter(setting_3_remaks_maoday, remarks);
	}
   public void Setting3_TuesdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_3_appo_type_tuesday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_3_clinic_type_tuesday, clinic_type);
	    CommanUtill.textEnter(setting_3_remaks_tuesday, remarks);
	}

   public void Setting3_WednesdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_3_appo_type_wednesday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_3_clinic_type_wednesday, clinic_type);
	    CommanUtill.textEnter(setting_3_remaks_wednesday, remarks);
	}

   public void Setting3_ThursdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_3_appo_type_thursday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_3_clinic_type_thursday, clinic_type);
	    CommanUtill.textEnter(setting_3_remaks_thursday, remarks);
	}

   public void Setting3_FridayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_3_appo_type_friday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_3_clinic_type_friday, clinic_type);
	    CommanUtill.textEnter(setting_3_remaks_friday, remarks);
	}

   public void Setting3_SaturdayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_3_appo_type_saturday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_3_clinic_type_saturday, clinic_type);
	    CommanUtill.textEnter(setting_3_remaks_saturday, remarks);
	}

   public void Setting3_SundayAppointmentType_ClinicType_Remarks(
	        String appointment_type_drp, String clinic_type, String remarks)
	        throws IOException, InterruptedException {

	    CommanUtill.dropdownSelectByVisibleText(setting_3_appo_type_sunday, appointment_type_drp);
	    CommanUtill.dropdownSelectByVisibleText(setting_3_clinic_type_sunday, clinic_type);
	    CommanUtill.textEnter(setting_3_remaks_sunday, remarks);
	}

   public void clickOnSaveButton(String SaveIcon , String Yes_popup)  throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(save_icon, SaveIcon);
	   CommanUtill.clickFunction(save_yes_popup, Yes_popup);
   }
   
   public void clickOnGenerateEquipmentSchedule(String Equipment_Schedule_btn ) throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(generate_equiment_schedule_btn, Equipment_Schedule_btn);   
   }
   
   public void selectByEquipmentDrp(String Equipment_drp ) throws IOException, InterruptedException {
	   
	   CommanUtill.dropdownSelectByVisibleText(generate_equiment_drp, Equipment_drp);
   }
   
   public void SerachEquimentMappingButton(String Equipment_Serach_btn ) throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(generate_equiment_serach, Equipment_Serach_btn);   
   }
  public void enterEquimentMappingEditeMondayRemaks(String equiment_mapping_remaks_edite, String equiment_edite_remaks, String Yes_popup )
		  throws IOException, InterruptedException {
	  
	  CommanUtill.textEnter(generate_equiment_mon_edite_remaks, equiment_mapping_remaks_edite);
	  CommanUtill.clickFunction(generate_equiment_edite_save, equiment_edite_remaks);
	  CommanUtill.clickFunction(generate_equiment_edite_save_yes_popup, equiment_edite_remaks);
  }
  
  public void clickOnPlushIconButton(String plush_icon) throws IOException, InterruptedException {
	  
	  CommanUtill.clickFunction(generate_equiment_plush_icon, plush_icon);
  }
   
  public void selectByFacilityEquiment(String faclility_drp) throws IOException, InterruptedException {
	  
	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_facility_drp, faclility_drp);
  }

  public void enterEqiumentMappingFromAndToDate(String From_date, String To_Date)
	        throws IOException, InterruptedException {

	    // FROM DATE
	    WebElement fromDate = driver.findElement(By.xpath(generate_equiment_frome_date));
	    fromDate.sendKeys(Keys.CONTROL + "a");
	    fromDate.sendKeys(Keys.DELETE);
	    CommanUtill.textEnter(generate_equiment_frome_date, From_date);
	    fromDate.sendKeys(Keys.TAB);

	    // TO DATE
	    WebElement toDate = driver.findElement(By.xpath(generate_equiment_to_date));
	    toDate.sendKeys(Keys.CONTROL + "a");
	    toDate.sendKeys(Keys.DELETE);
	    CommanUtill.textEnter(generate_equiment_to_date, To_Date);
	    toDate.sendKeys(Keys.TAB);
	}

  
  
  
public void enterSitting_1_EqiumentMappingFromAndToTime(String From_time , String To_time) throws IOException, InterruptedException {
	  
	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_sitting_1_From_time, From_time);
	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_sitting_1_to_time, To_time);
  }
    public void CheckBoxOnAllDays(String days_check_box) throws IOException, InterruptedException {
	  
	  CommanUtill.clickFunction(generate_equiment_all_days_chkk, days_check_box);  
    }
     
    public void sitting_1_OkButton(String ok_btn)  throws IOException, InterruptedException {
  	  
  	  CommanUtill.clickFunction(generate_equiment_sitting_1_ok, ok_btn);  
  	  
      }
    //-------------------------- Equiment Appointment Clinic type Remaks-----------------------
    
    public void Equiment_Sitting_1_MondayAppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
 		   throws IOException , InterruptedException{
 	   
 	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_appoint_type_monday, appointment_type_drp); 
 	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_setting_1_clinic_type_maoday, clinic_type); 
 	  CommanUtill.textEnter(generate_equiment_setting_1_remaks_maoday, remaks); 
 	  
    }
  
    public void Equiment_Sitting_1_Tuesday_AppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
  		   throws IOException , InterruptedException{
  	   
  	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_appoint_type_tuesday, appointment_type_drp); 
  	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_setting_1_clinic_type_tuesday, clinic_type); 
  	  CommanUtill.textEnter(generate_equiment_setting_1_remaks_tuesday, remaks); 
  	  
     }
    
    public void Equiment_Sitting_1_Wednesday_AppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
   		   throws IOException , InterruptedException{
   	   
   	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_appoint_type_wednesday, appointment_type_drp); 
   	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_setting_1_clinic_type_wednesday, clinic_type); 
   	  CommanUtill.textEnter(generate_equiment_setting_1_remaks_wednesday, remaks); 
   	  
      }
    public void Equiment_Sitting_1_Thursday_AppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
    		   throws IOException , InterruptedException{
    	   
    	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_appoint_type_thursday, appointment_type_drp); 
    	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_setting_1_clinic_type_thursday, clinic_type); 
    	  CommanUtill.textEnter(generate_equiment_setting_1_remaks_thursday, remaks); 
    	  
       }
    public void Equiment_Sitting_1_Friday_AppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
 		   throws IOException , InterruptedException{
 	   
 	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_appoint_type_friday, appointment_type_drp); 
 	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_setting_1_clinic_type_friday, clinic_type); 
 	  CommanUtill.textEnter(generate_equiment_setting_1_remaks_friday, remaks); 
 	  
    }
    
    public void Equiment_Sitting_1_Saturday_AppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
  		   throws IOException , InterruptedException{
  	   
  	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_appoint_type_saturday, appointment_type_drp); 
  	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_setting_1_clinic_type_saturday, clinic_type); 
  	  CommanUtill.textEnter(generate_equiment_setting_1_remaks_saturday, remaks); 
  	  
     }
    public void Equiment_Sitting_1_Sunday_AppointmentType_ClinicType_Remaks(String appointment_type_drp , String clinic_type , String remaks) 
   		   throws IOException , InterruptedException{
   	   
   	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_appoint_type_sunday, appointment_type_drp); 
   	  CommanUtill.dropdownSelectByVisibleText(generate_equiment_setting_1_clinic_type_sunday, clinic_type); 
   	  CommanUtill.textEnter(generate_equiment_setting_1_remaks_sunday, remaks); 
   	  
      }
    public void saveEqiumentMappingBtnAndYesPopup(String Save_btn , String Yes_popup)   throws IOException , InterruptedException{
    	
    	CommanUtill.clickFunction(generate_equiment_save_icon, Save_btn);
    	CommanUtill.clickFunction(generate_equiment_save_yes_popup, Yes_popup);
    }
    
  //***********************************Sitting 2 Generate Equiment ******************************************
    
    public void Sitting_2_EqiumentMappingFromAndToTime(String From_time , String To_time , String Sitting_2_ok) 
    		throws IOException, InterruptedException {
  	  
  	  CommanUtill.dropdownSelectByVisibleText(setting_2_frome_time, From_time);
  	  CommanUtill.dropdownSelectByVisibleText(setting_2_to_time, To_time);
  	  CommanUtill.clickFunction(setting_2_tick_maks_btn, Sitting_2_ok);
  	  
	}
    
    public void Sitting_2_EqiumentMon_Mon_AppointmentClinicRemark(String Mon_Sitting_2_Appo_Drp , String Mon_Sitting_2_Clinic_Drp , String Mon_Sitting_2_Remaks ) 
			throws IOException, InterruptedException {
    	
      CommanUtill.dropdownSelectByVisibleText(Mon_generate_equiment_sitting_2_Appo_type, Mon_Sitting_2_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(Mon_generate_equiment_sitting_2_clinic_type, Mon_Sitting_2_Clinic_Drp);
  	  CommanUtill.textEnter(Mon_generate_equiment_sitting_2_remaks, Mon_Sitting_2_Remaks); 
    }
    
    public void Sitting_2_Eqiument_Tue_AppointmentClinicRemark(String Tue_Sitting_2_Appo_Drp , String Tue_Sitting_2_Clinic_Drp , String Tue_Sitting_2_Remaks )
    			throws IOException, InterruptedException {
		
	  CommanUtill.dropdownSelectByVisibleText(Tue_generate_equiment_sitting_2_Appo_type, Tue_Sitting_2_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(Tue_generate_equiment_sitting_2_clinic_type, Tue_Sitting_2_Clinic_Drp);
  	  CommanUtill.textEnter(Tue_generate_equiment_sitting_2_remaks, Tue_Sitting_2_Remaks);
    } 
    
    public void Sitting_2_Eqiument_Wed_AppointmentClinicRemark(String Wed_Sitting_2_Appo_Drp , String Wed_Sitting_2_Clinic_Drp , String Wed_Sitting_2_Remaks )
    			throws IOException, InterruptedException {
    	
   	  CommanUtill.dropdownSelectByVisibleText(Wed_generate_equiment_sitting_2_Appo_type, Wed_Sitting_2_Appo_Drp);
   	  CommanUtill.dropdownSelectByVisibleText(Wed_generate_equiment_sitting_2_clinic_type, Wed_Sitting_2_Clinic_Drp);
   	  CommanUtill.textEnter(Wed_generate_equiment_sitting_2_remaks, Wed_Sitting_2_Remaks);
    }
    
    public void Sitting_2_Eqiument_Thu_AppointmentClinicRemark(String Thu_Sitting_2_Appo_Drp , String Thu_Sitting_2_Clinic_Drp , String Thu_Sitting_2_Remaks )
    			throws IOException, InterruptedException {
    		
		
   	  CommanUtill.dropdownSelectByVisibleText(Thu_generate_equiment_sitting_2_Appo_type, Thu_Sitting_2_Appo_Drp);
   	  CommanUtill.dropdownSelectByVisibleText(Thu_generate_equiment_sitting_2_clinic_type, Thu_Sitting_2_Clinic_Drp);
   	  CommanUtill.textEnter(Thu_generate_equiment_sitting_2_remaks, Thu_Sitting_2_Remaks);
	}
    
    public void Sitting_2_Eqiument_Fri_AppointmentClinicRemark(String Fri_Sitting_2_Appo_Drp , String Fri_Sitting_2_Clinic_Drp , String Fri_Sitting_2_Remaks )
			throws IOException, InterruptedException {
		
	  CommanUtill.dropdownSelectByVisibleText(Fri_generate_equiment_sitting_2_Appo_type, Fri_Sitting_2_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(Fri_generate_equiment_sitting_2_clinic_type, Fri_Sitting_2_Clinic_Drp);
  	  CommanUtill.textEnter(Fri_generate_equiment_sitting_2_remaks, Fri_Sitting_2_Remaks);
	}
    
    public void Sitting_2_Eqiument_Sat_AppointmentClinicRemark(String Sat_Sitting_2_Appo_Drp , String Sat_Sitting_2_Clinic_Drp , String Sat_Sitting_2_Remaks )
			throws IOException, InterruptedException {
		
	  CommanUtill.dropdownSelectByVisibleText(Sat_generate_equiment_sitting_2_Appo_type, Sat_Sitting_2_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(Sat_generate_equiment_sitting_2_clinic_type, Sat_Sitting_2_Clinic_Drp);
  	  CommanUtill.textEnter(Sat_generate_equiment_sitting_2_remaks, Sat_Sitting_2_Remaks);
	}
    
    public void Sitting_2_Eqiument_Sun_AppointmentClinicRemark(String Sun_Sitting_2_Appo_Drp , String Sun_Sitting_2_Clinic_Drp , String Sun_Sitting_2_Remaks )
			throws IOException, InterruptedException {
		
	  CommanUtill.dropdownSelectByVisibleText(Sun_generate_equiment_sitting_2_Appo_type, Sun_Sitting_2_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(Sun_generate_equiment_sitting_2_clinic_type, Sun_Sitting_2_Clinic_Drp);
  	  CommanUtill.textEnter(Sun_generate_equiment_sitting_2_remaks, Sun_Sitting_2_Remaks);
  	  
    }
    
//***********************************Sitting 3 Generate Equiment ******************************************
    
    public void Sitting_3_EqiumentMappingFromAndToTime(String From_time , String To_time , String Sitting_2_ok) 
    		throws IOException, InterruptedException {
  	  
  	  CommanUtill.dropdownSelectByVisibleText(setting_3_frome_time, From_time);
  	  CommanUtill.dropdownSelectByVisibleText(setting_3_to_time, To_time);
  	  CommanUtill.clickFunction(setting_3_tick_maks_btn, Sitting_2_ok);
  	  
	}
    
    public void Sitting_3_EqiumentMon_Mon_AppointmentClinicRemark(String Mon_Sitting_3_Appo_Drp , String Mon_Sitting_3_Clinic_Drp , String Mon_Sitting_3_Remaks )	
    			throws IOException, InterruptedException {
		
	  CommanUtill.dropdownSelectByVisibleText(mon_generate_equiment_sitting_3_Appo_type, Mon_Sitting_3_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(mon_generate_equiment_sitting_3_Clinic_Type, Mon_Sitting_3_Clinic_Drp);
  	  CommanUtill.textEnter(mon_generate_equiment_sitting_3_Remaks, Mon_Sitting_3_Remaks);
  	  
    }
    public void Sitting_3_Eqiument_Tue_AppointmentClinicRemark(String Tue_Sitting_3_Appo_Drp , String Tue_Sitting_3_Clinic_Drp , String Tue_Sitting_3_Remaks )
				throws IOException, InterruptedException {
    	
      CommanUtill.dropdownSelectByVisibleText(tue_generate_equiment_sitting_3_Appo_type, Tue_Sitting_3_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(tue_generate_equiment_sitting_3_Clinic_Type, Tue_Sitting_3_Clinic_Drp);
  	  CommanUtill.textEnter(tue_generate_equiment_sitting_3_Remaks, Tue_Sitting_3_Remaks);
    }
    
    public void Sitting_3_Eqiument_Wed_AppointmentClinicRemark(String Wed_Sitting_3_Appo_Drp , String Wed_Sitting_3_Clinic_Drp , String Wed_Sitting_3_Remaks )
    				throws IOException, InterruptedException {
		
	  CommanUtill.dropdownSelectByVisibleText(wed_generate_equiment_sitting_3_Appo_type, Wed_Sitting_3_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(wed_generate_equiment_sitting_3_Clinic_Type, Wed_Sitting_3_Clinic_Drp);
  	  CommanUtill.textEnter(wed_generate_equiment_sitting_3_Remaks, Wed_Sitting_3_Remaks);
  	  
    }
    
    public void Sitting_3_Eqiument_Thu_AppointmentClinicRemark(String Thu_Sitting_3_Appo_Drp , String Thu_Sitting_3_Clinic_Drp , String Thu_Sitting_3_Remaks )
					throws IOException, InterruptedException {
    	
    		  CommanUtill.dropdownSelectByVisibleText(thu_generate_equiment_sitting_3_Appo_type, Thu_Sitting_3_Appo_Drp);
    	   	  CommanUtill.dropdownSelectByVisibleText(thu_generate_equiment_sitting_3_Clinic_Type, Thu_Sitting_3_Clinic_Drp);
    	   	  CommanUtill.textEnter(thu_generate_equiment_sitting_3_Remaks, Thu_Sitting_3_Remaks);
    }
    
    public void Sitting_3_Eqiument_Fri_AppointmentClinicRemark(String Fri_Sitting_3_Appo_Drp , String Fri_Sitting_3_Clinic_Drp , String Fri_Sitting_3_Remaks )
    					throws IOException, InterruptedException {
    	
    	  CommanUtill.dropdownSelectByVisibleText(fri_generate_equiment_sitting_3_Appo_type, Fri_Sitting_3_Appo_Drp);
    	  CommanUtill.dropdownSelectByVisibleText(fri_generate_equiment_sitting_3_Clinic_Type, Fri_Sitting_3_Clinic_Drp);
	  	  CommanUtill.textEnter(fri_generate_equiment_sitting_3_Remaks, Fri_Sitting_3_Remaks);
    }
    
    public void Sitting_3_Eqiument_Sat_AppointmentClinicRemark(String Sat_Sitting_3_Appo_Drp , String Sat_Sitting_3_Clinic_Drp , String Sat_Sitting_3_Remaks )
						throws IOException, InterruptedException {
    		
		
		  CommanUtill.dropdownSelectByVisibleText(sat_generate_equiment_sitting_3_Appo_type, Sat_Sitting_3_Appo_Drp);
		  CommanUtill.dropdownSelectByVisibleText(sat_generate_equiment_sitting_3_Clinic_Type, Sat_Sitting_3_Clinic_Drp);
	  	  CommanUtill.textEnter(sat_generate_equiment_sitting_3_Remaks, Sat_Sitting_3_Remaks);
	}
    
    public void Sitting_3_Eqiument_Sun_AppointmentClinicRemark(String Sun_Sitting_3_Appo_Drp , String Sun_Sitting_3_Clinic_Drp , String Sun_Sitting_3_Remaks )
			throws IOException, InterruptedException {
		
	  CommanUtill.dropdownSelectByVisibleText(sun_generate_equiment_sitting_3_Appo_type, Sun_Sitting_3_Appo_Drp);
  	  CommanUtill.dropdownSelectByVisibleText(sun_generate_equiment_sitting_3_Clinic_Type, Sun_Sitting_3_Clinic_Drp);
  	  CommanUtill.textEnter(sun_generate_equiment_sitting_3_Remaks, Sun_Sitting_3_Remaks);
    }
    
}
