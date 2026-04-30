/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 27-Apr-2026
 */
public class EndorsementToolPage extends GeneralBrowserSetting {


	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Order_page = "//a[contains(text(),'ER Order')]";

	//=========================Nursing  Endorsement Tool =============================
	protected static String N_Notes = "//a[@title='Nurse Notes']";
	protected static String Endorsement_Tool_Btn = "//input[@id='btnEndorsementToolNN']";

	protected static String Shift_Drp = "//select[@id='ddlnewshift']";
	protected static String Diagnosis_Text = "//textarea[@id='txadiagold']";
	protected static String Click_Allergy_Btn = "//i[@id='btnallergyold']";
	//======================== Allergies Btn ===========================
	protected static String Click_Drug_Radio_Btn = "//input[@id='radio_Drug']";
	protected static String Click_Food_Radio_Btn = "//input[@id='radio_Food']";
	protected static String Click_Other_Radio_Btn = "//input[@id='radio_Others']";
	protected static String Allergies_Drp = "//select[@id='allergy_desc']";

	//========================== Reaction ============================
	protected static String Reaction_Drp = "//select[@id='allergy_reaction']";

	//========================== Since ============================
	protected static String Since_Text = "//input[@id='allergy_since_no']";
	protected static String Since_Drp = "//select[@id='allergy_since_type']";

	//====================== Severity ===========================
	protected static String Click_High_Radio_Btn = "//input[@id='radio_High']";
	protected static String Click_Moderate_Radio_Btn = "//input[@id='radio_Moderate']";
	protected static String Click_Mild_Radio_Btn = "//input[@id='radio_Mild']";
	protected static String Click_Not_Known_Radio_Btn = "//input[@id='radio_NotKnown']";

	//============================= Source ===============================
	protected static String Click_Observed_Radio_Btn = "//input[@id='radio_observed']";
	protected static String Click_Informed_Radio_Btn = "//input[@id='radio_informed']";

	//=================== ============================ =============================== 
	protected static String No_Known_Allergies = "//input[@id='allergy_flag']";
	protected static String Add_Row = "//a[@id='add_allergy_row']";

	//======================= Sub Table Allergies ==========================
	protected static String Allergy_Sub_Tabe = "//table[@id='allergy_table']//tbody//tr[last()]";
	protected static String Allergy_Status_Sub_Table_Drp = "//table[@id='allergy_table']//tbody//tr[last()]//select";
	protected static String Allergy_Remarks_Sub_Table_Drp = "//table[@id='allergy_table']//tbody//tr[last()]//input";

	protected static String Allergy_Remarks = "//input[@id='text_remark']";
	protected static String Save_Allergy = "//i[@id='save_allergy']";
	protected static String Close_Allergy_Pop = "//*[@id=\"btnurlpopup\"]";

	//====================== Identification Check Box =========================

	protected static String ID_Band_with_Correct_Drp_name = "//select[@id='ddlidold']";
	protected static String Vulnerable_Check_Box = "//input[@id='chkvulold']";
	protected static String Infectious_Check_Box = "//input[@id='chkintrold']";

	//================================ Background ==================================
	protected static String Click_Past_Medical_History = "//i[@id='btnamedcialold']";
	protected static String Click_Past_Surgical_History = "//i[@id='btnasurglold']";
	protected static String Click_OBG_History = "//i[@id='btnobgold']";
	protected static String Close_Background_Pop = "//div[@class='modal-header']//button[@id='btnclosepush']";

	//======================== Situation Chief Complaints =====================

	protected static String Click_Chief_Complaints = "//i[@id='btnchiefold']";
	protected static String Click_Chief_Complaints_Add_Row = "//a[@id='addnewrow']";

	protected static String Chief_Complaints_Sub_Table = "//table[@id='chief_complaints_table']//tbody//tr[last()]";
	protected static String Chief_Complaints_Sub_Table_Description_Search = "//table[@id='chief_complaints_table']//tr[last()]//td[1]//input";
	protected static String Chief_Complaints_Sub_Table_Description_Value = "(//table[@id='chief_complaints_table']//tr[last()]//ul[contains(@class,'auto_search_list')]/li)[4]";

