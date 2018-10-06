// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[(i + K) % A.length] = A[i];
        }
        
        return B;
    }
}
