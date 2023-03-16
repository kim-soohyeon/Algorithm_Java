import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(order > 0){
            arrList.add(order % 10);
            order /= 10;
        }
        
        for(int num : arrList){
            if(num == 3 || num == 6 || num == 9){
                answer++;
            }
        }
        
        return answer;
    }
}