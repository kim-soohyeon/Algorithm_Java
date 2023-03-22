class Solution {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        String numK = Integer.toString(k);
        int answer = numStr.indexOf(numK);
        if(answer >= 0){
            answer++;
        }
        return answer;
    }
}