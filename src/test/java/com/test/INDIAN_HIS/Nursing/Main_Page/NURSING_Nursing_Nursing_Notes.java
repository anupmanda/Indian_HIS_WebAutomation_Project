/**
 * 
 */
package com.test.INDIAN_HIS.Nursing.Main_Page;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 2 Feb 2026
 */
public class NURSING_Nursing_Nursing_Notes extends GeneralBrowserSetting{
	    protected static String SelectFacility = "//*[@id='Facility']";
	    protected static String SelectStation = "//*[@id='Department']";
	    protected static String ClickStationYesBtn = "//*[@id='btn_yes_desh']";
	    protected static String ClickNursingModule = "//*[@id='btn_Nursing']";
	    //===================== Anup 27-04-2026 ===============================
	    protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	    
	    protected static String ClickNursingActivity = "//*[@id='liNursingActivity']";
	    protected static String ClickNursingActivityLink = "//*[@id='lstWorkList']/a";
	    protected static String ClickAcknowledge = "//*[@id=\"acknowledgeBtn\"]";
	    protected static String ClickNursingNotes = "/html/body/div[4]/div[1]/div/div[2]/div/div[1]/div/a[7]";
	    protected static String ClickNursingTemplateRadioBtn = "//*[@id=\"rdbNurseNotesIDNN\"]";
	    protected static String ClickNursingProgressiveNotesRadioBtn = "//*[@id=\"rdbNurseProcessNotesIDNN\"]";
	    protected static String ClickNursingOrderRadioBtn = "//*[@id=\"rdbNursingOrderIDNN\"]";
	    protected static String ClickConsent = "//*[@id=\"btnConsent\"]";
	    protected static String ClickIOChart = "//*[@id=\"btnIOChartNN\"]";
	    protected static String ClickEndorsementTool = "//*[@id=\"btnEndorsementToolNN\"]";
	  
	    protected static String ClickPainAssesment = "//*[@id=\"btnPainAssesmentNN\"]";
	    protected static String ClickMEWS = "//*[@id=\"btnEWSNN\"]";
	    protected static String ClickInsertionMonitoring = "//*[@id=\"btnInsertionMonitoringNN\"]";
	    //protected static String ClickNurseCarePlan = "//*[@id=\"btnNurseCarePlanNN\"]";
	    protected static String SelectTemplate = "//*[@id=\"select2-drdNurseNotesTemplateNN-container\"]";
	    protected static String ClickTemplate = "//*[@id=\"btnNuseNotesTemplateNN\"]";
	    protected static String SelectTemplate1 = "//*[@id=\"select2-drdNurseNotesTemplateNN-container\"]";
	    protected static String TextTemplate = "/html/body/span[4]/span/span[1]/input";
	    
	    protected static String TextMorningPre = "/html/body/div[3]/div[1]/div[6]/table/tbody/tr[9]/td[2]/div/table/tbody/tr[2]/td[2]/input";
	    protected static String TextMoringPost = "/html/body/div[3]/div[1]/div[6]/table/tbody/tr[11]/td[2]/div/table/tbody/tr[2]/td[3]/input";
	    protected static String TextMoringInsulin = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[9]/td[2]/div/table/tbody/tr[2]/td[4]/input";
	    protected static String TextMoringUnits = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[9]/td[2]/div/table/tbody/tr[2]/td[5]/input";
	    protected static String TextMoringRoute = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[9]/td[2]/div/table/tbody/tr[2]/td[6]/input";
	    protected static String TextMoringClinicalAsistant = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[9]/td[2]/div/table/tbody/tr[2]/td[7]/input";
	    
	    protected static String TextEveningPre = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[11]/td[2]/div/table/tbody/tr[2]/td[2]/input";
	    protected static String TextEveningPost = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[11]/td[2]/div/table/tbody/tr[2]/td[3]/input";
	    protected static String TextEveningInsulin = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[11]/td[2]/div/table/tbody/tr[2]/td[4]/input";
	    protected static String TextEveningUnits = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[11]/td[2]/div/table/tbody/tr[2]/td[5]/input";
	    protected static String TextEveningRoute = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[11]/td[2]/div/table/tbody/tr[2]/td[6]/input";
	    protected static String TextEveningClinicalAssistant = "/html/body/div[3]/div[1]/div[5]/table/tbody/tr[11]/td[2]/div/table/tbody/tr[2]/td[7]/input";
	    
	    protected static String ClickSaveBtn = "//*[@id=\"save_temp\"]";
	    protected static String ClickSaveYesBtn = "//*[@id=\"btnYesSaveTemp\"]";
	    protected static String ClickVerifyButton = "//*[@id=\"sign_temp\"]";
	    protected static String ClickVerifyYesBtn = "//*[@id=\"btnsignyes\"]";
	    protected static String ClickDeleteTemplate = "//*[@id=\"btn_TemplateDelete\"]";
	    protected static String ClickDeleteTemplateyEsButton = "//*[@id=\"btnYesDeleteTemp\"]";
	    
	    
	    protected static String SelectConsentTemplate = "//*[@id=\"templateId\"]";
	    protected static String ClickAddTemplate = "//*[@id=\"add_template\"]";
	    protected static String ClickSignature = "//*[@id=\"signature_open\"]";
	    protected static String ClickSaveConsent1 = "//*[@id=\"SaveSignature\"]" ;
	    protected static String ClickSaveConsent = "//*[@id=\"SaveConsent\"]";
	    protected static String ClickCloseConsent = "//*[@id=\"CloseConsent\"]";
	    protected static String ClickVerifyConsent = "//*[@id=\"VerifyConsent\"]";
	    protected static String ClickPOPUPok = "//*[@id=\"VerifyPopOk\"]";
//*************************************IO Chart********************************************************************//	  
	    protected static String ClickAddIoChart = "//*[@id=\"addNew\"]";
	    protected static String ClickAddIoChart1 = "//*[@id=\"addNewTblRow\"]/i";
	    protected static String SelectIVFluid = "//*[@id=\"IVFluidDrd1\"]";
	    protected static String TextInputVolume = "//*[@id=\"inputDetailTblFlowRateTxt1\"]";
	    protected static String SelectTaking = "//*[@id=\"ddOralSub1\"]";
	    protected static String SelectMeal = "//*[@id=\"OralDrd1\"]";
	    protected static String TextQuantity = "//*[@id=\"inputDetailTblQuantityTxt1\"]";
	    protected static String TextInputRemarks = "//*[@id=\"inputDetailTblRemark1\"]";
	    protected static String SelectOutput = "//*[@id=\"OutputDrd1\"]";
	    protected static String SelectSubOutput = "//*[@id=\"ddOutSub1\"]";
	    protected static String TextQuantityOutput = "//*[@id=\"outputDetailTblQuantityTxt1\"]";
	    protected static String TextOutputRemarks = "//*[@id=\"outputDetailTblRemark1\"]";
	    protected static String ClickDeleteIoChart = "/html/body/div[4]/div/div/div[2]/div/div[1]/div/table/tbody[1]/tr/td[14]";
	    protected static String ClickSaveBtnIoChart = "//*[@id=\"save\"]";
//*************************************Endorsement Tool********************************************************************//	    
	    protected static String SelectShift = "//*[@id=\"ddlnewshift\"]";
	    protected static String Textdiagnosis = "//*[@id=\"txadiagold\"]";
	    protected static String ClickAllergyAddBtn = "//*[@id=\"btnallergyold\"]";
	    protected static String ClickVulnerableCheckBox = "//*[@id=\"chkvulold\"]";
	    protected static String ClickInfectiousCheckBox = "//*[@id=\"chkintrold\"]";
	    protected static String ClickDrugRadioBtn = "//*[@id=\"radio_Drug\"]";
	    protected static String ClickFoodRadioBtn = "//*[@id=\"radio_Food\"]";
	    protected static String ClickOtherRadioBtn = "//*[@id=\"radio_Others\"]";
	    protected static String SelectAllergy = "//*[@id=\"allergy_desc\"]";
	    protected static String SelectReaction = "//*[@id=\"allergy_reaction\"]";	    
	    protected static String SelectAllergySince = "//*[@id=\"allergy_since_type\"]";
	    protected static String ClickRadioHigh = "//*[@id=\"radio_High\"]";
	    protected static String ClickRadioModerate = "//*[@id=\"radio_Moderate\"]";
	    protected static String ClickRadioMild = "//*[@id=\"radio_Mild\"]";
	    protected static String ClickNotKnownRadioBtn = "//*[@id=\"radio_NotKnown\"]";
	    protected static String ClickObservedRadioBtn = "//*[@id=\"radio_observed\"]";
	    protected static String ClickInformedRadioBtn = "//*[@id=\"radio_informed\"]";
	    protected static String ClickAddRowBtn = "//*[@id=\"add_allergy_row\"]";
	    protected static String TextRemarks = "//*[@id=\"text_remark\"]";
	    protected static String ClickSaveAllergy = "//*[@id=\"save_allergy\"]";
	    protected static String ClickCloseAlleryPopup = "//*[@id=\"btnurlpopup\"]";
	    protected static String ClickAddPastMedicalHistory = "//*[@id=\"btnamedcialold\"]";
	    protected static String ClickClosePastMedicalHistory = "/html/body/div[4]/div[3]/div/div/div[1]/button";
	    protected static String ClickPastSurgicalHistory = "//*[@id=\"btnasurglold\"]";
	    protected static String ClickOBGHistory = "/html/body/div[4]/div[1]/div[2]/div[2]/fieldset/div/span[3]/a";
	    protected static String ClickAbdominalPain = "/html/body/div[1]/form/div/div/div[1]/div[2]/ul/li[1]";
	    protected static String ClickAddChiefCoplaint = "//*[@id=\"btnchiefold\"]";
	    protected static String ClickAlcoholUse = "/html/body/div[1]/form/div/div/div[1]/div[2]/ul/li[2]/a";
	    protected static String SelectAcuity = "//*[@id=\"acquity1\"]";
	    protected static String TextDays = "//*[@id=\"no1\"]";
	    protected static String ClickVitalsAdd = "//*[@id=\"btnvitalold\"]";
	    protected static String ClickAddChiefComplaint = "//*[@id=\"addnewrow\"]";
	    protected static String ClickDescription = "//*[@id=\"item0\"]";
	    protected static String ClickItemDescription = "/html/body/div[1]/form/div/div/div[2]/div[1]/table/tbody/tr/td[1]/ul/li[3]";
	    
