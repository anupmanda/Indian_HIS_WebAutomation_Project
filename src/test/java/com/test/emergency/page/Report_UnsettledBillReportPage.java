/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

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
 * 22-Apr-2026
 */
public class Report_UnsettledBillReportPage extends GeneralBrowserSetting {


	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Report_Tab = "//i[@class='fa fa-user-plus fa-lg']";
	
	//======================== UnsettledBill Report Page =====================================
	protected static String UnsettledBill_Report_Page = "//a[normalize-space()='Unsettled Bill Report']";
	protected static String UnsettledBill_Report_Sort_Drp = "//select[@id='ddSortby']";
	protected static String UnsettledBill_Report_Ascending_Radio_Btn  = "//input[@id='rbAscending']";
	protected static String UnsettledBill_Report_Descending_Radio_Btn = "//input[@id='rbDescending']";
	protected static String UnsettledBill_Report_From_Date = "//input[@id='txtFDate']";
	protected static String UnsettledBill_Report_To_Date = "//input[@id='idTDate']";
	
	protected static String UnsettledBill_Report_Check_Box_As_Date = "//input[@id='chkAsOnDate']";


	protected static String Click_Print_Btn = "//a[@id='btnPoPrint']//i[@class='fa fa-print']";
	protected static String Click_CSV_Btn = "//a[@id='excelview']//i[contains(@class,'fa fa-file-excel-o')]";


	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void ReportUnsettledBillReport (String report, String UnsettledBillReport) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Report_Tab, report);
		CommanUtill.clickFunction(UnsettledBill_Report_Page , UnsettledBillReport);
	}
	public void SelectBySlotByValue(int Sort_By) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UnsettledBill_Report_Sort_Drp)));
		CommanUtill.dropdownSelectByIndex(UnsettledBill_Report_Sort_Drp, Sort_By);
	}
	public void ClickOnRadioBtnAscending (String Ascending) throws IOException, InterruptedException { 

		WebElement Ascending_Radio_Btn = driver.findElement(By.xpath(UnsettledBill_Report_Ascending_Radio_Btn));
		if(! Ascending_Radio_Btn.isSelected()) {
		CommanUtill.clickFunction(UnsettledBill_Report_Ascending_Radio_Btn, Ascending);
		}
	}
	public void ClickOnRadioBtnDescending (String Descending) throws IOException, InterruptedException { 

		WebElement Descending_Radio_Btn = driver.findElement(By.xpath(UnsettledBill_Report_Descending_Radio_Btn));
		if(! Descending_Radio_Btn.isSelected()) {
		CommanUtill.clickFunction(UnsettledBill_Report_Descending_Radio_Btn, Descending);
		}
	}
	public void FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(UnsettledBill_Report_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(UnsettledBill_Report_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(UnsettledBill_Report_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(UnsettledBill_Report_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void CheckBoxAsOnDate(String Curent_Date) throws IOException ,InterruptedException {
		
		WebElement date_Ckk = driver.findElement(By.xpath(UnsettledBill_Report_Check_Box_As_Date));
		if(! date_Ckk.isSelected()) {
		CommanUtill.clickFunction(UnsettledBill_Report_Check_Box_As_Date, Curent_Date);
		}
	}
	public void ClickOnPrintBtn(String print) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Print_Btn)));
		CommanUtill.clickFunction(Click_Print_Btn, print);
	}
	public void ClickOnCSVBtn(String csv) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_CSV_Btn)));
		CommanUtill.clickFunction(Click_CSV_Btn, csv);
	}
	
	

}
