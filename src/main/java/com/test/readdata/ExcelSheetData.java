
package com.test.readdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.DataProvider;

import com.test.browser.setup.GeneralBrowserSetting;

/**
 * @author anup
 * Feb 01, 2025
 */ 
public class ExcelSheetData extends GeneralBrowserSetting { 

    // Utility method to get a single cell value
    public static String getData(String sheetName, int rowIndex, int colIndex)
            throws InvalidFormatException, IOException, InterruptedException {

        String data = "";
        Thread.sleep(500); // You may remove this unless necessary for async handling

        FileInputStream fis = null;
        Workbook wb = null; 

        try {   
            String path = readPropertiesFileData("INPUTEXCELFILEPATH");
            fis = new FileInputStream(path);
            wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet(sheetName);

            if (sheet == null) throw new RuntimeException("Sheet '" + sheetName + "' not found.");

            Row row = sheet.getRow(rowIndex);
            if (row == null) throw new RuntimeException("Row " + rowIndex + " is empty.");

            Cell cell = row.getCell(colIndex);
            if (cell == null) throw new RuntimeException("Cell at row " + rowIndex + ", column " + colIndex + " is empty.");

            switch (cell.getCellTypeEnum()) {
                case STRING:
                    data = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    data = DateUtil.isCellDateFormatted(cell)
                        ? cell.getDateCellValue().toString()
                        : String.valueOf(cell.getNumericCellValue());
                    break;
                case BOOLEAN:
                    data = String.valueOf(cell.getBooleanCellValue());
                    break;
                case FORMULA:
                    FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
                    CellValue cellValue = evaluator.evaluate(cell);
                    switch (cellValue.getCellTypeEnum()) {
                        case STRING:
                            data = cellValue.getStringValue();
                            break;
                        case NUMERIC:
                            data = String.valueOf(cellValue.getNumberValue());
                            break;
                        case BOOLEAN:
                            data = String.valueOf(cellValue.getBooleanValue());
                            break;
                        default:
                            data = "";
                    }
                    break;
                case BLANK:
                    data = "";
                    break;
                default:
                    throw new RuntimeException("Unknown cell type at row " + rowIndex + ", column " + colIndex);
            }

        } catch (Exception e) {
            System.out.println("Error while reading Excel: " + e.getMessage());
            throw e;
        } finally {
            if (wb != null) wb.close();
            if (fis != null) fis.close();
        } 

        return data;
    }
 
	//To read the data from Excel-sheet using DataProvider in TestNG
  
