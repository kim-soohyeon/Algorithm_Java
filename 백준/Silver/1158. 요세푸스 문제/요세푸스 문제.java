import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.addLast(i); // 요소를 뒤에 추가
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int count = 0;
        while (!deque.isEmpty()) {
            count++; // 처리 횟수 증가
            if (count == k) {
                sb.append(deque.pollFirst()); // k번째 요소 제거 및 추가
                count = 0; // 카운트 초기화
                if (!deque.isEmpty()) {
                    sb.append(", "); // 남은 요소가 있으면 쉼표 추가
                }
            } else {
                deque.addLast(deque.pollFirst()); // k번째가 아니면 앞에서 제거 후 뒤에 추가
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}