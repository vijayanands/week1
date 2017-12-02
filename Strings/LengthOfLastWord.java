public class Solution {
	public int lengthOfLastWord(final String a) {
	    int length = a.length();
	    int lengthOfWord = 0;
	    boolean foundLastWord = false;
	    for (int i = length-1; i >= 0; i--) {
	        if (Character.isLetter(a.charAt(i))) {
	            foundLastWord = true;
	            while ((i >= 0) && (Character.isLetter(a.charAt(i)))) {
	                lengthOfWord++;
	                i--;
	            }
	        }
	        if (foundLastWord)
	            break;
	    }
	    if (foundLastWord = false) {
	        return 0;
	    } else {
	        return lengthOfWord;
	    }
	}
}
