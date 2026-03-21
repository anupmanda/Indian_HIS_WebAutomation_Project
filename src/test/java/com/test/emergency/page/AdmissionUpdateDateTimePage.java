/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
 * 19-Mar-2026
 */
public class AdmissionUpdateDateTimePage extends GeneralBrowserSetting {
	
	protected static String facility = "//select[@id='Facility']";
	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String emergency_side_button = "//span[normalize-space()='ER Registration']";
	protected static String Admission_Date_Sheet = "//a[normalize-space()='Admission Update Date/Time']";
	protected static String Entetr_Er_No = "//input[@id='txtemrno']";
	
	protected static String  Radio_Btn_Admission_Date = "//input[@id='rbladmdate']";
	protected static String  New_Admission_Date = "//input[@id='txtnewadmissiondate']";
	
	protected static String  Save_Icon = "//a[@id='btnSaveUpdateDateTime']//i[@class='fa fa-save']";
	
	
	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}

	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnAdmissionUpdateDateTimePage(String emergency_btn, String Activity_page ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(emergency_side_button, emergency_btn);
		CommanUtill.clickFunction(Admission_Date_Sheet, Activity_page);
	}
   public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 
		
		WebElement er = driver.findElement(By.xpath(Entetr_Er_No));
		CommanUtill.textEnter(Entetr_Er_No, er_enter);
		er.sendKeys(Keys.ENTER);
	}
   public void RadioBtnAdmissionDate(String Admission_Radio ) throws IOException, InterruptedException {
	   
	   WebDriverWait admission_Radio = new WebDriverWait(driver, Duration.ofSeconds(10));
	   admission_Radio.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Admission_Date)));
	   WebElement radio = driver.findElement(By.xpath(Radio_Btn_Admission_Date));
	   if( !radio.isSelected());
	   CommanUtill.clickFunction(Radio_Btn_Admission_Date, Admission_Radio); 
   }
        public void enterCurrentDischargeDateTime() throws IOException, InterruptedException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm a");
		String currentDateTime = sdf.format(new java.util.Date());

		WebElement clear = driver.findElement(By.xpath(New_Admission_Date));
		clear.sendKeys(Keys.CONTROL + "a");
		clear.sendKeys(Keys.DELETE);

		CommanUtill.textEnter(New_Admission_Date, currentDateTime);
		clear.sendKeys(Keys.TAB);

		System.out.println("Discharge Date Time auto-set to: " + currentDateTime);

	}
        
        public void newAdmissionDateTime() throws IOException, InterruptedException {

            WebElement clear = driver.findElement(By.xpath(New_Admission_Date));
            String existingDateTime = clear.getAttribute("value");
            
            // Step 2: Extract DATE part
            String datePart = existingDateTime.split(" ")[0];

            // Step 3: Get current time - 20 min
            LocalDateTime currentDateTime = LocalDateTime.now().minusMinutes(20);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String newTime = currentDateTime.format(timeFormatter);

            // Step 4: Combine date + new time
            String finalDateTime = datePart + " " + newTime;

            // Step 5: Clear field
            clear.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            clear.sendKeys(Keys.DELETE);

            // Step 6: Enter updated value
            CommanUtill.textEnter(New_Admission_Date, finalDateTime);

            // Step 7: TAB (important)
            clear.sendKeys(Keys.TAB);

            System.out.println("Discharge Date Time updated (only time -20 min): " + finalDateTime);
        }
   public void saveAdmissionDateAndTime(String Save_Btn) throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(Save_Icon, Save_Btn);
   }
}
