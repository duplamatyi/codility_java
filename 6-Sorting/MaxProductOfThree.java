// https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min1 = 1000;
        int min2 = 1000;
        int max1 = -1000;
        int max2 = -1000;
        int max3 = -1000;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max3) {
                max1 = max2;
                max2 = max3;
                max3 = A[i];
            } else if (A[i] > max2) {
                max1 = max2;
                max2 = A[i];
            } else if (A[i] > max1) {
                max1 = A[i];
            }
            
            if (A[i] < min2) {
                min1 = min2;
                min2 = A[i];
            } else if (A[i] < min1) {
                min1 = A[i];
            }
        }
        int prod1 = max3 * max2 * max1;
        int prod2 = max3 * min2 * min1;
        return prod1 > prod2 ? prod1 : prod2;
    }
}
