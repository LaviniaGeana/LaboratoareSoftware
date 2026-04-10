package lab5;

public abstract class ACalculator
{
   public Object state;

    public ACalculator(Object state)
    {
        this.state = state;
    }

    public ACalculator() {

    }

    public Object result()
    {
        return state;
    }
    public Object clear()
    {
        state = 0;
        return this;
    }


    public abstract void init(Object value);
}
