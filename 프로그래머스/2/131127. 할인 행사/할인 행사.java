import java.util.HashMap;

public class Solution {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> wantMap = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - 9; i++){
            HashMap<String, Integer> disconuntMap = new HashMap<>();
            for(int j = 0; j < 10; j++){
                disconuntMap.put(discount[i + j], disconuntMap.getOrDefault(discount[i + j], 0) + 1);
            }

            if(wantMap.equals(disconuntMap)){
                answer++;
            }
        }

        return answer;
    }

}