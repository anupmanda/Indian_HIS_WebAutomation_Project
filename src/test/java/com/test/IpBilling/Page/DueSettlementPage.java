package com.test.IpBilling.Page;

import java.io.IOException;
import java.time.Duration;

import javax.management.InvalidApplicationException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

import groovyjarjarantlr4.v4.parse.ANTLRParser.prequelConstruct_return;

/**
 * @author Anup
 *
 * 12-Feb-2026
 */
public class DueSettlementPage extends GeneralBrowserSetting {

	protected static String Facility_Dashbord_Drp = "//select[@id='Facility']";
	protected static String Ip_Billing_dashboard = "//li[@id='btn_Billing']";
	protected static  String Billing_Station_Drp = "//select[@id='Department']";
	protected static  String Billing_Station_Yes_pop = "//a[@id='btn_yes_desh']";
	protected static  String Billing_Station_No_pop = "//a[@id='btn_no_desh']";

	protected static  String Billing_Meanu = "//a[@id='showmenu']";
	protected static  String Due_Settlement_btn = "//span[normalize-space()='Due Settlement']";

	//===========================Due Settlement ================================
	protected static  String Due_Settlement_page = "//a[text()='Due Settlement']";
	protected static  String search_Patient_btn = "//a[@id='txtSearchByPatient']";
	protected static  String enter_IP_No = "//input[@id='txtIPNo']";
	protected static  String Enter_Bill_No = "//input[@id='txtBillNo']";
	protected static  String Click_On_Clear_Icon = "//i[@id='btnPatientClear']";
	protected static  String Remarks = "//textarea[@id='txtRemarks']";
	protected static  String Click_Edit_Icon = "//button[@id='btnEditReceivedBy']";
	protected static  String Received_From_Text = "//input[@id='txtReceivedBy']";
	protected static  String save_Icon = "//a[@id='btnsave']//i[@class='fa fa-save']";
	protected static  String save_Yes_Pop = "//a[@id='btnDueSettlementYes']";
	
	protected static  String print_Icon = "//a[@title='Print']";
	protected static String Receipt_Dropdown = "//select[@id='ddReceipt']";
	protected static String Last_Receipt_Option = "(//select[@id='ddReceipt']/option)[last()]";
	protected static String Save_Icon = "//a[@id='btn_ReceiptNo_OK']";
	
	//======================= Collect Mode MOP ======================
	//******************************Cash ******************************
	protected static  String Click_Cash_Icon  = "//a[@id='btnCash']";
	protected static  String Cash_Enter_Amount = "//input[@id='txtAmtCash']";
	protected static  String Enter_Rounding_Settlement = "//input[@id='txtRoundOffAmt']";

	//************************Cheque**********************************
	protected static  String Click_cheque_icon = "//a[@id='btnCheque']";
	protected static  String Cheque_No = "//input[@id='txtChecqueNoCheque']";
	protected static  String Date_Check_Box = "//input[@id='due-checkbox']";
	protected static  String Issue_Date = "//input[@id='Issue_name']";
	protected static  String Cheque_Bank_Name_Drp = "//select[@id='txtBankName']";
	protected static  String Branch_name = "//input[@id='txtBranchCheque']";
	protected static  String Cheque_Amount = "//input[@id='txtAmtCheque']";

	//****************************Credit ***********************************

	protected static  String Click_Credit_Card_Icon = "//a[@id='btnCredit']";
	protected static  String Credit_card_no = "//input[@id='txtCNo']";
	protected static  String Credit_Card_Type = "//select[@id='txtCName']";
	protected static  String Credit_Bank_Name_Drp = "//select[@id='txtCCBName']";
	protected static  String Credit_Trans_No = "//input[@id='txtTNo']";
	protected static  String Credit_Amount = "//input[@id='txtAmtCC']";
	protected static  String Credit_Take_Payment = "//a[@id='TakepaymentCredit']";

	//****************************Debit Card ***********************************
	protected static  String Click_DebitCard_Icon = "//a[@id='btnDebit']";
	protected static  String DebitCard_Card_no = "//input[@id='txtDcNo']";
	protected static  String Debit_Card_Type_Drp = "//select[@id='txtDCName']";
	protected static  String DebitCard_Bank_name_Drp= "//select[@id='txtDBName']";
	protected static  String DebitCard_Trans_no = "//input[@id='txtDTNo']";
	protected static  String DebitCard_Amount= "//input[@id='txtAmtDC']";
	protected static  String DebitCard_Take_Payment = "//a[@id='TakepaymentDebit']";
	
