/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Booking;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 7 Jan 2026
 */
public class TC0002_ADT_Update_Bed_Booking_Details extends ADT_Bed_Booking{

	private final ADT_Bed_Booking bb = new ADT_Bed_Booking();
	private final  String SheetName = "Bed_Booking";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][] getData() throws IOException {
	return ExcelSheetDataProvider.getExcelData(SheetName);
}
	@Test(dataProvider = "ExcelUniversalDataProvider")
	
	public void BedBooking(String Facility, String Station, String Title, String Sex, String FatherName, String M_Status, String Address, String City,
			String State, String Country, String Reference, String Bed,String PSpeciality, String ReferredBy, String ReqBedType,
			String RBTBPD) throws IOException, InterruptedException {
		logger = extent.createTest("Bed_Booking", "Bed will be Booked for Registered Patient......");
		
		bb.BedBooking(Facility, Station, Title, Sex, FatherName, M_Status, Address, City, State, Country, Reference, ReqBedType);
		
		bb.Consultant(PSpeciality, ReferredBy, ReqBedType);
		
		bb.BedandPaymentDetails(RBTBPD);
		
		bb.ClickSave();
		
		bb.UpdateBedBookingDetails();
		Thread.sleep(500);
	    CommanUtill.ClickHomePage();
		
		
		
		
	}
}