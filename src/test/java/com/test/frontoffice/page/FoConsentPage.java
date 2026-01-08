/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 26-Dec-2025
 */
public class FoConsentPage extends GeneralBrowserSetting {
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String cosent_page = "//a[normalize-space()='Consent']";
	
	//------------------------ Consent Page--------------------------
	protected static String enter_uhid = "//input[@id='txtUhid']";
	protected static String frome_date = "//form[@id='Patient_Consent']//span[3]";
	protected static String to_date = "//form[@id='Patient_Consent']//span[4]";
	protected static String cosent_serach = "//a[@id='search_episode']//i[@class='fa fa-search']";
	protected static String cheek_box_view_all = "//input[@id='viewAllConsent']";
	protected static String chkk_save_without_visit = "//input[@id='saveWithoutVisit']";
	protected static String episode_doctor_table_click = "//div[@class='episodeDiv']//table//tr[2]";
	protected static String select_template_drp = "//select[@id='templateId']";
	protected static String plush_icon = "//i[@title='Add Row']";
	
	protected static String doctor_signature_tem_popup = "//button[@id='signature_doc']";
	
	protected static String doctor_authentication_username = "//input[@id='Log_Name']";
	protected static String doctor_authentication_password = "//input[@id='Doc_Pass']";
	protected static String doctor_authentication_ok = "//button[@id='doc_AuthOk']";
	
	protected static String template_sing_icon = "//a[@id='VerifyConsent']";
	protected static String template_save = "//a[@id='SaveConsent']";
	protected static String veriyf_btn_popup_ok = "//button[@id='VerifyPopOk']";
	protected static String template_close = "//a[@id='CloseConsent']";
	protected static String template_clear = "//a[@id='Clear']//i[@class='fa fa-refresh']";
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	    }
	
	public void FoAddpatientmeanu(String add_patient ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
	   }
	
   public void clickOnConsentPage(String consent_page) throws IOException, InterruptedException {
		
	   // CommanUtill.clickFunction(cosent_page, consent_page);
		CommanUtill.clickTabSwitchToAnotherWindow(cosent_page, consent_page);
    	}
   
    public void enterUHID(String uhid) throws IOException, InterruptedException {
	  
	  CommanUtill.textEnter(enter_uhid, uhid);
	  driver.findElement(By.xpath(enter_uhid)).sendKeys(Keys.ENTER);
       }

    public void enterFromDateAndToDate(String From_date , String To_Date) throws IOException, InterruptedException {
	  
	  CommanUtill.textEnter(frome_date, From_date);
	  CommanUtill.textEnter(to_date, To_Date);
	   
  }
    /*
    private String convertExcelDateToBrowser(String excelDate) {

        DateTimeFormatter browserFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter excelFormat;

        if (excelDate.contains("/")) {
            excelFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        } else if (excelDate.contains("-")) {
            excelFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        } else {
            throw new RuntimeException("Unsupported date format: " + excelDate);
        }

        return LocalDate.parse(excelDate, excelFormat).format(browserFormat);
    }

    public void enterFromDateAndToDate(String From_date, String To_Date)
            throws IOException, InterruptedException {

        String fromDateValue = convertExcelDateToBrowser(From_date);
        String toDateValue   = convertExcelDateToBrowser(To_Date);

        WebElement fromDate = driver.findElement(By.xpath("//input[@id='FromDate']"));
        WebElement toDate   = driver.findElement(By.xpath("//input[@id='ToDate']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].removeAttribute('readonly');" +
                "arguments[0].value=arguments[1];",
                fromDate, fromDateValue);

        Thread.sleep(500);

        js.executeScript(
                "arguments[0].removeAttribute('readonly');" +
                "arguments[0].value=arguments[1];",
                toDate, toDateValue);
    }
 */ 
    
    public void clickOnSerachIcon(String Serach_icon) throws IOException, InterruptedException {
    	
    	CommanUtill.clickFunction(cosent_serach, Serach_icon);
    	
    }
    
    public void clickOnEpisodeTable(String episode) throws IOException, InterruptedException {
    	
    	CommanUtill.clickFunction(episode_doctor_table_click, episode);
    }
    
    public void selectByTemplateDropdwon(String template) throws IOException, InterruptedException {
    	
    	CommanUtill.dropdownSelectByVisibleText(select_template_drp, template);
    }
    
    public void clickOnAddPlushIcon(String add_plush) throws IOException, InterruptedException {
    	
    	CommanUtill.clickFunction(plush_icon, add_plush);
    }
    
    public void clickOnTemplateDoctorSignature(String sing) throws IOException, InterruptedException {
    	
    	CommanUtill.clickFunction(doctor_signature_tem_popup, sing);
 
    }
    
    public void enterDoctorAuthenticationVerificationPopup(String login_user , String passpord , String ok_btn) 
    		throws IOException, InterruptedException {
    	
    	CommanUtill.textEnter(doctor_authentication_username, login_user);
    	CommanUtill.textEnter(doctor_authentication_password, passpord);
    	CommanUtill.clickFunction(doctor_authentication_ok, ok_btn);
    }
  /*  
    public void templateSingedAndSaveBtn(String Sing , String Save_icon) throws IOException, InterruptedException {
    	
    	CommanUtill.clickFunction(template_sing_icon, Sing);
    	//Thread.sleep(500);
    	CommanUtill.clickFunction(template_save, Save_icon);
    	
    }
  */
    public void templateSingedAndSaveBtn(String sign ) throws IOException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // STEP 1: Wait until Verify button is present & visible
        WebElement verifyBtn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("VerifyConsent"))
        );

        // STEP 2: Scroll into view (header overlay issue)
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", verifyBtn);

        Thread.sleep(500);

        // STEP 3: FORCE JS CLICK (ignore disable_a_href & overlays)
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", verifyBtn);

    }
    
    public void TemplateSavePopup(String saveIcon)throws IOException , InterruptedException{
    	
    	  CommanUtill.clickFunction(template_save, saveIcon);
    }
    
    public void verifyOkButtonPopup(String Ok_vrify_btn) throws IOException , InterruptedException{
    	
    	if (CommanUtill.isElementPresent(veriyf_btn_popup_ok)) {
			CommanUtill.clickFunction(veriyf_btn_popup_ok, Ok_vrify_btn);
			System.out.println("Verify Btn popup appeared and was Ok.");
		} else {
			System.out.println("Verify popup did not appear.");
		}
    }
       public void closeTemplatePopup(String close_tem) throws IOException, InterruptedException { 
    	
    	CommanUtill.clickFunction(template_close, close_tem);	
    }
    public void TemplateClaerPopup(String Clear_icon) throws IOException, InterruptedException { 
	 
	 CommanUtill.clickFunction(template_clear, Clear_icon);
	 
 }
     

}
