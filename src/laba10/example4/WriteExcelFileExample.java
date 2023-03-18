package laba10.example4;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        var workbook = new XSSFWorkbook();
        var sheet = workbook.createSheet("Товары");

        var headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        var dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(500.0);

        var dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 8 ГБ");
        dataRow2.createCell(2).setCellValue(25000.0);

        var filePath = "src/laba10/example4/example.xlsx";
        try (var fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
            workbook.close();
        }

        System.out.println("Данные записаны в файл: " + filePath);
    }
}
