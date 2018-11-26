public class Node
{
    // Public instance variables
    public Integer data;
    public Node next;

    // Default constructor
    public Node()
    {
        this(0, null);
    }

    // Constructor that takes only the data as a parameter
    public Node(Integer data)
    {
        this(data, null);
    }

    // Constructor that takes in the data and another node as parameters
    public Node(Integer data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    // Override the toString method we inherit from class object
    @Override
    public String toString()
    {
        return String.format("(%s)", this.data);
    }
}