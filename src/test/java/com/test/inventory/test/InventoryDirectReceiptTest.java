/**
 * 
 */
package com.test.inventory.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.inventory.page.InventoryDirectReceiptPage;
import com.test.readdata.ExcelSheetData;


/**
 * @author Anup
 *
 * 06-Jul-2025
 */
public class InventoryDirectReceiptTest extends InventoryDirectReceiptPage{
	
public InventoryDirectReceiptPage directreceipt = new InventoryDirectReceiptPage();
	
	public static String SHEET_NAME = "Inventory";
	
	@Test(priority =1)
	public void inventoryMedicine() throws IOException, InterruptedException ,InvalidFormatException{
		//PhysicianOrderCasePatientBill
		
		logger = extent.createTest(" Inventory", "Inventory Direct Receipt Test Case.");
		
		String facility_dropdwon = ExcelSheetData.getData(SHEET_NAME, 1, 0); 
		directreceipt.selectByFacilityDropdown(facility_dropdwon);
		//directreceipt.selectByFacilityDropdown("SANITY HOSPITAL");
		
		directreceipt.clickOnDashbordInventroy("Click DashBoprd button");
		Thread.sleep(300);
		String selectStation = ExcelSheetData.getData(SHEET_NAME, 1, 1); 
		directreceipt.selectkByStationDropdwon(selectStation);
		//physicianodercasepatient.selectkByStationDropdwon("ADT Fo");
		
		directreceipt.clickOnStationBillYesPopup("Yes Popup");
		
		directreceipt.clickOnInventorySideButton("Click On Side Icon Inventory");
		Thread.sleep(5000);
		directreceipt.clickOnDirectReceiptPage("Click On Side Dirct Receipt page");
		
		//directreceipt.clickOnMedicienButton("Click On Medician Button.");
			directreceipt.clickOnMedicienS_pcm("Click On s_PCM");
		
		String qty = ExcelSheetData.getData(SHEET_NAME, 1, 6);
		directreceipt.enterOnTextQTYBox(qty);
		//directreceipt.enterOnTextQTYBox("5");
		
		String qty_1 = ExcelSheetData.getData(SHEET_NAME, 1, 8);
		directreceipt.enterOnTextQTY_1Box(qty_1);
		//directreceipt.enterOnTextQTY_1Box("0");
		
		String pur_rate = ExcelSheetData.getData(SHEET_NAME, 1, 10);
		directreceipt.enterOnTextPurRateBox(pur_rate);
		//directreceipt.enterOnTextPurRateBox("10");
		
		String mrp = ExcelSheetData.getData(SHEET_NAME, 1, 12);
		directreceipt.enterOnTextMRP(mrp);
		//directreceipt.enterOnTextMRP("20");
		
		String sgst_per = ExcelSheetData.getData(SHEET_NAME, 1, 14);
		directreceipt.enterOnTextSGSTPercentageeBox(sgst_per);
		//directreceipt.enterOnTextSGSTPercentageeBox("0");
		
		String sgst = ExcelSheetData.getData(SHEET_NAME, 1, 14);
		directreceipt.enterOnTextSGSTBox(sgst);
		//directreceipt.enterOnTextSGSTBox("0");
		
		String gst_per = ExcelSheetData.getData(SHEET_NAME, 1, 14);
		directreceipt.enterOnTextGSTPercentageBox(gst_per);
		//directreceipt.enterOnTextGSTPercentageBox("0");
		
		directreceipt.enterOnTextGSTBox("0");
		directreceipt.enterOnRemaksBox("Thanku");
		directreceipt.clickOnCalculatorIconButton("Click On Calculator button.");
		directreceipt.clickOnSaveIconButton("Click On Save Button.");
		
		
	}
}
