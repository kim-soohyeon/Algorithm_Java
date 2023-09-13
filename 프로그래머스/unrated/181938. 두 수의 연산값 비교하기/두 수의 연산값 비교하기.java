class Solution {
    public int solution(int a, int b) {
        int hap = Integer.parseInt("" + a + b);
        int gop = 2 * a * b;
        int answer = hap > gop ? hap : gop;
        
        return answer;
    }
}