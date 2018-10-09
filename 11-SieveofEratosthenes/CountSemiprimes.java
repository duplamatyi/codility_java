// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        int max = 0;
        for (int q : Q) max = Math.max(max, q);
        int divCount[] = new int[max+1];
        int primFactCount[] = new int[max+1];
        for (int i = 2; i <= max/2; i++) {
            if (divCount[i] > 0) continue;
            for (int j = i, k = 0; j <= max; j += i) {
                if (j % (i * i) == 0) {
                    k++;
                    divCount[j] += k;
                }
                divCount[j] += 1;
            }
        }
        
        int[] dps = new int[max+1];
        int semiPrimeCount = 0;
        for (int i = 0; i < dps.length; i++) {
            if (divCount[i] == 2) semiPrimeCount++;
            dps[i] = semiPrimeCount;
        }
        
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            result[i] = dps[Q[i]] - dps[P[i]-1];
        }
        
        return result;
    }
}
