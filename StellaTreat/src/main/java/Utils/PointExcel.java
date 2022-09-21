package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PointExcel {

	
	public static void writetosheet(String loopFinaltext, int i,String Sheetname) {

		try {
			XSSFWorkbook workbook;
			// Sheet sheet;

			File file = new File("C:\\Users\\shilp\\eclipse-workspace\\StellaTreat\\src\\main\\java\\TestData\\Calc.xlsx");
			
			FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);

			
			XSSFSheet sheet = wb.getSheet(Sheetname);
			
			//XSSFRow row2=sheet.createRow(1);
			XSSFRow row2=sheet.getRow(1);
	        
	        //create a cell object to enter value in it using cell Index
	        row2.createCell(i).setCellValue(loopFinaltext);
	      System.out.println("ROw and value  " +i +loopFinaltext) ; 
	        FileOutputStream outputStream = new FileOutputStream(file);
	        wb.write(outputStream);
	       wb.close();
	        
		}

		catch (Exception fnfe) {

			fnfe.printStackTrace();

		}
}
}
