/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 24-Nov-2025
 */
public class FrontOfficeAppointmentSchedulingPage extends GeneralBrowserSetting {


	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	//-----------------------------Appointment------------------------------------

	protected static String doctor_che = "//span[normalize-space()='Doctor Schedule']";
	protected static String doctor_che_page = "//a[normalize-space()='Appointment Scheduling']";    //li[@id='FODoctorScheduleMenu']//li[1]

	protected static String generate_shedule_icon = "//a[@id='spec_show']";
	protected static String speciality_drp = "//select[@id='Speciality']";
	protected static String serach_doctor = "//i[@onclick='Doctor();']"; 

	//--------------------------------- Clinic Region -------------------------------- 

	protected static String clinic_region_drp = "//select[@id='clinic_region']";
	protected static String clinic_region_serach = "//span[@id='clinic_region1']//i[@class='fa fa-search']";

	//--------------------------------doctor -----------------------------------

	protected static String doctor_drp = "//select[@id='Doctor']";
	protected static String date = "//input[@id='frmdate']";
	protected static String search_date = "//a[@id='display_schedules']//i[@class='fa fa-search']";

	//---------------------------check Box All Facility ---------------------------
	protected static String show_all_facilities_checkbosx  = "//input[@id='allfacilities']";

	//----------------------check Box Day -----------------------------------------
	protected static String day_view_chk = "//input[@id='dayview']";

	//--------------------------serach Icon ---------------------------------------
	protected static String sarech_days = "//a[@id='display_schedules_dayview']//i[@class='fa fa-search']";

	//---------------------------visit Count---------------------------------

	protected static String visit_count_btn = "//a[@id='BtnVisitCount']";
	protected static String vist_count_close = "//a[@id='btncloseVisitCount']//i[@class='fa fa-times']";

	//-----------------------------unschedule slot and remaks---------------------------------------
	protected static String unschedule_slot_physician = "//a[normalize-space()='Unschedule Slot Physician']";
	protected static String unschedule_slot_physician_close = "//div[@id='popupunschedule']//i[@class='fa fa-times']";
	protected static String doctors_remarks = "//textarea[@id='DoctorRemark']";
//-------------------------------Slot Book --------------------------------------------
	private int selectedRowIndex = -1;
	private int selectedColIndex = -1;
	protected static String scheduleTableRows = "//table[@id='scheduleTable']//tr[position()>1]";

//------------------------Appointment Scheduling Popup----------------------------------
	
	protected static String uhid_text = "//input[@id='UHID_Schedule']";
	protected static String ip_no = "//input[@id='IPNO_Schedule']";
	protected static String mobile_no = "//input[@id='fetch_mobile']";
	protected static String First_name_modi = "//input[@id='modalfirstName']";
	protected static String middle_name_modi = "//input[@id='modalmiddleName']";
	protected static String last_name_modi = "//input[@id='modallastName']";
	protected static String country_code = "//input[@id='CountryCode']";
	protected static String mobile_no_modi = "//input[@id='modalmobileNo']";
	protected static String age_modi = "//input[@id='age']";
	protected static String gender_modi = "//select[@id='gender']";
	protected static String visit_type = "//select[@id='visittype']";
	protected static String source_appointment = "//select[@id='SourceOfAppointment']";
	protected static String sub_source_appointment = "//select[@id='SubSourceOfAppointment']";
	protected static String patient_type = "//select[@id='_patienttype']";
	protected static String locality_po = "//input[@id='txtLocality']";
	protected static String remaks_modi = "//textarea[@id='apptremarks']";
	protected static String save_icon_appoint_popup = "//a[@id='modalsave']//i[@class='fa fa-floppy-o']";
	protected static String edite_icon_appoint_poppup = "//i[@class='fa fa-edit']";
	protected static String refresh_icon_appoint_popup = "//a[@id='modal_refresh']//i[@class='fa fa-refresh']";
	protected static String cancel_icon_appoint_popup = "//a[@id='modal_refresh']//i[@class='fa fa-refresh']";
	protected static String close_icon_appoint_popup = "//span[@id='modelclose123']//i[@class='fa fa-times']";
	
	//--------------------Home Three Line----------------------------
	
