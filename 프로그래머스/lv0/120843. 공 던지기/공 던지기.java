class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for(int i = 0; i < k - 1; i++){
            for(int j = 0; j < 2; j++){
                if(answer < numbers.length - 1){
                    answer++;
                }else{
                    answer = 0;
                }
            }
        }
        return numbers[answer];
    }
}