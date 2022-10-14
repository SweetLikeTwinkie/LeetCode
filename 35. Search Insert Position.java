/**
 * 35. Search Insert Position
 * 	
 * 	Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * 	If not, return the index where it would be if it were inserted in order.
 * 
 * 	You must write an algorithm with O(log n) runtime complexity.
 * 
 * 			Example 1:
 * 				Input: nums = [1,3,5,6], target = 5
 *				Output: 2
 * 
 * 			Example 2:
 * 				Input: nums = [1,3,5,6], target = 2
 *				Output: 1
 * 			
 * 			Example 3:	
 *				Input: nums = [1,3,5,6], target = 7
 *				Output: 4
 */
public class SearchInsertPosition35
{
	/**
     *  Approach: Two Pointers.
     * 		
     *      @param nums[] - Sorted array.
     * 		@param val - Number to remove.
     *      @return - Count removed emelemts.
     * 
     *      Time complexity: O(n).
     *      Space complexity: O(1).
     */
	public int searchInsert(int[] nums, int target) 
	{
	    int i = 0; 
	    int j = nums.length - 1;
	 
	    while(i <= j)
	    {
	        int mid = (i + j) / 2;
	 
	        if(target > nums[mid])
	        {
	            i = mid + 1;
	        }
	        else if(target < nums[mid])
	        {
	            j = mid - 1;
	        }
	        else
	        {
	            return mid;
	        }
	    }
	    return i;
	}
	/*
     *  Testcases. 
     */
    public static void main (String[] args)
    {
		int[] arr1 = {1,3,5,6};
		int target1 = 5;
		System.out.println(searchInsert(arr1, target1));

		int[] arr2 = {1,3,5,6};
		int target1 = 2;
		System.out.println(searchInsert(arr2, target2));

		int[] arr3 = {1,3,5,6};
		int target1 = 7;
		System.out.println(searchInsert(arr3, target3));

    }
}