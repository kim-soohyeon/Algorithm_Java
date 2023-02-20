class Solution {
    public String solution(String my_string) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        String answer = "";
        
        for(char chr1 : my_string.toCharArray()){
            int cnt = 0;
            for(char chr2 : arr){                
                if(chr1 == chr2){
                    cnt++;
                }                
            }
            if(cnt == 0){
                answer += chr1;
            }
        }
        
        return answer;
    }
}