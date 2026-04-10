package lab6;

import lab5.DoubleCalculator;
import org.junit.jupiter.api.*;

public class DoubleCalculatorTest
{

    //6.8.1
    private DoubleCalculator calculator;

    @BeforeEach
    public void setup()
    {
        calculator=new DoubleCalculator(0.0);

    }

    @Test
    public void testAdd()
    {
        calculator.add(2.5).add(1.5);

        Assertions.assertEquals(4.0,(Double)calculator.result());

    }

    @Test
    public void TestSubtract()
    {
        calculator=new DoubleCalculator(7.5);
        calculator.subtract(2.5);
        Assertions.assertEquals(5,(Double)calculator.result());
    }

    @Test
    public void TestMultiply()
    {
        calculator=new DoubleCalculator(2.5);
        calculator.multiply(3.0);
        Assertions.assertEquals(7.5,(Double)calculator.result());
    }

    //6.8.2
    @Test
    public void TestDivide()
    {
        calculator=new DoubleCalculator(10.0);
        Exception exception=Assertions.assertThrows(IllegalArgumentException.class, ()->{
            calculator.divide(0.0);
        });
        Assertions.assertNotNull(exception);
    }
}
