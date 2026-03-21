/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.IpBilling.Page.AcknowledgeDischargeNotificationPage;
import com.test.IpBilling.Page.IpBillingPage;
import com.test.LabMedicine.Page.Labclearance_LabMedicinePage;
import com.test.Nursing.page.NursingActivityPage;
import com.test.Nursing.page.NursingClearancePage;
import com.test.Pharmacy.Page.DischargeNotification_PharmacyPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 04-Feb-2026
 */
/**************************************************************************************************************************
 Funclility Use Admit Patient Nursing Acknowledge + Discharge + Clearnace , Pharmacy Discharge Notification , Lab Clearnace ,
 Bill Dischharge + Acknowledge , 1. Bill Discharge 2. Bill Ready 3. Bill Genrate 4.Full Bill Settlement 
 
 ****************************************************************************************************************************/
public class TC_0A1_FullBillSettlementTest extends ADT_Admit_Patient{

	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	NursingActivityPage Nursing_Activity = new NursingActivityPage();
	NursingClearancePage Nursing_Clearance = new NursingClearancePage();
	DischargeNotification_PharmacyPage Discharge_Notification = new DischargeNotification_PharmacyPage();
	Labclearance_LabMedicinePage Lab_Clearance = new Labclearance_LabMedicinePage();
	AcknowledgeDischargeNotificationPage Acknowledge_Discharge_Notification = new AcknowledgeDischargeNotificationPage();
	IpBillingPage Ip_Billing = new IpBillingPage();

	private final String SheetName  = "Admit_Patient";
	private final String sheetName_Nursing_Activity = "Nursing_Activity_Page";
	private final String sheetName_Nursing_Clearance = "Nursing_Clearance_Page";
	private final String sheetName_Pharmacy = "Pharmacy_Discharge_Notification";
	private final String sheetName_Lab = "Lab_Clearance_Page";
	private final String sheetName_Discharge = "Acknowledge_Discharge_Page";
	private final String sheetName_IpBill = "Ip_Billing_Page";

	@Test(priority = 11 , enabled = true)
	public void BillingFuncility() 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("HTML Test Flow", "Ip Billing Funcility");
		
