class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int cnt = 0;
        if(a == b) cnt ++;
        if(a == c) cnt ++;
        if(b == c) cnt ++;
        
        if(cnt == 0){
            answer = a + b + c;
        }else if(cnt == 3){
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c );
        }else{
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }
}