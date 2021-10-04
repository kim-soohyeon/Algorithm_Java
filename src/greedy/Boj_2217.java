package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_2217 {

	public static void main(String[] args) throws IOException{
		// 로프
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//로프의 개수
		int[] arr = new int[n];//각 로프의 최대 중량
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);//오름차순 정렬
		int cnt = 0;//병렬로 연결된 로프 개수
		int max = 0;//물체의 최대 중량
		
		for(int i = n - 1; i >= 0; i--) {
			//각 로프 병렬 연결 계산
			arr[i] = arr[i] * (cnt + 1);
			cnt++;
			if(arr[i] > max) {
				//최대 중량 구하기
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		br.close();
	}

}
