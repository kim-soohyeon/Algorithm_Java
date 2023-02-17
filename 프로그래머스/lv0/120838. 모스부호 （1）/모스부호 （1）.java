import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-."
                        , "--.", "....", "..", ".---", "-.-", ".-.."
                        , "--", "-.", "---", ".--.", "--.-", ".-."
                        , "...", "-", "..-", "...-", ".--", "-..-"
                        , "-.--", "--.."
        };
        String answer = "";
        String[] arr = letter.split(" ");
        for(String str : arr){
            int i = Arrays.asList(morse).indexOf(str) + 'a';
            answer += (char)i;
        }
        return answer;
    }
}