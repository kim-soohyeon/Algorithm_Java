package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_11399 {

	public static void main(String[] args) throws IOException{
		// ATM
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//사람의 수
		int[] arr = new int[n];//인출 시간
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		int sum = 0;//시간의 합의 최솟값
		int prev = 0;//이전 소요시간
		for(int i = 0; i < n; i++) {
			prev += arr[i];
			sum += prev;
		}
		
		System.out.println(sum);
		br.close();
	}

}
