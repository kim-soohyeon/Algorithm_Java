import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        int num;
        
        while(order > 0){
            num = order % 10;
            if(num == 3 || num == 6 || num == 9){
                answer++;
            }
            order /= 10;
        }
        
        return answer;
    }
}