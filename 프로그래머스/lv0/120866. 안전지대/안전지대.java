import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board[0].length;
        int xLen = board.length;
        int yLen = board[0].length;
        
        for(int i = 0; i < xLen; i++){
            for(int j = 0; j < yLen; j++){
                if(board[i][j] == 1){
                    // 지뢰
                    answer--;
                    for(int x = i - 1; x <= i + 1; x++){
                        if(x >= 0 && x < xLen){
                            for(int y = j - 1; y <= j + 1; y++){
                                if(y >= 0 && y < yLen){
                                    if(board[x][y] == 0){
                                        answer--;
                                        board[x][y] = 2;//치환
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}