/**
 * 
 */
package com.test.IpBilling.Page;

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
 * 02-Feb-2026
 */
public class AmbulanceMrdChargesPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String ip_billing = "//span[normalize-space()='IP Billing']";

	//======================== AmbulanceMrdCharges ===============================

	protected static  String Ambulance_Mrd_Char = "//a[normalize-space()='Ambulance/Mrd Charges']";
	protected static  String enter_UHID = "//input[@id='txtUHId']";
	protected static  String enter_IP_No = "//input[@id='txtIPNo']";
	protected static  String serach_Icon = "//i[@class='fa fa-search ']";

	protected static String Charge_InValid_pop = "//div[contains(normalize-space(),'Price for this service is not defined')]";
	protected static  String Admission_Medical_Record_Charges = "//table[@id='tblAmbulances1']//tbody//tr[2]";
	protected static  String Remarks_Text = "//div[@class='ambulance-textarea']//textarea[@id='Remarks']";
	protected static  String Qty_text = "//input[@id='qty']";
	protected static  String save_Btn = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected static  String save_Yes_Pop = "//a[@id='btnyes']";
	protected static  String Refresh_Btn = "//div[@id='userbtn']//a[@id='btnclear']//i[@class='fa fa-refresh']";
	protected static  String Delete_Procedure_Table = "//table[@id='tblOrderDetails']//tbody//tr[1]//i";
	protected static  String Delete_Procedur_Yes_Pop = "//a[@id='btndelyes']";









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
	public void AmbulanceMrdCharges(String Ip_Billing_Tab, String AmbulanceMrdCharges) throws IOException , InterruptedException, InvalidApplicationException{

		CommanUtill.clickFunction(ip_billing, Ip_Billing_Tab);
		CommanUtill.clickFunction(Ambulance_Mrd_Char, AmbulanceMrdCharges);

	}
	public void enterUHID(String Uhid) throws IOException ,InvalidApplicationException, InterruptedException {

		WebElement UHID_Enter = driver.findElement(By.xpath(enter_UHID));
		CommanUtill.textEnter(enter_UHID, Uhid);
		UHID_Enter.sendKeys(Keys.ENTER);
	}

	public void EnterIP_NumberAmbulanceMRDCharges(String IP_No) throws IOException ,InvalidApplicationException, InterruptedException {

		WebElement ip_no_Enter = driver.findElement(By.xpath(enter_IP_No));
		CommanUtill.textEnter(enter_IP_No, IP_No);
		ip_no_Enter.sendKeys(Keys.ENTER);
	}

	// AmbulanceMrdCharges is Dyanamic 

	public void selectAdmissionMedicalRecordCharge(String chargeName) throws IOException, InterruptedException {

		// dynamic xpath: match visible item name column
		String chargeRowXpath = "//table[@id='tblAmbulances1']//tbody//tr[td[normalize-space()='" + chargeName + "']]";

		// validate row exists
		if (CommanUtill.isElementPresent(chargeRowXpath)) {
			CommanUtill.clickFunction(chargeRowXpath, chargeName);
			Thread.sleep(600);

		} else {
			throw new RuntimeException("Charge name not found in table: " + chargeName);
		}
	}

	public boolean isPriceNotDefinedPopupDisplayed() throws IOException, InterruptedException {

		try {
			return driver.findElements(By.xpath(Charge_InValid_pop)).size() > 0;
		} catch (Exception e) {
			return false;
		}
	}
	public void AdmissionMedicalRecordCharges(String AdmissionMedicalRecordCharges) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Admission_Medical_Record_Charges, AdmissionMedicalRecordCharges);
	}

	public void EnterRemarks(String Remarks)  throws IOException, InterruptedException {

		CommanUtill.textEnter(Remarks_Text, Remarks);
	}
	public void EnterIteamNameQtyNumber(String Qty) throws IOException, InterruptedException {

		CommanUtill.textEnter(Qty_text, Qty);
	}

	public void SaveBtnAndYesPop(String Save_Icon , String Yes_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(save_Btn, Save_Icon);
		CommanUtill.clickFunction(save_Yes_Pop, Yes_Pop);
	}
	
	public void RefreshBtn(String Refresh_Icon) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Refresh_Btn, Refresh_Icon);
	}

	//===========================Delete Procedure Table ===============================
	
	public void ProcedureDelete(String Delete , String Delete_Yes_Pop) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Delete_Procedure_Table, Delete);
		CommanUtill.clickFunction(Delete_Procedur_Yes_Pop, Delete_Yes_Pop);
	}

}
