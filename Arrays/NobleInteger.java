public class Solution {
    public int solve(ArrayList<Integer> A) {
        int length = A.size();
        if (length < 1)
            return -1;
        else if (length == 1) {
            int tmp = A.get(0);
            if (tmp == 0)
                return 1;
            else
                return -1;
        }
        HashMap<Integer,Integer> numbersGreater = new HashMap<Integer,Integer>();
        Collections.sort(A);
        for (int i = 0; i < length; i++) {
            int cur = A.get(i);
            int remainingIntegers = length - (i+1);
            numbersGreater.put(cur,remainingIntegers);
            if (cur > (length/2))
                break;
        }
        // iterate through the hashmap
        for (Integer key : numbersGreater.keySet()) {
            int tmp = numbersGreater.get(key);
            if (tmp == key)
                return 1;
        }
        return -1;
    }
}
