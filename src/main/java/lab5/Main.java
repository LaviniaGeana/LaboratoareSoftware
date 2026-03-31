package lab5;

public class Main
{
    public static void main(String[] args)
    {
        IntCalculator calculator=new IntCalculator(10);
        int result1=calculator.add(5).substract(3).multiply(2).result();
        System.out.println("a) "+result1);

        NewIntCalculator intCalc = new NewIntCalculator(10);
        Object result2=intCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("b) "+result2);

        DoubleCalculator doubleCalc = new DoubleCalculator(10.0);
        double result3=(Double) doubleCalc.add(5.0).subtract(3.3).multiply(2.2).result();
        System.out.println("c) "+result3);

    }
}
