
public class Main20
{
    public static void main(String[] args)
    {
        int[] array = {1, -2, 5, -6, 0, -8, 0};

        for (int i = 0; i < array.length; i++)
        {
            int num = array[i];
            
            double a = divide(50, num);
            System.out.printf("50 divided by %d is %f\n", num, a);

            double b = sqrt(num);
            System.out.printf("Square root of %d is %f\n", num, b);
        }
    }

    // Returns 'a' / 'b'
    public static double divide(int a, int b)
    {
        return (double) a / b;
    }

    // Return square root of 'a'
    public static double sqrt(int a)
    {
        return Math.sqrt(a);
    }
}