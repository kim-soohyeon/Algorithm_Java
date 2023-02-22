class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char chr : my_string.toCharArray()){
            if(chr >= '0' && chr <= '9'){
                answer += chr - '0';
            }
        }
        return answer;
    }
}