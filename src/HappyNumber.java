import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 */

public class HappyNumber
{
    public static void main(String[] args)
    {
        int num = 19;
        System.out.println(isHappy(num));
    }
    public static boolean isHappy(int n)
    {
        if(n < 0) { return false; }
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        do
        {
            String stringNum = Integer.toString(n);
            for(int i = 0; i < stringNum.length(); i++)
            {
                char tempCharNum = stringNum.charAt(i);
                int num = Integer.parseInt(String.valueOf(tempCharNum));
                sum = sum + (num * num);
                n = sum;
            }
            if(set.contains(n)) { return false; }
            else { set.add(n); }
            if(sum == 1){ return true; }
            sum = 0;
        }
        while(n != 1);
        return false;
    }
}
