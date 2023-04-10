import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String str : dic){
            boolean rtnVal = true;
            for(String spl : spell){
                if(!str.contains(spl)){
                    rtnVal = false;
                    break;
                }
            }
                        
            if(rtnVal){
                answer = 1;
                break;
            }
            
        }
        
        return answer;
    }
}