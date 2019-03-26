public class SortedLinkedList
{
    // Internal nodes of linked list should be private so users of this class
    // cannot make changes to this linked list that can break it
    private Node head;
    private Node tail;

    // The length of the linked list may be public
    public int length;

    // Default constructor
    public SortedLinkedList()
    {
        this.head = new Node(); 
        this.tail = this.head;
        this.length = 0;
    }

    // Insert new data into the linked list in ascending order
    public void insert(Money data) 
    {
        // TODO
    }

    
    // Override the toString method we inherit from class Object
    @Override
    public String toString()
    {
        // Create the StringBuilder we'll use to append every node's data to
        StringBuilder sb = new StringBuilder();

        // Iterate through linked list until we hit null, adding the string 
        // that's inside each node to the StringBuilder
        for (Node i = head.next; i != null; i = i.next)
        {
            sb.append(i.toString() + "->");
        }
    
        // Add to the StringBuilder the last string
        sb.append("null");

        // Return the string representation of the StringBuilder
        return sb.toString();
    }
}