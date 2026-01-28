/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Booking;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_View_Admission_Surgery_Request;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 15 Dec 2025
 */
public class TC0005_ADT_View_Admission_Surgery_Request extends ADT_View_Admission_Surgery_Request{
	
	private final ADT_View_Admission_Surgery_Request vasr = new ADT_View_Admission_Surgery_Request();
	private final ADT_Bed_Booking bb = new ADT_Bed_Booking();
	private final String SheetName = "SurgeryReq";
	
	@DataProvider (name = "ExcelUniversalDataProvider")
	
	public Object[][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void ViewAdmissionSurgeryRequest(String Facility, String Station, String Date, String Bed, String ReqBedType, String RBTBPD) throws IOException, InterruptedException {
		logger = extent.createTest("View Admission Surgery Request", "To View Admission and Surgery Request");
		vasr.AdmissionSurgeryRequest(Facility, Station, Date);
		
		bb.SurgeryRequest(Bed, ReqBedType, RBTBPD);
	
		bb.ClickSave();
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
} 
