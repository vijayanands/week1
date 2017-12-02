public class Solution {
	public int strStr(final String haystack, final String needle) {
	    int startOfNeedle = 0;
	    boolean needleEmpty = (needle == null) || (needle.length() == 0);
	    boolean haystackEmpty = (haystack == null) || (haystack.length() == 0);
	    // compare and increment pointers if equal, if not reset startOfNeedle
	    if (needleEmpty || (needleEmpty && haystackEmpty))
	        return -1;
	    if (haystackEmpty)
	        return 0;
	    int lengthOfHaystack = haystack.length();
	    int lengthOfNeedle = needle.length();
	    if (lengthOfNeedle > lengthOfHaystack)
	        return -1;
	    // valid inputs
	    int curCharIdxInHaystack = 0;
	    startOfNeedle = curCharIdxInHaystack;
	    int curCharIdxInNeedle = 0;
	    while (curCharIdxInHaystack < lengthOfHaystack) {
	        if (startOfNeedle > (lengthOfHaystack - lengthOfNeedle))
	            break;
	        if(curCharIdxInNeedle == 0) {
    	        if (needle.charAt(curCharIdxInNeedle) != haystack.charAt(curCharIdxInHaystack)) {
                    curCharIdxInHaystack++;
                    startOfNeedle++;
                    continue;
    	        }
	        }
            // found a match for the first character of needle	        
	           // if (curCharIdxInHaystack > 11) {
	       // System.out.println("curCharIdxInNeedle = " + curCharIdxInNeedle);
	       // System.out.println("curCharIdxInHaystack = " + curCharIdxInHaystack);
	       // System.out.println("startOfNeedle = " + startOfNeedle);
	           // }
	        if (needle.charAt(curCharIdxInNeedle) == haystack.charAt(curCharIdxInHaystack)) {
	            // characters match
	            curCharIdxInNeedle++;
    	        curCharIdxInHaystack++;
	        } else {
	            // mismatch, start again
	            curCharIdxInNeedle = 0;
	            startOfNeedle++;
	            curCharIdxInHaystack = startOfNeedle;
	            continue;
	        }
	        if (curCharIdxInNeedle == lengthOfNeedle) 
	            return startOfNeedle;
	    }
	    return -1;
	}
}
