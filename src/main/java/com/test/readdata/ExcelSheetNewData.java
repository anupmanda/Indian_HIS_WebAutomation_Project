/**
 * 
 */
package com.test.readdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.test.browser.setup.GeneralBrowserSetting;

/**
 * @author Anup
 *
 * 05-Aug-2025
 */
public class ExcelSheetNewData extends GeneralBrowserSetting {
	
	
	

	    // To read a single cell value
	    public static String getData(String fileName, String sheetName, int rowIndex, int colIndex)
	            throws IOException, InvalidFormatException {

	        String basePath = readPropertiesFileData("INPUTEXCELFILEPATH"); // like: ./InputData/
	        String fullPath = System.getProperty("user.dir") + basePath + fileName;

	        try (FileInputStream fis = new FileInputStream(fullPath);
	             Workbook wb = WorkbookFactory.create(fis)) {

	            Sheet sheet = wb.getSheet(sheetName);
	            Row row = sheet.getRow(rowIndex);
	            Cell cell = row.getCell(colIndex);

	            switch (cell.getCellTypeEnum()) {
	                case STRING:
	                    return cell.getStringCellValue();
	                case NUMERIC:
	                    return DateUtil.isCellDateFormatted(cell)
	                            ? new SimpleDateFormat("dd/MM/yyyy").format(cell.getDateCellValue())
	                            : String.valueOf(cell.getNumericCellValue());
	                case BOOLEAN:
	                    return String.valueOf(cell.getBooleanCellValue());
	                case FORMULA:
	                    FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
	                    CellValue cellValue = evaluator.evaluate(cell);
	                    switch (cellValue.getCellTypeEnum()) {
	                        case STRING:
	                            return cellValue.getStringValue();
	                        case NUMERIC:
	                            return String.valueOf(cellValue.getNumberValue());
	                        case BOOLEAN:
	                            return String.valueOf(cellValue.getBooleanValue());
	                        default:
	                            return "";
	                    }
	                case BLANK:
	                    return "";
	                default:
	                    throw new RuntimeException("Unknown cell type at row " + rowIndex + ", column " + colIndex);
	            }
	        }
	    }

	    // DataProvider utility to read full sheet
	    public static Object[][] readExcelSheet(String fileName, String sheetName) throws IOException {

	        String basePath = readPropertiesFileData("INPUTEXCELFILEPATH"); // like: ./InputData/
	        String fullPath = System.getProperty("user.dir") + basePath + fileName;

	        try (FileInputStream fis = new FileInputStream(fullPath);
	             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

	            XSSFSheet sheet = workbook.getSheet(sheetName);
	            int rows = sheet.getLastRowNum();
	            int cols = sheet.getRow(0).getLastCellNum();

	            Object[][] data = new Object[rows][cols];
	            for (int i = 0; i < rows; i++) {
	                XSSFRow row = sheet.getRow(i + 1);
	                for (int j = 0; j < cols; j++) {
	                    XSSFCell cell = row.getCell(j);
	                    if (cell == null) {
	                        data[i][j] = "";
	                        continue;
	                    }

	                    switch (cell.getCellTypeEnum()) {
	                        case STRING:
	                            data[i][j] = cell.getStringCellValue();
	                            break;
	                        case NUMERIC:
	                            if (DateUtil.isCellDateFormatted(cell)) {
	                                data[i][j] = new SimpleDateFormat("dd/MM/yyyy").format(cell.getDateCellValue());
	                            } else {
	                                data[i][j] = String.valueOf(cell.getNumericCellValue());
	                            }
	                            break;
	                        case BOOLEAN:
	                            data[i][j] = cell.getBooleanCellValue();
	                            break;
	                        default:
	                            data[i][j] = "";
	                    }
	                }
	            }
	            return data;
	        }
	    }
  
	    // Dynamic TestNG DataProvider
	   @DataProvider(name = "ExcelDataProvider")
	    public static Object[][] provideExcelData(Method method) throws IOException {
	        ExcelSource excelSource = method.getAnnotation(ExcelSource.class);
	        return readExcelSheet(excelSource.fileName(), excelSource.sheetName());
	    }
	 
	    // Helper to read path from properties file
	    protected static String readPropertiesFileData(String key) throws IOException {
	        Properties prop = new Properties();
	        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
	       
	        prop.load(fis);
	        return prop.getProperty(key);
	    }
	  
	    
	    @Retention(RetentionPolicy.RUNTIME)
	    @Target(ElementType.METHOD)
	    public @interface ExcelSource {
	        String fileName();
	        String sheetName();
	    }

	}
 


