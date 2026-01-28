/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 17 Dec 2025
 */
public class ADT_Surgery_Medical_Estimate extends GeneralBrowserSetting{
	
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	protected static String SelectFacility = "//*[@id=\"Facility\"]";
	protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
	protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
	protected static String ClickSurgeryMedicalEstimate = "//*[@id=\"lstMedicalEstimate\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    
    protected static String ClickMedical = "//*[@id=\"rd_medical\"]";
    protected static String ClickSurgical = "//*[@id=\"rd_surgical\"]";
    protected static String ClickPackage = "//*[@id=\"rd_Package\"]";
    
//************************************* ALL MANDATORY DETAILS ******************************************//
	protected static String TextFirstName = "//*[@id=\"f_name\"]";
	protected static String TextLastName = "//*[@id=\"l_name\"]";
	protected static String TextMobileNo = "//*[@id=\"copy_mobile\"]";
	protected static String ClickRadioBtnDOB = "//*[@id=\"chkdob\"]";
	protected static String TextDOB = "//*[@id=\"_dob\"]";
	protected static String ClickAgeRadioBTN = "//*[@id=\"chkage\"]";
	protected static String TextAge = "//*[@id=\"_age\"]";
	protected static String SelectGender = "//*[@id=\"_sex\"]";
	protected static String ClickSaveButton = "//*[@id=\"save_surgeryDetails\"]";
	protected static String ClickSaveButtonYes = "//*[@id=\"btnyes\"]";

// ****************************************************************************************************************// 
//************************************* MANDATORY FIELDS FOR MEDICAL **********************************************//
	
	protected static String SelectEstimateType = "//*[@id=\"EstType\"]";
	protected static String SelectBedType = "//*[@id=\"bedType\"]";
	protected static String TextNoofWardDays = "//*[@id=\"req_bed_days\"]";
	protected static String SelectPrimaryAttending = "//*[@id=\"physician_speciality\"]";
	protected static String SelectPrimaryConsultant = "//*[@id=\"physician_name\"]";
	protected static String TextVisitdays = "//*[@id=\"_primaryvistdays\"]";
	protected static String TextminimumDepositAmount = "//*[@id=\"min_req_amt\"]";
	protected static String TextProblem = "//*[@id=\"problem\"]";
	protected static String ClickSignature = "//*[@id=\"signbutton\"]";
	protected static String CLickCalculate = "//*[@id=\"cal_surgery\"]";
	protected static String ClickYesIfPresent = "//*[@id=\"btnyes_price\"]";
	protected static String ClickPrintAdmissionSlip = "//*[@id=\"ChkAdmissionSlip\"]";
	protected static String ClickPrintYes = "//*[@id=\"btnprint_yes\"]";
	
	protected static String ClickCreditRadioBtn = "//*[@id=\"rd_credit\"]";
	protected static String ClickCheckAll = "//*[@id=\"chk_allCom\"]";
	protected static String SelectRateContract = "//*[@id=\"rateContract\"]";
	
// ****************************************************************************************************************// 
//************************************* MANDATORY FIELDS FOR SURGICAL **********************************************//
	
	protected static String SelectSurgicalSpeciality = "//*[@id=\"surgical_speciality\"]";
	protected static String SelectSurgery = "//*[@id=\"surgery\"]";
	protected static String ClickTRCharges = "//*[@id=\"tr_charges\"]";
	protected static String ClickOTCharges = "//*[@id=\"ot_charges\"]";
	protected static String SelectOTDurationCharges = "//*[@id=\"drdOTChargeDuration\"]";
	protected static String SelectSurgeonSpeciality = "//*[@id=\"surgeon_speciality\"]";
	protected static String SelectSurgeon = "//*[@id=\"surgeon\"]";
	protected static String SelectAnesthesia = "//*[@id=\"anesthesia\"]";
	
	
	protected static String ClickGasCharges = "//*[@id=\"gas_charges\"]";
	protected static String ClickHighRiskCharges = "//*[@id=\"risk_charges\"]";
	protected static String ClickEmergencyCharges = "//*[@id=\"emerr_charges\"]";
	protected static String ClickNursingCharges = "//*[@id=\"Nursing_Fee_charges\"]";
	protected static String SelectAnesthetist = "//*[@id=\"anesthetist\"]";
	protected static String SelectStandName = "//*[@id=\"standby_name\"]";
	protected static String SelectEquipment = "//*[@id=\"equipment\"]";
	protected static String SelectAssitSurgeonSpeciality = "//*[@id=\"_AssSurgeonSpeciality\"]";
	protected static String SelectAssistantSurgeon = "//*[@id=\"_AssSurgeon\"]";
	protected static String ClickDrugCharges = "//*[@id=\"_checkdrug\"]";
	protected static String ClickInvestigationCharges = "//*[@id=\"_checkInvestigation\"]";
	protected static String ClickConsumables = "//*[@id=\"_checkConsumable\"]";
	protected static String TextOtherItem = "//*[@id=\"otherItem1\"]";
	protected static String TextOtherItemAmount = "//*[@id=\"otherItem1_amt\"]";
	protected static String ClickAddButton = "//*[@id=\"_btnaddotheriteam\"]";
	protected static String SelectServices = "//*[@id=\"service\"]";
	protected static String SelectItem = "//*[@id=\"items\"]";
	protected static String TextItemQuantity = "//*[@id=\"qty\"]";
	protected static String ClickServiceItemAddBtn = "//*[@id=\"_btnaddserviceiteam\"]";
	
	
	   
// *************************************************************************************************************// 
//************************************* ALL Non MANDATORY DETAILS **********************************************//
	
