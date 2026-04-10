package lab5;

public class DoubleCalculator extends ACalculator
{
    public  DoubleCalculator(Double value)
    {
        super(value);
    }
    @Override
    public void init(Object value)
    {
        this.state = (Double) value;
    }
    public DoubleCalculator add(Double value)
    {
        this.state = (Double) state + value;
        return this;
    }
    public DoubleCalculator subtract(Double value)
    {
        this.state = (Double) state - value;
        return this;
    }
    public DoubleCalculator multiply(Double value)
    {
        this.state = (Double) state * value;
        return this;
    }
    public  DoubleCalculator divide(Double value)
    {
        this.state = (Double) state / value;
        return this;
    }
}
