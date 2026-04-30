/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 29-Apr-2026
 */
public class ER_Order_PainAssessmentPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Order_page = "//a[contains(text(),'ER Order')]";

	//=========================Nursing  Endorsement Tool =============================
	protected static String N_Notes = "//a[@title='Nurse Notes']";
	protected static String pain_Assessment_Btn = "//input[@id='btnPainAssesmentNN']";

	//=============================== Pain Assesment ===============================
	protected static String Date_Time = "//input[@id='dtpdatetime']";
	protected static String Precipitating_Factor_Drp = "//select[@id='cmbPrecipitatingFactor']";
	protected static String Type_Pain_Drp = "//select[@id='CmbTypeOfPain']";
	protected static String Location_Drp = "//select[@id='txtLocation']";
	protected static String Pain_Score_Drp = "//select[@id='CmbPainScor']";
	protected static String No_Patin_Check_Box = "//input[@id='ChkNoPain']";
	protected static String Muscle_Power_Grading_Drp = "//select[@id='CmbMPGDrp']";
	protected static String Sedation_Score_Drp = "//select[@id='CmbSESDrp']";
	protected static String Nausea_Vomiting_Score_Drp = "//select[@id='CmbNVSDrp']";
	protected static String Frequency_Drp = "//select[@id='CmbFreqecy']";
	protected static String Remarks_Text = "//input[@id='txtRemarks']";
	protected static String Duration_Text = "//input[@id='txtDuration']";
	protected static String Location_Remarks_Text = "//input[@id='txtlocmark']";
	protected static String Aggravating_Factors_Text = "//input[@id='txtaggravation']";
	protected static String Relieving_Factors_Text = "//input[@id='txtrelativefact']";

	//============================= Save Pain Assessment ===============================
	protected static String Save_Pain_Assessment_Btn = "//i[@id='btnSavePain']";
	protected static String Save_Pain_Assessment_Yes_Pop = "//a[@id ='btn_yes_notify']";

	// ========================= Intervention Details =============================
	protected static String Post_Intervention_Score_Drp = "//select[@id='CmbPostInven']";
	protected static String Intervention_Text = "//textarea[@id='txtIntervention']";
	protected static String Outcome_Text = "//textarea[@id='txtOutcome']";

	protected static String Intervention_Save_Btn = "//i[@id='btnSaveInterven']";
	protected static String Intervention_Verify_Btn = "//i[@id='btnVerifyInterven']";
	
	//============================ After Save Btn In Sun Table ============================
	protected static String Pain_Assesment_Sub_Table = "//table[@id='tblPainAssessment']//tbody//tr[last()]";
	protected static String Pain_Assesment_Sub_Table_View_Icon = "//table[@id='tblPainAssessment']//tbody//tr[last()]//i[@class ='fa fa-search']";
	
   //================================= Intervention ===================================
	protected static String Intervention_Sub_Table = "//table[@id='tblIntervention']//tbody//tr[last()]";


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
	public void ClickOnpainAssessmentlBtn(String pain_Assessment) throws IOException, InterruptedException { 

		WebDriverWait Search = new WebDriverWait( driver, Duration.ofSeconds(5));
		Search.until(ExpectedConditions.elementToBeClickable(By.xpath(pain_Assessment_Btn)));
		CommanUtill.clickTabSwitchToAnotherWindowNew(pain_Assessment_Btn, pain_Assessment);
	}
	//=============================== Pain Assesment ===============================
	public void painAssessment_PrecipitatingFactor_TypeOfPain_Laction_PainScoreFrequencyDrp(String PrecipitatingFactor , String TypePain ,String Laction ,
			String PainScore , String Frequency) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Precipitating_Factor_Drp, PrecipitatingFactor);
		CommanUtill.dropdownSelectByVisibleText(Type_Pain_Drp, TypePain);
		CommanUtill.dropdownSelectByVisibleText(Location_Drp, Laction);
		CommanUtill.dropdownSelectByVisibleText(Pain_Score_Drp, PainScore);
		CommanUtill.dropdownSelectByVisibleText(Frequency_Drp, Frequency);

	}
	public void painAssessmentOtherInformationDetails(String MPG_Drp , String SedationScore ,String  VomitingScore_Drp ,
			String Remarks , String Duration , String Laction_Remarks , String Aggravating_Factors , String Relieving_Factors) 
					throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Muscle_Power_Grading_Drp, MPG_Drp);
		CommanUtill.dropdownSelectByVisibleText(Sedation_Score_Drp, SedationScore);
		CommanUtill.dropdownSelectByVisibleText(Nausea_Vomiting_Score_Drp, VomitingScore_Drp);
		CommanUtill.textEnter(Remarks_Text, Remarks);
		CommanUtill.textEnter(Duration_Text, Duration);

		CommanUtill.textEnter(Location_Remarks_Text, Laction_Remarks);
		CommanUtill.textEnter(Aggravating_Factors_Text, Aggravating_Factors);
		CommanUtill.textEnter(Relieving_Factors_Text, Relieving_Factors);
	}
	//============================= Save Pain Assessment ===============================
	public void ClickOnSavePainAssessmentBtnYesPop(String Save_Icon ,String  Yes_Pop) throws IOException, InterruptedException { 

		WebDriverWait Save = new WebDriverWait( driver, Duration.ofSeconds(5));
		Save.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Pain_Assessment_Btn)));
		CommanUtill.clickFunction(Save_Pain_Assessment_Btn, Save_Icon);
		Thread.sleep(1000);
		CommanUtill.clickFunction(Save_Pain_Assessment_Yes_Pop, Yes_Pop);
	}
	// ========================= Intervention Details =============================
	
	public void InterventionDetailsInformation(String Postintervention_score , String Intervention , String Outcome)
			throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Post_Intervention_Score_Drp, Postintervention_score);
		CommanUtill.textEnter(Intervention_Text, Intervention);
		CommanUtill.textEnter(Outcome_Text, Outcome);
	}
	public void InterventionSaveBtn(String save) 	throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Intervention_Save_Btn)));
		CommanUtill.clickFunction(Intervention_Save_Btn, save);
	}
	public void InterventionVerifyIcon(String Verify_Icon) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Intervention_Verify_Btn)));

	    // Scroll to element
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);

	    // Wait until clickable after scroll
	    wait.until(ExpectedConditions.elementToBeClickable(element));

	    // Click using your framework
	    CommanUtill.clickFunction(Intervention_Verify_Btn, Verify_Icon);
	}

	//============================ After Save Btn In Sun Table ============================
	
	public void PainAssesmentSubTable(String view_Icon) throws IOException, InterruptedException {

	    logger.info("===== Pain Assessment Sub Table Row Data =====");
	    System.out.println("===== Pain Assessment Sub Table Row Data =====");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    //  Wait for last row to be visible
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Pain_Assesment_Sub_Table)));
	    String rowData = driver.findElement(By.xpath(Pain_Assesment_Sub_Table)).getText().replace("\n", " | ");

	    String finalData = "===== Pain Assessment Sub Table Row Data ===== | " + rowData;

	    // Print in console + logger (single line)
	    System.out.println(finalData);
	    logger.info(finalData);

	    //  Click View Icon
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Pain_Assesment_Sub_Table)));
	    CommanUtill.clickFunction(Pain_Assesment_Sub_Table, view_Icon);
	}
	
	public void PainAssesmentSubTableView(String view_Icon) throws IOException, InterruptedException {

	    logger.info("===== Pain Assessment Sub Table Row Data =====");
	    System.out.println("===== Pain Assessment Sub Table Row Data =====");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Pain_Assesment_Sub_Table)));
	    String rowData = driver.findElement(By.xpath(Pain_Assesment_Sub_Table)).getText().replace("\n", " | ");

	    String finalData = "===== Pain Assessment Sub Table Row Data ===== | " + rowData;

	    // Print in console + logger (single line)
	    System.out.println(finalData);
	    logger.info(finalData);

	    //  Click View Icon
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Pain_Assesment_Sub_Table_View_Icon)));
	    CommanUtill.clickFunction(Pain_Assesment_Sub_Table_View_Icon, view_Icon);
	}

//============================= Intervention  ==================================

	public void InterventionSubTableVew(String Intervention_Sub) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Intervention_Sub_Table)));
		String First_Row = driver.findElement(By.xpath(Intervention_Sub_Table)).getText();
		logger.info("================= Intervention Sub Table  ====================");
		logger.info(First_Row);
		System.out.println("Intervention Sub Table : " + First_Row);

		   CommanUtill.clickFunction(Intervention_Sub_Table, Intervention_Sub);
	 
	}

}
