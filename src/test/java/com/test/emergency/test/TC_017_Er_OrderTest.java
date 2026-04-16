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
import com.test.Pharmacy.Page.Pharmacy_IpReturnPage;
import com.test.emergency.page.Er_OrderPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 08-Apr-2026
 */
public class TC_017_Er_OrderTest extends Er_OrderPage {

	Er_OrderPage ER_Order = new Er_OrderPage();
	Pharmacy_IpIssuePage IpIssue = new Pharmacy_IpIssuePage();
	Pharmacy_IpReturnPage IpRetun = new Pharmacy_IpReturnPage();

	private final String sheetName = "ER_Order_Page"; 
	private final String sheetName_Pharmacy_IpIssue = "Pharmacy_IpIssue_Page";
	private final String sheetName_Pharmacy_IpRetun = "Pharmacy_Retun_Page";


	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getErOrderData() throws IOException {
		System.out.println("=========Sheet Name_01: " + sheetName + "==========");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 1 ,enabled = false)	
	public void SearchOccupiedPatientTest(String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
			String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
			String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
			String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
			String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
			String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
			String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Search Occupied Patient", "Search Occupied Patient Test Funcility.");

		ER_Order.selectByFacilityDropdown(facility_drp);
		ER_Order.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		ER_Order.clickOnEmercencyErOrder("Er Order Tab","Er Order Page");
		//ER_Order.ErOrderSearchVacantCheckBox("Check Vacant Bed Check Box");
		ER_Order.ErSearchPatient(Patient_Type_Drp , Enter_Er_Number);

		ER_Order.SearchAndClickTopGreenPatient();

	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 2 ,enabled = false)	
	public void InvestigationsOrderTest(String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
			String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
			String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
			String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
			String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
			String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
			String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Search Occupied Patient", "Search Occupied Patient Test Funcility.");

		ER_Order.ClickOnInvestigationsBtnAndNewOrders("Click Investigation Btn" , "Radio Btn In New Order");
		ER_Order.ClickOnPathologyRadioBtn("Pathology Radio Btn");

		ER_Order.InvegationDoctorAndPriorityDrp(Doctor_Name_Drp , Priority_Drp);
		ER_Order.SearchNewOrderTest(Entetr_Pathology_Test);

		ER_Order.ClickOnNewOrderPathologyTestInTable("Click On Pathology Test In Table");
		ER_Order.PathologySelectSampleDrp(Select_Pathology_Sample_Drp);    // Optional Drp 
		/*	
		//2. Other Test 
		ER_Order.RadioBtnInvgOtherTests("Click On Radio Btn In other Test");
		ER_Order.SearchNewOrderTest(Entetr_Other_Test);
		ER_Order.ClickOnNewOrderPathologyTestInTable("Click On Other Test In Table");

		//3. Profiles 
		ER_Order.RadioBtnInvgProfilesTests("Click On Profiles Radio Btn");
		ER_Order.SearchNewOrderTest(Entetr_Profiles_Test);
		ER_Order.ClickOnNewOrderPathologyTestInTable("Click On Other Test In Table");
		 */	
		//ER_Order.NumberOfTimeTextPathologySubTable(Enter_No_Of_Times);
		ER_Order.ClickOnSaveBtn("Click on Save Btn");
		Thread.sleep(2000);

	} 
	@Test(priority = 3 ,enabled = false)	
	public void PendingOrderSaveTest() throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Er Pending Order", " Double click on the pending order Test Funcility.");

		ER_Order.ClickOnPendingOrder("Click On Pending Order Show In Sub Table");
		ER_Order.ClickOnPendingOrderInSubTable("Click On Sub Table In Row");

		ER_Order.EnterSampleCollectionRemarks("Bar Code Sample Collect Remaks");
		ER_Order.SavePendOrderBarCodeCollectPop("Click Save Bar Code and Collect Sample");

