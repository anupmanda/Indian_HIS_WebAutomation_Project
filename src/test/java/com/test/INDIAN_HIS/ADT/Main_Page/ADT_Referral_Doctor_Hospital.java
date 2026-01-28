/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 5 Jan 2026
 */
public class   ADT_Referral_Doctor_Hospital extends GeneralBrowserSetting{
	
	String HospitalName = CommanUtill.generateRandomName(12);
	String MobileNo = CommanUtill.generateRandomMobileNumber();
	String PanNo = CommanUtill.generateRandomName(5) + CommanUtill.generateRandomMobileNumber6();
	String Email = CommanUtill.generateRandomName(12) + CommanUtill.generateRandomMobileNumber6() + "@gmail.com";
	
	String DoctorName = CommanUtill.generateRandomName(12);

	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";   
    protected static String SelectFacility = "//*[@id=\"Facility\"]";
    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickMaster = "//*[@id=\"masterid\"]/a";
    protected static String ClickReferralDoctor_Hospital = "//*[@id=\"demographicmaster\"]/a";

//**********************************************************************************************************************************
//***************************************** Hospital Mandatory************************************************************************
    protected static String TextHospitalName = "//*[@id=\"txtHospital\"]";
    protected static String TextHospitalAddress = "//*[@id=\"txtAddress\"]";
    protected static String SelectCity = "//*[@id=\"ddlCityTown\"]";
    protected static String SelectState = "//*[@id=\"ddlState\"]";
    protected static String SelectCountry = "//*[@id=\"ddlCountry\"]";
    protected static String TextMobileNo = "//*[@id=\"txtMobileNo\"]";
    protected static String TextTelephoneNo = "//*[@id=\"txtTelephone\"]";
    protected static String TextEmailId = "//*[@id=\"txtEmail\"]";
    protected static String SelectDoctorType = "//*[@id=\"ddlDoctorType\"]";
    protected static String ClickFacilityCheckBox = "//*[@id=\"_chkAll\"]";
    protected static String ClickSaveBTN = "//*[@id=\"btnSave\"]";
    protected static String ClickReferral = "//*[@id=\"chkFrom\"]";
   		
//**********************************************************************************************************************************
//***************************************** Hospital Non Mandatory************************************************************************

    protected static String TextAccountHolderName = "//*[@id=\"acholdername1\"]";
    protected static String TextAccountNumber = "//*[@id=\"accno1\"]";
    protected static String SelectBankName = "//*[@id=\"ddlbankname1\"]";
    protected static String TextBranchName = "//*[@id=\"branchname1\"]";
    protected static String TextIFSCCode = "//*[@id=\"ifsccode1\"]";
    protected static String TextGSTNumber = "//*[@id=\"gstno\"]";
    protected static String TextPanNo = "//*[@id=\"panno\"]";
    protected static String TextBankCity = "//*[@id=\"bankcity1\"]";
    protected static String TextBankAddress = "//*[@id=\"bankaddress1\"]";
    protected static String TextBankPostCode = "//*[@id=\"psbankcode1\"]";
    protected static String TextSearch = "//*[@id=\"txtHoSearch\"]";
    
 //**********************************************************************************************************************************
 //***************************************** Hospital Mandatory************************************************************************
    protected static String ClickDoctor = "//*[@id=\"liDoctor\"]"; 
    protected static String SelectTitle = "//*[@id=\"ddlTitle\"]";
    protected static String TextDoctorName = "//*[@id=\"txtName\"]";
    protected static String SelectSpeciality = "//*[@id=\"ddlSpeciality\"]";
    protected static String TextDoctorAddress = "//*[@id=\"txtAddress_1\"]";
    protected static String SelectCity_1 = "//*[@id=\"ddlCityTown_1\"]";
    protected static String SelectState_1 = "//*[@id=\"ddlState_1\"]";
    protected static String SelectCountry_1 = "//*[@id=\"ddlCountry_1\"]";
    protected static String TextStateRegn = "//*[@id=\"txtStateRegn\"]";
    protected static String TextHospital = "//*[@id=\"txtHospital_1\"]";
    protected static String TextMedicalRegn = "//*[@id=\"txtMedicalRegn\"]";
    protected static String TextTelephoneNo_1 = "//*[@id=\"txtTelephone_1\"]";
    protected static String TextMobileNo_1 = "//*[@id=\"txtMobileNo_1\"]";
    protected static String TextEailId_1 = "//*[@id=\"txtEmail_1\"]";
    protected static String ClickReferral_1 = "//*[@id=\"chkFrom_1\"]";
    protected static String CickFacility_1 = "//*[@id=\"_chkAll\"]";
    
//**********************************************************************************************************************************
//***************************************** Hospital Non Mandatory************************************************************************    

