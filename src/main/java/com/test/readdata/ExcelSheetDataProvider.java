package com.test.readdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetDataProvider {

    public static Object[][] getExcelData(String sheetName) throws IOException {

        String filePath = System.getProperty("user.dir")
                + "/InputData/DataProvider_FrontOffice.xlsx";

        FileInputStream ip = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(ip);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows][cols];

        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i + 1);

            for (int j = 0; j < cols; j++) {

                Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

                switch (cell.getCellType()) {

                    case STRING:
                        data[i][j] = cell.getStringCellValue().trim();
                        break;

                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {

                            // TIME (HH:mm)
                            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                            String time = timeFormat.format(cell.getDateCellValue());

                            if (!time.equals("00:00")) {
                                data[i][j] = time;
                            } 
                            // DATE (dd/MM/yyyy)
                            else {
                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                data[i][j] = dateFormat.format(cell.getDateCellValue());
                            }

                        } else {
                            data[i][j] = String.valueOf((long) cell.getNumericCellValue());
                        }
                        break;

                    case BOOLEAN:
                        data[i][j] = String.valueOf(cell.getBooleanCellValue());
                        break;

                    default:
                        data[i][j] = "";
                        break;
                }
            }
        }

        workbook.close();
        ip.close();
        return data;
    }
}
