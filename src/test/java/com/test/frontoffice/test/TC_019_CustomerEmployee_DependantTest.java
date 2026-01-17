/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.CustomerEmployee_DependantPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 08-Jan-2026
 */
public class TC_019_CustomerEmployee_DependantTest extends CustomerEmployee_DependantPage{
	
	public CustomerEmployee_DependantPage CustomerEmployee_Dependant = new CustomerEmployee_DependantPage();
	
	private final String sheetName = "FO_CustomerEmployee_Dependant";
	
	@DataProvider(name = "CustomerEmployee_DependanDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("==== Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "CustomerEmployee_DependanDataProvider" , priority = 1)	

	public void FrontOfficeCustomerEmployeeDependant(String Facility_Drp ,String Station_Drp , String Company_Type_Drp , String Company_Drp,
			String Rate_Contract_Drp , String Corporate_Company_Drp , String Enter_Employee_Number , String Enter_First_Name , String Nationality_Drp , 
			String Enter_DOB , String Enter_Age , String Gender_Drp , String Enter_Mobile_Number , String ResidenceCard_Type_Drp ,String Enetr_Nationality_Id,
			String Relation_Drp , String Add_Employee_Popup_Enter_Employee_Number , String Add_Employee_First_Name , String Employee_Status_Tag_Drp , 
			String Add_Employee_Nationality_Drp , String Add_Employee_Dob , String Add_Employee_Age , String Add_Employee_Gender_Drp ,
			String Add_Employee_Mobile_no , String ResidenceCardType_Drp , String Add_Employee_NationalityId ) 
	
			throws IOException , InterruptedException{

		logger = extent.createTest("TC_019_Employee Dependant Add Dependent", " Add Dependent Funcility Test");

		CustomerEmployee_Dependant.selectByFacilityDropdwon(Facility_Drp);
		CustomerEmployee_Dependant.clickOnDashboardFrontOfficeBtn("Click On Front Office Dashbord", Station_Drp, "Click On Yes Popup");
		CustomerEmployee_Dependant.FoAddpatientmeanu("Click On Add Patient Menu" );
		CustomerEmployee_Dependant.clickOnCustomerEmployeeDependantPage("Click On Customer Employee Dependant Page Tab");
		
		CustomerEmployee_Dependant.CompanyTypeAndCompanyDrp(Company_Type_Drp , Company_Drp);
		CustomerEmployee_Dependant.RateContractAndCorporateCompanyDrp(Rate_Contract_Drp , Corporate_Company_Drp);
		CustomerEmployee_Dependant.AddDependentButton("Click On Add Dependent Button");
		
		CustomerEmployee_Dependant.EnterEmployeeNumber(Enter_Employee_Number + CommanUtill.randomDigits(3));
		CustomerEmployee_Dependant.EnterFirstNameAndNationalityDrp(Enter_First_Name , Nationality_Drp);
		
		CustomerEmployee_Dependant.RadioBtnDOBAndEnterDOb("Click On DOB Radio Button" , Enter_DOB);
		CustomerEmployee_Dependant.AgeRadioBtnAndEnterAge("Click On Age Radio Button" , Enter_Age);
		
		CustomerEmployee_Dependant.GenderAndMobileNumber(Gender_Drp , Enter_Mobile_Number);
		CustomerEmployee_Dependant.ResidenceCardType_NationalityId_Relation(ResidenceCard_Type_Drp,Enetr_Nationality_Id,Relation_Drp);
		CustomerEmployee_Dependant.SaveAddDependentButton("Click On Add Dependent Save Popup");
		
		Thread.sleep(1001);
		CustomerEmployee_Dependant.closeAddDependentPopup("Close Add Dependent Popup");
		
		//**********************************************************************************************************
		logger = extent.createTest("TC_019_Employee Dependant Add Employee", " Add Employee Funcility Test");
		
		CustomerEmployee_Dependant.CompanyTypeAndCompanyDrp(Company_Type_Drp , Company_Drp);
		CustomerEmployee_Dependant.RateContractAndCorporateCompanyDrp(Rate_Contract_Drp , Corporate_Company_Drp);
		CustomerEmployee_Dependant.clickAddEmployeeButton("Click On Add Employee Button");
		
		//---------------------------Add Employee Popup ------------------------------
		CustomerEmployee_Dependant.enterEmployeeNumber(Add_Employee_Popup_Enter_Employee_Number);
		CustomerEmployee_Dependant.AddEmployeePopupFirstNameEmployeeStatusTagNationality(Add_Employee_First_Name , 
				Employee_Status_Tag_Drp, Add_Employee_Nationality_Drp);
		
		CustomerEmployee_Dependant.AddEmployee_PopupRadioBtnDOBAndEnterDob("Radio Btn Add Employee popup Dob", Add_Employee_Dob);
		CustomerEmployee_Dependant.AddEmployee_PopupRadioBtnAgeAndEnterAge("Radio Btn Add Employee popup Age", Add_Employee_Age);
		
		CustomerEmployee_Dependant.Gender_MobileNumber_ResidenceCardType_NationalityId(Add_Employee_Gender_Drp , Add_Employee_Mobile_no ,
				ResidenceCardType_Drp , Add_Employee_NationalityId);
		
		CustomerEmployee_Dependant.SaveAddEmployeePopup("Save Popup Add Employee Customer");
	}
	

} 
