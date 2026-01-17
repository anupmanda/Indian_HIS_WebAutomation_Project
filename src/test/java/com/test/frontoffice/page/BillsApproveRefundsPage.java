/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 15-Jan-2026
 */
public class BillsApproveRefundsPage extends GeneralBrowserSetting {
	
	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";
	
//--------------------------------------Approve Refunds page locators------------------------------
	protected static String click_billing_btn = "//span[normalize-space()='Billing']";
	protected static String ApproveRefunds_page = "//a[normalize-space()='Approve Refunds']"; 
	protected static String enter_refund_From_Date = "//input[@id='FromDate']";
	protected static String enter_refund_To_Date = "//input[@id='ToDate']";
	protected static String click_refund_search_btn = "//a[@id='search_data']//i[@class='fa fa-search']";
	
	protected static String Radio_btn_Bills_Refund = "//input[@id='rdbBill']";
	protected static String Radio_btn_new = "//input[@id='NEW1']";
	
	protected static String Click_Bills_New_Refund_Reject = "//table[@id='apid']//tbody[@id='tbodyapproverefund']//tr[last()]//a[contains(@id,'btnReject')]";
	protected static String  Yes_Bills_New_Refund_Reject_pop = "//a[@id='_RejectYes']";
	
	protected static String Click_Bills_New_Refund_Approve = "//table[@id='apid']//tbody[@id='tbodyapproverefund']//tr[last()]//a[contains(@id,'btnApprove')]";
	protected static String  Yes_Bills_New_Refund_Approve_pop = "//a[@id='_ApproveYes']";
	
	
	//------------------------------Check Bills Reject And Approve  -----------------------------
	protected static String Radio_Bills_Reject_chkk = "//input[@id='reject1']";
	protected static String Radio_Bills_Refund_Approved_chekk = "//input[@id='approved1']";
	
	//------------------------------Deposit Radio Button Locators---------------------------------
	
	protected static String Radio_btn_Deposit_Refund = "//input[@id='rdbDeposit']";
	protected static String Radio_btn_Deposit_Refund_Table = "//table[@id='tblDepositApproval']/tbody/tr[last()]/td//a[contains(@class,'btnDepositApprove')]";
	protected static String Yes_Deposit_Refund_Approve_Pop = "//a[@id='btnDepositApproveYes']";

	protected static String Radio_btn_Reject_Table = "//table[@id='tblDepositApproval']/tbody/tr[last()]/td//a[contains(@class,'btnDepositReject')]";
	protected static String Yes_Reject_Deposit_Pop = "//a[@id='btnDepositRejectYes']";
	
	protected static String Check_Deposit_approve_radio_Btn = "//input[@id='approved1']";
	protected static String Check_Deposit_reject_radio_Btn = "//input[@id='reject1']";
	
	
	
	
	
	
	
	
	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}
	//--------------------------------------billing page methods------------------------------
	public void clickOnApproveRefundsPage(String billing , String deposite) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_billing_btn, billing);
		CommanUtill.clickFunction(ApproveRefunds_page, deposite);

	}
	
	public void enterFromAndToDateInSerach(String fromDate , String toDate , String Serach_Icon) throws IOException, InterruptedException {

		WebElement From_Date = driver.findElement(By.xpath(enter_refund_From_Date));
		From_Date.sendKeys(Keys.CONTROL + "a");
		From_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(enter_refund_From_Date, fromDate);
		From_Date.sendKeys(Keys.TAB);
		
		WebElement To_Date = driver.findElement(By.xpath(enter_refund_To_Date));
		To_Date.sendKeys(Keys.CONTROL + "a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(enter_refund_To_Date, toDate);
		To_Date.sendKeys(Keys.TAB);
		CommanUtill.clickFunction(click_refund_search_btn, Serach_Icon);
	}
	//------------------------------Billing Radio Button Methods---------------------------------
	public void RejectBillsRefundAndNewRadioBtn(String Bills_Refund , String New_Radio_Btn , String Bill_New_Reject) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Bills_Refund, Bills_Refund);
		CommanUtill.clickFunction(Radio_btn_new, New_Radio_Btn);
		Thread.sleep(2000);
		CommanUtill.clickFunction(Click_Bills_New_Refund_Reject, Bill_New_Reject);
	}
	
	public void YesBillsNewRefundRejectPopup(String Bills_New_Refund_Reject_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Yes_Bills_New_Refund_Reject_pop, Bills_New_Refund_Reject_Pop);
		//driver.switchTo().alert().accept();
	}
	
	public void CheckBillsRejectRadioBtn(String Bills_Refund , String Reject_Radio_BtnSS) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Bills_Refund, Bills_Refund);
		CommanUtill.clickFunction(Radio_Bills_Reject_chkk, Reject_Radio_BtnSS);
	}
	
