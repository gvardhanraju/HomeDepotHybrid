package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	   public static XSSFWorkbook workbook;
	    public static XSSFSheet sheet;
	    public static XSSFRow row;
	    public static XSSFCell cell;
	    public static FileInputStream file;
	    public static int rowCount;
	    public static int cellCount;
	    /*
	     * a. Method Name: readData
	     * b. Author Name: Jahnavi Dasari
	     * c. Description: This method is to read data fom excel.
	     * d. Return Type: String
	     * e. Parameters: 
	     * String path: path of the excel sheet
	     * String name: name of the sheet
	     * int r: row of the sheet
	     * int c: column of the sheet
	     */
	    public static String readData(String path,String name, int rows, int cols){
	        try {
	            file=new FileInputStream(path);
	            workbook= new XSSFWorkbook(file);
	            sheet=workbook.getSheet(name);
	            row=sheet.getRow(rows);
	            cell=row.getCell(cols);
	            String value=cell.toString();
	            return value;
	        }catch(FileNotFoundException e){
	            e.printStackTrace();
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	    /*
	     * a. Method Name: getExcelData
	     * b. Author Name: Jahnavi Dasari
	     * c. Description: This method is to read data fom excel in 2-D format.
	     * d. Return Type: Object[][]
	     * e. Parameters: 
	     * String path: path of the excel sheet
	     * String name: name of the sheet
	     */
	    public static Object[][] getExcelData(String path,String name){
	        try {
	            file=new FileInputStream(path);
	            workbook= new XSSFWorkbook(file);
	            sheet=workbook.getSheet(name);
	            rowCount=sheet.getPhysicalNumberOfRows();
	            cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
	            Object[][] data=new Object[rowCount][cellCount];
	            for(int i=0;i<rowCount;i++){
	                row=sheet.getRow(i);
	                for(int j=0;j<cellCount;j++){
	                    cell=row.getCell(j);
	                    data[i][j]=cell.toString();
	                }
	            }
	            return data;
	        }catch(FileNotFoundException e){
	            e.printStackTrace();
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
