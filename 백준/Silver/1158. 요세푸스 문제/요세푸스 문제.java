import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i <= n; i++){
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int idx = 1;
        while(!queue.isEmpty()){
            if(queue.size() == 1){
                sb.append(queue.poll());
                break;
            }
            while(idx != k){
                queue.add(queue.poll());
                idx++;
            }
            sb.append(queue.poll() + ", ");
            idx = 1;
        }
        sb.append(">");

        System.out.println(sb);
        br.close();
    }
}    