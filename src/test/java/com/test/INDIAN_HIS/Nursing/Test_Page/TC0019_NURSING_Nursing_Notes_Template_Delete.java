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
 * 2 Feb 2026
 */
public class TC0019_NURSING_Nursing_Notes_Template_Delete extends NURSING_Nursing_Nursing_Notes{

	private NURSING_Nursing_Nursing_Notes nnt = new NURSING_Nursing_Nursing_Notes();
     private String SheetName = "Nursing_Template";
     
     @DataProvider(name = "ExcelUniversalDataProvider")
     public Object[][]getData() throws IOException{
    	 return ExcelSheetDataProvider.getExcelData(SheetName);
     }
     
     @Test(dataProvider="ExcelUniversalDataProvider")
     
     public void NursingNotestemplate(String Facility, String Station, String Template, String Pre, String Post, String Insulin, 
	    		String Units, String Route, String ClinicalAssistant,  String ChangedUnit) throws IOException, InterruptedException {
    	 logger = extent.createTest("Nursing_Notes_Template","Nursing_Notes_Template");
    	 nnt.NursingNotesTemplateDelete(Facility, Station, Template, Pre, Post, Insulin, Units, Route, ClinicalAssistant, ChangedUnit);
    	 
     }
}

