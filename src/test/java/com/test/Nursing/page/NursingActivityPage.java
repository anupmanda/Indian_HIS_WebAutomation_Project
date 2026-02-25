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
import org.openqa.selenium.Keys;
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
	
	protected static  String Click_On_Acknowledge_btn = "//button[@id='acknowledgeBtn']";
	
	//======================== Discharge Tab ===================================
	protected static  String Click_Discharge_Tab = "//a[@id='NursingDischargeRequest']";
	protected static  String Discharge_Type_Drp  = "//select[@id='dishchargetype']";
	protected static  String Discharge_Sub_Type_Drp = "//select[@id='dishchargesubtype']";
	protected static  String Discharge_Remarks = "//textarea[@id='dis_Remarks']";
	protected static  String save_Discharge_Btn = "//a[@id='SaveDischargeIntimation']//i[@class='fa fa-save']";
	protected static  String Discharge_Yes_pop = "//a[@id='Dbtnyes']";
	
	protected static  String  Check_Box_Expected_Date_Discharge = "//input[@id='ExpectedDatechk']";
	protected static  String  Enter_Expected_Date_Discharge_Box = "//input[@id='DateDischarge']";
	protected static  String  Save_Expected_Date_Discharge_Icon = "//a[@id='DateDischargeSave']//i[@class='fa fa-save']";
	
	protected static  String   Check_Box_Mark_For_Discharge  = "//input[@id='ChkMarkforDischarge']";
	protected static  String   Enter_Date_Mark_For_Discharge  = "//input[@id='DateMarkforDischarge']";
	protected static  String   Save_Mark_For_Discharge_Icon  = "//a[@id='Save_MarkforDischarge']//i[@class='fa fa-save']";
			
	
	
	
	
	

	
	

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
	    Thread.sleep(5000);
		CommanUtill.clickFunction(Admitted_Not_Occupid_chage_bed_Status_Yes_pop, Yes_Pop);
		
	}
	
	public void ClickOnAcknowledgeSimilarWard(String Acknowledges_Btn) throws IOException, InterruptedException {
		
		if (CommanUtill.isElementPresent(Click_On_Acknowledge_btn)) {
			CommanUtill.clickFunction(Click_On_Acknowledge_btn, Acknowledges_Btn);
			System.out.println("Click On Apperar Acknowled Btnis click");
		} else {
			System.out.println(" Did not appear Acknowled Btn .");
		}
	}
	
   public void ClickOnDischargeBtn(String Discharge_Btn) throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(Click_Discharge_Tab, Discharge_Btn);
   }
	public void SelectDischargeType_DischargeSubType_Remarks_SaveIcon(String Discharge_Drp , String DischargeSubDrp , 
			String Remarks_Text , String Save_Icon)  throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Discharge_Type_Drp, Discharge_Drp);
		CommanUtill.dropdownSelectByVisibleText(Discharge_Sub_Type_Drp, DischargeSubDrp);
		CommanUtill.textEnter(Discharge_Remarks, Remarks_Text);
		CommanUtill.clickFunction(save_Discharge_Btn, Save_Icon);
	}
	public void DischargeYesPop(String Discharge_Yes_popup) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Discharge_Yes_pop, Discharge_Yes_popup);
	}
	
	public void CheckBoxExpectedDateDischarge_Date_Save(String ExpectedDateDischarge_Check_Box ,String Enter_Date , 
			String Save_Icon) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Check_Box_Expected_Date_Discharge, ExpectedDateDischarge_Check_Box);
		WebElement Date_Enter = driver.findElement(By.xpath(Enter_Expected_Date_Discharge_Box));
		Date_Enter.sendKeys(Keys.CONTROL +"a");
		Date_Enter.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Enter_Expected_Date_Discharge_Box, Enter_Date);
		Date_Enter.sendKeys(Keys.TAB);
		CommanUtill.clickFunction(Save_Expected_Date_Discharge_Icon, Save_Icon);
	}
	
	public void CheckBoxMarkDischarge_EnterDate_SaveIcon(String Check_Box_MarkDischarge ,String  Enter_Date , String Save_Icon)
			throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Check_Box_Mark_For_Discharge, Check_Box_MarkDischarge);
		WebElement Date_Enter = driver.findElement(By.xpath(Enter_Date_Mark_For_Discharge));
		Date_Enter.sendKeys(Keys.CONTROL +"a");
		Date_Enter.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Enter_Date_Mark_For_Discharge, Enter_Date);
		Date_Enter.sendKeys(Keys.TAB);
		CommanUtill.clickFunction(Save_Mark_For_Discharge_Icon, Save_Icon);
	}
		




}
