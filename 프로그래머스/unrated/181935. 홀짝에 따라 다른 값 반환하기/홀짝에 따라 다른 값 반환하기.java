class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){
            //짝수
            while(n > 1){
                answer += n * n;
                n -= 2;
            }
        }else{
            //홀수
            while(n > 0){
                answer += n;
                n -= 2;
            }
        }
        return answer;
    }
}