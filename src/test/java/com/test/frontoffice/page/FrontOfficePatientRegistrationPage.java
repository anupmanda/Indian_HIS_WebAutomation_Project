/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 30-Jul-2025
 */
public class FrontOfficePatientRegistrationPage extends GeneralBrowserSetting{



	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";
	protected static String addPatient_meanu                    = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String patient_registration_page          = "//*[@id=\"FOAddPatientMenu\"]/ul/li[1]/a";

	// ---------------------- Basic Info ----------------------
	protected static String title = "//select[@id='title']";
	protected static String firstName = "//input[@id='firstName']";
	protected static String middleName = "//input[@id='middleName']";
	protected static String lastName = "//input[@id='lastName']";
	protected static String gender = "//select[@id='gender']";
	protected static String dob_radio_btn = "//input[@id='chkd']";
	protected static String dob = "//input[@id='dob']";
	protected static String ageRadio = "//input[@id='chkA']";
	protected static String age = "//input[@id='age']";
	protected static String ageAlert1 = "//p[contains(text(),'Please enter Date of Birth Age is less than 18 year')]";
	protected static String ageAlert = "//p[contains(text(),'Please enter Date of Birth Age is less than 18 yea')]";
	protected static String maritalStatus = "//select[@id='mStatus']";
	protected static String motherMaidenName = "//input[@id='motherName']";

	protected static String father_radio_btn = "//input[@id='chkFather']";
	protected static String fatherName = "//input[@id='relName']";

	protected static String spouse_radio_btn = "//input[@id='chkSpouse']";
	protected static String spouseName = "//input[@id='spouseName']";
	protected static String nationality = "//select[@id='nationality']";

	// ---------------------- VIP & Remarks ----------------------
	protected static String vipCheckbox = "//input[@id='vip']";
	protected static String vipText = "//input[@id='vipText']";
	
	protected static String remarksCheckbox = "//input[@id='remarks']";
	protected static String remarksText = "//input[@id='remarksText']";

	// ---------------------- NRI & ID ----------------------
	protected static String nri = "//input[@id='nri']";
	protected static String idCard = "//select[@id='cardType']";
	protected static String nationalId = "//input[@id='Nationalid']";

	// ---------------------- Contact ----------------------
	protected static String telephone = "//input[@id='teleNo']";
	protected static String country_code = "//input[@id='CountryCode']";
	protected static String mobile = "//input[@id='mobileNo']";
	protected static String mobileAlert = "//p[contains(text(),'mobile number should not be less than 10 digit')]";
	protected static String email = "//input[@id='emailID']";
	protected static String emailAlert = "//p[contains(text(),'Please enter correct email Id!')]";

	// ---------------------- Address ----------------------
	protected static String address = "//textarea[@id='address']";
	protected static String city = "//select[@id='city']";
	protected static String locolity = "//input[@id='locationid']";
	protected static String pincode = "//input[@id='PostalCode']";
	
	protected static String addNewCity = "//input[@id='addcity']";
	protected static String auto_State_drp = "//select[@id='state']";
	protected static String pin_zip_auto = "//input[@id='pin']";
	protected static String auto_Country_drp = "//select[@id='country']";

	protected static String add_new_city_popup_btn = "//a[@id='addcity']";
	protected static String add_countryPopup = "//select[@id='countrysave']";
	protected static String add_statePopup = "//select[@id='Staesave']";
	protected static String add_districtPopup = "//select[@id='Districtid']";
	protected static String add_cityNamePopup = "//input[@id='city_name']";
	protected static String save_add_new_city_popup = "//a[@id='SaveCity']";

	protected static String add_new_lacolity_btn = "//a[@id='addlocal']";
	protected static String add_cityDropdownPopup = "//select[@id='Citysave']";
	protected static String add_pin_code_popup = "//input[@id='Pincode']";
	protected static String add_locality_Popup = "//input[@id='local']";
	protected static String add_new_locality_save_btn = "//a[@id='Save']";

	
	// ---------------------- Referral & Language ----------------------
	protected static String refer = "//input[@id='refDr']";
	protected static String language = "//select[@id='lang']";
	protected static String month_income = "//input[@id='monthly_income']";
	
	// ---------------------- Others ----------------------
	protected static String occupation = "//select[@id='occupation']";
	protected static String qualification = "//select[@id='qualification']";
	protected static String religion = "//select[@id='religion']";

	protected static String category = "//select[@id='Category']";
	protected static String source_information = "//select[@id='sref']";
	protected static String sub_source = "//select[@id='sub_src']";
	protected static String other_source_text = "//input[@id='txtOtherSS']";
	

