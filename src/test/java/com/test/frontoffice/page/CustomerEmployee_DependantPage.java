/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 08-Jan-2026
 */
public class CustomerEmployee_DependantPage extends GeneralBrowserSetting {
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String cstomerEmployee_dependant = "//a[normalize-space()='Customer Employee/Dependant']";
	
	//--------------------- Customer Employee_Dependant ---------------------------------
	
	protected static String company_type_drp = "//select[@id='_Companytype']";
	protected static String company_drp = "//select[@id='_Company']";
	protected static String rate_contract_drp = "//select[@id='_RateContract']";
	protected static String corporate_company_drp = "//select[@id='_CorporateCompany']";
	protected static String all_chkk_box = "//input[@id='_all_companies']";
	protected static String add_dependent_btn = "//a[@id='btnDependent']";
	
	//----------------------ADD Dependent Popup ---------------------------
	
	protected static String add_dependent_employee_no = "//input[@id='txtEmpnoDep']";
	protected static String add_dependent_first_name = "//input[@id='txtNameDep']";
	protected static String add_dependent_nationalirty_drp = "//select[@id='ddlNationalityDep']";
	
	protected static String add_dependent_Dob_radio_Button = "//input[@id='chkdobdep']";
	protected static String add_dependent_enter_Dob = "//input[@id='_dobdep']";
	protected static String add_dependent_age_radio_Button = "//input[@id='chkagedep']";
	protected static String add_dependent_enter_age = "//input[@id='_agedep']";
	protected static String add_dependent_gender_drp = "//select[@id='ddlGenderdep']";
	protected static String add_dependent_mobile_no = "//input[@id='txtMobileDep']";
	protected static String add_dependent_Residence_Card_Type = "//select[@id='ddlResidenceCardDep']";
	protected static String add_dependent_Nationality_Id = "//input[@id='_txtnationalitydep']";
	protected static String add_dependent_relation = "//select[@id='ddlRelation']";
	protected static String add_dependent_save_btn = "//a[@id='btnsaveDependent']//i[@class='fa fa-save']";
	
	protected static String add_dependent_close_popup = "//div[@id='popup900']//a[@id='#']//i[@class='fa fa-times']";
	
	//----------------------------Add Employee ---------------------------------
	
	protected static String add_employee = "//a[@id='btnEmployee']";
	protected static String add_empoloyee_popup_empoployee_no = "//input[@id='txtEmpno']";
	protected static String add_empoloyee_popup_frist_name = "//input[@id='txtName']";
	protected static String add_empoloyee_popup_Employee_Status_Tag = "//select[@id='ddlstatusEmp']";
	protected static String add_empoloyee_popup_Nationality = "//select[@id='ddlNationality']";
	
	protected static String add_empoloyee_popup_radio_Dob = "//input[@id='chkdob']";
	protected static String add_empoloyee_popup_enter_dob = "//input[@id='_dob']";
	protected static String add_empoloyee_popup_radio_age = "//input[@id='chkage']";
	protected static String add_empoloyee_popup_enter_age = "//input[@id='_age']";
	protected static String add_empoloyee_popup_gender_drp = "//select[@id='ddlGender']";
	protected static String add_empoloyee_popup_enter_mobile = "//input[@id='txtMobile']";
	protected static String add_empoloyee_popup_enter_Residence_Card_Type_drp = "//select[@id='ddlResidenceCard']";
	protected static String add_empoloyee_popup_Nationality_Id = "//input[@id='_txtnationality']";
	
	protected static String add_empoloyee_popup_save = "//a[@id='btnsave']//i[@class='fa fa-save']";
	
	
	
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void FoAddpatientmeanu(String add_patient ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
	}

	public void clickOnCustomerEmployeeDependantPage(String Insurance_Document) throws IOException, InterruptedException {

		CommanUtill.clickTabSwitchToAnotherWindow(cstomerEmployee_dependant, Insurance_Document);
	}
	
	//-------------------------Customer Employee Dependant --------------------------------
	
