
public class Main21
{
    public static void main(String[] args)
    {
        // Test cases
        SortedLinkedList<Money> moneyList = new SortedLinkedList<Money>();
        Money m = null;
        System.out.printf("Linked list of Money objects before inserting: %s\n", moneyList);
        
        m = new Money(2, 44);
        moneyList.insert(m);
        System.out.printf("Inserting %s: %s\n", m, moneyList);

        m = new Money(6, 01);
        moneyList.insert(m);
        System.out.printf("Inserting %s: %s\n", m, moneyList);

        m = new Money(3, 99);
        moneyList.insert(m);
        System.out.printf("Inserting %s: %s\n", m, moneyList);

        m = new Money(4, 50);
        moneyList.insert(m);
        System.out.printf("Inserting %s: %s\n", m, moneyList);

        m = new Money(0, 44);
        moneyList.insert(m);
        System.out.printf("Inserting %s: %s\n", m, moneyList);
    }
}