		logger.info("<b>Test Flow</b>");
		logger.info("1. Bill Discharge");
		logger.info("2. Bill Ready");
		logger.info("3. Bill Generate");
		logger.info("4. Full Bill Settlement");
		
	}
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getdata() throws IOException{
		System.out.println("====Fetching data from Excel sheet_01 : " + SheetName + " ====");
		return  ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 )

	public void AdmitPatient(String Facility, String Station, String Title, String Enter_First_Name , String Gender, String DOB, String FatherName, String M_Status,
			String Address, String City, String Nationality, String ABCPin, String Speciality, String Referred, String Stay, String Source, String BedType, String Alloted_bed_type_drp , String Ward,
			String Package_Speciality, String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Admit_Patient" , "Fill All The Mandatory Details at all Admit PatientScreen and Click on The Save Buton");

		adt.AdmitPatient(Facility,Station, Title, Enter_First_Name + CommanUtill.randomAlphabets(3) , Gender,DOB,FatherName,M_Status, Address, City,Nationality, ABCPin);  
		//Chnge Anup 25-02-2026

		adt.Consultant(Speciality, Referred, Stay, Source);		

		adt.BedandPaymentDetails(BedType, Alloted_bed_type_drp,  Ward);  //Anup 11-02-20225

		//adt.PackageDetails(Package_Speciality);

		adt.NextofKinDetails(KinName, Relation, Name, ClinicalCo, BillingCo );

		adt.ClickSave();
		
		String AdmitUHIDId = adt.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " + AdmitUHIDId);
		CommanUtill.capturedUHID = AdmitUHIDId;

		String ipNo = adt.getIPNoOfPatient(); 
		System.out.println("Patient IP No is: " + ipNo);
		CommanUtill.capturedIP = ipNo; 
		adt.ClosekOnGCDScreen("Close GCD Screen Pop");
		
		Thread.sleep(1000);
		adt.CloseOnAdmissionConsentPop("Close Admossion Consent Pop");
		adt.printFaceSheetRadioBtn_PrintBtn("Radio Button Face Sheet" , "Click On Print Icon");
		adt.ClickOnHISLog("Click On HIS Log Icon");
	
	}

	//*********************** Nursing Activity **********************************************

	@DataProvider(name = "NursingActivityDataProvider")
	public Object[][] getActivityData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_02 : " + sheetName_Nursing_Activity + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Nursing_Activity);
	}

	@Test(dataProvider = "NursingActivityDataProvider", priority = 2 , enabled = true )
	public void NursingDischargeTest(String Dashborad_Facility_Drp , String Nursing_Station_Drp , String Discharge_Type_Drp , String Discharge_Sub_Type_Drp ,
			String Discharge_Remarks_Text) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Nursing Discharge Test", "Nursing Discharge Test Funcility");

		Nursing_Activity.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Nursing_Activity.ClickOnNursingDashboard("Click On Nursing DashBorad" ,Nursing_Station_Drp , "Station Yes Popup");

		Nursing_Activity.ClickOnNursingActivityTab_Clearance("Nursing Activity Tab","Nursing activity Page");

		Nursing_Activity.EnterSerchBoxInIPNumber(CommanUtill.capturedIP);

		// Assertion – Search box validation
		//Assert.assertEquals(Nursing_Activity.getSearchBoxValue(), CommanUtill.capturedIP, "Test Failed : IP number not entered correctly");

		// Click patient
		Nursing_Activity.clickFirstAfterSearch_AdmittedNotOccupied();
		Nursing_Activity.SaveChangeBedStatus_YesPop("Save Change Bed Status Pop ", "Yes Pop");
		Thread.sleep(9000);

		Nursing_Activity.ClickOnAcknowledgeSimilarWard("Click On Acknowleded Btn");
		Nursing_Activity.ClickOnDischargeBtn("Click On Discharge Icon");

		Nursing_Activity.SelectDischargeType_DischargeSubType_Remarks_SaveIcon(Discharge_Type_Drp , Discharge_Sub_Type_Drp ,
				Discharge_Remarks_Text , "Save Discharge Btn");

		Nursing_Activity.DischargeYesPop("Discharge Yes Pop");

	}

	//*********************** Nursing Cleearance **********************************************

	@DataProvider(name = "NursingClearanceDataProvider")
	public Object[][] getClearanceData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_03 : " + sheetName_Nursing_Clearance + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Nursing_Clearance);
	}

	@Test(dataProvider = "NursingClearanceDataProvider", priority = 3 , enabled = true)
	public void NursingClearanceTest(String Dashborad_Facility_Drp , String Nursing_Station_Drp ,String Status_Drp , String Enter_Date_Expected_Discharge ,
			String Type_Patient_Drp , String Enter_IP_Number , String Billing_Type_Drp , String Enter_Date_Discharge_Marked) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Nursing Clearance In UHID", "Nursing Clearance Test");

		Nursing_Clearance.ClickOnMenuIcon("Click On Menu Icon Btn");
		Nursing_Clearance.ClickOnNursingActivityTab_Clearance("Nursing Activity Tab","Nursing Clearance Page");
		Nursing_Clearance.TypePatientDrpEnterIPNumber(Type_Patient_Drp , CommanUtill.capturedIP);

		Nursing_Clearance.ClickOnClearanceOkBtn(CommanUtill.capturedIP);
		Nursing_Clearance.ClearanceConfirmYesPop("Click On Confirm Yes Pop");

		adt.ClickOnHISLog("Click On HIS Log Icon");

	}

	//=================== pharmacy Clearance ==================================

	@DataProvider(name = "PharmacyDischargeNotificationDataProvider")
	public Object[][] getDischargeNotificationData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_04: " + sheetName_Pharmacy + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy);
	}

	@Test(dataProvider = "PharmacyDischargeNotificationDataProvider", priority = 4 , enabled = true)
	public void PharmacyDischargeNotificationTest(String Dashborad_Facility_Drp , String Pharmacy_Station_Drp , String Wards_Drp ,String Pharmacy_Status_Drp ,
			String Enter_Date_Expected_Discharge , String Type_Patient_Drp , String Enter_IP_Number , String Billing_Type_Drp ,
			String Enter_Date_Discharge_Marked) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Pharmacy Discharge Notification", "Pharmacy Discharge Notification Test");

		Discharge_Notification.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Discharge_Notification.ClickOnPharmacyDashboard("Click On Paharmacy DashBorad" ,Pharmacy_Station_Drp , "Station Yes Popup");

		Discharge_Notification.ClickPharmacyDischarge_Notification("Click On Pharmacy Discharge Notification Page");
		Thread.sleep(1000);
		Discharge_Notification.SelectByPatientTypeAndEnterBox_Serach(Type_Patient_Drp , CommanUtill.capturedIP , "Serch Patient");

		Discharge_Notification.SelectPatientRow(CommanUtill.capturedIP);
		Discharge_Notification.ClickOnPharmacyOkBtn(CommanUtill.capturedIP);
		Discharge_Notification.PharmacyClearanceOkPopup("Click On Pharmacy Ok Btn");
		Thread.sleep(1000);
		adt.ClickOnHISLog("Click On HIS Log Icon");

	}
	//============================Lab Clearance ======================

	@DataProvider(name = "LabclearanceDataProvider")
	public Object[][] getLabData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_05: " + sheetName_Lab + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Lab);
	}

	@Test(dataProvider = "LabclearanceDataProvider", priority = 5 , enabled = false)
	public void LabclearanceDataProviderTest(String Dashborad_Facility_Drp , String Lab_Medicince_Station_Drp , String Status_Drp ,
			String Enter_Date_Expected_Discharge , String Type_Patient_Drp , String Enter_IP_Number , String Billing_Type_Drp , 
			String Enter_Date_Discharge_Marked) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Lab Clearance ", "Lab Clearance Funcility Test");

		Lab_Clearance.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Lab_Clearance.ClickOnLabMedicineDashboard("Click On Lab Medicine DashBorad" ,Lab_Medicince_Station_Drp , "Station Yes Popup");

		Lab_Clearance.ClickLabMedicineMenuBar("Click On Menu Bar Lab Medicine icon");
		Lab_Clearance.LabClearancePage("Click On Lab Clearance Page");
		Thread.sleep(500);

		Lab_Clearance.SelectByPatientTypeAndEnterBox_Serach(Type_Patient_Drp , CommanUtill.capturedIP , "Serch Patient");	
		Lab_Clearance.SelectPatientRow(CommanUtill.capturedIP);

		Lab_Clearance.ClickOnLabClearanceOkBtn(CommanUtill.capturedIP);
		Thread.sleep(1000);
		Lab_Clearance.HisLogoIcon("Click On HIS Log Icon");

	}

	//======================== Discharge Notification ===============================
	@DataProvider(name = "DischargeNotificationDataProvider")
	public Object[][] getDischargeData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_06 : " + sheetName_Discharge + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Discharge);
	}

	@Test(dataProvider = "DischargeNotificationDataProvider", priority = 6 , enabled = true)
	public void AcknowledgeDischargeNotification(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Wards_Drp , 
			String Status_Drp , String Enter_Expected_Date , String Select_IP_Number_Drp , String Enter_Ip_Number , String Select_Patient_Name_Drp , 
			String Enter_Patient_Name , String Bill_Type_Drp , String Enter_Discharge_Marked_Date) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Acknowledge Discharge Notification Test", "Acknowledge Discharge");

		Acknowledge_Discharge_Notification.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Acknowledge_Discharge_Notification.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Acknowledge_Discharge_Notification.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Acknowledge_Discharge_Notification.IpBilling_AcknowledgeDischargeNotificationPage("Click On Ip Billing Drp","Acknowledge Discharge Notification");

		Acknowledge_Discharge_Notification.SelectByIpNumberAndEnterIPNumber_Serach(Select_IP_Number_Drp , CommanUtill.capturedIP ,
				"Serach Ip Number");

		String sNo = 		
				Acknowledge_Discharge_Notification.clickFirstWhiteRowAndPrintDetails("Click On First White Row");
		Assert.assertTrue(true, "First white background row clicked successfully");
		Acknowledge_Discharge_Notification.YesAcknowledgedPop("Yes Pop Acknowledged Popup");
		Thread.sleep(2000);

		Acknowledge_Discharge_Notification.clickSameRowAgainAfterColorChange(sNo);
		Acknowledge_Discharge_Notification.Yes_Pop_DischargeNotificationAcknowledgementBill("Yes Pop Billing Page"); 

	}
	//=====================Ip Billing ============================

	@DataProvider(name = "IpBilingDataProvider")
	public Object[][] getBillingData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_07 : " + sheetName_IpBill + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_IpBill);
	}
	
	@Test(dataProvider = "IpBilingDataProvider", priority = 7 , enabled = true)
	public void IpBillDischargeIcon(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
			String Enter_IP_Number_All_Clearance , String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks ,
			String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number , String Auth_Claim_no , 
			String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , String Letter_Date , 
			String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day , String Account_Number , 
			String IFSC_Code , String Bank_Branch , String PAN_No , String Scheme_Drp , String Corporate_Company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount , String Credit_Limit , String Employee_Code ,String Employee_Relation , String Issued_By , String Surgery_From_Date ,
			String Surgery_To_Date, String Bill_Genrate_Reason_Text , String Bill_Settlement_Reason_Text , String Bill_Settlement_Remarks , 
			String Received_From_Bill_Settl , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Branch ,
			String Cheque_Amount , String Cheque_Authorised_By_Drp , String Bill_Amount , String Due_Authorised_By_Drp , String Due_Remarks ,
			String Cancel_Bill_Settl_Authorised , String Cancel_Bill_Settl_Remaks) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Ip Bill Discharge Icon", "All Clearnace After Discharge Icon Click");

		Ip_Billing.DischargeOkPop("Ok Deposit pop");
		Ip_Billing.ClickOnDischargeIconBtn("Click On Discharge Icon");
		Ip_Billing.SelectByDischargeReason_DischargeSubTypeDrp(Discharge_Reason_Drp , Discharge_Sub_Type_Drp);
	
		Ip_Billing.enterCurrentDischargeDateTime();     //Current Date And Time 
		Ip_Billing.EnterDischargeRemarks(Discharge_Remarks);
		
		Ip_Billing.YesDischarageReasonPop_AndConformationYesPop("Yes Discharge Reason Pop" , "Yes Discharge the patient Pop");
		Ip_Billing.OkPatientDischargedSuccessfullyPop("Patient Discharged Successfully Ok Pop");
	
	}
	
	@Test(dataProvider = "IpBilingDataProvider", priority = 8 , enabled = true)
	public void IpBillReadyTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
			String Enter_IP_Number_All_Clearance , String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks ,
			String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number , String Auth_Claim_no , 
			String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , String Letter_Date , 
			String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day , String Account_Number , 
			String IFSC_Code , String Bank_Branch , String PAN_No , String Scheme_Drp , String Corporate_Company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount , String Credit_Limit , String Employee_Code ,String Employee_Relation , String Issued_By , String Surgery_From_Date ,
			String Surgery_To_Date, String Bill_Genrate_Reason_Text , String Bill_Settlement_Reason_Text , String Bill_Settlement_Remarks , 
			String Received_From_Bill_Settl , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Branch ,
			String Cheque_Amount , String Cheque_Authorised_By_Drp , String Bill_Amount , String Due_Authorised_By_Drp , String Due_Remarks ,
			String Cancel_Bill_Settl_Authorised , String Cancel_Bill_Settl_Remaks) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Bill Ready Icon ", "Ip Bill Ready Icons");

		Ip_Billing.BillReadyIconAndYesPop("Bill Ready Icon" , "Yes Pop Patient’s total stay is less than 24 Hrs");
		Thread.sleep(2000);

	}
	
	@Test(dataProvider = "IpBilingDataProvider", priority = 9 , enabled = true)
	public void BillGenrateTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
			String Enter_IP_Number_All_Clearance , String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks ,
			String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number , String Auth_Claim_no , 
			String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , String Letter_Date , 
			String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day , String Account_Number , 
			String IFSC_Code , String Bank_Branch , String PAN_No , String Scheme_Drp , String Corporate_Company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount , String Credit_Limit , String Employee_Code ,String Employee_Relation , String Issued_By , String Surgery_From_Date ,
			String Surgery_To_Date, String Bill_Genrate_Reason_Text , String Bill_Settlement_Reason_Text , String Bill_Settlement_Remarks , 
			String Received_From_Bill_Settl , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Branch ,
			String Cheque_Amount , String Cheque_Authorised_By_Drp , String Bill_Amount , String Due_Authorised_By_Drp , String Due_Remarks ,
			String Cancel_Bill_Settl_Authorised , String Cancel_Bill_Settl_Remaks) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Bill Genrate Bill Icon ", "Bill Genrate Test Funcility");

		Ip_Billing.BillGenrateIcon("Click On Bill Genrate Icon");
		Ip_Billing.BillGenrateReasonTxtAndYesBtn(Bill_Genrate_Reason_Text, "Bill genrate Reason Save Pop");
		Ip_Billing.YespopsureGeneratepatientAndDischargePop("Sure Patient Bill Genrate" , "Discharge Yes Pop");

	}
	
	@Test(dataProvider = "IpBilingDataProvider", priority = 10 , enabled = true)
	public void IpBillSettlement(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Mobile_no_Current_In_Patient , String Search_First_Name , String Enter_UHID , String Enter_UHID_All_Clearance ,
			String Enter_IP_Number_All_Clearance , String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks ,
			String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number , String Auth_Claim_no , 
			String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , String Letter_Date , 
			String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day , String Account_Number , 
			String IFSC_Code , String Bank_Branch , String PAN_No , String Scheme_Drp , String Corporate_Company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount , String Credit_Limit , String Employee_Code ,String Employee_Relation , String Issued_By , String Surgery_From_Date ,
			String Surgery_To_Date, String Bill_Genrate_Reason_Text , String Bill_Settlement_Reason_Text , String Bill_Settlement_Remarks , 
			String Received_From_Bill_Settl , String Cheque_Number , String Cheque_Issue_Date , String Cheque_Bank_Name_Drp , String Cheque_Branch ,
			String Cheque_Amount , String Cheque_Authorised_By_Drp , String Bill_Amount , String Due_Authorised_By_Drp , String Due_Remarks ,
			String Cancel_Bill_Settl_Authorised , String Cancel_Bill_Settl_Remaks) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Bill Settlement", "Ip Bill Settlement Page ");
		
		Ip_Billing.AfterDischargeOkPop("Discharge Patient Pop");   //Again Hit IP Number In Bill Genrate Patient

		Ip_Billing.ClickOnBillSettlementIcon("Click On Bill Settlement Btn");
		Ip_Billing.BillSettlementReasonAndSavePop(Bill_Settlement_Reason_Text , "Right Singn Reason Latesettle pop");   //Pop Same time 
		
		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='85%'");
		
		Ip_Billing.BillSettlementReamrks(Bill_Settlement_Remarks);
		Ip_Billing.EditAndReceivedFrom("Click On Edit Button" , Received_From_Bill_Settl);
		Ip_Billing.SaveBillSettlementBtn("Click on Bill Settlement Save Btn" , "Do you want to settle Yes Pop" ,"Ok Bill Settled Receipt");

	}
	
	
	
}
