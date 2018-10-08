// https://app.codility.com/programmers/lessons/6-sorting/distinct/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) return 0;
        int count = 1;
        Arrays.sort(A);
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) count++;
        }
        return count;
    }
}
