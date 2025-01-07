import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        for(String str : participant){
            hashmap.put(str, hashmap.getOrDefault(str, 0) + 1);
        }

        for(String str : completion){
            hashmap.put(str, hashmap.get(str) - 1);
        }

        String answer = "";
        for(String key: hashmap.keySet()){
            if(hashmap.get(key) > 0){
                answer = key;
                break;
            }
        }

        return answer;
    }
}