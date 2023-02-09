import java.util.*;

class Solution {
    public int solution(int[] array) {        
        int[] cnt = new int[1000];
        
        for(int i = 0; i < array.length; i++){
            cnt[array[i]]++;
        }
        // 0 1 1 3 1
        int max = cnt[0];
        int answer = 0;
        int maxCnt = 1;
        for(int i = 1; i < cnt.length; i++){
            if(max < cnt[i]){
                max = cnt[i];
                answer = i;
                maxCnt = 1;
            }else if(max == cnt[i]){
                maxCnt++;
            }
        }
        
        if(maxCnt > 1){
            answer = -1;
        }
        
        return answer;
    }
}