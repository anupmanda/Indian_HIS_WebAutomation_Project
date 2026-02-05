/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 29-Jan-2026
 */
public class AcknowledgeDischargeNotificationPage extends GeneralBrowserSetting {
	
	public AcknowledgeDischargeNotificationPage() {
		// TODO Auto-generated constructor stub
	
	}
		protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
		protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
		protected static  String Billing_Station_Drp = "//select[@id='Department']";
		protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
		protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";
		
		protected static  String Billing_Meanu = "//a[@id='showmenu']";
		protected static  String ip_billing = "//span[normalize-space()='IP Billing']";
		protected static  String Acknowledge_Discharge_page = "//a[normalize-space()='Acknowledge Discharge Notification']";
		
		//==========================Acknowledge Discharge Notification ================================
		
		protected static String radio_btn_Discharge_Notification = "//input[@id='Discharge']";
		protected static String Wards_drp = "//select[@id='wards']";
		protected static String status_Drp = "//select[@id='stausacknowledge']";
		protected static String Expected_Date_Discharge_radio_btn = "//input[@id='ExDischarge']";
		protected static String enter_date_chkk_box = "//input[@id='checkbox1']";
		protected static String Date_Expected_discharge   = "//input[@id='datecalendar']";
		protected static String Serach_Discharge_Icon = "//a[@id='searchdata']//i[@class='fa fa-search']";
		protected static String serach_IP_And_Name_Drp = "//select[@id='_ddlSearchType']";
		protected static String Enter_serach_IP_And_Name = "//input[@id='_txtSearchType']";
		protected static String serach_IP_And_Name_Icon = "//i[@id='_btnSearchType']";
		
		protected static String bill_type_Drp = "//select[@id='ddlBillType']";
		protected static String check_Box_Daycare = "//input[@id='isDaycareChk']";
		protected static String radio_Discharged_Marked = "//input[@id='isMarkDischarge']";
		protected static String Date_check_box_Discharged_Marked = "//input[@id='Dischargecheckbox']";
		protected static String Enter_DateDischarged_Marked = "//input[@id='Dischargedatecalendar']";
		protected static String Serach_Icon_Discharged_Marked = "//a[@id='Dischargesearchdata']//i[@class='fa fa-search']";
		
		protected static String Radio_btn_Current_Day_Pending_settlement = "//input[@id='ispendingsettlement']";
		protected static String Click_Bell_Icon = "//span[@id='_notificationBellCount']";
		//================================Table X Path =====================================
		protected String whiteRowXpath = "//table[@id='tbl1']/tbody/tr[contains(@style,'background:white')][1]";
		protected String whiteRowXpath_Yes_pop = "//a[@id='btnok']";
		protected String Bill_Ready_Yes_pop = "//a[@id='btnok2']";
		
		
		
		
		
		
		
		
		
		
		
		public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {
			
			CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
		}
		
		public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
				throws IOException , InvalidApplicationException, InterruptedException {
			
			//WebElement ip_billing_dasghboard = driver.findElement(By.xpath(Ip_Billing_dashboard));
			//ip_billing_dasghboard.click();
			
			CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
			CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
			CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
			logger.info("Sussfully Pass IP Billing Dashboard Button");
			}
		
		public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
				throws IOException , InvalidApplicationException, InterruptedException {
			
			CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
		}
		
		public void IpBilling_AcknowledgeDischargeNotificationPage(String Ip_Billing_Tab , String AcknowledgeDischargeNotification) 	
				throws IOException , InvalidApplicationException, InterruptedException {
			
			CommanUtill.clickFunction(ip_billing, Ip_Billing_Tab);
			CommanUtill.clickFunction(Acknowledge_Discharge_page, AcknowledgeDischargeNotification);
		}
		
		public void SelectByWardsDrp(String Wards_drp_Dis) throws IOException , InterruptedException{
			
			CommanUtill.dropdownSelectByVisibleText(Wards_drp, Wards_drp_Dis);
		}
		public void SelectByStatusDrp(String Status_Drp_Dis )throws IOException , InterruptedException{
			
			CommanUtill.dropdownSelectByVisibleText(status_Drp, Status_Drp_Dis);
		}
		
		public void RadioButtonExpectedDateDischarge_Checkbox_Date(String Radio_Expected_Discharge_btn , String Check_Box , String Date,
				String Serach) throws IOException , InterruptedException{
			
			CommanUtill.clickFunction(Expected_Date_Discharge_radio_btn, Radio_Expected_Discharge_btn);
			CommanUtill.clickFunction(enter_date_chkk_box, Check_Box);
			WebElement date_enter = driver.findElement(By.xpath(Date_Expected_discharge));
			date_enter.sendKeys(Keys.CONTROL +"a");
			date_enter.sendKeys(Keys.DELETE);
			CommanUtill.textEnter(Date_Expected_discharge, Date);
			date_enter.sendKeys(Keys.TAB);	
			CommanUtill.clickFunction(Serach_Discharge_Icon, Serach);
		}
		
