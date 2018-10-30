public class Main18
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insertInOrder(new Money(2, 32));
        list.insertInOrder(new Money(1, 55));
        list.insertInOrder(new Money(4, 00));
        list.insertInOrder(new Money(2, 44));

        System.out.println(list);
    }
}