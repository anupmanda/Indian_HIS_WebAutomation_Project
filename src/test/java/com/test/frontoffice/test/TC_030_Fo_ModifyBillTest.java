/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.frontoffice.page.Fo_ModifyBillPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 22-Jan-2026
 */
public class TC_030_Fo_ModifyBillTest extends Fo_ModifyBillPage{ 
	
	Fo_ModifyBillPage ModifyBill = new Fo_ModifyBillPage();
	
	private final String sheetName_Modify_bill = "FO_Modify_Bill";
	
	@DataProvider(name = "ModifyBillDataProvider")
	public Object[][] getModifyBillData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Modify_bill +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Modify_bill);
	}

	@Test(dataProvider = "ModifyBillDataProvider" , priority = 1)	

	public void ModifyBillInCash(String Facility_Drp ,String Station_Drp , String Enter_UHID_Excel_Sheet_Case , String Enter_UHID_Excel_Sheet_Credit ,
			String Bills_Number_Excel_sheet , String Billed_Credit_Company , String Billed_Cash , String Company_Type_drp , String Company_drp ,
			String Rate_contract_Drp , String Corporate_company_Drp , String Authorised_By_Drp , String Billed_Reason , String Remaks_Modify_Bill) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Modify Bills In Cash", "Modify Bill In Cash Test Funcility");

		ModifyBill.selectByFacilityDropdwon(Facility_Drp);
		ModifyBill.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");
		
		ModifyBill.ModifyBillPage("Click On Modify Bill Page");
		
		ModifyBill.EnterUHIDBillModify(Enter_UHID_Excel_Sheet_Case);
		ModifyBill.modifyBillInCash(Billed_Cash);
		
		ModifyBill.AuthorisedByAndReasonDrp(Authorised_By_Drp , Billed_Reason);
		ModifyBill.ModifyRemaksText(Remaks_Modify_Bill);
		
		ModifyBill.SaveModifyBill("Click On Save Btn" , "Print Btn");
		ModifyBill.RefreshBtnModifyBill("Click On Print Btn");
	}
	
	@Test(dataProvider = "ModifyBillDataProvider" , priority = 2  )
	public void ModifyBillInCompany(String Facility_Drp ,String Station_Drp , String Enter_UHID_Excel_Sheet_Case , String Enter_UHID_Excel_Sheet_Credit ,
			String Bills_Number_Excel_sheet , String Billed_Credit_Company , String Billed_Cash , String Company_Type_drp , String Company_drp ,
			String Rate_contract_Drp , String Corporate_company_Drp , String Authorised_By_Drp , String Billed_Reason , String Remaks_Modify_Bill) throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		
		logger = extent.createTest("Modify Bills In Company ", "Modify Bill In Company Test Funcility");
		
		ModifyBill.EnterUHIDBillModify(Enter_UHID_Excel_Sheet_Credit);
		
		ModifyBill.ModifyBillInCredit(Billed_Credit_Company);
		
		ModifyBill.clickOnInsuranceCompanyIcon("Click On Company insurance Icon");
		ModifyBill.RadioBtnCompanyDetails_Company("Radio Btn In Company");
				
		ModifyBill.Company_Type_Company_Rate_contract_Drp(Company_Type_drp , Company_drp , Rate_contract_Drp);
		ModifyBill.Corporatecompanydrp(Corporate_company_Drp);	
		ModifyBill.PlushIconCompanyDetailsPop("Click On Company Details Plush Icon");
		
		ModifyBill.AuthorisedByAndReasonDrp(Authorised_By_Drp , Billed_Reason);
		ModifyBill.ModifyRemaksText(Remaks_Modify_Bill);
		
		ModifyBill.SaveModifyBill("Click On Save Btn" , "Print Btn");
				
	}

}
