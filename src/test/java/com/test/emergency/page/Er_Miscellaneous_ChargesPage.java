/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

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
 *  02-April-2026
 */
public class Er_Miscellaneous_ChargesPage extends GeneralBrowserSetting {


	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Er_Billing_dashboard = "//li[@id='btn_Emergency']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";
	//===========================  Miscellaneous_Charges_page ================================
	protected static  String Er_Billing_Meanu = "//span[normalize-space()='ER Billing']";
	protected static  String Misc_Charges_Page = "//a[normalize-space()='Misc Charges']";
	protected static  String ip_number = "//input[@id='textErNo']";
	protected static  String Miss_uhid = "//input[@id='uHidvalue']";

	protected static  String Service_Drp = "//select[@id='ddlServices']";
	protected static  String Description_Text = "//input[@id='txt_ERDescription']";
	protected static  String patient_Type = "//select[@id='Patient_type']";
	protected static  String Amount_text = "//input[@id='txt_amount']";
	protected static  String Quenty = "//input[@id='txt_qty']";
	protected static  String Doctor_Drp = "//select[@id='ddlDoctors']";

	protected static  String posting_Date_Time = "//input[@id='date_from']";

	protected static  String plush_icon = "//i[@id='btnAddRow']";
	protected static  String save_icon = "//a[@id='btnUpdateBillSerItem']//i[@class='fa fa-save']";
	
	//=====================================Find Patient Pop ================================
	protected static  String search_icon_find_patient = "//a[@id='searchhuiddata']//i[@title='Search']";
	protected static  String current_in_patient_Radio_btn_pop = "//input[@id='rbCurrentPatents']";

	protected static  String All_Ward_Check_Box_pop = "//input[@id='cbAllWards']";
	protected static  String Discharge_Admision_chkk_box_pop = "//input[@id='cbAdmission']";
	protected static  String In_patient_From_Date_pop = "//input[@id='txtadmitDate']";
	protected static  String In_patient_To_Date_pop = "//input[@id='txtadmittodate']";

	protected static  String Find_Patient_Serach_Icon = "//a[@id='search_Emergency']//i[@class='fa fa-search']";
	protected static  String Clear_Find_Patient_pop = "//i[@title='Clear']";
	protected static  String refresh_Mis_Charges_page = "//a[@id='btnClean']//i[@class='fa fa-refresh']";

	//========================find Patient Table ==============================
	protected static  String find_patient_First_table = "//table[@id='searchBillingTable']//tbody//tr[position()=1]";

