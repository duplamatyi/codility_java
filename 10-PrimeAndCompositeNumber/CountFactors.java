// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.*;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int numFactors = 0, i = 1;
        double rootN = Math.sqrt(N);
        for (; i < rootN; i++) {
            if (N % i == 0) {
                numFactors += 2;
            }
        }
        if (i * i == N) {
            numFactors++;
        }
        return numFactors;
    }
}