// https://app.codility.com/programmers/lessons/15-caterpillar_method/count_distinct_slices/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int M, int[] A) {
        int[] seenAt = new int[M+1];
        Arrays.fill(seenAt, -1);
        int count = 0, back = -1;
        for (int front = 0; front < A.length; ++front) {
            back = Math.max(back, seenAt[A[front]]);
            count += front - back;
            if (count > 1000000000) return 1000000000;
            seenAt[A[front]] = front;
        }

        return count;
    }
}