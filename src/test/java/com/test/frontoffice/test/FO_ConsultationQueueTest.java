/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FO_ConsultationQueuePage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 23-Jan-2026
 */
public class FO_ConsultationQueueTest extends FO_ConsultationQueuePage {
	
	FO_ConsultationQueuePage Consultation  = new FO_ConsultationQueuePage();
	
	 private final String sheetName_Consultation = "FO_Consultation_Queue";
		
		@DataProvider(name = "ConsultationDataProvider")
		public Object[][] getConsultationData() throws IOException {

			System.out.println("====Fetching data from Excel sheet: " + sheetName_Consultation +" ====");
			return ExcelSheetDataProvider.getExcelData(sheetName_Consultation);
		}

		@Test(dataProvider = "ConsultationDataProvider" , priority = 1)	

		public void QueueConsultationTest(String Facility_Drp ,String Station_Drp , String Consultation_Speciality_Box1_Drp ,
				String Consultation_Doctor_Box1_Drp , String Report_View_Box1_UHID ) 
						throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

			logger = extent.createTest("Consultation Queue Test", "Check Consultation Queue Test Funcility");

			Consultation.selectByFacilityDropdwon(Facility_Drp);
			Consultation.clickOnDashboardFrontOfficeBtn("FO_Dashboard", Station_Drp , "Yes Popup");
			Consultation.ConsultationQueuePage("Click On Patient Queue Tab" , "Patient Queue Page");
			
			Consultation.ConsultationQueueBox_1SpecialityAndDoctorDrp(Consultation_Speciality_Box1_Drp , Consultation_Doctor_Box1_Drp);
			Consultation.ConsultationQueueBox_1Serach("Click Search_Consultation_Box1");
			
			Consultation.ConsultationQueueBox_1ReportView("Consultation Report View Box1 Btn" ,
					Report_View_Box1_UHID , "Report View Box1 Ok Btn");
			
		}

}
