/**
 * 704. Binary Search
 * 
 * 	Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
 * 	If target exists, then return its index. Otherwise, return -1.
 *
 *	You must write an algorithm with O(log n) runtime complexity.
 * 
 * 			Example 1:
 * 				Input: nums = [-1,0,3,5,9,12], target = 9
 *				Output: 4
 *				Explanation: 9 exists in nums and its index is 4
 * 
 * 			Example 2:
 * 				Input: nums = [-1,0,3,5,9,12], target = 2
 *				Output: -1
 *				Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch704
{	
	/**
     *  Approach 1: Binary Search
     * 		
     *      @param nums[] - Input Array.
     * 		@param target - Int to search.
     *      @return - Target index if exist, if not return -1.
     * 
     *      Time complexity: O(log(n).
     *      Space complexity: O(1).
     */
	public static search(int[] nums, int target)
	{
		int pivot, left = 0, right = nums.length; // Var that hold the limits.

		while (left <= right) // Run over the array.
		{
			pivot = left + (right - left) / 2; // Colculate the middle index.

			if (nums[pivot] == target) // Check if the value of pivot index equal to value of target.
			{
				return pivot; // retrun the answer.
			}
			if (target < nums[pivot]) // Check if target less then the value of pivot index.
			{
				right = pivot - 1; // Move the right limit one cell right.
			}
			else // Check if target greater then the value of pivot index.
			{
				left = pivot + 1; // Move the left limit one cell left.
			}
		}
		return -1; // If target not found.
	}
	/*
     *  Testcases. 
     */
    public static void main (String[] args)
    {
		int[] arr1 = {-1,0,3,5,9,12};
		int target1 = 9;
		System.out.println(search(arr1,target1));

		int[] arr2 = {-1,0,3,5,9,12};
		int target2 = 2;
		System.out.println(search(arr1,target2));
    }
}