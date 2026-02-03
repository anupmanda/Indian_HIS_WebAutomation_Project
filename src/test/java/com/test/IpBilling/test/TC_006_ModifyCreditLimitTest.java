/**
 * 
 */
package com.test.IpBilling.test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.IpBilling.Page.CreditLimit_IpBillingPage;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 02-Feb-2026
 */
public class TC_006_ModifyCreditLimitTest extends CreditLimit_IpBillingPage{ 
	
	CreditLimit_IpBillingPage Credit_Limit = new CreditLimit_IpBillingPage();
	
	private final String Sheet_Name = "IP_Credit_Limit";

	@DataProvider(name = "CreditLimitDataProvider")
	public Object[][] getCreditLimitData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + Sheet_Name + " ====");
		return ExcelSheetDataProvider.getExcelData(Sheet_Name);
	}

	@Test(dataProvider = "CreditLimitDataProvider", priority = 1 , enabled = true)
	public void ModifyCreditLimit (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number ,
			String Modifiy_Credit_Limt_1 , String Modifiy_Credit_Limt_2) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Modify Credit Limit", "ModiFication Of Credit limit Funcility Test");


		Credit_Limit.SelectByFacilityDrp(Dashborad_Facility_Drp);
		Credit_Limit.ClickOnIPBillingDashboard("Click On IP Billing DashBorad" ,Ip_Billing_Station_Drp , "Station Yes Popup");
		Credit_Limit.ClickOnIpBillingMeanu("Click On Ip Billing Meanu");
		Credit_Limit.ModificationCreditLimit("Click On Ip Billing Drp","Modify Credit Limit");
		
		//Credit_Limit.EnterUHID(Enter_UHID_Excel_Sheet);
		Credit_Limit.EnterIPNumber(Enter_IP_Number);
		
		Credit_Limit.CheckBoxCopyBillAmount_1And2("Check Box Cupy Bill Amount 1" , "Check Box Cupy Bill Amount 2");
		Credit_Limit.EnterNewCreditLimit_1And2(Modifiy_Credit_Limt_1 +CommanUtill.randomDigits(3) ,
				Modifiy_Credit_Limt_2 + CommanUtill.randomDigits(3));
		
	   Credit_Limit.SaveIcon_ModiCationCreditLimit("Save Modification Credit Limit" ,"Save Yes Pop");
	   Thread.sleep(800);
			
	}
	
	@Test(dataProvider = "CreditLimitDataProvider", priority = 2 , enabled = true)
	public void VerifyCreditLimit (String Dashborad_Facility_Drp , String Ip_Billing_Station_Drp , String Enter_UHID_Excel_Sheet , String Enter_IP_Number ,
			String Modifiy_Credit_Limt_1 , String Modifiy_Credit_Limt_2) 
					throws IOException, InterruptedException, InvalidApplicationException {

		logger = extent.createTest("Check And Verify Credit Limit", "Cross Verify Of Credit limit Funcility Test");

		//Credit_Limit.EnterUHID(Enter_UHID_Excel_Sheet);
		Credit_Limit.EnterIPNumber(Enter_IP_Number);
	}
}
