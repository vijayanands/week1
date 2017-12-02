public class Solution {
	public int isPalindrome(String a) {
	    int i = 0;
	    int j = a.length() - 1;
	   // System.out.println("i = " + i + ", j = " + j);
	    while ((i < j) && (i < a.length()) && (j >= 0)) {
	        char ch1 = a.charAt(i);
	        char ch2 = a.charAt(j);
	        if (!Character.isLetterOrDigit(ch1)) {
	            i++;
	            continue;
	        }
	        if (!Character.isLetterOrDigit(ch2)) {
	            j--;
	            continue;
	        }
	       // System.out.println("ch1 = " + ch1);
	       // System.out.println("ch2 = " + ch2);
	        if (i <= j) {
	            if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
	               // System.out.println("Not a Palindrome");
	                return 0;
	            }
	        }
	        i++;
	        j--;
	    }
	    return 1;
	}
}
