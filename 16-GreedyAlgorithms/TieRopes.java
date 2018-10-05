// https://app.codility.com/programmers/lessons/16-greedy_algorithms/tie_ropes/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int count = 0, length = 0;
        for (int a : A) {
            length += a;
            if (length >= K) {
                count++;
                length = 0;
            }
        }
        
        return count;
    }
}
