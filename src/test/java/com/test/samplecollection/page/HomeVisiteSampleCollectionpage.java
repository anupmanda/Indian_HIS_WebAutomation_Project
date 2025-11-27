/**
 * 
 */
package com.test.samplecollection.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 26-Jul-2025
 */
public class HomeVisiteSampleCollectionpage extends  GeneralBrowserSetting{
	
	    protected static String home_three_line =   "//img[@id='showmenuIcon']";
	    protected static String home_visite_sample_collection_page =   "//span[normalize-space()='Home Visit Sample Collection']";
		protected static String home =   "//input[@id='uhId']";
		protected static String serach=   "//a[@id='homevisit_searchUHID']//i[@class='fa fa-search']";
		protected static String from_date =   "//input[@id='FromDate']";
		protected static String to_date =   "//input[@id='ToDate']";
		protected static String serach_all =   "//a[@id='homevisit_search']//i[@class='fa fa-search']";
		protected static String assign_phlebotomist_chk =   "//input[@id='all_checkbox']";
		protected static String save =   "a[id='save_homevisit_sample'] i[class='fa fa-save']";
		protected static String clear =   "//i[@class='fa fa-refresh']";
		
		protected static String phlebotomist_area  =   "//select[@id='PhlebotomistArea']";
		protected static String phlebotomist_name  =   "//select[@id='phlebotomist12']";
		protected static String date_phlebotomist =   "//input[@id='DatePhleb']";
		protected static String visite_time  =   "//select[@id='visitTimePhleb']";
		protected static String save_phlebotomist  =   "//a[@id='btn_home_sample_ok']";
		
		
		public void goToHomePageThreeLineIcon(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.clickFunction(home_three_line, fieldName);
			
		}
		
		
		
	    public void clickHomeVisitSampleCollectionPage(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(home_visite_sample_collection_page, fieldName);
	    }

	  
	    public void enterUHID(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(home, fieldName);
	    }

	  
	    public void clickSearchUHID(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.clickFunction(serach, fieldName);
	    }

	   
	    public void enterFromDate(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(from_date, fieldName);
	      //  WebElement from = driver.findElement(By.xpath(from_date));
	     //   from.sendKeys(Keys.ENTER);
	    }

	    
	    public void enterToDate(String fieldName) throws IOException, InterruptedException {
	    	
	        CommanUtill.textEnter(to_date, fieldName);
	        WebElement to = driver.findElement(By.xpath(to_date));
	        to.sendKeys(Keys.ENTER);
	    }

	   
	    public void clickSearchAll(String fieldName) throws IOException, InterruptedException {
	        CommanUtill.clickFunction(serach_all, fieldName);
	    }

	   
	    public void clickAssignPhlebotomistCheckbox(String fieldName) throws IOException, InterruptedException {
	        CommanUtill.clickFunction(assign_phlebotomist_chk, fieldName);
	    }

	    
	    public void clickSaveButton(String fieldName) throws IOException, InterruptedException {
	        CommanUtill.clickFunction(save, fieldName);
	    }

	    
	    public void clickClearButton(String fieldName) throws IOException, InterruptedException {
	        CommanUtill.clickFunction(clear, fieldName);
	    }
	    

		public void selectByPhlebotomistHomeAreaDropdwon(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.dropdownSelectByVisibleText(phlebotomist_area, fieldName);
			
		}
       
		public void selectByPhlebotomistHomeNameDropdwon(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.dropdownSelectByVisibleText(phlebotomist_name, fieldName);
			
		}
		
		public void enterOnDatePhlebotmistHomeVisite(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.enter(date_phlebotomist, fieldName);
			
		}
		
		public void SelectByHomeVisiteTimeDropDwon(String fieldName) throws IOException, InterruptedException {
			
			CommanUtill.dropdownSelectByVisibleText(visite_time, fieldName);
		}
		
		public void clickOnphlebotmistHomeOKButtonPopup(String fieldName) throws IOException, InterruptedException {	
			
			CommanUtill.clickFunction(save_phlebotomist, fieldName);
			
		}
	}


