class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        int num1 = num_list[len - 1];
        int num2 = num_list[len - 2];
        
        for(int i = 0; i < len; i++){
            answer[i] = num_list[i];
        }
        
        if(num1 > num2){
            answer[len] = num1 - num2;
        }else{
            answer[len] = num1 * 2;
        }
        
        return answer;
    }
}