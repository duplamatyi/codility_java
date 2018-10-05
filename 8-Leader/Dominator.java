// https://app.codility.com/programmers/lessons/8-leader/dominator/

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
            return -1;
        }
        
        int dominator = stack.peek();
        int count = 0, result = -1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == dominator) {
                count++;
                result = i;
            }
        }
        
        if (count > A.length / 2) {
            return result;
        }
        
        return -1;
    }
}
