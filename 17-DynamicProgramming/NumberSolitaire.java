// https://app.codility.com/programmers/lessons/17-dynamic_programming/number_solitaire/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        LinkedList<Integer> q = new LinkedList<>();
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            q.add(A[i] + max);
            if (q.size() > 6) {
                q.remove();
            }
            max = Integer.MIN_VALUE;
            for (int j = 0; j < q.size(); j++) {
                if (max < q.get(j)) max = q.get(j);
            }
        }
        
        return q.getLast();
    }
}
