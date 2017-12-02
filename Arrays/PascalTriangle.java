public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> currentRow = null;
	    if (a <= 0) {
	        currentRow = new ArrayList<Integer>();
	    }
	    if (a >= 1) {
	        currentRow = new ArrayList<Integer>();
    	    currentRow.add(1);
	        result.add(currentRow);
	    }
	    if (a >= 2) {
	        currentRow = new ArrayList<Integer>();
    	    currentRow.add(1);
    	    currentRow.add(1);
	        result.add(currentRow);
	    } 
	    if (a >= 3) { // a > 2
	        ArrayList<Integer> previousRow = currentRow;
	        int i = 3;
	        while (i <= a) {
	           // System.out.println("i = " + i);
	            currentRow = new ArrayList<Integer>();
	            currentRow.add(1);
	            int j = 1;
	            for (; j < i-1; j++) {
	               // System.out.println("j = " + j + ", j-1 = " + (j-1));
	                int tmp1 = previousRow.get(j);
	                int tmp2 = previousRow.get(j-1);
	               // System.out.println("add " + tmp1 + tmp2);
	                currentRow.add(tmp1+tmp2);
	            }
	           // System.out.println("j = "+(j-1));
	           // System.out.println("add "+ previousRow.get(j-1));
	            currentRow.add(previousRow.get(j-1));
	            result.add(currentRow);
	            previousRow = currentRow;
	            i++;
	        }
	    }
        return result;
	}
	
	
}
