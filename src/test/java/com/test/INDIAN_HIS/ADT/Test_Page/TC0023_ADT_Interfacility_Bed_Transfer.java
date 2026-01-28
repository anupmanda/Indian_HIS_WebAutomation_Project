/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_InterFacility_Bed_Transfer;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 30 Dec 2025
 */
public class TC0023_ADT_Interfacility_Bed_Transfer extends ADT_InterFacility_Bed_Transfer{
	
	private final ADT_InterFacility_Bed_Transfer ibt = new ADT_InterFacility_Bed_Transfer();
	private final String SheetName = "Int_Bed_Transfer";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void InterfacilityBedTransfer(String Facility, String Station,String RequestedBedType, String BillableBedType, String Ward , String Stay, String BedType, String Ward1) throws IOException, InterruptedException {
		logger = extent.createTest("ADT_InterFacility_Bed_Transfer","ADT_InterFacility_Bed_Transfer.....................");
		ibt.InterFacilityBedTransfer(Facility, Station, RequestedBedType, BillableBedType, Stay, BedType, Ward, Ward1);
	//	Thread.sleep(1000);
	//	ibt.clickAddUntilAdmitPatientOpens();
	//	Thread.sleep(1000);
	//	ibt.SelectBed(RequestedBedType, BillableBedType, Ward);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
		
	}
}
