// https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1 || stack.isEmpty() || B[stack.peek()] == B[i]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && A[stack.peek()] < A[i] && B[stack.peek()] != B[i]) {
                    stack.pop();
                }
                if (stack.isEmpty() || B[stack.peek()] == B[i]) {
                    stack.push(i);
                }
            }
        }
        
        return stack.size();
    }
}
