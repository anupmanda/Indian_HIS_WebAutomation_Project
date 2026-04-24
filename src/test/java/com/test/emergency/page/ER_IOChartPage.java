/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 24-Apr-2026
 */
public class ER_IOChartPage extends GeneralBrowserSetting{

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";
	//=========================== Patient Vital ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Io_Chart_Page = "//a[normalize-space()='IO Chart']";
	//================================ Search Patient In Io Chart =================================

	protected static String Search_In_Patient_Icon = "//i[@id='btnSearchIpno']";
	protected static String Current_in_Patient_Radio_Btn = "//input[@id='rbCurrentPatents']";
	protected static String All_Wards_Check_Box = "//input[@id='cbAllWards']";
	protected static String Admission_Discharge_Check_Box = "//input[@id='cbAdmission']";
	protected static String Search_From_Date = "//input[@id='txtFromDate']";
	protected static String Search_To_Date = "//input[@id='txtToDate']";
	protected static String Click_Seach_Btn = "//a[@id='btnsearchipwithdate']//i[@class='fa fa-search']";

	//========================== Table Select ===========================
	protected static String select_In_table_Second_Row = "//table[@id='schpatientslist']//tr[position()=2]";

	//============================== Io Chart ================================
	protected static String Enter_UHID = "//input[@id='txtUhid']";
	protected static String Enter_ER_No = "//input[@id='txtIpno']";
	protected static String IO_Chart_Plush_Icon = "//i[@class='fa fa-plus']";
	protected static String Input_Output_Chart_Plush_Icon = "//a[@id='addNewTblRow']//i[@class='fa fa-plus']";

	protected static String Input_Output_Chart_IV_Fluid_Drp = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//select[@id='IVFluidDrd1']";
	protected static String Input_Output_Chart_Flow_Rate = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//td[@ctype='Volume']";
	protected static String Input_Output_Chart_Valume = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//input[@id='inputDetailTblFlowRateTxt1']";
	protected static String Input_Output_Chart_Valume_Drp = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//select[@ctype='OralSub']";
	protected static String Input_Output_Chart_IV_TT_Drp = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//select[@ctype='OralDrd']";
	protected static String Input_Output_Chart_Input_Quantity = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//input[@id='inputDetailTblQuantityTxt1']";
	protected static String Input_Output_Chart_Input_Remarks = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//td[@ctype='Remark']";

	protected static String Input_Output_Chart_Output_Drp = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//select[@id='OutputDrd1']";
	protected static String Input_Output_Chart_Sub_Type_Drp = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//select[@id='ddOutSub1']";
	protected static String Input_Output_Chart_Output_Quantity = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//input[@id='outputDetailTblQuantityTxt1']";
	protected static String Input_Output_Chart_Output_Remarks = "//table[@id='inputDetailTbl']//tbody//tr[position()=1]//td[@id='outputDetailTblRemark1']";

	protected static String save_Btn = "//a[@id='save']";
	protected static String Input_Output_Chart_Delete_Icon = "//table[@id='inputDetailTbl']//tbody//tr[last()]//i";
	protected static String Input_OutPut_Left_Arrow = "//i[@class='fa fa-arrow-left']";
	
	protected static String Print_Icon = "//a[@id='print']";
	protected static String GroupBy_Check_Box = "//input[@id='chkGroupBy']";
	protected static String GroupBy_Drp = "//select[@id='DDGroupBy']";
	protected static String Click_Chart_Icon = "//i[@id='IOGraphIcon']";
	protected static String Close_Chart_Icon = "//a[@id='btncloseIOPnl']//i[@class='fa fa-times']";
	protected static String Check_Box_Last_24H = "//label[@for='chkShowForLast24Hrs']";
	protected static String Show_Marked_Error_Chkk_Box = "//label[@for='chkShowMarkAsError']";

