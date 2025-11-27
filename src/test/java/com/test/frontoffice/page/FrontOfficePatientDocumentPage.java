/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 25-Jul-2025
 */
public class FrontOfficePatientDocumentPage extends GeneralBrowserSetting{
	
	protected static String patient_document_click = "//span[normalize-space()='Patient Document']";
	protected static String enter_uhid = "//input[@id='uHid']";
	protected static String document_type = "//select[@id='drddocType']";
	protected static String upload_icon = "//i[@title='Upload Documents']";
	protected static String document_name = "//input[@id='docName']";
	protected static String choose_upload_file = "//input[@id='filename']";
	protected static String save_icon = "//a[@id='btnSave']//i[@class='fa fa-save']";
	
	
	
	
	 public void clickOnPatientDocumentIconPage(String fieldName) throws IOException, InvalidFormatException ,InterruptedException { 
		 
		 CommanUtill.clickFunction(patient_document_click, fieldName);
		 
	 }
	 
	 public void enterOnUHID(String fieldName) throws IOException, InvalidFormatException ,InterruptedException { 
	 
         CommanUtill.textEnter(enter_uhid, fieldName);
	 }
	 
	 public void selectByDocumentTypeDropdwon(String fieldName) throws IOException, InvalidFormatException ,InterruptedException { 
		 
		 CommanUtill.dropdownSelectByVisibleText(document_type, fieldName);
		 
	 }
	 
	 public void clickOnPatientDocumentIcon(String fieldName) throws IOException, InvalidFormatException ,InterruptedException { 
		 
		 CommanUtill.clickFunction(upload_icon, fieldName);
		 
	 }
	 
	 public void enterOnDocumentName(String fieldName) throws IOException, InvalidFormatException ,InterruptedException {
		 
		 CommanUtill.textEnter(document_name, fieldName);
		 
	 }
	 
	 public void clickOnPatientDocumentChooseAndUploadFileIcon(String fieldName) throws IOException, InvalidFormatException ,InterruptedException {
		 
		// CommanUtill.clickFunction(choose_upload_file, fieldName);
		 WebElement upload = driver.findElement(By.xpath("//input[@id='filename']"));
		 upload.sendKeys(fieldName);
		 
	 }
	 
	 public void clickOnPatientDocumentSaveIcon(String fieldName) throws IOException, InvalidFormatException ,InterruptedException { 
		 
		 CommanUtill.clickFunction(save_icon, fieldName);
		 
	 }
	 
	  
    
}
