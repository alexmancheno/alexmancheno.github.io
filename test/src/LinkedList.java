public class LinkedList
{
    private Node head;
    private Node tail;
    public int length;

    public LinkedList()
    {
        this.head = new Node();
        this.tail = this.head;
        this.length = 0;
    }

    public void append(int n)
    {
        Node newNode = new Node(n);
        tail.next = newNode;
        tail = n;
    }
}