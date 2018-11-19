import java.util.Arrays;

public class Main23
{
    public static void main(String[] args)
    {
        // Test cases
        System.out.println("---- Palindrome test cases ---");
        System.out.printf("%s is palindrome: %b\n", "aba", isPalindromeRecursive("aba"));
        System.out.printf("%s is palindrome: %b\n", "abaa", isPalindromeRecursive("abaa"));
        System.out.printf("%s is palindrome: %b\n", "abba", isPalindromeRecursive("abba"));
        System.out.printf("%s is palindrome: %b\n", "a", isPalindromeRecursive("a"));
        System.out.printf("%s is palindrome: %b\n", "aa", isPalindromeRecursive("aa"));
        System.out.printf("%s is palindrome: %b\n", "ab", isPalindromeRecursive("ab"));

        System.out.println("\n--- Finding max test cases ---");
        int[] array1 = {-3, 0, 4, 7, 5, 6, -1, 8, 2};
        System.out.printf("array1: %s\n", Arrays.toString(array1));
        System.out.printf("max of array1: %d\n", findMaxRecursive(array1));


        System.out.println("\n--- Sum of digits test cases ---");
        System.out.printf("%d sum of digits is: %d\n", 1104, sumOfDigits(1104));
        System.out.printf("%d sum of digits is: %d\n", 1357010, sumOfDigits(1357010));
    }


    // Iteraive method for palindromes
    public static boolean isPalindromeIterative(String s)
    {
        int i = 0, j = s.length() - 1;

        while (i < j)
        {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    

    // Iterive method for finding max of an array
    public static int findMaxIterative(int[] array)
    {
        // Assume first element is the max
        int max = array[0];

        for (int i = 1; i < array.length; i++)
        {
            // Compare current element with current max, and update max if needed
            if (array[i] > max) max = array[i];
        }

        return max;
    }
}