class Solution {
    public int solution(int n) {
        int answer = 0;
 
        for (int i = 1; i <= n; i++) {
            answer++;                      
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                // 3의 배수나 숫자 3인 경우
                answer++;
            }
        }
        return answer;
    }
}