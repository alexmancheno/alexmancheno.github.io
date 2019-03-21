class Wallet 
{
    // An array of Money variables
    private ArrayList<Money> list;
    private int value;

    // Default constructor
    public Wallet() 
    {
        this.list = new ArrayList<Money>();
        this.value = 0;
    }

    // Add a money object to
    public void add(Money money) 
    {
        this.value += money.getValue();
        this.list.add(money);
    }

    // Print the contents of this wallet
    public void printContent() 
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

        System.out.printf("This wallet has: %d penny(s), %d nickel(s), %d dime(s), %d quarter(s), and %d single(s)\n",
                pennyCount, nickelCount, dimeCount, quarterCount, singleCount
            );
    }

    @Override
    public String toString() 
    {
        return String.format("$%d.%d", this.value / 100, this.value % 100);
    }
}