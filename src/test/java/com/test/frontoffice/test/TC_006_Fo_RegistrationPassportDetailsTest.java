/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FrontOfficePatientRegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 28-Nov-2025
 */
public class TC_006_Fo_RegistrationPassportDetailsTest extends FrontOfficePatientRegistrationPage {
	
	public FrontOfficePatientRegistrationPage frontofficeregistration = new FrontOfficePatientRegistrationPage();
	
	private final String sheetName = "FO_Registration_Passport_Page";

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		
		System.out.println("====TC_006_Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	
		
	public void PatientRegistrationWithPassportDetails(String Facility_Drp, String Station_Drp , String Passport_Number  , String Passport_Issue_date ,
			String Passport_Expiry_date , String Passport_Issued_At, String Visa_Number ,String Visa_Vaild_From , String Visa_valid_to ,
			String Passport_Remaks , String title_drp ,String First_name_text, String Middle_Name_text, String LAst_Name_Text, 
			String Gender_Drp, String DOB,String under_10_years , String Age_Int, String Marital_Status_drp , String Nationality_drp ,
			String House_Flat_No , String city_drp , String locality_po_Drp , String Purpose_OF_Visite_Drp , String refered_by_text , 
			String Soruce_of_Information_Drp ,String  Sub_Source_of_Information_Drp , String Scheme_Drp) 
	
           throws IOException, InterruptedException, ClassNotFoundException {  

		logger = extent.createTest("TC_006 Front Office Registration ", "Front Office Patient Registration with All Required Fields");
		
		frontofficeregistration.selectByFacilityDropdwon(Facility_Drp);
		
		try {
			frontofficeregistration.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp, "Yes Popup");
		} catch (Exception e) {
		
		}
		frontofficeregistration.clickOnAddPatientMenu("AddPatient", "PatientRegistration");

		frontofficeregistration.ClickOnPassportDetailsIcon("Click On Passport Details");
		frontofficeregistration.enterPassportNumber(Passport_Number);
		frontofficeregistration.enterIssueExpiryDate(Passport_Issue_date , Passport_Expiry_date);
		frontofficeregistration.enterOnIssuedAt(Passport_Issued_At);
		
		frontofficeregistration.enterVisaNumber(Visa_Number);
		frontofficeregistration.enterVisaValidFromAndTODate(Visa_Vaild_From , Visa_valid_to);
		frontofficeregistration.enterPassportRemaks(Passport_Remaks);
		frontofficeregistration.saveYesPassportDetails("Click On Save Passport Details");
		
       frontofficeregistration.selectByTitleDropdown(title_drp);
		
		frontofficeregistration.enterOnFirstName(First_name_text);
		frontofficeregistration.enterOnMiddleName(Middle_Name_text);
		frontofficeregistration.enterOnLastName(LAst_Name_Text);
		
		frontofficeregistration.selectByGenderDropdown(Gender_Drp);
		frontofficeregistration.clickOnAgeRadioButtonAndAgeText("Age Radio Button", Age_Int);
		
		frontofficeregistration.selectByMaritalStatus(Marital_Status_drp);
		frontofficeregistration.selectByNationality(Nationality_drp);
		
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		
		frontofficeregistration.enterOnHouseFlatNo(House_Flat_No);
		frontofficeregistration.selectByCityDropdown(city_drp);
		
		frontofficeregistration.enterLocalityPODropdown(locality_po_Drp + CommanUtill.randomAlphabets(3));
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		
		 frontofficeregistration.selectByPurposeOfVisitDropdown(Purpose_OF_Visite_Drp);	
		 //frontofficeregistration.enterOnReferredBy(refered_by_text);
		
		 frontofficeregistration.selectBySourceOfInformationAndSubSorurceDropdown(Soruce_of_Information_Drp ,Sub_Source_of_Information_Drp);
		 frontofficeregistration.clickOnSchemeCheckboxAndSelectScheme("Scheme Dropdown",Scheme_Drp);
		 
		// Save registration and handle potential popups
		 
		frontofficeregistration.clickOnSaveRegistrationButton("SaveRegistration");
		frontofficeregistration.yespopupUnderAgeRegistration("Age Below 10 Years Yes Popup");
		frontofficeregistration.closePossibleDuplicatePopup("Close Duplicate Popup");
		frontofficeregistration.handleYESConfirmPatientDetailsPopup("Yes Confirm Patient Details Popup");
		frontofficeregistration.clickOnSkipGeneralConsentButton("Skip General Consent Button");
	
		String patientRegistrationId =	frontofficeregistration.getUHIDOfPatient();
		System.out.println("Patient Registration Id is: " +patientRegistrationId);
		
		frontofficeregistration.NoBillingPageInRegistrationPagePopup("NoBillingPage");
		//frontofficeregistration.YesBillingPageInRegistrationPagePopup("YesBillingPage");
			
	//done	
	}

  }
