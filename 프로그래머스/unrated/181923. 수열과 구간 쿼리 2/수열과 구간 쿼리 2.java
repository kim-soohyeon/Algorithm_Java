import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            answer[i] = -1;
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(arr[j] > queries[i][2]){
                    if(answer[i] == -1 || answer[i] > arr[j]){
                        answer[i] = arr[j];
                    }
                }
            }
        }
        
        return answer;
    }
}