import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] chrArr = my_string.toCharArray();
        
        // 인덱스 num1과 인덱스 num2 값 변경
        char temp = chrArr[num1];        
        chrArr[num1] = chrArr[num2];
        chrArr[num2] = temp;
        
        for(char chr : chrArr){
            answer += chr;
        }        
        
        return answer;
    }
}