package lab4;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> varste=new HashMap<>();
        varste.put("Ioan",21);
        varste.put("Maria",22);
        varste.put("Victor",20);
        varste.put("Simina",20);
        varste.put("Marius",21);
        varste.put("Mihai",21);
        varste.put("Daniel",23);

        varste.put("Vlad",19);
        varste.put("Iulia",19);

        Map<String,String> adrese=Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");
        System.out.println(varste);

        HashMap<String, Tanar> tineri=new HashMap<>();

        Iterator<String> itr=varste.keySet().iterator();
        while(itr.hasNext()){
            String nume=itr.next();
            Integer varsta=varste.get(nume);
            String adresa=adrese.get(nume);

            Tanar T=new Tanar(nume,varsta,adresa);
            tineri.put(nume,new Tanar(nume,varsta,adresa));


        }
        System.out.println();
        for(String nume:tineri.keySet()){
            System.out.println("Nume: "+nume+" "+tineri.get(nume));
        }








    }

}
