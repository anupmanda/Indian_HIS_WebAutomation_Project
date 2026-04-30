/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Nursing_Notes;
import com.test.emergency.page.EndorsementToolPage;
import com.test.emergency.page.Er_OrderPage;
import com.test.emergency.page.Er_PatientVitalPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 24-Apr-2026
 */
public class TC_033_ER_Order_EndorsementToolTest extends NURSING_Nursing_Nursing_Notes {

	EndorsementToolPage Endorsement_Tool = new EndorsementToolPage();
	Er_OrderPage ER_Order = new Er_OrderPage();
    NURSING_Nursing_Nursing_Notes net = new NURSING_Nursing_Nursing_Notes();
	Er_PatientVitalPage Patient_Vital = new Er_PatientVitalPage();

	private final String SheetName_Er = "ER_Endorsement_Tool";
	private final String sheetName = "Er_Patient_Vitals"; 

	@DataProvider(name = "EmergencyN_NotesDataProvider")
	public Object[][]getErData() throws IOException{
		System.out.println("=========Sheet Name_01: " + SheetName_Er + "==========");
		return ExcelSheetDataProvider.getExcelData(SheetName_Er);
	}

	@Test(dataProvider = "EmergencyN_NotesDataProvider" ,  priority = 1 ,enabled = true)
	public void SelectOccupiedPatientInRightTab(String Facility, String Station , String Shift_Drp , String Diagnosis_Text , String Drug_Allergies_Value_Drp , 
			String Food_Allergies_Value_Drp , String Other_Allergies_Value_Drp , String Allergy_Reaction_Drp , String Enter_Since_Text , 
			String Since_Drp , String Allergy_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Tool","Emergency Endorsement Test Funcility");

		Endorsement_Tool.selectByFacilityDropdown(Facility);
		Endorsement_Tool.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Endorsement_Tool.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.ErSearchPatient("ER No" , "1508806");
		ER_Order.SearchAndClickTopGreenPatient();
		
	}

	@Test(dataProvider = "EmergencyN_NotesDataProvider" , priority = 2 ,enabled = true)
	public void NurseNotesEndorsementTool(String Facility, String Station , String Shift_Drp , String Diagnosis_Text , String Drug_Allergies_Value_Drp , 
			String Food_Allergies_Value_Drp , String Other_Allergies_Value_Drp , String Allergy_Reaction_Drp , String Enter_Since_Text , 
			String Since_Drp , String Allergy_Remarks) 
			throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Tool","Emergency Endorsement Test Funcility");

		Endorsement_Tool.ClickOnNursNotesBtn("Click On Nurse Notes Button");
		Endorsement_Tool.ClickOnEndorsementToolBtn("Click On Endorsement Tool Btn");
		
