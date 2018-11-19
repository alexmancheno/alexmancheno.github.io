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
        System.out.printf("\n%d sum of digits is: %d\n", 1104, sumOfDigits(1104));
        System.out.printf("\n%d sum of digits is: %d\n", 1357010, sumOfDigits(1357010));
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
    
    // Recursive method for palindromes
    public static boolean isPalindromeRecursive(String s)
    {
        // Base case
        if (s.length() == 0 || s.length() == 1) return true;

        // Check the first and last character of the current string
        else if (s.charAt(0) != s.charAt(s.length() - 1)) return false;

        // Otherwise, make another recursive call
        return isPalindromeRecursive(s.substring(1, s.length() - 1));
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

    // Recusrive method for finding max of an array
    public static int findMaxRecursive(int[] array)
    {
        // Use the recursive method below, assuming the first element is the max
        return findMaxRecursive(array, 1, array[0]);
    }


    public static int findMaxRecursive(int[] array, int i, int max)
    {
        // Check if we finished iterating through the array
        if (i == array.length) return max;

        // If current element is greater than current max, update max to current element
        else if (array[i] > max) max = array[i];

        // Go to next element
        return findMaxRecursive(array, i + 1, max);
    }
    
    public static int sumOfDigits(int n)
    {
        // Base case
        if (n < 10) return n;

        // Break problems into smaller pieces
        return sumOfDigits(n / 10) + n % 10;
    }
}