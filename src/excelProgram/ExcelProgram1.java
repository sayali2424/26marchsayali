package excelProgram;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public abstract class ExcelProgram1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//step 1
		//create file object and passing the path of ExcelSheet
		File myfile=new File("C:\\velocity - Copy\\sample1.xlsx");
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("my name is "+name);
		
	}

}
