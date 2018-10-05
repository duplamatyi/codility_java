// https://app.codility.com/programmers/lessons/14-binary_search_algorithm/nailing_planks/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B, int[] C) {
    // write your code in Java SE 8
        int minNails = 1, maxNails = C.length, result = -1, m = 0;
        for (int b : B) {
            if (b > m) {
                m = b;
            }
        }
        for (int c : C) {
            if (c > m) {
                m = c;
            }
        }
        while (minNails <= maxNails) {
            int midNails = (maxNails + minNails) / 2;
            if (AllNailed(midNails, A, B, C, m)) {
                maxNails = midNails - 1;
                result = midNails;
            } else {
                minNails = midNails + 1;
            }
        }

        return result;
    }
    
    private boolean AllNailed(int nrOfNails, int[] A, int[] B, int[] C, int m) {
        int[] nailsMarked = new int[m + 1];
        for (int i = 0; i < nrOfNails; i++) {
            nailsMarked[C[i]] = 1;
        }

        // generate prefix sums so we can make queries for the plank range
        // for example plank(1,5) is nailed when the number of nails at start and end differs, 
        // i.e. there is a nail in this range
        for (int i = 1; i < nailsMarked.length; i++) {
            nailsMarked[i] += nailsMarked[i - 1];
        }

        boolean allNailed = true;
        for (int i = 0; i < A.length && allNailed; i++) {
            allNailed = nailsMarked[B[i]] - nailsMarked[A[i] - 1] > 0;
        }

        return allNailed;
    }
}
