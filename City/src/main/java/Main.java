
// 19 06 2022  19-50 всем привет. код для удобства переписал
import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main{
    public static void main (String[] args) throws Exception {
        try {
// pathname: "d:\\downloads\\excel.xlsx"))  откуда берем данные directory where i take the info
            FileInputStream file = new FileInputStream(new File( pathname: "D:\\Java junior\\SBER.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt ( index: 0);
            Iteratir<Row> rowIterator = row.cellIterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                ///			Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()){
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.printf("%.0f", cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break;
                    }
                }
                System.out.println();
            }
            file close();
        }
        catch (Exception e){
            System.out.println("Что-то пошло не так!! Something wrong has been used");
        }
