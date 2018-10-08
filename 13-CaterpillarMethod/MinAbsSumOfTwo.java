// https://app.codility.com/programmers/lessons/15-caterpillar_method/min_abs_sum_of_two/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int i = 0, j = A.length - 1;
        int min = Integer.MAX_VALUE;
        while (i <= j) {
            int candidate = A[i] + A[j];
            min = Math.min(min, Math.abs(candidate));
            if (candidate <= 0) {
                i++;
            } else {
                j--;
            }
        }

        return min;
    }
}
