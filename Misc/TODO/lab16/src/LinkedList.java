public class LinkedList
{
    // internal nodes of linked list should be private
    private Node head;
    private Node tail;

    // the length of the linked list should be public
    public int length;

    public LinkedList()
    {
        this.head = new Node("dummy");
        this.tail = this.head;
        this.length = 0;
    }

    public void append(String data)
    {
        // TODO
    }

    public void prepend(String data)
    {
        // TODO
    }

    @Override
    public String toString()
    {
        // TODO
    }
}