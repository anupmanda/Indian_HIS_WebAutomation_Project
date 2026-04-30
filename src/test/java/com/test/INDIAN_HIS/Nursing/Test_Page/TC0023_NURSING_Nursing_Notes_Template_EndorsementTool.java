/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Nursing_Notes;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 4 Feb 2026
 */
public class TC0023_NURSING_Nursing_Notes_Template_EndorsementTool extends NURSING_Nursing_Nursing_Notes{

	private final NURSING_Nursing_Nursing_Notes net = new NURSING_Nursing_Nursing_Notes();
	private final String SheetName = "Endorsement_Tool";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}
	
	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void NursingEndorsementTool(String Facility, String Station, String Shift, String Diagnosis, String AllergyRemarks, 
			String VitalName, String LoginName, String LoginPass) throws IOException, InterruptedException {
		logger = extent.createTest("Nursing_Notes_Template_EndorsementTool","Nursing_Notes_Template_EndorsementTool");
		net.NursingEndorsementToolFinal(Facility, Station, Shift, Diagnosis, AllergyRemarks, VitalName, LoginName, LoginPass);
	//	net.NursingEndorsementTool(Facility, Station, Shift, Diagnosis, AllergyRemarks, VitalName);
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
