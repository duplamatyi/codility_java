// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 3) return 0;
        Arrays.sort(A);
        int count = 0;
        for (int x = 0; x < A.length; x++) {
            int z = x + 2;
            for (int y = x + 1; y < A.length; y++) {
                while (z < A.length && A[z] - A[y] < A[x]) {
                    z++;
                }

                count += z - y - 1;
            }
        }
        
        return count;
    }
}
