import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> answerLst = new ArrayList<Integer>();
        String strNum;
        int cnt;
        for(int i = l; i <= r; i++){
            strNum = i + "";
            cnt = 0;
            for(int j = 0; j < strNum.length(); j++){
                if(strNum.charAt(j) == '0' || strNum.charAt(j) == '5'){
                    cnt++;
                }
            }
            
            if(cnt == strNum.length()){
                answerLst.add(Integer.parseInt(strNum));
            }
        }
        
        answer = new int[answerLst.size()];
        if(answerLst.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[answerLst.size()];
            for(int i = 0; i < answerLst.size(); i ++){
                answer[i] = answerLst.get(i);
            }
        }
                
        return answer;
    }
}