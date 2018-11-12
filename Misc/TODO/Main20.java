
public class Main20
{
    public static void main(String[] args)
    {
        int[] array = {1, -2, 5, -6, 0, -8, 0};

        for (int i = 0; i < array.length; i++)
        {
            int num = array[i];
            try
            {
                System.out.printf("50 divided by %d is %f\n", num, divide(50, num));
                System.out.printf("Square root of %d is %f\n", num, sqrt(num));
            }
            catch (myCheckedException e)
            {
                System.out.println(e.getMessage()); 
            }
            finally
            {
                System.out.println("Executing 'finally' block\n");
            }
        }
    }

    // Returns 'a' / 'b'
    // This will throw an UncheckedException if 'b' == 0
    public static double divide(int a, int b)
    {
        if (b == 0)
        {
            throw new myUncheckedException("Cannot divide by zero!");
        }

        return (double) a / b;
    }

    // Return square root of 'a'
    // This will throw a CheckedException if 'a' < 0
    public static double sqrt(int a) throws myCheckedException
    {
        if (a < 0)
        {
            throw new myCheckedException("Cannot take square root of a negative number: " + a);
        }

        return Math.sqrt(a);
    }
}