	//***********************NEFT ***************************
	protected static  String Click_NEFT_Icon = "//a[@id='btnNEFT']";
	protected static  String NEFT_Trans_no = "//input[@id='txtNTNo']";
	protected static  String Chekk_Tran_Date_Check_Box = "//input[@id='CheckTrans']";
	protected static  String Trans_Date = "//input[@id='NeftTrans_date']";
	protected static  String NEFT_Bank_Name_Drp = "//select[@id='NBName']";
	protected static  String NEFT_Branch = "//input[@id='txtNBranch']";
	protected static  String NEFT_Amount = "//input[@id='txtAmtNeft']";
	
	//***********************Other ***************************
	protected static  String Click_Other_Icon = "//a[@id='btnOthers']";
	protected static  String Other_Payment_Type_Drp= "//select[@id='txtPType']";
	protected static  String Other_Transaction_Id = "//input[@id='txtTransIdOther']";
	protected static  String Other_RRn_Text = "//input[@id='txtRrnNo']";
	protected static  String Other_Remarks = "//textarea[@id='txtRemarkOther']";
	protected static  String Other_Amount = "//input[@id='txtAmtOther']";
	protected static  String Other_Take_Payment = "//a[@id='OtherTakepayment']";
	
	//***********************Discount***************************

	protected static  String Click_Discount_Icon = "//a[@name='Discount']";
	protected static  String Discount_Amount = "//input[@id='txtAmtDiscount']";
	protected static  String Discount_Authorised_Drp = "//select[@id='txtAuthorised']";
	protected static  String Discount_Head_Drp = "//select[@id='txtDiscount']";
	protected static  String Discount_Reason_Drp = "//select[@id='txtDReason']";
	protected static  String Discount_Remarks_Text = "//textarea[@id='txtDiscountRemark']";

//=========================Search By Company=================================
	
	protected static  String Serach_Company_Btn = "//a[@id='SearchCompany']";
	protected static  String Company_Drp = "//select[@id='ddCompany']";
	protected static  String Company_Serch_From_Date = "//input[@id='txtFromDate']";
	protected static  String Company_Serch_To_Date = "//input[@id='txtToDate']";
	protected static  String Company_Serch_Search_Btn = "//i[@id='btnSearchCompany']";
	
	protected static  String Search_Table_Patient = "//table[@id='tblDueSettlementDetailsCompany']//tr[2]";




