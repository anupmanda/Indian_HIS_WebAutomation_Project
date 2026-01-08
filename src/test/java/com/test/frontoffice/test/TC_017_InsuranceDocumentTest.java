/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.frontoffice.page.InsuranceDocumentPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 06-Jan-2026
 */
public class TC_017_InsuranceDocumentTest extends InsuranceDocumentPage {
	
   public InsuranceDocumentPage insurance_Document = new InsuranceDocumentPage();
	private final String sheetName_insurance_Document = "FO_insurance_Document_Page";

	@DataProvider(name = "insuranceDocumentDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_insurance_Document +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_insurance_Document);
	}

	@Test(dataProvider = "insuranceDocumentDataProvider" , priority = 1)	

	public void FrontOfficeOP_InsuranceDocument(String Facility_Drp , String Station_Drp , String Enter_OP_Patient_UHID , String OP_From_Date ,
			String OP_TO_Date , String Clame_Report_Popup_left_Upload_Doc_Type_Drp , String Clame_Report_Popup_left_Upload_Document_Drp ,
			String Clame_Report_Popup_Right_Upload_Doc_Type_Drp , String Clame_Report_Popup_Right_Upload_Document_Drp , String Enter_Ip_Number
			) throws IOException , InterruptedException{

		logger = extent.createTest("OP Insurance Document Page", "insurance Document Funcility Test");

		insurance_Document.selectByFacilityDropdwon(Facility_Drp);
		insurance_Document.clickOnDashboardFrontOfficeBtn("Click On Front Office Dashbord", Station_Drp, "Click On Yes Popup");
		insurance_Document.FoAddpatientmeanu("Click On Add Patient Menu" );
		insurance_Document.clickOnInsuranceDocumentPage("Click On Insurance Document Page Tab");
		Thread.sleep(1000);
		
		insurance_Document.RadioButtonOPPatient("Click On Op Patient Radio Button");
		insurance_Document.enterOPPatientUHID(Enter_OP_Patient_UHID);
		insurance_Document.VisitWiseRadioButton("Click On Visit Wise Radio Button");
		//insurance_Document.enterFromDateAndToDateSerach(OP_From_Date , OP_TO_Date ,"Click On Serach Icon");
		insurance_Document.clickOnAssignToDoctotTab("Click On Assign Doctot Tab Grid");
		
		insurance_Document.OPDocumentsOpBillsGeneratePdfBtn("OP Bills Generate PDf");
		Thread.sleep(500);
		insurance_Document.OpPrecriptionGeneratePdfBtn("OP Generate Pdf Precription");
		Thread.sleep(500);
		
		insurance_Document.OpPharmacyGeneratePdfBtn("Op Pharmacy Generate Pdf ");
		//insurance_Document.OpConsentGeneratePdfBtn("op Consent Generate Pdf");
		//insurance_Document.OpLabGeneratePdfBtn("Op Lab Generate Pdf ");
		
		//insurance_Document.OpDiagnosticGeneratePdfBtn("OP Diagnostic Generate Pdf ");
		insurance_Document.OpClaimReportGeneratePdfBtnPopup("Op Clame Report Generate Pdf");
		insurance_Document.ClosePopupClaimReportGeneratePdf("Close popup Clame Report Bez No Data ");
		
		//--------------------Clame Report No Data ------------------------
		//insurance_Document.UploadClaimReportDocumentLeft_RightOk(Clame_Report_Popup_left_Upload_Doc_Type_Drp , Clame_Report_Popup_left_Upload_Document_Drp, 
			//	Clame_Report_Popup_Right_Upload_Doc_Type_Drp, Clame_Report_Popup_Right_Upload_Document_Drp, "Ok Clame Report");
		
		Thread.sleep(1000);
		insurance_Document.clickOnMergeAndMakeSingleDocketBtn("Merge And Make Single Docket Btn");
		
		//IP NO 8545
	}
	@Test(dataProvider = "insuranceDocumentDataProvider" , priority = 2)	

	public void FrontOfficeIP_InsuranceDocument(String Facility_Drp , String Station_Drp , String Enter_OP_Patient_UHID , String OP_From_Date ,
			String OP_TO_Date , String Clame_Report_Popup_left_Upload_Doc_Type_Drp , String Clame_Report_Popup_left_Upload_Document_Drp ,
			String Clame_Report_Popup_Right_Upload_Doc_Type_Drp , String Clame_Report_Popup_Right_Upload_Document_Drp , String Enter_Ip_Number
			)  throws IOException , InterruptedException{
		
		logger = extent.createTest("IP Insurance Document Page", "insurance Document Funcility Test");
		
		insurance_Document.IpRadioButton("Ip Radio Button");
		insurance_Document.enterIPNumber(Enter_Ip_Number);
		
		insurance_Document.clickOnAssignDoctorSlotTable("Click On Doctor Assign Table");
		insurance_Document.GeneratePdfIPBills("Ip Bills Generate Pdf");
		
		insurance_Document.GeneratePdfIPDischargeSummary("IP Discharge Summary Generate Pdf" );
		//insurance_Document.GeneratePdfIPConsents("IP Consents Generate Pdf");
		
		//insurance_Document.GeneratePdfIPLabReports("IP Consents Generate Pdf");
		//insurance_Document.GeneratePdfIPDiagnosticReports("IP Diagnostic Reports Generate Pdf");
		
		//insurance_Document.GeneratePdfIPExternalDocuments("Ip External Documents Generate Pdf");
		insurance_Document.clickOnMergeAndMakeSingleDocket("Merge Single Pdf File Button");
		
		
		
	}
}
