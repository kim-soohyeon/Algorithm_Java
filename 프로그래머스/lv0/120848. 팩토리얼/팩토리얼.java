class Solution {
    public int fact(int n) {
        if(n == 1){
            return 1;
        }else{
            return n * fact(n - 1);
        }
    }
    public int solution(int n) {
        int answer = 1;
        
        while(fact(answer) <= n){
            answer++;                      
        }
        return --answer;
    }
}