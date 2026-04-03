/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.emergency.page.ErBillingPage;
import com.test.readdata.ExcelSheetDataProvider;


/**
 * @author Anup
 *
 * 23-Mar-2026
 */
public class ErBillingTest extends ErBillingPage {
	
	ErBillingPage Er_Billing = new ErBillingPage();
	
	private final String sheetName = "Er_Billing_Page"; 

	@DataProvider(name = "BillingDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====Sheet Name_01: " + sheetName + "======");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "BillingDataProvider" , priority = 1 ,enabled = false)	
	public void SearchCurrentPatientTest(String facility_drp , String Station_drp , String Search_Frome_Date , String Search_To_Date , 
			String Enter_Er_Number , String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number ,
			String Auth_Claim_no , String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , 
			String Letter_Date , String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day ,
			String Account_Number , String IFSC_Code , String Bank_Branch ,String Corporate_company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount , String Credit_Limit , String Employee_Code , String Employee_Relation , String Issued_By 
			)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Search Current In Patient", "Search Current In Patient Test Funcility");
		
		Er_Billing.selectByFacilityDropdown(facility_drp);
		Er_Billing.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Er_Billing.clickErBillingPage("Er Billing Button in side Icon","Er BillingS Page");
		
		Er_Billing.FindPatient_SeachIcon("Click on Search Icon");
		Er_Billing.RadioBtnCurrentInPatients_AllWardsCheckBox("Click On Radio Btn Current In Patients" ,"All Wards Check Box");
		Er_Billing.CheckBoxAdmission_Discharge("Click On Admission  And Discharge Check Box");
		
		Er_Billing.AdmissionDischarge_FromDateSerach(Search_Frome_Date);
		Er_Billing.AdmissionDischarge_ToDateSerach(Search_To_Date);
		
		Er_Billing.clickOnSerachIcon("Click on Search Icon");
		Er_Billing.SerachAndselectPatientInTable1("Click Search Pateint Table");
		
	}
	@Test(dataProvider = "BillingDataProvider" , priority = 2 ,enabled = false)	
	public void SearchDischargedPatientTest(String facility_drp , String Station_drp , String Search_Frome_Date , String Search_To_Date , 
			String Enter_Er_Number , String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number ,
			String Auth_Claim_no , String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , 
			String Letter_Date , String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day ,
			String Account_Number , String IFSC_Code , String Bank_Branch ,String Corporate_company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount, String Credit_Limit , String Employee_Code, String Employee_Relation , String Issued_By , 
			String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks
			)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Search Discharged Patient", "Search Discharged Patient Test Funcility");
		
		Er_Billing.selectByFacilityDropdown(facility_drp);
		Er_Billing.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Er_Billing.clickErBillingPage("Er Billing Button in side Icon","Er BillingS Page");
		
		Er_Billing.FindPatient_SeachIcon("Click on Search Icon");
		
		Er_Billing.RadioBtnDischargedPatients("Click On Radio Btn Discharged In Patients");
		Er_Billing.CheckBoxAdmission_Discharge("Click On Admission  And Discharge Check Box");
		
		Er_Billing.AdmissionDischarge_FromDateSerach(Search_Frome_Date);
		Er_Billing.AdmissionDischarge_ToDateSerach(Search_To_Date);
		
		Er_Billing.clickOnSerachIcon("Click on Search Icon");
		Er_Billing.SerachAndselectPatientInTable1("Click Search Pateint Table");
		
}
	@Test(dataProvider = "BillingDataProvider" , priority = 3 ,enabled = true)	
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
		
		Er_Billing.selectByFacilityDropdown(facility_drp);
		Er_Billing.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Er_Billing.clickErBillingPage("Er Billing Button in side Icon","Er BillingS Page");
		
		Er_Billing.EnterErNumber(Enter_Er_Number);
	}
	

	@Test(dataProvider = "BillingDataProvider" , priority = 4 ,enabled = false)	
	public void EditFinancialDetaitModification(String facility_drp , String Station_drp , String Search_Frome_Date , String Search_To_Date , 
			String Enter_Er_Number , String Company_type_Drp , String Company_Drp , String Rate_contract_Drp , String Policy_Number ,
			String Auth_Claim_no , String Standard_Deductible , String Standard_Co_pay_Drp , String Co_Pay_Text , String Letter_no , 
			String Letter_Date , String Employee_Number , String Certificate_number , String Bed_Entitlement , String Per_Day ,
			String Account_Number , String IFSC_Code , String Bank_Branch ,String Corporate_company_Drp , String Insurance_Company_Drp ,
			String Auth_Amount, String Credit_Limit , String Employee_Code, String Employee_Relation , String Issued_By , 
			String Discharge_Reason_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remarks
			)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Financial Detail Modification", "Financial Detail Modification Test Funcility");
	
		// Update Financial Details 
		Er_Billing.EditFinancialDetailModificationIcon("Click On Edite Financial Details");

			//Document Check List patent Scheme Pop
		Er_Billing.CloseDocumentCheckListPop("Close Document Check List Pop");
		Er_Billing.CloseSchemeForPatientPop("Close Scheme For Patient");

		Er_Billing.UpdateFinancialDetailModificationIcon("Click On Update Financial Details Icon");
		Er_Billing.CompanyInsuranceRadioBtn("Click On Company Insurance Radio Btn");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='90%'");
		Er_Billing.CompanyType_Company_RatecontractDrp(Company_type_Drp , Company_Drp , Rate_contract_Drp);
			
		Er_Billing.CloseDocumentCheckListPop("Close Document Check List Pop");
		Er_Billing.CloseSchemeForPatientPop("Close Scheme For Patient");

		Er_Billing.EnterPolicyNo_AuthClaimText(Policy_Number , Auth_Claim_no);
		Er_Billing.EnterStandardDeductible(Standard_Deductible);

		Er_Billing.StandardCo_PayDrpAndCo_Pay(Standard_Co_pay_Drp , Co_Pay_Text);
		Er_Billing.LetterNumberLetterDateEmployeenumbeCertificatenumber(Letter_no , Letter_Date ,Employee_Number , Certificate_number);
		Er_Billing.BedEntitlementAndPerDay(Bed_Entitlement , Per_Day);

		Er_Billing.AccountInformationEnterAndSave(Account_Number , IFSC_Code , Bank_Branch);
		//Er_Billing.CorporateCompany_InsuranceCompanyDrp(Corporate_company_Drp ,Insurance_Company_Drp);
		Er_Billing.AuthAmount_CreditLimit(Auth_Amount , Credit_Limit);
		
		Er_Billing.EmployeeCode_EmployeeRelation_IssuedBy(Employee_Code , Employee_Relation , Issued_By);
		Er_Billing.SaveFinancialDetailModificationBtn("Save Financial Details Btn");	
	}
	@Test(priority = 5 ,enabled = false)
	public void PatientBillSchemeTest()
			throws IOException, InvalidFormatException, InterruptedException{
		logger = extent.createTest("Financial Detail Modification Scheme ", "Scheme Financial Detail  Test Funcility");
		
	Er_Billing.EditFinancialDetailModificationIcon("Click On Edite Financial Details");
	
	Er_Billing.UpdateFinancialDetailModificationIcon("Click On Update Financial Details Icon");
	Er_Billing.CompanyInsuranceRadioBtn("Click On Company Insurance Radio Btn");
	
	Er_Billing.checkBoxSchemeAndSchemeDrp("Scheme Check box Click", "Staff Discount");
	Er_Billing.SaveFinancialDetailModificationBtn("Save Scheme Details Btn");
	
	
	}
	@Test(priority = 6 ,enabled = false)
	public void DepositRefundDetails()
			throws IOException, InvalidFormatException, InterruptedException{
		logger = extent.createTest("Deposit Refund Details ", "Deposit Refund Details  Test Funcility");
	
		Er_Billing.ClickOnDepositRefundDetails("Click On Deposit Refund Btn" ," Deposit Radio Btn" ,"Receipt Radio Btn" ,
				"Refund Radio Btn" ,"Close Refund Deposit Pop");
	}
	
	@Test(priority = 7 ,enabled = false)
	public void BillDetailsDetails()
			throws IOException, InvalidFormatException, InterruptedException{
		logger = extent.createTest("Bill Details ", "Bill Details Test Funcility");
		
		Er_Billing.BillDetailsIcon("Click On Bill Details Icon");
		Thread.sleep(2000);
		Er_Billing.clickAllDisplayAndServiceRows("Bill Details Service");
		Er_Billing.BillDetailsClosePop("Close Bill Details Pop");
	
	}
	@Test(priority = 8 ,enabled = false)
	public void PatientInsuranceApprovalDetailsTest()
			throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Patient Insurance Approval Details", "Patient Insurance Approval Details Test Funcility");
		
		Er_Billing.ClickOnCompanyDetailsIcon("Click On Thumb Icon Company Details");
		Er_Billing.TablePatientInsuranceApprovalDetails("Print Patient Insurance Table" ,"55" ,"Deduct-first" ,"Approved Check Box");

		Er_Billing.RadioBtnInCreditLimitAndEnterCreaditLimit("Radio Btn Credit Limit" ,"15");
		Er_Billing.SavePatientInsuranceApprovalPop("Save Patient Insurance Approval Btn");
		
		Er_Billing.CloseCompanyDetails_PatientInsuranceApprovalPop("Close Patient Insurance Approval Details Pop");
		
	}
	
	@Test(priority = 9 ,enabled = false)
	public void PendingInvestigationtest()
			throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Pending Investigation", "Pending Investigation Test Funcility");
		
		Er_Billing.ClickOnPendingInvestigation("Click On Pending Investigation");
		
	}
	@Test(priority = 10 ,enabled = false)
	public void InterimBillTest()
			throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Interim Bill", "Interim Bill Test Funcility");
		
		Er_Billing.ClickOnInterimBillIcon("Click On Interim Bill Icon");
		
		Er_Billing.RadioBtnInSummaryBillInterimBillPop("Click On Summary Bill Radio Btn", "Click On Yes Summary Bill pop");
		Thread.sleep(1500);
		Er_Billing.RadioBtnInDetailedBillInterimBillPop("Click On Details Bill Radio Btn", "Click On Yes Details Bill pop");
		Er_Billing.NoInterimBillPop("Click On No In Interim Bill Pop");
	}
		
	@Test(dataProvider = "BillingDataProvider", priority = 11 ,enabled = false)
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
		
	}
	
	@Test(priority = 12 ,enabled = false)
	public void CancelDischargeTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Cancel Discharge Icon", "Cancel Discharge Test Funcility");
		
		Er_Billing.CancelDischargeBtn("Click on Cancel Discharge Btn");
		Er_Billing.CancelDischarge_ReasonYesPop("Cancel Discharge Text" ,"Ok Cancel Discharge Icon");
		Er_Billing.PatientCancelDischargeYesPop("Ok Cancel Discharge Pop");
	}
	@Test(priority = 13 ,enabled = false)
	public void DiscountInTotalBillDiscountTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Discount On Total Bill Discount", "Discount On Total Bill Discount Test Funcility");
		
		Er_Billing.clickOnDiscountTypeIcon("Click On Discount Btn");
		
		Er_Billing.CheckBoxScheme("Scheme Check Box Un_Select");  // if Select Chane To unSelect CheckBox
		Er_Billing.RadioBtnDiscountInTotalBill_Amout("Click Radio Btn Total Bill Discount" , "1000" );
		ErBillingPage.getScreenShot(driver, "Total_Bill_Amount_discount");
		Er_Billing.EnterDiscountOnTotalBillPercentage("50");
		ErBillingPage.getScreenShot(driver, "Total_Bill_Amount_Percentage");

		Er_Billing.SelectByDiscountHeadDrp("Staff Discount" ,"Staff Discount");
		Er_Billing.EnterDiscountRemarks("Anup Discount On Total Bill Amount Remarks");
		
		Er_Billing.ClickCalcuateDiscountBtn("Click On Calculate Discount Btn");
		Er_Billing.AlertTotalAppliedDiscountView("View Discount Value");
		Er_Billing.SelectByAuthorisedByDrp("MOU Discount");
		Er_Billing.SaveDiscountOnBill("Save Discount On Total Bill Amount");
		Thread.sleep(1500);
	}
	@Test(priority = 14 ,enabled = false)
	public void DeleteDiscountBillTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Delete Discount Button", "Delete Discount Test Funcility");
		
		Er_Billing.clickOnDiscountTypeIcon("Click On Discount Btn");
		
		Er_Billing.DeleteDiscountBtn("Click On Delete Discount Btn");
		Er_Billing.ReasonAndYesDeleteDiscountPop("Delete After Save " , "Delate Discount Yes Pop");
		Er_Billing.DiscountDeleteYesPop("Click On Discount Yes Popup");
		
	}
	@Test(priority = 15 ,enabled = false)
	public void DiscountOnServiceWiseDiscountTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Discount On Service Wise ", "Discount On Service Wise Test Funcility");
		
		Er_Billing.clickOnDiscountTypeIcon("Click On Discount Btn");
		
		Er_Billing.CheckBoxScheme("Scheme Check Box Un_Select"); 
		Er_Billing.CheckBoxUnSelectScheme_ServiceWiseDiscount_RadioBtn("Service Wise Discount Radio Btn");

		//Er_Billing.serviceWiseDiscountValidation("PERCENT", "25");     
		Er_Billing.serviceWiseDiscountValidation("AMOUNT", "500"); //update

		Er_Billing.SelectByDiscountHeadDrp("Staff Discount" ,"Staff Discount"); 
		Er_Billing.EnterDiscountRemarks("Anup Discount On Service Remarks");               
		Er_Billing.ClickCalcuateDiscountBtn("Click On Calculate Discount Btn");  
		Er_Billing.AlertTotalAppliedDiscountView("View Discount Value");    
		Er_Billing.SelectByAuthorisedByDrp("MOU Discount");           
	
		Er_Billing.SaveDiscountOnBill("Save Discount On Service Wise"); 
		Er_Billing.SaveServiceWiseDiscountOkPop("Ok Save Service Discount Ok Pop");
	}
	
	@Test(priority = 16 ,enabled = false)
	public void DeleteDiscountBillTest1() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Delete Discount Button", "Delete Discount Test Funcility");
		
		Er_Billing.clickOnDiscountTypeIcon("Click On Discount Btn");
		
		Er_Billing.DeleteDiscountBtn("Click On Delete Discount Btn");
		Er_Billing.ReasonAndYesDeleteDiscountPop("Delete After Save " , "Delate Discount Yes Pop");
		Er_Billing.DiscountDeleteYesPop("Click On Discount Yes Popup");
		
	}
	@Test(priority = 17 ,enabled = false)
	public void DiscountInItemWiseTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Discount In Item Wise ", "Discount In Item Wise  Test Funcility");
		
		Er_Billing.clickOnDiscountTypeIcon("Click On Discount Btn");
	
		Er_Billing.ClickOnRadioBtnItemWiseDiscount("Click Radio Btn In Item Wise Discount");
		Er_Billing.SelectServicesDrp("Registration Charges");
		
		Er_Billing.itemWiseDiscountValidation1("AMOUNT", "200");
		//Er_Billing.itemWiseDiscountValidation1("PERCENT", "30");
        Thread.sleep(1500);
		Er_Billing.DiscountPerctageServicesItem("Click On Services Plush Icon ");
		
		Er_Billing.SelectByDiscountHeadDrp("Staff Discount" ,"Staff Discount"); 
		Er_Billing.EnterDiscountRemarks("Anup Discount On Items Remarks");             
		Er_Billing.ClickCalcuateDiscountBtn("Click On Calculate Discount Btn");   
		Er_Billing.AlertTotalAppliedDiscountView("View Discount Value");   
		Er_Billing.SelectByAuthorisedByDrp("MOU Discount");            

		Er_Billing.SaveDiscountOnBill("Save Discount On Service Wise");  
		Er_Billing.SaveServiceWiseDiscountOkPop("Ok Save Service Discount Ok Pop");
	}
	
	@Test(priority = 17 ,enabled = false)
	public void FullBillSettlementReceiptCashTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Full Bill Settlement", "Bill Settlement");
	
		Er_Billing.ClickOnSettlementBtn("Click On Bill Settlement Btn");
		Er_Billing.ClickOnCashFullBillSettlement("Click On Cash Btn");
		
		Er_Billing.EnterRemarksBillSettlement("Er Bill Settlement");
		
		Er_Billing.ClickOnReceiptBtn("Click On Bill Receipt Btn");
		Er_Billing.YesBillSettlePop("Yes Bill Settle Pop");
	    Thread.sleep(1500);
	    Er_Billing.OkBillSettledReceiptNo("Settled Bill Receipt No");
		
	}
	
	@Test(priority = 18 ,enabled = false)
	public void DueBillSettlementReceiptTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Due Bill Settlement", " Due Bill Settlement");
	
		Er_Billing.ClickOnSettlementBtn("Click On Bill Settlement Btn");
		Er_Billing.ClickOnCashFullBillSettlement("Click On Cash Btn");
		
		Er_Billing.EnterLessThansettledAmount("1000");
		Er_Billing.CounterFacilityCashReceived_Returned("2000" ,"Cash to be Returned");
		
		Er_Billing.EnterRemarksBillSettlement("Er Bill Settlement");
		Er_Billing.ClickOnDueBtn("Click On Due Btn" ,"Jai Singh" ,"Due Remarks");
		
		Er_Billing.ClickOnReceiptBtn("Click On Bill Receipt Btn");
	    Er_Billing.YesBillSettlePop("Yes Bill Settle Pop");
	    Thread.sleep(1500);
	    Er_Billing.OkBillSettledReceiptNo("Settled Bill Receipt No");
	}
	
	@Test(priority = 19 ,enabled = false)
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
	
	@Test(priority = 20 ,enabled = false)
	public void BillSettledPrintReceiptNumberTest() throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Print In Bill Settled ", "Print Bill Settled Test Funcility");
		
		Er_Billing.ClickOnSettlementBtn("Click On Bill Settlement Btn");
		Er_Billing.ClickOnSettleBillPrintBtn("Click On Bill Settled Print Btn");
	
		Er_Billing.SettledReceiptNumberprintAndOkBtn(0,"Bill Settled Print Ok Btn");
		Thread.sleep(2500);
		Er_Billing.SettledReceiptNumberprintAndOkBtn(1,"Bill Settled Print Ok Btn");
		Er_Billing.CloseHISTreeBillSettledPrintPop("Click On Close Bill Settled Receipt Pop");

	}

	@Test(priority = 21 ,enabled = false)
	public void PrintInHeaderBtn()throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("Print In Heder Icon ", "Summary Bill Print Test Funcility");
		
		Thread.sleep(2000);
		Er_Billing.ClickOnHeaderPrintBtn("Click on Header Print Btn");
		Er_Billing.SummaryBillYesPop("Click On Radio Btn In Summary Bill" ,"Print Yes Pop");	
	}

	@Test(priority = 22 ,enabled = true)
	public void FRRODetailsTest()throws IOException, InvalidFormatException, InterruptedException{
		
		logger = extent.createTest("FRRO Details  ", "Save FRRO Application Number Test Funcility");
		
		Er_Billing.ClickOnFRRODetailsBtn("Click On FRRO Details Btn");
		Er_Billing.EnterFRROApplicationNoAndSave("123456" ,"Save FRRO Details Pop");
		Er_Billing.CloseFRRODetailsPop("Close FRRO Details Pop");
	}
	
    }
