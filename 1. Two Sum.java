/**
 * 1. Two Sum
 * 
 *  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *  You can return the answer in any order.
 * 
 *          Example 1:
 *              Input: nums = [2,7,11,15], target = 9
 *              Output: [0,1]
 *              Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 *          Example 2:
 *              Input: nums = [3,2,4], target = 6
 *              Output: [1,2]
 *          
 *          Example 3:
 *              Input: nums = [3,3], target = 6
 *              Output: [0,1]        
 */
public class TwoSum1 
{
    /**
     *  Approach 1: Brute Force
     *      
     *      @param nums[] - Array of number.
     *      @param targer - The sum of number.
     *      @return - Subarray with two sums that equal to target, or null if the sums not found.
     * 
     *      Time complexity: O(n^2).
     *      Space complexity: O(1).
     */
    public int[] twoSum(int[] nums, int target) 
    {
        for (int i = 0; i < nums.length; i++) // Run over every index of the array.
        {
            for (int j = i + 1; j < nums.length; j++) // Run over every next index of the array.
            {
                if (nums[j] == target - nums[i]) // Check if the sum of indexes value equal to target.
                {
                    return new int[] {i, j}; // Return new subarray with this indexes
                }
            }
        }
        return null; // If there no answer 
    }
    /*
     *  Testcases. 
     */
    public static void main (String[] args)
    {
        int[] arr1 = {2,7,11,15};
        int trueAns1 = 9;
        System.out.println(peakIndexInMountainArray(arr1) == trueAns1);

        int[] arr2 = {3,2,4};
        int trueAns2 = 6;
        System.out.println(peakIndexInMountainArray(arr2) == trueAns2);
        
        int[] arr3 = {3,3};
        int trueAns3 = 6;
        System.out.println(peakIndexInMountainArray(arr3) == trueAns3);        
    }
}