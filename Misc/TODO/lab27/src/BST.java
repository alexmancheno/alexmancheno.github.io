import java.util.NoSuchElementException;

public class BST
{
    // The first node of the BST
    private Node root;

    // Private inner class
    private class Node
    {
        public Node left;
        public Node right;
        public int data;

        public Node(int data)
        {
            this.data = data;
        } 
    }

    // Default constructor to create an empty BST
    public BST()
    {
        root = null;
    }

    /**
     *  Insert into a tree that maintains the properties:
     *  1. The left node is the subtree containing nodes with keys less 
     *     than the current node's key
     *  2. The right node is the subtree containing nodes with keys greater
     *     than the current node's key
     * */
    public void insert(int data)
    {
        // TODO
    }

    // Return the smallest element of the tree
    public int getMin()
    {
        // TODO
    }

    // Returns true if the input element is in the tree, false otherwise
    public boolean contains(int data)
    {
      // TODO
    }


    // Pre-order traversal
    public void preOrder()
    {
        // TODO
    }

    // In-order traversal
    public void inOrder()
    {
        // TODO
    }

    // Post-order traversal
    public void postOrder()
    {
        // TODO
    }
}