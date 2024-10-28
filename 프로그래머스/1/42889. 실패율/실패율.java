import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N + 2];        
        for(int i = 0; i < stages.length; i++){
            challenger[stages[i]]++;
        }
        
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;
        for(int i = 1; i <= N; i++){
            if(challenger[i] == 0){
                fails.put(i, 0.0);
            }else{     
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
        
        int[] answer = fails.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
        
        return answer;
    }
}