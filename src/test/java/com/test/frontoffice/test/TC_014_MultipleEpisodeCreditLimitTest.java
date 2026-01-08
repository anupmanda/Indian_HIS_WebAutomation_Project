/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficeBillingPage;
import com.test.frontoffice.page.MultipleEpisodeCreditLimitPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 24-Dec-2025
 */
public class TC_014_MultipleEpisodeCreditLimitTest extends MultipleEpisodeCreditLimitPage {
	
	public MultipleEpisodeCreditLimitPage Multiple_Episode_Credit_Limit = new MultipleEpisodeCreditLimitPage();
	FrontOfficeBillingPage frontofficebilling = new FrontOfficeBillingPage();
	public String Excel_sheet_uhid;
	
private String sheetName = "Multiple_Episode_Credit_Limit";
private final String sheetName_Billig = "FO_Billing_Page";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	
	public void MultipleEpisodeCreditLimit(String Facility_Drp , String Station_Drp , String Enter_UHID , String New_Credit_Limit , String From_Date,
			String To_Date , String Company_Type_Drp , String Company_Drp , String Rete_Contract_Drp , String Enter_Auth_Claim_Number)  
					throws InterruptedException, IOException {

		logger = extent.createTest("Multiple Episode Credit Limit" ,"Multiple Episode Credit Limitt Functionality");
	
		Multiple_Episode_Credit_Limit.selectByFacilityDropdwon(Facility_Drp);
		Multiple_Episode_Credit_Limit.clickOnDashboardFrontOfficeBtn("Click On Front Office Dashbord", Station_Drp, "Click On Yes Popup");
		Multiple_Episode_Credit_Limit.clickOnAddPatientMeanu("Click On Add Patient Menu");
		Multiple_Episode_Credit_Limit.clickOnMultipleEpisodeCrediteLimit("Multiple Episode Credit Limit Page");

		Multiple_Episode_Credit_Limit.enterUHIDMultipleEpisodeCreditLimit(Enter_UHID);
		Excel_sheet_uhid = Multiple_Episode_Credit_Limit.getUHIDMultipleEpisodeCreditLimit();
		System.out.println("Using Stored UHID : " + Excel_sheet_uhid);

		Multiple_Episode_Credit_Limit.enterNewCreditLimit(New_Credit_Limit);
		Multiple_Episode_Credit_Limit.fromAndToDate(From_Date , To_Date);
		Multiple_Episode_Credit_Limit.selectByCompanyTyp_Company_RateContractDrp(Company_Type_Drp , Company_Drp , Rete_Contract_Drp);
		
		Multiple_Episode_Credit_Limit.Auth_ClaimNumber(Enter_Auth_Claim_Number);
		
		Multiple_Episode_Credit_Limit.saveMultipleEpisodeCreditLimit("Click On Save Icon");
		Multiple_Episode_Credit_Limit.MeanuToHomeDashBord("Click On Meanu Bar Icon" , "Home Icon");
		
		
 }
	
	@DataProvider(name = "FrontOfficeBillingDataProvider")
	public Object[][] getBillingData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Billig +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Billig);
	}

	@Test(dataProvider = "FrontOfficeBillingDataProvider" , priority = 2)	
	
	public void FrontOfficeBilingPage(String Facility_Drp ,String Station_Drp , String enter_UHID_Billing_text , String Bill_Company_types_Drp ,
			String Bill_Company_Drp , String Bill_Rate_Contract_Drp ,String Company_Document_Id_Type_popup ,String Visit_Choose_Speciality_Drp,
			String Visit_Doctor_Name ,String Visit_Room_numver_drp , String Diagnostics_Test_Serach_Name , String Diagnostics_Test_Priority_drp ,
			String Diagnostics_Test_Speciality_drp, String Diagnostics_Test_Doctor_Name_drp , String Manual_Service_Name_drp , 
			String Manual_Description , String Manual_Quantity , String Manual_Price ,String Other_services_name_drp,String Enter_other_Services_Name,
			String other_servics_Priority_drp , String Other_servics_Speciality_drp , String other_servics_Performing_Doctor_drp , String Referred_By ,
			String Facilitator_Name_Drp , String Billing_Source_Drp , String Billing_SubSource_Drp , String enter_remaks, String Bill_Scheme_Drp ,
			String Bill_Scheme_Date, String Scheme_Authorised_By_drp , String Discount_On_bill_Drp , String Discount_on_servics , String Discount_On_Items , 
			String Discount_Head_Drp , String Discount_Reason_Drp , String Discount_Service_Name_Drp , String Discount_Item_Doctor_Name_Drp, 
			String Discount_Authorised_by , String Discount_Remaks_Text , String Approve_Discount_User_Name, String Approve_Discount_Password,
			String Payment_Mode_Cheque_drp , String Cheque_no_Text , String Cheque_Bank_Name_Drp , String Cheque_Branch_Name_text , String Payment_Mode_Credit_drp ,
			String Credit_Card_type_Drp , String Credit_Card_no , String Credit_Card_Bank_name_Drp, String Credit_Card_Trans_no) throws IOException , InterruptedException{
		
		logger = extent.createTest("Multiple Episode Credit Limit After Fo Billing" ,"Bill Genrate After Episode Create");
		
	
			frontofficebilling.selectByFacilityDropdwon(Facility_Drp);
			frontofficebilling.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
			frontofficebilling.clickOnBillingButton("BillingMenu", "BillingPage");
			
			frontofficebilling.enterOnUHIDBilling(Excel_sheet_uhid);
			
	}
    }
