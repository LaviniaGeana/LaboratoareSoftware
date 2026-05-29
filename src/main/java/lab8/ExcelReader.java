package lab8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;



public class ExcelReader {

    public void readFile(final File file){

        try(InputStream in = new FileInputStream(file)){

            Workbook workbook = new XSSFWorkbook(in);
            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();


                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t");
                            break;
                        default:
                            break;
                    }
                }


                System.out.println();

            }

        } catch (final IOException e){
            e.printStackTrace();
        }
    }


    public void Genereaza(File inputFile, File outputFile) {


        try (InputStream in = new FileInputStream(inputFile);
             Workbook workbookInput = new XSSFWorkbook(in);
             Workbook workbookOutput = new XSSFWorkbook()) {

            Sheet sheetInput = workbookInput.getSheetAt(0);
            Sheet sheetOutput = workbookOutput.createSheet("Medii");

            for (int i = 0; i <= sheetInput.getLastRowNum(); i++) {
                Row rowInput = sheetInput.getRow(i);

                if (rowInput == null) {
                    continue;
                }

                Row rowOutput = sheetOutput.createRow(i);
                int lastCellIndex = rowInput.getLastCellNum();

                double sumaUltimele3 = 0;
                int elementeAdunate = 0;

                for (int j = 0; j < lastCellIndex; j++) {
                    Cell cellInput = rowInput.getCell(j);
                    Cell cellOutput = rowOutput.createCell(j);

                    if (cellInput != null) {
                        switch (cellInput.getCellType()) {
                            case STRING:
                                cellOutput.setCellValue(cellInput.getStringCellValue());
                                break;
                            case NUMERIC:
                                double valoare = cellInput.getNumericCellValue();
                                cellOutput.setCellValue(valoare);

                                if (j >= lastCellIndex - 3) {
                                    sumaUltimele3 += valoare;
                                    elementeAdunate++;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }

                if (elementeAdunate > 0) {
                    Cell cellMedie = rowOutput.createCell(lastCellIndex);
                    double medie = sumaUltimele3 / elementeAdunate;
                    cellMedie.setCellValue(medie);
                }
            }


            try (FileOutputStream out = new FileOutputStream(outputFile)) {
                workbookOutput.write(out);
            }

            System.out.println("Fisierul a fost generat!");

        } catch (IOException e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }

}