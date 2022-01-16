package Activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Activity15 {
    public static void main(String[] args) {
        String Filepath = "C:\\Users\\002A6X744\\Desktop\\FST\\src\\src\\main\\resources\\Activity15.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        Object[][] datatypes = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };
        int rowNo = 0;
        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNo++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try{
            FileOutputStream outputStream = new FileOutputStream(Filepath);
            workbook.write(outputStream);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
