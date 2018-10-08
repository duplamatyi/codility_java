// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] B = new int[1000000];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[A[i]-1] = 1;
            }
        }
        
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 0) return i + 1;
        }
        
        return 1;
    }
}
