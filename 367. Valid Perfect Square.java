/**
 * 367. Valid Perfect Square
 * 	Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 *	Follow up: Do not use any built-in library function such as sqrt.
 * 
 * 			Example 1:
 *				Input: num = 16
 *				Output: true
 *
 *			Example 2:
 *				Input: num = 14
 *				Output: false
 */
public class VaildPerfectSquare367
{
	/**
     *  Approach: 
     * 		
     *      @param nums[] - .
     * 		@param k - .
     *      @return - .
     * 
     *      Time complexity: .
     *      Space complexity: .
     */
	public static boolean isPerfectSquare(int num) 
	{
		long left = 0, right = num;

    	while (left <= right)
    	{
    		long mid = left + (right - left) / 2;

    		if (mid * mid == num)
    		{
    			return true;
    		}
    		else if (mid * mid < num)
    		{
    			left = mid + 1;
    		}
    		else
    		{
    			right = mid - 1;
    		}
    	}
    	return false;
    }
    /*
     *  Testcases. 
     */
	public static void main (String[] args)
    {
//16
//14
    }
}