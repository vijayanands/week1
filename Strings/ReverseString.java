public class Solution {
	public String reverseWords(String a) {
	    int i = 0;
	    int start = 0;
	    int end = 0;
	   // System.out.println("Reversing entire string");
	    a = reverseString(a,0,a.length()-1);
	   // System.out.println(a);
	    // skip leading white space
	   // System.out.println("skipping leading whitespace");
	    while (i < a.length()) {
	        if (Character.isWhitespace(a.charAt(i))) {
	            i++;
	            continue;
	        } else
	            break;
	    }
	    // reverse the words in the sentence
	   // System.out.println("reversing individual words");
	    start = i;
	    while (i < a.length()) {
	       // System.out.println("finding the end of word");
	        if (!Character.isWhitespace(a.charAt(i))) {
	            i++;
	            continue;
	        }
	        end = i-1;
	        // reverse the word
	       // System.out.println("reverse the word");
	       // System.out.println("start = " + start + ", end = " + end);
	        a = reverseString(a, start, end);
	       // System.out.println(a);
	        // skip white space
	       // System.out.println("Skipping whitespace");
    	    while (i < a.length()) {
	            if (Character.isWhitespace(a.charAt(i))) {
	                i++;
	                continue;
	            } else 
	                break;
	        }
	        if (i < a.length())
	            start = i;
	    }
	    // reverse the last word
	    a = reverseString(a, start, a.length()-1);
	    return a;
	}
	
	private String reverseString(String a, int start, int end) {
	    char[] str = a.toCharArray();
	    int i = start;
	    int j = end;
	   // System.out.println("Character Array: " + str);
	    while ((i < j) && (i < a.length()) && (j >= 0)) {
	        char tmp = str[i];
	        str[i] = str[j];
	        str[j] = tmp;
	        i++;
	        j--;
	    }
	    a = new String(str);
	    return a;
	}
}
