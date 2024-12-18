class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastNum = 0;
        for(String str : s.split(" ")){
            if(str.equals("Z")){
                answer -= lastNum;
            }else{
                int num = Integer.parseInt(str);
                answer += num;
                lastNum = num;
            }
        }
        return answer;
    }
}