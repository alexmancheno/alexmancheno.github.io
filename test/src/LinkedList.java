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
        // create new node
        Node newNode = new Node(data); 
        
        // make the tail node's next node point to the new node
        this.tail.next = newNode;

        // set the tail node to point to the new node
        this.tail = newNode; 

        // increment the length property of this linked list
        this.length++;
    }

    public void prepend(String data)
    {
        // create new node
        Node newNode = new Node(data); 

        // set the new node's next node to point to whatever the head node's next node is
        newNode.next = this.head.next; 

        // make the head's next node point to the new node
        this.head.next = newNode; 

        // increment the length property of this linked list
        this.length++;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Node i = head.next; i != null; i = i.next)
        {
            sb.append(i.toString() + "->");
        }

        sb.append("null");
        return sb.toString();
    }
}