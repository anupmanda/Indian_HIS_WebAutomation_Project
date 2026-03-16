/**
 * 
 */
package com.test.IpBilling.Page;

import java.awt.SystemColor;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 25-Feb-2026
 */
public class PackageModifictionPatientPage extends GeneralBrowserSetting {

	public static String storedUHID;
	public static String storedIPNo;

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	//===================Package Duration Modifiction==========================

	protected static  String Ip_Package_Details_Tab = "//span[normalize-space()='IP Package Details']";
	protected static String Package_Modification_Patient = "//a[normalize-space()='Package Modification For Patient']";
	protected static String Enter_UHID = "//input[@id='txtuhid']";
	protected static String Enter_Ip_No = "//input[@id='ipno1']";

	//===================Find Patient =========================
	protected static String Find_Patint_Search_Icon = "//i[@id='search1']";
	protected static  String Current_In_Patient_Radio_Btn = "//input[@id='rbCurrentPatents']";
	protected static  String Chek_Box_All_Ward = "//input[@id='cbAllWards']";
	protected static  String Check_Box_Admission_DischargeD = "//input[@id='cbAdmission']";
	protected static  String patient_Search_From_Date= "//input[@id='txtadmitDate']";
	protected static  String patient_Search_To_Date= "//input[@id='txtadmittodate']";
	protected static  String Search_Icon_Find_Patint_pop = "//a[@id='search_billing']//i[@class='fa fa-search']";

	//=====================His LOGO========================
	protected static  String HIS_Logo_Btn = "//div[@class='logoHis']";
	
	//====================ADT Package Details ======================
	protected static  String ADT_DashBord = "//li[@id='btn_adt']";
	protected static  String ADT_Station_DdopDwon = "//select[@id='Department']";
	protected static  String ADT_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Admit_Patint_Tab = "//span[normalize-space()='Admit Patient']";
	protected static  String Admit_Patient_Page = "//a[contains(text(),'Admit Patient')]";
	protected static  String enter_ip_No = "//input[@id='text_ipid']";
	protected static  String Adt_Package_Btn = "//a[normalize-space()='Package Details']";
	protected static  String Speciality_Drp = "//select[@id='_packagedetails_speciality']";
	protected static  String Doctor_Drp = "//select[@id='packagedetails_doctor']";
	protected static  String Select_Package_Icon = "//i[@title='Select Package']";
	protected static  String Package_Details_pop_Department_Drp = "//select[@id='pkdetailsdeparment']";
	protected static  String Package_Details_pop_Search = "//input[@id='pkdetail_serach']";   //Search 

	protected static  String Click_On_Package_In_Table = "//table[@id='pkdetail_tbl']//tbody//tr[position()=1]";

	protected static  String First_package_Bed_Type_Select = "//table[@id='pricepkdetail']//tbody//tr[position()=1]";
	protected static  String Check_Box_Package = First_package_Bed_Type_Select + "//input[@type='checkbox']";

	//============================ADT Save Package ======================
	protected static  String Save_Package_Btn = "//a[@id='savepackage']//i[@class='fa fa-save']";
	protected static String Discharge_Date_Time_pop = "//input[@id='txtDischargePatientDateTime']";
	protected static  String package_Alias_Name = "//input[@id='Packagealiasname']";
	protected static  String package_Plus_icon = "//i[@id='addrowdata']";
	protected static  String package_Plus_icon_Yes_pop = "//a[@id='btnsavenewpack']";
	
	//======================Package Modification Patient ================================
	protected static  String Package_Name_Drp = "(//select[@id='packagename'])[1]";
	protected static  String Service_Name_Drp = "(//select[@id='servicename'])[1]";
	
	//=======================Table Package Modification Patient =====================
	
	protected static  String Table_Package_Line_Itesm = "//table[@id='servicetable']//tbody//tr[position()=1]";
	protected static  String Table_Package_Line_Itesm_Check_Box =Table_Package_Line_Itesm + "//input[@type='checkbox']";
	
	protected static  String Table_Package_Line_Itesm_Thrid_Column = "//table[@id='servicetable']//tbody//tr[position()]";
	protected static  String Table_Package_Line_Itesm_Thrid_Check_Box = Table_Package_Line_Itesm_Thrid_Column + "//input[@type='checkbox']";
	
	protected static  String Table_Package_First_Column = "//table[@id='packagedetails']//tbody//tr[position()=1]";
	protected static  String Table_Package_First_Column_Check_Box = Table_Package_First_Column + "//input[@class='chkALL ckpac']";

