public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int sum = 0;
        int max_sum = 0;
        boolean foundPositive = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                foundPositive = true;
                break;
            }
        }
        if (foundPositive) {
            for (int i = 0; i < A.length; i++) {
                if ((sum+A[i]) < 0) {
                    sum = 0;
                } else {
                    sum += A[i];
                }
                if (max_sum < sum)
                    max_sum = sum;
            }
        } else {
            max_sum = A[0];
            for (int i = 0; i < A.length; i++) {
                if (max_sum < A[i]) {
                    max_sum = A[i];
                }
            }
        }
        return max_sum;
    }
}
