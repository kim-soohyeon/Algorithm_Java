package 이코테.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex02 {

	public static void main(String[] args) throws IOException{
		//큰 수의 법칙
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());//배열의 크기
		int m = Integer.parseInt(st.nextToken());//숫자가 더해지는 횟수
		int k = Integer.parseInt(st.nextToken());//연속해서 더할 수 있는 횟수
		int[] arr = new int[n];
		int answer = 0;
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);//오름차순 정렬
		int cnt = n - 1;
		
		while(m > 0) {
			for(int i = 0; i < k; i++) {
				answer += arr[n - 1];
				m--;
			}
		}
				
		br.close();
	}

}
