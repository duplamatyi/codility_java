// https://app.codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int m = 0, count = 1;
        for (m = 0; m < A.length; m++) {
            if (A[m] >= 0) break;
        }
        if (m == A.length) {
            m--;
        } else {
            if (m > 0) {
                if (Math.abs(A[m-1]) < A[m]) m--;
            }
        }
        int prev = Math.abs(A[m]);
        for (int j = m - 1, k = m + 1; j >= 0 || k < A.length;) {
            while (j >= 0 && Math.abs(A[j]) == prev) j--;
            while (k < A.length && A[k] == prev) k++;
            if (j < 0 && k >= A.length) break;
            if (j < 0) {
                prev = A[k];
            } else if (k >= A.length) {
                prev = Math.abs(A[j]);
            } else {
                prev = Math.min(Math.abs(A[j]), A[k]);
            }
            count++;
        }
        
        return count;
    }
}
