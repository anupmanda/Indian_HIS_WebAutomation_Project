/**
 * 
 */
package com.test.physician.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.test.physician.page.OPDPysicianOrderPage;

/**
 * @author Anup
 *
 * 01-Aug-2025
 */
public class OPDPhysicianOrderTesst extends OPDPysicianOrderPage{

	public OPDPysicianOrderPage opdphysicianorder = new OPDPysicianOrderPage();

	@Test(priority =1)

	public void opdPhysicianOrderCaseSheet() throws IOException , InterruptedException, InvalidFormatException {

		logger = extent.createTest("OPD Physician Order ", "OPD Physician Order  Page.");


		opdphysicianorder.selectByFacilityDropdown("SANITY HOSPITAL");
		opdphysicianorder.clickOnPhysicianDashboardIcon("Click Physician Dashboard");
		opdphysicianorder.selectByDepartmentDropdown("Physician");
		opdphysicianorder.clickOnDepartmentYesPopup("Click Yes on Department Popup");


		opdphysicianorder.clickOnOutPatientIcon("Click OPD Outpatient Icon");
		opdphysicianorder.enterOnFromDate("27-07-2025");
		// opdphysicianorder.enterOnToDate("01-08-2025");
		Thread.sleep(300);
		opdphysicianorder.clickOnSearchDataButton("Click on Search Button");

		opdphysicianorder.clickOnUHIDSearchIcon("Click Search UHID Icon");
		opdphysicianorder.enterOnUHIDSearchField("883362");
		opdphysicianorder.clickOnUHIDSearchIcon("Click Search UHID Icon");
		opdphysicianorder.clickOnSelectPatientFromQueue("Click on Patient from Queue");

		opdphysicianorder.clickOnCaseSheetOrderIcon("Click Case Sheet Orders Icon");

		//Laboratory
		opdphysicianorder.clickOnOrderLaboratoryIcon("Click Order Lab Icon");
		opdphysicianorder.enterOnLabSearchField("CBC raj");
		opdphysicianorder.clickOnCBC_SHMS_Test("Click CBC SHMS");
		opdphysicianorder.selectBySampleTypeDropdown("Blood");
		Thread.sleep(300);
		opdphysicianorder.enterOnSampleNote("Patient showing mild symptoms.");
		Thread.sleep(300);
		opdphysicianorder.clickOnSaveSampleButton("Click Save Sample");
		Thread.sleep(300);

		// Click on Procedures Tab
		opdphysicianorder.clickOnProceduresTab("Click on Procedures tab");
		opdphysicianorder.selectProceduresDepartment("CARDIAC ANAESTHESIA");
		opdphysicianorder.enterInProceduresSearchField("3D CRT Curative");
		opdphysicianorder.clickOnProceduresSearchResult("Select 3d crt Cells");
		opdphysicianorder.selectDoctorForProcedure("Simran Rawat");
		opdphysicianorder.clickOnSaveDoctorProcedure("Click on Save Doctor");
		opdphysicianorder.enterOrderCommentsForProcedure("Procedure ordered urgently for transfusion.");

		//RadiologyCardiology
		opdphysicianorder.clickOnRadioCardioButton("Click Radiology Tab");
		opdphysicianorder.enterRadioCardioSearch("2D MRI - Spine");
		opdphysicianorder.clickOnRadioCardioFirstResult("Click First Result");
		opdphysicianorder.clickLabResultsYesPopup("Click Yes on Lab Alert");
		opdphysicianorder.enterRadioCardioComments("2D MRI - Spine Required");

		// ReferralsAndAdviceOrder
		opdphysicianorder.clickOnReferralsAdviceButton("Click Referrals & Advice");
		opdphysicianorder.selectReferralsAdviceFacility("SANITY HOSPITAL");
		opdphysicianorder.selectReferralsAdviceSpeciality("Cardiac Sciences");
		opdphysicianorder.selectReferralsAdviceDoctor("Himanshu Sharma Cardiologist");
		opdphysicianorder.selectReferralsAdvicePriority("Routine");

		opdphysicianorder.selectReferralsAdviceNoteType("PROGRESS");
		opdphysicianorder.selectReferralsAdviceTemplateYesNo("yes"); 
		opdphysicianorder.clickReferralsAdviceGenderCheckbox("Click Gender Checkbox");
		opdphysicianorder.clickReferralsAdviceSaveIcon("Click Save");

		opdphysicianorder.clickReferralsAdviceAddRowPlushIcon("Click Add Row");

		//Vitals

		opdphysicianorder.enterBloodSugarFasting("95");
		opdphysicianorder.enterBloodSugarRandom("120");

		opdphysicianorder.enterDystolicBP("80");
		opdphysicianorder.enterHeadCircumference("55");

		opdphysicianorder.enterHeartRate("76");
		opdphysicianorder.enterMeanBP("90");
		opdphysicianorder.enterPainScore("2");

		opdphysicianorder.enterHeight("165");



		opdphysicianorder.clickOnOrderSaveHeaderButton("Click Order Save");   //save header button

		opdphysicianorder.clickOnVerifyOrderButton("Click Verify Order");
		opdphysicianorder.enterOnVerificationPassword("Abcd@1234");
		opdphysicianorder.clickOnVisitIconPopup("Confirm Visit Popup");

		opdphysicianorder.clickOnCloseCaseSheetIcon("Close Case Sheet");
		opdphysicianorder.clickOnHomePageIcon("Click on Home Page Button");

		System.out.println("Physician lab order flow completed successfully.");

	}

}


