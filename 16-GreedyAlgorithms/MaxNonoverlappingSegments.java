// https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int position = -1, count = 0;
        for (int i = 0; i < A.length; i++) {
            if (position < A[i]) {
                position = B[i];
                count++;
            }
        }
        
        return count;
    }
}
