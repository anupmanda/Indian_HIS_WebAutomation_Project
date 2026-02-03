/**
 * 
 */
package com.test.IpBilling.test;
import java.io.IOException;
import javax.management.InvalidApplicationException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.MiscellaneousChargesIpBilling_Page;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 30-Jan-2026
 */
public class TC_003_IpBilling_MiscellaneousChargesTest extends MiscellaneousChargesIpBilling_Page{
	
	MiscellaneousChargesIpBilling_Page Miscellaneous_Charges = new MiscellaneousChargesIpBilling_Page();
	
	private final String sheetName_Miscellaneous = "MiscellaneousCharges_Page";

	@DataProvider(name = "MiscellaneousChargesDataProvider")
	public Object[][] getMiscellaneousChargesData() throws IOException {
 
		System.out.println("====Fetching data from Excel sheet: " + sheetName_Miscellaneous + " ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Miscellaneous);
	}

	@Test(dataProvider = "MiscellaneousChargesDataProvider", priority = 1 , enabled = true)
	public void Current_In_Patient_MiscellaneousCharges(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,
			String Enter_Uhid , String  Enter_Ip_Number ,String From_Date , String To_Date ,String Mobile_no_Current_In_Patient ,
			String Name_Current_In_Patient , String Select_Doctor_Name_Drp , String Service_Drp , String Description_Drp ,
			String Auto_Description_Name , String Type_Patient , String Auto_Amount_enter , String Quenty_Text , 
			String Auto_Posting_Date , String Auto_Posting_Time ,String Serch_Services_Box) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Check Current In Patient", "Ip BillMiscellaneous Charges");
		
		Miscellaneous_Charges.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Miscellaneous_Charges.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		
		Miscellaneous_Charges.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Miscellaneous_Charges.MiscellaneousCharges_page("Click On Ip Billing Drp","Miscellanceous Charrges Page");
		
		Miscellaneous_Charges.FindPatient_SeachIcon("Click On Serach Icon Find Patient");
		Miscellaneous_Charges.RadioBtnCurrentInPatients_AllWardsCheckBox("Current_In_Patents Radio Btn" ,"Check Box All Wards");
		
		//Date Wise Other Serach Hidden
		//Miscellaneous_Charges.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		//Miscellaneous_Charges.AdmissionDischarge_FromDateSerach(From_Date);
		//Miscellaneous_Charges.AdmissionDischarge_ToDateSerach(To_Date);
		
		//Miscellaneous_Charges.CheckBoxVIP_Remarks("Check Box VIP" , "Check Box Remarks");
		Miscellaneous_Charges.SerachMobileNumber(Mobile_no_Current_In_Patient , "Serach In Mobile NO Patient");
		//Miscellaneous_Charges.EnterNameAndSerchicon(Name_Current_In_Patient , "Serach In Name Patient");
		Miscellaneous_Charges.SerachAndselectPatientInTable("Pick Table In Current In Patient ");
		
		Miscellaneous_Charges.SelectByDoctorNameDrp(Select_Doctor_Name_Drp);
		Miscellaneous_Charges.SelectByService_DescriptionDrp(Service_Drp , Description_Drp);
		Miscellaneous_Charges.AutoTextDescriptionName(Auto_Description_Name + CommanUtill.randomDigits(3));
		//Miscellaneous_Charges.SelectByPatientTypeDrp(Type_Patient);
		
		Miscellaneous_Charges.enterAmountAndQuantity(Auto_Amount_enter , Quenty_Text);
		//Miscellaneous_Charges.EnterPostingDate(Auto_Posting_Date);
		//Miscellaneous_Charges.EnterPostingTime(Auto_Posting_Time);
		
		//Miscellaneous_Charges.SerachBox_ServiceName(Serch_Services_Box);
		Miscellaneous_Charges.clickOnPlushIcon("Click on Plush Icon");
		Miscellaneous_Charges.ClickOnsavebtnIcon_YesPop("Click on Save Btn" ,"Save Yes Pop") ;
		
		Thread.sleep(5000);
		Miscellaneous_Charges.RefreshMiscellaneousCharges("Refresh Page");
			
	}
	
