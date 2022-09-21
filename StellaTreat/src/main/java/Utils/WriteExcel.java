package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	FileOutputStream outstream;
	static HSSFWorkbook workbook;
	Sheet sheet;
	Map<Integer, String> map = new HashMap<>();
	static Column col;
	static Cell cell;
	String NewText;
	String FinalText;
	static String Seentextnew;
	// int i=0;
	StringBuffer text;

	public static void writetosheetWeek1(String loopFinaltext, int i,String Sheetname) {

		try {
			XSSFWorkbook workbook;
			// Sheet sheet;

			File file = new File("C:\\Users\\shilp\\eclipse-workspace\\StellaTreat\\src\\main\\java\\TestData\\Week1.xlsx");
			//File file = new File("C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Week1.xlsx");
			//File file=new File("C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Point.xlsx");
			// Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			// creating workbook instance that refers to .xls file
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);

			// creating a Sheet object using the sheet Name
			XSSFSheet sheet = wb.getSheet(Sheetname);
			
			XSSFRow row2=sheet.createRow(i);
	        
	        //create a cell object to enter value in it using cell Index
	        row2.createCell(0).setCellValue(loopFinaltext);
	      System.out.println("ROw and value  " +i +loopFinaltext) ; 
	        FileOutputStream outputStream = new FileOutputStream(file);
	        wb.write(outputStream);
	        wb.close();
	        
		}

		catch (Exception fnfe) {

			fnfe.printStackTrace();

		}

	}
	
	
	
	public static void writetosheetWeek2(String loopFinaltext, int i,String Sheetname) {

		try {
			XSSFWorkbook workbook;
			// Sheet sheet;

			File file = new File("C:\\Users\\shilp\\eclipse-workspace\\StellaTreat\\src\\main\\java\\TestData\\Week2.xlsx");
			//File file = new File("C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Week1.xlsx");
			//File file=new File("C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Point.xlsx");
			// Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			// creating workbook instance that refers to .xls file
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);

			// creating a Sheet object using the sheet Name
			XSSFSheet sheet = wb.getSheet(Sheetname);
			
			XSSFRow row2=sheet.createRow(i);
	        
	        //create a cell object to enter value in it using cell Index
	        row2.createCell(0).setCellValue(loopFinaltext);
	      System.out.println("ROw and value  " +i +loopFinaltext) ; 
	        FileOutputStream outputStream = new FileOutputStream(file);
	        wb.write(outputStream);
	        wb.close();
	        
		}

		catch (Exception fnfe) {

			fnfe.printStackTrace();

		}

	}


	public static void writetosheetWeek3(String loopFinaltext, int i,String Sheetname) {

		try {
			XSSFWorkbook workbook;
			// Sheet sheet;

			File file = new File("C:\\Users\\shilp\\eclipse-workspace\\StellaTreat\\src\\main\\java\\TestData\\Week3.xlsx");
			//File file = new File("C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Week1.xlsx");
			//File file=new File("C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Point.xlsx");
			// Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			// creating workbook instance that refers to .xls file
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);

			// creating a Sheet object using the sheet Name
			XSSFSheet sheet = wb.getSheet(Sheetname);
			
			XSSFRow row2=sheet.createRow(i);
	        
	        //create a cell object to enter value in it using cell Index
	        row2.createCell(0).setCellValue(loopFinaltext);
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
