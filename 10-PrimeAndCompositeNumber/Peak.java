// https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/peaks/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 3) return 0;

        ArrayList<Integer> peaks = new ArrayList<Integer>();

        for(int i = 1; i < A.length-1; i++){
            if(A[i] > A[i-1] && A[i] > A[i+1]) peaks.add(i);
        }

        if (peaks.isEmpty()) return 0;

        for (int blockSize = 2; blockSize <= A.length / 2; blockSize++) {
            if (A.length % blockSize != 0) continue;
            int nrOfBlocks = 0;
            for (int peakIdx: peaks) {
                if (peakIdx / blockSize > nrOfBlocks) break;
                if (peakIdx / blockSize == nrOfBlocks) nrOfBlocks++;
            }
            if (nrOfBlocks == A.length / blockSize) return nrOfBlocks;
        }

        return 1;
    }
}
