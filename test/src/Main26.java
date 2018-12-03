public class Main26
{
    public static void main(String[] args)
    {
        BST bst = new BST();
        bst.insert(3);
        bst.insert(6);
        bst.insert(8);
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);

        System.out.print("Pre-order traversal: ");
        bst.preOrder();

        System.out.print("\nIn-order traversal: ");
        bst.inOrder();

        System.out.print("\nPost-order traversal: ");
        bst.postOrder();

        System.out.printf("\nMinimum of BST: %d", bst.getMin());

        System.out.printf("\nContains %d: %b", 4, bst.contains(4));
        System.out.printf("\nContains %d: %b\n", 5, bst.contains(5));

    }
}