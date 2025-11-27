/**
 * 
 */
package com.test.inventory.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 06-Jul-2025
 */
     public class InventoryDirectReceiptPage extends GeneralBrowserSetting{

    	 protected static String facility = "//select[@id='Facility']";
    	 protected static String dashbord_inventory = "//img[@src='/sanitywebhistree/images/UpdateIcons/inventory.png']";
    	 protected static String department = "//select[@id='Department']";
    	 protected static String department_yes_popup = "//a[@id='btn_yes_desh']";
    	 
    	 protected static String inventory_Side_icon = "//span[normalize-space()='Indent Items']";
    	// protected static String direct_recipt_page = "a[href='/sanitywebhistree/Inventory/IndentItems/DirectReceipt']";
    	// protected static String direct_recipt_page = "//a[normalize-space()='Direct Receipt']";
    	 protected static String direct_recipt_page = "//li[@class='nav-item menubgactive']//li[4]";
    	 
    	 
    	 protected static String medicin_button = "//a[@id='tbMedicine']";
    	 protected static String click_S_pcm = "//td[normalize-space()='S PCM']";
    	 
    	 protected static String qty = "//input[@id='txtQty_1']";
    	 protected static String qty_1 = "//input[@id='txtqty_1']";
    	 protected static String text_purrate = "//input[@id='txtpurrate_1']";
    	 protected static String mrp = "//input[@value='10']";
    	 protected static String sgst_per = "//input[@id='txtSgtPer_1']";
    	 protected static String sgst = "//input[@id='txtSgstValue_1']";
    	 protected static String cgst_per = "//input[@id='txtCgstPer_1']";
    	 protected static String cgst = "//input[@id='txtCgstValue_1']";
    	 protected static String net_text = "//input[@id='txtnet_1']";
    	 protected static String remaks = "//textarea[@id='txtnewremark']";
    	 protected static String calculater = "//i[@class='fa fa-calculator']";
    	 
    	 protected static String save = "//textarea[@id='txtnewremark']";
    	 
    	
    	 
    	 public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {
        		
         	   CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
         		   
      	   }
      	 public void clickOnDashbordInventroy(String fieldName) throws IOException, InterruptedException {
          		
           	   CommanUtill.clickFunction(dashbord_inventory, fieldName);
           	   
      	 }	 
      
      	 public void selectkByStationDropdwon(String fieldName) throws IOException, InterruptedException {   
      		 
      		 CommanUtill.dropdownSelectByVisibleText(department, fieldName);
      		 
      	 }
      	 
       public void clickOnStationBillYesPopup(String fieldName) throws IOException, InterruptedException {
    		 
    		 CommanUtill.clickFunction(department_yes_popup, fieldName);
    		 
    	 }
       
       public void clickOnInventorySideButton(String fieldName) throws IOException, InterruptedException { 
    	   
    	   CommanUtill.clickFunction(inventory_Side_icon, fieldName);
    	   
       }
      	 
       public void clickOnDirectReceiptPage(String fieldName) throws IOException, InterruptedException {
    	   
    	  // WebElement click = driver.findElement(By.xpath("//a[@class='active-menu']"));
    	  // click.click();
    	   Thread.sleep(3000);
    	  CommanUtill.clickFunction(direct_recipt_page, fieldName);
    	 // CommanUtill.click(direct_recipt_page, fieldName);

         
       
    //    WebElement click = driver.findElement(By.cssSelector("li[class='nav-item menubgactive'] li:nth-child(4)"))  ;
        
      //  click.click();
    	   
       }
       
         
       public void clickOnMedicienButton(String fieldName) throws IOException, InterruptedException {
    	   
    	   CommanUtill.clickFunction(medicin_button, fieldName);
    	   
       }
       
       public void clickOnMedicienS_pcm(String fieldName) throws IOException, InterruptedException {  
    	   
    	   CommanUtill.clickFunction(click_S_pcm, fieldName);
    	   
       }
       
       public void enterOnTextQTYBox(String fieldName) throws IOException, InterruptedException { 
    	   
    	   CommanUtill.textEnter(qty, fieldName);
    	   
       }
      public void enterOnTextQTY_1Box(String fieldName) throws IOException, InterruptedException { 
    	   
    	   CommanUtill.textEnter(qty_1, fieldName);
    	   
       } 
      public void enterOnTextPurRateBox(String fieldName) throws IOException, InterruptedException { 
    	  
    	  CommanUtill.textEnter(text_purrate, fieldName);
    	  
      }
      
      public void enterOnTextMRP(String fieldName) throws IOException, InterruptedException { 
    	  
    	  CommanUtill.textEnter(mrp, fieldName);
    	  
      }
      
      public void enterOnTextSGSTPercentageeBox(String fieldName) throws IOException, InterruptedException { 
    	  
    	  CommanUtill.textEnter(sgst_per, fieldName);
    	  
      }
      
      public void enterOnTextSGSTBox(String fieldName) throws IOException, InterruptedException {
    	  
    	  CommanUtill.textEnter(sgst, fieldName);
    	  
      }
      
      public void enterOnTextGSTPercentageBox(String fieldName) throws IOException, InterruptedException { 
    	  
    	  CommanUtill.textEnter(cgst_per, fieldName);
    	  
      }
      
      public void enterOnTextGSTBox(String fieldName) throws IOException, InterruptedException {
    	  
    	  CommanUtill.textEnter(cgst, fieldName);
    	  
      }
      
      public void enterOnRemaksBox(String fieldName) throws IOException, InterruptedException {
    	  
    	  CommanUtill.textEnter(remaks, fieldName);
    	  
      }
      
      public void clickOnCalculatorIconButton(String fieldName) throws IOException, InterruptedException {
    	  
    	  CommanUtill.clickFunction(calculater, fieldName);
    	  
      }
      
      public void clickOnSaveIconButton(String fieldName) throws IOException, InterruptedException {
    	  
    	  CommanUtill.click(save, fieldName);
    	  
      }
      
       
 }
