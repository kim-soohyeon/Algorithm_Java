package 이코테.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class greedy04 {

	public static void main(String[] args) throws IOException{
		//만들 수 없는 금액
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());//동전의 개수
		int[] arr = new int[n];//동전의 종류
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int target = 1;
		for(int i = 0; i < n; i++) {
			// 만들 수 없는 금액을 찾았을 때 반복 종료
			if (target < arr[i]) break;
            target += arr[i];
		}
		
		System.out.println(target);
		br.close();

	}

}
