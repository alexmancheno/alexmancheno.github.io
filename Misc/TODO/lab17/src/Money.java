abstract class Money 
{
    private int value;

    public Money(int value) 
    {
        this.value = value;
    }

    public int getValue() 
    {
        return this.value;
    }

    @Override
    public String toString() 
    {
        return "money object";
    }
}