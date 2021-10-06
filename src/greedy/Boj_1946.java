package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1946 {
	
	public static void main(String[] args) throws IOException{
		//신입 사원
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());//테스트 케이스의 개수
		int n; //지원자 수
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];//서류심사, 면접 성적
			int answer = 1;//신입사원의 최대 인원수 1일 때는 무조건 가능하므로.
			StringTokenizer st;
			
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine()," ");
				arr[Integer.parseInt(st.nextToken()) - 1] = Integer.parseInt(st.nextToken());
			}
			
			if(n == 1) {
				sb.append(answer).append("\n");
				return;
			}
			
			int prev = arr[0];
			for(int j = 1; j < n; j++) {
				if(prev > arr[j]) {
					prev = arr[j];
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
		br.close();
	}

}
