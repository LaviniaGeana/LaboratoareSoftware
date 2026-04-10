package lab6;
import lab5.NewIntCalculator;
import org.junit.jupiter.api.*;


public class NewIntCalculatorTest
{
    private NewIntCalculator calculator;
    @BeforeEach
    public void setup()
    {
         calculator = new NewIntCalculator(0);
    }

    @Test
    public void testAdd()
    {
        calculator.add(2);
        calculator.add(1);

        Assertions.assertEquals(3, calculator.result());
    }


    @Test
    public void testMultiply()
    {
        calculator=new NewIntCalculator(5);
        calculator.multiply(4);
        Assertions.assertEquals(20, calculator.result());
    }
}
