/**
 * 
 */
package com.test.Nursing.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class NursingActivityPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Nursing_dashboard = "//li[@id='btn_Nursing']";
	protected static  String Nursing_Station_Drp = "//select[@id='Department']";
	protected static  String Nursing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Nursing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Nursing_Activity = "//span[normalize-space()='Nursing Activity']";

	//====================================== Nursing Activity =================================
	
	protected static  String Nursing_Activity_Page = "//li[@id='liNursingActivity']//li[1]";
	protected static  String enter_ip_Number = "//input[@placeholder='Search..']";
	protected static  String Admitted_Not_Occupid_chage_bed_Status_pop = "//a[@id='savechangebedstatus']//i[@class='fa fa-save']";
	protected static  String Admitted_Not_Occupid_chage_bed_Status_Yes_pop = "//a[@id='btn_svbedch_ok']";
	
	
			
	
	
	
	
	

	
	

	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnNursingDashboard(String Nursing_dashbord , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Nursing_dashboard, Nursing_dashbord);
		CommanUtill.dropdownSelectByVisibleText(Nursing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Nursing_Station_Yes_pop, Station_Yes_Pop);
	}

	public void ClickOnNursingActivityTab_Clearance(String NursingActivityTab , String Nursing_Clearance_page) 
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Nursing_Activity, NursingActivityTab);
	    Thread.sleep(1000);
		CommanUtill.clickFunction(Nursing_Activity_Page, Nursing_Clearance_page);
	}
	
	public void EnterSerchBoxInIPNumber(String Ip_No) throws IOException, InterruptedException {
		
		CommanUtill.textEnter(enter_ip_Number, Ip_No);
		
		
	}
	public void clickFirstAfterSearch_AdmittedNotOccupied() throws IOException, InterruptedException {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    By filteredPatients = By.xpath(
	        "//div[contains(@class,'patient-card') and " +
	        "(contains(@class,'admittednotoccupied') " +
	        "or contains(@class,'bedallottedbutnotoccupied')) and " +
	        "not(contains(@style,'display: none'))]"
	    );

	    List<WebElement> cards = driver.findElements(filteredPatients);

	    if (cards.isEmpty()) {
	        System.out.println("No patient found after search");
	        return;
	    }

	    // UI FIRST = DOM LAST
	    WebElement targetCard = cards.get(cards.size() - 1);

	    String patientName = (String) js.executeScript(
	        "return arguments[0].querySelector('span.patient-name')?.textContent.trim();", targetCard );

	    String ipNo = targetCard.getAttribute("data-uhid");
	    String bedNo = targetCard.getAttribute("data-ipid");

	    System.out.println("Patient Name : " + patientName);
	    System.out.println("IP No        : " + ipNo);
	    System.out.println("Bed No       : " + bedNo);

	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", targetCard);
	    Thread.sleep(400);

	    js.executeScript(
	        "arguments[0].style.outline='3px solid green';" +
	        "arguments[0].style.backgroundColor='#FFD166';",
	        targetCard
	    );
	    Thread.sleep(500);

	    js.executeScript("arguments[0].click();", targetCard);
	}

	
	public void SaveChangeBedStatus_YesPop(String Change_Bed_Status , String Yes_Pop) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Admitted_Not_Occupid_chage_bed_Status_pop, Change_Bed_Status);
	    Thread.sleep(1000);
		CommanUtill.clickFunction(Admitted_Not_Occupid_chage_bed_Status_Yes_pop, Yes_Pop);
		
	}




}
