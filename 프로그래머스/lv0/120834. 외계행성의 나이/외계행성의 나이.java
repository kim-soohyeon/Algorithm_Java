class Solution {
    public String solution(int age) {
        String answer = "";
        
        if(age < 10){
            // 1자리
            answer += Character.toString(age + 'a');
        }else if(age < 100){
            // 2자리
            answer += Character.toString(age / 10 + 'a');
            answer += Character.toString(age % 10 + 'a');
        }else if(age < 1000){
            // 3자리
            answer += Character.toString(age / 100 + 'a');
            answer += Character.toString(age % 100 / 10+ 'a');
            answer += Character.toString(age % 10 + 'a');
        }else{
            // 4자리. 1000
            answer = "baaa";
        }

        return answer;
    }
}