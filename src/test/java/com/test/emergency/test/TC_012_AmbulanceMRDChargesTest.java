/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.emergency.page.AmbulanceMRDChargesPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 *  02-April-2026
 */
public class TC_012_AmbulanceMRDChargesTest extends AmbulanceMRDChargesPage{

	AmbulanceMRDChargesPage AmbulanceMRDCharges = new AmbulanceMRDChargesPage();
	private final String sheetName_Ambulance = "Er_AmbulanceCharges_Page";

	@DataProvider(name = "AmbulanceChargesDataProvider")
	public Object[][] getAmbulanceChargesData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Ambulance + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Ambulance);
	}

	@Test(dataProvider = "AmbulanceChargesDataProvider", priority = 1 , enabled = false)
	public void FindCurrentPatientAmbulanceMRDChargesTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Enter_Uhid , String Er_Number , String Name_Search_Medical_Record_Charges , String Item_Quenty , String Remark 
			) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Ambulance MRD Charges ", "Er Ambulance MRD Charges Search In Table Test Funcility");
		
		AmbulanceMRDCharges.SelectByFacilityDrp(Dashborad_Facility_Drp);
		AmbulanceMRDCharges.ClickOnErBillingDashboard("Click On Er Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		
		AmbulanceMRDCharges.AmbulanceMRDCharges("Click On Er Billing Drp","Ambulance MRD Charrges Page");
		
		AmbulanceMRDCharges.FindPatient_SeachIcon("Click On Serach Icon Find Patient");
		AmbulanceMRDCharges.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");
		
		//Date Wise Other Serach Hidden
		AmbulanceMRDCharges.Admission_DischargeCheckBox("Admission Discharge Check Box");
		AmbulanceMRDCharges.AdmissionDischarge_FromDateSerach(From_Date);
		AmbulanceMRDCharges.AdmissionDischarge_ToDateSerach(To_Date);
		
		AmbulanceMRDCharges.ClickOnSeracPatientIcon("Click On Search Ambulance MRD Charges Current Patient In Table");
		AmbulanceMRDCharges.SerachAndselectPatientInTable("Click On Ambulance MRD Charges Search In Table");
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "AmbulanceChargesDataProvider", priority = 2 , enabled = true)
	public void AmbulanceMRDChargesTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Enter_Uhid , String Er_Number , String Name_Search_Medical_Record_Charges , String Item_Quenty , String Remark 
			) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Ambulance MRD Charges ", "Er Ambulance MRD Charges Search In Table Test Funcility");
		
		AmbulanceMRDCharges.SelectByFacilityDrp(Dashborad_Facility_Drp);
		AmbulanceMRDCharges.ClickOnErBillingDashboard("Click On Er Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		
		AmbulanceMRDCharges.AmbulanceMRDCharges("Click On Er Billing Drp","Ambulance MRD Charrges Page");
		
		//AmbulanceMRDCharges.EnterUHIDInAmbulanceMRDCharges(Enter_Uhid);
		AmbulanceMRDCharges.EnterIpNumberInAmbulanceMRDCharges(Er_Number);
		AmbulanceMRDCharges.ShowInAllMedicalRecordChargesInTable("All Medical Recod Charges");   //Only Check Record In Table
		
		//AmbulanceMRDCharges.FindMedicalRecordChargesName(Name_Search_Medical_Record_Charges);
		AmbulanceMRDCharges.selectMedicalRecordCharges("Select Medical Recod Charges");
		AmbulanceMRDCharges.EnterItemQuentyAndReamrks(Item_Quenty , Remark + CommanUtill.randomDigits(3));
		
		AmbulanceMRDCharges.saveAmbulanceMRDchargesBtn("Save Ambulance MRD charges Btn" ,"Save Ambulance charges Yes Pop");	
		Thread.sleep(1500);
}
	
	@Test(dataProvider = "AmbulanceChargesDataProvider", priority = 3 , enabled = true)
	public void DeleteAmbulanceMRDChargesTest (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String From_Date , String To_Date ,
			String Enter_Uhid , String Er_Number , String Name_Search_Medical_Record_Charges , String Item_Quenty , String Remark 
			) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Ambulance MRD Charges ", "Er Ambulance MRD Charges Search In Table Test Funcility");
		AmbulanceMRDCharges.SelectSubMenuTable("Click on Sub Menu Save Medical Record Charges Item");
		AmbulanceMRDCharges.DeleteItem("Click On Delete Btn","Delete Yes Pop");
	 }
	
}  
