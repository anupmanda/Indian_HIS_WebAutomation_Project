/**
 * 
 */
package com.test.Pharmacy.Page;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
public class DischargeNotification_PharmacyPage extends GeneralBrowserSetting {

	protected static  String  Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static  String  Pharmacy_dashboard = "//li[@id='btn_Pharmacy']";
	protected static  String Pharmacy_Station_Drp = "//select[@id='Department']";
	protected static  String Pharmacy_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Pharmacy_Station_No_pop = "//a[@id='btn_no_desh']";

	//====================================== Pharmacy Dischage Notification =================================

	protected static  String Discharge_Notification = "//span[normalize-space()='Discharge Notification']";

	protected static  String Radio_Discharge_Notification = "//input[@id='DischargeNotification']";
	protected static  String Facility_Hidden = "//a[normalize-space()='Nursing Clearance']";   // Not Define

	protected static  String Wards_Drp = "//select[@id='ddlWard']";
	protected static  String Pharmacy_Status_Drp = "//select[@id='ddlStatus']";

	protected static  String Radio_Btn_Expected_Date_Discharge = "//input[@id='ExpDateDischarge']";
	protected static  String Expected_Discharge_Date_Check_Box = "//input[@id='ExpDateDischk']";
	protected static  String Date_Enter = "//input[@id='ExpectedDate']";
	protected static  String Serach_Date = "//i[@id='ExpectedDateSearch']";

	protected static  String Drp_IP_Patiet_Name = "//select[@id='_ddlSearchType']";
	protected static  String Enter_IP = "//input[@id='_txtSearchType']";
	protected static  String Entetr_Patiet_Name = "//input[@id='_txtSearchType']";   //
	protected static  String Search_Type_Patient_Icon = "//i[@id='_btnSearchType']";

	protected static  String bill_Type_Drp = "//select[@id='_ddlSeacrhBillType']";
	protected static  String Check_Box_Is_Daycare = "//input[@id='IsDayCare']";

	protected static  String Radio_Discharge_Marked = "//input[@id='isMarkDischarge']";
	protected static  String chkk_Discharge_Marked_Date = "//input[@id='Dischargecheckbox']";
	protected static  String Enter_Date_Discharge_Marked = "//input[@id='Dischargedatecalendar']";
	protected static  String Search_Icon_Date_Discharge_Marked = "//a[@id='Dischargesearchdata']//i[@class='fa fa-search']";








	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnPharmacyDashboard(String Pharmacy_dashbord , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Pharmacy_dashboard, Pharmacy_dashbord);
		CommanUtill.dropdownSelectByVisibleText(Pharmacy_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Pharmacy_Station_Yes_pop, Station_Yes_Pop);
	}

	public void ClickPharmacyDischarge_Notification(String PharmacyDischarge_Notification_page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Discharge_Notification, PharmacyDischarge_Notification_page);	
	}
	public void RadioBtnDischargeNotification(String Discharge_Notification)  throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_Discharge_Notification, Discharge_Notification);
	}

	public void SelectByWardsDrp(String Wards_Drp_)  throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Wards_Drp, Wards_Drp_);
	}
	public void SelectByPharmacyStatusDrp(String PharmacyStatus)  throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Pharmacy_Status_Drp, PharmacyStatus);
	}
	public void RadioBtnExpectedDateDischarge_CheckBox_Date(String Radio_Expected_Date_Discharge , String Check_Box_Date , 
			String Enter_Date , String Search_Icon) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_Btn_Expected_Date_Discharge, Radio_Expected_Date_Discharge);
		CommanUtill.clickFunction(Expected_Discharge_Date_Check_Box, Check_Box_Date);
		WebElement Date = driver.findElement(By.xpath(Date_Enter));
		Date.sendKeys(Keys.CONTROL + "a");
		Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Date_Enter, Enter_Date);
		Date.sendKeys(Keys.TAB);
		Thread.sleep(600);
		CommanUtill.clickFunction(Serach_Date, Search_Icon);
	}

	public void SelectByPatientTypeAndEnterBox_Serach(String patint_Type , String Enter_IP_No , String Search_Icon) 
			throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Drp_IP_Patiet_Name, patint_Type);
		CommanUtill.textEnter(Enter_IP, Enter_IP_No);
		CommanUtill.clickFunction(Search_Type_Patient_Icon, Search_Icon);
	}

	public void BillTypeDrp(String Bill_Type) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(bill_Type_Drp, Bill_Type);
	}

	public void CheckBoxDaycare(String Daycare) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Check_Box_Is_Daycare, Daycare);
	}

	public void RadioBtnDischargeMarked_CheckBox_DateEnter(String DischargeMarked_Radio , String checkBox_Date, 
			String Enter_Date , String Search_Icon)throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_Discharge_Marked, DischargeMarked_Radio);
		CommanUtill.clickFunction(chkk_Discharge_Marked_Date, checkBox_Date);
		WebElement Date = driver.findElement(By.xpath(Enter_Date_Discharge_Marked));

		Date.sendKeys(Keys.CONTROL + "a");
		Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Enter_Date_Discharge_Marked, checkBox_Date);
		Date.sendKeys(Keys.TAB);
		Thread.sleep(600);
		CommanUtill.clickFunction(Search_Icon_Date_Discharge_Marked, Search_Icon);

	}


}
