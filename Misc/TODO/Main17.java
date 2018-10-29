

public class Main17
{
    public static void main(String[] args)
    {
        // Test cases
        Wallet wallet = new Wallet();
        wallet.add(new Penny());
        wallet.add(new Single());
        wallet.add(new Nickel());
        wallet.add(new Nickel());
        wallet.add(new Quarter());
        wallet.add(new Quarter());
        System.out.println(wallet); // prints value 
        wallet.printContent(); // prints what the wallet currently holds

        Money m1 = new Dime();
        wallet.add(m1);
        System.out.printf("m1 is a: %s\n", m1.toString());

        m1 = new Nickel();
        wallet.add(m1);
        System.out.printf("m1 is a: %s\n", m1.toString());

        m1 = new Single();
        wallet.add(m1);
        System.out.printf("m1 is a: %s\n", m1.toString());

        System.out.println(wallet); // prints value 
    }
}

class Wallet 
{
    // TODO - Instance variables

    // Default constructor
    public Wallet()
    {
        // TODO
    }

    public void add(Money money)
    {
        // TODO
    }

    // Print the contents inside the wallet
    public void printContent()
    {
        // TODO
    }
    
    // Print a string in the format of: $13.32
    @Override
    public String toString()
    {
        // TODO
    }
}

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

class Single extends Money 
{
    public Single() 
    {
        super(100);
    }

    @Override
    public String toString() 
    {
        return "single object";
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
        return "quarter object";
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
        return "dime object";
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
        return "nickel object";
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
        return "penny object";
    }
}