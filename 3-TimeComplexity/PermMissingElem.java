// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int missing = 0;
        for (int i = 0; i < A.length; i++) {
            missing ^= (i + 1);
            missing ^= A[i];
        }
        
        return missing ^ (A.length + 1);
    }
}