		ER_Order.ClosePendOrderBarCodeCollectPop("Close Simple Collecton Pop");
		Thread.sleep(1500);
	}

	@Test(priority = 4 ,enabled = false)	
	public void PrintCompletedOrderTest() throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Print Completed Order", " Print Completed Order Test Funcility.");

		ER_Order.ClickOnInvgCompletedRadioBtn("Click On Radio Btn In Completed");
		ER_Order.ClickOnCompletedOrderTable("Click On Complete Order Table");
		ER_Order.PrintInCompletedOrder("Print In Complet Order");

	}

	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 5 , enabled = false)	
	public void  GeneralOrderEntryTest (String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
			String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
			String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
			String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
			String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
			String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
			String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest(" General Order Entry ", " General Order Entry Test Funcility.");

		ER_Order.ClickGeneralOrderEntry_ProceBtn("Click On General Order Entry Btn");
		ER_Order.CheckBoxProcedureAndCategoryDrp("Check Box Click On Procedure " , Category_Drp);
		ER_Order.SelectByProceOrderedByDrp(Gen_Ordered_By_Drp);

		ER_Order.SearchGeneralOrderEntryItems(Search_By_Gen_Order_Items);  //Not Working UI
		ER_Order.ClickOnFirstGeneralOrderEntryItemsTable("Click On Table In First General Order Items Table");

		ER_Order.AfterProcedureSelectSecondRightSideTable("Show Gen Order Entry Item In Right Side Table");
		ER_Order.SelectByProcedurePerformedByDrp(1);
		//2nd order	
		Thread.sleep(800);
		ER_Order.ClickOnSecondGeneralOrderEntryItemsTable("Click On Table In Second General Order Items Table");
		ER_Order.SelectByProcedureSecondPerformedByDrp(3);
		ER_Order.EnterRemarksGenOrderItem(Remarks_Gen_Order);
	}

	@Test(priority = 6 ,enabled = false)	
	public void SaveGeneralOrderEntryTest() throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Save General Order Entry Items", " Save General Order Entry Items Test Funcility.");

		ER_Order.ClickOnSaveGeneralOrderItems("Click On Save Btn In General Order Items");
		Thread.sleep(1000);
		ER_Order.NoConsumables_Mapped_Procedure_ConsumptionPOP("Not mapped consumption Consumables Items Pop");
		//ER_Order.YesConsumables_Mapped_Procedure_ConsumptionPOP("Yes mapped consumption Consumables Items Pop");
		Thread.sleep(2000);
	}
	@Test(priority = 7 ,enabled = false)	
	public void DeleteGeneralOrderEntryTest() throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Delet General Order Entry Items", " Delet General Order Entry Items Test Funcility.");

		//ER_Order.ClickGeneralOrderEntry_ProceBtn("Click On General Order Entry Btn");  Use Method 5

		ER_Order.ClickOnSaveItemsInSubTable("Click On Save Items In Sub Table");
		ER_Order.SelectProcedureCheckBox("Select Check Box Procedure Name Row");
		Thread.sleep(2000);
		ER_Order.DeleteGeneralOrderItems("Click On Delete Btn");	
	}

	//================================ Drug =============================
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 8 , enabled = false)	
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
		ER_Order.SelectStoreDrp(Drug_Select_Store_Drp);

		ER_Order.ClickOnOrderSetCheckBox("Select Order Set Check Box");
		ER_Order.SelectItemCodeDrp(Drug_Item_Code_Drp);
		ER_Order.SelectOrderingDoctorDrp(Drug_Ordering_Doctor_Drp);

		//1 .Drug	
		ER_Order.ClickOnDrugOrderInTable("Click On New Order Drug In Table");
		ER_Order.MultipleDrugOrderYesPop("Yes Pop already active for the Patient Ordered ");

		//2 .Drug	
		ER_Order.SearchInDurg(Search_Box_Drug);
		ER_Order.ClickOnDrugOrderInTable("Click On New Order Drug In Table");
		ER_Order.MultipleDrugOrderYesPop("Yes Pop already active for the Patient Ordered ");

		ER_Order.SubTableFirstRow_RouteDrp_FrequencyDrp_DurationText_IntervalDrp_QuantityText_Priority_Drp_RemarksText_UOMDrp_Dose_Drp
		(Drug_Route_Drp , Drug_Frequency_Drp , Drug_Duration ,Drug_Interval_Drp , Drug_Quantity , Drug_Priority , Drug_Remarks , Drug_UOM_Drp ,
				Drug_Dose);

		Thread.sleep(800);
		ER_Order.SubTableSecondRow_RouteDrp_FrequencyDrp_DurationText_IntervalDrp_QuantityText_Priority_Drp_RemarksText_UOMDrp_Dose_Drp
		(Drug_Route_Drp , Drug_Frequency_Drp , Drug_Duration ,Drug_Interval_Drp , Drug_Quantity , Drug_Priority , Drug_Remarks , Drug_UOM_Drp ,
				Drug_Dose);

		ER_Order.SaveDrugBtn("Click on New Drug Order Save Btn");	
		ER_Order.YesPopAlertPop("Click On Yes Alert Pop like  permissible time range");
		Thread.sleep(5000);

	}
	
	@Test(priority = 9 , enabled = false)	
	public void PrintPendingDrugsOrderTest() throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Print Pending Drugs ", "Print Pending Drugs Test Funcility.");
		
		ER_Order.ClickOnPendingDrugRadioBtn("Click On Pending Drug Radio");
		Thread.sleep(10000);
		ER_Order.PrintPendingDrugBtn("Print on Pending Drug Odder");
		ER_Order.PrintPendingDrugPop("Click On Print Pop");
		
	}

	@Test(priority = 10 ,enabled = false)	
	public void CancelPendingDrugsOrderTest() throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Cancel Pending Drugs ", " Cancel Pending Drugs Test Funcility.");

		ER_Order.ClickOnPendingDrugRadioBtn("Click On Pending Drug Radio");

		ER_Order.ClickOnPendingDrugsTable("Click On Table In Pending Drugs");
		Thread.sleep(8000);
		ER_Order.ClickOnPendingDrugsSubTable_YesPop("Click On Sub Table In Pending Drugs" , "Cancel Drugs Yes Pop");

		Thread.sleep(1500);
		ER_Order.ClickOnHomeDashbord("Click On Home Page");
	}

	//=============================== ========================== =====================================
	//============================== Pharmacy Ip Issue ===============================================
	//============================== ========================== =======================================


	@DataProvider(name = "PharmacyIPIssueDataProvider")
	public Object[][] getIPIssueData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_02: " + sheetName_Pharmacy_IpIssue + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy_IpIssue);
	}

	@Test(dataProvider = "PharmacyIPIssueDataProvider", priority = 11 , enabled = false)
	public void PharmacyIpIssueTest(String Dashborad_Facility_Drp , String Pharmacy_Station_Drp ) 
			throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Pharmacy Ip Issue ", "Ip Issue Test Funcility");

		IpIssue.SelectByFacilityDrp("SANITY HOSPITAL");
		IpIssue.ClickOnPharmacyDashboard("Click On Pharmacy DashBorad" , Pharmacy_Station_Drp , " Station Yes Popup");

		IpIssue.ClickOnIpIsueMenuAndPage("Click On Ip Issue Menu Table" , "Ip Issue Page");
		IpIssue.EnterErNumber("1508875");

		IpIssue.ClickOnPendingOrderInTable("Click On Pending Drug In Pharmacy");
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
	
	//=============================== ========================== =====================================
	//============================== Emergency Module ===============================================
	//============================== ========================== =======================================
	
	@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 12 ,enabled = false)	
	public void SearchOccupiedPatientTest_2(String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
			String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
			String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
			String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
			String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
			String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
			String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
					throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Emergency Search Occupied Patient", "Search Occupied Patient Test Funcility.");

		ER_Order.selectByFacilityDropdown(facility_drp);
		ER_Order.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

		ER_Order.clickOnEmercencyErOrder("Er Order Tab","Er Order Page");
		ER_Order.ErSearchPatient(Patient_Type_Drp , Enter_Er_Number);

		ER_Order.SearchAndClickTopGreenPatient();
	}
	
	@Test(priority = 13 ,enabled = false)	
	public void CheckVerifyDrugsIssuedTest () throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("Issued Drugs Radio Btn", "Check Pharmacy Drugs Issue Test Funcility.");

		ER_Order.ClickOnDrugBtn("Click On Drug Btn");
		ER_Order.ClickOnIssuedDrugs("Click On Issued Radio Btn");
	}
	
	@Test(priority = 14 ,enabled = false)	
	public void NewRetunDrugTestFuncility () throws IOException, InvalidFormatException, InterruptedException{

		logger = extent.createTest("New Retun Drug  Er Order", "New Retun Drug Retun Test Funcility.");

		ER_Order.ClickOnDrugRetunBtn("Click On Drug Retun Btn");
		ER_Order.NewDrugRetunRadioBtn("Click On New Retun Drug Radio Btn");
		
		ER_Order.ClickOnDrugRetunTable("Click In Retun Drug Table");
		ER_Order.enterRetunDrugQuenty("1");
		
		ER_Order.ClickOnRetunSaveBtn("Click On Save Retun Btn");
		ER_Order.ReasonRetunTextAndOkPop("Reason Of Retun Text Message" ,"Click On Reason Of Ok Pop");
		Thread.sleep(1500);
		ER_Order.ClickOnHomeDashbord("Click On Home Page");
		
	}
	//=============================== ========================== =====================================
	//============================== Pharmacy Ip Retun ===============================================
	//============================== ========================== =======================================
	
		@DataProvider(name = "PharmacyIPRetunDataProvider")
		public Object[][] getIpRetunData() throws IOException {
	 
			System.out.println("====Fetching data from Excel sheet_03: " + sheetName_Pharmacy_IpRetun + " ====");
			return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy_IpRetun);
		}

		@Test(dataProvider = "PharmacyIPRetunDataProvider", priority = 15 , enabled = false)
		public void PharmacyIpRetunTest(String Dashborad_Facility_Drp , String Pharmacy_Station_Drp ) 
						throws IOException, InterruptedException, InvalidApplicationException {
			
			logger = extent.createTest("Pharmacy Ip Retun ", "Ip Retun Test Funcility");
			
			IpRetun.SelectByFacilityDrp("SANITY HOSPITAL");
			IpRetun.ClickOnPharmacyDashboard("Click On Pharmacy DashBorad" , Pharmacy_Station_Drp , " Station Yes Popup");
			
			IpRetun.ClickOnIpIsueMenuAndRetunPage("Click On Ip Issue Menu Table" , "Ip Retun Page");
			IpRetun.EnterErNumber("1508875");
			
			IpRetun.ClickOnReturnInTable("Click On Pending Drug In Pharmacy");
			IpRetun.SelectCheckBoxIpRetunPop("Select Check Box Ip Retun Pop");
			
			IpRetun.SaveBtnAndYesPop("Ip Retun Save Btn" , "Succss Message Yes Pop");
			IpRetun.PrintYesPop("Yes Print In Retun Drugs");
	
			Thread.sleep(1500);
			ER_Order.ClickOnHomeDashbord("Click On Home Page");
		}
		
		
		//=============================== ========================== =====================================
		//============================== Emergency Module ===============================================
		//============================== ========================== =======================================
		
		@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 16 ,enabled = true)	
		public void SearchOccupiedPatientTest_3(String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
				String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
				String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
				String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
				String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
				String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
				String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
						throws IOException, InvalidFormatException, InterruptedException{

			logger = extent.createTest("Emergency Search Occupied Patient", "Search Occupied Patient Test Funcility.");

			ER_Order.selectByFacilityDropdown(facility_drp);
			ER_Order.clickOnEmergencyDashbord_StationDrpYesPop("Emergency DashBord Button" , Station_drp, "Station On Yes Popup");

			ER_Order.clickOnEmercencyErOrder("Er Order Tab","Er Order Page");
			ER_Order.ErSearchPatient(Patient_Type_Drp , Enter_Er_Number);

			ER_Order.SearchAndClickTopGreenPatient();
		}
		
		@Test(priority = 17 ,enabled = true)	
		public void CheckAndVerifyPendingNewRetunDrugTestFuncility () throws IOException, InvalidFormatException, InterruptedException{

			logger = extent.createTest("Check Pending New Retun Drug", "Check Pending New Retun Drug Test Funcility.");

			ER_Order.ClickOnDrugRetunBtn("Click On Drug Retun Btn");
			ER_Order.CheckPendingRetunDrugRadioBtn("Click On Pending Drug Retun Radio Btn");
		}
		
		@Test(dataProvider = "ExcelUniversalDataProvider" , priority = 18 ,enabled = true)	
		public void EmergencyDischargeIntimationTest (String facility_drp, String Station_drp , String Patient_Type_Drp , String Enter_Er_Number ,
				String Doctor_Name_Drp , String Priority_Drp , String Entetr_Pathology_Test , String Select_Pathology_Sample_Drp ,
				String Entetr_Other_Test , String Entetr_Profiles_Test , String Enter_No_Of_Times , String Category_Drp,String Gen_Ordered_By_Drp,
				String Search_By_Gen_Order_Items , String Remarks_Gen_Order , String Drug_Select_Store_Drp , String Drug_Item_Code_Drp ,
				String Drug_Ordering_Doctor_Drp , String Search_Box_Drug , String Drug_Route_Drp , String Drug_Frequency_Drp , String Drug_Duration,
				String Drug_Interval_Drp , String Drug_Quantity , String Drug_Priority , String Drug_Remarks ,String Drug_UOM_Drp,String Drug_Dose ,
				String Discharge_Type_Drp , String Discharge_Sub_Type_Drp , String Discharge_Remaks)
						throws IOException, InvalidFormatException, InterruptedException{

			logger = extent.createTest("Emergency Search Occupied Patient", "Search Occupied Patient Test Funcility.");
			
			ER_Order.ClickOnEDIBtn("Click On EDI Button");
			ER_Order.SelectDischaredTypeAndSubTrpe_Reason(Discharge_Type_Drp , Discharge_Sub_Type_Drp , Discharge_Remaks); 
			
			ER_Order.ClickOnSaveDiscchargedIBtn("Click On Discharged Save Btn" , "Discharged Yes Pop");
			Thread.sleep(5000);
			
		}	
		
		@Test(priority = 19 ,enabled = true)	
		public void CancleDischargedIntimationTestFuncility () throws IOException, InvalidFormatException, InterruptedException{

			logger = extent.createTest("Cancle Discharged Intimation Patient", "Cancle Discharged Intimation Patient Test Funcility.");

			ER_Order.CancelDischaredIntimationTest("Dischared Patient In Table" ," Cancle Discharged Intimation Patient Yes Pop");
			ER_Order.ReasionOfDischaredText("Reason Cancel Dischaged" , "Click On Yes Cancel Dischared Yes Pop");
}
    }
