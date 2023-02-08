class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int idx = 0;
        for(int num : numbers){
            answer[idx++] = num * 2;
        }
        return answer;
    }
}