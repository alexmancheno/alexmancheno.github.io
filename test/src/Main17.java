import java.util.ArrayList;

public class Main17
{
    public static void main(String[] args)
    {
        // Test cases
        Wallet wallet = new Wallet();
        wallet.add(new Penny());
        wallet.add(new Single());

        System.out.println(wallet);
    }
}

class Wallet 
{
    // An array of Money variables
    private ArrayList<Money> list;

    // Default constructor
    public Wallet() 
    {
        list = new ArrayList<Money>();
    }

    // Add a money object to
    public void add(Money money) 
    {
        list.add(money);
    }

    @Override
    public String toString() 
    {
        int pennyCount = 0, nickelCount = 0, dimeCount = 0, quarterCount = 0, singleCount = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            Money m = list.get(i);
            if (m instanceof Penny)
                pennyCount++;
            else if (m instanceof Nickel)
                nickelCount++;
            else if (m instanceof Dime)
                dimeCount++;
            else if (m instanceof Quarter)
                quarterCount++;
            else
                singleCount++;
        }

        return String.format("This wallet has: %d pennys, %d nickels, %d dimes, %d quarters, and %d singles",
                pennyCount, nickelCount, dimeCount, quarterCount, singleCount);
    }
}

abstract class Money 
{
    private int value;

    public Money(int value) 
    {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

class Single extends Money 
{
    public Single() 
    {
        super(100);
    }

    @Override
    public String toString() 
    {
        return "single";
    }
}

class Quarter extends Money 
{
    public Quarter() 
    {
        super(25);
    }

    @Override
    public String toString() 
    {
        return "quarter";
    }
}

class Dime extends Money 
{
    public Dime() 
    {
        super(10);
    }

    @Override
    public String toString() 
    {
        return "dime";
    }
}

class Nickel extends Money 
{
    public Nickel() 
    {
        super(5);
    }

    @Override
    public String toString()
    {
        return "nickel";
    }
}

class Penny extends Money 
{
    public Penny() 
    {
        super(1);
    }

    @Override
    public String toString() 
    {
        return "penny";
    }
}