		Endorsement_Tool.SelectByShiftDrp(Shift_Drp);
		Endorsement_Tool.EnterDiagnosisText(Diagnosis_Text);
	}
	
	@Test(dataProvider = "EmergencyN_NotesDataProvider" , priority = 3 ,enabled = true)
	public void AllergiesEndorsementTool(String Facility, String Station , String Shift_Drp , String Diagnosis_Text , String Drug_Allergies_Value_Drp , 
			String Food_Allergies_Value_Drp , String Other_Allergies_Value_Drp , String Allergy_Reaction_Drp , String Enter_Since_Text , 
			String Since_Drp , String Allergy_Remarks) 
			throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Tool Allergies"," Emergency Endorsement Allergies Test Funcility");

		Endorsement_Tool.ClickOnAllergyPlushBtn("Click On Allergy Plush Btn");
		Thread.sleep(1000);
		
		//Endorsement_Tool.DrugRadioBtn("Click On Drug Radio Button");
		//Endorsement_Tool.SelectByAllergiesDrp(Drug_Allergies_Value_Drp);
		
		//Endorsement_Tool.FoodRadioBtn("Click On Food Radio Button");
		//Endorsement_Tool.SelectByAllergiesDrp(Food_Allergies_Value_Drp);
		
		Endorsement_Tool.OtherRadioBtn("Click On Other Radio Button");
		Endorsement_Tool.SelectByAllergiesDrp(Other_Allergies_Value_Drp);
		
		Endorsement_Tool.SelectByAllergyReactionDrp(Allergy_Reaction_Drp);
		Endorsement_Tool.SelectByAllergySinceDrp(Enter_Since_Text , Since_Drp);
		Endorsement_Tool.SeverityModerateRadioBtn("Click On Severity Moderate Radio Button");
		
		Endorsement_Tool.SourceInformedRadioBtn("Click On Source Informed Radio Btn");
		Endorsement_Tool.AddRowAllergiesBtn("Click On ADD Row Plush Btn");
		
		Endorsement_Tool.SelectAllergyStatusAndRemarksInSubTable(1 , "Anup");
		Endorsement_Tool.EnterAllergyRemaksText(Allergy_Remarks);
		Endorsement_Tool.ClickOnSaveAllergyBtn("Click on Allergy Save Btn");
		Thread.sleep(1500);
		
		Endorsement_Tool.CloseAllergyPop1 ("Click On Allergy Pop");
	}
	
	@Test( priority = 4 ,enabled = true)
	public void IdentificationBackgroundAndCheckBoxDetails() 
			throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Identification Background","Emergency Endorsement Identification Background Test Funcility");
		
		Endorsement_Tool.IDBandWithCorrectNameUHIDNo("No");
		Endorsement_Tool.VulnerableCheckBox("Click On Vulnerable Check Box");
		Endorsement_Tool.InfectiousCheckBox("Click On Infectious Check Box");
		
		Endorsement_Tool.ReviewedPastMedicalHistoryAndClose("Click On Past Medical History" , "Close Reviewed Histry Pop");
		Endorsement_Tool.ReviewedPastSurgicalHistoryAndClose("Click On Past Surgical History" , "Close Reviewed Histry Pop");
		//Endorsement_Tool.ReviewedOBGHistoryAndClose("Click On OBG History" ,"Close Reviewed Histry Pop");	
	}
	@Test( priority = 5 ,enabled = true)
	public void DeleteChiefComplaintsTest() 
			throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Already Save Chief Complaints Delete"," Emergency Already Save Chief Complaints Delete Test Funcility");
		
		Endorsement_Tool.ClickOnChiefComplaintsPlushBtn("Click On Plush Icon In Chief Complaints");
		Endorsement_Tool.DeleteChiefComplaintsPop("Delete Chief Complaints In Sub Table ");
		Thread.sleep(1200);
		Endorsement_Tool.SaveChiefComplaintsBtn("Click On Save Btn");
		
	}
	@Test( priority = 6 ,enabled = true)
	public void ChiefComplaintsTest() 
			throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Chief Complaints"," Emergency Endorsement Chief Complaints Test Funcility");
		
		//Endorsement_Tool.ClickOnChiefComplaintsPlushBtn("Click On Plush Icon In Chief Complaints");
		Endorsement_Tool.ClickOnAddRowChiefComplaints("Click On Add Row Chief Complaints");
		

		Endorsement_Tool.selectChiefComplaintDescriptionDrp("a" , "Heartburn");
		//Endorsement_Tool.selectChiefComplaintDescriptionDrp("hea", "a headache");
		
		Endorsement_Tool.ChiefComplaintAcuityCharacteristics(1 , "Characteristics Text ");
		Endorsement_Tool.ChiefComplaintDuration_DurationDrp("4" , 2);
		
		Endorsement_Tool.ChiefComplaint_AggravatingFactors_RelievingFactors_MedsTaken("Aggravating Factors Text " ,
				"Relieving Factors Text" , "Meds Taken Text");
		
		Thread.sleep(1000);
		Endorsement_Tool.ChiefComplaintEffectDrp("Worsening");
		//Endorsement_Tool.ChiefComplaintStatusDrp_Remarks(1 ,"Remarks Anup");
		
		Endorsement_Tool.SaveChiefComplaintsBtn("Click On Save Btn");
		Endorsement_Tool.CloseChiefComplaintsPop("Close Chief Complaints Pop");	
	}
	
	@Test( priority = 7 ,enabled = true)
	public void PatientPastInformationTest() 
			throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Patient Past Information"," Emergency Endorsement Patient Past Information Test Funcility");
		
		Endorsement_Tool.HospitalSurgeryInformationDetails("28-04-2026" , "4" , "ABCD", "30-04-2026");
	}
