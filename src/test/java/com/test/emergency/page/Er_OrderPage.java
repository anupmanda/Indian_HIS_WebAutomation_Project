/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
 * 08-Apr-2026
 */
public class Er_OrderPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Er Order ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Order_page = "//a[contains(text(),'ER Order')]";
	protected static String Er_Order_Vacant_Check_Box = "//input[@id='chkVacantStatusValue']";
	protected static String Er_Order_Patient_Type = "//select[@id='CMBBedfilter']";
	protected static String Er_Order_Patient_Search = "//input[@id='TxtBedfiltersearch']";
	protected static String Search_Patient = "//a[@id='btnBedfiltersearch']//i[@title='Search']";

	//=========================== Er Order Invg Pathology ============================
	protected static String Investigations_Btn = "//a[@id='investigations']";
	protected static String Invg_New_Orders_Radio_Btn = "//input[@id='rbNewOrders']";
	protected static String Invg_New_Orders_Pathology_Radio_Btn = "//input[@id='rbPathology']";
	protected static String Invg_New_Orders_Search_Box = "//input[@id='searchOrders']";
	protected static String Invg_New_Orders_Doctor_Drp = "//select[@id='ddlDoctor']";
	protected static String Invg_New_Orders_Priority_Drp = "//select[@id='ddlPriority']";
	protected static String Invg_New_Orders_Pathology_Table = "//table[@id='tblAllTest']//tbody//tr";
	protected static String Click_Invg_New_Orders_Pathology_Table = "//table[@id='tblAllTest']//tbody//tr[not(contains(@style,'display: none'))][1]";

	protected static String Investigations_Select_Sample_Drp = "//select[@id='ddlTestSampleOrds']";

	//=========================== Er Order Invg Other Tests ============================
	protected static String Radio_Btn_Invg_Other_Test = "//input[@id='rbTests']";
	//=========================== Er Order Invg Profiles ============================
	protected static String Radio_Btn_Invg_Profiles = "//input[@id='rbProfiles']";

	//=========================== Invg Sub Table  ============================
	protected static String Investigations_Sub_Table_No_Time_Value = "//input[contains(@type,'text')]";

	//======================= Save Btn ==============================
	protected static String Save_Btn = "//a[@id='SaveNewOrder']//i[@class='fa fa-save']";

	//=======================  Pending Order Save ============================
	protected static String Pending_Order_In_Parent_Table_Print = "//table[@id='investigationlist']";
	protected static String Pending_Order_In_Parent_Table = "//table[@id='investigationlist']//td[@style='background:pink']";
	protected static String Click_Pending_Order_In_Sub_Table = "//table[@id='investigationdetails']//tbody//tr[position()=1]";
	protected static String Sample_Collection_Remarks = "//textarea[@id='RemarksNu']";
	protected static String Save_Bar_Code_Sample_Collect = "//a[@id='save_bar_code']//i[@class='fa fa-barcode']";
	protected static String Close_Bar_Code_Sample_Collect_Pop = "//a[@id='closesamplecollection']//i[@class='fa fa-times']";
	//============================ Pending Order Compleled ===================================

	protected static String Radio_Btn_Completed = "//input[@id='rbCompleted']";
	protected static String Click_Completed_Order_Table = "//table[@id='investigationlist']//tbody//tr[position()=1]";
	protected static String Print_Completed_Order = "//a[@id='print']//i[@class='fa fa-print']";

	//=========================== General Order Entry / Proce ==============================

	protected static String General_Order_Entry_Proce_Btn = "//a[@id='GeneralorderEntery']";
	protected static String Procedure_Check_Box = "//input[@id='chkProcedureCategory']";
	protected static String Category_Drp = "//select[@id='ddlProcCategory']";
	protected static String Ordered_By_Drp  = "//select[@id='ddl_OrderedByGL']";
	protected static String Items_Search  = "//input[@id='SearchGeneralOrder']";
	protected static String Click_On_Items_Table  = "//table[@id='tblItem']//tbody//tr[position()=1]";
	protected static String Click_On_Items_Second_Row_Table  = "//table[@id='tblItem']//tbody//tr[position()=3]";

	protected static String Procedure_Name_Performed_Table  = "//table[@id='subItem']//tbody//tr";

	protected static String Procedure_Performed_By_Drp  = "(//select[starts-with(@id,'ddl')])[1]";
	protected static String Procedure_Second_Performed_By_Drp  = "//table[@id='subItem']//tbody//tr[2]//td[3]//select[position()=1]";
	protected static String Remarks_Text  = "//textarea[@id='remark']";

	//======================= Save Genral Order Entery =============================
	protected static String Save_Gen_Order_Entry_Btn  = "//a[@id='SaveGeneralOrder']//i[@class='fa fa-save']";
	protected static String Save_No_Consumables_Window   = "//a[@id='ConsumablesmappedWithProc_No']";
	protected static String Save_Yes_Consumables_Window   = "//a[@id='ConsumablesmappedWithProc_yes']";

	//========================== Delete Save Genral Order Items ================================
	protected static String Click_Save_Gen_Order_Item_Sub_Table   = "//div[@id='GeneralOrder']//tbody//tr[position()=1]";
	protected static String Delete_Procedure_Name_Check_Box   = "//table[@id='subItem']//tbody//tr[position()=1]//input";
	protected static String Click_Delete_Btn   = "//a[@id='DeleteGeneralOrder']";

	//================================ Drug =============================
	protected static String Click_Drug_Btn   = "//a[@id='Drug_Order']";
	protected static String New_Orders_Radio_Btn   = "//input[@id='rdoDrugOrdNew']";
	protected static String Select_Strore_Drp   = "//select[@id='parmarcystore']";
	protected static String TOC_Check_Box   = "//input[@id='_toc']";
	protected static String Search_Durg_Name  = "//input[@id='searchDrug']";
	protected static String Order_Set_Check_Box  = "//input[@id='Chk_OrderSet']";
	protected static String Item_Code_Drp  = "//select[@id='cmbItemCodeEMDrugOrder']";
	protected static String Ordering_Doctor_Drp   = "//select[@id='ddlDrugDoctor']";

	//protected static String Click_Drug_In_Table   = "//table[@id='tbldrugOrd']//tbody//tr[position()=1]";
	protected static String Click_Drug_In_Table = "(//table[@id='tbldrugOrd']//tbody//tr[not(contains(@style,'display: none'))])[1]";
	protected static String Click_already_active_Yes_pop = "//a[@id ='DrugOrderbtnyes']";
	//============================= New Order Drug In Sub Table =================================
	protected static String Sub_Table_Route_Drp   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='routeofadmin']//select";
	protected static String Sub_Table_Frequency_Drp   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='frequencyid']//select";
	protected static String Sub_Table_Duration_Text   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='durationno']//input";
	protected static String Sub_Table_Interval_Drp   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='durationid']//select";
	protected static String Sub_Table_Quantity_Text   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='qty']//input";
	protected static String Sub_Table_Priority_Drp   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='OrdPriority']//select";
	protected static String Sub_Table_Remarks   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='remarks']//input";
	protected static String Sub_Table_UOM_Drp   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='ComplexUOM']//select";
	protected static String Sub_Table_Dose_Text   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[1]//td[@ctype='dose']//input";
	protected static String Save_Drug_Btn   = "//a[@id='SaveDrugOrder']//i[@class='fa fa-save']";
	protected static String Yes_popAlert_Pop   = "//a[@id ='btn_AlertErrorYes']";
	
	protected static String Sub_Table_Route_Drp_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='routeofadmin']//select";
	protected static String Sub_Table_Frequency_Drp_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='frequencyid']//select";
	protected static String Sub_Table_Duration_Text_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='durationno']//input";
	protected static String Sub_Table_Interval_Drp_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='durationid']//select";
	protected static String Sub_Table_Quantity_Text_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='qty']//input";
	protected static String Sub_Table_Priority_Drp_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='OrdPriority']//select";
	protected static String Sub_Table_Remarks_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='remarks']//input";
	protected static String Sub_Table_UOM_Drp_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='ComplexUOM']//select";
	protected static String Sub_Table_Dose_Text_2   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[2]//td[@ctype='dose']//input";

	//======================== Print Pendind Order Drug ================================
	protected static String Print_Peding_Drug_Btn   = "//a[@id='PrintDrugOrder']//i[@class='fa fa-print']";
	protected static String Print_Peding_From_Date   = "//input[@id='txtFromDateReport']";
	protected static String Click_On_Print_Btn  = "//a[@id='printreportDrugOrder1']//i[@class='fa fa-print']";

	//======================== Cancel Pendind Order Drug ================================

	protected static String Click_Pending_Drug_Radio_Btn   = "//input[@id='rdoDrugOrdPending']";
	protected static String Count_No_Of_Order_Drug   = "//span[@id='nmbrofdrug']";
	protected static String Click_Pending_Drug_Table   = "//table[@id='tbldrugOrd']//tbody//tr[last()]";
	protected static String Click_Pending_Drug_Sub_Table   = "//table[@id='tbldrugOrdDetailList']//tbody//tr[last()]/td[2]";
	protected static String Yes_Cancel_Drugs   = "//a[@id='CancelDrugOrderbtnyes']";

	protected static String Home_Page   = "//div[@class='logoHis']";

	//========================  Issued Drug ===========================
	protected static String Radio_Btn_Issued   = "//input[@id='rdoDrugOrdIssued']";
	
	//=========================== Drug return ============================
	protected static String Drug_Return_Btn  = "//a[@title='Drug Return']";
	protected static String Drug_New_Retun_Radio_Btn  = "//input[@id='rdoDrugOrdReturn_1']";
	protected static String Click_New_Return_Drug_Table  = "//table[@id='tbldrugReturns']//tbody//tr[position()=1]";
	
	protected static String New_Return_Quenty_Text  = "//table[@id='tblDrugReturnAddDetail']//tbody//input";
	protected static String Save_Btn_Retun_Drug  = "//a[@id='btnsavedrugreturnNewrtn']//i[@class='fa fa-save']";
	protected static String Reason_Retun_Drug_pop = "//input[@id='txtreasonreturn']";
	protected static String Reason_Retun_Drug_Ok_Pop  = "//a[@id='closereasonreturnsave']";
	
	//=========================== Check Pending Retun Drugs =========================
	
	protected static String Drug_Pending_Retun_Radio_Btn  = "//input[@id='rdoDrugOrdReturn_0']";
	
	//============================ER EDI =========================================
	protected static String Click_EDI_Btn  = "//a[@title='Emergency Discharge Intimation']";
	protected static String Discharged_Type_Drp  = "//select[@id='dishchargetype']";
	protected static String Discharged_Sub_Type_Drp  = "//select[@id='dishchargesubtype']";
	protected static String Discharged_Remarks  = "//textarea[@id='dis_Remarks']";
	protected static String Save_Discharged_Btn  = "//a[@id='SaveDischargeIntimation']//i[@class='fa fa-save']";
	protected static String Save_Discharged_Yes_Pop  = "//a[@id='Dbtnyes']";
	//============================ Cancel ER EDI =========================================
	protected static String Cancel_Discharge_Intimation_Table  = "//table[@id='existing_progressNotes']//tbody//tr[position()=1]";

	protected static String Cancle_Discharged_Yes_Pop  = "//a[@id='Intimationbtnyes']";
	protected static String Reasion_Discharged_Text  = "//textarea[@id='txtAreaReason']";
	protected static String Reasion_Discharged_Yes_Pop  = "//a[@id='popCancelReason_yes']";
	
	//==================== Pop Meassage =============================
	protected String popupMessage = "//div[@id='gritter-notice-wrapper']//p";
	protected String popupCloseBtn = "//div[@id='gritter-notice-wrapper']//div[@class='gritter-close']";
	
	

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
	public void ErOrderSearchVacantCheckBox(String Vacant_Check_Box) throws IOException, InterruptedException {  

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Er_Order_Vacant_Check_Box)));
		CommanUtill.clickFunction(Er_Order_Vacant_Check_Box, Vacant_Check_Box);	
	}
	public void ErSearchPatient(String Patient_Type , String Search_Patient) throws IOException, InterruptedException {  

		CommanUtill.dropdownSelectByVisibleText(Er_Order_Patient_Type, Patient_Type);
		CommanUtill.textEnter(Er_Order_Patient_Search, Search_Patient);
		WebElement enter_Er_No = driver.findElement(By.xpath(Er_Order_Patient_Search));;
		enter_Er_No.sendKeys(Keys.ENTER);
	}

	public void SearchAndClickTopGreenPatient() throws IOException, InterruptedException {

	    logger.info("===== Search and Click TOP GREEN Patient =====");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    List<WebElement> cards = wait.until(
	        ExpectedConditions.visibilityOfAllElementsLocatedBy(
	            By.xpath("//div[contains(@class,'patient-card') " +
	                     "and contains(concat(' ',normalize-space(@class),' '),' occupied ') " +
	                     "and not(contains(@style,'display: none'))]")
	        )
	    );

	    if (cards.isEmpty()) {
	        logger.info("No GREEN (Occupied) Patient Found");
	        return;
	    }

	    //  Always TOP (UI first)
	    WebElement targetCard = cards.get(0);

	    // ===== PRINT DETAILS =====
	    String fullText = targetCard.getText();
	    String[] lines = fullText.split("\n");

	    String patientName = lines.length > 0 ? lines[0] : "";
	    String bedName     = lines.length > 1 ? lines[1] : "";
	    String erNo        = lines.length > 2 ? lines[2] : "";

	    System.out.println("===== GREEN TOP PATIENT =====");
	    System.out.println("Patient Name : " + patientName);
	    System.out.println("Bed Name     : " + bedName);
	    System.out.println("ER No        : " + erNo);

	    logger.info("Patient Name : " + patientName);
	    logger.info("Bed Name     : " + bedName);
	    logger.info("ER No        : " + erNo);

	    // ===== CLICK =====
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", targetCard);
	    Thread.sleep(500);

	    js.executeScript("arguments[0].style.border='3px solid green';", targetCard);
	    Thread.sleep(300);

	    js.executeScript("arguments[0].click();", targetCard);

	    logger.info("Clicked on TOP GREEN Patient Successfully");
	}
	
	public static String ER_NO_GLOBAL = "";

	public String ClickTopGreenPatient() throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    List<WebElement> cards = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	        By.xpath("//div[contains(@class,'patient-card') and contains(@class,'occupied') and not(contains(@class,'admittednotoccupied'))]")
	    ));

	    if (cards.size() == 0) {
	        System.out.println("No GREEN Patient Found");
	        return "";
	    }

	    System.out.println("Total GREEN Patients: " + cards.size());

	    WebElement targetCard = cards.get(0);

	    // Patient Name
	    String patientName = "";
	    try {
	        patientName = targetCard
	            .findElement(By.xpath(".//span[contains(@class,'patient-name')]"))
	            .getText().trim();
	    } catch (Exception e) {}

	    // ER NO (IMPORTANT FIX)
	    String erNo = "";
	    try {
	        erNo = targetCard
	            .findElement(By.xpath(".//span[contains(@class,'fwb')]"))
	            .getText().trim();
	    } catch (Exception e) {
	        System.out.println("ER No not found!");
	    }

	    // GLOBAL STORE (optional)
	    ER_NO_GLOBAL = erNo;

	    System.out.println("===== TOP GREEN PATIENT =====");
	    System.out.println("Patient Name : " + patientName);
	    System.out.println("ER No        : " + erNo);

	    // CLICK
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(targetCard)).click();
	    } catch (Exception e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", targetCard);
	    }

	    return erNo;   // RETURN VALUE
	}
	    
		public void ClickOnInvestigationsBtnAndNewOrders(String Invg_Btn , String NewOrder_Radio_Btn) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Investigations_Btn, Invg_Btn);
		CommanUtill.clickFunction(Invg_New_Orders_Radio_Btn, NewOrder_Radio_Btn);
	}
	public void ClickOnPathologyRadioBtn(String Pathology_RadioBtn ) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Invg_New_Orders_Pathology_Radio_Btn)));
		WebElement radio_Btn = driver.findElement(By.xpath(Invg_New_Orders_Pathology_Radio_Btn));
		if( ! radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Invg_New_Orders_Pathology_Radio_Btn, Pathology_RadioBtn);
		}
	}

	public void SearchNewOrderTest(String Search_Box) throws IOException, InterruptedException {

		CommanUtill.textEnter(Invg_New_Orders_Search_Box, Search_Box);
	}
	public void InvegationDoctorAndPriorityDrp(String Doctor , String Priority) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Invg_New_Orders_Doctor_Drp, Doctor);
		CommanUtill.dropdownSelectByVisibleText(Invg_New_Orders_Priority_Drp, Priority);
	}
	public void CheckOnTablePathologyTest(String Table) throws IOException, InterruptedException {

		List<WebElement> rows = driver.findElements(By.xpath(Invg_New_Orders_Pathology_Table));

		logger.info("====================== Deposit All Amount =====================");

		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();

			logger.info("Row " + (i + 1) + " : " + rowText);
			System.out.println("Row " + (i + 1) + " : " + rowText);
		}
	}
	public void ClickOnNewOrderPathologyTestInTable(String Pathology_Name) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Invg_New_Orders_Pathology_Table)));
		String First_Row = driver.findElement(By.xpath(Click_Invg_New_Orders_Pathology_Table)).getText();
		logger.info("================= New Order Pathology Name In Table ====================");
		System.out.println("========== New Order Pathology Name In Table  ==========");
		logger.info(First_Row);
		System.out.println("First Row Pathology Name : " + First_Row);
		CommanUtill.clickFunction(Click_Invg_New_Orders_Pathology_Table, Pathology_Name);
	}

	public void PathologySelectSampleDrp(String Sample_Drp) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(Investigations_Select_Sample_Drp)) {
			CommanUtill.dropdownSelectByVisibleText(Investigations_Select_Sample_Drp, Sample_Drp);

			System.out.println("Sample Selected: " + Sample_Drp);
			logger.info("Sample Selected: " + Sample_Drp);

		} else {

			System.out.println("Sample Dropdown Not Appeared");
			logger.info("Sample Dropdown Not Appeared");
		}
	}
	//=========================== Er Order Invg Other Tests ============================

	public void RadioBtnInvgOtherTests(String Othet_Test) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Invg_Other_Test)));
		CommanUtill.clickFunction(Radio_Btn_Invg_Other_Test, Othet_Test);
	}
	//=========================== Er Order Invg Profiles ============================

	public void RadioBtnInvgProfilesTests(String Profiles_Test) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Invg_Profiles)));
		CommanUtill.clickFunction(Radio_Btn_Invg_Profiles, Profiles_Test);
	}
	//=========================== Invg Sub Table  ============================
	public void NumberOfTimeTextPathologySubTable(String No_Of_Time) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Investigations_Sub_Table_No_Time_Value)));
		CommanUtill.textEnter(Investigations_Sub_Table_No_Time_Value, No_Of_Time);
	}

	public void ClickOnSaveBtn(String Save_Icon) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Btn)));
		CommanUtill.clickFunction(Save_Btn, Save_Icon);
	}

	//=======================  Pending Order Save ============================

	public void ClickOnPendingOrder(String Pending_Order_Pink) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Pending_Order_In_Parent_Table_Print)));
		String First_Row = driver.findElement(By.xpath(Pending_Order_In_Parent_Table_Print)).getText();
		logger.info("================= Pending Order In Table ====================");
		System.out.println("========== Pending Order In Table  ==========");
		logger.info(First_Row);
		System.out.println("Pending Order 1St Click : " + First_Row);
		CommanUtill.clickFunction(Pending_Order_In_Parent_Table, Pending_Order_Pink);
	}

	public void ClickOnPendingOrderInSubTable(String Pending_Order_Sub_Table) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Pending_Order_In_Sub_Table)));
		String First_Row = driver.findElement(By.xpath(Click_Pending_Order_In_Sub_Table)).getText();
		logger.info("================= Pending Order In Table ====================");
		System.out.println("========== Pending Order In Table  ==========");
		logger.info(First_Row);
		System.out.println("Pending Order 2nd Click : " + First_Row);
		CommanUtill.clickFunction(Click_Pending_Order_In_Sub_Table, Pending_Order_Sub_Table);
	}
	public void EnterSampleCollectionRemarks(String Remarks) throws IOException, InterruptedException {

		CommanUtill.textEnter(Sample_Collection_Remarks, Remarks);
	}
	public void SavePendOrderBarCodeCollectPop(String Bar_Code) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Bar_Code_Sample_Collect)));
		CommanUtill.clickFunction(Save_Bar_Code_Sample_Collect, Bar_Code);
	}
	public void ClosePendOrderBarCodeCollectPop(String Bar_Code) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Close_Bar_Code_Sample_Collect_Pop)));
		CommanUtill.clickFunction(Close_Bar_Code_Sample_Collect_Pop, Bar_Code);
	}

	//============================ Pending Order Compleled ===================================
	public void ClickOnInvgCompletedRadioBtn(String Radio_Btn) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Radio_Btn_Completed)));
		CommanUtill.clickFunction(Radio_Btn_Completed, Radio_Btn);
	}
	public void ClickOnCompletedOrderTable(String Completed_Order) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Completed_Order_Table)));
		String First_Row = driver.findElement(By.xpath(Click_Completed_Order_Table)).getText();
		logger.info("================= Completed Order In Table ====================");
		System.out.println("========== Completed Order In Table ==========");
		logger.info(First_Row);
		System.out.println("Completed Order 1St Click : " + First_Row);
		CommanUtill.clickFunction(Click_Completed_Order_Table, Completed_Order);
	}
	public void PrintInCompletedOrder(String Print) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Print_Completed_Order)));
		CommanUtill.clickFunction(Print_Completed_Order, Print);
	}
	//=========================== General Order Entry / Proce ==============================

	public void ClickGeneralOrderEntry_ProceBtn(String Proce) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(General_Order_Entry_Proce_Btn)));
		CommanUtill.clickFunction(General_Order_Entry_Proce_Btn, Proce);
	}
	public void CheckBoxProcedureAndCategoryDrp(String Procedure , String Category) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Procedure_Check_Box, Procedure);
		CommanUtill.dropdownSelectByVisibleText(Category_Drp, Category);
	}
	public void SelectByProceOrderedByDrp(String Ordered)  throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Ordered_By_Drp, Ordered);
	}
	public void SearchGeneralOrderEntryItems(String items) throws IOException, InterruptedException {

		CommanUtill.textEnter(Items_Search, items);
	}
	//============================*** Right Side Table Two Item Order ***========================
	public void ClickOnFirstGeneralOrderEntryItemsTable(String Item_Table) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_On_Items_Table)));
		String First_Row = driver.findElement(By.xpath(Click_On_Items_Table)).getText();
		logger.info("================= General Order Entry Procee  Items ====================");
		System.out.println("========== General Order Entry Procee  Items ==========");
		logger.info(First_Row);
		System.out.println("General Order Entry Items : " + First_Row);
		CommanUtill.clickFunction(Click_On_Items_Table, Item_Table);
	}

	public void ClickOnSecondGeneralOrderEntryItemsTable(String Items) throws IOException, InterruptedException {

		logger.info("================= General Order Entry Process Items ====================");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblItem']//tbody/tr")));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tblItem']//tbody/tr"));
		System.out.println("Total Rows: " + rows.size());

		if (rows.size() >= 3) {

			WebElement row = rows.get(2);

			String rowText = row.getText();
			logger.info(rowText);
			System.out.println("General Order Entry Item: " + rowText);

			//  Direct JS Click (visibility ignore karega)
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", row);

		} else {
			System.out.println("Less than 3 rows available!");
			logger.info("Less than 3 rows available in table");
		}
	}
	//======================== Left Side Table ===============================
	public void AfterProcedureSelectSecondRightSideTable(String Select_Items) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Procedure_Name_Performed_Table)));
		String Row = driver.findElement(By.xpath(Procedure_Name_Performed_Table)).getText();
		System.out.println("========== Select Gen order Entry Procedure Name Performed By ==========");
		logger.info("================= Select Gen order Entry Procedure Name Performed By ====================");
		logger.info(Row);
		System.out.println("Show Gen Order Entry Items : " + Row);
	}

	public void SelectByProcedurePerformedByDrp(int index) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='subItem']")));

		String PerformedBy_Drp = "(//table[@id='subItem']//select)[" + index + "]";
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PerformedBy_Drp)));
		CommanUtill.dropdownSelectByIndex(PerformedBy_Drp, index);
	}
	public void SelectByProcedureSecondPerformedByDrp(int Second_Row_Performed) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Procedure_Second_Performed_By_Drp)));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Procedure_Second_Performed_By_Drp)));
		CommanUtill.dropdownSelectByIndex(Procedure_Second_Performed_By_Drp, Second_Row_Performed);
	}
	public void EnterRemarksGenOrderItem(String Remarks) throws IOException, InterruptedException {

		CommanUtill.textEnter(Remarks_Text, Remarks);
	}

	//======================= Save Genral Order Entery =============================

	public void ClickOnSaveGeneralOrderItems(String Save) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Gen_Order_Entry_Btn)));
		CommanUtill.clickFunction(Save_Gen_Order_Entry_Btn, Save);
	}
	public void NoConsumables_Mapped_Procedure_ConsumptionPOP(String No_Pop) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_No_Consumables_Window)));
		CommanUtill.clickFunction(Save_No_Consumables_Window, No_Pop);
	}
	public void YesConsumables_Mapped_Procedure_ConsumptionPOP(String No_Pop) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Yes_Consumables_Window)));
		CommanUtill.clickFunction(Save_Yes_Consumables_Window, No_Pop);
	}
	//========================== Delete Save Genral Order Items ================================

	public void ClickOnSaveItemsInSubTable(String Reason_Delete) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Save_Gen_Order_Item_Sub_Table)));
		String First_Row = driver.findElement(By.xpath(Click_Save_Gen_Order_Item_Sub_Table)).getText();
		System.out.println("========== Delete Save Items In Sub Table ==========");
		logger.info("================= Delete Save Items In Sub Table ====================");
		logger.info(First_Row);
		System.out.println("Show Gen Order Entry Items : " + First_Row);
		CommanUtill.clickFunction(Click_Save_Gen_Order_Item_Sub_Table, Reason_Delete);
	}
	public void SelectProcedureCheckBox(String Check_Box) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Delete_Procedure_Name_Check_Box)));
		CommanUtill.clickFunction(Delete_Procedure_Name_Check_Box, Check_Box);
	}
	public void DeleteGeneralOrderItems(String Delete_Btn) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Click_Delete_Btn)));
		CommanUtill.clickFunction(Click_Delete_Btn, Delete_Btn);
	}
	//================================ Drug =============================

	public void ClickOnDrugBtn(String Drug_Icon) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Click_Drug_Btn)));
		CommanUtill.clickFunction(Click_Drug_Btn, Drug_Icon);
	}
	public void ClickOnNewOrdersRadioBtn(String Radio_Btn) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(New_Orders_Radio_Btn)));
		CommanUtill.clickFunction(New_Orders_Radio_Btn, Radio_Btn);
	}
	public void SelectStoreDrp(String Store_Drp) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Select_Strore_Drp, Store_Drp);
	}
	public void ClickOnTOCCheckBox(String TOC_Chekk) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TOC_Check_Box)));
		CommanUtill.clickFunction(TOC_Check_Box, TOC_Chekk);
	}
	public void ClickOnOrderSetCheckBox(String Order_Set_Check) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Order_Set_Check_Box)));
		CommanUtill.clickFunction(Order_Set_Check_Box, Order_Set_Check);
	}
	public void SelectItemCodeDrp(String Item_Code) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Item_Code_Drp, Item_Code);
	}
	public void SelectOrderingDoctorDrp(String Ordering_Doctor) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Ordering_Doctor_Drp, Ordering_Doctor);
	}
	public void SearchInDurg(String Search_Box) throws IOException, InterruptedException {

		CommanUtill.textEnter(Search_Durg_Name, Search_Box);
	}
	public void ClickOnDrugOrderInTable(String Table) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Drug_In_Table)));
		String First_Row = driver.findElement(By.xpath(Click_Drug_In_Table)).getText();
		System.out.println("========== Select New Drug Order In Table ==========");
		logger.info("================= Select New Drug Order In Table ====================");
		logger.info(First_Row);
		System.out.println("Show Gen Order Entry Items : " + First_Row);
		CommanUtill.clickFunction(Click_Drug_In_Table, Table);
	}
	public void selectDrugOrderFirstRow(String drugName) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		String drugXpath = "//tr[contains(@onclick,'" + drugName + "') and not(contains(@style,'display: none'))]";
		String firstRowXpath = "(//table[@id='tbldrugOrd']//tbody//tr[not(contains(@style,'display: none'))])[1]";

		// Wait for table rows to load
		wait.until(driver -> driver.findElements(By.xpath("//table[@id='tbldrugOrd']//tbody//tr[not(contains(@style,'display: none'))]"))
				.size() > 0);
		List<WebElement> drugList = driver.findElements(By.xpath(drugXpath));
		if (drugList.size() > 0) {
			// Drug Found
			WebElement drug = drugList.get(0);
			wait.until(ExpectedConditions.elementToBeClickable(drug));
			String text = drug.getText();
			System.out.println("Drug Found: " + text);
			CommanUtill.clickFunction(drugXpath, drugName);

		} else {
			// Fallback =====> First Row Click
			System.out.println("Drug NOT Found =====> Clicking First Row");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstRowXpath)));
			String text = driver.findElement(By.xpath(firstRowXpath)).getText();
			System.out.println("First Row: " + text);
			CommanUtill.clickFunction(firstRowXpath, "First Row Drug");
		}
	}
	public void MultipleDrugOrderYesPop(String Yes_pop)  throws IOException, InterruptedException {

		if(CommanUtill.isElementPresent(Click_already_active_Yes_pop)) {
			CommanUtill.clickFunction(Click_already_active_Yes_pop, Yes_pop);
			System.out.println("Already active for the Patient Ordered Yes Pop");
		}
		else {
			System.out.println("Did Not Appered Already active for the Patient Ordered Yes Pop");
		}
	}
	public void SubTableFirstRow_RouteDrp_FrequencyDrp_DurationText_IntervalDrp_QuantityText_Priority_Drp_RemarksText_UOMDrp_Dose_Drp
	(String RouteDrp ,String FrequencyDrp , String DurationText , String IntervalDrp , String QuantityText , String Priority_Drp ,
			String RemarksText , String UOMDrp , String Dose_Drp) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(Sub_Table_Route_Drp)) {
			CommanUtill.dropdownSelectByVisibleText(Sub_Table_Route_Drp, RouteDrp);
		} else {
			System.out.println("Route dropdown not present");
		}
		if (CommanUtill.isElementPresent(Sub_Table_Frequency_Drp)) {
			CommanUtill.dropdownSelectByVisibleText(Sub_Table_Frequency_Drp, FrequencyDrp);
		} else {
			System.out.println("Frequency dropdown not present");
		}
		CommanUtill.textEnter(Sub_Table_Duration_Text, DurationText);
		CommanUtill.dropdownSelectByVisibleText(Sub_Table_Interval_Drp, IntervalDrp);
		CommanUtill.textEnter(Sub_Table_Quantity_Text, QuantityText);
		CommanUtill.dropdownSelectByVisibleText(Sub_Table_Priority_Drp, Priority_Drp);
		CommanUtill.textEnter(Sub_Table_Remarks, RemarksText);
		CommanUtill.dropdownSelectByVisibleText(Sub_Table_UOM_Drp, UOMDrp);
		CommanUtill.textEnter(Sub_Table_Dose_Text, Dose_Drp);
	}
	public void SubTableSecondRow_RouteDrp_FrequencyDrp_DurationText_IntervalDrp_QuantityText_Priority_Drp_RemarksText_UOMDrp_Dose_Drp
	(String RouteDrp ,String FrequencyDrp , String DurationText , String IntervalDrp , String QuantityText , String Priority_Drp ,
			String RemarksText , String UOMDrp , String Dose_Drp) throws IOException, InterruptedException {

		if (CommanUtill.isElementPresent(Sub_Table_Route_Drp_2)) {
			CommanUtill.dropdownSelectByVisibleText(Sub_Table_Route_Drp_2, RouteDrp);
		} else {
			System.out.println("Route dropdown not present");
		}
		if (CommanUtill.isElementPresent(Sub_Table_Frequency_Drp_2)) {
			CommanUtill.dropdownSelectByVisibleText(Sub_Table_Frequency_Drp_2, FrequencyDrp);
		} else {
			System.out.println("Frequency dropdown not present");
		}
		CommanUtill.textEnter(Sub_Table_Duration_Text_2, DurationText);
		CommanUtill.dropdownSelectByVisibleText(Sub_Table_Interval_Drp_2, IntervalDrp);
		CommanUtill.textEnter(Sub_Table_Quantity_Text_2, QuantityText);
		CommanUtill.dropdownSelectByVisibleText(Sub_Table_Priority_Drp_2, Priority_Drp);
		CommanUtill.textEnter(Sub_Table_Remarks_2, RemarksText);
		CommanUtill.dropdownSelectByVisibleText(Sub_Table_UOM_Drp_2, UOMDrp);
		CommanUtill.textEnter(Sub_Table_Dose_Text_2, Dose_Drp);
	}

	public void SaveDrugBtn(String Save_Icon) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Save_Drug_Btn)));
		CommanUtill.clickFunction(Save_Drug_Btn, Save_Icon);
	}
	public void YesPopAlertPop(String Yes_Pop)throws IOException, InterruptedException {
		
		if (CommanUtill.isElementPresent(Yes_popAlert_Pop)) {
			CommanUtill.clickFunction(Yes_popAlert_Pop, Yes_Pop);

			System.out.println("Sample Selected: " + Yes_Pop);
			logger.info("Sample Selected: " + Yes_Pop);

		} else {
			System.out.println("Yes Alert Pop");
			logger.info("Alert Pop Not Appeared");
		}
	}
	
	//======================== Print Pendind Order Drug ================================
	public void PrintPendingDrugBtn(String Print_Btn) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Print_Peding_Drug_Btn)));
		CommanUtill.clickFunction(Print_Peding_Drug_Btn, Print_Btn);
	}
	public void PrintFromeDate(String From) throws IOException, InterruptedException {

		WebElement date = driver.findElement(By.xpath(Print_Peding_From_Date));
		date.sendKeys(Keys.CONTROL + "a");
		date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Print_Peding_From_Date, From);
		date.sendKeys(Keys.TAB);
	}
	public void PrintPendingDrugPop(String Print_pop) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Click_On_Print_Btn)));
		CommanUtill.clickFunction(Click_On_Print_Btn, Print_pop);
	}


	
	//======================== Cancel Pendind Order Drug ================================

	public void ClickOnPendingDrugRadioBtn(String Radio_Btn) throws IOException, InterruptedException {

		WebElement Pending_Radio_Btn = driver.findElement(By.xpath(Click_Pending_Drug_Radio_Btn));
		if( ! Pending_Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Click_Pending_Drug_Radio_Btn, Radio_Btn);
		}
	}
	public void ClickOnPendingDrugsTable(String Pending_Order_Drug) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Pending_Drug_Table)));
		String Drug_Row = driver.findElement(By.xpath(Click_Pending_Drug_Table)).getText();
		System.out.println("========== Select Pending Drug Order In Table ==========");
		logger.info("================= Select Pending Drug Order In Table ====================");
		logger.info(Drug_Row);
		System.out.println("Show Pending Durgs Order : " + Drug_Row);
		CommanUtill.clickFunction(Click_Pending_Drug_Table, Pending_Order_Drug);
	}
	public void ClickOnPendingDrugsSubTable_YesPop(String Pending_Order_Drug , String Cancel_Yes_Pop) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Pending_Drug_Sub_Table)));
		String Drug_Row = driver.findElement(By.xpath(Click_Pending_Drug_Sub_Table)).getText();
		System.out.println("========== Select Pending Drug Order In ***Sub Table**** ==========");
		logger.info("================= Select Pending Drug Order In ***Sub Table*** ====================");
		logger.info(Drug_Row);
		System.out.println("Show Pending Durgs Order  : " + Drug_Row);
		CommanUtill.clickFunction(Click_Pending_Drug_Sub_Table, Pending_Order_Drug);
		Thread.sleep(1500);
		CommanUtill.clickFunction(Yes_Cancel_Drugs, Cancel_Yes_Pop);
	}
	public void ClickOnHomeDashbord(String Home) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Home_Page)));
		CommanUtill.clickFunction(Home_Page, Home);
	}

	//========================  Issued Drug ===========================

	public void ClickOnIssuedDrugs (String Drug_Issue) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Radio_Btn_Issued)));
		CommanUtill.clickFunction(Radio_Btn_Issued, Drug_Issue);
	}
 //=========================== Drug return ============================
 
	public void ClickOnDrugRetunBtn(String Retun_Btn)  throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Drug_Return_Btn)));
		CommanUtill.clickFunction(Drug_Return_Btn, Retun_Btn);
	}
	public void NewDrugRetunRadioBtn(String Radio_Btn) throws IOException, InterruptedException {

		WebElement Pending_Radio_Btn = driver.findElement(By.xpath(Drug_New_Retun_Radio_Btn));
		if( ! Pending_Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Drug_New_Retun_Radio_Btn, Radio_Btn);
		}
	}
	public void ClickOnDrugRetunTable(String New_Retun_Drug) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_New_Return_Drug_Table)));
		String Drug_Row = driver.findElement(By.xpath(Click_New_Return_Drug_Table)).getText();
		System.out.println("========== Select New Drug Retun In Table ==========");
		logger.info("================= Select New Drug Retun In Table ====================");
		logger.info(Drug_Row);
		System.out.println("Show Retun Durgs Table  : " + Drug_Row);
		CommanUtill.clickFunction(Click_New_Return_Drug_Table, New_Retun_Drug);
		
	}
	public void enterRetunDrugQuenty(String Quenty) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(New_Return_Quenty_Text)));
		CommanUtill.textEnter(New_Return_Quenty_Text, Quenty);	
	}
	public void ClickOnRetunSaveBtn(String save_Icon)  throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Save_Btn_Retun_Drug)));
		CommanUtill.clickFunction(Save_Btn_Retun_Drug, save_Icon);
	}
	public void ReasonRetunTextAndOkPop(String Reason , String Ok_Btn) throws IOException, InterruptedException { 
		
		CommanUtill.textEnter(Reason_Retun_Drug_pop, Reason);
		CommanUtill.clickFunction(Reason_Retun_Drug_Ok_Pop, Ok_Btn);
	}
	
	//=========================== Check Pending Retun Drugs =========================
	
	public void CheckPendingRetunDrugRadioBtn(String Radio_Btn) throws IOException, InterruptedException {

		WebElement Pending_Radio_Btn = driver.findElement(By.xpath(Drug_Pending_Retun_Radio_Btn));
		if( ! Pending_Radio_Btn.isSelected()) {
			CommanUtill.clickFunction(Drug_Pending_Retun_Radio_Btn, Radio_Btn);
		}
	}
 //============================ER EDI =========================================
	public void ClickOnEDIBtn(String Discharged_Btn)  throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Click_EDI_Btn)));
		CommanUtill.clickFunction(Click_EDI_Btn, Discharged_Btn);
	}
	public void SelectDischaredTypeAndSubTrpe_Reason(String Discharged_Type , String Sub_Type , String Reasion_Text) 
			throws IOException, InterruptedException {
		
		CommanUtill.dropdownSelectByVisibleText(Discharged_Type_Drp, Discharged_Type);
		CommanUtill.dropdownSelectByVisibleText(Discharged_Sub_Type_Drp, Sub_Type);
		CommanUtill.textEnter(Discharged_Remarks, Reasion_Text);	
	}
	
	public void ClickOnSaveDiscchargedIBtn(String Save_Btn , String Yes_Pop)  throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Save_Discharged_Btn)));
		CommanUtill.clickFunction(Save_Discharged_Btn, Save_Btn);
			
			if (CommanUtill.isElementPresent(Save_Discharged_Yes_Pop)) {
				CommanUtill.clickFunction(Save_Discharged_Yes_Pop, Yes_Pop);

				System.out.println("Sure To Discharge The Patient : " + Yes_Pop);
				logger.info("Sure To Discharge The Patient : " + Yes_Pop);

			} else {
				System.out.println("Sure To Discharge The Patient");
				logger.info("Sure To Discharge The Patient Pop Not Appeared");
			}
		}
	//============================ Cancel ER EDI =========================================
	public void CancelDischaredIntimationTest(String Cancel_Dicharged ,String Yes_Pop) throws IOException, InterruptedException {

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Cancel_Discharge_Intimation_Table)));
		String Discharged_Row = driver.findElement(By.xpath(Cancel_Discharge_Intimation_Table)).getText();
		System.out.println("========== Cancel Dischared Intimation Patient In Table ==========");
		logger.info("================= Cancel Dischared Intimation Patient In Table ====================");
		logger.info(Discharged_Row);
		System.out.println("Cancel Dischared Intimation Patient  : " + Discharged_Row);
		CommanUtill.clickFunction(Cancel_Discharge_Intimation_Table, Discharged_Row);
		Thread.sleep(5000);
		CommanUtill.clickFunction(Cancle_Discharged_Yes_Pop, Yes_Pop);
	}
	public void ReasionOfDischaredText(String Reason , String Yes)throws IOException, InterruptedException {
		
		CommanUtill.textEnter(Reasion_Discharged_Text, Yes);
		CommanUtill.clickFunction(Reasion_Discharged_Yes_Pop, Yes);	
	}
	//============================= Pop Meassage ==================================
	public void handleDynamicPopup(String Pop) throws IOException, InterruptedException {

		logger.info("===== Handle Dynamic Popup =====");

		try {
			Thread.sleep(500);
			if (CommanUtill.isElementPresent(popupMessage)) {
				String message = driver.findElement(By.xpath(popupMessage)).getText().trim();
				System.out.println("Popup Message: " + message);
				logger.info("Popup Message: " + message);

				// Close popup
				if (CommanUtill.isElementPresent(popupCloseBtn)) {
					CommanUtill.clickFunction(popupCloseBtn ,"");
					logger.info("Popup closed successfully");
				}

			} else {
				logger.info("Popup not displayed");
				System.out.println("Popup not displayed");
			}

		} catch (Exception e) {
			logger.info("Error while handling popup: " + e.getMessage());
		}
	}
	
	
	
	}



