import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        if((s.charAt(0) == ')') || (s.charAt(s.length() - 1) == '(')) return false;
        
        Stack<Character> stack = new Stack<>();   
        for(char chr : s.toCharArray()){
            if(chr == '('){
                stack.push(chr);
            }else{
                if(stack.size() > 0){
                    stack.pop();
                }
            }
        }
        
        if(stack.size() > 0) answer = false;

        return answer;
    }
}