/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the
 * largest sum and return its sum.
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 * which is more subtle.
 */

public class MaxSubArray
{
    public static void main(String[] args)
    {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {4,-1,2,1};
//        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums)
    {
        int sum = nums[0];
        int temp = 0;
        if(nums.length == 1){ return nums[0]; }
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i; j < nums.length; j++)
            {
                temp = temp + nums[j];
                if(temp > sum)
                {
                    sum = temp;
                }
            }
            temp = 0;
        }
        return sum;
    }
}
