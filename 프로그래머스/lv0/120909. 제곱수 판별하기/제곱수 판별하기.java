class Solution {
    public int solution(int n) {
        int answer = 2; //제곱수 아님
        int num = 1;
        while(true){
            if(num * num > n){
                break;
            }else if(num * num == n){
                answer = 1; //제곱수
            }
            num++;
        }
        return answer;
    }
}