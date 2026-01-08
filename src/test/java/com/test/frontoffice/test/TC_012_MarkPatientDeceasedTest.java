/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.MarkPatientDeceasedPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 17-Dec-2025
 */
public class TC_012_MarkPatientDeceasedTest extends MarkPatientDeceasedPage{
	
	MarkPatientDeceasedPage markPatientDeceased = new MarkPatientDeceasedPage();
	
     private final String sheetName = "Mark_Patient_Deceased";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
		
		System.out.println("====Fetching data from Excel sheet: " + sheetName +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1)
	public void markPatientDeceasedInUHID(String Facility_Drp , String Station_Drp , String Enter_uhid , String Serach_Mobile_number ,
			String Serach_Name , String Serach_DOB , String Serach_Locolity, String Serach_Gender, String Enter_Dath_Of_Date ,
			String Enter_information_Name ) throws Exception , InterruptedException {

		logger= extent.createTest("Mark Patient Deceased Test", "Mark Patient Deceased Enter UHID Test");
		markPatientDeceased.selectByFacilityDropdwon(Facility_Drp);
		markPatientDeceased.clickOnDashboardFrontOfficeBtn("Front Office Dashboard", Station_Drp,
				"Yes Popup Mark Patient Deceased");
		markPatientDeceased.clickOnBillingButton("Add Patient Menu", "Mark Patient Deceased Page");
		
		markPatientDeceased.serachPatientInUHID(Enter_uhid , "Search Patient in UHID");   //1st approach main page
	/*	
		markPatientDeceased.clickOnPlushIcon("Click on Plush Icon to open Search Popup");
		
		markPatientDeceased.enterMobileInPopup(Serach_Mobile_number , "Serach Mobile Number in Mark Patient Deceased Popup");
		markPatientDeceased.enterNameInPopup(Serach_Name , "Serach Name in Mark Patient Deceased Popup");
		markPatientDeceased.enterDOBInPopup(Serach_DOB , "Serach DOB in Mark Patient Deceased Popup");
		markPatientDeceased.enterLocalityInPopup(Serach_Locolity , "Serach Locality in Mark Patient Deceased Popup");
        markPatientDeceased.selectGenderInPopup(Serach_Gender , "Serach Name in Mark Patient Deceased Popup");
        markPatientDeceased.selectFirstPatientFromPopup("Select Searching Patient table First Row in Mark Patient Deceased Popup");
      */  
        markPatientDeceased.clickOnDeceasedCheckBox("Mark Patient as Deceased Checkbox");
        markPatientDeceased.enterDateOfDeath(Enter_Dath_Of_Date);
        		
        markPatientDeceased.enterInformedBy(Enter_information_Name);
        markPatientDeceased.clickOnSaveButtonYespopup("Click on Save Button in Mark Patient Deceased Page" ,"Yes Popup after Save Mark Patient Deceased");
        markPatientDeceased.clickOnActiveAppointmentsYespopup("Yes Popup for Active Appointments after Marking Patient Deceased");
        
        Thread.sleep(2000);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2)
	public void markPatientDeceasedInSerachPatient(String Facility_Drp , String Station_Drp , String Enter_uhid , String Serach_Mobile_number ,
			String Serach_Name , String Serach_DOB , String Serach_Locolity, String Serach_Gender, String Enter_Dath_Of_Date ,
			String Enter_information_Name ) throws Exception , InterruptedException {

		logger= extent.createTest("Mark Patient Deceased Test", "Mark Patient Deceased Serach Patient Test");
		
		Thread.sleep(2000);
		markPatientDeceased.clickOnPlushIcon("Click on Plush Icon to open Search Popup");
		
		markPatientDeceased.enterMobileInPopup(Serach_Mobile_number , "Serach Mobile Number in Mark Patient Deceased Popup");
		//markPatientDeceased.enterNameInPopup(Serach_Name , "Serach Name in Mark Patient Deceased Popup");
		//markPatientDeceased.enterDOBInPopup(Serach_DOB , "Serach DOB in Mark Patient Deceased Popup");
		//markPatientDeceased.enterLocalityInPopup(Serach_Locolity , "Serach Locality in Mark Patient Deceased Popup");
       // markPatientDeceased.selectGenderInPopup(Serach_Gender , "Serach Name in Mark Patient Deceased Popup");
        markPatientDeceased.selectFirstPatientFromPopup("Select Searching Patient table First Row in Mark Patient Deceased Popup");
        
        markPatientDeceased.clickOnDeceasedCheckBox("Mark Patient as Deceased Checkbox");
        markPatientDeceased.enterDateOfDeath(Enter_Dath_Of_Date);
        		
        markPatientDeceased.enterInformedBy(Enter_information_Name);
        markPatientDeceased.clickOnSaveButtonYespopup("Click on Save Button in Mark Patient Deceased Page" ,"Yes Popup after Save Mark Patient Deceased");
        markPatientDeceased.clickOnActiveAppointmentsYespopup("Yes Popup for Active Appointments after Marking Patient Deceased");
	}

	
}
