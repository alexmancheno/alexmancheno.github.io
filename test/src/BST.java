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
        root = insert(data, root);
    }

    private Node insert(int data, Node curr)
    {
        if (curr == null) 
            curr = new Node(data);
        else if (curr.data > data)
            curr.left = insert(data, curr.left);
        else if (curr.data < data)
            curr.right = insert(data, curr.right);
        return curr;
    }

    // Return the smallest element of the tree
    public int getMin()
    {
        if (root == null) throw new NoSuchElementException("Tree is empty!");
        return getMin(root);
    }

    private int getMin(Node curr)
    {
        if (curr.left == null)  return curr.data;
        return getMin(curr.left);
    }

    // Returns true if the input element is in the tree, false otherwise
    public boolean contains(int data)
    {
        return contains(data, root);
    }

    public boolean contains(int data, Node curr)
    {
        if (curr == null) return false;
        else if (curr.data == data) return true;
        return contains(data, curr.left) || contains(data, curr.right);
    }

    // Pre-order traversal
    public void preOrder()
    {
        preOrder(root);
    }

    private void preOrder(Node curr)
    {
        if (curr != null)
        {
            System.out.print(curr.data + " ");
            preOrder(curr.left);
            preOrder(curr.right);
        }
    }

    // In-order traversal
    public void inOrder()
    {
        inOrder(root);
    }

    private void inOrder(Node curr)
    {
        if (curr != null)
        {
            inOrder(curr.left);
            System.out.print(curr.data + " ");
            inOrder(curr.right);
        }
    }

    // Post-order traversal
    public void postOrder()
    {
        postOrder(root);
    }

    private void postOrder(Node curr)
    {
        if (curr != null)
        {
            postOrder(curr.left);
            postOrder(curr.right);
            System.out.print(curr.data + " ");
        }
    }
}