class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxIdx = 0;
        for(int i = 1; i < array.length; i++){
            if(array[maxIdx] < array[i]){
                maxIdx = i;
            }
        }
        answer[0] = array[maxIdx];
        answer[1] = maxIdx;            
        
        return answer;
    }
}