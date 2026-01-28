/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 27 Nov 2025
 */  
public class ADT_Admit_Patient extends GeneralBrowserSetting{
	
	public static String GLOBAL_UHID = "";
	public static String GLOBAL_IPNO = "";

	
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	protected static String SelectFacility = "//*[@id=\"Facility\"]";
	protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
    protected static String ClickAdmitPatient = "//*[@href = \"/sanitywebhistree/ADT/AdmitPatient/AdmitPatient?UHID=0\"]";
    protected static String ClickSave1 = "//*[@id=\"btnAcceptYes\"]";
    protected static String ClickFaceSheetRadioBtn = "//*[@id=\"facesheet\"]";
    protected static String ClickPrint = "//*[@id=\"btnprint\"]";
    protected static String ClickUpdateBTN = "//*[@id=\"updateitem\"]";
    
    
    //************************************* ALL MANDATORY DETAILS ******************************************//
    protected static String TextIPNO = "//*[@id=\"text_ipid\"]";
    protected static String SelectTitle = "//*[@id=\"_title\"]";
    protected static String TextFirstName = "//*[@id=\"f_name\"]";
    protected static String SelectGender = "//*[@id=\"_sex\"]";
    protected static String TextDOB = "//*[@id=\"_dob\"]";
    protected static String TextFatherName = "//*[@id=\"fs_name\"]";
    protected static String SelectMStatus = "//*[@id=\"M_status\"]";
    protected static String TextAddress = "//*[@id=\"_address\"]";
    protected static String SelectCIty = "//*[@id=\"_city\"]";
    protected static String SelectNationality = "//*[@id=\"_nationality\"]";
    protected static String ClickSave = "//*[@id=\"saveitem\"]";
                                  // Consultant//
    protected static String ClickConsultant = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[2]/a";
    protected static String SelecAdmittingDoctorSPeciality = "//*[@id=\"AD_specility\"]";
    protected static String SelectPrimarySpeciality = "//*[@id=\"Primary_speciality\"]";
    protected static String AdmittingConsultant = "//*[@id=\"_admittingConsultant\"]";
    protected static String SelectAttendingConsultant = "//*[@id=\"_primaryAttendingconsultant\"]";
    protected static String TextReferredBy = "//*[@id=\"_refBY\"]";
    protected static String TextLengthofStay = "//*[@id=\"Expected_stay\"]";
    protected static String SelectSourceofAdmission = "//*[@id=\"_Admission\"]";
                               // Bed&PaymentsDetails //
    protected static String ClickBedPaymentDetails = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[3]/a";
    protected static String SelectBedType = "//*[@id=\"Req_bedtype\"]";
    protected static String SelectBillableBedType = "//*[@id=\"billtype\"]";
    protected static String SelectAllotedBedType = "//*[@id=\"All_type\"]";
    protected static String SelectWardType = "//*[@id=\"ward_type\"]";
    protected static String SelectBed = "//*[@id=\"bed_type\"]";
                              // Package Details //
    protected static String ClickPackageDetails = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[4]/a";
    protected static String SelectPackageFacility = "//*[@id=\"_packagedetails_speciality\"]";
    protected static String SelectDoctor = "//*[@id=\"packagedetails_doctor\"]";
    protected static String TextPackageName = "//*[@id=\"packagedetails_packageanamedropdown\"]";
    protected static String SelectPackage = "//*[@id=\"packagedetails_packagename\"]";
    protected static String ClickAddButton = "//*[@id=\"addrowdata\"]";
                                      // Next of KIN Details //
    protected static String ClickNextofKINDetails = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[5]/a";
    protected static String TextKINName = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[1]/fieldset/div[1]/span[1]/input";
    protected static String SelectRelation = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[1]/fieldset/div[1]/span[2]/select";
    protected static String EmergencyName = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[2]/fieldset[1]/div/span[1]/input";
    protected static String EmergencyPhoneNumber = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[2]/fieldset[1]/div/span[2]/input";
    protected static String SelectBillingCouncelling = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[2]/fieldset[2]/div/span[1]/input";
    protected static String SelectClinicalCouncelling = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[2]/fieldset[2]/div/span[2]/input";
    protected static String ClickCopyAddress = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[1]/fieldset/div[2]/span/input";
                                            // Ambulance Information //
    protected static String ClickonAmbulanceInformation = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[6]/a";
                                                 //MLC Details //
    protected static String ClickMLCDetails = "//*[@id=\"_admitPatientform\"]/div[4]/ul/li[7]/a";
    protected static String ClickMedicoLegalCase = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[1]/span[1]/input";
    protected static String ClickOutsideMLC = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[1]/span[2]/input";
    protected static String TextMLCNumber = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[2]/span[1]/input";
    protected static String SelectMLCType = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[2]/span[2]/select";
    protected static String TextBroughtBy = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[2]/span[4]/input";
    protected static String SelectTransport = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[2]/span[5]/select";
    protected static String TextPlaceofAccident = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[2]/span[6]/input";
    
