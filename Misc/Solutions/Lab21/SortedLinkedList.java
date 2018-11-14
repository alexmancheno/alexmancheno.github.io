public class SortedLinkedList<T extends Comparable<T>>
{
    // Internal nodes of linked list should be private so users of this class
    // cannot make grave changes to this linked list
    private Node<T> head;
    private Node<T> tail;

    // The length of the linked list may be public
    public int length;

    // Default constructor
    public SortedLinkedList()
    {
        this.head = new Node<T>(); 
        this.tail = this.head;
        this.length = 0;
    }

    public void insert(T data)
    {
        // Create new node
        Node<T> n = new Node<T>(data);

        // Create iterator node
        Node<T> i = head;

        // Look for the two spots we want to insert the new node between
        while (i.next != null && data.compareTo(i.next.data) > 0)
        {
            i = i.next;
        }

        // Insert the new node between current node and the next node
        n.next = i.next;
        i.next = n;
        this.length++;

        // Check if we need to update tail as well
        if (i == this.head || i == this.tail) this.tail = n;
    }


    // Override the toString method we inherit from class Object
    @Override
    public String toString()
    {
        // Create the StringBuilder we'll use to append every node's data to
        StringBuilder sb = new StringBuilder();

        // Iterate through linked list until we hit null, adding the string 
        // that's inside each node to the StringBuilder
        for (Node<T> i = head.next; i != null; i = i.next)
        {
            sb.append(i.toString() + "->");
        }
    
        // Add to the StringBuilder the last string
        sb.append("null");

        // Return the string representation of the StringBuilder
        return sb.toString();
    }
}