// https://app.codility.com/programmers/lessons/13-fibonacci_numbers/ladder/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int[] result = new int[A.length];
        int keepItInt = 1 << 30;
        ArrayList<Integer> fibs = new ArrayList<Integer>();
        fibs.add(1);
        fibs.add(1);
        int a = 1, b = 1, c = 2;
        for (int j = 2; j <= A.length; j++) {
            fibs.add(c);
            a = b; b = c; c = (a + b) & (keepItInt - 1);
        }
        
        for (int i = 0; i < A.length; i++) {
            result[i] = fibs.get(A[i]) & ((1 << B[i]) - 1);
        }
        
        return result;
    }
}