	public void SelectByFacilityDrp (String facility_Drp) throws IOException ,InvalidApplicationException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(Facility_Dashbord_Drp, facility_Drp);
	}

	public void ClickOnIPBillingDashboard(String Ip_Billing , String Station_drp ,String Station_Yes_Pop)
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Ip_Billing_dashboard, Ip_Billing);
		CommanUtill.dropdownSelectByVisibleText(Billing_Station_Drp, Station_drp);
		CommanUtill.clickFunction(Billing_Station_Yes_pop, Station_Yes_Pop);
		logger.info("Sussfully Pass IP Billing Dashboard Button");
	}

	public void ClickOnIpBillingMeanu(String Ip_billing_Meanu) 
			throws IOException , InvalidApplicationException, InterruptedException {

		CommanUtill.clickFunction(Billing_Meanu, Ip_billing_Meanu);
	}

	public void DueSettlementTab_Page (String Due_Settlement_Tab , String Due_Settlement) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Due_Settlement_btn)));
		CommanUtill.clickFunction(Due_Settlement_btn, Due_Settlement_Tab);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( Due_Settlement_page)));
		CommanUtill.clickFunction(Due_Settlement_page, Due_Settlement);
	}
	public void ClickOnSearchByPatient(String Search_Icon) throws IOException ,InterruptedException {

		CommanUtill.clickFunction(search_Patient_btn, Search_Icon);
	}
	
	public void EnterIpNumber(String Ip_No) throws IOException ,InterruptedException {
		
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(enter_IP_No)));
		
		WebElement Ip_no = driver.findElement(By.xpath(enter_IP_No));
		CommanUtill.textEnter(enter_IP_No, Ip_No);
		Ip_no.sendKeys(Keys.ENTER);
	}
	
   public void EnterBillNumber(String Bill_No) throws IOException ,InterruptedException {
		
		WebElement Bill_no = driver.findElement(By.xpath(Enter_Bill_No));
		CommanUtill.textEnter(Enter_Bill_No, Bill_No);
		Bill_no.sendKeys(Keys.ENTER);
	}
   
   public void clickOnCashIcon_Amount_RoundingOffSettlement(String Click_Cash ,String Enter_Amount , String Rounding_Off_Settlement) 
		   throws IOException ,InterruptedException {
	   
	   CommanUtill.clickFunction(Click_Cash_Icon, Click_Cash);
	   WebElement Amount = driver.findElement(By.xpath(Cash_Enter_Amount));
	   Amount.sendKeys(Keys.CONTROL +"a");
	   Amount.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Cash_Enter_Amount, Enter_Amount);
	  // CommanUtill.textEnter(Enter_Rounding_Settlement, Rounding_Off_Settlement);
   }
   
   public void ChequeInformationDueAmount(String Cheque_Icon , String Cheque_Number , String Issue_Date_Check , 
		   String Enter_Date , String Bank_Name_Drp , String Branch , String Amount) throws IOException , InterruptedException{
	   
	   CommanUtill.clickFunction(Click_cheque_icon, Cheque_Icon);
	   
	   CommanUtill.textEnter(Cheque_No, Cheque_Number);
	   
	   WebElement checkBox = driver.findElement(By.xpath(Date_Check_Box));
	   if(! checkBox.isSelected()) {
		  CommanUtill.clickFunction(Date_Check_Box, Issue_Date_Check); 
	   }
	   WebElement Date = driver.findElement(By.xpath(Issue_Date));
	   Date.sendKeys(Keys.CONTROL + "a");
	   Date.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Issue_Date, Enter_Date);
	   Date.sendKeys(Keys.TAB);
	   
	   CommanUtill.dropdownSelectByVisibleText(Cheque_Bank_Name_Drp, Bank_Name_Drp);
	   CommanUtill.textEnter(Branch_name, Branch);
	   
	   WebElement Amount_Enter = driver.findElement(By.xpath(Cheque_Amount));
	   Amount_Enter.sendKeys(Keys.CONTROL + "a");
	   Amount_Enter.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Cheque_Amount, Amount);
   }
   
   public void CreditCardInformationDueAmount(String Credit_Icon , String Card_Number , String Card_Type ,
		   String Bank_Name_Drp , String Trans_no , String Amount) throws IOException, InterruptedException{
	   
	   CommanUtill.clickFunction(Click_Credit_Card_Icon, Credit_Icon);
	   WebElement Card_no = driver.findElement(By.xpath(Credit_card_no));
	   Card_no.sendKeys(Keys.CONTROL + "a");
	   Card_no.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Credit_card_no, Card_Number);
	   
	   CommanUtill.dropdownSelectByVisibleText(Credit_Card_Type, Card_Type);
	   
	   CommanUtill.dropdownSelectByVisibleText(Credit_Bank_Name_Drp, Bank_Name_Drp);
	   
	   WebElement Trans = driver.findElement(By.xpath(Credit_Trans_No));
	   Trans.sendKeys(Keys.CONTROL +"a");
	   Trans.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Credit_Trans_No, Trans_no);
	   
	   WebElement Pay_Amount = driver.findElement(By.xpath(Credit_Amount));
	   Pay_Amount.sendKeys(Keys.CONTROL +"a");
	   Pay_Amount.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Credit_Amount, Amount);
   }
   public void TakePaymentInCreditCard(String Payment_Credit) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(Credit_Take_Payment, Payment_Credit);
   }
   
   public void DebitCardInformationDueAmount(String Click_Debit_Card_Btn , String Debit_Card_no , String Debit_Card_Type ,
		   String Debit_Card_Bank_Name , String Debit_Trans_No, String Debit_Card_Amount) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(Click_DebitCard_Icon, Click_Debit_Card_Btn);
	   WebElement Card_no = driver.findElement(By.xpath(DebitCard_Card_no));
	   Card_no.sendKeys(Keys.CONTROL + "a");
	   Card_no.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(DebitCard_Card_no, Debit_Card_no);
	   
	   CommanUtill.dropdownSelectByVisibleText(Debit_Card_Type_Drp, Debit_Card_Type);
	   CommanUtill.dropdownSelectByVisibleText(DebitCard_Bank_name_Drp, Debit_Card_Bank_Name);
	   WebElement Trans = driver.findElement(By.xpath(DebitCard_Trans_no));		
	   Trans.sendKeys(Keys.CONTROL + "a");
	   Trans.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(DebitCard_Trans_no ,Debit_Trans_No);
	   CommanUtill.textEnter(DebitCard_Amount, Debit_Card_Amount); 
   }
   public void ClickOnTakePaymentInDebitCard(String Take_Payment_Debit_Card) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(DebitCard_Take_Payment, Take_Payment_Debit_Card);
   }
   public void ClickOnNEFTInformation(String Click_NEFT , String Trans_no , String Trans_Date_Check	 ,String Enter_Trans_Date , 
		   String Bank_Name , String Branch , String Amount) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(Click_NEFT_Icon, Click_NEFT);
	   CommanUtill.textEnter(NEFT_Trans_no, Trans_no);
	   
	   WebElement Trans_date_check_box = driver.findElement(By.xpath(Chekk_Tran_Date_Check_Box));
	   
	   if(! Trans_date_check_box.isSelected()) {
			  CommanUtill.clickFunction(Chekk_Tran_Date_Check_Box, Trans_Date_Check); 
		   }
	   WebElement Trans_Date_Enter = driver.findElement(By.xpath(Trans_Date));
	   Trans_Date_Enter.sendKeys(Keys.CONTROL + "a");
	   Trans_Date_Enter.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Trans_Date, Enter_Trans_Date);
	   Trans_Date_Enter.sendKeys(Keys.TAB);
	   
	   CommanUtill.dropdownSelectByVisibleText(NEFT_Bank_Name_Drp, Bank_Name);	
	   CommanUtill.textEnter(NEFT_Branch, Branch);
	   WebElement Neft_Amount_Enter = driver.findElement(By.xpath(NEFT_Amount));	
	   Neft_Amount_Enter.sendKeys(Keys.CONTROL + "a");
	   Neft_Amount_Enter.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(NEFT_Amount, Amount);
   }
   
   public void ClickOnOtherSInformation(String Other_Btn , String Payment_Type_Drp , String Transaction_Id , String RRn_Text , 
		   String Remarks , String Amount) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(Click_Other_Icon, Other_Btn);
	   CommanUtill.dropdownSelectByVisibleText(Other_Payment_Type_Drp, Payment_Type_Drp);
	   CommanUtill.textEnter(Other_Transaction_Id, Transaction_Id);
	   CommanUtill.textEnter(Other_RRn_Text, RRn_Text);
	   CommanUtill.textEnter(Other_Remarks, Remarks);
	   WebElement Other_Amount_Enter = driver.findElement(By.xpath(Other_Amount));
	   Other_Amount_Enter.sendKeys(Keys.CONTROL + "a");
	   Other_Amount_Enter.sendKeys(Keys.DELETE);	
	   CommanUtill.textEnter(Other_Amount, Amount);
	   
   }
   
   public void ClickOnTakePaymentInOther(String Take_Payment_Other) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(Other_Take_Payment, Take_Payment_Other);
   }
   public void ClickOnDiscountInformation(String Discount_Icon , String Enter_Discount_Amount , String Authorised_By , String Discount_Head ,
		   String Discount_Reason , String Discount_Rearks) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(Click_Discount_Icon, Discount_Icon);
	   WebElement Discount_Amount_Enter = driver.findElement(By.xpath(Discount_Amount));
	   Discount_Amount_Enter.sendKeys(Keys.CONTROL + "a");
	   Discount_Amount_Enter.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Discount_Amount, Enter_Discount_Amount);
	   CommanUtill.dropdownSelectByVisibleText(Discount_Authorised_Drp, Authorised_By);
	   CommanUtill.dropdownSelectByVisibleText(Discount_Head_Drp, Discount_Head);
	   CommanUtill.dropdownSelectByVisibleText(Discount_Reason_Drp, Discount_Reason);
	   CommanUtill.textEnter(Discount_Remarks_Text, Discount_Rearks);
   }
   
   public void ClickOnEditBtnAndEnterReceivedFrom(String Edit_Btn , String Received_From) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(Click_Edit_Icon, Edit_Btn);
	   WebElement Received_From_Enter = driver.findElement(By.xpath(Received_From_Text));
	   Received_From_Enter.sendKeys(Keys.CONTROL + "a");
	   Received_From_Enter.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Received_From_Text, Received_From);
   }
   public void EnterRemarks(String Enter_Remarks) throws IOException , InterruptedException {
	   
	   CommanUtill.textEnter(Remarks, Enter_Remarks);
   }
   public void ClickOnSaveIcon(String Save_Icon , String Save_pop) throws IOException , InterruptedException {
	   
	   CommanUtill.clickFunction(save_Icon, Save_Icon);
	   CommanUtill.clickFunction(save_Yes_Pop, Save_pop);
   }
   
  
  
   public void ClickOnPrintBtn(String Print_Icon) throws IOException, InterruptedException {
	   
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(print_Icon)));
	   CommanUtill.clickFunction(print_Icon, Print_Icon);
   }
 
   public String selectLastGeneratedReceipt(String Receipt_Dropdown_Name , String Last_Receipt_Option_Name) throws IOException, InterruptedException {

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Receipt_Dropdown)));
       CommanUtill.clickFunction(Receipt_Dropdown, Receipt_Dropdown_Name);

       // Capture last receipt text
       WebElement element = CommanUtill.driver.findElement(By.xpath(Last_Receipt_Option));
       String receiptText = element.getText();

       // Click last option
       CommanUtill.clickFunction(Last_Receipt_Option, Last_Receipt_Option_Name);

       System.out.println("Selected Receipt No is: " + receiptText);
       return receiptText;
   }
   
   public void clickSaveIcon(String Save_Icon_Name) throws IOException, InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Save_Icon)));
       CommanUtill.clickFunction(Save_Icon, Save_Icon_Name);
   }
   //========================Search By Company=================================
   
   public void ClickOnSearchByCompany(String Search_By_Company_Btn) throws IOException , InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Serach_Company_Btn)));
	   CommanUtill.clickFunction(Serach_Company_Btn, Search_By_Company_Btn);
	   
   }
   public void SearchByCompanyDrp(String Company_Name ) throws IOException , InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Company_Drp)));
	   CommanUtill.dropdownSelectByVisibleText(Company_Drp, Company_Name); 
   }
   
   public void SearchByCompanyFromToDate(String From_Date , String To_Date ,String Search_Icon) throws IOException , InterruptedException {
	   
	   WebElement FromDate = driver.findElement(By.xpath(Company_Serch_From_Date));
	   FromDate.sendKeys(Keys.CONTROL + "a");
	   FromDate.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Company_Serch_From_Date, From_Date);
	   FromDate.sendKeys(Keys.TAB);
	   
	   WebElement ToDate = driver.findElement(By.xpath(Company_Serch_To_Date));
	   ToDate.sendKeys(Keys.CONTROL + "a");
	   ToDate.sendKeys(Keys.DELETE);
	   CommanUtill.textEnter(Company_Serch_To_Date, To_Date);
	   ToDate.sendKeys(Keys.TAB);
	   
	 CommanUtill.clickFunction(Company_Serch_Search_Btn, Search_Icon);
   }
   
   public String getSearchByCompanyPatientName(String second_Row_Patient) throws IOException , InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search_Table_Patient)));
	   WebElement Patient_Name_Element = driver.findElement(By.xpath(Search_Table_Patient));
	   String Patient_Name = Patient_Name_Element.getText();
	   CommanUtill.clickFunction(Search_Table_Patient, second_Row_Patient);
	   System.out.println("Searched Patient Name is : " + Patient_Name);
	   return Patient_Name;
   }
   
   public void ClickOnCashBtnAndSaveIcon(String Click_Cash , String Save_Icon , String Save_Pop) throws IOException , InterruptedException {
	 
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Cash_Icon)));
	   CommanUtill.clickFunction(Click_Cash_Icon, Click_Cash);
	   
	   WebDriverWait wait_Save = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait_Save.until(ExpectedConditions.elementToBeClickable(By.xpath(save_Icon)));
	   CommanUtill.clickFunction(save_Icon, Save_Icon);
	   CommanUtill.clickFunction(save_Yes_Pop, Save_Pop);
   }
   

   
   

}



