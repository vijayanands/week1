public class Solution {
	public int atoi(final String a) {
	    int i = 0;
	    // if first char is not digit or space return 0
	    boolean negativeNumber = false;
	    int length = a.length();
	    char ch = a.charAt(i);
	    if (!Character.isDigit(ch)) {
	        // first character is not digit
            if (!Character.isWhitespace(ch)) {
                // first character is not whitespace
                if (ch == '-') {
                    // System.out.println("negative number found");
                    negativeNumber = true;
                    ch = a.charAt(++i);
                } else if (ch == '+') {
                    ch = a.charAt(++i);
                } else 
                    return 0;
            } else {
               // skip whitespace
            //   System.out.println("whitespace found");
               i++;
               while (i < length) {
                    ch = a.charAt(i);
                    if (Character.isWhitespace(ch))
                        i++;
                    else
                        break;
               }
            }
	    }
	   // System.out.println("i = " + i);
	    if (i >= length)
	        return 0;
	    if (ch == '-') {
	        negativeNumber = true;
	        ch = a.charAt(++i);
	    } else if (ch == '+') {
	        ch = a.charAt(++i);
	    }
	    if (!Character.isDigit(ch)) {
            // not a digit
            return 0;
	    } else {
	        // character is a digit
	        int start = i++;
	        while (i < length) {
	            ch = a.charAt(i);
	            if (Character.isDigit(ch)) {
	                i++;
	            } else 
	                break;
	        }
	        int end = --i;
	        int k = 0;
	        int number = 0;
	       // System.out.println("Start = " + start + ", end = " + end);
	        for (int j = end; j >= start; j--) {
	            ch = a.charAt(j);
	           // System.out.println("char = " + ch);
	           int charVal = (ch - '0');
	           //System.out.println("charVal = " + charVal);
	           double tmp = (ch - '0') * Math.pow(10,k);
	           //System.out.println("tmp = " + tmp);
	            if ((number+tmp) > Integer.MAX_VALUE){
	                if (negativeNumber)
	                    return Integer.MIN_VALUE;
	                else
	                    return Integer.MAX_VALUE;
	            } else {
	                number += (int)tmp;
	               // System.out.println("number = " + number);
	            }
	            k++;
	        }
	        if (negativeNumber)
	            return (-1 * number);
	        else 
	            return number;
	    }
	}
	
}
