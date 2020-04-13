/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements.
 *
 * 1. You must do this in-place without making a copy of the array.
 * 2. Minimize the total number of operations.
 */

public class MoveZeroes
{
    public static void main(String[] args)
    {
//        int[] nums = {0,1,0,3,12};
        int[] nums = {0,0,1};
        for (int x : nums)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] == 0 && j != nums.length - 1)
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int x : nums)
        {
            System.out.print(x + " ");
        }
    }
}
