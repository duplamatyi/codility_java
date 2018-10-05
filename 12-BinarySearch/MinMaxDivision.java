// https://app.codility.com/programmers/lessons/14-binary_search_algorithm/min_max_division/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.*;

class Solution {
    public int solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        int minSum = 0, maxSum = 0, mid;
        for (int a : A) {
            maxSum += a;
            if (a > minSum) {
                minSum = a;
            }
        }
        while (minSum <= maxSum) {
            mid = (minSum + maxSum) / 2;
            if (Math.min(A.length, K) >= blockCount(mid, A)) {
                maxSum = mid - 1;
            } else {
                minSum = mid + 1;
            }
        }
        
        return minSum;
    }
    
    private int blockCount(int m, int[] A) {
        int sum = 0;
        int count = 0;
        for (int a : A) {
            sum += a;
            if (sum == m) {
                sum = 0;
                count++;
            } else if (sum > m) {
                sum = a;
                count++;
            }
        }
        if (sum > 0) {
            count++;
        }
        return count;
    }
}
