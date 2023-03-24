class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array){
            if(num >= 10){
                while(num > 0){
                    if(num % 10 == 7){
                        answer++;
                    }
                    num /= 10;
                }
            }else{
                if(num == 7){
                    answer++;
                }
            }
        }
        return answer;
    }
}