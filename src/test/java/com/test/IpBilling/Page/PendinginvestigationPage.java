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
public class PendinginvestigationPage extends GeneralBrowserSetting {
	
	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String ip_billing = "//span[normalize-space()='IP Billing']";

	//========================Pending investigation ===============================

	protected static  String PendingInvestigation = "//a[normalize-space()='Pending Investigations']";
	protected static  String Uhid_Enter = "//input[@id='txtuhid']";
	protected static  String Ip_Numbetr_Enter = "//input[@id='txtipno']";
	protected static  String Delete_Pending_Investigation = "//table[@id='tblInvestigation']//tbody//tr[2]//i";
	protected static  String Delete_Pending_Investigation_Yes_pop = "//a[@id='pendinginvestigationbtnYessaveModal']";
	
	
	
	//============================== Serach Patient ================================
	
	protected static  String serach_Patient = "//i[@class='fa fa-search ']";
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
	protected static  String refresh_Pending_Investigation = "//a[@id='ClearPendinginvestigation']//i[@class='fa fa-refresh']";
	
	//========================Discharge Patient =================================================
	protected static  String Rdio_Btn_Discharged_Patients = "//input[@id='rbDisPatents']";
	protected static  String Discharged_Patien_IP_no = "//input[@id='txt_IPNo_DC']";
	protected static  String Discharged_Patients_Bed_No = "//input[@id='txt_BedNo']";
	protected static  String Discharged_Patients_Bill_No = "//input[@id='txt_BillNo_DC']";
	protected static  String Discharged_Patients_Singn_Marks = "//a[@id='btn_search_DC']//i[@class='fa fa-check']";
	
	protected static  String Discharged_Patients_Table = "//table[@id='searchBillingTable']//tbody//tr[2]";    // adding

	//========================find Patient Table ==============================
	protected static  String find_patient_last_table = "//table[@id='searchBillingTable']//tbody//tr[@onclick][last()]";


	
	
	
	
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
	public void PendingInvestigation(String Ip_Billing_Tab, String Pending_Investion_Delete) throws IOException , InterruptedException, InvalidApplicationException{

		CommanUtill.clickFunction(ip_billing, Ip_Billing_Tab);
		CommanUtill.clickFunction(PendingInvestigation, Pending_Investion_Delete);

	}
	public void SerachPatient(String Serach_Icon)  throws IOException , InterruptedException, InvalidApplicationException{
		
		CommanUtill.clickFunction(serach_Patient, Serach_Icon);
	}
	
	public void EnterUHID(String UHID_Excel) throws IOException , InterruptedException, InvalidApplicationException{
		
		WebElement Enter_Uhid = driver.findElement(By.xpath(Uhid_Enter));
		CommanUtill.textEnter(Uhid_Enter, UHID_Excel);
		Enter_Uhid.sendKeys(Keys.ENTER);	
	}
	
    public void EnterIPNumber(String IP_Number_Excel) throws IOException , InterruptedException, InvalidApplicationException{
		
		WebElement Enter_Ip_Number = driver.findElement(By.xpath(Ip_Numbetr_Enter));
		CommanUtill.textEnter(Ip_Numbetr_Enter, IP_Number_Excel);
		Enter_Ip_Number.sendKeys(Keys.ENTER);
		
	}
		
 public void DeletePendingInvestigationIconAndYesPop(String delete_Icon , String Yes_Pop)  throws IOException , InterruptedException, InvalidApplicationException{
	 
	 CommanUtill.clickFunction(Delete_Pending_Investigation, delete_Icon);
	 CommanUtill.clickFunction(Delete_Pending_Investigation_Yes_pop, Yes_Pop);
 }
	
	
	//======================== Find Patient ================================
	
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

	public void CheckBoxVIP_Remarks(String Vip , String Remarks) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(Vip_check_box, Vip);
		CommanUtill.clickFunction(remaks_check_Box, Remarks);
	}
	public void SerachDateWisePatient(String Serach_Icon) throws IOException ,InterruptedException {
		
		CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serach_Icon);
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
	
	//=============================== Find Patient In Discharge ==========================
	
	 public void RefreshPendingInvestigation(String Refresh ) throws IOException ,InterruptedException { 
		   
		   CommanUtill.clickFunction(refresh_Pending_Investigation, Refresh);
	   }
	   
	   public void RadioBtnDischargedPatients(String Discharged_Patients) throws IOException ,InterruptedException { 
		   
		   CommanUtill.clickFunction(Rdio_Btn_Discharged_Patients, Discharged_Patients);  
	   }
	    public void SerachIpNumber_DischargedPatients(String Ip_no , String Rignt_Singn_Marks) throws IOException ,InterruptedException { 
		   
		   CommanUtill.clickFunction(Discharged_Patien_IP_no, Ip_no);  
		   CommanUtill.clickFunction(Discharged_Patients_Singn_Marks, Rignt_Singn_Marks);   
	   }
	    
	    public void SerachBedNo_DischargedPatients(String Bed_no , String Rignt_Singn_Marks) throws IOException ,InterruptedException { 
	 	   
	 	   CommanUtill.clickFunction(Discharged_Patients_Bed_No, Bed_no);  
	 	   CommanUtill.clickFunction(Discharged_Patients_Singn_Marks, Rignt_Singn_Marks);   
	    }
	    
	    public void SerachBillNo_DischargedPatients(String Bill_No , String Rignt_Singn_Marks) throws IOException ,InterruptedException { 
	  	   
	  	   CommanUtill.clickFunction(Discharged_Patients_Bill_No, Bill_No);  
	  	   CommanUtill.clickFunction(Discharged_Patients_Singn_Marks, Rignt_Singn_Marks);  
	  	   
	     }
	   public void SerachDischargedPatient(String Serch_Icon) throws IOException ,InterruptedException { 
		   
		   CommanUtill.clickFunction(Find_Patient_Serach_Icon, Serch_Icon);  
	   }
	   
	   public void SelectDischargedPatientsInTable(String Discharged_Patients) throws IOException ,InterruptedException { 
		   
		   CommanUtill.clickFunction(Discharged_Patients_Table, Discharged_Patients);
	   }
	   
	 // 

}
