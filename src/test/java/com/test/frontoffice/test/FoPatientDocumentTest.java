/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FoPatientDocumentPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 21-Jan-2026
 */
public class FoPatientDocumentTest extends FoPatientDocumentPage {
	
	FoPatientDocumentPage Patient_Document = new FoPatientDocumentPage();
	
	private final String sheetName_PatientDocument = "FO_Patient_Document";
	
	@DataProvider(name = "PatientDocumentDataProvider")
	public Object[][] getUploadDocumentData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_PatientDocument +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_PatientDocument);
	}

	@Test(dataProvider = "PatientDocumentDataProvider" , priority = 1)	

	public void PatientDocumentUpload(String Facility_Drp ,String Station_Drp , String Enter_Uhid_Excel_Sheet , String Document_type_drp ,
			String Uplpad_Document_Name , String Upload_Document_Type_drp , String File_Upload_Location , String Document_type_Upload_Video ,
			String Upload_Video_Location , String Dicom_Document_Name , String Dicom_Doucument_Type_Drp , String Dicon_Document_Location) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Patient Document ", "Patient Document Test");

		Patient_Document.selectByFacilityDropdwon(Facility_Drp);
		Patient_Document.clickOnDashboardFrontOfficeBtn("FO_Dashboard",Station_Drp , "Yes Popup");

		Patient_Document.clickOnPatientDocument("Click On Patient Document Page");
		Patient_Document.enterUHID(Enter_Uhid_Excel_Sheet);
		
		Patient_Document.selectByDocumentTypeDrp(Document_type_drp);
		Patient_Document.UploadDocumentIcon("Click On Upload Icon Btn");
		Patient_Document.UploadPopWithDocumentNameAndDocumentType(Uplpad_Document_Name , Upload_Document_Type_drp);
		
		//Patient_Document.ChooseFile_UploadPDfInDriver("D:\\Anup j\\Testing_Automation_Driver\\download.pdf");
		Patient_Document.ChooseFile_UploadPDfInDriver(File_Upload_Location);
		Patient_Document.saveUploadDocumentPop("Click On Save Upload File Pop");
		Thread.sleep(5000);
		Patient_Document.CheckUploadedFileInTable("Check Uploaded File In Table" , "Close Pdf File");
		Thread.sleep(3000);
	}
	
	@Test(dataProvider = "PatientDocumentDataProvider" , priority = 2)
	public void PatientUploadVideoFile(String Facility_Drp ,String Station_Drp , String Enter_Uhid_Excel_Sheet , String Document_type_drp ,
			String Uplpad_Document_Name , String Upload_Document_Type_drp , String File_Upload_Location , String Document_type_Upload_Video ,
			String Upload_Video_Location , String Dicom_Document_Name , String Dicom_Doucument_Type_Drp , String Dicon_Document_Location) 
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {

		logger = extent.createTest("Patient Upload Video ", "Patient Upload Video Test Funcility");
		
		Patient_Document.ClickOnVideoIcon("Click On Video Icon Btn");
		Patient_Document.UploadVideoDocumentTypeDrp(Document_type_Upload_Video);
		Thread.sleep(1000);
		Patient_Document.ChooseFileInuploadVideo(Upload_Video_Location);
		Patient_Document.SaveUploadVideoPop("Save Upload Video Btn");
		Thread.sleep(1500);
		Patient_Document.CheckUploadVideoTable("Check And Verify upload Video");
		Thread.sleep(5000);
		Patient_Document.CloseViewVideoPop("Close View Video Pop");
		Thread.sleep(5000);
	}
	@Test(dataProvider = "PatientDocumentDataProvider" , priority = 3)
	public void UploadDicomDocumentType(String Facility_Drp ,String Station_Drp , String Enter_Uhid_Excel_Sheet , String Document_type_drp ,
			String Uplpad_Document_Name , String Upload_Document_Type_drp , String File_Upload_Location , String Document_type_Upload_Video ,
			String Upload_Video_Location , String Dicom_Document_Name , String Dicom_Doucument_Type_Drp , String Dicon_Document_Location)
					throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		
		logger = extent.createTest("Patient Upload Dicom Document ", "Patient Upload Dicom Document Test Funcility");
		
		Patient_Document.ClickDicomDocumentIcon("Click On DiCon Document Icon");
		Patient_Document.DicomDocumentNameAndTypeDrpPop(Dicom_Document_Name , Dicom_Doucument_Type_Drp);
		Thread.sleep(1000);
		Patient_Document.ChooseFileDicomDocumentPop(Dicon_Document_Location);
		Thread.sleep(1000);
		Patient_Document.SaveDicomDocumentpop("Dicon Save Upload Document");
		
	}
	@Test(priority = 4 , enabled = false)
	public void deleteUploadfile()throws Exception , InterruptedException , ClassNotFoundException , IllegalAccessException {
		
		logger = extent.createTest("Delete Upload Files  ", "Delete Files Test Funcility");
		
		Patient_Document.DeleteUploadFile("Click On Delete upload file");
		Patient_Document.ReasonDeleteFileTextAndYesPop("Deplicate File" , "Delete Yes File");
		
	}
	
	
}
