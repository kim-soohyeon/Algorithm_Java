package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11047 {

	public static void main(String[] args) throws IOException {
		// 동전 0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());//동전의 종류
		int k = Integer.parseInt(st.nextToken());//동전의 가치의 합
		int[] arr = new int[n];//동전의 가치
		int min = 0;//동전 개수의 최솟값
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = n - 1; i >= 0; i--) {
			if(k == 0) {
				//동전의 가치가 0이되면 break
				break;
			}
			if(arr[i] <= k) {
				//동전의 가치의 합보다 작거나 같을 때
				min += k / arr[i];
				k %= arr[i];
			}
		}
		
		System.out.println(min);
		br.close();
	}

}
