/**
 * 
 */
package com.test.emergency.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.emergency.page.Er_Miscellaneous_ChargesPage;
import com.test.readdata.ExcelSheetDataProvider;


/**
 * @author Anup
 *
 * 02-April-2026
 */
public class TC_011_Er_Miscellaneous_ChargesTest extends Er_Miscellaneous_ChargesPage{
	
	Er_Miscellaneous_ChargesPage MiscellaneousCharges = new Er_Miscellaneous_ChargesPage();
	
	private final String sheetName_Miscellaneous = "Er_MiscellaneousCharges_Page";

	@DataProvider(name = "MiscellaneousChargesDataProvider")
	public Object[][] getMiscellaneousChargesData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Miscellaneous + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Miscellaneous);
	}

	@Test(dataProvider = "MiscellaneousChargesDataProvider", priority = 1 , enabled = true)
	public void Current_In_Patient_MiscellaneousCharges(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Enter_Uhid , 
			String  Enter_Ip_Number ,String From_Date , String To_Date, String Service_Drp , String  Description_Drp , String Amount_enter ,
			String Quenty_Text , String Select_Doctor_Name_Drp) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Check Current In Patient", "Er BillMiscellaneous Charges");
		
		MiscellaneousCharges.SelectByFacilityDrp(Dashborad_Facility_Drp);
		MiscellaneousCharges.ClickOnErBillingDashboard("Click On Er Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		
		MiscellaneousCharges.MiscellaneousCharges_page("Click On Er Billing Drp","Miscellanceous Charrges Page");
		
		MiscellaneousCharges.FindPatient_SeachIcon("Click On Serach Icon Find Patient");
		MiscellaneousCharges.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");
		
		//Date Wise Other Serach Hidden
		MiscellaneousCharges.Admission_DischargeCheckBox("Admission Discharge Check Box");
		MiscellaneousCharges.AdmissionDischarge_FromDateSerach(From_Date);
		//MiscellaneousCharges.AdmissionDischarge_ToDateSerach(To_Date);
		
		MiscellaneousCharges.ClickOnSeracPatientIcon("Click On Search Patient Button");
		MiscellaneousCharges.SerachAndselectPatientInTable("Add Miscellance Charges Current Patient In Table");
		
		MiscellaneousCharges.SelectByService_DescriptionDrp(Service_Drp , Description_Drp);
		MiscellaneousCharges.SelectByPatientTypeDrp();
		MiscellaneousCharges.enterAmountAndQuantity(Amount_enter , Quenty_Text);
		
		MiscellaneousCharges.SelectByDoctorNameDrp(Select_Doctor_Name_Drp);
		MiscellaneousCharges.PrintPostingDateAndTime(); //   Post Date And Time 
		
		MiscellaneousCharges.clickOnPlushIcon("Click on Plush Icon");
		MiscellaneousCharges.ClickOnsavebtnIcon_YesPop("Click on Save Btn") ;
		
		Thread.sleep(5000);
		MiscellaneousCharges.RefreshMiscellaneousCharges("Refresh Page");		
	}
	
	@Test(dataProvider = "MiscellaneousChargesDataProvider", priority = 3 , enabled = true)
	public void EnterUHID_IpNumber_MiscellaneousCharges(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,String Enter_Uhid , 
			String  Enter_Ip_Number ,String From_Date , String To_Date, String Service_Drp , String  Description_Drp , String Amount_enter ,
			String Quenty_Text , String Select_Doctor_Name_Drp) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest(" Miscellaneous Charges On Ip Number", " Ip Bill Miscellaneous Charges Not Dischage Patient");
		
		//MiscellaneousCharges.EnterUHIDInMiscellanceCherges(Enter_Uhid);
		MiscellaneousCharges.EnterIpNumberInMiscellanceCherges(Enter_Ip_Number);
	    
		MiscellaneousCharges.SelectByService_DescriptionDrp(Service_Drp , Description_Drp);
		MiscellaneousCharges.SelectByPatientTypeDrp();
		MiscellaneousCharges.enterAmountAndQuantity(Amount_enter , Quenty_Text);
		
		MiscellaneousCharges.SelectByDoctorNameDrp(Select_Doctor_Name_Drp);
		MiscellaneousCharges.PrintPostingDateAndTime(); //   Post Date And Time 
		
		MiscellaneousCharges.clickOnPlushIcon("Click on Plush Icon");
		MiscellaneousCharges.ClickOnsavebtnIcon_YesPop("Click on Save Btn") ;
	}

}
