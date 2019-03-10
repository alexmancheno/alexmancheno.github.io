import java.util.Arrays;

public class Main14
{
    public static void main(String[] args)
    {
        // Test cases
        Money m1 = new Money();
        Money m2 = new Money(6,5);
        Money m3 = new Money(-3, 32);
        Money m4 = new Money(6, 52);
        System.out.printf("m1: %s\nm2: %s\nm3: %s\nm4: %s\n", m1, m2, m3, m4);
        System.out.printf("m1 cents: %d\n", m1.getCents());
        System.out.printf("m2 dollars: %d\n", m2.getDollars());
        System.out.printf("m1.compareTo(m2): %d\n", m1.compareTo(m2));
        System.out.printf("m2.compareTo(m4): %d\n", m2.compareTo(m4));
        System.out.printf("m1.equals(m2): %b\n", m1.equals(m2));

    }
}

// Definition of a custom class
class Money
{
    // TODO - Declare instance variables here:

    // TODO - Declare constructors here:

    // TODO - Declare instance/static methods here:
    
}