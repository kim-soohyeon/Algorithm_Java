class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(char chr : str.toCharArray()){
            answer += (chr - '0');
        }
        return answer;
    }
}