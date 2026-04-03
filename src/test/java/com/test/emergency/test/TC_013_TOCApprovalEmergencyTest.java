/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;
import javax.management.InvalidApplicationException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.emergency.page.TOCApprovalEmergencyPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 30-Mar-2026
 */
public class TC_013_TOCApprovalEmergencyTest extends TOCApprovalEmergencyPage{
	
	TOCApprovalEmergencyPage TOCApproval = new TOCApprovalEmergencyPage();
	private final String sheetName_TOC = "Er_TOC_Approval_Page";

	@DataProvider(name = "TOCApprovalDataProvider")
	public Object[][] getTOCData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_TOC + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_TOC);
	}

	@Test(dataProvider = "TOCApprovalDataProvider", priority = 1 , enabled = true)
	public void SaveTOCApprovalEmergencyTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_Er_Number ,
			String Search_TOC_Approved_From_Date , String Search_TOC_Approved_To_Date) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TOC Approval Emergency ", "TOC Approval Emergency Test Funcility");
		
		TOCApproval.SelectByFacilityDrp(Dashborad_Facility_Drp);
		TOCApproval.ClickOnErBillingDashboard("Click On Er Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		
		TOCApproval.TOCApprovelEmergencyPage("Click On Er Billing Drp"," TOC Approval Emergency Page");
		//TOCApproval.EnterIpNumber(Enter_Er_Number);
		TOCApproval.CheckAllTocPendindOrderDurg("All Pending TOC Marks Order Table Data");
		
		//TOCApproval.SelectAllCheckBox("Select All Check In TOC Marks");
		TOCApproval.SelectFirstCheckBox("Click First Check Box");
		TOCApproval.SaveTOCMarksPatient("Click On TOC Save Btn" , "Yes Pop Sufficient deposit is collected ");
		Thread.sleep(1500);
	}
	
	@Test(dataProvider = "TOCApprovalDataProvider", priority = 2 , enabled = true)
	public void CheckTOCApprovedEmergencyTest(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_Er_Number ,
			String Search_TOC_Approved_From_Date , String Search_TOC_Approved_To_Date) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Check TOC Approved Emergency ", "Date Wise TOC Approvaed Emergency Test Funcility");
		TOCApproval.FromDateFromCSearchApproved(Search_TOC_Approved_From_Date);
		TOCApproval.FromDateTOCSearchApproved(Search_TOC_Approved_To_Date);
		TOCApproval.SelectCheckBoxShowApprovedOrders("Click On Show Approved Orders Check box");
	}
}
