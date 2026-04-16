/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
 * 17-Mar-2026
 */
public class Er_RegistrationPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String emergency_side_button = "//span[normalize-space()='ER Registration']";
	protected static String emergency_page = "//a[contains(text(),'ER Registration')]";
	//=============================== passport Details============================

	protected static String nationality_drp = "//select[@id='_nationality']";
	protected static String Passport_No = "//input[@id='txtPNo']";
	protected static String issue_date = "//input[@id='txtIDate']";
	protected static String expiry_date = "//input[@id='txtEdate']";
	protected static String issued_at = "//input[@id='txtIFrom']";
	protected static String foreigner_type = "//select[@id='_ForeignerType']";
	protected static String vISA_No = "//input[@id='txtVisaNo']";
	protected static String valid_from = "//input[@id='VisaValidFrom']";
	protected static String valid_to = "//input[@id='VisaValidTo']";
	protected static String remaks_passport = "//textarea[@id='VisaRemarks']";
	protected static String yes_pasport = "//a[@id='passportYES']";

	protected static String title = "//select[@id='_title']";
	protected static String first_Name = "//input[@id='f_name']";
	protected static String Middle_Name = "//input[@id='m_name']";
	protected static String last_name = "//input[@id='l_name']";
	protected static String gender_Drp = "//select[@id='_sex']";
	protected static String dab_radio_button = "//input[@id='chkdob']";
	protected static String enter_dob = "//input[@id='txtDOB']";
	protected static String Radio_Btn_age = "//input[@id='chkage']";
	protected static String enter_age = "//input[@id='_age']";	

	protected static String age_type = "//select[@id='_agetype']";
	protected static String Father_Radio_Btn = "//input[@id='_chkfather']";
	protected static String Father_Enter = "//input[@id='fs_name']";
	protected static String Spouse_Radio_Btn = "//input[@id='_chkspouse']";
	protected static String Spouse_Enter_Name = "//input[@id='fs_name']";
	protected static String m_status_Drp = "//select[@id='M_status']";

	//_____________________________Demographics___________________________________________
	protected static String demographics_btn = "//a[normalize-space()='Demographics']";

	protected static String address = "//textarea[@id='_address']";
	protected static String city_town = "//select[@id='_city']";
	protected static String locality_po = "//select[@id='_locality']";

	protected static String country = "//select[@id='_country']";
	protected static String Other_locality = "//input[@id='other_locality' and @type='text']";
	protected static String Enter_Pin = "//input[@id='PostalCode']";
	protected static String pin = "//input[@id='_pin']"; //Auto Add Pin 

	protected static String state_Drp = "//select[@id='_state']";
	protected static String Nationality_Drp = "//select[@id='_nationality']";   //Passport Details 

	protected static String Preferred_Language_Drp = "//select[@id='_prefereredlang']"; 
	protected static String Primary_Speciality_Drp = "//select[@id='Primary_speciality']"; 
	protected static String Primary_consultant_Drp = "//select[@id='admconsultant']"; 
	protected static String Referred_By = "//input[@id='_refBY']"; 

	protected static String ABC_Text = "//input[@id='txtDig']"; 
	protected static String stay_duration = "//input[@id='txtDurationOFStay']"; 

	protected static String Phone = "//input[@id='_phone']";
	protected static String country_code = "//input[@id='CountryCode']";
	protected static String mobile = "//input[@id='_mobile']";

	protected static String email = "//input[@id='_email']";
	protected static String Religion_Drp = "//select[@id='_religion']";
	protected static String Occupation_Drp = "//select[@id='_occupation']";
	protected static String Education_Drp = "//select[@id='_education']";
	protected static String Mother_Name = "//input[@id='_mother_name']";
	protected static String NRI_Check_Box = "//input[@id='chkNRI']";
	protected static String ID_Type_Drp = "//select[@id='card_type']";
	protected static String ID_Text = "//input[@id='national_id']";

	protected static String Click_plush_Add_Id_Card_type = "//i[@id='ernational']";
	protected static String Id_Card_type_Pop = "//select[@id='MultiNationalId']";
	protected static String National_Id_Pop = "//input[@id='mulNationalid']";
	protected static String Save_plush_Id_Card_type_pop = "//i[@id='Addmultiplenationalcardtype2']";
	protected static String Close_plush_Id_Card_type = "//i[@class='fa fa-window-minimize']";

	protected static String Co_Speciality_Drp = "//select[@id='_cospecilty']";
	protected static String Co_Consultant_Drp = "//select[@id='_coconsultant']";
	protected static String Blood_Group_Drp = "//select[@id='_Bloodgroup']";

	protected static String SOURCEOFINFO_Drp = "//select[@id='_hdyoctkau']";
	protected static String Sub_Source = "//select[@id='Er_Subsource']";
	protected static String Other_Sub_Source = "//input[@id='txtOtherSS']"; //Hidden

	protected static String Ward_Drp = "//select[@id='ward_type']";
	protected static String Admission_Type_Drp = "//select[@id='admission_type_Patients']";
	protected static String Check_Box_Triage = "//input[@id='chkTriage']";
	protected static String Triage_Drp = "//select[@id='triageLabel']";
	protected static String Patient_Condition = "//textarea[@id='txtArea']";
	protected static String Infectious_Patient_Drp  = "//select[@id='_Infectious']";
	protected static String Patient_File_Req_Checl_Box  = "//input[@id='ER_MRDFile']";
	protected static String Patient_Likes  = "//textarea[@id='PatLIkes']";

	//===========================Payment Mode ========================================
	protected static String Payment_Details_Btn = "//a[normalize-space()='Payment Details']";
	protected static String Radio_Btn_Cash = "//input[@id='cashtype']";

	protected static String Radio_Btn_Company_Insurance = "//input[@id='_comInsurancetype']";
	protected static String Scheme_Check_Box = "//input[@id='_schme']";
	protected static String Scheme_Drp = "//select[@id='_scgmetype']";  
	//Scheme Date Hidden
	protected static String Company_Type_Drp = "//select[@id='comp_type']"; 
	protected static String Company_Drp = "//select[@id='_company']"; 
	protected static String Rate_contract = "//select[@id='_ratecontract']"; 

	protected static String Policy_No = "//input[@id='policy_type']"; 
	protected static String Auth_Claim_No = "//input[@id='AuthorizationNo']"; 
	protected static String Standard_Deductible = "//input[@id='Standard_deductible']"; 

	protected static String Standrad_Co_pay = "//input[@id='Standard_copay']"; 
	protected static String Letter_Number = "//input[@id='_letterNo']"; 
	protected static String Letter_Date = "//input[@id='letterdate']"; 

	protected static String Check_Box_Companies = "//input[@id='chk_companytype']"; 
	protected static String Check_Box_Pharmacy = "//input[@id='chkRestrictNonPayble']"; 
	protected static String Corporate_Company = "//select[@id='ddCorporateCompany']";   
	protected static String Insurance_Company_Drp = "//select[@id='AllInsuranceCompany']";   
	protected static String Auth_Amount = "//input[@id='_AuthAmount']"; 
	protected static String Credit_Limit = "//input[@id='Credit_limit']"; 

	protected static String Employee_Code = "//input[@id='_EmployeeNo']"; 
	protected static String Relation_Name = "//input[@id='Employee_name']"; 
	protected static String Issued_By = "//input[@id='_issuedate']"; 

	protected static String per_Day = "//input[@id='paerday']"; 

	//===========================Permanent Address ========================================

	protected static String permanentaddress_Btn = "//a[normalize-space()='Permanent Address']";
	protected static String copy_address = "//input[@id='copy_address']";
	protected static String permanent_address = "//input[@id='_copyadd']";
	protected static String permanent_City_Town_Drp = "//select[@id='copy_citytown']";
	protected static String permanent_address_locality_Drp = "//select[@id='_copylocallity']";
	protected static String permanent_address_Blanks_Box = "//input[@id='_copyotherlocal']";

	protected static String permanent_address_State = "//div[@id='permanentAddress']//span[6]";	 //hidden	  
	protected static String permanent_address_Phone = "//input[@id='copy_phone']";
	protected static String permanent_address_Mobile = "//input[@id='copy_mobile']";

	//=================================MLC Details=======================================
	protected static String mlc_details_Btn = "//a[normalize-space()='MLC Details']";
	protected static String Check_Box_Medico_Legal_Case = "//input[@id='Medico-Legal']";

	protected static String mlc_No = "//input[@id='MLCNo']";
	protected static String Mlc_Type_Drp = "//select[@id='ddlMLCType']";		  
	protected static String Injury_Type_Drp = "//select[@id='cmbInjuryType']";
	protected static String Brought_By  = "//input[@id='broughtBy']";	 

	protected static String Transport_Drp = "//select[@id='ddlTransport']";
	protected static String Place_Accident  = "//input[@id='PlaceOfAcciedent']";
	protected static String Police_Station = "//input[@id='PoliceStation']";

	protected static String Mlc_Officer_Name = "//input[@id='officeName']";
	protected static String Mlc_Officer_Phone = "//input[@id='officerPhone']";
	protected static String Mlc_Complaint_No  = "//input[@id='Complaintno']";
	protected static String Buckle_no_Police = "//input[@id='txtBuckleNo']";
	protected static String Date_injury = "//input[@id='dtpInjuryDate']";
	protected static String Date_Initiation = "//input[@id='dtpInitiationDate']";

	protected static String MLC_Cause_of_Accident = "//textarea[@id='CauseOfAccident']";
	protected static String Mlc_Identification_Marks = "//textarea[@id='IdentificationMarks_EM']";
	protected static String MLC_Remarks = "//textarea[@id='txtRemark']";
	protected static String Check_Box_Outside_Mlc  = "//input[@id='outsidemlc']";

	//===========================Next Kin Details =============================
	protected static String kin_details_Btn = "//a[normalize-space()='Next of Kin Details']";
	protected static String kin_name = "//input[@id='KinName']";
	protected static String Kin_relationship = "//select[@id='KinRelationship']";
	protected static String kin_phone = "//input[@id='Kinphone']";
	protected static String kin_Mobile = "//input[@id='kinmobile']";

	//============================== Ambulance Details ================================
	protected static String Ambulance_details_Btn = "//a[normalize-space()='Ambulance Information']";
	protected static String Ambulance_driver_name = "//input[@id='txtDriverNameEM']";
	protected static String Ambulance_mobile_Driver_No = "//input[@id='txtMobileNoOfDoctorEM']";
	protected static String Ambulance_Number = "//input[@id='txtAmbulanceNoEM']";

	protected static String Ambulance_Date_Time = "//input[@id='txtArrivalDateTimeEM']";
	protected static String Ambulance_other_Details = "//textarea[@id='txtOtherDetailEM']";

	//==========================save Btn===================================
	protected static String Save_Btn = "//a[@id='btnsave']//i[@class='fa fa-save']";
	protected static String Save_Yes_Pop = "//a[@id ='btnSave_Data']";
	protected static String Ok_pop = "//a[@id ='btnEmergencyReg']";
	protected static String print_Wrist_Yes   =  "//a[@id ='btnsavePrint']";

	protected static String posible_dublicate_popup  = "//a[@id='btnDuplicateAlertClose']//i[@class='fa fa-times']";
	protected static String print_Reg_From   =  "//a[@id='printRegForm']//i[@class='fa fa-print']";
	protected static String print_Btn   =  "//a[@id='btnPrint']//i[@class='fa fa-print']";
	protected static String print_Face_Sheet_Radio_Btn   =  "//input[@id ='printFaceSheet']";
	protected static String print_Face_Sheet_pop   =  "//a[@id ='PopPrintSave']//i[@class ='fa fa-print']";
	protected static String Close_print_pop   =  "//a[@id ='PopPrintClose']//i[@class ='fa fa-times']";
	//==========================Modify Btn ===============================

	protected static String Enter_Er_No   =  "//input[@id='ERNo']";
	protected static String Click_Modif_Btn   =  "//i[@class='fa fa-pencil-square']";
	protected static String Reason_Modification   =  "//textarea[@id='_reasonForModification']";
	protected static String Modifiy_Save_Btn   =  "//a[@id='btnupdate']//i[@class='fa fa-save']";
	//================================Patient Document===================================================
	protected static String patient_Document_Btn   =  "//i[@class='fa fa-file']";
	protected static String Patient_Document_Type   =  "//select[@id='drddocType1']";
	protected static String patient_upload_Icon   =  "//i[@title='Upload']";

	protected static String Upload_Document_Name   =  "//input[@id='txtDName']";
	protected static String Upload_Type_Drp   =  "//select[@id='popupDocumentType']";
	protected static String Upload_Choose_File   =  "//input[@id='filename']";
	protected static String Upload_Save_Btn   =  "//a[@id='popupSave']//i[@class='fa fa-save']";
	protected static String Close_Patient_Document_pop   =  "//a[@id ='docmodalclose']";

	//==============================Admit As Ip ============================
	protected static String Click_Admit_To_Ip   =  "//i[@class='fa fa-ticket']";
	protected static String patient_Info_Btn   =  "//a[normalize-space()='Patient Info']";
	protected static String patient_Info_Faclility_drp   =  "//select[@id='Facility']";
	protected static String Requested_Bed_Type_Drp  =  "//select[@id='popdrpBType']";
	protected static String Allotted_Bed_Type_Drp   =  "//select[@id='popdrpBBtype']";
	protected static String patient_Info_Ward_Drp  =  "//select[@id='popdrpWard']";
	protected static String Mode_Of_Transport_Drp   =  "//select[@id='MOT']";

	protected static String Consultant_Diet_Btn  =  "//a[normalize-space()='Consultant and Diet']";
	protected static String Primary_Speciality  =  "//select[@id='popdrpPSpeciality']";
	protected static String Primary_Consultant  =  "//select[@id='popPConsultant']";
	protected static String Secondary_Speciality_drp  =  "//select[@id='_secondaryspeciality']";
	protected static String Secondary_Consultant_drp  =  "//select[@id='secondaryConsultant']";
	protected static String Co_Speciality_drp  =  "//select[@id='_cospecilty1']";
	protected static String Co_Consultant_drp  =  "//select[@id='_coconsultant1']";

	protected static String Diet_Diabetic_Chkk_Box  =  "//input[@id='popDiabetic']";
	protected static String Diet_Onion_Chekk_Box  =  "//input[@id='popOnion']";
	protected static String Diet_Garlic_Chkk_Box  =  "//input[@id='popGarlic']";

	protected static String Next_Kin_Btn  =  "//a[normalize-space()='Next Of Kin']";
	protected static String Next_Kin_Cupy_Present_Addres  =  "//input[@id='popchekkCopy']";
	protected static String Next_Kin_Address  =  "//input[@id='poptxtAddress']";

	protected static String Emergency_Contacts_Name  =  "//input[@id='poptxtName']";
	protected static String Emergency_Contacts_Phone =  "//input[@id='EmergencypoptxtPNo']";
	protected static String Emergency_Contacts_Counselling_billing  =  "//input[@id='popBCDone']";
	protected static String Emergency_Contacts_Clinical_Counselling   =  "//input[@id='popCCDone']";

	protected static String Save_Er_To_Ip_Pop   =  "//a[@id='PopSaveEmergencyPatient']//i[@class='fa fa-save']";
	protected static String Save_admitted_Ok_Pop   =  "//a[@id='PatientAdmitIPID']";

  //=====================Menu ===========================
	protected static String menu_Icon   =  "//a[@id='showmenu']";



	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEmercencyPage(String emergency_btn, String Register_emergency_page ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(emergency_side_button, emergency_btn);
		CommanUtill.clickFunction(emergency_page, Register_emergency_page);
	}

	public void selectTitileDropDwon(String title_drp) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(title, title_drp);
	}
	public void enterPatientName(String Fristname, String Middlename, String Lastnname) throws IOException, InterruptedException { 

		CommanUtill.textEnter(first_Name, Fristname);
		CommanUtill.textEnter(Middle_Name, Middlename);
		CommanUtill.textEnter(last_name, Lastnname);   
	}
	public void selectByGenderDropdwon(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(gender_Drp, fieldName);
	}

	public void closePossibleDuplicatePopup(String fieldName) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(posible_dublicate_popup)) {
			CommanUtill.clickFunction(posible_dublicate_popup, fieldName);
			System.out.println("Duplicate popup appeared and was closed.");
		} else {
			System.out.println("Duplicate popup did not appear.");
		}
	}
	public void DOBRadioBtn_EnterDob(String click_dob_radio_button, String text_dob)throws IOException, InterruptedException{

		WebDriverWait Dob = new WebDriverWait(driver, Duration.ofSeconds(10));
		Dob.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dab_radio_button)));
		CommanUtill.clickFunction(dab_radio_button, click_dob_radio_button);
		CommanUtill.textEnter(enter_dob, text_dob);
	}
	public void enterAgeAndRadioButton(String age_radio, String text_age) throws IOException, InterruptedException { 

		WebDriverWait Age = new WebDriverWait(driver, Duration.ofSeconds(10));
		Age.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Radio_Btn_age)));
		CommanUtill.clickFunction(Radio_Btn_age, age_radio);
		CommanUtill.textEnter(enter_age, text_age);
	}

	public void selectByAgeTypeDropdwon(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(age_type, fieldName);
	}
	public void FatherRadioBtnAndEnterFatherName(String Father_Radio , String Enter_Father_Name) throws IOException, InterruptedException {

		WebDriverWait father = new WebDriverWait(driver, Duration.ofSeconds(10));
		father.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Father_Radio_Btn)));
		CommanUtill.clickFunction(Father_Radio_Btn, Father_Radio);
		CommanUtill.textEnter(Father_Enter, Enter_Father_Name);
	}
	public void SpouseRadioBtnAndEnterFatherName(String Spouse_Radio , String Enter_Spouse_Name) 
			throws IOException, InterruptedException {

		WebDriverWait father = new WebDriverWait(driver, Duration.ofSeconds(10));
		father.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Spouse_Radio_Btn)));
		CommanUtill.clickFunction(Spouse_Radio_Btn, Spouse_Radio);
		CommanUtill.textEnter(Spouse_Enter_Name, Enter_Spouse_Name);
	}
	public void SelectMaritalStatusDrp(String M_Status) throws IOException, InterruptedException {

		WebDriverWait  Marital = new WebDriverWait(driver, Duration.ofSeconds(10));
		Marital.until(ExpectedConditions.presenceOfElementLocated(By.xpath(m_status_Drp)));
		CommanUtill.dropdownSelectByVisibleText(m_status_Drp, M_Status);
	}
	//======================= Demographics Details =============================

	public void clickOnDemographicsDetailsButton(String Demographics) throws IOException, InterruptedException {

		WebDriverWait Demographics_Btn = new WebDriverWait( driver, Duration.ofSeconds(5));
		Demographics_Btn.until(ExpectedConditions.elementToBeClickable(By.xpath(demographics_btn)));
		CommanUtill.clickFunction(demographics_btn, Demographics);
	}
	public void EnterAddress(String Address_Text) throws IOException, InterruptedException{ 

		CommanUtill.textEnter(address, Address_Text);
	}
	public void CityTownAndLocalityDrp(String City_Drp , String Locality_Drp) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(city_town)));
		CommanUtill.dropdownSelectByVisibleText(city_town, City_Drp);
		CommanUtill.dropdownSelectByVisibleText(locality_po, Locality_Drp);
	}

	public void otherLocalityAndEnterPin(String Locality , String pin) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Other_locality)));
		CommanUtill.textEnter(Other_locality, Locality);
		CommanUtill.textEnter(Enter_Pin, pin);
	}
	public void PreferredLanguage_Drp(String Language_Drp) throws IOException, InterruptedException {

		WebDriverWait Language = new WebDriverWait( driver, Duration.ofSeconds(5));
		Language.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Preferred_Language_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Preferred_Language_Drp, Language_Drp);
	}
	public void PrimarySpecialityAndConsultantDrp(String Speciality_Drp , String consultant_Drp) throws IOException, InterruptedException {

		WebDriverWait Primary  = new WebDriverWait( driver, Duration.ofSeconds(5));
		Primary .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Primary_Speciality_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Primary_Speciality_Drp, Speciality_Drp);

		Primary .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Primary_consultant_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Primary_consultant_Drp, consultant_Drp);
	}

	public void enterOnReferredBy(String Referred )throws IOException, InterruptedException { 

		WebElement ref = driver.findElement(By.xpath(Referred_By));
		CommanUtill.textEnter(Referred_By, Referred);
		ref.sendKeys(Keys.ENTER);
		ref.sendKeys(Keys.ENTER);
	}
	public void EnterABCText(String Digit) throws IOException, InterruptedException {

		CommanUtill.textEnter(ABC_Text, Digit);
	}
	public void stayDuration(String duration) throws IOException, InterruptedException {

		CommanUtill.textEnter(stay_duration, duration);
	}

	public void EnterPhone_Email_ReligionDrp_OccupationDrp_EducationDrp(String Phone_No , String Email_Id , String Religion , 
			String Occupation ,String Education)  throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Phone)));
		CommanUtill.textEnter(Phone, Phone_No);
		CommanUtill.textEnter(email, Email_Id);
		CommanUtill.dropdownSelectByVisibleText(Religion_Drp, Religion);
		CommanUtill.dropdownSelectByVisibleText(Occupation_Drp, Occupation);
		CommanUtill.dropdownSelectByVisibleText(Education_Drp, Education);
	}
	public void EnterCountryCodeMobileNumber(String Counry_Code , String Mobile_No) throws IOException, InterruptedException {

		CommanUtill.textEnter(country_code, Counry_Code);
		CommanUtill.textEnter(mobile, Mobile_No);
	}

	public void MotherName(String Mother ) throws IOException, InterruptedException {

		CommanUtill.textEnter(Mother_Name, Mother);	 
	}
	public void NRIDetailsInformation(String NRI_Chkk , String Id_Type_Drp , String Id_Number ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(NRI_Check_Box, NRI_Chkk);	
		CommanUtill.dropdownSelectByVisibleText(ID_Type_Drp, Id_Type_Drp);
		CommanUtill.textEnter(ID_Text, Id_Number);	
	}
	public void PlushIconAddIdCardType(String plush_icon , String Id_Type_Drp , String National , String Save_Id , String Close_Pop )
			throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait .until(ExpectedConditions.elementToBeClickable(By.xpath(Click_plush_Add_Id_Card_type)));
		CommanUtill.clickFunction(Click_plush_Add_Id_Card_type, plush_icon);	
		CommanUtill.dropdownSelectByVisibleText(Id_Card_type_Pop, Id_Type_Drp);
		CommanUtill.textEnter(National_Id_Pop, National);	
		CommanUtill.clickFunction(Save_plush_Id_Card_type_pop, Save_Id);	
		CommanUtill.clickFunction(Close_plush_Id_Card_type, Close_Pop);	
	}

	public void Co_Speciality_Co_ConsultantAndBloodGroupDrp(String Speciality , String Consultant , String Blood_Grup_Drp )
			throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Co_Speciality_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Co_Speciality_Drp, Speciality);
		CommanUtill.dropdownSelectByVisibleText(Co_Consultant_Drp, Consultant);
		CommanUtill.dropdownSelectByVisibleText(Blood_Group_Drp, Blood_Grup_Drp);
	}
	public void sourceOfInformation(String source , String Sub_source ) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath(SOURCEOFINFO_Drp)));
		CommanUtill.dropdownSelectByVisibleText(SOURCEOFINFO_Drp, source);
		CommanUtill.dropdownSelectByVisibleText(Sub_Source, Sub_source);	
	}
	public void SelectByWarDrp(String Wrrd) throws IOException, InterruptedException {

		WebDriverWait ward  = new WebDriverWait( driver, Duration.ofSeconds(5));
		ward .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Ward_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Ward_Drp, Wrrd);
	}
	public void AdmissionType_patientCondition(String Admission_Drp , String Patient_Condition_Text ) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Admission_Type_Drp, Admission_Drp);
		CommanUtill.textEnter(Patient_Condition, Patient_Condition_Text);
	}
	public void TriageCheckBocAndDrp(String Click_Triage_Check_Box , String Triage) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait .until(ExpectedConditions.elementToBeClickable(By.xpath(Check_Box_Triage)));
		WebElement triage = driver.findElement(By.xpath(Check_Box_Triage));
		if(! triage.isSelected());
		CommanUtill.clickFunction(Check_Box_Triage, Click_Triage_Check_Box);
		CommanUtill.dropdownSelectByVisibleText(Triage_Drp, Triage);
	}
	public void InfectiousPatientDrp(String Infectious_Drp) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Infectious_Patient_Drp, Infectious_Drp);
	}
	public void patientLinks(String patient_link) throws IOException, InterruptedException {

		CommanUtill.textEnter(Patient_Likes, patient_link);
	}
	public void CheckBoxPatientFileRequest(String file_Req ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Patient_File_Req_Checl_Box, file_Req);
	}

	//====================== Payment Mode ==================================
	public void ClickOnPaymentDetailsBtn(String Payment_Btn) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Payment_Details_Btn, Payment_Btn);
	}
	public void CashRadioBtn(String Cash_Btn) throws IOException, InterruptedException{

		WebDriverWait cash  = new WebDriverWait( driver, Duration.ofSeconds(5));
		cash .until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Cash)));
		CommanUtill.clickFunction(Radio_Btn_Cash, Cash_Btn);
	}
	public void CompanyInsurnceRadioBtn(String Company_Btn) throws IOException, InterruptedException{

		WebDriverWait cash  = new WebDriverWait( driver, Duration.ofSeconds(5));
		cash .until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Company_Insurance)));
		CommanUtill.clickFunction(Radio_Btn_Company_Insurance, Company_Btn);
	}
	
	
	public void SchemeCheckBoxAndSelectScheme(String Scheme_Chkk_box , String Scheme_Drp_) throws IOException, InterruptedException{

		WebElement scheme_Check_Box =  driver.findElement(By.xpath(Scheme_Check_Box));
		if(! scheme_Check_Box.isSelected());
		CommanUtill.clickFunction(Scheme_Check_Box, Scheme_Chkk_box);
		CommanUtill.dropdownSelectByVisibleText(Scheme_Drp, Scheme_Drp_);
	}
	public void CompanyType_Company_RatecontractDrp(String Company_Type , String Company , String Rate_Contract) 
			throws IOException, InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(Company_Type_Drp, Company_Type);
		CommanUtill.dropdownSelectByVisibleText(Company_Drp, Company);
		CommanUtill.dropdownSelectByVisibleText(Rate_contract, Rate_Contract);
	}
	public void EnterPolicyNoAuthClaimNoStandardDeductible(String PolicyNo , String AuthClaimNo , String StandardDeductible)
			throws IOException, InterruptedException{

		CommanUtill.textEnter(Policy_No, PolicyNo);
		CommanUtill.textEnter(Auth_Claim_No, AuthClaimNo);
		CommanUtill.textEnter(Standard_Deductible, StandardDeductible);
	}
	public void StandradCo_payLetterNumberAndDate(String Co_pay , String Letter_No , String LetterDate) 
			throws IOException, InterruptedException{

		CommanUtill.textEnter(Standrad_Co_pay, Co_pay);
		CommanUtill.textEnter(Letter_Number, Letter_No);
		WebElement letter_Date = driver.findElement(By.xpath(Letter_Date));
		letter_Date.sendKeys(Keys.CONTROL + "a");
		letter_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Letter_Date, LetterDate);
	}
	public void CheckBoxShowAllCompanies(String Companies_Check_Box)  throws IOException, InterruptedException{

		WebDriverWait Companies  = new WebDriverWait( driver, Duration.ofSeconds(5));
		Companies .until(ExpectedConditions.elementToBeClickable(By.xpath(Check_Box_Companies)));
		CommanUtill.clickFunction(Check_Box_Companies, Companies_Check_Box);
	}
	public void CheckBoxAllowPharmacy_NonPayableItems(String NonPayableItems) throws IOException, InterruptedException{

		WebDriverWait NonPayable  = new WebDriverWait( driver, Duration.ofSeconds(5));
		NonPayable .until(ExpectedConditions.elementToBeClickable(By.xpath(Check_Box_Pharmacy)));
		CommanUtill.clickFunction(Check_Box_Pharmacy, NonPayableItems);
	}
	public void InsuranceCompanyDrp(String Insurance_Company) throws IOException, InterruptedException{

		WebDriverWait Insurance  = new WebDriverWait( driver, Duration.ofSeconds(5));
		Insurance .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Insurance_Company_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Insurance_Company_Drp, Insurance_Company);
	}
	public void AuthAmount(String Auth) throws IOException, InterruptedException{

		WebDriverWait Insurance  = new WebDriverWait( driver, Duration.ofSeconds(5));
		Insurance .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Auth_Amount)));
		CommanUtill.textEnter(Auth_Amount, Auth);
	}

	public void enterCreditLimit(String creditlimit) throws IOException, InterruptedException{

		WebDriverWait Insurance  = new WebDriverWait( driver, Duration.ofSeconds(5));
		Insurance .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Credit_Limit)));
		CommanUtill.textEnter(Credit_Limit, creditlimit);
	}

	public void EmployeeCode_Relation_IssuedBy(String Employee , String Relation , String IssuedBy ) 
			throws IOException, InterruptedException{

		CommanUtill.textEnter(Employee_Code, Employee);
		CommanUtill.textEnter(Relation_Name, Relation);
		CommanUtill.textEnter(Issued_By, IssuedBy);
	}
	public void EnterPerDay(String per_Day_Text) throws IOException, InterruptedException{

		CommanUtill.textEnter(per_Day, per_Day_Text);
	}

	//===========================Permanent Address ========================================
	public void clickOnPermanentAddressButton(String fieldName) throws IOException, InterruptedException {

		CommanUtill.clickFunction(permanentaddress_Btn, fieldName);

	}
	public void clickOnCopyFromPresentAddressCheckBox(String Cupy_CheckBox) throws IOException, InterruptedException {

		CommanUtill.clickFunction(copy_address, Cupy_CheckBox);

	}
	public void EnterPermanentAddressBox(String Address) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(permanent_address)));
		CommanUtill.textEnter(permanent_address, Address);
	}
	public void selectByPermanentCityTown_LocalityDrp(String City_Drp, String Locolity_Drp) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(permanent_City_Town_Drp, City_Drp);
		CommanUtill.dropdownSelectByVisibleText(permanent_address_locality_Drp, Locolity_Drp);
	}

	public void permanentPhoneMobileNumber(String Blanks_Name, String phone, String mobile)	
			throws IOException, InterruptedException {

		CommanUtill.textEnter(permanent_address_Blanks_Box, Blanks_Name);
		CommanUtill.textEnter(permanent_address_Phone, phone);
		CommanUtill.textEnter(permanent_address_Mobile, mobile);	
	} 
	//==============================MLC Details ============================

	public void clickOnMLCDetailsButton(String mlc_Btn) throws IOException, InterruptedException {

		CommanUtill.clickFunction(mlc_details_Btn, mlc_Btn);
	}
	public void MedicoLegalCaseCheckBox(String Check_Box_MedicoLegalCase) throws IOException, InterruptedException {

		WebDriverWait checkbox = new WebDriverWait(driver, Duration.ofSeconds(5));
		checkbox.until(ExpectedConditions.elementToBeClickable(By.xpath(Check_Box_Medico_Legal_Case)));
		CommanUtill.clickFunction(Check_Box_Medico_Legal_Case, Check_Box_MedicoLegalCase);
	}

	public void enterMlCNumber(String mlc_Number) throws IOException, InterruptedException {

		CommanUtill.textEnter(mlc_No, mlc_Number);
	}
	public void MLCType_InjuryType_BroughtBy_Transport_PlaceOfAccident_PoliceStation(String Mlc_Type, String Injury_drp , String Brought , 
			String Transport ,String Place_Of_Accident , String Police_Station_)throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Mlc_Type_Drp, Mlc_Type);
		CommanUtill.dropdownSelectByVisibleText(Injury_Type_Drp, Injury_drp);
		CommanUtill.textEnter(Brought_By, Brought);
		CommanUtill.dropdownSelectByVisibleText(Transport_Drp, Transport);
		CommanUtill.textEnter(Place_Accident, Place_Of_Accident);
		CommanUtill.textEnter(Police_Station, Police_Station_);
	}
	public void OfficerName_OfficerPhone_ComplaintNumber(String Officer_Name , String Officer_No , String Complaint , String Buckle_Police) 
			throws IOException, InterruptedException {

		CommanUtill.textEnter(Mlc_Officer_Name, Officer_Name);
		CommanUtill.textEnter(Mlc_Officer_Phone, Officer_No);
		CommanUtill.textEnter(Mlc_Complaint_No, Complaint);
		CommanUtill.textEnter(Buckle_no_Police, Buckle_Police);
	}
	public void MlcDateInjuryAndInitiationDate(String injury , String Initiation) throws IOException, InterruptedException {

		WebElement injury_date = driver.findElement(By.xpath(Date_injury));
		injury_date.sendKeys(Keys.CONTROL +"a");
		injury_date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Date_injury, Initiation);
		injury_date.sendKeys(Keys.TAB);

		WebElement Initiation_date = driver.findElement(By.xpath(Date_Initiation));
		Initiation_date.sendKeys(Keys.CONTROL +"a");
		Initiation_date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Date_Initiation, Initiation);
		Initiation_date.sendKeys(Keys.TAB);
	}

	public void MlcCauseOfAccident_IdentificationMarks_Remarks(String Cause_Accident , String Identification_Marks ,
			String Remaks) throws IOException, InterruptedException {

		CommanUtill.textEnter(MLC_Cause_of_Accident, Cause_Accident);
		CommanUtill.textEnter(Mlc_Identification_Marks, Identification_Marks);
		CommanUtill.textEnter(MLC_Remarks, Remaks);
	}

	public void OutSideMlcCheckBox(String Outside )throws IOException, InterruptedException {

		CommanUtill.clickFunction(Check_Box_Outside_Mlc, Outside);
	}
	//===========================Next Kin Details =============================
	public void clickOnNextOfKinDetailButton(String kin_Details_Btn) throws IOException, InterruptedException {

		CommanUtill.clickFunction(kin_details_Btn, kin_Details_Btn);
	}
	public void enterKinNameAndRelationDrpPhobeAndMobileNo(String kim_Name_text, String kim_relation , String Phone , String Mobile_No)
			throws IOException, InterruptedException {

		CommanUtill.textEnter(kin_name, kim_Name_text);
		CommanUtill.dropdownSelectByVisibleText(Kin_relationship, kim_relation);
		CommanUtill.textEnter(kin_phone, Phone);
		CommanUtill.textEnter(kin_Mobile, Mobile_No);
	}
	//===================================Ambulance_details=====================================

	public void clickOnAmbulanceDetailsButton(String Ambulance_details) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Ambulance_details_Btn, Ambulance_details);	
	}

	public void AmbulanceDriverNameMobileNumberAndAmbulanceNo(String ambulance_driver_name_text ,String Driver_Name , String ambulance_no) throws IOException, InterruptedException {

		CommanUtill.textEnter(Ambulance_driver_name, ambulance_driver_name_text);
		CommanUtill.textEnter(Ambulance_mobile_Driver_No, Driver_Name);
		CommanUtill.textEnter(Ambulance_Number, ambulance_no);
	}
	public void AmbulanceArrivalDateTimee() throws IOException, InterruptedException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm a");
		String currentDateTime = sdf.format(new java.util.Date());

		WebElement clear = driver.findElement(By.xpath(Ambulance_Date_Time));
		clear.sendKeys(Keys.CONTROL + "a");
		clear.sendKeys(Keys.DELETE);

		CommanUtill.textEnter(Ambulance_Date_Time, currentDateTime);
		clear.sendKeys(Keys.TAB);
		System.out.println(" Ambulance Date Time auto set to: " + currentDateTime);
	}
	public void enterOnOtherAmbulancDetalils(String Other_Details) throws IOException, InterruptedException {

		CommanUtill.textEnter(Ambulance_other_Details, Other_Details);

	}
	//=======================================Save Btb ========================================
	public void ErSaveBtnAndYespop(String save_Icon, String save_Yes_Popup) throws IOException, InterruptedException {
		
	    CommanUtill.clickFunction(Save_Btn, save_Icon);
	    Thread.sleep(500);

	    if (CommanUtill.isElementPresent(Save_Yes_Pop)) {
	        CommanUtill.clickFunction(Save_Yes_Pop, save_Yes_Popup);
	        System.out.println("Save Yes Popup Appeared and clicked");
	    } else {
	        System.out.println("Save Yes Popup did NOT appear");
	    }
	}

	public void ClickOnOkAfterSaveBtn(String ok) throws IOException, InterruptedException {

		 if (CommanUtill.isElementPresent(Ok_pop)) {
			 CommanUtill.clickFunction(Ok_pop, ok);
			 System.out.println("Save Yes Popup Appeared and clicked");	       
		    } else {
		        System.out.println("Save Yes Popup did NOT appear");
		    }
	}

	public String getUHIDOfPatient() {
		try {
			String uhid = driver.findElement(By.id("pUhid")).getText();
			// Clean prefix if present
			if (uhid != null && uhid.contains(":")) {
				uhid = uhid.split(":")[1].trim();  // only keep the part after colon
			}
			System.out.println("UHID from Popup: " + uhid);
			return uhid;
		} catch (Exception e) {
			System.out.println("Failed to fetch UHID: " + e.getMessage());
			return null;
		}
	}

	public String getEmergencyNoOfPatient() {
		try {
			String emergencyNo = driver.findElement(By.id("PErNo")).getText();
			System.out.println("Emergency No from Popup: " + emergencyNo);
			return emergencyNo;
		} catch (Exception e) {
			System.out.println("Failed to fetch Emergency No: " + e.getMessage());
			return null;
		}
	}

	public String getMLCNoOfPatient() {
		try {
			String mlcNo = driver.findElement(By.id("PMLCNo")).getText();
			System.out.println("MLC No from Popup: " + mlcNo);
			return mlcNo;
		} catch (Exception e) {
			System.out.println("Failed to fetch MLC No: " + e.getMessage());
			return null;
		}
	}

	public void YesprintWristBandPop(String Print_Yes) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(print_Wrist_Yes)) {

			WebElement msgElement = driver.findElement(By.xpath(print_Wrist_Yes));
			String message = msgElement.getText();
			System.out.println("Popup message displayed: " + message);
			CommanUtill.clickFunction(print_Wrist_Yes, Print_Yes);
		} else {
			System.out.println("Popup not displayed, continuing test...");
		}     
	}
	//=========================== Print ============================
	public void ClickOnPrintRegistionFrom(String Print_Reg) throws IOException, InterruptedException {

		WebDriverWait print =new WebDriverWait(driver , Duration.ofSeconds(10));
		print.until(ExpectedConditions.elementToBeClickable(By.xpath(print_Reg_From)));
		CommanUtill.clickFunction(print_Reg_From, Print_Reg);	
	}
	public void ClickOnPrintInHedder(String Print , String Face_Sheet_Radio_Btn , String Print_Btn) throws IOException, InterruptedException {

		WebDriverWait print =new WebDriverWait(driver , Duration.ofSeconds(10));
		print.until(ExpectedConditions.elementToBeClickable(By.xpath(print_Btn)));
		CommanUtill.clickFunction(print_Btn, Print);
		CommanUtill.clickFunction(print_Face_Sheet_Radio_Btn, Face_Sheet_Radio_Btn);
		CommanUtill.clickFunction(print_Face_Sheet_pop, Print_Btn);
	}
	public void CloseOnPrintInHedderPop(String Print_pop) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(Close_print_pop)) {
			CommanUtill.clickFunction(Close_print_pop, Print_pop);
		} else {
			System.out.println("Close Print pop");
		}     
	}

	//=========================Update Er Registration ===========================
	public void enterErNumber(String er_no) throws IOException, InterruptedException {

		WebDriverWait er = new WebDriverWait(driver, Duration.ofSeconds(10));
		er.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Enter_Er_No)));
		CommanUtill.textEnter(Enter_Er_No, er_no);
		WebElement ER_No = driver.findElement(By.xpath(Enter_Er_No));
		ER_No.sendKeys(Keys.ENTER);
	}
	public void clickModifiyBtnAndReasonTextAndUpdate(String Click_Modifiy_Btn , String Reason_Text , String update_Icon)
			throws IOException, InterruptedException {

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Modif_Btn)));
		CommanUtill.clickFunction(Click_Modif_Btn, Click_Modifiy_Btn);
		CommanUtill.textEnter(Reason_Modification, Reason_Text);
		CommanUtill.clickFunction(Modifiy_Save_Btn, update_Icon);  
	}
	//==========================Patient Document =====================================
	public void PatientDocumentIcon(String patient_Document_Icon) throws IOException, InterruptedException {

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Modif_Btn)));
		CommanUtill.clickFunction(patient_Document_Btn, patient_Document_Icon);
	}
	public void DocumentTypeDrpAndIocn(String Upload_Type , String Uplod_Icon) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Patient_Document_Type, Upload_Type);
		CommanUtill.clickFunction(patient_upload_Icon, Uplod_Icon);
	}
	public void UploadDocumentNameAndType(String Document_Name , String Document_Type) throws IOException, InterruptedException {

		CommanUtill.textEnter(Upload_Document_Name, Document_Name);
		CommanUtill.dropdownSelectByVisibleText(Upload_Type_Drp, Document_Type); 
	}
	public void ChooseUploadPdfAndSave(String PDf_File , String Save_Upload_Btn) throws IOException, InterruptedException {

		String filePath = "C:\\Users\\Anup.DESKTOP-V88DC5U\\Desktop\\Trio_Tree_Project_performance_testing\\AutomationFile_Upload\\download.pdf";

		WebElement uploadElement = driver.findElement(By.xpath(Upload_Choose_File));

		logger.info("============== File Upload ======================");
		logger.info("Uploading File Path : " + filePath);

		uploadElement.sendKeys(filePath);
		System.out.println("File Upload Location In Dashboard : " + filePath);

		WebDriverWait Save = new WebDriverWait(driver, Duration.ofSeconds(10));
		Save.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Upload_Save_Btn)));
		CommanUtill.clickFunction(Upload_Save_Btn, Save_Upload_Btn);
	}
	public void ClosePatientDocumentPop(String patient_Document_pop) throws IOException, InterruptedException {

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Close_Patient_Document_pop)));
		CommanUtill.clickFunction(Close_Patient_Document_pop, patient_Document_pop);
	}
	//============================Admit As Ip =====================================
	
	public void clickOnErToIpBtn(String Admit_Ip) throws IOException, InterruptedException { 

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Admit_To_Ip)));
		CommanUtill.clickFunction(Click_Admit_To_Ip, Admit_Ip);
	}
	public void clickPatientInformationpBtn(String patient_Info) throws IOException, InterruptedException { 

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(patient_Info_Btn)));
		CommanUtill.clickFunction(patient_Info_Btn, patient_Info);
	}

	public void selectByRequestedBedType_AllottedBedType_WardDrp(String Requested_Bed , String Allotted_Bed , String Ward )
			throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Requested_Bed_Type_Drp, Requested_Bed);
		CommanUtill.dropdownSelectByVisibleText(Allotted_Bed_Type_Drp, Allotted_Bed);
		CommanUtill.dropdownSelectByVisibleText(patient_Info_Ward_Drp, Ward);
	}

	public void SelectByModeOfTransport(String Transport_Drp) throws IOException, InterruptedException { 

		WebDriverWait transport =new WebDriverWait(driver , Duration.ofSeconds(10));
		transport.until(ExpectedConditions.presenceOfElementLocated(By.xpath(patient_Info_Btn)));
		CommanUtill.dropdownSelectByVisibleText(Mode_Of_Transport_Drp, Transport_Drp);
	}
	public void ClickOnConsultantDietBtn(String Consultant_Diet) throws IOException, InterruptedException { 

		WebDriverWait Consultant =new WebDriverWait(driver , Duration.ofSeconds(5));
		Consultant.until(ExpectedConditions.elementToBeClickable(By.xpath(Consultant_Diet_Btn)));
		CommanUtill.clickFunction(Consultant_Diet_Btn, Consultant_Diet);
	}
	
	public void ErToIp_PrimarySpecialityAndConsultantDrp(String Speciality_Drp ,String Consultant_Drp )
			throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Primary_Speciality, Speciality_Drp);
		CommanUtill.dropdownSelectByVisibleText(Primary_Consultant, Consultant_Drp);   
	}
	public void SecondarySpeciality_Consultant_Co_Speciality_Co_Consultant(String Speciality_Drp ,String Consultant_Drp,
			String Co_Speciality , String Co_Consultant) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Secondary_Speciality_drp, Speciality_Drp);
		CommanUtill.dropdownSelectByVisibleText(Secondary_Consultant_drp, Consultant_Drp);   
		CommanUtill.dropdownSelectByVisibleText(Co_Speciality_drp, Co_Speciality);   
		CommanUtill.dropdownSelectByVisibleText(Co_Consultant_drp, Co_Consultant);   
	}
	public void CheckBoxDietPreferenceDiabetic(String Diabetic) throws IOException, InterruptedException { 

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Diet_Diabetic_Chkk_Box)));
		CommanUtill.clickFunction(Diet_Diabetic_Chkk_Box, Diabetic);
	}
	public void CheckBoxDietPreferenceOnion(String Onion) throws IOException, InterruptedException { 

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Diet_Onion_Chekk_Box)));
		CommanUtill.clickFunction(Diet_Onion_Chekk_Box, Onion);
	}
	public void CheckBoxDietPreferenceGarlic(String Garlic) throws IOException, InterruptedException { 

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Diet_Garlic_Chkk_Box)));
		CommanUtill.clickFunction(Diet_Garlic_Chkk_Box, Garlic);
	}
	public void ClickOnNextKinBtn(String Kin_Btn) throws IOException, InterruptedException { 

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Next_Kin_Btn)));
		CommanUtill.clickFunction(Next_Kin_Btn, Kin_Btn);
	}
	public void CheckBoxCopyFromPresentAddress_Address(String Copy_Addres , String Enter_Address) throws IOException, InterruptedException { 

		WebDriverWait wait =new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Next_Kin_Cupy_Present_Addres)));
		CommanUtill.clickFunction(Next_Kin_Cupy_Present_Addres, Copy_Addres);
		CommanUtill.textEnter(Next_Kin_Address, Enter_Address);
	}
	public void EmergencyContactsNameAndPhone(String Name , String Phone) throws IOException, InterruptedException {

		CommanUtill.textEnter(Emergency_Contacts_Name, Name);
		CommanUtill.textEnter(Emergency_Contacts_Phone, Phone);
	}
	public void BillingCounsellingAndClinicalCounsellin(String Billing  , String Clinical) throws IOException, InterruptedException {

		CommanUtill.textEnter(Emergency_Contacts_Counselling_billing, Billing);
		CommanUtill.textEnter(Emergency_Contacts_Clinical_Counselling, Clinical);
	}
	public void SaveAdmitAsIpPopAndOkPop(String save , String Ok_Pop) throws IOException, InterruptedException {

		WebDriverWait save_Icon =new WebDriverWait(driver , Duration.ofSeconds(5));
		save_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Er_To_Ip_Pop)));
		CommanUtill.clickFunction(Save_Er_To_Ip_Pop, save);
		save_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_admitted_Ok_Pop)));
		CommanUtill.clickFunction(Save_admitted_Ok_Pop, Ok_Pop);
	}
   //===================================Menu Icon============================
	public void ClickMenuIcon(String menu) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menu_Icon)));
		CommanUtill.clickFunction(menu_Icon, menu);
	}


}
