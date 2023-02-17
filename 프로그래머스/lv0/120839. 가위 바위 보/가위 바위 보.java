class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(char chr : rsp.toCharArray()){
            if(chr == '2'){
                answer += '0';
            }else if(chr == '0'){
                answer += '5';
            }else{
                answer += '2';
            }
        }
        return answer;
    }
}