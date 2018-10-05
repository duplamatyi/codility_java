// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.ArrayList;

class Solution {
    public int solution(int[] A) {
        ArrayList<Integer> peaks = new ArrayList<Integer>();  
        for (int i = 1; i < A.length - 1; i++) {  
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {  
                peaks.add(i);  
            }  
        }  
        
        if (peaks.size() == 1 || peaks.size() == 0) {  
            return peaks.size();  
        }

        int startPeak = 1;
        int endPeak = peaks.size();  
        int result = 1;  
        while (startPeak <= endPeak) {
            int flag = (startPeak + endPeak) / 2;  
            boolean suc = false;  
            int used = 0;  
            int mark = peaks.get(0);  
            for (int i = 0; i < peaks.size(); i++) {  
                if (peaks.get(i) >= mark) {  
                    used++;  
                    mark = peaks.get(i) + flag;  
                    if (used == flag) {                       
                        suc = true;  
                        break;  
                    }  
                }  
            }  
            if (suc) {  
                result = flag;  
                startPeak = flag + 1;  
            }  else {  
                endPeak = flag - 1;  
            }  
        }  
        return result;  
    }
}
