class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx = 0;
        for(String str : strlist){
            for(char chr : str.toCharArray()){
                answer[idx]++;
            }
            idx++;
        }
        return answer;
    }
}