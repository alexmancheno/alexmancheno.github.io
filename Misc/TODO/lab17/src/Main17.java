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