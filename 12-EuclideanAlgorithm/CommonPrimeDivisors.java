// https://app.codility.com/demo/results/trainingG6QVWX-9SY/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (hasSamePrimeDivisiors(A[i], B[i]) && hasSamePrimeDivisiors(B[i], A[i])) count++;
        }
        
        return count;
    }

    private boolean hasSamePrimeDivisiors(int x, int y) {
        while (x != 1) {
            int m = gcd(x, y);
            if (m == 1) break;
            x /= m;
        }
        
        return (x == 1);
    }

    private int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return gcd(y, x % y);
        }
    }
}
