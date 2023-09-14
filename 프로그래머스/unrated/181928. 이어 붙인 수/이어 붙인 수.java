class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = "";//홀수
        String num2 = "";//짝수
        int num;
        for(int i = 0; i < num_list.length; i++){
            num = num_list[i];
            if(num % 2 == 0){
                num2 += num;
            }else{
                num1 += num;
            }
        }
        
        answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        return answer;
    }
}