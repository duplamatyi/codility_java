// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int[] B = new int[X];
        int M = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) B[A[i]-1]++;
            if (B[A[i]-1] == 1) M++;
            if (M == X) return i;
        }
        
        return -1;
    }
}
