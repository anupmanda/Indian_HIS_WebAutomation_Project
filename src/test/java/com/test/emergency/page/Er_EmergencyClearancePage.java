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
 * 20-Apr-2026
 */
public class Er_EmergencyClearancePage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Emergency_Clearance_Page = "//a[normalize-space()='Emergency Clearance']";

	protected static String Status_Drp = "//select[@id='ddlStatus']";
	protected static String Patient_Type_Drp = "//select[@id='_ddlSearchType']";
	protected static String Enter_Er_Number = "//input[@id='_txtSearchType']";
	protected static String Bill_Type_Drp = "//select[@id='ddlBillType']";
	//================================= Table ====================================

	protected static String Unacknowledged_Table = "//table[@id='tblNursngClrance']//tbody//tr[position()=1]";
	protected static String Table_Acknowledge_Clearance_Icon = "//table[@id='tblNursngClrance']//tbody//tr[position()=2]//i[@class='fa fa-check']";



	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void ErOrderEmergencyClearance (String Er_Order, String Emergency_Clearance) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, Er_Order);
		CommanUtill.clickFunction(Emergency_Clearance_Page , Emergency_Clearance);
	}
	public void SelectByStatusDrp(String Status)  throws IOException, InterruptedException {

		WebDriverWait Drp = new WebDriverWait(driver,Duration.ofSeconds(10));
		Drp.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Status_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Status_Drp, Status);
	}
	public void SelectByPatientType(String Patient_Drp)  throws IOException, InterruptedException {

		WebDriverWait Drp = new WebDriverWait(driver,Duration.ofSeconds(10));
		Drp.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Patient_Type_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Patient_Type_Drp, Patient_Drp);

	} 
	public void ErNumber(String Patient_Name)  throws IOException, InterruptedException {

		WebDriverWait Drp = new WebDriverWait(driver,Duration.ofSeconds(10));
		Drp.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Er_Number)));
		WebElement er_no = driver.findElement(By.xpath(Enter_Er_Number));
		CommanUtill.textEnter(Enter_Er_Number, Patient_Name);
		er_no.sendKeys(Keys.ENTER);

	} 
	public void SelectByBillTypeDrp(String Bill_Type)  throws IOException, InterruptedException {

		WebDriverWait Drp = new WebDriverWait(driver,Duration.ofSeconds(10));
		Drp.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Bill_Type_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Bill_Type_Drp, Bill_Type);
	}
	public void UnacknowledgedEmergenctPatientInTable(String erNo, String click_Patient) 
			throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		String rowXpath = "//table[@id='tblNursngClrance']//tr[td[contains(text(),'" + erNo + "')]]";
		String iconXpath = rowXpath + "//i[contains(@class,'fa-check')]";

		// Wait for correct row
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(rowXpath)));

		// Check icon present
		if(driver.findElements(By.xpath(iconXpath)).size() == 0) {
			throw new RuntimeException("Acknowledge icon not available for ER No: " + erNo);
		}

		// Wait clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(iconXpath)));

		// Print row data
		String rowData = driver.findElement(By.xpath(rowXpath)).getText();
		System.out.println("Row Data: " + rowData);

		logger.info("=================Unacknowledged Acknowledge Clearance Table ====================");
		logger.info(rowData);

		// Click
		CommanUtill.clickFunction(iconXpath, click_Patient);
	}
	
	//========================= Unack Emergency Clearance Cross Icon ==============================
	
	public void AcknowledgedEmergenctPatientInTable(String erNo, String click_Patient) 
			throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		String rowXpath = "//table[@id='tblNursngClrance']//tr[td[contains(text(),'" + erNo + "')]]";
		String iconXpath = rowXpath + "//i[@class='icon-remove-sign']";

		// Wait for correct row
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(rowXpath)));

		// Check icon present
		if(driver.findElements(By.xpath(iconXpath)).size() == 0) {
			throw new RuntimeException("Acknowledge icon not available for ER No: " + erNo);
		}

		// Wait clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(iconXpath)));

		// Print row data
		String rowData = driver.findElement(By.xpath(rowXpath)).getText();
		System.out.println("Row Data: " + rowData);

		logger.info("=================Unacknowledged Acknowledge Clearance Table ====================");
		logger.info(rowData);

		// Click
		CommanUtill.clickFunction(iconXpath, click_Patient);
	}



}
