// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        for (int a : A) {
            max = Math.max(a, max);
        }
        
        int[] count = new int[max+1];
        for (int a : A) {
            count[a]++;
        }
        
        int[] divisors = new int[max+1];
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) continue;
            for (int j = i; j <= max; j += i) {
                divisors[j] += count[i];
            }
        }
        
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A.length - divisors[A[i]];
        }

        return result;
    }
}
