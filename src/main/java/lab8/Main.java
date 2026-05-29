package lab8;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        ExcelReader citire = new ExcelReader();

        File fisierExcel=new File("laborator8_input.xlsx");

        citire.readFile(fisierExcel);
    }
}
