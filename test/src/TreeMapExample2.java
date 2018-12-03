import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;

public class TreeMapExample2
{
    public static void main(String[] args)
    {
        // TreeMap using Comparator
        TreeMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String left, String right)
            {
                // Return an integer representing the comparison between the two strings
                return left.compareTo(right);
            }
        });

        map.put("abc", 2);
        map.put("abb", 1);
        map.put("bbc", 3);
        map.put("dbc", 4);
        
        // Iterate through entry set, printout values
        System.out.println("Key value pairs:");
        for (Map.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.printf("%s, %s\n", entry.getKey(), entry.getValue());
        }

        // Iterate through key set, looking up the value for each iteration
        System.out.println("\nAnother way of iterating through keys:");
        for (String key : map.keySet())
        {
            System.out.printf("%s, %s\n", key, map.get(key));
        }
    }
}