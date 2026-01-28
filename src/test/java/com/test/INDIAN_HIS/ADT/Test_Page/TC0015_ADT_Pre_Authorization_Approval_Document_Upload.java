/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Pre_Authorization_Approval;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Surgery_Medical_Estimate;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 23 Dec 2025
 */
public class TC0015_ADT_Pre_Authorization_Approval_Document_Upload extends ADT_Pre_Authorization_Approval{
	
	private final ADT_Pre_Authorization_Approval apap = new ADT_Pre_Authorization_Approval();
	private final String SheetName = "Pre_Auth";

	
	@DataProvider(name = "ExcelUniversalDataProvider")
	
	public Object [][] getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider", priority = 1)
	
	public void PreAuth_SurgeryEstimate(String Facility, String Station, String Date, String DocumentName, String DocumentType) throws InterruptedException, IOException {
		
		logger = extent.createTest("Pre_Authorization_Approval_Screen","Pre_Authorization_Approval_Screen........................");
		apap.PreAuthorizationApproval(Facility, Station, Date);
		Thread.sleep(1000);
		apap.clickFirstAvailableCheckbox();
		Thread.sleep(1000);
		apap.clickFirstAvailablePreAuthIconTd14();
		Thread.sleep(1000);
		apap.UploadandSaveDocument(DocumentName, DocumentType);	
		Thread.sleep(1000);
		Assert.assertTrue(verifyFileUploadSuccess(driver),"File upload success message not displayed");
		Thread.sleep(1000);
		apap.clickLastTdIfPresent(driver);
		 Thread.sleep(500);
	        CommanUtill.ClickHomePage();
	}

	}