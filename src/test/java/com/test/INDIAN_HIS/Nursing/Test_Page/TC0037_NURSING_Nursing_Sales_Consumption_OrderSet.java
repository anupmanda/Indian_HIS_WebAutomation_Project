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
 * 25 Feb 2026
 */
public class TC0037_NURSING_Nursing_Sales_Consumption_OrderSet  extends NURSING_Nursing_Sales_Consumption{
	
private final NURSING_Nursing_Sales_Consumption sc = new NURSING_Nursing_Sales_Consumption();
private final String SheetName = "Sales_Consumption" ;

@DataProvider(name = "ExcelUniversalDataProvider")
public Object [][]getData() throws IOException{
	return ExcelSheetDataProvider.getExcelData(SheetName);
}

@Test(dataProvider = "ExcelUniversalDataProvider")
public void SalesAndConsumptionOrderSet(String Facility, String Station,String IPNO, String Quantity) throws IOException, InterruptedException {
	logger = extent.createTest("Nursing_Sales_Consumption_Order_Set","Nursing_Sales_Consumption_Order_Set........................");
	sc.SalesAndConsumptionOrderSet(Facility, Station, IPNO);
}
}