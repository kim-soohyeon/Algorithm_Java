package 이코테.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex03 {

	public static void main(String[] args) throws IOException{
		//숫자 카드 게임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// n, m을 공백을 기준으로 구분하여 입력 받기
		int n = Integer.parseInt(st.nextToken());//행
		int m = Integer.parseInt(st.nextToken());//열
		int[][] arr = new int[n][m];
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int min = 101;
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			answer[i] = min;
		}

		Arrays.sort(answer);
		
		System.out.println(answer[n - 1]);
		
		br.close();
	}

}
