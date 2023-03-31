import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int answer2 = numbers[0] * numbers[1];
        
        if(answer2 > answer){
            answer = answer2;
        }
        
        return answer;
    }
}