	@Test(dataProvider = "MiscellaneousChargesDataProvider", priority = 2 , enabled = true)
	public void DischargedPatientsMiscellaneousCharges(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,
			String Enter_Uhid , String  Enter_Ip_Number ,String From_Date , String To_Date ,String Mobile_no_Current_In_Patient ,
			String Name_Current_In_Patient , String Select_Doctor_Name_Drp , String Service_Drp , String Description_Drp ,
			String Auto_Description_Name , String Type_Patient , String Auto_Amount_enter , String Quenty_Text , 
			String Auto_Posting_Date , String Auto_Posting_Time ,String Serch_Services_Box) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest("Discharged Patients ", "Ip BillMiscellaneous Charges");
		
		Miscellaneous_Charges.FindPatient_SeachIcon("Click On Serach Icon Find Patient");
		
		Miscellaneous_Charges.RadioBtnDischargedPatients("Radio Button Discharged Patients");
		Miscellaneous_Charges.Current_In_Patient_Admission_Discharge_ChkkBox("Admission Discharge Check Box");
		Miscellaneous_Charges.AdmissionDischarge_FromDateSerach(From_Date);
	    Miscellaneous_Charges.AdmissionDischarge_ToDateSerach(To_Date);
	    
	    Miscellaneous_Charges.SerachDischargedPatient("Click On Serch Icon");
	    Miscellaneous_Charges.PickDischargePatientTable("Pick on Table discharge patient" ,"discharged Make_Transactions_Yes_Pop");
	    
	    Miscellaneous_Charges.SelectByDoctorNameDrp(Select_Doctor_Name_Drp);
		Miscellaneous_Charges.SelectByService_DescriptionDrp(Service_Drp , Description_Drp);
		Miscellaneous_Charges.AutoTextDescriptionName(Auto_Description_Name + CommanUtill.randomDigits(3));
	    
		Miscellaneous_Charges.enterAmountAndQuantity(Auto_Amount_enter , Quenty_Text);
		
		Miscellaneous_Charges.clickOnPlushIcon("Click on Plush Icon");
		Miscellaneous_Charges.ClickOnsavebtnIcon_YesPop("Click on Save Btn" ,"Save Yes Pop") ;
		Thread.sleep(5000);
		Miscellaneous_Charges.RefreshMiscellaneousCharges("Refresh Page");
		
	}
	
	@Test(dataProvider = "MiscellaneousChargesDataProvider", priority = 3 , enabled = true)
	public void EnterUHID_IpNumber_MiscellaneousCharges(String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp ,
			String Enter_Uhid , String  Enter_Ip_Number ,String From_Date , String To_Date ,String Mobile_no_Current_In_Patient ,
			String Name_Current_In_Patient , String Select_Doctor_Name_Drp , String Service_Drp , String Description_Drp ,
			String Auto_Description_Name , String Type_Patient , String Auto_Amount_enter , String Quenty_Text , 
			String Auto_Posting_Date , String Auto_Posting_Time ,String Serch_Services_Box) 
			throws IOException, InterruptedException, InvalidApplicationException {
		
		logger = extent.createTest(" Miscellaneous Charges On Ip Number", " Ip Bill Miscellaneous Charges Not Dischage Patient");
		
		//Miscellaneous_Charges.EnterUHIDInMiscellanceCherges(Enter_Uhid);
		Miscellaneous_Charges.EnterIpNumberInMiscellanceCherges(Enter_Ip_Number);
	    
	   // Miscellaneous_Charges.SelectByDoctorNameDrp(Select_Doctor_Name_Drp);
		Miscellaneous_Charges.SelectByService_DescriptionDrp(Service_Drp , Description_Drp);
		Miscellaneous_Charges.AutoTextDescriptionName(Auto_Description_Name + CommanUtill.randomDigits(3));
	    
		Miscellaneous_Charges.enterAmountAndQuantity(Auto_Amount_enter , Quenty_Text);
		
		Miscellaneous_Charges.clickOnPlushIcon("Click on Plush Icon");
		Miscellaneous_Charges.ClickOnsavebtnIcon_YesPop("Click on Save Btn" ,"Save Yes Pop") ;
	}
	
	
	
}
