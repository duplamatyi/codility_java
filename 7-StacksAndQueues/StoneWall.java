// https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int stones = 0;
        Stack<Long> stack = new Stack<Long>();

        for (long h : H) {
            while (!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() != h) {
                stones++;
                stack.push(h);
            }
        }

        return stones;
    }
}
