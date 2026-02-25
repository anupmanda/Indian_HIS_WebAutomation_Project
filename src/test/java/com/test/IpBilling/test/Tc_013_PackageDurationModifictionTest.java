/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.PackageDurationModifictionPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 24-Feb-2026
 */
public class Tc_013_PackageDurationModifictionTest extends PackageDurationModifictionPage{
	
	PackageDurationModifictionPage Package_Duration_Modifiction = new PackageDurationModifictionPage();
	
	private final String sheetName = "Package_Duration_Modifiction";

	@DataProvider(name = "PackageDurationModifictionDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet_01: " + sheetName + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName);
	}

	@Test(dataProvider = "PackageDurationModifictionDataProvider", priority = 1 , enabled = true)
	public void PackageDurationModifiction_ChangeBillableTypeTest(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel ,
			String Enter_Ip_Number_Excel , String Change_Billable_Bed_Type_Drp , String Package_Chargeable_Percentage , String Package_Doctor_Speciality ,
			String Bill_Amount , String Package_Doctor_Name) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_013 Modifiction Billable Type", "Verify Package Duration Modifiction  Page");
		
		Package_Duration_Modifiction.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Package_Duration_Modifiction.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");

		Package_Duration_Modifiction.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Package_Duration_Modifiction.clickOnIPPackageDetailsTab("Click On Ip Package Details Tab");
		Package_Duration_Modifiction.clickOnPackageDurationModificationPage("Click On Duration Of Modification Package");
		
		//Package_Duration_Modifiction.EnterUHIDPackageDuration(Enter_UHID_Excel);
		Package_Duration_Modifiction.EnterIPNumberPackageDuration(Enter_Ip_Number_Excel);
		
		Package_Duration_Modifiction.ClickPackageNameModification("Click On Package Name In Table First Row");
		Package_Duration_Modifiction.ChangeBillableBedTypeDrp_SaveBtn(Change_Billable_Bed_Type_Drp ,"Click On Save Billable Save Btn",
				"Confomatin Yes Pop");
		Thread.sleep(8000);
		
	}
	
	@Test(dataProvider = "PackageDurationModifictionDataProvider", priority = 2 , enabled = true)
	public void PackageDurationModifictionTest(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel ,
			String Enter_Ip_Number_Excel , String Change_Billable_Bed_Type_Drp , String Package_Chargeable_Percentage , String Package_Doctor_Speciality ,
			String Bill_Amount , String Package_Doctor_Name) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_013 Update Package Details Popoup", "Verify Package Duration Modifiction Page");
		
		Package_Duration_Modifiction.ClickLastRowPackageNameModificationIcon("Table Click On Last Row Modificaton Btn");
		
		//Package_Duration_Modifiction.SelectByChargeablePercentageDrp(Package_Chargeable_Percentage);
		Package_Duration_Modifiction.SelectByPackageDoctorSpecialityDrp(Package_Doctor_Speciality);
		Package_Duration_Modifiction.EnterPackageAmount_PackageDoctorName(Bill_Amount , Package_Doctor_Name);
		
		Package_Duration_Modifiction.PackageModificationSaveBtn("Update Package Date Time Doctor Save Btn" ,"Conforme Yes update Pop");
	}
	
	@Test(dataProvider = "PackageDurationModifictionDataProvider", priority = 3 , enabled = true)
	public void PackageDurationModifictionDeleteTest(String Dashborad_Facility_Drp, String Ip_Billing_Station_Drp , String Enter_UHID_Excel ,
			String Enter_Ip_Number_Excel , String Change_Billable_Bed_Type_Drp , String Package_Chargeable_Percentage , String Package_Doctor_Speciality ,
			String Bill_Amount , String Package_Doctor_Name) 
					throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("TC_013 Delete Package Modification ", " Delete Package Duration Modifiction  Page");
		
		Package_Duration_Modifiction.DeletePackageNameTable("Click On Thrid Row Package Modification Btn");
		Thread.sleep(2000);
		Package_Duration_Modifiction.DeletePackagePop("Click On Delete Icon" ,"Yes Delete Popup");
	}
	
	
}