    protected static String CLickHomePage  = "//*[@id=\"body_clickable\"]/div[1]/div[1]/a[1]/img";
    
  // *************************************************************************************************************// 
    //************************************* ALL Non MANDATORY DETAILS ******************************************//
    
    protected static String TextMiddleName = "//*[@id=\"m_name\"]";
    protected static String TextLastName = "//*[@id=\"l_name\"]";
    protected static String TextPostCode = "//*[@id=\"PostalCode\"]";
    protected static String SelectLocality = "//*[@id=\"_locality\"]";
    protected static String TextPhoneNumber = "//*[@id=\"_phone\"]";
    protected static String TextCountryCode = "//*[@id=\"CountryCode\"]";
    protected static String TextMobileNumber = "//*[@id=\"_mobile\"]";
    protected static String TextEmailID = "//*[@id=\"_email\"]";
    protected static String SelectReligion = "//*[@id=\"_religion\"]";
    protected static String SelectOccupation = "//*[@id=\"_occupation\"]";
    protected static String TextMonthlyIncome = "//*[@id=\"monthly_income\"]";
    protected static String SelectCategory = "//*[@id=\"category\"]";
    protected static String SelectEducation = "//*[@id=\"_education\"]";
    protected static String TextMotherName = "//*[@id=\"_mother_name\"]";
    protected static String SelectPreferredLanguage = "//*[@id=\"_prefereredlang\"]";
    protected static String TextLinkDonorID = "//*[@id=\"donor_ip\"]";
    protected static String TextDIGPIN = "//*[@id=\"txtDig\"]"; //*[@id="txtDig"]
    protected static String ClickCopyAddressCheckBox = "//*[@id=\"copy_address\"]";
    protected static String SelectSource = "//*[@id=\"_hdyoctkau\"]";
    protected static String SelectSubSource = "//*[@id=\"_Subsource\"]";
    protected static String SelectOtherSubSource = "//*[@id=\"txtOtherSS\"]";
    protected static String ClickNRICheckBox = "//*[@id=\"nrichk_admit\"]";
    protected static String ClickVIPCheckBox = "//*[@id=\"vipcheck\"]";
    protected static String TextVIPComment = "//*[@id=\"viptext\"]";
                                // Consultant//
    protected static String SelectAdmittingDoctorUnit = "//*[@id=\"unitdoc\"]";
    protected static String SelectCoSpeciality = "//*[@id=\"_cospecilty\"]";
    protected static String SelectSecondarySpeciality = "//*[@id=\"_secondaryspeciality\"]";
    protected static String SelectSecondaryConsultant = "//*[@id=\"secondaryConsultant\"]";
    protected static String SelectAdmissionType = "//*[@id=\"_admission_type\"]";
    protected static String SelectDietPreference = "//*[@id=\"41\"]";
    protected static String SelectDietPreference1 = "//*[@id=\"47\"]";
    protected static String SelectDietPreference2 = "//*[@id=\"38\"]";
    protected static String SelectInfectiousPatient = "//*[@id=\"_Infectious\"]";
    protected static String ClickVulnerableCheckBox = "//*[@id=\"chk_Vulnerable\"]";
    protected static String TextVulnerable = "//*[@id=\"_vulnerable\"]";
    protected static String ClickCheckBoxHandleCare = "//*[@id=\"chk_Handle\"]";
    protected static String TextHandlewithCare = "//*[@id=\"Handle_With_Care\"]";
                                 // Bed&PaymentsDetails //
    protected static String ClickTestCheckBox1 = "//*[@id=\"chktoc\"]";
    protected static String ClickTestCheckBox2 = "//*[@id=\"chktocIp\"]";
    protected static String ClickTestCheckBox3 = "//*[@id=\"chktocOS\"]";
    protected static String ClickTestCheckBox4 = "//*[@id=\"_MRDFile\"]";
    protected static String ClickTestCheckBox5 = "//*[@id=\"_isInfectious\"]";
    protected static String ClickTestCheckBox6 = "//*[@id=\"_isDepartment\"]";
    protected static String ClickTestRadioBtn1 = "//*[@id=\"btnItemWiseLimit\"]";
    protected static String ClickTestRadioBtn2 = "//*[@id=\"btnEpisodeWiseLimit\"]";
    protected static String SelectWard = "//*[@id=\"ward_type\"]";
                                //Cash/CreditType
    protected static String ClickCashRadioButton = "//*[@id=\"cashtype\"]";
    protected static String ClickCreditRadioButton = "//*[@id=\"_comInsurancetype\"]";
    protected static String SelectCompanyType = "//*[@id=\"comp_type\"]";
    protected static String SelectCompany = "//*[@id=\"_company\"]";
    protected static String SelectRateContract = "//*[@id=\"_ratecontract\"]";
    protected static String ClickAllowPharmacy = "//*[@id=\"chknonpayble\"]";
    protected static String TextPolicyNumber = "//*[@id=\"policy_type\"]";
    protected static String TextClaimNumber = "//*[@id=\"AuthorizationNo\"]";
    protected static String TextLetterNo = "//*[@id=\"_letterNo\"]";
    protected static String TextLetterDate = "//*[@id=\"letterdate\"]";
    protected static String SelectEntitkedBedType = "//*[@id=\"_EntitledBedType\"]";
    protected static String TextPerDay = "//*[@id=\"paerday\"]";
    protected static String ClickSchemeCheckbox = "//*[@id=\"_schme\"]";
    protected static String SelectSchemeType = "//*[@id=\"_scgmetype\"]";
    protected static String SelectCorporateCompany = "//*[@id=\"corporateCompany\"]";
    protected static String SelectInsuranceCompany = "//*[@id=\"InsuranceCompany\"]";
    protected static String TextAuthAmount = "//*[@id=\"_AuthAmount\"]";
    protected static String TextEmployeeCode = "//*[@id=\"lblEmployeeCode\"]";
    protected static String TextEMployeeCodeName = "//*[@id=\"employeecodename\"]";
    protected static String TextEmployeeNumber = "//*[@id=\"txtempnumber\"]";
    protected static String TextCertificateNumber = "//*[@id=\"txtcertificatenumber\"]";
    protected static String TextIssuedBy = "//*[@id=\"_issuedate\"]";
    protected static String TextBenificiaryName = "//*[@id=\"Beneficiary_Name\"]";
                                      // Next of KIN Details //
    protected static String TextTranslatorName = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[3]/fieldset/div[1]/span[1]/input";
    protected static String TextTranslatorPhone = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[3]/fieldset/div[1]/span[2]/input";
    protected static String TextRemarks = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[3]/fieldset/div[2]/span/textarea";
    protected static String ClickTranslatorCopyDetailsCheckBox = "/html/body/div[6]/div[1]/form/div[4]/div/div[5]/div/div[3]/fieldset/div[3]/span/input";
                                       // Ambulance Information //
    protected static String TextDriverName = "/html/body/div[6]/div[1]/form/div[4]/div/div[6]/fieldset/div/span[1]/input";
    protected static String TextDriverMobileNumber = "/html/body/div[6]/div[1]/form/div[4]/div/div[6]/fieldset/div/span[2]/input";
    protected static String TextAmbulanceNumber = "/html/body/div[6]/div[1]/form/div[4]/div/div[6]/fieldset/div/span[3]/input";
    protected static String TextOtherDetails = "/html/body/div[6]/div[1]/form/div[4]/div/div[6]/div/span/textarea";
                                              //MLC Details //
    protected static String SelectInjuryType = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[2]/span[3]/select";
    protected static String TextPoliceStation = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[3]/span[1]/input";
    protected static String TextOfficerName = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[3]/span[2]/input";
    protected static String TextComplaientNumber = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[3]/span[4]/input";
    protected static String TextBuckleNOofPolice = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/fieldset/div[3]/span[5]/input";
    protected static String TextCauseofAccident = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/div/span[1]/textarea";
    protected static String TextIdentificationMarks= "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/div/span[2]/textarea";
    protected static String TextReamrks = "/html/body/div[6]/div[1]/form/div[4]/div/div[7]/div/span[3]/textarea";
    
    
    protected static String ClickModify = "//*[@id=\"modify\"]";
    
