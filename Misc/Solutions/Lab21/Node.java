public class Node<T extends Comparable<T>>
{
    // Public instance variables
    public T data;
    public Node<T> next;

    // Default constructor
    public Node()
    {
        this(null, null);
    }

    // Constructor that takes only the data as a parameter
    public Node(T data)
    {
        this(data, null);
    }

    // Constructor that takes in the data and another node as parameters
    public Node(T data, Node<T> next)
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