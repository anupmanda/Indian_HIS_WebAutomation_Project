/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_DoctorNotesPage;
import com.test.emergency.page.Er_OrderPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 06-May-2026
 */
public class TC_037_Er_DoctorNotesTest extends Er_DoctorNotesPage {

	Er_DoctorNotesPage Doctor_Notes = new Er_DoctorNotesPage();
	Er_OrderPage ER_Order = new Er_OrderPage();

	private final String sheet_Name = "Er_Doctor_Notes_Page"; 

	@DataProvider(name = "DoctorNotesDataProvider")
	public Object[][]getData() throws IOException{
		System.out.println("=========Sheet Name_01: " + sheet_Name + "==========");
		return ExcelSheetDataProvider.getExcelData(sheet_Name);
	}

	@Test(dataProvider = "DoctorNotesDataProvider" ,  priority = 1 ,enabled = true)
	public void SelectOccupiedPatientInRightTab(String Facility, String Station, String Enter_Frome_Date , String Enter_To_Date , String Preoperative_Doctor_Drp ,
			String Observations_Text , String  Doctor_Refral_Speciality_Drp , String  Doctor_Refral_Doctor_Drp , String Doctor_Referral_Priority_Drp ,
			String Select_Notes_Style_Drp , String Doctor_Referral_Reason_Text , String Operative_Template_Drp , String Pre_OT_Template_Drp ,
			 String Physican_Template_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Select Er Patient","Emergency Select Er Patient Test Funcility");

		Doctor_Notes.selectByFacilityDropdown(Facility);
		Doctor_Notes.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Doctor_Notes.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.SearchAndClickTopGreenPatient();
	}

	@Test(dataProvider = "DoctorNotesDataProvider" , priority = 2 , enabled = true)
	public void ErDoctorNotesPreoperativeTest(String Facility, String Station, String Enter_Frome_Date , String Enter_To_Date , String Preoperative_Doctor_Drp ,
			String Observations_Text , String  Doctor_Refral_Speciality_Drp , String  Doctor_Refral_Doctor_Drp , String Doctor_Referral_Priority_Drp ,
			String Select_Notes_Style_Drp , String Doctor_Referral_Reason_Text , String Operative_Template_Drp , String Pre_OT_Template_Drp ,
			 String Physican_Template_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Doctor Notes Preoperative Test", "Emergency Doctor Notes Preoperative Test Funcility");

		Doctor_Notes.ClickOnDoctorNotesBtn("Click On Doctor Notes Button");
		Doctor_Notes.ClickOnPreoperativeNote("Click On Preoperative Btn");

		Doctor_Notes.PreoperativeFromDateSerach(Enter_Frome_Date);
		Doctor_Notes.PreoperativeToDateSerach(Enter_To_Date);
		Doctor_Notes.SeaechPreoperativeDateWise("Click On Search Button");

		Doctor_Notes.SelectByDoctorPreoperativeDrpAndObservations(Preoperative_Doctor_Drp , Observations_Text);
		Doctor_Notes.SavePreoperativeNotes(" Save Preoperative Notes Button");
		
		Doctor_Notes.SeaechPreoperativeDateWise("Click On Search Button");
	}

	@Test(dataProvider = "DoctorNotesDataProvider" , priority = 3 , enabled = true)
	public void ErDoctorReferralTest(String Facility, String Station, String Enter_Frome_Date , String Enter_To_Date , String Preoperative_Doctor_Drp ,
			String Observations_Text , String  Doctor_Refral_Speciality_Drp , String  Doctor_Refral_Doctor_Drp , String Doctor_Referral_Priority_Drp ,
			String Select_Notes_Style_Drp , String Doctor_Referral_Reason_Text , String Operative_Template_Drp , String Pre_OT_Template_Drp ,
			 String Physican_Template_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Doctor Referral Test", "Emergency Doctor Referral Test Funcility");

		Doctor_Notes.ClickOnDoctorsReferral("Click On Doctor Referral Btn");
		Doctor_Notes.ReferralFromDateSerach(Enter_Frome_Date);
		Doctor_Notes.ReferralToDateSerach(Enter_To_Date);

		Doctor_Notes.SeaechReferralDateWise("Click On Referral Doctor Search Button");

		Doctor_Notes.SelectRadioBtnInConsult("Select Consult Radio Btn");
		Doctor_Notes.DoctorReferral_SpecialityDrp_DoctorDrp_PriorityDrp_SelectNotesStyleDrp(4 , 15 , Doctor_Referral_Priority_Drp , 
				Select_Notes_Style_Drp);

		Doctor_Notes.ReasonDoctotReferralText(Doctor_Referral_Reason_Text + CommanUtill.randomAlphabets(3));
		Doctor_Notes.SaveReferralDoctorAndYesPop("Click On Save Referal Doctor" ,"save Refferal Request Popup ");

		//Delete Remaing 
	}

