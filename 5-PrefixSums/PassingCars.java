// https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int countEast = 0;
        int countPassing = 0;
        for (int a : A) {
            if (a == 0) {
                countEast++; 
            } else {
                countPassing += countEast;
                if (countPassing > 1000000000) {
                    return -1;
                }
            }
        }

        return countPassing;
    }
}
