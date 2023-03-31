class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] chrArray = my_string.toCharArray();
        String num = "";
        
        for(int i = 0; i < chrArray.length; i++){
            if(chrArray[i] >= '0' && chrArray[i] <= '9'){
                num += chrArray[i];
            }else{
                if(num.length() > 0){
                    answer += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        
        if(num.length() > 0){
            //마지막 문자가 숫자인 경우
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}