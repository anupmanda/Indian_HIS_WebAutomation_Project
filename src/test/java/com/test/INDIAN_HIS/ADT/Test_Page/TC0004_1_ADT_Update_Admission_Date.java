package com.test.INDIAN_HIS.ADT.Test_Page;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Admit_Patient;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Booking;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Bed_Booking_Status;
import com.test.INDIAN_HIS.ADT.Main_Page.ADT_Update_Admission_Date;
import com.test.readdata.ExcelSheetDataProvider;
import com.test.ui.helper.CommanUtill;

public class TC0004_1_ADT_Update_Admission_Date extends ADT_Bed_Booking_Status {

    private ADT_Bed_Booking_Status bbs = new ADT_Bed_Booking_Status();
    private final ADT_Bed_Booking bb = new ADT_Bed_Booking();
    private final ADT_Admit_Patient adt = new ADT_Admit_Patient();
    private final ADT_Update_Admission_Date uad = new ADT_Update_Admission_Date();

    private final String SheetName = "Bed_Booking";
    private final String SheetName1 = "Admit_Patient";
    private final String SheetName2 = "updateADD";

    // ===================== Bed Booking =====================
    @Test(dataProvider = "ExcelUniversalDataProvider", priority = 1)
    public void BedBooking(
            String Facility, String Station, String Title, String Sex,
            String FatherName, String M_Status, String Address, String City,
            String State, String Country, String Reference, String Bed,
            String PSpeciality, String ReferredBy, String ReqBedType,
            String RBTBPD, String ReqBedType1, String AlloBedType, String Ward)
            throws IOException, InterruptedException {

        logger = extent.createTest("Bed_Booking", "Bed will be Booked for Registered Patient");

        bb.BedBooking(Facility, Station, Title, Sex, FatherName, M_Status,
                Address, City, State, Country, Reference, ReqBedType);

        bb.Consultant(PSpeciality, ReferredBy, ReqBedType);
        bb.BedandPaymentDetails(RBTBPD);
        bb.ClickSave();
        verifyPopUpSuccess(driver);
        bb.UpdateBedBookingDetails();
        CommanUtill.ClickHomePage();
    }

    @DataProvider(name = "ExcelUniversalDataProvider")
    public Object[][] getBedBookingData() throws IOException {
        return ExcelSheetDataProvider.getExcelData(SheetName);
    }

    // ===================== Bed Booking Status =====================
    @Test(dataProvider = "ExcelUniversalDataProvider", priority = 2)
    public void BedBookingStatus(
            String Facility, String Station, String Title, String Sex,
            String FatherName, String M_Status, String Address, String City,
            String State, String Country, String Reference, String Bed,
            String PSpeciality, String ReferredBy, String ReqBedType,
            String RBTBPD, String ReqBedType1, String AlloBedType, String Ward)
            throws IOException, InterruptedException {

        logger = extent.createTest("Bed_Booking_Status", "Booked Bed Status");

        bbs.BookingStatus(Facility, Station, ReqBedType1, AlloBedType, Ward);
    }

    // ===================== Admit Patient =====================
    @DataProvider(name = "Admit_Patient_Data")
    public Object[][] getAdmitPatientData() throws IOException {
        return ExcelSheetDataProvider.getExcelData(SheetName1);
    }

    @Test(dataProvider = "Admit_Patient_Data", priority = 3)
    public void AdmitPatient_BedBookingStatus(
            String Facility, String Station, String Title, String Gender,
            String DOB, String FatherName, String M_Status, String Address,
            String City, String Nationality, String ABCPin, String Speciality,
            String Referred, String Stay, String Source, String BedType,
            String Ward, String Package_Speciality, String KinName,
            String Relation, String Name, String BillingCo, String ClinicalCo)
            throws IOException, InterruptedException {

        logger = extent.createTest("Admit_Patient", "Admit Patient Process");

        adt.AdmitPatientByBedBookingStatus(
                DOB, ABCPin, Referred, Stay, Source,
                Package_Speciality, KinName, Relation,
                Name, BillingCo, ClinicalCo);
    }

    // ===================== Update Admission Date =====================
    @DataProvider(name = "updateADD_Details")
    public Object[][] getUpdateAdmissionData() throws IOException {
        return ExcelSheetDataProvider.getExcelData(SheetName2);
    }

    @Test(dataProvider = "updateADD_Details", priority = 4)
    public void UpdateAdmissionDate(String Facility, String Station, String DischargeType)
            throws IOException, InterruptedException {

        logger = extent.createTest("Update Admission Date",
                "Admission Date Will be Updated");
       
        uad.ADTUpdateAmission1(Facility, Station, DischargeType);
        Thread.sleep(500);
        CommanUtill.ClickHomePage();
    }
}
