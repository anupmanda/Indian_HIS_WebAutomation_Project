/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 30-Apr-2026
 */
public class Er_Order_NurseCarePlanPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Order_page = "//a[contains(text(),'ER Order')]";

	//=========================Nursing  Endorsement Tool =============================
	protected static String N_Notes = "//a[@title='Nurse Notes']";
	protected static String Nurse_Care_Plan_Page = "//input[@id='btnNurseCarePlan']";

	protected static String Nursing_Assessment_Drp = "//select[@id='_drpNurseAssesment']";
	protected static String Problem_Identified_Drp = "//select[@id='_drpProblemModified']";
	protected static String Goal_Drp = "//select[@id='_drpGoal']";
	protected static String Intervention_Drp = "//select[@id='_drpIntervention']";
	protected static String Implementation_Drp = "//select[@id='_drpImplementation']";
	protected static String Outcome_Drp = "//select[@id='_drpOutcome']";
	protected static String Special_Notes_Drp = "//select[@id='_drpSpecialNotes']";

	protected static String Add_Nurse_Care_Plan= "//i[@id='btnAddItem']";
	protected static String Refresh_Nurse_Care_Plan= "//i[@id='btnClearData']";
	protected static String Save_Nurse_Care_Plan= "//a[@id='save']";
	protected static String Vrify_Nurse_Care_Plan= "//a[@id=\"verifyIcon\"]";
    //===================== Table =============================================
	protected static String Click_After_Add_Nurse_Care_Plne_Sub_Table = "//table[@id='tblNurseCarePlanDetail']//tbody//tr[last()]";
	protected static String Click_After_Add_Nurse_Care_Plne_Sub_Table_Error_Marks = "//table[@id='tblNurseCarePlanDetail']//tbody//tr[last()]//td[@ctype='MarkedAsError']//i";
	protected static String Click_After_Save_Nurse_Care_Plne_Sub_Table = "//table[@id='tblNurseCarePlanDetail']//tbody//tr[position()=1]";
	protected static String Yes_mark_error = "//a[@id='btnerryes']";


	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEmercencyErOrder(String emergency_btn, String Er_Order ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, emergency_btn);
		CommanUtill.clickFunction(Er_Order_page, Er_Order);
	}
	public void ClickOnNursNotesBtn(String Nurse_Notes)throws IOException, InterruptedException { 

		WebDriverWait notes = new WebDriverWait( driver, Duration.ofSeconds(5));
		notes.until(ExpectedConditions.elementToBeClickable(By.xpath(N_Notes)));
		CommanUtill.clickFunction(N_Notes, Nurse_Notes);
	}
	public void ClickOnNurseCarePlanPage(String NurseCarePlan) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Nurse_Care_Plan_Page)));
		CommanUtill.clickTabSwitchToAnotherWindowNew(Nurse_Care_Plan_Page, NurseCarePlan);
	}
	//============================== Nurse Care Plan ==================================
	public void AllTypesOfNurseCarePlanDrp(int Assessment ,int Identified ,int Goal ,int Intervention ,
			int Implementation, int Outcome , int Special ) throws IOException, InterruptedException { 
		
		CommanUtill.dropdownSelectByIndex(Nursing_Assessment_Drp, Assessment);
		CommanUtill.dropdownSelectByIndex(Problem_Identified_Drp, Identified);
		CommanUtill.dropdownSelectByIndex(Goal_Drp, Goal);
		CommanUtill.dropdownSelectByIndex(Intervention_Drp, Intervention);
		CommanUtill.dropdownSelectByIndex(Implementation_Drp, Implementation);
		CommanUtill.dropdownSelectByIndex(Outcome_Drp, Outcome);
		CommanUtill.dropdownSelectByIndex(Special_Notes_Drp, Special);	
	}
	public void AddOnNursCarePlane(String Add_Care_Plane)throws IOException, InterruptedException { 

		WebDriverWait notes = new WebDriverWait( driver, Duration.ofSeconds(5));
		notes.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_Nurse_Care_Plan)));
		CommanUtill.clickFunction(Add_Nurse_Care_Plan, Add_Care_Plane);
	}
	//=============================== Table ========================================
	public void AddNurseCarePlneSubTableErrorMarksIcon(String Error_Marks) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Click_After_Add_Nurse_Care_Plne_Sub_Table)));

		String rowData = driver.findElement(By.xpath(Click_After_Add_Nurse_Care_Plne_Sub_Table)).getText().replace("\n", " | ");

		String finalData = "===== Nurse Care Plne Sub Table Row Data ===== | " + rowData;
		System.out.println(finalData);
		logger.info(finalData);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_After_Add_Nurse_Care_Plne_Sub_Table_Error_Marks)));
		CommanUtill.clickFunction(Click_After_Add_Nurse_Care_Plne_Sub_Table_Error_Marks, Error_Marks);
	}
	public void CurrentillySaveSubTablCarePlane (String Click_Row_Show_Above_Table) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Click_After_Save_Nurse_Care_Plne_Sub_Table)));
		CommanUtill.clickFunction(Click_After_Save_Nurse_Care_Plne_Sub_Table, Click_Row_Show_Above_Table);
	}
	
	public void MarkErrorYesPop(String Yes_Pop) throws IOException, InterruptedException {
		
		if(CommanUtill.isElementPresent(Yes_mark_error)) {
			CommanUtill.clickFunction(Yes_mark_error, Yes_Pop);
			System.out.println("Yes To Markes Appared Popup");
		}
		else {
			System.out.println("Did Not Appared Yes To Markes Popup");
		}
		}
	public void ClickOnSaveBtn(String save)throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Nurse_Care_Plan)));
		CommanUtill.clickFunction(Save_Nurse_Care_Plan, save);
	}
	public void ClickOnVerifyBtn(String verify)throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Vrify_Nurse_Care_Plan)));
		CommanUtill.clickFunction(Vrify_Nurse_Care_Plan, verify);
	}
	

}