	protected static String Click_Chief_Complaints_Acuity_Drp = "//table[@id='chief_complaints_table']//tbody//tr[last()]//select[@id ='acquity1']";
	protected static String Click_Chief_Complaints_Characteristics = "//table[@id='chief_complaints_table']//tbody//tr[last()]//input[@ctype = 'characteristics']";
	protected static String Click_Chief_Complaints_Duration_No = "//table[@id='chief_complaints_table']//tr[last()]//input[starts-with(@id,'no')]";
	protected static String Click_Chief_Complaints_Duration_Drp = "//table[@id='chief_complaints_table']//tr[last()]//select[starts-with(@id,'since_type')]";
	protected static String Click_Chief_Complaints_Aggravating_Factors = "//table[@id='chief_complaints_table']//tbody//tr[last()]//input[@id='agg_factors1']";
	protected static String Click_Chief_Complaints_Relieving_Factors = "//table[@id='chief_complaints_table']//tbody//tr[last()]//input[@id='relief_factors1']";
	protected static String Click_Chief_Complaints_Meds_Taken = "//table[@id='chief_complaints_table']//tbody//tr[last()]//input[@id='meds_taken1']";
	protected static String Click_Chief_Complaints_Effect_Drp = "//table[@id='chief_complaints_table']//tr[last()]//select[starts-with(@id,'effect')]";
	protected static String Click_Chief_Complaints_Status_Drp = "//table[@id='chief_complaints_table']//tbody//tr[last()]//select[@id='status1']";
	protected static String Click_Chief_Complaints_Remarks = "//table[@id='chief_complaints_table']//tbody//tr[last()]//input[@id='remark1']";

	protected static String Save_Chief_Complaints = "//i[@id='save_chief_complaints']";
	protected static String Close_Chief_Complaints_Pop = "//a[@id='btnurlpopup']//i[@class='fa fa-times']";
	//================================ Delete Chief Complaints ==========================================
	protected static String Delete_Chief_Complaints_sub_Table = "//table[@id='chief_complaints_table']//tbody//tr[position()=1]//i";

	//=================================== Endorsement Tool Hospitalisation Information ======================

	protected static String Day_Hospitalisation_Date = "//input[@id='txtdayold']";
	protected static String Post_Op_days = "//input[@id='txtpostold']";
	protected static String Name_Surgery = "//input[@id='txtsurgold']";
	protected static String Surgery_Date = "//input[@id='txtsurgdateold']";

	//============================== vitals ===================================
	protected static String Click_Vitals_Plush_Icon = "//i[@id='btnvitalold']";
	protected static String Save_Vitals_Pop_Btn = "//a[@id='btnsavevital']";
	protected static String Copy_Vitals_Pop_Btn = "//a[@id='Copytxt']";
	protected static String Close_Vitals_Pop_Btn= "//a[@id='btnurlpopup']";

	//========================== Assessment & Skin Integrity ===========================
	protected static String Pain_Score = "//input[@id='txtpainold']";
	protected static String Location_Text = "//input[@id='txtlocold']";
	protected static String Edema_Dropdown = "//select[@id='ddledemaold']";
	protected static String Yes_Mention_ite = "//input[@id='txtmentold']";
	protected static String Skin_Intact_Dropdown = "//select[@id='ddlskiold']";
	protected static String Pressure_Ulcer_Dropdown = "//select[@id='ddlulcerold']";
	protected static String Yes_Inside_Outside = "//select[@id='ddlinsideold']";
	protected static String Pressure_Ulcer_Status_Dropdown = "//select[@id='ddlstatusulcerold']";
	protected static String Remarks_Field = "//textarea[@id='txaRemarks1']";

	//=========================== Central Nervous System ==============================
	protected static String Central_Nervous_System_Drp  = "//select[@id='ddlcentralold']";
	protected static String Restraint_Drp = "//select[@id='ddlrestraintold']";
	protected static String Eyes_Open_Drp = "//select[@id='ddlEyesOpenSave']";
	protected static String Best_Verbal_Response_Drp = "//select[@id='VrblRespSave']";
	protected static String Best_Motor_Response_Drp = "//select[@id='ddlMotrRespSave']";

