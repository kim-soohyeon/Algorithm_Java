import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = n; i > 0; i--){
            if(n % i == 0){
                hash.add(i);
                // hash.add(n / i);
            }
        }
        
        // HashSet -> ArrayList 변환 후 정렬
        ArrayList<Integer> answer = new ArrayList<>(hash);
        Collections.sort(answer);
        
        return answer;
    }
}