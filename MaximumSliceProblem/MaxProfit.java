// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxProfit = 0, lowestBuyingPrice = 200001;
        for (int a : A) {
            maxProfit = Math.max(maxProfit, a - lowestBuyingPrice);
            lowestBuyingPrice = Math.min(lowestBuyingPrice, a);
        }
        
        return maxProfit;
    }
}
