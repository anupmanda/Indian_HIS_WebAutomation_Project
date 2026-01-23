/**
 * 
 */
package com.test.frontoffice.page;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 21-Jan-2026
 */
public class FoPatientDocumentPage extends GeneralBrowserSetting {

	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String Click_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	//---------------------Patient Document ------------------------------
	protected static String patient_Document = "//span[normalize-space()='Patient Document']";
	protected static String uhid = "//input[@id='uHid']";
	protected static String document_type_drp = "//select[@id='drddocType']";
	protected static String upload_icon = "//i[@title='Upload Documents']";
	protected static String upload_pop_document_name = "//input[@id='docName']";
	protected static String upload_pop_document_type_drp = "//select[@id='drdpopupdocType']";
	protected static String upload_pop_upload_pdf = "//input[@id='filename']";
	protected static String upload_pop_document_Save = "//a[@id='btnSave']//i[@class='fa fa-save']";
	protected static String uploaded_file_check_table = "//div[@class='apid_area_tale']//td[1]";
	protected static String Close_uploaded_Pdf = "//span[@id='pdf-close']";


	//-------------------------------------patient upload video -----------------------------

	protected static String Click_upload_video_Icon = "//a[@id='Uploadvideobtn']";
	protected static String upload_video_pop_document_type_drp = "//select[@id='drdpopupvideoType']";
	protected static String upload_video_pop_choose_file = "//input[@id='fileuploadname']";
	protected static String Save_upload_video_pop = "//input[@value='Upload']";
	protected static String Check_uploaded_video_Table = "//div[@class='apid_area_tale']//tr[2]";
	protected static String Close_uploaded_video_pop = "//a[@id='close_Videoview']";
	
	//============================ Dicom Document ======================================
	
	protected static String Click_Dicom_document_icon  = "//a[@id='OpenDicomdocument']";
	protected static String Dicom_document_document_name = "//input[@id='docName1']";
	protected static String Dicom_document_document_type_drp = "//select[@id='drdpopupdocType1']";
	protected static String Dicom_document_choose_file = "//input[@id='fileNameDicom']";
	protected static String Save_Dicom_document = "//a[@id='Upload_Image']//i[@class='fa fa-save']";
	
	//================================= Delete ===================================
	
