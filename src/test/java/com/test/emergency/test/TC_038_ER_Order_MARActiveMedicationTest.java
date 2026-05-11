/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;
import javax.management.InvalidApplicationException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Pharmacy.Page.Pharmacy_IpIssuePage;
import com.test.emergency.page.ER_Order_MARPage;
import com.test.emergency.page.Er_OrderPage;
import com.test.readdata.ExcelSheetDataProvider;

import junit.framework.Assert;

/**
 * @author Anup
 *
 * 07-May-2026
 */
public class TC_038_ER_Order_MARActiveMedicationTest extends ER_Order_MARPage {

	ER_Order_MARPage Medicine_Administration_Record = new ER_Order_MARPage();
	Er_OrderPage ER_Order = new Er_OrderPage();
	Pharmacy_IpIssuePage IpIssue = new Pharmacy_IpIssuePage();

	private final String sheet_Name = "Er_MAR_Page"; 
	private final String sheetName = "ER_Order_Page"; 
	private final String sheetName_Pharmacy_IpIssue = "Pharmacy_IpIssue_Page";

	String delay = "3";
	String delay_nagative = "-8";

	@DataProvider(name = "MARDataProvider")
	public Object[][]getData() throws IOException{
		System.out.println("=========Sheet Name_01: " + sheet_Name + "==========");
		return ExcelSheetDataProvider.getExcelData(sheet_Name);
	}

	@Test(dataProvider = "MARDataProvider" ,  priority = 1 ,enabled = true)
	public void SelectOccupiedPatientInRightTab(String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Select Er Patient","Emergency Select Er Patient Test Funcility");

		Medicine_Administration_Record.selectByFacilityDropdown(Facility);
		Medicine_Administration_Record.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Medicine_Administration_Record.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.ErSearchPatient (Patient_Type_Drp , Enter_Er_Number);
		ER_Order.SearchAndClickTopGreenPatient();
	}

	@Test(dataProvider = "MARDataProvider" , priority = 2 , enabled = true)
	public void ErMARCheckActiveMedicationTest(String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency MAR Active Medication", "Emergency MAR Active Medication Test Funcility");

		Medicine_Administration_Record.ClickOnMARBtn("Click On MAR Button");
	}

	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getErOrderData() throws IOException {
		System.out.println("=========Sheet Name_02: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 3 , enabled = true)	
	public void  NewDrugOrderTest (String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
			String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
			String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
			String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
			String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
			String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
			String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("New Drug Order ", "New Drug Order Test Funcility.");

		ER_Order.ClickOnDrugBtn("Click On Drug Btn");
		ER_Order.ClickOnNewOrdersRadioBtn("Click On New Order Drug Radio Btn");
		ER_Order.SelectOrderingDoctorDrp(Drug_Ordering_Doctor_Drp);

		ER_Order.SearchInDurg(Search_Box_Drug);
		ER_Order.ClickOnDrugOrderInTable("Click On New Order Drug In Table");
		ER_Order.MultipleDrugOrderYesPop("Yes Pop already active for the Patient Ordered ");

		ER_Order.SubTableFirstRow_RouteDrp_FrequencyDrp_DurationText_IntervalDrp_QuantityText_Priority_Drp_RemarksText_UOMDrp_Dose_Drp
		(Drug_Route_Drp , Drug_Frequency_Drp , Drug_Duration ,Drug_Interval_Drp , Drug_Quantity , Drug_Priority , Drug_Remarks , Drug_UOM_Drp ,
				Drug_Dose);

		ER_Order.SaveDrugBtn("Click on New Drug Order Save Btn");	
		ER_Order.YesPopAlertPop("Click On Yes Alert Pop like  permissible time range");
		ER_Order.handleDynamicPopup("Meassage Popup");

		ER_Order.ClickOnHomeDashbord("Click On Home Page");
	}

	//=============================== ========================== =====================================
	//============================== Pharmacy Ip Issue ===============================================
	//============================== ========================== ======================================

	@DataProvider(name = "PharmacyIPIssueDataProvider")
	public Object[][] getIPIssueData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_03: " + sheetName_Pharmacy_IpIssue + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy_IpIssue);
	}

	@Test(dataProvider = "PharmacyIPIssueDataProvider", priority = 04 , enabled = true)
	public void PharmacyIpIssueTest(String Dashborad_Facility_Drp , String Pharmacy_Station_Drp ) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Pharmacy Ip Issue ", "Ip Issue Test Funcility");

		IpIssue.SelectByFacilityDrp("SANITY HOSPITAL");
		IpIssue.ClickOnPharmacyDashboard("Click On Pharmacy DashBorad" , Pharmacy_Station_Drp , " Station Yes Popup");
		IpIssue.ClickOnIpIsueMenuAndPage("Click On Ip Issue Menu Table" , "Ip Issue Page");

		IpIssue.ClickLastPendingOrderInTable("Click On Pending Drug In Pharmacy");
		IpIssue.ThisOrderIsCurrentlylockedYesPop("Click On Currently Locked Order Yes Pop");

		Thread.sleep(1200);
		IpIssue.ClickOnIpIssueDetailsFirstRowTable("Table In Ip Issue Details Drug Name");
		IpIssue.EnterRemarksIpIssueDetals("Ip Issue Remarks Anup" , "Click On Remarks Save Btn");
		Thread.sleep(5000);
		IpIssue.SaveIpIssueDetalsBtn("Click On Save Btn" , "Yes Pop");

		IpIssue.IpIssueDetailsPrintYesPop("Click On Print Yes Pop");
		Thread.sleep(1000);
		IpIssue.CloseGenerateBarcodPop("Close Bar Code Pop");
		Thread.sleep(1000);
		ER_Order.ClickOnHomeDashbord("Click On Home Page");
	}