	protected static String MiddleName = "//*[@id=\"m_name\"]";
	
// *************************************************************************************************************// 
	
    public void MedicalEstimateCash(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String PrimaryAttending, String PrimaryConsultant, String VisitDays,String DepositAmount, String Problem) throws IOException, InterruptedException {
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
         
         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
         
         CommanUtill.clickByJSFunction(ClickSurgeryMedicalEstimate,"Clicked on The Surgery/Medical Estimate Link");
         
      /*   String parentWindow = driver.getWindowHandle();
         Set<String> allWindows = driver.getWindowHandles();

         for (String window : allWindows) {
             if (!window.equals(parentWindow)) {
                 driver.switchTo().window(window);
                 break;
             }
         }*/
         CommanUtill.switchToNewWindow(driver);
         
         CommanUtill.clickFunction(ClickMedical, "Clicked on The Medical Radio Button.......");
         
         CommanUtill.textEnter(TextFirstName, CommanUtill.generateRandomName(11));
         
         CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(8));
         
         CommanUtill.textEnter(TextMobileNo, CommanUtill.generateRandomMobileNumber());
         
         CommanUtill.textEnter(TextDOB, DOB);
         
         CommanUtill.pressEnter(TextDOB);
         
         CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
         
         CommanUtill.dropdownSelectByVisibleText(SelectEstimateType, EstimateType);
         
         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
         
         CommanUtill.textEnter(TextNoofWardDays, WardDays);
         
         CommanUtill.dropdownSelectByVisibleText(SelectPrimaryAttending, PrimaryAttending);
         
         CommanUtill.dropdownSelectByVisibleText(SelectPrimaryConsultant, PrimaryConsultant);
         
         CommanUtill.textEnter(TextVisitdays, VisitDays);
         
         CommanUtill.textEnter(TextminimumDepositAmount, DepositAmount);
         
         CommanUtill.textEnter(TextProblem, Problem);
         
