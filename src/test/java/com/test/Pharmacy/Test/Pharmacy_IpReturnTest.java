/**
 * 
 */
package com.test.Pharmacy.Test;

import java.io.IOException;

import javax.management.InvalidApplicationException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.Pharmacy.Page.Pharmacy_IpReturnPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 13-Apr-2026
 */
public class Pharmacy_IpReturnTest extends Pharmacy_IpReturnPage{
	
	Pharmacy_IpReturnPage IpRetun = new Pharmacy_IpReturnPage();
	private final String sheetName_Pharmacy = "Pharmacy_Retun_Page";
	    
		@DataProvider(name = "PharmacyIPRetunDataProvider")
		public Object[][] getData() throws IOException {
	 
			System.out.println("====Fetching data from Excel sheet: " + sheetName_Pharmacy + " ====");
			return ExcelSheetDataProvider.getExcelData(sheetName_Pharmacy);
		}

		@Test(dataProvider = "PharmacyIPRetunDataProvider", priority = 1 , enabled = true)
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

}
    }
