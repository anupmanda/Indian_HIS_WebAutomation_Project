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
 * 24 Dec 2025
 */
public class ADT_Previous_Admission_Details extends GeneralBrowserSetting{
	    protected static String ClickIFPressent = "//*[@id=\"btnNoChangePass\"]";
	    protected static String SelectFacility = "//*[@id=\"Facility\"]";
	    protected static String ClickADTBTN = "//*[@id=\"btn_adt\"]";
	    protected static String SelectStation = "//*[@id=\"Department\"]";
	    protected static String ClickStationYesBtn = "//*[@id=\"btn_yes_desh\"]";
	    protected static String ClickAdmitPatientLink = "//*[@id=\"FOAddPatientMenu\"]";
	    protected static String ClickPreviousAdmissionDetails = "//*[@id=\"FOAddPatientMenu\"]/ul/li[10]/a";
	    protected static String TextUHID = "//*[@id=\"uhid_admimitPatient\"]";
	    protected static String ClickFirstAvailable = "//*[@id=\"dgvPreviousAdmDetails\"]/tbody/tr[1]/td[1]";
	    protected static String ClickFirstAvailable1 = "//*[@id=\"dgtransferdetail\"]/tbody/tr[1]/td[2]";
	    
	    public void PreviousAdmissionDetails(String Facility, String Station, String UHID) throws IOException, InterruptedException {
	    	 CommanUtill.dropdownSelectByVisibleText(SelectFacility, Facility);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickADTBTN, "Clicked on ADT Button");
	         Thread.sleep(500);
	         CommanUtill.dropdownSelectByVisibleText(SelectStation, Station);
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickStationYesBtn, "Clicked Station Yes Button");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickAdmitPatientLink, "Clicked Admit Patient");
	         Thread.sleep(500);
	         CommanUtill.clickByJSFunction(ClickPreviousAdmissionDetails, "Clicked on The Previous Admission Details");
	         Thread.sleep(500);
	         CommanUtill.textEnter(TextUHID, UHID);
	         Thread.sleep(500);
	         CommanUtill.pressEnter(TextUHID);
	         Thread.sleep(500);
	         CommanUtill.clickFunction(ClickFirstAvailable, "Clicked on The First Availabe Data");
	    }

}
