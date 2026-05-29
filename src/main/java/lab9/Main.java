package lab9;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++)
        {
            list.add(rand.nextInt(5,25));
        }
        System.out.println(list);

        int sum=list.stream().reduce(0,Integer::sum);
        System.out.println("Sum: "+ sum);


        int max=list.stream().max(Integer::compareTo).get();
        System.out.println("Max: "+ max);
        int min=list.stream().min(Integer::compareTo).get();
        System.out.println("Min: "+ min);

        List<Integer> listDif=list.stream().filter(n->n>=10 && n<=20).collect(Collectors.toList());
        System.out.println("ListDif: "+ listDif);

        List<Double> listDif2 = list.stream().map(n -> n.doubleValue()).collect(Collectors.toList());
        System.out.println("ListDif2: " + listDif2);

        List<Integer> listFiltrata=list.stream().filter(n->n==12).collect(Collectors.toList());
        System.out.println("ListFiltrata: "+ listFiltrata);

        System.out.println("---------------------------------------------");

        //a
        String string="Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte=List.of(string.split(" "));

        //b
        String cuvinte2= String.valueOf(cuvinte.stream().filter(n->n.length()>=5).collect(Collectors.toList()).size());
        System.out.println("Cuvinte: "+ cuvinte2);

        //c
        List<String> cuvinteOrdonate=cuvinte.stream().sorted().collect(Collectors.toList());
        System.out.println("CuvinteOrdonate: "+ cuvinteOrdonate);

        //d
        String cuvant= String.valueOf(cuvinte.stream().filter(n->n.startsWith("p")).collect(Collectors.toList()));
        System.out.println("Cuvant: "+ cuvant);













    }
}
