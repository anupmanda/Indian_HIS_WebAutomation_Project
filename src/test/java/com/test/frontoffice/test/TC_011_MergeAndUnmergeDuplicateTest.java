/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.MergeAndUnmergeDuplicatePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 16-Dec-2025
 */
public class TC_011_MergeAndUnmergeDuplicateTest extends MergeAndUnmergeDuplicatePage{

	public static MergeAndUnmergeDuplicatePage mergePatient = new MergeAndUnmergeDuplicatePage();
	MergeAndUnmergeDuplicatePage unmergePatient = new MergeAndUnmergeDuplicatePage();
	public static String GlobalSecondaryUHID;
	public static String GlobalPrimarymergedUHID;
	
	private String sheetName = "Merge_UnMerge_Patient";

	public TC_011_MergeAndUnmergeDuplicateTest() {
		super();
	}
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)	
	public void DuplicateMergePatient(String Facility_Drp , String Strion_Drp) throws InterruptedException, IOException {

		logger = extent.createTest("Merge Duplicate Patient Test" ,"This Test Case Will Verify Merge Duplicate Patient Functionality");
	
		mergePatient.selectByFacilityDropdwon(Facility_Drp);
		mergePatient.clickOnDashboardFrontOfficeBtn("Click On Front Office Dashbord", Strion_Drp, "Click On Yes Popup");
	    mergePatient.clickOnMergePatient("Click On Add Patient Menu", "Click On Merge Duplicate Page");
	   
	   // Further steps to perform merge operation can be added here
	
	    mergePatient.enterFirstNameAndSerachInMergePage("Avdesh", "Enter First Name And Click On Search Button");
	    
	    mergePatient.clickPrimaryAndPrintUHIDAndRegDate("Select Primary Radio Button And Print UHID And Registration Date");
	    mergePatient.selectSecondaryUHIDAndPrint("Secondry UHID Radio Button");
	    mergePatient.clickThridUHIDMerge("Click On Third UHID And Merge");
	    
	    GlobalSecondaryUHID = mergePatient.secondaryUHID;
        System.out.println("Stored Secondary UHID : " + GlobalSecondaryUHID);
	    mergePatient.ClickOnMergeIconSelectedUHIDs("Click On Merge Icon And Merge Selected UHIDs");
	    
	    mergePatient.getMergedInPrimaryUHIDPopup();  // Get Merged UHID from Popup
	    GlobalPrimarymergedUHID = mergePatient.getMergedInPrimaryUHIDPopup();
	    System.out.println("Primary Merged UHID Is : " + GlobalPrimarymergedUHID);
	    Thread.sleep(2000);
	    
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2)
	
	public void DuplicateUnMergePatient(String Facility_Drp , String Strion_Drp) throws InterruptedException, IOException {
		
        logger = extent.createTest("Enter Primary UHID Enter" ,"This Test Case Will Verify UnMerge Duplicate Patient Functionality");
        
        if (GlobalPrimarymergedUHID == null || GlobalPrimarymergedUHID.isEmpty()) {
            throw new RuntimeException("Secondary UHID is NULL. Merge test failed.");
        }
        
        unmergePatient.clickOnMenuBar("Click On Menu Bar");
        Thread.sleep(2000);
        unmergePatient.clickOnUnMergePatient("Click On Add Patient Menu", "Click On UnMerge Duplicate Page");
   
        unmergePatient.enterUHIDInUnmergePage(GlobalPrimarymergedUHID);
        Thread.sleep(2000);
        unmergePatient.unmergeUHIDFirst("First Check box of UHID");
		unmergePatient.clickOnUnMergeIcon("Click On UnMerge Icon");

	}
 
}
