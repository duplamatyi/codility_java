// https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int disksStarting[] = new int[A.length];
        int disksEnding[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            disksStarting[Math.max(i - A[i], 0)]++;
            if (A.length - 1 < A[i]) {
                disksEnding[A.length - 1]++;
            } else {
                disksEnding[Math.min(i + A[i], A.length - 1)]++;
            }
        }
        
        int activeDisks = 0;
        for (int i = 0; i < A.length; i++) {
            result +=  activeDisks * disksStarting[i];
            result += disksStarting[i] * (disksStarting[i] - 1) / 2;
            if (result > 10000000) return -1;
            activeDisks += disksStarting[i];
            activeDisks -= disksEnding[i];
        }
        
        return result;
    }
}