		public void SerachExpectedDischargeIcon(String Discharge_Serach_icon) throws IOException , InterruptedException{
			
			CommanUtill.clickFunction(Serach_Discharge_Icon, Discharge_Serach_icon);
		}
		
		public void SelectByIpNumberAndEnterIPNumber_Serach(String ipnumber , String ip_no , String Serach_Ip_No) 
				throws IOException , InterruptedException{
			
			CommanUtill.dropdownSelectByVisibleText(serach_IP_And_Name_Drp, ipnumber);
			CommanUtill.textEnter(Enter_serach_IP_And_Name, ip_no);
			CommanUtill.clickFunction(serach_IP_And_Name_Icon, Serach_Ip_No);	
		}
		
		public void SelectByPatientNameAndEnterIPNumber_Serach(String patient_Name_Drp , String patent_name , String Serach_Ip_No) 
				throws IOException , InterruptedException{
			
			CommanUtill.dropdownSelectByVisibleText(serach_IP_And_Name_Drp, patient_Name_Drp);
			CommanUtill.textEnter(Enter_serach_IP_And_Name, patent_name);
			CommanUtill.clickFunction(serach_IP_And_Name_Icon, Serach_Ip_No);	
		}
		
		public void SelectbyBillTypeDrp(String Bill_Type) throws IOException , InterruptedException{
			
			CommanUtill.dropdownSelectByVisibleText(bill_type_Drp, Bill_Type);
		}
		
		public void CheckBoxIsDayCare(String daycare) throws IOException , InterruptedException{
			
			CommanUtill.clickFunction(check_Box_Daycare, daycare);	
		}
		public void DischargeMarkedRadioBtn_DateChkkBox_EnterDate(String  Discharge_Marked_Radio_Btn ,
				String Check_box_Discharge, String Discharhe_date , String Serach) throws IOException , InterruptedException{
			
			CommanUtill.clickFunction(radio_Discharged_Marked, Discharge_Marked_Radio_Btn);
			CommanUtill.clickFunction(Date_check_box_Discharged_Marked, Check_box_Discharge);
			
			WebElement date_enter = driver.findElement(By.xpath(Enter_DateDischarged_Marked));
			date_enter.sendKeys(Keys.CONTROL +"a");
			date_enter.sendKeys(Keys.DELETE);
			CommanUtill.textEnter(Enter_DateDischarged_Marked, Discharhe_date);
			date_enter.sendKeys(Keys.TAB);	
			CommanUtill.clickFunction(Serach_Icon_Discharged_Marked, Serach);
		}
		
		public void RadioButton_CurrentDayPendingforsettlement(String CurrentDayPendingsettlement) 
				throws IOException , InterruptedException{
			
			CommanUtill.clickFunction(Radio_btn_Current_Day_Pending_settlement, CurrentDayPendingsettlement);	
		}
		
		//========================= Click On Table In White ==============================
		