	@Test(dataProvider = "DoctorNotesDataProvider" , priority = 4 , enabled = true)
	public void ErOperativeNotesTest(String Facility, String Station, String Enter_Frome_Date , String Enter_To_Date , String Preoperative_Doctor_Drp ,
			String Observations_Text , String  Doctor_Refral_Speciality_Drp , String  Doctor_Refral_Doctor_Drp , String Doctor_Referral_Priority_Drp ,
			String Select_Notes_Style_Drp , String Doctor_Referral_Reason_Text , String Operative_Template_Drp , String Pre_OT_Template_Drp ,
			 String Physican_Template_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Operative Notes Test", "Emergency Operative Notes Test Funcility");

		Doctor_Notes.DoctorOperativeNotesBtn("Click On Operative Notes Btn");
		Doctor_Notes.OperativeNotesFromDateSerach(Enter_Frome_Date);
		Doctor_Notes.OperativeNotesToDateSerach(Enter_To_Date);

		Doctor_Notes.SearchDateOperativeNotes("Search Previous Operative Notes");
		Doctor_Notes.SelectByOperativeTemplateDrp(Operative_Template_Drp , "Search Template Notes");
		
//Templete Window
		Doctor_Notes.SaveTempleteYesPop("Click On Save Templete" ,"Save Yes template Popup");
		Doctor_Notes.ChildWindowToParentWindow("Close Operative Notes Templete Window");
		Doctor_Notes.SearchDateOperativeNotes("Search Save Previous Operative Notes"); // Check After Save Templete 
	
	//Delete Templete 	
	//	Doctor_Notes.SelectOperativeNotesInSubTable("Choose Save Operative Notes Sub Table Row");
	//	Doctor_Notes.DeleteTempleteYesPop("Click On Delete Templete" ,"Delete Yes template Popup");
	//
		Doctor_Notes.SearchDateOperativeNotes("Search Previous Save Operative Notes"); // Check After Save Templete 
		
}
	
	@Test(dataProvider = "DoctorNotesDataProvider" , priority = 5 , enabled = true)
	public void ErPreOtNotesTest(String Facility, String Station, String Enter_Frome_Date , String Enter_To_Date , String Preoperative_Doctor_Drp ,
			String Observations_Text , String  Doctor_Refral_Speciality_Drp , String  Doctor_Refral_Doctor_Drp , String Doctor_Referral_Priority_Drp ,
			String Select_Notes_Style_Drp , String Doctor_Referral_Reason_Text , String Operative_Template_Drp , String Pre_OT_Template_Drp ,
			 String Physican_Template_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Pre OT Notes Test", "Emergency Pre OT Notes Test Funcility");

		Doctor_Notes.PreOTNotesBtn("Click On Pre OT Notes Btn");
		Doctor_Notes.PreOTNotesFromDateSerach(Enter_Frome_Date);
		Doctor_Notes.PreOTNotesToDateSerach(Enter_To_Date);

		Doctor_Notes.SearchDatePreOtNotes("Search Previous Pre OT Templete");
		Doctor_Notes.SelectByPreOtTemplateDrp(Pre_OT_Template_Drp , "Search Template Notes");
		
	//Templete Window	
		Doctor_Notes.SaveTempleteYesPop("Click On Save Templete" ,"Save Yes template Popup");  
		Doctor_Notes.ChildWindowToParentWindow("Close Operative Notes Templete Window");  
		
		Doctor_Notes.SearchDatePreOtNotes("Search Previous Save Pre OT Templete"); 	
   } 
   
   @Test(dataProvider = "DoctorNotesDataProvider" , priority = 6 , enabled = true)
	public void ErPhysicanTemplateTest(String Facility, String Station, String Enter_Frome_Date , String Enter_To_Date , String Preoperative_Doctor_Drp ,
			String Observations_Text , String  Doctor_Refral_Speciality_Drp , String  Doctor_Refral_Doctor_Drp , String Doctor_Referral_Priority_Drp ,
			String Select_Notes_Style_Drp , String Doctor_Referral_Reason_Text , String Operative_Template_Drp , String Pre_OT_Template_Drp ,
			 String Physican_Template_Drp) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Physican Template Test", "Emergency Physican Template Test Funcility");

		Doctor_Notes.PhysicanTemplateBtn("Click OnPhysican Template Btn");
		Doctor_Notes.PhysicanTemplateFromDateSerach(Enter_Frome_Date);
		Doctor_Notes.PhysicanTemplateToDateSerach(Enter_To_Date);

		Doctor_Notes.SearchDatePhysicanTemplate("Search Previous hysican Template");
		Doctor_Notes.SelectByPhysicanTemplateDrp(Physican_Template_Drp , "Search Template Notes");
		
	//Templete Window	
		Doctor_Notes.SaveTempleteYesPop("Click On Save Templete" ,"Save Yes template Popup");  
		Doctor_Notes.ChildWindowToParentWindow("Close Operative Notes Templete Window");  
		
		Doctor_Notes.SearchDatePhysicanTemplate("Search Previous hysican Template");
   } 
   
   
   
   
     
}