         CommanUtill.clickByJSFunction(ClickSignature, "Clicked on The Signature Icon");
}
    
    public void MedicalEstimateCredit(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String PrimaryAttending, String PrimaryConsultant, String VisitDays, String RateContract, String DepositAmount, String Problem) throws IOException, InterruptedException {
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
         
         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
         
         CommanUtill.clickByJSFunction(ClickSurgeryMedicalEstimate,"Clicked on The Surgery/Medical Estimate Link");
         
      /*   String parentWindow = driver.getWindowHandle();
         Set<String> allWindows = driver.getWindowHandles();

         for (String window : allWindows) {
             if (!window.equals(parentWindow)) {
                 driver.switchTo().window(window);
                 break;
             }
         }*/
         CommanUtill.switchToNewWindow(driver);
         
         CommanUtill.clickFunction(ClickMedical, "Clicked on The Medical Radio Button.......");
         
         CommanUtill.textEnter(TextFirstName, CommanUtill.generateRandomName(11));
         
         CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(8));
         
         CommanUtill.textEnter(TextMobileNo, CommanUtill.generateRandomMobileNumber());
         
         CommanUtill.textEnter(TextDOB, DOB);
         
         CommanUtill.pressEnter(TextDOB);
         
         CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
         
         CommanUtill.dropdownSelectByVisibleText(SelectEstimateType, EstimateType);
         
         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
         
         CommanUtill.textEnter(TextNoofWardDays, WardDays);
         
         CommanUtill.dropdownSelectByVisibleText(SelectPrimaryAttending, PrimaryAttending);
         
         CommanUtill.dropdownSelectByVisibleText(SelectPrimaryConsultant, PrimaryConsultant);
         
         CommanUtill.textEnter(TextVisitdays, VisitDays);
         
         CommanUtill.clickFunction(ClickCreditRadioBtn, "Clicked on The Credit Radio Button.......");
         
         CommanUtill.clickByJSFunction(ClickCheckAll, "Clicked on The All CheckBox.......");
         
         CommanUtill.dropdownSelectByVisibleText(SelectRateContract, RateContract);
         
         CommanUtill.textEnter(TextminimumDepositAmount, DepositAmount);
         
         CommanUtill.textEnter(TextProblem, Problem);
         
         CommanUtill.clickByJSFunction(ClickSignature, "Clicked on The Signature Icon");
}

    public void drawSignatureAndSave(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                    By.xpath("//iframe[contains(@class,'surgery_sign')]")
            ));

            WebElement canvas = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("myCanvas"))
            );

            Actions actions = new Actions(driver);
            actions.moveToElement(canvas, 120, 150)
                    .clickAndHold()
                 
                    .moveByOffset(40, -30)
                    .moveByOffset(40, 30)
                    .moveByOffset(-20, -15)
                 
                    .moveByOffset(40, 0)
                    .moveByOffset(20, -20)
                    .moveByOffset(-20, -20)
                    .moveByOffset(20, -20)
               
                    .moveByOffset(40, 40)
                    .moveByOffset(0, -40)
                    .moveByOffset(0, 20)
                    .moveByOffset(25, 0)
                    .moveByOffset(0, -20)
                 
                    .moveByOffset(40, 20)
                    .moveByOffset(0, 20)
                    .moveByOffset(30, 0)
                    .moveByOffset(0, -20)
                    .release()
                    .perform();

            driver.switchTo().defaultContent();
            
            WebElement saveBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//*[@id=\"popup800\"]/div/span[1]/a")
                    )
            );
            
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
            
            CommanUtill.clickByJSFunction(CLickCalculate, "Clicked on The Calculate Button");
            
            CommanUtill.clickByJSFunction(ClickSaveButton, "Clicked on The Save Button......"); 
            
            CommanUtill.clickByJSFunction(ClickSaveButtonYes, "Clicked on The Save Button Yes......");
          /*  
            CommanUtill.clickIfPresent(ClickIFPressent, "Clicked If Present..........");*/
            
            CommanUtill.clickByJSFunction(ClickPrintAdmissionSlip, "Clicked on The Print Admission Slip CheckBox......");
            
            CommanUtill.clickByJSFunction(ClickPrintYes, "Clicked on The Print Yes Button.......");
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException("Signature drawing or Save failed", e);
        }
    }
    
    public void SurgicalEstimateCash(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String SurgicalSpeciality, String Surgery, String OTDuration, String SurgeonSpeciality, String Surgeon, String Anesthesia,
    		String DepositAmount, String Problem ) throws IOException, InterruptedException {
    
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
         
         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
         
         CommanUtill.clickByJSFunction(ClickSurgeryMedicalEstimate,"Clicked on The Surgery/Medical Estimate Link");
         
         CommanUtill.switchToNewWindow(driver);
         
         CommanUtill.textEnter(TextFirstName, CommanUtill.generateRandomName(11));
         
         CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(8));
         
         CommanUtill.textEnter(TextMobileNo, CommanUtill.generateRandomMobileNumber());
         
         CommanUtill.textEnter(TextDOB, DOB);
         
         CommanUtill.pressEnter(TextDOB);
         
         CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
         
         CommanUtill.clickFunction(ClickSurgical, "Clicked on The Surgical Radio Button");
         
         
         CommanUtill.dropdownSelectByVisibleText(SelectEstimateType, EstimateType);
         
         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
         
         CommanUtill.textEnter(TextNoofWardDays, WardDays);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgicalSpeciality, SurgicalSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgery, Surgery);
         
         CommanUtill.clickFunction(ClickOTCharges, "Clicked on The OT Charges Radio Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectOTDurationCharges, OTDuration);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeonSpeciality, SurgeonSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeon, Surgeon);
         
         CommanUtill.dropdownSelectByVisibleText(SelectAnesthesia, Anesthesia);
         
         CommanUtill.textEnter(TextminimumDepositAmount, DepositAmount);
         
         CommanUtill.textEnter(TextProblem, Problem);
         
         CommanUtill.clickByJSFunction(ClickSignature, "Clicked on The Signature Icon");
    }
    
    public void SurgicalEstimateCredit(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String SurgicalSpeciality, String Surgery, String OTDuration, String SurgeonSpeciality, String Surgeon, String Anesthesia,
    		String RateContract,String DepositAmount, String Problem ) throws IOException, InterruptedException {
    
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
         
         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
         
         CommanUtill.clickByJSFunction(ClickSurgeryMedicalEstimate,"Clicked on The Surgery/Medical Estimate Link");
         
         CommanUtill.switchToNewWindow(driver);
         
         CommanUtill.textEnter(TextFirstName, CommanUtill.generateRandomName(11));
         
         CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(8));
         
         CommanUtill.textEnter(TextMobileNo, CommanUtill.generateRandomMobileNumber());
         
         CommanUtill.textEnter(TextDOB, DOB);
         
         CommanUtill.pressEnter(TextDOB);
         
         CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
         
         CommanUtill.clickFunction(ClickSurgical, "Clicked on The Surgical Radio Button");
         
         
         CommanUtill.dropdownSelectByVisibleText(SelectEstimateType, EstimateType);
         
         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
         
         CommanUtill.textEnter(TextNoofWardDays, WardDays);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgicalSpeciality, SurgicalSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgery, Surgery);
         
         CommanUtill.clickFunction(ClickOTCharges, "Clicked on The OT Charges Radio Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectOTDurationCharges, OTDuration);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeonSpeciality, SurgeonSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeon, Surgeon);
         
         CommanUtill.dropdownSelectByVisibleText(SelectAnesthesia, Anesthesia);
         
         CommanUtill.clickFunction(ClickCreditRadioBtn, "Clicked on The Credit Radio Button.......");
         
         CommanUtill.clickByJSFunction(ClickCheckAll, "Clicked on The All CheckBox.......");
         
         CommanUtill.dropdownSelectByVisibleText(SelectRateContract, RateContract);
         
         CommanUtill.textEnter(TextminimumDepositAmount, DepositAmount);
         
         CommanUtill.textEnter(TextProblem, Problem);
         
         CommanUtill.clickByJSFunction(ClickSignature, "Clicked on The Signature Icon");
    }
    
    
    public void PackageEstimateCash(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String SurgicalSpeciality, String Surgery, String OTDuration, String SurgeonSpeciality, String Surgeon, String Anesthesia,
    		String DepositAmount, String Problem, String Services, String Item, String ItemQuantity) throws IOException, InterruptedException {
    
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
         
         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
         
         CommanUtill.clickByJSFunction(ClickSurgeryMedicalEstimate,"Clicked on The Surgery/Medical Estimate Link");
         
         CommanUtill.switchToNewWindow(driver);
         
         CommanUtill.textEnter(TextFirstName, CommanUtill.generateRandomName(11));
         
         CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(8));
         
         CommanUtill.textEnter(TextMobileNo, CommanUtill.generateRandomMobileNumber());
         
         CommanUtill.textEnter(TextDOB, DOB);
         
         CommanUtill.pressEnter(TextDOB);
         
         CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
         
         CommanUtill.clickFunction(ClickPackage, "Clicked on The Package Radio Button.......");
         
         
         CommanUtill.dropdownSelectByVisibleText(SelectEstimateType, EstimateType);
         
         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
         
         CommanUtill.textEnter(TextNoofWardDays, WardDays);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgicalSpeciality, SurgicalSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgery, Surgery);
         
         CommanUtill.clickFunction(ClickOTCharges, "Clicked on The OT Charges Radio Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectOTDurationCharges, OTDuration);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeonSpeciality, SurgeonSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeon, Surgeon);
         
         CommanUtill.dropdownSelectByVisibleText(SelectAnesthesia, Anesthesia);
         
         CommanUtill.textEnter(TextminimumDepositAmount, DepositAmount);
         
         CommanUtill.textEnter(TextProblem, Problem);
         
         CommanUtill.dropdownSelectByVisibleText(SelectServices, Services);
         
         CommanUtill.dropdownSelectByVisibleText(SelectItem, Item);
         
         CommanUtill.textEnter(TextItemQuantity, ItemQuantity);
         
         CommanUtill.clickByJSFunction(ClickServiceItemAddBtn, "Clicked on The Add Button");
         
         CommanUtill.clickByJSFunction(ClickSignature, "Clicked on The Signature Icon");
    }

    public void PackageEstimateCredit(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String SurgicalSpeciality, String Surgery, String OTDuration, String SurgeonSpeciality, String Surgeon, String Anesthesia,
    		String RateContract,String DepositAmount, String Problem, String Services, String Item, String ItemQuantity) throws IOException, InterruptedException {
    
    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
         
         CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
         
         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
         
         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
         
         CommanUtill.clickByJSFunction(ClickSurgeryMedicalEstimate,"Clicked on The Surgery/Medical Estimate Link");
         
         CommanUtill.switchToNewWindow(driver);
         
         CommanUtill.textEnter(TextFirstName, CommanUtill.generateRandomName(11));
         
         CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(8));
         
         CommanUtill.textEnter(TextMobileNo, CommanUtill.generateRandomMobileNumber());
         
         CommanUtill.textEnter(TextDOB, DOB);
         
         CommanUtill.pressEnter(TextDOB);
         
         CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
         
         CommanUtill.clickFunction(ClickPackage, "Clicked on The Package Radio Button.......");
         
         
         CommanUtill.dropdownSelectByVisibleText(SelectEstimateType, EstimateType);
         
         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
         
         CommanUtill.textEnter(TextNoofWardDays, WardDays);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgicalSpeciality, SurgicalSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgery, Surgery);
         
         CommanUtill.clickFunction(ClickOTCharges, "Clicked on The OT Charges Radio Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectOTDurationCharges, OTDuration);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeonSpeciality, SurgeonSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeon, Surgeon);
         
         CommanUtill.dropdownSelectByVisibleText(SelectAnesthesia, Anesthesia);
         
         CommanUtill.clickFunction(ClickCreditRadioBtn, "Clicked on The Credit Radio Button.......");
         
         CommanUtill.clickByJSFunction(ClickCheckAll, "Clicked on The All CheckBox.......");
         
         CommanUtill.dropdownSelectByVisibleText(SelectRateContract, RateContract);
         
         CommanUtill.textEnter(TextminimumDepositAmount, DepositAmount);
         
         CommanUtill.textEnter(TextProblem, Problem);
         
         CommanUtill.dropdownSelectByVisibleText(SelectServices, Services);
         
         CommanUtill.dropdownSelectByVisibleText(SelectItem, Item);
         
         CommanUtill.textEnter(TextItemQuantity, ItemQuantity);
         
         CommanUtill.clickByJSFunction(ClickServiceItemAddBtn, "Clicked on The Add Button");
         
         CommanUtill.clickByJSFunction(ClickSignature, "Clicked on The Signature Icon");
    }

    
    public void SurgicalEstimateCashPre_Auth(String Facility, String Station, String DOB, String Gender, String EstimateType, String BedType, String WardDays,
    		String SurgicalSpeciality, String Surgery, String OTDuration, String SurgeonSpeciality, String Surgeon, String Anesthesia,
    		String DepositAmount, String Problem ) throws IOException, InterruptedException {
    
         CommanUtill.clickFunction(ClickSurgical, "Clicked on The Surgical Radio Button");
         
         
         CommanUtill.dropdownSelectByVisibleText(SelectEstimateType, EstimateType);
         
         CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
         
         CommanUtill.textEnter(TextNoofWardDays, WardDays);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgicalSpeciality, SurgicalSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgery, Surgery);
         
         CommanUtill.clickFunction(ClickOTCharges, "Clicked on The OT Charges Radio Button");
         
         CommanUtill.dropdownSelectByVisibleText(SelectOTDurationCharges, OTDuration);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeonSpeciality, SurgeonSpeciality);
         
         CommanUtill.dropdownSelectByVisibleText(SelectSurgeon, Surgeon);
         
         CommanUtill.dropdownSelectByVisibleText(SelectAnesthesia, Anesthesia);
         
         CommanUtill.textEnter(TextminimumDepositAmount, DepositAmount);
         
         CommanUtill.textEnter(TextProblem, Problem);
         
         CommanUtill.clickByJSFunction(ClickSignature, "Clicked on The Signature Icon");
         
         drawSignatureAndSave(driver);
         
    }
    
    public void CalculateandSave() throws IOException, InterruptedException {
    	 CommanUtill.clickByJSFunction(CLickCalculate, "Clicked on The Calculate Button");
         
         CommanUtill.clickByJSFunction(ClickSaveButton, "Clicked on The Save Button......");
         
         CommanUtill.clickByJSFunction(ClickSaveButtonYes, "Clicked on The Save Button Yes......");     
         
         CommanUtill.clickByJSFunction(ClickPrintAdmissionSlip, "Clicked on The Print Admission Slip CheckBox......");
         
         CommanUtill.clickByJSFunction(ClickPrintYes, "Clicked on The Print Yes Button.......");
         Thread.sleep(5000);
    }
}