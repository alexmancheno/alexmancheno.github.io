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

        // Create an array of size 4 with money objects
        Money[] moneyArray = new Money[4];
        moneyArray[0] = m1;
        moneyArray[1] = m2;
        moneyArray[2] = m3;
        moneyArray[3] = m4;


        System.out.printf("before sorting: %s\n", Arrays.toString(moneyArray));
        Money.selectionSort(moneyArray);
        System.out.printf("after sorting: %s\n", Arrays.toString(moneyArray));
    }
}

// Definition of a custom class
class Money
{
    // Private instance variables
    private int dollars;
    private int cents;

    // Default, no argument constructor
    public Money()
    {
        this(0, 0); // call constructor with two arguments
    }

    // Constructor with two arguments
    public Money(int dollars, int cents)
    {
        // Use set methods since they may/may not do error checking,
        // depending on whether we want them to
        this.setDollars(dollars);
        this.setCents(cents);
    }

    // Get method for this objects dollars field
    public int getDollars() { return this.dollars; }

    // Get method for this objects cents field
    public int getCents() { return this.cents; }

    // Set method for this objects dollars field
    public void setDollars(int dollars) { this.dollars = dollars; }

    // Set method for this objects cents field
    public void setCents(int cents)
    {
        if (cents < 0 || cents > 100)
        {
            throw new IllegalArgumentException("Invalid argument for cents!");
        }
        this.cents = cents; 
    }

    // Compare the object we're calling this method on with its 
    // parameter. This method will return a negative number if 
    // this object is less than the other, positive if this object
    // is greater than the other, or 0 if they're equal
    public int compareTo(Money other)
    {
        if (this.dollars != other.dollars)
        {
            return this.dollars - other.dollars;
        }
        else if (this.cents != other.cents)
        {
            return this.cents - other.cents;
        }
        return 0;
    }

    // Override the equals method we inherit from the class Object,
    // which only compares references. Make this version return true if the 
    // content of the two objects are the same, false otherwise
    @Override
    public boolean equals(Object other)
    {
        if (!(other instanceof Money)) return false;
        else if (other == this) return true;

        Money m = (Money) other;

        return this.dollars == m.dollars && this.cents == m.cents;
    }

    // Override the toString method we inherit from the Object class
    @Override
    public String toString()
    {
        String formattedCents = Integer.toString(this.cents);
        if (this.cents < 10) formattedCents = "0" + formattedCents;
        return String.format("$%d.%s", this.dollars, formattedCents);
    }

    // Sort an array of Money objects using the compareTo method
    public static void selectionSort(Money[] input)
    {
        for (int i = 0; i < input.length; i++)
        {
            Money min = input[i];
            int minIndex = i;
            for (int j = i +1; j < input.length; j++)
            {
                if (min.compareTo(input[j]) > 0)
                {
                    min = input[j];
                    minIndex = j;
                }
            }
            swap(input, i, minIndex);
        }
    }

    // Swap two Money objecs from a Money array
    private static void swap(Money[] input, int i, int j)
    {
        Money temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}