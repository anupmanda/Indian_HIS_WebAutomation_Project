/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.Nursing.Main_Page.NURSING_Nursing_Ventilator_Oxygen;
import com.test.readdata.ExcelSheetDataProvider;

/**
 * @author Ashutosh
 *
 * 20 Feb 2026
 */
public class TC0031_NURSING_Nursing_Activity_Ventilator_Oxygen extends NURSING_Nursing_Ventilator_Oxygen {
	private final NURSING_Nursing_Ventilator_Oxygen vo = new NURSING_Nursing_Ventilator_Oxygen();
	private final String SheetName = "Ventilator_Oxygen";
	
	@DataProvider(name = "ExcelUniversalDataProvider")
	public Object[][]getData() throws IOException{
		return ExcelSheetDataProvider.getExcelData(SheetName);
	}

	@Test(dataProvider = "ExcelUniversalDataProvider")
	public void VentilatorOxygen(String Facility, String Station) throws IOException, InterruptedException {
		logger = extent.createTest("Ventilator Oxygen","Ventilator Oxygen......................");
		vo.VentilatorOxygen(Facility, Station);
}
}
