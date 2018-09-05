package Others;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadColumnExcelWorking {
	public static String inputFile = "D:\\PegaTestData.xls";

	@SuppressWarnings("unlikely-arg-type")
	
	
	public static void readSheet(String strInputTestDataValue, String strSheetNo) throws IOException {
		System.out.println("File repository is  : " + inputFile);
		File inputWorkbook = new File(inputFile);
		Workbook w;
		// String content;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the sheet according to the sheetNo
			Sheet sheet = w.getSheet(strSheetNo);
			int intColumn = sheet.getColumns();
			int intRows = sheet.getRows();
			int tmpColumnNum = -1;
			for (int columnCount = 0; columnCount < intColumn; columnCount++) {
				for (int rowCount = 0; rowCount < intRows; rowCount++) {
					Cell cell = sheet.getCell(columnCount, rowCount);
					if (cell != null) {
						// content = cell.getContents();
						String cellContent = cell.getContents();
						// if(strInputTestDataValue.equals(arg0))
						if (tmpColumnNum >= 0 && columnCount == tmpColumnNum) {
							System.out.println("Test Data Value is : " + cellContent);
						}
						if (cellContent.equalsIgnoreCase(strInputTestDataValue)) {
							tmpColumnNum = columnCount;
							// System.out.println("Test Data Value is : " + strInputTestDataValue);
							// return strInputTestDataValue ;
						}
					}

				}

			}

		} catch (BiffException e) {

		}
		// return null;
	}

	public static void main(String[] args) throws IOException {
		readSheet("Test", "Sheet1");
	}
}