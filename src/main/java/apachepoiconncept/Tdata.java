package apachepoiconncept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tdata {
	public static void main(String arg[]) throws IOException
	{
		//Workbook
		//sheet
		//Row
		//Cell
		
		
		//here we passes xlshite path 
		FileInputStream file=new FileInputStream("C:\\Users\\Amaze\\eclipse-workspace\\com.PassIndia.project\\Data\\TestData.xlsx");
		
		//it is a workbook object
		//XSSFWorkbook--->its a class , XSSFWorkbook(file);---> its a constuctor 
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		//in workbook number of sheets are present so thats why we use getNumberOfSheets()---->method
		int sheets=workbook.getNumberOfSheets();
		//i=0-->index start from zero like pointer start from zeroth position at xl-sheet
		for(int i=0;i<sheets;i++)
		{
			//in workbook there may sheet are present so here we mention only one sheet name for fetch proper data from particular sheet 
			//getSheetName(i)-->return ith location .equalsIgnoreCase("TestData")---> to return as user expected name through 
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"));
			{
				//.getsheetAt(i)---->its predefine method to return the sheet from workbook
				//identify test cases and scanning the entire first row 
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				Iterator<Row> rows=sheet.iterator();// sheet is collection of rows
				Row firstrow=rows.next();//poniter will move to next row using this syntax 
				
				Iterator<Cell> ce=firstrow.cellIterator();// row is collection of cell
				int k=0;
				int coloumn=0;
				while(ce.hasNext())// here ce.hasNext()--> to find particular cell from sheet  
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases"))// we passes here entre coloumn name so here passes data name 
					{
						coloumn=k;// 
					}
					k++; // return value --->++ through preincrement -->k++ is increment
					
				}
				System.out.println(coloumn);// ones coloumn is identify then scaan entire "TestCases" coloumn to identify all data 
				// Row 
				while(rows.hasNext())// here ce.hasNext()--> to find particular cell from sheet  
				{
					Row r=rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(" "))// we passes here entre coloumn name so here passes data name 
					{
						rows=i;// 
					}
					i++; // return value --->++ through preincrement -->k++ is increment
					
				}
				System.out.println(rows);
			}
		}
		
	}
	
	
}