	@Test(dataProvider = "MARDataProvider" ,  priority = 5 ,enabled = true)
	public void EnterSamePatientInErOrder (String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Emergency Select Er Patient","Emergency Select Er Patient Test Funcility");

		Medicine_Administration_Record.selectByFacilityDropdown(Facility);
		Medicine_Administration_Record.clickOnEmergencyDashbord_StationDrpYesPop("Click On Emergency Dashbord" , Station , "Yes Pop");
		Medicine_Administration_Record.clickOnEmercencyErOrder("Click On Er Order Tab" ,"Er Order Page");

		ER_Order.ErSearchPatient (Patient_Type_Drp , Enter_Er_Number);
		ER_Order.SearchAndClickTopGreenPatient();
	}

	@Test(dataProvider = "MARDataProvider" , priority = 6 , enabled = true)
	public void ActiveMedicationAdministerNowTest (String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Active Medication Administer Now ", "Active Medication Administer Now Test Funcility");

		Medicine_Administration_Record.ClickOnMARBtn("Click On MAR Button");
		Medicine_Administration_Record.RadioBtnActiveMedication("Radio Btn In Active Medication");

		Medicine_Administration_Record.ClickOnMarMedicationSubTable("Medication Sub Table Click");
		Medicine_Administration_Record.YesMultipleAdministrationPopup("Click Yes Pop Multiple administratio");
		
		Medicine_Administration_Record.PopWillAppearedClickOnMarMedicationSubTable("Pop Condition In Sub Table");   //
		Medicine_Administration_Record.RadioBtnAdministerNow_ReasonRemarksDrp_Remarks("Radio Btn Administer Now",
				Administer_Now_Reason_Remarks_Drp , Administer_Now_Remarks);   //First Schedule

		Medicine_Administration_Record.ClickOnSaveAdministerNowBtn("Click On Save Administer Now Popup");
		ER_Order.handleDynamicPopup("Meassage Popup");	
	}

	@Test(dataProvider = "MARDataProvider" , priority = 7 , enabled = true)
	public void ActiveMedication_ChangeScheduleTest (String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Active Medication Change Schedule In +Ve Hours", "Active Medication Change Schedule In +Ve Hours Test Funcility");


		Medicine_Administration_Record.RadioBtnActiveMedication("Radio Btn In Active Medication");

		Medicine_Administration_Record.ClickOnMarMedicationSubTable("Medication Sub Table Click");
		Medicine_Administration_Record.YesMultipleAdministrationPopup("Click Yes Pop Multiple administratio");

		Medicine_Administration_Record.RadioBtnChangeSchedule("Click On Change Schedule Radio Btn");   //Change Schedule
		Medicine_Administration_Record.ChangeScheduleReasonDrp_Remarks(Change_Schedule_Reason , Change_Schedule_Remarks);

		// Capture current Next Schedule BEFORE change
		String beforeNext = Medicine_Administration_Record.getNextSchedule();
		Medicine_Administration_Record.enterDelayByHours(delay);
		Medicine_Administration_Record.ClickOnSaveAdministerNowBtn("Click On SaveChange Schedule Popup");

		ER_Order.handleDynamicPopup("Success Popup");

		Thread.sleep(2000);
		String actualNext = Medicine_Administration_Record.getNextSchedule();
		String expectedNext = Medicine_Administration_Record.calculateExpected(beforeNext, Integer.parseInt(delay));

		// Exact match (no need diff now)
		Assert.assertEquals(actualNext, expectedNext);

		logger.info("Before Next: " + beforeNext);
		logger.info("Expected: " + expectedNext);
		logger.info("Actual: " + actualNext);
	}
	
