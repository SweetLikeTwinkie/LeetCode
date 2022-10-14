/**
 * 9. Palindrome Number
 * 
 * 	Given an integer x, return true if x is palindrome integer.
 * 	An integer is a palindrome when it reads the same backward as forward.
 * 
 * 		For example, 121 is a palindrome while 123 is not.
 * 
 * 			Example 1:
 * 				Input: x = 121
 *				Output: true
 *				Explanation: 121 reads as 121 from left to right and from right to left.	
 * 
 * 			Example 2:		
 * 				Input: x = -121
 *				Output: false
 *				Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * 			Example 3:
 * 				Input: x = 10
 *				Output: false
 *				Explanation: Reads 01 from right to left. Therefore it is not a palindrome.			
 */
public class PalindromeNumber9
{	
	/**
	 * 	Approach 1: Revert half of the number
	 * 
	 * 		@param x - Number.
	 * 		@return - True if the number is polindrome, false if not.
	 * 
	 * 		Time complexity: O(log(n)).
	 * 		Space complexity: O(1).
	 */
	public static boolean isPalindrome (int x)
	{
		if (x < 0 || (x % 10 == 0 && x != 0)) // Check if the last digit of the number is 0.
		{
			return false; // If the last digit is 0 it can be palindrome because the first digit can not be 0 
		}

		int revertedNumber = 0; // Define varible outside the loop to hold the reverted number.

		while (x > revertedNumber) // If x greater then 0.
		{
			revertedNumber = revertedNumber * 10 + x % 10; // Get the 
			x /= 10; // Remove the last digit.
		}
		return x == revertedNumber || x == revertedNumber / 10; // Check if the number is polindrome.
	}

	/*
     *  Testcases. 
     */
    public static void main (String[] args)
    {
		int num1 = 121;
		System.out.println(isPalindrome(num1));

		int num2 = -121;
		System.out.println(isPalindrome(num2));

		int num3 = 10;
		System.out.println(isPalindrome(num3));
    }
}