// https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public static int solution(String S){
        if (S.isEmpty()) {
            return 1;
        }
        
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
            case ')':
            case ']':
            case '}':
                if (!stack.isEmpty() && stack.peek() == map.get(S.charAt(i))) {
                    stack.pop();
                } else {
                    return 0;
                }
                break;
            default:
                stack.push(S.charAt(i));
                break;
            }
    
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
