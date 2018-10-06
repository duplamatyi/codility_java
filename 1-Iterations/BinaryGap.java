// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int currentGap = 0, maxGap = 0;
        boolean isGap = false;
        while (N > 0) {
            if (N % 2 == 0) {
                currentGap++;
            } else {
                if (isGap && currentGap > maxGap) {
                    maxGap = currentGap;
                }
                isGap = true;
                currentGap = 0;
            }
            N /= 2;
        }
        
        return maxGap;
    }
}
