package lab5;

public class AdvancedCalculator extends IntCalculator
{
    public AdvancedCalculator(int state)
    {
        super(state);
    }

    public AdvancedCalculator divide(int state)
    {
        this.state/=state;
        return this;
    }
    public AdvancedCalculator pow(int state)
    {
        this.state=(int)Math.pow(state,2);
        return this;

    }
    public AdvancedCalculator sqrt(int state)
    {
        this.state=(int)Math.sqrt(state);
        return this;
    }

}
