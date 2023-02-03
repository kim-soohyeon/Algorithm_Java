import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken()); // 제거할 사람 수
        int k = Integer.parseInt(st.nextToken()); // k 번째 제거

        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < n; i++){
            que.add(i + 1);
        }

        sb.append("<");
        while(que.size() > 0){
            for(int i = 0; i < k - 1; i++){
                que.add(que.poll());
            }
            sb.append(que.poll());
            if(que.size() > 0){
                sb.append(", ");
            }else{
                sb.append(">");
            }
        }
        System.out.print(sb);

        br.close();
    }
}