/**
 * 
 */
package com.test.ipnursing.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.ipnursing.page.NursingActivityPage;
import com.test.readdata.ExcelSheetData;


/**
 * @author Anup
 *
 * 05-Aug-2025
 */
public class NursingActivityTest extends NursingActivityPage{

	public NursingActivityPage nursingactivity = new NursingActivityPage();


	@Test(priority =1, dataProvider = "DataProviderInputDataNursingActivity" , dataProviderClass = ExcelSheetData.class)

	public void nursingActivity(String facility_dropdown,String department_DropDwon)throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest(" Nursing Activity Acknowledgemen", "Nursing Activity Acknowledgemen."); 

		nursingactivity.SelectByFacilityDropDown(facility_dropdown);
		nursingactivity.clickOnNursingDashbord("Click On Nursing DashBord");
		nursingactivity.selectByDepartmentDropDwon(department_DropDwon);
		nursingactivity.ClickOnDepartmentYesPopup("Click On Department Yes Popup");
		nursingactivity.ClickOnNurisingBurtton("Nursing Activity Button");
		nursingactivity.ClickOnNurisingPage("Nursing Activity page");
		//nursingactivity.clickOnUnacknowledgedPatientsIcon("Click On Unacknowledged Patients Button");
		nursingactivity.nursingActivityTypesPatient();
		nursingactivity.enterOnSearchBoxNursingActivitiy("28526");
		Thread.sleep(500);
		
		nursingactivity.clickOnTopOneYellowPatient("Click on first not Occupied patient from the list");
		Thread.sleep(500);
		nursingactivity.clickOnTopOneGreenPatient("Click On Occupied patient");
		
	 	
		try {
		    if (nursingactivity != null) {
		        nursingactivity.saveChangeBedStatuPopup("Save Change Bed Status Popup");
		        Thread.sleep(500);
		        
		        nursingactivity.doWantSaveYesPopup("Yes Save Popup");
		        System.out.println("Bed status saved successfully.");
		    } else {
		        System.out.println("NursingActivity object is null.");
		    }
		} catch (Exception e) {
		    System.out.println("An error occurred while saving bed status: " + e.getMessage());
		    e.printStackTrace();
		}

		
		nursingactivity.saveChangeBedStatuPopup("Save Change Bed Status Popup ");
		Thread.sleep(500);
		nursingactivity.doWantSaveYesPopup("Yes Save Popup");
		
		nursingactivity.acknowledgePopup("Click On Acknowledge Button");
		
		nursingactivity.clickOnInvestigationsButton("Click On Investigation Button");
		nursingactivity.clickOnNewOrdersRadioButton("Clock On New Orders RadioButton");
		
		nursingactivity.selectOnPathologyOrdersTest("Click Pathology Radio Button","Click On Serach Check Box Button","Absolute Eosinophil Count ( AEC )" ,"Click On Pathology Test","Blood");
		
		nursingactivity.selectOnOtherTestsNewOrders("Click On other test Radio Button","2 (Radiology Services)","Click On One Other Test","Blood");
		nursingactivity.selectOnProfilesNewOrders("Click On Profiles Radio Button","Full Blood Profile<BGRTY21262>","Click On Profiles","Blood");
		nursingactivity.selectOnOrderSetNewOrders("Click On Order set Radio Button","Cardio Order Set","Click On Oder Set", "Serum");
		nursingactivity.SelectnewOrderDoctorPriorityDropdwon("anannda ji Kumar","Routine");
		
		nursingactivity.saveOnInvestigationsNewOders("Save Investigations New Order");
		nursingactivity.InvestigationInstructionCareProviderPopup("Care Provider", "Click On Save Care Provider Popup");
		nursingactivity.yespermissibleTimeRangePopup("Click On Yes permissible Time Range Popup");
		
	}

}