	//====================== Patient has been discharged =========================
	protected static String Discharge_Patient_Yes_pop = "//a[@id='btnYesDisModal']";











	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnErBillingDashboard(String Er_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Er_Billing_dashboard, Er_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void MiscellaneousCharges_page(String Er_Billing_Tab , String MiscellaneousCharges) 	
			throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Er_Billing_Meanu)));
		CommanUtill.clickFunction(Er_Billing_Meanu, Er_Billing_Tab);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Misc_Charges_Page)));
		CommanUtill.clickFunction(Misc_Charges_Page, MiscellaneousCharges);
	}

	//==============================Serach Patient Find Patient =============================

	public void FindPatient_SeachIcon(String Search) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(search_icon_find_patient, Search);
	}

	public void RadioBtnCurrentInPatients_AllWardsCheckBox(String Current_In_Patent , String All_Ward_Check_Box)
			throws IOException ,InterruptedException {

		CommanUtill.clickFunction(current_in_patient_Radio_btn_pop, Current_In_Patent);
		WebElement All_Ward_Chk_Box = driver.findElement(By.xpath(All_Ward_Check_Box_pop));
		if(! All_Ward_Chk_Box.isSelected())
			CommanUtill.clickFunction(All_Ward_Check_Box_pop, All_Ward_Check_Box);
	}

	public void Admission_DischargeCheckBox(String Admission_DisCharge) throws IOException ,InterruptedException {

		WebElement Admission_Discharge_Check_Box = driver.findElement(By.xpath(Discharge_Admision_chkk_box_pop));
		if(! Admission_Discharge_Check_Box.isSelected())
			CommanUtill.clickFunction(Discharge_Admision_chkk_box_pop, Admission_DisCharge);
	}
	public void AdmissionDischarge_FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(In_patient_From_Date_pop));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(In_patient_From_Date_pop, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void AdmissionDischarge_ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(In_patient_To_Date_pop));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(In_patient_To_Date_pop, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void ClickOnSeracPatientIcon(String Serch_Icon) throws IOException ,InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Find_Patient_Serach_Icon)));
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serch_Icon);
	}

	public void SerachAndselectPatientInTable(String Patient) throws IOException ,InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(find_patient_First_table)));
		String First_Row = driver.findElement(By.xpath(find_patient_First_table)).getText();
		logger.info("================= Search Patient In Table ====================");
		logger.info(First_Row);
		System.out.println("First Row Patient Add Miscellaneous Charges: " + First_Row);

		CommanUtill.clickFunction(find_patient_First_table, Patient);
	}
	//=======================Miscellaneous Charges Page================================

	public void EnterUHIDInMiscellanceCherges(String uhid) throws IOException ,InterruptedException {

		WebElement uhid_enter = driver.findElement(By.xpath(Miss_uhid));
		CommanUtill.textEnter(Miss_uhid, uhid);
		uhid_enter.sendKeys(Keys.ENTER);
	}
	public void EnterIpNumberInMiscellanceCherges(String Ip_Number) throws IOException ,InterruptedException {

		WebElement ip_no_enter = driver.findElement(By.xpath(ip_number));
		CommanUtill.textEnter(ip_number, Ip_Number);
		ip_no_enter.sendKeys(Keys.ENTER);
	}
	public void DischargePatientYespop(String Discharge_Patient) throws IOException ,InterruptedException { 

		if(CommanUtill.isElementPresent(Discharge_Patient_Yes_pop)) {
			CommanUtill.clickFunction(Discharge_Patient_Yes_pop, Discharge_Patient);
			System.out.println("Discharge Patient Make Transtion Yes Pop");
		}
		else {
			System.out.println("Discharge Patient Make Transtion Yes Pop did not appear");
		}  
	}




	public void SelectByService_DescriptionDrp(String Service_drp_ , String Description) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Service_Drp, Service_drp_);
		CommanUtill.textEnter(Description_Text, Description);
	}
	//Type Hinden
	public void SelectByPatientTypeDrp() throws IOException ,InterruptedException {

		String patient_Type_1 = driver.findElement(By.xpath(patient_Type)).getAttribute("value");

		System.out.println("Patient Type : " + patient_Type_1);
		logger.info("Patient Type : " + patient_Type_1);
	}
	public void enterAmountAndQuantity(String Amount , String Qty) throws IOException ,InterruptedException {

		WebElement Amount_Value = driver.findElement(By.xpath(Amount_text));
		Amount_Value.sendKeys(Keys.CONTROL +"a");
		Amount_Value.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Amount_text, Amount);	
		Amount_Value.sendKeys(Keys.TAB);
		CommanUtill.textEnter(Quenty, Qty);	

	}
	public void SelectByDoctorNameDrp(String Doctor_Name) throws IOException ,InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Doctor_Drp, Doctor_Name);
	}
	public String PrintPostingDateAndTime() throws IOException ,InterruptedException { 
		
		  String PoatingDateTime = "";
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		        WebElement Datetime = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(posting_Date_Time)));
		        PoatingDateTime = Datetime.getAttribute("value");

		        if (PoatingDateTime == null || PoatingDateTime.isEmpty()) {
		        	PoatingDateTime = Datetime.getDomProperty("value");
		        }

		        logger.info("============= Posting Date And Time ===================");
		        logger.info("Post Date and Time : " + PoatingDateTime);
		        System.out.println("Post Date and Time  : " + PoatingDateTime);

		    } catch (Exception e) {
		        logger.info("Miscellance Charges Post Date and Time");
		        System.out.println("Miscellance Charges Post Date and Time: " + e.getMessage());
		    }

		    return PoatingDateTime ; 
		}
	
	public void clickOnPlushIcon(String Plush) throws IOException ,InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(plush_icon)));
		CommanUtill.clickFunction(plush_icon, Plush);
	}
	public void ClickOnsavebtnIcon_YesPop(String save) throws IOException ,InterruptedException { 
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(save_icon)));
		CommanUtill.clickFunction(save_icon, save);
	}
	
	//================================= Refresh Btn ============================================

	public void RefreshMiscellaneousCharges(String Refresh ) throws IOException ,InterruptedException { 

		CommanUtill.clickFunction(refresh_Mis_Charges_page, Refresh);
	}

	

}
