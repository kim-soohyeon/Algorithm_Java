class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max, min;
        if(sides[0] >= sides[1]){
            max = sides[0];
            min = sides[1];
        }else{
            max = sides[1];
            min = sides[0];
        }        
        
        // 나머지 한 변이 가장 긴 변인 경우
        for(int i = max + 1; i < max + min; i++){
            answer++;
        }
        
        // 가장 긴 변이 max인 경우
        for(int i = max; i > 0; i--){
            if(min + i > max){
                answer++;
            }
        }
        
        return answer;
    }
}