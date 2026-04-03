/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_RegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 19-Mar-2026
 */
public class TC_002_Er_RegistrationWithCompanyTest extends  Er_RegistrationPage{

	Er_RegistrationPage Registration = new Er_RegistrationPage();

	private final String sheetName = "ER_Registration_Page"; 

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====Sheet Name: " + sheetName + "======");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = true)	
	public void erDemogrphicDetailsTest(String facility_drp, String Station_drp, String title_drp, String First_Name, String 
			Middle_Name, String Last_Name,	String gender_drp, String Enter_DOB, String enter_Age, String age_type, String Father_Name ,
			String Spouse_Name ,  String MaritalStatus_drp, String Address, String City_Town_Drp, String Locality_po_Drp,String Other_Locality,
			String Enter_Pin_Number , String Preferred_Language_Drp , String PrimarySpeciality_Drp ,String Primary_ConsultantDrp , 
			String Enter_Referred_By , String Enter_Abc_Text , String Stay_Duration_Value ,String Phone_Number , String Email_Id , 
			String Religion_Drp , String Occupation_Drp , String Education_Drp ,String Country_Code , String Mobile_Number , 
			String Mother_Name_Text , String Id_Type_Drp , String Id_Number ,String Id_Card_Type_Drp_Pop , String National_Id_Text ,
			String Co_Speciality_Drp , String Co_Consultant_Drp , String Blood_Group_Drp , String Source_Drp , String Sub_Source_Drp ,
			String Ward_Drp , String Admission_Type_drp, String Patient_Condition_text, String Triage_Drp , String Infectious_Patient_Drp,
			String Enter_Patient_Links , String Scheme_Drp ,String Company_Type_Drp ,String Company_Drp , String Rate_Contract_Drp , 
			String Policy_Number , String AuthClaim_No , String Standard_Deductible_No , String Standrad_Co_pay_No , String Letter_No , 
			String Leter_Date ,String Insurance_Company_Drp,String Auth_Amount_No ,String Credit_Limit , String Employee_Code, 
			String Employee_Relation , String Employee_Issued_By , String Per_Day, String Permanent_Address , String Permanent_City_Drp, 
			String Permanent_Locolity_Drp ,String Blanks_Name , String Permanent_Phone_No , String Permanent_Mobile_No , String MLC_Number ,
			String MLC_Type_Drp , String Injury_Type_Drp , String BroughtBy_Text , String MLC_Transport_Drp , String Place_Of_Accident ,
			String MLC_Police_Station , String MLC_Officer_Name , String MLC_Officer_Phone , String MLC_Complaint_No , String Buckle_Police , 
			String Injury_Date , String Initiation_Date ,String MLC_Cause_Accident,String Identification_Marks ,String Remaks ,String Kin_Name ,
			String Kin_Relationship , String Kin_Phone_No , String Kin_Mobile_No , String Driver_Name ,String Mobile_Driver ,
			String Ambulance_No ,String Ambulanc_Othetr_Details )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Demographics Details", "Register Emergency Patient Test Case.");

		Registration.selectByFacilityDropdown(facility_drp);
		Registration.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Registration.clickOnEmercencyPage("Emercency Button in side Icon","Emercency Register Page");
		Registration.selectTitileDropDwon(title_drp);

		Registration.enterPatientName(First_Name + CommanUtill.randomAlphabets(4), Middle_Name, Last_Name);
		Registration.closePossibleDuplicatePopup("close Possible Duplicate Popup");
		Registration.selectByGenderDropdwon(gender_drp);

		Registration.DOBRadioBtn_EnterDob("Radio Button Dob", Enter_DOB); 
		Registration.FatherRadioBtnAndEnterFatherName("Click On Father Radio Btn" , Father_Name);
		Registration.SelectMaritalStatusDrp(MaritalStatus_drp);
		
		Registration.clickOnDemographicsDetailsButton("Click On Demographics Details Btn");
		Registration.EnterAddress(Address);

		Registration.CityTownAndLocalityDrp(City_Town_Drp , Locality_po_Drp);
		Registration.PreferredLanguage_Drp(Preferred_Language_Drp);
		Registration.PrimarySpecialityAndConsultantDrp(PrimarySpeciality_Drp , Primary_ConsultantDrp);
	
		Registration.enterOnReferredBy(Enter_Referred_By);
		Registration.EnterABCText(Enter_Abc_Text);
		Registration.stayDuration(Stay_Duration_Value);

		Registration.EnterCountryCodeMobileNumber(Country_Code, Mobile_Number);
		Thread.sleep(500);
		Registration.sourceOfInformation(Source_Drp, Sub_Source_Drp);
		
