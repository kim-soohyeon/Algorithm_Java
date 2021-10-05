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
		int[] arr;//서류심사, 면접 성적
		int n; //지원자 수
		StringTokenizer st;
		int answer = 1;
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n];
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine()," ");
				arr[Integer.parseInt(st.nextToken()) - 1] = Integer.parseInt(st.nextToken());
			}
			int prev = 0;
			for(int j = 1; j < n; j++) {
				if(arr[j] == 1) {
					prev = arr[j];
					answer++;
					continue;
				}
				for(int k = j - 1; k < n; k++) {
					
				}
				if(arr[j] > prev) {
					
				}
				prev = arr[j];
			}
			System.out.println(answer);
		}
		
		br.close();
	}

}
