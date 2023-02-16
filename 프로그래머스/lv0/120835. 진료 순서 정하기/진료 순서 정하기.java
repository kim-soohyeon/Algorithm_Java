import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] org_emergency = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++){
            org_emergency[i] = emergency[i];
        }
        int[] desc_arr = new int[emergency.length];
        int[] answer = new int[emergency.length];

        Arrays.sort(emergency);
        for(int i = emergency.length - 1; i >= 0; i--){
            desc_arr[emergency.length - 1 - i] = emergency[i];
        }
        
        for(int i = 0; i < org_emergency.length; i++){
            for(int j = 0; j < desc_arr.length; j++){
                if(org_emergency[i] == desc_arr[j]){
                    answer[i] = j + 1;
                    break;
                }
            }
            
        }
        
        return answer;
    }
}