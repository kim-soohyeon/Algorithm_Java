import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char chr : my_string.toCharArray()){
            if(chr >= 'a' && chr <= 'z'){
                chr -= 32;                
            }else{
                chr += 32;
            }
            answer += chr;
        }
        return answer;
    }
}