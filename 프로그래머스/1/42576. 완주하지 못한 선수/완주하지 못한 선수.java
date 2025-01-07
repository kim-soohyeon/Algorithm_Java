import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        // 완주자 배열을 먼저 HashMap에 추가
        for (String str : completion) {
            hashmap.put(str, hashmap.getOrDefault(str, 0) + 1);
        }

        // 참가자 배열을 순회하며 값을 감소
        for (String str : participant) {
            if (hashmap.getOrDefault(str, 0) == 0) {
                return str; // 완주하지 못한 선수
            }            
            hashmap.put(str, hashmap.get(str) - 1);
        }

        return ""; // 모든 선수가 완주한 경우 (문제에서는 발생하지 않음)
    }
}
