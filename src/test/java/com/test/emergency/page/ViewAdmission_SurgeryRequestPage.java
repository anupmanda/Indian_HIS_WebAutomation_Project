/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 23-Mar-2026
 */
public class ViewAdmission_SurgeryRequestPage extends GeneralBrowserSetting {
	
	protected static String facility = "//select[@id='Facility']";
	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String emergency_side_button = "//span[normalize-space()='ER Registration']";
	protected static String Click_Admission_SurgeryRequest = "//a[normalize-space()='View Admission/Surgery Request']";
	
	protected static String search_From_Date = "//input[@id='f_date']";
	protected static String Search_To_Date = "//input[@id='to_date']";
	
	protected static String Click_Search_icon = "//i[@id='date_search']";
	protected static String Request_Type_Drp = "//select[@id='_RequestType']";
	protected static String Doctor_Drp = "//select[@id='_doctor']";
	protected static String Speciality_Drp = "//select[@id='_speciality']";
	
	//=================================Table===============================
	
	protected static String Search_Table_First = "//table[@id='tbl_dsPatientFullDetails']//thead";
	protected static String Search_Table_Surgery = "//table[@id='tbl_dsPatientFullDetails']//tbody//tr[3]";
	
	
	
	
	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}

	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void AdmissionSurgeryRequestPage(String emergency_btn, String Admission_Surgery_Request ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(emergency_side_button, emergency_btn);
		CommanUtill.clickTabSwitchToAnotherWindowNew(Click_Admission_SurgeryRequest, Admission_Surgery_Request);
	}
	
	public void enterFromeDate(String From_Date) throws IOException, InterruptedException { 
	
		WebElement date = driver.findElement(By.xpath(search_From_Date));
		date.sendKeys(Keys.CONTROL + "a");
		date.sendKeys(Keys.DELETE);

		CommanUtill.textEnter(search_From_Date, From_Date);
		date.sendKeys(Keys.TAB);
	}
	public void enterToDate(String to_Date) throws IOException, InterruptedException { 
		
		WebElement date = driver.findElement(By.xpath(Search_To_Date));
		date.sendKeys(Keys.CONTROL + "a");
		date.sendKeys(Keys.DELETE);

		CommanUtill.textEnter(Search_To_Date, to_Date);
		date.sendKeys(Keys.TAB);
	}
	public void ClickOnSearchBtn(String Search_Icon)throws IOException, InterruptedException { 
		
		WebDriverWait Search = new WebDriverWait( driver, Duration.ofSeconds(5));
		Search.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Search_icon)));
		CommanUtill.clickFunction(Click_Search_icon, Search_Icon);
	}
	public void selectByRequestTypeDrp(String RequestBy)throws IOException, InterruptedException { 
		
		WebDriverWait Request = new WebDriverWait( driver, Duration.ofSeconds(5));
		Request.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(Click_Search_icon)));
		CommanUtill.dropdownSelectByVisibleText(Request_Type_Drp, RequestBy);
	}
   public void selectByDoctoreDrp(String Doctor)throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(Doctor_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Doctor_Drp, Doctor);
	}
   public void selectBySpecilityDrp(String Specility) throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(Speciality_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Speciality_Drp, Specility);
	}
   
   public void ClickOnSearchAllTable(String Surgery_Patient_Table) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Header
	    WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(
	    		By.xpath("//table[@id='tbl_dsPatientFullDetails']//thead")));

	    System.out.println("===== HEADER =====");
	    System.out.println(header.getText());

	    //  Wait for rows
	    List<WebElement> rows = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	            By.xpath("//table[@id='tbl_dsPatientFullDetails']//tr[@data-admid]")));

	    System.out.println("Total Rows: " + rows.size());
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    boolean isClicked = false;

	    //LOOP all rows (IMPORTANT)
	    for (int i = 0; i < rows.size(); i++) {

	        WebElement row = rows.get(i);
	        WebElement cell = row.findElement(By.xpath("td[1]"));

	        js.executeScript("arguments[0].scrollIntoView(true);", cell);
	        Thread.sleep(300);
	        js.executeScript("arguments[0].click();", cell);

	        System.out.println("Clicked Row: " + (i + 1));

	        try {
	            //Check if bottom table appears
	            WebElement bottomRow = new WebDriverWait(driver, Duration.ofSeconds(3))
	                    .until(ExpectedConditions.visibilityOfElementLocated(
	                            By.xpath("//table[contains(@class,'table')][2]//tbody/tr[1]")
	                    ));

	            System.out.println("===== BOTTOM TABLE DATA FOUND =====");
	            System.out.println(bottomRow.getText());

	            isClicked = true;
	            break; //stop when valid row found

	        } catch (Exception e) {
	            System.out.println("No bottom data for this row, trying next...");
	        }
	    }

	    if (!isClicked) {
	        System.out.println(" No row contains bottom table data");
	    }
	}
   
   public void ClickOnSearchTable(String Surgery_Patient_Table) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Header
	    WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[@id='tbl_dsPatientFullDetails']//thead")));

	    String headerText = header.getText();

	    System.out.println("===== HEADER =====");
	    System.out.println(headerText);

	    logger.info("===== HEADER =====");
	    logger.info(headerText); 
	    
	    // Wait for table data
	    WebDriverWait bottomRow = new WebDriverWait(driver, Duration.ofSeconds(10));
	    bottomRow.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search_Table_Surgery)));

	    WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath(Search_Table_Surgery)));

	    String tableText = table.getText();

	    System.out.println("===== TABLE DATA FOUND =====");
	    System.out.println(tableText);

	    logger.info("===== TABLE DATA FOUND =====");
	    logger.info(tableText); 

	    table.click();
	    logger.info("Clicked on surgery patient table row successfully");
	}
	    

	    
   


}
