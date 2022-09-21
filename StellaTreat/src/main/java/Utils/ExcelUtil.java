package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	private FileInputStream fis;
	private static FileOutputStream fileOut;
	private static Workbook wb;
	private static Sheet sh;
	private static Cell cell;
	private static Row row;
	private CellStyle cellstyle;
	private Color mycolor;
	
	private static String excelFilePath;
	private Map<String, Integer> columns = new HashMap<>();

	
	 

	public void createshet() {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");
		XSSFRow row;
	}

	
public static void writetosheet() throws IOException
{
	XSSFWorkbook workbook = new XSSFWorkbook();
	FileOutputStream out = new FileOutputStream(new File("D:/Testdataa.xlsx"));
	workbook.write(out);
    out.close();
}
	public String getCellData(int rownum, int colnum) throws Exception {
		try {
			cell = sh.getRow(rownum).getCell(colnum);
			String CellData = null;
			switch (cell.getCellType()) {
			case STRING:
				CellData = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					CellData = String.valueOf(cell.getDateCellValue());
				} else {
					CellData = String.valueOf((long) cell.getNumericCellValue());
				}
				break;
			case BOOLEAN:
				CellData = Boolean.toString(cell.getBooleanCellValue());
				break;
			case BLANK:
				CellData = "";
				break;
			}
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	public String getCellData(String columnName, int rownum) throws Exception {
		return getCellData(rownum, columns.get(columnName));
	}

	public static void setCellData(String text, int rownum, int colnum) throws Exception {
		try {
			row = sh.getRow(rownum);
			if (row == null) {
				row = sh.createRow(rownum);
			}
			cell = row.getCell(colnum);

			if (cell == null) {
				cell = row.createCell(colnum);
			}
			cell.setCellValue(text);

			fileOut = new FileOutputStream(excelFilePath);
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

}
