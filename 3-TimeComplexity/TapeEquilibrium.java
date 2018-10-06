// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] rightSum = new int[A.length];
        rightSum[A.length - 1] = A[A.length-1];
        for (int i = A.length -2; i > 0; i--) {
            rightSum[i] = rightSum[i+1] + A[i];
        }
        int sum = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            sum += A[i];
            min = Math.min(Math.abs(rightSum[i + 1] - sum), min);
        }
        
        return min;
    }
}
