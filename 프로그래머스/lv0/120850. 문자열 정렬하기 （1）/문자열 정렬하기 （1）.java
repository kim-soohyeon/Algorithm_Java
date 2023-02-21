import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> arrLst = new ArrayList<>();
        for(char chr: my_string.toCharArray()){
            if(chr >= '0' && chr <= '9'){
                // char to int
                arrLst.add(chr - '0');                
            }
        }
        // 오름차순 정렬
        Collections.sort(arrLst);
        
        return arrLst;
    }
}