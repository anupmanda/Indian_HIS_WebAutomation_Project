/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FoBillsUtilityPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 16-Dec-2025
 */
public class FoBillsUtilityTest extends FoBillsUtilityPage{
	
	FoBillsUtilityPage billsUtility = new FoBillsUtilityPage();
	private final String sheetName = "Fo_Bills_Utility";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)
	public void billsUtilityTest(String Facility_Drp , String Station_Drp) throws Exception {

		logger= extent.createTest("Bills Utility Test", "Bills Utility Functionality Test");
		billsUtility.selectByFacilityDropdwon(Facility_Drp);
		billsUtility.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp, "Yes Popup Bills Utility");
		billsUtility.clickOnBillingButton("Billing", "Bills Utility");
		
		billsUtility.serachPatientInUHID("SPSL.885058" , "Search Patient in UHID");   //1st approach
		billsUtility.handleApprovalRequestAgainstPopup("Approval Request Against Popup after UHID Search");
	/*	
		billsUtility.clickOnSerachIcon("Search Icon in Bills Utility");   //2nd approach
		
		//-----patient select from popup--------------
		
		//billsUtility.enterSerachPatientInUHISPopup("SPSL.883437" , "Search Patient in UHID Popup");   //3rd approach
		
		billsUtility.clickOnShowIPBillDetailsCheckbox("Show IP Bill Details Checkbox");
		billsUtility.clickOnDateCheckBox("Click on Date Checkbox");
		billsUtility.enterFromDateAndToDateInPopup("01-Jun-2025" , "17/Dec/2025" , " Serach From Date and To Date in Popup");
		billsUtility.selectFirstPatientFromPopup("Select Searching Patient table First Row");    //4th approach
	*/	
		billsUtility.clickOnRefundButton("Click on Refund Button in Bills Utility");
		billsUtility.clickOnCheckedAllInPopup("Click on Checked All in Refund Popup");
		billsUtility.enterRefundUserNameAndPassword("SAKTI" , "Anup@123" );	
		billsUtility.selectRefundReasonFromDropdownAndRemaks("Doctor Not Available" , "Select Refund Reason Dropdown");
		billsUtility.clickOnRefundApprovedButton("Click on Refund Approved Button");
		
		//billsUtility.clickOnSendApprovalRequestButton("Click on Send Approval Request Button for Limit Request");
		
		billsUtility.selectBillsUtilityReasonFromDropdownAndRemaks("Doctor Not Available" , "Select Refund Reason Dropdown");
		billsUtility.clickOnSaveButtonAndYesPopup("Refund Save Button " ,"YesPopup after Refund Save Button");
		
	}

}