	// ---------------------- Financial & Scheme ----------------------
	
	protected static String financialCheckbox = "//input[@id='fin']";
	protected static String companyType = "//select[@id='companytype']";
	protected static String company = "//select[@id='company']";
	protected static String corporate_company = "//select[@id='corporateCompany']";
	protected static String rate = "//select[@id='rate']";
	protected static String showAll = "//input[@id='Showall']";
	protected static String insurance_company = "//select[@id='ins_com']";
	protected static String purpopse_viste = "//select[@id='PurposeofVisit']";
	protected static String company_department = "//select[@id='Companydepartment']";
	
	protected static String Insurance_Company_icon = "//img[@src='/sanitywebhistree/images/action_Newbtn/bankrej.svg']";
	protected static String policy_no_text = "//select[@id='ins_com']";
	protected static String validity_date_popup= "//input[@id='valid_till']";
	protected static String certificate_no_text = "//input[@id='certificate_no']";
	protected static String plush_icon_click = "//span[@id='add_com']//i[@class='fa fa-plus']";
	
//mofdification reason
	protected static String reason_for_modification_text = "//textarea[@id='_reasonForModifiaction']";
	
	// ---------------------- kin details ----------------------

	protected static String kin_name = "//input[@id='KinName']";
	protected static String kin_relationship = "//select[@id='kinRelationship']";
	protected static String kin_phone = "//input[@id='kinPhone']";
	
	// ---------------------- Care Giver Details ----------------------
	protected static String care_giver_checkbox = "//a[@class='addCareKin']//i[@title='Add']";
	protected static String care_giver_type = "//select[@id='KinCareGiverType']";
	protected static String care_giver_name = "//input[@id='KinCareGiverName']";
	protected static String care_giver_relationship = "//select[@id='kinRelationship1']";
	protected static String care_giver_contact_number = "//input[@id='KinCareGiverPhone']";
	protected static String care_giver_timeing_remaks = "//input[@id='KinCareGiverRemarks']";
	protected static String care_giver_add_save = "//i[@id='AddmultipleCareGiver']";
	

	//------------------------scheme---------------------------------------------
	protected static String schemeCheckbox = "//input[@id='chkscheme']";
	protected static String scheme = "//select[@id='scheme']";

	// ---------------------- Registration & Insurance ----------------------
	protected static String registerIcon = "//input[@id='register']";
	protected static String insuranceIcon = "//body//div//div[3]//div[3]//span[4]";
	protected static String policyNumber = "//input[@id='policy_no']";
	protected static String certificateNumber = "//input[@id='certificate_no']";
	protected static String insuranceSaveIcon = "//span[@id='add_com']//i[@class='fa fa-plus']";

	// ---------------------- Referred By Selector ----------------------
	protected static String referredByDoubleClick = "//input[@id='refDr']";
	protected static String selfSelector = "(//td[contains(text(),'Self')])[1]";


	// ---------------------- Popups ----------------------
	protected static String click_save_reg_btn = "//img[@src='/sanitywebhistree/images/action_Newbtn/save_btn.svg']";
	protected static String wthout_otp_popup = "//button[@id='cntRegister']";
	protected static String posible_dublicate_popup  = "//span[@id='duplicatepopupclose']//i[@class='fa fa-times']";
	protected static String confirmPatientDetails_Yes_Popup = "//a[@id='btnyesss']";
	protected static String confirmYesButton = "//input[@id='btnyesss']";
	protected static String registeredSuccessPopup = "//header[contains(text(),'Registered Successfully')]";
	
	
	protected static String registerSuccessNoButton = "//div[@class='popup-area']//div[@class='modal-block-new']//a[contains(text(),'No')]";
	protected static String registration_billing_no_popup = "//a[@id='btnno']";
	protected static String registration_yes_billing_page = "//a[@id='btnyes']";
    protected static String skip_general_consent = "//a[@id='skipconsent']";
	
	//-------------Paient Under 10 year ---------------
    protected static String under_regi_age_popup = "//a[@id='popupPediatricPatientYes']";
	protected static String home_page = "//img[@id='showmenuIcon']";



	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void clickOnAddPatientMenu(String add_patient , String registration_page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
		CommanUtill.clickFunction(patient_registration_page, registration_page);
	}

	public void selectByTitleDropdown(String titleText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(title, titleText);
	}

	public void enterOnFirstName(String firstNameText) throws IOException, InterruptedException {

		CommanUtill.textEnter(firstName, firstNameText);
	}

	public void enterOnMiddleName(String middleNameText) throws IOException, InterruptedException {

		CommanUtill.textEnter(middleName, middleNameText);
	}

