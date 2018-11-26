public class SortedLinkedList
{
    // Internal nodes of linked list should be private so users of this class
    // cannot make grave changes to this linked list
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

    public void insert(Integer data)
    {
        // Create new node
        Node n = new Node(data);

        // Create iterator node
        Node i = head;

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
        if (i == this.tail) this.tail = n;
    }

    // Print values in linked list recursively from first to last
    public void printFirstToLast()
    {
        // Call recursive method, passing variables needed for loop
        printFirstToLast(this.head.next);
    }

    private void printFirstToLast(Node i)
    {
        // Means we haven't finished iterating linked list
        if (i != null)
        {
            System.out.print(i.toString() + "->");
            printFirstToLast(i.next);
        }
        else System.out.print("null\n");
    }

    // Print values in linked list recursively from last to first
    public void printLastToFirst()
    {
        printLastToFirst(this.head.next);
        System.out.print("null\n");
    }

    private void printLastToFirst(Node i)
    {
        // Means we haven't finished iterating linked list
        if (i != null)
        {
            printLastToFirst(i.next);
            System.out.print(i.toString() + "->");
        }
    }

    // Return sum of all money objects in list
    public int sum()
    {
        return sum(this.head.next);
    }

    private int sum(Node i)
    {
        // Base case: finished iterating through list
        if (i == null) return 0; 

        // Sum current node's data and go to next node
        return i.data + sum(i.next);
    }

    // Recursively reverse a linked list
    public void reverse()
    {
        // Reverse linked list
        reverse(null, head.next);

        // Update head and tail 
        Node temp = head.next;
        head.next = tail;
        tail = temp;
    }

    private void reverse(Node prev, Node current)
    {
        // We finished iterating through list
        if (current == null) return;

        // Keep going to next node
        reverse(current, current.next);

        // Start reversing the linked list
        current.next = prev;

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