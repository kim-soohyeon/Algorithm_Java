import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        A: for(int i = 0; i < s.length(); i++){
            s = s.substring(1) + s.charAt(0);

            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < s.length(); j++){
                char chr = s.charAt(j);
                if(chr == '[' || chr == '{' || chr == '('){
                    stack.push(chr);
                }else{
                    if(stack.size() <= 0){
                        continue A;
                    }
                    char test = stack.pop();
                    if(test != map.get(chr)) {
                        continue A;
                    }
                }
            }
            if(stack.size() == 0) answer++;
        }

        return answer;
    }
}