/**
 * 852. Peak Index in a Mountain Array.
 * 
 *  Let's call an array arr a mountain if the following properties hold:
 * 
 *      arr.length >= 3
 *      There exists some i with 0 < i < arr.length - 1 such that:
 *          arr[0] < arr[1] < ... arr[i-1] < arr[i]
 *          arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 
 *  Given an integer array arr that is guaranteed to be a mountain, return any i such that 
 *  arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 * 
 *          Example 1:
 *              Input: arr = [0,1,0]
 *              Output: 1 
 *
 *          Example 2:
 *              Input: arr = [0,2,1,0]
 *              Output: 1 
 *
 *          Example 3:
 *               Input: arr = [0,10,5,2]
 *               Output: 1       
 */
class  PeakIndexInAMountainArray852
{
    /**
     *  Approach 1: Linear Scan
     * 
     *      @param arr[] - Array.
     *      @return - The index of the peak.
     * 
     *      Time complexity: O(n).
     *      Space complexity: O(1).
     */
    public static int peakIndexInMountainArray(int[] arr) 
    {
        int max = 0; // Integer to hold the found maximum.

        for(int i = 0; i < arr.length; i++) // Run over the array.
        {
            if(arr[i] > max) // Check if index i more then max.
            {
                max = arr[i]; // Save in max new maximum value.
            }
        }
        return max; // Return maximum
    }

    /**
     *  Approach 2: Binary Search
     * 
     *      @param arr[] - Array.
     *      @return - The index of the peak.
     * 
     *      Time complexity: O(log(n).
     *      Space complexity: O(1).
     */
    public static int peakIndexInMountainArray(int[] arr)
    {
        int low = 0; // Define the lowest index point.
        int high = arr.length - 1; // Difne the highest index point.
        int mid; // Define mid (Calculated in the loop).

        while(low < high) // Run over the array.
        {
            mid = low + (high - low) / 2; // Calculate the mid for every loop iteration.

            if (arr[mid] >= arr[mid + 1]) // Check if value of mid index greater then the value of the next index.
            {
                high = mid; // Save mid index to high index.
            }
            else // If the value of mid index less then the value of the next index.
            { 
                low = mid + 1;  // Save the next index as the lowest point.
            }
        }
        return low; // Return the answer
    }

    /*
     *  Testcases. 
     */
    public static void main (String[] args)
    {
        int[] arr1 = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr1));

        int[] arr2 = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr2));

        int[] arr3 = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr3));        
    }
}