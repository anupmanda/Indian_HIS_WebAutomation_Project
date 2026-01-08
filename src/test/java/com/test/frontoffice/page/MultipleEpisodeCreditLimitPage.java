/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 24-Dec-2025
 */
public class MultipleEpisodeCreditLimitPage extends GeneralBrowserSetting {

	public static String globalUHID;
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String multipleEpisodeCreate_limit_page = "//a[normalize-space()='Multiple Episode Credit Limit']";
	
	//---------------------Multiple Episode Credit Limit ----------------------------------------
	
	protected static String enter_uhid = "//input[@id='txtUhid']";
	protected static String new_credite_limit = "//input[@id='txtNewCreditLimit']";
	protected static String from_date = "//input[@id='txtFromDate']";
	protected static String to_date = "//input[@id='txtToDate']";
	protected static String company_type_drp = "//select[@id='drdCompanyType']";
	protected static String company_drp = "//select[@id='drdCompany']";
	protected static String rate_contract = "//select[@id='drdRateContract']";
	
	protected static String show_all_company_chkk = "//input[@id='chckShowAll']";
	protected static String auth_claim_No = "//input[@id='txtPreApprovalNo']";
	protected static String approval_date = "//input[@id='txtPreApprovalDate']";
	
	protected static String active_chkk_box = "//input[@id='chkActive']";
	protected static String select_all_check_box = "//input[@id='chkSelectAll']";
	protected static String save_icon = "//a[@id='btnSave']//i[@class='fa fa-save']";
	
//-----------------------Home Page ----------------------------------
	
	protected static String side_meanu = "//img[@id='showmenuIcon']";
	protected static String home_page = "//a[normalize-space()='HOME']";
	
	//protected static String save_icon = "//a[@id='btnSave']//i[@class='fa fa-save']";
	
	
	
	
	

	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void clickOnAddPatientMeanu(String add_patient ) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
		//driver.findElement(By.partialLinkText("Multiple Episode Credit Limit")).click();
	}
	
	public void clickOnMultipleEpisodeCrediteLimit(String multiple_epi)throws IOException, InterruptedException {
		
		//CommanUtill.clickFunction(multipleEpisodeCreate_limit_page, multiple_epi);
		CommanUtill.clickTabSwitchToAnotherWindow(multipleEpisodeCreate_limit_page, multiple_epi);
	}
	
	public void enterUHIDMultipleEpisodeCreditLimit(String Uhid) throws IOException, InterruptedException {

        globalUHID = Uhid;
        CommanUtill.textEnter(enter_uhid, Uhid);

        System.out.println("Stored UHID (Multiple Episode Credit Limit) : " + globalUHID);
    }

    public String getUHIDMultipleEpisodeCreditLimit() {
        return globalUHID;
    }

     public void enterNewCreditLimit(String credite_limit) throws IOException, InterruptedException { 
		
		CommanUtill.textEnter(new_credite_limit, credite_limit);
	}
    /* 
     public void fromAndToDate(String Fron_date , String To_Date) throws IOException, InterruptedException { 
    	 
    	 CommanUtill.textEnter(from_date, Fron_date);
    	 CommanUtill.textEnter(to_date, To_Date);
     }
    */ 
     public void fromAndToDate(String From_Date, String To_Date) throws IOException, InterruptedException {

    	    // FROM DATE
    	    WebElement fromDate = driver.findElement(By.xpath(from_date));
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].value='';", fromDate);
    	    fromDate.sendKeys(From_Date);
    	    fromDate.sendKeys(Keys.TAB);
            Thread.sleep(1000);
    	    
    	    // TO DATE
    	    WebElement toDate = driver.findElement(By.xpath(to_date));
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].value='';", toDate);
    	    toDate.sendKeys(To_Date);
    	    toDate.sendKeys(Keys.TAB);
    	}
     
   public void selectByCompanyTyp_Company_RateContractDrp(String company_type , String Company , String Rate_Contract) throws IOException, InterruptedException { 
    	 
    	 CommanUtill.dropdownSelectByVisibleText(company_type_drp, company_type);
    	 CommanUtill.dropdownSelectByVisibleText(company_drp, Company);
    	 CommanUtill.dropdownSelectByVisibleText(rate_contract, Rate_Contract);
     }
   public void Auth_ClaimNumber(String Auth_number)	 throws IOException, InterruptedException { 
	   
	   CommanUtill.textEnter(auth_claim_No, Auth_number);
   }
   
   public void saveMultipleEpisodeCreditLimit(String save) throws IOException, InterruptedException { 
	   
	   CommanUtill.clickFunction(save_icon, save);
	   
   }
   
   public void MeanuToHomeDashBord(String meanu ,String Home) throws IOException , InterruptedException { 
	   
	   CommanUtill.clickFunction(side_meanu, meanu);
	   CommanUtill.clickFunction(home_page, Home);
	
	   
       }   
   }
	
