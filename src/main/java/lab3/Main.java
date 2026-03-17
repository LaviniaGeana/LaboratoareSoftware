package lab3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try{
            File file=new File("text.txt");
            Scanner sc=new Scanner(file);

            List<String> list=new ArrayList<String>();

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                list.add(line);
            }
            sc.close();
            //a
            List<String> listA=new ArrayList<>();
            for(String line:list) {
                listA.add(line);
                System.out.print(line+"\n");
            }
            System.out.println("----------------");
            //b
            List<String> listB=new ArrayList<>();
            for(String line:list) {
                listB.add(line);
                System.out.print(line.replace( ".","\n"));
            }

            Path outPath= Paths.get("out.txt");
            try(BufferedWriter writer= Files.newBufferedWriter(outPath)){
                for(String line:listA){
                    writer.write(line);
                    writer.newLine();

                }

                for(String line:listB){
                    writer.write(line);
                    writer.newLine();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
