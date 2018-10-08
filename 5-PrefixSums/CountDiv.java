// https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        return B / K - A / K + ((A % K == 0) ? 1 : 0);
    }
}
