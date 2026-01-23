/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 20-Jan-2026
 */
public class HealthCheckupPackagePlanAppointmentPage extends GeneralBrowserSetting {

	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	//-------------------------------Health Checkup Package Plan ----------------------------------

	protected static String doctor_chedule_meanu = "//span[normalize-space()='Doctor Schedule']";
	protected static String Health_checkup_package_plane = "//a[normalize-space()='Health Checkup & Package/Plan Appointment']"; 
	protected static String Health_check_Uhid = "//input[@id='uHid']";
	protected static String opd_Packages_serach = "//input[@id='autocomplete_opdpckg']";
	protected static String Click_opd_Packages_Test = "//div[@class='select_diagnostics']//div[1]//div[1]//tr[1]";

	protected static String Doctor_Equiptment_drp = "//select[@id='ddlEquipment_1']";
	protected static String appointment_date = "//input[@id='Calendar_1']";
	protected static String Schedule_Slot_drp = "//select[@id='ddlSlots_1']";
	protected static String chkk_box_select = "//input[@id='chk_1']";
	protected static String Health_check_up_save_btn = "//i[@class='fa fa-save']";
	protected static String Health_check_up_save_Yes_pop = "//a[@id='btnyes']";
	
	protected static String refresh_Btn = "//a[@id='btnrefresh']//i[@class='fa fa-refresh']";



	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void HealthcheckuppackageplaneAppointment(String doctor_scheduling , String appointment_page) throws IOException, InterruptedException {  

		CommanUtill.clickFunction(doctor_chedule_meanu, doctor_scheduling);
		CommanUtill.clickFunction(Health_checkup_package_plane, appointment_page);
	}

	public void enterUHIDInExcelSheet(String UHID) throws IOException, InterruptedException {  

		CommanUtill.textEnter(Health_check_Uhid, UHID);
		driver.findElement(By.xpath(Health_check_Uhid)).sendKeys(Keys.ENTER);
	}
	public void enterUHID(String UHID) throws IOException, InterruptedException {  

		CommanUtill.textEnter(Health_check_Uhid, UHID);
	}
	

	public void TestInOPDPackage(String OPD_Search_Package , String Click_Op_Opd_Package_Test) throws IOException, InterruptedException {  

		CommanUtill.textEnter(opd_Packages_serach, OPD_Search_Package);
		CommanUtill.clickFunction(Click_opd_Packages_Test, Click_Op_Opd_Package_Test);
	}
   
	public void DoctorAndEquipmentDrp(String Doctor_Equi_Drp) throws IOException, InterruptedException {  
		
		CommanUtill.dropdownSelectByVisibleText(Doctor_Equiptment_drp, Doctor_Equi_Drp);
	}
	
    public void EnterAppointmentDate(String Enter_date) throws IOException, InterruptedException {  
		
    	WebElement date = driver.findElement(By.xpath(appointment_date));
    	//date.sendKeys(Keys.CONTROL + "a");
    	//date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(appointment_date, Enter_date);
		date.sendKeys(Keys.TAB);
	}
    
    public void enterDateOfBrith_1(String date) throws IOException, InterruptedException {
 	   
	    String[] parts = date.split("[/\\-]");

	  
	    String day = parts[0].startsWith("0") ? parts[0].substring(1) : parts[0];

	    String rawMonth = parts[1];
	    String month;
	   
	    if (rawMonth.matches("\\d+")) {
	        
	        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	        month = months[Integer.parseInt(rawMonth)-1];
	    } else {
	       
	        month = rawMonth;
	    }

	    String year = parts[2];

	    // click on date field to open datepicker
	    driver.findElement(By.xpath(appointment_date)).click();

	    // select year
	    WebElement yearDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    new Select(yearDrop).selectByVisibleText(year);

	    // select month
	    WebElement monthDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    new Select(monthDrop).selectByVisibleText(month);

	    // select day
	    List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td[not(contains(@class,'ui-datepicker-other-month'))]"));
	    for (WebElement d : allDates) {
	        if (d.getText().equals(day)) {
	            d.click();
	            break;
	        }
	    }
	}
   

       
    public void OPDPackageScheduleSlotDrp(String opd_slot) throws IOException , InterruptedException {
    	
    	CommanUtill.dropdownSelectByVisibleText(Schedule_Slot_drp, opd_slot);
    }
   
    public void selectNextAvailableSlot(String Slot_Book) throws IOException, InterruptedException {

        List<WebElement> options = driver.findElements(
                By.xpath("//select[@id='ddlSlots_1']/option"));

        java.time.LocalTime currentTime = java.time.LocalTime.now();

        for (WebElement option : options) {

            String slotText = option.getText().trim();

            if (slotText.isEmpty()) continue;

            String startTimeStr = slotText.split("To")[0].trim();
            java.time.LocalTime slotStartTime =
                    java.time.LocalTime.parse(startTimeStr);

            if (slotStartTime.isAfter(currentTime)) {

                CommanUtill.dropdownSelectByVisibleText(
                        "//select[@id='ddlSlots_1']", slotText);

                break;
            }
        }
    }
    
    public void CheckBoxOPDHealthCheckUpPackage(String Select_chkk) throws IOException , InterruptedException {
    	
    	CommanUtill.clickFunction(chkk_box_select, Select_chkk);
    	
    }
    
    public void SaveHealthCheckUpPackagePlane(String Save_Icon, String YesPop) throws IOException , InterruptedException {
    	
    	CommanUtill.clickFunction(Health_check_up_save_btn, Save_Icon);
    	if(CommanUtill.isElementPresent(Health_check_up_save_Yes_pop)) {
			CommanUtill.clickFunction(Health_check_up_save_Yes_pop, YesPop);
			System.out.println("Health Checkup Save Button Yes Pop");
		}
		else {
			System.out.println("Health Checkup Save Button Yes Pop did not appear");
		}
	}
   
    public void RefreshHeathCheckUpPackagePlane(String Refresh_Icon) throws IOException , InterruptedException {
    	
    	CommanUtill.clickFunction(refresh_Btn, Refresh_Icon);
    }
    }
    

	
	


