public class Main18
{
    public static void main(String[] args)
    {
        // Test cases
        LinkedList list = new LinkedList();
        Money m = null;
        System.out.printf("Linked list before inserting: %s\n", list);
        
        m = new Money(2, 44);
        list.insertInOrder(m);
        System.out.printf("Inserting %s: %s\n", m, list);

        m = new Money(6, 01);
        list.insertInOrder(m);
        System.out.printf("Inserting %s: %s\n", m, list);

        m = new Money(3, 99);
        list.insertInOrder(m);
        System.out.printf("Inserting %s: %s\n", m, list);

        m = new Money(4, 50);
        list.insertInOrder(m);
        System.out.printf("Inserting %s: %s\n", m, list);

        m = new Money(0, 44);
        list.insertInOrder(m);
        System.out.printf("Inserting %s: %s\n", m, list);
    }
}