	protected static String Delete_Uploaded_File = "//div[@class='div-left']//td[6]";
	protected static String Enter_Reason_Delete_tex = "//textarea[@id='delreason']";
	protected static String Enter_Reason_Delete_yes_pop = "//a[@id='btnOK']";



	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(Click_yes_popup, Yes_popup);	
	}

	public void clickOnPatientDocument(String patient_document_Page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(patient_Document, patient_document_Page);
	}

	public void enterUHID(String Enter_Uhid) throws IOException, InterruptedException {

		CommanUtill.textEnter(uhid, Enter_Uhid);
		driver.findElement(By.xpath(uhid)).sendKeys(Keys.ENTER);
	}
	public void selectByDocumentTypeDrp(String Document_Type) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(document_type_drp, Document_Type);
	}
	public void UploadDocumentIcon(String Upload_btn) throws IOException, InterruptedException {

		CommanUtill.clickFunction(upload_icon, Upload_btn);
	}

	public void UploadPopWithDocumentNameAndDocumentType(String document_name , String Document_type_drp)
			throws IOException, InterruptedException {		

		CommanUtill.textEnter(upload_pop_document_name, document_name);
		CommanUtill.dropdownSelectByVisibleText(upload_pop_document_type_drp, Document_type_drp);
	}
	public void ChooseFile_UploadPDfInDriver(String choose_file)  throws IOException, InterruptedException {	

		WebElement uploadfile = driver.findElement(By.xpath(upload_pop_upload_pdf));
		uploadfile.sendKeys(choose_file);
		/*
					WebElement upload_pdf = driver.findElement(By.xpath(choose_file));

				        				Actions act = new Actions(driver);
				        				act.moveToElement(upload_pdf).click().perform();

				        				Robot rb = new Robot();
				        				rb.delay(2000);

				        				//copy file to clip board
				        				StringSelection ss = new StringSelection("C:\\Users\\Anup.DESKTOP-V88DC5U\\Desktop\\Automation\\PAS.PNG");
				        				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

				        				//perform control + v action to past file 
				        				rb.keyPress(KeyEvent.VK_CONTROL);
				        				rb.keyPress(KeyEvent.VK_V);

				        				rb.keyRelease(KeyEvent.VK_CONTROL);
				        				rb.keyRelease(KeyEvent.VK_V);

				        				rb.keyPress(KeyEvent.VK_ENTER);
				        				rb.keyRelease(KeyEvent.VK_ENTER);
		 */
	}
	public void saveUploadDocumentPop(String Save_btn) throws IOException, InterruptedException {

		CommanUtill.clickFunction(upload_pop_document_Save, Save_btn);

	}

	public void CheckUploadedFileInTable(String file_open, String Close_Uploaded_File) throws IOException, InterruptedException {

		CommanUtill.clickFunction(uploaded_file_check_table, file_open);

		if(CommanUtill.isElementPresent(Close_uploaded_Pdf)) {
			CommanUtill.clickFunction(Close_uploaded_Pdf, Close_Uploaded_File);
			System.out.println("Close Pdf File");
		}
		else {
			System.out.println("Close Pdf File did not appear");
		}
	}
	//==========================upload Video File ===================================
	
	public void ClickOnVideoIcon(String Video_icon) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(Click_upload_video_Icon, Video_icon);
	}
	
	public void UploadVideoDocumentTypeDrp(String Upload_video_document_type) throws IOException, InterruptedException { 
		
		CommanUtill.dropdownSelectByVisibleText(upload_video_pop_document_type_drp, Upload_video_document_type);
	}
	
	public void ChooseFileInuploadVideo(String video_upload_lacation) throws IOException , InterruptedException{
		
		WebElement video_file = driver.findElement(By.xpath(upload_video_pop_choose_file));
		video_file.sendKeys(video_upload_lacation);
		
	}
	
	public void SaveUploadVideoPop(String Save_Upload_video_file) throws IOException, InterruptedException { 
		
		CommanUtill.clickFunction(Save_upload_video_pop, Save_Upload_video_file);
	}

	public void CheckUploadVideoTable(String Table_upload_video_file) throws IOException, InterruptedException { 
		
		CommanUtill.clickFunction(Check_uploaded_video_Table, Table_upload_video_file);
	}
	
	public void CloseViewVideoPop(String Close_View_video) throws IOException, InterruptedException { 
		
		CommanUtill.clickFunction(Close_uploaded_video_pop, Close_View_video);
	}
	
	//=======================================Dicom Document ===============================
	
	public void ClickDicomDocumentIcon(String Dicom_Document_btn) throws IOException, InterruptedException { 
		
		CommanUtill.clickFunction(Click_Dicom_document_icon, Dicom_Document_btn);
	}
	
	public void DicomDocumentNameAndTypeDrpPop(String Document_Name , String Document_type_drp)
			throws IOException, InterruptedException { 
		
		CommanUtill.textEnter(Dicom_document_document_name, Document_Name);
		CommanUtill.dropdownSelectByVisibleText(Dicom_document_document_type_drp, Document_type_drp);
	}
	
	public void ChooseFileDicomDocumentPop(String choose_file_Dicom ) throws IOException, InterruptedException { 
		
		WebElement Dicom_File = driver.findElement(By.xpath(Dicom_document_choose_file));
		Dicom_File.sendKeys(choose_file_Dicom);
	}
	
	public void SaveDicomDocumentpop(String Dicom_save_btn) throws IOException, InterruptedException { 
		
		CommanUtill.clickFunction(Save_Dicom_document, Dicom_save_btn);
	}
	
	//============================ delete File ===============================
	
	public void DeleteUploadFile(String delete_File) throws IOException, InterruptedException { 
		
		CommanUtill.clickFunction(Delete_Uploaded_File, delete_File);
	}
	
	public void ReasonDeleteFileTextAndYesPop(String Reason_Text , String Yes_Pop)  throws IOException, InterruptedException { 
		
		CommanUtill.textEnter(Enter_Reason_Delete_tex, Reason_Text);
		CommanUtill.clickFunction(Enter_Reason_Delete_yes_pop, Yes_Pop);
		
	}

}

