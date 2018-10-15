public class Node
{
    public Node next;
    public int data;

    public Node()
    {
        this(-1, null);
    }

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}