	public void enterOnLastName(String lastNameText) throws IOException, InterruptedException {

		CommanUtill.textEnter(lastName, lastNameText);
	}

	public void selectByGenderDropdown(String genderText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(gender, genderText);
	}

	public void enterOnDOB(String Dob_Radio_Button ,String dobText) throws IOException, InterruptedException {

		CommanUtill.clickFunction(dob_radio_btn, Dob_Radio_Button);
		CommanUtill.textEnter(dob, dobText);
	}

	public void clickOnAgeRadioButtonAndAgeText(String Age_Radio_Btn ,String age_text) throws IOException, InterruptedException {

		CommanUtill.clickFunction(ageRadio, Age_Radio_Btn);
		CommanUtill.textEnter(age, age_text);
	}
	
	public void selectByMaritalStatus(String maritalStatusText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(maritalStatus, maritalStatusText);
	}

	public void enterOnMotherMaidenName(String motherNameText) throws IOException, InterruptedException {

		CommanUtill.textEnter(motherMaidenName, motherNameText);
	}

	public void enterOnFatherName(String father_radio ,String fatherNameText) throws IOException, InterruptedException {

		CommanUtill.clickFunction(father_radio_btn, father_radio);
		CommanUtill.textEnter(fatherName, fatherNameText);
	}

	public void enterOnSpouseName(String spouse_radio, String spouseNameText) throws IOException, InterruptedException {

		CommanUtill.clickFunction(spouse_radio_btn, spouse_radio);
		CommanUtill.textEnter(spouseName, spouseNameText);
	}

	public void selectByNationality(String nationalityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(nationality, nationalityText);
	}

	// ---------------------- VIP & Remarks ----------------------
	public void clickOnVIPCheckbox(String vip_check_box , String vipValue) throws IOException, InterruptedException {

		CommanUtill.clickFunction(vipCheckbox, vip_check_box);
		CommanUtill.textEnter(vipText, vipValue);
	}

	public void clickOnRemarksCheckbox(String remaks_check_box , String remaks_text) throws IOException, InterruptedException {

		CommanUtill.clickFunction(remarksCheckbox, remaks_check_box);
		CommanUtill.textEnter(remarksText, remaks_text);
	}


	// ---------------------- NRI & ID ----------------------
	public void clickOnNRICheckbox(String NRI_CheckBox) throws IOException, InterruptedException {

		CommanUtill.clickFunction(nri, NRI_CheckBox);
	}

