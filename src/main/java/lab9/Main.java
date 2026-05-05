package lab9;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {
        Random rand=new Random();

        List<Integer> numere= IntStream.range(0,10).map(i->5+rand.nextInt(21)).boxed().collect(Collectors.toList());
        System.out.println("Lista initiala" +numere);

        //a suma
        int sum = numere.stream().reduce(0, Integer::sum);
        System.out.println("Suma : " + sum);

        //b min si max

        int maxim = numere.stream().max(Comparator.naturalOrder()).orElseThrow();
        int minim = numere.stream().min(Comparator.naturalOrder()).orElseThrow();

        System.out.println("Maxim : " + maxim);
        System.out.println("Minim : " + minim);

        //c
        List<Integer> numere2=numere.stream().filter(n-> n>=10 && n<=20).collect(Collectors.toList());
        System.out.println("Lista modificata " +numere2);

        //d

        List<Double> numereDouble = numere.stream().map(Double::valueOf).collect(Collectors.toList());
        System.out.println("Lista transformata : " +numereDouble);


        //e

        Optional<Integer> item=numere.stream().filter(n->n==12).findAny();
        if(item.isPresent())
        {
            System.out.println("Am gasit elementul: "+item.get());

        }
        else
        {
            System.out.println("Nu am gasit elementul");
        }


        System.out.println("---------------------------------------------");

        String string="Acesta este un program scris in java pentru expresii lambda";
        System.out.println("String initial: "+string);
        List<String>wordList=List.of(string.split(" "));
        List<String> cuvinte = wordList.stream()
                .filter(c -> c.length() >= 5)
                .collect(Collectors.toList());
        long numarCuvinte = wordList.stream()
                .filter(c -> c.length() >= 5)
                .count();

        System.out.println("a) " +cuvinte);


        List<String> cuvinteOrdonate = cuvinte.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("b) " + cuvinteOrdonate);

        Optional<String> elementP = cuvinte.stream()
                .filter(c -> c.startsWith("p"))
                .findAny();

        if(elementP.isPresent())
        {
            System.out.println("c) " +elementP.get());
        }
        else{
            System.out.println("c) Nu am gasit elementul");
        }













    }
}
