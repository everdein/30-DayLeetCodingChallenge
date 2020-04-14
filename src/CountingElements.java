import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * If there're duplicates in arr, count them seperately.
 */

public class CountingElements
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3}; // Output: 2
//        int[] arr = {1,1,3,3,5,5,7,7}; // Output: 0
//        int[] arr = {1,3,2,3,5,0}; // Output: 3
//        int[] arr = {1,1,2,2}; // Output: 2
        System.out.println(countElements(arr));
    }
    public static int countElements(int[] arr)
    {
        if(arr.length < 3) { return 0; }
        int count = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                int ans = arr[i] + 1;
                if(arr[j] == ans && !set.contains(arr[i]))
                {
                    count++;
                    set.add(arr[i]);
                }
            }
            set.clear();
        }
        return count;
    }
}
