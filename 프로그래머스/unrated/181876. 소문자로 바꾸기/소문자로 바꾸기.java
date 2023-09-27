class Solution {
    public String solution(String myString) {
        String answer = "";
        char chr;
        for(int i = 0; i < myString.length(); i++){
            chr = myString.charAt(i);
            if(chr >= 'A' && chr <= 'Z'){
                answer += (char)(chr + 32);
            }else{
                answer += chr;
            }
        }
        return answer;
    }
}