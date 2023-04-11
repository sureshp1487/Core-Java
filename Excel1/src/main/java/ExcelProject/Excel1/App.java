package ExcelProject.Excel1;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       XSSFWorkbook wb=new XSSFWorkbook();
       XSSFSheet spreadSheet=wb.createSheet("java modules"); 
       
       
       
       
       OutputStream fileOut=new FileOutputStream("D://suresh1.xlsx");
       
       Sheet sheet1=wb.createSheet("java");
       Sheet sheet2=wb.createSheet("python");
       Sheet sheet3=wb.createSheet("html");
       System.out.println("Sheets has been created successfully");
       
       int numberOfSheets=wb.getNumberOfSheets();
       System.out.println("Total Number of Sheets :"+numberOfSheets);
       
       wb.write(fileOut);
    }
}
