package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

	private Workbook workbook;

	public ExcelReader(String excelPath) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(excelPath);
		workbook = new XSSFWorkbook(fileInputStream);
	}

	// Method to get cell data
	public String getCellData(String sheetName, int rowNumber, int columnNumber) {
		try {
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNumber);
			Cell cell = row.getCell(columnNumber);

			if (cell == null) {
				return ""; // Return empty string if cell is null
			}

	// Handle different data types
			switch (cell.getCellType()) {
			case STRING:
				return cell.getStringCellValue();
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					return cell.getDateCellValue().toString();
				} else {
					return String.valueOf((int) cell.getNumericCellValue());
				}
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case FORMULA:
				return cell.getCellFormula();
			default:
				return "";
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			return "";
		}
	}
}
