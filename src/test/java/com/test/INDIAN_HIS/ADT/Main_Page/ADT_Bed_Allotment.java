/**
 * 
 */
package com.test.INDIAN_HIS.ADT.Main_Page;

import java.io.IOException;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Ashutosh
 *
 * 22 Dec 2025
 */
public class ADT_Bed_Allotment extends GeneralBrowserSetting{
	
	protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	protected static String SelectFacility = "//*[@id=\"Facility\"]";
	protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
    protected static String SelectStation = "//*[@id=\"Department\"]";
    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
    protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
    protected static String ClickBedAllotment = "//*[@id=\"FOAddPatientMenu\"]/ul/li[8]/a"; 
    
    protected static String TextUHID = "//*[@id=\"uhid_admimitPatient\"]"; 
    protected static String TextIPNO = "//*[@id=\"txtIpId\"]";
    protected static String SelectReqBedType = "//*[@id=\"ddBedRequested\"]";
    protected static String SelectBillableBedType = "//*[@id=\"ddBedBillable\"]";
    protected static String SelectAllotedBedType = "//*[@id=\"ddBedAlloted\"]";
    protected static String SelectWard = "//*[@id=\"ddWard\"]";
    protected static String SelectBed = "//*[@id=\"ddBedNumber\"]";
    protected static String ClickSaveBtn = "//*[@id=\"btnSave\"]";
    
    public void BedAllotment(String Facility,String Station, String IPNO, String RequestedBedType, String BillableBedType, 
    		String AllotedBedType, String Ward) throws IOException, InterruptedException {
    	CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
    	Thread.sleep(500);
    	CommanUtill.clickFunction(ClickADTBTN, "Clicked on The ADT Button");
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked on The Station Yes Button");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked on The Admit Patient Link");
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickBedAllotment, "Clicked on The Bed Allotment Link");
    	Thread.sleep(500);
    	CommanUtill.textEnter(TextIPNO, IPNO);
    	Thread.sleep(500);
    	CommanUtill.pressEnter(TextIPNO);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectReqBedType, RequestedBedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectBillableBedType, BillableBedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectAllotedBedType, AllotedBedType);
    	Thread.sleep(500);
    	CommanUtill.dropdownSelectByVisibleText(SelectWard, Ward);
    	Thread.sleep(500);
    	CommanUtill.clickByJSFunction(ClickSaveBtn, "Cicked on The Save Button");
    }
}
