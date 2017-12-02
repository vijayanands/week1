public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    if (a == null)
	        return;
	    int dim = a.size();
	    if (dim < 1)
	        return;
	   // System.out.println("dim = " + dim);
	    for(int row = 0 ; row < (dim/2 + dim%2); row++) {
	        for (int col = row; col < (dim - row - 1); col++) {
	           // System.out.println("row = " + row + ", col = " + col);
	            int fromLoc_x = row;
	            int fromLoc_y = col;
	            int val = (a.get(fromLoc_x)).get(fromLoc_y);
	            while (true) {
	                int toLoc_x = fromLoc_y;
	                int toLoc_y = (dim - fromLoc_x)-1;
	           // System.out.println("from_x = " + fromLoc_x + "fromLoc_y = " + fromLoc_y);
	           // System.out.println("to_x = " + toLoc_x + "to_y = " + toLoc_y);
	                int tmp = a.get(toLoc_x).get(toLoc_y);
                    a.get(toLoc_x).set(toLoc_y, val);
                    val = tmp;
                    fromLoc_x = toLoc_x;
                    fromLoc_y = toLoc_y;
                    if ((fromLoc_x == row) && (fromLoc_y == col))
                        break;
	            }
	        }
	    }
	}
}
