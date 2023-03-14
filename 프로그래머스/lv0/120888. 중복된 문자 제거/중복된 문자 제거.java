import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char chr : my_string.toCharArray()){           
            if(!answer.contains(String.valueOf(chr))) {
                answer += chr;
            }
        }
        
        return answer;
    }
}