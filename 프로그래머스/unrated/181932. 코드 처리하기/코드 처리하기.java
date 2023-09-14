class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char chr;
        for(int i = 0; i < code.length(); i++){
            chr = code.charAt(i);
            if(mode == 0){
                if(chr == '1'){
                    mode = 1;
                }else{
                    if(i % 2 == 0){
                        answer += chr;
                    }
                }
            }else{
                if(chr == '1'){
                    mode = 0;
                }else{
                    if(i % 2 != 0){
                        answer += chr;
                    }
                }                
            }
        }
        
        if(answer.equals("")) return "EMPTY";
        
        return answer;
    }
}