  // *************************************************************************************************************// 
    
    public void ClickHomePage() throws IOException, InterruptedException {
    	Thread.sleep(3000);
	  CommanUtill.clickByJSFunction(CLickHomePage, "Clicked on The HomePage");
    }
    public void AdmitPatient(String Facility, String Station, String Title, String Gender, String DOB, String FatherName, String M_Status,
    		String Address, String City, String Nationality, String ABCPin) throws IOException, InterruptedException {
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
    	CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked On The Admit Patient Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmitPatient, "Clicked on The Admit Patient");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectTitle, Title);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextFirstName,  CommanUtill.generateRandomName(10));
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextDOB, DOB);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextFatherName, FatherName);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectMStatus, M_Status);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextAddress, Address);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectCIty, City);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextDIGPIN, ABCPin);
    	//CommanUtill.dropdownSelectByVisibleText(SelectNationality, Nationality);
    }
    
    public void BedStatusAdmitPatient( String Title, String Gender, String DOB, String FatherName, String M_Status,
    		String Address, String City, String Nationality, String ABCPin) throws IOException, InterruptedException {
    	/*CommanUtill.clickIfPresent(ClickIFPressent, "No Change Password Button");
    	Thread.sleep(500);*/
    	/*CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Module Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked On The Admit Patient Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmitPatient, "Clicked on The Admit Patient");
    	Thread.sleep(500);*/
    	CommanUtill.dropdownSelectByVisibleText(SelectTitle, Title);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextFirstName,  CommanUtill.generateRandomName(10));
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectGender, Gender);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextDOB, DOB);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextFatherName, FatherName);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectMStatus, M_Status);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextAddress, Address);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectCIty, City);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextDIGPIN, ABCPin);
    	//CommanUtill.dropdownSelectByVisibleText(SelectNationality, Nationality);
    }
    
    public void Consultant(String Speciality, String Referred , String Stay, String Source) throws IOException, InterruptedException {
    	CommanUtill.clickFunction(ClickConsultant, "Click on The Consultant");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelecAdmittingDoctorSPeciality, Speciality);
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextReferredBy, Referred);
    	Thread.sleep(500);
    	CommanUtill.pressEnter(TextReferredBy);
    	Thread.sleep(500);
    	CommanUtill.pressEnter(TextReferredBy);
    	Thread.sleep(500);
    	CommanUtill.clearTextField(TextLengthofStay, "TextField Will Be Cleared");
      	Thread.sleep(500);
      //	CommanUtill.textEnter(TextLengthofStay, "5");
    	CommanUtill.textEnter(TextLengthofStay, Stay);
      	Thread.sleep(500);
      	CommanUtill.dropdownSelectByVisibleText(SelectSourceofAdmission, Source);
      	Thread.sleep(500);
      	CommanUtill.clickFunction(ClickVulnerableCheckBox, "Click on The Vulnerable CheckBox");
    }
    
    

    public void BedandPaymentDetails(String BedType, String Ward) throws IOException, InterruptedException {
    	CommanUtill.clickFunction(ClickBedPaymentDetails, "Clicked on The Bed and Payments Details");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);
    }
    
    public void BedandPaymentDetailsAdmitPatient() throws IOException, InterruptedException {
    	CommanUtill.clickFunction(ClickBedPaymentDetails, "Clicked on The Bed and Payments Details");
    	Thread.sleep(500);
    	/*CommanUtill.dropdownSelectByVisibleText(SelectBedType, BedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);*/
    }

    public void PackageDetails(String Package_Speciality) throws IOException, InterruptedException {
    CommanUtill.clickFunction(ClickPackageDetails, "Clicked on The Package Details");	
    Thread.sleep(500);
    CommanUtill.dropdownSelectByVisibleText(SelectPackageFacility, Package_Speciality);
    }
    
    public void NextofKinDetails(String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) throws IOException, InterruptedException {
    	CommanUtill.clickFunction(ClickNextofKINDetails, "Clicked on The NextofKinDetails");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextKINName, KinName);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectRelation, Relation);
    	Thread.sleep(500);
    	CommanUtill.textEnter(EmergencyName, Name);
    	Thread.sleep(500);
    	CommanUtill.textEnter(EmergencyPhoneNumber, CommanUtill.generateRandomMobileNumber());
    	Thread.sleep(500);
    	CommanUtill.textEnter(SelectBillingCouncelling, BillingCo);
    	Thread.sleep(500);
    	CommanUtill.textEnter(SelectClinicalCouncelling, ClinicalCo);
    }
    
    public void ClickSave() throws IOException, InterruptedException {
    	CommanUtill.clickFunction(ClickSave, "Click on The Save Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickSave1, "Click on The Save Button1");
    	Thread.sleep(500);
    /*	CommanUtill.clickFunction(ClickFaceSheetRadioBtn, "Click on The FaceSheet Radio Button");
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickPrint, "Click on The Print Button");
    	Thread.sleep(2000);
    	CommanUtill.closePopupWindow();
    	Thread.sleep(2000);
    	CommanUtill.closeNewlyOpenedWindow();*/
    	}

    //********************************************************************************************************************//

/*private static String generateRandomName(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    StringBuilder name = new StringBuilder();
    for (int i = 0; i < length; i++) {
        int index = (int) (Math.random() * characters.length());
        name.append(characters.charAt(index));
    }
    return name.toString();
}
*/
/*private static String generateRandomMobileNumber() {
    String digits = "0123456789";
    StringBuilder mobile = new StringBuilder();
    
    for (int i = 0; i < 10; i++) {
        int index = (int) (Math.random() * digits.length());
        mobile.append(digits.charAt(index));
    }
    
    return mobile.toString();
}*/

    public static String xpathOfToastMessage = "//div[@class='gritter-item']//p";

 public Map<String, String> captureUhidAndWlNumber(String xpathOfToastMessage) {

     Map<String, String> dataMap = new HashMap<>();

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement msgElement = wait.until(
             ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathOfToastMessage)));

     String message = msgElement.getText().trim();
     System.out.println("Captured Message: " + message);

     String uhid = "";
     String ipNo = "";

     try {

         Pattern uhidPattern = Pattern.compile("UHID\\s*:?\\s*([A-Z0-9.]+)");
         Matcher uhidMatcher = uhidPattern.matcher(message);
         if (uhidMatcher.find()) {
             uhid = uhidMatcher.group(1);
         }

         Pattern ipPattern = Pattern.compile(
                 "IPno\\s*\\.?\\s*:?\\s*([0-9]+)",
                 Pattern.CASE_INSENSITIVE);
         Matcher ipMatcher = ipPattern.matcher(message);
         if (ipMatcher.find()) {
             ipNo = ipMatcher.group(1);
         }

         System.out.println("Extracted UHID: " + uhid);
         System.out.println("Extracted IPNo: " + ipNo);

         dataMap.put("UHID", uhid);
         dataMap.put("IPNO", ipNo);

         GLOBAL_UHID = uhid;
         GLOBAL_IPNO = ipNo;

         Assert.assertFalse(uhid.isEmpty(), "UHID not found in message!");
         Assert.assertFalse(ipNo.isEmpty(), "IPNo not found in message!");

     } catch (Exception e) {
         e.printStackTrace();
         Assert.fail("Failed to extract UHID/IP No from message: " + message);
     }

     return dataMap;
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
                 msgText.contains("Patient has been admitted sucessfully with");
                      
         if (isSuccess) {
             logger.log(Status.PASS, "Patient has been admitted sucessfully with message verified");
             log.info("Patient has been admitted sucessfully with Message verified");
             System.out.println("✅ Patient has been admitted sucessfully with");
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

public void Pre_Auth_AdmitPatient(String Address, String City, String Nationality, String ABCPin) throws IOException, InterruptedException {
	CommanUtill.textEnter(TextAddress, Address);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectCIty, City);
	Thread.sleep(500);
	CommanUtill.textEnter(TextDIGPIN, ABCPin);
	//CommanUtill.dropdownSelectByVisibleText(SelectNationality, Nationality);
}



 
/*String toastXpath = "//div[@class='gritter-item']//p";   /html[1]/body[1]/div[12]/div[1]/div[1]

Map<String, String> values = mainPage.captureUhidAndWlNumber(toastXpath);

String capturedUHID = values.get("UHID");
String capturedWLNO = values.get("WLNO");

System.out.println("Final UHID Stored: " + capturedUHID);
System.out.println("Final WL No. Stored: " + capturedWLNO);*/


