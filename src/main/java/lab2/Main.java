package lab2;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
        //2.1 PRIMITIVE
        int i=0;
        int j=i+10;
        System.out.println("i = "+i);
        System.out.println("j = "+j);

        System.out.println("------------");

        long q=0;
        long w=i+10;
        System.out.println("q = "+q);
        System.out.println("w = "+w);
        System.out.println("-------------");

        float f=0.5f;
        double e=0.01;
        double r=f+10;
        System.out.println("e = "+e);
        System.out.println("r = "+r);

        System.out.println("-------------");


        //Conversie String

        String s1="12";
        int v1=Integer.parseInt(s1);
        System.out.println("v1 = "+v1+" binar = "+Integer.toBinaryString(v1));

        String s2=Long.toString(1000L+(long)Integer.MAX_VALUE);
        System.out.println("s2 = "+s2);
        long v2=Long.parseLong(s2);
        System.out.println("v2 = "+v2);

        String s3="12.34";
        double v3=Double.parseDouble(s3);
        double v4=Double.valueOf(s3);
        System.out.println("v3 = "+v3);
        System.out.println("v4 = "+v4);
        */


        List<Integer> x=new ArrayList();
        List<Integer> y=new ArrayList();
        List<Integer> xPlusY=new ArrayList();
        Set<Integer> zSet=new TreeSet();
        List<Integer> xMinusY=new ArrayList();
        int p=4;
        List<Integer> xPlusYLimitedByP=new ArrayList();
        Random rand=new Random();
        /*
        Dati valori aleatorii elementele listelor x şi y in domeniul [0..10]
         şi apoi ordonati aceste doua liste crescător.
        Numarul de elemente pt lista x este 5.
        Numarul de elemente pt lista y este 7.

        */

        for(int i=0;i<5;i++)
        {
            x.add(rand.nextInt(100));
        }
        for(int i=0;i<7;i++)
        {
            y.add(rand.nextInt(100));
        }
        System.out.println(x);
        Collections.sort(x);
        System.out.println(x);
        System.out.println(y);
        Collections.sort(y);
        System.out.println(y);

        /*
        Să se scrie cod pentru a obţine colectii cu elemente ordonate
         crescător, după efectuarea următoarelor operaţii:
            a) xPlusY conţine toate elementele şirurilor x şi y;
        */

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println(xPlusY);
        System.out.println("------------------------");
        /*
        b) zSet conţine numai valorile comune
         din ambele şiruri, luate o singură dată;
         */

        for(int i=0;i<x.size();i++)
        {
            if(y.contains(x.get(i)))
            {
                zSet.add(x.get(i));
            }
        }
        System.out.println(zSet);
        System.out.println("-------------------------");

        for(int i=0;i<x.size();i++)
        {
            if(!y.contains(x.get(i)))
            {
                xMinusY.add(x.get(i));
            }
        }
        System.out.println(xMinusY);
        System.out.println("-------------------------");

    }

}
