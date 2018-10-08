// https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        double minAverage = 10000.1;
        int result = 0;
        for (int i = 0; i < A.length - 2; i++) {
            double candidate = (A[i] + A[i + 1]) / 2.0;
            if (candidate < minAverage) {
                minAverage = candidate;
                result = i;
            }
            candidate = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if (candidate < minAverage) {
                minAverage = candidate;
                result = i;
            }
        }
        double last = (A[A.length - 2] + A[A.length - 1]) / 2.0;
        if (last < minAverage) {
            result = A.length - 2;
        }
        
        return result;
    }
}