		Registration.SelectByWarDrp(Ward_Drp);
		Registration.AdmissionType_patientCondition(Admission_Type_drp, Patient_Condition_text);
		Registration.CheckBoxPatientFileRequest("File Req MRD.");
	}
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = true)	
	public void ErCompanyInsuranceDetailsTest(String facility_drp, String Station_drp, String title_drp, String First_Name, String 
			Middle_Name, String Last_Name,	String gender_drp, String Enter_DOB, String enter_Age, String age_type, String Father_Name ,
			String Spouse_Name ,  String MaritalStatus_drp, String Address, String City_Town_Drp, String Locality_po_Drp,String Other_Locality,
			String Enter_Pin_Number , String Preferred_Language_Drp , String PrimarySpeciality_Drp ,String Primary_ConsultantDrp , 
			String Enter_Referred_By , String Enter_Abc_Text , String Stay_Duration_Value ,String Phone_Number , String Email_Id , 
			String Religion_Drp , String Occupation_Drp , String Education_Drp ,String Country_Code , String Mobile_Number , 
			String Mother_Name_Text , String Id_Type_Drp , String Id_Number ,String Id_Card_Type_Drp_Pop , String National_Id_Text ,
			String Co_Speciality_Drp , String Co_Consultant_Drp , String Blood_Group_Drp , String Source_Drp , String Sub_Source_Drp ,
			String Ward_Drp , String Admission_Type_drp, String Patient_Condition_text, String Triage_Drp , String Infectious_Patient_Drp,
			String Enter_Patient_Links , String Scheme_Drp ,String Company_Type_Drp ,String Company_Drp , String Rate_Contract_Drp , 
			String Policy_Number , String AuthClaim_No , String Standard_Deductible_No , String Standrad_Co_pay_No , String Letter_No , 
			String Leter_Date ,String Insurance_Company_Drp,String Auth_Amount_No ,String Credit_Limit , String Employee_Code, 
			String Employee_Relation , String Employee_Issued_By , String Per_Day, String Permanent_Address , String Permanent_City_Drp, 
			String Permanent_Locolity_Drp ,String Blanks_Name , String Permanent_Phone_No , String Permanent_Mobile_No , String MLC_Number ,
			String MLC_Type_Drp , String Injury_Type_Drp , String BroughtBy_Text , String MLC_Transport_Drp , String Place_Of_Accident ,
			String MLC_Police_Station , String MLC_Officer_Name , String MLC_Officer_Phone , String MLC_Complaint_No , String Buckle_Police , 
			String Injury_Date , String Initiation_Date ,String MLC_Cause_Accident,String Identification_Marks ,String Remaks ,String Kin_Name ,
			String Kin_Relationship , String Kin_Phone_No , String Kin_Mobile_No , String Driver_Name ,String Mobile_Driver ,
			String Ambulance_No ,String Ambulanc_Othetr_Details )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Compamy Insurence Details", "Emergency Payment Mode Test Funcility");

		Registration.ClickOnPaymentDetailsBtn("Click On Payment Mode Btn");
		Registration.CompanyInsurnceRadioBtn("Click On Company Radio Btn");
		Registration.SchemeCheckBoxAndSelectScheme("Scheme Check Box" , Scheme_Drp);
		
		Registration.CompanyType_Company_RatecontractDrp(Company_Type_Drp , Company_Drp , Rate_Contract_Drp);
		Registration.EnterPolicyNoAuthClaimNoStandardDeductible(Policy_Number , AuthClaim_No , Standard_Deductible_No );
		Registration.StandradCo_payLetterNumberAndDate(Standrad_Co_pay_No , Letter_No , Leter_Date);
		
		//Registration.CheckBoxShowAllCompanies("Show All Company Check Box");
		//Registration.CheckBoxAllowPharmacy_NonPayableItems("Allow Pharmacy_NonPayable Items Check Box");
		
		//Registration.InsuranceCompanyDrp(Insurance_Company_Drp);
		Registration.AuthAmount(Auth_Amount_No);
		//Registration.enterCreditLimit(Credit_Limit);
		
		Registration.EmployeeCode_Relation_IssuedBy(Employee_Code ,Employee_Relation , Employee_Issued_By );
		Registration.EnterPerDay(Per_Day);
	}	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3 ,enabled = true)	
	public void AddPermanentAddressTest(String facility_drp, String Station_drp, String title_drp, String First_Name, String 
			Middle_Name, String Last_Name,	String gender_drp, String Enter_DOB, String enter_Age, String age_type, String Father_Name ,
			String Spouse_Name ,  String MaritalStatus_drp, String Address, String City_Town_Drp, String Locality_po_Drp,String Other_Locality,
			String Enter_Pin_Number , String Preferred_Language_Drp , String PrimarySpeciality_Drp ,String Primary_ConsultantDrp , 
			String Enter_Referred_By , String Enter_Abc_Text , String Stay_Duration_Value ,String Phone_Number , String Email_Id , 
			String Religion_Drp , String Occupation_Drp , String Education_Drp ,String Country_Code , String Mobile_Number , 
			String Mother_Name_Text , String Id_Type_Drp , String Id_Number ,String Id_Card_Type_Drp_Pop , String National_Id_Text ,
			String Co_Speciality_Drp , String Co_Consultant_Drp , String Blood_Group_Drp , String Source_Drp , String Sub_Source_Drp ,
			String Ward_Drp , String Admission_Type_drp, String Patient_Condition_text, String Triage_Drp , String Infectious_Patient_Drp,
			String Enter_Patient_Links , String Scheme_Drp ,String Company_Type_Drp ,String Company_Drp , String Rate_Contract_Drp , 
			String Policy_Number , String AuthClaim_No , String Standard_Deductible_No , String Standrad_Co_pay_No , String Letter_No , 
			String Leter_Date ,String Insurance_Company_Drp,String Auth_Amount_No ,String Credit_Limit , String Employee_Code, 
			String Employee_Relation , String Employee_Issued_By , String Per_Day, String Permanent_Address , String Permanent_City_Drp, 
			String Permanent_Locolity_Drp ,String Blanks_Name , String Permanent_Phone_No , String Permanent_Mobile_No , String MLC_Number ,
			String MLC_Type_Drp , String Injury_Type_Drp , String BroughtBy_Text , String MLC_Transport_Drp , String Place_Of_Accident ,
			String MLC_Police_Station , String MLC_Officer_Name , String MLC_Officer_Phone , String MLC_Complaint_No , String Buckle_Police , 
			String Injury_Date , String Initiation_Date ,String MLC_Cause_Accident,String Identification_Marks ,String Remaks ,String Kin_Name ,
			String Kin_Relationship , String Kin_Phone_No , String Kin_Mobile_No , String Driver_Name ,String Mobile_Driver ,
			String Ambulance_No ,String Ambulanc_Othetr_Details )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Permanent Address Details ", "Permanent Address Details Funcility Test");
	
		Registration.clickOnPermanentAddressButton("Click On Permanent Address Btn");
		Registration.clickOnCopyFromPresentAddressCheckBox("Click On Copy From Present Address");
		Registration.EnterPermanentAddressBox(Permanent_Address);
		
		Registration.selectByPermanentCityTown_LocalityDrp(Permanent_City_Drp , Permanent_Locolity_Drp);
		Registration.permanentPhoneMobileNumber(Blanks_Name , Permanent_Phone_No , Permanent_Mobile_No);
		
	}
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 4 ,enabled = true)	
	public void MLCDetailsTest(String facility_drp, String Station_drp, String title_drp, String First_Name, String 
			Middle_Name, String Last_Name,	String gender_drp, String Enter_DOB, String enter_Age, String age_type, String Father_Name ,
			String Spouse_Name ,  String MaritalStatus_drp, String Address, String City_Town_Drp, String Locality_po_Drp,String Other_Locality,
			String Enter_Pin_Number , String Preferred_Language_Drp , String PrimarySpeciality_Drp ,String Primary_ConsultantDrp , 
			String Enter_Referred_By , String Enter_Abc_Text , String Stay_Duration_Value ,String Phone_Number , String Email_Id , 
			String Religion_Drp , String Occupation_Drp , String Education_Drp ,String Country_Code , String Mobile_Number , 
			String Mother_Name_Text , String Id_Type_Drp , String Id_Number ,String Id_Card_Type_Drp_Pop , String National_Id_Text ,
			String Co_Speciality_Drp , String Co_Consultant_Drp , String Blood_Group_Drp , String Source_Drp , String Sub_Source_Drp ,
			String Ward_Drp , String Admission_Type_drp, String Patient_Condition_text, String Triage_Drp , String Infectious_Patient_Drp,
			String Enter_Patient_Links , String Scheme_Drp ,String Company_Type_Drp ,String Company_Drp , String Rate_Contract_Drp , 
			String Policy_Number , String AuthClaim_No , String Standard_Deductible_No , String Standrad_Co_pay_No , String Letter_No , 
			String Leter_Date ,String Insurance_Company_Drp,String Auth_Amount_No ,String Credit_Limit , String Employee_Code, 
			String Employee_Relation , String Employee_Issued_By , String Per_Day, String Permanent_Address , String Permanent_City_Drp, 
			String Permanent_Locolity_Drp ,String Blanks_Name , String Permanent_Phone_No , String Permanent_Mobile_No , String MLC_Number ,
			String MLC_Type_Drp , String Injury_Type_Drp , String BroughtBy_Text , String MLC_Transport_Drp , String Place_Of_Accident ,
			String MLC_Police_Station , String MLC_Officer_Name , String MLC_Officer_Phone , String MLC_Complaint_No , String Buckle_Police , 
			String Injury_Date , String Initiation_Date ,String MLC_Cause_Accident,String Identification_Marks ,String Remaks ,String Kin_Name ,
			String Kin_Relationship , String Kin_Phone_No , String Kin_Mobile_No , String Driver_Name ,String Mobile_Driver ,
			String Ambulance_No ,String Ambulanc_Othetr_Details )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency MLC Details ", "MLC Details Funcility Test"); 
		
		Registration.clickOnMLCDetailsButton("Click On Mlc Details Btn");
		Registration.MedicoLegalCaseCheckBox("Medico Legal Case Check Box");
		
		Registration.enterMlCNumber(MLC_Number + CommanUtill.randomAlphabets(3));
		Registration.MLCType_InjuryType_BroughtBy_Transport_PlaceOfAccident_PoliceStation(MLC_Type_Drp , Injury_Type_Drp ,BroughtBy_Text,
				MLC_Transport_Drp , Place_Of_Accident , MLC_Police_Station);
		
		Registration.OfficerName_OfficerPhone_ComplaintNumber(MLC_Officer_Name , MLC_Officer_Phone , MLC_Complaint_No ,
				Buckle_Police);
		Registration.MlcDateInjuryAndInitiationDate(Injury_Date , Initiation_Date);
		
		Registration.MlcCauseOfAccident_IdentificationMarks_Remarks(MLC_Cause_Accident , Identification_Marks , Remaks);
		//Registration.OutSideMlcCheckBox("Out Side Mlc Check Box");
	}
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 5 ,enabled = true)	
	public void KinDetailsTest(String facility_drp, String Station_drp, String title_drp, String First_Name, String 
			Middle_Name, String Last_Name,	String gender_drp, String Enter_DOB, String enter_Age, String age_type, String Father_Name ,
			String Spouse_Name ,  String MaritalStatus_drp, String Address, String City_Town_Drp, String Locality_po_Drp,String Other_Locality,
			String Enter_Pin_Number , String Preferred_Language_Drp , String PrimarySpeciality_Drp ,String Primary_ConsultantDrp , 
			String Enter_Referred_By , String Enter_Abc_Text , String Stay_Duration_Value ,String Phone_Number , String Email_Id , 
			String Religion_Drp , String Occupation_Drp , String Education_Drp ,String Country_Code , String Mobile_Number , 
			String Mother_Name_Text , String Id_Type_Drp , String Id_Number ,String Id_Card_Type_Drp_Pop , String National_Id_Text ,
			String Co_Speciality_Drp , String Co_Consultant_Drp , String Blood_Group_Drp , String Source_Drp , String Sub_Source_Drp ,
			String Ward_Drp , String Admission_Type_drp, String Patient_Condition_text, String Triage_Drp , String Infectious_Patient_Drp,
			String Enter_Patient_Links , String Scheme_Drp ,String Company_Type_Drp ,String Company_Drp , String Rate_Contract_Drp , 
			String Policy_Number , String AuthClaim_No , String Standard_Deductible_No , String Standrad_Co_pay_No , String Letter_No , 
			String Leter_Date ,String Insurance_Company_Drp,String Auth_Amount_No ,String Credit_Limit , String Employee_Code, 
			String Employee_Relation , String Employee_Issued_By , String Per_Day, String Permanent_Address , String Permanent_City_Drp, 
			String Permanent_Locolity_Drp ,String Blanks_Name , String Permanent_Phone_No , String Permanent_Mobile_No , String MLC_Number ,
			String MLC_Type_Drp , String Injury_Type_Drp , String BroughtBy_Text , String MLC_Transport_Drp , String Place_Of_Accident ,
			String MLC_Police_Station , String MLC_Officer_Name , String MLC_Officer_Phone , String MLC_Complaint_No , String Buckle_Police , 
			String Injury_Date , String Initiation_Date ,String MLC_Cause_Accident,String Identification_Marks ,String Remaks ,String Kin_Name ,
			String Kin_Relationship , String Kin_Phone_No , String Kin_Mobile_No , String Driver_Name ,String Mobile_Driver ,
			String Ambulance_No ,String Ambulanc_Othetr_Details )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Kin Details ", "Kin Details Funcility Test"); 
		
		Registration.clickOnNextOfKinDetailButton("Click On Kin Details Btn");
		Registration.enterKinNameAndRelationDrpPhobeAndMobileNo(Kin_Name , Kin_Relationship , Kin_Phone_No , Kin_Mobile_No);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 6 ,enabled = true)	
	public void AmbulanceInformationTest(String facility_drp, String Station_drp, String title_drp, String First_Name, String 
			Middle_Name, String Last_Name,	String gender_drp, String Enter_DOB, String enter_Age, String age_type, String Father_Name ,
			String Spouse_Name ,  String MaritalStatus_drp, String Address, String City_Town_Drp, String Locality_po_Drp,String Other_Locality,
			String Enter_Pin_Number , String Preferred_Language_Drp , String PrimarySpeciality_Drp ,String Primary_ConsultantDrp , 
			String Enter_Referred_By , String Enter_Abc_Text , String Stay_Duration_Value ,String Phone_Number , String Email_Id , 
			String Religion_Drp , String Occupation_Drp , String Education_Drp ,String Country_Code , String Mobile_Number , 
			String Mother_Name_Text , String Id_Type_Drp , String Id_Number ,String Id_Card_Type_Drp_Pop , String National_Id_Text ,
			String Co_Speciality_Drp , String Co_Consultant_Drp , String Blood_Group_Drp , String Source_Drp , String Sub_Source_Drp ,
			String Ward_Drp , String Admission_Type_drp, String Patient_Condition_text, String Triage_Drp , String Infectious_Patient_Drp,
			String Enter_Patient_Links , String Scheme_Drp ,String Company_Type_Drp ,String Company_Drp , String Rate_Contract_Drp , 
			String Policy_Number , String AuthClaim_No , String Standard_Deductible_No , String Standrad_Co_pay_No , String Letter_No , 
			String Leter_Date ,String Insurance_Company_Drp,String Auth_Amount_No ,String Credit_Limit , String Employee_Code, 
			String Employee_Relation , String Employee_Issued_By , String Per_Day, String Permanent_Address , String Permanent_City_Drp, 
			String Permanent_Locolity_Drp ,String Blanks_Name , String Permanent_Phone_No , String Permanent_Mobile_No , String MLC_Number ,
			String MLC_Type_Drp , String Injury_Type_Drp , String BroughtBy_Text , String MLC_Transport_Drp , String Place_Of_Accident ,
			String MLC_Police_Station , String MLC_Officer_Name , String MLC_Officer_Phone , String MLC_Complaint_No , String Buckle_Police , 
			String Injury_Date , String Initiation_Date ,String MLC_Cause_Accident,String Identification_Marks ,String Remaks ,String Kin_Name ,
			String Kin_Relationship , String Kin_Phone_No , String Kin_Mobile_No , String Driver_Name ,String Mobile_Driver ,
			String Ambulance_No ,String Ambulanc_Othetr_Details )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Ambulance Information ", "Ambulance Information Funcility Test"); 
		
		Registration.clickOnAmbulanceDetailsButton("Click On Ambulance Details Btn");
		Registration.AmbulanceDriverNameMobileNumberAndAmbulanceNo(Driver_Name , Mobile_Driver , Ambulance_No);
		Registration.AmbulanceArrivalDateTimee();
		Registration.enterOnOtherAmbulancDetalils(Ambulanc_Othetr_Details);
	}
	
		@Test(priority = 7 ,enabled = true)
		public void SaveEmergencyPatientTest() 
				throws IOException, InvalidFormatException, InterruptedException{

			logger = extent.createTest("Emergency Save Button", "Save Emergency And Get UHID , Emergency No , MLC No");
			Registration.ErSaveBtnAndYespop("Click On Save Btn" ,"Save Yes Pop");
			
			String ERUHID = Registration.getUHIDOfPatient();
			System.out.println("Patient Registration Id is: " + ERUHID);

			String emergencyNo = Registration.getEmergencyNoOfPatient();
			System.out.println("Emergency No is: " + emergencyNo);
			CommanUtill.capturedERNO = emergencyNo;

			String mlcNo = Registration.getMLCNoOfPatient();
			System.out.println("MLC No is: " + mlcNo);
			
			Registration.ClickOnOkAfterSaveBtn("Click After Save Ok Pop");
			Registration.YesprintWristBandPop("Yes Print print Wrist Band");	

}
		
   }
