import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    //public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    public static void main (String[] args) throws Exception {
        try {
            FileInputStream file = new FileInputStream(new File( "D:\\Java junior\\SBER.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt( 0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.printf(String.valueOf(cell.getDateCellValue()));
                            } else {
                                System.out.printf("%.0f", cell.getNumericCellValue());
                            }
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close ();
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
