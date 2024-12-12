import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> deleted = new Stack<>();

        // 배열 크기를 n으로 설정하고 초과 인덱스 처리
        int[] up = new int[n];
        int[] down = new int[n];

        // 초기 연결 리스트 관계 설정
        for (int i = 0; i < n; i++) {
            up[i] = i - 1;
            down[i] = i + 1;
        }

        // 현재 위치를 설정
        int current = k;

        for (String command : cmd) {
            char operation = command.charAt(0);

            if (operation == 'C') {
                // 현재 행 삭제
                deleted.push(current);

                // 연결 관계 수정
                if (up[current] != -1) down[up[current]] = down[current];
                if (down[current] != n) up[down[current]] = up[current];

                // 다음 위치로 이동
                current = (down[current] == n) ? up[current] : down[current];
            } else if (operation == 'Z') {
                // 복원
                int restore = deleted.pop();

                // 연결 관계 복구
                if (up[restore] != -1) down[up[restore]] = restore;
                if (down[restore] != n) up[down[restore]] = restore;
            } else {
                // U 또는 D 명령어 처리
                int x = Integer.parseInt(command.substring(2));
                for (int i = 0; i < x; i++) {
                    current = (operation == 'U') ? up[current] : down[current];
                }
            }
        }

        // 결과 배열 생성
        char[] result = new char[n];
        Arrays.fill(result, 'O');
        while (!deleted.isEmpty()) {
            result[deleted.pop()] = 'X';
        }

        return new String(result);
    }
}
