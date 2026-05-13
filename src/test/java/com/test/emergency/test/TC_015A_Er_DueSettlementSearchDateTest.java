/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_DueSettlementPage;
import com.test.emergency.page.Er_RegistrationPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 13-May-2026
 */
public class TC_015A_Er_DueSettlementSearchDateTest extends Er_DueSettlementPage {
	
	Er_DueSettlementPage ErDueSettlement = new Er_DueSettlementPage();
	Er_RegistrationPage Registration = new Er_RegistrationPage();
	private final String sheetName_DueSettle = "Er_DueSettlement_Page";

	@DataProvider(name = "DueSettlementDataProvider")
	public Object[][] getDueSettlementData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_DueSettle + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_DueSettle);
	}
	
	@Test(dataProvider = "DueSettlementDataProvider", priority = 1 , enabled = true)
	public void SearchErNumberAndDueSettlmentTest(String Dashborad_Facility_Drp , String ER_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date ,String Company_Drp , String Serach_Company_Frome_Date , String Serach_Company_To_Date , 
			String Enter_Due_Amount_Er_Number , String Enter_Cheque_Number , String Cheque_Issue_Date ,String Cheque_Bank_Name_Drp ,
			String Cheque_Branch_Name , String Less_Amount_Due_Amount ,String  Enter_Rounding_Off_Settlement , String Remarks_Due_Settlement) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Emergency Due Settlement Date Wise", "Search Company Search Due Settlement Test Funcility");

		ErDueSettlement.SelectByFacilityDrp(Dashborad_Facility_Drp);
		ErDueSettlement.ClickOnErDashboard("Click On Er Billing DashBorad" ,ER_Station_Drp , "Station Yes Popup");

		ErDueSettlement.ErDueSettlementPage(" Er Due Settlement Page");
		driver.navigate().refresh();
		ErDueSettlement.ClickOnCompanyBySearchButton("Click On Company By Search Btn");
		
		//ErDueSettlement.SelectByCompanyDrp(Company_Drp);
		ErDueSettlement.EnterFromeDateCompanyBy(Serach_Company_Frome_Date);
		
		ErDueSettlement.ClickSearchInDateWise("Click Serach Btn");
		ErDueSettlement.ClickOnSearchCompanyDateSubTable("Click On Due Amount In Table");
		driver.navigate().refresh();
		
		}
	@Test(dataProvider = "DueSettlementDataProvider", priority = 2 , enabled = true)
	public void EnterErNumberInChequeDueSettlementTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date ,String Company_Drp , String Serach_Company_Frome_Date , String Serach_Company_To_Date , 
			String Enter_Due_Amount_Er_Number , String Enter_Cheque_Number , String Cheque_Issue_Date ,String Cheque_Bank_Name_Drp ,
			String Cheque_Branch_Name , String Less_Amount_Due_Amount ,String  Enter_Rounding_Off_Settlement , String Remarks_Due_Settlement) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Enter Er Number Due Settlement", " Remaing Due Settlement In Cheque Test Funcility");

		ErDueSettlement.ClickOnSearchByPatientBtn("Click On Search By Parient");
		ErDueSettlement.EnterERNumber(dueSettlementERNo); 
		
		ErDueSettlement.ClickDueDetailsTable("Click On Table In Search Er Number");
		ErDueSettlement.ClickOnChequeButton("Click On Cheque Btn");
		
		ErDueSettlement.ChequeNumberIssueDateBankNameBramchName(Enter_Cheque_Number, Cheque_Issue_Date, Cheque_Bank_Name_Drp ,Cheque_Branch_Name);
		//ErDueSettlement.LessThanCurrentDueAmount(Less_Amount_Due_Amount);  //Less_Amount_Due_Amount
		
		JavascriptExecutor zoomIn = (JavascriptExecutor) driver;
		zoomIn.executeScript("document.body.style.zoom='90%'");
		ErDueSettlement.EnterDueRemarks(Remarks_Due_Settlement);
		
		Thread.sleep(1000);
		ErDueSettlement.ClickOnSaveBtnAndYespop("Save Cash On Due Button" ,"Yes Save Pop");
		Registration.handleDynamicPopup("Popup Message");
		driver.navigate().refresh();	
	}
	@Test(dataProvider = "DueSettlementDataProvider", priority = 3 , enabled = true)
	public void PrintReciptNumberTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Find_Patient_Frome_Date ,
			String Find_Patient_To_Date ,String Company_Drp , String Serach_Company_Frome_Date , String Serach_Company_To_Date , 
			String Enter_Due_Amount_Er_Number , String Enter_Cheque_Number , String Cheque_Issue_Date ,String Cheque_Bank_Name_Drp ,
			String Cheque_Branch_Name , String Less_Amount_Due_Amount ,String  Enter_Rounding_Off_Settlement , String Remarks_Due_Settlement) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Enter Er Number Due Settlement", " Due Settlement In Cash Test Funcility");

		ErDueSettlement.ClickOnSearchByPatientBtn("Click On Search By Parient");
		ErDueSettlement.EnterERNumber(dueSettlementERNo); 
		
		ErDueSettlement.ClickOnDueSettledPrintBtn("Click On Print Btn");
		ErDueSettlement.SelectByReceiptNoDrpAndYesPop(0 ,"Print Recipt Number Yes Pop");
	
		
	}
}
