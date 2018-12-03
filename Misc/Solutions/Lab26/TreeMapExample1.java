import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample1
{
    public static void main(String[] args)
    {
        // TreeMap using keys that implement the Comparable interface
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(4, "Three");
        map.put(3, "Two");
        map.put(2, "Three");
        
        // Iterate through entry set, printout values
        System.out.println("Key value pairs:");
        for (Map.Entry<Integer, String> entry: map.entrySet())
        {
            System.out.printf("%s, %s\n", entry.getKey(), entry.getValue());
        }

        // Iterate through key set, looking up the value for each iteration
        System.out.println("\nAnother way of iterating through keys:");
        for (Integer key : map.keySet())
        {
            System.out.printf("%s, %s\n", key, map.get(key));
        }
    }
}