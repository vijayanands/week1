public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    int size = a.size();
	   // System.out.println("size = " + size);
	    int rangeSize = (int)Math.sqrt((double)(size-1));
	    int noOfRanges = (int)Math.ceil((double)size/rangeSize);
	    int lastRangeSize = (size-1) - (rangeSize*(noOfRanges-1));
	    int[] numbersInRange = new int[noOfRanges];
	   // System.out.println("rangeSize = " + rangeSize);
	   // System.out.println("noOfRanges = " + noOfRanges);
	   // System.out.println("lastRangeSize = " + lastRangeSize);
	    for (int i = 0; i < size; i++) {
	        int val = a.get(i);
	        int rangeIdx = (val-1)/rangeSize;
	       // if (val >= 530) 
	           // System.out.println(val + " rangeIdx = " + rangeIdx);
	        numbersInRange[rangeIdx]++;
	    }
	    int startRangeIdx = 1;
	    int endRangeIdx = size;
	    boolean duplicateFound = false;
	    int tmpRangeSize = rangeSize;
	    for (int i = 0; i < noOfRanges; i++) {
	       // System.out.println("Range " + i + " has " + numbersInRange[i] + " numbers");
	        if (i == noOfRanges-1)
	            tmpRangeSize = lastRangeSize;
	        if (numbersInRange[i] > tmpRangeSize) {
                startRangeIdx = i*rangeSize;
	            endRangeIdx = (startRangeIdx+tmpRangeSize);
	            if (endRangeIdx > size) 
	                endRangeIdx = size;
	            duplicateFound = true;
	            break;
	        }
	    }
	    if (duplicateFound == false) {
	       // System.out.println("No Duplicate Found");
	        return -1;
	    }
	   // System.out.println("start: " + startRangeIdx + ", end: " + endRangeIdx);
	    HashMap<Integer, Integer> freq = new HashMap<Integer,Integer>();
	    for (int i = 0; i < size; i++) {
	        int val = a.get(i);
	       // System.out.println("val = " + val);
	        if ((val >= (startRangeIdx+1)) && (val <= endRangeIdx)) {
	           // System.out.print("val = " + val);
	            if (freq.containsKey(val)) {
	                int tmp = freq.get(val);
	                freq.put(val, tmp+1);
	               // System.out.print(", freq = " + tmp+1);
	            } else {
	                freq.put(val, 1);
	               // System.out.print(", freq = 1");
	            }
	        }
	       // System.out.println();
	    }
	    for (Integer key : freq.keySet()) {
	        int val = freq.get(key);
	        if (val > 1) {
	           // System.out.print("Key: " + key);
	           // System.out.println(", freq = " + freq);
	            return key;
	        }
	    }
	    return -1;
	}
}
