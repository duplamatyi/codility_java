// https://app.codility.com/programmers/lessons/8-leader/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<Integer>();
        for (int a : A) {
            if (stack.isEmpty() || stack.peek() == a) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return 0;
        }

        int candidate = stack.peek();
        int[] L = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                count++;
            }
            L[i] = count;
        }

        if (count <= A.length / 2) {
            return 0;
        }

        int[] R = new int[A.length];
        count = 0;
        for (int i = A.length - 1; i > 0; i--) {
            // System.out.println(i);
            if (A[i] == candidate) {
                count++;
            }
            R[i-1] = count;
        }

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (L[i] > (i + 1) / 2 && R[i] > (A.length - i -1) / 2) {
                result++;
            }
        }

        return result;
    }
}
