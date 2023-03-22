import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        if(s1.length >= s2.length){
            List<String> list = Arrays.asList(s1);
            for(String str : s2){
                if(list.contains(str)){
                    answer++;
                }
            }
        }else{
            List<String> list = Arrays.asList(s2);
            for(String str : s1){
                if(list.contains(str)){
                    answer++;
                }
        }
        }
        return answer;
    }
}