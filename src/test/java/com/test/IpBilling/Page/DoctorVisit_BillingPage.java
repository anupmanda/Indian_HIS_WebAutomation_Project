/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 05-Feb-2026
 */
public class DoctorVisit_BillingPage extends GeneralBrowserSetting {
	
	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String ip_billing = "//span[normalize-space()='IP Billing']";

	//======================== Doctor visit page ===============================

	protected static  String Doctor_Visit_Page = "//a[normalize-space()='Doctor Visit']";
	protected static  String search_Patient_Icon = "//a[@id='searchdataIP']//i[@class='fa fa-search']";
	
	protected static  String Radio_btn_Current_In_Patient = "//input[@id='rbCurrentPatents']";
	protected static  String In_patient_All_Ward_Check_Box_pop = "//input[@id='cbAllWards']";
	
	protected static  String In_patient_Discharge_Admision_chkk_box_pop = "//input[@id='cbAdmission']";
	protected static  String In_patient_From_Date_pop = "//input[@id='txtadmitDate']";
	protected static  String In_patient_To_Date_pop = "//input[@id='txtadmittodate']";
	protected static  String Find_Patient_Serach_Icon = "//a[@id='search_billing']//i[@class='fa fa-search']";
	
	protected static  String Vip_check_box = "//input[@id='cbVip']";
	protected static  String remaks_check_Box = "//input[@id='cbRemark']";
	protected static  String Mobile_no_Serach = "//input[@id='modal_mobileNo']";
	protected static  String Name_Serach = "//input[@id='modal_Name']";
	protected static  String first_Name_Serach = "//input[@id='modal_firstName']";
	protected static  String Vip_Remark_text = "//input[@id='txtVIPRemark']";
	protected static  String National_ID  = "//input[@id='modal_nationalID']";
	protected static  String Gender_drp = "//select[@id='modal_gender']";
	protected static  String UHID = "//input[@id='txt_UHID_DC']";

	protected static  String Clear_Find_Patient_pop = "//i[@title='Clear']";
	protected static  String refresh_Mis_Charges_page = "//a[@id='ClearMiscItem']//i[@class='fa fa-refresh']";
	
	//========================Discharge Patient =================================================
	protected static  String Rdio_Btn_Discharged_Patients = "//input[@id='rbDisPatents']";
	
	protected static  String Discharged_Patien_IP_no = "//input[@id='txt_IPNo_DC']";
	protected static  String Discharged_Patients_Bed_No = "//input[@id='txt_BedNo']";
	protected static  String Discharged_Patients_Bill_No = "//input[@id='txt_BillNo_DC']";
	protected static  String Discharged_Patients_Singn_Marks = "//a[@id='btn_search_DC']//i[@class='fa fa-check']";
	
	protected static  String RefreshIcon = "//a[@id='btnRefresh']//i[@class='fa fa-refresh']";    
	
	//========================find Patient Table ==============================
	protected static  String find_patient_last_table = "//table[@id='searchBillingTable']//tbody//tr[@onclick][last()]";
	protected static  String find_patient_First_table = "//table[@id='searchBillingTable']//tbody//tr[@onclick][1]";
	
	//============================ Doctor Visit Main Page Data ===============================
	
	protected static  String enter_no = "//input[@id='txtipno']";  
	protected static  String Radio_Btn_visit_Type_Chargable = "//input[@id='rblcharge']"; 
	protected static  String Radio_Btn_Visit_Type_Normal = "//input[@id='rblnormal']"; 
	
	protected static  String Radio_Btn_Visit_Type_Non_Chargable = "//div[@class='master_panel']//span[5]//input[1]";    //
	protected static  String Radio_Btn_visit_Type_Emergency = "//input[@id='rblem']";  
	
	protected static  String visit_Date = "//input[@id='visitedate']";   //Visit date Cannot be Greater Then Current Date
	protected static  String visit_Time = "//input[@id='visittime']"; 
	protected static  String Speciality_Drp = "//select[@id='ddlSpeciality']";
	protected static  String Visiting_Doctor_drp = "//select[@id='ddlVisitingdoc']";
	protected static  String Remarks = "//textarea[@id='remarks']";
	protected static  String Save_Doctor_Visit_Icon = "//a[@id='savedocvisit']";

