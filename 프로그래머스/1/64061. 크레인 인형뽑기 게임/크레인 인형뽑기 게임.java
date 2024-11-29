import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        // 1. 각 열을 스택으로 변환
        List<Stack<Integer>> columns = new ArrayList<>();
        for (int j = 0; j < board[0].length; j++) {
            Stack<Integer> columnStack = new Stack<>();
            for (int i = board.length - 1; i >= 0; i--) {
                if (board[i][j] > 0) {
                    columnStack.push(board[i][j]);
                }
            }
            columns.add(columnStack);
        }

        // 2. moves 처리
        for (int move : moves) {
            Stack<Integer> column = columns.get(move - 1);
            if (!column.isEmpty()) {
                int num = column.pop();
                if (!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(num);
                }
            }
        }

        return answer;
    }
}