    protected static String TextAccountHolderName_1 = "//*[@id=\"acholdername\"]";
    protected static String TextAccountNo_1 = "//*[@id=\"accno\"]";
    protected static String SelectBankName_1 = "//*[@id=\"ddlbankname\"]";
    protected static String TextBranchName_1 ="//*[@id=\"branchname\"]";
    protected static String TextIFSC = "//*[@id=\"ifsccode\"]";
    protected static String TextPANNo = "//*[@id=\"panno1\"]";
    protected static String BankCity_1 ="//*[@id=\"bankcity\"]";    
    protected static String BankAddress_1 = "//*[@id=\"bankaddress\"]";
    protected static String TextBankPostCode_1 = "//*[@id=\"psbankcode\"]";
    protected static String TextQualification = "//*[@id=\"qualification\"]";
    protected static String TextSearch_1 = "//*[@id=\"txtDoSearch\"]";  
    
    
public void ReferralDoctor_Hospital(String Facility, String Station, String Address, String City, String State, String Country,
		String DoctorType) throws IOException, InterruptedException {
	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickMaster, "Click on The Master Link");
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickReferralDoctor_Hospital, "Click on The Referral Doctor Hospital Link");
	Thread.sleep(500);
	CommanUtill.switchToNewWindow(driver);
	Thread.sleep(500);
	CommanUtill.textEnter(TextHospitalName, HospitalName);
	Thread.sleep(500);
	CommanUtill.textEnter(TextHospitalAddress, Address);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectCity, City);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectState, State);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectCountry, Country);
	Thread.sleep(500);
	CommanUtill.textEnter(TextMobileNo, MobileNo);
	Thread.sleep(500);
	CommanUtill.textEnter(TextTelephoneNo, CommanUtill.generateRandomMobileNumber6());
	Thread.sleep(500);
	CommanUtill.textEnter(TextEmailId, Email);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectDoctorType, DoctorType);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickReferral, "Clicked on The Referral CheckBox");
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickFacilityCheckBox, "Clicked on The Facility CheckBox");
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickSaveBTN, "Clicked on The Save Button");
	Thread.sleep(500);
	verifyPOPUP(driver);
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("location.reload(true);");
    Thread.sleep(2000);
    CommanUtill.textEnter(TextSearch, HospitalName);
    Thread.sleep(500);
    CommanUtill.pressEnter(TextSearch);
    
	
}

   public void Referral_Doctor(String Facility, String Station, String Title, String Speciality, String Address, String City,
		  String State, String Country, String StateRegn, String Hospital, String MedicalGen ) throws IOException, InterruptedException {
	   
	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickMaster, "Click on The Master Link");
	Thread.sleep(500);
	CommanUtill.clickByJSFunction(ClickReferralDoctor_Hospital, "Click on The Referral Doctor Hospital Link");
	Thread.sleep(500);
	CommanUtill.switchToNewWindow(driver);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickDoctor, "Clicked on The Doctor Link");
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectTitle, Title);
	Thread.sleep(500);
	CommanUtill.textEnter(TextDoctorName, DoctorName);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectSpeciality, Speciality);
	Thread.sleep(500);
	CommanUtill.textEnter(TextDoctorAddress, Address);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectCity_1, City);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectState_1, State);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectCountry_1, Country);
	Thread.sleep(500);
	CommanUtill.textEnter(TextStateRegn, StateRegn);
	Thread.sleep(500);
	CommanUtill.textEnter(TextHospital, Hospital);
	Thread.sleep(500);
	CommanUtill.textEnter(TextMedicalRegn, MedicalGen);
	Thread.sleep(500);
	CommanUtill.textEnter(TextTelephoneNo_1, CommanUtill.generateRandomMobileNumber6());
	Thread.sleep(500);
	CommanUtill.textEnter(TextMobileNo_1, CommanUtill.generateRandomMobileNumber());
	Thread.sleep(500);
	CommanUtill.textEnter(TextEailId_1, Email);
	Thread.sleep(500);
    CommanUtill.clickFunction(ClickReferral_1, "Clicked on The Referral.......");
    Thread.sleep(500);
    CommanUtill.clickFunction(CickFacility_1, "Clicked on The Click Facility CheckBox...........");
    Thread.sleep(500);
    CommanUtill.clickFunction(ClickSaveBTN, "Clicked on The Save Button............");
    Thread.sleep(500);
	verifyPOPUP(driver);
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("location.reload(true);");
    Thread.sleep(500);
    CommanUtill.clickFunction(ClickDoctor, "Clicked on The Doctor Link");
    Thread.sleep(2000);
    CommanUtill.textEnter(TextSearch_1, DoctorName);
    Thread.sleep(500);
    CommanUtill.pressEnter(TextSearch_1);	
}

public boolean verifyPOPUP(WebDriver driver) {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By successMsg = By.xpath("//div[contains(@class,'gritter-item')]//p");             
        WebElement message =wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
        String msgText = message.getText().trim();
        System.out.println("Popup Message : " + msgText);
        return msgText.contains("Saved sucessfully !");
    } catch (TimeoutException e) {
        System.out.println("❌ Success popup not displayed");
        return false;
    }
}
}