/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.AmbulanceMrdChargesPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 02-Feb-2026
 */
public class TC_004_AmbulanceMrdChargesTest extends AmbulanceMrdChargesPage {
	
	AmbulanceMrdChargesPage Ambulance_Mrd_Charges = new AmbulanceMrdChargesPage();
	//String Admission_Medical_Record_Charges = "Admission Fees (SPSH)";
	
	private final String sheetName_AmbulanceMrdCharges = "Ip_Ambulance_MrdCharges";

	@DataProvider(name = "AmbulanceMrdChargesDataProvider")
	public Object[][] getAmbulanceMrdChargessData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_AmbulanceMrdCharges + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_AmbulanceMrdCharges);
	}

	@Test(dataProvider = "AmbulanceMrdChargesDataProvider", priority = 1 , enabled = true)
	public void AmbulanceMrdCharges (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Ambulance , 
			String Enter_IP_Number , String Admission_Medical_Record_Charges , String Enter_Remarks , String Item_Quenty ) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Ambulance Mrd Charges", "Ip Ambulance Mrd Charges");
		
		
		Ambulance_Mrd_Charges.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Ambulance_Mrd_Charges.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		Ambulance_Mrd_Charges.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Ambulance_Mrd_Charges.AmbulanceMrdCharges("Click On Ip Billing Drp","Ambulance MRD Charrges Page");
		
		//Ambulance_Mrd_Charges.enterUHID(Enter_UHID_Ambulance);
		Ambulance_Mrd_Charges.EnterIP_NumberAmbulanceMRDCharges(Enter_IP_Number);
		
		Ambulance_Mrd_Charges.selectAdmissionMedicalRecordCharge(Admission_Medical_Record_Charges);    //Excel Sheet Adding 
		System.out.println("Valid charge selected successfully: " + Admission_Medical_Record_Charges);
		 
		  /*                   // validation: popup should NOT appear
		    if (Ambulance_Mrd_Charges.isPriceNotDefinedPopupDisplayed()) {
		        Assert.fail("Invalid charge selected. Price not defined popup appeared.");
		    }
*/
	  //  Ambulance_Mrd_Charges.AdmissionMedicalRecordCharges("Click On Admission Fees SPSH" );  //Fixed Value
		    Ambulance_Mrd_Charges.EnterRemarks(Enter_Remarks);
		    Ambulance_Mrd_Charges.EnterIteamNameQtyNumber(Item_Quenty);
		    Ambulance_Mrd_Charges.SaveBtnAndYesPop("Click On Save Btn" , " Save Yes Pop");
		    Thread.sleep(5000);
		    Ambulance_Mrd_Charges.RefreshBtn("Click On Refresh Btn");
		    

	    }
	
	@Test(dataProvider = "AmbulanceMrdChargesDataProvider", priority = 2 , enabled = true)
	public void DeleteAmbulanceMrdCharges (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Ambulance , 
			String Enter_IP_Number , String Admission_Medical_Record_Charges , String Enter_Remarks , String Item_Quenty ) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Delete Ambulance Mrd Charges", "Ip Ambulance Mrd Charges");
		
		Ambulance_Mrd_Charges.EnterIP_NumberAmbulanceMRDCharges(Enter_IP_Number);
		Thread.sleep(1000);
		Ambulance_Mrd_Charges.ProcedureDelete("Click On Delete Btn" ,"Delete Yes Pop");
	}
	
}