	public void CompanyTypeAndCompanyDrp(String Company_type , String Company_drp) throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(company_type_drp, Company_type);
		CommanUtill.dropdownSelectByVisibleText(company_drp, Company_drp);
	}
	
	public void RateContractAndCorporateCompanyDrp(String Rate_contract_drp , String Corporate_company_drp)
			throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(rate_contract_drp, Rate_contract_drp);
		CommanUtill.dropdownSelectByVisibleText(corporate_company_drp, Corporate_company_drp);
	}
	
	public void ShowAllCheckBox(String All_Show_Check_Box) throws IOException, InterruptedException{
		
		CommanUtill.clickFunction(all_chkk_box, All_Show_Check_Box);
	}
	
	public void AddDependentButton(String add_dependent) throws IOException, InterruptedException{
		
		CommanUtill.clickFunction(add_dependent_btn, add_dependent);
	}
	
	//-----------------------Add Dependent Btn Popup ---------------------------
	
	public void EnterEmployeeNumber(String Employee_Number) throws IOException, InterruptedException{
		
		CommanUtill.textEnter(add_dependent_employee_no, Employee_Number);	
	}
	public void EnterFirstNameAndNationalityDrp(String First_Name , String Nationality_drp) 
			throws IOException , InterruptedException{
		
		CommanUtill.textEnter(add_dependent_first_name, First_Name);
		CommanUtill.dropdownSelectByVisibleText(add_dependent_nationalirty_drp, Nationality_drp);	
	}
	
	public void RadioBtnDOBAndEnterDOb(String dob_Radio_Btn , String enter_Dob) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(add_dependent_Dob_radio_Button, dob_Radio_Btn);
		CommanUtill.textEnter(add_dependent_enter_Dob, enter_Dob);
		driver.findElement(By.xpath(add_dependent_enter_Dob)).sendKeys(Keys.TAB);
	}
	
	public void AgeRadioBtnAndEnterAge(String Age_Radio , String Enter_Age) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(add_dependent_age_radio_Button, Age_Radio);
		CommanUtill.textEnter(add_dependent_enter_age, Enter_Age);
	}
	
	public void GenderAndMobileNumber(String gender_drp , String Mobile_Number)  throws IOException , InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(add_dependent_gender_drp, gender_drp);
		CommanUtill.textEnter(add_dependent_mobile_no, Mobile_Number);
		
	}
	
	public void ResidenceCardType_NationalityId_Relation(String ResidenceCardType_Drp , String NationalityId_text , String Relation_drp)
			throws IOException , InterruptedException{
		
		CommanUtill.dropdownSelectByVisibleText(add_dependent_Residence_Card_Type, ResidenceCardType_Drp);
		CommanUtill.textEnter(add_dependent_Nationality_Id, NationalityId_text);
		CommanUtill.dropdownSelectByVisibleText(add_dependent_relation, Relation_drp);	
	}
	
	public void SaveAddDependentButton(String Add_Dependent_btn) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(add_dependent_save_btn, Add_Dependent_btn);
	}
	
	public void closeAddDependentPopup(String Add_dependent_poppup) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(add_dependent_close_popup, Add_dependent_poppup);
		
	}
	
	//--------------------------- Add Employee popup --------------------------------
	
	public void clickAddEmployeeButton(String employee_btn) throws IOException , InterruptedException{
		
		CommanUtill.clickFunction(add_employee, employee_btn);
		
	}
	
	public void enterEmployeeNumber(String Employee_no) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(add_empoloyee_popup_empoployee_no, Employee_no);
		
	}
	
	public void AddEmployeePopupFirstNameEmployeeStatusTagNationality(String first_name , String employee_staus_drp ,
			String Nationality_drp) throws IOException , InterruptedException {
		
		CommanUtill.textEnter(add_empoloyee_popup_frist_name, first_name);
		CommanUtill.dropdownSelectByVisibleText(add_empoloyee_popup_Employee_Status_Tag, employee_staus_drp);
		CommanUtill.dropdownSelectByVisibleText(add_empoloyee_popup_Nationality, Nationality_drp);
		
	}
	
	public void AddEmployee_PopupRadioBtnDOBAndEnterDob(String radio_btn_dob , String enter_Dob) throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(add_empoloyee_popup_radio_Dob, radio_btn_dob);
		CommanUtill.textEnter(add_empoloyee_popup_enter_dob, enter_Dob);
		driver.findElement(By.xpath(add_empoloyee_popup_enter_dob)).sendKeys(Keys.TAB);
	}
	
   public void AddEmployee_PopupRadioBtnAgeAndEnterAge(String radio_btn_Age , String enter_Age) throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(add_empoloyee_popup_radio_age, radio_btn_Age);
		CommanUtill.textEnter(add_empoloyee_popup_enter_age, enter_Age);
	}
   
   public void Gender_MobileNumber_ResidenceCardType_NationalityId(String gender_drp , String enter_mobile_no , 
		   String ResidenceCardType_drp , String enter_NationalityId) throws IOException , InterruptedException {
	   
	   CommanUtill.dropdownSelectByVisibleText(add_empoloyee_popup_gender_drp, gender_drp);
	   CommanUtill.textEnter(add_empoloyee_popup_enter_mobile, enter_mobile_no);
	   CommanUtill.dropdownSelectByVisibleText(add_empoloyee_popup_enter_Residence_Card_Type_drp, ResidenceCardType_drp);
	   CommanUtill.textEnter(add_empoloyee_popup_Nationality_Id, enter_NationalityId);  
   }
   
   public void SaveAddEmployeePopup(String add_Employee_save_popup) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(add_empoloyee_popup_save, add_Employee_save_popup);
	   
   }
   
   
   
   
}
