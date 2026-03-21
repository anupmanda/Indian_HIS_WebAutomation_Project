/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.ViewAdmission_SurgeryRequestPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 20-Mar-2026
 */
public class TC_006_ViewAdmissionSurgeryRequestTest extends ViewAdmission_SurgeryRequestPage {
	
	ViewAdmission_SurgeryRequestPage Admission_SurgeryRequest = new ViewAdmission_SurgeryRequestPage();
	
	private final String sheetName = "Er_Admission_Surgery_Request"; 

	@DataProvider(name = "ViewAdmissionSurgeryRequestDataProvider")
	public Object[][] getData() throws IOException {
		System.out.println("====Sheet Name_01: " + sheetName + "======");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ViewAdmissionSurgeryRequestDataProvider" , priority = 1 ,enabled = true)	
	public void ViewAdmissionSurgeryRequestTest(String facility_drp , String Station_drp , String Frome_Date , String To_Date , String Request_Type_Drp ,
			String Speciality_Drp , String Doctor_Drp)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("View Admission Surgery Request", "View Admission Surgery Request Test Funcility");
		Admission_SurgeryRequest.selectByFacilityDropdown(facility_drp);
		Admission_SurgeryRequest.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		Admission_SurgeryRequest.AdmissionSurgeryRequestPage("Emercency Button in side Icon","View Admission Surgery Request Page");
		Admission_SurgeryRequest.enterFromeDate(Frome_Date);

		//Admission_SurgeryRequest.enterToDate(To_Date);
		Admission_SurgeryRequest.ClickOnSearchBtn("Click On Date Wise Search Icon");
		
		Admission_SurgeryRequest.selectByRequestTypeDrp(Request_Type_Drp);
		
		
		Admission_SurgeryRequest.ClickOnSearchTable("Click On Search Table");
	}
}
