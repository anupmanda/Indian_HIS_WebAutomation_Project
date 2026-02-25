/**
 * 
 */
package com.test.IpBilling.Page;

import java.io.IOException;
import java.lang.System.Logger;
import java.time.Duration;

import javax.management.InvalidApplicationException;

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
 * 24-Feb-2026
 */
public class PackageDurationModifictionPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	//===================Package Duration Modifiction==========================

	protected static  String Ip_Package_Details_Tab = "//span[normalize-space()='IP Package Details']";
	protected static  String Package_Duration_Modification = "//a[normalize-space()='Package Duration Modification']";
	protected static String Enter_UHID = "//input[@id='txtuhid']";
	protected static String Enter_Ip_No = "//input[@id='txtipno']";

	//===================== Package Duration Modification Billable =========================
	protected static String Package_Name_Table_First = "//table[@id='tblPackageDetails']//tbody//tr[2]";
	protected static String Package_Modify_Icon = Package_Name_Table_First + "//i[@class='fa fa-edit edit_details fa-lg']";

	//======================Package Modification Pop =====================
	protected static String Billable_Bed_Type  = "//select[@id='Billable']";
	protected static String Save_Only_Change_Billable_Bed_Type = "//i[@title='Save']";
	protected static String Save_Only_Change_Billable_Bed_Type_Yes_Pop = "//a[@id ='btnPackageYes']";

	//===================== Package Duration Modification All =========================

	protected static String Package_Name_Table_Second = "//table[@id='tblPackageDetails']//tbody//tr[last()]";
	protected static String Package_Modify_Btn = Package_Name_Table_Second + "//i[@class='fa fa-edit edit_details fa-lg']";
	
	//===================== Package Duration Modification Delete =========================

	protected static String Package_Name_Table_Thrid_Row = "//table[@id='tblPackageDetails']//tbody//tr[3]";
	protected static String Package_Modify_Btn_Delete = Package_Name_Table_Thrid_Row + "//i[@class='fa fa-edit edit_details fa-lg']";
    protected static String Package_Delete_Icon = "//a[@id='PackageModificationDelete']";
    protected static String Package_Delete_Icon_Yes_pop = "//a[@id='btnYesDeleteModal']";

	//======================Package Modification Pop =====================
	protected static String Chargeable_Percentage_Drp = "//select[@id='selPercentage']";
	protected static String Package_Doctor_Speciality_Drp = "//select[@id='selspecialisation']";
	protected static String Billable_Amount = "//input[@id='_packageAmt']";
	protected static String Package_Doctor_Name_Drp = "//select[@id='seldoctors']";
	protected static String Billable_Bed_Type_Drp = "//select[@id='Billable']";
	protected static String Check_Box_Exclude_higher_category_Room_Rent  = "//input[@id='Excludehighercategory']";
	protected static String Save_Package_Update = "//a[@id='PackageModificationSave']//i[@class='fa fa-save']";
	protected static String Save_Package_Update_Yes_pop = "//a[@id='btnYesSaveModal']";










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

	public void clickOnPackageDurationModificationPage(String Duration_Modification) throws IOException , InterruptedException{

		WebDriverWait Package = new WebDriverWait(driver,Duration.ofSeconds(10));
		Package.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Package_Duration_Modification)));
		CommanUtill.clickFunction(Package_Duration_Modification, Duration_Modification);
	}

	public void EnterUHIDPackageDuration(String UHID) throws IOException , InterruptedException{

		WebElement Enter_Uhid = driver.findElement(By.xpath(Enter_UHID));
		CommanUtill.textEnter(Enter_UHID, UHID);
		Enter_Uhid.sendKeys(Keys.ENTER);
	}
	public void EnterIPNumberPackageDuration(String IpNo) throws IOException , InterruptedException{

		WebElement Enter_Uhid = driver.findElement(By.xpath(Enter_Ip_No));
		CommanUtill.textEnter(Enter_Ip_No, IpNo);
		Enter_Uhid.sendKeys(Keys.ENTER);
	}
	public void ClickPackageNameModification(String Modification_Icon) throws IOException , InterruptedException { 

		WebDriverWait Package_Name = new WebDriverWait(driver, Duration.ofSeconds(10));
		Package_Name.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Package_Name_Table_First)));
		String Print_Package_Name = driver.findElement(By.xpath(Package_Name_Table_First)).getText();

		logger.info("==============Pakage Name Print ================");
		logger.info(Print_Package_Name);
		System.out.println("First Row Print:" + Print_Package_Name);
		Thread.sleep(1000);

		CommanUtill.clickFunction(Package_Modify_Icon, Modification_Icon);
		logger.info("Clicked Modify Icon Successfully");

	}

	public void ChangeBillableBedTypeDrp_SaveBtn(String BillableBedType, String Billable_SaveBtn, String Yes_pop) 
			throws IOException, InterruptedException {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Billable_Bed_Type)));

			CommanUtill.dropdownSelectByVisibleText(Billable_Bed_Type, BillableBedType);
			CommanUtill.clickFunction(Save_Only_Change_Billable_Bed_Type, Billable_SaveBtn);
			CommanUtill.clickFunction(Save_Only_Change_Billable_Bed_Type_Yes_Pop, Yes_pop);
			logger.info("Change Billable Type Successfully");

		} catch (Exception e) {

			logger.info("Did Not Change Billable Bed Type");
			e.printStackTrace();
		}
	}

	public void ClickLastRowPackageNameModificationIcon(String Package_Modification_Last_Row ) throws IOException , InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Package_Name_Table_Second)));

		String Package_Name = driver.findElement(By.xpath(Package_Name_Table_Second)).getText();

		logger.info("========Last Row Print In Package Name Details =================");
		logger.info(Package_Name);
		System.out.println("Print Package Name Last Row :" + Package_Name);
		Thread.sleep(1000);
		CommanUtill.clickFunction(Package_Modify_Btn, Package_Modification_Last_Row);
		logger.info("Clicked Modify Icon Successfully");
	}
	public void SelectByChargeablePercentageDrp(String ChargeablePercentage) throws IOException , InterruptedException {

		WebDriverWait Perctange_Drp = new WebDriverWait(driver, Duration.ofSeconds(10));
		Perctange_Drp.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Chargeable_Percentage_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Chargeable_Percentage_Drp, ChargeablePercentage);
	}
	public void SelectByPackageDoctorSpecialityDrp(String Doctor_Speciality) throws IOException , InterruptedException {

		WebDriverWait Perctange_Drp = new WebDriverWait(driver, Duration.ofSeconds(10));
		Perctange_Drp.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Package_Doctor_Speciality_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Package_Doctor_Speciality_Drp, Doctor_Speciality);
	}
	public void EnterPackageAmount_PackageDoctorName(String Amount , String PackageDoctorName) throws IOException , InterruptedException {

		WebDriverWait Amount_Text = new WebDriverWait(driver ,Duration.ofSeconds(10));
		Amount_Text.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Billable_Amount)));
		CommanUtill.textEnter(Billable_Amount, Amount);
		WebDriverWait Doctor_name = new WebDriverWait(driver ,Duration.ofSeconds(10));
		Doctor_name.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Package_Doctor_Name_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Package_Doctor_Name_Drp, PackageDoctorName);

	}

	public void PackageModificationSaveBtn(String All_update_Save_Icon , String change_Date_Time_Doctor) throws IOException , InterruptedException {
		
		CommanUtill.clickFunction(Save_Package_Update, All_update_Save_Icon);
		WebDriverWait Yes_pop = new WebDriverWait(driver, Duration.ofSeconds(10));
		Yes_pop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Save_Package_Update_Yes_pop)));
		CommanUtill.clickFunction(Save_Package_Update_Yes_pop, change_Date_Time_Doctor);
		
	}
	
	public void DeletePackageNameTable(String Click_Package_Thrid_Row ) throws IOException , InterruptedException {
		
		WebDriverWait Thrid_Row_Package = new WebDriverWait(driver , Duration.ofSeconds(10));
		Thrid_Row_Package.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Package_Name_Table_Thrid_Row)));
		
		String Print_third_Row_Package_Name = driver.findElement(By.xpath(Package_Name_Table_Thrid_Row)).getText();
		
		logger.info("=============Thrid Row Print Package Name===============");
		logger.info("Package Name In Thrid Row:" + Print_third_Row_Package_Name);
		System.out.println("Thrid Row Print Package Name :" + Print_third_Row_Package_Name);
		CommanUtill.clickFunction(Package_Modify_Btn_Delete, Print_third_Row_Package_Name);
		
	}
   public void DeletePackagePop(String Delete_Icon , String Yes_Delete_Yes_Pop) throws IOException , InterruptedException {
	   
	   WebDriverWait Delete = new WebDriverWait(driver , Duration.ofSeconds(10));
	   Delete.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Package_Delete_Icon)));
	   CommanUtill.clickFunction(Package_Delete_Icon, Delete_Icon);
	   CommanUtill.clickFunction(Package_Delete_Icon_Yes_pop, Yes_Delete_Yes_Pop);
   }





}








