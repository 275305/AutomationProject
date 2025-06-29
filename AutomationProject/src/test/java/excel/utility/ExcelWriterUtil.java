package excel.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterUtil {

    public static void writeData(String filePath, String sheetName, int rowNum, int colNum, String value) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            // Create row if it doesn't exist
            Row row = sheet.getRow(rowNum);
            if (row == null)
                row = sheet.createRow(rowNum);

            // Create cell if it doesn't exist
            Cell cell = row.getCell(colNum);
            if (cell == null)
                cell = row.createCell(colNum);

            // Set value
            cell.setCellValue(value);

            // Close input stream & write to file
            fis.close();
            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);
            workbook.close();
            fos.close();

            System.out.println("Excel updated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



