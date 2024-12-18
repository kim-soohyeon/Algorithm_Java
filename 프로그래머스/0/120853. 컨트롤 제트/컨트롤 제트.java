import java.util.*;

class Solution {
    public int solution(String s) {        
        Stack<Integer> stack = new Stack<>();
        for(String str : s.split(" ")){
            if(str.equals("Z")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(str));
            }
        }

        int answer = 0;
        for(int num : stack){
            answer += num;
        }

        return answer;
    }
}