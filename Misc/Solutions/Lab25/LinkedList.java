public class LinkedList
{
    // Internal nodes of linked list should be private so users of this class
    // cannot make grave changes to this linked list
    private Node head;
    private Node tail;

    // The length of the linked list may be public
    public int length;

    public LinkedList()
    {
        this.head = new Node(); 
        this.tail = this.head;
        this.length = 0;
    }

    // Check if two linked lists are equal
    public static boolean equal(LinkedList list1, LinkedList list2)
    {
        // Declare walker node variables
        Node i = list1.head.next, j = list2.head.next;

        while (true)
        {
            // If both are null, then they are equal
            if (i == null && j == null) break;

            // Else if only one is null, then they are not equal
            else if (i == null || j == null) return false;

            // Else if neither are null and their contents are not same, not equal
            else if (i.data != j.data) return false;

            // Otherwise, walk both node variables by one spot
            i = i.next;
            j = j.next;
        }

        return true;
    }
    
    // Return the middle node of the linked list. If two nodes are the middle, return
    // the second one
    public static Node middleNode(LinkedList list)
    {
        // Declare to walker node variables and set them to beginning of list
        Node i = list.head.next, j = list.head.next;

        // Keep walking slow and fast node until fast node is at end of list
        while (j != null && j.next != null)
        {
            j = j.next.next; // Walk fast node two spots
            i = i.next; // Walk slow node one spot
        }

        // By the time fast node has finished, slow node is in the middle of list.
        return i;
    }

    // Check if input list is a palindrome
    public static boolean isPalindrome(LinkedList list) 
    {
        // Declare node that will hold reversed first half of list
        Node reverse = new Node()
        
        // Declare nodes we need to iterate through list
        Node i = list.head.next, j = list.head.next, next = null;
        
        // Reverse the first half
        while (j != null && j.next != null)
        {
            // Walk fast node by two steps
            j = j.next.next;
            
            // Add 'i' to first of list
            next = i.next;
            i.next = reverse.next;
            reverse.next = i;
            i = next;
        }
        
        // This means we have an odd length linked list, so skip the middle
        if (j != null) i = i.next;
        j = reverse.next; // Let 'j' start at the first node of reversed half
        
        // Compare reversed first half with second half of list
        while (i != null)
        {
            if (i.data != j.data) return false;
            i = i.next;
            j = j.next;
        }
        
        return true;
    }

    // Add to the end of the linked list
    public void append(int data)
    {
        // Create new node
        Node newNode = new Node(data); 
        
        // Make the tail node's next node point to the new node
        this.tail.next = newNode;

        // Set the tail node to point to the new node
        this.tail = newNode; 

        // Increment the length property of this linked list
        this.length++;
    }

    // Add to the beginning of the linked list
    public void prepend(int data)
    {
        // Create new node
        Node newNode = new Node(data); 

        // Set the new node's next node to point to whatever the head node's next node is
        newNode.next = this.head.next; 

        // Make the head's next node point to the new node
        this.head.next = newNode; 

        // If tail == head, then we need to move tail as well.
        // This only happens if linked list is empty
        if (tail == head) tail = newNode;

        // Increment the length property of this linked list
        this.length++;
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