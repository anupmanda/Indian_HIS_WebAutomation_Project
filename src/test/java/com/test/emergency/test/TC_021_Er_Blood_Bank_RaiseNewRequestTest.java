/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_Blood_Bank_RaiseNewRequestPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 16-Apr-2026
 */
public class TC_021_Er_Blood_Bank_RaiseNewRequestTest extends Er_Blood_Bank_RaiseNewRequestPage {
	
	Er_Blood_Bank_RaiseNewRequestPage Raise_New_Request = new Er_Blood_Bank_RaiseNewRequestPage();
	private final String sheetName = "Er_Raise_New_Request_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = true)	
	public void SearchBloodBankRaiseNewRequestTest(String facility_drp, String Station_drp , String Enter_From_Date , String Enter_To_Date  , 
			String Enter_Transfusion_Datetime , String Priority_Drp , String Blood_Group_Drp , String RH_Factor_Drp , String PT_INR_Value_Sec ,
			String APTT_Value_Sec , String Haemoglobin_Value , String Platelet_Count_Value , String Reason_Transfusion_Text , 
			String Reason_Transfusion_ClinicalDiagnosis_Text , String Previous_Blood_Group_Drp ,String Previous_Rh_Factor_Drp , String Reaction_Text ,
			String Women_Pregnancy , String Request_Component_Drp , String Request_List_Qty , String Remarks_Text , String Enter_Er_Number)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Blood Bank Raise New Request", "Blood Bank Raise New Request");

		Raise_New_Request.selectByFacilityDropdown(facility_drp);
		Raise_New_Request.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Raise_New_Request.ErOrderRaiseBloodBankMenuBtn("Er Order Tab","Blood Bank Menu");
		Raise_New_Request.RaiseNewRequestNewWindow("Raise New Request Page");
		Raise_New_Request.SearchBtn("Click On Search And Find Patint Icon");
		
		Raise_New_Request.RadioBtnCurrent_In_patients_AllWard_AdmissionDischarge("Radio Btn Current In Patient" , "All Ward Check Box" ,
				"Check Box Admission Discharge");
		Raise_New_Request.AdmissionCurntInPatientFromDateSerach(Enter_From_Date);
		Raise_New_Request.AdmissionCurrentInPatientToDateSerach(Enter_To_Date);
		
		Raise_New_Request.FindCurrentPatientInSearchBtn("Click On Search And Find Patient Pop");
		Raise_New_Request.SerachAndselectPatientInTable("Click On Currnt In Patient In Ip Number");
		
		Raise_New_Request.ResultsClinicalDiagnosisYesPop("yes Pop then lab result and clinical diagnosis result will fetch");
	
		Raise_New_Request.TransfusionDetails("Check Box Request from Outside agency" ,Enter_Transfusion_Datetime , Priority_Drp);
		Raise_New_Request.SelectBloodGroupAndRHFactorDrp(Blood_Group_Drp , RH_Factor_Drp);
		
		Raise_New_Request.EnterPTINRAndAPttValueInSec(PT_INR_Value_Sec , APTT_Value_Sec);
		Raise_New_Request.EnterHaemoglobinAndAPlateletCount(Haemoglobin_Value , Platelet_Count_Value);
		
		Raise_New_Request.ReasonTransfusionAndReasonClinicalDiagnosisHistory(Reason_Transfusion_Text , Reason_Transfusion_ClinicalDiagnosis_Text);
		Raise_New_Request.TransfusionHistoryDetails("Check Box History Of Previous Transfusion" , Previous_Blood_Group_Drp , 
				Previous_Rh_Factor_Drp , Reaction_Text);
		
		Raise_New_Request.WomenPatientDetails("Check Box Women_pregnant" , Women_Pregnancy);
		Raise_New_Request.RequestListDetails(Request_Component_Drp , Request_List_Qty);

		Raise_New_Request.RaiseNewRequestRemarks(Remarks_Text);
		Raise_New_Request.ClickOnAddToCard("Click On Add To Card Raise New Request");
		
		Raise_New_Request.ClickOnSaveButton("Click On Save Button");
		Raise_New_Request.printSuccessPopupMessage("After Save Successfully Pop");
		
		driver.navigate().refresh();
		Thread.sleep(1500);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = true)	
	public void EnterErNumberBloodBankRaiseNewRequestTest(String facility_drp, String Station_drp , String Enter_From_Date , String Enter_To_Date  , 
			String Enter_Transfusion_Datetime , String Priority_Drp , String Blood_Group_Drp , String RH_Factor_Drp , String PT_INR_Value_Sec ,
			String APTT_Value_Sec , String Haemoglobin_Value , String Platelet_Count_Value , String Reason_Transfusion_Text , 
			String Reason_Transfusion_ClinicalDiagnosis_Text , String Previous_Blood_Group_Drp ,String Previous_Rh_Factor_Drp , String Reaction_Text ,
			String Women_Pregnancy , String Request_Component_Drp , String Request_List_Qty , String Remarks_Text , String Enter_Er_Number)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Cancel Component ", "Cancel Component Test Funcility");
		
		Raise_New_Request.EnterErNumber(Enter_Er_Number);
		Raise_New_Request.ResultsClinicalDiagnosisNoPop("No Pop then lab result and clinical diagnosis result will Not  fetch");

		Raise_New_Request.RequestListDetails(Request_Component_Drp , Request_List_Qty);

		Raise_New_Request.RaiseNewRequestRemarks(Remarks_Text);
		Raise_New_Request.ClickOnAddToCard("Click On Add To Card Raise New Request");
		
		Raise_New_Request.ClickOnSaveButton("Click On Save Button");
		Raise_New_Request.printSuccessPopupMessage("After Save Successfully Pop");
	}
}
