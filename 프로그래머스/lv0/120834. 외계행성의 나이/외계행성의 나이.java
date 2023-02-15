class Solution {
    public String solution(int age) {
        String answer = "";
        String str_age = Integer.toString(age);
        
        for(char chr : str_age.toCharArray()){
            answer += (char)(chr - '0' + 'a');
        }
        
        return answer;
    }
}