import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 2;// 삼각형 불가능
        
        Arrays.sort(sides);        
        if(sides[0] + sides[1] > sides[2]){
            answer = 1;// 삼각형 가능
        }
        
        return answer;
    }
}