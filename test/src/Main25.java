
public class Main25
{
    public static void main(String[] args)
    {
        // Test cases
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(1);

        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(2);
        list2.append(2);
        System.out.printf("list1: %s\n", list1);
        System.out.printf("list2: %s\n", list2);
        System.out.printf("list1 equal to list2: %b\n", LinkedList.equal(list1, list2));

        LinkedList list3 = new LinkedList();
        list3.append(1);
        list3.append(2);
        list3.append(3);

        LinkedList list4 = new LinkedList();
        list4.append(1);
        list4.append(2);
        list4.append(3);

        System.out.printf("\nlist3: %s\n", list3);
        System.out.printf("list4: %s\n", list4);
        System.out.printf("list3 equal to list4: %b\n", LinkedList.equal(list3, list4));

        LinkedList list5 = new LinkedList();
        list5.append(1);
        list5.append(2);
        list5.append(3);

        System.out.printf("\nlist5: %s\n", list5);
        System.out.printf("middle of list5: %s\n", LinkedList.middleNode(list5));

        LinkedList list6 = new LinkedList();
        list6.append(1);
        list6.append(3);
        list6.append(5);
        list6.append(7);

        System.out.printf("\nlist6: %s\n", list6);
        System.out.printf("middle of list6: %s\n", LinkedList.middleNode(list6));

        LinkedList list7 = new LinkedList();
        list7.append(1);
        list7.append(2);
        list7.append(1);

        System.out.printf("list7: %s\n", list7);
        System.out.printf("Is list7 a palindrome: %b\n", LinkedList.isPalindrome(list7));

        LinkedList list8 = new LinkedList();
        list8.append(1);
        list8.append(2);
        list8.append(2);
        list8.append(1);
        
        System.out.printf("\nlist8: %s\n", list8);
        System.out.printf("Is list8 a palindrome: %b\n", LinkedList.isPalindrome(list8));

        LinkedList list9 = new LinkedList();
        list9.append(1);
        list9.append(2);
        list9.append(1);
        list9.append(1);
        
        System.out.printf("\nlist9: %s\n", list9);
        System.out.printf("Is list9 a palindrome: %b\n", LinkedList.isPalindrome(list9));
    }
}