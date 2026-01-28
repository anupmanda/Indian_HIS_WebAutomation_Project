/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 3 Dec 2025
 */
public class ADT_Bed_Booking extends GeneralBrowserSetting {

	//***************************************GLOBAL STORED VALUES*******************************************//
	public static String STORED_UHID = "";
	public static String STORED_WLNO = "";

	//************************************* ALL MANDATORY DETAILS ******************************************//
	//************************************* Demographics Details ******************************************//
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	protected static String SelectFacility = "//*[@id=\"Facility\"]";
	protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
	protected static String SelectStation = "//*[@id=\"Department\"]";
	protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
	protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
	protected static String ClickBedBooking = "//*[@id=\"FOAddPatientMenu\"]/ul/li[2]/a";
	protected static String SelectTitle = "//*[@id=\"ddl_Title\"]";
	protected static String TextFirstName = "//*[@id=\"txt_FirstName\"]";
	protected static String TextLastName = "//*[@id=\"txt_LastName\"]";
	protected static String SelectSex = "//*[@id=\"ddl_Sex\"]";
	protected static String TextFatherName = "//*[@id=\"txt_Spouse\"]";
	protected static String SelectMaritalStatus = "//*[@id=\"ddl_MaritalStatus\"]";
	protected static String TextAddress = "//*[@id=\"txt_Address\"]";
	protected static String SelectCity = "//*[@id=\"ddl_City_Twon\"]";
	protected static String SelectState = "//*[@id=\"ddl_State\"]";
	protected static String SelectCountry = "//*[@id=\"ddl_Country\"]";
	protected static String SelectHowdoucametoKnow = "//*[@id=\"ddl_ComeToKnow\"]";
	protected static String SelectBedType = "//*[@id=\"ddl_RequestBedType\"]";
	protected static String ClickSave = "//*[@id=\"btnSave\"]";
	protected static String toastXpath = "//div[contains(@class,'gritter-item')]//p";
	protected static String TextUHID1 = "//*[@id=\"txt_UHID\"]";
	protected static String ClickCopyAddress = "//*[@id=\"chk_CopyformPresentAddress\"]";
	protected static String TextWLNO = "//*[@id=\"txt_WLNo\"]";
	protected static String ClickModify = "//*[@id=\"btn_Modify\"]";
	protected static String ClickUpdateBtn = "//*[@id=\"btnUpdate\"]";
	//************************************* Consultant ***********************************************//
	protected static String ClickConsultantTab = "//*[@id=\"tab_Consultant\"]/a";
	protected static String SelectPrimarySpecialist = "//*[@id=\"ddl_PrimarySpecialality\"]";
	protected static String TextReferredBy = "//*[@id=\"txt_ReferredBy\"]";
	protected static String SelectRequestedBedType = "//*[@id=\"ddl_RequestBedType\"]";

	//************************************* Bed&PayemntDetails ***********************************************//
	protected static String ClickBedandPyementsDetails = "//*[@id=\"tab_BedPaymentDetails\"]";
	protected static String SelectRequestedBedTypeBPD = "//*[@id=\"ddl_RequestBedType\"]";

	//************************************* NON MANDATORY ***********************************************//
	protected static String TextUHID = "//*[@id=\"txt_UHID\"]";
	protected static String TextWLNo = "//*[@id=\"txt_WLNo\"]";

	//************************************* METHODS ****************************************************//

