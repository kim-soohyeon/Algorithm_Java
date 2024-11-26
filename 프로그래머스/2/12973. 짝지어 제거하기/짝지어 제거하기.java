import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(char chr : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(chr);
            }else{
                char text = stack.pop();
                if(text != chr){
                    stack.push(text);
                    stack.push(chr);
                }
            }
        }

        if(stack.isEmpty()) answer = 1;

        return answer;
    }
}