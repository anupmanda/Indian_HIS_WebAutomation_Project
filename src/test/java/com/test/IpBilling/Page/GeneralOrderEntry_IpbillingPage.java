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
 * 03-Feb-2026
 */
public class GeneralOrderEntry_IpbillingPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String ip_billing = "//span[normalize-space()='IP Billing']";

	//============================General Order Entry ================================
	protected static  String general_order_Entry = "//a[normalize-space()='General Order Entry']";
	protected static  String IP_No_Entry = "//input[@id='txtpatientId']";
	protected static  String Smart_Search_Text = "//input[@id='txt_search']";
	protected static  String Smart_Search_table = "//td[normalize-space()='All Ceramic (3M) crown (pvt)']";

	protected static  String Procedure_Chkk_Box = "//input[@id='chkProc']";
	protected static  String Category_Drp = "//select[@id='ddlcategory']";
	protected static  String Ordered_by_Drp= "//select[@id='ddlorderby']";
	protected static  String order_Date_time_current = "//input[@id='dtpOrderdatetime']";

	//=========================Procedure Name ====================================
	protected static  String Performed_By_drp = "//select[@id='ddlPerformedBy25705']";
	protected static  String Procedure_Qty = "//input[@class='qtytxt']";
	protected static  String Remarks_Text = "//textarea[@id='txtremarks']";
	protected static  String Save_Btn = "//i[@class='fa fa-save']";
	protected static  String Save_Btn_Yes_Pop = "//a[@id='btnsaveYes']";

	protected static  String refresh_page = "//a[@id='btnClear']//i[@class='fa fa-refresh']";
	protected static  String print_Btn = "//a[@id='btnPrint']//i[@class='fa fa-print']";

	//=====================Serach And Check Previous general order entry in UHID ============================
	protected static  String frome_Date = "//input[@id='fromdate']";
	protected static  String To_Date = "//input[@id='todate']";
	protected static  String serach_prevoius_Procedure_Name = "//a[@id='btnsearchProcedure']//i[@title='Search']";

	//=========================== Delete ===================================

	protected static  String Click_Currnt_Order_table = "//div[@class='equipement_table']//tr[1]//td[1]";
	protected static  String print_icon = "//a[@id='btnPrint']//i[@class='fa fa-print']";
	protected static String check_Box_Delete = "//input[@class='chkselect']";
	protected static String Click_On_Delete_Icon = "//i[@class='fa fa-trash']";

	//==========================Find Patent =======================================
	protected static String Serch_Patient = "//a[@id='btnsearch']//i[@title='Search']";
	
	protected static  String search_icon_find_patient = "//a[@id='btnsearchipno']//i[@class='fa fa-search ']";
	protected static  String current_in_patient_Radio_btn_pop = "//input[@id='rbCurrentPatents']";

	protected static  String In_patient_All_Ward_Check_Box_pop = "//input[@id='cbAllWards']";
	protected static  String In_patient_Discharge_Admision_chkk_box_pop = "//input[@id='cbAdmission']";
	protected static  String In_patient_From_Date_pop = "//input[@id='txtadmitDate']";
	protected static  String In_patient_To_Date_pop = "//input[@id='txtadmittodate']";
	protected static  String Vip_check_box = "//input[@id='cbVip']";
	protected static  String remaks_check_Box = "//input[@id='cbRemark']";
	protected static  String Mobile_no_Serach = "//input[@id='modal_mobileNo']";
	protected static  String Name_Serach = "//input[@id='modal_Name']";
	protected static  String first_Name_Serach = "//input[@id='modal_firstName']";
	protected static  String Vip_Remark_text = "//input[@id='txtVIPRemark']";
	protected static  String National_ID  = "//input[@id='modal_nationalID']";
	protected static  String Gender_drp = "//select[@id='modal_gender']";
	protected static  String UHID = "//input[@id='txt_UHID_DC']";
	protected static  String Find_Patient_Serach_Icon = "//a[@id='search_billing']//i[@class='fa fa-search']";
	protected static  String Clear_Find_Patient_pop = "//i[@title='Clear']";
	protected static  String refresh_Mis_Charges_page = "//a[@id='ClearMiscItem']//i[@class='fa fa-refresh']";
	

	//========================find Patient Table ==============================
		protected static  String find_patient_last_table = "//table[@id='searchBillingTable']//tbody//tr[@onclick][last()]";
		
		//========================Discharge Patient =================================================
		protected static  String Rdio_Btn_Discharged_Patients = "//input[@id='rbDisPatents']";
		protected static  String Discharged_Patien_IP_no = "//input[@id='txt_IPNo_DC']";
		protected static  String Discharged_Patients_Bed_No = "//input[@id='txt_BedNo']";
		protected static  String Discharged_Patients_Bill_No = "//input[@id='txt_BillNo_DC']";
		protected static  String Discharged_Patients_Singn_Marks = "//a[@id='btn_search_DC']//i[@class='fa fa-check']";
		
		protected static  String Discharged_Patients_Table = "//input[@id='rbDisPatents']";    // adding
		protected static  String Discharged_Patients_Table_yes_pop = "//a[@id='btnYesDisModal']";
		
















	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}
	public void GeneralOrderEntry(String Ip_Billing_Tab ,String Genral_Order) throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(ip_billing, Ip_Billing_Tab);
		CommanUtill.clickFunction(general_order_Entry, Genral_Order);
	}

	public void EnterIPNumber(String ip_No) throws IOException , InvalidApplicationException, InterruptedException {

		WebElement Ip_Number_Enter = driver.findElement(By.xpath(IP_No_Entry));
		CommanUtill.textEnter(IP_No_Entry, ip_No);
		Ip_Number_Enter.sendKeys(Keys.ENTER);	
	}
	public void CheckBoxProcedure(String Procedure_chkk_Box) throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Procedure_Chkk_Box, Procedure_chkk_Box);
	}
	public void ProcedureCategoryAndOrderedByDrp(String Category , String OrderedBy)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Category_Drp, Category);
		CommanUtill.dropdownSelectByVisibleText(Ordered_by_Drp, OrderedBy);	
	}

	public void SmartSearchBox(String Smart_Search) throws IOException , InterruptedException{

		CommanUtill.textEnter(Smart_Search_Text, Smart_Search);
	}
	public void ClickOnProcedureNameInTable(String Procedure_Name) throws IOException , InterruptedException{

		CommanUtill.clickFunction(Smart_Search_table, Procedure_Name);
	}

	public void PerformedByAndQuentyDrp(String Performed_By , String QTY)  throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(Performed_By_drp, Performed_By);
		CommanUtill.textEnter(Procedure_Qty, QTY);

	}
	public void RemarksText(String Remarks) throws IOException , InterruptedException{

		CommanUtill.textEnter(Remarks_Text, Remarks);	
	}

	public void SaveGeneralOrderEntryAndYesPop(String Save_Icon , String Save_Yes_Pop) throws IOException , InterruptedException{

		CommanUtill.clickFunction(Save_Btn, Save_Icon);
		CommanUtill.clickFunction(Save_Btn_Yes_Pop, Save_Yes_Pop);
	}  

	public void RefreshGeneralOrderEntry(String Refresh_Icon)  throws IOException , InterruptedException{

		CommanUtill.clickFunction(refresh_page, Refresh_Icon);
	}

	//=====================Serach And Check Previous general order entry in UHID ============================

	public void FromDateOrderNoCheck(String From_Date ) throws IOException , InterruptedException{

		WebElement Frome_Date_Ente = driver.findElement(By.xpath(frome_Date));
		Frome_Date_Ente.sendKeys(Keys.CONTROL+"a");
		Frome_Date_Ente.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(frome_Date, From_Date);
		Frome_Date_Ente.sendKeys(Keys.TAB);
	}

	public void ToDateOrderNoCheck(String To_Date_order ) throws IOException , InterruptedException{

		WebElement To_Date_Ente = driver.findElement(By.xpath(To_Date));
		To_Date_Ente.sendKeys(Keys.CONTROL+"a");
		To_Date_Ente.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(To_Date, To_Date_order);
		To_Date_Ente.sendKeys(Keys.TAB);
	}

	public void SearchPreviusOrder(String Search_icon) throws IOException , InterruptedException{

		CommanUtill.clickFunction(serach_prevoius_Procedure_Name, Search_icon);
	}

	//=========================== Delete =================================== 
	public void ClicOnTable_kNoOfProcedures(String NoofProcedures) throws IOException , InterruptedException{

		CommanUtill.clickFunction(Click_Currnt_Order_table, NoofProcedures);
	}
	
	public void ClickOnPrintBtn(String Print_Btn) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(print_icon, Print_Btn);
	}
	
	public void ClickOnCheckBox(String Click_Check_Box) throws IOException, InterruptedException {

		CommanUtill.clickFunction(check_Box_Delete, Click_Check_Box);   
	}
	public void DeleteProceduresIcon(String Delete) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Click_On_Delete_Icon, Delete);
	}