public void DetailsUpdate() throws IOException, InterruptedException {

    Assert.assertFalse(GLOBAL_IPNO.isEmpty(), "GLOBAL IPNo is EMPTY!");
    System.out.println("Using GLOBAL IPNo: " + GLOBAL_IPNO);
    CommanUtill.textEnter(TextIPNO, GLOBAL_IPNO);
    Thread.sleep(500);
    CommanUtill.pressEnter(TextIPNO);
    Thread.sleep(500);
    CommanUtill.clickFunction(ClickModify, "Clicked on The Modify Button");
    Thread.sleep(500);
    CommanUtill.textEnter(TextLastName, CommanUtill.generateRandomName(6));
    Thread.sleep(500);
    CommanUtill.clickByJSFunction(ClickUpdateBTN, "Clicked on The Update Button");
    Thread.sleep(500);
    CommanUtill.clickFunction(CLickHomePage, "Clicked on The HomePage");
    
}

public void AdmitPatientByBedBookingStatus(String DOB, String ABCPin, String Referred, String Stay, String Source, String Package_Speciality,
		String KinName, String Relation, String Name, String BillingCo, String ClinicalCo) throws IOException, InterruptedException {
	Thread.sleep(3000);
/*	CommanUtill.clickFunction(ClickModify, "Clicked on The Modify Button");
	Thread.sleep(500);
	
	WebElement modifyBtn = driver.findElement(By.xpath(ClickModify));

	Actions action = new Actions(driver);
	action.moveToElement(modifyBtn)
	      .pause(Duration.ofMillis(500))
	      .click()
	      .build()
	      .perform();

	CommanUtill.textEnter(TextDOB, DOB);
	Thread.sleep(500);*/
	CommanUtill.textEnter(TextDIGPIN, ABCPin);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickConsultant, "Click on The Consultant");
	Thread.sleep(500);
	CommanUtill.textEnter(TextReferredBy, Referred);
	Thread.sleep(500);
	CommanUtill.pressEnter(TextReferredBy);
	Thread.sleep(500);
	CommanUtill.pressEnter(TextReferredBy);
	Thread.sleep(500);
	CommanUtill.textEnter(TextLengthofStay, Stay);
  	Thread.sleep(500);
  	CommanUtill.dropdownSelectByVisibleText(SelectSourceofAdmission, Source);
  	Thread.sleep(500);
  	CommanUtill.clickFunction(ClickBedPaymentDetails, "Clicked on The Bed and Payments Details");
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickPackageDetails, "Clicked on The Package Details");	
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectPackageFacility, Package_Speciality);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickNextofKINDetails, "Clicked on The NextofKinDetails");
	Thread.sleep(500);
	CommanUtill.textEnter(TextKINName, KinName);
	Thread.sleep(500);
	CommanUtill.dropdownSelectByVisibleText(SelectRelation, Relation);
	Thread.sleep(500);
	CommanUtill.textEnter(EmergencyName, Name);
	Thread.sleep(500);
	CommanUtill.textEnter(EmergencyPhoneNumber, CommanUtill.generateRandomMobileNumber());
	Thread.sleep(500);
	CommanUtill.textEnter(SelectBillingCouncelling, BillingCo);
	Thread.sleep(500);
	CommanUtill.textEnter(SelectClinicalCouncelling, ClinicalCo);
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickSave, "Click on The Save Button");
	Thread.sleep(500);
	CommanUtill.clickIfPresent("//*[@id='btnYes_CurrentBedStatus']", "Yes Current Bed Status Button");
	Thread.sleep(500);
	CommanUtill.clickFunction(ClickSave1, "Click on The Save Button1");
	Thread.sleep(500);
	captureUhidAndWlNumber(xpathOfToastMessage);
	Thread.sleep(500);
	verifyPopUpSuccess(driver);
	
}

}