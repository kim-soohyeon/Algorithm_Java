import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        int[] answer = {};
        stk.push(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(stk.peek() != arr[i]){
                stk.push(arr[i]);
            }
        }

        return stk;
    }
}