// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 3) return 0;
        Arrays.sort(A);
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i-1] >= 0 && A[i+1] - A[i] < A[i-1]) {
                return 1;
            }
        }
        
        return 0;
    }
}
