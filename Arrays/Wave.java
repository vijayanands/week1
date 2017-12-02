public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    if (a.size() <= 1)
	        return a;
	    Collections.sort(a);
	    int i = 1;
	    while (i < a.size()) {
	        int tmp = a.get(i);
	        a.set(i, a.get(i-1));
	        a.set(i-1, tmp);
	        i = i+2;
	    }
	    return a;
	}
}