		public String clickFirstWhiteRowAndPrintDetails(String White_Row) throws IOException, InterruptedException {

		    String whiteRowXpath = "//table[@id='tbl1']/tbody/tr[contains(@style,'background:white')][1]";

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    WebElement whiteRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(whiteRowXpath)));

		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", whiteRow);
		    Thread.sleep(800);

		    // YELLOW HIGHLIGHT (ONLY ADDITION)
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px solid red';" + "arguments[0].style.backgroundColor="
            		+ "'yellow';",whiteRow);
		    Thread.sleep(500);

		    String sNo = whiteRow.findElement(By.xpath("./td[1]")).getText();
		    String ipNo = whiteRow.findElement(By.xpath("./td[3]")).getText();
		    String patientName = whiteRow.findElement(By.xpath("./td[4]")).getText();
		    String bed = whiteRow.findElement(By.xpath("./td[7]")).getText();

		    System.out.println("S.No : " + sNo);
		    System.out.println("IP No : " + ipNo);
		    System.out.println("Patient Name : " + patientName);
		    System.out.println("Bed : " + bed);

		    // click first time
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", whiteRow);

		    return sNo;   // VERY IMPORTANT
		}

      public void YesAcknowledgedPop(String Discharge_notification_acknowledged_Yes )throws IOException , InterruptedException {
			
			CommanUtill.clickFunction(whiteRowXpath_Yes_pop, Discharge_notification_acknowledged_Yes);
		}
		
		public void clickSameRowAgainAfterColorChange(String sNo) throws IOException, InterruptedException {

		    String sameRowXpath = "//table[@id='tbl1']//tr[td[normalize-space()='" + sNo + "']]";

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.xpath(sameRowXpath),"style", "background:white")));

		    CommanUtill.clickFunction(sameRowXpath,"Row " + sNo + " After Color Change");}
		
		public void Yes_Pop_DischargeNotificationAcknowledgementBill(String Yes_pop_Billing) throws IOException, InterruptedException {
			
			CommanUtill.clickFunction(Bill_Ready_Yes_pop, Yes_pop_Billing);
		}

	/*	
		public void clickFirstWhiteRowAndPrintDetails(String White_Row) throws IOException, InterruptedException{

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    WebElement whiteRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(whiteRowXpath)));

		    // Scroll with OFFSET
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView({block:'center'});", whiteRow);
		    Thread.sleep(800);

		    // Fetch values
		    String sNo = whiteRow.findElement(By.xpath("./td[1]")).getText();
		    String ipNo = whiteRow.findElement(By.xpath("./td[3]")).getText();
		    String patientName = whiteRow.findElement(By.xpath("./td[4]")).getText();
		    String bed = whiteRow.findElement(By.xpath("./td[7]")).getText();

		    System.out.println("S.No : " + sNo);
		    System.out.println("IP No : " + ipNo);
		    System.out.println("Patient Name : " + patientName);
		    System.out.println("Bed : " + bed);

		    // JS CLICK (bypass sticky header)
		    js.executeScript("arguments[0].click();", whiteRow);

		    System.out.println("First white row clicked successfully");
		}
		*/
		
		//======================Volit Row ===================================
		public void clickTopVioletRowAndPrintDetails(String violetRowName) throws IOException, InterruptedException {

		    String violetRowXpath = "(//table[@id='tbl1']/tbody/tr[contains(@style,'#ffc6ff')])[1]";
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    WebElement violetRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(violetRowXpath)));

		    // Scroll with OFFSET
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView({block:'center'});", violetRow);
		    Thread.sleep(800);

		    //  YELLOW HIGHLIGHT (ONLY ADDITION)
		    js.executeScript("arguments[0].style.border='2px solid red';" + "arguments[0].style.backgroundColor='yellow';", violetRow);
		    Thread.sleep(500);
		    
		    // Fetch values
		    String sNo = violetRow.findElement(By.xpath("./td[1]")).getText();
		    String ipNo = violetRow.findElement(By.xpath("./td[3]")).getText();
		    String patientName = violetRow.findElement(By.xpath("./td[4]")).getText();
		    String bed = violetRow.findElement(By.xpath("./td[7]")).getText();

		    System.out.println("S.No : " + sNo);
		    System.out.println("IP No : " + ipNo);
		    System.out.println("Patient Name : " + patientName);
		    System.out.println("Bed : " + bed);

		    // JS CLICK (bypass sticky header)
		    js.executeScript("arguments[0].click();", violetRow);

		    System.out.println("Top violet row clicked successfully");
		}

//=============================Navy Blue Row======================================
		public void clickTopNavyBlueRowAndPrintDetails(String navyBlueRowName) throws IOException, InterruptedException {

		    String navyBlueRowXpath = "(//table[@id='tbl1']/tbody/tr[contains(@style,'#c0f6ff')])[1]";

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    WebElement navyBlueRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(navyBlueRowXpath)));

		    JavascriptExecutor js = (JavascriptExecutor) driver;

		    // Scroll row to center
		    js.executeScript("arguments[0].scrollIntoView({block:'center'});", navyBlueRow);
		    Thread.sleep(500);

		    // YELLOW HIGHLIGHT (before click)
		    js.executeScript("arguments[0].style.border='2px solid red';" + "arguments[0].style.backgroundColor='yellow';", navyBlueRow);
		    Thread.sleep(500);

		    // Fetch values
		    String sNo = navyBlueRow.findElement(By.xpath("./td[1]")).getText().trim();
		    String ipNo = navyBlueRow.findElement(By.xpath("./td[3]")).getText().trim();
		    String patientName = navyBlueRow.findElement(By.xpath("./td[4]")).getText().trim();
		    String bed = navyBlueRow.findElement(By.xpath("./td[7]")).getText().trim();

		    System.out.println("S.No : " + sNo);
		    System.out.println("IP No : " + ipNo);
		    System.out.println("Patient Name : " + patientName);
		    System.out.println("Bed : " + bed);

		    // JS CLICK (sticky header safe)
		    js.executeScript("arguments[0].click();", navyBlueRow);

		    System.out.println("Top navy blue row clicked successfully");
		}
		
}
		
		
		
		
		
		

		
		
		
		
		
		
	