//==========================Find Patent =======================================

     public void SearchPatientIcon(String Search_Icon) throws IOException, InterruptedException {
    	 
    	 CommanUtill.clickFunction(Serch_Patient, Search_Icon);
     }
     
     public void RadioBtnCurrentInPatients_AllWardsCheckBox(String Current_In_Patent , String All_Ward_Check_Box)
 			throws IOException ,InterruptedException {
 		CommanUtill.clickFunction(current_in_patient_Radio_btn_pop, Current_In_Patent);
 		CommanUtill.clickFunction(In_patient_All_Ward_Check_Box_pop, All_Ward_Check_Box);
 	}

 	public void Current_In_Patient_Admission_Discharge_ChkkBox(String Admission_DisCharge) throws IOException ,InterruptedException {

 		CommanUtill.clickFunction(In_patient_Discharge_Admision_chkk_box_pop, Admission_DisCharge);	
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
 	public void SearchIcon_GeneralorderEntry(String Serch_Icon) throws IOException ,InterruptedException { 
 	   
 	   CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serch_Icon);
 	   
    }
 	public void CheckBoxVIP_Remarks(String Vip , String Remarks) throws IOException ,InterruptedException {

 		CommanUtill.clickFunction(Vip_check_box, Vip);
 		CommanUtill.clickFunction(remaks_check_Box, Remarks);
 	}

 	public void SerachMobileNumber(String Mobile_no , String Find_In_Patient) throws IOException ,InterruptedException {

 		CommanUtill.textEnter(Mobile_no_Serach, Mobile_no);
 		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Find_In_Patient);	
 	}

 	public void EnterNameAndSerchicon(String Name , String Find_Patient_By_Name) throws IOException ,InterruptedException{

 		CommanUtill.textEnter(Name_Serach, Name);
 		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Find_Patient_By_Name);
 	}

 	public void SerachAndselectPatientInTable(String Patient) throws IOException ,InterruptedException {

 		CommanUtill.clickFunction(find_patient_last_table, Patient);
 	}
 	//=============================Discgare patient =============================
 	
 	public void RadioBtnDischargedPatients(String Discharged_Patients) throws IOException ,InterruptedException { 
 	   
 	   CommanUtill.clickFunction(Rdio_Btn_Discharged_Patients, Discharged_Patients);  
    }
 	
 	public void PickDischargePatientTable(String Dis_patient_table) throws IOException ,InterruptedException { 
 	   
 	   CommanUtill.clickFunction(find_patient_last_table, Dis_patient_table);
 	   Thread.sleep(8000);
    }

}
