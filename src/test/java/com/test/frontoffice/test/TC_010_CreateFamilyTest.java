/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.CreateFamilyPage;

import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

import junit.framework.Assert;

/**
 * @author Anup
 *
 * 22-Dec-2025
 */
public class TC_010_CreateFamilyTest extends CreateFamilyPage{ 
	
	public static CreateFamilyPage create_family = new CreateFamilyPage();
	public static String empCode;
	
	private String sheetName = "Create_Family";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	
	public void CreateFamilyPatient(String Facility_Drp , String Station_Drp , String Enter_First_UHID , String Enter_Mobile_Number , 
			String Rate_Contract_drp , String Select_Scheme_Drp, String Enter_Validity , String Family_Id_Number , String Employee_Code_Number ,
			String Relation_Drp , String Enter_second_UHID , String Second_Rate_Contract_drp , String Second_UHID_Relation_Drp ) 
					throws InterruptedException, IOException {

		logger = extent.createTest("Create Family Front Office" ,"This Test Case Will Verify Create Family Patient Functionality");
	
		create_family.selectByFacilityDropdwon(Facility_Drp);
		create_family.clickOnDashboardFrontOfficeBtn("Click On Front Office Dashbord", Station_Drp, "Click On Yes Popup");
		create_family.clickONCreateFamilyPatient("Click On Add Patient Menu", "Click On Create Family Duplicate Page");
		create_family.enterUHID(Enter_First_UHID);
		
		//Assert.assertEquals(false, false);
		
		//create_family.serachCreateFamilyMember("Click On Serach Icon Btn");
		//create_family.enterSerachMobileNumberEnter(Enter_Mobile_Number ,"Click on Serach Icon");
		//create_family.clickOnTablePatient("Pick The Serach Table Create Family");
		
		create_family.selectByRateContract(Rate_Contract_drp);
		create_family.clickOnMappedScheme("Click On Scheme"); 
		
		//create_family.serachSchemeDrpAndCheckBox("click On Scheme Check Box",  Select_Scheme_Drp);
		//create_family.enterSchemeValidity(Enter_Validity);
		//create_family.CheckBoxSaveRateContractAndSchemeAllMembers("Click Save Rate Contract And Scheme" , "Save Scheme Yes Popup");
		//create_family.enterFamilyID_number(Family_Id_Number);   //Auto Genrated
		
		create_family.generateEnterAndStoreEmployeeCode(Employee_Code_Number);
	    empCode = create_family.getEmployeeCode();
		System.out.println("Employee Code Used in Serach And Check : " + empCode);
		
		create_family.SelectByRelationDrpandPlushIcon(Relation_Drp , "Click on Plush Icon");
		
		
		//------------------Second UHID ------------------------
		
		create_family.enterUHID(Enter_second_UHID);
		create_family.selectByRateContract(Second_Rate_Contract_drp);
		create_family.clickOnMappedScheme("Click On Scheme");
		create_family.SelectByRelationDrpandPlushIcon(Second_UHID_Relation_Drp , "Click on Plush Icon");
		create_family.saveCreateFamilyMember("Click On Save Icon" , "Save Yes popup");
		Thread.sleep(2000);
		
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2)	
	public void CreateFamilyInExcelSheet(String Facility_Drp , String Station_Drp , String Enter_First_UHID , String Enter_Mobile_Number , 
			String Rate_Contract_drp , String Select_Scheme_Drp, String Enter_Validity , String Family_Id_Number , String Employee_Code_Number ,
			String Relation_Drp , String Enter_second_UHID , String Second_Rate_Contract_drp , String Second_UHID_Relation_Drp ) 
					throws InterruptedException, IOException {

		logger = extent.createTest("Create Family Dwonlod CSV File" ,"CSV File Save");
		
		create_family.clickOnCSVFileIcon("Click On CSV Files");
		
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3)	
	public void CheckCreateFamilyInEmployee_Code(String Facility_Drp , String Station_Drp , String Enter_First_UHID , String Enter_Mobile_Number , 
			String Rate_Contract_drp , String Select_Scheme_Drp, String Enter_Validity , String Family_Id_Number , String Employee_Code_Number ,
			String Relation_Drp , String Enter_second_UHID , String Second_Rate_Contract_drp , String Second_UHID_Relation_Drp ) 
					throws InterruptedException, IOException {

		logger = extent.createTest("Create Family Check Create Family " ,"Employee Code");
		
		create_family.enterEmployeeCode(empCode);
		
	
		 
	}
	
	
}
