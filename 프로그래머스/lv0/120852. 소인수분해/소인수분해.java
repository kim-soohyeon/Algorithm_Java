import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
         HashSet<Integer> hashSet = new HashSet<>();
        
        int i = 2;
        while(n != 1){
            if(n % i == 0){
                n /= i;
                hashSet.add(i);
            }else{
                i++;
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<>(hashSet);
        Collections.sort(answer);
        
        return answer;
        
    }
}