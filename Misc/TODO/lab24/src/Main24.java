
public class Main24
{
    public static void main(String[] args)
    {
        // Test cases
        SortedLinkedList list = new SortedLinkedList();

        list.insert(1);
        list.insert(4);
        list.insert(2);
        list.insert(3);
        
        System.out.print("List from first to last: ");
        list.printFirstToLast();

        System.out.print("List from last to first: ");
        list.printLastToFirst();

        System.out.printf("Sum of all integers in list: %s\n", list.sum());

        System.out.printf("Before reversing: %s\n", list);
        list.reverse();
        System.out.printf("After reversing: %s\n", list);

        System.out.printf("Adding %d, %d, and %d to list\n", 5, 6, 7);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        System.out.printf("Before reversing: %s\n", list);
        list.reverse();
        System.out.printf("After reversing: %s\n", list);
    }
}