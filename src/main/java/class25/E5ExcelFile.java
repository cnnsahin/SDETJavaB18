package class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E5ExcelFile {
    public static void main(String[] args) throws IOException {
        var path="/Users/canansahinkoyuncu/SDETJavaB18/Files/Batch18.xlsx";
        var fis = new FileInputStream(path);
        var excel=new XSSFWorkbook(fis);
        var sheet=excel.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();// number of rows 6

        for (int i = 0; i < noOfRows; i++) {// number of rows 6

            Row row=sheet.getRow(i);// it's First name, last name, age and salary row

            int noOfCol=row.getPhysicalNumberOfCells();// number of column 4
            for (int j = 0; j < noOfCol; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }

    }
}

