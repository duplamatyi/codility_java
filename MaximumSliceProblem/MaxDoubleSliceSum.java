// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_double_slice_sum/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int[] maxSumEnding = new int[A.length], maxSumBeginning = new int[A.length];
        
        for (int i = 1; i < A.length; i++) {
            maxSumEnding[i] = Math.max(0, maxSumEnding[i-1] + A[i]);
        }

        for (int i = A.length - 2; i >= 0; i--) {
            maxSumBeginning[i] = Math.max(0, maxSumBeginning[i+1] + A[i]);
        }
        
        int max = 0;
        
        for (int i = 1; i < A.length - 1; i++) {
            max = Math.max(max, maxSumEnding[i-1] + maxSumBeginning[i+1]);
        }
        
        return max;
    }
}