	    protected static String ClickAddPatientVitals = "//*[@id=\"btnAddNewPV\"]";
	    protected static String TextValue = "/html/body/div[1]/div[3]/fieldset[2]/div[2]/table/tbody/tr[1]/td[8]";
	    protected static String ClickSaveVitalValues = "//*[@id=\"btnsavevital\"]";
	    protected static String ClickCopyBtn = "//*[@id=\"Copytxt\"]";
	    protected static String ClickClosePopup = "//*[@id=\"btnurlpopup\"]";
	    protected static String SelectCentralnervousSyst = "//*[@id=\"ddlcentralold\"]";
	    protected static String SelectRestrain = "//*[@id=\"ddlrestraintold\"]"; 
	    protected static String SelectEyesOpen = "//*[@id=\"ddlEyesOpenSave\"]";
	    protected static String SelectVerbalResponse = "//*[@id=\"VrblRespSave\"]";
	    protected static String SelectMotorResponse = "//*[@id=\"ddlMotrRespSave\"]";
	    protected static String SelectPupilSize = "//*[@id=\"ddlPuplSizeSave\"]";
	    protected static String SelectGastro = "//*[@id=\"dldlgastroold\"]";
	    protected static String SelectDiet = "//*[@id=\"ddldietold\"]";
	    protected static String SelectElemination = "//*[@id=\"ddlelimantionold\"]";
	    protected static String RylesTube = "//*[@id=\"txtryleold\"]";
	    protected static String TextIntake = "//*[@id=\"txtintakeold\"]";
	    protected static String TextFluidBalance = "//*[@id=\"txtfluidbal\"]";
	    protected static String SelectIntake = "//*[@id=\"ddlintakeold\"]";
	    protected static String SelectGenerlCondition = "//*[@id=\"ddlgeneralold\"]";
	    protected static String ClickAddInsertionMonitoring = "//*[@id=\"_insertionMonitoring\"]";
	    protected static String selectTypeofInsertion = "//*[@id=\"drdTypeOfInsertion\"]";
	    protected static String SelectSite = "//*[@id=\"reason\"]";
	    protected static String SelectDrugDressing = "//*[@id=\"drdDressing\"]";
	    protected static String ClickMonitorInsetionSave = "//*[@id=\"btnSaveInsertion\"]";
	    protected static String ClickSaveChiefComplaint = "//*[@id=\"save_chief_complaints\"]";
	    
	    protected static String TextLoginName = "//*[@id=\"txtloginid\"]";
	    protected static String TextLoginPassword = "//*[@id=\"txtpswd\"]";
	    protected static String ClickSaveLoginCredentials = "//*[@id=\"btnusrok\"]";
	    protected static String ClickSaveEndorsementTool = "//*[@id=\"btnsaveendorsement\"]";
	    protected static String ClickIfPresent = "//*[@id=\"btn_verfytimingpopup\"]";
	    protected static String TextRemarksIfPresent = "//*[@id=\"txtRemarks\"]";
	    protected static String VerifySaveEndorsement = "//*[@id=\"btnverifyndorsement\"]";
	    protected static String ClickVerifyYesButton = "//*[@id=\"btn_verfyendorse\"]";
	    
	    
	  //*************************************VITALS********************************************************************//	    
	    protected static String ClickVitals = "//*[@id=\"btnVitalsNN\"]";
	    protected static String ClickVitalMapping = "//*[@id=\"btnVitalMappingPV\"]";
	    protected static String TextSearchVitals = "//*[@id=\"txtSearchAllVitalVM\"]";
	    protected static String ClickVitalMapping1 = "/html/body/div[1]/div[3]/div[1]/fieldset/div/div[1]/div[2]/table/tbody/tr[1]";
	    protected static String ClickToSelectVital = "/html/body/div[1]/div[3]/div[1]/fieldset/div/div[1]/div[2]/table/tbody/tr/td[1]";
	    protected static String ClickVitalMappingSave = "//*[@id=\"save\"]";
	    protected static String ClickVitalsClosePopup = "//*[@id=\"btnurlpopup\"]";
	   
	    //*************************************PAIN ASSESMENT********************************************************************//    
       protected static String SelectParticipatingFactor = "//*[@id=\"cmbPrecipitatingFactor\"]";
       protected static String SelectTypeofPain = "//*[@id=\"CmbTypeOfPain\"]";
       protected static String SelectLocation = "//*[@id=\"txtLocation\"]";
       protected static String SelectPainScore = "//*[@id=\"CmbPainScor\"]";
       protected static String SelectMusclePowerGrading = "//*[@id=\"CmbMPGDrp\"]";
       protected static String SelectFrequency = "//*[@id=\"CmbFreqecy\"]";
	   protected static String ClickSavePain = "//*[@id=\"btnSavePain\"]";
	   protected static String ClickYesBtn = "//*[@id=\"btn_yes_notify\"]";
	   protected static String SelectPostInventionScore = "//*[@id=\"CmbPostInven\"]";
	   protected static String ClickSaveIntervention = "//*[@id=\"btnSaveInterven\"]";
	   protected static String ClickVerifyButtonIntervention = "//*[@id=\"btnVerifyInterven\"]";
	   
	 //**************************************************************************************************************************//	    
 //***************************************************NurseCarePlan********************************************************************//
	 protected static String ClickNurseCarePlan = "//*[@id=\"btnNurseCarePlanNN\"]";
	 protected static String SelectNurseAssesment = "//*[@id=\"_drpNurseAssesment\"]";
	 protected static String SelectProblemIdentified = "//*[@id=\"_drpProblemModified\"]";
	 protected static String SelectGoal = "//*[@id=\"_drpGoal\"]";
	 protected static String SelectNurseIntervention = "//*[@id=\"_drpIntervention\"]";
	 protected static String SelectImplementation = "//*[@id=\"_drpImplementation\"]";
	 protected static String SelectOutcome = "//*[@id=\"_drpOutcome\"]";
	 protected static String SelectSpecialNotes = "//*[@id=\"_drpSpecialNotes\"]";
	 protected static String ClickAddBtn = "//*[@id=\"btnAddItem\"]";
	 protected static String ClickSaveBtncp = "//*[@id=\"save\"]";
	 protected static String ClickVerifyBtncp = "//*[@id=\"verifyIcon\"]";
	 
