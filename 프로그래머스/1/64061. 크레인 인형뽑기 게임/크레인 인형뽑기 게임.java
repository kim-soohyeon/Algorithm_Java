import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int move : moves){
            for(int i = 0; i < board[0].length; i++){
                int num = board[i][move - 1];
                if(num > 0){
                    board[i][move - 1] = 0;
                    if(stack.isEmpty()){
                        stack.push(num);
                    }else{
                         if(num == stack.peek()){
                            stack.pop();
                            answer += 2;
                        }else{
                             stack.push(num);
                         }
                    }
                    break;
                }
            }
        }
        return answer;
    }
}