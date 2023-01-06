import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> que = new LinkedList<>();
		
		// 초기화
		for(int i = 0; i < n; i++) {
			que.add(i + 1);
		}
		
		sb.append("<");
		while(que.size() > 1) {
			for(int i = 0; i < k - 1; i++) {
				que.add(que.poll());
			}
			sb.append(que.poll() + ", ");
		}
		sb.append(que.poll() + ">");
		System.out.print(sb);
			
		br.close();
	}

}