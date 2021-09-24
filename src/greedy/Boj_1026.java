package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1026 {

	public static void main(String[] args) throws IOException{
		//보물
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//수의 개수
		int[] a = new int[n];
		int[] b = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int min = 0;//최솟값
		
		for(int i = 0; i < n; i++) {
			//배열 a 입력
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			//배열 b 입력
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		//배열 오름차순 정렬
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		for(int i = 0; i < n; i++) {
			//a는 오름차순, b는 내림차순으로 곱한다.
			min += a[i] * b[n - 1 - i];
		}
		
		System.out.println(min);

		br.close();
	}

}
