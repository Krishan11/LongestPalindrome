

public class LongestPalindrome
{
	public static String findLongestPalindrome(String str)
	{
		String currentPalindrome="",longestPalindrome="";
		for(int i=1;i<str.length()-1;i++)
		{int left=i-1,right=i+1;
			while(left >=0 && right<str.length())
			{
				if(str.charAt(left)!=str.charAt(right))
				{
				break;
				}
			currentPalindrome=str.substring(left,right+1);
			if(currentPalindrome.length()>longestPalindrome.length())
			{
				longestPalindrome=currentPalindrome;
			}
			left--;
			right++;
			
			}
				
		}
	return longestPalindrome;
		
	}
	public static void main (String args[])
	{
		String str="cuoyoucffffggggffff";
		System.out.println(findLongestPalindrome(str));
		
	}
}