	@Test(dataProvider = "MARDataProvider" , priority = 8 , enabled = true)
	public void ActiveMedication_ChangeScheduleInBackwardHoursTest (String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Active Medication Change Schedule In -Ve Hours", "Active Medication Change Schedule In -Ve Hours Test Funcility");


		Medicine_Administration_Record.RadioBtnActiveMedication("Radio Btn In Active Medication");

		Medicine_Administration_Record.ClickOnMarMedicationSubTable("Medication Sub Table Click");
		Medicine_Administration_Record.YesMultipleAdministrationPopup("Click Yes Pop Multiple administratio");

		Medicine_Administration_Record.RadioBtnChangeSchedule("Click On Change Schedule Radio Btn");   //Change Schedule -ve
		Medicine_Administration_Record.ChangeScheduleReasonDrp_Remarks(Change_Schedule_Reason , Change_Schedule_Remarks);

		String beforeNext = Medicine_Administration_Record.getNextSchedule();
		String delayNegative = Medicine_Administration_Record.getSafeNegativeDelay(beforeNext);
		Medicine_Administration_Record.enterDelayByHours(delayNegative);

		String expectedNext = Medicine_Administration_Record.calculateExpected(beforeNext, Integer.parseInt(delayNegative));
		Medicine_Administration_Record.ClickOnSaveAdministerNowBtn("Save");
		ER_Order.handleDynamicPopup("Success Popup");

		Thread.sleep(2000);
		String actualNext = Medicine_Administration_Record.getNextSchedule();
		Assert.assertEquals(actualNext, expectedNext);
	}
	
	@Test(dataProvider = "MARDataProvider" , priority = 9 , enabled = false)
	public void ActiveMedication_UnablToAdministerTest (String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Active Medication Unable To Administer", "Active Medication Unable To Administer Test Funcility");

		Medicine_Administration_Record.RadioBtnActiveMedication("Radio Btn In Active Medication");

		Medicine_Administration_Record.ClickOnMarMedicationSubTable("Medication Sub Table Click");
		Medicine_Administration_Record.YesMultipleAdministrationPopup("Click Yes Pop Multiple administratio");
	
		Medicine_Administration_Record.RadioBtnUnableAdminister("Unable to Administer Radio Btn");
		Medicine_Administration_Record.UnableAdministerDoseReasonDrp_Remarks(Unable_Administer_Reason_Drp , Unable_Administer_Remarks);
		
		Medicine_Administration_Record.ClickOnSaveAdministerNowBtn("Click On Save Unable to Administer Popup");
		ER_Order.handleDynamicPopup("Meassage Popup");	
	}
	
	@Test(dataProvider = "MARDataProvider" , priority = 10 , enabled = true)
	public void ActiveMedication_AdverseeventTest (String Facility , String Station , String Patient_Type_Drp , String Enter_Er_Number , 
			String Administer_Now_Reason_Remarks_Drp , String Administer_Now_Remarks ,String Change_Schedule_Reason,String Change_Schedule_Remarks ,
			String Unable_Administer_Reason_Drp , String Unable_Administer_Remarks) 
					throws IOException, InterruptedException {

		logger = extent.createTest("Active Medication Adverse event", "Active Medication Adverse event Test Funcility");

		Medicine_Administration_Record.RadioBtnActiveMedication("Radio Btn In Active Medication");

		Medicine_Administration_Record.RightClickOnMarMedicationSubTable("Medication Sub Table Click");
		Medicine_Administration_Record.ClickOnAdverseEventBtn("Click On Adverse event Table");
		Medicine_Administration_Record.SelectByAdverseEvent_GenericDrp_ReactionIndex(2 , 3);
		
		Medicine_Administration_Record.RadioBtnAdverseEventSeverityModerate("Click On Radio Btn Adverse Event Severity Moderate");
		Medicine_Administration_Record.AdverseEventInformedRadioBtn("Adverse Event Informed Radio Btn");
		Medicine_Administration_Record.AdverseEventText_DoctorInformedActionTaken("Event_Text" , "Doctor_Informed_By" ,"Adverse Event Action taken");
		
		Medicine_Administration_Record.ClickOnSaveAdverseEventBtn("Click On Save Adverse Event Btn");
		ER_Order.handleDynamicPopup("Meassage Popup");	
	}
	
	@Test(priority = 11 , enabled = true)
	public void CheckAdministrationRecordAdverseEventTest () 
					throws IOException, InterruptedException {

		logger = extent.createTest("Check Administration Record & Adverse Event","Check Administration Record & Adverse Event Test Funcility");
		
		Medicine_Administration_Record.AdministrationRecordRadioBtn(" Administration Record Radio Btn");
		Medicine_Administration_Record.AdverseEventRadioBtn("Adverse Event Radio Btn");
	}
}