	protected static String three_line_home = "//img[@id='showmenuIcon']";
	
//--------------------	Again Schedule Same Doctor Appointment -----------------
	
	protected static String yes_popup_reappointment = "//a[@id='btnyes']";
	
	//-------------------------Existing UHID ---------------------------------------
	  
	 String menuXPathExistingUHID = "//ul[contains(@class,'context-menu-list')]//span[normalize-space()='Link to Existing UHID']";
	 protected static String existing_UHId = "//input[@id='modaldataUHID']";
	 protected static String existing_card = "//input[@id='modaldataUHID']";
	 protected static String existing_save = "//a[@id='modalsaveuhid_map']//i[@class='fa fa-floppy-o']";
	 protected static String existing_bill = "//i[contains(@class,'fa fa-usd')]";
	 
	 
	 
	 


	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void ApponintmentScheduling(String doctor_scheduling , String appointment_page) throws IOException, InterruptedException {  

		CommanUtill.clickFunction(doctor_che, doctor_scheduling);
		CommanUtill.clickFunction(doctor_che_page, appointment_page);

	}
	public void GenreateScheduleButton(String Genreate_Schedule) throws IOException , InterruptedException{

		CommanUtill.clickFunction(generate_shedule_icon, Genreate_Schedule);
	}

	public void selectBySpecilityDrp(String Specility , String Doctor_serach) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(speciality_drp, Specility);
		CommanUtill.clickFunction(serach_doctor, Doctor_serach);
	}

	public void selectByDoctorName(String Doctor) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(doctor_drp, Doctor);

	}

	//Scheduling 
	
	public void selectFirstAvailableGreenSlot() throws IOException, InterruptedException {

	    List<WebElement> rows = driver.findElements(By.xpath(scheduleTableRows));
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
	    LocalTime now = LocalTime.now();

	    for (int i = 0; i < rows.size(); i++) {
	        WebElement row = rows.get(i);
	        String timeText = row.findElement(By.xpath("./td[1]")).getText().trim();
	        try {
	            LocalTime slotTime = LocalTime.parse(timeText, formatter);
	            if (slotTime.isAfter(now)) {

	                List<WebElement> cells = row.findElements(By.xpath("./td[position()>1]"));
	                for (int j = 0; j < cells.size(); j++) {
	                    WebElement cell = cells.get(j);

	                    String bgColor = cell.getCssValue("background-color");
	                    if (bgColor.contains("135, 235, 135")) {

	                        CommanUtill.scrollIntoView(driver, cell);
	                        Thread.sleep(300);

	                        ((JavascriptExecutor)driver)
	                            .executeScript("arguments[0].click();", cell);

	                        selectedRowIndex = i + 2;
	                        selectedColIndex = j + 2;

	                        System.out.println("***************************************");
	                        System.out.println("Selected Appointment Time: " + timeText);
	                        System.out.println("Clicked slot at row " + selectedRowIndex + " col " + selectedColIndex);
	                        System.out.println("***************************************");
	                        return;
	                    }
	                }
	            }
	        } catch (DateTimeParseException e) {
	            System.out.println("Could not parse time: " + timeText);
	        }
	    }
	    throw new RuntimeException("No available green slot found in future time!");
	}

 public void enterAppointmentPopupFirstMIddileAndLastName(String firstname , String middleName , String LastName)
		throws IOException, InterruptedException{
	
	CommanUtill.textEnter(First_name_modi, firstname);
	CommanUtill.textEnter(middle_name_modi, middleName);
	CommanUtill.textEnter(last_name_modi, LastName);
	
}
  public void enterAppointmentPopupMobileNumber(String Mobile_number )throws IOException, InterruptedException{
		
	CommanUtill.textEnter(mobile_no_modi, Mobile_number);

}
  public void enterAppointmentPopupAge(String age )throws IOException, InterruptedException{
		
		CommanUtill.textEnter(age_modi, age);

	}

  public void selectByAppointmentPopupGenderDrp(String gender )throws IOException, InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(gender_modi, gender);

	} 
  
  public void selectByAppointmentPopupVisitTypeDrp(String visit )throws IOException, InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(visit_type, visit);

	}
  
  public void SelectByAppointmentSourceAndSubSourceTypeDrp(String Source , String SubSource) throws IOException, InterruptedException{
	  
	  CommanUtill.dropdownSelectByVisibleText(source_appointment, Source);
	  CommanUtill.dropdownSelectByVisibleText(sub_source_appointment, SubSource);
	  
  }
  
  public void SelectByAppointmentPatientTypeDrp(String patientType) throws IOException, InterruptedException{
	  
	  CommanUtill.dropdownSelectByVisibleText(patient_type, patientType);
	  
  }
  
  public void enterLocolityAppointmentpopup(String locolity_text) throws IOException, InterruptedException{
	  
	  CommanUtill.textEnter(locality_po, locolity_text);
	  
  }
  
  public void enterRemaksAppointmentPopup(String Remaks_text)  throws IOException, InterruptedException{
	  
	  CommanUtill.textEnter(remaks_modi, Remaks_text);
  }
  
  public void SaveIconAppointmentPopup(String SaveBtn)throws IOException, InterruptedException{
	  
	  CommanUtill.clickFunction(save_icon_appoint_popup, SaveBtn);
  }
  
 
 public void yesPopupAgainSameDoctorAppointment(String Yes_Popup) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(yes_popup_reappointment)) {
			CommanUtill.clickFunction(yes_popup_reappointment, Yes_Popup);
			System.out.println("Re_Appointment popup appeared and was Yes.");
		} else {
			System.out.println("Re_Appointment popup did not appear.");
		}
	}
 
  // --------------------------Right Click In Yellow Button ------------------------------------
  
  public void rightClickOnBookedYellowSlot() throws IOException, InterruptedException {

	    String cellXPath = "//table[@id='scheduleTable']//tr[" + selectedRowIndex + "]/td[" + selectedColIndex + "]//span[contains(@class,'event')]";

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement yellowSlotSpan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cellXPath)));

	    // Scroll to element properly
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", yellowSlotSpan);
	    Thread.sleep(400); // system stable wait

	    String bgColor = yellowSlotSpan.getCssValue("background-color");
	    System.out.println("Slot color now = " + bgColor);

	    Actions actions = new Actions(driver);
	    actions.moveToElement(yellowSlotSpan).contextClick().perform();

	    System.out.println("[OK] right click Done.");
	}
  
  String menuXPath = "//ul[contains(@class,'context-menu-list')]//span[normalize-space()='Add Patient']";
  
  public void clickAddPatientFromContextMenu(String Add_patient) throws IOException, InterruptedException {

	    CommanUtill.clickFunction(menuXPath, Add_patient);
	/*    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement addPatientOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menuXPath)));

	    ((JavascriptExecutor)driver)
	            .executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", addPatientOption);

	    System.out.println("=== CLICKED Add Patient ===");
	    Thread.sleep(500);
	    */
	}
  
  //-----------------------three line Side Meanu--------------------
  
  public void clickOnThreeLineSideMeanuBar(String ClickMeanuBar) throws IOException, InterruptedException {
	  
	  CommanUtill.clickFunction(three_line_home, ClickMeanuBar);
  }
  
  public void enterUHIDNumber(String UHID) throws IOException, InterruptedException {
	  
	  CommanUtill.textEnter(uhid_text, UHID);
	  driver.findElement(By.xpath(uhid_text)).sendKeys(Keys.ENTER);
  }
  
  
  String menuXPathBill = "//ul[contains(@class,'context-menu-list')]//span[normalize-space()='Go To Bill']";
  
  public void clickAddTOBillPatient(String Add_Bill_patient) throws IOException, InterruptedException {

	    CommanUtill.clickFunction(menuXPathBill, Add_Bill_patient);
	
	}
//-------------------------Existing UHID ---------------------------------------
  
  public void clickLinkTOExistingUHID(String existing_UHID) throws IOException, InterruptedException {

	    CommanUtill.clickFunction(menuXPathExistingUHID, existing_UHID);
	}
  
  public void enterExistingUHIDAndSaveToBill(String enter_uhid , String save , String Bill_Icon)  throws IOException, InterruptedException {
	  
	  CommanUtill.textEnter(existing_UHId, enter_uhid);
	  CommanUtill.clickFunction(existing_save, save);
	  Thread.sleep(1000);
	  CommanUtill.clickFunction(existing_bill, Bill_Icon);
	  
  }
  
  
  
}
