/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.test.IpBilling.Page.PackageModifictionPatientPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 25-Feb-2026
 */
public class TC_012_PackageModifictionPatientTest extends PackageModifictionPatientPage {

	PackageModifictionPatientPage Package_Modifiction_Patien = new PackageModifictionPatientPage();

	private final String sheetName = "Package_Modifiction_Patient_Pag";
	private final String sheetName_Adt = "ADT_Package_Multiple";

	@DataProvider(name = "PackageModifictionPatientDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_01: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "PackageModifictionPatientDataProvider", priority = 1 , enabled = true)
	public void SearchPatentPackageModificationTest(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet ,
			String Enter_IP_Number_Excel_Sheet , String From_Date_Find_Patint_Pop , String To_Date_Find_Patint_Pop ) 
					throws IOException, InterruptedException, InvalidApplicationException {


		logger = extent.createTest("TC_012 Package Modification Patient Search", "Search Date Wise Package Modification Patient");

		Package_Modifiction_Patien.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Package_Modifiction_Patien.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Package_Modifiction_Patien.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Package_Modifiction_Patien.clickOnIPPackageDetailsTab("Click On Ip Package Details Tab");
		Package_Modifiction_Patien.PackageModificationPatentPage("Click On Patient Modification Patient");

		Package_Modifiction_Patien.FindPatintSearchIcon("Search Icon in Find Patint");
		Package_Modifiction_Patien.ClickOnCurrentPatientRadioBtn("Radio Btn Current In Patient Finf Patint Pop");
		Package_Modifiction_Patien.CheckBoxAllWard("Check Box All Ward Find Patient Pop");
		Package_Modifiction_Patien.CheckBoxAdmissionDischarge("Check Box Admission Discharge Find Patint Pop");

		Package_Modifiction_Patien.PatientSearchFromAndToDate(From_Date_Find_Patint_Pop ,To_Date_Find_Patint_Pop);
		Package_Modifiction_Patien.ClickOnSearchIconFindPatientPop("Click Search Icon Find Patint Pop");

		Package_Modifiction_Patien.clickLastMinusOneRowAndStoreData("Click On Table Last Row");
		Package_Modifiction_Patien.ClickOnHisLogoIcon("Click On His Logo Icon");

	}

	@DataProvider(name = "ADTPackageDataProvider")
	public Object[][] getPackageData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_02: " + sheetName_Adt + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Adt);
	}

	@Test(dataProvider = "ADTPackageDataProvider", priority = 2 , enabled = true)

	public void AdtMultiplePackage(String ADT_Station_Drp ,String ADT_Speciality_Drp , String ADT_Doctor_Drp , String Department_Drp , 
			String Search_Package_Name , String Enter_Package_Alias_Name) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("TC_012 ADT Multiple Package Add ", "Add Multiple Package Test Funcility");

		Package_Modifiction_Patien.ADTDashbordYesPop("Click On ADT Dashbord", ADT_Station_Drp ,"ADT Station Yes Pop");
		Package_Modifiction_Patien.AdmitPatientPage("Click on Admit Patint Tab" , "Admit Patient Page");
		Thread.sleep(2000);

		String dynamicIP_Number = PackageModifictionPatientPage.storedIPNo;
		Package_Modifiction_Patien.EnterIPNumber(dynamicIP_Number);
		//Package_Modifiction_Patien.EnterIPNumber("29462");

		Package_Modifiction_Patien.ClickOnADTPackageBtn("Click On Package Details Btn");
		Package_Modifiction_Patien.SelectSpecialityAndDoctorDrp(ADT_Speciality_Drp , ADT_Doctor_Drp);
		Package_Modifiction_Patien.AdtPackageIconBtn("Click On Package Icon Btn");
		Package_Modifiction_Patien.DepartmentPackageDetailsPopDrp(Department_Drp);
		Package_Modifiction_Patien.SearchPackageNameBox(Search_Package_Name);
		Package_Modifiction_Patien.clickOnTablePackage("Select Package cliked Table");

