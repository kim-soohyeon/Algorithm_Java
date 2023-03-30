class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int num1Min = dots[0][0];
        int num1Max = dots[0][0];
        int num2Min = dots[0][1];
        int num2Max = dots[0][1];
        for(int i = 1; i < dots.length; i++){
            if(num1Min > dots[i][0]){
                num1Min = dots[i][0];
            }
            if(num1Max < dots[i][0]){
                num1Max = dots[i][0];
            }
            if(num2Min > dots[i][1]){
                num2Min = dots[i][1];
            }
            if(num2Max < dots[i][1]){
                num2Max = dots[i][1];
            }
        }
        answer = (num1Max - num1Min) * (num2Max - num2Min);
        
        return answer;
    }
}