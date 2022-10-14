/**
 * 13. Roman to Integer
 * 
 * 	Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * 			Symbol       Value
 * 			I             1
 *			V             5
 *			X             10
 *			L             50
 *			C             100
 *			D             500
 *			M             1000
 * 
 * 	For example, 2 is written as II in Roman numeral, just two one's added together. 
 * 	12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * 
 * 	Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
 * 	Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
 * 	The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * 
 * 		I can be placed before V (5) and X (10) to make 4 and 9. 
 * 		X can be placed before L (50) and C (100) to make 40 and 90. 
 * 		C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * 			Example 1:
 * 				Input: s = "III"
 *				Output: 3
 *				Explanation: III = 3.
 * 
 * 			Example 2:
 * 				Input: s = "LVIII"
 *				Output: 58
 *				Explanation: L = 50, V= 5, III = 3.
 * 
 * 			Example 3:
 * 				Input: s = "MCMXCIV"
 *				Output: 1994
 *				Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomanToInteger13
{
	/**
     *  Approach: Convert roman numeral to int.
     * 		
     *      @param x - Roman Number as String.
     *      @return - Converted int.
     * 
     *      Time complexity: O(n).
     *      Space complexity: O(1).
     */
    public static int romanToInt(String s)
    {
        int ans = 0; // Var to hold the output number.
        int num = 0; // Var for income number from chars.

        for(int i = s.length() - 1; i >= 0; i--) // Run over the string chars backwards from the last to the first.
        {
            switch(s.charAt(i)) // Switch between Symbols to numbers.
            {
            	case 'I': num = 1; break;
            	case 'V': num = 5; break;
            	case 'X': num = 10; break;
            	case 'L': num = 50; break;
            	case 'C': num = 100; break;
            	case 'D': num = 500; break;
            	case 'M': num = 1000; break;
            }

            if(4 * num < ans) // Check if the numerals jump.
            {
                ans -= num;
            }
            else
            {
                ans += num;
            }
        }
        return ans;
    }
	/*
     *  Testcases. 
     */
    public static void main (String[] args)
    {
	    String test1 = "III";
	    System.out.println(romanToInt(test1));
	    
	    String test2 = "LVIII";
	    System.out.println(romanToInt(test2));
	    
	    String test3 = "MCMXCIV";
	    System.out.println(romanToInt(test3));
    }
}