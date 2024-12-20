import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            if (count == k) {
                sb.append(queue.poll());
                count = 0;
                if (!queue.isEmpty()) {
                    sb.append(", ");
                }
            } else {
                queue.add(queue.poll());
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}