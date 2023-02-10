class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(double num : numbers){
            sum += num;
        }
        
        double answer = 1.0 * sum / numbers.length;
        
        return answer;
    }
}