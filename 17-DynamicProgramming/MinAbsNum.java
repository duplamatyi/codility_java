//https://app.codility.com/programmers/lessons/17-dynamic_programming/min_abs_sum/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) return 0;
        if (A.length == 1) return Math.abs(A[0]);
        int max = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.abs(A[i]);
            max = Math.max(A[i], max);
            sum += A[i];
        }
        int[] valueCount = new int[max + 1];
        for (int i = 0; i < A.length; i++) {
            valueCount[A[i]]++;
        }

        int[] dp = new int[sum+1];
        Arrays.fill(dp, 1, dp.length, -1);
        for (int a = 1; a <= max; a++) {
            if (valueCount[a] > 0) {
                for (int j = 0; j < sum; j++) {
                    if (dp[j] >= 0) {
                        dp[j] = valueCount[a];
                    } else if (j >= a && dp[j-a] > 0) {
                        dp[j] = dp[j - a] - 1;
                    }
                }
            }
        }
        
        int result = sum;
        for (int i = 0; i <= sum / 2; i++) {
            if (dp[i] >= 0) {
                result = Math.min(result, sum - 2 * i);
            }
        }
        
        return result;
    }
}