	protected static  String Table_Package_Thrid_Column = "//table[@id='dgvExcludedItem']//tbody//tr[position()=1]";
	protected static  String Table_Package_Thrid_Column_Check_Box = Table_Package_Thrid_Column + "//input[@class='chkALL ckexc ']";
	
	//========================== Arrow Forward And backward =========================
	
	protected static String Forward_Right_Arrow  = "//i[@id='forwardright']";   //left
	protected static String Forward_Left_Arrow  = "//i[@id='forwardleft']";
	
	protected static String Exclude_Right_Arrow  = "//i[@id='btnInlineToExcludeItem']";
	protected static String Exclude_left_Arrow  = "//i[@id='btnExcludetoInlineItem']";
	
	//==========================Save Modification Package ===============================
	protected static String Save_Btn_Package_Modification = "//a[@id='btnsave']//i[@class='fa fa-save']";
	protected static String Save_Btn_Package_Modification_Yes_Pop = "//a[@id='btnyes']";
	protected static String Save_Btn_Package_Modification_Confimation_pop_Yes = "//a[@id='btnok2']";
	
	protected static String Items_Name_Table_Yes_Icon ="//a[@id='btncheck']//i[@class='fa fa-check']";
	
	
	
	
	
	
	


	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
			throws IOException , InvalidApplicationException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Billing_Meanu)));
		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}
	public void clickOnIPPackageDetailsTab(String Ip_Package_Details) throws IOException , InterruptedException{

		WebDriverWait Package = new WebDriverWait(driver,Duration.ofSeconds(10));
		Package.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Ip_Package_Details_Tab)));
		CommanUtill.clickFunction(Ip_Package_Details_Tab, Ip_Package_Details);
	}
	public void PackageModificationPatentPage(String patient_ModiFication_Package) throws IOException , InterruptedException{

		CommanUtill.clickFunction(Package_Modification_Patient, patient_ModiFication_Package);	
	}

	public void EnterPackageModificationUHID(String Uhid) throws IOException , InterruptedException{

		WebElement Enter_Uhid = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, Uhid);
		Enter_Uhid.sendKeys(Keys.ENTER);
	}

	public void EnterPackageModificationIPNumber(String IpNo) throws IOException , InterruptedException{

		WebElement Enter_Uhid = driver.findElement(By.xpath(Enter_Ip_No));
		CommanUtill.textEnter(Enter_Ip_No, IpNo);
		Enter_Uhid.sendKeys(Keys.ENTER);
	}

	public void FindPatintSearchIcon(String Find_Patint) throws IOException , InterruptedException{

		CommanUtill.clickFunction(Find_Patint_Search_Icon, Find_Patint);
	}
	public void ClickOnCurrentPatientRadioBtn(String Current_Patient_Radio) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Current_In_Patient_Radio_Btn)));
		if (! driver.findElement(By.xpath(Current_In_Patient_Radio_Btn)).isSelected()) {
			CommanUtill.clickFunction(Current_In_Patient_Radio_Btn, Current_Patient_Radio);
		}
	}
	public void CheckBoxAllWard(String All_Ward_Chkk_Box) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Chek_Box_All_Ward)));
		if (! driver.findElement(By.xpath(Chek_Box_All_Ward)).isSelected()) {
			CommanUtill.clickFunction(Chek_Box_All_Ward, All_Ward_Chkk_Box);
		}
	}

	public void CheckBoxAdmissionDischarge(String DischargeDate_Check_Box) throws IOException , InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Check_Box_Admission_DischargeD)));
		if (! driver.findElement(By.xpath(Check_Box_Admission_DischargeD)).isSelected()) {
			CommanUtill.clickFunction(Check_Box_Admission_DischargeD, DischargeDate_Check_Box);
		}
	}
	public void PatientSearchFromAndToDate(String From_Date , String To_Date) throws IOException , InvalidApplicationException, InterruptedException {

		WebElement From_Date_Element = driver.findElement(By.xpath(patient_Search_From_Date));
		From_Date_Element.sendKeys(Keys.CONTROL + "a");
		From_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(patient_Search_From_Date, From_Date);
		From_Date_Element.sendKeys(Keys.TAB);

		WebElement To_Date_Element = driver.findElement(By.xpath(patient_Search_To_Date));
		To_Date_Element.sendKeys(Keys.CONTROL + "a");
		To_Date_Element.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(patient_Search_To_Date, To_Date);
		To_Date_Element.sendKeys(Keys.TAB);
	}

	public void ClickOnSearchIconFindPatientPop(String Search_Icon_Btn) throws IOException , InvalidApplicationException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Search_Icon_Find_Patint_pop)));
		CommanUtill.clickFunction(Search_Icon_Find_Patint_pop, Search_Icon_Btn);
	}

	public void clickLastMinusOneRowAndStoreData(String fieldName) throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='searchBillingTable']//tbody//tr")));

		// Last-1 Row XPath
		String lastMinusOneRowXpath = "//table[@id='searchBillingTable']//tbody//tr[last()]";

		// Get Entire Row Text (Print Purpose)
		String entireRowText = driver.findElement(By.xpath(lastMinusOneRowXpath)).getText();

		// UHID = 2nd Column
		storedUHID = driver.findElement(By.xpath(lastMinusOneRowXpath + "/td[2]")).getText();

		// IP No = 3rd Column
		storedIPNo = driver.findElement(By.xpath(lastMinusOneRowXpath + "/td[3]")).getText();

		System.out.println("Print Entire Row : " + entireRowText);
		System.out.println("Stored UHID : " + storedUHID);
		System.out.println("Stored IP No : " + storedIPNo);

		logger.info("Print Entire Row : " + entireRowText);
		logger.info("Stored UHID : " + storedUHID);
		logger.info("Stored IP No : " + storedIPNo);

		// Click Full Row
		CommanUtill.clickFunction(lastMinusOneRowXpath, fieldName);

		logger.info("Clicked Last-1 Row Successfully");
	}
	public void ClickOnHisLogoIcon(String His_Logo_Btn) throws IOException, InterruptedException {

		WebDriverWait log = new WebDriverWait(driver, Duration.ofSeconds(10));
		log.until(ExpectedConditions.elementToBeClickable(By.xpath(HIS_Logo_Btn)));
		CommanUtill.clickFunction(HIS_Logo_Btn, His_Logo_Btn);
	}
	public void ADTDashbordYesPop(String Click_Adt , String Station_Drp , String Yes_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(ADT_DashBord, Click_Adt);
		CommanUtill.dropdownSelectByVisibleText(ADT_Station_DdopDwon, Station_Drp);
		CommanUtill.clickFunction(ADT_Station_Yes_pop, Yes_Pop);
	}

	public void AdmitPatientPage(String Admit_Tab , String Adt_Page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Admit_Patint_Tab, Admit_Tab);
		CommanUtill.clickFunction(Admit_Patient_Page, Adt_Page);
	}

	public void EnterIPNumber(String IpNo) throws IOException, InterruptedException {

		if (IpNo == null || IpNo.trim().isEmpty()) {
			IpNo = storedIPNo;
		}

		WebDriverWait ip = new WebDriverWait(driver, Duration.ofSeconds(15));
		ip.until(ExpectedConditions.presenceOfElementLocated(By.xpath(enter_ip_No)));

		CommanUtill.textEnter(enter_ip_No, IpNo);

		WebElement enter_ip = driver.findElement(By.xpath(enter_ip_No));
		enter_ip.sendKeys(Keys.ENTER);
	}

	public void ClickOnADTPackageBtn(String package_btn) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Adt_Package_Btn, package_btn);	
	}

	public void SelectSpecialityAndDoctorDrp(String Speciality , String Doctor) throws IOException, InterruptedException {
		CommanUtill.dropdownSelectByVisibleText(Speciality_Drp, Speciality);
		CommanUtill.dropdownSelectByVisibleText(Doctor_Drp, Doctor);
	}
	public void AdtPackageIconBtn(String package_Icon)  throws IOException, InterruptedException {

		WebDriverWait Packsge = new WebDriverWait(driver, Duration.ofSeconds(10));
		Packsge.until(ExpectedConditions.elementToBeClickable(By.xpath(Select_Package_Icon)));
		CommanUtill.clickFunction(Select_Package_Icon, package_Icon);
	}
	public void DepartmentPackageDetailsPopDrp(String Department) throws IOException, InterruptedException {

		WebDriverWait Department_Drp = new WebDriverWait(driver, Duration.ofSeconds(10));
		Department_Drp.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Package_Details_pop_Department_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Package_Details_pop_Department_Drp, Department);
	}
	public void SearchPackageNameBox(String Package_Name)  throws IOException, InterruptedException {

		WebDriverWait package_Search = new WebDriverWait(driver, Duration.ofSeconds(10));
		package_Search.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Package_Details_pop_Search)));
		CommanUtill.textEnter(Package_Details_pop_Search, Package_Name);
	}
	public void clickOnTablePackage(String Click_Package) throws IOException, InterruptedException {

		WebDriverWait Click_Package_Table = new WebDriverWait(driver, Duration.ofSeconds(10));
		Click_Package_Table.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Click_On_Package_In_Table)));

		String package_name = driver.findElement(By.xpath(Click_On_Package_In_Table)).getText();
		logger.info("==============Package Name =================");
		logger.info("Package Name In First Row :" + package_name);
		System.out.println("Package Name In First Row :" + package_name);
		CommanUtill.clickFunction(Click_On_Package_In_Table, Click_Package);
		System.out.println("Package Select Successfully Cliled");
	}

	public void PackageDetailsPop_BedType_Prce(String BedType_Price) throws IOException, InterruptedException {

		WebDriverWait Bed_Price = new WebDriverWait(driver, Duration.ofSeconds(10));
		Bed_Price.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(First_package_Bed_Type_Select)));

		String Print_BedType_Price = driver.findElement(By.xpath(First_package_Bed_Type_Select)).getText();
		logger.info("==============Print Bed Type And Price ================");
		logger.info(Print_BedType_Price);

		System.out.println("Print Bed Type And Price :" + Print_BedType_Price);
		CommanUtill.clickFunction(Check_Box_Package, BedType_Price);
	}
	public void PackageSaveIcon(String Save) throws IOException, InterruptedException {

		WebDriverWait Save_icon = new WebDriverWait(driver, Duration.ofSeconds(10));
		Save_icon.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Save_Package_Btn)));
		CommanUtill.clickFunction(Save_Package_Btn, Save);
	}
	public void enterCurrentDischargeDateTime() throws IOException, InterruptedException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm a");

		String currentDateTime = sdf.format(new java.util.Date());

		WebElement clear = driver.findElement(By.xpath(Discharge_Date_Time_pop));
		clear.sendKeys(Keys.CONTROL + "a");
		clear.sendKeys(Keys.DELETE);

		CommanUtill.textEnter(Discharge_Date_Time_pop, currentDateTime);
		clear.sendKeys(Keys.TAB);

		System.out.println("Discharge Date Time auto-set to: " + currentDateTime);

	}
	public void enterPakageAliasName(String Alias) throws IOException, InterruptedException {
		
		CommanUtill.textEnter(package_Alias_Name, Alias);
	}
	public void AddPlusIconPackage(String add_Package , String Package_Yes_pop) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(package_Plus_icon, add_Package);
		CommanUtill.clickFunction(package_Plus_icon_Yes_pop, Package_Yes_pop);
	}
	//======================Package Modification Patient ================================
	public void SelectByPackageNameIndex(int index) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Package_Name_Drp)));
	    CommanUtill.dropdownSelectByIndex(Package_Name_Drp, index);
	}
	
	public void SelectByServiceName(String ServiceName) throws IOException, InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Service_Name_Drp)));
        //CommanUtill.dropdownSelectByIndex(Service_Name_Drp, ServiceName);
        CommanUtill.dropdownSelectByVisibleText(Service_Name_Drp, ServiceName);
	} 
	
	public void SelectLineItemsCheckBox(String Check_Box_First_Column) throws IOException, InterruptedException {
		
		WebDriverWait Check_Box_1 = new WebDriverWait( driver, Duration.ofSeconds(10));
		Check_Box_1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Table_Package_Line_Itesm)));
		String CheckBox = driver.findElement(By.xpath(Table_Package_Line_Itesm)).getText();
		logger.info("============ Non Chargeable Service Iteam =================");
		logger.info("Non Chargeable Items Service :" + CheckBox);
		CommanUtill.clickFunction(Table_Package_Line_Itesm_Check_Box, Check_Box_First_Column);
		System.out.println("Non Chargeable Items Service :" + CheckBox);
	}
	
	public void ClickOnArrowSecondColumnToFitstColumn(String Arrow_Left_Line_Items) throws IOException, InterruptedException {
		
		WebDriverWait Arrow = new WebDriverWait( driver, Duration.ofSeconds(10));
		Arrow.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Forward_Right_Arrow)));
		CommanUtill.clickFunction(Forward_Right_Arrow, Arrow_Left_Line_Items);
	}
	public void ClickOnArrowSecondColumnToThirdColumn(String Arrow_Right_Side) throws IOException, InterruptedException {
		
		WebDriverWait Arrow = new WebDriverWait( driver, Duration.ofSeconds(10));
		Arrow.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Exclude_Right_Arrow)));
		CommanUtill.clickFunction(Exclude_Right_Arrow, Arrow_Right_Side);
	}
	
	public void SavePackageModificationBtn(String Package_Save_Icon , String Yes_Items_popo ,String  Yes_Confirmation) 
			throws IOException, InterruptedException {
		   
		   CommanUtill.clickFunction(Save_Btn_Package_Modification, Package_Save_Icon);
		   CommanUtill.clickFunction(Save_Btn_Package_Modification_Yes_Pop, Yes_Items_popo);
		   CommanUtill.clickFunction(Save_Btn_Package_Modification_Confimation_pop_Yes, Yes_Confirmation);
	   }
	public void NoNamePrintAndSaveBtn(String Right_Icon) throws IOException, InterruptedException {
	
		WebDriverWait Right_Icon_Pop = new WebDriverWait( driver, Duration.ofSeconds(10));
		Right_Icon_Pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Items_Name_Table_Yes_Icon)));
		CommanUtill.clickFunction(Items_Name_Table_Yes_Icon, Right_Icon);
	}

   public void SelectLineItemsMoveTo_Exclusion(String Check_Box_Line_Items) throws IOException, InterruptedException {
		
		WebDriverWait Check_Box_2 = new WebDriverWait( driver, Duration.ofSeconds(10));
		Check_Box_2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Table_Package_Line_Itesm_Thrid_Column)));
		String CheckBox2 = driver.findElement(By.xpath(Table_Package_Line_Itesm_Thrid_Column)).getText();
		logger.info("============ Chargeable Service Iteam =================");
		logger.info("Non Chargeable Items Service :" + CheckBox2);
		CommanUtill.clickFunction(Table_Package_Line_Itesm_Thrid_Check_Box, Check_Box_Line_Items);
		System.out.println("Chargeable Items Service :" + CheckBox2);
	}
   
   public void SelectFirstColumnPackageServiceCheckBox(String CheckBox_First_Column) throws IOException, InterruptedException {
		
		WebDriverWait Check_Box = new WebDriverWait( driver, Duration.ofSeconds(10));
		Check_Box.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Table_Package_First_Column)));
		String CheckBox_print = driver.findElement(By.xpath(Table_Package_First_Column)).getText();
		logger.info("============ UpDate First Column To Line Items =================");
		logger.info("UpDate First Column To Line Items :" + CheckBox_print);
		CommanUtill.clickFunction(Table_Package_First_Column_Check_Box, CheckBox_First_Column);
		System.out.println("UpDate First Column To Line Items :" + CheckBox_print);
	}
   
   public void ClickArrowFirstColumnIntoLineItems(String Right_Arrow_Move) throws IOException, InterruptedException {
	   
	   WebDriverWait FirstColumnTo2nd = new WebDriverWait( driver, Duration.ofSeconds(10));
	   FirstColumnTo2nd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Forward_Left_Arrow)));
		CommanUtill.clickFunction(Forward_Left_Arrow, Right_Arrow_Move);
   }
   
   public void SaveBtnFirstCoumnToSecondColumn(String Save_Icon , String Yes_Items_popo) throws IOException, InterruptedException {
	   
	   CommanUtill.clickFunction(Save_Btn_Package_Modification, Save_Icon);
	   CommanUtill.clickFunction(Save_Btn_Package_Modification_Yes_Pop, Yes_Items_popo);
   }
   
   public void SelectThridColumnPackageServiceCheckBox(String CheckBox) throws IOException, InterruptedException {
		
		WebDriverWait Check_Box = new WebDriverWait( driver, Duration.ofSeconds(10));
		Check_Box.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Table_Package_Thrid_Column)));
		String CheckBox_print = driver.findElement(By.xpath(Table_Package_Thrid_Column)).getText();
		logger.info("============ Update Third Column To Second Column =================");
		logger.info("Update Third Column To Second Column :" + CheckBox_print);
		CommanUtill.clickFunction(Table_Package_Thrid_Column_Check_Box, CheckBox);
		System.out.println("Update Third Column To Second Column :" + CheckBox_print);
	}
   public void ClickArrowThridColumnIntoLineItems(String Left_Arrow_Move) throws IOException, InterruptedException {
	   
	   WebDriverWait Exclusion = new WebDriverWait( driver, Duration.ofSeconds(10));
	   Exclusion.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Exclude_left_Arrow)));
		CommanUtill.clickFunction(Exclude_left_Arrow, Left_Arrow_Move);
   }
   
   
   
   
}
