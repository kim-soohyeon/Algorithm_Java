class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        if(str.contains(k + "")){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == (k + '0')){
                    answer = i + 1;
                    break;
                }
            }
        }
        return answer;
    }
}