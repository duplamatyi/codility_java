// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxEnding = 0, maxSlice = Integer.MIN_VALUE;
        for (int a : A) {
            maxEnding = Math.max(a, maxEnding + a);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

        return maxSlice;
    }
}
