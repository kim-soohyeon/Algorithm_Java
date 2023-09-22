import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(n);
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = 3 * n + 1;
            }
            list.add(n);
        }
        
        answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}