	public void selectByIDCardDropdwonAndIDNumber(String id_type , String ID_Number_Text) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(idCard, id_type);
		CommanUtill.textEnter(nationalId, ID_Number_Text);
	}

	
	// ---------------------- Contact ----------------------
	public void enterOnTelephone(String telephoneText) throws IOException, InterruptedException {

		CommanUtill.textEnter(telephone, telephoneText);
	}

	public void enterOnCountryCode(String countryCodeText) throws IOException, InterruptedException {

		CommanUtill.textEnter(country_code, countryCodeText);
	}

	public void enterOnMobileNumber(String mobileText) throws IOException, InterruptedException {

		CommanUtill.textEnter(mobile, mobileText);
	}

	public void enterOnEmail(String emailText) throws IOException, InterruptedException {

		CommanUtill.textEnter(email, emailText);
	}

	// ---------------------- Address ----------------------
	public void enterOnHouseFlatNo(String addressText) throws IOException, InterruptedException {

		CommanUtill.textEnter(address, addressText);
	}

	public void selectByCityDropdown(String cityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(city, cityText);
	}

	public void enterLocalityPODropdown(String loaclity_drp) throws IOException, InterruptedException {

		CommanUtill.textEnter(locolity, loaclity_drp);

	}

	public void enterOnPinCode(String pincodeText) throws IOException, InterruptedException {

		CommanUtill.textEnter(pincode, pincodeText);
	}

	public void selectAutoPopulatedState(String autoStateText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(auto_State_drp, autoStateText);
	}
	
	public void enterAutoSelectZip_PinCodeState(String autoStateText) throws IOException, InterruptedException {

		CommanUtill.textEnter(pin_zip_auto, autoStateText);
	}
	
	public void selectAutoSelatedCountry(String autoCountryText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(auto_Country_drp, autoCountryText);
	}

	// ---------------------- Add New City & Locality ----------------------
	
	public void AddNewCityPopup(String add_city_btn , String Country_drp , String State_drp , String District_Drp,
			String City_Drp , String Save_Button) throws IOException, InterruptedException {
		CommanUtill.clickFunction(add_new_city_popup_btn, add_city_btn);
		CommanUtill.dropdownSelectByVisibleText(add_countryPopup, Country_drp);
		CommanUtill.dropdownSelectByVisibleText(add_statePopup, State_drp);
		CommanUtill.dropdownSelectByVisibleText(add_districtPopup, District_Drp);
		CommanUtill.dropdownSelectByVisibleText(add_cityNamePopup, City_Drp);
		CommanUtill.clickFunction(save_add_new_city_popup, Save_Button);

	}

	public void clickOnAddNewLocality(String add_new_lacolity_button , String City_drp , String Locality_text, String Pin_text ,
			String Save_Locality) throws IOException, InterruptedException {

		CommanUtill.clickFunction(add_new_lacolity_btn, add_new_lacolity_button);
		CommanUtill.dropdownSelectByVisibleText(add_cityDropdownPopup, City_drp);
		CommanUtill.textEnter(add_locality_Popup, Locality_text);
		CommanUtill.textEnter(add_pin_code_popup, Pin_text);
		CommanUtill.clickFunction(add_new_locality_save_btn, Save_Locality);
	}
	
	public void enterOnReasonForModification(String reasonText) throws IOException, InterruptedException {

		CommanUtill.textEnter(reason_for_modification_text, reasonText);
	}

	// ---------------------- Referral & Language ----------------------

	public void enterOnReferredBy(String referralText) throws IOException, InterruptedException {

		CommanUtill.textEnter(refer, referralText);
		WebElement ref = driver.findElement(By.xpath(refer));
		ref.sendKeys(Keys.ENTER);
		ref.sendKeys(Keys.ENTER);
	}

	public void selectByPreferredLanguageDropdown(String languageText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(language, languageText);
	}

	public void enterOnMonthlyIncome(String incomeText) throws IOException, InterruptedException {

		CommanUtill.textEnter(month_income, incomeText);
	}

	// ---------------------- Others ----------------------

	public void selectByOccupationDropdown(String occupationText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(occupation, occupationText);
	}

	public void selectByQualificationDropdown(String qualificationText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(qualification, qualificationText);
	}

	public void selectByReligionDropdown(String religionText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(religion, religionText);
	}

	// ---------------------- Category & Source Info ----------------------

	public void selectByCategoryDropdown(String categoryText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(category, categoryText);
	}

	public void selectBySourceOfInformationAndSubSorurceDropdown(String sourceText , String otherSourceText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(source_information, sourceText);
		CommanUtill.dropdownSelectByVisibleText(sub_source, otherSourceText);
	}

	public void enterOnOtherSourceOfInformation(String otherSourceInfoText) throws IOException, InterruptedException {

        CommanUtill.textEnter(other_source_text, otherSourceInfoText);
    }

	public void clickOnFinancialCheckbox(String financial_Details) throws IOException, InterruptedException {

		CommanUtill.clickFunction(financialCheckbox, financial_Details);
	}

	public void selectByCompanyTypeDropdown(String companyTypeText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(companyType, companyTypeText);
	}

	
	public void selectByCompanyDropdown(String companyText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(company, companyText);
	}

	public void selectByCorporateCompanyDropdown(String corporateText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(corporate_company, corporateText);
	}

	public void selectByRateContractDropdown(String rateText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(rate, rateText);
	}
	//insurance company
	public void clickOnShowAllCheckbox(String show_all_company , String insuranceCompanyText) throws IOException, InterruptedException {

		CommanUtill.clickFunction(showAll, show_all_company);
		CommanUtill.dropdownSelectByVisibleText(insurance_company, insuranceCompanyText);
	}
	
	//purpose of visit and department
	
	public void selectByPurposeOfVisitDropdown(String purposeText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(purpopse_viste, purposeText);
	}

	public void selectByCompanyDepartmentDropdown(String departmentText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(company_department, departmentText);
	}
	
	public void clickOnHomeInsuranceCompanyDetails(String click_home_insurance_comp , String policy_number , String cetificate_no_text)
			throws IOException, InterruptedException {

               CommanUtill.clickFunction(Insurance_Company_icon, click_home_insurance_comp);
               CommanUtill.dropdownSelectByVisibleText(policy_no_text, policy_number);
               CommanUtill.textEnter(certificate_no_text, cetificate_no_text);
	}
	//Scheme

	public void clickOnSchemeCheckboxAndSelectScheme(String scheme_check_box , String Scheme_drp) throws IOException, InterruptedException {

		CommanUtill.clickFunction(schemeCheckbox, scheme_check_box);
		CommanUtill.dropdownSelectByVisibleText(scheme, Scheme_drp);
	}

	//kin

	public void enterKinDetails(String kinName , String Kin_Relationship_drp , String Kin_Phome_no) throws IOException, InterruptedException {

		CommanUtill.textEnter(kin_name, kinName);
		CommanUtill.dropdownSelectByVisibleText(kin_relationship, Kin_Relationship_drp);
		CommanUtill.textEnter(kin_phone, Kin_Phome_no);
	}
	
	public void clickOnCareGiverCheckboxAndEnterDetails(String  Care_kin_plush_icon, String Care_Giver_Type_drp, String Care_Giver_Name_text,
			String Care_Giver_Relation_drp, String Care_Giver_Contact_Number_text , String Care_Giver_Timeing_Remaks_text)
			throws IOException, InterruptedException {
		CommanUtill.clickFunction(care_giver_checkbox, "Care_kin_plush_icon");
		CommanUtill.dropdownSelectByVisibleText(care_giver_type, Care_Giver_Type_drp);
		CommanUtill.textEnter(care_giver_name, Care_Giver_Name_text);
		CommanUtill.dropdownSelectByVisibleText(care_giver_relationship, Care_Giver_Relation_drp);
		CommanUtill.textEnter(care_giver_contact_number, Care_Giver_Contact_Number_text);
		CommanUtill.textEnter(care_giver_add_save, Care_Giver_Timeing_Remaks_text);
		
	}
	
	//__________________________________save__________________________________________________________

	// ------------------ Save Registration ------------------

	public void clickOnSaveRegistrationButton(String fieldName) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_save_reg_btn, fieldName);
	}
	
	public void clickOnSkipGeneralConsentButton(String skip_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(skip_general_consent, skip_popup);
	}

	//-------------------------------otp--------------------------------------
	public void clickOnOTPWithoutVrificationPopup(String fieldName) throws IOException, InterruptedException {

		//CommanUtill.clickFunction(wthout_otp_popup, fieldName);

		if (CommanUtill.isElementPresent(wthout_otp_popup)) {
			CommanUtill.clickFunction(wthout_otp_popup, fieldName);
			System.out.println(" Without OTP Popup and was closed.");
		} else {
			System.out.println("Without OTP Popup did not appear.");
		}
	}

	public void closePossibleDuplicatePopup(String fieldName) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(posible_dublicate_popup)) {
			CommanUtill.clickFunction(posible_dublicate_popup, fieldName);
			System.out.println("Duplicate popup appeared and was closed.");
		} else {
			System.out.println("Duplicate popup did not appear.");
		}
	}

	// ------------------ Confirm Patient Details Popup ------------------

	public void handleYESConfirmPatientDetailsPopup(String fieldName) throws IOException, InterruptedException {

		CommanUtill.clickFunction(confirmPatientDetails_Yes_Popup, fieldName);
	}

	public void NoBillingPageInRegistrationPagePopup(String fieldName) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(registration_billing_no_popup)) {
			CommanUtill.clickFunction(registration_billing_no_popup, fieldName);
			System.out.println("No Billing Page appeared and was closed.");
		} else {
			System.out.println("No Billing Page  did not appear.");
		}	
	}
	
	public void YesBillingPageInRegistrationPagePopup(String filedname) throws IOException, InterruptedException {

		CommanUtill.clickFunction(registration_yes_billing_page, filedname);

	}
	// ------------------ Registered Successfully Popup ------------------

	public void clickOnRegisterSuccessNoButton(String fieldName) throws IOException, InterruptedException {

		CommanUtill.clickFunction(registerSuccessNoButton, fieldName);
	}

	/**
	 * @return
	 */
	public String getUHIDOfPatient() 
	{
		String id = null;
		try {
			String no = driver.findElement(By.xpath("//section[@class='popupBody1']")).getText();
			String[] parts = no.split(" ");
			String part1 = parts[4];
			String[] part2 = part1.split("M");
			id = part2[0];
			System.out.println("Patient Registrarion No."+id+"UHID given");

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return id;
	}

	public void clickOnThreeLineRightSide(String filedname) throws IOException, InterruptedException {

		CommanUtill.clickFunction(home_page, filedname);

	}
	
//-----------------------------Registration Age Under Popup---------------------------
	
	public void yespopupUnderAgeRegistration(String Below_age) throws IOException, InterruptedException {
		if (CommanUtill.isElementPresent(under_regi_age_popup)) {
			CommanUtill.clickFunction(under_regi_age_popup, Below_age);
			System.out.println("Yes popup appeared and was Registration.");
		} else {
			System.out.println("Under 10 Years popup did not appear.");
		}
	}


}