//============================ Patient Vitals ========================	
	
	@DataProvider(name = "PatientVitalsDataProvider")
	public Object[][] getVitalsData() throws IOException {
		System.out.println("=========Sheet Name_02: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}
	
	@Test(dataProvider = "PatientVitalsDataProvider" , priority = 8 ,enabled = true)	
	public void EnterERNoVitalMappingTest(String facility_drp, String Station_drp , String Search_In_Mobile_Number , String Search_In_Name ,
			String Add_Favorite_Vitals_Name , String Enter_ER_Number )
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Enter Vital Value ", "Enter Vitals Value In Er Number Test Funcility.");
		
		Endorsement_Tool.PlushEndorsementToolVitalsIcon("Click On Plush Vitals Icon");
		Patient_Vital.AddVitalsValueButton("Click On Add Plush Icon");
		
		Patient_Vital.enterVitalValue("Head Circumference", "22");
		Thread.sleep(1000);
		Patient_Vital.enterVitalValue("Height", "100");
		Thread.sleep(1000);
		
		Patient_Vital.enterVitalValue("Pain Score", "12");
		Thread.sleep(1000);
		Patient_Vital.enterVitalValue("Blood Sugar(F)", "70");
		Thread.sleep(1000);
		
		Patient_Vital.enterVitalValue("Blood Sugar(R)", "90");
		Thread.sleep(1000);
		Patient_Vital.enterVitalValue("Remarks", "www");
		Thread.sleep(1000);
		
		Patient_Vital.handleDynamicPopup("Pop Message");
		Endorsement_Tool.SaveVitalsPop("Click on save Button");
		Endorsement_Tool.CopyVitalsPop("Click on Copy Icon Pop");
		
		Endorsement_Tool.CloseVitalsPop("Close Vitals Popup");
	}
	
	@Test( priority = 9 , enabled = true)
	public void EndorsementToolPainScoreTest() throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Pain Score And Skin Intact etc Info",
				" Emergency Endorsement Pain Score And Skin Intact etc InfoTest Funcility");
		
		Endorsement_Tool.EnterEndorsementTool_PainScore_Location_Edema_Yes_Mentionthe_Site("10" , "Noida" , "No", "Yes");
		Endorsement_Tool.EnterEndorsementTool_SkinIntact_PressureUlcer_YesInsideOutside_StatusPressureUlcer_Remarks("Yes" , "No" , "Outside" ,"Healing",
				"Anup Remaks");
	}
	
	@Test( priority = 10 , enabled = true)
	public void EndorsementToolCentralNervousSystemTest() throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Central Nervous System Info",
				" Emergency Endorsement Central Nervous System Info Test Funcility");
		
		Endorsement_Tool.CentralNervousSystemInformationDetails("Disoriented" , "Yes" , "To Speech", "Inappropriate Sound" ,
				"Abnormal Flexion to Pain");	
	}
	
	@Test( priority = 11 , enabled = true)
	public void EndorsementToolAnyOtherInstruction_LoginPasswordTest() throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Endorsement Any Other Instruction Login Password",
				" Emergency Endorsement Any Other Instruction Login PasswordTest Funcility");
		
		Endorsement_Tool.AnyOtherInstructionDetails("Shiv" , "Yes" , "Hari" , "Good");
		Endorsement_Tool.RecommendationsGeneralconditionDrp("stable");
		Endorsement_Tool.RecommendationsLogin_Password("LAXMI2" , "Admin@123" , "Save Ok Button");
		
		Endorsement_Tool.SaveEndorsementToolBtn("Save Endorsement Tool Page");
		Patient_Vital.handleDynamicPopup("Pop Message");
		Endorsement_Tool.HandoverVerifyYesPop("Click On Verify Btn" , "Handover verification Yes Pop");
	}
	
	
	
	
	
	
	
	
	
	//===================== Asutosh Nursing Moduke Code 27-04-2026 ==========================
	
	private final String SheetName = "Endorsement_Tool";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		System.out.println("=========Sheet Name_02: " + SheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3 ,enabled = false)
	public void NursingEndorsementTool(String Facility, String Station, String Shift, String Diagnosis, String AllergyRemarks, 
			String VitalName, String LoginName, String LoginPass) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Notes_Template_EndorsementTool","Nursing_Notes_Template_EndorsementTool");


		net.EmergrncyEndorsementToolFinal(Facility, Station, Shift, Diagnosis, AllergyRemarks, VitalName, LoginName, LoginPass);

		//	net.NursingEndorsementTool(Facility, Station, Shift, Diagnosis, AllergyRemarks, VitalName);
	}


}
