public class Main16
{
    public static void main(String[] args)
    {
        // Test cases
        LinkedList list = new LinkedList();
        list.append("a");
        list.append("b");
        list.prepend("c");
        System.out.println(list);
        
        list.append("d");
        list.append("e");
        list.prepend("f");
        System.out.println(list);
    }
}