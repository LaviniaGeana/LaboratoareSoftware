package lab8;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        ExcelReader citire = new ExcelReader();

        File fisierExcel=new File("laborator8_input.xlsx");

        citire.readFile(fisierExcel);


        File fisierExcel2=new File("laborator8_output.xlsx");
        citire.Genereaza(fisierExcel,fisierExcel2);
    }
}