	//============================= Any Other Instruction ================================
	protected static String Referral_Any = "//input[@id='txtreferralold']";
	protected static String Seen_Drp = "//select[@id='ddlseenold']";
	protected static String Doctor_Name_Text = "//input[@id='txtdoctorold']";
	protected static String Any_Special_Instructions = "//textarea[@id='txtaspecialold']";

	//====================== Recommendations ============================
	protected static String Recommendations_General_condition_Drp = "//select[@id='ddlgeneralold']";
	protected static String Recommendations_Login_Id = "//input[@id='txtloginid']";
	protected static String Recommendations_Password = "//input[@id='txtpswd']";
	protected static String Recommendations_Yes_Icon = "//i[@id='btnusrok']";

	//========================= Save ======================================

	protected static String Save_EndorsementTool_Btn = "//i[@class='fa fa-save']";
	//==================================== Verify =====================================
	protected static String Verify_Btn = "//a[@id='btnverifyndorsement']";
	protected static String Handover_Yes_Pop = "//a[@id='btn_verfyendorse']";



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

		WebDriverWait Search = new WebDriverWait( driver, Duration.ofSeconds(5));
		Search.until(ExpectedConditions.elementToBeClickable(By.xpath(N_Notes)));
		CommanUtill.clickFunction(N_Notes, Nurse_Notes);
	}
	public void ClickOnEndorsementToolBtn(String Endorsement) throws IOException, InterruptedException { 

		WebDriverWait Search = new WebDriverWait( driver, Duration.ofSeconds(5));
		Search.until(ExpectedConditions.elementToBeClickable(By.xpath(Endorsement_Tool_Btn)));
		CommanUtill.clickTabSwitchToAnotherWindowNew(Endorsement_Tool_Btn, Endorsement);
	}
	//======================== EndorsementTool =========================

	public void SelectByShiftDrp(String Shift) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Shift_Drp, Shift);
	}
	public void EnterDiagnosisText(String Diagnosis) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Diagnosis_Text, Diagnosis);
	}
	public void ClickOnAllergyPlushBtn(String Allergy_Plush) throws IOException, InterruptedException { 

		WebDriverWait Search = new WebDriverWait( driver, Duration.ofSeconds(5));
		Search.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Allergy_Btn)));
		CommanUtill.clickFunction(Click_Allergy_Btn, Allergy_Plush);
	}
	//====================== Allergies Information ============================
	public void DrugRadioBtn(String Drug) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Switch to iframe
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeurl")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("radio_Drug")));
		CommanUtill.clickFunction(Click_Drug_Radio_Btn, Drug);

		// Switch back
		driver.switchTo().defaultContent();
	}
	public void FoodRadioBtn(String Food ) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeurl")));
		WebElement check_Box = driver.findElement(By.xpath(Click_Food_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_Food_Radio_Btn, Food);
		driver.switchTo().defaultContent();
	}
	public void OtherRadioBtn(String Other ) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeurl")));
		WebElement check_Box = driver.findElement(By.xpath(Click_Other_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_Other_Radio_Btn, Other);
		driver.switchTo().defaultContent();
	}
	public void SelectByAllergiesDrp(String Allergies) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeurl")));
		CommanUtill.dropdownSelectByVisibleText(Allergies_Drp, Allergies);
	}

	//====================== Reaction =====================
	public void SelectByAllergyReactionDrp(String Reaction) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Reaction_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Reaction_Drp, Reaction);
	}
	//=========================== Since ============================
	public void SelectByAllergySinceDrp(String Since_Value , String Since) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Since_Drp)));
		CommanUtill.textEnter(Since_Text, Since_Value);
		CommanUtill.dropdownSelectByVisibleText(Since_Drp, Since);
	}
	//========================= Severity =============================
	public void SeverityHighRadioBtn(String High ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Click_High_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_High_Radio_Btn, High);
	}
	public void SeverityModerateRadioBtn(String Moderate ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Click_Moderate_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_Moderate_Radio_Btn, Moderate);
	}
	public void SeverityMildRadioBtn(String Mid ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Click_Mild_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_Mild_Radio_Btn, Mid);
	}
	public void SeverityNotKnoeRadioBtn(String Not_Know ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Click_Not_Known_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_Not_Known_Radio_Btn, Not_Know);
	}
	//============================== Source =============================	

	public void SourceObservedRadioBtn(String Observed ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Click_Observed_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_Observed_Radio_Btn, Observed);
	}
	public void SourceInformedRadioBtn(String Informed ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Click_Informed_Radio_Btn));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Click_Informed_Radio_Btn, Informed);
	}

	//============================== Add Allergies  =============================	

	public void NoKnowAllergiesCheckBox(String Ckk_box ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(No_Known_Allergies));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(No_Known_Allergies, Ckk_box);
	}
	public void AddRowAllergiesBtn(String Add_On_Row) throws IOException , InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_Row)));
		CommanUtill.clickFunction(Add_Row, Add_On_Row);
	}
	//========================= Add On Row In Allergies Table ===========================

	public void SelectAllergyStatusAndRemarksInSubTable(int Staus , String Remarks) throws IOException , InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Allergy_Sub_Tabe)));
		String First_Row = driver.findElement(By.xpath(Allergy_Sub_Tabe)).getText();

		logger.info("================= Search Patient In Table ====================");
		logger.info(First_Row);
		System.out.println("First Row Due Settlement Table : " + First_Row);

		CommanUtill.dropdownSelectByIndex(Allergy_Status_Sub_Table_Drp, Staus);
		CommanUtill.textEnter(Allergy_Remarks_Sub_Table_Drp, Remarks);
	}
	public void EnterAllergyRemaksText(String Remarks) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Allergy_Remarks, Remarks);
	}
	public void ClickOnSaveAllergyBtn(String Save) throws IOException, InterruptedException { 

		WebDriverWait save_Icon = new WebDriverWait( driver, Duration.ofSeconds(5));
		save_Icon.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Allergy)));
		CommanUtill.clickFunction(Save_Allergy, Save);
	}
	public void CloseAllergyPop (String close_pop) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		try {
			// Step 1: Wait for visible close button
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@id='dvurlshow']//a[@id='btnurlpopup']")
					));

			// Step 2: Trigger REAL click event (important)
			((JavascriptExecutor) driver).executeScript(
					"var evt = new MouseEvent('click', {bubbles:true, cancelable:true}); arguments[0].dispatchEvent(evt);",
					ele
					);

			logger.info("Popup Closed using dispatchEvent");

		} catch (Exception e) {

			logger.info("Normal close failed, applying force close");

			// Fallback 1: Hide popup
			((JavascriptExecutor) driver).executeScript(
					"document.getElementById('dvurlshow').style.display='none';"
					);

			//  Fallback 2: Remove overlay if blocking
			((JavascriptExecutor) driver).executeScript(
					"document.body.classList.remove('modal-open');" +
							"document.querySelectorAll('.modal-backdrop').forEach(e => e.remove());"
					);

			logger.info("Popup force closed");
		}
	}
	public void CloseAllergyPop1 (String Close_Icon) throws IOException, InterruptedException { 

		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		CommanUtill.clickByJSFunction(Close_Allergy_Pop, Close_Icon);   
	}
	//====================== Identification Check Box =========================

	public void IDBandWithCorrectNameUHIDNo(String UHID_No_Drp ) throws IOException , InterruptedException{

		CommanUtill.dropdownSelectByVisibleText(ID_Band_with_Correct_Drp_name, UHID_No_Drp);
	}
	public void VulnerableCheckBox(String Vulnerable ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Vulnerable_Check_Box));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Vulnerable_Check_Box, Vulnerable);
	}
	public void InfectiousCheckBox(String Infectious ) throws IOException , InterruptedException{

		WebElement check_Box = driver.findElement(By.xpath(Infectious_Check_Box));
		if(! check_Box.isSelected())
			CommanUtill.clickFunction(Infectious_Check_Box, Infectious);
	}

	//========================== Background Check =================================

	public void ReviewedPastMedicalHistoryAndClose(String Medical_History , String Close) throws IOException, InterruptedException { 

		WebDriverWait History = new WebDriverWait( driver, Duration.ofSeconds(5));
		History.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Past_Medical_History)));
		CommanUtill.clickFunction(Click_Past_Medical_History, Medical_History);
		Thread.sleep(800);
		CommanUtill.clickFunction(Close_Background_Pop, Medical_History);
	}
	public void ReviewedPastSurgicalHistoryAndClose(String SurgicalHistory , String Close) throws IOException, InterruptedException { 

		WebDriverWait History = new WebDriverWait( driver, Duration.ofSeconds(5));
		History.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Past_Surgical_History)));
		CommanUtill.clickFunction(Click_Past_Surgical_History, SurgicalHistory);
		Thread.sleep(800);
		CommanUtill.clickFunction(Close_Background_Pop, Close);
	}
	public void ReviewedOBGHistoryAndClose(String OBGHistory , String Close) throws IOException, InterruptedException { 

		WebDriverWait History = new WebDriverWait( driver, Duration.ofSeconds(5));
		History.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_OBG_History)));
		CommanUtill.clickFunction(Click_OBG_History, OBGHistory);
		Thread.sleep(800);

		if(CommanUtill.isElementPresent(Close_Background_Pop)) {
			CommanUtill.clickFunction(Close_Background_Pop, Close);
			System.out.println("OBG History Pop Appared");
		}
		else {
			System.out.println("OBG History Pop Not Appared");
		}
	}
	//======================== Situation Chief Complaints =====================
	public void ClickOnChiefComplaintsPlushBtn(String Complaints_Plush_Btn) throws IOException, InterruptedException { 


		WebDriverWait plush = new WebDriverWait( driver, Duration.ofSeconds(5));
		plush.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Chief_Complaints)));
		CommanUtill.clickFunction(Click_Chief_Complaints, Complaints_Plush_Btn);
	}
	public void ClickOnAddRowChiefComplaints (String Add_Row) throws IOException, InterruptedException { 

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeurl']")));   //
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeurl")));
		Thread.sleep(1000);
		CommanUtill.clickFunction(Click_Chief_Complaints_Add_Row, Add_Row);
		driver.switchTo().defaultContent();

	}
	//===========================   Add Row Table  ===============================

	public void  ChiefComplaintsTableAddInRow (String Chief_Complaints) throws IOException , InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeurl")));
		String Add_Row = driver.findElement(By.xpath(Chief_Complaints_Sub_Table)).getText();
		System.out.println("========== Chief Complaints Sub Table ==========");
		logger.info("==================  Chief Complaints Sub Tablee ====================");
		logger.info(Add_Row);
		System.out.println("Sales Consumption Table : " + Add_Row);
	}

	public String getChiefComplaintValueXpath(String value) {
		return "//table[@id='chief_complaints_table']//tr[last()]//input/following-sibling::ul/li[contains(text(),'" + value + "')]";
	}

	public void selectChiefComplaintDescriptionDrp(String Description_Search, String ChiefComplaint_Name) 
			throws IOException, InterruptedException {

		// Step 1: Switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeurl']")));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		CommanUtill.textEnter(Chief_Complaints_Sub_Table_Description_Search, Description_Search);

		String valueXpath = getChiefComplaintValueXpath(ChiefComplaint_Name);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(valueXpath)));
		CommanUtill.clickFunction(valueXpath, ChiefComplaint_Name);

		// Step 5: Switch back to main page
		driver.switchTo().defaultContent();
	}

	public void ChiefComplaintAcuityCharacteristics(int Acuity_Drp ,String  Characteristics_Text) throws IOException , InterruptedException {

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeurl']")));
		CommanUtill.dropdownSelectByIndex(Click_Chief_Complaints_Acuity_Drp, Acuity_Drp);
		CommanUtill.textEnter(Click_Chief_Complaints_Characteristics, Characteristics_Text);
	}
	public void ChiefComplaintDuration_DurationDrp(String Duration_Value, int Duration_Drp)
			throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait & enter duration
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Chief_Complaints_Duration_No)));

		CommanUtill.clickFunction(Click_Chief_Complaints_Duration_No, "Click Duration Field");
		CommanUtill.textEnter(Click_Chief_Complaints_Duration_No, Duration_Value);

		// Wait & select dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Chief_Complaints_Duration_Drp)));

		CommanUtill.dropdownSelectByIndex(Click_Chief_Complaints_Duration_Drp, Duration_Drp);

		// Switch back
		driver.switchTo().defaultContent();
	}
	public void ChiefComplaint_AggravatingFactors_RelievingFactors_MedsTaken (String AggravatingFactors , String  RelievingFactors , 
			String 	MedsTaken) throws IOException , InterruptedException {

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeurl']")));
		CommanUtill.textEnter(Click_Chief_Complaints_Aggravating_Factors, AggravatingFactors);
		CommanUtill.textEnter(Click_Chief_Complaints_Relieving_Factors, RelievingFactors);
		CommanUtill.textEnter(Click_Chief_Complaints_Meds_Taken, MedsTaken);
	}
	public void ChiefComplaintEffectDrp(String EffectDrp ) throws IOException, InterruptedException {


		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='iframeurl']")));

		driver.findElement(By.xpath("//body")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Chief_Complaints_Effect_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Click_Chief_Complaints_Effect_Drp, EffectDrp);

	}
	public void ChiefComplaintStatusDrp_Remarks(int Status_Drp, String Remarks) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Chief_Complaints_Status_Drp) ));
		CommanUtill.dropdownSelectByIndex(Click_Chief_Complaints_Status_Drp, Status_Drp);
		CommanUtill.textEnter(Click_Chief_Complaints_Remarks, Remarks);

	}

	public void SaveChiefComplaintsBtn(String Save_Icon) throws IOException , InterruptedException {

		CommanUtill.clickFunction(Save_Chief_Complaints, Save_Icon);
		driver.switchTo().defaultContent();  
	}

	public void CloseChiefComplaintsPop (String Close_ChiefComplaints) throws IOException, InterruptedException { 

		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		CommanUtill.clickByJSFunction(Close_Chief_Complaints_Pop, Close_ChiefComplaints);   
	}
	//================================ Delete Chief Complaints ==========================================

	public void DeleteChiefComplaintsPop (String Delete_ChiefComplaints) throws IOException, InterruptedException { 

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeurl']")));
		Thread.sleep(1000);
		CommanUtill.clickFunction(Delete_Chief_Complaints_sub_Table, Delete_ChiefComplaints);   
	}
	//=================================== Endorsement Tool Hospitalisation Information ======================

	public void HospitalSurgeryInformationDetails(String Hospitalisation_Date , String Op_days , String Surgery_Name , 
			String Surgery_date) throws IOException, InterruptedException {

		WebElement Hospitalisation = driver.findElement(By.xpath(Day_Hospitalisation_Date));
		Hospitalisation.sendKeys(Keys.CONTROL +"a");
		Hospitalisation.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Day_Hospitalisation_Date, Hospitalisation_Date);
		Hospitalisation.sendKeys(Keys.TAB);

		CommanUtill.textEnter(Post_Op_days, Op_days);
		CommanUtill.textEnter(Name_Surgery, Surgery_Name);

		WebElement Surgery = driver.findElement(By.xpath(Surgery_Date));
		Surgery.sendKeys(Keys.CONTROL +"a");
		Surgery.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Surgery_Date, Surgery_date);
		Surgery.sendKeys(Keys.TAB);

	}
	//============================== vitals ===================================
	public void PlushEndorsementToolVitalsIcon(String vitals) throws IOException, InterruptedException { 

		WebDriverWait plush = new WebDriverWait( driver, Duration.ofSeconds(5));
		plush.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Vitals_Plush_Icon)));
		CommanUtill.clickFunction(Click_Vitals_Plush_Icon, vitals);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeurl']")));
	}

	public void SaveVitalsPop(String Save) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Vitals_Pop_Btn)));
		CommanUtill.clickFunction(Save_Vitals_Pop_Btn, Save);
	}
	public void CopyVitalsPop(String Copy) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Copy_Vitals_Pop_Btn)));
		CommanUtill.clickFunction(Copy_Vitals_Pop_Btn, Copy);
	}
	public void CloseVitalsPop(String close)throws IOException, InterruptedException { 

		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		CommanUtill.clickFunction(Close_Vitals_Pop_Btn, close);
	}
	//========================== Assessment & Skin Integrity ===========================
	public void EnterEndorsementTool_PainScore_Location_Edema_Yes_Mentionthe_Site(String PainScore , String Location ,
			String Edema ,String YesMentiontheSite) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Pain_Score, PainScore);
		CommanUtill.textEnter(Location_Text, Location);
		CommanUtill.dropdownSelectByVisibleText(Edema_Dropdown, Edema);
		CommanUtill.textEnter(Yes_Mention_ite, YesMentiontheSite);	
	}
	public void EnterEndorsementTool_SkinIntact_PressureUlcer_YesInsideOutside_StatusPressureUlcer_Remarks(String SkinIntact , String PressureUlcer ,
			String Inside_Outside ,String StatusPressureUlcer , String Remarks) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Skin_Intact_Dropdown, SkinIntact);
		CommanUtill.dropdownSelectByVisibleText(Pressure_Ulcer_Dropdown, PressureUlcer);
		CommanUtill.dropdownSelectByVisibleText(Yes_Inside_Outside, Inside_Outside);
		CommanUtill.dropdownSelectByVisibleText(Pressure_Ulcer_Status_Dropdown, StatusPressureUlcer);
		//CommanUtill.textEnter(Remarks_Field, Remarks);	
	}
	//=========================== Central Nervous System ==============================
	public void CentralNervousSystemInformationDetails(String CentralNervousSystem ,String Restraint , String Eyes_Open , String Verbal , 
			String Motor ) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Central_Nervous_System_Drp, CentralNervousSystem);
		CommanUtill.dropdownSelectByVisibleText(Restraint_Drp, Restraint);
		CommanUtill.dropdownSelectByVisibleText(Eyes_Open_Drp, Eyes_Open);
		CommanUtill.dropdownSelectByVisibleText(Best_Verbal_Response_Drp, Verbal);
		CommanUtill.dropdownSelectByVisibleText(Best_Motor_Response_Drp, Motor);

	}
	//============================= Any Other Instruction ================================
	public void AnyOtherInstructionDetails(String Referral , String Seen , String Doctor_Name , String SpecialInstructions) 
			throws IOException, InterruptedException { 

		CommanUtill.textEnter(Referral_Any, Referral);	
		CommanUtill.dropdownSelectByVisibleText(Seen_Drp, Seen);
		CommanUtill.textEnter(Doctor_Name_Text, Doctor_Name);	
		CommanUtill.textEnter(Any_Special_Instructions, SpecialInstructions);		
	}
	//====================== Recommendations ============================
	public void RecommendationsGeneralconditionDrp(String Generalcondition) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Recommendations_General_condition_Drp, Generalcondition);
	}
	public void RecommendationsLogin_Password(String login_Id , String Password ,String Ok_Btn) throws IOException, InterruptedException { 

		CommanUtill.textEnter(Recommendations_Login_Id, login_Id);
		CommanUtill.textEnter(Recommendations_Password, Password);
		Thread.sleep(1500);
		CommanUtill.clickFunction(Recommendations_Yes_Icon, Ok_Btn);
	}
	//====================================Save And  Verify =====================================
	public void SaveEndorsementToolBtn (String Save_Btn)throws IOException, InterruptedException { 

		WebDriverWait Search = new WebDriverWait( driver, Duration.ofSeconds(5));
		Search.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_EndorsementTool_Btn)));
		CommanUtill.clickFunction(Save_EndorsementTool_Btn, Save_Btn);

	}
	public void HandoverVerifyYesPop (String Verify , String HandOver_Yes) throws IOException, InterruptedException { 

		
		CommanUtill.clickFunction(Verify_Btn, Verify);
		if(CommanUtill.isElementPresent(Handover_Yes_Pop)) {
			CommanUtill.clickFunction(Handover_Yes_Pop, HandOver_Yes);
			System.out.println("Appared Yes Popup Handover details verification.");
		}
		else {
			System.out.println("Did Not Appared Yes Popup Handover details verification.");
		}


	}










}
