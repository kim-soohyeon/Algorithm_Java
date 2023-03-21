import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 중복 제거하여 문자 구하기
        HashSet<Character> hash = new HashSet<>();
        for(char chr : s.toCharArray()){
            hash.add(chr);
        }

        // 문자의 등장 횟수 구하기
        ArrayList<Character> arrLst = new ArrayList<>();
        int idx = 0;
        for(char chr : hash){
            int num = s.length() - s.replace(chr + "", "").length();
            if(num == 1){
                // 한번만 등장하는 문자 list에 추가
                arrLst.add(chr);
            }
        }
        
        // 오름차순 정렬
        Collections.sort(arrLst);
        for(char chr : arrLst){
            System.out.println(chr);
            answer += chr;
        }
        
        return answer;
    }
}