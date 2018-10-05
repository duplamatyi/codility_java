// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.*;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int i = (int) Math.sqrt(N);
        while (N % i != 0) {
            i--;
        }
        return 2 * (i + N / i);
    }
}