	public void BedBooking(String Facility, String Station, String Title, String Sex, String FatherName, String M_Status,
			String Address, String City, String State, String Country, String Reference, String Bed)
			throws IOException, InterruptedException {

		/*CommanUtill.clickIfPresent(ClickIFPressent, "No Change Password Button");
		Thread.sleep(500);*/
		CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Module Button");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickBedBooking, "Clicked On The Bed Booking Link");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectTitle, Title);
		Thread.sleep(500);
		CommanUtill.textEnter(TextFirstName, CommanUtill.generateRandomName(10));
		Thread.sleep(500);
		CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(5));
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectSex, Sex);
		Thread.sleep(500);
		CommanUtill.textEnter(TextFatherName, FatherName);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectMaritalStatus, M_Status);
		Thread.sleep(500);
		CommanUtill.textEnter(TextAddress, Address);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectCity, City);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectState, State);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectCountry, Country);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectHowdoucametoKnow, Reference);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectBedType, Bed);
	}

	public void Consultant(String PSpeciality, String ReferredBy, String ReqBedType)
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(ClickConsultantTab, "Clicked on The Consultant Tab");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectPrimarySpecialist, PSpeciality);
		Thread.sleep(500);
		CommanUtill.textEnter(TextReferredBy, ReferredBy);
		Thread.sleep(500);
		CommanUtill.pressEnter(TextReferredBy);
		Thread.sleep(500);
		CommanUtill.pressEnter(TextReferredBy);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectRequestedBedType, ReqBedType);
		Thread.sleep(500);
	}

	public void BedandPaymentDetails(String RBTBPD) throws IOException, InterruptedException {
		CommanUtill.clickFunction(ClickBedandPyementsDetails, "Clicked on The Bed and Payment Details");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectRequestedBedTypeBPD, RBTBPD);
	}

	// ******************************************* SAVE BUTTON + UHID & WLNO EXTRACTION ****************************************//
	public void ClickSave() throws IOException, InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		CommanUtill.clickFunction(ClickSave, "Click on The Save Button");

		try {

			WebElement toastElement = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(toastXpath)));

			String toastMsg = toastElement.getText().trim();
			System.out.println("Toast Msg: " + toastMsg);

			String uhid = "";
			if (toastMsg.contains("UHID")) {
				try {
					uhid = toastMsg.split("UHID")[1].split(",")[0]
							.replace(":", "").trim();
				} catch (Exception e) {
					System.out.println("UHID parse error: " + e.getMessage());
				}
			}

			String wlno = "";
			if (toastMsg.contains("WL")) {
				try {
					wlno = toastMsg.split("WL")[1]
							.replace("No.", "")
							.replace(":", "")
							.trim();
				} catch (Exception e) {
					System.out.println("WLNO parse error: " + e.getMessage());
				}
			}

			STORED_UHID = uhid;
			STORED_WLNO = wlno;

			System.out.println("Stored UHID: " + STORED_UHID);
			System.out.println("Stored WLNO: " + STORED_WLNO);

		} catch (Exception e) {
			System.out.println("UHID & WLNO extraction failed: " + e.getMessage());
		}
	}
	
	public boolean verifyPopUpSuccess(WebDriver driver) {

	     logger.log(Status.INFO, "Started verification of  success message");
	     log.info("Started verification of success message");
	     System.out.println("▶ Started verification of success message");

	     try {
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	         By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p");
	         WebElement message = wait.until(
	                 ExpectedConditions.visibilityOfElementLocated(successMsg)
	         );

	         String msgText = message.getText().trim();

	         logger.log(Status.INFO, "Popup message displayed: " + msgText);
	         log.info("Popup message displayed: " + msgText);
	         System.out.println("ℹ Popup Message : " + msgText);

	         boolean isSuccess =
	                 msgText.contains("Patient registered successfully.");
	                      
	         if (isSuccess) {
	             logger.log(Status.PASS, "Patient registered successfully.");
	             log.info("Patient registered successfully. Message verified");
	             System.out.println("✅ Patient registered successfully.");
	         } else {
	             logger.log(Status.FAIL, "Unexpected success popup message: " + msgText);
	             log.error("Unexpected success popup message: " + msgText);
	             System.out.println("❌ Unexpected popup message");
	         }

	         return isSuccess;

	     } catch (TimeoutException e) {
	         logger.log(Status.FAIL, "Success popup not displayed within timeout");
	         log.error("Success popup not displayed within timeout", e);
	         System.out.println("❌ Success popup not displayed");       
	         Assert.fail("Success popup not displayed within timeout");
	         return false; 
	     }
	 }
	
	public void SurgeryRequest(String Bed, String ReqBedType, String RBTBPD) throws IOException, InterruptedException {
		CommanUtill.dropdownSelectByVisibleText(SelectBedType, Bed);
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickConsultantTab, "Clicked on The Consultant Tab");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectRequestedBedType, ReqBedType);
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickBedandPyementsDetails, "Clicked on The Bed and Payment Details");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectRequestedBedTypeBPD, RBTBPD);
	}
	
	public void Consultant1(String PSpeciality, String ReferredBy, String ReqBedType)
			throws IOException, InterruptedException {
        CommanUtill.textEnter(TextUHID1, ADT_Admit_Patient.GLOBAL_UHID);
        Thread.sleep(500);
        CommanUtill.pressEnter(TextUHID1);
        Thread.sleep(500);
		CommanUtill.clickFunction(ClickConsultantTab, "Clicked on The Consultant Tab");
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectPrimarySpecialist, PSpeciality);
		Thread.sleep(500);
		CommanUtill.textEnter(TextReferredBy, ReferredBy);
		Thread.sleep(500);
		CommanUtill.pressEnter(TextReferredBy);
		Thread.sleep(500);
		CommanUtill.pressEnter(TextReferredBy);
		Thread.sleep(500);
		CommanUtill.dropdownSelectByVisibleText(SelectRequestedBedType, ReqBedType);
		Thread.sleep(500);
	}
	
	public void UpdateBedBookingDetails() throws InterruptedException, IOException {
	
		CommanUtill.RefreshScreen();
		Thread.sleep(500);
		CommanUtill.textEnter(TextWLNO, STORED_WLNO);
		Thread.sleep(500);
		CommanUtill.pressEnter(TextWLNO);
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickModify, "Clicked on The Modify Button");
		Thread.sleep(500);
		CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(6));
		Thread.sleep(500);
		CommanUtill.clickFunction(ClickCopyAddress, "Clicked on The Copy Address CheckBox");
		Thread.sleep(500);
		CommanUtill.clickByJSFunction(ClickUpdateBtn, "Click on The Update Button");
	}

}