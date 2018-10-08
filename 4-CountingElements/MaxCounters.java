// https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] C = new int[N];
        int max = 0, appliedMax = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                C[A[i]-1] = Math.max(appliedMax, C[A[i]-1]) + 1;
                max = Math.max(max, C[A[i]-1]);
            } else {
                appliedMax = max;
            }
        }
        
        for (int i = 0; i < C.length; i++) {
            if (C[i] < appliedMax) C[i] = appliedMax;
        }

        return C;
    }
}