 //**************************************************************************************************************************************//
	   
	   
	    public static void fillAcuityAndNo_Combined() {

	        logger.log(Status.INFO, "Started Acuity selection and No textbox entry (combined)");
	        log.info("Started Acuity selection and No textbox entry (combined)");

	        int index = 1;

	        while (true) {

	            String acuityXPath = "//*[@id='acquity" + index + "']";
	            String noXPath = "//*[@id='no" + index + "']";

	            log.info("Processing index: " + index);
	            logger.log(Status.INFO, "Processing index: " + index);

	            List<WebElement> acuityList = driver.findElements(By.xpath(acuityXPath));
	            if (acuityList.isEmpty()) {
	                log.info("Acuity not found for index " + index + ". Breaking loop.");
	                logger.log(Status.INFO,
	                        "Acuity not found for index " + index + ". Breaking loop.");
	                break;
	            }

	            try {
	                WebElement dropdown = acuityList.get(0);

	                if (dropdown.isEnabled()) {
	                    Select select = new Select(dropdown);
	                    select.selectByIndex(1);
	                    System.out.println("✅ Selected second option for acquity" + index);
	                    logger.log(Status.PASS,
	                            "Selected second option for acquity" + index);
	                }
	            } catch (Exception e) {
	                log.warn("Unable to select acuity at index " + index, e);
	                logger.log(Status.WARNING,
	                        "Unable to select acuity at index " + index);
	            }

	            List<WebElement> noList = driver.findElements(By.xpath(noXPath));
	            if (noList.isEmpty()) {
	                log.info("No textbox not found for index " + index + ". Breaking loop.");
	                logger.log(Status.INFO,
	                        "No textbox not found for index " + index + ". Breaking loop.");
	                break;
	            }

	            try {
	                enterRandomNumberInTextbox(noXPath);
	                System.out.println("✏️ Entered random number in no" + index);
	                logger.log(Status.PASS,
	                        "Entered random number in no" + index);
	            } catch (Exception e) {
	                log.warn("Unable to enter number in no textbox at index " + index, e);
	                logger.log(Status.WARNING,
	                        "Unable to enter number in no textbox at index " + index);
	            }

	            index++;

	            try {
	                Thread.sleep(300);
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }

	    
	    public boolean verifySuccessPopup(WebDriver driver) {

	        logger.log(Status.INFO, "Started verification of file upload success message");
	        log.info("Started verification of file upload success message");
	        System.out.println("▶ Started verification of file upload success message");

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
	                    msgText.contains("Saved successfully!")  
	                           || msgText.contains("Saved Successfully!")
	                            || msgText.contains("Signed successfully!")
	                            || msgText.contains("Record Saved Successfully!")
	                            || msgText.contains("Verified successfully!")
	                            || msgText.contains("saved successfully")
	                            || msgText.contains("Verified successfully"); 

	            if (isSuccess) {
	                logger.log(Status.PASS, " success message verified");
	                log.info(" success message verified");
	                System.out.println("✅ success message verified");
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
	    
	    public boolean firstClickWithHighlight() {

	        logger.log(Status.INFO, "Started searching for first clickable cell in table");
	        log.info("Started searching for first clickable cell in table");
	        System.out.println("▶ Started searching for first clickable cell in table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        int maxRows = 10;

	        for (int i = 1; i <= maxRows; i++) {

	            try {

	                String xpath = " /html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[9]/div/div[3]/div[1]/table/tbody[1]/tr[" + i + "]/td[2]";
	                            		
	                WebElement element = wait.until( ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	                       
	             

	                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
	                log.info("Row " + i + " is clickable, applying highlight");
	                System.out.println("✨ Highlighting row: " + i);

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid blue;');",
	                        element
	                );

	                Thread.sleep(500);

	                js.executeScript(
	                        "arguments[0].setAttribute('style','');",
	                        element
	                );

	                element.click();

	                logger.log(Status.PASS, "Clicked successfully on first clickable row: " + i);
	                log.info("Clicked successfully on first clickable row: " + i);
	                System.out.println("✅ Clicked successfully on row: " + i);

	                return true;

	            } catch (Exception e) {

	                logger.log(Status.WARNING, "Row " + i + " not clickable, trying next row");
	                log.warn("Row " + i + " not clickable, trying next row", e);
	                System.out.println("❌ Row " + i + " not clickable → Trying next row");
	            }
	        }

	        logger.log(Status.FAIL, "No clickable cell found in first " + maxRows + " rows");
	        log.error("No clickable cell found in first " + maxRows + " rows");
	        System.out.println("❌ No clickable cell found in first " + maxRows + " rows");

	        return false;
	    }
	    
	  /* public boolean clickChiefComplaint_ULTRAFAST() {

	        logger.log(Status.INFO, "Started clicking chief complaint (ULTRAFAST)");
	        log.info("Started clicking chief complaint (ULTRAFAST)");

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        List<WebElement> rows = driver.findElements(
	                By.xpath("//*[@id='ipchiefcomplient_form']//li/a")
	        );

	        System.out.println("📊 Total chief complaints: " + rows.size());

	        for (WebElement element : rows) {

	            try {

	                js.executeScript("arguments[0].scrollIntoView(true);", element);

	                js.executeScript(
	                        "arguments[0].setAttribute('style','background:yellow; border:2px solid green');",
	                        element
	                );
	                Thread.sleep(100);
	                js.executeScript("arguments[0].setAttribute('style','');", element);

	                element.click();

	                boolean gritter = (Boolean) js.executeScript(
	                        "return document.querySelector('.gritter-error') !== null;"
	                );

	                if (!gritter) {
	                    logger.log(Status.PASS, "Chief complaint clicked successfully");
	                    return true;
	                }

	            } catch (Exception ignored) {
	            }
	        }

	        logger.log(Status.FAIL, "All chief complaints already exist");
	        return false;
	    }*/

	    private boolean isGritterAppearedFast() {
	        try {
	            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(1));
	            shortWait.until(ExpectedConditions.presenceOfElementLocated(
	                    By.cssSelector("div.gritter-item-wrapper.gritter-error")
	            ));
	            return true;
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }

	    
	    public boolean lastClickWithHighlight() {

	        logger.log(Status.INFO, "Started searching for LAST clickable cell in table");
	        log.info("Started searching for LAST clickable cell in table");
	        System.out.println("▶ Started searching for LAST clickable cell in table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[9]/div/div[3]/div[1]/table/tbody[1]/tr")
	        );

	        int maxRows = rows.size();
	        System.out.println("📊 Total rows found: " + maxRows);

	        for (int i = maxRows; i >= 1; i--) {

	            try {

	                String cellXpath =
	                        "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[9]/div/div[3]/div[1]/table/tbody[1]/tr[" 
	                        + i + "]/td[2]";

	                WebElement element = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(cellXpath))
	                );

	                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
	                log.info("Row " + i + " is clickable, applying highlight");

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid blue;');",
	                        element
	                );

	                Thread.sleep(500);
	                js.executeScript("arguments[0].setAttribute('style','');", element);

	                element.click();

	                logger.log(Status.PASS, "Clicked successfully on LAST clickable row: " + i);
	                log.info("Clicked successfully on LAST clickable row: " + i);
	                System.out.println("✅ Clicked successfully on LAST row: " + i);

	                return true;

	            } catch (Exception e) {
	                System.out.println("❌ Row " + i + " not clickable → Trying previous row");
	                log.warn("Row " + i + " not clickable, trying previous row", e);
	            }
	        }

	        logger.log(Status.FAIL, "No clickable cell found in table");
	        log.error("No clickable cell found in table");
	        System.out.println("❌ No clickable cell found in table");

	        return false;
	    }
	    
	    public boolean lastClickWithHighlightPainAssesment() {

	        logger.log(Status.INFO, "Searching for LAST clickable Pain Assessment icon");
	        log.info("Searching for LAST clickable Pain Assessment icon");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("/html/body/div[4]/div[1]/div[1]/div/table/tbody/tr")
	        );

	        int totalRows = rows.size();
	        System.out.println("📊 Total rows found: " + totalRows);

	        for (int i = totalRows; i >= 1; i--) {

	            try {

	                String iconXpath =
	                        "/html/body/div[4]/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[14]/i";

	                WebElement icon = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(iconXpath))
	                );

	                logger.log(Status.INFO, "Row " + i + " icon is clickable, highlighting");
	                log.info("Row " + i + " icon is clickable, highlighting");

	                js.executeScript(
	                        "arguments[0].style.border='3px solid blue';" +
	                        "arguments[0].style.background='yellow';",
	                        icon
	                );

	                Thread.sleep(400);

	                js.executeScript("arguments[0].style='';", icon);

	                icon.click();

	                logger.log(Status.PASS, "Clicked LAST Pain Assessment icon at row: " + i);
	                log.info("Clicked LAST Pain Assessment icon at row: " + i);
	                System.out.println("✅ Clicked LAST row icon: " + i);

	                return true;

	            } catch (Exception e) {
	                System.out.println("❌ Row " + i + " icon not clickable → trying previous row");
	                log.warn("Row " + i + " icon not clickable", e);
	            }
	        }

	        logger.log(Status.FAIL, "No clickable Pain Assessment icon found");
	        log.error("No clickable Pain Assessment icon found");
	        System.out.println("❌ No clickable icon found");

	        return false;
	    }
	    
	    
	    public boolean lastClickWithHighlightPainAssesmentSearch() {

	        logger.log(Status.INFO, "Searching for LAST clickable Pain Assessment icon");
	        log.info("Searching for LAST clickable Pain Assessment icon");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("/html/body/div[4]/div[1]/div[1]/div/table/tbody/tr")
	        );

	        int totalRows = rows.size();
	        System.out.println("📊 Total rows found: " + totalRows);

	        for (int i = totalRows; i >= 1; i--) {

	            try {

	                String iconXpath =
	                        "/html/body/div[4]/div[1]/div[1]/div/table/tbody/tr[" + i + "]/td[15]/i";

	                WebElement icon = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(iconXpath))
	                );

	                logger.log(Status.INFO, "Row " + i + " icon is clickable, highlighting");
	                log.info("Row " + i + " icon is clickable, highlighting");

	                js.executeScript(
	                        "arguments[0].style.border='3px solid blue';" +
	                        "arguments[0].style.background='yellow';",
	                        icon
	                );

	                Thread.sleep(400);

	                js.executeScript("arguments[0].style='';", icon);

	                icon.click();

	                logger.log(Status.PASS, "Clicked LAST Pain Assessment icon at row: " + i);
	                log.info("Clicked LAST Pain Assessment icon at row: " + i);
	                System.out.println("✅ Clicked LAST row icon: " + i);

	                return true;

	            } catch (Exception e) {
	                System.out.println("❌ Row " + i + " icon not clickable → trying previous row");
	                log.warn("Row " + i + " icon not clickable", e);
	            }
	        }

	        logger.log(Status.FAIL, "No clickable Pain Assessment icon found");
	        log.error("No clickable Pain Assessment icon found");
	        System.out.println("❌ No clickable icon found");

	        return false;
	    }


	    public boolean lastClickWithHighlightConsent() {

	        logger.log(Status.INFO, "Started searching for LAST clickable cell in table");
	        log.info("Started searching for LAST clickable cell in table");
	        System.out.println("▶ Started searching for LAST clickable cell in table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements( 
	                By.xpath("//*[@id=\"tempTbl\"]/tbody/tr")
	        );

	        int maxRows = rows.size();
	        System.out.println("📊 Total rows found: " + maxRows);

	        for (int i = maxRows; i >= 1; i--) {

	            try {

	                String cellXpath =
	                        "//*[@id=\"tempTbl\"]/tbody/tr[" + i + "]/td[1]";

	                WebElement element = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(cellXpath))
	                );

	                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
	                log.info("Row " + i + " is clickable, applying highlight");

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid blue;');",
	                        element
	                );

	                Thread.sleep(500);
	                js.executeScript("arguments[0].setAttribute('style','');", element);

	                element.click();

	                logger.log(Status.PASS, "Clicked successfully on LAST clickable row: " + i);
	                log.info("Clicked successfully on LAST clickable row: " + i);
	                System.out.println("✅ Clicked successfully on LAST row: " + i);

	                return true;

	            } catch (Exception e) {
	                System.out.println("❌ Row " + i + " not clickable → Trying previous row");
	                log.warn("Row " + i + " not clickable, trying previous row", e);
	            }
	        }

	        logger.log(Status.FAIL, "No clickable cell found in table");
	        log.error("No clickable cell found in table");
	        System.out.println("❌ No clickable cell found in table");

	        return false;
	    }

	    public boolean firstClickWithHighlightRow() {

	        logger.log(Status.INFO, "Started searching for FIRST clickable cell in table");
	        log.info("Started searching for FIRST clickable cell in table");
	        System.out.println("▶ Started searching for FIRST clickable cell in table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[9]/div/div[3]/div[1]/table/tbody[1]/tr")
	        );

	        int maxRows = rows.size();
	        System.out.println("📊 Total rows found: " + maxRows);

	        for (int i = 1; i <= maxRows; i++) {

	            try {

	                String cellXpath =
	                        "/html/body/div[4]/div[1]/div/div[2]/div/div[5]/div[9]/div/div[3]/div[1]/table/tbody[1]/tr[" 
	                        + i + "]/td[2]";

	                WebElement element = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(cellXpath))
	                );

	                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
	                log.info("Row " + i + " is clickable, applying highlight");

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid green;');",
	                        element
	                );

	                Thread.sleep(500);
	                js.executeScript("arguments[0].setAttribute('style','');", element);

	                element.click();

	                logger.log(Status.PASS, "Clicked successfully on FIRST clickable row: " + i);
	                log.info("Clicked successfully on FIRST clickable row: " + i);
	                System.out.println("✅ Clicked successfully on FIRST row: " + i);

	                return true;

	            } catch (Exception e) {
	                System.out.println("❌ Row " + i + " not clickable → Trying next row");
	                log.warn("Row " + i + " not clickable, trying next row", e);
	            }
	        }

	        logger.log(Status.FAIL, "No clickable cell found in table");
	        log.error("No clickable cell found in table");
	        System.out.println("❌ No clickable cell found in table");

	        return false;
	    }

	    public boolean firstClickWithHighlightVitals() {

	        logger.log(Status.INFO, "Started searching for FIRST clickable row in NEW table");
	        log.info("Started searching for FIRST clickable row in NEW table");
	        System.out.println("▶ Started searching for FIRST clickable row in NEW table");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("/html/body/div[1]/div[3]/div[1]/fieldset/div/div[1]/div[2]/table/tbody/tr")
	        );

	        int maxRows = rows.size();
	        System.out.println("📊 Total rows found: " + maxRows);

	        for (int i = 1; i <= maxRows; i++) {

	            try {

	                String rowXpath =
	                        "/html/body/div[1]/div[3]/div[1]/fieldset/div/div[1]/div[2]/table/tbody/tr[" + i + "]";

	                WebElement rowElement = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(rowXpath))
	                );

	                logger.log(Status.INFO, "Row " + i + " is clickable, applying highlight");
	                log.info("Row " + i + " is clickable, applying highlight");

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid red;');",
	                        rowElement
	                );

	                Thread.sleep(500);
	                js.executeScript("arguments[0].setAttribute('style','');", rowElement);

	                rowElement.click();

	                logger.log(Status.PASS, "Clicked successfully on FIRST clickable row: " + i);
	                log.info("Clicked successfully on FIRST clickable row: " + i);
	                System.out.println("✅ Clicked successfully on FIRST row: " + i);

	                return true;

	            } catch (Exception e) {
	                System.out.println("❌ Row " + i + " not clickable → Trying next row");
	                log.warn("Row " + i + " not clickable, trying next row", e);
	            }
	        }

	        logger.log(Status.FAIL, "No clickable row found in NEW table");
	        log.error("No clickable row found in NEW table");
	        System.out.println("❌ No clickable row found in NEW table");

	        return false;
	    }

	    
	    
	    public void drawSignatureAndSave(WebDriver driver) throws InterruptedException, IOException {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
	                By.xpath("//iframe[contains(@id,'SignatureIframe')]")));
	        WebElement canvas = wait.until(
	                ExpectedConditions.presenceOfElementLocated(
	                        By.xpath("//div[@id='signature-pad']//canvas")));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(canvas, 50, 50)
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
	        Thread.sleep(3000);
	        driver.switchTo().defaultContent();
	        Thread.sleep(3000);
	        WebElement saveBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.id("SaveSignature")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
	        Thread.sleep(1000);
	        CommanUtill.clickByJSFunction(ClickSaveConsent1, "Clicked on The Save Consent Button");
	        Thread.sleep(1000);
	        CommanUtill.clickByJSFunction(ClickSaveConsent, "Clicked on The Save Consent Button");
	    }
	    
	    public void switchToAllergyPopup() {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	            wait.until(ExpectedConditions.presenceOfElementLocated(
	                    By.id("iframeurl")
	            ));

	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.id("iframeurl")
	            ));

	            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
	                    By.id("iframeurl")
	            ));

	            System.out.println("✅ Switched successfully to Allergy Popup iframe");

	        } catch (TimeoutException e) {
	            System.out.println("❌ iframeurl not found within timeout");
	            throw e;

	        } catch (Exception e) {
	            System.out.println("❌ Error while switching to Allergy Popup iframe");
	            throw e;
	        }
	    }
	    
	    public void switchToAllergyPopup1() {

	        driver.switchTo().defaultContent();

	        List<WebElement> iframes = driver.findElements(By.id("iframeurl"));

	        if (iframes.size() > 0) {
	            driver.switchTo().frame(iframes.get(0));
	            System.out.println("✅ Switched successfully to Allergy Popup iframe");
	        } else {
	            System.out.println("⚠ iframe not present, assuming already inside popup");
	        }
	    }

	    
	    


	    public static boolean isAlreadySelectedGlitter() {
	        try {
	            WebElement msg = driver.findElement(
	                    By.xpath("//div[contains(@class,'gritter-item')]//p")
	            );
	            return msg.isDisplayed() && msg.getText().contains("Already selected");
	        } catch (Exception e) {
	            return false;
	        }
	    }
	    
	    public static void closeGlitter() {
	        try {
	            driver.findElement(
	                By.xpath("//div[contains(@class,'gritter-close')]")
	            ).click();
	            Thread.sleep(300);
	        } catch (Exception ignored) {}
	    }

	    public void closeAllergyPopup(WebDriver driver) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript(
	            "var root = document.getElementById('divurlshow');" +
	            "if(root){" +
	            " root.style.display='none';" +
	            "}" +
	            "document.body.classList.remove('modal-open');" +
	            "document.body.style.overflow='auto';"
	        );
	    }


	    public static void selectSecondOptionForAllAcquityDropdowns() {

	        int index = 1;

	        while (true) {

	            String dynamicXPath = "//*[@id='acquity" + index + "']";
	            log.info("Checking XPath: " + dynamicXPath);
	            logger.log(Status.INFO, "Checking XPath: " + dynamicXPath);

	            try {
	             
	                List<WebElement> elements = driver.findElements(By.xpath(dynamicXPath));

	                if (elements.size() == 0) {
	                    log.info("No dropdown found for: " + dynamicXPath + ". Stopping loop.");
	                    logger.log(Status.INFO,
	                            "No dropdown found for: " + dynamicXPath + ". Stopping loop.");
	                    break;
	                }

	                CommanUtill.selectSecondOptionFromDropdown(dynamicXPath);

	                index++; 

	            } catch (Exception e) {
	                log.error("Error while handling dropdown: " + dynamicXPath, e);
	                logger.log(Status.FAIL,
	                        "Error while handling dropdown: " + dynamicXPath + " - " + e.getMessage());
	                break;
	            }
	        }
	    }
	    
	    public static void selectSecondOptionForAllAcquityDropdowns_ULTRAFAST() {

	        logger.log(Status.INFO, "Selecting second option for all Acuity dropdowns (FAST)");
	        log.info("Selecting second option for all Acuity dropdowns (FAST)");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        wait.until(ExpectedConditions.presenceOfElementLocated(
	                By.xpath("//*[starts-with(@id,'acquity')]")
	        ));

	        List<WebElement> dropdowns = driver.findElements(
	                By.xpath("//*[starts-with(@id,'acquity') and not(@disabled)]")
	        );

	        System.out.println("📊 Visible Acuity dropdowns: " + dropdowns.size());

	        for (WebElement dropdown : dropdowns) {
	            try {

	                js.executeScript(
	                        "arguments[0].selectedIndex = 1; arguments[0].dispatchEvent(new Event('change'));",
	                        dropdown
	                );

	            } catch (Exception e) {
	                log.warn("Unable to select acuity dropdown", e);
	            }
	        }

	        logger.log(Status.PASS, "All Acuity dropdowns selected successfully");
	    }

	    
	    public static void selectSecondOptionForAllAcquityDropdowns_Fast() {

	        logger.log(Status.INFO, "Selecting second option for all Acuity dropdowns");
	        log.info("Selecting second option for all Acuity dropdowns");

	        List<WebElement> dropdowns = driver.findElements(
	                By.xpath("//*[starts-with(@id,'acquity')]")
	        );

	        System.out.println("📊 Total Acuity dropdowns found: " + dropdowns.size());

	        for (int i = 0; i < dropdowns.size(); i++) {

	            try {

	                WebElement dropdown = dropdowns.get(i);

	                if (!dropdown.isEnabled()) {
	                    continue;
	                }

	                Select select = new Select(dropdown);
	                select.selectByIndex(1); 

	                System.out.println("✅ Selected second option for dropdown " + (i + 1));
	                logger.log(Status.PASS, "Selected second option for dropdown " + (i + 1));

	            } catch (Exception e) {

	                log.warn("Unable to select dropdown at index " + i, e);
	                logger.log(Status.WARNING,
	                        "Unable to select dropdown at index " + i);
	            }
	        }
	    }

	    
	    public static void enterRandomNumberInTextbox(String textboxXPath) {

	        try {
	            logger.log(Status.INFO, "Entering random number in textbox: " + textboxXPath);
	            log.info("Entering random number in textbox: " + textboxXPath);

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement textbox = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath(textboxXPath))
	            );

	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript(
	                    "arguments[0].style.background='yellow'; arguments[0].style.border='3px solid blue';",
	                    textbox
	            );

	        
	            int randomNumber = new Random().nextInt(9) + 1;

	            textbox.clear();
	            textbox.sendKeys(String.valueOf(randomNumber));

	            logger.log(Status.PASS,
	                    "Random number entered: " + randomNumber + " in " + textboxXPath);
	            log.info("Random number entered: " + randomNumber + " in " + textboxXPath);

	            js.executeScript(
	                    "arguments[0].style.background=''; arguments[0].style.border='';",
	                    textbox
	            );

	        } catch (Exception e) {
	            logger.log(Status.FAIL,
	                    "Failed to enter random number in textbox: " + e.getMessage());
	            log.error("Failed to enter random number in textbox", e);
	            throw new RuntimeException(e);
	        }
	    }


	    public static void enterRandomNumberForAllNoTextboxes() {

	        int index = 1;

	        while (true) {

	            String dynamicXPath = "//*[@id='no" + index + "']";
	            log.info("Checking XPath: " + dynamicXPath);
	            logger.log(Status.INFO, "Checking XPath: " + dynamicXPath);

	            List<WebElement> elements = driver.findElements(By.xpath(dynamicXPath));

	            if (elements.size() == 0) {
	                log.info("No textbox found for: " + dynamicXPath + ". Stopping loop.");
	                logger.log(Status.INFO,
	                        "No textbox found for: " + dynamicXPath + ". Stopping loop.");
	                break; 
	            }

	            enterRandomNumberInTextbox(dynamicXPath);

	            index++;

	            try {
	                Thread.sleep(300); 
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }

	    public boolean clickChiefComplaint_ULTRAFAST() {

	        logger.log(Status.INFO, "Started clicking chief complaint (ULTRAFAST)");
	        log.info("Started clicking chief complaint (ULTRAFAST)");

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        List<WebElement> rows = driver.findElements(
	                By.xpath("//*[@id='ipchiefcomplient_form']//li/a")
	        );

	        System.out.println("📊 Total chief complaints: " + rows.size());

	        for (WebElement element : rows) {

	            try {

	                js.executeScript("arguments[0].scrollIntoView(true);", element);

	                js.executeScript(
	                        "arguments[0].setAttribute('style','background:yellow; border:2px solid green');",
	                        element
	                );
	                Thread.sleep(100);
	                js.executeScript("arguments[0].setAttribute('style','');", element);

	                element.click();

	                boolean gritter = (Boolean) js.executeScript(
	                        "return document.querySelector('.gritter-error') !== null;"
	                );

	                if (!gritter) {
	                    logger.log(Status.PASS, "Chief complaint clicked successfully");
	                    return true;
	                }

	            } catch (Exception ignored) {
	            }
	        }

	        logger.log(Status.FAIL, "All chief complaints already exist");
	        return false;
	    }

	    public void NursingNotesTemplate(String Facility, String Station, String Template, String Pre, String Post, String Insulin, 
	    		String Units, String Route, String ClinicalAssistant, String ChangedUnit ) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	//CommanUtill.dropdownSelectByVisibleText(SelectTemplate, Template);
	    	CommanUtill.clickFunction(SelectTemplate1, "Select The Template");
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextTemplate, Template);
	    	Thread.sleep(500);
	    	CommanUtill.pressEnter(TextTemplate);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickTemplate, "Clicked on The Selected Template");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindowMax(driver);
	    /*	Thread.sleep(500);
            CommanUtill.textEnter(TextMorningPre, Pre);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringPost, Post);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringInsulin, Insulin);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringUnits, Units);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringRoute, Route);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringClinicalAsistant, ClinicalAssistant);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningPre, Pre);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningPost, Post);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningInsulin, Insulin);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningUnits, Units);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningRoute, Route);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningClinicalAssistant, ClinicalAssistant);
            Thread.sleep(500);*/
            CommanUtill.clickByJSFunction(ClickSaveBtn, "Clicked on The Template Save Button");
            Thread.sleep(500);
            CommanUtill.clickFunction(ClickSaveYesBtn, "Clicked on The Template Save Yes Button");
            Thread.sleep(500);
            verifySuccessPopup(driver);
            Thread.sleep(500);
            CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);
            lastClickWithHighlight();
            Thread.sleep(500);
            CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);
          //  CommanUtill.textEnter(TextMoringUnits, ChangedUnit);
            Thread.sleep(2000);
            CommanUtill.clickByJSFunction(ClickSaveBtn, "Clicked on The Template Save Button");
            Thread.sleep(1000);
            CommanUtill.clickFunction(ClickSaveYesBtn, "Clicked on The Template Save Yes Button");
            Thread.sleep(500);
            verifySuccessPopup(driver);
            Thread.sleep(3000);
            CommanUtill.clickByJSFunction(ClickVerifyButton, "Clicked on The Verify Button");
            Thread.sleep(2000);
            CommanUtill.clickFunction(ClickVerifyYesBtn, "Clicked on The Verify Yes Button");
            Thread.sleep(500);
            verifySuccessPopup(driver);
            Thread.sleep(3000);
            CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);
            firstClickWithHighlightRow();
            Thread.sleep(500);
            CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickDeleteTemplate, "Clicked on The Delete Button");
            Thread.sleep(500);
            CommanUtill.clickFunction(ClickDeleteTemplateyEsButton, "Clicked on The Delete Yes Button");
        	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    	}
	    
	    
	    public void NursingNotesTemplateDelete(String Facility, String Station, String Template, String Pre, String Post, String Insulin, 
	    		String Units, String Route, String ClinicalAssistant, String ChangedUnit ) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(emergency_dashbord, "Clicked on The Emergency Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	//CommanUtill.dropdownSelectByVisibleText(SelectTemplate, Template);
	    	CommanUtill.clickFunction(SelectTemplate1, "Select The Template");
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextTemplate, Template);
	    	Thread.sleep(500);
	    	CommanUtill.pressEnter(TextTemplate);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickTemplate, "Clicked on The Selected Template");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindowMax(driver);
	    	Thread.sleep(500);
            CommanUtill.textEnter(TextMorningPre, Pre);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringPost, Post);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringInsulin, Insulin);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringUnits, Units);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringRoute, Route);
            Thread.sleep(500);
            CommanUtill.textEnter(TextMoringClinicalAsistant, ClinicalAssistant);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningPre, Pre);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningPost, Post);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningInsulin, Insulin);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningUnits, Units);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningRoute, Route);
            Thread.sleep(500);
            CommanUtill.textEnter(TextEveningClinicalAssistant, ClinicalAssistant);
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickSaveBtn, "Clicked on The Template Save Button");
            Thread.sleep(500);
            CommanUtill.clickFunction(ClickSaveYesBtn, "Clicked on The Template Save Yes Button");
            Thread.sleep(500);
            verifySuccessPopup(driver);
            Thread.sleep(500);
         /*   CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);
            lastClickWithHighlight();
            Thread.sleep(500);
            CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);*/
            CommanUtill.textEnter(TextMoringUnits, ChangedUnit);
            Thread.sleep(2000);
            CommanUtill.clickByJSFunction(ClickSaveBtn, "Clicked on The Template Save Button");
            Thread.sleep(1000);
            CommanUtill.clickFunction(ClickSaveYesBtn, "Clicked on The Template Save Yes Button");
            Thread.sleep(500);
            verifySuccessPopup(driver);
            Thread.sleep(2000);
         /*   CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);
            firstClickWithHighlightRow();
            Thread.sleep(500);
            CommanUtill.switchToNewWindowMax(driver);
            Thread.sleep(500);*/
            CommanUtill.clickByJSFunctionNoScreenShot(ClickDeleteTemplate, "Clicked on The Delete Button");
           Thread.sleep(2000);
            CommanUtill.clickByJSFunctionNoScreenShot(ClickDeleteTemplateyEsButton, "Clicked on The Delete Yes Button");
        	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    	
	    	}
	    
	    public void NursingNotesConsent(String Facility, String Station, String ConsentTemplate) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickConsent, "Clicked on The Consent Tab");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectConsentTemplate, ConsentTemplate);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddTemplate, "Clicked on The Add Template");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickSignature, "Clicked on The Signature Button");
	    	Thread.sleep(500);
	    	drawSignatureAndSave(driver);
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickCloseConsent, "Clicked on The Close Consent");
	    	Thread.sleep(500);
	    	lastClickWithHighlightConsent();
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickVerifyConsent, "Clicked on The Verify Consent");
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickPOPUPok, "Clicked on The Verify Popup ok Button");
            Thread.sleep(1000);
            verifySuccessPopup(driver);
            Thread.sleep(1000);
	    	CommanUtill.clickByJSFunction(ClickCloseConsent, "Clicked on The Close Consent");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    	
	    	
	    }
	    
	    public void NursingIOChart(String Facility, String Station, String IVFluid, String InputVolume, String Taking, 
	    		String Meal, String Quantity, String InputRemarks, String Output, String SubOutput, String TextQuantity1, String OutputRemarks  ) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickIOChart, "Clicked on The IO Chart Tab");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickAddIoChart, "Clicked on The Io Chart Add Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickAddIoChart1, "Clicked on The Io Chart Add Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectIVFluid, IVFluid);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextInputVolume, InputVolume);
	    	Thread.sleep(500);
	    //	CommanUtill.dropdownSelectByVisibleText(SelectTaking, Taking);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectTaking);
	    	Thread.sleep(500);
	    //	CommanUtill.dropdownSelectByVisibleText(SelectMeal, Meal);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectMeal);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextQuantity, Quantity);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextInputRemarks, InputRemarks);
	    	Thread.sleep(500);
	  //  	CommanUtill.dropdownSelectByVisibleText(SelectOutput, Output);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectOutput);
	    	Thread.sleep(500);
	    //	CommanUtill.dropdownSelectByVisibleText(SelectSubOutput, SubOutput);
	    //	CommanUtill.selectSecondOptionFromDropdown(SelectSubOutput);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextQuantityOutput, TextQuantity1);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextOutputRemarks, OutputRemarks);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickSaveBtnIoChart, "Clciked on Saved Button IO Chart Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    }
	    
	 
	    public static int getDropdownOptionsCount(By dropdown) {
	        WebElement element = driver.findElement(dropdown);
	        Select select = new Select(element);
	        return select.getOptions().size();
	    }

	 
	    private void hardRemoveGlitter() {
	        try {
	            ((JavascriptExecutor) driver).executeScript(
	                "document.querySelectorAll('*').forEach(e => {" +
	                " if(e.innerText && e.innerText.includes('Already selected')) e.remove();" +
	                "});"
	            );
	        } catch (Exception ignored) {}
	    }


	    private boolean isGlitterVisible() {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	            WebElement glitter = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//*[contains(text(),'Already selected')]")
	                )
	            );
	            return glitter.isDisplayed();
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }
	    private boolean isDuplicateGlitterVisible() {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	            WebElement glitter = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//*[contains(text(),'Already selected')]")
	                )
	            );
	            return glitter.isDisplayed();
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }
	    private boolean waitForDuplicateGlitter(int seconds) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	            WebElement glitter = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//*[contains(text(),'Already selected')]")
	                )
	            );
	            return glitter.isDisplayed();
	        } catch (TimeoutException e) {
	            return false; 
	        }
	    }

	    private boolean isGlitterPresent() {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	            wait.until(ExpectedConditions.presenceOfElementLocated(
	                By.xpath("//*[contains(text(),'Already')]")
	            ));
	            return true;
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }

	    private void forceCloseGlitter() {
	        try {
	            WebElement close = driver.findElement(
	                By.xpath("//button[contains(@class,'glitter-close')]")
	            );
	            ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", close);
	            Thread.sleep(400);
	        } catch (Exception e) {
	          
	        }
	    }

	    private boolean waitForGlitter() {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//*[contains(text(),'Already')]")
	            ));
	            return true;
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }

	    private int getAllergyRowCount() {
	        try {
	            return driver.findElements(
	                By.xpath("//table[contains(@class,'allergy')]//tr")
	            ).size();
	        } catch (Exception e) {
	            return 0;
	        }
	    }

	    private boolean waitTillRowAdded(int beforeCount) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	            return wait.until(driver ->
	                    getAllergyRowCount() > beforeCount
	            );
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }
	  


	    public void Allergy(String AllergyRemarks) throws IOException, InterruptedException {

	        CommanUtill.clickFunction(ClickAllergyAddBtn, "Add Allergy");
	        switchToAllergyPopup();
	        CommanUtill.clickFunction(ClickFoodRadioBtn, "Food Radio");

	        int allergyIndex = 2;
	        int maxIndex = getDropdownOptionsCount(By.xpath(SelectAllergy));

	        boolean rowAdded = false;

	        while (allergyIndex <= maxIndex) {

	            int beforeCount = getAllergyRowCount();

	            CommanUtill.selectNthOptionFromDropdown(SelectAllergy, allergyIndex);
	            CommanUtill.selectSecondOptionFromDropdown(SelectReaction);
	            CommanUtill.selectSecondOptionFromDropdown(SelectAllergySince);

	            CommanUtill.clickFunction(ClickRadioHigh, "High");
	            CommanUtill.clickFunction(ClickInformedRadioBtn, "Informed");
	            CommanUtill.textEnter(TextRemarks, AllergyRemarks);

	            CommanUtill.clickFunction(ClickAddRowBtn, "Add Row");

	            boolean added = waitTillRowAdded(beforeCount);

	            if (added) {
	                rowAdded = true;
	                break; 
	            } else {
	                forceCloseGlitter();
	                allergyIndex++;
	            }
	        }

	        if (rowAdded) {
	            CommanUtill.clickFunction(ClickSaveAllergy, "Save Allergy");
	        } else {
	            log.warn("All allergy options duplicate. Save skipped.");
	        }
	    }



	  /*  public void Allergy(String AllergyRemarks) throws IOException, InterruptedException {
	        CommanUtill.clickFunction(ClickAllergyAddBtn, "Clicked on Allergy Add Button");
	        switchToAllergyPopup();
	        CommanUtill.clickFunction(ClickFoodRadioBtn, "Clicked on Food Radio Button");

	        int maxOptionIndex = getDropdownOptionsCount(By.xpath(SelectAllergy));
	        int allergyIndex = 2; 
	        boolean rowAdded = false;

	        while (allergyIndex <= maxOptionIndex) {

	            CommanUtill.selectNthOptionFromDropdown(SelectAllergy, allergyIndex);

	            CommanUtill.selectNthOptionFromDropdown(SelectReaction, 2);
	            CommanUtill.selectNthOptionFromDropdown(SelectAllergySince, 2);

	            CommanUtill.clickFunction(ClickRadioHigh, "Clicked High Severity");
	            CommanUtill.clickFunction(ClickInformedRadioBtn, "Clicked Informed");
	            CommanUtill.textEnter(TextRemarks, AllergyRemarks);

	            CommanUtill.clickFunction(ClickAddRowBtn, "Clicked Add Row");

	            boolean glitterAppeared = waitForGlitterMessage(2);  
	            boolean rowVisible = isLastAllergyRowAdded();

	            if (glitterAppeared) {
	                log.info("Duplicate allergy at index " + allergyIndex + ". Trying next option.");
	                waitForGritterToDisappear();
	              //  closeGlitterMessage();   
	                allergyIndex++;          
	                Thread.sleep(500);     
	                continue;                
	            }

	            if (rowVisible) {
	    
	                rowAdded = true;
	                log.info("Allergy row added successfully at index " + allergyIndex);
	                break; 
	            }

	            allergyIndex++;
	        }

	        if (rowAdded) {
	            CommanUtill.clickFunction(ClickSaveAllergy, "Clicked Save Allergy Popup");
	            log.info("Allergy saved successfully");
	        } else {
	            log.warn("No allergy row added. Save skipped!");
	        }
	    }*/

	    private boolean waitForGlitterMessage(int timeoutSeconds) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	            return wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//div[contains(@class,'glitter') and contains(text(),'Already selected')]")
	            )) != null;
	        } catch (TimeoutException e) {
	            return false; 
	        }
	    }

	    public void waitForGritterToDisappear() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.cssSelector(".gritter-item-wrapper")));
	    }
	
	    private boolean isLastAllergyRowAdded() {
	        try {
	          
	            WebElement lastRow = driver.findElement(By.xpath("//table[contains(@class,'allergy-grid')]//tr[last()]//td"));
	            return lastRow.isDisplayed();
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }

	
	    private void closeGlitterMessage() throws InterruptedException {
	        By glitterCloseBtn = By.xpath("//button[contains(@class,'glitter-close')]");
	        int attempts = 0;
	        while (attempts < 3) {
	            try {
	                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	                WebElement closeBtn = wait.until(ExpectedConditions.presenceOfElementLocated(glitterCloseBtn));
	                if (closeBtn.isDisplayed()) {
	                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeBtn);
	                    log.info("Glitter message forcefully closed.");
	                    Thread.sleep(500);
	                    break;
	                }
	            } catch (Exception e) {
	                Thread.sleep(500);
	            }
	            attempts++;
	        }
	    }

	 
	
	    public boolean clickAllRowsWithHighlight() {

	        System.out.println("▶ Started clicking td[16] for all rows");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        int row = 1;
	        boolean clicked = false;

	        while (true) {
	            try {

	                WebElement cell = wait.until(
	                        ExpectedConditions.elementToBeClickable(
	                                By.xpath("//table/tbody/tr[" + row + "]/td[16]")
	                        )
	                );

	                js.executeScript(
	                        "arguments[0].style.background='yellow'; arguments[0].style.border='3px solid red';",
	                        cell
	                );

	                Thread.sleep(300);

	                js.executeScript("arguments[0].click();", cell);

	                js.executeScript("arguments[0].style='';", cell);

	                System.out.println("✅ Clicked td[16] of row: " + row);

	                clicked = true;
	                row++;

	            } catch (TimeoutException e) {
	                System.out.println("⛔ No more rows found after row: " + (row - 1));
	                break;
	            } catch (Exception e) {
	                System.out.println("❌ Error at row: " + row + " → " + e.getMessage());
	                break;
	            }
	        }
	        return clicked;
	    }





	    public void NursingEndorsementToolFinal(String Facility, String Station, String Shift, String Diagnosis, String AllergyRemarks, 
	    		String VitalName, String LoginName, String LoginPass) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	Vitals(VitalName);
	    	Thread.sleep(500);
	    	Insertion();
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickEndorsementTool, "Clicked on The Endorsement Tool Tab");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectShift, Shift);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(Textdiagnosis, Diagnosis);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAllergyAddBtn, "Clicked on The Allergy Add BUtton");
	    	Thread.sleep(500);
	    	handleNursingEndorsement(Facility, Station, Shift, Diagnosis, AllergyRemarks);
	    	Thread.sleep(500);
	    	driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	        CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddPastMedicalHistory, "Clicked on The Past Medical History");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPastSurgicalHistory, "Clicked on The Close Past Surgical History");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickOBGHistory, "Clicked on The OBGH History");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddChiefCoplaint, "Clicked on The Add Chieg Complaints");;
            Thread.sleep(500);
            switchToAllergyPopup();
            Thread.sleep(500);
         //   clickChiefComplaint_ULTRAFAST();
            CommanUtill.clickByJSFunctionScroll(ClickAddChiefComplaint, "Clicked on The Add Chief Complaint");
            Thread.sleep(500);
            CommanUtill.clickByJSFunctionScroll(ClickDescription, "Clicked on The Description......");
            Thread.sleep(500);
            CommanUtill.clickByJSFunctionScroll(ClickItemDescription, "Clicked on The  Item  Description......");
            Thread.sleep(1000);
            fillAcuityAndNo_Combined();
            CommanUtill.clickByJSFunction(ClickSaveChiefComplaint, "Clicked on The Save Chief Complaint");
            Thread.sleep(500);
            driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	    	CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddChiefCoplaint, "Clicked on The Add Chief Complaints");;
            Thread.sleep(500);
	    	handleNursingEndorsementChiefComplaint(Facility, Station, Shift, Diagnosis, AllergyRemarks);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickVitalsAdd, "Clicked on The Vitals Add Button");
	    	Thread.sleep(500);
	    	switchToAllergyPopup();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddPatientVitals, "Clicked on The Add Ptient Vitals");
	     	Thread.sleep(500);
	     	enterVitalsData();
	     	CommanUtill.clickByJSFunction(ClickSaveVitalValues, "Clicked on The Save Vitals Value");
	     	Thread.sleep(500);
	   	    driver.switchTo().defaultContent();
	   	    Thread.sleep(500);
	   	    closeAllergyPopup(driver);
	   	    Thread.sleep(500);
	        CommanUtill.selectSecondOptionFromDropdown(SelectCentralnervousSyst);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectRestrain);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectEyesOpen);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectVerbalResponse);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectMotorResponse);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectPupilSize);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectGastro);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectDiet);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectElemination);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectIntake);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectGenerlCondition);
	        Thread.sleep(500);
	        Recommendations(LoginName,LoginPass);
	        Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickSaveEndorsementTool, "Clicked on The Save Endorsement Tool Save Button");
            Thread.sleep(500);
            CommanUtill.TextIfPresent(TextRemarksIfPresent, CommanUtill.generateRandomName(10));
            Thread.sleep(500);
            CommanUtill.clickIfPresent(ClickIfPresent, "Clicked If Present......");
       //     verifySuccessPopup(driver);
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(VerifySaveEndorsement, "Clicked on The Verify Endorsement Tool Button");
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickVerifyYesButton, "Clicked on The Verify Yes Button");
         //   Thread.sleep(500);
         //   verifySuccessPopup(driver);
            Thread.sleep(1000);
        	CommanUtill.ClickHomePage();
	    }
	  //=============================== Anup 27-04-2026 =================================  
	    
	    public void EmergrncyEndorsementToolFinal(String Facility, String Station, String Shift, String Diagnosis, String AllergyRemarks, 
	    		String VitalName, String LoginName, String LoginPass) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	//CommanUtill.clickFunction(emergency_dashbord, "Clicked on The Nursing Module Button");
	    	//Thread.sleep(500);
	    	//CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	//Thread.sleep(500);
	    	//CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	//Thread.sleep(500);
	    	//CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	//Thread.sleep(500);
	    	//CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    //Thread.sleep(500);
	    //	CommanUtill commanUtill = new CommanUtill();
		//	commanUtill.clickOnGreenPatient();
	    //	Thread.sleep(500);
	    //	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    //	Thread.sleep(500);
	    //	CommanUtill.clickByJSFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    //	Thread.sleep(500);
	    //	CommanUtill.clickFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    //	Thread.sleep(500);
	   // 	Vitals(VitalName);
	    //	Thread.sleep(500);
	    //	Insertion();
	    //	Thread.sleep(500);
	    	
	   // 	CommanUtill.clickByJSFunction(ClickEndorsementTool, "Clicked on The Endorsement Tool Tab");
	  //  	Thread.sleep(500);
	  //  	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectShift, Shift);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(Textdiagnosis, Diagnosis);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAllergyAddBtn, "Clicked on The Allergy Add BUtton");
	    	Thread.sleep(500);
	    	handleNursingEndorsement(Facility, Station, Shift, Diagnosis, AllergyRemarks);
	    	Thread.sleep(500);
	    	driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	        CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddPastMedicalHistory, "Clicked on The Past Medical History");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPastSurgicalHistory, "Clicked on The Close Past Surgical History");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickOBGHistory, "Clicked on The OBGH History");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddChiefCoplaint, "Clicked on The Add Chieg Complaints");;
            Thread.sleep(500);
            switchToAllergyPopup();
            Thread.sleep(500);
         //   clickChiefComplaint_ULTRAFAST();
            CommanUtill.clickByJSFunctionScroll(ClickAddChiefComplaint, "Clicked on The Add Chief Complaint");
            Thread.sleep(500);
            CommanUtill.clickByJSFunctionScroll(ClickDescription, "Clicked on The Description......");
            Thread.sleep(500);
            CommanUtill.clickByJSFunctionScroll(ClickItemDescription, "Clicked on The  Item  Description......");
            Thread.sleep(1000);
            fillAcuityAndNo_Combined();
            CommanUtill.clickByJSFunction(ClickSaveChiefComplaint, "Clicked on The Save Chief Complaint");
            Thread.sleep(500);
            driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	    	CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddChiefCoplaint, "Clicked on The Add Chief Complaints");;
            Thread.sleep(500);
	    	handleNursingEndorsementChiefComplaint(Facility, Station, Shift, Diagnosis, AllergyRemarks);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickVitalsAdd, "Clicked on The Vitals Add Button");
	    	Thread.sleep(500);
	    	switchToAllergyPopup();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddPatientVitals, "Clicked on The Add Ptient Vitals");
	     	Thread.sleep(500);
	     	enterVitalsData();
	     	CommanUtill.clickByJSFunction(ClickSaveVitalValues, "Clicked on The Save Vitals Value");
	     	Thread.sleep(500);
	   	    driver.switchTo().defaultContent();
	   	    Thread.sleep(500);
	   	    closeAllergyPopup(driver);
	   	    Thread.sleep(500);
	        CommanUtill.selectSecondOptionFromDropdown(SelectCentralnervousSyst);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectRestrain);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectEyesOpen);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectVerbalResponse);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectMotorResponse);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectPupilSize);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectGastro);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectDiet);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectElemination);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectIntake);
    	    Thread.sleep(500);
    	    CommanUtill.selectSecondOptionFromDropdown(SelectGenerlCondition);
	        Thread.sleep(500);
	        Recommendations(LoginName,LoginPass);
	        Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickSaveEndorsementTool, "Clicked on The Save Endorsement Tool Save Button");
            Thread.sleep(500);
            CommanUtill.TextIfPresent(TextRemarksIfPresent, CommanUtill.generateRandomName(10));
            Thread.sleep(500);
            CommanUtill.clickIfPresent(ClickIfPresent, "Clicked If Present......");
       //     verifySuccessPopup(driver);
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(VerifySaveEndorsement, "Clicked on The Verify Endorsement Tool Button");
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickVerifyYesButton, "Clicked on The Verify Yes Button");
         //   Thread.sleep(500);
         //   verifySuccessPopup(driver);
            Thread.sleep(1000);
        	CommanUtill.ClickHomePage();
	    }
	    
	/*    public void handleNursingEndorsement(String Facility, String Station, String Shift, String Diagnosis, String AllergyRemarks) throws IOException, InterruptedException {

	        if (isEndorsementDeleteAvailable()) {
	            DeleteNursingEndorsementTool(AllergyRemarks);
	        } else {
	        	AddNursingEndorsementTool(AllergyRemarks);
	        }
	    }*/
	    public void handleNursingEndorsement(
	            String Facility, String Station,
	            String Shift, String Diagnosis,
	            String AllergyRemarks
	    ) throws IOException, InterruptedException {

	        switchToAllergyPopup1();
	        Thread.sleep(500);

	        if (isEndorsementDeleteAvailable()) {
	            DeleteNursingEndorsementTool(AllergyRemarks);
	            Thread.sleep(500);
	        }

	        AddNursingEndorsementTool(AllergyRemarks);
	    }



	    public void DeleteNursingEndorsementTool(String AllergyRemarks ) throws IOException, InterruptedException {
	    	clickAllRowsWithHighlight();
	    	Thread.sleep(500);
	        CommanUtill.clickFunction(ClickSaveAllergy, "Clicked on The Save Allery Popup");
	    	Thread.sleep(500);
	    //	verifySuccessPopup(driver);
	        
	    	}
	    public void AddNursingEndorsementTool(String AllergyRemarks)throws IOException, InterruptedException {	            
	        CommanUtill.clickFunction(ClickFoodRadioBtn, "Food Radio");
	        Thread.sleep(300);
	        CommanUtill.selectSecondOptionFromDropdown(SelectAllergy);
	        Thread.sleep(300);
	        CommanUtill.selectSecondOptionFromDropdown(SelectReaction);
	        Thread.sleep(300);
	        CommanUtill.selectSecondOptionFromDropdown(SelectAllergySince);
	        Thread.sleep(300);
	        CommanUtill.clickFunction(ClickRadioHigh, "High Severity");
	        Thread.sleep(300);
	        CommanUtill.clickFunction(ClickInformedRadioBtn, "Informed");
	        Thread.sleep(300);
	        CommanUtill.textEnter(TextRemarks, AllergyRemarks);
	        Thread.sleep(300);
	        CommanUtill.clickFunction(ClickAddRowBtn, "Add Row");
	        Thread.sleep(300);
	        CommanUtill.clickFunction(ClickSaveAllergy, "Save Allergy");
	        Thread.sleep(500);
	        verifySuccessPopup(driver);
	    }

	    
	    public boolean isEndorsementDeleteAvailable() {

	        System.out.println("🔍 Checking endorsement delete availability");

	        List<WebElement> rows = driver.findElements(
	                By.xpath("//table/tbody/tr")
	        );

	        System.out.println("📊 Total rows found: " + rows.size());
	        return rows.size() > 0;
	    }

	    
	    public boolean EnterRandomValueFromTd8_RowWise() {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        Random random = new Random();

	        int row = 1;

	        while (true) {
	            try {

	         
	                List<WebElement> rows = driver.findElements(
	                    By.xpath("//fieldset[2]//tr[" + row + "]")
	                );

	                if (rows.isEmpty()) {
	                    System.out.println("❌ tr[" + row + "] nahi mila → LOOP BREAK");
	                    break;
	                }

	                List<WebElement> td8 = driver.findElements(
	                    By.xpath("//fieldset[2]//tr[" + row + "]/td[8]")
	                );

	                if (td8.isEmpty()) {
	                    System.out.println("❌ tr[" + row + "] me td[8] nahi → LOOP BREAK");
	                    break;
	                }

	                int col = 8;
	                while (true) {
	                    List<WebElement> nextTd = driver.findElements(
	                        By.xpath("//fieldset[2]//tr[" + row + "]/td[" + (col + 1) + "]")
	                    );
	                    if (nextTd.isEmpty()) break;
	                    col++;
	                }

	                WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//fieldset[2]//tr[" + row + "]/td[" + col + "]//input")
	                ));

	                js.executeScript("arguments[0].scrollIntoView({block:'center'});", input);
	                Thread.sleep(200);

	                input.clear();
	                int value = random.nextInt(200) + 1;
	                input.sendKeys(String.valueOf(value));

	                System.out.println("✅ tr[" + row + "] td[" + col + "] value = " + value);

	                row++;

	            } catch (Exception e) {
	                System.out.println("❌ Exception at tr[" + row + "] → LOOP BREAK");
	                e.printStackTrace();
	                break;
	            }
	        }

	        driver.switchTo().defaultContent();
	        return true;
	    }



	    public boolean clickAllRowsTd12WithHighlight() {

	        System.out.println("▶ Started clicking td[12] for all rows");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        int row = 1;
	        boolean clicked = false;

	        while (true) {
	            try {

	                String xpath = "/html/body/div[1]/form/div/div/div[2]/div[1]/table/tbody/tr[" 
	                                + row + "]/td[12]";

	                WebElement cell = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(xpath))
	                );

	                js.executeScript(
	                        "arguments[0].style.background='yellow'; arguments[0].style.border='3px solid red';",
	                        cell
	                );

	                Thread.sleep(300);

	                js.executeScript("arguments[0].click();", cell);

	                js.executeScript("arguments[0].style='';", cell);

	                System.out.println("✅ Clicked td[12] of row: " + row);

	                clicked = true;
	                row++;

	            } catch (TimeoutException e) {
	                System.out.println("⛔ No more rows found after row: " + (row - 1));
	                break;
	            } catch (Exception e) {
	                System.out.println("❌ Error at row: " + row + " → " + e.getMessage());
	                break;
	            }
	        }
	        return clicked;
	    }

	    public void handleNursingEndorsementChiefComplaint(
	            String Facility, String Station, String Shift, 
	            String Diagnosis, String AllergyRemarks) 
	            throws IOException, InterruptedException {

	        switchToAllergyPopup1();
	        Thread.sleep(500);

	        if (isEndorsementDeleteChiefAvailable()) {
	            System.out.println("🗑 Existing endorsement found → Deleting");
	            DeleteNursingEndorsementToolChief(AllergyRemarks);
	            Thread.sleep(500);
	        } else {
	            System.out.println("➕ No existing endorsement found");
	        }

	        AddNursingEndorsementToolChief(AllergyRemarks);
	    }


	    public boolean isEndorsementDeleteChiefAvailable() {

	        System.out.println("🔍 Checking endorsement delete chief availability (td[12])");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        int row = 1;

	        while (true) {
	            try {

	                String xpath = "/html/body/div[1]/form/div/div/div[2]/div[1]/table/tbody/tr["
	                                + row + "]/td[12]";

	                WebElement cell = wait.until(
	                        ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))
	                );

	                System.out.println("✅ td[12] found at row: " + row);
	                return true;  

	            } catch (TimeoutException e) {
	                System.out.println("⛔ No td[12] found till row: " + (row - 1));
	                return false;
	            } catch (Exception e) {
	                System.out.println("❌ Error while checking row: " + row + " → " + e.getMessage());
	                return false;
	            }
	        }
	    }


	    public void DeleteNursingEndorsementToolChief(String AllergyRemarks)throws IOException, InterruptedException {	            
           clickAllRowsTd12WithHighlight();   
	        Thread.sleep(500);
	        CommanUtill.clickByJSFunction(ClickSaveChiefComplaint, "Clicked on The Save Chief Complaint"   );	            	           	     
	        Thread.sleep(500);
	      //  verifySuccessPopup(driver);
	    }

	        
	    	
	    public void AddNursingEndorsementToolChief(String AllergyRemarks)throws IOException, InterruptedException {           
	        clickChiefComplaint_ULTRAFAST();
	        Thread.sleep(1000);
	        fillAcuityAndNo_Combined();
	        CommanUtill.clickByJSFunction(  ClickSaveChiefComplaint,"Clicked on The Save Chief Complaint" );	          	           
	        Thread.sleep(500);
	    //    verifySuccessPopup(driver);    
	        driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	    	CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    }



	    
	    public void NursingEndorsementTool(String Facility, String Station, String Shift, String Diagnosis, 
	    		String AllergyRemarks, String VitalName) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	Vitals(VitalName);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickEndorsementTool, "Clicked on The Endorsement Tool Tab");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectShift, Shift);
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(Textdiagnosis, Diagnosis);
	    	Thread.sleep(500);
	   /* 	CommanUtill.clickFunction(ClickAllergyAddBtn, "Clicked on The Allergy Add BUtton");
	    	switchToAllergyPopup() ;	
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickFoodRadioBtn, "Clicked on The Food Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectAllergy);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectReaction);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectAllergySince);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickRadioHigh, "Clicked on The High Severity Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickInformedRadioBtn, "Clicked on The Informed Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextRemarks, AllergyRemarks);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddRowBtn, "Clicked on The Add Row Button");
	    	Thread.sleep(500);
	        CommanUtill.clickFunction(ClickSaveAllergy, "Clicked on The Save Allery Popup");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(1000);*/
	    //	Allergy(AllergyRemarks);
	    //	driver.switchTo().defaultContent();
	    //	Thread.sleep(1000);
	    	//closeAllergyPopup(driver);
	      //  CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	   /* 	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddPastMedicalHistory, "Clicked on The Past Medical History");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickPastSurgicalHistory, "Clicked on The Close Past Surgical History");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickOBGHistory, "Clicked on The OBGH History");
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickClosePastMedicalHistory, "Clicked on The Close Past History Popup");
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddChiefCoplaint, "Clicked on The Add Chieg Complaints");;
            Thread.sleep(500);
            switchToAllergyPopup();
            Thread.sleep(500);
            clickChiefComplaint_ULTRAFAST();
            Thread.sleep(1000);
            fillAcuityAndNo_Combined();
            // if we want single Select 
           /* selectSecondOptionForAllAcquityDropdowns_Fast();
            Thread.sleep(1000);
            enterRandomNumberForAllNoTextboxes();*/
      /*      verifySuccessPopup(driver);
            Thread.sleep(500);
            CommanUtill.clickByJSFunction(ClickSaveChiefComplaint, "Clicked on The Save Chief Complaint");
            Thread.sleep(500);
            driver.switchTo().defaultContent();
	    	Thread.sleep(1000);
	    	CommanUtill.clickByJSFunction(ClickCloseAlleryPopup, "Clicked on The Close Allergy Popup");
	    	Thread.sleep(500);*/
	    /*	CommanUtill.clickFunction(ClickAddChiefCoplaint, "Clicked on The Add Chieg Complaints");;
            Thread.sleep(500);
	    	handleNursingEndorsementChiefComplaint(Facility, Station, Shift, Diagnosis, AllergyRemarks);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickVitalsAdd, "Clicked on The Vitals Add Button");
	    	Thread.sleep(500);
	    	switchToAllergyPopup();
	    	Thread.sleep(500);*/
	    	
	  	    
	    	CommanUtill.clickFunction(ClickVitalsAdd, "Clicked on The Vitals Add Button");
	    	Thread.sleep(500);
	    	switchToAllergyPopup();
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddPatientVitals, "Clicked on The Add Ptient Vitals");
	     	Thread.sleep(500);
	     	enterVitalsData();
	     	CommanUtill.clickByJSFunction(ClickSaveVitalValues, "Clicked on The Save Vitals Value");
	     	Thread.sleep(500);
	   	    driver.switchTo().defaultContent();
	   	    Thread.sleep(500);
	   	  //  CommanUtill.clickByJSFunction(ClickVitalsClosePopup, "Clicked on The Vitals Close Button");
	   	 closeAllergyPopup(driver);
	    // 	EnterRandomValueFromTd8_RowWise();
	    
	
	    	Thread.sleep(500);
	    	firstClickWithHighlightVitals();
	    	
	    	CommanUtill.selectSecondOptionFromDropdown(SelectCentralnervousSyst);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectRestrain);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectEyesOpen);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectVerbalResponse);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectMotorResponse);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectPupilSize);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectGastro);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDiet);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectElemination);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectIntake);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickAddInsertionMonitoring, "Clicked on The Add Insertion Button");
	    	Thread.sleep(500);
	    	driver.manage().window().maximize();       
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(selectTypeofInsertion);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectSite);

	    	
            }
	    
	    public boolean firstClickWithHighlightRowSelectVitals() {

	        logger.log(Status.INFO, "Started searching for FIRST clickable td[1] cell");
	        log.info("Started searching for FIRST clickable td[1] cell");
	        System.out.println("▶ Started searching for FIRST clickable td[1] cell");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        List<WebElement> rows = driver.findElements(
	                By.xpath("/html/body/div[1]/div[3]/div[1]/fieldset/div/div[1]/div[2]/table/tbody/tr")
	        );

	        int maxRows = rows.size();
	        System.out.println("📊 Total rows found: " + maxRows);

	        for (int i = 1; i <= maxRows; i++) {

	            try {

	                String cellXpath =
	                        "/html/body/div[1]/div[3]/div[1]/fieldset/div/div[1]/div[2]/table/tbody/tr[" 
	                        + i + "]/td[1]";

	                WebElement element = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(cellXpath))
	                );

	                logger.log(Status.INFO, "Row " + i + " td[1] is clickable, highlighting");
	                log.info("Row " + i + " td[1] is clickable, highlighting");

	                js.executeScript(
	                        "arguments[0].setAttribute('style'," +
	                        "'background: yellow; border: 3px solid green;');",
	                        element
	                );

	                Thread.sleep(500);
	                js.executeScript("arguments[0].setAttribute('style','');", element);

	                element.click();

	                logger.log(Status.PASS, "Clicked successfully on FIRST clickable td[1], row: " + i);
	                log.info("Clicked successfully on FIRST clickable td[1], row: " + i);
	                System.out.println("✅ Clicked successfully on FIRST clickable row: " + i);

	                return true;

	            } catch (Exception e) {
	                System.out.println("❌ Row " + i + " td[1] not clickable → Trying next row");
	                log.warn("Row " + i + " td[1] not clickable, trying next row", e);
	            }
	        }

	        logger.log(Status.FAIL, "No clickable td[1] cell found in table");
	        log.error("No clickable td[1] cell found in table");
	        System.out.println("❌ No clickable td[1] cell found in table");

	        return false;
	    }

	    public boolean clickAllRowsTd2WithHighlightDeletVitals() {

	        System.out.println("▶ Started clicking td[2] for all rows (New Table)");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	        int row = 1;
	        boolean clicked = false;

	        while (true) {
	            try {

	                String xpath =
	                        "/html/body/div[1]/div[3]/div[1]/fieldset/div/div[2]/div[2]/table/tbody/tr[" 
	                        + row + "]/td[2]";

	                WebElement cell = wait.until(
	                        ExpectedConditions.elementToBeClickable(By.xpath(xpath))
	                );

	                js.executeScript(
	                        "arguments[0].style.background='yellow';" +
	                        "arguments[0].style.border='3px solid red';",
	                        cell
	                );

	                Thread.sleep(300);

	                js.executeScript("arguments[0].click();", cell);

	                js.executeScript("arguments[0].setAttribute('style','');", cell);

	                System.out.println("✅ Clicked td[2] of row: " + row);

	                clicked = true;
	                row++;

	            } catch (TimeoutException e) {
	                System.out.println("⛔ No more rows found after row: " + (row - 1));
	                break;
	            } catch (Exception e) {
	                System.out.println("❌ Error at row: " + row + " → " + e.getMessage());
	                break;
	            }
	        }

	        return clicked;
	    }

	    public boolean isElementPresent(By by) {
	        try {
	            return driver.findElements(by).size() > 0;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	/*    public void enterVitalsData() {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        int row = 1;

	        while (true) {

	            String baseXpath = "/html/body/div[1]/div[3]/fieldset[2]/div[2]/table/tbody/tr[" + row + "]/td[8]";
	            By baseCell = By.xpath(baseXpath);

	            if (!isElementPresent(baseCell)) {
	                System.out.println("🛑 Row " + row + " td[8] not available. Stopping.");
	                break;
	            }

	            WebElement baseElement = driver.findElement(baseCell);

	            if (!baseElement.isEnabled()) {
	                System.out.println("🛑 Row " + row + " td[8] disabled. Stopping.");
	                break;
	            }

	            int col = 8;

	            while (true) {

	                String xpath = "/html/body/div[1]/div[3]/fieldset[2]/div[2]/table/tbody/tr[" 
	                                + row + "]/td[" + col + "]";

	                By cell = By.xpath(xpath);

	                if (!isElementPresent(cell)) {
	                    System.out.println("⛔ Column td[" + col + "] not available. Move to next row.");
	                    break;
	                }

	                WebElement element = driver.findElement(cell);

	                if (!element.isEnabled()) {
	                    System.out.println("⛔ Column td[" + col + "] disabled. Move to next row.");
	                    break;
	                }

	                js.executeScript("arguments[0].style.border='2px solid yellow'", element);
	                element.click();
	                element.clear();
	                element.sendKeys(CommanUtill.generateRandomMobileNumber1(2));

	                System.out.println("✅ Value entered at row " + row + " col " + col);

	                col++;
	            }

	            row++; 
	        }
	    }*/

	    public void enterVitalsData() {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        int row = 1;

	        while (true) {

	            String firstXpath = "/html/body/div[1]/div[3]/fieldset[2]/div[2]/table/tbody/tr[" + row + "]/td[8]";
	            By firstCell = By.xpath(firstXpath);

	            if (!isElementPresent(firstCell)) {
	                System.out.println("🛑 Row " + row + " td[8] not present. STOP.");
	                break;
	            }

	            WebElement currentElement = driver.findElement(firstCell);

	            if (!currentElement.isEnabled()) {
	                System.out.println("🛑 Row " + row + " td[8] disabled. STOP.");
	                break;
	            }

	            js.executeScript("arguments[0].style.border='2px solid yellow'", currentElement);
	            currentElement.click();
	            currentElement.sendKeys(CommanUtill.generateRandomMobileNumber1(2));

	            System.out.println("✅ Value entered at row " + row + " col 8");

	            int col = 9;

	            while (true) {
	                try {
	                    String colXpath = "/html/body/div[1]/div[3]/fieldset[2]/div[2]/table/tbody/tr[" 
	                                        + row + "]/td[" + col + "]";
	                    By cell = By.xpath(colXpath);

	                    if (!isElementPresent(cell)) {
	                        System.out.println("⛔ td[" + col + "] not present → next row");
	                        break;
	                    }

	                    WebElement nextElement = driver.findElement(cell);

	                    if (!nextElement.isEnabled()) {
	                        System.out.println("⛔ td[" + col + "] disabled → next row");
	                        break;
	                    }

	            
	                    currentElement.sendKeys(Keys.TAB);
	                    currentElement = nextElement;

	                    js.executeScript("arguments[0].style.border='2px solid yellow'", currentElement);
	                    currentElement.sendKeys(CommanUtill.generateRandomMobileNumber1(2));

	                    System.out.println("✅ Value entered at row " + row + " col " + col);

	                    col++;

	                } catch (Exception e) {
	                    System.out.println("⛔ Stop row " + row + " at col " + col);
	                    break;
	                }
	            }

	            row++;
	        }
	    }






	    public void Vitals(String VitalName) throws IOException, InterruptedException {
	    	CommanUtill.clickFunction(ClickVitals, "Clicked on The Vitals Tab");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickVitalMapping, ClickAbdominalPain);
	    	Thread.sleep(500);
	    	clickAllRowsTd2WithHighlightDeletVitals();
	    	Thread.sleep(500);
	    	CommanUtill.textEnter(TextSearchVitals, VitalName);
	    	Thread.sleep(500);
	    	firstClickWithHighlightRowSelectVitals();
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickVitalMappingSave, "Clicked on The Vital Mapping Save");
	    	Thread.sleep(500);
	    //	verifySuccessPopup(driver);
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	
	    	}
	    
	    public void Insertion() throws IOException, InterruptedException {
	    	CommanUtill.clickFunction(ClickInsertionMonitoring, "Clicked on The Insertion Monitor");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(selectTypeofInsertion);
	    	Thread.sleep(1500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectSite);
	    	Thread.sleep(1000);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectDrugDressing);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickMonitorInsetionSave, "Clicked on The Insertion monitor Save");
	    	Thread.sleep(500);
	    //	verifySuccessPopup(driver);
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	
	    }
	    
	    public void Recommendations(String LoginName, String LoginPass) throws IOException, InterruptedException {
	    CommanUtill.textEnter(TextLoginName, LoginName);
	    Thread.sleep(500);
	    CommanUtill.textEnter(TextLoginPassword, LoginPass);
	    Thread.sleep(500);
	    CommanUtill.clickFunction(ClickSaveLoginCredentials, "Clicked on The Save Login Credentials");
	    }
	    
	    public void PainAssesment(String Facility, String Station) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickPainAssesment, "Clicked on The Pain Assesment");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectParticipatingFactor);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectTypeofPain);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectPainScore);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectMusclePowerGrading);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectFrequency);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickSavePain, "Clicked on The Save Yes Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickYesBtn, "Clicked On The Save Yes Button");
	    	Thread.sleep(500);
	    	lastClickWithHighlightPainAssesment();
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectPostInventionScore);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickSaveIntervention, "Clicked on The Save Intervention Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(1500);
	    	lastClickWithHighlightPainAssesment();
	    	Thread.sleep(1500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectPostInventionScore);
	    	Thread.sleep(1500);
	    	CommanUtill.clickByJSFunction(ClickVerifyButtonIntervention, "Clicked on The Verify Intervention Button");
	    	Thread.sleep(500);
	    	verifySuccessPopup(driver);
	    	Thread.sleep(1500);
	    	lastClickWithHighlightPainAssesmentSearch();
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
	    }
	    
	    public void NurseCarePlan(String Facility, String Station) throws IOException, InterruptedException {
	    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	    	Thread.sleep(500);
	    	CommanUtill.clickFunction(ClickNursingModule, "Clicked on The Nursing Module Button");
	    	Thread.sleep(500);
	    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Select Station Yes Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivity, "Clicked On The Nursing Activity Link");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingActivityLink, "Clicked on The Nursing Activity");
	    	Thread.sleep(500);
	    	CommanUtill commanUtill = new CommanUtill();
			commanUtill.clickOnGreenPatient();
	    	Thread.sleep(500);
	    	CommanUtill.clickIfPresent(ClickAcknowledge, "Clicked on The Acknowledge Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingNotes, "Clicked on The Nursing Notes");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNursingTemplateRadioBtn, "Clicked on The Nursing Template Radio Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickNurseCarePlan, "Clicked on The NurseCarePlan");
	    	Thread.sleep(500);
	    	CommanUtill.switchToNewWindow(driver);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectNurseAssesment);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectProblemIdentified);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectGoal);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectNurseIntervention);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectImplementation);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectOutcome);
	    	Thread.sleep(500);
	    	CommanUtill.selectSecondOptionFromDropdown(SelectSpecialNotes);
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickAddBtn, "Clicked on The Add Item Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickSaveBtncp, "Clicked on The Nurse Care Plan Save Button");
	    	Thread.sleep(500);
	    	CommanUtill.clickByJSFunction(ClickVerifyBtncp, "Clicked on The Nurse Care Plan Verify Button");
	    	Thread.sleep(1000);
	    	CommanUtill.ClickHomePage();
}
}