//------------------------------Bills Refund, New , Approve Yes Pop And Check Approve Radio Btn-----------------------------
	
	public void ApproveBillsRefund(String Bills_Refund , String Bills_Refund_New_Radio_Btn , String Click_Bills_Refund_Approve)
			throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Bills_Refund, Bills_Refund);
		CommanUtill.clickFunction(Radio_btn_new, Bills_Refund_New_Radio_Btn);
		Thread.sleep(2000);
		CommanUtill.clickFunction(Click_Bills_New_Refund_Approve, Click_Bills_Refund_Approve);
	}
	
	public void YesBillsNewRefundApprovePopup(String Bills_New_Refund_Approve_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Yes_Bills_New_Refund_Approve_pop, Bills_New_Refund_Approve_Pop);
		//driver.switchTo().alert().accept();
	}
	
	public void CheckBillsApproveRadioBtn(String Bills_Refund , String Check_Bills_Approve) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Bills_Refund, Bills_Refund);
		CommanUtill.clickFunction(Radio_Bills_Refund_Approved_chekk, Check_Bills_Approve);
	}
	
	//------------------------------Deposit Refund ---------------------------------
	
	public void DepositRefundApprove(String Deposit_Refund , String New_Radio_Btn , String Deposit_New_Approve_Table) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Deposit_Refund, Deposit_Refund);
		CommanUtill.clickFunction(Radio_btn_new, New_Radio_Btn);
		Thread.sleep(2000);
		CommanUtill.clickFunction(Radio_btn_Deposit_Refund_Table, Deposit_New_Approve_Table);
	}
	
	public void YesDepositRefundApprovePopup(String Deposit_Refund_Approve_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Yes_Deposit_Refund_Approve_Pop, Deposit_Refund_Approve_Pop);
		//driver.switchTo().alert().accept();
	}
	
	public void DepositRefundReject(String Deposit_Refund , String New_Radio_Btn , String Deposit_Reject_Table) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Deposit_Refund, Deposit_Refund);
		CommanUtill.clickFunction(Radio_btn_new, New_Radio_Btn);
		Thread.sleep(2000);
		CommanUtill.clickFunction(Radio_btn_Reject_Table, Deposit_Reject_Table);
	}
	public void YesDepositRefundRejectPopup(String Deposit_Refund_Reject_Pop) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Yes_Reject_Deposit_Pop, Deposit_Refund_Reject_Pop);
		//driver.switchTo().alert().accept();
	}
	
	//------------------------------Check Approved Radio Button Methods---------------------------------
	public void CheckDepositApproveRadioBtn(String Deposit_Refund , String Approve_Radio_Bts) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Deposit_Refund, Deposit_Refund);
		CommanUtill.clickFunction(Check_Deposit_approve_radio_Btn, Approve_Radio_Bts);
	}
	public void CheckDepositRejectRadioBtn(String Deposit_Refund , String Reject_Radio_Bts) throws IOException, InterruptedException {

		CommanUtill.clickFunction(Radio_btn_Deposit_Refund, Deposit_Refund);
		CommanUtill.clickFunction(Check_Deposit_reject_radio_Btn, Reject_Radio_Bts);
	}
}