	public static Object[][] dataProviderExcelsheetReadData(String sheetName) throws IOException {
		
		//Create the Object of FileInputStream and pass the path of Excel in the constructor
		//FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "./InputData/DataProvider_InputData.xlsx");
		// FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "./InputData/DataProvider_OPDNursing.xlsx");
	    FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "./InputData/DataProvider_FrontOffice.xlsx");
	    // FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "./InputData/DataProvider_IpNursing.xlsx");
		
	    
		//Create the object of XSSFWorkbook
		XSSFWorkbook workbook = new XSSFWorkbook(ip);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		//No of rows and cols
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];
		for (int i = 0; i < rows; i++) {
			XSSFRow row = sheet.getRow(i + 1);

			for(int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);

				CellType cellType = cell.getCellTypeEnum();

				switch(cellType) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
					
					
					/*	case NUMERIC:
							data[i][j] = Integer.toString((int)cell.getNumericCellValue());
							break;
		               */

				case NUMERIC:
				    if (DateUtil.isCellDateFormatted(cell)) {
				        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				        data[i][j] = dateFormat.format(cell.getDateCellValue());
				    } else {
				        data[i][j] = String.valueOf(cell.getNumericCellValue());
				    }
				    break;
		/*			
			
				case NUMERIC:
				    if (DateUtil.isCellDateFormatted(cell)) {
				        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				        data[i][j] = dateFormat.format(cell.getDateCellValue());  // Convert date to string
				    } else {
				        // Always treat numeric as string, without any decimal if it's a whole number
				        double numericValue = cell.getNumericCellValue();
				        if (numericValue == (long) numericValue) {
				            data[i][j] = String.valueOf((long) numericValue); // Integer-like
				        } else {
				            data[i][j] = String.valueOf(numericValue); // Decimal
				        }
				    }
		*/		    
				    
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				}
			}
		}
		return data;
	}

    // TestNG DataProvider method
	
    @DataProvider(name = "DataProviderInputData")
    public static Object[][] getDataProviderExcelsheetData() throws IOException {
        return dataProviderExcelsheetReadData("nursing_io_Chart");
    }
    
    
    
    @DataProvider(name = "DataProviderInputDataReprintNursing")
    public static Object[][] getDataProviderExcelsheetData4() throws IOException {
        return dataProviderExcelsheetReadData("RePrintBarcodeNursingActivity");
    
  }
    @DataProvider(name = "DataProviderInputDataNursingRePrintBarcodeTc_001")
    public static Object[][] getDataProviderExcelsheetData5() throws IOException {
        return dataProviderExcelsheetReadData("NursingRePrintBarcodeTestTc_001");
    } 
    
    @DataProvider(name = "DataProviderInputDataNursingDietListTc_002")
    public static Object[][] getDataProviderExcelsheetData6() throws IOException {
        return dataProviderExcelsheetReadData("NursigDietList");
    
     }
    
 //____________________OPD Nursing____________________________
    
    @DataProvider(name = "DataProviderInputDataOPDNursingworkbench")
    public static Object[][] getDataProviderExcelsheetDataWorkbench() throws IOException {
        return dataProviderExcelsheetReadData("NursingWorkbench");
}
    
    @DataProvider(name = "DataProviderInputDataOPDProcedureComletion")
    public static Object[][] getDataProviderExcelsheetDataProcedureComletion() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingProcedureComletion"); 
   
    } 
    
    @DataProvider(name = "DataProviderInputDataOPDConsentEpisode")
    public static Object[][] getDataProviderExcelsheetDataConsentEpisode() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingConsentEpisode");
    
    }
    
    @DataProvider(name = "DataProviderInputDataOPDEMR")
    public static Object[][] getDataProviderExcelsheetDataEMR() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingEMR");
}
    @DataProvider(name = "DataProviderInputDataNotesTempalet")
    public static Object[][] getDataProviderExcelsheetDataNotes() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingNotesTemplates");
        
    }
     
    @DataProvider(name = "DataProviderInputDataVitals")
    public static Object[][] getDataProviderExcelsheetDatavitals() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingVitals");
    
    }
    
    @DataProvider(name = "DataProviderInputDataInvectiousVulnerable")
    public static Object[][] getDataProviderExcelsheetDataInvectiousVulnerable() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursinglnerablePatient");
            
    }
    
    @DataProvider(name = "DataProviderInputDataPriorityCritical")
    public static Object[][] getDataProviderExcelsheetDataPriorityCritical() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingPriorityCritical");
    
    }
    
    @DataProvider(name = "DataProviderInputDataUploadDocumentPatient")
    public static Object[][] getDataProviderExcelsheetDataUploadDocumentPatient() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingUploadDocumentPatient");
     }
    
    @DataProvider(name = "DataProviderInputDataSignedPatientList")
    public static Object[][] getDataProviderExcelsheetDataSignedPatientLis() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingSignedPatientLis");
     } 
    
    @DataProvider(name = "DataProviderInputDataAllergy")
    public static Object[][] getDataProviderExcelsheetDataAllergy() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingAllergy");
     } 
    
    @DataProvider(name = "DataProviderInputDataPSDHistory")
    public static Object[][] getDataProviderExcelsheetDataPSDHistory() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingPSDHistory");
     }  
    
    @DataProvider(name = "DataProviderInputDataSerologyPositive")
    public static Object[][] getDataProviderExcelsheetDataSerologyPositive() throws IOException {
        return dataProviderExcelsheetReadData("OPDNursingSerologyPositive");
     } 
    
    
    @DataProvider(name = "DataProviderInputDataOPDProcedureComletionPhysicianOrder")
    public static Object[][] getDataProviderExcelsheetDataOPDProcedureComletionPhysicianOrder() throws IOException {
        return dataProviderExcelsheetReadData("TS02_phy_OPDNursingProcedureCon"); 
   
    } 
    
    
    @DataProvider(name = "DataProviderInputDataOPDNursingVitalsAppointment")
    public static Object[][] getDataProviderExcelsheetDataOPDNursingVitalsAppointment() throws IOException {
        return dataProviderExcelsheetReadData("TS01_appoin_OPDNursingVitals"); 
   
    } 
    
    
    @DataProvider(name = "DataProviderInputDataOPDNursingAllergy")
    public static Object[][] getDataProviderExcelsheetDataOPDNursingAllergyt() throws IOException {
        return dataProviderExcelsheetReadData("TS03_appoin_OPDNursingAllergy"); 
   
    } 
    
 //____________________________________Front Office_____________________________________
  
    
    @DataProvider(name = "DataProviderInputDataFrontOfficeRegistrationPage")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeRegistrationPage() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficePatientRegistration");
     } 
    
    
    @DataProvider(name = "DataProviderInputDataFrontOfficeAppointmentScheduling")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeAppointmentScheduling() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficeAppointmentSchedul");
     } 
    
    @DataProvider(name = "DataProviderInputDataFrontOfficeEquipmentSchedule")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeEquipmentSchedule() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficeEquipmentSchedule");
     }  
  
    @DataProvider(name = "DataProviderInputDataDoctorCurrentStatus")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeDoctorCurrentStatus() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficeDoctorCurrentStatus");
     }  
  
    @DataProvider(name = "DataProviderInputDataSearchSchedule")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeSearchSchedule() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficeSearchSchedule");
     }  
    
    @DataProvider(name = "DataProviderInputDataPhysicianOrderbill")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficePhysicianOrderbill() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficePhysicianOrderbill");
     }   
    
    @DataProvider(name = "DataProviderInputDataHomeCareAppointment")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeDoctorApponHomeCareAppointment() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficeHomeCareAppointment");
     }    
    
    @DataProvider(name = "DataProviderInputDataBlockHomeCareAppointment")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeBlockHomeCareAppointment() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficeBlockHomeCareAppo");
     }  
    
    @DataProvider(name = "DataProviderInputDataPhysicianOrderReBilling")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficePhysicianOrderReBilling() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficePhyOrderReBilling");
     }   
    
    @DataProvider(name = "DataProviderInputDataFrontOfficeUploadDocument")
    public static Object[][] getDataProviderExcelsheetDataFrontOfficeUploadDocument() throws IOException {
        return dataProviderExcelsheetReadData("FrontOfficeUploadDocument");
     }   
   
    //------------------------------ ipNursing --------------------------------------
    
    @DataProvider(name = "DataProviderInputDataNursingActivity")
    public static Object[][] getDataProviderExcelsheetDataNursingActivity() throws IOException {
        return dataProviderExcelsheetReadData("Nursing_Activity");
     }
    
} 


// 1>  OP_Billing
//2> NursingActivityAcknowledgement
// 3> nursing_io_Chart
// 4> RePrintBarcodeNursingActivity