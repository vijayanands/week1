public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
	    String prefixString = new String();
	    // find the minimum length string
	    if (a == null)
	        return prefixString;
	    int noOfStrings = a.size();
	   // System.out.println("no of strings = " + noOfStrings);
	    if (noOfStrings > 0) {
	        if (noOfStrings == 1) {
	           // System.out.println("test1");
	            String str = a.get(0);
	            if ((str != null) && (str.length() > 0))
	                return a.get(0);
	            else
	                return prefixString;
	        } else {
	           // System.out.println("test2");
	            // find the minimum length string
	            String str = a.get(0);
	            int minLength;
	            if ((str != null) && (str.length() > 0))
    	            minLength = str.length();
                else
                    return prefixString;
	            for (int i = 1; i < noOfStrings; i++) {
	                str = a.get(i);
	                if ((str != null) && (str.length() > 0)) {
	                    int len = str.length();
	                    if (len < minLength)
	                        minLength = len;
	                } else {
	                    return prefixString;
	                }
	            }
	            boolean notEqual = false;
	            for (int j = 0; j < minLength; j++) {
	                char ch = (a.get(0)).charAt(j);
	                for (int k = 1; k < noOfStrings; k++) {
	                    if ((a.get(k)).charAt(j) != ch) {
	                        notEqual = true;
	                        break;
	                    }
	                }
	                if (notEqual)
	                    break;
	                prefixString += ch;
	            }
	        }
	        
	    }
	    return prefixString;
	}
}
