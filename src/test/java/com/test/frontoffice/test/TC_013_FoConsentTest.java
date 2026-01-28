/**
 * 
 */
package com.test.frontoffice.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.frontoffice.page.FoConsentPage;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Anup
 *
 * 06-Jan-2026
 */
public class TC_013_FoConsentTest extends FoConsentPage {
	
	FoConsentPage cosent = new FoConsentPage();
	private final String sheetName_Consent = "FO_Consent_Page";

	@DataProvider(name = "ConsentDataProvider")
	public Object[][] getData() throws IOException {

		System.out.println("====Fetching data from Excel sheet: " + sheetName_Consent +" ====");
		return ExcelSheetDataProvider.getExcelData(sheetName_Consent);
	}

	@Test(dataProvider = "ConsentDataProvider" , priority = 1)	

	public void FrontOfficeConsent(String Facility_Drp , String Station_Drp , String Enter_UHID , String Frome_Date , String To_Date , 
			String Select_Tepplate_Drp , String Doctor_Authentication_user_name , String Doctor_Authentication_Password
			) throws IOException , InterruptedException{

		logger = extent.createTest("Front Office Consent Page", "Consent Funcility Test");

		cosent.selectByFacilityDropdwon(Facility_Drp);
		cosent.clickOnDashboardFrontOfficeBtn("Click On Front Office Dashbord", Station_Drp, "Click On Yes Popup");
		cosent.FoAddpatientmeanu("Click On Add Patient Menu" );
		cosent.clickOnConsentPage("Click On Cosent Page Tab");
		Thread.sleep(1000);
		cosent.enterUHID(Enter_UHID);
		cosent.enterFromDateAndToDate(Frome_Date , To_Date);
		
		cosent.clickOnSerachIcon("Click On Serach Icon");
		cosent.clickOnEpisodeTable("Click On Episode Table");
		cosent.selectByTemplateDropdwon(Select_Tepplate_Drp);
		cosent.clickOnAddPlushIcon("Click On Plush Icon");
		
		cosent.clickOnTemplateDoctorSignature("Click On Doctor Singnature Button");
		cosent.enterDoctorAuthenticationVerificationPopup(Doctor_Authentication_user_name , Doctor_Authentication_Password , "Ok Button");
		
		//cosent.templateSingedAndSaveBtn("Click On Verify Singn Button");
		cosent.TemplateSavePopup("Template Save Icon");
		cosent.verifyOkButtonPopup("Click On Verify Ok Button Popup");

		Thread.sleep(10000);
		cosent.closeTemplatePopup("Click On Close Template Popup");
		cosent.TemplateClaerPopup("Clear Icon Button");
		
		 
	}
}
