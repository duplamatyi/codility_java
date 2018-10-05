// https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return 0;
                }
            } else {
                stack.push(S.charAt(i));
            }
    
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
