/**
 * 977. Squares of a Sorted Array
 * 	
 * 	Given an integer array nums sorted in non-decreasing order, return an array of the squares of each 
 * 	number sorted in non-decreasing order.
 * 
 * 			Example 1:
 * 				Input: nums = [-4,-1,0,3,10]
 *				Output: [0,1,9,16,100]
 *				Explanation: After squaring, the array becomes [16,1,0,9,100].
 *					After sorting, it becomes [0,1,9,16,100].
 * 
 * 			Example 2:
 * 				Input: nums = [-7,-3,2,3,11]
 *				Output: [4,9,9,49,121]
 */
public class SquaresOfASortedArray977
{
	/**
     *  Approach: 
     * 		
     *      @param nums[] - Array.
     *      @return - Sorted squered array.
     * 
     *      Time complexity: .
     *      Space complexity: .
     */
	public static int[] sortedSquares(int[] nums) 
	{
		for (int i = 0; i < nums.length; i++) // Run over the array.
		{
			nums[i] = nums[i] * nums[i];
		}

		Arrays.sort(nums);
		return nums;
	}
	/*
     *  Testcases. 
     */
    public static void main (String[] args)
    {
    /*
    	[-4,-1,0,3,10]
		[-7,-3,2,3,11]
	*/
    }
}