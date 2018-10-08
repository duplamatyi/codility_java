// https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[][] nucleotides = new int[3][S.length()];
        int[] result = new int[P.length];
        int a = -1, c = -1, g = -1;
        for (int i = 0, n = S.length() ; i < n ; i++) { 
            char ch = S.charAt(i);
            switch (ch) {
                case 'A':
                    a = i;
                    break;
                case 'C':
                    c = i;
                    break;
                case 'G':
                    g = i;
                    break;
                default:
            }
            nucleotides[0][i] = a;
            nucleotides[1][i] = c;
            nucleotides[2][i] = g;
        }
        for (int i = 0 ; i < P.length ; i++) {
            for (int j = 0; j < 3; j++) {
                if (nucleotides[j][Q[i]] >= P[i]) {
                    result[i] = j + 1;
                    break;
                }
                result[i] = 4;
            }
        }
        
        return result;
    }
}
