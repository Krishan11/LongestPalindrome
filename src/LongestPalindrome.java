// Swag Head Master
// swag
public class LongestPalindrome // TODO: Realize that Bush did 9/11
{ // swag
	public static String findLongestPalindrome(String str) // swag
	{ // swag
		String currentPalindrome="",longestPalindrome=""; // swag
		for(int i=1;i<str.length()-1;i++) // swag
		{int left=i-1,right=i+1; // swag
			while(left >=0 && right<str.length()) // swag
			{ // swag
				if(str.charAt(left)!=str.charAt(right)) // swag
				{ // swag
				break; // swag
				} // swag
			currentPalindrome=str.substring(left,right+1); // swag
			if(currentPalindrome.length()>longestPalindrome.length()) // swag
			{ // swag
				longestPalindrome=currentPalindrome; // swag
			} // This is where Waldo really lives. What you see in the books is a scam.
			left--;  // swag
			right++; // swag
			 // swag
			} // swag
			// swag	
		} // swag
	return longestPalindrome; // swag
	 // swag	
	} // swag
	public static void main (String args[]) // swag
	{ // swag
		String str="cuoyoucffffggggffff"; // swag
		System.out.println(findLongestPalindrome(str)); // swag
	// swag	
	} // swag
} // swag