		Package_Modifiction_Patien.PackageDetailsPop_BedType_Prce("Table Clicked On Bed Type And Price");
		Package_Modifiction_Patien.PackageSaveIcon("Click On Save Package Details Icon");
		Package_Modifiction_Patien.enterPakageAliasName(Enter_Package_Alias_Name);
		Package_Modifiction_Patien.AddPlusIconPackage("Click On Add Package Icon" ,"Add Package Yes Pop");
		Package_Modifiction_Patien.ClickOnHisLogoIcon("Click On His Logo Icon");

	}
	@Test(dataProvider = "PackageModifictionPatientDataProvider", priority = 3 , enabled = true)

	public void PackageModifictionpatientFirstColumn(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet ,
			String Enter_IP_Number_Excel_Sheet , String From_Date_Find_Patint_Pop , String To_Date_Find_Patint_Pop )
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("TC_012 ADT Multiple Package Line Items To Non_Chargeable", "Non_Chargeable Package Test Funcility");

		Package_Modifiction_Patien.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Package_Modifiction_Patien.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Package_Modifiction_Patien.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Package_Modifiction_Patien.clickOnIPPackageDetailsTab("Click On Ip Package Details Tab");
		Package_Modifiction_Patien.PackageModificationPatentPage("Click On Patient Modification Patient");

		String dynamicIP_Number = PackageModifictionPatientPage.storedIPNo;
		Package_Modifiction_Patien.EnterPackageModificationIPNumber(dynamicIP_Number);

		Package_Modifiction_Patien.SelectByPackageNameIndex(3);
		Package_Modifiction_Patien.SelectByServiceName("ALL");

		Package_Modifiction_Patien.SelectLineItemsCheckBox("Check Box Select Line Items");
		Package_Modifiction_Patien.ClickOnArrowSecondColumnToFitstColumn("Click On Arrow Inclusion Side");
		
		Package_Modifiction_Patien.SavePackageModificationBtn("Click on Save Package Modification Btn" ,
				"Items Save Yes Pop" ,"Conformation Yes Pop");
		Package_Modifiction_Patien.NoNamePrintAndSaveBtn("Click on Right Icon");
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

	@Test(dataProvider = "PackageModifictionPatientDataProvider", priority = 4 , enabled = true)

	public void PackageModifictionpatientExclusionService(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet ,
			String Enter_IP_Number_Excel_Sheet , String From_Date_Find_Patint_Pop , String To_Date_Find_Patint_Pop )
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("TC_012 ADT Multiple Package Line Items To Exclusion", "Second Cloumn To Thtid Column Test Funcility");

		String dynamicIP_Number = PackageModifictionPatientPage.storedIPNo;
		Package_Modifiction_Patien.EnterPackageModificationIPNumber(dynamicIP_Number);

		Package_Modifiction_Patien.SelectByPackageNameIndex(3);
		Package_Modifiction_Patien.SelectByServiceName("ALL");
		
		Package_Modifiction_Patien.SelectLineItemsMoveTo_Exclusion("Check Box Select Line Items");
		Package_Modifiction_Patien.ClickOnArrowSecondColumnToThirdColumn("Click on Arrow Right Side Exclusion");
		
		Package_Modifiction_Patien.SavePackageModificationBtn("Click on Save Package Modification Btn" ,
				"Items Save Yes Pop" ,"Conformation Yes Pop");
		
		Package_Modifiction_Patien.NoNamePrintAndSaveBtn("Click on Right Icon");
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "PackageModifictionPatientDataProvider", priority = 5 , enabled = true)

	public void PackageModifictionpatient_FirstColumn(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet ,
			String Enter_IP_Number_Excel_Sheet , String From_Date_Find_Patint_Pop , String To_Date_Find_Patint_Pop )
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("TC_012 First Column To Second Column", "Update First Column To Second Column");

		String dynamicIP_Number = PackageModifictionPatientPage.storedIPNo;
		Package_Modifiction_Patien.EnterPackageModificationIPNumber(dynamicIP_Number);

		Package_Modifiction_Patien.SelectByPackageNameIndex(3);
		Package_Modifiction_Patien.SelectByServiceName("ALL");
		
		Package_Modifiction_Patien.SelectFirstColumnPackageServiceCheckBox("Check Box Select First Column");
		Package_Modifiction_Patien.ClickArrowFirstColumnIntoLineItems("First Column To Second Column");
		Package_Modifiction_Patien.SaveBtnFirstCoumnToSecondColumn("Save Icon First Column To Second Column", "Yes Pop");
		
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "PackageModifictionPatientDataProvider", priority = 6 , enabled = true)

	public void PackageModifictionpatient_ThridColumn(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet ,
			String Enter_IP_Number_Excel_Sheet , String From_Date_Find_Patint_Pop , String To_Date_Find_Patint_Pop )
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("TC_012 Thrid Column To Second Column", "Update Thrid Column To Second Column");

		String dynamicIP_Number = PackageModifictionPatientPage.storedIPNo;
		Package_Modifiction_Patien.EnterPackageModificationIPNumber(dynamicIP_Number);

		Package_Modifiction_Patien.SelectByPackageNameIndex(3);
		Package_Modifiction_Patien.SelectByServiceName("ALL");
		
		Package_Modifiction_Patien.SelectThridColumnPackageServiceCheckBox("Check Box Exclusion");
		Package_Modifiction_Patien.ClickArrowThridColumnIntoLineItems("Exclusion To Line Items Arrow Icon");
		Package_Modifiction_Patien.SaveBtnFirstCoumnToSecondColumn("Save Exclusion To Line Items Icon ", "Yes Pop");
		
	}

}