	protected static  String check_No_visit_Frome_Date = "//input[@id='visittime']";
	protected static  String check_No_visit_To_Date = "//input[@id='visittime']";
	protected static  String Search_Icon_Visits_No = "//a[@id='searchdatadtpip']//i[@class='fa fa-search']";
	
	 //=========================Search and Delete visit doctor Enter ip Numbre==========================
	
	protected static  String Visit_Search_Frome_Date = "//input[@id='dtpfdate']";
	protected static  String Visit_Search_To_Date = "//input[@id='dtptodate']";
	protected static  String Visit_Search_Icon = "//a[@id='searchdatadtpip']//i[@class='fa fa-search']";
	
	protected static  String Click_Check_Box_first = "//table[@id='tblvisitdata']//tbody/tr[1]//input[@type='checkbox']";
	//(//table[@id='tblvisitdata']//input[@type='checkbox'])[1]

	protected static  String Delete_Icon= "//a[@id='btndelete']//i[@class='fa fa-times']";
	protected static  String Delete_Yes_Pop= "//a[@id='btnYesdeletevisites']";
	
	
	
	
	
	
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

	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}
	public void DoctorVisitpage(String Ip_Billing_Tab, String doctor_visit) throws IOException , InterruptedException{

		CommanUtill.clickFunction(ip_billing, Ip_Billing_Tab);
		CommanUtill.clickFunction(Doctor_Visit_Page, doctor_visit);
	}
	
	//==============================Serach Patient Find Patient =============================

		public void FindPatient_SearchIcon(String Search) throws IOException ,InterruptedException {

			CommanUtill.clickFunction(search_Patient_Icon, Search);
		}

		public void RadioBtnCurrentInPatients_AllWardsCheckBox(String Current_In_Patent , String All_Ward_Check_Box)
				throws IOException ,InterruptedException {
			CommanUtill.clickFunction(Radio_btn_Current_In_Patient, Current_In_Patent);
			CommanUtill.clickFunction(In_patient_All_Ward_Check_Box_pop, All_Ward_Check_Box);
		}

		public void Current_In_Patient_Admission_Discharge_ChkkBox(String Admission_DisCharge) throws IOException ,InterruptedException {

			CommanUtill.clickFunction(In_patient_Discharge_Admision_chkk_box_pop, Admission_DisCharge);	
		}
		public void AdmissionDischarge_enterFromDate(String From_Date) throws IOException ,InterruptedException {

			WebElement from_Date = driver.findElement(By.xpath(In_patient_From_Date_pop));
			from_Date.sendKeys(Keys.CONTROL +"a");
			from_Date.sendKeys(Keys.DELETE);
			CommanUtill.textEnter(In_patient_From_Date_pop, From_Date);
			from_Date.sendKeys(Keys.TAB);
		}
		public void AdmissionDischarge_EnterToDate(String to_Date) throws IOException ,InterruptedException {

			WebElement To_Date = driver.findElement(By.xpath(In_patient_To_Date_pop));
			To_Date.sendKeys(Keys.CONTROL +"a");
			To_Date.sendKeys(Keys.DELETE);
			CommanUtill.textEnter(In_patient_To_Date_pop, to_Date);
			To_Date.sendKeys(Keys.TAB);
		}
		
		public void SearchCurrentInPatientIcon(String Search_Icon) throws IOException ,InterruptedException {
			
			CommanUtill.clickFunction(Find_Patient_Serach_Icon, Search_Icon);
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
 //======================================Refresh page And Discharged Patients ========================
		
		public void RefreshPage(String Refresh_Icon) throws IOException ,InterruptedException {
			
			CommanUtill.clickFunction(RefreshIcon, Refresh_Icon);
		}
		
	public void RadioBtnDischargedPatients(String  Discharged_Patients) throws IOException ,InterruptedException {
		
		CommanUtill.clickFunction(Rdio_Btn_Discharged_Patients, Discharged_Patients);
	}
	
	public void ClickOndischargedPatintTable(String Discharged_Patient_Table) throws IOException ,InterruptedException {
		
		CommanUtill.clickFunction(find_patient_First_table, Discharged_Patient_Table);
		
	}
	
	//============================ Doctor Visit Main Page Data ===============================
	
	public void EnterIpNumber(String Ip_No) throws IOException ,InterruptedException {
		
		WebElement enter_ip_Number = driver.findElement(By.xpath(enter_no));
		CommanUtill.textEnter(enter_no, Ip_No);
		enter_ip_Number.sendKeys(Keys.ENTER);
		
	}
	public void VisitTypeChargable_NormalRadioBtn(String Chargable , String Normal) throws IOException ,InterruptedException {
		
		CommanUtill.clickFunction(Radio_Btn_visit_Type_Chargable, Chargable);
		CommanUtill.clickFunction(Radio_Btn_Visit_Type_Normal, Normal);
	}
    public void VisitTypeChargable_EmergencyRadioBtn(String Chargable , String Emergency) throws IOException ,InterruptedException {
		
		CommanUtill.clickFunction(Radio_Btn_visit_Type_Chargable, Chargable);
		CommanUtill.clickFunction(Radio_Btn_visit_Type_Emergency, Emergency);
	}
    
    public void EnterVisitDate(String Visit_date_Entetr) throws IOException ,InterruptedException {
    	
    	WebElement Date = driver.findElement(By.xpath(visit_Date));
    	Date.sendKeys(Keys.CONTROL +"a");
    	Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(visit_Date, Visit_date_Entetr);
		Date.sendKeys(Keys.TAB);
    }
   
 public void EnterVisitTime(String Visit_Time_Entetr) throws IOException ,InterruptedException {
    	
    	WebElement time = driver.findElement(By.xpath(visit_Time));
    	time.sendKeys(Keys.CONTROL +"a");
    	time.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(visit_Time, Visit_Time_Entetr);
		time.sendKeys(Keys.TAB);
    }
    public void SelectBySpeciality_VisitingDoctorDrp(String Specility_Drp , String Visiting_Doctor_Drp) 
    		throws IOException ,InterruptedException {
    	
    	CommanUtill.dropdownSelectByVisibleText(Speciality_Drp, Specility_Drp);
    	CommanUtill.dropdownSelectByVisibleText(Visiting_Doctor_drp, Visiting_Doctor_Drp);
    }
    public void EnterRemarksText(String Remaks_Tex) throws IOException ,InterruptedException {
    	
    	CommanUtill.textEnter(Remarks, Remaks_Tex);
    }
    public void SaveDoctorVisitIcon(String Save_Doctor_Visit) throws IOException ,InterruptedException {
    	
    	CommanUtill.clickFunction(Save_Doctor_Visit_Icon, Save_Doctor_Visit);
    }
    
    //=========================Search and Delete visit doctor ==========================
    
   public void SearchFromedate(String from_Date) throws IOException ,InterruptedException {
    	
    	WebElement Frome_Date = driver.findElement(By.xpath(Visit_Search_Frome_Date));
    	Frome_Date.sendKeys(Keys.CONTROL +"a");
    	Frome_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Visit_Search_Frome_Date, from_Date);
		Frome_Date.sendKeys(Keys.TAB);
    }
   
   public void SearchTODate(String To_Date) throws IOException ,InterruptedException {
   	
   	WebElement TO_Date = driver.findElement(By.xpath(Visit_Search_To_Date));
   	TO_Date.sendKeys(Keys.CONTROL +"a");
   	TO_Date.sendKeys(Keys.DELETE);
	CommanUtill.textEnter(Visit_Search_To_Date, To_Date);
	TO_Date.sendKeys(Keys.TAB);
	
   }
   
   public void SearchVisitDoctorIcon(String Search) throws IOException ,InterruptedException {
	   
	   CommanUtill.clickFunction(Visit_Search_Icon, Search);
   }
   public void SelectCheckFirst(String Check_Box) throws IOException ,InterruptedException {
	   
	   CommanUtill.clickFunction(Click_Check_Box_first, Check_Box);
   }
   
   public void DeleteVisitDoctorIcon_YesPop (String Delete_btn , String Yes_Pop) throws IOException ,InterruptedException {
	   
	   CommanUtill.clickFunction(Delete_Icon, Delete_btn);
	   CommanUtill.clickFunction(Delete_Yes_Pop, Yes_Pop);
	   
   }
   
   
    
    
	 
}