	//=================================== Delete Marked As Error ==================================
	protected static String Delete_Marked_Error_Icon_Table = "//table[@id='iodetailTbl']//tbody//tr[position()=1]//i";
	protected static String Delete_Marked_Error_Icon_Table_Yes_Pop = "//a[@id='btnMarkErrorIOYes']";




	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEROrderTab(String emergency_btn) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Er_Order_Tab)));
		CommanUtill.clickFunction(Er_Order_Tab, emergency_btn);

	}
	public void ClickOnIoChartPage(String IoChart ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Io_Chart_Page)));
		CommanUtill.clickTabSwitchToAnotherWindow(Io_Chart_Page, IoChart);
	}
	//================================ Search Patient In Io Chart =================================
	public void ClickOnSearchBtn(String Search ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_In_Patient_Icon)));
		CommanUtill.clickFunction(Search_In_Patient_Icon, Search);
	}
	public void CurrentInPatientInRadioBtn(String Current_In_Patient) throws IOException, InterruptedException { 

		WebElement currentPatient_RadioBtn = driver.findElement(By.xpath(Current_in_Patient_Radio_Btn));
		if(! currentPatient_RadioBtn.isSelected()) {
			CommanUtill.clickFunction(Current_in_Patient_Radio_Btn, Current_In_Patient);
		}
	}
	public void AllWardsInCheckBox(String All_Wards) throws IOException, InterruptedException { 

		WebElement All_Ward_Chkk_box = driver.findElement(By.xpath(All_Wards_Check_Box));
		if(! All_Ward_Chkk_box.isSelected()) {
			CommanUtill.clickFunction(All_Wards_Check_Box, All_Wards);
		}
	}
	public void Admission_DischargeCheckBox(String  Discharge_chkk_Box) throws IOException, InterruptedException { 

		WebElement AdmissionDis_Chkk_box = driver.findElement(By.xpath(Admission_Discharge_Check_Box));
		if(! AdmissionDis_Chkk_box.isSelected()) {
			CommanUtill.clickFunction(Admission_Discharge_Check_Box, Discharge_chkk_Box);
		}
	}
	public void FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Search_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Search_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Search_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Search_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void FindPatientInSearcbButton(String Search ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Seach_Btn)));
		CommanUtill.clickFunction(Click_Seach_Btn, Search);
	}
	//========================== Table Select ===========================

	public void SearchInIOChartInTable(String Table_Select) throws IOException, InterruptedException {

		logger.info("===== Select In IO Chart Table =====");
		System.out.println("===== Select In IO Chart Table =====");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		String rowXpath = select_In_table_Second_Row;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(rowXpath)));
		List<WebElement> columns = driver.findElements(By.xpath(rowXpath + "//td"));

		StringBuilder rowData = new StringBuilder();

		for (WebElement col : columns) {
			rowData.append(col.getText().trim()).append(" | ");
		}

		System.out.println("Row Data: " + rowData.toString());
		logger.info("Row Data: " + rowData.toString());

		CommanUtill.clickFunction(rowXpath ,Table_Select);
	}
	//============================= Enter IO Chart ==========================
	public void EnterUHIDNumber(String UHID_No) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, UHID_No);
		er.sendKeys(Keys.ENTER);
	}
	public void EnterErNumber(String er_enter) throws IOException, InterruptedException { 

		WebElement er = driver.findElement(By.xpath(Enter_ER_No));
		CommanUtill.textEnter(Enter_ER_No, er_enter);
		er.sendKeys(Keys.ENTER);
	}
	public void IoChartPlushButton(String plush_Icon ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(IO_Chart_Plush_Icon)));
		CommanUtill.clickFunction(IO_Chart_Plush_Icon, plush_Icon);
	}

	//============================= InPut OutPut Chart ==========================

	public void PlushIconInputOutPutChart(String plush_Icon ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Input_Output_Chart_Plush_Icon)));
		CommanUtill.clickFunction(Input_Output_Chart_Plush_Icon, plush_Icon);
	}
	public void InPutFluidChartDetails(String Iv_Fluid_Drp , String Flow_Rate , String Volume , String Oral_Sub_No_Name, String Iv_TT_Drp , 
			String Quantity , String Ipput_Remarks) throws IOException, InterruptedException {  

		CommanUtill.dropdownSelectByVisibleText(Input_Output_Chart_IV_Fluid_Drp, Iv_Fluid_Drp);
		CommanUtill.textEnter(Input_Output_Chart_Flow_Rate, Flow_Rate);
		CommanUtill.textEnter(Input_Output_Chart_Valume, Volume);
		CommanUtill.dropdownSelectByVisibleText(Input_Output_Chart_Valume_Drp, Oral_Sub_No_Name);
		CommanUtill.dropdownSelectByVisibleText(Input_Output_Chart_IV_TT_Drp, Iv_TT_Drp);
		CommanUtill.textEnter(Input_Output_Chart_Input_Quantity, Quantity);
		CommanUtill.textEnter(Input_Output_Chart_Input_Remarks, Ipput_Remarks);

	}
	public void OutPutFluidChartDetails(String Output_Drp , String Sub_Type_Drp , String Output_Quantity , String Output_Remarks) 
			throws IOException, InterruptedException {  

		CommanUtill.dropdownSelectByVisibleText(Input_Output_Chart_Output_Drp, Output_Drp);
		CommanUtill.dropdownSelectByVisibleText(Input_Output_Chart_Sub_Type_Drp, Sub_Type_Drp);
		CommanUtill.textEnter(Input_Output_Chart_Output_Quantity, Output_Quantity);
		CommanUtill.textEnter(Input_Output_Chart_Output_Remarks, Output_Remarks);	
	}
	public void SaveInputOutPutIcon(String save ) throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(save_Btn)));
		CommanUtill.clickFunction(save_Btn, save);
	}
	public void DeleteInputOutChartInTable (String Table) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Input_Output_Chart_Delete_Icon)));
		CommanUtill.clickFunction(Input_Output_Chart_Delete_Icon, Table);
	}
	public void ClickOnBackArrowInInputOutputChartPage (String Arrow_Btn) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Input_OutPut_Left_Arrow)));
		CommanUtill.clickFunction(Input_OutPut_Left_Arrow, Arrow_Btn);
	}
	//================================= Io Chart ================================
	public void ClickOnPrintInIoChartBtn (String Print) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Print_Icon)));
		CommanUtill.clickFunction(Print_Icon, Print);
	}
	
	public void SelectCheckBoxGroupByAndDrp(String Check_Box , int Group_Drp ) throws IOException, InterruptedException { 

		WebElement Group_Chkk_box = driver.findElement(By.xpath(GroupBy_Check_Box));
		if(! Group_Chkk_box.isSelected()) {
			CommanUtill.clickFunction(GroupBy_Check_Box, Check_Box);
			CommanUtill.dropdownSelectByIndex(GroupBy_Drp, Group_Drp);
		}
	}
	public void ClickOnChartIcon (String Chart_Icon , String Close_Btn) throws IOException, InterruptedException { 

		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Chart_Icon)));
		CommanUtill.clickFunction(Click_Chart_Icon, Chart_Icon);
		CommanUtill.clickFunction(Close_Chart_Icon, Close_Btn);
	}
	public void CheckBoxShowForLast24(String Hours_Check_Box ) throws IOException, InterruptedException { 

		WebElement Last_Chkk_box = driver.findElement(By.xpath(Check_Box_Last_24H));
		if(! Last_Chkk_box.isSelected()) {
			CommanUtill.clickFunction(Check_Box_Last_24H, Hours_Check_Box);
		}
	}
	//======================= Delete Marked As Error =========================== 
	public void UnSelectCheckBoxGroup(String Check_Box) throws IOException, InterruptedException {
		
	    WebElement groupChkBox = driver.findElement(By.xpath(GroupBy_Check_Box));

	    // Uncheck only if already selected
	    if (groupChkBox.isSelected()) {
	        CommanUtill.clickFunction(GroupBy_Check_Box, Check_Box);

	        logger.info("Checkbox was selected, now unchecked");
	        System.out.println("Checkbox was selected, now unchecked");
	    } else {
	        logger.info("Checkbox already unchecked");
	        System.out.println("Checkbox already unchecked");
	    }
	}
	public void DeleteMarkedAsErrorYesPop(String Delete_Error_Marked , String Yes_Pop) throws IOException, InterruptedException { 

			CommanUtill.clickFunction(Delete_Marked_Error_Icon_Table, Delete_Error_Marked);
			CommanUtill.clickFunction(Delete_Marked_Error_Icon_Table_Yes_Pop, Yes_Pop);
		}
	





}
