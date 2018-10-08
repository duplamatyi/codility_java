// https://app.codility.com/programmers/lessons/13-fibonacci_numbers/fib_frog/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length <= 2) return 1;

        ArrayList<Integer> fibs = new ArrayList<Integer>();
        fibs.addAll(Arrays.asList(3, 2, 1));
        int a = 2, b = 3, c = 5;
        while (c <= A.length + 1) {
            fibs.add(0, c);
            a = b; b = c; c = a + b;
        }
        
        int[] moves = new int[A.length+1];
        LinkedList<Integer> leaves = new LinkedList<Integer>();
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) moves[i] = Integer.MAX_VALUE;
        }
        moves[A.length] = Integer.MAX_VALUE;
        
        
        for (int f : fibs) {
            if (f - 1 == A.length || A[f-1] == 1) {
                moves[f-1] = 1;
                leaves.add(f-1);
            }
        }
        
        if (moves[A.length] == 1) return 1;
        if (leaves.isEmpty()) return -1;

        do {
            int leaf = leaves.removeFirst();
            for (int f : fibs) {
                if (leaf + f < moves.length && moves[leaf+f] > moves[leaf] + 1) {
                    moves[leaf+f] = moves[leaf] + 1;
                    leaves.add(leaf+f);
                }
            }
        } while (!leaves.isEmpty());
        
        return (moves[A.length] == Integer.MAX_VALUE) ? -1 : moves[A.length];
    }
}
