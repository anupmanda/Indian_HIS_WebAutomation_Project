/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Booking;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Booking_Status;

import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 10 Dec 2025
 */
public class TC0003_ADT_Booking_Status extends ADT_Bed_Booking_Status {
	
	private ADT_Bed_Booking_Status bbs = new ADT_Bed_Booking_Status();
	private final ADT_Bed_Booking bb = new ADT_Bed_Booking();
	private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
	private final String SheetName1  = "Admit_Patient";
	private String SheetName = "Bed_Booking";
	
	// ===================== Bed Booking =====================
	
	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 1)
	public void BedBooking(String Facility, String Station, String Title, String Sex, String FatherName, String M_Status, String Address, String City,
			String State, String Country, String Reference, String Bed,String PSpeciality, String ReferredBy, String ReqBedType,
			String RBTBPD,  String ReqBedType1, String AlloBedType, String Ward) throws IOException, InterruptedException {
		logger = extent.createTest("Bed_Booking", "Bed will be Booked for Registered Patient......");
		
		bb.BedBooking(Facility, Station, Title, Sex, FatherName, M_Status, Address, City, State, Country, Reference, ReqBedType);
		
		bb.Consultant(PSpeciality, ReferredBy, ReqBedType);
		
		bb.BedandPaymentDetails(RBTBPD);
		
		bb.ClickSave();
		
		bb.UpdateBedBookingDetails();	
		
		CommanUtill.ClickHomePage();
			
	}
	
	  // ===================== Bed Booking Status =====================
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object [][] getData() throws IOException{
	return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 2)
	
	public void BedBookingStatus(String Facility, String Station, String Title, String Sex, String FatherName, String M_Status, String Address, String City,
			String State, String Country, String Reference, String Bed,String PSpeciality, String ReferredBy, String ReqBedType,
			String RBTBPD, String ReqBedType1, String AlloBedType, String Ward) throws IOException, InterruptedException {
		logger = extent.createTest("Bed_Booking_Status", "Booked Bed Status for Registered Patient......");
		bbs.BookingStatus(Facility, Station, ReqBedType1, AlloBedType, Ward);	
		
	}
		
    // ===================== Admit Patient =====================
		
	@DataProvider(name = "Admit_Patient_Data")
	public Object[][] getdata() throws IOException{
		return  ExcelSheetDataProvider.getExcelData(SheetName1);
	}
		
	@Test(dataProvider = "Admit_Patient_Data", priority = 3)
	
	public void AdmitPatient_BedBookingStatus(String Facility, String Station, String Title, String Gender, String DOB, String FatherName, String M_Status,
			String Address, String City, String Nationality, String ABCPin, String Speciality, String Referred, String Stay, String Source, String BedType, String Ward,
			String Package_Speciality, String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) throws IOException, InterruptedException {
		logger = extent.createTest("Admit_Patient" , "Fill All The Mandatory Details at all Admit PatientScreen and Click on Ths Save Buton");
		adt.AdmitPatientByBedBookingStatus(DOB, ABCPin, Referred, Stay, Source, Package_Speciality, KinName, Relation, Name, BillingCo, ClinicalCo);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}
	
	
	
}
