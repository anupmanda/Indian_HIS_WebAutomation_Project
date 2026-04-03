/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.AmbulanceMRDChargesPage;
import com.test.emergency.page.ErBillingPage;
import com.test.emergency.page.Er_Miscellaneous_ChargesPage;
import com.test.emergency.page.Er_RegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 27-Mar-2026
 */
public class TC_010_Reg_Misc_AmbulanceCharges_BillDetails_Discharge_BillSettledTest extends Er_RegistrationPage{

	Er_RegistrationPage Registration = new Er_RegistrationPage();
	ErBillingPage Er_Billing = new ErBillingPage();
	Er_Miscellaneous_ChargesPage MiscellaneousCharges = new Er_Miscellaneous_ChargesPage();
	AmbulanceMRDChargesPage AmbulanceMRDCharges = new AmbulanceMRDChargesPage();

	private final String sheetName = "ER_Registration_Page"; 
	private final String sheetName_Er_Billing = "Er_Billing_Page";
	private final String sheetName_Miscellaneous = "Er_MiscellaneousCharges_Page";
	private final String sheetName_Ambulance = "Er_AmbulanceCharges_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====Sheet Name_01: " + sheetName + "======");
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

	@Test(priority = 2 ,enabled = true)
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

		Registration.ClickMenuIcon("Click On Menu Btn");
	}
	//===================== Miscellaneous Charges ======================	
	@DataProvider(name = "MiscellaneousChargesDataProvider")
	public Object[][] getMiscellaneousChargesData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_02: " + sheetName_Miscellaneous + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Miscellaneous);
	}

	@Test(dataProvider = "MiscellaneousChargesDataProvider", priority = 3 , enabled = true)
	public void EnterUHID_IpNumber_MiscellaneousCharges(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Enter_Uhid , 
			String  Enter_Ip_Number ,String From_Date , String To_Date, String Service_Drp , String  Description_Drp , String Amount_enter ,
			String Quenty_Text , String Select_Doctor_Name_Drp) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest(" Miscellaneous Charges On Ip Number", " Ip Bill Miscellaneous Charges Not Dischage Patient");

		MiscellaneousCharges.MiscellaneousCharges_page("Click On Er Billing Drp","Miscellanceous Charrges Page");
		MiscellaneousCharges.EnterIpNumberInMiscellanceCherges(CommanUtill.capturedERNO);

		MiscellaneousCharges.SelectByService_DescriptionDrp(Service_Drp , Description_Drp);
		MiscellaneousCharges.SelectByPatientTypeDrp();
		MiscellaneousCharges.enterAmountAndQuantity(Amount_enter , Quenty_Text);

		MiscellaneousCharges.SelectByDoctorNameDrp(Select_Doctor_Name_Drp);
		MiscellaneousCharges.PrintPostingDateAndTime(); //   Post Date And Time 

		MiscellaneousCharges.clickOnPlushIcon("Click on Plush Icon");
		MiscellaneousCharges.ClickOnsavebtnIcon_YesPop("Click on Save Btn") ;

		Thread.sleep(5000);
		Registration.ClickMenuIcon("Click On Menu Btn");
	}
	
	@DataProvider(name = "AmbulanceChargesDataProvider")
	public Object[][] getAmbulanceChargesData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet_03 : " + sheetName_Ambulance + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Ambulance);
	}
	
	@Test(dataProvider = "AmbulanceChargesDataProvider", priority = 4 , enabled = true)
	public void AmbulanceMRDChargesTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Enter_Uhid , String Er_Number , String Name_Search_Medical_Record_Charges , String Item_Quenty , String Remark 
			) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Ambulance MRD Charges ", "Er Ambulance MRD Charges Search In Table Test Funcility");
		
		AmbulanceMRDCharges.AmbulanceMRDCharges("Click On Er Billing Drp","Ambulance MRD Charrges Page");
		AmbulanceMRDCharges.EnterIpNumberInAmbulanceMRDCharges(CommanUtill.capturedERNO);
		AmbulanceMRDCharges.ShowInAllMedicalRecordChargesInTable("All Medical Recod Charges");   //Only Check Record In Table
		
		//AmbulanceMRDCharges.FindMedicalRecordChargesName(Name_Search_Medical_Record_Charges);
		AmbulanceMRDCharges.selectMedicalRecordCharges("Select Medical Recod Charges");
		AmbulanceMRDCharges.EnterItemQuentyAndReamrks(Item_Quenty , Remark + CommanUtill.randomDigits(3));
		
		AmbulanceMRDCharges.saveAmbulanceMRDchargesBtn("Save Ambulance MRD charges Btn" ,"Save Ambulance charges Yes Pop");	
		Thread.sleep(1500);
		Registration.ClickMenuIcon("Click On Menu Btn");
	}

	//===================== Er Billing 1. Bill Details 2. Discharged 3. Settlement  ======================	

	@DataProvider(name = "BillingDataProvider")
	public Object[][] getBillData() throws IOException {
		System.out.println("====Sheet Name_04 : " + sheetName_Er_Billing + "======");
		return ExcelSheetDataProvider.getExcelData(sheetName_Er_Billing);
	}

	@Test(dataProvider = "BillingDataProvider" , priority = 5 ,enabled = true)	
	public void EnterErNumberAndUHID(String facility_drp , String Station_drp , String Search_Frome_Date , String Search_To_Date , 
			String Enter_Er_Number , String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number ,
			String Auth_Claim_no , String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , 
			String Letter_Date , String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day ,
			String Account_Number , String IFSC_Code , String Bank_Branch ,String Corporate_company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount, String Credit_Limit , String Employee_Code, String Employee_Relation , String Issued_By , 
			String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks
			)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Enter Er Number", "Enter Er NumberS Test Funcility");

		Er_Billing.clickErBillingPage("Er Billing Button in side Icon","Er BillingS Page");
		Er_Billing.EnterErNumber(CommanUtill.capturedERNO);
		Thread.sleep(1000);
	}
	@Test(priority = 6 ,enabled = true)
	public void BillDetailsDetails()
			throws IOException, InvalidFormatException, InterruptedException{
		logger = extent.createTest("Bill Details ", "Bill Details Test Funcility");

		Er_Billing.BillDetailsIcon("Click On Bill Details Icon");
		Thread.sleep(2000);
		Er_Billing.clickAllDisplayAndServiceRows("Bill Details Service");
		Er_Billing.BillDetailsClosePop("Close Bill Details Pop");
		Thread.sleep(1000);
	}

	@Test(dataProvider = "BillingDataProvider", priority = 7 ,enabled = true)
	public void DischargeIconTest(String facility_drp , String Station_drp , String Search_Frome_Date , String Search_To_Date , 
			String Enter_Er_Number , String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number ,
			String Auth_Claim_no , String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , 
			String Letter_Date , String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day ,
			String Account_Number , String IFSC_Code , String Bank_Branch ,String Corporate_company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount, String Credit_Limit , String Employee_Code, String Employee_Relation , String Issued_By , 
			String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks
			)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Patient Discharge Icon", "Patent Discharge Test Funcility");

		Er_Billing.ClickOnDischargeIconBtn("Click On Discharge Icon");
		Er_Billing.SelectByDischargeReason_DischargeSubTypeDrp(Discharge_Reason_Drp , Discharge_Sub_Type_Drp);
		Er_Billing.EnterDischargeRemarks(Discharge_Remarks);
		Er_Billing.DischargeOkBtn("ok Discharge the Icon Pop" ,"Patient Discharge Yes Pop");
		Thread.sleep(1000);
	}

	@Test(priority = 8 ,enabled = true)
	public void BillSettlementReceiptInChequeTest() throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Full Bill Settlement Cheque ", "Bill Settlement Cheque");

		Er_Billing.ClickOnSettlementBtn("Click On Bill Settlement Btn");

		Er_Billing.ClickOnChequeAndChequeNo_IssueDateBankName_BranchName("Click On Cheque Btn" ,"123456","26-03-2026" ,
				"ANDHRA BANK" ,"Noida");
		Er_Billing.SelectByAuthorisedInCheque("Gurdarshan Singh");
		Er_Billing.PrintBillSettledAmountInCheque("Bill Settled Cheque Amount");

		Er_Billing.ClickOnReceiptBtn("Click On Bill Receipt Btn");
		Er_Billing.YesBillSettlePop("Yes Bill Settle Pop");
		Thread.sleep(1500);
		Er_Billing.OkBillSettledReceiptNo("Settled Bill Receipt No");
	}


}
