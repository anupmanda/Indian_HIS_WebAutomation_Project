/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Sales_Consumption;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 24 Feb 2026
 */
public class TC0036_NURSING_Sales_Consumption extends NURSING_Nursing_Sales_Consumption{
	
private final NURSING_Nursing_Sales_Consumption sc = new NURSING_Nursing_Sales_Consumption();
private final String SheetName = "Sales_Consumption" ;

@DataProvider(name = "ExcelUniversalDataProvider")
public Object [][]getData() throws IOException{
	return ExcelSheetDataProvider.getExcelData(SheetName);
}

@Test(dataProvider = "ExcelUniversalDataProvider")
public void SalesAndConsumption(String Facility, String Station,String IPNO,String Quantity) throws IOException, InterruptedException {
	logger = extent.createTest("Nursing_Sales_Consumption","Nursing_Sales_Consumption........................");
	sc.SalesAndConsumption(Facility, Station, IPNO, Quantity);
}
}
