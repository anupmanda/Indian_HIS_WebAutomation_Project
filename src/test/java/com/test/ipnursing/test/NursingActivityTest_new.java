/**
 * 
 */
package com.test.ipnursing.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.ipnursing.page.NursingActivityPage;
import com.test.readdata.ExcelSheetNewData;
import com.test.readdata.ExcelSheetNewData.ExcelSource;


/**
 * @author Anup
 *
 * 05-Aug-2025
 */
  public class NursingActivityTest_new extends NursingActivityPage{
	  
	  public NursingActivityPage nursingactivity = new NursingActivityPage();
	  
	  
	  @Test(priority =1, dataProvider = "ExcelDataProvider", dataProviderClass = ExcelSheetNewData.class)
	  
	  @ExcelSource(fileName = "./InputData/DataProvider_IPNursing", sheetName = "Nursing_Activity")
	
	  public void nursingActivity(String facility_dropdown)throws IOException, InvalidFormatException, InterruptedException{
		  
		  logger = extent.createTest(" Nursing Activity Acknowledgemen", "Nursing Activity Acknowledgemen."); 
		  
		 // nursingactivity.OpenWithIPDNursingPage(facility_dropdown);
		  
		  
	  }

}
